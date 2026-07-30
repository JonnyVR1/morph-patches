package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1965i;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jpx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1965i.b f119232a;

    /* JADX INFO: renamed from: b */
    public final long f119233b;

    /* JADX INFO: renamed from: c */
    public final long f119234c;

    /* JADX INFO: renamed from: d */
    public final long f119235d;

    /* JADX INFO: renamed from: e */
    public final long f119236e;

    /* JADX INFO: renamed from: f */
    public final boolean f119237f;

    /* JADX INFO: renamed from: g */
    public final boolean f119238g;

    /* JADX INFO: renamed from: h */
    public final boolean f119239h;

    /* JADX INFO: renamed from: i */
    public final boolean f119240i;

    public jpx(InterfaceC1965i.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        p11.m167007a(!z4 || z2);
        p11.m167007a(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        p11.m167007a(z5);
        this.f119232a = bVar;
        this.f119233b = j;
        this.f119234c = j2;
        this.f119235d = j3;
        this.f119236e = j4;
        this.f119237f = z;
        this.f119238g = z2;
        this.f119239h = z3;
        this.f119240i = z4;
    }

    /* JADX INFO: renamed from: a */
    public jpx m142766a(long j) {
        return j == this.f119234c ? this : new jpx(this.f119232a, this.f119233b, j, this.f119235d, this.f119236e, this.f119237f, this.f119238g, this.f119239h, this.f119240i);
    }

    /* JADX INFO: renamed from: b */
    public jpx m142767b(long j) {
        return j == this.f119233b ? this : new jpx(this.f119232a, j, this.f119234c, this.f119235d, this.f119236e, this.f119237f, this.f119238g, this.f119239h, this.f119240i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jpx.class == obj.getClass()) {
            jpx jpxVar = (jpx) obj;
            if (this.f119233b == jpxVar.f119233b && this.f119234c == jpxVar.f119234c && this.f119235d == jpxVar.f119235d && this.f119236e == jpxVar.f119236e && this.f119237f == jpxVar.f119237f && this.f119238g == jpxVar.f119238g && this.f119239h == jpxVar.f119239h && this.f119240i == jpxVar.f119240i && vck0.m197845c(this.f119232a, jpxVar.f119232a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f119232a.hashCode()) * 31) + ((int) this.f119233b)) * 31) + ((int) this.f119234c)) * 31) + ((int) this.f119235d)) * 31) + ((int) this.f119236e)) * 31) + (this.f119237f ? 1 : 0)) * 31) + (this.f119238g ? 1 : 0)) * 31) + (this.f119239h ? 1 : 0)) * 31) + (this.f119240i ? 1 : 0);
    }
}
