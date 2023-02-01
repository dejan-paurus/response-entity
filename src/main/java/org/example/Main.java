package org.example;

public class Main {

  public static void main(String[] args) {
    System.out.println("Business partner: " + create(new BusinessPartner()).getId());
    System.out.println("Contract: " + create(new Contract()).getId());
  }

  public static EntityReponse create(EntityReponse entity) {
    return entity;
  }
}