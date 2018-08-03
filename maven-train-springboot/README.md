
### Maven package

```
### 打一个jar包

mvn clean package

mvn clean package -Dpackage=maven-train-springboot -Dpackage.version=v1 -Dpackage.environment=springboot -Dpackage.resources=noneed.properties

### 打一个tar包

mvn -e assembly:single -Dpackage=maven-train-springboot -Dpackage.version=v1 -Dpackage.environment=springboot -Dpackage.format=springboot

注: 打war类型的包，需要使用maven-plugins-war

```