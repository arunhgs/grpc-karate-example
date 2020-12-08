
Feature: grpc hello world example by grpc dynamic client

  Background:
    * def Client = Java.type('karate.passbook.PassbookGrpcClient')
    * def client = Client.create('localhost','5556')

  Scenario: do it
    * def response = client.getTransactionHistory("1");
    * def response = JSON.parse(response)
    * print response
    * match response[0].txnAmount_ == '1'
