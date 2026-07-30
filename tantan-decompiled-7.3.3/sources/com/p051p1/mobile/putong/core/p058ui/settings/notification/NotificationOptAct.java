package com.p051p1.mobile.putong.core.p058ui.settings.notification;

import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.NotificationSetting;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.l050;
import p153l.x150;

/* JADX INFO: loaded from: classes12.dex */
public class NotificationOptAct extends PutongMvpAct<l050, x150> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public l050 mo29671X1() {
        return new l050(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public x150 mo29672Y1() {
        return new x150();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Settings settings = userM116600p9.settings;
        NotificationSetting notificationSettingNew_ = (settings == null || settings.getSettingGroup().noPush == null) ? NotificationSetting.new_() : userM116600p9.settings.getSettingGroup().noPush;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("push_settings_details", new JSONObject(notificationSettingNew_.toJson()));
            this.pageHelper.m152780o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_message_push_settings";
    }
}
