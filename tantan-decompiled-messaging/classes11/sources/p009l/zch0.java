package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.tantanapp.common.utils.NullChecker;
import l.du2;
import l.le7;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zch0 {

    /* JADX INFO: renamed from: d */
    public static volatile zch0 f23561d;

    /* JADX INFO: renamed from: a */
    public boolean f23562a = false;

    /* JADX INFO: renamed from: b */
    public boolean f23563b = false;

    /* JADX INFO: renamed from: c */
    public boolean f23564c = false;

    /* JADX INFO: renamed from: a */
    public static zch0 m25654a() {
        if (f23561d == null) {
            synchronized (zch0.class) {
                try {
                    if (f23561d == null) {
                        f23561d = new zch0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23561d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m25655b() {
        return m25658e() || m25661h() || m25660g();
    }

    /* JADX INFO: renamed from: c */
    public boolean m25656c() {
        return m25658e() || m25661h();
    }

    /* JADX INFO: renamed from: d */
    public boolean m25657d() {
        return m25658e() || m25662i();
    }

    /* JADX INFO: renamed from: e */
    public boolean m25658e() {
        return le7.f() && this.f23562a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m25659f() {
        return m25658e() || m25661h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m25660g() {
        return this.f23564c && le7.f();
    }

    /* JADX INFO: renamed from: h */
    public boolean m25661h() {
        CoreSuggested.UserInfo userInfoR6 = CoreModule.c.m0.r6();
        return NullChecker.a(userInfoR6) && userInfoR6.isVirtualCard() && le7.f();
    }

    /* JADX INFO: renamed from: i */
    public boolean m25662i() {
        CoreSuggested.UserInfo userInfoR6 = CoreModule.c.m0.r6();
        return NullChecker.a(userInfoR6) && userInfoR6.isVirtualCard() && !userInfoR6.isQuickChatPartyInvitationCard() && le7.f();
    }

    /* JADX INFO: renamed from: j */
    public void m25663j(boolean z, String str) {
        if (le7.f()) {
            du2.a("[See_Toast]", "update pop window status_" + z + "_reason_" + str);
            this.f23562a = z;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m25664k(boolean z) {
        if (le7.f()) {
            this.f23564c = z;
        }
    }
}
