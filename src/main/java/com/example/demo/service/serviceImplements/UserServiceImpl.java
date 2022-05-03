package com.example.demo.service.serviceImplements;

import com.example.demo.model.UsersVO;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UsersService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UsersService {
    @Autowired
    private UserRepository userRepo;

    @Override
    @Cacheable("users")
    public List<UsersVO> getAll() throws ApplicationException {
        List<UsersVO> res;
        res = userRepo.getAll();
        return res;
    }
}
