package com.corndel.nozama.exercises;

public class D3E2 {

  public class Account {
    public String username;
    public String email;

    @SuppressWarnings("unused")
    private String password;

    public Account(String username, String email, String password) {
      this.username = username;
      this.email = email;
      this.password = password;
    }

    // TODO: https://tech-docs.corndel.com/javalin/sending-errors.html
    // In this exercise, you should throw Javalin custom exceptions
    // You do not need to configure fallback handlers
    public void updateUsername(String newUsername, String passwordAttempt) throws Exception {
      // TODO: If newUsername is not given, throw a BadRequestResponse

      // TODO: If passwordAttempt is not given, throw an UnauthorizedResponse

      // TODO: If passwordAttempt is given but not correct, throw a ForbiddenResponse

      // TODO: If newUsername is given and passwordAttempt is correct, update the
      // username
    }
  }
}
