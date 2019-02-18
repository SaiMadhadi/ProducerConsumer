package com.advjava;

public class ConsumerController extends Thread{

  private ProducerConsumer consumer = new ProducerConsumer();
  @Override
  public void run() {
    try {
      consumer.consume();
    } catch (NullPointerException e){
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
