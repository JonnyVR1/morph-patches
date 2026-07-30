package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class wfx0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f188898a;

    public wfx0(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f188898a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* JADX INFO: renamed from: b */
    public static wfx0 m206170b(byte[] bArr) {
        if (bArr != null) {
            return new wfx0(bArr, 0, bArr.length);
        }
        mnd0.m159157a("data must be non-null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m206171a() {
        return this.f188898a.length;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m206172c() {
        byte[] bArr = this.f188898a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wfx0) {
            return Arrays.equals(((wfx0) obj).f188898a, this.f188898a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f188898a);
    }

    public final String toString() {
        return "Bytes(" + ofx0.m167516a(this.f188898a) + ")";
    }
}
