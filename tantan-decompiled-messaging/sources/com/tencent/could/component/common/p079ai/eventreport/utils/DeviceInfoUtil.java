package com.tencent.could.component.common.p079ai.eventreport.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReporter;
import com.tencent.could.component.common.p079ai.eventreport.entry.DeviceInfoEntry;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfoUtil {
    public static String createDeviceInfo() {
        DeviceInfoEntry deviceInfoEntry = new DeviceInfoEntry();
        deviceInfoEntry.setSdkVersion(EventReporter.getInstance().getEventReportConfig().getSdkVersion());
        deviceInfoEntry.setDeviceModel(Base64.encodeToString(getDeviceModel().getBytes(), 2));
        deviceInfoEntry.setOsVersion("android-" + Base64.encodeToString(String.valueOf(Build.VERSION.SDK_INT).getBytes(), 2));
        Context context = EventReporter.getInstance().getContext();
        if (context == null) {
            try {
                return deviceInfoEntry.toJsonString();
            } catch (JSONException unused) {
                Log.e("DeviceInfoUtil", "changeDeviceInfoToJson json error");
                return "";
            }
        }
        deviceInfoEntry.setPackageName(context.getPackageName());
        deviceInfoEntry.setDeviceToken(getDeviceUuid(context));
        try {
            return deviceInfoEntry.toJsonString();
        } catch (JSONException unused2) {
            Log.e("DeviceInfoUtil", "changeDeviceInfoToJson json error");
            return "";
        }
    }

    public static String getDeviceModel() {
        String deviceModel = EventReporter.getInstance().getDeviceModel();
        if (!TextUtils.isEmpty(deviceModel)) {
            return deviceModel;
        }
        Context context = EventReporter.getInstance().getContext();
        String string = context == null ? EventReportConfig.STRING_INIT : context.getSharedPreferences("txy_comoon_share_data", 0).getString("txy_device_model", EventReportConfig.STRING_INIT);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String str = Build.MODEL;
        EventReporter.getInstance().setDeviceModel(str);
        Context context2 = EventReporter.getInstance().getContext();
        if (context2 == null) {
            return str;
        }
        context2.getSharedPreferences("txy_comoon_share_data", 0).edit().putString("txy_device_model", str).apply();
        return str;
    }

    public static String getDeviceUuid(Context context) {
        String str;
        String deviceId = EventReporter.getInstance().getDeviceId();
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        if (context == null) {
            str = EventReportConfig.STRING_INIT;
        } else {
            String string = context.getSharedPreferences("txy_comoon_share_data", 0).getString(Constants.DEVICE_ID_TAG, EventReportConfig.STRING_INIT);
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace("-", "");
                context.getSharedPreferences("txy_comoon_share_data", 0).edit().putString(Constants.DEVICE_ID_TAG, string).apply();
            }
            str = string;
            if (TextUtils.isEmpty(str)) {
                str = EventReportConfig.STRING_INIT;
            }
        }
        EventReporter.getInstance().setDeviceId(str);
        return str;
    }
}
