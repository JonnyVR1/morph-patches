package com.tencent.could.component.common.p084ai.net;

import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public interface CallBackListener {
    void cleanListener();

    void onFailed(String str);

    void onSuccess(InputStream inputStream, boolean z);

    void onSuccess(String str);
}
