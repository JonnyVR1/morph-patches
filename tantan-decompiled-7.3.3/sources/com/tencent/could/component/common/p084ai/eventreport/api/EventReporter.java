package com.tencent.could.component.common.p084ai.eventreport.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p084ai.eventreport.utils.C14007a;
import com.tencent.could.component.common.p084ai.eventreport.utils.C14008b;
import com.tencent.could.component.common.p084ai.eventreport.utils.C14011e;
import com.tencent.could.component.common.p084ai.eventreport.utils.DeviceInfoUtil;
import com.tencent.could.component.common.p084ai.eventreport.utils.RunnableC14009c;
import com.tencent.could.component.common.p084ai.net.HttpMethod;
import com.tencent.could.component.common.p084ai.net.TXCHttp;
import com.tencent.could.component.common.p084ai.utils.ThreadPoolUtil;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class EventReporter {

    /* JADX INFO: renamed from: d */
    public static String f58097d = EventReportConfig.STRING_INIT;

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f58098a;

    /* JADX INFO: renamed from: b */
    public EventReportConfig f58099b;

    /* JADX INFO: renamed from: c */
    public String f58100c = EventReportConfig.STRING_INIT;

    public static final class EventReporterHolder {

        /* JADX INFO: renamed from: a */
        public static final EventReporter f58101a = new EventReporter();
    }

    public static EventReporter getInstance() {
        return EventReporterHolder.f58101a;
    }

    public void doReportDeviceInfo(String str, String str2) {
        String strM83381a = C14011e.m83381a(getInstance().getEventReportConfig().getDeviceInfoUrl(), str);
        String strCreateDeviceInfo = DeviceInfoUtil.createDeviceInfo();
        if (TextUtils.isEmpty(strM83381a)) {
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
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(strM83381a).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(strCreateDeviceInfo).setRequestHeaders(map).createNetWorkParam(), new C14008b());
    }

    public void doReportErrorInfo(String str, String str2, String str3) {
        ThreadPoolUtil.getInstance().addWork(new RunnableC14009c(str, str2, str3));
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.f58098a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getDeviceId() {
        return this.f58100c;
    }

    public String getDeviceModel() {
        return f58097d;
    }

    public EventReportConfig getEventReportConfig() {
        EventReportConfig eventReportConfig = this.f58099b;
        return eventReportConfig == null ? EventReportConfig.builder().create() : eventReportConfig;
    }

    public void initEventReporter(Context context, EventReportConfig eventReportConfig) {
        this.f58098a = new WeakReference<>(context);
        this.f58099b = eventReportConfig;
    }

    public void setDeviceId(String str) {
        this.f58100c = str;
    }

    public void setDeviceModel(String str) {
        f58097d = str;
    }

    public void doReportDeviceInfo(String str) {
        String strM83381a = C14011e.m83381a(getInstance().getEventReportConfig().getDeviceInfoUrl(), str);
        String strCreateDeviceInfo = DeviceInfoUtil.createDeviceInfo();
        if (TextUtils.isEmpty(strM83381a)) {
            return;
        }
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(strM83381a).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(strCreateDeviceInfo).setRequestHeaders(null).createNetWorkParam(), new C14007a());
    }
}
