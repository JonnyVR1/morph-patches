package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hhd {

    /* JADX INFO: renamed from: a */
    public final String f107699a;

    /* JADX INFO: renamed from: b */
    public final C1871k f107700b;

    /* JADX INFO: renamed from: c */
    public final C1871k f107701c;

    /* JADX INFO: renamed from: d */
    public final int f107702d;

    /* JADX INFO: renamed from: e */
    public final int f107703e;

    public hhd(String str, C1871k c1871k, C1871k c1871k2, int i, int i2) {
        p11.m167007a(i == 0 || i2 == 0);
        this.f107699a = p11.m167010d(str);
        this.f107700b = (C1871k) p11.m167011e(c1871k);
        this.f107701c = (C1871k) p11.m167011e(c1871k2);
        this.f107702d = i;
        this.f107703e = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hhd.class == obj.getClass()) {
            hhd hhdVar = (hhd) obj;
            if (this.f107702d == hhdVar.f107702d && this.f107703e == hhdVar.f107703e && this.f107699a.equals(hhdVar.f107699a) && this.f107700b.equals(hhdVar.f107700b) && this.f107701c.equals(hhdVar.f107701c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f107702d) * 31) + this.f107703e) * 31) + this.f107699a.hashCode()) * 31) + this.f107700b.hashCode()) * 31) + this.f107701c.hashCode();
    }
}
