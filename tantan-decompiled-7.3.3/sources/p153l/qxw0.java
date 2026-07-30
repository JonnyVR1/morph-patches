package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class qxw0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte[] f160080a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qxw0 qxw0Var = (qxw0) obj;
        int length = this.f160080a.length;
        int length2 = qxw0Var.f160080a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f160080a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = qxw0Var.f160080a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qxw0) {
            return Arrays.equals(this.f160080a, ((qxw0) obj).f160080a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f160080a);
    }

    public final String toString() {
        return ofx0.m167516a(this.f160080a);
    }
}
