package pursuit.forum.service;

import pursuit.forum.model.Thread;

import java.util.List;

public interface IThreadService {
    List<Thread> findByCategoryId(int categoryId);
}
