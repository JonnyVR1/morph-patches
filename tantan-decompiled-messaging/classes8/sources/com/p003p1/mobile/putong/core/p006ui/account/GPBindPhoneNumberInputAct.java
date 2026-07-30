package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Pattern;
import l.e30;
import l.hpd0;
import l.i0g0;
import l.roj0;
import l.xcj;
import l.xdl0;
import l.yij0;
import l.zqb;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.lsi0;
import p007l.mkd0;
import rx.c;
import rx.subjects.b;
import v.VButton_FakeShadow;
import v.VLinear;
import v.VMaterialEdit;
import v.VMaterialEdit_FakeSpinner;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class GPBindPhoneNumberInputAct extends PutongAct {

    /* JADX INFO: renamed from: m */
    public static String f1784m;

    /* JADX INFO: renamed from: n */
    public static int f1785n;

    /* JADX INFO: renamed from: o */
    public static final b<Boolean> f1786o = b.b();

    /* JADX INFO: renamed from: c */
    public VLinear f1787c;

    /* JADX INFO: renamed from: d */
    public VText f1788d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f1789e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit_FakeSpinner f1790f;

    /* JADX INFO: renamed from: g */
    public VMaterialEdit f1791g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f1792h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f1793i = null;

    /* JADX INFO: renamed from: j */
    public hpd0 f1794j = new hpd0("back_intercept" + CoreModule.H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: k */
    public String f1795k;

    /* JADX INFO: renamed from: l */
    public boolean f1796l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.GPBindPhoneNumberInputAct$a */
    public class RunnableC0488a implements Runnable {
        public RunnableC0488a() {
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.p1.mobile.android.app.Act, com.p1.mobile.putong.core.ui.account.GPBindPhoneNumberInputAct] */
        @Override // java.lang.Runnable
        public void run() {
            GPBindPhoneNumberInputAct.this.f1791g.requestFocus();
            ?? r2 = GPBindPhoneNumberInputAct.this;
            r2.act.showInput(r2.f1791g, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e2 */
    public static Intent m8470e2(Act act) {
        return new Intent((Context) act, (Class<?>) GPBindPhoneNumberInputAct.class);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m8471g2(Act act, boolean z, String str) {
        Intent intentM8470e2 = m8470e2(act);
        intentM8470e2.putExtra("is_sign_up", z);
        intentM8470e2.putExtra("custom_description", str);
        return intentM8470e2;
    }

    /* JADX INFO: renamed from: h2 */
    private boolean m8472h2(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!m8479r2()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: i2 */
    public static c<Boolean> m8473i2() {
        return f1786o.asObservable();
    }

    /* JADX INFO: renamed from: k2 */
    private int m8474k2() {
        return NullChecker.b(this.f1790f) ? Integer.valueOf(this.f1790f.getText().toString().substring(1)).intValue() : ((zqb) zqb.d.get(0)).b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (bundle == null) {
            String str = this.f1796l ? "afterSignup" : "accountSecurityPage";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bindType", str);
                ((PutongAct) this).pageHelper.o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m8475m2(View view) {
        CoreModule.H().dialogCCode(this, new e30() { // from class: l.wcj
            public final void call(Object obj) {
                this.f5034a.m8483l2((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m8476n2(CharSequence charSequence) {
        this.f1795k = yij0.M(this.f1791g);
        m8481u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m8477o2(View view) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f1791g.getText());
        VMaterialEdit vMaterialEdit = this.f1791g;
        if (zIsEmpty) {
            vMaterialEdit.setError(string(R.string.E3));
        } else if (m8472h2(vMaterialEdit.getText().toString())) {
            m8480s2();
        } else {
            this.f1791g.setError(act().getString(R.string.L3));
        }
    }

    /* JADX INFO: renamed from: r */
    private void m8478r() {
        if (!TextUtils.isEmpty(this.f1793i)) {
            this.f1788d.setText(this.f1793i);
        }
        int i = ((zqb) zqb.d.get(0)).b;
        this.f1790f.setText("+" + i);
        xdl0.E0(this.f1790f, new View.OnClickListener() { // from class: l.rcj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4064a.m8475m2(view);
            }
        });
        this.f1791g.I(false).subscribe(mkd0.m9874G(new e30() { // from class: l.scj
            public final void call(Object obj) {
                this.f4131a.m8476n2((CharSequence) obj);
            }
        }));
        xdl0.E0(this.f1792h, new View.OnClickListener() { // from class: l.tcj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4252a.m8477o2(view);
            }
        });
        m8481u2();
    }

    /* JADX INFO: renamed from: r2 */
    private boolean m8479r2() {
        return m8474k2() == 86;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    private void m8480s2() {
        final int iM8474k2 = m8474k2();
        if (TextUtils.equals(this.f1795k, f1784m) && iM8474k2 == f1785n) {
            startActivityForResult(GPBindVerifyCodeInputAct.m8510q2(this, m8474k2(), this.f1795k, this.f1796l), 64);
            return;
        }
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.y();
        verifyDataNew_.countryCode = iM8474k2;
        verifyDataNew_.mobileNumber = this.f1795k;
        verifyDataNew_.action = VerifyReason.get("bind_mobile");
        verifyDataNew_.codeLength = 4;
        progress(R.string.R0);
        duringCreated(CoreModule.H().send(verifyDataNew_)).subscribe(mkd0.m9878K(new e30() { // from class: l.ucj
            public final void call(Object obj) {
                this.f4884a.m8484p2(iM8474k2, (roj0) obj);
            }
        }, new e30() { // from class: l.vcj
            public final void call(Object obj) {
                this.f4966a.m8485q2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: u2 */
    private void m8481u2() {
        this.f1792h.setActivated(!(this.f1791g.getVisibility() != 0 || (!TextUtils.isEmpty(this.f1791g.getText()) && m8472h2(this.f1791g.getText().toString()))));
    }

    /* JADX INFO: renamed from: d2 */
    public View m8482d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xcj.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8482d2 = m8482d2(layoutInflater, viewGroup);
        m8478r();
        return viewM8482d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1796l = getIntent().getBooleanExtra("is_sign_up", false);
        this.f1793i = getIntent().getStringExtra("custom_description");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.qcj
            public final void call(Object obj) {
                this.f3847a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m8483l2(String str) {
        this.f1790f.setText(str);
        m8481u2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 64 && i2 == -1) {
            f1786o.onNext(Boolean.TRUE);
            lambda$debugItems$19();
        }
        if (i == 64 && i2 != -1) {
            f1786o.onNext(Boolean.FALSE);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        lambda$debugItems$19();
    }

    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f1791g.postDelayed(new RunnableC0488a(), 100L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        this.act.hideInput((View) this.f1791g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m8484p2(int i, roj0 roj0Var) {
        progressDismiss();
        startActivityForResult(GPBindVerifyCodeInputAct.m8510q2(this, m8474k2(), this.f1795k, this.f1796l), 64);
        f1785n = i;
        f1784m = this.f1795k;
    }

    public String pageId() {
        return "p_intl_bind_phone_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m8485q2(Throwable th) {
        progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.D(th);
        } else if (((TantanException.Client.AccountService) th).code == 40060) {
            lsi0.m9836j(string(R.string.S0));
        } else {
            yij0.D(th);
        }
    }
}
