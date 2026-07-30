package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class wnt0 implements s0w0 {

    /* JADX INFO: renamed from: a */
    public final ont0 f189977a;

    /* JADX INFO: renamed from: b */
    public Context f189978b;

    /* JADX INFO: renamed from: c */
    public String f189979c;

    public /* synthetic */ wnt0(ont0 ont0Var, vnt0 vnt0Var) {
        this.f189977a = ont0Var;
    }

    @Override // p153l.s0w0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s0w0 mo183984a(Context context) {
        context.getClass();
        this.f189978b = context;
        return this;
    }

    @Override // p153l.s0w0
    public final /* synthetic */ s0w0 zza(String str) {
        str.getClass();
        this.f189979c = str;
        return this;
    }

    @Override // p153l.s0w0
    public final t0w0 zzc() {
        cqx0.m112000c(this.f189978b, Context.class);
        cqx0.m112000c(this.f189979c, String.class);
        return new ynt0(this.f189977a, this.f189978b, this.f189979c, null);
    }
}
