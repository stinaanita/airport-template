package dk.cphbusiness.airport.template;

import dk.cphbusiness.algorithm.examples.queues.NotPrioritisingPassengerArrayQueue;
import dk.cphbusiness.algorithm.examples.queues.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class Program {
  private static List<Plane> planes = new ArrayList<>();
  private static PassengerProducer producer;
  private static PassengerConsumer consumer;
  private static PriorityQueue<Passenger> queue;
  private static Clock clock;
  
  private static void setup() {
    for (int hour = 7; hour <= 22; hour++) {
      planes.add(new Plane(new Time(hour, 0, 0)));
      }
    queue = new NotPrioritisingPassengerArrayQueue(10000);
    producer = new PassengerProducer(planes, queue);
    consumer = new PassengerConsumer(planes, queue);
    clock = new Clock(producer, consumer);
    }
  
  public static void main(String[] args) {
    setup();
    System.out.println("Hello Airport");
    //new Thread(clock).start();
    
    }
  
  }
