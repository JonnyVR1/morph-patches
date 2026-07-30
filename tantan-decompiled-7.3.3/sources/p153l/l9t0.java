package p153l;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class l9t0 {

    /* JADX INFO: renamed from: a */
    public Context f130627a;

    /* JADX INFO: renamed from: b */
    public Clock f130628b;

    /* JADX INFO: renamed from: c */
    public grw0 f130629c;

    /* JADX INFO: renamed from: d */
    public s9t0 f130630d;

    public /* synthetic */ l9t0(d9t0 d9t0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final l9t0 m153455a(grw0 grw0Var) {
        this.f130629c = grw0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final l9t0 m153456b(Context context) {
        context.getClass();
        this.f130627a = context;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final l9t0 m153457c(Clock clock) {
        clock.getClass();
        this.f130628b = clock;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final l9t0 m153458d(s9t0 s9t0Var) {
        this.f130630d = s9t0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final t9t0 m153459e() {
        cqx0.m112000c(this.f130627a, Context.class);
        cqx0.m112000c(this.f130628b, Clock.class);
        cqx0.m112000c(this.f130629c, grw0.class);
        cqx0.m112000c(this.f130630d, s9t0.class);
        return new n9t0(this.f130627a, this.f130628b, this.f130629c, this.f130630d, null);
    }
}
