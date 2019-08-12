package org.ougen.springclouddemofeign.service.impl;

import org.springframework.stereotype.Component;

/**
 * Author: OuGen
 * Discription:
 * Date: 20:06 2019/7/29
 */
@Component
public class ErrorToCall implements FeignServiceImpl{
    @Override
    public String hihihihi(){
        return "接口调用错误，请耐心稍等";
    }
}
