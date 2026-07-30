package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class kow0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte[] f124064a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        kow0 kow0Var = (kow0) obj;
        int length = this.f124064a.length;
        int length2 = kow0Var.f124064a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f124064a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = kow0Var.f124064a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kow0) {
            return Arrays.equals(this.f124064a, ((kow0) obj).f124064a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f124064a);
    }

    public final String toString() {
        return i6x0.m134669a(this.f124064a);
    }
}
