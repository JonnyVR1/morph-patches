package p149l;

import android.content.Context;
import com.google.android.gms.ads.nonagon.signalgeneration.C2076a;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xbt0 implements wit0 {

    /* JADX INFO: renamed from: a */
    public static xbt0 f191964a;

    /* JADX INFO: renamed from: e */
    public static synchronized xbt0 m207735e(Context context, ons0 ons0Var, int i, boolean z, int i2, jdt0 jdt0Var) {
        try {
            xbt0 xbt0Var = f191964a;
            if (xbt0Var != null) {
                return xbt0Var;
            }
            m7s0.m153417a(context);
            jzv0 jzv0VarM143953d = jzv0.m143953d(context);
            zzcei zzceiVarM143955c = jzv0VarM143953d.m143955c(240304000, false, i2);
            jzv0VarM143953d.m143957f(ons0Var);
            eft0 eft0Var = new eft0(null);
            ybt0 ybt0Var = new ybt0();
            ybt0Var.m213977d(zzceiVarM143955c);
            ybt0Var.m213976c(context);
            eft0Var.m116093b(new act0(ybt0Var, null));
            eft0Var.m116094c(new hht0(jdt0Var));
            xbt0 xbt0VarM116092a = eft0Var.m116092a();
            vny0.m199079q().m212288u(context, zzceiVarM143955c);
            vny0.m199067e().m100029i(context);
            vny0.m199080r().m12342N(context);
            vny0.m199080r().m12341M(context);
            tvt0.m190816a(context);
            vny0.m199066d().m196346d(context);
            vny0.m199086x().m12286b(context);
            xbt0VarM116092a.mo135796f().m191617c();
            n0t0.m157287d(context);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue()) {
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132427v0)).booleanValue()) {
                    z2s0 z2s0Var = new z2s0(new f3s0(context));
                    f0v0 f0v0Var = new f0v0(new b0v0(context), xbt0VarM116092a.mo135793b());
                    vny0.m199080r();
                    new g1v0(context, zzceiVarM143955c, z2s0Var, f0v0Var, UUID.randomUUID().toString(), xbt0VarM116092a.mo135791C()).m124091b(vny0.m199079q().m212279i().mo96947f());
                }
            }
            f191964a = xbt0VarM116092a;
            return xbt0VarM116092a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static xbt0 m207736g(Context context, ons0 ons0Var, int i) {
        return m207735e(context, ons0Var, 240304000, false, i, new jdt0());
    }

    /* JADX INFO: renamed from: A */
    public abstract wyv0 mo135789A();

    /* JADX INFO: renamed from: B */
    public abstract mzv0 mo135790B();

    /* JADX INFO: renamed from: C */
    public abstract p3w0 mo135791C();

    /* JADX INFO: renamed from: D */
    public abstract b5w0 mo135792D();

    @Override // p149l.wit0
    /* JADX INFO: renamed from: a */
    public final umv0 mo203355a(zzbze zzbzeVar, int i) {
        return mo135811v(new lqv0(zzbzeVar, i));
    }

    /* JADX INFO: renamed from: b */
    public abstract rmw0 mo135793b();

    /* JADX INFO: renamed from: c */
    public abstract Executor mo135794c();

    /* JADX INFO: renamed from: d */
    public abstract ScheduledExecutorService mo135795d();

    /* JADX INFO: renamed from: f */
    public abstract u3t0 mo135796f();

    /* JADX INFO: renamed from: h */
    public abstract rht0 mo135797h();

    /* JADX INFO: renamed from: i */
    public abstract smt0 mo135798i();

    /* JADX INFO: renamed from: j */
    public abstract sot0 mo135799j();

    /* JADX INFO: renamed from: k */
    public abstract l0u0 mo135800k();

    /* JADX INFO: renamed from: l */
    public abstract i9u0 mo135801l();

    /* JADX INFO: renamed from: m */
    public abstract jau0 mo135802m();

    /* JADX INFO: renamed from: n */
    public abstract iju0 mo135803n();

    /* JADX INFO: renamed from: o */
    public abstract gpu0 mo135804o();

    /* JADX INFO: renamed from: p */
    public abstract dru0 mo135805p();

    /* JADX INFO: renamed from: q */
    public abstract xru0 mo135806q();

    /* JADX INFO: renamed from: r */
    public abstract k2v0 mo135807r();

    /* JADX INFO: renamed from: s */
    public abstract C2076a mo135808s();

    /* JADX INFO: renamed from: t */
    public abstract biw0 mo135809t();

    /* JADX INFO: renamed from: u */
    public abstract n1r0 mo135810u();

    /* JADX INFO: renamed from: v */
    public abstract umv0 mo135811v(lqv0 lqv0Var);

    /* JADX INFO: renamed from: w */
    public abstract mrv0 mo135812w();

    /* JADX INFO: renamed from: x */
    public abstract jtv0 mo135813x();

    /* JADX INFO: renamed from: y */
    public abstract gvv0 mo135814y();

    /* JADX INFO: renamed from: z */
    public abstract dxv0 mo135815z();
}
