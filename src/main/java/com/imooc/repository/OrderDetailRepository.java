package com.imooc.repository;

import com.imooc.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liuyw
 * @date 2018/5/25 9:41
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>{
    List<OrderDetail> findByOrderId(String orderId);

}
