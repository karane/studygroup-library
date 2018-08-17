package org.karane.library.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.karane.library.input.BookInput;
import org.karane.library.output.BookOutput;
import org.karane.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/library/books")
public class BookApi extends ApiBase{

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/{bookId}")
    @ApiOperation(value = "Show book", notes = "Show the book information from a bookId")
    @ApiResponses(@ApiResponse(code = OK, message = OK_MESSAGE, response = BookOutput.class))
    public ResponseEntity getBookInformation(
            @PathVariable("bookId") String bookId) {

        BookOutput bookOutput = bookService.getBookInformation(bookId);

        return ResponseEntity.ok(bookOutput);
    }

    @PostMapping
    @ApiOperation(value = "Insert book", notes = "Insert book")
    @ApiResponses(@ApiResponse(code = OK, message = OK_MESSAGE, response = BookOutput.class))
    public ResponseEntity insertBook(
            @RequestBody BookInput bookInput) {


        BookOutput bookOutput = bookService.insertBook(bookInput);

        return ResponseEntity.ok(bookOutput);
    }
}
