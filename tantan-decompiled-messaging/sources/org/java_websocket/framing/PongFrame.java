package org.java_websocket.framing;

/* JADX INFO: loaded from: classes3.dex */
public class PongFrame extends ControlFrame {
    public PongFrame(PingFrame pingFrame) {
        super(Framedata.Opcode.PONG);
        setPayload(pingFrame.getPayloadData());
    }

    public PongFrame() {
        super(Framedata.Opcode.PONG);
    }
}
