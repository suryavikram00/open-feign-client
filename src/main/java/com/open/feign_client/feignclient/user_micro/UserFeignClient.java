package com.open.feign_client.feignclient.user_micro;



import org.springframework.cloud.openfeign.FeignClient;
import com.open.feign_client.entity.user_micro.UserEntityModel;
import com.open.feign_client.feignclient.OpenFeignClient;


@FeignClient(name = "userClient", url = "${user.client.url}/user")
public interface UserFeignClient extends OpenFeignClient<UserEntityModel> {  
}