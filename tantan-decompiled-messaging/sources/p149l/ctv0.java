package p149l;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class ctv0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fdv0 f82503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w4w0 f82504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l4w0 f82505c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tot0 f82506d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dtv0 f82507e;

    public ctv0(dtv0 dtv0Var, fdv0 fdv0Var, w4w0 w4w0Var, l4w0 l4w0Var, tot0 tot0Var) {
        this.f82503a = fdv0Var;
        this.f82504b = w4w0Var;
        this.f82505c = l4w0Var;
        this.f82506d = tot0Var;
        this.f82507e = dtv0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        w4w0 w4w0Var;
        final zze zzeVarM190437a = this.f82506d.mo189931d().m190437a(th);
        synchronized (this.f82507e) {
            try {
                this.f82507e.f87908l = null;
                this.f82506d.mo189932e().mo97693u(zzeVarM190437a);
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132152Z7)).booleanValue()) {
                    this.f82507e.f87898b.execute(new Runnable() { // from class: l.atv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f71685a.f82507e.f87900d.mo97693u(zzeVarM190437a);
                        }
                    });
                }
                dtv0 dtv0Var = this.f82507e;
                dtv0Var.f87904h.m148122w0(dtv0Var.f87906j.m119264a());
                kzv0.m147957b(zzeVarM190437a.zza, th, "BannerAdLoader.onFailure");
                this.f82503a.zza();
                if (!((Boolean) l9s0.f127142c.m115379e()).booleanValue() || (w4w0Var = this.f82504b) == null) {
                    b5w0 b5w0Var = this.f82507e.f87905i;
                    l4w0 l4w0Var = this.f82505c;
                    l4w0Var.mo129465i(zzeVarM190437a);
                    l4w0Var.mo129463b(th);
                    l4w0Var.mo129461S(false);
                    b5w0Var.m100344b(l4w0Var.zzl());
                } else {
                    w4w0Var.m201585c(zzeVarM190437a);
                    l4w0 l4w0Var2 = this.f82505c;
                    l4w0Var2.mo129463b(th);
                    l4w0Var2.mo129461S(false);
                    w4w0Var.m201583a(l4w0Var2);
                    w4w0Var.m201589g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        w4w0 w4w0Var;
        ont0 ont0Var = (ont0) obj;
        synchronized (this.f82507e) {
            try {
                this.f82507e.f87908l = null;
                this.f82507e.f87902f.removeAllViews();
                if (ont0Var.mo117678j() != null) {
                    ViewParent parent = ont0Var.mo117678j().getParent();
                    if (parent instanceof ViewGroup) {
                        x2t0.m206869g("Banner view provided from " + (ont0Var.m117798d() != null ? ont0Var.m117798d().zzg() : "") + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(ont0Var.mo117678j());
                    }
                }
                x6s0 x6s0Var = m7s0.f132152Z7;
                if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
                    o2u0 o2u0VarM117800f = ont0Var.m117800f();
                    o2u0VarM117800f.m162324a(this.f82507e.f87900d);
                    o2u0VarM117800f.m162326c(this.f82507e.f87901e);
                }
                this.f82507e.f87902f.addView(ont0Var.mo117678j());
                this.f82503a.zzb(ont0Var);
                if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
                    dtv0 dtv0Var = this.f82507e;
                    Executor executor = dtv0Var.f87898b;
                    final qcv0 qcv0Var = dtv0Var.f87900d;
                    Objects.requireNonNull(qcv0Var);
                    executor.execute(new Runnable() { // from class: l.btv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            qcv0Var.zzr();
                        }
                    });
                }
                this.f82507e.f87904h.m148122w0(ont0Var.mo117677i());
                if (!((Boolean) l9s0.f127142c.m115379e()).booleanValue() || (w4w0Var = this.f82504b) == null) {
                    b5w0 b5w0Var = this.f82507e.f87905i;
                    l4w0 l4w0Var = this.f82505c;
                    l4w0Var.mo129462a(ont0Var.m117802h().f183478b);
                    l4w0Var.mo129466z(ont0Var.m117798d().zzg());
                    l4w0Var.mo129461S(true);
                    b5w0Var.m100344b(l4w0Var.zzl());
                } else {
                    w4w0Var.m201588f(ont0Var.m117802h().f183478b);
                    w4w0Var.m201587e(ont0Var.m117798d().zzg());
                    l4w0 l4w0Var2 = this.f82505c;
                    l4w0Var2.mo129461S(true);
                    w4w0Var.m201583a(l4w0Var2);
                    w4w0Var.m201589g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
