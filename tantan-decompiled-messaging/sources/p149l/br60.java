package p149l;

import android.annotation.SuppressLint;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.PhoneNumberInputAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.slf4j.Marker;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class br60 extends c3f0<iq60, PhoneNumberInputAct> {

    /* JADX INFO: renamed from: c */
    public VLinear f76862c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f76863d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit_FakeSpinner f76864e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f76865f;

    /* JADX INFO: renamed from: g */
    public VText f76866g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f76867h;

    /* JADX INFO: renamed from: i */
    public VText f76868i;

    /* JADX INFO: renamed from: j */
    public VText f76869j;

    /* JADX INFO: renamed from: k */
    public VText f76870k;

    /* JADX INFO: renamed from: l */
    public VMaterialEdit f76871l;

    /* JADX INFO: renamed from: m */
    public VText f76872m;

    /* JADX INFO: renamed from: n */
    public VText f76873n;

    /* JADX INFO: renamed from: o */
    public VText f76874o;

    /* JADX INFO: renamed from: p */
    public VButton_FakeShadow f76875p;

    /* JADX INFO: renamed from: q */
    public iq60 f76876q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f76877r;

    public br60(@NonNull PhoneNumberInputAct phoneNumberInputAct) {
        super(phoneNumberInputAct);
        this.f76877r = new View.OnClickListener() { // from class: l.jq60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119251a.m103517d0(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m103479U(String str) {
        this.f76864e.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public View m103494F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cr60.m108350b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m103495G() {
        cr60.m108351c(this);
    }

    @Override // p149l.c3f0, p149l.s7m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(iq60 iq60Var) {
        this.f76876q = iq60Var;
    }

    /* JADX INFO: renamed from: I */
    public int m103497I() {
        return NullChecker.m81305c(this.f76864e, SchemeKey.account, CrashHelper.ReportLevel.p9) ? Integer.valueOf(this.f76864e.getText().toString().substring(1)).intValue() : zqb.f204369d.get(0).f204372b;
    }

    /* JADX INFO: renamed from: J */
    public String m103498J() {
        return Marker.ANY_NON_NULL_MARKER + vwb.m200345q(this.f76864e.getText().toString()) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vwb.m200345q(this.f76865f.getText().toString());
    }

    /* JADX INFO: renamed from: K */
    public String m103499K() {
        return yij0.m214935M(this.f76865f);
    }

    /* JADX INFO: renamed from: L */
    public void m103500L(VerifyReason verifyReason) {
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            this.f76864e.setText("+86");
            return;
        }
        int i = zqb.f204369d.get(0).f204372b;
        this.f76864e.setText(Marker.ANY_NON_NULL_MARKER + i);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: M */
    public void m103501M(final VerifyReason verifyReason) {
        this.f76864e.setOnClickListener(new View.OnClickListener() { // from class: l.tq60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171550a.m103510W(verifyReason, view);
            }
        });
        if (NullChecker.m81303a(WelcomeAct.f17059h) && !TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            this.f76864e.setText(WelcomeAct.f17059h);
        }
        this.f76865f.m223128I(false).subscribe(mkd0.m154955G(new e30() { // from class: l.wq60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187648a.m103511X((CharSequence) obj);
            }
        }));
        xdl0.m208329E0(this.f76875p, this.f76877r);
        this.f76865f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.xq60
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f193987a.m103512Y(textView, i, keyEvent);
            }
        });
        if (NullChecker.m81303a(WelcomeAct.f17058g) && !TEnum.equals(verifyReason, VerifyReason.change_phone)) {
            this.f76865f.setText(WelcomeAct.f17058g);
            int visibility = this.f76871l.getVisibility();
            HoldAct holdact = this.f78941a;
            if (visibility == 0) {
                e51.m114741F(holdact, new Runnable() { // from class: l.yq60
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f199528a.m103513Z();
                    }
                });
            } else {
                e51.m114741F(holdact, new Runnable() { // from class: l.zq60
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f204346a.m103514a0();
                    }
                });
            }
        }
        if (this.f76871l.getVisibility() == 0) {
            this.f76871l.m223128I(false).subscribe(mkd0.m154955G(new e30() { // from class: l.ar60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71233a.m103515b0((CharSequence) obj);
                }
            }));
            this.f76871l.setOnClickListener(new View.OnClickListener() { // from class: l.kq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f124225a.m103502N(view);
                }
            });
            this.f76871l.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.lq60
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return this.f129297a.m103503O(textView, i, keyEvent);
                }
            });
        }
        this.f76874o.setVisibility(8);
        if (TEnum.equals(verifyReason, VerifyReason.signin)) {
            this.f76873n.setVisibility(0);
            this.f76873n.setText(R$string.f16301w3);
            int iM103497I = m103497I();
            VText vText = this.f76873n;
            if (iM103497I == 86) {
                vText.setText(R$string.f16245m0);
                djj0.m112082c(this.f76873n, act().getString(R$string.f16257o0), new d30() { // from class: l.mq60
                    @Override // p149l.d30
                    public final void call() {
                        this.f135169a.m103504P();
                    }
                });
            } else {
                vText.setText(R$string.f16301w3);
                djj0.m112082c(this.f76873n, ((PhoneNumberInputAct) this.f78941a).string(R$string.f16306x3), new d30() { // from class: l.nq60
                    @Override // p149l.d30
                    public final void call() {
                        this.f140042a.m103505Q();
                    }
                });
            }
        } else if (TEnum.equals(verifyReason, VerifyReason.signup)) {
            this.f76864e.setOnClickListener(new View.OnClickListener() { // from class: l.uq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177711a.m103507S(verifyReason, view);
                }
            });
            this.f76873n.setVisibility(8);
        }
        m103524j0();
        act().setKeyboardListener(this.f76862c, new e30() { // from class: l.vq60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182594a.m103508T((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m103502N(View view) {
        zvf0.m220396r("e_password_input", ((PhoneNumberInputAct) this.f78941a).pageId());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m103503O(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.m81303a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f76877r.onClick(this.f76875p);
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m103504P() {
        zvf0.m220399u("e_password_verifypage_switch_button", ((PhoneNumberInputAct) this.f78941a).pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, vwb.m200345q(m103499K())));
        this.f76876q.m137675c2();
        act().m50458m2();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m103505Q() {
        zvf0.m220396r("e_password_verifypage_reset_button", ((PhoneNumberInputAct) this.f78941a).pageId());
        this.f76876q.m137672Z1();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m103506R(String str) {
        this.f76864e.setText(str);
        m103524j0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m103507S(VerifyReason verifyReason, View view) {
        if (!TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            zvf0.m220396r("e_area_code_button", ((PhoneNumberInputAct) this.f78941a).pageId());
        }
        Objects.toString(this.f76864e.getText());
        C21176xm.m210002c0(this.f78941a, new e30() { // from class: l.qq60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155869a.m103506R((String) obj);
            }
        }, i0e.m133794c("p_country_code_selection_view", Dialog.class.getName()));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m103508T(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f76874o.setVisibility(0);
            return;
        }
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(this.f76871l, this.f76862c);
        xdl0.C21104g c21104gM208382j1 = xdl0.m208382j0(this.f76874o, this.f76862c);
        xdl0.C21104g c21104gM208382j2 = xdl0.m208382j0(this.f76873n, this.f76862c);
        if (this.f76873n.getVisibility() == 0) {
            if (c21104gM208382j1.f192419b - (c21104gM208382j2.f192419b + c21104gM208382j2.f192421d) < t100.m186890d(10.0f)) {
                this.f76874o.setVisibility(8);
            }
        } else if (c21104gM208382j1.f192419b - (c21104gM208382j0.f192419b + c21104gM208382j0.f192421d) < t100.m186890d(10.0f)) {
            this.f76874o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m103509V() {
        if (this.f76876q.lifecycle_() == C4319c.f15548i) {
            C21176xm.m210001b0(this.f78941a, new e30() { // from class: l.rq60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160591a.m103479U((String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m103510W(VerifyReason verifyReason, View view) {
        if (!TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            zvf0.m220396r("e_area_code_button", ((PhoneNumberInputAct) this.f78941a).pageId());
        }
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.pq60
            @Override // java.lang.Runnable
            public final void run() {
                this.f150762a.m103509V();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m103511X(CharSequence charSequence) {
        this.f76876q.m137678f2(charSequence);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean m103512Y(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.m81303a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f76877r.onClick(this.f76875p);
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m103513Z() {
        this.f76871l.requestFocus();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m103514a0() {
        VMaterialEdit vMaterialEdit = this.f76865f;
        vMaterialEdit.setSelection(vMaterialEdit.getText().length());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m103515b0(CharSequence charSequence) {
        xvf0.m211279a("e_password_input", ((PhoneNumberInputAct) this.f78941a).pageId(), ((PhoneNumberInputAct) this.f78941a).getClass().getName(), new Object[0]);
        this.f76876q.m137671Y1(charSequence);
        m103524j0();
        if (charSequence.length() > 0) {
            mo103522i(null);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m103516c0(View view) {
        zvf0.m220396r("e_phone_input", ((PhoneNumberInputAct) this.f78941a).pageId());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m103517d0(View view) {
        boolean z = false;
        boolean z2 = true;
        if (this.f76863d.getVisibility() == 0) {
            if (TextUtils.isEmpty(this.f76865f.getText())) {
                this.f76865f.setError(((PhoneNumberInputAct) this.f78941a).string(R$string.f16266p3));
            } else {
                if (!this.f76876q.m137682n1(this.f76865f.getText().toString())) {
                    this.f76865f.setError(act().getString(R$string.f16096K3));
                }
                this.f76865f.setOnClickListener(new View.OnClickListener() { // from class: l.sq60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f165942a.m103516c0(view2);
                    }
                });
            }
            z2 = false;
            this.f76865f.setOnClickListener(new View.OnClickListener() { // from class: l.sq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f165942a.m103516c0(view2);
                }
            });
        }
        if (this.f76871l.getVisibility() == 0) {
            this.f76876q.m137676d2();
            if (TextUtils.isEmpty(this.f76871l.getText())) {
                mo103522i(((PhoneNumberInputAct) this.f78941a).string(R$string.f16260o3));
            } else if (this.f76871l.getText().length() < 6) {
                mo103522i(it6.m138182c(((PhoneNumberInputAct) this.f78941a).string(R$string.f16086I3)));
            } else {
                z = z2;
            }
        } else {
            z = z2;
        }
        if (xdl0.m208349O0(this.f76866g)) {
            n6j0.m158048b("e_p_appeal_verify_phonenumber_page_next", ((PhoneNumberInputAct) this.f78941a).pageId(), n6j0.C18629a.m158055f("is_binding_phonenumber", "0"));
        }
        this.f76876q.m137680h2(z);
    }

    @Override // p149l.c3f0, p149l.s7m
    public void destroy() {
        m103495G();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m103518e0(View view) {
        zvf0.m220396r("e_prelogin_password_page_feedback", ((PhoneNumberInputAct) this.f78941a).pageId());
        act().startActivity(WebViewAct.m80165a2(act(), "帮助与反馈", a3e0.m94685a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m103519f0() {
        return m103497I() == 86;
    }

    /* JADX INFO: renamed from: g0 */
    public void m103520g0() {
        this.f76871l.requestFocus();
    }

    /* JADX INFO: renamed from: h0 */
    public void m103521h0() {
        m105017d(this.f76864e, this.f76865f);
    }

    @Override // p149l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo103522i(String str) {
        this.f76871l.setError(str);
    }

    /* JADX INFO: renamed from: i0 */
    public void m103523i0(VerifyReason verifyReason, SignInData signInData) {
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "signin":
                this.f76871l.setHint(R$string.f16270q2);
                this.f76863d.setVisibility(8);
                ((PhoneNumberInputAct) this.f78941a).setTitle(R$string.f16259o2);
                if (NullChecker.m81303a(signInData) && signInData.username.contains(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                    String[] strArrSplit = signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    String str = strArrSplit[0];
                    this.f76865f.setText(strArrSplit[1]);
                    this.f76864e.setText(Marker.ANY_NON_NULL_MARKER + str);
                }
                if (C17133gp.m127320k()) {
                    xdl0.m208344M(this.f76872m, true);
                    xdl0.m208329E0(this.f76872m, new View.OnClickListener() { // from class: l.oq60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f145111a.m103518e0(view);
                        }
                    });
                }
                this.f76875p.setText(R$string.f16259o2);
                break;
            case "signup":
                this.f76871l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
                ((PhoneNumberInputAct) this.f78941a).setTitle(R$string.f16172a);
                this.f76875p.setText(R$string.f16184c);
                this.f76871l.setVisibility(8);
                ((PhoneNumberInputAct) this.f78941a).lmdStart(30000);
                VLinear.f209129b.m223064c();
                xdl0.m208344M(this.f76872m, false);
                break;
            case "ban-appeal":
                ((PhoneNumberInputAct) this.f78941a).setTitle(R$string.f16042A);
                this.f76875p.setText(R$string.f16190d);
                xdl0.m208345M0(this.f76866g, true);
                xdl0.m208344M(this.f76871l, false);
                xdl0.m208344M(this.f76873n, false);
                xdl0.m208344M(this.f76872m, false);
                break;
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103494F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m103524j0() {
        this.f76875p.setActivated(((this.f76865f.getVisibility() != 0 || (!TextUtils.isEmpty(this.f76865f.getText()) && this.f76876q.m137682n1(this.f76865f.getText().toString()))) && (this.f76871l.getVisibility() != 0 || (!TextUtils.isEmpty(this.f76871l.getText()) && this.f76871l.getText().length() >= 6))) ? false : true);
    }

    /* JADX INFO: renamed from: k0 */
    public void m103525k0() {
        this.f76865f.requestFocus();
    }
}
