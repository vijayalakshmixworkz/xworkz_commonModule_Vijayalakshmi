package com.xworkz.commonModule.repository;

import com.xworkz.commonModule.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    boolean onSave(UserEntity userEntity);
}
