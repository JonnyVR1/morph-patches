package p006l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import l.vwb;
import l.w9j;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.gp */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0775gp implements ABManager.InterfaceC0104d {
    /* JADX INFO: renamed from: d */
    public static boolean m15897d() {
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.x().F("intl_google_signin_switch"));
            if (jSONObject.getBoolean("enable")) {
                return vwb.m(JSON.parseArray(jSONObject.getString("mcc"), Integer.class), new w9j() { // from class: l.fp
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() == qib0.f19808f0);
                    }
                });
            }
            return false;
        } catch (Exception e) {
            CrashHelper.d(e, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m15898e() {
        try {
            return RemoteConfig.x().F("signup_skip_ornot");
        } catch (Exception unused) {
            return "close";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15899f() {
        return "bind_num".equals(ABManager.m1254h0("signin_page")) || "two".equals(ABManager.m1254h0("signin_page"));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15900g() {
        return "skip_test2".equals(ABManager.m1242b0("register_complete"));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m15901h() {
        return TextUtils.equals("open", ABManager.m1242b0("signup_skip")) || TextUtils.equals("open", m15898e());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m15902i() {
        return "hide".equals(ABManager.m1254h0("signin_page")) || "two".equals(ABManager.m1254h0("signin_page"));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m15903j() {
        return "push".equals(ABManager.m1254h0("no_status_user")) || "sms_and_push".equals(ABManager.m1254h0("no_status_user")) || "sms".equals(ABManager.m1254h0("no_status_user"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15904k() {
        return "exp".equals(ABManager.m1254h0("prelogin_feedback_I_"));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m15905l() {
        try {
            return RemoteConfig.x().s("mmuid_sdk_v3_enable");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public void mo1299a() {
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public void mo1300b() {
    }
}
