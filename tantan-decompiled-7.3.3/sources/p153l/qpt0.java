package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class qpt0 implements j6w0 {

    /* JADX INFO: renamed from: a */
    public final ont0 f158906a;

    /* JADX INFO: renamed from: b */
    public Context f158907b;

    /* JADX INFO: renamed from: c */
    public String f158908c;

    public /* synthetic */ qpt0(ont0 ont0Var, ppt0 ppt0Var) {
        this.f158906a = ont0Var;
    }

    @Override // p153l.j6w0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j6w0 mo143723a(Context context) {
        context.getClass();
        this.f158907b = context;
        return this;
    }

    @Override // p153l.j6w0
    public final /* synthetic */ j6w0 zza(String str) {
        this.f158908c = str;
        return this;
    }

    @Override // p153l.j6w0
    public final k6w0 zzc() {
        cqx0.m112000c(this.f158907b, Context.class);
        return new spt0(this.f158906a, this.f158907b, this.f158908c, null);
    }
}
