package com.vale.yuntuku_backend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vale.yuntuku_backend.model.dto.user.UserQueryRequest;
import com.vale.yuntuku_backend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.vale.yuntuku_backend.model.vo.LoginUserVO;
import com.vale.yuntuku_backend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author vale
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-11-18 22:56:44
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return  脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取加密密码
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);

    User getLoginUser(HttpServletRequest request);
    LoginUserVO getLoginUserVO(User user);
    UserVO getUserVO(User user);
    List<UserVO> getUserVOList(List<User> userList);
    boolean userLogout(HttpServletRequest request);
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    // 是否为管理员
    boolean isAdmin(User  user);

}
