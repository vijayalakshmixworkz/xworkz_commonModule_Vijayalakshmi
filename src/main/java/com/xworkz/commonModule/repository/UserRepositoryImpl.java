package com.xworkz.commonModule.repository;

import com.xworkz.commonModule.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class UserRepositoryImpl implements UserRepository
{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean onSave(UserEntity userEntity) {
         EntityManager em= entityManagerFactory.createEntityManager();
         EntityTransaction et =em.getTransaction();
         try{
             et.begin();
             em.persist(userEntity);
             et.commit();
         }catch (Exception e)
         {
             if(et.isActive()){
                 et.rollback();
             }
         }
         finally {
            //em.close();
         }
        return true;
    }
}
