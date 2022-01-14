package org.x.c2.po;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class Role {
    private Long id;
    private String roleName;
    private String note;
}
