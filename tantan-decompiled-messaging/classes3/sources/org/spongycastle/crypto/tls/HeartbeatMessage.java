package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.ig3;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.p013io.Streams;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HeartbeatMessage {
    protected int paddingLength;
    protected byte[] payload;
    protected short type;

    public static class PayloadBuffer extends ByteArrayOutputStream {
        public byte[] toTruncatedByteArray(int i) {
            if (((ByteArrayOutputStream) this).count < i + 16) {
                return null;
            }
            return Arrays.copyOf(((ByteArrayOutputStream) this).buf, i);
        }
    }

    public HeartbeatMessage(short s, byte[] bArr, int i) {
        if (!HeartbeatMessageType.isValid(s)) {
            ig3.a("'type' is not a valid HeartbeatMessageType value");
            throw null;
        }
        if (bArr == null || bArr.length >= 65536) {
            ig3.a("'payload' must have length < 2^16");
            throw null;
        }
        if (i < 16) {
            ig3.a("'paddingLength' must be at least 16");
            throw null;
        }
        this.type = s;
        this.payload = bArr;
        this.paddingLength = i;
    }

    public static HeartbeatMessage parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (!HeartbeatMessageType.isValid(uint8)) {
            csi0.m3424a(47);
            return null;
        }
        int uint16 = TlsUtils.readUint16(inputStream);
        PayloadBuffer payloadBuffer = new PayloadBuffer();
        Streams.pipeAll(inputStream, payloadBuffer);
        byte[] truncatedByteArray = payloadBuffer.toTruncatedByteArray(uint16);
        if (truncatedByteArray == null) {
            return null;
        }
        return new HeartbeatMessage(uint8, truncatedByteArray, payloadBuffer.size() - truncatedByteArray.length);
    }

    public void encode(TlsContext tlsContext, OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.type, outputStream);
        TlsUtils.checkUint16(this.payload.length);
        TlsUtils.writeUint16(this.payload.length, outputStream);
        outputStream.write(this.payload);
        byte[] bArr = new byte[this.paddingLength];
        tlsContext.getNonceRandomGenerator().nextBytes(bArr);
        outputStream.write(bArr);
    }
}
