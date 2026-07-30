package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.profile.R$string;
import io.agora.rtc2.internal.AudioRoutingController;
import p147v.VEditText;

/* JADX INFO: loaded from: classes4.dex */
public class yif extends hu0 {

    /* JADX INFO: renamed from: a */
    public final Question f198476a;

    /* JADX INFO: renamed from: b */
    public final f30<Question, String> f198477b;

    /* JADX INFO: renamed from: c */
    public VEditText f198478c;

    /* JADX INFO: renamed from: l.yif$b */
    public class C21412b implements blf0.InterfaceC15903a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f198481a;

        public C21412b(View view) {
            this.f198481a = view;
        }

        @Override // p149l.blf0.InterfaceC15903a
        /* JADX INFO: renamed from: a */
        public void mo102521a(int i) {
            xdl0.m208357U(this.f198481a, 0);
        }

        @Override // p149l.blf0.InterfaceC15903a
        /* JADX INFO: renamed from: b */
        public void mo102522b(int i) {
            xdl0.m208357U(this.f198481a, i);
        }
    }

    public yif(Context context, Question question, String str, f30<Question, String> f30Var) {
        super(context, v7c0.f180350E);
        this.f198476a = question;
        this.f198477b = f30Var;
        m214901t(context, str);
    }

    /* JADX INFO: renamed from: s */
    private void m214898s() {
        ((Act) xdl0.m208326D(getContext())).hideInput(this.f198478c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m214899u(View view) {
        m214898s();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m214900v(View view) {
        if (!TextUtils.isEmpty(ura.m195053e().m195057d().mo33893ob(this.f198478c.getText().toString().trim()))) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f27876k0));
            return;
        }
        f30<Question, String> f30Var = this.f198477b;
        if (f30Var != null) {
            f30Var.call(this.f198476a, this.f198478c.getText().toString().trim());
        }
        m214898s();
        dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    /* JADX INFO: renamed from: t */
    public final void m214901t(Context context, String str) {
        View viewInflate = LayoutInflater.from(context).inflate(f6c0.f95413J2, (ViewGroup) null);
        setContentView(viewInflate);
        xdl0.m208376g0(viewInflate);
        ((TextView) viewInflate.findViewById(u4c0.f174268ge)).setText(this.f198476a.text);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174154a2);
        textView.setText("100");
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f174304j0), new View.OnClickListener() { // from class: l.wif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186538a.m214899u(view);
            }
        });
        VEditText vEditText = (VEditText) viewInflate.findViewById(u4c0.f174392o3);
        this.f198478c = vEditText;
        vEditText.setHint("我觉得...");
        this.f198478c.addTextChangedListener(new C21411a(textView));
        this.f198478c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f198478c.setText(str);
        VEditText vEditText2 = this.f198478c;
        vEditText2.setSelection(vEditText2.length());
        blf0.m102518c(viewInflate, new C21412b(viewInflate.findViewById(u4c0.f174525w0)));
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f173997Q8), new View.OnClickListener() { // from class: l.xif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193104a.m214900v(view);
            }
        });
        m214902w();
    }

    /* JADX INFO: renamed from: w */
    public final void m214902w() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        window.setWindowAnimations(v7c0.f180352G);
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo134126m();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m214903x(TextView textView, int i) {
        textView.setText((100 - i) + "");
    }

    /* JADX INFO: renamed from: l.yif$a */
    public class C21411a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f198479a;

        public C21411a(TextView textView) {
            this.f198479a = textView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            yif.this.m214903x(this.f198479a, Math.min(editable.length(), 100));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
