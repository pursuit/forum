package pursuit.forum.service;

import java.util.List;
import java.util.Optional;

import pursuit.forum.model.Thread;

public interface IThreadService {
	Optional<Thread> find(int id);
	List<Thread> findByCategoryId(int categoryId);
}
