package com.tencent.could.huiyansdk.fragments;

import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.view.DialogC14106c;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.b */
/* JADX INFO: loaded from: classes12.dex */
public class RunnableC14055b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f58241a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.b$a */
    public class a implements DialogC14106c.d {
        public a() {
        }
    }

    public RunnableC14055b(AuthingFragment authingFragment) {
        this.f58241a = authingFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentActivity activity = this.f58241a.getActivity();
        if (activity == null) {
            C14068e.a.f58293a.m83520a(1, "AuthingFragment", "activity is null!");
            this.f58241a.m83469l();
            return;
        }
        DialogC14106c dialogC14106c = new DialogC14106c(activity, new a());
        if (!dialogC14106c.m83613a(activity)) {
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.updateOperateInfo("ShowPrivacyDialog", 1, 1L, "");
            }
            dialogC14106c.show();
            return;
        }
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "OcrConfirmDialog", "checkIsConfirmed success!");
        if (dialogC14106c.isShowing()) {
            dialogC14106c.dismiss();
        }
        DialogC14106c.d dVar = dialogC14106c.f58433a;
        if (dVar != null) {
            c14068e.m83520a(1, "AuthingFragment", "Have Confirm info!");
            RunnableC14055b.this.f58241a.m83469l();
        }
    }
}
