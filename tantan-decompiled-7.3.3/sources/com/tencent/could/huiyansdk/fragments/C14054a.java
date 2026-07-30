package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.permission.C14081c;
import com.tencent.could.huiyansdk.permission.InterfaceC14079a;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14054a implements InterfaceC14079a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f58240a;

    public C14054a(AuthingFragment authingFragment) {
        this.f58240a = authingFragment;
    }

    /* JADX INFO: renamed from: a */
    public void m83471a() {
        InterfaceC14035b interfaceC14035b = C14043j.a.f58200a.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "OpenCheckPageError", "");
        }
        C14068e.a.f58293a.m83520a(2, "AuthingFragment", "permission forbid!");
        C14081c.a.f58326a.m83559b();
        CommonUtils.sendErrorAndExitAuth(224, this.f58240a.getResString(C14032R.string.txy_permission_loss_check_error));
    }

    /* JADX INFO: renamed from: b */
    public void m83472b() {
        C14043j c14043j = C14043j.a.f58200a;
        InterfaceC14035b interfaceC14035b = c14043j.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "EnterAuthCheckPage", "");
        }
        C14081c.a.f58326a.m83559b();
        HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j.m83418b();
        if (huiYanSdkConfigM83418b == null || !huiYanSdkConfigM83418b.isShowPrivacyPolicyDialog()) {
            this.f58240a.m83469l();
            return;
        }
        this.f58240a.f58239y = false;
        AuthingFragment authingFragment = this.f58240a;
        authingFragment.runOnUiThread(new RunnableC14055b(authingFragment));
    }
}
