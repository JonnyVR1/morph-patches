package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.UserPrivacySettings;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import l.zvf0;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ip7 extends ax6 {
    public ip7(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ c m16790e3(String str, final String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (Exception unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return new la20(new v9j() { // from class: l.ep7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/ai-pictures/" + str2 + "/messages")).l(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.fp7
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).aiPictureAuth.status;
            }
        }).doOnNext(new e30() { // from class: l.gp7
            public final void call(Object obj) {
                zvf0.D("e_profile_pic_state", "", new j760[]{j760.a("moment_user_id", str2), j760.a("is_authorized", TextUtils.equals((String) obj, "true") ? "1" : "0")});
            }
        }).doOnError(new e30() { // from class: l.hp7
            public final void call(Object obj) {
                zvf0.D("e_profile_pic_state", "", new j760[]{j760.a("moment_user_id", str2), j760.a("is_authorized", "0")});
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: h3 */
    public void m16793h3(final boolean z, final String str) {
        scheduled("request_reject_ai_request" + str + z, 0, new v9j() { // from class: l.bp7
            public final Object call() {
                return this.f9021a.m16795j3(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m16794i3(boolean z, String str, roj0 roj0Var) {
        if (z) {
            lsi0.y("操作成功，你可在【设置】的隐私和通知中设置关闭");
        } else {
            lsi0.y("操作成功，你可在【设置】的隐私和通知中允许打开");
        }
        m16797l3(str, "replyTip");
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ c m16795j3(final boolean z, final String str) {
        return m16796k3(z).doOnNext(new e30() { // from class: l.cp7
            public final void call(Object obj) {
                this.f9774a.m16794i3(z, str, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public c<roj0> m16796k3(boolean z) {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.aiPictureEnable = z ? "true" : "false";
        Settings settings = CoreModule.m1851K().me_().settings;
        if (settings == null) {
            return c.just(roj0.a);
        }
        return CoreModule.m1851K().patchSettings(settingGroups.subtract(settings.getSettingGroup()));
    }

    /* JADX INFO: renamed from: l3 */
    public c<String> m16797l3(final String str, final String str2) {
        return scheduled("pre_send_avatar_" + str, -1, new v9j() { // from class: l.dp7
            public final Object call() {
                return ip7.m16790e3(str2, str);
            }
        });
    }
}
