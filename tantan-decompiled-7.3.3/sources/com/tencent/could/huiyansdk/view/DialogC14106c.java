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
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.fragments.RunnableC14055b;
import com.tencent.could.huiyansdk.manager.C14068e;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c */
/* JADX INFO: loaded from: classes12.dex */
public class DialogC14106c extends Dialog {

    /* JADX INFO: renamed from: a */
    public d f58433a;

    /* JADX INFO: renamed from: b */
    public Button f58434b;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$a */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Button button = DialogC14106c.this.f58434b;
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
            C14068e c14068e = C14068e.a.f58293a;
            c14068e.m83520a(1, "OcrConfirmDialog", "confirmBtn selected!");
            Context context = DialogC14106c.this.getContext();
            if (context != null) {
                context.getSharedPreferences("txy_comoon_share_data", 0).edit().putBoolean("overseas_pro_confirm", true).apply();
            }
            DialogC14106c.this.dismiss();
            d dVar = DialogC14106c.this.f58433a;
            if (dVar != null) {
                c14068e.m83520a(1, "AuthingFragment", "Have Confirm info!");
                RunnableC14055b.this.f58241a.m83469l();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f58437a;

        public c(DialogC14106c dialogC14106c, Context context) {
            this.f58437a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f58437a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.tencentcloud.com/document/product/1061/46725?lang=en")));
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$d */
    public interface d {
    }

    public DialogC14106c(Context context, d dVar) {
        super(context);
        this.f58433a = dVar;
        m83614b(context);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83613a(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences("txy_comoon_share_data", 0).getBoolean("overseas_pro_confirm", false);
    }

    /* JADX INFO: renamed from: b */
    public final void m83614b(Context context) {
        setContentView(LayoutInflater.from(context).inflate(C14032R.layout.txy_huiyan_dialog_huiyan_confirm_layout, (ViewGroup) null));
        setCanceledOnTouchOutside(false);
        Button button = (Button) findViewById(C14032R.id.txy_ocr_dialog_confirm_button);
        this.f58434b = button;
        button.setEnabled(false);
        CheckBox checkBox = (CheckBox) findViewById(C14032R.id.txy_ocr_dialog_confirm_checked_box);
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener(new a());
        this.f58434b.setOnClickListener(new b());
        TextView textView = (TextView) findViewById(C14032R.id.txy_ocr_dialog_confirm_tv);
        HuiYanSdkConfig huiYanSdkConfigM83418b = C14043j.a.f58200a.m83418b();
        if (huiYanSdkConfigM83418b == null || huiYanSdkConfigM83418b.getPolicyDialogResId() == -1) {
            return;
        }
        textView.setText(Html.fromHtml(context.getString(huiYanSdkConfigM83418b.getPolicyDialogResId()), 0));
        textView.setOnClickListener(new c(this, context));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "OcrConfirmDialog", "use cancel!");
        d dVar = this.f58433a;
        if (dVar != null) {
            c14068e.m83520a(1, "AuthingFragment", "Confirm user cancel!");
            RunnableC14055b.this.f58241a.m83457a(true);
        }
    }
}
