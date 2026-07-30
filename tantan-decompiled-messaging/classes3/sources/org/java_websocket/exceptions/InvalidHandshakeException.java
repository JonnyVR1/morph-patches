package org.java_websocket.exceptions;

import org.java_websocket.framing.CloseFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class InvalidHandshakeException extends InvalidDataException {
    private static final long serialVersionUID = -1426533877490484964L;

    public InvalidHandshakeException() {
        super(CloseFrame.PROTOCOL_ERROR);
    }

    public InvalidHandshakeException(String str, Throwable th) {
        super(CloseFrame.PROTOCOL_ERROR, str, th);
    }

    public InvalidHandshakeException(String str) {
        super(CloseFrame.PROTOCOL_ERROR, str);
    }

    public InvalidHandshakeException(Throwable th) {
        super(CloseFrame.PROTOCOL_ERROR, th);
    }
}
