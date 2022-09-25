package matheuscarv69.com.github.asimplekafkaproducer.adapters.web;

import matheuscarv69.com.github.asimplekafkaproducer.domains.services.SendMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SendMessageService service;

    @PostMapping
    public ResponseEntity<?> createMessage(@RequestBody String message) {

        logger.info("MESSAGE CONTROLER - Create Message: {}", message);

        service.sendMessage(message);

        return ResponseEntity.status(201).body(message);

    }


}
