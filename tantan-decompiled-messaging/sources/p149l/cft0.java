package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class cft0 implements ktv0 {

    /* JADX INFO: renamed from: a */
    public final Context f80652a;

    /* JADX INFO: renamed from: b */
    public final zzq f80653b;

    /* JADX INFO: renamed from: c */
    public final String f80654c;

    /* JADX INFO: renamed from: d */
    public final iet0 f80655d;

    /* JADX INFO: renamed from: e */
    public final cft0 f80656e = this;

    /* JADX INFO: renamed from: f */
    public final xgx0 f80657f;

    /* JADX INFO: renamed from: g */
    public final xgx0 f80658g;

    /* JADX INFO: renamed from: h */
    public final xgx0 f80659h;

    /* JADX INFO: renamed from: i */
    public final xgx0 f80660i;

    /* JADX INFO: renamed from: j */
    public final xgx0 f80661j;

    /* JADX INFO: renamed from: k */
    public final xgx0 f80662k;

    public /* synthetic */ cft0(iet0 iet0Var, Context context, String str, zzq zzqVar, bft0 bft0Var) {
        this.f80655d = iet0Var;
        this.f80652a = context;
        this.f80653b = zzqVar;
        this.f80654c = str;
        ogx0 ogx0VarM168925a = pgx0.m168925a(context);
        this.f80657f = ogx0VarM168925a;
        ogx0 ogx0VarM168925a2 = pgx0.m168925a(zzqVar);
        this.f80658g = ogx0VarM168925a2;
        xgx0 xgx0VarM159364b = ngx0.m159364b(new rcv0(iet0Var.f112902o));
        this.f80659h = xgx0VarM159364b;
        xgx0 xgx0VarM159364b2 = ngx0.m159364b(wcv0.m202679a());
        this.f80660i = xgx0VarM159364b2;
        xgx0 xgx0VarM159364b3 = ngx0.m159364b(h3u0.m129177a());
        this.f80661j = xgx0VarM159364b3;
        this.f80662k = ngx0.m159364b(new etv0(ogx0VarM168925a, iet0Var.f112904p, ogx0VarM168925a2, iet0Var.f112870V, xgx0VarM159364b, xgx0VarM159364b2, kyv0.m147901a(), xgx0VarM159364b3));
    }

    @Override // p149l.ktv0
    public final qbv0 zza() {
        dtv0 dtv0Var = (dtv0) this.f80662k.zzb();
        qcv0 qcv0Var = (qcv0) this.f80659h.zzb();
        zzcei zzceiVarM95839d = this.f80655d.f112876b.m95839d();
        wgx0.m203089b(zzceiVarM95839d);
        return new qbv0(this.f80652a, this.f80653b, this.f80654c, dtv0Var, qcv0Var, zzceiVarM95839d, (rnu0) this.f80655d.f112875a0.zzb());
    }
}
