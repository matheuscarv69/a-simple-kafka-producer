package matheuscarv69.com.github.asimplekafkaproducer.configs.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapAddress;

    @Value("${kafka.simple.topic}")
    private String topicName;

    @Bean
    public NewTopic createTopic() {

        logger.info("KAFKA PRODUCER CONFIG - Create Topic: {}", topicName);

        return new NewTopic(topicName, 1, (short) 1);

    }

    @Bean
    public KafkaTemplate<String, String> KafkaTemplate() {

        logger.info("KAFKA PRODUCER CONFIG - Kafka Template");

        return new KafkaTemplate<>(producerFactory());

    }

    @Bean
    public ProducerFactory<String, String> producerFactory() {

        logger.info("KAFKA PRODUCER CONFIG - Producer Factory");

        Map<String, Object> configProps = new HashMap<>();

        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return new DefaultKafkaProducerFactory<>(configProps);

    }


}
