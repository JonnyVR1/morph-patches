package com.tencent.could.huiyansdk.fragments;

import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.view.DialogC13943c;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.b */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC13892b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f57393a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.b$a */
    public class a implements DialogC13943c.d {
        public a() {
        }
    }

    public RunnableC13892b(AuthingFragment authingFragment) {
        this.f57393a = authingFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentActivity activity = this.f57393a.getActivity();
        if (activity == null) {
            C13905e.a.f57445a.m82337a(1, "AuthingFragment", "activity is null!");
            this.f57393a.m82286l();
            return;
        }
        DialogC13943c dialogC13943c = new DialogC13943c(activity, new a());
        if (!dialogC13943c.m82430a(activity)) {
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.updateOperateInfo("ShowPrivacyDialog", 1, 1L, "");
            }
            dialogC13943c.show();
            return;
        }
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "OcrConfirmDialog", "checkIsConfirmed success!");
        if (dialogC13943c.isShowing()) {
            dialogC13943c.dismiss();
        }
        DialogC13943c.d dVar = dialogC13943c.f57585a;
        if (dVar != null) {
            c13905e.m82337a(1, "AuthingFragment", "Have Confirm info!");
            RunnableC13892b.this.f57393a.m82286l();
        }
    }
}
