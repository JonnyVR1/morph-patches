package com.tencent.could.huiyansdk.api;

import android.view.View;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.g */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC13877g {
    void onAuthEvent(HuiYanAuthEvent huiYanAuthEvent);

    void onAuthTipsEvent(HuiYanAuthTipsEvent huiYanAuthTipsEvent);

    void onBeginTransition();

    void onEndTransition();

    void onMainViewCreate(View view);

    void onMainViewDestroy();
}
