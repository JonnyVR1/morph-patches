package p149l;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class f0t0 {

    /* JADX INFO: renamed from: a */
    public Context f94005a;

    /* JADX INFO: renamed from: b */
    public Clock f94006b;

    /* JADX INFO: renamed from: c */
    public aiw0 f94007c;

    /* JADX INFO: renamed from: d */
    public m0t0 f94008d;

    public /* synthetic */ f0t0(xzs0 xzs0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final f0t0 m119051a(aiw0 aiw0Var) {
        this.f94007c = aiw0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final f0t0 m119052b(Context context) {
        context.getClass();
        this.f94005a = context;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final f0t0 m119053c(Clock clock) {
        clock.getClass();
        this.f94006b = clock;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final f0t0 m119054d(m0t0 m0t0Var) {
        this.f94008d = m0t0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final n0t0 m119055e() {
        wgx0.m203090c(this.f94005a, Context.class);
        wgx0.m203090c(this.f94006b, Clock.class);
        wgx0.m203090c(this.f94007c, aiw0.class);
        wgx0.m203090c(this.f94008d, m0t0.class);
        return new h0t0(this.f94005a, this.f94006b, this.f94007c, this.f94008d, null);
    }
}
