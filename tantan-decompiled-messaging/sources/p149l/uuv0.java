package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfiz;

/* JADX INFO: loaded from: classes6.dex */
public final class uuv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f178460a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f178461b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f178462c;

    public uuv0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f178460a = ehx0Var;
        this.f178461b = ehx0Var2;
        this.f178462c = ehx0Var3;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final suv0 zzb() {
        Context context = (Context) this.f178460a.zzb();
        xzv0 xzv0Var = (xzv0) this.f178461b.zzb();
        t0w0 t0w0Var = (t0w0) this.f178462c.zzb();
        s1t0 s1t0VarZzh = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132384r6)).booleanValue() ? vny0.m199079q().m212279i().zzh() : vny0.m199079q().m212279i().zzi();
        boolean z = false;
        if (s1t0VarZzh != null && s1t0VarZzh.m182049h()) {
            z = true;
        }
        if (((Integer) d1s0.m109677c().m144697a(m7s0.f131935H6)).intValue() > 0) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132371q6)).booleanValue() || z) {
                s0w0 s0w0VarM186877a = t0w0Var.m186877a(zzfiz.AppOpen, context, xzv0Var, new qtv0(new ntv0()));
                cuv0 cuv0Var = new cuv0(new buv0());
                b0w0 b0w0Var = s0w0VarM186877a.f161818a;
                rmw0 rmw0Var = i3t0.f111372a;
                return new stv0(cuv0Var, new ytv0(b0w0Var, rmw0Var), s0w0VarM186877a.f161819b, s0w0VarM186877a.f161818a.zza().zzf, rmw0Var);
            }
        }
        return new buv0();
    }
}
