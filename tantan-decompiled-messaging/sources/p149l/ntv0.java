package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2260u3;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class ntv0 implements suv0 {

    /* JADX INFO: renamed from: a */
    public jwt0 f140541a;

    /* JADX INFO: renamed from: b */
    public final Executor f140542b = C2260u3.m13341b();

    @Override // p149l.suv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ gnr mo104000a(tuv0 tuv0Var, ruv0 ruv0Var, @Nullable Object obj) {
        return m161417c(tuv0Var, ruv0Var, null);
    }

    /* JADX INFO: renamed from: b */
    public final jwt0 m161416b() {
        return this.f140541a;
    }

    /* JADX INFO: renamed from: c */
    public final gnr m161417c(tuv0 tuv0Var, ruv0 ruv0Var, @Nullable jwt0 jwt0Var) {
        iwt0 iwt0VarMo156774a = ruv0Var.mo156774a(tuv0Var.f172226b);
        iwt0VarMo156774a.mo106785j(new wuv0(true));
        jwt0 jwt0Var2 = (jwt0) iwt0VarMo156774a.zzh();
        this.f140541a = jwt0Var2;
        final trt0 trt0VarZzb = jwt0Var2.zzb();
        final o0w0 o0w0Var = new o0w0();
        return jmw0.m142240m(jmw0.m142241n(amw0.m97696C(trt0VarZzb.m190445j()), new rlw0() { // from class: l.ltv0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                vxv0 vxv0Var = (vxv0) obj;
                o0w0Var.f141386b = vxv0Var;
                Iterator it = vxv0Var.f183478b.f178772a.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((kxv0) it.next()).f125183a.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return jmw0.m142235h(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return trt0VarZzb.m190444i(jmw0.m142235h(vxv0Var));
                }
                return jmw0.m142235h(null);
            }
        }, this.f140542b), new yew0() { // from class: l.mtv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                o0w0 o0w0Var2 = o0w0Var;
                o0w0Var2.f141387c = (eqt0) obj;
                return o0w0Var2;
            }
        }, this.f140542b);
    }

    @Override // p149l.suv0
    public final /* synthetic */ Object zzd() {
        return this.f140541a;
    }
}
