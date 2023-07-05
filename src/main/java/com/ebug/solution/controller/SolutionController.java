package com.ebug.solution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebug.solution.VO.ResponseTemplateVO;
import com.ebug.solution.entity.Solution;
import com.ebug.solution.service.SolutionService;



@RestController
@RequestMapping("/solution")
public class SolutionController {
@Autowired
private SolutionService solutionService;


@PostMapping("/")
	public Solution addSolution(@RequestBody Solution solution) {
		return solutionService.addSolution(solution);
	}
@DeleteMapping("/{solutionId}")
	public int deleteTicket(@PathVariable("solutionId") int solutionId)
	{
		return solutionService.deleteSolution(solutionId);
	}
@PutMapping("/{solutionId}/{solutionDescription}")
public int updateRemedyDetails(@PathVariable("solutionId")int solutionId, @PathVariable("solutionDescription") String solutionDescription) {
	return solutionService.updateRemedyDetails(solutionId, solutionDescription);
}
@GetMapping("/displayallsolutions")
	public List<Solution> allSolutions(){
		return solutionService.allSolutions();
	}

@GetMapping("/solutions/{id}")
public ResponseTemplateVO getSolutionWithTicketandStaff(@PathVariable("id") int solutionId) {
	 return solutionService.getSolutionWithTicketandStaff(solutionId);
	 
}
@GetMapping("/{id}")
public Solution searchSolutionById(@PathVariable("id") int solutionId)
{
return solutionService.searchSolutionById(solutionId);
}


}