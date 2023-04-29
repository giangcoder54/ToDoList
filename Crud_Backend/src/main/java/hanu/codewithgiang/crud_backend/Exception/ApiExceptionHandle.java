package hanu.codewithgiang.crud_backend.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandle {

    @ExceptionHandler(ErrorResponse.class)
    public ResponseEntity<ErrorMessage> hanldeException(ErrorResponse errorResponse){
        ErrorMessage errorMessage = new ErrorMessage(errorResponse.getMessage() );
        return  new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
