package indi.gd.pcmw.service.impl;

import indi.gd.pcmw.dao.UserDao;
import indi.gd.pcmw.domain.Apply;
import indi.gd.pcmw.domain.User;
import indi.gd.pcmw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertApplication(Apply apply) {
        return userDao.insertApplication(apply);
    }

    @Override
    public int loginValidate(String name, String password) {
        return userDao.loginValidate(name,password);
    }
    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserByLoginName(String loginName) {
        return userDao.getUserByLoginName(loginName);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getModifiedAttr(String loginName) {
        return userDao.getModifiedAttr(loginName);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int updateUserQual(String imageName, Integer id) {
        return userDao.updateUserQual(imageName, id);
    }
}
