package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.permission.C13918c;
import com.tencent.could.huiyansdk.permission.InterfaceC13916a;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13891a implements InterfaceC13916a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f57392a;

    public C13891a(AuthingFragment authingFragment) {
        this.f57392a = authingFragment;
    }

    /* JADX INFO: renamed from: a */
    public void m82288a() {
        InterfaceC13872b interfaceC13872b = C13880j.a.f57352a.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "OpenCheckPageError", "");
        }
        C13905e.a.f57445a.m82337a(2, "AuthingFragment", "permission forbid!");
        C13918c.a.f57478a.m82376b();
        CommonUtils.sendErrorAndExitAuth(224, this.f57392a.getResString(C13869R.string.txy_permission_loss_check_error));
    }

    /* JADX INFO: renamed from: b */
    public void m82289b() {
        C13880j c13880j = C13880j.a.f57352a;
        InterfaceC13872b interfaceC13872b = c13880j.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "EnterAuthCheckPage", "");
        }
        C13918c.a.f57478a.m82376b();
        HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j.m82235b();
        if (huiYanSdkConfigM82235b == null || !huiYanSdkConfigM82235b.isShowPrivacyPolicyDialog()) {
            this.f57392a.m82286l();
            return;
        }
        this.f57392a.f57391y = false;
        AuthingFragment authingFragment = this.f57392a;
        authingFragment.runOnUiThread(new RunnableC13892b(authingFragment));
    }
}
