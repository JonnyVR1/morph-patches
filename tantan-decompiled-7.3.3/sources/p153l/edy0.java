package p153l;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class edy0 {

    /* JADX INFO: renamed from: t */
    public static final kzy0 f93589t = new kzy0(new Object(), -1);

    /* JADX INFO: renamed from: a */
    public final d0u0 f93590a;

    /* JADX INFO: renamed from: b */
    public final kzy0 f93591b;

    /* JADX INFO: renamed from: c */
    public final long f93592c;

    /* JADX INFO: renamed from: d */
    public final long f93593d;

    /* JADX INFO: renamed from: e */
    public final int f93594e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final zziz f93595f;

    /* JADX INFO: renamed from: g */
    public final boolean f93596g;

    /* JADX INFO: renamed from: h */
    public final q2z0 f93597h;

    /* JADX INFO: renamed from: i */
    public final u5z0 f93598i;

    /* JADX INFO: renamed from: j */
    public final List f93599j;

    /* JADX INFO: renamed from: k */
    public final kzy0 f93600k;

    /* JADX INFO: renamed from: l */
    public final boolean f93601l;

    /* JADX INFO: renamed from: m */
    public final int f93602m;

    /* JADX INFO: renamed from: n */
    public final iet0 f93603n;

    /* JADX INFO: renamed from: o */
    public final boolean f93604o = false;

    /* JADX INFO: renamed from: p */
    public volatile long f93605p;

    /* JADX INFO: renamed from: q */
    public volatile long f93606q;

    /* JADX INFO: renamed from: r */
    public volatile long f93607r;

    /* JADX INFO: renamed from: s */
    public volatile long f93608s;

    public edy0(d0u0 d0u0Var, kzy0 kzy0Var, long j, long j2, int i, @Nullable zziz zzizVar, boolean z, q2z0 q2z0Var, u5z0 u5z0Var, List list, kzy0 kzy0Var2, boolean z2, int i2, iet0 iet0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.f93590a = d0u0Var;
        this.f93591b = kzy0Var;
        this.f93592c = j;
        this.f93593d = j2;
        this.f93594e = i;
        this.f93595f = zzizVar;
        this.f93596g = z;
        this.f93597h = q2z0Var;
        this.f93598i = u5z0Var;
        this.f93599j = list;
        this.f93600k = kzy0Var2;
        this.f93601l = z2;
        this.f93602m = i2;
        this.f93603n = iet0Var;
        this.f93605p = j3;
        this.f93606q = j4;
        this.f93607r = j5;
        this.f93608s = j6;
    }

    /* JADX INFO: renamed from: g */
    public static edy0 m120528g(u5z0 u5z0Var) {
        d0u0 d0u0Var = d0u0.f84608a;
        kzy0 kzy0Var = f93589t;
        return new edy0(d0u0Var, kzy0Var, -9223372036854775807L, 0L, 1, null, false, q2z0.f155398d, u5z0Var, zzgaa.zzl(), kzy0Var, false, 0, iet0.f114611d, 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: h */
    public static kzy0 m120529h() {
        return f93589t;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final edy0 m120530a(kzy0 kzy0Var) {
        return new edy0(this.f93590a, this.f93591b, this.f93592c, this.f93593d, this.f93594e, this.f93595f, this.f93596g, this.f93597h, this.f93598i, this.f93599j, kzy0Var, this.f93601l, this.f93602m, this.f93603n, this.f93605p, this.f93606q, this.f93607r, this.f93608s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public final edy0 m120531b(kzy0 kzy0Var, long j, long j2, long j3, long j4, q2z0 q2z0Var, u5z0 u5z0Var, List list) {
        kzy0 kzy0Var2 = this.f93600k;
        boolean z = this.f93601l;
        int i = this.f93602m;
        iet0 iet0Var = this.f93603n;
        long j5 = this.f93605p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new edy0(this.f93590a, kzy0Var, j2, j3, this.f93594e, this.f93595f, this.f93596g, q2z0Var, u5z0Var, list, kzy0Var2, z, i, iet0Var, j5, j4, j, jElapsedRealtime, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public final edy0 m120532c(boolean z, int i) {
        return new edy0(this.f93590a, this.f93591b, this.f93592c, this.f93593d, this.f93594e, this.f93595f, this.f93596g, this.f93597h, this.f93598i, this.f93599j, this.f93600k, z, i, this.f93603n, this.f93605p, this.f93606q, this.f93607r, this.f93608s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    public final edy0 m120533d(@Nullable zziz zzizVar) {
        return new edy0(this.f93590a, this.f93591b, this.f93592c, this.f93593d, this.f93594e, zzizVar, this.f93596g, this.f93597h, this.f93598i, this.f93599j, this.f93600k, this.f93601l, this.f93602m, this.f93603n, this.f93605p, this.f93606q, this.f93607r, this.f93608s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: e */
    public final edy0 m120534e(int i) {
        return new edy0(this.f93590a, this.f93591b, this.f93592c, this.f93593d, i, this.f93595f, this.f93596g, this.f93597h, this.f93598i, this.f93599j, this.f93600k, this.f93601l, this.f93602m, this.f93603n, this.f93605p, this.f93606q, this.f93607r, this.f93608s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: f */
    public final edy0 m120535f(d0u0 d0u0Var) {
        return new edy0(d0u0Var, this.f93591b, this.f93592c, this.f93593d, this.f93594e, this.f93595f, this.f93596g, this.f93597h, this.f93598i, this.f93599j, this.f93600k, this.f93601l, this.f93602m, this.f93603n, this.f93605p, this.f93606q, this.f93607r, this.f93608s, false);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m120536i() {
        return this.f93594e == 3 && this.f93601l && this.f93602m == 0;
    }
}
