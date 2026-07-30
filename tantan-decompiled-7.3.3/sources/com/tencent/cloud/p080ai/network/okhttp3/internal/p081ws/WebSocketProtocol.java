package com.tencent.cloud.p080ai.network.okhttp3.internal.p081ws;

import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import p153l.wpg0;

/* JADX INFO: loaded from: classes12.dex */
public final class WebSocketProtocol {
    public WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    /* JADX INFO: renamed from: a */
    public static void m83001a(C13939e.b bVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = bVar.f57824e;
            int i2 = bVar.f57825f;
            int i3 = bVar.f57826g;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            j = bVar.f57823d;
            if (j == bVar.f57820a.f57818b) {
                wpg0.m207458a();
                return;
            }
        } while ((j == -1 ? bVar.m83131h(0L) : bVar.m83131h(j + ((long) (bVar.f57826g - bVar.f57825f)))) != -1);
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    /* JADX INFO: renamed from: a */
    public static String m83000a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }
}
