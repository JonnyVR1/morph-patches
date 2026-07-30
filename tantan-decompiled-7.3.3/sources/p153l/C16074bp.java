package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.bp */
/* JADX INFO: loaded from: classes9.dex */
public class C16074bp implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: d */
    public static boolean m105749d() {
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.m80481x().m80485F("intl_google_signin_switch"));
            if (jSONObject.getBoolean("enable")) {
                return jyb.m147520m(JSON.parseArray(jSONObject.getString("mcc"), Integer.class), new qcj() { // from class: l.ap
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() == uqb0.f180400f0);
                    }
                });
            }
            return false;
        } catch (Exception e) {
            CrashHelper.m82480d(e, 1000);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m105750e() {
        try {
            return RemoteConfig.m80481x().m80485F("signup_skip_ornot");
        } catch (Exception unused) {
            return "close";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m105751f() {
        return "bind_num".equals(ABManager.m30346h0("signin_page")) || "two".equals(ABManager.m30346h0("signin_page"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m105752g() {
        return "skip_test2".equals(ABManager.m30334b0("register_complete"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m105753h() {
        return TextUtils.equals("open", ABManager.m30334b0("signup_skip")) || TextUtils.equals("open", m105750e());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m105754i() {
        return "hide".equals(ABManager.m30346h0("signin_page")) || "two".equals(ABManager.m30346h0("signin_page"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m105755j() {
        return "push".equals(ABManager.m30346h0("no_status_user")) || "sms_and_push".equals(ABManager.m30346h0("no_status_user")) || "sms".equals(ABManager.m30346h0("no_status_user"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m105756k() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m30346h0("prelogin_feedback_I_"));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m105757l() {
        try {
            return RemoteConfig.m80481x().m80513s("mmuid_sdk_v3_enable");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}
