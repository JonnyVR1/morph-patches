package com.tencent.iliveroom.p080a.p083c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13958b {
    /* JADX INFO: renamed from: a */
    public static void m82635a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr == null || bArr2 == null) {
            return;
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferWrap.order(byteOrder).asShortBuffer().get(sArr);
        short[] sArr2 = new short[bArr2.length / 2];
        ByteBuffer.wrap(bArr2).order(byteOrder).asShortBuffer().get(sArr2);
        int i3 = i2 / i;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = sArr[i4] + sArr2[i4 * i3];
            short s = Short.MAX_VALUE;
            if (i5 <= 32767) {
                s = Short.MIN_VALUE;
                if (i5 >= -32768) {
                    s = (short) i5;
                }
            }
            sArr[i4] = s;
        }
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr);
    }
}
