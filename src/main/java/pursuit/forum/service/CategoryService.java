package pursuit.forum.service;

import java.util.List;

import pursuit.forum.model.Category;
import pursuit.forum.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private CategoryRepository repository;

	@Override
	public List<Category> findByParentId(Integer parentId) {
	    return repository.findByParentId(parentId);
	}
}
