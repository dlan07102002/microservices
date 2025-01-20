package com.duclan.identity.mapper;

import org.mapstruct.Mapper;

import com.duclan.identity.dto.request.ProfileCreationRequest;
import com.duclan.identity.dto.request.UserCreationRequest;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
