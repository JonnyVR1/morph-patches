package org.java_websocket.util;

import java.nio.ByteBuffer;
import p153l.fig0;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferUtils {
    private ByteBufferUtils() {
    }

    public static ByteBuffer getEmptyByteBuffer() {
        return ByteBuffer.allocate(0);
    }

    public static int transferByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer == null || byteBuffer2 == null) {
            fig0.m125680a();
            return 0;
        }
        int iRemaining = byteBuffer.remaining();
        int iRemaining2 = byteBuffer2.remaining();
        if (iRemaining <= iRemaining2) {
            byteBuffer2.put(byteBuffer);
            return iRemaining;
        }
        int iMin = Math.min(iRemaining, iRemaining2);
        byteBuffer.limit(iMin);
        byteBuffer2.put(byteBuffer);
        return iMin;
    }
}
