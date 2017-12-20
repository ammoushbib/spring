package tn.iset.springMvc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tn.iset.stdMng.bl.IMetierEtudiant;
import tn.iset.stdMng.dal.IEtudiantRepository;
import tn.iset.stdMng.dl.Etudiant;


@Controller
@RequestMapping("/student")
public class StudentController 
{

	@Autowired
	private IMetierEtudiant servicesStudents;
	
	@Autowired
	private IEtudiantRepository repositoryStudents;
	@RequestMapping
	public ModelAndView display1(Model m)
	{
		List<Etudiant> student=servicesStudents.findAll();
		ModelAndView mv=new ModelAndView("listeEtudiant");
		mv.addObject("std",student);
		return mv;
	}
	@RequestMapping(value="/page",method=RequestMethod.GET)
	public ModelAndView display2(@RequestParam(name="page",defaultValue="0") int p,
			@RequestParam(name="size",defaultValue="4") int s)
	{
		Page<Etudiant> pagestudent=repositoryStudents.findAll(new PageRequest(p, s));
		List<Etudiant> stdList=pagestudent.getContent();
		ModelAndView mv=new ModelAndView("listeEtudiant");
		int pages[]=new int[pagestudent.getTotalPages()];
		int pageEnCours=p;
		int size=s;
		mv.addObject("std",stdList);
		mv.addObject("pages",pages);
		mv.addObject("pageEnCours",pageEnCours);
		mv.addObject("size",size);
		return mv;
	}
	@RequestMapping(value="/ajouter")
	public ModelAndView display2(Model m)
	{
		List<Etudiant> student=servicesStudents.findAll();
		ModelAndView mv=new ModelAndView("addStudent");
		//mv.addObject("std",student);
		return mv;
	}
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public ModelAndView display3(Model m,Etudiant e)
	{
		repositoryStudents.save(e);
		List<Etudiant> student=servicesStudents.findAll();
		ModelAndView mv=new ModelAndView("listeEtudiant");
		mv.addObject("std",student);
		return mv;
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public ModelAndView deleteEtudiant(long idEtud)
	{
		repositoryStudents.delete(idEtud);
		ModelAndView mv=new ModelAndView("listeEtudiant");
		List<Etudiant> student=servicesStudents.findAll();
		mv.addObject("std",student);
		return mv;
	}
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView edit(long idEtud)
	{
		Etudiant e=repositoryStudents.findOne(idEtud);
		//System.out.println(e.getIdEtud());
		ModelAndView mv=new ModelAndView("editStudent");
		mv.addObject("e",e);
		return mv;
	}

}
