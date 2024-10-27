package com.open.feign_client.feignclient.account_micro;



import org.springframework.cloud.openfeign.FeignClient;
import com.open.feign_client.entity.account_micro.AccountEntityModel;
import com.open.feign_client.feignclient.OpenFeignClient;

@FeignClient(name = "accountClient", url = "${account.client.url}/account")
public interface AccountFeignClient extends OpenFeignClient<AccountEntityModel> {  
}

