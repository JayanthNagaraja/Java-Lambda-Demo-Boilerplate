# Java-Lambda-Demo-Boilerplate
Boilerplate code for Java lambda creation example.

The uploaded code serves as a boilerplate to create applications in Java and deploy them on AWS Lambda.

## Steps to create AWS lambda function and upload code
1. Go to AWS Console → Lambda → Create Function

2. Choose:
	a. Name: {Handler-Class-Name} -> ```Ex: HelloWorldJava```

	b. Runtime: Java 17 or Java 11

	c. Architecture: x86_64

3. Click "Create Function"

4. In Code → Upload from → .zip or .jar file, upload your target/{application-jar-name}-1.0-SNAPSHOT.jar -> ```Ex: target/SpringLambdaDemo-1.0-SNAPSHOT.jar```

5. Set Handler as:
	{classpath}.{Handler-Class-Name}::handleRequest -> ```Ex: org.example.lambda.HelloWorldJava::handleRequest```
	
6. Save and Deploy.

## Steps to test the created Lambda function in AWS console
1. From AWS Console, Go to your function

2. Click "Test"

3. Input payload: "test"

4. Click "Invoke"	