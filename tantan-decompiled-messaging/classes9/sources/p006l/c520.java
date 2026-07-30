package p006l;

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
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.national.NationalIdAuthAct;
import com.p1.mobile.android.app.Act;
import l.d520;
import l.e51;
import l.lsi0;
import l.mbh0;
import l.o6j0;
import l.osi0;
import l.u2c0;
import l.xdl0;
import l.yk5;
import v.VCheckBox;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c520 implements yxl<t420> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f9349a;

    /* JADX INFO: renamed from: b */
    public TextView f9350b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f9351c;

    /* JADX INFO: renamed from: d */
    public EditText f9352d;

    /* JADX INFO: renamed from: e */
    public ImageView f9353e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f9354f;

    /* JADX INFO: renamed from: g */
    public EditText f9355g;

    /* JADX INFO: renamed from: h */
    public ImageView f9356h;

    /* JADX INFO: renamed from: i */
    public TextView f9357i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f9358j;

    /* JADX INFO: renamed from: k */
    public VCheckBox f9359k;

    /* JADX INFO: renamed from: l */
    public TextView f9360l;

    /* JADX INFO: renamed from: m */
    public TextView f9361m;

    /* JADX INFO: renamed from: n */
    public t420 f9362n;

    /* JADX INFO: renamed from: o */
    public NationalIdAuthAct f9363o;

    /* JADX INFO: renamed from: p */
    public yk5 f9364p;

    /* JADX INFO: renamed from: l.c520$c */
    public class C0596c extends ClickableSpan {
        public C0596c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            c520.this.f9364p.show();
            o6j0.c("e_id_verification_info_input_privacy_click", "p_id_verification_info_input_view", new o6j0.a[0]);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#99000000"));
            textPaint.setUnderlineText(false);
        }
    }

    public c520(NationalIdAuthAct nationalIdAuthAct) {
        this.f9363o = nationalIdAuthAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m13160q(View view) {
        o6j0.c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new o6j0.a[0]);
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m13161s(String str, View view) {
        o6j0.c("e_id_verification_info_input_next_click", "p_id_verification_info_input_view", new o6j0.a[]{o6j0.a.h("sdk_name", ""), o6j0.a.i("is_checked", this.f9359k.isChecked())});
        if (this.f9359k.isChecked() || TextUtils.equals(str, "appeal")) {
            this.f9362n.m24442h0();
        } else {
            osi0.g(this.f9363o.getResources().getString(R$string.f2518fs));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m13162w(View view) {
        this.f9364p.dismiss();
        this.f9359k.setChecked(true);
        o6j0.c("e_id_verification_info_input_next_click", "p_id_verification_info_input_view", new o6j0.a[]{o6j0.a.h("sdk_name", ""), o6j0.a.i("is_checked", this.f9359k.isChecked())});
        if (this.f9352d.getText().toString().length() == 0 || this.f9355g.getText().toString().length() < 18) {
            osi0.f(R$string.f2152Tq);
        } else {
            this.f9362n.m24442h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m13163x(View view) {
        this.f9352d.setText("");
        this.f9352d.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m13164y(View view) {
        this.f9355g.setText("");
        this.f9355g.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m13165z() {
        this.f9352d.requestFocus();
        this.f9363o.showInput(this.f9352d, 0);
    }

    @Override // p006l.yxl
    /* JADX INFO: renamed from: A3 */
    public void mo13167A3(final String str) {
        this.f9349a.setLeftIconResource(u2c0.n);
        this.f9349a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.u420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22458a.m13160q(view);
            }
        });
        boolean zEquals = TextUtils.equals(str, "appeal");
        TextView textView = this.f9350b;
        if (zEquals) {
            textView.setVisibility(0);
            this.f9358j.setVisibility(8);
        } else {
            textView.setVisibility(8);
            this.f9358j.setVisibility(0);
        }
        this.f9349a.setTitle("实名·头像本人认证");
        this.f9364p = new yk5(this.f9363o, TextUtils.equals(str, "fromNameVerificationDlg") ? 4 : 2);
        xdl0.E0(this.f9361m, new View.OnClickListener() { // from class: l.v420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24116a.m13161s(str, view);
            }
        });
        this.f9352d.addTextChangedListener(new C0594a());
        this.f9355g.addTextChangedListener(new C0595b());
        this.f9352d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.w420
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f24914a.m13176u(view, z);
            }
        });
        this.f9355g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.x420
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f27340a.m13177v(view, z);
            }
        });
        String string = this.f9363o.getResources().getString(R$string.f2549gs);
        String str2 = this.f9363o.getResources().getString(R$string.f2487es) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str2);
        this.f9364p.D(new View.OnClickListener() { // from class: l.y420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28001a.m13162w(view);
            }
        });
        spannableStringBuilder.setSpan(new C0596c(), str2.indexOf(string), str2.indexOf(string) + string.length(), 33);
        this.f9360l.setText(spannableStringBuilder);
        this.f9360l.setMovementMethod(LinkMovementMethod.getInstance());
        this.f9360l.setHighlightColor(this.f9363o.getResources().getColor(w0c0.f24651U1));
        xdl0.E0(this.f9353e, new View.OnClickListener() { // from class: l.z420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28615a.m13163x(view);
            }
        });
        xdl0.E0(this.f9356h, new View.OnClickListener() { // from class: l.a520
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8107a.m13164y(view);
            }
        });
        e51.H(this.f9363o, new Runnable() { // from class: l.b520
            @Override // java.lang.Runnable
            public final void run() {
                this.f8730a.m13165z();
            }
        }, 200L);
        this.f9363o.addSwipeBackListener(new C0597d());
    }

    /* JADX INFO: renamed from: B */
    public final void m13168B(String str, String str2) {
        if (TextUtils.isEmpty(str.trim()) || TextUtils.isEmpty(str2.trim()) || str2.trim().length() < 18) {
            this.f9361m.setEnabled(false);
        } else {
            this.f9361m.setEnabled(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13169C0() {
        return this.f9363o;
    }

    @Override // p006l.yxl
    /* JADX INFO: renamed from: J2 */
    public void mo13170J2(String str) {
        xdl0.M(this.f9357i, false);
        lsi0.j(str);
    }

    @Nullable
    public Act act() {
        return this.f9363o;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13173m(layoutInflater, viewGroup);
    }

    @Override // p006l.yxl
    /* JADX INFO: renamed from: l3 */
    public Pair<String, String> mo13172l3() {
        return new Pair<>(this.f9352d.getText().toString(), this.f9355g.getText().toString());
    }

    /* JADX INFO: renamed from: m */
    public View m13173m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d520.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m13171i1(t420 t420Var) {
        this.f9362n = t420Var;
    }

    /* JADX INFO: renamed from: p */
    public void m13175p() {
        xdl0.M(this.f9357i, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m13176u(View view, boolean z) {
        if (z) {
            m13166A(this.f9352d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m13177v(View view, boolean z) {
        if (z) {
            m13166A(this.f9355g);
        }
    }

    /* JADX INFO: renamed from: l.c520$d */
    public class C0597d implements mbh0 {
        public C0597d() {
        }

        /* JADX INFO: renamed from: O */
        public void m13180O() {
            o6j0.c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new o6j0.a[0]);
        }

        /* JADX INFO: renamed from: E0 */
        public void m13179E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m13181Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m13178D0(boolean z, float f, int i) {
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: A */
    public final void m13166A(View view) {
    }

    /* JADX INFO: renamed from: l.c520$a */
    public class C0594a implements TextWatcher {
        public C0594a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            c520.this.m13168B(editable.toString(), c520.this.f9355g.getText().toString());
            xdl0.M(c520.this.f9353e, !TextUtils.isEmpty(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: l.c520$b */
    public class C0595b implements TextWatcher {
        public C0595b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            c520 c520Var = c520.this;
            c520Var.m13168B(c520Var.f9352d.getText().toString(), editable.toString());
            xdl0.M(c520.this.f9356h, !TextUtils.isEmpty(editable.toString()));
            c520.this.m13175p();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
