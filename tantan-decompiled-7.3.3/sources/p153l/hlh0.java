package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class hlh0 {

    /* JADX INFO: renamed from: d */
    public static volatile hlh0 f110508d;

    /* JADX INFO: renamed from: a */
    public boolean f110509a = false;

    /* JADX INFO: renamed from: b */
    public boolean f110510b = false;

    /* JADX INFO: renamed from: c */
    public boolean f110511c = false;

    /* JADX INFO: renamed from: a */
    public static hlh0 m135741a() {
        if (f110508d == null) {
            synchronized (hlh0.class) {
                try {
                    if (f110508d == null) {
                        f110508d = new hlh0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f110508d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m135742b() {
        return m135745e() || m135748h() || m135747g();
    }

    /* JADX INFO: renamed from: c */
    public boolean m135743c() {
        return m135745e() || m135748h();
    }

    /* JADX INFO: renamed from: d */
    public boolean m135744d() {
        return m135745e() || m135749i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m135745e() {
        return pf7.m172091f() && this.f110509a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m135746f() {
        return m135745e() || m135748h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m135747g() {
        return this.f110511c && pf7.m172091f();
    }

    /* JADX INFO: renamed from: h */
    public boolean m135748h() {
        CoreSuggested.UserInfo userInfoM32143r6 = CoreModule.f18264c.f20405m0.m32143r6();
        return NullChecker.m82486a(userInfoM32143r6) && userInfoM32143r6.isVirtualCard() && pf7.m172091f();
    }

    /* JADX INFO: renamed from: i */
    public boolean m135749i() {
        CoreSuggested.UserInfo userInfoM32143r6 = CoreModule.f18264c.f20405m0.m32143r6();
        return NullChecker.m82486a(userInfoM32143r6) && userInfoM32143r6.isVirtualCard() && !userInfoM32143r6.isQuickChatPartyInvitationCard() && pf7.m172091f();
    }

    /* JADX INFO: renamed from: j */
    public void m135750j(boolean z, String str) {
        if (pf7.m172091f()) {
            tu2.m192703a("[See_Toast]", "update pop window status_" + z + "_reason_" + str);
            this.f110509a = z;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m135751k(boolean z) {
        if (pf7.m172091f()) {
            this.f110511c = z;
        }
    }
}
