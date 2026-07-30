package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;
import p149l.e30;
import p149l.hpd0;
import p149l.i0g0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.roj0;
import p149l.xcj;
import p149l.xdl0;
import p149l.yij0;
import p149l.zqb;

/* JADX INFO: loaded from: classes8.dex */
public class GPBindPhoneNumberInputAct extends PutongAct {

    /* JADX INFO: renamed from: m */
    public static String f28213m;

    /* JADX INFO: renamed from: n */
    public static int f28214n;

    /* JADX INFO: renamed from: o */
    public static final C22393b<Boolean> f28215o = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public VLinear f28216c;

    /* JADX INFO: renamed from: d */
    public VText f28217d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f28218e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit_FakeSpinner f28219f;

    /* JADX INFO: renamed from: g */
    public VMaterialEdit f28220g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f28221h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f28222i = null;

    /* JADX INFO: renamed from: j */
    public hpd0 f28223j = new hpd0("back_intercept" + CoreModule.m29931H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: k */
    public String f28224k;

    /* JADX INFO: renamed from: l */
    public boolean f28225l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.GPBindPhoneNumberInputAct$a */
    public class RunnableC8276a implements Runnable {
        public RunnableC8276a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GPBindPhoneNumberInputAct.this.f28220g.requestFocus();
            GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct = GPBindPhoneNumberInputAct.this;
            gPBindPhoneNumberInputAct.act.showInput(gPBindPhoneNumberInputAct.f28220g, 1);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m44120e2(Act act) {
        return new Intent(act, (Class<?>) GPBindPhoneNumberInputAct.class);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m44121g2(Act act, boolean z, String str) {
        Intent intentM44120e2 = m44120e2(act);
        intentM44120e2.putExtra("is_sign_up", z);
        intentM44120e2.putExtra("custom_description", str);
        return intentM44120e2;
    }

    /* JADX INFO: renamed from: h2 */
    private boolean m44122h2(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!m44129r2()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: i2 */
    public static C22306c<Boolean> m44123i2() {
        return f28215o.asObservable();
    }

    /* JADX INFO: renamed from: k2 */
    private int m44124k2() {
        return NullChecker.m81304b(this.f28219f) ? Integer.valueOf(this.f28219f.getText().toString().substring(1)).intValue() : zqb.f204369d.get(0).f204372b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (bundle == null) {
            String str = this.f28225l ? "afterSignup" : "accountSecurityPage";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bindType", str);
                this.pageHelper.m109039o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m44125m2(View view) {
        CoreModule.m29931H().dialogCCode(this, new e30() { // from class: l.wcj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185693a.m44133l2((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m44126n2(CharSequence charSequence) {
        this.f28224k = yij0.m214935M(this.f28220g);
        m44131u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m44127o2(View view) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f28220g.getText());
        VMaterialEdit vMaterialEdit = this.f28220g;
        if (zIsEmpty) {
            vMaterialEdit.setError(string(R$string.f27708E3));
        } else if (m44122h2(vMaterialEdit.getText().toString())) {
            m44130s2();
        } else {
            this.f28220g.setError(act().getString(R$string.f27744L3));
        }
    }

    /* JADX INFO: renamed from: r */
    private void m44128r() {
        if (!TextUtils.isEmpty(this.f28222i)) {
            this.f28217d.setText(this.f28222i);
        }
        int i = zqb.f204369d.get(0).f204372b;
        this.f28219f.setText(Marker.ANY_NON_NULL_MARKER + i);
        xdl0.m208329E0(this.f28219f, new View.OnClickListener() { // from class: l.rcj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158776a.m44125m2(view);
            }
        });
        this.f28220g.m223128I(false).subscribe(mkd0.m154955G(new e30() { // from class: l.scj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163745a.m44126n2((CharSequence) obj);
            }
        }));
        xdl0.m208329E0(this.f28221h, new View.OnClickListener() { // from class: l.tcj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169447a.m44127o2(view);
            }
        });
        m44131u2();
    }

    /* JADX INFO: renamed from: r2 */
    private boolean m44129r2() {
        return m44124k2() == 86;
    }

    /* JADX INFO: renamed from: s2 */
    private void m44130s2() {
        final int iM44124k2 = m44124k2();
        if (TextUtils.equals(this.f28224k, f28213m) && iM44124k2 == f28214n) {
            startActivityForResult(GPBindVerifyCodeInputAct.m44160q2(this, m44124k2(), this.f28224k, this.f28225l), 64);
            return;
        }
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.m133885y();
        verifyDataNew_.countryCode = iM44124k2;
        verifyDataNew_.mobileNumber = this.f28224k;
        verifyDataNew_.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyDataNew_.codeLength = 4;
        progress(R$string.f27771R0);
        duringCreated(CoreModule.m29931H().send(verifyDataNew_)).subscribe(mkd0.m154959K(new e30() { // from class: l.ucj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175828a.m44134p2(iM44124k2, (roj0) obj);
            }
        }, new e30() { // from class: l.vcj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180945a.m44135q2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: u2 */
    private void m44131u2() {
        this.f28221h.setActivated(!(this.f28220g.getVisibility() != 0 || (!TextUtils.isEmpty(this.f28220g.getText()) && m44122h2(this.f28220g.getText().toString()))));
    }

    /* JADX INFO: renamed from: d2 */
    public View m44132d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xcj.m208119b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM44132d2 = m44132d2(layoutInflater, viewGroup);
        m44128r();
        return viewM44132d2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28225l = getIntent().getBooleanExtra("is_sign_up", false);
        this.f28222i = getIntent().getStringExtra("custom_description");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.qcj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153758a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m44133l2(String str) {
        this.f28219f.setText(str);
        m44131u2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 64 && i2 == -1) {
            f28215o.onNext(Boolean.TRUE);
            m44477e2();
        }
        if (i == 64 && i2 != -1) {
            f28215o.onNext(Boolean.FALSE);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m44477e2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f28220g.postDelayed(new RunnableC8276a(), 100L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        this.act.hideInput(this.f28220g);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m44134p2(int i, roj0 roj0Var) {
        progressDismiss();
        startActivityForResult(GPBindVerifyCodeInputAct.m44160q2(this, m44124k2(), this.f28224k, this.f28225l), 64);
        f28214n = i;
        f28213m = this.f28224k;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_bind_phone_view";
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m44135q2(Throwable th) {
        progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.m214926D(th);
        } else if (((TantanException.Client.AccountService) th).code == 40060) {
            lsi0.m151580j(string(R$string.f27776S0));
        } else {
            yij0.m214926D(th);
        }
    }
}
