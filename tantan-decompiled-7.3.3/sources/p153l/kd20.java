package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.verification.national.NationalIdAuthAct;
import p151v.VCheckBox;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class kd20 implements r0m<bd20> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f125127a;

    /* JADX INFO: renamed from: b */
    public TextView f125128b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f125129c;

    /* JADX INFO: renamed from: d */
    public EditText f125130d;

    /* JADX INFO: renamed from: e */
    public ImageView f125131e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f125132f;

    /* JADX INFO: renamed from: g */
    public EditText f125133g;

    /* JADX INFO: renamed from: h */
    public ImageView f125134h;

    /* JADX INFO: renamed from: i */
    public TextView f125135i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f125136j;

    /* JADX INFO: renamed from: k */
    public VCheckBox f125137k;

    /* JADX INFO: renamed from: l */
    public TextView f125138l;

    /* JADX INFO: renamed from: m */
    public TextView f125139m;

    /* JADX INFO: renamed from: n */
    public bd20 f125140n;

    /* JADX INFO: renamed from: o */
    public NationalIdAuthAct f125141o;

    /* JADX INFO: renamed from: p */
    public bm5 f125142p;

    /* JADX INFO: renamed from: l.kd20$c */
    public class C18136c extends ClickableSpan {
        public C18136c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            kd20.this.f125142p.show();
            sfj0.m185596c("e_id_verification_info_input_privacy_click", "p_id_verification_info_input_view", new sfj0.C20032a[0]);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#99000000"));
            textPaint.setUnderlineText(false);
        }
    }

    public kd20(NationalIdAuthAct nationalIdAuthAct) {
        this.f125141o = nationalIdAuthAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m149157q(View view) {
        sfj0.m185596c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new sfj0.C20032a[0]);
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m149158s(String str, View view) {
        sfj0.m185596c("e_id_verification_info_input_next_click", "p_id_verification_info_input_view", sfj0.C20032a.m185615h("sdk_name", ""), sfj0.C20032a.m185616i("is_checked", this.f125137k.isChecked()));
        if (this.f125137k.isChecked() || TextUtils.equals(str, "appeal")) {
            this.f125140n.m103585h0();
        } else {
            r1j0.m179420g(this.f125141o.getResources().getString(R$string.f18345Bs));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m149159w(View view) {
        this.f125142p.dismiss();
        this.f125137k.setChecked(true);
        sfj0.m185596c("e_id_verification_info_input_next_click", "p_id_verification_info_input_view", sfj0.C20032a.m185615h("sdk_name", ""), sfj0.C20032a.m185616i("is_checked", this.f125137k.isChecked()));
        if (this.f125130d.getText().toString().length() == 0 || this.f125133g.getText().toString().length() < 18) {
            r1j0.m179419f(R$string.f19535or);
        } else {
            this.f125140n.m103585h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m149160x(View view) {
        this.f125130d.setText("");
        this.f125130d.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m149161y(View view) {
        this.f125133g.setText("");
        this.f125133g.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m149162z() {
        this.f125130d.requestFocus();
        this.f125141o.showInput(this.f125130d, 0);
    }

    @Override // p153l.r0m
    /* JADX INFO: renamed from: A3 */
    public void mo149164A3(final String str) {
        this.f125127a.setLeftIconResource(abc0.f69506n);
        this.f125127a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.cd20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81099a.m149157q(view);
            }
        });
        boolean zEquals = TextUtils.equals(str, "appeal");
        TextView textView = this.f125128b;
        if (zEquals) {
            textView.setVisibility(0);
            this.f125136j.setVisibility(8);
        } else {
            textView.setVisibility(8);
            this.f125136j.setVisibility(0);
        }
        this.f125127a.setTitle("实名·头像本人认证");
        this.f125142p = new bm5(this.f125141o, TextUtils.equals(str, "fromNameVerificationDlg") ? 4 : 2);
        bnl0.m105509E0(this.f125139m, new View.OnClickListener() { // from class: l.dd20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87851a.m149158s(str, view);
            }
        });
        this.f125130d.addTextChangedListener(new C18134a());
        this.f125133g.addTextChangedListener(new C18135b());
        this.f125130d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ed20
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f93136a.m149171u(view, z);
            }
        });
        this.f125133g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.fd20
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f98316a.m149172v(view, z);
            }
        });
        String string = this.f125141o.getResources().getString(R$string.f18376Cs);
        String str2 = this.f125141o.getResources().getString(R$string.f18314As) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str2);
        this.f125142p.m104999D(new View.OnClickListener() { // from class: l.gd20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103622a.m149159w(view);
            }
        });
        spannableStringBuilder.setSpan(new C18136c(), str2.indexOf(string), str2.indexOf(string) + string.length(), 33);
        this.f125138l.setText(spannableStringBuilder);
        this.f125138l.setMovementMethod(LinkMovementMethod.getInstance());
        this.f125138l.setHighlightColor(this.f125141o.getResources().getColor(c9c0.f80383V1));
        bnl0.m105509E0(this.f125131e, new View.OnClickListener() { // from class: l.hd20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108780a.m149160x(view);
            }
        });
        bnl0.m105509E0(this.f125134h, new View.OnClickListener() { // from class: l.id20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114467a.m149161y(view);
            }
        });
        l51.m152888H(this.f125141o, new Runnable() { // from class: l.jd20
            @Override // java.lang.Runnable
            public final void run() {
                this.f120106a.m149162z();
            }
        }, 200L);
        this.f125141o.addSwipeBackListener(new C18137d());
    }

    /* JADX INFO: renamed from: B */
    public final void m149165B(String str, String str2) {
        if (TextUtils.isEmpty(str.trim()) || TextUtils.isEmpty(str2.trim()) || str2.trim().length() < 18) {
            this.f125139m.setEnabled(false);
        } else {
            this.f125139m.setEnabled(true);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f125141o;
    }

    @Override // p153l.r0m
    /* JADX INFO: renamed from: J2 */
    public void mo149166J2(String str) {
        bnl0.m105524M(this.f125135i, false);
        o1j0.m165636j(str);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f125141o;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m149168m(layoutInflater, viewGroup);
    }

    @Override // p153l.r0m
    /* JADX INFO: renamed from: l3 */
    public Pair<String, String> mo149167l3() {
        return new Pair<>(this.f125130d.getText().toString(), this.f125133g.getText().toString());
    }

    /* JADX INFO: renamed from: m */
    public View m149168m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ld20.m153700b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bd20 bd20Var) {
        this.f125140n = bd20Var;
    }

    /* JADX INFO: renamed from: p */
    public void m149170p() {
        bnl0.m105524M(this.f125135i, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m149171u(View view, boolean z) {
        if (z) {
            m149163A(this.f125130d);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m149172v(View view, boolean z) {
        if (z) {
            m149163A(this.f125133g);
        }
    }

    /* JADX INFO: renamed from: l.kd20$d */
    public class C18137d implements ujh0 {
        public C18137d() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            sfj0.m185596c("e_id_verification_info_input_cancel_click", "p_id_verification_info_input_view", new sfj0.C20032a[0]);
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: A */
    public final void m149163A(View view) {
    }

    /* JADX INFO: renamed from: l.kd20$a */
    public class C18134a implements TextWatcher {
        public C18134a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            kd20.this.m149165B(editable.toString(), kd20.this.f125133g.getText().toString());
            bnl0.m105524M(kd20.this.f125131e, !TextUtils.isEmpty(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: l.kd20$b */
    public class C18135b implements TextWatcher {
        public C18135b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            kd20 kd20Var = kd20.this;
            kd20Var.m149165B(kd20Var.f125130d.getText().toString(), editable.toString());
            bnl0.m105524M(kd20.this.f125134h, !TextUtils.isEmpty(editable.toString()));
            kd20.this.m149170p();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
