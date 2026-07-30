package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1988i;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gyx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1988i.b f107120a;

    /* JADX INFO: renamed from: b */
    public final long f107121b;

    /* JADX INFO: renamed from: c */
    public final long f107122c;

    /* JADX INFO: renamed from: d */
    public final long f107123d;

    /* JADX INFO: renamed from: e */
    public final long f107124e;

    /* JADX INFO: renamed from: f */
    public final boolean f107125f;

    /* JADX INFO: renamed from: g */
    public final boolean f107126g;

    /* JADX INFO: renamed from: h */
    public final boolean f107127h;

    /* JADX INFO: renamed from: i */
    public final boolean f107128i;

    public gyx(InterfaceC1988i.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        w11.m204365a(!z4 || z2);
        w11.m204365a(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        w11.m204365a(z5);
        this.f107120a = bVar;
        this.f107121b = j;
        this.f107122c = j2;
        this.f107123d = j3;
        this.f107124e = j4;
        this.f107125f = z;
        this.f107126g = z2;
        this.f107127h = z3;
        this.f107128i = z4;
    }

    /* JADX INFO: renamed from: a */
    public gyx m133031a(long j) {
        return j == this.f107122c ? this : new gyx(this.f107120a, this.f107121b, j, this.f107123d, this.f107124e, this.f107125f, this.f107126g, this.f107127h, this.f107128i);
    }

    /* JADX INFO: renamed from: b */
    public gyx m133032b(long j) {
        return j == this.f107121b ? this : new gyx(this.f107120a, j, this.f107122c, this.f107123d, this.f107124e, this.f107125f, this.f107126g, this.f107127h, this.f107128i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gyx.class == obj.getClass()) {
            gyx gyxVar = (gyx) obj;
            if (this.f107121b == gyxVar.f107121b && this.f107122c == gyxVar.f107122c && this.f107123d == gyxVar.f107123d && this.f107124e == gyxVar.f107124e && this.f107125f == gyxVar.f107125f && this.f107126g == gyxVar.f107126g && this.f107127h == gyxVar.f107127h && this.f107128i == gyxVar.f107128i && bmk0.m105123c(this.f107120a, gyxVar.f107120a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f107120a.hashCode()) * 31) + ((int) this.f107121b)) * 31) + ((int) this.f107122c)) * 31) + ((int) this.f107123d)) * 31) + ((int) this.f107124e)) * 31) + (this.f107125f ? 1 : 0)) * 31) + (this.f107126g ? 1 : 0)) * 31) + (this.f107127h ? 1 : 0)) * 31) + (this.f107128i ? 1 : 0);
    }
}
