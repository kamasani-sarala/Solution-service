//package com.ebug.solution;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.ebug.solution.entity.Solution;
//import com.ebug.solution.repository.SolutionRepository;
//import com.ebug.solution.service.SolutionService;
//
//@SpringBootTest
//class SolutionServiceApplicationTests {
//	@Autowired
//	SolutionService solutionService;
//
//	@MockBean
//	SolutionRepository solutionRepository;
//
//    //Stubs
//	private Solution rohit;
//	private Solution virat;
//	private  Solution shubman;
//	private  Solution ishan;
//	List< Solution> solutionList;
//
//    @BeforeEach
//	void setUp() throws Exception {
//		
//		
//		//Test 1
//		rohit = new Solution();
//		
//		//Test2
//		virat = new Solution();
//		shubman = new Solution();
//		ishan = new Solution();
//		
//		solutionList = new ArrayList<>();
//		solutionList.add(rohit);
//		solutionList.add(virat);
//		solutionList.add(shubman);
//		solutionList.add(ishan);
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//		solutionRepository.deleteAll();
//		rohit = null;
//	}
//
//	@Test
//	@DisplayName("Saves the solution provided into the database")
//	public void test_addSolution_GivenTheSolution_ShouldReturnSavedSolution() {
//		
//		Mockito.when(solutionRepository.save(rohit)).thenReturn(rohit);
//		
//		Solution solutionReturnedFromSolutionService = solutionService.addSolution(rohit);
//		
//		assertNotNull(solutionReturnedFromSolutionService);
//		assertEquals(rohit, solutionReturnedFromSolutionService);
//	}
//
//	@Test
//	@DisplayName("Return List of Solutions")
//	public void test_getAllStaff_ShouldReturnListOfStaff() {
//		
//		Mockito.when(solutionRepository.findAll()).thenReturn(solutionList);
//		
//		List<Solution> SolutionListReturnedFromSolutionService = solutionService.allSolutions();
//		
//		assertNotNull(solutionList);
//		assertNotNull(SolutionListReturnedFromSolutionService);
//		assertEquals(4, solutionList.size());
//		assertEquals(rohit, solutionList.get(0));
//		assertEquals(virat, solutionList.get(1));
//		assertEquals(shubman, solutionList.get(2));
//		assertEquals(ishan, solutionList.get(3));
//		
//	}
//
//
//}
