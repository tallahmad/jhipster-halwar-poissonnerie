package com.famira.halwarpoisonnerie;

import com.famira.halwarpoisonnerie.HalwarpoissonnerieApp;
import com.famira.halwarpoisonnerie.config.AsyncSyncConfiguration;
import com.famira.halwarpoisonnerie.config.EmbeddedElasticsearch;
import com.famira.halwarpoisonnerie.config.EmbeddedKafka;
import com.famira.halwarpoisonnerie.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { HalwarpoissonnerieApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
