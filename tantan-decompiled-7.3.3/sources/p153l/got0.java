package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class got0 implements p2w0 {

    /* JADX INFO: renamed from: a */
    public final ont0 f105384a;

    /* JADX INFO: renamed from: b */
    public Context f105385b;

    /* JADX INFO: renamed from: c */
    public String f105386c;

    /* JADX INFO: renamed from: d */
    public zzq f105387d;

    public /* synthetic */ got0(ont0 ont0Var, fot0 fot0Var) {
        this.f105384a = ont0Var;
    }

    @Override // p153l.p2w0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p2w0 mo131184a(zzq zzqVar) {
        zzqVar.getClass();
        this.f105387d = zzqVar;
        return this;
    }

    @Override // p153l.p2w0
    public final /* synthetic */ p2w0 zzb(String str) {
        str.getClass();
        this.f105386c = str;
        return this;
    }

    @Override // p153l.p2w0
    public final /* synthetic */ p2w0 zzc(Context context) {
        context.getClass();
        this.f105385b = context;
        return this;
    }

    @Override // p153l.p2w0
    public final q2w0 zzd() {
        cqx0.m112000c(this.f105385b, Context.class);
        cqx0.m112000c(this.f105386c, String.class);
        cqx0.m112000c(this.f105387d, zzq.class);
        return new iot0(this.f105384a, this.f105385b, this.f105386c, this.f105387d, null);
    }
}
