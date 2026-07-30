package com.p046p1.mobile.putong.core.p053ui.settings.notification;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.NotificationSetting;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.it40;
import p149l.wr40;

/* JADX INFO: loaded from: classes9.dex */
public class NotificationOptAct extends PutongMvpAct<wr40, it40> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public wr40 mo28672V1() {
        return new wr40(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public it40 mo28673X1() {
        return new it40();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Settings settings = userM169527p9.settings;
        NotificationSetting notificationSettingNew_ = (settings == null || settings.getSettingGroup().noPush == null) ? NotificationSetting.new_() : userM169527p9.settings.getSettingGroup().noPush;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("push_settings_details", new JSONObject(notificationSettingNew_.toJson()));
            this.pageHelper.m109039o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_message_push_settings";
    }
}
