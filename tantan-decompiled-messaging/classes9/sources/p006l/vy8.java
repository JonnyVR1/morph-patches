package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vy8 implements ABManager.InterfaceC0104d {
    /* JADX INFO: renamed from: c */
    public static boolean m26012c() {
        return CoreModule.f1534c.f3628e0.m21490p9().createdTime > 1.5727464E12d;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m26013d() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (((Boolean) CoreModule.f1534c.f3628e0.f18953c0.get()).booleanValue() || !m26012c()) {
            return false;
        }
        return (TEnum.equals(userM21490p9.source, "wechat") || TEnum.equals(userM21490p9.source, "qq")) && m26024o();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m26014e() {
        return "exp".equals(ABManager.m1256i0("recall_message_top"));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m26015f() {
        return "a".equals(ABManager.m1256i0("boost_checkin"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m26016g() {
        return !IntlCountryCodeController.m21v();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m26017h() {
        try {
            return RemoteConfig.x().s("nearbyBanner_reddot");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m26018i() {
        return "a".equals(ABManager.m1256i0("push_switch"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m26019j() {
        return "big".equals(ABManager.m1256i0("recall_guide"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m26020k() {
        return "covered".equals(ABManager.m1256i0("recall_guide"));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m26021l() {
        return "small".equals(ABManager.m1256i0("recall_guide"));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m26022m() {
        return "no_jump".equals(ABManager.m1256i0("force_face"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m26023n() {
        return "jump".equals(ABManager.m1256i0("force_face"));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m26024o() {
        Settings settings = CoreModule.f1534c.f3628e0.m21490p9().settings;
        if (settings != null) {
            return TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(settings.linkedPhoneNumber.number);
        }
        return true;
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public final void mo1299a() {
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public final void mo1300b() {
    }
}
