package com.miaosha.service;

import com.miaosha.erro.BusinessException;
import com.miaosha.service.model.UserModel;

public interface UserService {

    public UserModel getUserById(Integer id);

    public void register(UserModel userModel) throws BusinessException;

    public UserModel login(String telphone , String password) throws BusinessException;
}
