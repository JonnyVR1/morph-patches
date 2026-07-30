package org.java_websocket.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class IncompleteHandshakeException extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;
    private int preferedSize;

    public IncompleteHandshakeException() {
        this.preferedSize = 0;
    }

    public int getPreferedSize() {
        return this.preferedSize;
    }

    public IncompleteHandshakeException(int i) {
        this.preferedSize = i;
    }
}
