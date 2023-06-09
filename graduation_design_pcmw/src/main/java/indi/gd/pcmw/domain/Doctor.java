package indi.gd.pcmw.domain;

import lombok.Data;
import org.springframework.jdbc.core.SqlReturnType;

@Data
public class Doctor {
    private int id;
    private int jobId;
    private String password;
    private String docName;
    private String gender;
    private String docTitle;
    private byte workingDay;
    private int deptId;
    private String docProfile;
    private boolean qualification;
    private String qualType;
    private String qualImage;
}
