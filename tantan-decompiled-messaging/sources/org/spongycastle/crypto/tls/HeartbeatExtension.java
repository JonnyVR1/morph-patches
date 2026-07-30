package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class HeartbeatExtension {
    protected short mode;

    public HeartbeatExtension(short s) {
        if (HeartbeatMode.isValid(s)) {
            this.mode = s;
        } else {
            ig3.m135964a("'mode' is not a valid HeartbeatMode value");
            throw null;
        }
    }

    public static HeartbeatExtension parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (HeartbeatMode.isValid(uint8)) {
            return new HeartbeatExtension(uint8);
        }
        csi0.m108512a(47);
        return null;
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.mode, outputStream);
    }

    public short getMode() {
        return this.mode;
    }
}
