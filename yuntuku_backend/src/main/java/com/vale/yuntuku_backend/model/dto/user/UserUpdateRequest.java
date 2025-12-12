package com.vale.yuntuku_backend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户更新请求
 *
 */
@Data
public class UserUpdateRequest implements Serializable {
    private static final long serialVersionUID = 8008238823L;
    private Long id;
    private String userName;
    private String userAvatar;
    private String userProfile;
    private String userRole;
}
