package pursuit.forum.controller;

import java.util.List;

import pursuit.forum.model.Thread;
import pursuit.forum.service.IThreadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ThreadController {

    @Autowired
    private IThreadService threadService;

	@GetMapping("/threads")
	public List<Thread> findThread(@RequestParam(value = "category_id") int categoryId) {
		return threadService.findByCategoryId(categoryId);
	}
}
