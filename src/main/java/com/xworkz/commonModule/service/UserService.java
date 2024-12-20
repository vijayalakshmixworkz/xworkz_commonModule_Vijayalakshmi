package com.xworkz.commonModule.service;

import com.xworkz.commonModule.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String onsave(UserDTO userDTO);
}
