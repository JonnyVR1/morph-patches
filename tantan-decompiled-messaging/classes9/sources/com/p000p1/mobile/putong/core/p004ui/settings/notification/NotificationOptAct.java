package com.p000p1.mobile.putong.core.p004ui.settings.notification;

import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.NotificationSetting;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.it40;
import p006l.wr40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NotificationOptAct extends PutongMvpAct<wr40, it40> {
    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public wr40 mo571V1() {
        return new wr40(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public it40 mo572X1() {
        return new it40();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        Settings settings = userM21490p9.settings;
        NotificationSetting notificationSettingNew_ = (settings == null || settings.getSettingGroup().noPush == null) ? NotificationSetting.new_() : userM21490p9.settings.getSettingGroup().noPush;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("push_settings_details", new JSONObject(notificationSettingNew_.toJson()));
            this.pageHelper.o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_message_push_settings";
    }
}
