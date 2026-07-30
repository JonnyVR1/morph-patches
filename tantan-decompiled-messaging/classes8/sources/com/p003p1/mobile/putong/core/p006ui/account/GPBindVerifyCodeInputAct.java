package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.putong.core.p006ui.account.GPBindVerifyCodeInputAct;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.account.view.VerifyCodeView;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.c1c0;
import l.d30;
import l.e30;
import l.i0g0;
import l.j760;
import l.o6j0;
import l.odj;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.e51;
import p007l.lsi0;
import p007l.mkd0;
import p007l.ys60;
import v.VButton_FakeShadow;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class GPBindVerifyCodeInputAct extends PutongAct {

    /* JADX INFO: renamed from: p */
    public static String f1798p;

    /* JADX INFO: renamed from: q */
    public static int f1799q;

    /* JADX INFO: renamed from: c */
    public VText f1800c;

    /* JADX INFO: renamed from: d */
    public VText f1801d;

    /* JADX INFO: renamed from: e */
    public VerifyCodeView f1802e;

    /* JADX INFO: renamed from: f */
    public VText f1803f;

    /* JADX INFO: renamed from: g */
    public VText f1804g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadow f1805h;

    /* JADX INFO: renamed from: i */
    public int f1806i;

    /* JADX INFO: renamed from: j */
    public String f1807j;

    /* JADX INFO: renamed from: l */
    public boolean f1809l;

    /* JADX INFO: renamed from: k */
    public VerifyData f1808k = new VerifyData();

    /* JADX INFO: renamed from: m */
    public Runnable f1810m = new Runnable() { // from class: l.gdj
        @Override // java.lang.Runnable
        public final void run() {
            this.f2761a.m8489F2();
        }
    };

    /* JADX INFO: renamed from: n */
    public d30 f1811n = new d30() { // from class: l.hdj
        public final void call() {
            this.f2816a.m8490H2();
        }
    };

    /* JADX INFO: renamed from: o */
    public boolean f1812o = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.account.GPBindVerifyCodeInputAct$a */
    public class C0489a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f1813a;

        public C0489a(d30 d30Var) {
            this.f1813a = d30Var;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f1813a.call();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m8486A2() {
        this.f1802e.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m8487B2(String str) {
        xdl0.y(this.f1805h, str.length() == 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m8489F2() {
        this.f1802e.setText("");
        this.f1812o = false;
        duringCreated(CoreModule.H().send(this.f1808k)).subscribe(mkd0.m9878K(new e30() { // from class: l.jdj
            public final void call(Object obj) {
                this.f2976a.m8515D2((roj0) obj);
            }
        }, new e30() { // from class: l.kdj
            public final void call(Object obj) {
                this.f3069a.m8488E2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m8490H2() {
        zvf0.u("e_intl_bind_phone_enter_verification_code_next_butto", pageId(), new j760[]{vwb.Y("bindType", this.f1809l ? "afterSignup" : "accountSecurityPage")});
        int i = f1799q;
        f1799q = i + 1;
        if (i < 5) {
            this.f1808k.code = m8513u2();
            m8492Q2();
        } else {
            this.f1802e.setText("");
            lsi0.m9834h(R.string.H3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N2 */
    private void m8491N2() {
        progressDismiss();
        f1799q = 0;
        m8512s2();
        xdl0.M0(this.f1804g, true);
        xdl0.M0(this.f1803f, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q2 */
    private void m8492Q2() {
        progress(R.string.R0);
        duringCreated(CoreModule.H().verify(this.f1808k)).subscribe(mkd0.m9878K(new e30() { // from class: l.ldj
            public final void call(Object obj) {
                this.f3220a.m8517K2((roj0) obj);
            }
        }, new e30() { // from class: l.mdj
            public final void call(Object obj) {
                this.f3300a.m8518L2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m8493V1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        e51.m9024G(new Runnable() { // from class: l.ndj
            @Override // java.lang.Runnable
            public final void run() {
                this.f3386a.m8486A2();
            }
        });
        this.f1801d.setText(ys60.m11958a(this.f1806i, this.f1807j));
        f1799q = 0;
        if (bundle == null) {
            String str = this.f1809l ? "afterSignup" : "accountSecurityPage";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bindType", str);
                ((PutongAct) this).pageHelper.o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        } else {
            this.f1812o = bundle.getBoolean("count_down_complete");
        }
        if (e51.m9019B(m8521r2()) || !TextUtils.equals(f1798p, this.f1807j)) {
            m8512s2();
        } else {
            this.act.progress(R.string.R0);
            this.f1810m.run();
        }
        f1798p = this.f1807j;
    }

    /* JADX INFO: renamed from: p2 */
    public static void m8509p2(TextView textView, String str, d30 d30Var) {
        if (!NullChecker.b(textView) || TextUtils.isEmpty(textView.getText())) {
            return;
        }
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf(str);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C0489a(d30Var), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(CoreModule.b.getResources().getColor(c1c0.n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q2 */
    public static Intent m8510q2(Act act, int i, String str, boolean z) {
        Intent intent = new Intent((Context) act, (Class<?>) GPBindVerifyCodeInputAct.class);
        intent.putExtra("ccode", i);
        intent.putExtra("phone_number", str);
        intent.putExtra("is_from_sign_up", z);
        return intent;
    }

    /* JADX INFO: renamed from: r */
    private void m8511r() {
        this.f1800c.setText(R.string.p4);
        this.f1802e.setOnCompleteAction(this.f1811n);
        this.f1802e.setListener(new VerifyCodeView.a() { // from class: l.ycj
            /* JADX INFO: renamed from: a */
            public final void m11925a(String str) {
                this.f5427a.m8487B2(str);
            }
        });
        xdl0.y(this.f1805h, this.f1802e.getText().length() == 4);
        this.f1805h.setOnClickListener(new View.OnClickListener() { // from class: l.fdj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2675a.m8514C2(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    private void m8512s2() {
        if (!this.f1812o) {
            duringCreated(e51.m9031N(m8521r2(), 60)).subscribe(mkd0.m9876I(new e30() { // from class: l.adj
                public final void call(Object obj) {
                    this.f1848a.m8522v2((Long) obj);
                }
            }, new e30() { // from class: l.bdj
                public final void call(Object obj) {
                    GPBindVerifyCodeInputAct.m8493V1((Throwable) obj);
                }
            }, new d30() { // from class: l.cdj
                public final void call() {
                    this.f2464a.m8524y2();
                }
            }));
            return;
        }
        this.f1804g.setText(getString(R.string.d3, 60));
        xdl0.M0(this.f1803f, true);
        xdl0.M0(this.f1804g, false);
        this.f1803f.setText(R.string.I3);
        m8509p2(this.f1803f, string(R.string.J3), new d30() { // from class: l.zcj
            public final void call() {
                this.f5505a.m8525z2();
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    private int m8513u2() {
        try {
            return Integer.parseInt(vwb.q(this.f1802e.getText()));
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m8514C2(View view) {
        this.f1811n.call();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m8515D2(roj0 roj0Var) {
        m8491N2();
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m8516I2() {
        this.f1810m.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m8517K2(roj0 roj0Var) {
        hideInput();
        progressDismiss();
        String str = this.f1809l ? "afterSignup" : "accountSecurityPage";
        o6j0.n("e_intl_bind_phone_success", pageId(), new o6j0.a[]{o6j0.a.h("bindType", str), o6j0.a.h("phone_num", this.f1806i + f1798p)});
        lsi0.m9836j(string(R.string.U0));
        CoreModule.K().dismissGpBindPhoneRedDot();
        setResult(-1);
        lambda$debugItems$19();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m8518L2(Throwable th) {
        progressDismiss();
        this.f1802e.setText("");
        yij0.D(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M2, reason: merged with bridge method [inline-methods] */
    public final void m8488E2(Throwable th) {
        progressDismiss();
        xdl0.M0(this.f1803f, !e51.m9019B(m8521r2()));
        this.f1803f.setText(R.string.I3);
        m8509p2(this.f1803f, string(R.string.J3), new d30() { // from class: l.ddj
            public final void call() {
                this.f2567a.m8516I2();
            }
        });
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40060) {
            lsi0.m9836j(string(R.string.S0));
        } else {
            yij0.D(th);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8520o2 = m8520o2(layoutInflater, viewGroup);
        m8511r();
        return viewM8520o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1806i = getIntent().getIntExtra("ccode", 0);
        this.f1807j = getIntent().getStringExtra("phone_number");
        this.f1809l = getIntent().getBooleanExtra("is_from_sign_up", false);
        this.f1808k.language = i0g0.y();
        this.f1808k.action = VerifyReason.get("bind_mobile");
        VerifyData verifyData = this.f1808k;
        verifyData.countryCode = this.f1806i;
        String str = this.f1807j;
        verifyData.mobileNumber = str;
        verifyData.codeLength = 4;
        if (str.equals(f1798p)) {
            return;
        }
        e51.m9028K(m8521r2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.idj
            public final void call(Object obj) {
                this.f2879a.lambda$initSubscription$6((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o2 */
    public View m8520o2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return odj.b(this, layoutInflater, viewGroup);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("count_down_complete", this.f1812o);
    }

    public String pageId() {
        return "p_intl_bind_phone_enter_verification_code_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r2 */
    public final String m8521r2() {
        return getLocalClassName() + "bind_mobile";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m8522v2(Long l2) {
        this.f1804g.setText(getString(R.string.d3, Long.valueOf(59 - l2.longValue())));
        xdl0.M0(this.f1803f, false);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m8523w2() {
        this.f1810m.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m8524y2() {
        this.f1812o = true;
        this.f1804g.setText(getString(R.string.d3, 60));
        xdl0.M0(this.f1803f, true);
        xdl0.M0(this.f1804g, false);
        this.f1803f.setText(R.string.I3);
        m8509p2(this.f1803f, string(R.string.J3), new d30() { // from class: l.edj
            public final void call() {
                this.f2618a.m8523w2();
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m8525z2() {
        this.f1810m.run();
    }
}
