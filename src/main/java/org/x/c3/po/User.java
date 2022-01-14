package org.x.c3.po;

import lombok.Data;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.x.c3.enums.Sex;

import java.time.LocalDate;

@Data
public class User {
    private Long id;
    private String userName;
    private String cnname;
    private LocalDate birthday;
    private Sex sex;
    private String email;
    private String mobile;
    private String note;

}
