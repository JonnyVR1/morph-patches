package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.gp */
/* JADX INFO: loaded from: classes9.dex */
public class C17133gp implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: d */
    public static boolean m127313d() {
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.m79298x().m79302F("intl_google_signin_switch"));
            if (jSONObject.getBoolean("enable")) {
                return vwb.m200337m(JSON.parseArray(jSONObject.getString("mcc"), Integer.class), new w9j() { // from class: l.fp
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() == qib0.f154717f0);
                    }
                });
            }
            return false;
        } catch (Exception e) {
            CrashHelper.m81297d(e, 1000);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m127314e() {
        try {
            return RemoteConfig.m79298x().m79302F("signup_skip_ornot");
        } catch (Exception unused) {
            return "close";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m127315f() {
        return "bind_num".equals(ABManager.m29348h0("signin_page")) || "two".equals(ABManager.m29348h0("signin_page"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m127316g() {
        return "skip_test2".equals(ABManager.m29336b0("register_complete"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m127317h() {
        return TextUtils.equals("open", ABManager.m29336b0("signup_skip")) || TextUtils.equals("open", m127314e());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m127318i() {
        return "hide".equals(ABManager.m29348h0("signin_page")) || "two".equals(ABManager.m29348h0("signin_page"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m127319j() {
        return "push".equals(ABManager.m29348h0("no_status_user")) || "sms_and_push".equals(ABManager.m29348h0("no_status_user")) || "sms".equals(ABManager.m29348h0("no_status_user"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m127320k() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29348h0("prelogin_feedback_I_"));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m127321l() {
        try {
            return RemoteConfig.m79298x().m79330s("mmuid_sdk_v3_enable");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
    }
}
