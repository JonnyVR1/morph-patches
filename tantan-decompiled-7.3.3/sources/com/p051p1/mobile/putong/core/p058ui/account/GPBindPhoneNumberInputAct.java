package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.jxd0;
import p153l.nsb;
import p153l.o1j0;
import p153l.psd0;
import p153l.q8g0;
import p153l.rfj;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class GPBindPhoneNumberInputAct extends PutongAct {

    /* JADX INFO: renamed from: m */
    public static String f29061m;

    /* JADX INFO: renamed from: n */
    public static int f29062n;

    /* JADX INFO: renamed from: o */
    public static final C22508b<Boolean> f29063o = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public VLinear f29064c;

    /* JADX INFO: renamed from: d */
    public VText f29065d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f29066e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit_FakeSpinner f29067f;

    /* JADX INFO: renamed from: g */
    public VMaterialEdit f29068g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f29069h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f29070i = null;

    /* JADX INFO: renamed from: j */
    public jxd0 f29071j = new jxd0("back_intercept" + CoreModule.m30929H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: k */
    public String f29072k;

    /* JADX INFO: renamed from: l */
    public boolean f29073l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.GPBindPhoneNumberInputAct$a */
    public class RunnableC8439a implements Runnable {
        public RunnableC8439a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPBindPhoneNumberInputAct.this.f29068g.requestFocus();
            GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct = GPBindPhoneNumberInputAct.this;
            gPBindPhoneNumberInputAct.act.showInput(gPBindPhoneNumberInputAct.f29068g, 1);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m45303g2(Act act) {
        return new Intent(act, (Class<?>) GPBindPhoneNumberInputAct.class);
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m45304h2(Act act, boolean z, String str) {
        Intent intentM45303g2 = m45303g2(act);
        intentM45303g2.putExtra("is_sign_up", z);
        intentM45303g2.putExtra("custom_description", str);
        return intentM45303g2;
    }

    /* JADX INFO: renamed from: i2 */
    private boolean m45305i2(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!m45312s2()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: k2 */
    public static C22421c<Boolean> m45306k2() {
        return f29063o.asObservable();
    }

    /* JADX INFO: renamed from: l2 */
    private int m45307l2() {
        return NullChecker.m82487b(this.f29067f) ? Integer.valueOf(this.f29067f.getText().toString().substring(1)).intValue() : nsb.f143476d.get(0).f143479b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (bundle == null) {
            String str = this.f29073l ? "afterSignup" : "accountSecurityPage";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bindType", str);
                this.pageHelper.m152780o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m45308n2(View view) {
        CoreModule.m30929H().dialogCCode(this, new y20() { // from class: l.qfj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157304a.m45316m2((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m45309o2(CharSequence charSequence) {
        this.f29072k = bsj0.m106255M(this.f29068g);
        m45314v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m45310p2(View view) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f29068g.getText());
        VMaterialEdit vMaterialEdit = this.f29068g;
        if (zIsEmpty) {
            vMaterialEdit.setError(string(R$string.f28556E3));
        } else if (m45305i2(vMaterialEdit.getText().toString())) {
            m45313u2();
        } else {
            this.f29068g.setError(act().getString(R$string.f28592L3));
        }
    }

    /* JADX INFO: renamed from: r */
    private void m45311r() {
        if (!TextUtils.isEmpty(this.f29070i)) {
            this.f29065d.setText(this.f29070i);
        }
        int i = nsb.f143476d.get(0).f143479b;
        this.f29067f.setText(Marker.ANY_NON_NULL_MARKER + i);
        bnl0.m105509E0(this.f29067f, new View.OnClickListener() { // from class: l.lfj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131851a.m45308n2(view);
            }
        });
        this.f29068g.m224374I(false).subscribe(psd0.m173596G(new y20() { // from class: l.mfj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136651a.m45309o2((CharSequence) obj);
            }
        }));
        bnl0.m105509E0(this.f29069h, new View.OnClickListener() { // from class: l.nfj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141740a.m45310p2(view);
            }
        });
        m45314v2();
    }

    /* JADX INFO: renamed from: s2 */
    private boolean m45312s2() {
        return m45307l2() == 86;
    }

    /* JADX INFO: renamed from: u2 */
    private void m45313u2() {
        final int iM45307l2 = m45307l2();
        if (TextUtils.equals(this.f29072k, f29061m) && iM45307l2 == f29062n) {
            startActivityForResult(GPBindVerifyCodeInputAct.m45344r2(this, m45307l2(), this.f29072k, this.f29073l), 64);
            return;
        }
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = q8g0.m175820y();
        verifyDataNew_.countryCode = iM45307l2;
        verifyDataNew_.mobileNumber = this.f29072k;
        verifyDataNew_.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyDataNew_.codeLength = 4;
        progress(R$string.f28619R0);
        duringCreated(CoreModule.m30929H().send(verifyDataNew_)).subscribe(psd0.m173600K(new y20() { // from class: l.ofj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147079a.m45317q2(iM45307l2, (uxj0) obj);
            }
        }, new y20() { // from class: l.pfj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152181a.m45318r2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: v2 */
    private void m45314v2() {
        this.f29069h.setActivated(!(this.f29068g.getVisibility() != 0 || (!TextUtils.isEmpty(this.f29068g.getText()) && m45305i2(this.f29068g.getText().toString()))));
    }

    /* JADX INFO: renamed from: e2 */
    public View m45315e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rfj.m181212b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM45315e2 = m45315e2(layoutInflater, viewGroup);
        m45311r();
        return viewM45315e2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29073l = getIntent().getBooleanExtra("is_sign_up", false);
        this.f29070i = getIntent().getStringExtra("custom_description");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.kfj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126400a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m45316m2(String str) {
        this.f29067f.setText(str);
        m45314v2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 64 && i2 == -1) {
            f29063o.onNext(Boolean.TRUE);
            m45660g2();
        }
        if (i == 64 && i2 != -1) {
            f29063o.onNext(Boolean.FALSE);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m45660g2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f29068g.postDelayed(new RunnableC8439a(), 100L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        this.act.hideInput(this.f29068g);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_bind_phone_view";
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m45317q2(int i, uxj0 uxj0Var) {
        progressDismiss();
        startActivityForResult(GPBindVerifyCodeInputAct.m45344r2(this, m45307l2(), this.f29072k, this.f29073l), 64);
        f29062n = i;
        f29061m = this.f29072k;
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m45318r2(Throwable th) {
        progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            bsj0.m106246D(th);
        } else if (((TantanException.Client.AccountService) th).code == 40060) {
            o1j0.m165636j(string(R$string.f28624S0));
        } else {
            bsj0.m106246D(th);
        }
    }
}
