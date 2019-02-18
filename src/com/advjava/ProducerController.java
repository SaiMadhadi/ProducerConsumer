package com.advjava;

public class ProducerController extends Thread {

  private ProducerConsumer producerConsumer = new ProducerConsumer();
  @Override
  public void run() {
    try {
      producerConsumer.produce();
    }catch (NullPointerException e){
      e.printStackTrace();
    } catch (InterruptedException e){
      e.printStackTrace();
    }
  }
}
