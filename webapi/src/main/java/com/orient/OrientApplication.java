/**
 * @Project Name :  base
 * @Package Name :  com.orient
 * @Description :  TODO
 * @author :  panduanduan
 * @Creation Date:  2018-01-22 4:43 PM
 * @ModificationHistory Who    When    What
 * --------  ---------  --------------------------
 */
package com.orient;

import com.orient.properties.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :  panduanduan
 * @Description :  主入口
 * @Creation Date:  2018-01-22 4:43 PM
 */
@SpringBootApplication
@ComponentScan("com.orient")
@EnableConfigurationProperties({JwtProperties.class})
public class OrientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrientApplication.class, args);
    }
}