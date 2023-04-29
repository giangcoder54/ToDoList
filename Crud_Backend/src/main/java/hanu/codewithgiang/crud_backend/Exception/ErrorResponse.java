package hanu.codewithgiang.crud_backend.Exception;

public class ErrorResponse extends  RuntimeException{
    public ErrorResponse(String message){
        super(message);
    }
}
