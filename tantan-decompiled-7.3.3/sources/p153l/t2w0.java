package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2283u3;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class t2w0 implements y3w0 {

    /* JADX INFO: renamed from: a */
    public p5u0 f171826a;

    /* JADX INFO: renamed from: b */
    public final Executor f171827b = C2283u3.m13395b();

    @Override // p153l.y3w0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ hpr mo119326a(z3w0 z3w0Var, x3w0 x3w0Var, @Nullable Object obj) {
        return m189006c(z3w0Var, x3w0Var, null);
    }

    /* JADX INFO: renamed from: b */
    public final p5u0 m189005b() {
        return this.f171826a;
    }

    /* JADX INFO: renamed from: c */
    public final hpr m189006c(z3w0 z3w0Var, x3w0 x3w0Var, @Nullable p5u0 p5u0Var) {
        o5u0 o5u0VarMo184819a = x3w0Var.mo184819a(z3w0Var.f202868b);
        o5u0VarMo184819a.mo111695j(new c4w0(true));
        p5u0 p5u0Var2 = (p5u0) o5u0VarMo184819a.zzh();
        this.f171826a = p5u0Var2;
        final z0u0 z0u0VarZzb = p5u0Var2.zzb();
        final u9w0 u9w0Var = new u9w0();
        return pvw0.m173986m(pvw0.m173987n(gvw0.m132580C(z0u0VarZzb.m218174j()), new xuw0() { // from class: l.r2w0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                b7w0 b7w0Var = (b7w0) obj;
                u9w0Var.f178158b = b7w0Var;
                Iterator it = b7w0Var.f75343b.f68853a.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((q6w0) it.next()).f155873a.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return pvw0.m173981h(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return z0u0VarZzb.m218173i(pvw0.m173981h(b7w0Var));
                }
                return pvw0.m173981h(null);
            }
        }, this.f171827b), new eow0() { // from class: l.s2w0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                u9w0 u9w0Var2 = u9w0Var;
                u9w0Var2.f178159c = (kzt0) obj;
                return u9w0Var2;
            }
        }, this.f171827b);
    }

    @Override // p153l.y3w0
    public final /* synthetic */ Object zzd() {
        return this.f171826a;
    }
}
