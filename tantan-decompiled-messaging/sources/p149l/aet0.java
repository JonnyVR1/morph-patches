package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class aet0 {

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public static final String f69081j = Integer.toString(0, 36);

    /* JADX INFO: renamed from: k */
    public static final String f69082k = Integer.toString(1, 36);

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public static final String f69083l = Integer.toString(2, 36);

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public static final String f69084m = Integer.toString(3, 36);

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public static final String f69085n = Integer.toString(4, 36);

    /* JADX INFO: renamed from: o */
    public static final String f69086o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p */
    public static final String f69087p = Integer.toString(6, 36);

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final g8y0 f69088q = new g8y0() { // from class: l.sct0
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f69089a;

    /* JADX INFO: renamed from: b */
    public final int f69090b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final nis0 f69091c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Object f69092d;

    /* JADX INFO: renamed from: e */
    public final int f69093e;

    /* JADX INFO: renamed from: f */
    public final long f69094f;

    /* JADX INFO: renamed from: g */
    public final long f69095g;

    /* JADX INFO: renamed from: h */
    public final int f69096h;

    /* JADX INFO: renamed from: i */
    public final int f69097i;

    public aet0(@Nullable Object obj, int i, @Nullable nis0 nis0Var, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f69089a = obj;
        this.f69090b = i;
        this.f69091c = nis0Var;
        this.f69092d = obj2;
        this.f69093e = i2;
        this.f69094f = j;
        this.f69095g = j2;
        this.f69096h = i3;
        this.f69097i = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aet0.class == obj.getClass()) {
            aet0 aet0Var = (aet0) obj;
            if (this.f69090b == aet0Var.f69090b && this.f69093e == aet0Var.f69093e && this.f69094f == aet0Var.f69094f && this.f69095g == aet0Var.f69095g && this.f69096h == aet0Var.f69096h && this.f69097i == aet0Var.f69097i && efw0.m116096a(this.f69091c, aet0Var.f69091c) && efw0.m116096a(this.f69089a, aet0Var.f69089a) && efw0.m116096a(this.f69092d, aet0Var.f69092d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f69089a, Integer.valueOf(this.f69090b), this.f69091c, this.f69092d, Integer.valueOf(this.f69093e), Long.valueOf(this.f69094f), Long.valueOf(this.f69095g), Integer.valueOf(this.f69096h), Integer.valueOf(this.f69097i)});
    }
}
