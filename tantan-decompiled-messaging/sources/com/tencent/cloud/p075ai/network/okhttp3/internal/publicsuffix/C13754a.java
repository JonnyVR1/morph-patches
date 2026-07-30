package com.tencent.cloud.p075ai.network.okhttp3.internal.publicsuffix;

import com.tencent.cloud.p075ai.network.okio.C13782k;
import com.tencent.cloud.p075ai.network.okio.C13785n;
import com.tencent.cloud.p075ai.network.okio.C13789r;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.publicsuffix.a */
/* JADX INFO: loaded from: classes13.dex */
public final class C13754a {

    /* JADX INFO: renamed from: e */
    public static final byte[] f56803e = {42};

    /* JADX INFO: renamed from: f */
    public static final String[] f56804f = new String[0];

    /* JADX INFO: renamed from: g */
    public static final String[] f56805g = {"*"};

    /* JADX INFO: renamed from: h */
    public static final C13754a f56806h = new C13754a();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f56807a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f56808b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public byte[] f56809c;

    /* JADX INFO: renamed from: d */
    public byte[] f56810d;

    /* JADX INFO: renamed from: a */
    public static String m81804a(byte[] bArr, byte[][] bArr2, int i) {
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
    public final void m81805a() {
        InputStream resourceAsStream = C13754a.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        C13789r c13789r = new C13789r(new C13782k(C13785n.m81964a(resourceAsStream, new C13795x())));
        try {
            byte[] bArr = new byte[c13789r.readInt()];
            c13789r.readFully(bArr);
            byte[] bArr2 = new byte[c13789r.readInt()];
            c13789r.readFully(bArr2);
            c13789r.close();
            synchronized (this) {
                this.f56809c = bArr;
                this.f56810d = bArr2;
            }
            this.f56808b.countDown();
        } catch (Throwable th) {
            try {
                c13789r.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
