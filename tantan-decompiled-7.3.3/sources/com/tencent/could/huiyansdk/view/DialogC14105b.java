package com.tencent.could.huiyansdk.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.b */
/* JADX INFO: loaded from: classes12.dex */
public class DialogC14105b extends Dialog {

    /* JADX INFO: renamed from: a */
    public TextView f58430a;

    /* JADX INFO: renamed from: b */
    public int f58431b;

    /* JADX INFO: renamed from: c */
    public String f58432c;

    public DialogC14105b(@NonNull Context context, int i) {
        super(context, i);
        m83612a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m83612a(Context context) {
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(C14032R.layout.txy_huiyan_dialog_error_info, (ViewGroup) null);
        setContentView(viewInflate);
        this.f58430a = (TextView) viewInflate.findViewById(C14032R.id.txy_error_msg_text);
        findViewById(C14032R.id.txy_auth_dialog_ok_btn).setOnClickListener(new View.OnClickListener() { // from class: l.auq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73538a.m83610a(view);
            }
        });
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m83610a(View view) {
        dismiss();
        CommonUtils.sendErrorAndExitAuth(this.f58431b, this.f58432c);
    }
}
