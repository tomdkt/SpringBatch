/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.batch;

import javax.sql.DataSource;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tdteixeira
 */
@Configuration
@EnableBatchProcessing
public class InfrastructureConfigurationImpl implements InfrastructureConfiguration {


        @Override
        public DataSource dataSource() {
                
                return null;
        }

}
