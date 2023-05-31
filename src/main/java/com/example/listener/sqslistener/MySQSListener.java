package com.example.listener.sqslistener;

import io.awspring.cloud.sqs.annotation.SqsListener;
//import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author vikash.yadav@piramal.com
 */
@Component
@Slf4j
public class MySQSListener {

//    @SqsListener(value = "${sqs.url}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    @SqsListener(value = "${sqs.url}")
    public void sendMessage(String message) throws InterruptedException {
        log.info("Message received from SQS is:{}", message);
    }
}
