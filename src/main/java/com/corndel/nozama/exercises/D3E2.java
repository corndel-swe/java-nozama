package com.corndel.nozama.exercises;

import io.javalin.http.BadRequestResponse;
import io.javalin.http.HttpResponseException;

public class D3E2 {

  public class Account {
    public String username;
    public String email;
    private String password;

    public Account(String username, String email, String password) {
      this.username = username;
      this.email = email;
      this.password = password;
    }

    // https://tech-docs.corndel.com/javalin/sending-errors.html
    public void updateUsername(String newUsername, String givenPassword)
        throws HttpResponseException {
      // If newUsername is not given, throw an AppError with code 400 (Bad Request)
      if (newUsername == null || newUsername.isBlank()) {
        throw new BadRequestResponse("New Username cannot be blank");
      }

      // If password is not given, throw an AppError with code 401 (Unauthorized)
      // If password is given but not correct, throw an AppError with code 403 (Forbidden)
      // If newUsername is given and password is correct, update the username
    }
  }
}
