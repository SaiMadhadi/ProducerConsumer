package com.advjava;

public class ProducerConsumer {

  private static Integer counter = 0;
  public void produce() throws InterruptedException {
    while (Boolean.TRUE){
      if(Resource.getSize() < 97){
        Resource.addResource(3);
        Thread.sleep(100);
      }
    }
  }

  public void consume() throws InterruptedException {
    while (Boolean.TRUE){
      if(Resource.getSize() > 0) {
        Resource.removeResource();
        Thread.sleep(100);
      }
    }
  }
}
