package p153l;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.AccountShareItemBean;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.WebViewPreAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.slf4j.Marker;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: renamed from: l.zn */
/* JADX INFO: loaded from: classes9.dex */
public class C21841zn extends w1e {

    /* JADX INFO: renamed from: l.zn$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f205155a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f205156b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ l4g0 f205157c;

        public a(Act act, Runnable runnable, l4g0 l4g0Var) {
            this.f205155a = act;
            this.f205156b = runnable;
            this.f205157c = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f205155a.removeCallbacks(this.f205156b);
            w1e.m204401e(this.f205157c);
        }
    }

    /* JADX INFO: renamed from: l.zn$b */
    public class b implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.zn$c */
    public class c implements C21914zx.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f205158a;

        public c(List list) {
            this.f205158a = list;
        }

        @Override // p153l.C21914zx.b
        /* JADX INFO: renamed from: a */
        public void mo186719a(View view, int i) {
            AccountShareItemBean accountShareItemBean = (AccountShareItemBean) this.f205158a.get(i);
            if (NullChecker.m82486a(accountShareItemBean)) {
                String name = accountShareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        i4g0.m138523u("e_other_signin_way", "p_other_signin_popup", jyb.m147494Y("choose_which_signin_way", "wechat"));
                    } else if (Constants.SOURCE_QQ.equals(name)) {
                        i4g0.m138523u("e_other_signin_way", "p_other_signin_popup", jyb.m147494Y("choose_which_signin_way", "qq"));
                    }
                }
                if (NullChecker.m82486a(((AccountShareItemBean) this.f205158a.get(i)).getAction())) {
                    ((AccountShareItemBean) this.f205158a.get(i)).getAction().call();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.zn$d */
    public class d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f205159a;

        public d(l4g0 l4g0Var) {
            this.f205159a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i4g0.m138520r("e_other_signin_cancel", "p_other_signin_popup");
            w1e.m204401e(this.f205159a);
        }
    }

    /* JADX INFO: renamed from: l.zn$e */
    public class e implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f205160a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f205161b;

        public e(l4g0 l4g0Var, x20 x20Var) {
            this.f205160a = l4g0Var;
            this.f205161b = x20Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f205160a);
            this.f205161b.call();
        }
    }

    /* JADX INFO: renamed from: l.zn$f */
    public class f implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            i4g0.m138523u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", jyb.m147494Y("cancel_back", "back"));
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.zn$g */
    public class g extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f205162a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f205163b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f205164c;

        public g(Activity activity, String str, String str2) {
            this.f205162a = activity;
            this.f205163b = str;
            this.f205164c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f205162a;
            AccountTempApi accountTempApi = uqb0.f180380L;
            String str = this.f205163b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m80585K0(activity, str, this.f205164c) : WebViewAct.m81347a2(activity, str, this.f205164c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: l.zn$h */
    public class h implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f205165a;

        public h(l4g0 l4g0Var) {
            this.f205165a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f205165a);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m220532A(pej0 pej0Var, x20 x20Var, uxj0 uxj0Var) {
        pej0Var.m176562T();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m220534C(x20 x20Var, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            o1j0.m165651y("手机绑定失败");
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m220535D(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, RiskVerification riskVerification) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f16765A3);
        act.duringCreated(l51.m152894N("bind_phone_obs", 60)).subscribe(psd0.m173598I(new y20() { // from class: l.nn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220566u(vText, act, (Long) obj);
            }
        }, new y20() { // from class: l.on
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220562q((Throwable) obj);
            }
        }, new x20() { // from class: l.qn
            @Override // p153l.x20
            public final void call() {
                C21841zn.m220537F(vText, vEditText2);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m220537F(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f16995r3);
        bnl0.m105591y(vText, false);
        if (vEditText.getText().toString().isEmpty()) {
            bnl0.m105591y(vText, false);
        } else {
            bnl0.m105591y(vText, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m220539H(VEditText vEditText, VEditText vEditText2, final Act act, VText vText, final pej0 pej0Var, final x20 x20Var, final x20 x20Var2, final VButton vButton, View view) {
        i4g0.m138520r("e_force_bindphone_unidentified_confirm", "p_force_bindphone_unidentified_popup");
        if (TextUtils.isEmpty(vEditText.getText())) {
            o1j0.m165651y("请输入手机号");
            return;
        }
        if (TextUtils.isEmpty(vEditText2.getText())) {
            o1j0.m165651y("请输入短信验证码");
            return;
        }
        act.progress(R$string.f16946j0);
        VerifyData verifyData = new VerifyData();
        verifyData.code = bsj0.m106251I(vEditText2);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(vText);
        verifyData.mobileNumber = bsj0.m106255M(vEditText);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.countryCode = bsj0.m106251I(vText);
        verifyData.mobileNumber = bsj0.m106255M(vEditText);
        AccountModule.f16756c.m29271B2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.cn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220543L(act, pej0Var, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.dn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220563r(act, x20Var2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m220541J(y20 y20Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        y20Var.call(Marker.ANY_NON_NULL_MARKER + intent.getIntExtra("ccode", 86));
        return true;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m220542K(final Act act, final x20 x20Var, final pej0 pej0Var, final x20 x20Var2, View view) {
        i4g0.m138520r("e_force_bindphone_identified_confirm", "p_force_bindphone_identified_popup");
        act.duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.gn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220534C(x20Var, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.hn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.in
            @Override // p153l.qcj
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return AccountModule.f16756c.m29305Q1(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(psd0.m173597H(new y20() { // from class: l.jn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220532A(pej0Var, x20Var2, (uxj0) obj);
            }
        }, new y20() { // from class: l.kn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220560o(x20Var, act, (Throwable) obj);
            }
        }));
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m220543L(Act act, pej0 pej0Var, x20 x20Var, uxj0 uxj0Var) {
        act.progressDismiss();
        l51.m152891K("bind_phone_obs");
        m220545N(pej0Var);
        pej0Var.m176562T();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m220544M(Act act, final y20<String> y20Var) {
        act.startActivityForResult(CCodeChooseAct.m29657Z1(act), new C4468a.a() { // from class: l.rn
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return C21841zn.m220541J(y20Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    private static void m220545N(@NonNull pej0 pej0Var) {
        try {
            Window window = pej0Var.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) pej0Var.getContext().getSystemService("input_method");
            if (NullChecker.m82486a(window) && NullChecker.m82486a(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.m82486a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
        }
    }

    /* JADX INFO: renamed from: O */
    public static SpannableStringBuilder m220546O(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            spannableStringBuilder.setSpan(new g(activity, str2, strArr[i + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: P */
    public static pej0 m220547P(final Act act, String str, String str2, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_force_bindphone_unidentified_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("signup_way", str), jyb.m147494Y("page_display_fromwhich", TextUtils.equals(str2, "verified") ? "verified" : ""));
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCanceledOnTouchOutside(false);
        pej0Var.setCancelable(false);
        pej0Var.setContentView(hec0.f109099a);
        l51.m152891K("bind_phone_obs");
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(wcc0.f188457o)).setBackgroundResource(bbc0.f75859a0);
        }
        l51.m152887G(new Runnable() { // from class: l.un
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(yfc0.f199490c);
            }
        });
        final VText vText = (VText) pej0Var.findViewById(wcc0.f188443g);
        final VEditText vEditText = (VEditText) pej0Var.findViewById(wcc0.f188450j0);
        final VEditText vEditText2 = (VEditText) pej0Var.findViewById(wcc0.f188447i);
        final VText vText2 = (VText) pej0Var.findViewById(wcc0.f188462t);
        ((VText) pej0Var.findViewById(wcc0.f188468z)).setTypeface(lyh0.m156283c(3), 1);
        final Runnable runnable = new Runnable() { // from class: l.vn
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditText, 0);
            }
        };
        final VButton vButton = (VButton) pej0Var.findViewById(wcc0.f188431a);
        vButton.setBackgroundResource(bbc0.f75917t1);
        vEditText.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.wn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220570y(vEditText, vText2, vButton, vEditText2, (CharSequence) obj);
            }
        }));
        vEditText2.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.xn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220569x(vEditText, vEditText2, vButton, (CharSequence) obj);
            }
        }));
        vButton.setTypeface(lyh0.m156283c(3), 1);
        pej0Var.setOnDismissListener(new a(act, runnable, l4g0VarM204399c));
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.yn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220539H(vEditText, vEditText2, act, vText, pej0Var, x20Var2, x20Var, vButton, view);
            }
        });
        VText vText3 = (VText) pej0Var.findViewById(wcc0.f188446h0);
        pf60<String, String> pf60VarM30593d = ChinaMobileController.m30593d();
        if (ChinaMobileController.m30594e() == ChinaMobileController.MobileType.unknown) {
            vText3.setText(q8g0.m175770B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《用户协议》、《隐私策略》", "《用户协议》", zwk.m221910j(), "《隐私策略》", zwk.m221909i()));
        } else {
            vText3.setText(q8g0.m175770B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + pf60VarM30593d.f152156a + "》、《用户协议》、《隐私策略》", "《" + pf60VarM30593d.f152156a + "》", pf60VarM30593d.f152157b, "《用户协议》", zwk.m221910j(), "《隐私策略》", zwk.m221909i()));
        }
        vText3.setMovementMethod(LinkMovementMethod.getInstance());
        bnl0.m105509E0((VImage) pej0Var.findViewById(wcc0.f188465w), new View.OnClickListener() { // from class: l.um
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220555j(act, x20Var3, pej0Var, view);
            }
        });
        vText.setText("" + nsb.f143476d.get(0).f143479b);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.vm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220544M(act, new y20() { // from class: l.fn
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.wm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220552g(vEditText, vText, vText2, vEditText2, act, view);
            }
        });
        pej0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.xm
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C21841zn.m220554i(vEditText, act, runnable, dialogInterface);
            }
        });
        if (!l51.m152882B("bind_phone_obs")) {
            bnl0.m105591y(vText2, vEditText.getText().length() > 0);
        }
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: Q */
    public static pej0 m220548Q(final Act act, String str, String str2, final x20 x20Var, final x20 x20Var2, final x20 x20Var3, final x20 x20Var4) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_force_bindphone_identified_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("signup_way", str));
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCanceledOnTouchOutside(false);
        pej0Var.setContentView(hec0.f109101b);
        pej0Var.setCancelable(false);
        pej0Var.setOnDismissListener(new h(l4g0VarM204399c));
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(wcc0.f188457o)).setBackgroundResource(bbc0.f75859a0);
        }
        l51.m152887G(new Runnable() { // from class: l.ym
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(yfc0.f199490c);
            }
        });
        ((VText) pej0Var.findViewById(wcc0.f188468z)).setTypeface(lyh0.m156283c(3), 1);
        VText vText = (VText) pej0Var.findViewById(wcc0.f188467y);
        vText.setTypeface(lyh0.m156283c(3), 1);
        if (!TextUtils.isEmpty(str2)) {
            vText.setText(str2);
        }
        VText vText2 = (VText) pej0Var.findViewById(wcc0.f188466x);
        vText2.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.zm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220557l(x20Var4, pej0Var, view);
            }
        });
        VButton vButton = (VButton) pej0Var.findViewById(wcc0.f188431a);
        vButton.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.an
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220542K(act, x20Var3, pej0Var, x20Var2, view);
            }
        });
        VText vText3 = (VText) pej0Var.findViewById(wcc0.f188446h0);
        pf60<String, String> pf60VarM30593d = ChinaMobileController.m30593d();
        vText3.setText(q8g0.m175770B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + pf60VarM30593d.f152156a + "》、《用户协议》、《隐私策略》", "《" + pf60VarM30593d.f152156a + "》", pf60VarM30593d.f152157b, "《用户协议》", zwk.m221910j(), "《隐私策略》", zwk.m221909i()));
        vText3.setMovementMethod(LinkMovementMethod.getInstance());
        bnl0.m105509E0((VImage) pej0Var.findViewById(wcc0.f188465w), new View.OnClickListener() { // from class: l.bn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220571z(pej0Var, x20Var, view);
            }
        });
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: R */
    public static pej0 m220549R(Act act, final x20 x20Var, x20 x20Var2) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_login_user_agreement_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setContentView(hec0.f109074B);
        pej0Var.setCanceledOnTouchOutside(false);
        pej0Var.setOnDismissListener(new e(l4g0VarM204399c, x20Var2));
        pej0Var.setOnKeyListener(new f());
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(wcc0.f188457o)).setBackgroundResource(bbc0.f75859a0);
        }
        l51.m152887G(new Runnable() { // from class: l.pn
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(yfc0.f199490c);
            }
        });
        VText vText = (VText) pej0Var.findViewById(wcc0.f188468z);
        VButton vButton = (VButton) pej0Var.findViewById(wcc0.f188431a);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.sn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220559n(x20Var, pej0Var, view);
            }
        });
        VText vText2 = (VText) pej0Var.findViewById(wcc0.f188444g0);
        if (IntlCountryCodeController.m29119p()) {
            vText.setText(R$string.f16893a1);
            vButton.setText(R$string.f16887Z0);
            vText2.setTextColor(Color.parseColor("#66000000"));
            vText2.setLinkTextColor(Color.parseColor("#66000000"));
            vText2.setText(m220546O(act, act.string(R$string.f16992r0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f16997s0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.string(R$string.f16804I2), act.string(R$string.f16992r0), zwk.m221910j(), act.string(R$string.f16804I2), zwk.m221909i()));
        } else {
            vText2.setTextColor(Color.parseColor("#66000000"));
            vText2.setLinkTextColor(Color.parseColor("#66000000"));
            vText2.setText(q8g0.m175769A(act, Typeface.DEFAULT_BOLD, "《用户协议》和《隐私策略》", "《用户协议》", zwk.m221910j(), "《隐私策略》", zwk.m221909i()));
        }
        vText2.setMovementMethod(LinkMovementMethod.getInstance());
        bnl0.m105509E0((VImage) pej0Var.findViewById(wcc0.f188465w), new View.OnClickListener() { // from class: l.tn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220556k(pej0Var, view);
            }
        });
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: S */
    public static pej0 m220550S(Act act, boolean z, boolean z2, boolean z3, x20 x20Var, x20 x20Var2, final y20<Boolean> y20Var) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_other_signin_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        pej0 pej0Var = new pej0(act);
        pej0Var.setCanceledOnTouchOutside(true);
        pej0Var.setContentView(hec0.f109084L);
        pej0Var.setOnKeyListener(new b());
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(wcc0.f188457o)).setBackgroundResource(bbc0.f75859a0);
        }
        l51.m152887G(new Runnable() { // from class: l.tm
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(yfc0.f199490c);
            }
        });
        VRecyclerView vRecyclerView = (VRecyclerView) pej0Var.findViewById(wcc0.f188417M);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        ArrayList arrayList = new ArrayList();
        C21914zx c21914zx = new C21914zx(act);
        if (z2) {
            i4g0.m138492A("e_other_signin_way", "p_other_signin_popup", jyb.m147494Y("display_signin_way", "wechat"));
            arrayList.add(new AccountShareItemBean("微信", bbc0.f75852X, x20Var));
        }
        if (z3) {
            i4g0.m138492A("e_other_signin_way", "p_other_signin_popup", jyb.m147494Y("display_signin_way", "qq"));
            arrayList.add(new AccountShareItemBean(Constants.SOURCE_QQ, bbc0.f75849W, x20Var2));
        }
        vRecyclerView.setAdapter(c21914zx);
        c21914zx.m221964C(arrayList);
        c21914zx.m221965D(new c(arrayList));
        final VCheckBox vCheckBox = (VCheckBox) pej0Var.findViewById(wcc0.f188415K);
        bnl0.m105509E0(vCheckBox, new View.OnClickListener() { // from class: l.en
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21841zn.m220567v(y20Var, vCheckBox, view);
            }
        });
        VText vText = (VText) pej0Var.findViewById(wcc0.f188416L);
        if (z) {
            vCheckBox.setChecked(true);
        }
        vText.setText(q8g0.m175770B(act, act.getString(R$string.f16835O3, String.format(" %s ", act.string(R$string.f16992r0)), String.format(" %s", act.string(R$string.f16804I2))), act.string(R$string.f16992r0), zwk.m221910j(), act.string(R$string.f16804I2), zwk.m221909i()));
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        pej0Var.setOnDismissListener(new d(l4g0VarM204399c));
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: T */
    public static void m220551T(Act act, String str, String str2, String str3) {
        act.dialog().m21506G0(str).m21503F(str2).m21557u0(str3).m21495B(true).m21566z().show();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m220552g(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, View view) {
        i4g0.m138520r("e_force_bindphone_unidentified_getcode", "p_force_bindphone_unidentified_popup");
        if (!e070.m118810n1(bsj0.m106255M(vEditText), bsj0.m106251I(vText) == 86)) {
            o1j0.m165651y("请输入正确手机号");
            return;
        }
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(vText);
        verifyData.mobileNumber = bsj0.m106255M(vEditText);
        bnl0.m105591y(vText2, false);
        vText2.setEnabled(false);
        vText2.setText("...");
        AccountModule.f16756c.m29323b2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.ln
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220535D(vEditText2, vText2, act, vEditText, (RiskVerification) obj);
            }
        }, new y20() { // from class: l.mn
            @Override // p153l.y20
            public final void call(Object obj) {
                C21841zn.m220564s(vText2, vEditText, act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m220554i(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (jyb.m147481L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m220555j(Act act, x20 x20Var, pej0 pej0Var, View view) {
        i4g0.m138520r("e_force_bindphone_unidentified_cancel", "p_force_bindphone_unidentified_popup");
        if (l51.m152882B(act.getLocalClassName())) {
            l51.m152891K(act.getLocalClassName());
        }
        x20Var.call();
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m220556k(pej0 pej0Var, View view) {
        i4g0.m138523u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", jyb.m147494Y("cancel_back", "cancle"));
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m220557l(x20 x20Var, pej0 pej0Var, View view) {
        i4g0.m138520r("e_force_bindphone_identified_choose_other", "p_force_bindphone_identified_popup");
        x20Var.call();
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m220559n(x20 x20Var, pej0 pej0Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            i4g0.m138520r("e_login_user_agreement_popup_confirm", "p_login_user_agreement_popup");
            x20Var.call();
            pej0Var.m176562T();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m220560o(x20 x20Var, Act act, Throwable th) {
        x20Var.call();
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            bsj0.m106249G(th);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m220562q(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m220563r(Act act, x20 x20Var, VButton vButton, Throwable th) {
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            bsj0.m106249G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            bsj0.m106249G(th);
            return;
        }
        String strM106276l = bsj0.m106276l(i);
        if (strM106276l == null) {
            x20Var.call();
            bsj0.m106249G(th);
        } else {
            o1j0.m165651y(strM106276l);
            bnl0.m105540X(vButton, qa00.f156323j);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m220564s(VText vText, VEditText vEditText, Act act, Throwable th) {
        vText.setClickable(true);
        vText.setEnabled(true);
        vText.setText(R$string.f16995r3);
        if (vEditText.getText().toString().isEmpty()) {
            bnl0.m105591y(vText, false);
        } else {
            bnl0.m105591y(vText, true);
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            olj.INSTANCE.m168130c(act);
            return;
        }
        if (!z) {
            bsj0.m106249G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            bsj0.m106249G(th);
            return;
        }
        String strM106276l = bsj0.m106276l(i);
        if (strM106276l == null) {
            bsj0.m106249G(th);
        } else {
            o1j0.m165651y(strM106276l);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m220566u(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f16956k4)));
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m220567v(y20 y20Var, VCheckBox vCheckBox, View view) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.valueOf(vCheckBox.isChecked()));
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m220569x(VEditText vEditText, VEditText vEditText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(bbc0.f75917t1);
        } else {
            vButton.setBackgroundResource(bbc0.f75815K1);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m220570y(VEditText vEditText, VText vText, VButton vButton, VEditText vEditText2, CharSequence charSequence) {
        if (vEditText.getText().toString().isEmpty() || l51.m152882B("bind_phone_obs")) {
            bnl0.m105591y(vText, false);
        } else {
            bnl0.m105591y(vText, true);
        }
        bnl0.m105540X(vButton, qa00.f156330q);
        i4g0.m138524v("e_force_bindphone_unidentified_input", "p_force_bindphone_unidentified_popup", new pf60[0]);
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(bbc0.f75917t1);
        } else {
            vButton.setBackgroundResource(bbc0.f75815K1);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m220571z(pej0 pej0Var, x20 x20Var, View view) {
        i4g0.m138520r("e_force_bindphone_identified_cancel", "p_force_bindphone_identified_popup");
        pej0Var.m176562T();
        x20Var.call();
    }
}
