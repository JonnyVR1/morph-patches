package org.java_websocket.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class IncompleteException extends Throwable {
    private static final long serialVersionUID = 7330519489840500997L;
    private int preferredSize;

    public IncompleteException(int i) {
        this.preferredSize = i;
    }

    public int getPreferredSize() {
        return this.preferredSize;
    }
}
