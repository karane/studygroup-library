package org.karane.library.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.karane.library.output.RentOutput;
import org.karane.library.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/library/rent")
public class RentApi extends ApiBase{

    @Autowired
    private RentService rentService;

    @PostMapping(value = "/{cpf}/{bookId}")
    @ApiOperation(value = "Show user", notes = "Show the user information from a cpf")
    @ApiResponses(@ApiResponse(code = OK, message = OK_MESSAGE, response = String.class))
    public ResponseEntity rentABook(
            @PathVariable("cpf") String cpf,
            @PathVariable("bookId") String bookId) {

        String receipt = rentService.rentABook(cpf, bookId);

        return ResponseEntity.ok(receipt);
    }

    @GetMapping("/{cpf}")
    @ApiOperation(value = "Insert user", notes = "Insert user")
    @ApiResponses(@ApiResponse(code = OK, message = OK_MESSAGE, response = RentOutput[].class))
    public ResponseEntity getRentsByCpf(
            @PathVariable String cpf) {

        List<RentOutput> rents = rentService.getRentsByCpf(cpf);

        return ResponseEntity.ok(rents);
    }
}
