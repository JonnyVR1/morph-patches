package org.junit.runner.notification;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes3.dex */
public class Failure implements Serializable {
    private static final long serialVersionUID = 1;
    private final Description fDescription;
    private final Throwable fThrownException;

    public Failure(Description description, Throwable th) {
        this.fThrownException = th;
        this.fDescription = description;
    }

    public Description getDescription() {
        return this.fDescription;
    }

    public Throwable getException() {
        return this.fThrownException;
    }

    public String getMessage() {
        return getException().getMessage();
    }

    public String getTestHeader() {
        return this.fDescription.getDisplayName();
    }

    public String getTrace() {
        StringWriter stringWriter = new StringWriter();
        getException().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public String toString() {
        return getTestHeader() + ": " + this.fThrownException.getMessage();
    }
}
