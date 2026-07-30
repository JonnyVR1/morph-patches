package com.heytap.mcssdk.mode;

import android.text.TextUtils;
import com.heytap.mcssdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class CommandMessage extends Message {
    public static final String APP_KEY = "appKey";
    public static final String APP_SECRET = "appSecret";
    public static final String CODE = "code";
    public static final int COMMANAD_NOTIFICATION_ALLOWANCE = 12313;
    public static final String COMMAND = "command";
    public static final int COMMAND_BASE = 12288;
    public static final int COMMAND_CLEAR_ALL_NOTIFICATION = 12305;
    public static final int COMMAND_CLEAR_NOTIFICATION = 12304;
    public static final int COMMAND_CLEAR_NOTIFICATION_TYPE = 12308;
    public static final int COMMAND_CLEAR_PKG_NOTIFICATION = 12311;
    public static final int COMMAND_GET_ACCOUNTS = 12302;
    public static final int COMMAND_GET_ALIAS = 12293;
    public static final int COMMAND_GET_NOTIFICATION_STATUS = 12309;
    public static final int COMMAND_GET_PUSH_STATUS = 12306;
    public static final int COMMAND_GET_TAGS = 12296;
    public static final int COMMAND_PAUSE_PUSH = 12299;
    public static final int COMMAND_REGISTER = 12289;
    public static final int COMMAND_RESUME_PUSH = 12300;
    public static final int COMMAND_SEND_INSTANT_ACK = 12312;
    public static final int COMMAND_SET_ACCOUNTS = 12301;
    public static final int COMMAND_SET_ALIAS = 12292;
    public static final int COMMAND_SET_NOTIFICATION_SETTINGS = 12310;
    public static final int COMMAND_SET_NOTIFICATION_TYPE = 12307;
    public static final int COMMAND_SET_PUSH_TIME = 12298;
    public static final int COMMAND_SET_TAGS = 12295;
    public static final int COMMAND_STATISTIC = 12291;
    public static final int COMMAND_UNREGISTER = 12290;
    public static final int COMMAND_UNSET_ACCOUNTS = 12303;
    public static final int COMMAND_UNSET_ALIAS = 12294;
    public static final int COMMAND_UNSET_TAGS = 12297;
    public static final String PARAMS = "params";
    public static final String REGISTER_ID = "registerID";
    public static final String SDK_VERSION = "sdkVersion";
    private static final String SPLITTER = "&";
    public static final String TYPE_ALIAS = "alias";
    public static final String TYPE_NULL = null;
    public static final String TYPE_TAGS = "tags";
    private String mAppKey;
    private String mAppSecret;
    private int mCommand;
    private String mContent;
    private String mParams;
    private String mRegisterID;
    private int mResponseCode = -2;
    private String mSdkVersion;

    public static List<String> parseToList(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(SPLITTER);
        if (strArrSplit.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static <T> String parseToString(List<T> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(SPLITTER);
        }
        return sb.toString();
    }

    public static List<SubscribeResult> parseToSubscribeResultList(String str, String str2, String str3, String str4) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(str2);
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    SubscribeResult subscribeResult = new SubscribeResult();
                    subscribeResult.setContent(jSONObject.getString(str4));
                    subscribeResult.setSubscribeId(jSONObject.getString(str3));
                    arrayList.add(subscribeResult);
                } catch (JSONException e) {
                    e = e;
                    arrayList2 = arrayList;
                    e.printStackTrace();
                    arrayList = arrayList2;
                }
            }
        } catch (JSONException e2) {
            e = e2;
        }
        LogUtil.m17465d("parseToSubscribeResultList--" + arrayList);
        return arrayList;
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getAppSecret() {
        return this.mAppSecret;
    }

    public int getCommand() {
        return this.mCommand;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getParams() {
        return this.mParams;
    }

    public String getRegisterID() {
        return this.mRegisterID;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    @Override // com.heytap.mcssdk.mode.Message
    public int getType() {
        return Message.MESSAGE_CMD_DATA;
    }

    public void setAppKey(String str) {
        this.mAppKey = str;
    }

    public void setAppSecret(String str) {
        this.mAppSecret = str;
    }

    public void setCommand(int i) {
        this.mCommand = i;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setParams(String str) {
        this.mParams = str;
    }

    public void setRegisterID(String str) {
        this.mRegisterID = str;
    }

    public void setResponseCode(int i) {
        this.mResponseCode = i;
    }

    public void setSdkVersion(String str) {
        this.mSdkVersion = str;
    }

    public String toString() {
        return "CommandMessage{, mRegisterID='" + this.mRegisterID + "', mSdkVersion='" + this.mSdkVersion + "', mCommand=" + this.mCommand + ", mContent='" + this.mContent + "', mResponseCode=" + this.mResponseCode + '}';
    }
}
