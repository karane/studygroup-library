package org.karane.library.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.karane.library.input.UserInput;
import org.karane.library.output.UserOutput;
import org.karane.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/library/users")
public class UserApi extends ApiBase{

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{cpf}")
    @ApiOperation(value = "Show user", notes = "Show the user information from a cpf")
    @ApiResponses(@ApiResponse(code = OK, message = OK_MESSAGE, response = UserOutput.class))
    public ResponseEntity getBookInformation(
            @PathVariable("cpf") String cpf) {

        UserOutput userOutput = userService.getUserInformation(cpf);

        return ResponseEntity.ok(userOutput);
    }

    @PostMapping
    @ApiOperation(value = "Insert user", notes = "Insert user")
    @ApiResponses(@ApiResponse(code = OK, message = OK_MESSAGE, response = UserOutput.class))
    public ResponseEntity insertUser(
            @RequestBody UserInput userInput) {


        UserOutput userOutput = userService.insertUser(userInput);

        return ResponseEntity.ok(userOutput);
    }
}
