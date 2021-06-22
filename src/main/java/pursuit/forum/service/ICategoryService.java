package pursuit.forum.service;

import pursuit.forum.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findByParentId(int parentId);
}