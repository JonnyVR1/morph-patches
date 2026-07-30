package com.tencent.cloud.p080ai.network.okhttp3.internal.publicsuffix;

import com.tencent.cloud.p080ai.network.okio.C13945k;
import com.tencent.cloud.p080ai.network.okio.C13948n;
import com.tencent.cloud.p080ai.network.okio.C13952r;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.publicsuffix.a */
/* JADX INFO: loaded from: classes12.dex */
public final class C13917a {

    /* JADX INFO: renamed from: e */
    public static final byte[] f57651e = {42};

    /* JADX INFO: renamed from: f */
    public static final String[] f57652f = new String[0];

    /* JADX INFO: renamed from: g */
    public static final String[] f57653g = {"*"};

    /* JADX INFO: renamed from: h */
    public static final C13917a f57654h = new C13917a();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f57655a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f57656b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public byte[] f57657c;

    /* JADX INFO: renamed from: d */
    public byte[] f57658d;

    /* JADX INFO: renamed from: a */
    public static String m82987a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m82988a() {
        InputStream resourceAsStream = C13917a.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        C13952r c13952r = new C13952r(new C13945k(C13948n.m83147a(resourceAsStream, new C13958x())));
        try {
            byte[] bArr = new byte[c13952r.readInt()];
            c13952r.readFully(bArr);
            byte[] bArr2 = new byte[c13952r.readInt()];
            c13952r.readFully(bArr2);
            c13952r.close();
            synchronized (this) {
                this.f57657c = bArr;
                this.f57658d = bArr2;
            }
            this.f57656b.countDown();
        } catch (Throwable th) {
            try {
                c13952r.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
