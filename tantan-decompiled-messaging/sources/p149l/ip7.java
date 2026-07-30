package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ip7 extends ax6 {
    public ip7(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ C22306c m137461e3(String str, final String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (Exception unused) {
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        return new la20(new v9j() { // from class: l.ep7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/ai-pictures/" + str2 + "/messages")).m185893l(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.fp7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).aiPictureAuth.status;
            }
        }).doOnNext(new e30() { // from class: l.gp7
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220371D("e_profile_pic_state", "", j760.m140076a("moment_user_id", str2), j760.m140076a("is_authorized", TextUtils.equals((String) obj, "true") ? "1" : "0"));
            }
        }).doOnError(new e30() { // from class: l.hp7
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220371D("e_profile_pic_state", "", j760.m140076a("moment_user_id", str2), j760.m140076a("is_authorized", "0"));
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: h3 */
    public void m137464h3(final boolean z, final String str) {
        scheduled("request_reject_ai_request" + str + z, 0, new v9j() { // from class: l.bp7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f76607a.m137466j3(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m137465i3(boolean z, String str, roj0 roj0Var) {
        if (z) {
            lsi0.m151595y("操作成功，你可在【设置】的隐私和通知中设置关闭");
        } else {
            lsi0.m151595y("操作成功，你可在【设置】的隐私和通知中允许打开");
        }
        m137468l3(str, "replyTip");
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22306c m137466j3(final boolean z, final String str) {
        return m137467k3(z).doOnNext(new e30() { // from class: l.cp7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81905a.m137465i3(z, str, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public C22306c<roj0> m137467k3(boolean z) {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.aiPictureEnable = z ? "true" : "false";
        Settings settings = CoreModule.m29932K().me_().settings;
        if (settings == null) {
            return C22306c.just(roj0.f160388a);
        }
        return CoreModule.m29932K().patchSettings(settingGroups.subtract(settings.getSettingGroup()));
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<String> m137468l3(final String str, final String str2) {
        return scheduled("pre_send_avatar_" + str, -1, new v9j() { // from class: l.dp7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ip7.m137461e3(str2, str);
            }
        });
    }
}
