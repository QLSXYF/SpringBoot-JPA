package com.example.jpa.service.Impl;

import com.example.jpa.entity.SysUser;
import com.example.jpa.repository.SysUserRepository;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.annotation.Resource;

/**
 * @author A-team Eva
 * @date 2018-05-16
 */
@Service("sysUserService")
public class SysUserServiceImpl implements UserDetailsService {

    @Resource
    private SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        SysUser user = sysUserRepository.findByUsername(username);
        if(user == null){
            //throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }



//    @Override
//    public SysUser updatePerson(SysUser person) {
//        sysUSerRepository.findById(person.getId());
//        Optional<SysUser> p = sysUSerRepository.findById(person.getId());
//        SysUser p1 = p.get();
//        return null;
//    }
}
