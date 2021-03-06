package com.macrun.emagazine.service;

import com.macrun.emagazine.dto.PostDto;
import com.macrun.emagazine.util.TPage;
import org.springframework.data.domain.Pageable;

public interface PostService {
    PostDto addPost(PostDto post);

    PostDto getById(long id);

    TPage<PostDto> getAllPageable(Pageable pageable);

    PostDto updatePost(Long id, PostDto post);
}
