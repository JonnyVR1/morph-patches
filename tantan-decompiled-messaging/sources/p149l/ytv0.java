package p149l;

import com.google.android.gms.internal.ads.zzbze;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class ytv0 implements suv0 {

    /* JADX INFO: renamed from: a */
    public final b0w0 f200022a;

    /* JADX INFO: renamed from: b */
    public final Executor f200023b;

    /* JADX INFO: renamed from: c */
    public final fmw0 f200024c = new wtv0(this);

    public ytv0(b0w0 b0w0Var, Executor executor) {
        this.f200022a = b0w0Var;
        this.f200023b = executor;
    }

    @Override // p149l.suv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ gnr mo104000a(tuv0 tuv0Var, ruv0 ruv0Var, Object obj) {
        return m216087c(tuv0Var, ruv0Var, null);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnr m216086b(jwt0 jwt0Var, huv0 huv0Var) throws Exception {
        b0w0 b0w0Var = this.f200022a;
        p0w0 p0w0Var = huv0Var.f109590b;
        zzbze zzbzeVar = huv0Var.f109589a;
        o0w0 o0w0VarMo99793a = b0w0Var.mo99793a(p0w0Var);
        if (o0w0VarMo99793a != null && zzbzeVar != null) {
            jmw0.m142245r(jwt0Var.zzb().m190443h(zzbzeVar), this.f200024c, this.f200023b);
        }
        return jmw0.m142235h(new xtv0(p0w0Var, zzbzeVar, o0w0VarMo99793a));
    }

    /* JADX INFO: renamed from: c */
    public final gnr m216087c(tuv0 tuv0Var, ruv0 ruv0Var, final jwt0 jwt0Var) {
        return jmw0.m142232e(jmw0.m142241n(amw0.m97696C(new iuv0(this.f200022a, jwt0Var, this.f200023b).m138496c()), new rlw0() { // from class: l.utv0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f178298a.m216086b(jwt0Var, (huv0) obj);
            }
        }, this.f200023b), Exception.class, new vtv0(this), this.f200023b);
    }

    @Override // p149l.suv0
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
