package com.khan.springbootbookseller.service;

import com.khan.springbootbookseller.model.User;

public interface IAuthenticationService  {
    User signInAndReturnJWT(User signInRequest);
}
