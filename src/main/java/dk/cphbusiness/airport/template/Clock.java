package dk.cphbusiness.airport.template;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Clock implements Runnable {
  private long sleepingTime = 10;
  private boolean running = true;
  private final PassengerProducer producer;
  private final PassengerConsumer consumer;
  
  public Clock(PassengerProducer producer, PassengerConsumer consumer) {
    this.producer = producer;
    this.consumer = consumer;
    }
  
  public void stop() {
    running = false;
    }
  
  @Override
  public void run() {
    try {
      while (running) {
        Thread.sleep(sleepingTime);
        producer.tick();
        consumer.tick();
        }
      } 
    catch (InterruptedException ex) {
      Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  }
