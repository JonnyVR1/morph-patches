package org.java_websocket.framing;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface Framedata {

    public enum Opcode {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING
    }

    void append(Framedata framedata);

    Opcode getOpcode();

    ByteBuffer getPayloadData();

    boolean getTransfereMasked();

    boolean isFin();

    boolean isRSV1();

    boolean isRSV2();

    boolean isRSV3();
}
