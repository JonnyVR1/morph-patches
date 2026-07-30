package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdkv;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class eju0 extends eqt0 {

    /* JADX INFO: renamed from: j */
    public final Context f91783j;

    /* JADX INFO: renamed from: k */
    public final WeakReference f91784k;

    /* JADX INFO: renamed from: l */
    public final q9u0 f91785l;

    /* JADX INFO: renamed from: m */
    public final x5u0 f91786m;

    /* JADX INFO: renamed from: n */
    public final wxt0 f91787n;

    /* JADX INFO: renamed from: o */
    public final kzt0 f91788o;

    /* JADX INFO: renamed from: p */
    public final grt0 f91789p;

    /* JADX INFO: renamed from: q */
    public final cys0 f91790q;

    /* JADX INFO: renamed from: r */
    public final e9w0 f91791r;

    /* JADX INFO: renamed from: s */
    public final byv0 f91792s;

    /* JADX INFO: renamed from: t */
    public boolean f91793t;

    public eju0(dqt0 dqt0Var, Context context, @Nullable q9t0 q9t0Var, q9u0 q9u0Var, x5u0 x5u0Var, wxt0 wxt0Var, kzt0 kzt0Var, grt0 grt0Var, kxv0 kxv0Var, e9w0 e9w0Var, byv0 byv0Var) {
        super(dqt0Var);
        this.f91793t = false;
        this.f91783j = context;
        this.f91785l = q9u0Var;
        this.f91784k = new WeakReference(q9t0Var);
        this.f91786m = x5u0Var;
        this.f91787n = wxt0Var;
        this.f91788o = kzt0Var;
        this.f91789p = grt0Var;
        this.f91791r = e9w0Var;
        zzcag zzcagVar = kxv0Var.f125207m;
        this.f91790q = new dzs0(zzcagVar != null ? zzcagVar.zza : "", zzcagVar != null ? zzcagVar.zzb : 1);
        this.f91792s = byv0Var;
    }

    public final void finalize() throws Throwable {
        try {
            final q9t0 q9t0Var = (q9t0) this.f91784k.get();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131983L6)).booleanValue()) {
                if (!this.f91793t && q9t0Var != null) {
                    i3t0.f111376e.execute(new Runnable() { // from class: l.dju0
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
    public final Bundle m116901i() {
        return this.f91788o.m147953w0();
    }

    /* JADX INFO: renamed from: j */
    public final cys0 m116902j() {
        return this.f91790q;
    }

    /* JADX INFO: renamed from: k */
    public final byv0 m116903k() {
        return this.f91792s;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m116904l() {
        return this.f91789p.m127774a();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m116905m() {
        return this.f91793t;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m116906n() {
        q9t0 q9t0Var = (q9t0) this.f91784k.get();
        return (q9t0Var == null || q9t0Var.mo13680c0()) ? false : true;
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
    public final boolean m116907o(boolean z, @Nullable Activity activity) {
        Context context;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131857B0)).booleanValue()) {
            vny0.m199080r();
            if (C2075b.m12313f(this.f91783j)) {
                x2t0.m206869g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f91787n.zzb();
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131869C0)).booleanValue()) {
                    this.f91791r.m115399a(this.f92844a.f183478b.f178773b.f141055b);
                }
                return false;
            }
        }
        if (this.f91793t) {
            x2t0.m206869g("The rewarded ad have been showed.");
            this.f91787n.mo161953i(pzv0.m172256d(10, null, null));
            return false;
        }
        this.f91793t = true;
        this.f91786m.zzb();
        if (activity == null) {
            context = activity;
            context = this.f91783j;
        }
        try {
            context = activity;
            this.f91785l.mo100276a(z, context, this.f91787n);
            this.f91786m.zza();
            return true;
        } catch (zzdkv e) {
            this.f91787n.mo161952Z(e);
            return false;
        }
    }
}
