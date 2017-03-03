package dk.cphbusiness.airport.template;

import dk.cphbusiness.algorithm.examples.queues.PriorityQueue;
import java.util.List;

public class PassengerConsumer {
  private final List<Plane> planes;
  private final PriorityQueue<Passenger> queue;

  public PassengerConsumer(List<Plane> planes, PriorityQueue<Passenger> queue) {
    this.planes = planes;
    this.queue = queue;
    }
  
  public void tick(Clock clock) {
    throw new UnsupportedOperationException("No support");
    }

  }
