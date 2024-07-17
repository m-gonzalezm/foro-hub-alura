package com.virtuaula.api.controller;

import com.virtuaula.api.domain.user.User;
import com.virtuaula.api.domain.user.UserAuthenticationData;
import com.virtuaula.api.infra.security.JWTData;
import com.virtuaula.api.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity authenticateUser(@RequestBody @Valid UserAuthenticationData userAuthenticationData) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(userAuthenticationData.username(),
                userAuthenticationData.password());
        System.out.println(authToken);
        var user = authenticationManager.authenticate(authToken);
        System.out.println("aut");
        var token = tokenService.generateToken((User) user.getPrincipal());
        System.out.println(token);
        return ResponseEntity.ok(new JWTData(token));
    }

}