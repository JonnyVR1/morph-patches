package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfiz;

/* JADX INFO: loaded from: classes6.dex */
public final class b4w0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f74998a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f74999b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f75000c;

    public b4w0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f74998a = kqx0Var;
        this.f74999b = kqx0Var2;
        this.f75000c = kqx0Var3;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y3w0 zzb() {
        Context context = (Context) this.f74998a.zzb();
        d9w0 d9w0Var = (d9w0) this.f74999b.zzb();
        z9w0 z9w0Var = (z9w0) this.f75000c.zzb();
        yat0 yat0VarZzh = ((Boolean) jas0.m144075c().m176505a(sgs0.f168455r6)).booleanValue() ? bxy0.m106933q().m120264i().zzh() : bxy0.m106933q().m120264i().zzi();
        boolean z = false;
        if (yat0VarZzh != null && yat0VarZzh.m214930h()) {
            z = true;
        }
        if (((Integer) jas0.m144075c().m176505a(sgs0.f168480t6)).intValue() > 0) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168442q6)).booleanValue() || z) {
                y9w0 y9w0VarM219088a = z9w0Var.m219088a(zzfiz.Rewarded, context, d9w0Var, new w2w0(new t2w0()));
                i3w0 i3w0Var = new i3w0(new h3w0());
                h9w0 h9w0Var = y9w0VarM219088a.f198130a;
                xvw0 xvw0Var = oct0.f146733a;
                return new y2w0(i3w0Var, new e3w0(h9w0Var, xvw0Var), y9w0VarM219088a.f198131b, y9w0VarM219088a.f198130a.zza().zzf, xvw0Var);
            }
        }
        return new h3w0();
    }
}
