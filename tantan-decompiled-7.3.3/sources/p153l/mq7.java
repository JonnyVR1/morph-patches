package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class mq7 extends dy6 {
    public mq7(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ C22421c m159481e3(String str, final String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (Exception unused) {
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, jSONObject.toString());
        return new ti20(new pcj() { // from class: l.iq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/ai-pictures/" + str2 + "/messages")).m209038l(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.jq7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).aiPictureAuth.status;
            }
        }).doOnNext(new y20() { // from class: l.kq7
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138495D("e_profile_pic_state", "", pf60.m172085a("moment_user_id", str2), pf60.m172085a("is_authorized", TextUtils.equals((String) obj, "true") ? "1" : "0"));
            }
        }).doOnError(new y20() { // from class: l.lq7
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138495D("e_profile_pic_state", "", pf60.m172085a("moment_user_id", str2), pf60.m172085a("is_authorized", "0"));
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: h3 */
    public void m159484h3(final boolean z, final String str) {
        scheduled("request_reject_ai_request" + str + z, 0, new pcj() { // from class: l.fq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100254a.m159486j3(z, str);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m159485i3(boolean z, String str, uxj0 uxj0Var) {
        if (z) {
            o1j0.m165651y("操作成功，你可在【设置】的隐私和通知中设置关闭");
        } else {
            o1j0.m165651y("操作成功，你可在【设置】的隐私和通知中允许打开");
        }
        m159488l3(str, "replyTip");
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22421c m159486j3(final boolean z, final String str) {
        return m159487k3(z).doOnNext(new y20() { // from class: l.gq7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105662a.m159485i3(z, str, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public C22421c<uxj0> m159487k3(boolean z) {
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.aiPictureEnable = z ? "true" : "false";
        Settings settings = CoreModule.m30930K().me_().settings;
        if (settings == null) {
            return C22421c.just(uxj0.f181467a);
        }
        return CoreModule.m30930K().patchSettings(settingGroups.subtract(settings.getSettingGroup()));
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<String> m159488l3(final String str, final String str2) {
        return scheduled("pre_send_avatar_" + str, -1, new pcj() { // from class: l.hq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return mq7.m159481e3(str2, str);
            }
        });
    }
}
