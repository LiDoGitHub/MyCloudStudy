package website.lidong.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiDo
 * @create 2021-01-05 20:16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	private Integer id;
	private String serial;
}
