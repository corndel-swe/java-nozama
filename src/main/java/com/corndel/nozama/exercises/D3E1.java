package com.corndel.nozama.exercises;

import io.javalin.Javalin;
import io.javalin.http.Context;

// TODO: https://tech-docs.corndel.com/javalin/routing.html

public class D3E1 {
  // This is the counter instance you should be using for this exercise:
  public static Counter counter = new Counter();

  /**
   * Creates a Javalin app with two endpoints:
   * - GET /counter responds with the current count in the response body
   * as a JSON object, i.e. { "count": <current count> }.
   * - PUT /counter/increment increases the counter by 1 and then responds
   * with the count.
   *
   * @return a configured Javalin instance
   */
  public static Javalin createApp() {
    var app = Javalin.create();
    app.get("/counter", CounterController::getCounter);
    app.put("/counter/increment", CounterController::increment);
    return app;
  }
}

class Counter {
  private int count;

  public Counter() {
    count = 0;
  }

  public void increment() {
    count++;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}

class CounterController {

  /**
   * A GET /counter endpoint that returns the current count in the response body
   * as a JSON object, i.e. { "count": <current count> }.
   */
  public static void getCounter(Context ctx) {
    // TODO
  }

  /**
   * Increases the counter by 1 and then responds with the count.
   *
   * <p>
   * Example response: { "count": 1 }
   */
  public static void increment(Context ctx) {
    // TODO
  }
}
