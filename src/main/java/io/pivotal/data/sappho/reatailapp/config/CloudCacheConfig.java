package io.pivotal.data.sappho.reatailapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication.Locator;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableLogging;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.geode.config.annotation.EnableDurableClient;
import org.springframework.geode.config.annotation.UseMemberName;

//@EnableDurableClient(id = "SapphoApiClient")
//@ClientCacheApplication(locators = {
//@Locator(host = "localhost", port = 10334)})
//@EnablePdx
@EnableEntityDefinedRegions(basePackages = "io.pivotal.data.sappho.retailapp.model")
@EnableGemfireRepositories(basePackages = "io.pivotal.data.sappho.reatailapp.repo")
@EnableLogging(logLevel = "config")
@UseMemberName(value = "SapphoApiClient")
@Configuration
public class CloudCacheConfig {

}
