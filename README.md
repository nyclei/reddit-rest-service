# reddit-rest-service

#### Maven build (requires maven 3):
- $MAVEN3_HOME/bin/mvn clean package
- *For example:* ``` /Users/lli1/about2/apache-maven-3.3.3/bin/mvn clean package_ ```

___

#### Launch server on port 8080:
``` java -jar target/lei-rest-service-0.1.0.war ```

___

#### Test in browser
(refresh page if seeing BLANK response or  **429 Too Many Requests** from reddit.com's API)
- http://localhost:8080/hello
- http://localhost:8080/hello?name=BigDaddy
- http://localhost:8080/reddit/search?q=orchid (need internet)
- http://localhost:8080/reddit/search?q=dandelion (need internet)
- http://localhost:8080/reddit/search?q=manhattan (need internet)
