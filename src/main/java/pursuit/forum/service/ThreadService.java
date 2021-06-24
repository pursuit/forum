package pursuit.forum.service;

import java.util.List;

import pursuit.forum.model.Thread;
import pursuit.forum.repository.ThreadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreadService implements IThreadService {

    @Autowired
    private ThreadRepository repository;

    @Override
    public List<Thread> findByCategoryId(int categoryId) {
        return repository.findByCategoryId(categoryId);
    }
}
