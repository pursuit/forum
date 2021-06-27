package pursuit.forum.controller;

import java.util.List;
import java.util.Optional;

import pursuit.forum.model.Thread;
import pursuit.forum.service.IStatisticService;
import pursuit.forum.service.IThreadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ThreadController {

	@Autowired
	private IStatisticService statisticService;

	@Autowired
	private IThreadService threadService;

	@GetMapping("/threads/{id}")
	public Optional<Thread> findThread(@PathVariable("id") int id) throws InterruptedException {
		statisticService.hitAPI();
		return threadService.find(id);
	}

	@GetMapping("/threads")
	public List<Thread> findThreadByCategoryID(@RequestParam(value = "category_id") int categoryId) {
		statisticService.hitAPI();
		return threadService.findByCategoryId(categoryId);
	}
}
