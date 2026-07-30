package p149l;

import com.google.android.gms.ads.MobileAds;
import com.google.android.ump.ConsentInformation;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class r70 {

    /* JADX INFO: renamed from: b */
    public static r70 f158000b;

    /* JADX INFO: renamed from: a */
    public ConsentInformation f158001a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m178114b(Act act, final Runnable runnable) {
        try {
            MobileAds.m12222a(act, new ge50() { // from class: l.q70
                @Override // p149l.ge50
                /* JADX INFO: renamed from: a */
                public final void mo125679a(gsm gsmVar) {
                    r70.m178116d(runnable, gsmVar);
                }
            });
        } catch (Exception e) {
            CrashHelper.m81299f(e, "intl_admob_init", CrashHelper.ReportLevel.p5, 50);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m178116d(Runnable runnable, gsm gsmVar) {
        if (runnable != null) {
            e51.m114742G(runnable);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m178117e(ryi ryiVar) {
    }

    /* JADX INFO: renamed from: g */
    public static r70 m178118g() {
        if (f158000b == null) {
            f158000b = new r70();
        }
        return f158000b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m178119f() {
        ConsentInformation consentInformation = this.f158001a;
        if (consentInformation == null) {
            return false;
        }
        return consentInformation.mo15381b();
    }

    /* JADX INFO: renamed from: h */
    public void m178120h(final Act act, final Runnable runnable) {
        this.f158001a = m6k0.m153244a(act);
        this.f158001a.mo15380a(act, new rw5.C19803a().m181381a(), new ConsentInformation.InterfaceC2634b() { // from class: l.m70
            @Override // com.google.android.ump.ConsentInformation.InterfaceC2634b
            /* JADX INFO: renamed from: a */
            public final void mo15383a() {
                this.f131780a.m178122j(act, runnable);
            }
        }, new ConsentInformation.InterfaceC2633a() { // from class: l.n70
            @Override // com.google.android.ump.ConsentInformation.InterfaceC2633a
            /* JADX INFO: renamed from: a */
            public final void mo15382a(ryi ryiVar) {
                r70.m178117e(ryiVar);
            }
        });
        if (this.f158001a.mo15381b()) {
            m178123k(act, runnable);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m178121i(Act act, Runnable runnable, ryi ryiVar) {
        if (this.f158001a.mo15381b()) {
            m178123k(act, runnable);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m178122j(final Act act, final Runnable runnable) {
        m6k0.m153245b(act, new qw5.InterfaceC19595a() { // from class: l.o70
            @Override // p149l.qw5.InterfaceC19595a
            /* JADX INFO: renamed from: a */
            public final void mo162962a(ryi ryiVar) {
                this.f142444a.m178121i(act, runnable, ryiVar);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m178123k(final Act act, final Runnable runnable) {
        e51.m114774y(new Runnable() { // from class: l.p70
            @Override // java.lang.Runnable
            public final void run() {
                r70.m178114b(act, runnable);
            }
        });
    }
}
