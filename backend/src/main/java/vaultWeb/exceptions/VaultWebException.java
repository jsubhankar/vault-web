package vaultWeb.exceptions;

import org.springframework.http.HttpStatus;

/**
 * Thrown when any unexpected action performed.
 */
public class VaultWebException extends RuntimeException {

    private HttpStatus httpStatus;
    private String errorType;

    /**
     * Constructs a new VaultWebException for specific HttpStatus, String, String
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
     * Constructs a new VaultWebException for specific HttpStatus, String, String, Throwable
     *
     * @param httpStatus - the constant value from {@link HttpStatus}
     * @param errorType - summarization of the error
     * @param errorMessage - detail description of the error
     * @param cause - the cause details, which saved for later retrieval from {@link Throwable}
     */

    public VaultWebException(HttpStatus httpStatus, String errorType, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.httpStatus = httpStatus;
        this.errorType = errorType;
    }

    /**
     * Getter
    */

    public HttpStatus getHttpStatus() { return httpStatus; }
    public String getErrorType() { return errorType; }
    public String getErrorMessage() { return this.getMessage(); }

}