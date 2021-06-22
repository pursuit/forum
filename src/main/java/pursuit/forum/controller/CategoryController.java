package pursuit.forum.controller;

import java.util.List;

import pursuit.forum.model.Category;
import pursuit.forum.service.ICategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

	@GetMapping("/categories")
	public List<Category> findCategories(@RequestParam(value = "parent_id", defaultValue = "0") int parentId) {
		return categoryService.findByParentId(parentId);
	}
}
