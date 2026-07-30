package io.agora.rtc2.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface IMarshallable {
    void marshall(ByteBuffer byteBuffer);

    byte[] marshall();

    void unmarshall(ByteBuffer byteBuffer);

    void unmarshall(byte[] bArr);
}
