package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class a320 {

    /* JADX INFO: renamed from: a */
    public final int f67313a;

    /* JADX INFO: renamed from: b */
    public boolean f67314b;

    /* JADX INFO: renamed from: c */
    public boolean f67315c;

    /* JADX INFO: renamed from: d */
    public byte[] f67316d;

    /* JADX INFO: renamed from: e */
    public int f67317e;

    public a320(int i, int i2) {
        this.f67313a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f67316d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m94637a(byte[] bArr, int i, int i2) {
        if (this.f67314b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f67316d;
            int length = bArr2.length;
            int i4 = this.f67317e;
            if (length < i4 + i3) {
                this.f67316d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f67316d, this.f67317e, i3);
            this.f67317e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m94638b(int i) {
        if (!this.f67314b) {
            return false;
        }
        this.f67317e -= i;
        this.f67314b = false;
        this.f67315c = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m94639c() {
        return this.f67315c;
    }

    /* JADX INFO: renamed from: d */
    public void m94640d() {
        this.f67314b = false;
        this.f67315c = false;
    }

    /* JADX INFO: renamed from: e */
    public void m94641e(int i) {
        p11.m167013g(!this.f67314b);
        boolean z = i == this.f67313a;
        this.f67314b = z;
        if (z) {
            this.f67317e = 3;
            this.f67315c = false;
        }
    }
}
