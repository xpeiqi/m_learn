package org.x.c2.mapper;

import org.x.c2.po.Role;

import java.util.List;

public interface RoleMapper {
    Role selectRole(Long id);

    int deleteRole(Long id);

    int insertRole(Role role);

    List<Role> findRole(String roleName);
}
