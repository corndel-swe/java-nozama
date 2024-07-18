package com.corndel.nozama;

import com.corndel.nozama.repositories.UserRepository;
import io.javalin.Javalin;

public class App {
  private Javalin app;

  public static void main(String[] args) {
    var app = new App().javalinApp();
    app.start(8080);
  }

  public App() {
    app = Javalin.create()
        .get("/", ctx -> {
          var users = UserRepository.findAll();
          ctx.json(users);
        })
        .get("/users/{userId}", ctx -> {
          var id = Integer.parseInt(ctx.pathParam("userId"));
          var user = UserRepository.findById(id);
          ctx.json(user);
        });
  }

  public Javalin javalinApp() {
    return app;
  }
}
