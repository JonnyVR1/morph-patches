package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class q6x0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f152970a;

    public q6x0(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f152970a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* JADX INFO: renamed from: b */
    public static q6x0 m173179b(byte[] bArr) {
        if (bArr != null) {
            return new q6x0(bArr, 0, bArr.length);
        }
        jfd0.m141176a("data must be non-null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m173180a() {
        return this.f152970a.length;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m173181c() {
        byte[] bArr = this.f152970a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q6x0) {
            return Arrays.equals(((q6x0) obj).f152970a, this.f152970a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f152970a);
    }

    public final String toString() {
        return "Bytes(" + i6x0.m134669a(this.f152970a) + ")";
    }
}
