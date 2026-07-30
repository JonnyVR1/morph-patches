package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.p136io.Streams;
import p153l.f1j0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
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
            wg3.m206174a("'type' is not a valid HeartbeatMessageType value");
            throw null;
        }
        if (bArr == null || bArr.length >= 65536) {
            wg3.m206174a("'payload' must have length < 2^16");
            throw null;
        }
        if (i < 16) {
            wg3.m206174a("'paddingLength' must be at least 16");
            throw null;
        }
        this.type = s;
        this.payload = bArr;
        this.paddingLength = i;
    }

    public static HeartbeatMessage parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (!HeartbeatMessageType.isValid(uint8)) {
            f1j0.m123577a(47);
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
