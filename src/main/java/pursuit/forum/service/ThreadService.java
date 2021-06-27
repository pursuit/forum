package pursuit.forum.service;

import java.util.List;
import java.util.Optional;

import pursuit.forum.model.Thread;
import pursuit.forum.repository.ThreadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreadService implements IThreadService {

	@Autowired
	private ThreadRepository repository;

	volatile static int viewCount;
	static final Object lock = new Object();

	@Override
	public Optional<Thread> find(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Thread> findByCategoryId(int categoryId) {
		return repository.findByCategoryId(categoryId);
	}
}
