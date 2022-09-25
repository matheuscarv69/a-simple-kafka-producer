package matheuscarv69.com.github.asimplekafkaproducer.domains.services;

import matheuscarv69.com.github.asimplekafkaproducer.adapters.kafka.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMessageService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private KafkaProducer kafkaProducer;

    public void sendMessage(String message) {

        logger.info("SEND MESSAGE SERVICE - Send Message: {}", message);

        kafkaProducer.sendMessageForTopic(message);

    }

}
