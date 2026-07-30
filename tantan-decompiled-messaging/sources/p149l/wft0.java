package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class wft0 implements gpu0 {

    /* JADX INFO: renamed from: a */
    public final iet0 f186112a;

    /* JADX INFO: renamed from: b */
    public Context f186113b;

    /* JADX INFO: renamed from: c */
    public ais0 f186114c;

    public /* synthetic */ wft0(iet0 iet0Var, vft0 vft0Var) {
        this.f186112a = iet0Var;
    }

    @Override // p149l.gpu0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gpu0 mo127483a(Context context) {
        context.getClass();
        this.f186113b = context;
        return this;
    }

    @Override // p149l.gpu0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gpu0 mo127484b(ais0 ais0Var) {
        ais0Var.getClass();
        this.f186114c = ais0Var;
        return this;
    }

    @Override // p149l.gpu0
    public final hpu0 zzc() {
        wgx0.m203090c(this.f186113b, Context.class);
        wgx0.m203090c(this.f186114c, ais0.class);
        return new yft0(this.f186112a, this.f186113b, this.f186114c, null);
    }
}
