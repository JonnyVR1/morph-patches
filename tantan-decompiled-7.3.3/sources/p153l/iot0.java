package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class iot0 implements q2w0 {

    /* JADX INFO: renamed from: a */
    public final Context f116200a;

    /* JADX INFO: renamed from: b */
    public final zzq f116201b;

    /* JADX INFO: renamed from: c */
    public final String f116202c;

    /* JADX INFO: renamed from: d */
    public final ont0 f116203d;

    /* JADX INFO: renamed from: e */
    public final iot0 f116204e = this;

    /* JADX INFO: renamed from: f */
    public final dqx0 f116205f;

    /* JADX INFO: renamed from: g */
    public final dqx0 f116206g;

    /* JADX INFO: renamed from: h */
    public final dqx0 f116207h;

    /* JADX INFO: renamed from: i */
    public final dqx0 f116208i;

    /* JADX INFO: renamed from: j */
    public final dqx0 f116209j;

    /* JADX INFO: renamed from: k */
    public final dqx0 f116210k;

    public /* synthetic */ iot0(ont0 ont0Var, Context context, String str, zzq zzqVar, hot0 hot0Var) {
        this.f116203d = ont0Var;
        this.f116200a = context;
        this.f116201b = zzqVar;
        this.f116202c = str;
        upx0 upx0VarM202347a = vpx0.m202347a(context);
        this.f116205f = upx0VarM202347a;
        upx0 upx0VarM202347a2 = vpx0.m202347a(zzqVar);
        this.f116206g = upx0VarM202347a2;
        dqx0 dqx0VarM192218b = tpx0.m192218b(new xlv0(ont0Var.f148200o));
        this.f116207h = dqx0VarM192218b;
        dqx0 dqx0VarM192218b2 = tpx0.m192218b(cmv0.m111335a());
        this.f116208i = dqx0VarM192218b2;
        dqx0 dqx0VarM192218b3 = tpx0.m192218b(ncu0.m162601a());
        this.f116209j = dqx0VarM192218b3;
        this.f116210k = tpx0.m192218b(new k2w0(upx0VarM202347a, ont0Var.f148202p, upx0VarM202347a2, ont0Var.f148168V, dqx0VarM192218b, dqx0VarM192218b2, q7w0.m175712a(), dqx0VarM192218b3));
    }

    @Override // p153l.q2w0
    public final wkv0 zza() {
        j2w0 j2w0Var = (j2w0) this.f116210k.zzb();
        wlv0 wlv0Var = (wlv0) this.f116207h.zzb();
        zzcei zzceiVarM130701d = this.f116203d.f148174b.m130701d();
        cqx0.m111999b(zzceiVarM130701d);
        return new wkv0(this.f116200a, this.f116201b, this.f116202c, j2w0Var, wlv0Var, zzceiVarM130701d, (xwu0) this.f116203d.f148173a0.zzb());
    }
}
