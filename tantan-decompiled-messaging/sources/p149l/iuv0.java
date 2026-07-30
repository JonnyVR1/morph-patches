package p149l;

import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class iuv0 {

    /* JADX INFO: renamed from: a */
    public final b0w0 f115054a;

    /* JADX INFO: renamed from: b */
    public final jwt0 f115055b;

    /* JADX INFO: renamed from: c */
    public final Executor f115056c;

    /* JADX INFO: renamed from: d */
    public huv0 f115057d;

    public iuv0(b0w0 b0w0Var, jwt0 jwt0Var, Executor executor) {
        this.f115054a = b0w0Var;
        this.f115055b = jwt0Var;
        this.f115056c = executor;
    }

    /* JADX INFO: renamed from: c */
    public final gnr m138496c() {
        gnr gnrVarM142232e;
        huv0 huv0Var = this.f115057d;
        if (huv0Var != null) {
            return jmw0.m142235h(huv0Var);
        }
        if (((Boolean) ias0.f112319a.m115379e()).booleanValue()) {
            gnrVarM142232e = jmw0.m142232e(jmw0.m142240m(amw0.m97696C(this.f115055b.zzb().m190440e(this.f115054a.zza())), new fuv0(this), this.f115056c), zzecf.class, new euv0(this), this.f115056c);
        } else {
            huv0 huv0Var2 = new huv0(null, m138497e(), null);
            this.f115057d = huv0Var2;
            gnrVarM142232e = jmw0.m142235h(huv0Var2);
        }
        return jmw0.m142240m(gnrVarM142232e, new yew0() { // from class: l.duv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return (huv0) obj;
            }
        }, this.f115056c);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final p0w0 m138497e() {
        iyv0 iyv0VarZzg = this.f115055b.zzg();
        return this.f115054a.mo99796d(iyv0VarZzg.f115494d, iyv0VarZzg.f115496f, iyv0VarZzg.f115500j);
    }
}
