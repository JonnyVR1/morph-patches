package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdkv;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ksu0 extends kzt0 {

    /* JADX INFO: renamed from: j */
    public final Context f128603j;

    /* JADX INFO: renamed from: k */
    public final WeakReference f128604k;

    /* JADX INFO: renamed from: l */
    public final wiu0 f128605l;

    /* JADX INFO: renamed from: m */
    public final dfu0 f128606m;

    /* JADX INFO: renamed from: n */
    public final c7u0 f128607n;

    /* JADX INFO: renamed from: o */
    public final q8u0 f128608o;

    /* JADX INFO: renamed from: p */
    public final m0u0 f128609p;

    /* JADX INFO: renamed from: q */
    public final i7t0 f128610q;

    /* JADX INFO: renamed from: r */
    public final kiw0 f128611r;

    /* JADX INFO: renamed from: s */
    public final h7w0 f128612s;

    /* JADX INFO: renamed from: t */
    public boolean f128613t;

    public ksu0(jzt0 jzt0Var, Context context, @Nullable wit0 wit0Var, wiu0 wiu0Var, dfu0 dfu0Var, c7u0 c7u0Var, q8u0 q8u0Var, m0u0 m0u0Var, q6w0 q6w0Var, kiw0 kiw0Var, h7w0 h7w0Var) {
        super(jzt0Var);
        this.f128613t = false;
        this.f128603j = context;
        this.f128605l = wiu0Var;
        this.f128604k = new WeakReference(wit0Var);
        this.f128606m = dfu0Var;
        this.f128607n = c7u0Var;
        this.f128608o = q8u0Var;
        this.f128609p = m0u0Var;
        this.f128611r = kiw0Var;
        zzcag zzcagVar = q6w0Var.f155897m;
        this.f128610q = new j8t0(zzcagVar != null ? zzcagVar.zza : "", zzcagVar != null ? zzcagVar.zzb : 1);
        this.f128612s = h7w0Var;
    }

    public final void finalize() throws Throwable {
        try {
            final wit0 wit0Var = (wit0) this.f128604k.get();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168054L6)).booleanValue()) {
                if (!this.f128613t && wit0Var != null) {
                    oct0.f146737e.execute(new Runnable() { // from class: l.jsu0
                        @Override // java.lang.Runnable
                        public final void run() {
                            wit0Var.destroy();
                        }
                    });
                }
            } else if (wit0Var != null) {
                wit0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: i */
    public final Bundle m151284i() {
        return this.f128608o.m175826w0();
    }

    /* JADX INFO: renamed from: j */
    public final i7t0 m151285j() {
        return this.f128610q;
    }

    /* JADX INFO: renamed from: k */
    public final h7w0 m151286k() {
        return this.f128612s;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m151287l() {
        return this.f128609p.m156542a();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m151288m() {
        return this.f128613t;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m151289n() {
        wit0 wit0Var = (wit0) this.f128604k.get();
        return (wit0Var == null || wit0Var.mo13734c0()) ? false : true;
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
    /* JADX INFO: renamed from: o */
    public final boolean m151290o(boolean z, @Nullable Activity activity) {
        Context context;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167928B0)).booleanValue()) {
            bxy0.m106934r();
            if (C2098b.m12367f(this.f128603j)) {
                dct0.m115298g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f128607n.zzb();
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167940C0)).booleanValue()) {
                    this.f128611r.m149983a(this.f129453a.f75343b.f68854b.f172368b);
                }
                return false;
            }
        }
        if (this.f128613t) {
            dct0.m115298g("The rewarded ad have been showed.");
            this.f128607n.mo102876i(v8w0.m200327d(10, null, null));
            return false;
        }
        this.f128613t = true;
        this.f128606m.zzb();
        if (activity == null) {
            context = activity;
            context = this.f128603j;
        }
        try {
            context = activity;
            this.f128605l.mo104077a(z, context, this.f128607n);
            this.f128606m.zza();
            return true;
        } catch (zzdkv e) {
            this.f128607n.mo102875Z(e);
            return false;
        }
    }
}
