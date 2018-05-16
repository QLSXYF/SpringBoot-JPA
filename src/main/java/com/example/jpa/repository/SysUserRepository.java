package com.example.jpa.repository;


import com.example.jpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
@Resource
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    /**
     * 根据用户名查用户
     * @param username
     * @return
     */
    SysUser findByUsername(String username);

}

		