package com.open.feign_client.inter_process_communication.account_micro;



import org.springframework.cloud.openfeign.FeignClient;

import com.open.feign_client.entity.account_micro.AccountEntityModel;
import com.open.feign_client.inter_process_communication.BaseFeignClient;

@FeignClient(name = "accountClient", url = "${account.client.url}/account")
public interface AccountFeignClient extends BaseFeignClient<AccountEntityModel> {  
}

