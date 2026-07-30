package p006l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.PhoneNumberInputAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.a3e0;
import l.d30;
import l.e30;
import l.e51;
import l.i0e;
import l.it6;
import l.j760;
import l.mkd0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xvf0;
import l.yij0;
import l.zqb;
import l.zvf0;
import v.VButton_FakeShadow;
import v.VLinear;
import v.VMaterialEdit;
import v.VMaterialEdit_FakeSpinner;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class br60 extends c3f0<iq60, PhoneNumberInputAct> {

    /* JADX INFO: renamed from: c */
    public VLinear f9041c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f9042d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit_FakeSpinner f9043e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f9044f;

    /* JADX INFO: renamed from: g */
    public VText f9045g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f9046h;

    /* JADX INFO: renamed from: i */
    public VText f9047i;

    /* JADX INFO: renamed from: j */
    public VText f9048j;

    /* JADX INFO: renamed from: k */
    public VText f9049k;

    /* JADX INFO: renamed from: l */
    public VMaterialEdit f9050l;

    /* JADX INFO: renamed from: m */
    public VText f9051m;

    /* JADX INFO: renamed from: n */
    public VText f9052n;

    /* JADX INFO: renamed from: o */
    public VText f9053o;

    /* JADX INFO: renamed from: p */
    public VButton_FakeShadow f9054p;

    /* JADX INFO: renamed from: q */
    public iq60 f9055q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f9056r;

    public br60(@NonNull PhoneNumberInputAct phoneNumberInputAct) {
        super(phoneNumberInputAct);
        this.f9056r = new View.OnClickListener() { // from class: l.jq60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15321a.m12887d0(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m12849U(String str) {
        this.f9043e.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public View m12864F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cr60.m13615b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m12865G() {
        cr60.m13616c(this);
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo476i1(iq60 iq60Var) {
        this.f9055q = iq60Var;
    }

    /* JADX INFO: renamed from: I */
    public int m12867I() {
        return NullChecker.c(this.f9043e, "account", CrashHelper.ReportLevel.p9) ? Integer.valueOf(this.f9043e.getText().toString().substring(1)).intValue() : ((zqb) zqb.d.get(0)).b;
    }

    /* JADX INFO: renamed from: J */
    public String m12868J() {
        return "+" + vwb.q(this.f9043e.getText().toString()) + " " + vwb.q(this.f9044f.getText().toString());
    }

    /* JADX INFO: renamed from: K */
    public String m12869K() {
        return yij0.M(this.f9044f);
    }

    /* JADX INFO: renamed from: L */
    public void m12870L(VerifyReason verifyReason) {
        if (TEnum.equals(verifyReason, "ban-appeal")) {
            this.f9043e.setText("+86");
            return;
        }
        int i = ((zqb) zqb.d.get(0)).b;
        this.f9043e.setText("+" + i);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: M */
    public void m12871M(final VerifyReason verifyReason) {
        this.f9043e.setOnClickListener(new View.OnClickListener() { // from class: l.tq60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22235a.m12880W(verifyReason, view);
            }
        });
        if (NullChecker.a(WelcomeAct.f1048h) && !TEnum.equals(verifyReason, "ban-appeal")) {
            this.f9043e.setText(WelcomeAct.f1048h);
        }
        this.f9044f.I(false).subscribe(mkd0.G(new e30() { // from class: l.wq60
            public final void call(Object obj) {
                this.f25310a.m12881X((CharSequence) obj);
            }
        }));
        xdl0.E0(this.f9054p, this.f9056r);
        this.f9044f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.xq60
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f27677a.m12882Y(textView, i, keyEvent);
            }
        });
        if (NullChecker.a(WelcomeAct.f1047g) && !TEnum.equals(verifyReason, "change-phone")) {
            this.f9044f.setText(WelcomeAct.f1047g);
            int visibility = this.f9050l.getVisibility();
            ?? r2 = this.f9323a;
            if (visibility == 0) {
                e51.F((Context) r2, new Runnable() { // from class: l.yq60
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28341a.m12883Z();
                    }
                });
            } else {
                e51.F((Context) r2, new Runnable() { // from class: l.zq60
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28909a.m12884a0();
                    }
                });
            }
        }
        if (this.f9050l.getVisibility() == 0) {
            this.f9050l.I(false).subscribe(mkd0.G(new e30() { // from class: l.ar60
                public final void call(Object obj) {
                    this.f8449a.m12885b0((CharSequence) obj);
                }
            }));
            this.f9050l.setOnClickListener(new View.OnClickListener() { // from class: l.kq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15960a.m12872N(view);
                }
            });
            this.f9050l.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.lq60
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return this.f16570a.m12873O(textView, i, keyEvent);
                }
            });
        }
        this.f9053o.setVisibility(8);
        if (TEnum.equals(verifyReason, "signin")) {
            this.f9052n.setVisibility(0);
            this.f9052n.setText(R$string.f290w3);
            int iM12867I = m12867I();
            VText vText = this.f9052n;
            if (iM12867I == 86) {
                vText.setText(R$string.f234m0);
                djj0.m14045c(this.f9052n, act().getString(R$string.f246o0), new d30() { // from class: l.mq60
                    public final void call() {
                        this.f17180a.m12874P();
                    }
                });
            } else {
                vText.setText(R$string.f290w3);
                djj0.m14045c(this.f9052n, ((PhoneNumberInputAct) this.f9323a).string(R$string.f295x3), new d30() { // from class: l.nq60
                    public final void call() {
                        this.f17805a.m12875Q();
                    }
                });
            }
        } else if (TEnum.equals(verifyReason, "signup")) {
            this.f9043e.setOnClickListener(new View.OnClickListener() { // from class: l.uq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23702a.m12877S(verifyReason, view);
                }
            });
            this.f9052n.setVisibility(8);
        }
        m12894j0();
        act().setKeyboardListener(this.f9041c, new e30() { // from class: l.vq60
            public final void call(Object obj) {
                this.f24415a.m12878T((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m12872N(View view) {
        zvf0.r("e_password_input", ((PhoneNumberInputAct) this.f9323a).pageId());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m12873O(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f9056r.onClick(this.f9054p);
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m12874P() {
        zvf0.u("e_password_verifypage_switch_button", ((PhoneNumberInputAct) this.f9323a).pageId(), new j760[]{vwb.Y("phone_num", vwb.q(m12869K()))});
        this.f9055q.m16863c2();
        act().finish();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m12875Q() {
        zvf0.r("e_password_verifypage_reset_button", ((PhoneNumberInputAct) this.f9323a).pageId());
        this.f9055q.m16860Z1();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m12876R(String str) {
        this.f9043e.setText(str);
        m12894j0();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m12877S(VerifyReason verifyReason, View view) {
        if (!TEnum.equals(verifyReason, "ban-appeal")) {
            zvf0.r("e_area_code_button", ((PhoneNumberInputAct) this.f9323a).pageId());
        }
        Objects.toString(this.f9043e.getText());
        C1444xm.m27309c0(this.f9323a, new e30() { // from class: l.qq60
            public final void call(Object obj) {
                this.f19974a.m12876R((String) obj);
            }
        }, i0e.c("p_country_code_selection_view", Dialog.class.getName()));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m12878T(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f9053o.setVisibility(0);
            return;
        }
        xdl0.g gVarJ0 = xdl0.j0(this.f9050l, this.f9041c);
        xdl0.g gVarJ1 = xdl0.j0(this.f9053o, this.f9041c);
        xdl0.g gVarJ2 = xdl0.j0(this.f9052n, this.f9041c);
        if (this.f9052n.getVisibility() == 0) {
            if (gVarJ1.b - (gVarJ2.b + gVarJ2.d) < t100.d(10.0f)) {
                this.f9053o.setVisibility(8);
            }
        } else if (gVarJ1.b - (gVarJ0.b + gVarJ0.d) < t100.d(10.0f)) {
            this.f9053o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m12879V() {
        if (this.f9055q.lifecycle_() == c.i) {
            C1444xm.m27308b0(this.f9323a, new e30() { // from class: l.rq60
                public final void call(Object obj) {
                    this.f20678a.m12849U((String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m12880W(VerifyReason verifyReason, View view) {
        if (!TEnum.equals(verifyReason, "ban-appeal")) {
            zvf0.r("e_area_code_button", ((PhoneNumberInputAct) this.f9323a).pageId());
        }
        if (TEnum.equals(verifyReason, "ban-appeal")) {
            return;
        }
        e51.G(new Runnable() { // from class: l.pq60
            @Override // java.lang.Runnable
            public final void run() {
                this.f19261a.m12879V();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m12881X(CharSequence charSequence) {
        this.f9055q.m16866f2(charSequence);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean m12882Y(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && i != 6 && (!NullChecker.a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
            return false;
        }
        this.f9056r.onClick(this.f9054p);
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m12883Z() {
        this.f9050l.requestFocus();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m12884a0() {
        VMaterialEdit vMaterialEdit = this.f9044f;
        vMaterialEdit.setSelection(vMaterialEdit.getText().length());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m12885b0(CharSequence charSequence) {
        xvf0.a("e_password_input", ((PhoneNumberInputAct) this.f9323a).pageId(), ((PhoneNumberInputAct) this.f9323a).getClass().getName(), new Object[0]);
        this.f9055q.m16859Y1(charSequence);
        m12894j0();
        if (charSequence.length() > 0) {
            mo12892i(null);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m12886c0(View view) {
        zvf0.r("e_phone_input", ((PhoneNumberInputAct) this.f9323a).pageId());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m12887d0(View view) {
        boolean z = false;
        boolean z2 = true;
        if (this.f9042d.getVisibility() == 0) {
            if (TextUtils.isEmpty(this.f9044f.getText())) {
                this.f9044f.setError(((PhoneNumberInputAct) this.f9323a).string(R$string.f255p3));
            } else {
                if (!this.f9055q.m16870n1(this.f9044f.getText().toString())) {
                    this.f9044f.setError(act().getString(R$string.f85K3));
                }
                this.f9044f.setOnClickListener(new View.OnClickListener() { // from class: l.sq60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f21571a.m12886c0(view2);
                    }
                });
            }
            z2 = false;
            this.f9044f.setOnClickListener(new View.OnClickListener() { // from class: l.sq60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21571a.m12886c0(view2);
                }
            });
        }
        if (this.f9050l.getVisibility() == 0) {
            this.f9055q.m16864d2();
            if (TextUtils.isEmpty(this.f9050l.getText())) {
                mo12892i(((PhoneNumberInputAct) this.f9323a).string(R$string.f249o3));
            } else if (this.f9050l.getText().length() < 6) {
                mo12892i(it6.c(((PhoneNumberInputAct) this.f9323a).string(R$string.f75I3)));
            } else {
                z = z2;
            }
        } else {
            z = z2;
        }
        if (xdl0.O0(this.f9045g)) {
            n6j0.m19689b("e_p_appeal_verify_phonenumber_page_next", ((PhoneNumberInputAct) this.f9323a).pageId(), n6j0.C1041a.m19696f("is_binding_phonenumber", "0"));
        }
        this.f9055q.m16868h2(z);
    }

    @Override // p006l.c3f0
    public void destroy() {
        m12865G();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m12888e0(View view) {
        zvf0.r("e_prelogin_password_page_feedback", ((PhoneNumberInputAct) this.f9323a).pageId());
        act().startActivity(WebViewAct.a2(act(), "帮助与反馈", a3e0.a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m12889f0() {
        return m12867I() == 86;
    }

    /* JADX INFO: renamed from: g0 */
    public void m12890g0() {
        this.f9050l.requestFocus();
    }

    /* JADX INFO: renamed from: h0 */
    public void m12891h0() {
        m13095d(this.f9043e, this.f9044f);
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo12892i(String str) {
        this.f9050l.setError(str);
    }

    /* JADX INFO: renamed from: i0 */
    public void m12893i0(VerifyReason verifyReason, SignInData signInData) {
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "signin":
                this.f9050l.setHint(R$string.f259q2);
                this.f9042d.setVisibility(8);
                ((PhoneNumberInputAct) this.f9323a).setTitle(R$string.f248o2);
                if (NullChecker.a(signInData) && signInData.username.contains(" ")) {
                    String[] strArrSplit = signInData.username.split(" ");
                    String str = strArrSplit[0];
                    this.f9044f.setText(strArrSplit[1]);
                    this.f9043e.setText("+" + str);
                }
                if (C0775gp.m15904k()) {
                    xdl0.M(this.f9051m, true);
                    xdl0.E0(this.f9051m, new View.OnClickListener() { // from class: l.oq60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f18327a.m12888e0(view);
                        }
                    });
                }
                this.f9054p.setText(R$string.f248o2);
                break;
            case "signup":
                this.f9050l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
                ((PhoneNumberInputAct) this.f9323a).setTitle(R$string.f161a);
                this.f9054p.setText(R$string.f173c);
                this.f9050l.setVisibility(8);
                ((PhoneNumberInputAct) this.f9323a).lmdStart(30000);
                VLinear.b.c();
                xdl0.M(this.f9051m, false);
                break;
            case "ban-appeal":
                ((PhoneNumberInputAct) this.f9323a).setTitle(R$string.f31A);
                this.f9054p.setText(R$string.f179d);
                xdl0.M0(this.f9045g, true);
                xdl0.M(this.f9050l, false);
                xdl0.M(this.f9052n, false);
                xdl0.M(this.f9051m, false);
                break;
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12864F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m12894j0() {
        this.f9054p.setActivated(((this.f9044f.getVisibility() != 0 || (!TextUtils.isEmpty(this.f9044f.getText()) && this.f9055q.m16870n1(this.f9044f.getText().toString()))) && (this.f9050l.getVisibility() != 0 || (!TextUtils.isEmpty(this.f9050l.getText()) && this.f9050l.getText().length() >= 6))) ? false : true);
    }

    /* JADX INFO: renamed from: k0 */
    public void m12895k0() {
        this.f9044f.requestFocus();
    }
}
