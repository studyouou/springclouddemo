package org.ougen.springclouddemoconfigclient.ownproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Author: OuGen
 * Discription:
 * Date: 20:41 2019/7/30
 */
@Configuration
@ConfigurationProperties(prefix = "org.ougen.properties")
public class PropertiesDemo {

    private String name="ougen";

    private String city="chengdu";

    private int age=23;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
