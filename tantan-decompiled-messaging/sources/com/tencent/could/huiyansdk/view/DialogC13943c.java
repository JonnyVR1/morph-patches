package com.tencent.could.huiyansdk.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.fragments.RunnableC13892b;
import com.tencent.could.huiyansdk.manager.C13905e;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC13943c extends Dialog {

    /* JADX INFO: renamed from: a */
    public d f57585a;

    /* JADX INFO: renamed from: b */
    public Button f57586b;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$a */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Button button = DialogC13943c.this.f57586b;
            if (button == null) {
                return;
            }
            if (z) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C13905e c13905e = C13905e.a.f57445a;
            c13905e.m82337a(1, "OcrConfirmDialog", "confirmBtn selected!");
            Context context = DialogC13943c.this.getContext();
            if (context != null) {
                context.getSharedPreferences("txy_comoon_share_data", 0).edit().putBoolean("overseas_pro_confirm", true).apply();
            }
            DialogC13943c.this.dismiss();
            d dVar = DialogC13943c.this.f57585a;
            if (dVar != null) {
                c13905e.m82337a(1, "AuthingFragment", "Have Confirm info!");
                RunnableC13892b.this.f57393a.m82286l();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f57589a;

        public c(DialogC13943c dialogC13943c, Context context) {
            this.f57589a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f57589a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.tencentcloud.com/document/product/1061/46725?lang=en")));
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$d */
    public interface d {
    }

    public DialogC13943c(Context context, d dVar) {
        super(context);
        this.f57585a = dVar;
        m82431b(context);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82430a(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences("txy_comoon_share_data", 0).getBoolean("overseas_pro_confirm", false);
    }

    /* JADX INFO: renamed from: b */
    public final void m82431b(Context context) {
        setContentView(LayoutInflater.from(context).inflate(C13869R.layout.txy_huiyan_dialog_huiyan_confirm_layout, (ViewGroup) null));
        setCanceledOnTouchOutside(false);
        Button button = (Button) findViewById(C13869R.id.txy_ocr_dialog_confirm_button);
        this.f57586b = button;
        button.setEnabled(false);
        CheckBox checkBox = (CheckBox) findViewById(C13869R.id.txy_ocr_dialog_confirm_checked_box);
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener(new a());
        this.f57586b.setOnClickListener(new b());
        TextView textView = (TextView) findViewById(C13869R.id.txy_ocr_dialog_confirm_tv);
        HuiYanSdkConfig huiYanSdkConfigM82235b = C13880j.a.f57352a.m82235b();
        if (huiYanSdkConfigM82235b == null || huiYanSdkConfigM82235b.getPolicyDialogResId() == -1) {
            return;
        }
        textView.setText(Html.fromHtml(context.getString(huiYanSdkConfigM82235b.getPolicyDialogResId()), 0));
        textView.setOnClickListener(new c(this, context));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "OcrConfirmDialog", "use cancel!");
        d dVar = this.f57585a;
        if (dVar != null) {
            c13905e.m82337a(1, "AuthingFragment", "Confirm user cancel!");
            RunnableC13892b.this.f57393a.m82274a(true);
        }
    }
}
