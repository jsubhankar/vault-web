package vaultWeb.exceptions;

import org.springframework.http.HttpStatus;

/**
 * Thrown when a user tries to register with a username that already exists.
 */
public class VaultWebException extends RuntimeException {

    private HttpStatus httpStatus;
    private String errorType;

    /**
     * Constructor
     *
     * @param httpStatus - the constant value from {@link HttpStatus}
     * @param errorType - summarization of the error
     * @param errorMessage - detail description of the error
     */

    public VaultWebException(HttpStatus httpStatus, String errorType, String errorMessage) {
        super(errorMessage);
        this.httpStatus = httpStatus;
        this.errorType = errorType;
    }

    /**
     * Constructor
     *
     * @param httpStatus - the constant value from {@link HttpStatus}
     * @param errorType - summarization of the error
     * @param errorMessage - detail description of the error
     * @param cause - the cause, which saved for later retrieval
     */

    public VaultWebException(HttpStatus httpStatus, String errorType, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.httpStatus = httpStatus;
        this.errorType = errorType;
    }

    /**
     *
     * Getter
     *
    */

    public HttpStatus getHttpStatus() { return httpStatus; }
    public String getErrorType() { return errorType; }
    public String getErrorMessage() { return this.getMessage(); }

}