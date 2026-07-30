package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class d09 implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: c */
    public static boolean m113366c() {
        return CoreModule.f18264c.f20381e0.m116600p9().createdTime > 1.5727464E12d;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m113367d() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (CoreModule.f18264c.f20381e0.f89198c0.get().booleanValue() || !m113366c()) {
            return false;
        }
        return (TEnum.equals(userM116600p9.source, "wechat") || TEnum.equals(userM116600p9.source, "qq")) && m113378o();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m113368e() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30348i0("recall_message_top"));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m113369f() {
        return "a".equals(ABManager.m30348i0("boost_checkin"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m113370g() {
        return !IntlCountryCodeController.m29125v();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m113371h() {
        try {
            return RemoteConfig.m80481x().m80513s("nearbyBanner_reddot");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m113372i() {
        return "a".equals(ABManager.m30348i0("push_switch"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m113373j() {
        return "big".equals(ABManager.m30348i0("recall_guide"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m113374k() {
        return "covered".equals(ABManager.m30348i0("recall_guide"));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m113375l() {
        return "small".equals(ABManager.m30348i0("recall_guide"));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m113376m() {
        return "no_jump".equals(ABManager.m30348i0("force_face"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m113377n() {
        return "jump".equals(ABManager.m30348i0("force_face"));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m113378o() {
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        if (settings != null) {
            return TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(settings.linkedPhoneNumber.number);
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public final void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public final void mo30392b() {
    }
}
