package com.duclan.identity.mapper;

import org.mapstruct.Mapper;

import com.duclan.identity.dto.request.PermissionRequest;
import com.duclan.identity.dto.response.PermissionResponse;
import com.duclan.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
