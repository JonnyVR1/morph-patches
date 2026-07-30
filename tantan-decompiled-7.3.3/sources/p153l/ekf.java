package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.profile.R$string;
import io.agora.rtc2.internal.AudioRoutingController;
import p151v.VEditText;

/* JADX INFO: loaded from: classes4.dex */
public class ekf extends nu0 {

    /* JADX INFO: renamed from: a */
    public final Question f94364a;

    /* JADX INFO: renamed from: b */
    public final z20<Question, String> f94365b;

    /* JADX INFO: renamed from: c */
    public VEditText f94366c;

    /* JADX INFO: renamed from: l.ekf$b */
    public class C16788b implements ktf0.InterfaceC18258a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f94369a;

        public C16788b(View view) {
            this.f94369a = view;
        }

        @Override // p153l.ktf0.InterfaceC18258a
        /* JADX INFO: renamed from: a */
        public void mo121044a(int i) {
            bnl0.m105537U(this.f94369a, 0);
        }

        @Override // p153l.ktf0.InterfaceC18258a
        /* JADX INFO: renamed from: b */
        public void mo121045b(int i) {
            bnl0.m105537U(this.f94369a, i);
        }
    }

    public ekf(Context context, Question question, String str, z20<Question, String> z20Var) {
        super(context, agc0.f71111E);
        this.f94364a = question;
        this.f94365b = z20Var;
        m121041t(context, str);
    }

    /* JADX INFO: renamed from: s */
    private void m121038s() {
        ((Act) bnl0.m105506D(getContext())).hideInput(this.f94366c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m121039u(View view) {
        m121038s();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m121040v(View view) {
        if (!TextUtils.isEmpty(gta.m132210e().m132214d().mo34896ob(this.f94366c.getText().toString().trim()))) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f28724k0));
            return;
        }
        z20<Question, String> z20Var = this.f94365b;
        if (z20Var != null) {
            z20Var.call(this.f94364a, this.f94366c.getText().toString().trim());
        }
        m121038s();
        dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    /* JADX INFO: renamed from: t */
    public final void m121041t(Context context, String str) {
        View viewInflate = LayoutInflater.from(context).inflate(kec0.f125467J2, (ViewGroup) null);
        setContentView(viewInflate);
        bnl0.m105556g0(viewInflate);
        ((TextView) viewInflate.findViewById(adc0.f70409je)).setText(this.f94364a.text);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70279c2);
        textView.setText("100");
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70395j0), new View.OnClickListener() { // from class: l.ckf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82280a.m121039u(view);
            }
        });
        VEditText vEditText = (VEditText) viewInflate.findViewById(adc0.f70517q3);
        this.f94366c = vEditText;
        vEditText.setHint("我觉得...");
        this.f94366c.addTextChangedListener(new C16787a(textView));
        this.f94366c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f94366c.setText(str);
        VEditText vEditText2 = this.f94366c;
        vEditText2.setSelection(vEditText2.length());
        ktf0.m151349c(viewInflate, new C16788b(viewInflate.findViewById(adc0.f70616w0)));
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70119S8), new View.OnClickListener() { // from class: l.dkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89402a.m121040v(view);
            }
        });
        m121042w();
    }

    /* JADX INFO: renamed from: w */
    public final void m121042w() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        window.setWindowAnimations(agc0.f71113G);
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        c30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo102186m();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m121043x(TextView textView, int i) {
        textView.setText((100 - i) + "");
    }

    /* JADX INFO: renamed from: l.ekf$a */
    public class C16787a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f94367a;

        public C16787a(TextView textView) {
            this.f94367a = textView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ekf.this.m121043x(this.f94367a, Math.min(editable.length(), 100));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
