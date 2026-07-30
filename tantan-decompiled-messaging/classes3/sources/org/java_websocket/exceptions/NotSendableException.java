package org.java_websocket.exceptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NotSendableException extends RuntimeException {
    private static final long serialVersionUID = -6468967874576651628L;

    public NotSendableException(String str) {
        super(str);
    }

    public NotSendableException(Throwable th) {
        super(th);
    }

    public NotSendableException(String str, Throwable th) {
        super(str, th);
    }
}
