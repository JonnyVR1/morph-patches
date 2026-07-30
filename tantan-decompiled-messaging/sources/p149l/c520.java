package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.verification.national.NationalIdAuthAct;
import p147v.VCheckBox;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class c520 implements yxl<t420> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f79316a;

    /* JADX INFO: renamed from: b */
    public TextView f79317b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f79318c;

    /* JADX INFO: renamed from: d */
    public EditText f79319d;

    /* JADX INFO: renamed from: e */
    public ImageView f79320e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f79321f;

    /* JADX INFO: renamed from: g */
    public EditText f79322g;

    /* JADX INFO: renamed from: h */
    public ImageView f79323h;

    /* JADX INFO: renamed from: i */
    public TextView f79324i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f79325j;

    /* JADX INFO: renamed from: k */
    public VCheckBox f79326k;

    /* JADX INFO: renamed from: l */
    public TextView f79327l;

    /* JADX INFO: renamed from: m */
    public TextView f79328m;

    /* JADX INFO: renamed from: n */
    public t420 f79329n;

    /* JADX INFO: renamed from: o */
    public NationalIdAuthAct f79330o;

    /* JADX INFO: renamed from: p */
    public yk5 f79331p;

    /* JADX INFO: renamed from: l.c520$c */
    public class C16069c extends ClickableSpan {
        public C16069c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            c520.this.f79331p.show();
            o6j0.m162859c("e_id_verification_info_input_privacy_click", "p_id_verification_info_input_view", new o6j0.C18854a[0]);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#99000000"));
            textPaint.setUnderlineText(false);
        }
    }

    public c520(NationalIdAuthAct nationalIdAuthAct) {
        this.f79330o = nationalIdAuthAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m105262q(View view) {
        o6j0.m162859c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new o6j0.C18854a[0]);
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m105263s(String str, View view) {
        o6j0.m162859c("e_id_verification_info_input_next_click", "p_id_verification_info_input_view", o6j0.C18854a.m162878h("sdk_name", ""), o6j0.C18854a.m162879i("is_checked", this.f79326k.isChecked()));
        if (this.f79326k.isChecked() || TextUtils.equals(str, "appeal")) {
            this.f79329n.m187141h0();
        } else {
            osi0.m165783g(this.f79330o.getResources().getString(R$string.f18529fs));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m105264w(View view) {
        this.f79331p.dismiss();
        this.f79326k.setChecked(true);
        o6j0.m162859c("e_id_verification_info_input_next_click", "p_id_verification_info_input_view", o6j0.C18854a.m162878h("sdk_name", ""), o6j0.C18854a.m162879i("is_checked", this.f79326k.isChecked()));
        if (this.f79319d.getText().toString().length() == 0 || this.f79322g.getText().toString().length() < 18) {
            osi0.m165782f(R$string.f18163Tq);
        } else {
            this.f79329n.m187141h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m105265x(View view) {
        this.f79319d.setText("");
        this.f79319d.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m105266y(View view) {
        this.f79322g.setText("");
        this.f79322g.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m105267z() {
        this.f79319d.requestFocus();
        this.f79330o.showInput(this.f79319d, 0);
    }

    @Override // p149l.yxl
    /* JADX INFO: renamed from: A3 */
    public void mo105269A3(final String str) {
        this.f79316a.setLeftIconResource(u2c0.f173386n);
        this.f79316a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.u420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173681a.m105262q(view);
            }
        });
        boolean zEquals = TextUtils.equals(str, "appeal");
        TextView textView = this.f79317b;
        if (zEquals) {
            textView.setVisibility(0);
            this.f79325j.setVisibility(8);
        } else {
            textView.setVisibility(8);
            this.f79325j.setVisibility(0);
        }
        this.f79316a.setTitle("实名·头像本人认证");
        this.f79331p = new yk5(this.f79330o, TextUtils.equals(str, "fromNameVerificationDlg") ? 4 : 2);
        xdl0.m208329E0(this.f79328m, new View.OnClickListener() { // from class: l.v420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179876a.m105263s(str, view);
            }
        });
        this.f79319d.addTextChangedListener(new C16067a());
        this.f79322g.addTextChangedListener(new C16068b());
        this.f79319d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.w420
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f184470a.m105276u(view, z);
            }
        });
        this.f79322g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.x420
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f190936a.m105277v(view, z);
            }
        });
        String string = this.f79330o.getResources().getString(R$string.f18560gs);
        String str2 = this.f79330o.getResources().getString(R$string.f18498es) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str2);
        this.f79331p.m215118D(new View.OnClickListener() { // from class: l.y420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195889a.m105264w(view);
            }
        });
        spannableStringBuilder.setSpan(new C16069c(), str2.indexOf(string), str2.indexOf(string) + string.length(), 33);
        this.f79327l.setText(spannableStringBuilder);
        this.f79327l.setMovementMethod(LinkMovementMethod.getInstance());
        this.f79327l.setHighlightColor(this.f79330o.getResources().getColor(w0c0.f183811U1));
        xdl0.m208329E0(this.f79320e, new View.OnClickListener() { // from class: l.z420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201436a.m105265x(view);
            }
        });
        xdl0.m208329E0(this.f79323h, new View.OnClickListener() { // from class: l.a520
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67625a.m105266y(view);
            }
        });
        e51.m114743H(this.f79330o, new Runnable() { // from class: l.b520
            @Override // java.lang.Runnable
            public final void run() {
                this.f73431a.m105267z();
            }
        }, 200L);
        this.f79330o.addSwipeBackListener(new C16070d());
    }

    /* JADX INFO: renamed from: B */
    public final void m105270B(String str, String str2) {
        if (TextUtils.isEmpty(str.trim()) || TextUtils.isEmpty(str2.trim()) || str2.trim().length() < 18) {
            this.f79328m.setEnabled(false);
        } else {
            this.f79328m.setEnabled(true);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f79330o;
    }

    @Override // p149l.yxl
    /* JADX INFO: renamed from: J2 */
    public void mo105271J2(String str) {
        xdl0.m208344M(this.f79324i, false);
        lsi0.m151580j(str);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f79330o;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m105273m(layoutInflater, viewGroup);
    }

    @Override // p149l.yxl
    /* JADX INFO: renamed from: l3 */
    public Pair<String, String> mo105272l3() {
        return new Pair<>(this.f79319d.getText().toString(), this.f79322g.getText().toString());
    }

    /* JADX INFO: renamed from: m */
    public View m105273m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d520.m110009b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(t420 t420Var) {
        this.f79329n = t420Var;
    }

    /* JADX INFO: renamed from: p */
    public void m105275p() {
        xdl0.m208344M(this.f79324i, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m105276u(View view, boolean z) {
        if (z) {
            m105268A(this.f79319d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m105277v(View view, boolean z) {
        if (z) {
            m105268A(this.f79322g);
        }
    }

    /* JADX INFO: renamed from: l.c520$d */
    public class C16070d implements mbh0 {
        public C16070d() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            o6j0.m162859c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new o6j0.C18854a[0]);
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: A */
    public final void m105268A(View view) {
    }

    /* JADX INFO: renamed from: l.c520$a */
    public class C16067a implements TextWatcher {
        public C16067a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            c520.this.m105270B(editable.toString(), c520.this.f79322g.getText().toString());
            xdl0.m208344M(c520.this.f79320e, !TextUtils.isEmpty(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: l.c520$b */
    public class C16068b implements TextWatcher {
        public C16068b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            c520 c520Var = c520.this;
            c520Var.m105270B(c520Var.f79319d.getText().toString(), editable.toString());
            xdl0.m208344M(c520.this.f79323h, !TextUtils.isEmpty(editable.toString()));
            c520.this.m105275p();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
