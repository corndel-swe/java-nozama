package com.corndel.nozama.exercises;

import io.javalin.Javalin;
import java.util.ArrayList;

public class D2E3 {
  private Javalin app;
  private ArrayList<Alarm> alarms;

  public D2E3() {
    alarms = new ArrayList<Alarm>();
    alarms.add(new Alarm("08:30", "Wake up!"));
    alarms.add(new Alarm("17:00", "Go home!"));

    app = Javalin.create();

    // https://tech-docs.corndel.com/javalin/body-and-headers.html
    app.get(
        "/alarms",
        ctx -> {
          /** Responds with all the alarms as a JSON response */
        });

    app.get(
        "/alarms/{index}",
        ctx -> {
          /** Responds with the alarm at the given index */
        });

    app.post(
        "/alarms",
        ctx -> {
          /**
           * Request contains a new alarm in the req.body Push it to the end of the alarms array
           * Respond with a 201 status code and the new alarm
           */
        });
  }

  public Javalin javalinApp() {
    return app;
  }

  public ArrayList<Alarm> getAlarms() {
    return alarms;
  }
}

class Alarm {
  public String time;
  public String message;

  public Alarm() {}

  public Alarm(String time, String message) {
    this.time = time;
    this.message = message;
  }
}
