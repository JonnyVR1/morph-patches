package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2166i5 extends OutputStream {

    /* JADX INFO: renamed from: f */
    public static final byte[] f9934f = new byte[0];

    /* JADX INFO: renamed from: c */
    public int f9937c;

    /* JADX INFO: renamed from: e */
    public int f9939e;

    /* JADX INFO: renamed from: a */
    public final int f9935a = 128;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9936b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public byte[] f9938d = new byte[128];

    public C2166i5(int i) {
    }

    /* JADX INFO: renamed from: k */
    public final synchronized int m12770k() {
        return this.f9937c + this.f9939e;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized zzgyl m12771m() {
        try {
            int i = this.f9939e;
            byte[] bArr = this.f9938d;
            if (i >= bArr.length) {
                this.f9936b.add(new zzgyh(this.f9938d));
                this.f9938d = f9934f;
            } else if (i > 0) {
                this.f9936b.add(new zzgyh(Arrays.copyOf(bArr, i)));
            }
            this.f9937c += this.f9939e;
            this.f9939e = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzgyl.zzu(this.f9936b);
    }

    /* JADX INFO: renamed from: n */
    public final void m12772n(int i) {
        this.f9936b.add(new zzgyh(this.f9938d));
        int length = this.f9937c + this.f9938d.length;
        this.f9937c = length;
        this.f9938d = new byte[Math.max(this.f9935a, Math.max(i, length >>> 1))];
        this.f9939e = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m12770k()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f9938d;
        int length = bArr2.length;
        int i3 = this.f9939e;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f9939e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m12772n(i5);
        System.arraycopy(bArr, i + i4, this.f9938d, 0, i5);
        this.f9939e = i5;
    }

    public final synchronized void zzc() {
        this.f9936b.clear();
        this.f9937c = 0;
        this.f9939e = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f9939e == this.f9938d.length) {
                m12772n(1);
            }
            byte[] bArr = this.f9938d;
            int i2 = this.f9939e;
            this.f9939e = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
