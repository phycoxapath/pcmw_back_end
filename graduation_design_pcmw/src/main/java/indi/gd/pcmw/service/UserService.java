package indi.gd.pcmw.service;

import indi.gd.pcmw.domain.Apply;
import indi.gd.pcmw.domain.User;

public interface UserService {

    int save(User user);

    int loginValidate(String name,String password);

    User getUserByLoginName(String loginName);

    User getUserById(Integer id);

    User getModifiedAttr(String loginName);

    int updateUser(User user);

    int updateUserQual(String imageName, Integer id);

    int insertApplication(Apply apply);
}
