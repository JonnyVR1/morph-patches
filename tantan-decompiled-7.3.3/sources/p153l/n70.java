package p153l;

import com.google.android.gms.ads.MobileAds;
import com.google.android.ump.ConsentInformation;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class n70 {

    /* JADX INFO: renamed from: b */
    public static n70 f140567b;

    /* JADX INFO: renamed from: a */
    public ConsentInformation f140568a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m161852b(Act act, final Runnable runnable) {
        try {
            MobileAds.m12276a(act, new nm50() { // from class: l.m70
                @Override // p153l.nm50
                /* JADX INFO: renamed from: a */
                public final void mo157271a(ium iumVar) {
                    n70.m161854d(runnable, iumVar);
                }
            });
        } catch (Exception e) {
            CrashHelper.m82482f(e, "intl_admob_init", CrashHelper.ReportLevel.p5, 50);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m161854d(Runnable runnable, ium iumVar) {
        if (runnable != null) {
            l51.m152887G(runnable);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m161855e(m1j m1jVar) {
    }

    /* JADX INFO: renamed from: g */
    public static n70 m161856g() {
        if (f140567b == null) {
            f140567b = new n70();
        }
        return f140567b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m161857f() {
        ConsentInformation consentInformation = this.f140568a;
        if (consentInformation == null) {
            return false;
        }
        return consentInformation.mo15435b();
    }

    /* JADX INFO: renamed from: h */
    public void m161858h(final Act act, final Runnable runnable) {
        this.f140568a = sfk0.m185624a(act);
        this.f140568a.mo15434a(act, new wx5.C21196a().m208372a(), new ConsentInformation.InterfaceC2657b() { // from class: l.i70
            @Override // com.google.android.ump.ConsentInformation.InterfaceC2657b
            /* JADX INFO: renamed from: a */
            public final void mo15437a() {
                this.f113212a.m161860j(act, runnable);
            }
        }, new ConsentInformation.InterfaceC2656a() { // from class: l.j70
            @Override // com.google.android.ump.ConsentInformation.InterfaceC2656a
            /* JADX INFO: renamed from: a */
            public final void mo15436a(m1j m1jVar) {
                n70.m161855e(m1jVar);
            }
        });
        if (this.f140568a.mo15435b()) {
            m161861k(act, runnable);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m161859i(Act act, Runnable runnable, m1j m1jVar) {
        if (this.f140568a.mo15435b()) {
            m161861k(act, runnable);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m161860j(final Act act, final Runnable runnable) {
        sfk0.m185625b(act, new vx5.InterfaceC20951a() { // from class: l.k70
            @Override // p153l.vx5.InterfaceC20951a
            /* JADX INFO: renamed from: a */
            public final void mo148588a(m1j m1jVar) {
                this.f124229a.m161859i(act, runnable, m1jVar);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m161861k(final Act act, final Runnable runnable) {
        l51.m152919y(new Runnable() { // from class: l.l70
            @Override // java.lang.Runnable
            public final void run() {
                n70.m161852b(act, runnable);
            }
        });
    }
}
