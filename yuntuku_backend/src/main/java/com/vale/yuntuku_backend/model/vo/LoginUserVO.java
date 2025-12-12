package com.vale.yuntuku_backend.model.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LoginUserVO implements Serializable {
    private static final long serialVersionUID = 18008238823L;

    private Long id;
    private String userAccount;
    private String userName;
    private String userAvatar;
    private String userProfile;
    private String userRole;
    private Date createTime;
    private Date updateTime;
}
