package org.fourthline.cling.model.message;

import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UpnpResponse extends UpnpOperation {
    private int statusCode;
    private String statusMessage;

    public enum Status {
        OK(200, "OK"),
        BAD_REQUEST(HttpStatus.BAD_REQUEST_400, "Bad Request"),
        NOT_FOUND(HttpStatus.NOT_FOUND_404, "Not Found"),
        METHOD_NOT_SUPPORTED(HttpStatus.METHOD_NOT_ALLOWED_405, "Method Not Supported"),
        PRECONDITION_FAILED(HttpStatus.PRECONDITION_FAILED_412, "Precondition Failed"),
        UNSUPPORTED_MEDIA_TYPE(HttpStatus.UNSUPPORTED_MEDIA_TYPE_415, "Unsupported Media Type"),
        INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR_500, "Internal Server Error"),
        NOT_IMPLEMENTED(HttpStatus.NOT_IMPLEMENTED_501, "Not Implemented");

        private int statusCode;
        private String statusMsg;

        Status(int i, String str) {
            this.statusCode = i;
            this.statusMsg = str;
        }

        public static Status getByStatusCode(int i) {
            for (Status status : values()) {
                if (status.getStatusCode() == i) {
                    return status;
                }
            }
            return null;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public String getStatusMsg() {
            return this.statusMsg;
        }
    }

    public UpnpResponse(Status status) {
        this.statusCode = status.getStatusCode();
        this.statusMessage = status.getStatusMsg();
    }

    public String getResponseDetails() {
        return getStatusCode() + " " + getStatusMessage();
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public boolean isFailed() {
        return this.statusCode >= 300;
    }

    public String toString() {
        return getResponseDetails();
    }

    public UpnpResponse(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }
}
