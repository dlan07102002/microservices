package com.duclan.profile.mapper;

import org.mapstruct.Mapper;

import com.duclan.profile.dto.request.ProfileCreationRequest;
import com.duclan.profile.dto.response.UserProfileResponse;
import com.duclan.profile.entity.UserProfile;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);

    UserProfileResponse toUserProfileReponse(UserProfile entity);
}
