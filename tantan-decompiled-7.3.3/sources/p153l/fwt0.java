package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzdkv;

/* JADX INFO: loaded from: classes6.dex */
public final class fwt0 extends kzt0 {

    /* JADX INFO: renamed from: j */
    @Nullable
    public final wit0 f101205j;

    /* JADX INFO: renamed from: k */
    public final int f101206k;

    /* JADX INFO: renamed from: l */
    public final Context f101207l;

    /* JADX INFO: renamed from: m */
    public final uvt0 f101208m;

    /* JADX INFO: renamed from: n */
    public final wiu0 f101209n;

    /* JADX INFO: renamed from: o */
    public final dfu0 f101210o;

    /* JADX INFO: renamed from: p */
    public final c7u0 f101211p;

    /* JADX INFO: renamed from: q */
    public final boolean f101212q;

    /* JADX INFO: renamed from: r */
    public final ibt0 f101213r;

    /* JADX INFO: renamed from: s */
    public boolean f101214s;

    public fwt0(jzt0 jzt0Var, Context context, @Nullable wit0 wit0Var, int i, uvt0 uvt0Var, wiu0 wiu0Var, dfu0 dfu0Var, c7u0 c7u0Var, ibt0 ibt0Var) {
        super(jzt0Var);
        this.f101214s = false;
        this.f101205j = wit0Var;
        this.f101207l = context;
        this.f101206k = i;
        this.f101208m = uvt0Var;
        this.f101209n = wiu0Var;
        this.f101210o = dfu0Var;
        this.f101211p = c7u0Var;
        this.f101212q = ((Boolean) jas0.m144075c().m176505a(sgs0.f168363k5)).booleanValue();
        this.f101213r = ibt0Var;
    }

    @Override // p153l.kzt0
    /* JADX INFO: renamed from: b */
    public final void mo127848b() {
        super.mo127848b();
        wit0 wit0Var = this.f101205j;
        if (wit0Var != null) {
            wit0Var.destroy();
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m127849i() {
        return this.f101206k;
    }

    /* JADX INFO: renamed from: j */
    public final void m127850j(nas0 nas0Var) {
        wit0 wit0Var = this.f101205j;
        if (wit0Var != null) {
            wit0Var.mo13750l0(nas0Var);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public final void m127851k(Activity activity, abs0 abs0Var, boolean z) throws RemoteException {
        wit0 wit0Var;
        q6w0 q6w0VarMo13733c;
        Context context = activity;
        if (activity == null) {
            context = this.f101207l;
        }
        if (this.f101212q) {
            this.f101210o.zzb();
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167928B0)).booleanValue()) {
            bxy0.m106934r();
            if (C2098b.m12367f(context)) {
                dct0.m115298g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f101211p.zzb();
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167940C0)).booleanValue()) {
                    new kiw0(context.getApplicationContext(), bxy0.m106938v().m213967b()).m149983a(this.f129453a.f75343b.f68854b.f172368b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168382lb)).booleanValue() && (wit0Var = this.f101205j) != null && (q6w0VarMo13733c = wit0Var.mo13733c()) != null && q6w0VarMo13733c.f155908r0 && q6w0VarMo13733c.f155910s0 != this.f101213r.m139401b()) {
            dct0.m115298g("The app open consent form has been shown.");
            this.f101211p.mo102876i(v8w0.m200327d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f101214s) {
            dct0.m115298g("App open interstitial ad is already visible.");
            this.f101211p.mo102876i(v8w0.m200327d(10, null, null));
        }
        if (this.f101214s) {
            return;
        }
        try {
            this.f101209n.mo104077a(z, context, this.f101211p);
            if (this.f101212q) {
                this.f101210o.zza();
            }
            this.f101214s = true;
        } catch (zzdkv e) {
            this.f101211p.mo102875Z(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m127852l(long j, int i) {
        this.f101208m.m198308a(j, i);
    }
}
