package p149l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzdtn;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class p4v0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final tot0 f147221a;

    /* JADX INFO: renamed from: b */
    public final Context f147222b;

    /* JADX INFO: renamed from: c */
    public final fku0 f147223c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f147224d;

    /* JADX INFO: renamed from: e */
    public final Executor f147225e;

    /* JADX INFO: renamed from: f */
    public final yew0 f147226f;

    public p4v0(tot0 tot0Var, Context context, Executor executor, fku0 fku0Var, iyv0 iyv0Var, yew0 yew0Var) {
        this.f147222b = context;
        this.f147221a = tot0Var;
        this.f147225e = executor;
        this.f147223c = fku0Var;
        this.f147224d = iyv0Var;
        this.f147226f = yew0Var;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        oxv0 oxv0Var = kxv0Var.f125221t;
        return (oxv0Var == null || oxv0Var.f146253a == null) ? false : true;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(final vxv0 vxv0Var, final kxv0 kxv0Var) {
        return jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.o4v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f141818a.m167424c(vxv0Var, kxv0Var, obj);
            }
        }, this.f147225e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m167424c(vxv0 vxv0Var, kxv0 kxv0Var, Object obj) throws Exception {
        View zzdtnVar;
        zzq zzqVarM166723a = oyv0.m166723a(this.f147222b, kxv0Var.f125225v);
        final q9t0 q9t0VarM121894a = this.f147223c.m121894a(zzqVarM166723a, kxv0Var, vxv0Var.f183478b.f178773b);
        q9t0VarM121894a.mo13678b0(kxv0Var.f125180X);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131948I7)).booleanValue() && kxv0Var.f125198h0) {
            zzdtnVar = zzcvt.m13745a(this.f147222b, (View) q9t0VarM121894a, kxv0Var);
        } else {
            zzdtnVar = new zzdtn(this.f147222b, (View) q9t0VarM121894a, (wrr0) this.f147226f.apply(kxv0Var));
        }
        final pnt0 pnt0VarMo189928a = this.f147221a.mo189928a(new uqt0(vxv0Var, kxv0Var, null), new vnt0(zzdtnVar, q9t0VarM121894a, new cqt0() { // from class: l.j4v0
            @Override // p149l.cqt0
            public final fgu0 zza() {
                return q9t0VarM121894a.mo13675a();
            }
        }, oyv0.m166724b(zzqVarM166723a)));
        pnt0VarMo189928a.mo170465j().m117003i(q9t0VarM121894a, false, null);
        byt0 byt0VarMo96324b = pnt0VarMo189928a.mo96324b();
        dyt0 dyt0Var = new dyt0() { // from class: l.k4v0
            @Override // p149l.dyt0
            /* JADX INFO: renamed from: a */
            public final void mo95459a() {
                q9t0 q9t0Var = q9t0VarM121894a;
                if (q9t0Var.zzN() != null) {
                    q9t0Var.zzN().zzr();
                }
            }
        };
        rmw0 rmw0Var = i3t0.f111377f;
        byt0VarMo96324b.m114710q0(dyt0Var, rmw0Var);
        pnt0VarMo189928a.mo170465j();
        oxv0 oxv0Var = kxv0Var.f125221t;
        gnr gnrVarM116996j = eku0.m116996j(q9t0VarM121894a, oxv0Var.f146254b, oxv0Var.f146253a);
        if (kxv0Var.f125170N) {
            gnrVarM116996j.addListener(new Runnable() { // from class: l.l4v0
                @Override // java.lang.Runnable
                public final void run() {
                    q9t0VarM121894a.mo13708s();
                }
            }, this.f147225e);
        }
        gnrVarM116996j.addListener(new Runnable() { // from class: l.m4v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f131332a.m167425d(q9t0VarM121894a);
            }
        }, this.f147225e);
        return jmw0.m142240m(gnrVarM116996j, new yew0() { // from class: l.n4v0
            @Override // p149l.yew0
            public final Object apply(Object obj2) {
                return pnt0VarMo189928a.mo170463h();
            }
        }, rmw0Var);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m167425d(q9t0 q9t0Var) {
        q9t0Var.mo13704p0();
        sat0 sat0VarMo13675a = q9t0Var.mo13675a();
        zzfk zzfkVar = this.f147224d.f115491a;
        if (zzfkVar != null && sat0VarMo13675a != null) {
            sat0VarMo13675a.m183094s8(zzfkVar);
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132262i1)).booleanValue() || q9t0Var.isAttachedToWindow()) {
            return;
        }
        q9t0Var.onPause();
        q9t0Var.mo13654E(true);
    }
}
