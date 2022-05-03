package com.example.demo.service;

import com.example.demo.model.UsersVO;
import org.omg.CORBA.portable.ApplicationException;

import java.util.List;

public interface UsersService {
    List<UsersVO> getAll() throws ApplicationException;
}
