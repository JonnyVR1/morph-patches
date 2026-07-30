package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.ig3;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HeartbeatExtension {
    protected short mode;

    public HeartbeatExtension(short s) {
        if (HeartbeatMode.isValid(s)) {
            this.mode = s;
        } else {
            ig3.a("'mode' is not a valid HeartbeatMode value");
            throw null;
        }
    }

    public static HeartbeatExtension parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (HeartbeatMode.isValid(uint8)) {
            return new HeartbeatExtension(uint8);
        }
        csi0.m3424a(47);
        return null;
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.mode, outputStream);
    }

    public short getMode() {
        return this.mode;
    }
}
