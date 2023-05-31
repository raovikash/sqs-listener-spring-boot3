# SQS message listener with spring boot 3

Add following in pom.xml

```
<dependency>
    <groupId>io.awspring.cloud</groupId>
    <artifactId>spring-cloud-aws-starter-sqs</artifactId>
</dependency>

<!-- Use BOM provided by spring for version managament -->
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>io.awspring.cloud</groupId>
            <artifactId>spring-cloud-aws-dependencies</artifactId>
            <version>3.0.1</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

* Use `io.awspring.cloud.sqs.annotation.SqsListener` to listen the messages instead of 
`io.awspring.cloud.messaging.listener.annotation.SqsListener`
* If "Visibility timeout" of SQS is less than listener's processing time then message needs to be deleted explicitly from the queue,
    otherwise same message could be processed multiple times.

Check [reference](https://docs.awspring.io/spring-cloud-aws/docs/3.0.0/reference/html/index.html#using-amazon-web-services) for more details.
