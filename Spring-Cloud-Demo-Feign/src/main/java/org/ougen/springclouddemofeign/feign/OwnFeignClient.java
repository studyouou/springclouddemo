package org.ougen.springclouddemofeign.feign;

import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.ougen.springclouddemofeign.service.impl.FeignServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Base64;

/**
 * Author: OuGen
 * Discription:
 * Date: 20:40 2019/7/29
 */
@Import(FeignClientsConfiguration.class)
public class OwnFeignClient {
    private FeignServiceImpl feignService;

    public OwnFeignClient(Decoder decoder, Encoder encoder, Client client, Contract contract){
        this.feignService=Feign.builder().contract(contract)
                .decoder(decoder)
                .encoder(encoder)
                .client(client)
                .requestInterceptor(new BasicAuthRequestInterceptor("user","user"))
                .target(FeignServiceImpl.class,"http://client");
    }

    public FeignServiceImpl getFeignService() {
        return feignService;
    }
}
