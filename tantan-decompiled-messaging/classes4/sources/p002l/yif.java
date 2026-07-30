package p002l;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.profile.R;
import l.f30;
import l.f6c0;
import l.hu0;
import l.i30;
import l.lsi0;
import l.u4c0;
import l.ura;
import l.v7c0;
import l.xdl0;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yif extends hu0 {

    /* JADX INFO: renamed from: a */
    public final Question f22901a;

    /* JADX INFO: renamed from: b */
    public final f30<Question, String> f22902b;

    /* JADX INFO: renamed from: c */
    public VEditText f22903c;

    /* JADX INFO: renamed from: l.yif$b */
    public class C0919b implements blf0.InterfaceC0505a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f22906a;

        public C0919b(View view) {
            this.f22906a = view;
        }

        @Override // p002l.blf0.InterfaceC0505a
        /* JADX INFO: renamed from: a */
        public void mo10463a(int i) {
            xdl0.U(this.f22906a, 0);
        }

        @Override // p002l.blf0.InterfaceC0505a
        /* JADX INFO: renamed from: b */
        public void mo10464b(int i) {
            xdl0.U(this.f22906a, i);
        }
    }

    public yif(Context context, Question question, String str, f30<Question, String> f30Var) {
        super(context, v7c0.E);
        this.f22901a = question;
        this.f22902b = f30Var;
        m26724t(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private void m26721s() {
        xdl0.D(getContext()).hideInput(this.f22903c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m26722u(View view) {
        m26721s();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m26723v(View view) {
        if (!TextUtils.isEmpty(ura.e().d().ob(this.f22903c.getText().toString().trim()))) {
            lsi0.y(CoreModule.b.getString(R.string.k0));
            return;
        }
        f30<Question, String> f30Var = this.f22902b;
        if (f30Var != null) {
            f30Var.call(this.f22901a, this.f22903c.getText().toString().trim());
        }
        m26721s();
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
    }

    /* JADX INFO: renamed from: t */
    public final void m26724t(Context context, String str) {
        View viewInflate = LayoutInflater.from(context).inflate(f6c0.J2, (ViewGroup) null);
        setContentView(viewInflate);
        xdl0.g0(new View[]{viewInflate});
        ((TextView) viewInflate.findViewById(u4c0.ge)).setText(this.f22901a.text);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.a2);
        textView.setText("100");
        xdl0.E0(viewInflate.findViewById(u4c0.j0), new View.OnClickListener() { // from class: l.wif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21791a.m26722u(view);
            }
        });
        VEditText vEditTextFindViewById = viewInflate.findViewById(u4c0.o3);
        this.f22903c = vEditTextFindViewById;
        vEditTextFindViewById.setHint("我觉得...");
        this.f22903c.addTextChangedListener(new C0918a(textView));
        this.f22903c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f22903c.setText(str);
        VEditText vEditText = this.f22903c;
        vEditText.setSelection(vEditText.length());
        blf0.m10460c(viewInflate, new C0919b(viewInflate.findViewById(u4c0.w0)));
        xdl0.E0(viewInflate.findViewById(u4c0.Q8), new View.OnClickListener() { // from class: l.xif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22307a.m26723v(view);
            }
        });
        m26725w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m26725w() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        window.setWindowAnimations(v7c0.G);
        window.setAttributes(attributes);
        window.clearFlags(67108864);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m26726x(TextView textView, int i) {
        textView.setText((100 - i) + "");
    }

    /* JADX INFO: renamed from: l.yif$a */
    public class C0918a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f22904a;

        public C0918a(TextView textView) {
            this.f22904a = textView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            yif.this.m26726x(this.f22904a, Math.min(editable.length(), 100));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
