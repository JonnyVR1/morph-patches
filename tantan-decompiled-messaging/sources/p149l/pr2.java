package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pr2 {

    /* JADX INFO: renamed from: a */
    public final String f150850a;

    /* JADX INFO: renamed from: b */
    public final String f150851b;

    /* JADX INFO: renamed from: c */
    public final int f150852c;

    /* JADX INFO: renamed from: d */
    public final int f150853d;

    public pr2(String str, String str2, int i, int i2) {
        this.f150850a = str;
        this.f150851b = str2;
        this.f150852c = i;
        this.f150853d = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr2)) {
            return false;
        }
        pr2 pr2Var = (pr2) obj;
        return this.f150852c == pr2Var.f150852c && this.f150853d == pr2Var.f150853d && v050.m196470a(this.f150850a, pr2Var.f150850a) && v050.m196470a(this.f150851b, pr2Var.f150851b);
    }

    public int hashCode() {
        return v050.m196471b(this.f150850a, this.f150851b, Integer.valueOf(this.f150852c), Integer.valueOf(this.f150853d));
    }
}
