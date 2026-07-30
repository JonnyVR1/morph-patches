package com.tencent.cloud.p075ai.network.okhttp3.internal.p076ws;

import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import p149l.ohg0;

/* JADX INFO: loaded from: classes13.dex */
public final class WebSocketProtocol {
    public WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    /* JADX INFO: renamed from: a */
    public static void m81818a(C13776e.b bVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = bVar.f56976e;
            int i2 = bVar.f56977f;
            int i3 = bVar.f56978g;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            j = bVar.f56975d;
            if (j == bVar.f56972a.f56970b) {
                ohg0.m164364a();
                return;
            }
        } while ((j == -1 ? bVar.m81948h(0L) : bVar.m81948h(j + ((long) (bVar.f56978g - bVar.f56977f)))) != -1);
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    /* JADX INFO: renamed from: a */
    public static String m81817a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }
}
