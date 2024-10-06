package com.corndel.nozama.exercises;

import io.javalin.Javalin;

public class D2E2 {
  /**
   * Creates a Javalin app with two endpoints:
   * 
   * - GET /sumup responds with the sum of the integers from 1 to n, where n is
   * provided as a query parameter. If n is not provided, it responds with 0.
   * - GET /multiply/{x}/{y} responds with the product of x and y.
   * 
   * @return a configured Javalin instance
   */
  public static Javalin createApp() {
    var app = Javalin.create();

    // TODO: https://tech-docs.corndel.com/javalin/query-params.html
    app.get(
        "/sumup",
        ctx -> {
          /**
           * This endpoint accepts a query param, n
           * and responds with the sum of the integers from 1 to n
           * e.g. /sumup?n=4 => 10
           * 
           * If n is not provided, it responds with 0
           * e.g. /sumup => 0
           */
        });

    // TODO: https://tech-docs.corndel.com/javalin/url-params.html
    app.get(
        "/multiply/{x}/{y}",
        ctx -> {
          /**
           * This endpoint responds with the product of x and y e.g. /multiply/3/5 => 15
           */
        });

    return app;
  }
}
