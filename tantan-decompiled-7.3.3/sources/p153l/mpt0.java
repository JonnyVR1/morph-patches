package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class mpt0 implements m4w0 {

    /* JADX INFO: renamed from: a */
    public final ont0 f137949a;

    /* JADX INFO: renamed from: b */
    public Context f137950b;

    /* JADX INFO: renamed from: c */
    public String f137951c;

    /* JADX INFO: renamed from: d */
    public zzq f137952d;

    public /* synthetic */ mpt0(ont0 ont0Var, lpt0 lpt0Var) {
        this.f137949a = ont0Var;
    }

    @Override // p153l.m4w0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m4w0 mo157064a(zzq zzqVar) {
        zzqVar.getClass();
        this.f137952d = zzqVar;
        return this;
    }

    @Override // p153l.m4w0
    public final /* synthetic */ m4w0 zzb(String str) {
        str.getClass();
        this.f137951c = str;
        return this;
    }

    @Override // p153l.m4w0
    public final /* synthetic */ m4w0 zzc(Context context) {
        context.getClass();
        this.f137950b = context;
        return this;
    }

    @Override // p153l.m4w0
    public final n4w0 zzd() {
        cqx0.m112000c(this.f137950b, Context.class);
        cqx0.m112000c(this.f137951c, String.class);
        cqx0.m112000c(this.f137952d, zzq.class);
        return new opt0(this.f137949a, this.f137950b, this.f137951c, this.f137952d, null);
    }
}
