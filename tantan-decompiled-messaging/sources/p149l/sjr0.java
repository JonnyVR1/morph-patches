package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class sjr0 {

    /* JADX INFO: renamed from: a */
    public final int f164899a;

    /* JADX INFO: renamed from: b */
    public boolean f164900b;

    /* JADX INFO: renamed from: c */
    public boolean f164901c;

    /* JADX INFO: renamed from: d */
    public byte[] f164902d;

    /* JADX INFO: renamed from: e */
    public int f164903e;

    public sjr0(int i, int i2) {
        this.f164899a = i;
        byte[] bArr = new byte[131];
        this.f164902d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m184548a(byte[] bArr, int i, int i2) {
        if (this.f164900b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f164902d;
            int length = bArr2.length;
            int i4 = this.f164903e + i3;
            if (length < i4) {
                this.f164902d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f164902d, this.f164903e, i3);
            this.f164903e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m184549b() {
        this.f164900b = false;
        this.f164901c = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m184550c(int i) {
        f5v0.m119535f(!this.f164900b);
        boolean z = i == this.f164899a;
        this.f164900b = z;
        if (z) {
            this.f164903e = 3;
            this.f164901c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m184551d(int i) {
        if (!this.f164900b) {
            return false;
        }
        this.f164903e -= i;
        this.f164900b = false;
        this.f164901c = true;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m184552e() {
        return this.f164901c;
    }
}
