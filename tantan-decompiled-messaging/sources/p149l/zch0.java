package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class zch0 {

    /* JADX INFO: renamed from: d */
    public static volatile zch0 f202536d;

    /* JADX INFO: renamed from: a */
    public boolean f202537a = false;

    /* JADX INFO: renamed from: b */
    public boolean f202538b = false;

    /* JADX INFO: renamed from: c */
    public boolean f202539c = false;

    /* JADX INFO: renamed from: a */
    public static zch0 m218024a() {
        if (f202536d == null) {
            synchronized (zch0.class) {
                try {
                    if (f202536d == null) {
                        f202536d = new zch0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f202536d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m218025b() {
        return m218028e() || m218031h() || m218030g();
    }

    /* JADX INFO: renamed from: c */
    public boolean m218026c() {
        return m218028e() || m218031h();
    }

    /* JADX INFO: renamed from: d */
    public boolean m218027d() {
        return m218028e() || m218032i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m218028e() {
        return le7.m149484f() && this.f202537a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m218029f() {
        return m218028e() || m218031h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m218030g() {
        return this.f202539c && le7.m149484f();
    }

    /* JADX INFO: renamed from: h */
    public boolean m218031h() {
        CoreSuggested.UserInfo userInfoM31140r6 = CoreModule.f17545c.f19663m0.m31140r6();
        return NullChecker.m81303a(userInfoM31140r6) && userInfoM31140r6.isVirtualCard() && le7.m149484f();
    }

    /* JADX INFO: renamed from: i */
    public boolean m218032i() {
        CoreSuggested.UserInfo userInfoM31140r6 = CoreModule.f17545c.f19663m0.m31140r6();
        return NullChecker.m81303a(userInfoM31140r6) && userInfoM31140r6.isVirtualCard() && !userInfoM31140r6.isQuickChatPartyInvitationCard() && le7.m149484f();
    }

    /* JADX INFO: renamed from: j */
    public void m218033j(boolean z, String str) {
        if (le7.m149484f()) {
            du2.m113670a("[See_Toast]", "update pop window status_" + z + "_reason_" + str);
            this.f202537a = z;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m218034k(boolean z) {
        if (le7.m149484f()) {
            this.f202539c = z;
        }
    }
}
