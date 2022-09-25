package matheuscarv69.com.github.asimplekafkaproducer.adapters.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${kafka.simple.topic}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageForTopic(String message) {

        logger.info("KAFKA PRODUCER - Sending Message: '{}' for Topic: '{}'", message, topicName);

        kafkaTemplate
                .send(topicName, message)
                .addCallback(
                        sucess -> logger.info("KAFKA PRODUCER - Sending Message Sucess"),
                        failure -> logger.info("KAFKA PRODUCER - Sending Message Failure")
                );

    }

}
