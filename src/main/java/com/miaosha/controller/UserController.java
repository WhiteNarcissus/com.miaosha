package com.miaosha.controller;

import com.miaosha.controller.viewObject.UserVo;
import com.miaosha.dataobject.response.CommonReturnType;
import com.miaosha.erro.BusinessException;
import com.miaosha.erro.EmBussinessError;
import com.miaosha.service.UserService;
import com.miaosha.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {


    @Autowired
    UserService userService;
    @Autowired
    HttpServletRequest request ;


    @RequestMapping("/get")
    @ResponseBody
    public CommonReturnType getUserById(@RequestParam(name = "id") Integer id) throws BusinessException {
        UserModel userModel = userService.getUserById(id);
        Integer a = null;
        a.byteValue();
        if (userModel == null) {
            throw new BusinessException(EmBussinessError.USER_NOT_EXIST);
        }

        UserVo userVo = convertFromModel(userModel);
        return CommonReturnType.create(userVo);
    }

    private UserVo convertFromModel(UserModel userModel) {
        if (userModel == null)
            return null;

        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userModel, userVo);
        return userVo;
    }


    //短信验证码

    @RequestMapping(value = "/getotp",method = {RequestMethod.POST},consumes = {CONTENTTYPE})
    @CrossOrigin
    @ResponseBody
    public CommonReturnType getUserOtp(@RequestParam(name = "telphone") String telphone) {

        //生成 随机验证码
        Random random = new Random();
        int radonNum = random.nextInt(999999);
        radonNum += 100000;
        //将用户手机号 和 验证码关联 (正常来说这里肯定是要用redis 来的 redis 可以设置过期时间 多次点击同)

        request.getSession().setAttribute(telphone,radonNum);
        System.out.println("telphone:" + telphone + "radonNum" + radonNum);
        // 通过短信模板 发送短信

        return CommonReturnType.create(null);
    }
}
