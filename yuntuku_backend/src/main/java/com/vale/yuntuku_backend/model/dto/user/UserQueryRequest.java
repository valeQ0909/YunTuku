package com.vale.yuntuku_backend.model.dto.user;

import com.vale.yuntuku_backend.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户查询请求
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequest extends PageRequest implements Serializable {
    private static final long serialVersionUID = 8008238823L;
    private Long id;
    private String userName;
    private String userAccount;
    private String userProfile;
    private String userRole;

}
