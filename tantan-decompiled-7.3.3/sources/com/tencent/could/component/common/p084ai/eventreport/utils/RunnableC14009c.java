package com.tencent.could.component.common.p084ai.eventreport.utils;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.p084ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.p084ai.eventreport.api.EventReporter;
import com.tencent.could.component.common.p084ai.eventreport.entry.ErrorInfo;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p084ai.net.HttpMethod;
import com.tencent.could.component.common.p084ai.net.TXCHttp;
import org.json.JSONException;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.eventreport.utils.c */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC14009c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f58102a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f58103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f58104c;

    public RunnableC14009c(String str, String str2, String str3) {
        this.f58102a = str;
        this.f58103b = str2;
        this.f58104c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setAction(this.f58102a);
        errorInfo.setStack(this.f58103b);
        errorInfo.setToken(this.f58104c);
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
            TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(errorInfoUrl).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(jsonString).createNetWorkParam(), new C14010d());
        } catch (JSONException e) {
            Log.e("NetReportUtil", "doReportErrorInfo change error! e: " + e.getLocalizedMessage());
        }
    }
}
