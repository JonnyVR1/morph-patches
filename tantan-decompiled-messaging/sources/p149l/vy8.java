package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;

/* JADX INFO: loaded from: classes9.dex */
public class vy8 implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: c */
    public static boolean m200605c() {
        return CoreModule.f17545c.f19639e0.m169527p9().createdTime > 1.5727464E12d;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m200606d() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (CoreModule.f17545c.f19639e0.f149341c0.get().booleanValue() || !m200605c()) {
            return false;
        }
        return (TEnum.equals(userM169527p9.source, "wechat") || TEnum.equals(userM169527p9.source, "qq")) && m200617o();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m200607e() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("recall_message_top"));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m200608f() {
        return "a".equals(ABManager.m29350i0("boost_checkin"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m200609g() {
        return !IntlCountryCodeController.m28126v();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m200610h() {
        try {
            return RemoteConfig.m79298x().m79330s("nearbyBanner_reddot");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m200611i() {
        return "a".equals(ABManager.m29350i0("push_switch"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m200612j() {
        return "big".equals(ABManager.m29350i0("recall_guide"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m200613k() {
        return "covered".equals(ABManager.m29350i0("recall_guide"));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m200614l() {
        return "small".equals(ABManager.m29350i0("recall_guide"));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m200615m() {
        return "no_jump".equals(ABManager.m29350i0("force_face"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m200616n() {
        return "jump".equals(ABManager.m29350i0("force_face"));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m200617o() {
        Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
        if (settings != null) {
            return TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(settings.linkedPhoneNumber.number);
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public final void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public final void mo29394b() {
    }
}
