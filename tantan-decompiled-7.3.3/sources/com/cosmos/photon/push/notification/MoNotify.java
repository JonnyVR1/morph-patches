package com.cosmos.photon.push.notification;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.thirdparty.NotificationWrapper;
import com.cosmos.photon.push.util.AppContext;
import com.immomo.push.p045pb.Notify;
import com.immomo.push.p045pb.NotifyInfo;
import com.immomo.push.p045pb.NotifyV2;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MoNotify implements Serializable {
    private static final String INTENT_ACTION_FCM_POSTFIX = "end";
    private static final String INTENT_ACTION_FCM_PREFIX = "#Intent";
    private static final String INTENT_ACTION_FCM_PUSHTYPE = "i.pushType=105";
    private static final long serialVersionUID = -6238600643821281332L;
    public String action;
    public int actionType;
    public boolean autoCancel;
    public int backgroundShow;
    public String channelId;
    public HashMap<String, String> data;
    public HashMap<String, String> dataMap;
    public String desc;
    public boolean fromFcm;
    public String icon;

    /* JADX INFO: renamed from: id */
    public String f5847id;
    public int light;
    public int logType;
    public int multi;
    public boolean popNotify;
    public long showExpire;
    public long showTime;
    public int sound;
    public String soundType;
    public long time;
    public String title;
    public String toPkg;
    public String type;
    public int vibrate;

    private static void assembleNotifyInfo(MoNotify moNotify, NotifyInfo notifyInfo) {
        moNotify.type = notifyInfo.getType();
        moNotify.title = notifyInfo.getTitle();
        moNotify.desc = notifyInfo.getDesc();
        moNotify.action = notifyInfo.getAction();
        moNotify.actionType = notifyInfo.getActionType();
        moNotify.icon = notifyInfo.getIcon();
        moNotify.sound = notifyInfo.getSound();
        moNotify.soundType = notifyInfo.getSoundType();
        moNotify.vibrate = notifyInfo.getVibrate();
        moNotify.light = notifyInfo.getLight();
        moNotify.backgroundShow = notifyInfo.getBackgroundShow();
        moNotify.data = notifyInfo.getDataMap() == null ? null : new HashMap<>(notifyInfo.getDataMap());
        moNotify.showTime = notifyInfo.getShowTime();
        moNotify.showExpire = notifyInfo.getShowExpire();
        moNotify.popNotify = notifyInfo.getPopNotify();
        moNotify.autoCancel = notifyInfo.getAutoCancel();
        HashMap<String, String> map = moNotify.data;
        if (map != null) {
            String str = map.get("ext_d");
            if (!TextUtils.isEmpty(str)) {
                try {
                    moNotify.channelId = new JSONObject(str).optString("ci");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            try {
                moNotify.logType = Integer.parseInt(moNotify.data.get("ins_log"));
            } catch (NumberFormatException unused) {
            }
            try {
                moNotify.multi = Integer.parseInt(moNotify.data.get("multi"));
            } catch (NumberFormatException unused2) {
            }
        }
    }

    public static MoNotify create(NotificationWrapper notificationWrapper) {
        String str;
        MoNotify moNotify = new MoNotify();
        moNotify.title = notificationWrapper.title;
        moNotify.desc = notificationWrapper.body;
        Uri uri = notificationWrapper.imageUrl;
        if (uri != null) {
            moNotify.icon = uri.toString();
        }
        moNotify.channelId = notificationWrapper.channelId;
        String str2 = notificationWrapper.clickAction;
        if (str2 == null) {
            moNotify.actionType = 1;
            str = null;
        } else {
            moNotify.actionType = 2;
            str = String.format("action=%s", str2);
        }
        moNotify.fromFcm = true;
        moNotify.type = notificationWrapper.tag;
        String strHandleAction = handleAction(moNotify.action, INTENT_ACTION_FCM_PUSHTYPE);
        moNotify.action = strHandleAction;
        moNotify.action = handleAction(strHandleAction, str);
        if (!TextUtils.isEmpty(notificationWrapper.sound)) {
            moNotify.sound = 1;
            moNotify.soundType = notificationWrapper.sound;
        }
        Map<String, String> map = notificationWrapper.dataMap;
        if (map != null) {
            moNotify.dataMap = (HashMap) map;
            moNotify.data = getMapForJson(map.get("_ext"));
            moNotify.action = handleAction(moNotify.action, String.format("S._ext=%s", notificationWrapper.dataMap.get("_ext")));
            HashMap<String, String> map2 = moNotify.data;
            if (map2 != null) {
                try {
                    notificationWrapper.insLog = Integer.valueOf(map2.get("ins_log")).intValue();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            moNotify.logType = notificationWrapper.insLog;
            try {
                moNotify.backgroundShow = Integer.valueOf(notificationWrapper.dataMap.get("showOnlyBackStage")).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        moNotify.autoCancel = true;
        if (TextUtils.isEmpty(moNotify.toPkg)) {
            moNotify.toPkg = AppContext.getPackageName();
        }
        if (moNotify.time == 0) {
            moNotify.time = System.currentTimeMillis();
        }
        return moNotify;
    }

    public static MoNotify fromJson(String str) {
        try {
            MoNotify moNotify = new MoNotify();
            JSONObject jSONObject = new JSONObject(str);
            moNotify.f5847id = jSONObject.optString("id");
            moNotify.toPkg = jSONObject.optString("tpg");
            moNotify.type = jSONObject.optString("type");
            moNotify.title = jSONObject.optString("title");
            moNotify.desc = jSONObject.optString(SocialConstants.PARAM_APP_DESC);
            moNotify.action = jSONObject.optString("action");
            moNotify.actionType = jSONObject.optInt("at");
            moNotify.icon = jSONObject.optString("icon");
            moNotify.sound = jSONObject.optInt("sound");
            moNotify.soundType = jSONObject.optString("st");
            moNotify.backgroundShow = jSONObject.optInt("bs");
            moNotify.vibrate = jSONObject.optInt("vibrate");
            moNotify.light = jSONObject.optInt(OMSFontStyle.light);
            moNotify.time = jSONObject.optLong("time");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.INAPP_DATA_TAG);
            HashMap<String, String> map = new HashMap<>();
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObjectOptJSONObject.optString(next));
                }
            }
            moNotify.data = map;
            moNotify.showTime = jSONObject.optLong("showTime", 0L);
            moNotify.showExpire = jSONObject.optLong("showExpire", 0L);
            moNotify.popNotify = jSONObject.optBoolean("popNotify", false);
            moNotify.autoCancel = jSONObject.optBoolean("autoCancel", true);
            HashMap<String, String> map2 = moNotify.data;
            if (map2 == null || map2.isEmpty()) {
                try {
                    String stringExtra = Intent.parseUri(moNotify.action, 0).getStringExtra("_ext");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        JSONObject jSONObject2 = new JSONObject(stringExtra);
                        if (moNotify.data == null) {
                            moNotify.data = new HashMap<>();
                        }
                        Iterator<String> itKeys2 = jSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            moNotify.data.put(next2, jSONObject2.optString(next2));
                        }
                    }
                } catch (Exception e) {
                    MDLog.printErrStackTrace("MOMOIM_PUSH", e);
                }
            }
            HashMap<String, String> map3 = moNotify.data;
            if (map3 != null) {
                String str2 = map3.get("ext_d");
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        moNotify.channelId = new JSONObject(str2).optString("ci");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                try {
                    moNotify.logType = Integer.parseInt(moNotify.data.get("ins_log"));
                } catch (NumberFormatException unused) {
                }
                try {
                    moNotify.multi = Integer.parseInt(moNotify.data.get("multi"));
                } catch (NumberFormatException unused2) {
                }
            }
            return moNotify;
        } catch (JSONException unused3) {
            return null;
        }
    }

    public static HashMap<String, String> getMapForJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            HashMap<String, String> map = new HashMap<>();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, String.valueOf(jSONObject.get(next)));
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String handleAction(String str, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return str;
        }
        String strReplace = TextUtils.isEmpty(str) ? "" : str.replace(String.format(";%s", "end"), "").replace(String.format("%s;", INTENT_ACTION_FCM_PREFIX), "");
        StringBuilder sb = new StringBuilder("#Intent;");
        if (!TextUtils.isEmpty(strReplace)) {
            sb.append(strReplace);
            sb.append(com.meituan.robust.Constants.PACKNAME_END);
        }
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
                sb.append(com.meituan.robust.Constants.PACKNAME_END);
            }
        }
        sb.append("end");
        return sb.toString();
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f5847id);
            jSONObject.put("tpg", this.toPkg);
            jSONObject.put("type", this.type);
            jSONObject.put("title", this.title);
            jSONObject.put(SocialConstants.PARAM_APP_DESC, this.desc);
            jSONObject.put("action", this.action);
            jSONObject.put("at", this.actionType);
            jSONObject.put("icon", this.icon);
            jSONObject.put("sound", this.sound);
            jSONObject.put("st", this.soundType);
            jSONObject.put("bs", this.backgroundShow);
            jSONObject.put("vibrate", this.vibrate);
            jSONObject.put(OMSFontStyle.light, this.light);
            jSONObject.put("time", this.time);
            if (this.data == null) {
                this.data = new HashMap<>();
            }
            try {
                if (!TextUtils.isEmpty(this.channelId)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("ci", this.channelId);
                    this.data.put("ext_d", "" + jSONObject2.toString());
                }
            } catch (JSONException unused) {
            }
            this.data.put("logType", "" + this.logType);
            this.data.put("multi", "" + this.multi);
            jSONObject.put(Constants.INAPP_DATA_TAG, new JSONObject(this.data));
            jSONObject.put("showTime", this.showTime);
            jSONObject.put("showExpire", this.showExpire);
            jSONObject.put("popNotify", this.popNotify);
            jSONObject.put("autoCancel", this.autoCancel);
        } catch (JSONException unused2) {
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "MoNotify{id='" + this.f5847id + "', toPkg='" + this.toPkg + "', type='" + this.type + "', title='" + this.title + "', desc='" + this.desc + "', action='" + this.action + "', actionType=" + this.actionType + ", icon='" + this.icon + "', sound=" + this.sound + ", soundType='" + this.soundType + "', vibrate=" + this.vibrate + ", light=" + this.light + '}';
    }

    public static MoNotify create(NotifyV2 notifyV2) {
        MoNotify moNotify = new MoNotify();
        moNotify.f5847id = notifyV2.getId();
        moNotify.toPkg = notifyV2.getToPkg();
        moNotify.time = notifyV2.getTime();
        assembleNotifyInfo(moNotify, notifyV2.getInfo());
        return moNotify;
    }

    public static MoNotify create(Notify notify) {
        MoNotify moNotify = new MoNotify();
        moNotify.f5847id = notify.getId();
        moNotify.toPkg = notify.getToPkg();
        moNotify.time = notify.getTime();
        assembleNotifyInfo(moNotify, notify.getInfo());
        return moNotify;
    }
}
