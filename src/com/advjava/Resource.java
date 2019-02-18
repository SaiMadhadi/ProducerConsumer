package com.advjava;

import java.util.LinkedList;
import java.util.Queue;

public class Resource {

  private static Queue<Integer> queue = new LinkedList<>();
  public synchronized static void addResource(Integer resource){
      for(Integer i=0;i<resource;i++)
        queue.add(resource);
    System.out.println("added = 3 " +"Current size = "+ Resource.getSize());
  }

  public synchronized static void removeResource(){
    queue.remove();
    System.out.println("removed = 1 Current size = "+ Resource.getSize());
  }

  public synchronized static Integer getSize(){
    return queue.size();
  }
}
