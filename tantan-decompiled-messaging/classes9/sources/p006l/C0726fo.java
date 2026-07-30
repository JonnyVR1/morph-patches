package p006l;

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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.AccountShareItemBean;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.ui.WebViewPreAct;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.i0e;
import l.i0g0;
import l.j760;
import l.juk;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zqb;
import l.zvf0;
import v.VButton;
import v.VCheckBox;
import v.VEditText;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: renamed from: l.fo */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0726fo extends i0e {

    /* JADX INFO: renamed from: l.fo$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f12801a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f12802b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cwf0 f12803c;

        public a(Act act, Runnable runnable, cwf0 cwf0Var) {
            this.f12801a = act;
            this.f12802b = runnable;
            this.f12803c = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f12801a.removeCallbacks(this.f12802b);
            i0e.e(this.f12803c);
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
    public class c implements C0784gy.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f12804a;

        public c(List list) {
            this.f12804a = list;
        }

        @Override // p006l.C0784gy.b
        /* JADX INFO: renamed from: a */
        public void mo15414a(View view, int i) {
            AccountShareItemBean accountShareItemBean = (AccountShareItemBean) this.f12804a.get(i);
            if (NullChecker.a(accountShareItemBean)) {
                String name = accountShareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        zvf0.u("e_other_signin_way", "p_other_signin_popup", new j760[]{vwb.Y("choose_which_signin_way", "wechat")});
                    } else if ("QQ".equals(name)) {
                        zvf0.u("e_other_signin_way", "p_other_signin_popup", new j760[]{vwb.Y("choose_which_signin_way", "qq")});
                    }
                }
                if (NullChecker.a(((AccountShareItemBean) this.f12804a.get(i)).getAction())) {
                    ((AccountShareItemBean) this.f12804a.get(i)).getAction().call();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.fo$d */
    public class d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f12805a;

        public d(cwf0 cwf0Var) {
            this.f12805a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            zvf0.r("e_other_signin_cancel", "p_other_signin_popup");
            i0e.e(this.f12805a);
        }
    }

    /* JADX INFO: renamed from: l.fo$e */
    public class e implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f12806a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f12807b;

        public e(cwf0 cwf0Var, d30 d30Var) {
            this.f12806a = cwf0Var;
            this.f12807b = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f12806a);
            this.f12807b.call();
        }
    }

    /* JADX INFO: renamed from: l.fo$f */
    public class f implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            zvf0.u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", new j760[]{vwb.Y("cancel_back", AccountMakeupPageAdapter.MakeupItem.BACK)});
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.fo$g */
    public class g extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f12808a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f12809b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f12810c;

        public g(Activity activity, String str, String str2) {
            this.f12808a = activity;
            this.f12809b = str;
            this.f12810c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f12808a;
            AccountTempApi accountTempApi = qib0.f19788L;
            String str = this.f12809b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.J0(activity, str, this.f12810c) : WebViewAct.Z1(activity, str, this.f12810c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: l.fo$h */
    public class h implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f12811a;

        public h(cwf0 cwf0Var) {
            this.f12811a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f12811a);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m15374A(l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        l5j0Var.dismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m15376C(d30 d30Var, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            lsi0.y("手机绑定失败");
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m15377D(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, RiskVerification riskVerification) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f35A3);
        act.duringCreated(e51.N("bind_phone_obs", 60)).subscribe(mkd0.I(new e30() { // from class: l.sn
            public final void call(Object obj) {
                C0726fo.m15408u(vText, act, (Long) obj);
            }
        }, new e30() { // from class: l.tn
            public final void call(Object obj) {
                C0726fo.m15404q((Throwable) obj);
            }
        }, new d30() { // from class: l.vn
            public final void call() {
                C0726fo.m15379F(vText, vEditText2);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m15379F(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f265r3);
        xdl0.y(vText, false);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.y(vText, false);
        } else {
            xdl0.y(vText, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m15381H(VEditText vEditText, VEditText vEditText2, final Act act, VText vText, final l5j0 l5j0Var, final d30 d30Var, final d30 d30Var2, final VButton vButton, View view) {
        zvf0.r("e_force_bindphone_unidentified_confirm", "p_force_bindphone_unidentified_popup");
        if (TextUtils.isEmpty(vEditText.getText())) {
            lsi0.y("请输入手机号");
            return;
        }
        if (TextUtils.isEmpty(vEditText2.getText())) {
            lsi0.y("请输入短信验证码");
            return;
        }
        act.progress(R$string.f216j0);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.I(vEditText2);
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(vText);
        verifyData.mobileNumber = yij0.M(vEditText);
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.countryCode = yij0.I(vText);
        verifyData.mobileNumber = yij0.M(vEditText);
        AccountModule.f26c.m167B2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.hn
            public final void call(Object obj) {
                C0726fo.m15385L(act, l5j0Var, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.in
            public final void call(Object obj) {
                C0726fo.m15405r(act, d30Var2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m15383J(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        e30Var.call("+" + intent.getIntExtra("ccode", 86));
        return true;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m15384K(final Act act, final d30 d30Var, final l5j0 l5j0Var, final d30 d30Var2, View view) {
        zvf0.r("e_force_bindphone_identified_confirm", "p_force_bindphone_identified_popup");
        act.duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.ln
            public final void call(Object obj) {
                C0726fo.m15376C(d30Var, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.mn
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.nn
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return AccountModule.f26c.m201Q1(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(mkd0.H(new e30() { // from class: l.on
            public final void call(Object obj) {
                C0726fo.m15374A(l5j0Var, d30Var2, (roj0) obj);
            }
        }, new e30() { // from class: l.pn
            public final void call(Object obj) {
                C0726fo.m15402o(d30Var, act, (Throwable) obj);
            }
        }));
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m15385L(Act act, l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        e51.K("bind_phone_obs");
        m15387N(l5j0Var);
        l5j0Var.dismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m15386M(Act act, final e30<String> e30Var) {
        act.startActivityForResult(CCodeChooseAct.m557Y1(act), new com.p1.mobile.android.app.a.a() { // from class: l.wn
            /* JADX INFO: renamed from: a */
            public final boolean m26509a(int i, int i2, Intent intent) {
                return C0726fo.m15383J(e30Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    private static void m15387N(@NonNull l5j0 l5j0Var) {
        try {
            Window window = l5j0Var.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) l5j0Var.getContext().getSystemService("input_method");
            if (NullChecker.a(window) && NullChecker.a(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e2) {
            CrashHelper.c(e2);
        }
    }

    /* JADX INFO: renamed from: O */
    public static SpannableStringBuilder m15388O(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            spannableStringBuilder.setSpan(new g(activity, str2, strArr[i + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: P */
    public static l5j0 m15389P(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        cwf0 cwf0VarC = i0e.c("p_force_bindphone_unidentified_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("signup_way", str), vwb.Y("page_display_fromwhich", TextUtils.equals(str2, "verified") ? "verified" : "")});
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setCancelable(false);
        l5j0Var.setContentView(c6c0.f9417a);
        e51.K("bind_phone_obs");
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f19619o)).setBackgroundResource(v2c0.f24017a0);
        }
        e51.G(new Runnable() { // from class: l.zn
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f18072c);
            }
        });
        final VText vTextFindViewById = l5j0Var.findViewById(q4c0.f19605g);
        final VEditText vEditTextFindViewById = l5j0Var.findViewById(q4c0.f19612j0);
        final VEditText vEditTextFindViewById2 = l5j0Var.findViewById(q4c0.f19609i);
        final VText vTextFindViewById2 = l5j0Var.findViewById(q4c0.f19624t);
        l5j0Var.findViewById(q4c0.f19630z).setTypeface(eqh0.c(3), 1);
        final Runnable runnable = new Runnable() { // from class: l.ao
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditTextFindViewById, 0);
            }
        };
        final VButton vButtonFindViewById = l5j0Var.findViewById(q4c0.f19593a);
        vButtonFindViewById.setBackgroundResource(v2c0.f24075t1);
        vEditTextFindViewById.h().subscribe(mkd0.G(new e30() { // from class: l.bo
            public final void call(Object obj) {
                C0726fo.m15412y(vEditTextFindViewById, vTextFindViewById2, vButtonFindViewById, vEditTextFindViewById2, (CharSequence) obj);
            }
        }));
        vEditTextFindViewById2.h().subscribe(mkd0.G(new e30() { // from class: l.co
            public final void call(Object obj) {
                C0726fo.m15411x(vEditTextFindViewById, vEditTextFindViewById2, vButtonFindViewById, (CharSequence) obj);
            }
        }));
        vButtonFindViewById.setTypeface(eqh0.c(3), 1);
        l5j0Var.setOnDismissListener(new a(act, runnable, cwf0VarC));
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.eo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15381H(vEditTextFindViewById, vEditTextFindViewById2, act, vTextFindViewById, l5j0Var, d30Var2, d30Var, vButtonFindViewById, view);
            }
        });
        VText vTextFindViewById3 = l5j0Var.findViewById(q4c0.f19608h0);
        j760<String, String> j760VarM1501d = ChinaMobileController.m1501d();
        if (ChinaMobileController.m1502e() == ChinaMobileController.MobileType.unknown) {
            vTextFindViewById3.setText(i0g0.B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《用户协议》、《隐私策略》", new String[]{"《用户协议》", juk.j(), "《隐私策略》", juk.i()}));
        } else {
            vTextFindViewById3.setText(i0g0.B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + ((String) j760VarM1501d.a) + "》、《用户协议》、《隐私策略》", new String[]{"《" + ((String) j760VarM1501d.a) + "》", (String) j760VarM1501d.b, "《用户协议》", juk.j(), "《隐私策略》", juk.i()}));
        }
        vTextFindViewById3.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.E0(l5j0Var.findViewById(q4c0.f19627w), new View.OnClickListener() { // from class: l.zm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15397j(act, d30Var3, l5j0Var, view);
            }
        });
        vTextFindViewById.setText("" + ((zqb) zqb.d.get(0)).b);
        xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.an
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15386M(act, new e30() { // from class: l.kn
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        xdl0.E0(vTextFindViewById2, new View.OnClickListener() { // from class: l.bn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15394g(vEditTextFindViewById, vTextFindViewById, vTextFindViewById2, vEditTextFindViewById2, act, view);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cn
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C0726fo.m15396i(vEditTextFindViewById, act, runnable, dialogInterface);
            }
        });
        if (!e51.B("bind_phone_obs")) {
            xdl0.y(vTextFindViewById2, vEditTextFindViewById.getText().length() > 0);
        }
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: Q */
    public static l5j0 m15390Q(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3, final d30 d30Var4) {
        cwf0 cwf0VarC = i0e.c("p_force_bindphone_identified_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("signup_way", str)});
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(c6c0.f9419b);
        l5j0Var.setCancelable(false);
        l5j0Var.setOnDismissListener(new h(cwf0VarC));
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f19619o)).setBackgroundResource(v2c0.f24017a0);
        }
        e51.G(new Runnable() { // from class: l.dn
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f18072c);
            }
        });
        l5j0Var.findViewById(q4c0.f19630z).setTypeface(eqh0.c(3), 1);
        VText vTextFindViewById = l5j0Var.findViewById(q4c0.f19629y);
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        if (!TextUtils.isEmpty(str2)) {
            vTextFindViewById.setText(str2);
        }
        VText vTextFindViewById2 = l5j0Var.findViewById(q4c0.f19628x);
        vTextFindViewById2.setTypeface(eqh0.c(3), 1);
        xdl0.E0(vTextFindViewById2, new View.OnClickListener() { // from class: l.en
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15399l(d30Var4, l5j0Var, view);
            }
        });
        VButton vButtonFindViewById = l5j0Var.findViewById(q4c0.f19593a);
        vButtonFindViewById.setTypeface(eqh0.c(3), 1);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.fn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15384K(act, d30Var3, l5j0Var, d30Var2, view);
            }
        });
        VText vTextFindViewById3 = l5j0Var.findViewById(q4c0.f19608h0);
        j760<String, String> j760VarM1501d = ChinaMobileController.m1501d();
        vTextFindViewById3.setText(i0g0.B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + ((String) j760VarM1501d.a) + "》、《用户协议》、《隐私策略》", new String[]{"《" + ((String) j760VarM1501d.a) + "》", (String) j760VarM1501d.b, "《用户协议》", juk.j(), "《隐私策略》", juk.i()}));
        vTextFindViewById3.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.E0(l5j0Var.findViewById(q4c0.f19627w), new View.OnClickListener() { // from class: l.gn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15413z(l5j0Var, d30Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: R */
    public static l5j0 m15391R(Act act, final d30 d30Var, d30 d30Var2) {
        cwf0 cwf0VarC = i0e.c("p_login_user_agreement_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(c6c0.f9392B);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setOnDismissListener(new e(cwf0VarC, d30Var2));
        l5j0Var.setOnKeyListener(new f());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f19619o)).setBackgroundResource(v2c0.f24017a0);
        }
        e51.G(new Runnable() { // from class: l.un
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f18072c);
            }
        });
        VText vTextFindViewById = l5j0Var.findViewById(q4c0.f19630z);
        VButton vButtonFindViewById = l5j0Var.findViewById(q4c0.f19593a);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.xn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15401n(d30Var, l5j0Var, view);
            }
        });
        VText vTextFindViewById2 = l5j0Var.findViewById(q4c0.f19606g0);
        if (IntlCountryCodeController.m15p()) {
            vTextFindViewById.setText(R$string.f163a1);
            vButtonFindViewById.setText(R$string.f157Z0);
            vTextFindViewById2.setTextColor(Color.parseColor("#66000000"));
            vTextFindViewById2.setLinkTextColor(Color.parseColor("#66000000"));
            vTextFindViewById2.setText(m15388O(act, act.string(R$string.f262r0) + " " + act.getString(R$string.f267s0) + " " + act.string(R$string.f74I2), act.string(R$string.f262r0), juk.j(), act.string(R$string.f74I2), juk.i()));
        } else {
            vTextFindViewById2.setTextColor(Color.parseColor("#66000000"));
            vTextFindViewById2.setLinkTextColor(Color.parseColor("#66000000"));
            vTextFindViewById2.setText(i0g0.A(act, Typeface.DEFAULT_BOLD, "《用户协议》和《隐私策略》", new String[]{"《用户协议》", juk.j(), "《隐私策略》", juk.i()}));
        }
        vTextFindViewById2.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.E0(l5j0Var.findViewById(q4c0.f19627w), new View.OnClickListener() { // from class: l.yn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15398k(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: S */
    public static l5j0 m15392S(Act act, boolean z, boolean z2, boolean z3, d30 d30Var, d30 d30Var2, final e30<Boolean> e30Var) {
        cwf0 cwf0VarC = i0e.c("p_other_signin_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(c6c0.f9402L);
        l5j0Var.setOnKeyListener(new b());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f19619o)).setBackgroundResource(v2c0.f24017a0);
        }
        e51.G(new Runnable() { // from class: l.ym
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f18072c);
            }
        });
        VRecyclerView vRecyclerViewFindViewById = l5j0Var.findViewById(q4c0.f19579M);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerViewFindViewById.setLayoutManager(linearLayoutManager);
        ArrayList arrayList = new ArrayList();
        C0784gy c0784gy = new C0784gy(act);
        if (z2) {
            zvf0.A("e_other_signin_way", "p_other_signin_popup", new j760[]{vwb.Y("display_signin_way", "wechat")});
            arrayList.add(new AccountShareItemBean("微信", v2c0.f24010X, d30Var));
        }
        if (z3) {
            zvf0.A("e_other_signin_way", "p_other_signin_popup", new j760[]{vwb.Y("display_signin_way", "qq")});
            arrayList.add(new AccountShareItemBean("QQ", v2c0.f24007W, d30Var2));
        }
        vRecyclerViewFindViewById.setAdapter(c0784gy);
        c0784gy.m16006C(arrayList);
        c0784gy.m16007D(new c(arrayList));
        final VCheckBox vCheckBoxFindViewById = l5j0Var.findViewById(q4c0.f19577K);
        xdl0.E0(vCheckBoxFindViewById, new View.OnClickListener() { // from class: l.jn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0726fo.m15409v(e30Var, vCheckBoxFindViewById, view);
            }
        });
        VText vTextFindViewById = l5j0Var.findViewById(q4c0.f19578L);
        if (z) {
            vCheckBoxFindViewById.setChecked(true);
        }
        vTextFindViewById.setText(i0g0.B(act, act.getString(R$string.f105O3, String.format(" %s ", act.string(R$string.f262r0)), String.format(" %s", act.string(R$string.f74I2))), new String[]{act.string(R$string.f262r0), juk.j(), act.string(R$string.f74I2), juk.i()}));
        vTextFindViewById.setMovementMethod(LinkMovementMethod.getInstance());
        l5j0Var.setOnDismissListener(new d(cwf0VarC));
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: T */
    public static void m15393T(Act act, String str, String str2, String str3) {
        act.dialog().G0(str).F(str2).u0(str3).B(true).z().show();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m15394g(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, View view) {
        zvf0.r("e_force_bindphone_unidentified_getcode", "p_force_bindphone_unidentified_popup");
        if (!yr60.m28347n1(yij0.M(vEditText), yij0.I(vText) == 86)) {
            lsi0.y("请输入正确手机号");
            return;
        }
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(vText);
        verifyData.mobileNumber = yij0.M(vEditText);
        xdl0.y(vText2, false);
        vText2.setEnabled(false);
        vText2.setText("...");
        AccountModule.f26c.m219b2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.qn
            public final void call(Object obj) {
                C0726fo.m15377D(vEditText2, vText2, act, vEditText, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.rn
            public final void call(Object obj) {
                C0726fo.m15406s(vText2, vEditText, act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15396i(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (vwb.L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m15397j(Act act, d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.r("e_force_bindphone_unidentified_cancel", "p_force_bindphone_unidentified_popup");
        if (e51.B(act.getLocalClassName())) {
            e51.K(act.getLocalClassName());
        }
        d30Var.call();
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m15398k(l5j0 l5j0Var, View view) {
        zvf0.u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", new j760[]{vwb.Y("cancel_back", "cancle")});
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m15399l(d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.r("e_force_bindphone_identified_choose_other", "p_force_bindphone_identified_popup");
        d30Var.call();
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m15401n(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.a(d30Var)) {
            zvf0.r("e_login_user_agreement_popup_confirm", "p_login_user_agreement_popup");
            d30Var.call();
            l5j0Var.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m15402o(d30 d30Var, Act act, Throwable th) {
        d30Var.call();
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            yij0.G(th);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m15404q(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m15405r(Act act, d30 d30Var, VButton vButton, Throwable th) {
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.G(th);
            return;
        }
        String strL = yij0.l(i);
        if (strL == null) {
            d30Var.call();
            yij0.G(th);
        } else {
            lsi0.y(strL);
            xdl0.X(vButton, t100.j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m15406s(VText vText, VEditText vEditText, Act act, Throwable th) {
        vText.setClickable(true);
        vText.setEnabled(true);
        vText.setText(R$string.f265r3);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.y(vText, false);
        } else {
            xdl0.y(vText, true);
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m25823c(act);
            return;
        }
        if (!z) {
            yij0.G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.G(th);
            return;
        }
        String strL = yij0.l(i);
        if (strL == null) {
            yij0.G(th);
        } else {
            lsi0.y(strL);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m15408u(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f226k4)));
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m15409v(e30 e30Var, VCheckBox vCheckBox, View view) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.valueOf(vCheckBox.isChecked()));
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m15411x(VEditText vEditText, VEditText vEditText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(v2c0.f24075t1);
        } else {
            vButton.setBackgroundResource(v2c0.f23973K1);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m15412y(VEditText vEditText, VText vText, VButton vButton, VEditText vEditText2, CharSequence charSequence) {
        if (vEditText.getText().toString().isEmpty() || e51.B("bind_phone_obs")) {
            xdl0.y(vText, false);
        } else {
            xdl0.y(vText, true);
        }
        xdl0.X(vButton, t100.q);
        zvf0.v("e_force_bindphone_unidentified_input", "p_force_bindphone_unidentified_popup", new j760[0]);
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(v2c0.f24075t1);
        } else {
            vButton.setBackgroundResource(v2c0.f23973K1);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m15413z(l5j0 l5j0Var, d30 d30Var, View view) {
        zvf0.r("e_force_bindphone_identified_cancel", "p_force_bindphone_identified_popup");
        l5j0Var.dismiss();
        d30Var.call();
    }
}
