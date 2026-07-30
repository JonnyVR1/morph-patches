package org.java_websocket.exceptions;

import org.java_websocket.framing.CloseFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class InvalidFrameException extends InvalidDataException {
    private static final long serialVersionUID = -9016496369828887591L;

    public InvalidFrameException() {
        super(CloseFrame.PROTOCOL_ERROR);
    }

    public InvalidFrameException(String str) {
        super(CloseFrame.PROTOCOL_ERROR, str);
    }

    public InvalidFrameException(Throwable th) {
        super(CloseFrame.PROTOCOL_ERROR, th);
    }

    public InvalidFrameException(String str, Throwable th) {
        super(CloseFrame.PROTOCOL_ERROR, str, th);
    }
}
