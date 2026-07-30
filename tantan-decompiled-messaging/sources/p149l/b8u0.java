package p149l;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzdkv;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class b8u0 extends eqt0 {

    /* JADX INFO: renamed from: j */
    public final Context f74163j;

    /* JADX INFO: renamed from: k */
    public final WeakReference f74164k;

    /* JADX INFO: renamed from: l */
    public final x5u0 f74165l;

    /* JADX INFO: renamed from: m */
    public final q9u0 f74166m;

    /* JADX INFO: renamed from: n */
    public final grt0 f74167n;

    /* JADX INFO: renamed from: o */
    public final e9w0 f74168o;

    /* JADX INFO: renamed from: p */
    public final wxt0 f74169p;

    /* JADX INFO: renamed from: q */
    public final c2t0 f74170q;

    /* JADX INFO: renamed from: r */
    public boolean f74171r;

    public b8u0(dqt0 dqt0Var, Context context, q9t0 q9t0Var, x5u0 x5u0Var, q9u0 q9u0Var, grt0 grt0Var, e9w0 e9w0Var, wxt0 wxt0Var, c2t0 c2t0Var) {
        super(dqt0Var);
        this.f74171r = false;
        this.f74163j = context;
        this.f74164k = new WeakReference(q9t0Var);
        this.f74165l = x5u0Var;
        this.f74166m = q9u0Var;
        this.f74167n = grt0Var;
        this.f74168o = e9w0Var;
        this.f74169p = wxt0Var;
        this.f74170q = c2t0Var;
    }

    public final void finalize() throws Throwable {
        try {
            final q9t0 q9t0Var = (q9t0) this.f74164k.get();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131983L6)).booleanValue()) {
                if (!this.f74171r && q9t0Var != null) {
                    i3t0.f111376e.execute(new Runnable() { // from class: l.a8u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            q9t0Var.destroy();
                        }
                    });
                }
            } else if (q9t0Var != null) {
                q9t0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m100792i() {
        return this.f74167n.m127774a();
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
    public final boolean m100793j(boolean z, Activity activity) {
        Context context;
        kxv0 kxv0VarMo13679c;
        this.f74165l.zzb();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131857B0)).booleanValue()) {
            vny0.m199080r();
            if (C2075b.m12313f(this.f74163j)) {
                x2t0.m206869g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f74169p.zzb();
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131869C0)).booleanValue()) {
                    this.f74168o.m115399a(this.f92844a.f183478b.f178773b.f141055b);
                }
            } else {
                q9t0 q9t0Var = (q9t0) this.f74164k.get();
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132311lb)).booleanValue() || q9t0Var == null || (kxv0VarMo13679c = q9t0Var.mo13679c()) == null || !kxv0VarMo13679c.f125218r0 || kxv0VarMo13679c.f125220s0 == this.f74170q.m104921b()) {
                    if (this.f74171r) {
                        x2t0.m206869g("The interstitial ad has been shown.");
                        this.f74169p.mo161953i(pzv0.m172256d(10, null, null));
                    }
                    context = activity;
                    if (!this.f74171r) {
                        if (activity == null) {
                            context = this.f74163j;
                        }
                        try {
                            this.f74166m.mo100276a(z, context, this.f74169p);
                            this.f74165l.zza();
                            this.f74171r = true;
                            return true;
                        } catch (zzdkv e) {
                            this.f74169p.mo161952Z(e);
                        }
                    }
                } else {
                    x2t0.m206869g("The interstitial consent form has been shown.");
                    this.f74169p.mo161953i(pzv0.m172256d(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            q9t0 q9t0Var2 = (q9t0) this.f74164k.get();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132311lb)).booleanValue()) {
                if (this.f74171r) {
                    x2t0.m206869g("The interstitial ad has been shown.");
                    this.f74169p.mo161953i(pzv0.m172256d(10, null, null));
                }
                context = activity;
                if (!this.f74171r) {
                    if (activity == null) {
                        context = this.f74163j;
                    }
                    this.f74166m.mo100276a(z, context, this.f74169p);
                    this.f74165l.zza();
                    this.f74171r = true;
                    return true;
                }
            } else {
                if (this.f74171r) {
                    x2t0.m206869g("The interstitial ad has been shown.");
                    this.f74169p.mo161953i(pzv0.m172256d(10, null, null));
                }
                context = activity;
                if (!this.f74171r) {
                    if (activity == null) {
                        context = this.f74163j;
                    }
                    this.f74166m.mo100276a(z, context, this.f74169p);
                    this.f74165l.zza();
                    this.f74171r = true;
                    return true;
                }
            }
        }
        return false;
    }
}
