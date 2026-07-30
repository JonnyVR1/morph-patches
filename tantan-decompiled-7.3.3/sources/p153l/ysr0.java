package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ysr0 {

    /* JADX INFO: renamed from: a */
    public final int f201444a;

    /* JADX INFO: renamed from: b */
    public boolean f201445b;

    /* JADX INFO: renamed from: c */
    public boolean f201446c;

    /* JADX INFO: renamed from: d */
    public byte[] f201447d;

    /* JADX INFO: renamed from: e */
    public int f201448e;

    public ysr0(int i, int i2) {
        this.f201444a = i;
        byte[] bArr = new byte[131];
        this.f201447d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m217273a(byte[] bArr, int i, int i2) {
        if (this.f201445b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f201447d;
            int length = bArr2.length;
            int i4 = this.f201448e + i3;
            if (length < i4) {
                this.f201447d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f201447d, this.f201448e, i3);
            this.f201448e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m217274b() {
        this.f201445b = false;
        this.f201446c = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m217275c(int i) {
        lev0.m153958f(!this.f201445b);
        boolean z = i == this.f201444a;
        this.f201445b = z;
        if (z) {
            this.f201448e = 3;
            this.f201446c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m217276d(int i) {
        if (!this.f201445b) {
            return false;
        }
        this.f201448e -= i;
        this.f201445b = false;
        this.f201446c = true;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m217277e() {
        return this.f201446c;
    }
}
