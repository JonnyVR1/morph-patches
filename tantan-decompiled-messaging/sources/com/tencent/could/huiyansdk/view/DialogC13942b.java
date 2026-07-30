package com.tencent.could.huiyansdk.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.b */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC13942b extends Dialog {

    /* JADX INFO: renamed from: a */
    public TextView f57582a;

    /* JADX INFO: renamed from: b */
    public int f57583b;

    /* JADX INFO: renamed from: c */
    public String f57584c;

    public DialogC13942b(@NonNull Context context, int i) {
        super(context, i);
        m82429a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m82429a(Context context) {
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(C13869R.layout.txy_huiyan_dialog_error_info, (ViewGroup) null);
        setContentView(viewInflate);
        this.f57582a = (TextView) viewInflate.findViewById(C13869R.id.txy_error_msg_text);
        findViewById(C13869R.id.txy_auth_dialog_ok_btn).setOnClickListener(new View.OnClickListener() { // from class: l.ukq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176952a.m82427a(view);
            }
        });
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m82427a(View view) {
        dismiss();
        CommonUtils.sendErrorAndExitAuth(this.f57583b, this.f57584c);
    }
}
