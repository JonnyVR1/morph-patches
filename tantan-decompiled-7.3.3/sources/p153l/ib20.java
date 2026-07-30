package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ib20 {

    /* JADX INFO: renamed from: a */
    public final int f113649a;

    /* JADX INFO: renamed from: b */
    public boolean f113650b;

    /* JADX INFO: renamed from: c */
    public boolean f113651c;

    /* JADX INFO: renamed from: d */
    public byte[] f113652d;

    /* JADX INFO: renamed from: e */
    public int f113653e;

    public ib20(int i, int i2) {
        this.f113649a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f113652d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m139234a(byte[] bArr, int i, int i2) {
        if (this.f113650b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f113652d;
            int length = bArr2.length;
            int i4 = this.f113653e;
            if (length < i4 + i3) {
                this.f113652d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f113652d, this.f113653e, i3);
            this.f113653e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m139235b(int i) {
        if (!this.f113650b) {
            return false;
        }
        this.f113653e -= i;
        this.f113650b = false;
        this.f113651c = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m139236c() {
        return this.f113651c;
    }

    /* JADX INFO: renamed from: d */
    public void m139237d() {
        this.f113650b = false;
        this.f113651c = false;
    }

    /* JADX INFO: renamed from: e */
    public void m139238e(int i) {
        w11.m204371g(!this.f113650b);
        boolean z = i == this.f113649a;
        this.f113650b = z;
        if (z) {
            this.f113653e = 3;
            this.f113651c = false;
        }
    }
}
