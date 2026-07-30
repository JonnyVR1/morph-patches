package com.tencent.could.component.common.p079ai.net;

import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;

/* JADX INFO: loaded from: classes2.dex */
public interface IHttpRequest {
    void cleanExecute();

    void execute();

    NetWorkParam getNetWorkParam();

    void setListener(CallBackListener callBackListener);

    void setNeedIpBackUrl(boolean z);

    void setNeedIpBackUrls(boolean z, int i);

    void setNeedUseDeputy(boolean z);

    void setNetWorkParam(NetWorkParam netWorkParam);
}
