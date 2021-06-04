package com.example.fastredistest.config;

import com.example.fastredistest.service.UserService;
import com.louislivi.fastdep.shirojwt.shiro.FastDepShiroJwtAuthorization;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class FastDepShiroJwtConfig extends FastDepShiroJwtAuthorization {

    @Autowired
    UserService userService;
    @Override
    public SimpleAuthorizationInfo getAuthorizationInfo(String openId) {
        String name = userService.queryUser().getName();
        Set<String> rolesCollect = new HashSet<>();
        rolesCollect.add(name);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(rolesCollect);
        return simpleAuthorizationInfo;
    }

}