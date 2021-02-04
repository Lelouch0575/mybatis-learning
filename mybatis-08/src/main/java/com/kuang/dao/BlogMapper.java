package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlogIf(Map map);
    List<Blog> queryBlogChoose(Map map);
    int updateBlog(Map map);
    //查询第1,2,3号记录的博客
    List<Blog> queryBlogForEach(Map map);
}
