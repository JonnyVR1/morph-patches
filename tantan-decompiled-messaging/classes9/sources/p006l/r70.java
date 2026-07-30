package p006l;

import com.google.android.gms.ads.MobileAds;
import com.google.android.ump.ConsentInformation;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import l.e51;
import l.ge50;
import l.gsm;
import l.m6k0;
import l.qw5;
import l.rw5;
import l.ryi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r70 {

    /* JADX INFO: renamed from: b */
    public static r70 f20391b;

    /* JADX INFO: renamed from: a */
    public ConsentInformation f20392a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m22709b(Act act, final Runnable runnable) {
        try {
            MobileAds.a(act, new ge50() { // from class: l.q70
                /* JADX INFO: renamed from: a */
                public final void m21954a(gsm gsmVar) {
                    r70.m22711d(runnable, gsmVar);
                }
            });
        } catch (Exception e) {
            CrashHelper.f(e, "intl_admob_init", CrashHelper.ReportLevel.p5, 50);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22711d(Runnable runnable, gsm gsmVar) {
        if (runnable != null) {
            e51.G(runnable);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m22712e(ryi ryiVar) {
    }

    /* JADX INFO: renamed from: g */
    public static r70 m22713g() {
        if (f20391b == null) {
            f20391b = new r70();
        }
        return f20391b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22714f() {
        ConsentInformation consentInformation = this.f20392a;
        if (consentInformation == null) {
            return false;
        }
        return consentInformation.b();
    }

    /* JADX INFO: renamed from: h */
    public void m22715h(final Act act, final Runnable runnable) {
        this.f20392a = m6k0.a(act);
        this.f20392a.a(act, new rw5.a().a(), new ConsentInformation.b() { // from class: l.m70
            /* JADX INFO: renamed from: a */
            public final void m19125a() {
                this.f16818a.m22717j(act, runnable);
            }
        }, new ConsentInformation.a() { // from class: l.n70
            /* JADX INFO: renamed from: a */
            public final void m19702a(ryi ryiVar) {
                r70.m22712e(ryiVar);
            }
        });
        if (this.f20392a.b()) {
            m22718k(act, runnable);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m22716i(Act act, Runnable runnable, ryi ryiVar) {
        if (this.f20392a.b()) {
            m22718k(act, runnable);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m22717j(final Act act, final Runnable runnable) {
        m6k0.b(act, new qw5.a() { // from class: l.o70
            /* JADX INFO: renamed from: a */
            public final void m20382a(ryi ryiVar) {
                this.f18042a.m22716i(act, runnable, ryiVar);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m22718k(final Act act, final Runnable runnable) {
        e51.y(new Runnable() { // from class: l.p70
            @Override // java.lang.Runnable
            public final void run() {
                r70.m22709b(act, runnable);
            }
        });
    }
}
