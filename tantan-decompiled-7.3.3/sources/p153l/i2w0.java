package p153l;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class i2w0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lmv0 f112669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cew0 f112670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rdw0 f112671c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zxt0 f112672d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ j2w0 f112673e;

    public i2w0(j2w0 j2w0Var, lmv0 lmv0Var, cew0 cew0Var, rdw0 rdw0Var, zxt0 zxt0Var) {
        this.f112669a = lmv0Var;
        this.f112670b = cew0Var;
        this.f112671c = rdw0Var;
        this.f112672d = zxt0Var;
        this.f112673e = j2w0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        cew0 cew0Var;
        final zze zzeVarM218166a = this.f112672d.mo121817d().m218166a(th);
        synchronized (this.f112673e) {
            try {
                this.f112673e.f118127l = null;
                this.f112672d.mo121818e().mo103145u(zzeVarM218166a);
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168223Z7)).booleanValue()) {
                    this.f112673e.f118117b.execute(new Runnable() { // from class: l.g2w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f101898a.f112673e.f118119d.mo103145u(zzeVarM218166a);
                        }
                    });
                }
                j2w0 j2w0Var = this.f112673e;
                j2w0Var.f118123h.m180659w0(j2w0Var.f118125j.m153693a());
                q8w0.m175828b(zzeVarM218166a.zza, th, "BannerAdLoader.onFailure");
                this.f112669a.zza();
                if (!((Boolean) ris0.f163391c.m149974e()).booleanValue() || (cew0Var = this.f112670b) == null) {
                    hew0 hew0Var = this.f112673e.f118124i;
                    rdw0 rdw0Var = this.f112671c;
                    rdw0Var.mo162914i(zzeVarM218166a);
                    rdw0Var.mo162912b(th);
                    rdw0Var.mo162910S(false);
                    hew0Var.m134677b(rdw0Var.zzl());
                } else {
                    cew0Var.m109463c(zzeVarM218166a);
                    rdw0 rdw0Var2 = this.f112671c;
                    rdw0Var2.mo162912b(th);
                    rdw0Var2.mo162910S(false);
                    cew0Var.m109461a(rdw0Var2);
                    cew0Var.m109467g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        cew0 cew0Var;
        uwt0 uwt0Var = (uwt0) obj;
        synchronized (this.f112673e) {
            try {
                this.f112673e.f118127l = null;
                this.f112673e.f118121f.removeAllViews();
                if (uwt0Var.mo152134j() != null) {
                    ViewParent parent = uwt0Var.mo152134j().getParent();
                    if (parent instanceof ViewGroup) {
                        dct0.m115298g("Banner view provided from " + (uwt0Var.m152228d() != null ? uwt0Var.m152228d().zzg() : "") + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(uwt0Var.mo152134j());
                    }
                }
                dgs0 dgs0Var = sgs0.f168223Z7;
                if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
                    ubu0 ubu0VarM152230f = uwt0Var.m152230f();
                    ubu0VarM152230f.m195334a(this.f112673e.f118119d);
                    ubu0VarM152230f.m195336c(this.f112673e.f118120e);
                }
                this.f112673e.f118121f.addView(uwt0Var.mo152134j());
                this.f112669a.zzb(uwt0Var);
                if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
                    j2w0 j2w0Var = this.f112673e;
                    Executor executor = j2w0Var.f118117b;
                    final wlv0 wlv0Var = j2w0Var.f118119d;
                    Objects.requireNonNull(wlv0Var);
                    executor.execute(new Runnable() { // from class: l.h2w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            wlv0Var.zzr();
                        }
                    });
                }
                this.f112673e.f118123h.m180659w0(uwt0Var.mo152133i());
                if (!((Boolean) ris0.f163391c.m149974e()).booleanValue() || (cew0Var = this.f112670b) == null) {
                    hew0 hew0Var = this.f112673e.f118124i;
                    rdw0 rdw0Var = this.f112671c;
                    rdw0Var.mo162911a(uwt0Var.m152232h().f75343b);
                    rdw0Var.mo162915z(uwt0Var.m152228d().zzg());
                    rdw0Var.mo162910S(true);
                    hew0Var.m134677b(rdw0Var.zzl());
                } else {
                    cew0Var.m109466f(uwt0Var.m152232h().f75343b);
                    cew0Var.m109465e(uwt0Var.m152228d().zzg());
                    rdw0 rdw0Var2 = this.f112671c;
                    rdw0Var2.mo162910S(true);
                    cew0Var.m109461a(rdw0Var2);
                    cew0Var.m109467g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
