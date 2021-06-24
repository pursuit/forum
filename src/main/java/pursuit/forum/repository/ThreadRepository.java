package pursuit.forum.repository;

import java.util.List;

import pursuit.forum.model.Thread;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadRepository extends CrudRepository<Thread, Integer> {
	List<Thread> findByCategoryId(int categoryId);
}
