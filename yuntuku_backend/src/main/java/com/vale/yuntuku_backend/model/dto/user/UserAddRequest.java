package com.vale.yuntuku_backend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户创建请求
 *
 */
@Data
public class UserAddRequest implements Serializable {
    private static final long serialVersionUID = 8008238823L;
    private String userName;
    private String userAccount;
    private String userAvatar;
    private String userProfile;
    private String userRole;

}
