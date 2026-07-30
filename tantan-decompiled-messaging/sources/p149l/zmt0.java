package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzdkv;

/* JADX INFO: loaded from: classes6.dex */
public final class zmt0 extends eqt0 {

    /* JADX INFO: renamed from: j */
    @Nullable
    public final q9t0 f203766j;

    /* JADX INFO: renamed from: k */
    public final int f203767k;

    /* JADX INFO: renamed from: l */
    public final Context f203768l;

    /* JADX INFO: renamed from: m */
    public final omt0 f203769m;

    /* JADX INFO: renamed from: n */
    public final q9u0 f203770n;

    /* JADX INFO: renamed from: o */
    public final x5u0 f203771o;

    /* JADX INFO: renamed from: p */
    public final wxt0 f203772p;

    /* JADX INFO: renamed from: q */
    public final boolean f203773q;

    /* JADX INFO: renamed from: r */
    public final c2t0 f203774r;

    /* JADX INFO: renamed from: s */
    public boolean f203775s;

    public zmt0(dqt0 dqt0Var, Context context, @Nullable q9t0 q9t0Var, int i, omt0 omt0Var, q9u0 q9u0Var, x5u0 x5u0Var, wxt0 wxt0Var, c2t0 c2t0Var) {
        super(dqt0Var);
        this.f203775s = false;
        this.f203766j = q9t0Var;
        this.f203768l = context;
        this.f203767k = i;
        this.f203769m = omt0Var;
        this.f203770n = q9u0Var;
        this.f203771o = x5u0Var;
        this.f203772p = wxt0Var;
        this.f203773q = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132292k5)).booleanValue();
        this.f203774r = c2t0Var;
    }

    @Override // p149l.eqt0
    /* JADX INFO: renamed from: b */
    public final void mo106177b() {
        super.mo106177b();
        q9t0 q9t0Var = this.f203766j;
        if (q9t0Var != null) {
            q9t0Var.destroy();
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m219374i() {
        return this.f203767k;
    }

    /* JADX INFO: renamed from: j */
    public final void m219375j(h1s0 h1s0Var) {
        q9t0 q9t0Var = this.f203766j;
        if (q9t0Var != null) {
            q9t0Var.mo13696l0(h1s0Var);
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
    public final void m219376k(Activity activity, u1s0 u1s0Var, boolean z) throws RemoteException {
        q9t0 q9t0Var;
        kxv0 kxv0VarMo13679c;
        Context context = activity;
        if (activity == null) {
            context = this.f203768l;
        }
        if (this.f203773q) {
            this.f203771o.zzb();
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131857B0)).booleanValue()) {
            vny0.m199080r();
            if (C2075b.m12313f(context)) {
                x2t0.m206869g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f203772p.zzb();
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131869C0)).booleanValue()) {
                    new e9w0(context.getApplicationContext(), vny0.m199084v().m185773b()).m115399a(this.f92844a.f183478b.f178773b.f141055b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132311lb)).booleanValue() && (q9t0Var = this.f203766j) != null && (kxv0VarMo13679c = q9t0Var.mo13679c()) != null && kxv0VarMo13679c.f125218r0 && kxv0VarMo13679c.f125220s0 != this.f203774r.m104921b()) {
            x2t0.m206869g("The app open consent form has been shown.");
            this.f203772p.mo161953i(pzv0.m172256d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f203775s) {
            x2t0.m206869g("App open interstitial ad is already visible.");
            this.f203772p.mo161953i(pzv0.m172256d(10, null, null));
        }
        if (this.f203775s) {
            return;
        }
        try {
            this.f203770n.mo100276a(z, context, this.f203772p);
            if (this.f203773q) {
                this.f203771o.zza();
            }
            this.f203775s = true;
        } catch (zzdkv e) {
            this.f203772p.mo161952Z(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m219377l(long j, int i) {
        this.f203769m.m165152a(j, i);
    }
}
