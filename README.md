
# Digital Innovation One - Spring Webflux - Criando seu gerenciador de herois

## Stack utilizada

  * Java 8
  * Spring Webflux
  * Spring Data
  * Dynamodb
  * Junit
  * Sl4j
  * Reactor

### Executar dynamo: 

java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
 
Listar as tabelas criadas:  aws dynamodb list-tables --endpoint-url http://localhost:8000

documentacao gerada pela aplicação: swagger: http://localhost:8080/swagger-ui-heroes-reactive-api.html
