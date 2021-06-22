package pursuit.forum.repository;

import java.util.List;

import pursuit.forum.model.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
	List<Category> findByParentId(Integer parentId);
}
