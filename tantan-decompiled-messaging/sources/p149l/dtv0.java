package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class dtv0 implements gdv0 {

    /* JADX INFO: renamed from: a */
    public final Context f87897a;

    /* JADX INFO: renamed from: b */
    public final Executor f87898b;

    /* JADX INFO: renamed from: c */
    public final xbt0 f87899c;

    /* JADX INFO: renamed from: d */
    public final qcv0 f87900d;

    /* JADX INFO: renamed from: e */
    public final ucv0 f87901e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f87902f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public s8s0 f87903g;

    /* JADX INFO: renamed from: h */
    public final l0u0 f87904h;

    /* JADX INFO: renamed from: i */
    public final b5w0 f87905i;

    /* JADX INFO: renamed from: j */
    public final f3u0 f87906j;

    /* JADX INFO: renamed from: k */
    public final gyv0 f87907k;

    /* JADX INFO: renamed from: l */
    public gnr f87908l;

    public dtv0(Context context, Executor executor, zzq zzqVar, xbt0 xbt0Var, qcv0 qcv0Var, ucv0 ucv0Var, gyv0 gyv0Var, f3u0 f3u0Var) {
        this.f87897a = context;
        this.f87898b = executor;
        this.f87899c = xbt0Var;
        this.f87900d = qcv0Var;
        this.f87901e = ucv0Var;
        this.f87907k = gyv0Var;
        this.f87904h = xbt0Var.mo135800k();
        this.f87905i = xbt0Var.mo135792D();
        this.f87902f = new FrameLayout(context);
        this.f87906j = f3u0Var;
        gyv0Var.m128757I(zzqVar);
    }

    @Override // p149l.gdv0
    /* JADX INFO: renamed from: a */
    public final boolean mo113608a(zzl zzlVar, String str, @Nullable edv0 edv0Var, fdv0 fdv0Var) throws RemoteException {
        tot0 tot0VarZzk;
        if (str == null) {
            x2t0.m206866d("Ad unit ID should not be null for banner ad.");
            this.f87898b.execute(new Runnable() { // from class: l.zsv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204648a.m113611l();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && zzlVar.zzf) {
                this.f87899c.mo135805p().m113352n(true);
            }
            gyv0 gyv0Var = this.f87907k;
            gyv0Var.m128758J(str);
            gyv0Var.m128770e(zzlVar);
            Context context = this.f87897a;
            iyv0 iyv0VarM128772g = gyv0Var.m128772g();
            l4w0 l4w0VarM144515b = k4w0.m144515b(context, v4w0.m197070f(iyv0VarM128772g), 3, zzlVar);
            w4w0 w4w0VarMo189933f = null;
            if (!((Boolean) has0.f106827e.m115379e()).booleanValue() || !this.f87907k.m128777x().zzk) {
                boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132152Z7)).booleanValue();
                xbt0 xbt0Var = this.f87899c;
                if (zBooleanValue) {
                    sot0 sot0VarMo135799j = xbt0Var.mo135799j();
                    kwt0 kwt0Var = new kwt0();
                    kwt0Var.m147644e(this.f87897a);
                    kwt0Var.m147648i(iyv0VarM128772g);
                    sot0VarMo135799j.mo185302o(kwt0Var.m147649j());
                    f4u0 f4u0Var = new f4u0();
                    f4u0Var.m119450m(this.f87900d, this.f87898b);
                    f4u0Var.m119451n(this.f87900d, this.f87898b);
                    sot0VarMo135799j.mo185301g(f4u0Var.m119454q());
                    sot0VarMo135799j.mo185303p(new oav0(this.f87903g));
                    sot0VarMo135799j.mo185298c(new fau0(zcu0.f202581h, null));
                    sot0VarMo135799j.mo185299e(new ppt0(this.f87904h, this.f87906j));
                    sot0VarMo135799j.mo185297b(new lnt0(this.f87902f));
                    tot0VarZzk = sot0VarMo135799j.zzh();
                } else {
                    sot0 sot0VarMo135799j2 = xbt0Var.mo135799j();
                    kwt0 kwt0Var2 = new kwt0();
                    kwt0Var2.m147644e(this.f87897a);
                    kwt0Var2.m147648i(iyv0VarM128772g);
                    sot0VarMo135799j2.mo185302o(kwt0Var2.m147649j());
                    f4u0 f4u0Var2 = new f4u0();
                    f4u0Var2.m119450m(this.f87900d, this.f87898b);
                    f4u0Var2.m119441d(this.f87900d, this.f87898b);
                    f4u0Var2.m119441d(this.f87901e, this.f87898b);
                    f4u0Var2.m119452o(this.f87900d, this.f87898b);
                    f4u0Var2.m119444g(this.f87900d, this.f87898b);
                    f4u0Var2.m119445h(this.f87900d, this.f87898b);
                    f4u0Var2.m119446i(this.f87900d, this.f87898b);
                    f4u0Var2.m119442e(this.f87900d, this.f87898b);
                    f4u0Var2.m119451n(this.f87900d, this.f87898b);
                    f4u0Var2.m119449l(this.f87900d, this.f87898b);
                    sot0VarMo135799j2.mo185301g(f4u0Var2.m119454q());
                    sot0VarMo135799j2.mo185303p(new oav0(this.f87903g));
                    sot0VarMo135799j2.mo185298c(new fau0(zcu0.f202581h, null));
                    sot0VarMo135799j2.mo185299e(new ppt0(this.f87904h, this.f87906j));
                    sot0VarMo135799j2.mo185297b(new lnt0(this.f87902f));
                    tot0VarZzk = sot0VarMo135799j2.zzh();
                }
                tot0 tot0Var = tot0VarZzk;
                if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
                    w4w0VarMo189933f = tot0Var.mo189933f();
                    w4w0VarMo189933f.m201590h(3);
                    w4w0VarMo189933f.m201584b(zzlVar.zzp);
                }
                trt0 trt0VarMo189931d = tot0Var.mo189931d();
                gnr gnrVarM190444i = trt0VarMo189931d.m190444i(trt0VarMo189931d.m190445j());
                this.f87908l = gnrVarM190444i;
                jmw0.m142245r(gnrVarM190444i, new ctv0(this, fdv0Var, w4w0VarMo189933f, l4w0VarM144515b, tot0Var), this.f87898b);
                return true;
            }
            qcv0 qcv0Var = this.f87900d;
            if (qcv0Var != null) {
                qcv0Var.mo97693u(pzv0.m172256d(7, null, null));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final ViewGroup m113609c() {
        return this.f87902f;
    }

    /* JADX INFO: renamed from: h */
    public final gyv0 m113610h() {
        return this.f87907k;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m113611l() {
        this.f87900d.mo97693u(pzv0.m172256d(6, null, null));
    }

    /* JADX INFO: renamed from: m */
    public final void m113612m() {
        this.f87904h.m148122w0(this.f87906j.m119264a());
    }

    /* JADX INFO: renamed from: n */
    public final void m113613n(n5s0 n5s0Var) {
        this.f87901e.m193105b(n5s0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m113614o(m0u0 m0u0Var) {
        this.f87904h.m114710q0(m0u0Var, this.f87898b);
    }

    /* JADX INFO: renamed from: p */
    public final void m113615p(s8s0 s8s0Var) {
        this.f87903g = s8s0Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m113616q() {
        Object parent = this.f87902f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        vny0.m199080r();
        return C2075b.m12329v(view, view.getContext());
    }

    @Override // p149l.gdv0
    public final boolean zza() {
        gnr gnrVar = this.f87908l;
        return (gnrVar == null || gnrVar.isDone()) ? false : true;
    }
}
