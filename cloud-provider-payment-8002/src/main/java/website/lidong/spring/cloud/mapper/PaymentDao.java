package website.lidong.spring.cloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import website.lidong.spring.entities.Payment;

@Mapper
public interface PaymentDao {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
