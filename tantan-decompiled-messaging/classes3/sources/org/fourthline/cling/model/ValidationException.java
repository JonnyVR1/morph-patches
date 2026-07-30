package org.fourthline.cling.model;

import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ValidationException extends Exception {
    public List<ValidationError> errors;

    public ValidationException(String str, List<ValidationError> list) {
        super(str);
        this.errors = list;
    }

    public List<ValidationError> getErrors() {
        return this.errors;
    }

    public ValidationException(String str, Throwable th) {
        super(str, th);
    }

    public ValidationException(String str) {
        super(str);
    }
}
