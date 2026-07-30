package com.tencent.could.huiyansdk.api;

import android.view.View;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;

/* JADX INFO: loaded from: classes12.dex */
public interface HuiYanAuthEventCallBack {
    void onAuthEvent(HuiYanAuthEvent huiYanAuthEvent);

    void onAuthTipsEvent(HuiYanAuthTipsEvent huiYanAuthTipsEvent);

    void onBeginTransition();

    void onEndTransition();

    void onMainViewCreate(View view);

    void onMainViewDestroy();
}
