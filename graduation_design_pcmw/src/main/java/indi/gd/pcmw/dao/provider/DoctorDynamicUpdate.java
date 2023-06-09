package indi.gd.pcmw.dao.provider;

import indi.gd.pcmw.domain.Doctor;
import org.apache.ibatis.jdbc.SQL;

public class DoctorDynamicUpdate {
    public String updateDoctor(final Doctor doctor){
        return new SQL(){{
            UPDATE("pcmw_doctor");
            if (doctor.getDeptId() != 0){
                SET("dept_id = #{deptId}");
            }
            if (doctor.getWorkingDay() != 0){
                SET("working_day = #{workingDay}");
            }
            if (doctor.getDocName() != null && !doctor.getDocName().equals("")){
                SET("doc_name = #{docName}");
            }
            if (doctor.getGender() != null && !doctor.getGender().equals("")){
                SET("gender = #{gender}");
            }
            if (doctor.getPassword() != null && !doctor.getPassword().equals("")){
                SET("password = #{password}");
            }
            if (doctor.getDocProfile() != null && !doctor.getDocProfile().equals("")){
                SET("doc_profile = #{docProfile}");
            }
            if (doctor.getDocTitle() != null && !doctor.getDocTitle().equals("")){
                SET("doc_title = #{docTitle}");
            }
            WHERE("job_id = #{jobId} or id = #{id}");
        }}.toString();
    }
}
