package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p153l.f1j0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class HeartbeatExtension {
    protected short mode;

    public HeartbeatExtension(short s) {
        if (HeartbeatMode.isValid(s)) {
            this.mode = s;
        } else {
            wg3.m206174a("'mode' is not a valid HeartbeatMode value");
            throw null;
        }
    }

    public static HeartbeatExtension parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (HeartbeatMode.isValid(uint8)) {
            return new HeartbeatExtension(uint8);
        }
        f1j0.m123577a(47);
        return null;
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.mode, outputStream);
    }

    public short getMode() {
        return this.mode;
    }
}
