/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.batch;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author tdteixeira
 */
public interface InfrastructureConfiguration {

        @Bean
        public abstract DataSource dataSource();
}
