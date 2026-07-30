package com.tencent.could.component.common.p084ai.net;

import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;

/* JADX INFO: loaded from: classes12.dex */
public class TXCHttp {
    public static void sendRequest(NetWorkParam netWorkParam, IJsonDataListener iJsonDataListener) {
        if (netWorkParam != null) {
            ThreadManager.getInstance().addTask(new HttpTask(new JsonCallBackListener(iJsonDataListener), netWorkParam));
        } else if (iJsonDataListener != null) {
            iJsonDataListener.onFailed("input param is null!");
        }
    }

    public static void stopCurrentRequest() {
        ThreadManager.getInstance().stopCurrentRequest();
    }
}
