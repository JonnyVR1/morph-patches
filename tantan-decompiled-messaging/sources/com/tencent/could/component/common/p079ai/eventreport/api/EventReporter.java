package com.tencent.could.component.common.p079ai.eventreport.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p079ai.eventreport.utils.C13844a;
import com.tencent.could.component.common.p079ai.eventreport.utils.C13845b;
import com.tencent.could.component.common.p079ai.eventreport.utils.C13848e;
import com.tencent.could.component.common.p079ai.eventreport.utils.DeviceInfoUtil;
import com.tencent.could.component.common.p079ai.eventreport.utils.RunnableC13846c;
import com.tencent.could.component.common.p079ai.net.HttpMethod;
import com.tencent.could.component.common.p079ai.net.TXCHttp;
import com.tencent.could.component.common.p079ai.utils.ThreadPoolUtil;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class EventReporter {

    /* JADX INFO: renamed from: d */
    public static String f57249d = EventReportConfig.STRING_INIT;

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f57250a;

    /* JADX INFO: renamed from: b */
    public EventReportConfig f57251b;

    /* JADX INFO: renamed from: c */
    public String f57252c = EventReportConfig.STRING_INIT;

    public static final class EventReporterHolder {

        /* JADX INFO: renamed from: a */
        public static final EventReporter f57253a = new EventReporter();
    }

    public static EventReporter getInstance() {
        return EventReporterHolder.f57253a;
    }

    public void doReportDeviceInfo(String str, String str2) {
        String strM82198a = C13848e.m82198a(getInstance().getEventReportConfig().getDeviceInfoUrl(), str);
        String strCreateDeviceInfo = DeviceInfoUtil.createDeviceInfo();
        if (TextUtils.isEmpty(strM82198a)) {
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        String lowerCase = "";
        if (!TextUtils.isEmpty(strCreateDeviceInfo) && !TextUtils.isEmpty(str2)) {
            String strSubstring = str2.substring(1, Integer.parseInt(str2.substring(0, 1)) + 1);
            byte[] bytes = strCreateDeviceInfo.getBytes();
            byte[] bytes2 = strSubstring.getBytes();
            if (bytes == null) {
                bytes = bytes2;
            } else if (bytes2 != null) {
                byte[] bArr = new byte[bytes.length + bytes2.length];
                System.arraycopy(bytes, 0, bArr, 0, bytes.length);
                System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
                bytes = bArr;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                if (bArrDigest != null && bArrDigest.length > 0) {
                    for (byte b : bArrDigest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() < 2) {
                            sb.append(0);
                        }
                        sb.append(hexString);
                    }
                    lowerCase = sb.toString().toLowerCase();
                }
            } catch (NoSuchAlgorithmException e) {
                Log.e(CommonUtils.TAG, "md5 error: " + e.getLocalizedMessage());
            }
        }
        map.put("summary", lowerCase);
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(strM82198a).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(strCreateDeviceInfo).setRequestHeaders(map).createNetWorkParam(), new C13845b());
    }

    public void doReportErrorInfo(String str, String str2, String str3) {
        ThreadPoolUtil.getInstance().addWork(new RunnableC13846c(str, str2, str3));
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.f57250a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getDeviceId() {
        return this.f57252c;
    }

    public String getDeviceModel() {
        return f57249d;
    }

    public EventReportConfig getEventReportConfig() {
        EventReportConfig eventReportConfig = this.f57251b;
        return eventReportConfig == null ? EventReportConfig.builder().create() : eventReportConfig;
    }

    public void initEventReporter(Context context, EventReportConfig eventReportConfig) {
        this.f57250a = new WeakReference<>(context);
        this.f57251b = eventReportConfig;
    }

    public void setDeviceId(String str) {
        this.f57252c = str;
    }

    public void setDeviceModel(String str) {
        f57249d = str;
    }

    public void doReportDeviceInfo(String str) {
        String strM82198a = C13848e.m82198a(getInstance().getEventReportConfig().getDeviceInfoUrl(), str);
        String strCreateDeviceInfo = DeviceInfoUtil.createDeviceInfo();
        if (TextUtils.isEmpty(strM82198a)) {
            return;
        }
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(strM82198a).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(strCreateDeviceInfo).setRequestHeaders(null).createNetWorkParam(), new C13844a());
    }
}
