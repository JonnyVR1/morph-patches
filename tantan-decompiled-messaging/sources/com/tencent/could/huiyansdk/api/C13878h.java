package com.tencent.could.huiyansdk.api;

import com.tencent.could.component.common.p079ai.callback.CrashListener;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.h */
/* JADX INFO: loaded from: classes2.dex */
public class C13878h implements CrashListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13880j f57340a;

    public C13878h(C13880j c13880j) {
        this.f57340a = c13880j;
    }

    @Override // com.tencent.could.component.common.p079ai.callback.CrashListener
    public void onCrash(String str) {
        InterfaceC13872b interfaceC13872b = this.f57340a.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onBuriedPointCallBack("CrashStage", "UncatchCrash", str);
        }
        InterfaceC13872b interfaceC13872b2 = this.f57340a.f57348g;
        if (interfaceC13872b2 != null) {
            interfaceC13872b2.updateOperateInfo("Crash", 1, 1L, str);
        }
    }
}
