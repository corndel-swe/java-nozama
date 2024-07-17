package com.corndel.nozama;

import com.corndel.nozama.Repositories.UserRepository;
import io.javalin.Javalin;

public class App {
  private Javalin app;

  public static void main(String[] args) {
    var app = new App().javalinApp();
    app.start(8080);
  }

  public App() {
    app = Javalin.create()
        .get("/", ctx -> ctx.json(UserRepository.findAll()));
  }

  public Javalin javalinApp() {
    return app;
  }
}
