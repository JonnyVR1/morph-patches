package p149l;

import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
public final class w7w0 {

    /* JADX INFO: renamed from: c */
    public static final w7w0 f185113c = new w7w0(-1, -1);

    /* JADX INFO: renamed from: d */
    public static final w7w0 f185114d = new w7w0(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f185115a;

    /* JADX INFO: renamed from: b */
    public final int f185116b;

    public w7w0(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        f5v0.m119533d(z);
        this.f185115a = i;
        this.f185116b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m202082a() {
        return this.f185116b;
    }

    /* JADX INFO: renamed from: b */
    public final int m202083b() {
        return this.f185115a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof w7w0) {
            w7w0 w7w0Var = (w7w0) obj;
            if (this.f185115a == w7w0Var.f185115a && this.f185116b == w7w0Var.f185116b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f185115a;
        return this.f185116b ^ ((i >>> 16) | (i << 16));
    }

    public final String toString() {
        return this.f185115a + BaseSei.f13930X + this.f185116b;
    }
}
