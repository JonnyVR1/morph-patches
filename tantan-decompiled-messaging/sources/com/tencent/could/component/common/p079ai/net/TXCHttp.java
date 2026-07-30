package com.tencent.could.component.common.p079ai.net;

import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;

/* JADX INFO: loaded from: classes2.dex */
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
