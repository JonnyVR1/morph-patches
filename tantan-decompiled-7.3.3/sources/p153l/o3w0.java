package p153l;

import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class o3w0 {

    /* JADX INFO: renamed from: a */
    public final h9w0 f144860a;

    /* JADX INFO: renamed from: b */
    public final p5u0 f144861b;

    /* JADX INFO: renamed from: c */
    public final Executor f144862c;

    /* JADX INFO: renamed from: d */
    public n3w0 f144863d;

    public o3w0(h9w0 h9w0Var, p5u0 p5u0Var, Executor executor) {
        this.f144860a = h9w0Var;
        this.f144861b = p5u0Var;
        this.f144862c = executor;
    }

    /* JADX INFO: renamed from: c */
    public final hpr m165890c() {
        hpr hprVarM173978e;
        n3w0 n3w0Var = this.f144863d;
        if (n3w0Var != null) {
            return pvw0.m173981h(n3w0Var);
        }
        if (((Boolean) ojs0.f147710a.m149974e()).booleanValue()) {
            hprVarM173978e = pvw0.m173978e(pvw0.m173986m(gvw0.m132580C(this.f144861b.zzb().m218169e(this.f144860a.zza())), new l3w0(this), this.f144862c), zzecf.class, new k3w0(this), this.f144862c);
        } else {
            n3w0 n3w0Var2 = new n3w0(null, m165891e(), null);
            this.f144863d = n3w0Var2;
            hprVarM173978e = pvw0.m173981h(n3w0Var2);
        }
        return pvw0.m173986m(hprVarM173978e, new eow0() { // from class: l.j3w0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return (n3w0) obj;
            }
        }, this.f144862c);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final v9w0 m165891e() {
        o7w0 o7w0VarZzg = this.f144861b.zzg();
        return this.f144860a.mo134090d(o7w0VarZzg.f145318d, o7w0VarZzg.f145320f, o7w0VarZzg.f145324j);
    }
}
