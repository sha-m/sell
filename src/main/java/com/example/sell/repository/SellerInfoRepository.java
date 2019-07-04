package com.example.sell.repository;

import com.example.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 廖师兄
 * 2017-07-23 23:04
 */
@Repository
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByUsernameAndPassword(String username,String password);
}
