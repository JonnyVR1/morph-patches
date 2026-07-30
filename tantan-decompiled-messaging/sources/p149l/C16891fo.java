package p149l;

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
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.AccountShareItemBean;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.WebViewPreAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.slf4j.Marker;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: renamed from: l.fo */
/* JADX INFO: loaded from: classes9.dex */
public class C16891fo extends i0e {

    /* JADX INFO: renamed from: l.fo$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f98485a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f98486b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cwf0 f98487c;

        public a(Act act, Runnable runnable, cwf0 cwf0Var) {
            this.f98485a = act;
            this.f98486b = runnable;
            this.f98487c = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f98485a.removeCallbacks(this.f98486b);
            i0e.m133796e(this.f98487c);
        }
    }

    /* JADX INFO: renamed from: l.fo$b */
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

    /* JADX INFO: renamed from: l.fo$c */
    public class c implements C17199gy.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f98488a;

        public c(List list) {
            this.f98488a = list;
        }

        @Override // p149l.C17199gy.b
        /* JADX INFO: renamed from: a */
        public void mo122428a(View view, int i) {
            AccountShareItemBean accountShareItemBean = (AccountShareItemBean) this.f98488a.get(i);
            if (NullChecker.m81303a(accountShareItemBean)) {
                String name = accountShareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        zvf0.m220399u("e_other_signin_way", "p_other_signin_popup", vwb.m200311Y("choose_which_signin_way", "wechat"));
                    } else if (Constants.SOURCE_QQ.equals(name)) {
                        zvf0.m220399u("e_other_signin_way", "p_other_signin_popup", vwb.m200311Y("choose_which_signin_way", "qq"));
                    }
                }
                if (NullChecker.m81303a(((AccountShareItemBean) this.f98488a.get(i)).getAction())) {
                    ((AccountShareItemBean) this.f98488a.get(i)).getAction().call();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.fo$d */
    public class d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f98489a;

        public d(cwf0 cwf0Var) {
            this.f98489a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            zvf0.m220396r("e_other_signin_cancel", "p_other_signin_popup");
            i0e.m133796e(this.f98489a);
        }
    }

    /* JADX INFO: renamed from: l.fo$e */
    public class e implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f98490a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f98491b;

        public e(cwf0 cwf0Var, d30 d30Var) {
            this.f98490a = cwf0Var;
            this.f98491b = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f98490a);
            this.f98491b.call();
        }
    }

    /* JADX INFO: renamed from: l.fo$f */
    public class f implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            zvf0.m220399u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", vwb.m200311Y("cancel_back", "back"));
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.fo$g */
    public class g extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f98492a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f98493b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f98494c;

        public g(Activity activity, String str, String str2) {
            this.f98492a = activity;
            this.f98493b = str;
            this.f98494c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f98492a;
            AccountTempApi accountTempApi = qib0.f154697L;
            String str = this.f98493b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m79402J0(activity, str, this.f98494c) : WebViewAct.m80164Z1(activity, str, this.f98494c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: l.fo$h */
    public class h implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f98495a;

        public h(cwf0 cwf0Var) {
            this.f98495a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f98495a);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m122388A(l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        l5j0Var.m101651T();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m122390C(d30 d30Var, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            lsi0.m151595y("手机绑定失败");
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m122391D(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, RiskVerification riskVerification) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f16046A3);
        act.duringCreated(e51.m114749N("bind_phone_obs", 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.sn
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122422u(vText, act, (Long) obj);
            }
        }, new e30() { // from class: l.tn
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122418q((Throwable) obj);
            }
        }, new d30() { // from class: l.vn
            @Override // p149l.d30
            public final void call() {
                C16891fo.m122393F(vText, vEditText2);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m122393F(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f16276r3);
        xdl0.m208411y(vText, false);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.m208411y(vText, false);
        } else {
            xdl0.m208411y(vText, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m122395H(VEditText vEditText, VEditText vEditText2, final Act act, VText vText, final l5j0 l5j0Var, final d30 d30Var, final d30 d30Var2, final VButton vButton, View view) {
        zvf0.m220396r("e_force_bindphone_unidentified_confirm", "p_force_bindphone_unidentified_popup");
        if (TextUtils.isEmpty(vEditText.getText())) {
            lsi0.m151595y("请输入手机号");
            return;
        }
        if (TextUtils.isEmpty(vEditText2.getText())) {
            lsi0.m151595y("请输入短信验证码");
            return;
        }
        act.progress(R$string.f16227j0);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.m214931I(vEditText2);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(vText);
        verifyData.mobileNumber = yij0.m214935M(vEditText);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.countryCode = yij0.m214931I(vText);
        verifyData.mobileNumber = yij0.m214935M(vEditText);
        AccountModule.f16037c.m28272B2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.hn
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122399L(act, l5j0Var, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.in
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122419r(act, d30Var2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m122397J(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        e30Var.call(Marker.ANY_NON_NULL_MARKER + intent.getIntExtra("ccode", 86));
        return true;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m122398K(final Act act, final d30 d30Var, final l5j0 l5j0Var, final d30 d30Var2, View view) {
        zvf0.m220396r("e_force_bindphone_identified_confirm", "p_force_bindphone_identified_popup");
        act.duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.ln
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122390C(d30Var, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.mn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.nn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return AccountModule.f16037c.m28306Q1(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.on
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122388A(l5j0Var, d30Var2, (roj0) obj);
            }
        }, new e30() { // from class: l.pn
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122416o(d30Var, act, (Throwable) obj);
            }
        }));
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m122399L(Act act, l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        e51.m114746K("bind_phone_obs");
        m122401N(l5j0Var);
        l5j0Var.m101651T();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m122400M(Act act, final e30<String> e30Var) {
        act.startActivityForResult(CCodeChooseAct.m28658Y1(act), new C4317a.a() { // from class: l.wn
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return C16891fo.m122397J(e30Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    private static void m122401N(@NonNull l5j0 l5j0Var) {
        try {
            Window window = l5j0Var.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) l5j0Var.getContext().getSystemService("input_method");
            if (NullChecker.m81303a(window) && NullChecker.m81303a(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.m81303a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
        }
    }

    /* JADX INFO: renamed from: O */
    public static SpannableStringBuilder m122402O(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            spannableStringBuilder.setSpan(new g(activity, str2, strArr[i + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: P */
    public static l5j0 m122403P(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_force_bindphone_unidentified_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("signup_way", str), vwb.m200311Y("page_display_fromwhich", TextUtils.equals(str2, "verified") ? "verified" : ""));
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setCancelable(false);
        l5j0Var.setContentView(c6c0.f79487a);
        e51.m114746K("bind_phone_obs");
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f152609o)).setBackgroundResource(v2c0.f179453a0);
        }
        e51.m114742G(new Runnable() { // from class: l.zn
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f142609c);
            }
        });
        final VText vText = (VText) l5j0Var.findViewById(q4c0.f152595g);
        final VEditText vEditText = (VEditText) l5j0Var.findViewById(q4c0.f152602j0);
        final VEditText vEditText2 = (VEditText) l5j0Var.findViewById(q4c0.f152599i);
        final VText vText2 = (VText) l5j0Var.findViewById(q4c0.f152614t);
        ((VText) l5j0Var.findViewById(q4c0.f152620z)).setTypeface(eqh0.m117752c(3), 1);
        final Runnable runnable = new Runnable() { // from class: l.ao
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditText, 0);
            }
        };
        final VButton vButton = (VButton) l5j0Var.findViewById(q4c0.f152583a);
        vButton.setBackgroundResource(v2c0.f179511t1);
        vEditText.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.bo
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122426y(vEditText, vText2, vButton, vEditText2, (CharSequence) obj);
            }
        }));
        vEditText2.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.co
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122425x(vEditText, vEditText2, vButton, (CharSequence) obj);
            }
        }));
        vButton.setTypeface(eqh0.m117752c(3), 1);
        l5j0Var.setOnDismissListener(new a(act, runnable, cwf0VarM133794c));
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.eo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122395H(vEditText, vEditText2, act, vText, l5j0Var, d30Var2, d30Var, vButton, view);
            }
        });
        VText vText3 = (VText) l5j0Var.findViewById(q4c0.f152598h0);
        j760<String, String> j760VarM29595d = ChinaMobileController.m29595d();
        if (ChinaMobileController.m29596e() == ChinaMobileController.MobileType.unknown) {
            vText3.setText(i0g0.m133835B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《用户协议》、《隐私策略》", "《用户协议》", juk.m143328j(), "《隐私策略》", juk.m143327i()));
        } else {
            vText3.setText(i0g0.m133835B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + j760VarM29595d.f116564a + "》、《用户协议》、《隐私策略》", "《" + j760VarM29595d.f116564a + "》", j760VarM29595d.f116565b, "《用户协议》", juk.m143328j(), "《隐私策略》", juk.m143327i()));
        }
        vText3.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.m208329E0((VImage) l5j0Var.findViewById(q4c0.f152617w), new View.OnClickListener() { // from class: l.zm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122411j(act, d30Var3, l5j0Var, view);
            }
        });
        vText.setText("" + zqb.f204369d.get(0).f204372b);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.an
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122400M(act, new e30() { // from class: l.kn
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.bn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122408g(vEditText, vText, vText2, vEditText2, act, view);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cn
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C16891fo.m122410i(vEditText, act, runnable, dialogInterface);
            }
        });
        if (!e51.m114737B("bind_phone_obs")) {
            xdl0.m208411y(vText2, vEditText.getText().length() > 0);
        }
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: Q */
    public static l5j0 m122404Q(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3, final d30 d30Var4) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_force_bindphone_identified_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("signup_way", str));
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(c6c0.f79489b);
        l5j0Var.setCancelable(false);
        l5j0Var.setOnDismissListener(new h(cwf0VarM133794c));
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f152609o)).setBackgroundResource(v2c0.f179453a0);
        }
        e51.m114742G(new Runnable() { // from class: l.dn
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f142609c);
            }
        });
        ((VText) l5j0Var.findViewById(q4c0.f152620z)).setTypeface(eqh0.m117752c(3), 1);
        VText vText = (VText) l5j0Var.findViewById(q4c0.f152619y);
        vText.setTypeface(eqh0.m117752c(3), 1);
        if (!TextUtils.isEmpty(str2)) {
            vText.setText(str2);
        }
        VText vText2 = (VText) l5j0Var.findViewById(q4c0.f152618x);
        vText2.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.en
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122413l(d30Var4, l5j0Var, view);
            }
        });
        VButton vButton = (VButton) l5j0Var.findViewById(q4c0.f152583a);
        vButton.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.fn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122398K(act, d30Var3, l5j0Var, d30Var2, view);
            }
        });
        VText vText3 = (VText) l5j0Var.findViewById(q4c0.f152598h0);
        j760<String, String> j760VarM29595d = ChinaMobileController.m29595d();
        vText3.setText(i0g0.m133835B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + j760VarM29595d.f116564a + "》、《用户协议》、《隐私策略》", "《" + j760VarM29595d.f116564a + "》", j760VarM29595d.f116565b, "《用户协议》", juk.m143328j(), "《隐私策略》", juk.m143327i()));
        vText3.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.m208329E0((VImage) l5j0Var.findViewById(q4c0.f152617w), new View.OnClickListener() { // from class: l.gn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122427z(l5j0Var, d30Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: R */
    public static l5j0 m122405R(Act act, final d30 d30Var, d30 d30Var2) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_login_user_agreement_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(c6c0.f79462B);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setOnDismissListener(new e(cwf0VarM133794c, d30Var2));
        l5j0Var.setOnKeyListener(new f());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f152609o)).setBackgroundResource(v2c0.f179453a0);
        }
        e51.m114742G(new Runnable() { // from class: l.un
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f142609c);
            }
        });
        VText vText = (VText) l5j0Var.findViewById(q4c0.f152620z);
        VButton vButton = (VButton) l5j0Var.findViewById(q4c0.f152583a);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.xn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122415n(d30Var, l5j0Var, view);
            }
        });
        VText vText2 = (VText) l5j0Var.findViewById(q4c0.f152596g0);
        if (IntlCountryCodeController.m28120p()) {
            vText.setText(R$string.f16174a1);
            vButton.setText(R$string.f16168Z0);
            vText2.setTextColor(Color.parseColor("#66000000"));
            vText2.setLinkTextColor(Color.parseColor("#66000000"));
            vText2.setText(m122402O(act, act.string(R$string.f16273r0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f16278s0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.string(R$string.f16085I2), act.string(R$string.f16273r0), juk.m143328j(), act.string(R$string.f16085I2), juk.m143327i()));
        } else {
            vText2.setTextColor(Color.parseColor("#66000000"));
            vText2.setLinkTextColor(Color.parseColor("#66000000"));
            vText2.setText(i0g0.m133834A(act, Typeface.DEFAULT_BOLD, "《用户协议》和《隐私策略》", "《用户协议》", juk.m143328j(), "《隐私策略》", juk.m143327i()));
        }
        vText2.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.m208329E0((VImage) l5j0Var.findViewById(q4c0.f152617w), new View.OnClickListener() { // from class: l.yn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122412k(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: S */
    public static l5j0 m122406S(Act act, boolean z, boolean z2, boolean z3, d30 d30Var, d30 d30Var2, final e30<Boolean> e30Var) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_other_signin_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(c6c0.f79472L);
        l5j0Var.setOnKeyListener(new b());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f152609o)).setBackgroundResource(v2c0.f179453a0);
        }
        e51.m114742G(new Runnable() { // from class: l.ym
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f142609c);
            }
        });
        VRecyclerView vRecyclerView = (VRecyclerView) l5j0Var.findViewById(q4c0.f152569M);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        ArrayList arrayList = new ArrayList();
        C17199gy c17199gy = new C17199gy(act);
        if (z2) {
            zvf0.m220368A("e_other_signin_way", "p_other_signin_popup", vwb.m200311Y("display_signin_way", "wechat"));
            arrayList.add(new AccountShareItemBean("微信", v2c0.f179446X, d30Var));
        }
        if (z3) {
            zvf0.m220368A("e_other_signin_way", "p_other_signin_popup", vwb.m200311Y("display_signin_way", "qq"));
            arrayList.add(new AccountShareItemBean(Constants.SOURCE_QQ, v2c0.f179443W, d30Var2));
        }
        vRecyclerView.setAdapter(c17199gy);
        c17199gy.m128672C(arrayList);
        c17199gy.m128673D(new c(arrayList));
        final VCheckBox vCheckBox = (VCheckBox) l5j0Var.findViewById(q4c0.f152567K);
        xdl0.m208329E0(vCheckBox, new View.OnClickListener() { // from class: l.jn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16891fo.m122423v(e30Var, vCheckBox, view);
            }
        });
        VText vText = (VText) l5j0Var.findViewById(q4c0.f152568L);
        if (z) {
            vCheckBox.setChecked(true);
        }
        vText.setText(i0g0.m133835B(act, act.getString(R$string.f16116O3, String.format(" %s ", act.string(R$string.f16273r0)), String.format(" %s", act.string(R$string.f16085I2))), act.string(R$string.f16273r0), juk.m143328j(), act.string(R$string.f16085I2), juk.m143327i()));
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        l5j0Var.setOnDismissListener(new d(cwf0VarM133794c));
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: T */
    public static void m122407T(Act act, String str, String str2, String str3) {
        act.dialog().m20507G0(str).m20504F(str2).m20558u0(str3).m20496B(true).m20567z().show();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m122408g(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, View view) {
        zvf0.m220396r("e_force_bindphone_unidentified_getcode", "p_force_bindphone_unidentified_popup");
        if (!yr60.m215806n1(yij0.m214935M(vEditText), yij0.m214931I(vText) == 86)) {
            lsi0.m151595y("请输入正确手机号");
            return;
        }
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(vText);
        verifyData.mobileNumber = yij0.m214935M(vEditText);
        xdl0.m208411y(vText2, false);
        vText2.setEnabled(false);
        vText2.setText("...");
        AccountModule.f16037c.m28324b2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.qn
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122391D(vEditText2, vText2, act, vEditText, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.rn
            @Override // p149l.e30
            public final void call(Object obj) {
                C16891fo.m122420s(vText2, vEditText, act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m122410i(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (vwb.m200298L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m122411j(Act act, d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_force_bindphone_unidentified_cancel", "p_force_bindphone_unidentified_popup");
        if (e51.m114737B(act.getLocalClassName())) {
            e51.m114746K(act.getLocalClassName());
        }
        d30Var.call();
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m122412k(l5j0 l5j0Var, View view) {
        zvf0.m220399u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", vwb.m200311Y("cancel_back", "cancle"));
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m122413l(d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_force_bindphone_identified_choose_other", "p_force_bindphone_identified_popup");
        d30Var.call();
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m122415n(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            zvf0.m220396r("e_login_user_agreement_popup_confirm", "p_login_user_agreement_popup");
            d30Var.call();
            l5j0Var.m101651T();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m122416o(d30 d30Var, Act act, Throwable th) {
        d30Var.call();
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            yij0.m214929G(th);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m122418q(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m122419r(Act act, d30 d30Var, VButton vButton, Throwable th) {
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.m214929G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.m214929G(th);
            return;
        }
        String strM214956l = yij0.m214956l(i);
        if (strM214956l == null) {
            d30Var.call();
            yij0.m214929G(th);
        } else {
            lsi0.m151595y(strM214956l);
            xdl0.m208360X(vButton, t100.f167261j);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m122420s(VText vText, VEditText vEditText, Act act, Throwable th) {
        vText.setClickable(true);
        vText.setEnabled(true);
        vText.setText(R$string.f16276r3);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.m208411y(vText, false);
        } else {
            xdl0.m208411y(vText, true);
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m198583c(act);
            return;
        }
        if (!z) {
            yij0.m214929G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.m214929G(th);
            return;
        }
        String strM214956l = yij0.m214956l(i);
        if (strM214956l == null) {
            yij0.m214929G(th);
        } else {
            lsi0.m151595y(strM214956l);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m122422u(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f16237k4)));
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m122423v(e30 e30Var, VCheckBox vCheckBox, View view) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.valueOf(vCheckBox.isChecked()));
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m122425x(VEditText vEditText, VEditText vEditText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(v2c0.f179511t1);
        } else {
            vButton.setBackgroundResource(v2c0.f179409K1);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m122426y(VEditText vEditText, VText vText, VButton vButton, VEditText vEditText2, CharSequence charSequence) {
        if (vEditText.getText().toString().isEmpty() || e51.m114737B("bind_phone_obs")) {
            xdl0.m208411y(vText, false);
        } else {
            xdl0.m208411y(vText, true);
        }
        xdl0.m208360X(vButton, t100.f167268q);
        zvf0.m220400v("e_force_bindphone_unidentified_input", "p_force_bindphone_unidentified_popup", new j760[0]);
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(v2c0.f179511t1);
        } else {
            vButton.setBackgroundResource(v2c0.f179409K1);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m122427z(l5j0 l5j0Var, d30 d30Var, View view) {
        zvf0.m220396r("e_force_bindphone_identified_cancel", "p_force_bindphone_identified_popup");
        l5j0Var.m101651T();
        d30Var.call();
    }
}
