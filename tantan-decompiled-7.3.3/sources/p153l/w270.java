package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.account.PhoneVerificationAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.data.LinkAction;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;
import p151v.VButton_FakeShadow;
import p151v.VButton_FakeShadowSmall;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class w270 extends jbf0<l270, PhoneVerificationAct> {

    /* JADX INFO: renamed from: c */
    public TextView f186875c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit_FakeSpinner f186876d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f186877e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f186878f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadowSmall f186879g;

    /* JADX INFO: renamed from: h */
    public VText f186880h;

    /* JADX INFO: renamed from: i */
    public VText f186881i;

    /* JADX INFO: renamed from: j */
    public VButton_FakeShadow f186882j;

    /* JADX INFO: renamed from: k */
    public l270 f186883k;

    /* JADX INFO: renamed from: l */
    public int f186884l;

    /* JADX INFO: renamed from: m */
    public boolean f186885m;

    /* JADX INFO: renamed from: n */
    public boolean f186886n;

    /* JADX INFO: renamed from: o */
    public boolean f186887o;

    public w270(@NonNull PhoneVerificationAct phoneVerificationAct) {
        super(phoneVerificationAct);
        this.f186884l = 0;
        this.f186885m = false;
        this.f186886n = false;
        this.f186887o = false;
    }

    /* JADX INFO: renamed from: z */
    public static void m204551z(TextView textView, Act act) {
        textView.setText(Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(0).f143479b);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: A */
    public void m204552A(final VerifyReason verifyReason, final SignInData signInData, boolean z, boolean z2, boolean z3, final String str) {
        m204551z(this.f186876d, this.f119872a);
        if (NullChecker.m82486a(WelcomeAct.f17778h)) {
            this.f186876d.setText(WelcomeAct.f17778h);
        }
        if (NullChecker.m82486a(WelcomeAct.f17777g) && !TEnum.equals(verifyReason, VerifyReason.change_phone)) {
            this.f186877e.setText(WelcomeAct.f17777g);
            this.f186878f.requestFocus();
        }
        if (l51.m152882B(((PhoneVerificationAct) this.f119872a).getLocalClassName())) {
            this.f186883k.m152583d1();
        } else {
            bnl0.m105591y(this.f186879g, this.f186877e.getText().length() > 0);
        }
        ((PhoneVerificationAct) this.f119872a).getSupportActionBar().mo102170C(AccountModule.f16756c.m29297M1().mo120706a(this.f119872a));
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                ((PhoneVerificationAct) this.f119872a).setTitle(R$string.f16895a3);
                break;
            case "change-phone":
                ((PhoneVerificationAct) this.f119872a).setTitle(R$string.f16806J);
                this.f186882j.setText(R$string.f16915e);
                break;
            case "signin":
                this.f186887o = true;
                ((PhoneVerificationAct) this.f119872a).setTitle(R$string.f16932g4);
                ((PhoneVerificationAct) this.f119872a).getSupportActionBar().mo102169B(bbc0.f75830P1);
                this.f186876d.setVisibility(8);
                this.f186877e.setVisibility(8);
                this.f186882j.setText(R$string.f16978o2);
                this.f186879g.setVisibility(8);
                ViewGroup viewGroup = (ViewGroup) this.f186880h.getParent();
                int iM105530P = bnl0.m105530P(this.f186880h);
                viewGroup.removeViewAt(iM105530P);
                viewGroup.addView(this.f186880h, iM105530P + 1);
                this.f186880h.setGravity(1);
                bnl0.m105554f0(this.f186880h, qa00.m175859d(24.0f));
                this.f186881i.setText(((PhoneVerificationAct) this.f119872a).getString(R$string.f16920e4, bsj0.m106289y(signInData.username)));
                break;
            case "signup":
                ((PhoneVerificationAct) this.f119872a).setTitle(R$string.f17010u3);
                ((PhoneVerificationAct) this.f119872a).lmdStart(30000);
                VLinear.f210051b.m224310c();
                break;
            case "bind_mobile":
                if (!z) {
                    ((PhoneVerificationAct) this.f119872a).getSupportActionBar().mo102196w(false);
                    act().setSwipeBackEnable(false);
                }
                if (z2 && !z3) {
                    String strM152582c1 = this.f186883k.m152582c1(this.f119872a);
                    if (!TextUtils.isEmpty(strM152582c1)) {
                        this.f186877e.setText(strM152582c1);
                    }
                }
                HoldAct holdact = this.f119872a;
                ((PhoneVerificationAct) holdact).setTitle(((PhoneVerificationAct) holdact).string(R$string.f16766B));
                this.f186882j.setText(R$string.f16903c);
                this.f186875c.setText(((PhoneVerificationAct) this.f119872a).getString(R$string.f16968m4));
                bnl0.m105525M0(this.f186875c, true);
                this.f186877e.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.m270
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f134529a.m204553B((CharSequence) obj);
                    }
                }));
                this.f186878f.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.n270
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f139817a.m204554C((CharSequence) obj);
                    }
                }));
                break;
        }
        this.f186876d.setOnClickListener(new View.OnClickListener() { // from class: l.o270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144725a.m204556F(view);
            }
        });
        this.f186877e.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.p270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150247a.m204557G((CharSequence) obj);
            }
        }));
        this.f186879g.setOnClickListener(new View.OnClickListener() { // from class: l.q270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155303a.m204558H(verifyReason, signInData, view);
            }
        });
        if (!l51.m152882B(((PhoneVerificationAct) this.f119872a).getLocalClassName()) && TEnum.equals(verifyReason, VerifyReason.signin)) {
            bnl0.m105573p(this.f186879g);
        }
        psd0.m173625r(this.f186877e.m224373H(), this.f186878f.m224373H(), new rcj() { // from class: l.r270
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(!((CharSequence) obj).toString().isEmpty() && ((CharSequence) obj2).length() >= 4);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.s270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165867a.m204559I((Boolean) obj);
            }
        }));
        this.f186882j.setOnClickListener(new View.OnClickListener() { // from class: l.t270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171720a.m204560J(verifyReason, signInData, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m204553B(CharSequence charSequence) {
        if (charSequence.length() <= 0 || this.f186885m) {
            return;
        }
        this.f186885m = true;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m204554C(CharSequence charSequence) {
        if (charSequence.length() <= 0 || this.f186886n) {
            return;
        }
        this.f186886n = true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m204555E(String str) {
        this.f186876d.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m204556F(View view) {
        ((PhoneVerificationAct) this.f119872a).hideInput();
        C20102sm.m186686b0(this.f119872a, new y20() { // from class: l.u270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177187a.m204555E((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m204557G(CharSequence charSequence) {
        m204569S();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m204558H(VerifyReason verifyReason, SignInData signInData, View view) {
        VerifyData verifyDataM204573y = m204573y(true, verifyReason, signInData);
        bnl0.m105591y(this.f186879g, false);
        this.f186879g.setChecked(true);
        this.f186879g.setText("...");
        this.f186883k.m152594q1(verifyDataM204573y);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m204559I(Boolean bool) {
        bnl0.m105591y(this.f186882j, bool.booleanValue());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m204560J(VerifyReason verifyReason, SignInData signInData, String str, View view) {
        ((PhoneVerificationAct) this.f119872a).progress(R$string.f16946j0);
        VerifyData verifyDataM204573y = m204573y(false, verifyReason, signInData);
        verifyDataM204573y.action = verifyReason;
        verifyDataM204573y.countryCode = bsj0.m106251I(this.f186876d);
        verifyDataM204573y.mobileNumber = bsj0.m106255M(this.f186877e);
        if (TextUtils.equals(LinkAction.deeplink, str)) {
            verifyDataM204573y.action = VerifyReason.get(VerifyReason.bind_mobile_force_login);
        }
        this.f186883k.m152597t1(verifyDataM204573y);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m204561K(View view) {
        bnl0.m105573p(this.f186879g);
    }

    /* JADX INFO: renamed from: L */
    public boolean m204562L(MenuItem menuItem) {
        if (menuItem.getItemId() != wcc0.f188436c0) {
            return true;
        }
        ((PhoneVerificationAct) this.f119872a).m51642n2();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void m204563M() {
        gsj0.m132063g(this.f186876d, this.f186877e);
    }

    /* JADX INFO: renamed from: N */
    public void m204564N() {
        this.f186879g.setClickable(true);
        this.f186879g.setChecked(false);
        this.f186879g.setText(R$string.f16995r3);
    }

    /* JADX INFO: renamed from: O */
    public void m204565O() {
        this.f186879g.setChecked(true);
        this.f186879g.setClickable(false);
        this.f186879g.setText(R$string.f16765A3);
    }

    /* JADX INFO: renamed from: P */
    public void m204566P() {
        bsj0.m106260R(this.f119872a);
    }

    /* JADX INFO: renamed from: Q */
    public void m204567Q(long j) {
        int i = (int) (60 - j);
        this.f186880h.setOnClickListener(null);
        this.f186880h.setText(((PhoneVerificationAct) this.f119872a).getString(i <= 1 ? R$string.f16931g3 : R$string.f16937h3, Integer.valueOf(i)));
        this.f186880h.setTextColor(-7500403);
    }

    /* JADX INFO: renamed from: R */
    public void m204568R(VerifyReason verifyReason) {
        this.f186879g.setChecked(false);
        this.f186879g.setText(R$string.f16995r3);
        boolean zEquals = TEnum.equals(verifyReason, VerifyReason.signin);
        VText vText = this.f186880h;
        if (zEquals) {
            vText.setText(R$string.f16926f4);
            this.f186880h.setOnClickListener(new View.OnClickListener() { // from class: l.v270
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182080a.m204561K(view);
                }
            });
            this.f186880h.setTextColor(-12537276);
        } else {
            vText.setOnClickListener(null);
            this.f186880h.setText("");
        }
        m204569S();
    }

    /* JADX INFO: renamed from: S */
    public void m204569S() {
        if (this.f186879g.isChecked()) {
            return;
        }
        boolean zIsEmpty = this.f186877e.getText().toString().isEmpty();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f186879g;
        if (zIsEmpty) {
            bnl0.m105591y(vButton_FakeShadowSmall, false);
        } else {
            bnl0.m105591y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m204570T() {
        this.f186878f.requestFocus();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m204571w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public View m204571w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x270.m209130b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.jbf0, p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(l270 l270Var) {
        this.f186883k = l270Var;
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public VerifyData m204573y(@Deprecated boolean z, VerifyReason verifyReason, SignInData signInData) {
        VerifyData verifyData = new VerifyData();
        if (z) {
            verifyData.language = q8g0.m175820y();
        } else {
            verifyData.code = bsj0.m106251I(this.f186878f);
        }
        verifyData.action = verifyReason;
        verifyData.codeLength = 6;
        if (!TEnum.equals(verifyReason, VerifyReason.signin)) {
            verifyData.countryCode = bsj0.m106251I(this.f186876d);
            verifyData.mobileNumber = bsj0.m106255M(this.f186877e);
            return verifyData;
        }
        String[] strArrSplit = signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        verifyData.countryCode = Integer.parseInt(strArrSplit[0]);
        verifyData.mobileNumber = strArrSplit[1];
        return verifyData;
    }
}
