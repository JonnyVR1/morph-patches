package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2189i5 extends OutputStream {

    /* JADX INFO: renamed from: f */
    public static final byte[] f9971f = new byte[0];

    /* JADX INFO: renamed from: c */
    public int f9974c;

    /* JADX INFO: renamed from: e */
    public int f9976e;

    /* JADX INFO: renamed from: a */
    public final int f9972a = 128;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9973b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public byte[] f9975d = new byte[128];

    public C2189i5(int i) {
    }

    /* JADX INFO: renamed from: k */
    public final synchronized int m12824k() {
        return this.f9974c + this.f9976e;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized zzgyl m12825m() {
        try {
            int i = this.f9976e;
            byte[] bArr = this.f9975d;
            if (i >= bArr.length) {
                this.f9973b.add(new zzgyh(this.f9975d));
                this.f9975d = f9971f;
            } else if (i > 0) {
                this.f9973b.add(new zzgyh(Arrays.copyOf(bArr, i)));
            }
            this.f9974c += this.f9976e;
            this.f9976e = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzgyl.zzu(this.f9973b);
    }

    /* JADX INFO: renamed from: n */
    public final void m12826n(int i) {
        this.f9973b.add(new zzgyh(this.f9975d));
        int length = this.f9974c + this.f9975d.length;
        this.f9974c = length;
        this.f9975d = new byte[Math.max(this.f9972a, Math.max(i, length >>> 1))];
        this.f9976e = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m12824k()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f9975d;
        int length = bArr2.length;
        int i3 = this.f9976e;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f9976e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m12826n(i5);
        System.arraycopy(bArr, i + i4, this.f9975d, 0, i5);
        this.f9976e = i5;
    }

    public final synchronized void zzc() {
        this.f9973b.clear();
        this.f9974c = 0;
        this.f9976e = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f9976e == this.f9975d.length) {
                m12826n(1);
            }
            byte[] bArr = this.f9975d;
            int i2 = this.f9976e;
            this.f9976e = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
