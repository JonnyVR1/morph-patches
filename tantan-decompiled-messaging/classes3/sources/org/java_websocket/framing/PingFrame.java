package org.java_websocket.framing;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PingFrame extends ControlFrame {
    public PingFrame() {
        super(Framedata.Opcode.PING);
    }
}
