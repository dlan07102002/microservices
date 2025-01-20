package com.duclan.post.mapper;

import com.duclan.post.dto.response.PostResponse;
import com.duclan.post.entity.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostResponse toPostResponse(Post post);
}
