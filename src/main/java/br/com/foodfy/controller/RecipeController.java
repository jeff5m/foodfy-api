package br.com.foodfy.controller;

import br.com.foodfy.model.requests.RecipePostRequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {

    @PostMapping
    public ResponseEntity<RecipePostRequestBody> save(@Valid @RequestBody RecipePostRequestBody recipePostRequestBody) {
        return new ResponseEntity<>(recipePostRequestBody, HttpStatus.OK);
    }
}
