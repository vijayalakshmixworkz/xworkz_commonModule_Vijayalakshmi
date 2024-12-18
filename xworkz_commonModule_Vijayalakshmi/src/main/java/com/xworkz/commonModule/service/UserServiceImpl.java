package com.xworkz.commonModule.service;

import com.xworkz.commonModule.dto.UserDTO;
import com.xworkz.commonModule.entity.UserEntity;
import com.xworkz.commonModule.repository.UserRepository;
import com.xworkz.commonModule.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserRepository userRepository;

    @Override
    public String onsave(UserDTO userDTO) {
        if (userDTO.getName() == null || userDTO.getEmail() == null || userDTO.getAlternative_email() == null) {
            return "invalid data";
        }
        String password = generateRandomPassword();
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setName(userDTO.getName());
        userEntity.setAlternative_email(userDTO.getAlternative_email());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setAlternative_phone(userDTO.getAlternative_phone());
        userEntity.setPassword(password);

        try {
            userRepository.onSave(userEntity);
            System.out.println("user details saved successfully" + userDTO);
            return " success";


        } catch (Exception e) {
            System.err.println("error saving user details" + e.getMessage());
            return "failed";
        }
    }
    public static String generateRandomPassword() {
      String charcters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random= new Random();
        StringBuilder password=new StringBuilder();
        for( int i=0;i<8;i++){
            int randomIndex= random.nextInt(charcters.length());
            password.append(charcters.charAt(randomIndex));
        }
        return password.toString();


}
}
