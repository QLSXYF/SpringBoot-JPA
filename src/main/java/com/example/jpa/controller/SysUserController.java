//package com.example.jpa.controller;
//
//import com.example.jpa.entity.SysUser;
//import com.example.jpa.repository.SysUserRepository;
//import com.example.jpa.service.SysUSerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//
///**
// *
// * @author Eva
// * @date 2018年5月14日
// *
// */
//@RestController
//@RequestMapping("/person")
//public class SysUserController {
//
//	@Autowired
//	private SysUserRepository sysUserRepository;
//
//	@Autowired
//	private SysUSerService sysUSerService;
//
//	@PostMapping("add")
//	@ResponseBody
//	public void add(SysUser person) {
//		sysUserRepository.save(person);
//	}
//
//    @PostMapping("update")
//    @ResponseBody
//    public void update(SysUser person) {
//        sysUSerService.updatePerson(person);
//    }
//
//    @DeleteMapping(path = "deletePerson")
//    public void deletePerson(Long id) {
//        sysUserRepository.deleteById(id);
//    }
//
//}
//
//