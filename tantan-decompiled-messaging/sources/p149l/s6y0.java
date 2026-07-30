package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class s6y0 {

    /* JADX INFO: renamed from: a */
    public final long f162865a;

    /* JADX INFO: renamed from: b */
    public final xqt0 f162866b;

    /* JADX INFO: renamed from: c */
    public final int f162867c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final eqy0 f162868d;

    /* JADX INFO: renamed from: e */
    public final long f162869e;

    /* JADX INFO: renamed from: f */
    public final xqt0 f162870f;

    /* JADX INFO: renamed from: g */
    public final int f162871g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final eqy0 f162872h;

    /* JADX INFO: renamed from: i */
    public final long f162873i;

    /* JADX INFO: renamed from: j */
    public final long f162874j;

    public s6y0(long j, xqt0 xqt0Var, int i, @Nullable eqy0 eqy0Var, long j2, xqt0 xqt0Var2, int i2, @Nullable eqy0 eqy0Var2, long j3, long j4) {
        this.f162865a = j;
        this.f162866b = xqt0Var;
        this.f162867c = i;
        this.f162868d = eqy0Var;
        this.f162869e = j2;
        this.f162870f = xqt0Var2;
        this.f162871g = i2;
        this.f162872h = eqy0Var2;
        this.f162873i = j3;
        this.f162874j = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s6y0.class == obj.getClass()) {
            s6y0 s6y0Var = (s6y0) obj;
            if (this.f162865a == s6y0Var.f162865a && this.f162867c == s6y0Var.f162867c && this.f162869e == s6y0Var.f162869e && this.f162871g == s6y0Var.f162871g && this.f162873i == s6y0Var.f162873i && this.f162874j == s6y0Var.f162874j && efw0.m116096a(this.f162866b, s6y0Var.f162866b) && efw0.m116096a(this.f162868d, s6y0Var.f162868d) && efw0.m116096a(this.f162870f, s6y0Var.f162870f) && efw0.m116096a(this.f162872h, s6y0Var.f162872h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f162865a), this.f162866b, Integer.valueOf(this.f162867c), this.f162868d, Long.valueOf(this.f162869e), this.f162870f, Integer.valueOf(this.f162871g), this.f162872h, Long.valueOf(this.f162873i), Long.valueOf(this.f162874j)});
    }
}
