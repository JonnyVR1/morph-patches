package p006l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.account.PhoneVerificationAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.i0g0;
import l.mkd0;
import l.t100;
import l.x9j;
import l.xdl0;
import l.yij0;
import l.zqb;
import v.VButton_FakeShadow;
import v.VButton_FakeShadowSmall;
import v.VLinear;
import v.VMaterialEdit;
import v.VMaterialEdit_FakeSpinner;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qu60 extends c3f0<fu60, PhoneVerificationAct> {

    /* JADX INFO: renamed from: c */
    public TextView f20062c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit_FakeSpinner f20063d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f20064e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f20065f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadowSmall f20066g;

    /* JADX INFO: renamed from: h */
    public VText f20067h;

    /* JADX INFO: renamed from: i */
    public VText f20068i;

    /* JADX INFO: renamed from: j */
    public VButton_FakeShadow f20069j;

    /* JADX INFO: renamed from: k */
    public fu60 f20070k;

    /* JADX INFO: renamed from: l */
    public int f20071l;

    /* JADX INFO: renamed from: m */
    public boolean f20072m;

    /* JADX INFO: renamed from: n */
    public boolean f20073n;

    /* JADX INFO: renamed from: o */
    public boolean f20074o;

    public qu60(@NonNull PhoneVerificationAct phoneVerificationAct) {
        super(phoneVerificationAct);
        this.f20071l = 0;
        this.f20072m = false;
        this.f20073n = false;
        this.f20074o = false;
    }

    /* JADX INFO: renamed from: z */
    public static void m22393z(TextView textView, Act act) {
        textView.setText("+" + ((zqb) zqb.d.get(0)).b);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: A */
    public void m22394A(final VerifyReason verifyReason, final SignInData signInData, boolean z, boolean z2, boolean z3, final String str) {
        m22393z(this.f20063d, this.f9323a);
        if (NullChecker.a(WelcomeAct.f1048h)) {
            this.f20063d.setText(WelcomeAct.f1048h);
        }
        if (NullChecker.a(WelcomeAct.f1047g) && !TEnum.equals(verifyReason, "change-phone")) {
            this.f20064e.setText(WelcomeAct.f1047g);
            this.f20065f.requestFocus();
        }
        if (e51.B(((PhoneVerificationAct) this.f9323a).getLocalClassName())) {
            this.f20070k.m15485d1();
        } else {
            xdl0.y(this.f20066g, this.f20064e.getText().length() > 0);
        }
        ((PhoneVerificationAct) this.f9323a).getSupportActionBar().C(AccountModule.f26c.m193M1().mo11759a(this.f9323a));
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                ((PhoneVerificationAct) this.f9323a).setTitle(R$string.f165a3);
                break;
            case "change-phone":
                ((PhoneVerificationAct) this.f9323a).setTitle(R$string.f76J);
                this.f20069j.setText(R$string.f185e);
                break;
            case "signin":
                this.f20074o = true;
                ((PhoneVerificationAct) this.f9323a).setTitle(R$string.f202g4);
                ((PhoneVerificationAct) this.f9323a).getSupportActionBar().B(v2c0.f23988P1);
                this.f20063d.setVisibility(8);
                this.f20064e.setVisibility(8);
                this.f20069j.setText(R$string.f248o2);
                this.f20066g.setVisibility(8);
                ViewGroup viewGroup = (ViewGroup) this.f20067h.getParent();
                int iP = xdl0.P(this.f20067h);
                viewGroup.removeViewAt(iP);
                viewGroup.addView((View) this.f20067h, iP + 1);
                this.f20067h.setGravity(1);
                xdl0.f0(this.f20067h, t100.d(24.0f));
                this.f20068i.setText(((PhoneVerificationAct) this.f9323a).getString(R$string.f190e4, yij0.y(signInData.username)));
                break;
            case "signup":
                ((PhoneVerificationAct) this.f9323a).setTitle(R$string.f280u3);
                ((PhoneVerificationAct) this.f9323a).lmdStart(30000);
                VLinear.b.c();
                break;
            case "bind_mobile":
                if (!z) {
                    ((PhoneVerificationAct) this.f9323a).getSupportActionBar().w(false);
                    act().setSwipeBackEnable(false);
                }
                if (z2 && !z3) {
                    String strM15484c1 = this.f20070k.m15484c1(this.f9323a);
                    if (!TextUtils.isEmpty(strM15484c1)) {
                        this.f20064e.setText(strM15484c1);
                    }
                }
                HoldAct holdact = this.f9323a;
                ((PhoneVerificationAct) holdact).setTitle(((PhoneVerificationAct) holdact).string(R$string.f36B));
                this.f20069j.setText(R$string.f173c);
                this.f20062c.setText(((PhoneVerificationAct) this.f9323a).getString(R$string.f238m4));
                xdl0.M0(this.f20062c, true);
                this.f20064e.H().subscribe(mkd0.G(new e30() { // from class: l.gu60
                    public final void call(Object obj) {
                        this.f13509a.m22395B((CharSequence) obj);
                    }
                }));
                this.f20065f.H().subscribe(mkd0.G(new e30() { // from class: l.hu60
                    public final void call(Object obj) {
                        this.f14082a.m22396C((CharSequence) obj);
                    }
                }));
                break;
        }
        this.f20063d.setOnClickListener(new View.OnClickListener() { // from class: l.iu60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14785a.m22398F(view);
            }
        });
        this.f20064e.H().subscribe(mkd0.G(new e30() { // from class: l.ju60
            public final void call(Object obj) {
                this.f15426a.m22399G((CharSequence) obj);
            }
        }));
        this.f20066g.setOnClickListener(new View.OnClickListener() { // from class: l.ku60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15998a.m22400H(verifyReason, signInData, view);
            }
        });
        if (!e51.B(((PhoneVerificationAct) this.f9323a).getLocalClassName()) && TEnum.equals(verifyReason, "signin")) {
            xdl0.p(this.f20066g);
        }
        mkd0.r(this.f20064e.H(), this.f20065f.H(), new x9j() { // from class: l.lu60
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(!((CharSequence) obj).toString().isEmpty() && ((CharSequence) obj2).length() >= 4);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.mu60
            public final void call(Object obj) {
                this.f17278a.m22401I((Boolean) obj);
            }
        }));
        this.f20069j.setOnClickListener(new View.OnClickListener() { // from class: l.nu60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17861a.m22402J(verifyReason, signInData, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m22395B(CharSequence charSequence) {
        if (charSequence.length() <= 0 || this.f20072m) {
            return;
        }
        this.f20072m = true;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m22396C(CharSequence charSequence) {
        if (charSequence.length() <= 0 || this.f20073n) {
            return;
        }
        this.f20073n = true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m22397E(String str) {
        this.f20063d.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m22398F(View view) {
        ((PhoneVerificationAct) this.f9323a).hideInput();
        C1444xm.m27308b0(this.f9323a, new e30() { // from class: l.ou60
            public final void call(Object obj) {
                this.f18376a.m22397E((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m22399G(CharSequence charSequence) {
        m22411S();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m22400H(VerifyReason verifyReason, SignInData signInData, View view) {
        VerifyData verifyDataM22415y = m22415y(true, verifyReason, signInData);
        xdl0.y(this.f20066g, false);
        this.f20066g.setChecked(true);
        this.f20066g.setText("...");
        this.f20070k.m15496q1(verifyDataM22415y);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m22401I(Boolean bool) {
        xdl0.y(this.f20069j, bool.booleanValue());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22402J(VerifyReason verifyReason, SignInData signInData, String str, View view) {
        ((PhoneVerificationAct) this.f9323a).progress(R$string.f216j0);
        VerifyData verifyDataM22415y = m22415y(false, verifyReason, signInData);
        verifyDataM22415y.action = verifyReason;
        verifyDataM22415y.countryCode = yij0.I(this.f20063d);
        verifyDataM22415y.mobileNumber = yij0.M(this.f20064e);
        if (TextUtils.equals("deeplink", str)) {
            verifyDataM22415y.action = VerifyReason.get("bind_mobile_force_login");
        }
        this.f20070k.m15499t1(verifyDataM22415y);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m22403K(View view) {
        xdl0.p(this.f20066g);
    }

    /* JADX INFO: renamed from: L */
    public boolean m22404L(MenuItem menuItem) {
        if (menuItem.getItemId() != q4c0.f19598c0) {
            return true;
        }
        ((PhoneVerificationAct) this.f9323a).finish();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void m22405M() {
        djj0.m14049g(this.f20063d, this.f20064e);
    }

    /* JADX INFO: renamed from: N */
    public void m22406N() {
        this.f20066g.setClickable(true);
        this.f20066g.setChecked(false);
        this.f20066g.setText(R$string.f265r3);
    }

    /* JADX INFO: renamed from: O */
    public void m22407O() {
        this.f20066g.setChecked(true);
        this.f20066g.setClickable(false);
        this.f20066g.setText(R$string.f35A3);
    }

    /* JADX INFO: renamed from: P */
    public void m22408P() {
        yij0.R(this.f9323a);
    }

    /* JADX INFO: renamed from: Q */
    public void m22409Q(long j) {
        int i = (int) (60 - j);
        this.f20067h.setOnClickListener(null);
        this.f20067h.setText(((PhoneVerificationAct) this.f9323a).getString(i <= 1 ? R$string.f201g3 : R$string.f207h3, Integer.valueOf(i)));
        this.f20067h.setTextColor(-7500403);
    }

    /* JADX INFO: renamed from: R */
    public void m22410R(VerifyReason verifyReason) {
        this.f20066g.setChecked(false);
        this.f20066g.setText(R$string.f265r3);
        boolean zEquals = TEnum.equals(verifyReason, "signin");
        VText vText = this.f20067h;
        if (zEquals) {
            vText.setText(R$string.f196f4);
            this.f20067h.setOnClickListener(new View.OnClickListener() { // from class: l.pu60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19337a.m22403K(view);
                }
            });
            this.f20067h.setTextColor(-12537276);
        } else {
            vText.setOnClickListener(null);
            this.f20067h.setText("");
        }
        m22411S();
    }

    /* JADX INFO: renamed from: S */
    public void m22411S() {
        if (this.f20066g.isChecked()) {
            return;
        }
        boolean zIsEmpty = this.f20064e.getText().toString().isEmpty();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f20066g;
        if (zIsEmpty) {
            xdl0.y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m22412T() {
        this.f20065f.requestFocus();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22413w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public View m22413w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ru60.m22950b(this, layoutInflater, viewGroup);
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo476i1(fu60 fu60Var) {
        this.f20070k = fu60Var;
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public VerifyData m22415y(@Deprecated boolean z, VerifyReason verifyReason, SignInData signInData) {
        VerifyData verifyData = new VerifyData();
        if (z) {
            verifyData.language = i0g0.y();
        } else {
            verifyData.code = yij0.I(this.f20065f);
        }
        verifyData.action = verifyReason;
        verifyData.codeLength = 6;
        if (!TEnum.equals(verifyReason, "signin")) {
            verifyData.countryCode = yij0.I(this.f20063d);
            verifyData.mobileNumber = yij0.M(this.f20064e);
            return verifyData;
        }
        String[] strArrSplit = signInData.username.split(" ");
        verifyData.countryCode = Integer.parseInt(strArrSplit[0]);
        verifyData.mobileNumber = strArrSplit[1];
        return verifyData;
    }
}
