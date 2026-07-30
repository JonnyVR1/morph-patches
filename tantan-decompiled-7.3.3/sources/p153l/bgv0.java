package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class bgv0 implements ucv0 {

    /* JADX INFO: renamed from: a */
    public final Context f76689a;

    /* JADX INFO: renamed from: b */
    public final qju0 f76690b;

    /* JADX INFO: renamed from: c */
    public final Executor f76691c;

    public bgv0(Context context, qju0 qju0Var, Executor executor) {
        this.f76689a = context;
        this.f76690b = qju0Var;
        this.f76691c = executor;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m104241c(b7w0 b7w0Var, int i) {
        return b7w0Var.f75342a.f197721a.f145321g.contains(Integer.toString(i));
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo104242a(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzeml, zzfho {
        ulu0 ulu0VarM196565I;
        nxs0 nxs0VarM180258d = ((r8w0) scv0Var.f167348b).m180258d();
        oxs0 oxs0VarM180259e = ((r8w0) scv0Var.f167348b).m180259e();
        rxs0 rxs0VarM180263i = ((r8w0) scv0Var.f167348b).m180263i();
        if (rxs0VarM180263i != null && m104241c(b7w0Var, 6)) {
            ulu0VarM196565I = ulu0.m196571g0(rxs0VarM180263i);
        } else if (nxs0VarM180258d != null && m104241c(b7w0Var, 6)) {
            ulu0VarM196565I = ulu0.m196566J(nxs0VarM180258d);
        } else if (nxs0VarM180258d != null && m104241c(b7w0Var, 2)) {
            ulu0VarM196565I = ulu0.m196564H(nxs0VarM180258d);
        } else if (oxs0VarM180259e != null && m104241c(b7w0Var, 6)) {
            ulu0VarM196565I = ulu0.m196567K(oxs0VarM180259e);
        } else {
            if (oxs0VarM180259e == null || !m104241c(b7w0Var, 1)) {
                throw new zzeml(1, "No native ad mappers");
            }
            ulu0VarM196565I = ulu0.m196565I(oxs0VarM180259e);
        }
        o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
        if (!o7w0Var.f145321g.contains(Integer.toString(ulu0VarM196565I.m196580P()))) {
            throw new zzeml(1, "No corresponding native ad listener");
        }
        wlu0 wlu0VarMo176887d = this.f76690b.mo176887d(new a0u0(b7w0Var, q6w0Var, scv0Var.f167347a), new gmu0(ulu0VarM196565I), new jou0(oxs0VarM180259e, nxs0VarM180258d, rxs0VarM180263i));
        ((vev0) scv0Var.f167349c).m201078p8(wlu0VarMo176887d.mo99227g());
        wlu0VarMo176887d.mo99225c().m149283q0(new ntt0((r8w0) scv0Var.f167348b), this.f76691c);
        return wlu0VarMo176887d.mo159611h();
    }

    @Override // p153l.ucv0
    /* JADX INFO: renamed from: b */
    public final void mo104243b(b7w0 b7w0Var, q6w0 q6w0Var, scv0 scv0Var) throws zzfho {
        r8w0 r8w0Var = (r8w0) scv0Var.f167348b;
        o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
        String string = q6w0Var.f155916w.toString();
        String strM198940l = v0t0.m198940l(q6w0Var.f155911t);
        jxs0 jxs0Var = (jxs0) scv0Var.f167349c;
        o7w0 o7w0Var2 = b7w0Var.f75342a.f197721a;
        r8w0Var.m180275u(this.f76689a, o7w0Var.f145318d, string, strM198940l, jxs0Var, o7w0Var2.f145323i, o7w0Var2.f145321g);
    }
}
