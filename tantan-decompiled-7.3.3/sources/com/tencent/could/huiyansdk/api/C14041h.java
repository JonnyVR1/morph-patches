package com.tencent.could.huiyansdk.api;

import com.tencent.could.component.common.p084ai.callback.CrashListener;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.h */
/* JADX INFO: loaded from: classes12.dex */
public class C14041h implements CrashListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14043j f58188a;

    public C14041h(C14043j c14043j) {
        this.f58188a = c14043j;
    }

    @Override // com.tencent.could.component.common.p084ai.callback.CrashListener
    public void onCrash(String str) {
        InterfaceC14035b interfaceC14035b = this.f58188a.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onBuriedPointCallBack("CrashStage", "UncatchCrash", str);
        }
        InterfaceC14035b interfaceC14035b2 = this.f58188a.f58196g;
        if (interfaceC14035b2 != null) {
            interfaceC14035b2.updateOperateInfo("Crash", 1, 1L, str);
        }
    }
}
