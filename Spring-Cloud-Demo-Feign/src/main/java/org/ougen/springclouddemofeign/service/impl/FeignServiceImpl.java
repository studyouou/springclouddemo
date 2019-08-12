package org.ougen.springclouddemofeign.service.impl;

import org.ougen.springclouddemofeign.feign.OwnFeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: OuGen
 * Discription:
 * Date: 20:03 2019/7/29
 */
@FeignClient(value ="client",fallback =ErrorToCall.class )
public interface FeignServiceImpl {
    @GetMapping("/hiDemo")
    public String hihihihi();

}
