package com.tencent.could.huiyansdk.overseas;

import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;

/* JADX INFO: loaded from: classes12.dex */
public interface HuiYanOsAuthCallBack {
    void onFail(int i, String str, String str2);

    void onSuccess(HuiYanOsAuthResult huiYanOsAuthResult);
}
