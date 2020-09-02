package com.wsw.wswserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @Author WangSongWen
 * @Date: Created in 9:57 2020/9/2
 * @Description: 创建一个带指定权限的模拟用户
 */
@Component
public class WswUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!"wsw".equals(username)){
            throw new UsernameNotFoundException("用户" + username + "不存在");
        }
        User user = new User(username, passwordEncoder.encode("123"),
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_NORMAL, ROLE_MEDIUM"));
        return user;
    }
}
