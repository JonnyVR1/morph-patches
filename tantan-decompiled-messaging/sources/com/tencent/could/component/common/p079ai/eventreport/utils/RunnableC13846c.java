package com.tencent.could.component.common.p079ai.eventreport.utils;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReporter;
import com.tencent.could.component.common.p079ai.eventreport.entry.ErrorInfo;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p079ai.net.HttpMethod;
import com.tencent.could.component.common.p079ai.net.TXCHttp;
import org.json.JSONException;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.eventreport.utils.c */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC13846c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f57254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f57256c;

    public RunnableC13846c(String str, String str2, String str3) {
        this.f57254a = str;
        this.f57255b = str2;
        this.f57256c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setAction(this.f57254a);
        errorInfo.setStack(this.f57255b);
        errorInfo.setToken(this.f57256c);
        errorInfo.setDeviceInfo(DeviceInfoUtil.createDeviceInfo());
        EventReportConfig eventReportConfig = EventReporter.getInstance().getEventReportConfig();
        errorInfo.setBusiness(eventReportConfig.getBusiness());
        errorInfo.setVersion(eventReportConfig.getSdkVersion());
        errorInfo.setOrigin(eventReportConfig.getOrigin());
        try {
            String jsonString = errorInfo.toJsonString();
            String errorInfoUrl = eventReportConfig.getErrorInfoUrl();
            if (TextUtils.isEmpty(errorInfoUrl)) {
                return;
            }
            TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(errorInfoUrl).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(jsonString).createNetWorkParam(), new C13847d());
        } catch (JSONException e) {
            Log.e("NetReportUtil", "doReportErrorInfo change error! e: " + e.getLocalizedMessage());
        }
    }
}
