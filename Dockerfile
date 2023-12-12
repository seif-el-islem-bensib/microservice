FROM openjdk:8
EXPOSE 8089
ADD target/GestionTransactionContrat.jar GestionTransactionContrat.jar
ENTRYPOINT ["java",".jar","GestionTransactionContrat.jar"]