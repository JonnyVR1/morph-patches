package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.account.PhoneVerificationAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.data.LinkAction;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;
import p147v.VButton_FakeShadow;
import p147v.VButton_FakeShadowSmall;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class qu60 extends c3f0<fu60, PhoneVerificationAct> {

    /* JADX INFO: renamed from: c */
    public TextView f156440c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit_FakeSpinner f156441d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f156442e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f156443f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadowSmall f156444g;

    /* JADX INFO: renamed from: h */
    public VText f156445h;

    /* JADX INFO: renamed from: i */
    public VText f156446i;

    /* JADX INFO: renamed from: j */
    public VButton_FakeShadow f156447j;

    /* JADX INFO: renamed from: k */
    public fu60 f156448k;

    /* JADX INFO: renamed from: l */
    public int f156449l;

    /* JADX INFO: renamed from: m */
    public boolean f156450m;

    /* JADX INFO: renamed from: n */
    public boolean f156451n;

    /* JADX INFO: renamed from: o */
    public boolean f156452o;

    public qu60(@NonNull PhoneVerificationAct phoneVerificationAct) {
        super(phoneVerificationAct);
        this.f156449l = 0;
        this.f156450m = false;
        this.f156451n = false;
        this.f156452o = false;
    }

    /* JADX INFO: renamed from: z */
    public static void m176552z(TextView textView, Act act) {
        textView.setText(Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(0).f204372b);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: A */
    public void m176553A(final VerifyReason verifyReason, final SignInData signInData, boolean z, boolean z2, boolean z3, final String str) {
        m176552z(this.f156441d, this.f78941a);
        if (NullChecker.m81303a(WelcomeAct.f17059h)) {
            this.f156441d.setText(WelcomeAct.f17059h);
        }
        if (NullChecker.m81303a(WelcomeAct.f17058g) && !TEnum.equals(verifyReason, VerifyReason.change_phone)) {
            this.f156442e.setText(WelcomeAct.f17058g);
            this.f156443f.requestFocus();
        }
        if (e51.m114737B(((PhoneVerificationAct) this.f78941a).getLocalClassName())) {
            this.f156448k.m123149d1();
        } else {
            xdl0.m208411y(this.f156444g, this.f156442e.getText().length() > 0);
        }
        ((PhoneVerificationAct) this.f78941a).getSupportActionBar().mo134113C(AccountModule.f16037c.m28298M1().mo95157a(this.f78941a));
        String string = verifyReason.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                ((PhoneVerificationAct) this.f78941a).setTitle(R$string.f16176a3);
                break;
            case "change-phone":
                ((PhoneVerificationAct) this.f78941a).setTitle(R$string.f16087J);
                this.f156447j.setText(R$string.f16196e);
                break;
            case "signin":
                this.f156452o = true;
                ((PhoneVerificationAct) this.f78941a).setTitle(R$string.f16213g4);
                ((PhoneVerificationAct) this.f78941a).getSupportActionBar().mo134112B(v2c0.f179424P1);
                this.f156441d.setVisibility(8);
                this.f156442e.setVisibility(8);
                this.f156447j.setText(R$string.f16259o2);
                this.f156444g.setVisibility(8);
                ViewGroup viewGroup = (ViewGroup) this.f156445h.getParent();
                int iM208350P = xdl0.m208350P(this.f156445h);
                viewGroup.removeViewAt(iM208350P);
                viewGroup.addView(this.f156445h, iM208350P + 1);
                this.f156445h.setGravity(1);
                xdl0.m208374f0(this.f156445h, t100.m186890d(24.0f));
                this.f156446i.setText(((PhoneVerificationAct) this.f78941a).getString(R$string.f16201e4, yij0.m214969y(signInData.username)));
                break;
            case "signup":
                ((PhoneVerificationAct) this.f78941a).setTitle(R$string.f16291u3);
                ((PhoneVerificationAct) this.f78941a).lmdStart(30000);
                VLinear.f209129b.m223064c();
                break;
            case "bind_mobile":
                if (!z) {
                    ((PhoneVerificationAct) this.f78941a).getSupportActionBar().mo134136w(false);
                    act().setSwipeBackEnable(false);
                }
                if (z2 && !z3) {
                    String strM123148c1 = this.f156448k.m123148c1(this.f78941a);
                    if (!TextUtils.isEmpty(strM123148c1)) {
                        this.f156442e.setText(strM123148c1);
                    }
                }
                HoldAct holdact = this.f78941a;
                ((PhoneVerificationAct) holdact).setTitle(((PhoneVerificationAct) holdact).string(R$string.f16047B));
                this.f156447j.setText(R$string.f16184c);
                this.f156440c.setText(((PhoneVerificationAct) this.f78941a).getString(R$string.f16249m4));
                xdl0.m208345M0(this.f156440c, true);
                this.f156442e.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.gu60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f104379a.m176554B((CharSequence) obj);
                    }
                }));
                this.f156443f.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.hu60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f109519a.m176555C((CharSequence) obj);
                    }
                }));
                break;
        }
        this.f156441d.setOnClickListener(new View.OnClickListener() { // from class: l.iu60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114976a.m176557F(view);
            }
        });
        this.f156442e.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.ju60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119743a.m176558G((CharSequence) obj);
            }
        }));
        this.f156444g.setOnClickListener(new View.OnClickListener() { // from class: l.ku60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124662a.m176559H(verifyReason, signInData, view);
            }
        });
        if (!e51.m114737B(((PhoneVerificationAct) this.f78941a).getLocalClassName()) && TEnum.equals(verifyReason, VerifyReason.signin)) {
            xdl0.m208393p(this.f156444g);
        }
        mkd0.m154984r(this.f156442e.m223127H(), this.f156443f.m223127H(), new x9j() { // from class: l.lu60
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(!((CharSequence) obj).toString().isEmpty() && ((CharSequence) obj2).length() >= 4);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.mu60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135759a.m176560I((Boolean) obj);
            }
        }));
        this.f156447j.setOnClickListener(new View.OnClickListener() { // from class: l.nu60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140577a.m176561J(verifyReason, signInData, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m176554B(CharSequence charSequence) {
        if (charSequence.length() <= 0 || this.f156450m) {
            return;
        }
        this.f156450m = true;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m176555C(CharSequence charSequence) {
        if (charSequence.length() <= 0 || this.f156451n) {
            return;
        }
        this.f156451n = true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m176556E(String str) {
        this.f156441d.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m176557F(View view) {
        ((PhoneVerificationAct) this.f78941a).hideInput();
        C21176xm.m210001b0(this.f78941a, new e30() { // from class: l.ou60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145671a.m176556E((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m176558G(CharSequence charSequence) {
        m176570S();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m176559H(VerifyReason verifyReason, SignInData signInData, View view) {
        VerifyData verifyDataM176574y = m176574y(true, verifyReason, signInData);
        xdl0.m208411y(this.f156444g, false);
        this.f156444g.setChecked(true);
        this.f156444g.setText("...");
        this.f156448k.m123160q1(verifyDataM176574y);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m176560I(Boolean bool) {
        xdl0.m208411y(this.f156447j, bool.booleanValue());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m176561J(VerifyReason verifyReason, SignInData signInData, String str, View view) {
        ((PhoneVerificationAct) this.f78941a).progress(R$string.f16227j0);
        VerifyData verifyDataM176574y = m176574y(false, verifyReason, signInData);
        verifyDataM176574y.action = verifyReason;
        verifyDataM176574y.countryCode = yij0.m214931I(this.f156441d);
        verifyDataM176574y.mobileNumber = yij0.m214935M(this.f156442e);
        if (TextUtils.equals(LinkAction.deeplink, str)) {
            verifyDataM176574y.action = VerifyReason.get(VerifyReason.bind_mobile_force_login);
        }
        this.f156448k.m123163t1(verifyDataM176574y);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m176562K(View view) {
        xdl0.m208393p(this.f156444g);
    }

    /* JADX INFO: renamed from: L */
    public boolean m176563L(MenuItem menuItem) {
        if (menuItem.getItemId() != q4c0.f152588c0) {
            return true;
        }
        ((PhoneVerificationAct) this.f78941a).m50458m2();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void m176564M() {
        djj0.m112086g(this.f156441d, this.f156442e);
    }

    /* JADX INFO: renamed from: N */
    public void m176565N() {
        this.f156444g.setClickable(true);
        this.f156444g.setChecked(false);
        this.f156444g.setText(R$string.f16276r3);
    }

    /* JADX INFO: renamed from: O */
    public void m176566O() {
        this.f156444g.setChecked(true);
        this.f156444g.setClickable(false);
        this.f156444g.setText(R$string.f16046A3);
    }

    /* JADX INFO: renamed from: P */
    public void m176567P() {
        yij0.m214940R(this.f78941a);
    }

    /* JADX INFO: renamed from: Q */
    public void m176568Q(long j) {
        int i = (int) (60 - j);
        this.f156445h.setOnClickListener(null);
        this.f156445h.setText(((PhoneVerificationAct) this.f78941a).getString(i <= 1 ? R$string.f16212g3 : R$string.f16218h3, Integer.valueOf(i)));
        this.f156445h.setTextColor(-7500403);
    }

    /* JADX INFO: renamed from: R */
    public void m176569R(VerifyReason verifyReason) {
        this.f156444g.setChecked(false);
        this.f156444g.setText(R$string.f16276r3);
        boolean zEquals = TEnum.equals(verifyReason, VerifyReason.signin);
        VText vText = this.f156445h;
        if (zEquals) {
            vText.setText(R$string.f16207f4);
            this.f156445h.setOnClickListener(new View.OnClickListener() { // from class: l.pu60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151253a.m176562K(view);
                }
            });
            this.f156445h.setTextColor(-12537276);
        } else {
            vText.setOnClickListener(null);
            this.f156445h.setText("");
        }
        m176570S();
    }

    /* JADX INFO: renamed from: S */
    public void m176570S() {
        if (this.f156444g.isChecked()) {
            return;
        }
        boolean zIsEmpty = this.f156442e.getText().toString().isEmpty();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f156444g;
        if (zIsEmpty) {
            xdl0.m208411y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.m208411y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m176571T() {
        this.f156443f.requestFocus();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m176572w(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public View m176572w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ru60.m180862b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.c3f0, p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fu60 fu60Var) {
        this.f156448k = fu60Var;
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public VerifyData m176574y(@Deprecated boolean z, VerifyReason verifyReason, SignInData signInData) {
        VerifyData verifyData = new VerifyData();
        if (z) {
            verifyData.language = i0g0.m133885y();
        } else {
            verifyData.code = yij0.m214931I(this.f156443f);
        }
        verifyData.action = verifyReason;
        verifyData.codeLength = 6;
        if (!TEnum.equals(verifyReason, VerifyReason.signin)) {
            verifyData.countryCode = yij0.m214931I(this.f156441d);
            verifyData.mobileNumber = yij0.m214935M(this.f156442e);
            return verifyData;
        }
        String[] strArrSplit = signInData.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        verifyData.countryCode = Integer.parseInt(strArrSplit[0]);
        verifyData.mobileNumber = strArrSplit[1];
        return verifyData;
    }
}
