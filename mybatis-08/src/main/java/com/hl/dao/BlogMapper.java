package com.hl.dao;

import com.hl.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //添加blog
    int addBlog(Blog blog);

    //查询Blog
    List<Blog> getBlogByIf(Map<Object,Object> map);
    List<Blog> getBlogByIf2(Map map);

    //修改Blog
    int updateBlog(Map map);
}
