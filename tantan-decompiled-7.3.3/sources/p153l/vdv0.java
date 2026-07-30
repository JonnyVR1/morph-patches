package p153l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzdtn;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class vdv0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final zxt0 f183665a;

    /* JADX INFO: renamed from: b */
    public final Context f183666b;

    /* JADX INFO: renamed from: c */
    public final ltu0 f183667c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f183668d;

    /* JADX INFO: renamed from: e */
    public final Executor f183669e;

    /* JADX INFO: renamed from: f */
    public final eow0 f183670f;

    public vdv0(zxt0 zxt0Var, Context context, Executor executor, ltu0 ltu0Var, o7w0 o7w0Var, eow0 eow0Var) {
        this.f183666b = context;
        this.f183665a = zxt0Var;
        this.f183669e = executor;
        this.f183667c = ltu0Var;
        this.f183668d = o7w0Var;
        this.f183670f = eow0Var;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        u6w0 u6w0Var = q6w0Var.f155911t;
        return (u6w0Var == null || u6w0Var.f177809a == null) ? false : true;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(final b7w0 b7w0Var, final q6w0 q6w0Var) {
        return pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.udv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f178600a.m200997c(b7w0Var, q6w0Var, obj);
            }
        }, this.f183669e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m200997c(b7w0 b7w0Var, q6w0 q6w0Var, Object obj) throws Exception {
        View zzdtnVar;
        zzq zzqVarM194892a = u7w0.m194892a(this.f183666b, q6w0Var.f155915v);
        final wit0 wit0VarM155812a = this.f183667c.m155812a(zzqVarM194892a, q6w0Var, b7w0Var.f75343b.f68854b);
        wit0VarM155812a.mo13732b0(q6w0Var.f155870X);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168019I7)).booleanValue() && q6w0Var.f155888h0) {
            zzdtnVar = zzcvt.m13799a(this.f183666b, (View) wit0VarM155812a, q6w0Var);
        } else {
            zzdtnVar = new zzdtn(this.f183666b, (View) wit0VarM155812a, (c1s0) this.f183670f.apply(q6w0Var));
        }
        final vwt0 vwt0VarMo121814a = this.f183665a.mo121814a(new a0u0(b7w0Var, q6w0Var, null), new bxt0(zzdtnVar, wit0VarM155812a, new izt0() { // from class: l.pdv0
            @Override // p153l.izt0
            public final lpu0 zza() {
                return wit0VarM155812a.mo13729a();
            }
        }, u7w0.m194893b(zzqVarM194892a)));
        vwt0VarMo121814a.mo99230j().m151408i(wit0VarM155812a, false, null);
        h7u0 h7u0VarMo99224b = vwt0VarMo121814a.mo99224b();
        j7u0 j7u0Var = new j7u0() { // from class: l.qdv0
            @Override // p153l.j7u0
            /* JADX INFO: renamed from: a */
            public final void mo106809a() {
                wit0 wit0Var = wit0VarM155812a;
                if (wit0Var.zzN() != null) {
                    wit0Var.zzN().zzr();
                }
            }
        };
        xvw0 xvw0Var = oct0.f146738f;
        h7u0VarMo99224b.m149283q0(j7u0Var, xvw0Var);
        vwt0VarMo121814a.mo99230j();
        u6w0 u6w0Var = q6w0Var.f155911t;
        hpr hprVarM151401j = ktu0.m151401j(wit0VarM155812a, u6w0Var.f177810b, u6w0Var.f177809a);
        if (q6w0Var.f155860N) {
            hprVarM151401j.addListener(new Runnable() { // from class: l.rdv0
                @Override // java.lang.Runnable
                public final void run() {
                    wit0VarM155812a.mo13762s();
                }
            }, this.f183669e);
        }
        hprVarM151401j.addListener(new Runnable() { // from class: l.sdv0
            @Override // java.lang.Runnable
            public final void run() {
                this.f167467a.m200998d(wit0VarM155812a);
            }
        }, this.f183669e);
        return pvw0.m173986m(hprVarM151401j, new eow0() { // from class: l.tdv0
            @Override // p153l.eow0
            public final Object apply(Object obj2) {
                return vwt0VarMo121814a.mo99228h();
            }
        }, xvw0Var);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m200998d(wit0 wit0Var) {
        wit0Var.mo13758p0();
        yjt0 yjt0VarMo13729a = wit0Var.mo13729a();
        zzfk zzfkVar = this.f183668d.f145315a;
        if (zzfkVar != null && yjt0VarMo13729a != null) {
            yjt0VarMo13729a.m216432s8(zzfkVar);
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168333i1)).booleanValue() || wit0Var.isAttachedToWindow()) {
            return;
        }
        wit0Var.onPause();
        wit0Var.mo13708E(true);
    }
}
