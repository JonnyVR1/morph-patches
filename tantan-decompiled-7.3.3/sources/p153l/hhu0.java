package p153l;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzdkv;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class hhu0 extends kzt0 {

    /* JADX INFO: renamed from: j */
    public final Context f109927j;

    /* JADX INFO: renamed from: k */
    public final WeakReference f109928k;

    /* JADX INFO: renamed from: l */
    public final dfu0 f109929l;

    /* JADX INFO: renamed from: m */
    public final wiu0 f109930m;

    /* JADX INFO: renamed from: n */
    public final m0u0 f109931n;

    /* JADX INFO: renamed from: o */
    public final kiw0 f109932o;

    /* JADX INFO: renamed from: p */
    public final c7u0 f109933p;

    /* JADX INFO: renamed from: q */
    public final ibt0 f109934q;

    /* JADX INFO: renamed from: r */
    public boolean f109935r;

    public hhu0(jzt0 jzt0Var, Context context, wit0 wit0Var, dfu0 dfu0Var, wiu0 wiu0Var, m0u0 m0u0Var, kiw0 kiw0Var, c7u0 c7u0Var, ibt0 ibt0Var) {
        super(jzt0Var);
        this.f109935r = false;
        this.f109927j = context;
        this.f109928k = new WeakReference(wit0Var);
        this.f109929l = dfu0Var;
        this.f109930m = wiu0Var;
        this.f109931n = m0u0Var;
        this.f109932o = kiw0Var;
        this.f109933p = c7u0Var;
        this.f109934q = ibt0Var;
    }

    public final void finalize() throws Throwable {
        try {
            final wit0 wit0Var = (wit0) this.f109928k.get();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168054L6)).booleanValue()) {
                if (!this.f109935r && wit0Var != null) {
                    oct0.f146737e.execute(new Runnable() { // from class: l.ghu0
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
    public final boolean m135078i() {
        return this.f109931n.m156542a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
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
    /* JADX INFO: renamed from: j */
    public final boolean m135079j(boolean z, Activity activity) {
        Context context;
        q6w0 q6w0VarMo13733c;
        this.f109929l.zzb();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167928B0)).booleanValue()) {
            bxy0.m106934r();
            if (C2098b.m12367f(this.f109927j)) {
                dct0.m115298g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f109933p.zzb();
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167940C0)).booleanValue()) {
                    this.f109932o.m149983a(this.f129453a.f75343b.f68854b.f172368b);
                }
            } else {
                wit0 wit0Var = (wit0) this.f109928k.get();
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168382lb)).booleanValue() || wit0Var == null || (q6w0VarMo13733c = wit0Var.mo13733c()) == null || !q6w0VarMo13733c.f155908r0 || q6w0VarMo13733c.f155910s0 == this.f109934q.m139401b()) {
                    if (this.f109935r) {
                        dct0.m115298g("The interstitial ad has been shown.");
                        this.f109933p.mo102876i(v8w0.m200327d(10, null, null));
                    }
                    context = activity;
                    if (!this.f109935r) {
                        if (activity == null) {
                            context = this.f109927j;
                        }
                        try {
                            this.f109930m.mo104077a(z, context, this.f109933p);
                            this.f109929l.zza();
                            this.f109935r = true;
                            return true;
                        } catch (zzdkv e) {
                            this.f109933p.mo102875Z(e);
                        }
                    }
                } else {
                    dct0.m115298g("The interstitial consent form has been shown.");
                    this.f109933p.mo102876i(v8w0.m200327d(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            wit0 wit0Var2 = (wit0) this.f109928k.get();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168382lb)).booleanValue()) {
                if (this.f109935r) {
                    dct0.m115298g("The interstitial ad has been shown.");
                    this.f109933p.mo102876i(v8w0.m200327d(10, null, null));
                }
                context = activity;
                if (!this.f109935r) {
                    if (activity == null) {
                        context = this.f109927j;
                    }
                    this.f109930m.mo104077a(z, context, this.f109933p);
                    this.f109929l.zza();
                    this.f109935r = true;
                    return true;
                }
            } else {
                if (this.f109935r) {
                    dct0.m115298g("The interstitial ad has been shown.");
                    this.f109933p.mo102876i(v8w0.m200327d(10, null, null));
                }
                context = activity;
                if (!this.f109935r) {
                    if (activity == null) {
                        context = this.f109927j;
                    }
                    this.f109930m.mo104077a(z, context, this.f109933p);
                    this.f109929l.zza();
                    this.f109935r = true;
                    return true;
                }
            }
        }
        return false;
    }
}
