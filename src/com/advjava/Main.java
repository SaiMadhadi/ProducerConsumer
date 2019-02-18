package com.advjava;

public class Main {

    public static void main(String[] args) {

    ProducerController producer = new ProducerController();
    ConsumerController consumer = new ConsumerController();

    producer.start();
    consumer.start();
    }
}
