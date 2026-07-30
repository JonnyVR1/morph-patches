package p149l;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.AccountShareItemBean;
import com.p046p1.mobile.putong.account.data.CaptchaData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.VCodeCaptchaView;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.WebViewPreAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.slf4j.Marker;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: renamed from: l.xm */
/* JADX INFO: loaded from: classes9.dex */
public class C21176xm extends i0e {

    /* JADX INFO: renamed from: l.xm$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f193512a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f193513b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cwf0 f193514c;

        public a(Act act, Runnable runnable, cwf0 cwf0Var) {
            this.f193512a = act;
            this.f193513b = runnable;
            this.f193514c = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f193512a.removeCallbacks(this.f193513b);
            i0e.m133796e(this.f193514c);
        }
    }

    /* JADX INFO: renamed from: l.xm$b */
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

    /* JADX INFO: renamed from: l.xm$c */
    public class c implements C17199gy.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f193515a;

        public c(List list) {
            this.f193515a = list;
        }

        @Override // p149l.C17199gy.b
        /* JADX INFO: renamed from: a */
        public void mo122428a(View view, int i) {
            AccountShareItemBean accountShareItemBean = (AccountShareItemBean) this.f193515a.get(i);
            if (NullChecker.m81303a(accountShareItemBean)) {
                String name = accountShareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        zvf0.m220399u("e_other_signin_way", "p_other_signin_popup", vwb.m200311Y("choose_which_signin_way", "wechat"));
                    } else if (Constants.SOURCE_QQ.equals(name)) {
                        zvf0.m220399u("e_other_signin_way", "p_other_signin_popup", vwb.m200311Y("choose_which_signin_way", "qq"));
                    }
                }
                if (NullChecker.m81303a(((AccountShareItemBean) this.f193515a.get(i)).getAction())) {
                    ((AccountShareItemBean) this.f193515a.get(i)).getAction().call();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.xm$d */
    public class d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f193516a;

        public d(cwf0 cwf0Var) {
            this.f193516a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            zvf0.m220396r("e_other_signin_cancel", "p_other_signin_popup");
            i0e.m133796e(this.f193516a);
        }
    }

    /* JADX INFO: renamed from: l.xm$e */
    public class e extends AbstractC15503a<zqb> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Act f193517c;

        public e(Act act) {
            this.f193517c = act;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f193517c).inflate(c6c0.f79511m, viewGroup, false);
        }

        @Override // p149l.AbstractC15503a
        /* JADX INFO: renamed from: p */
        public List<zqb> mo20404p() {
            return zqb.f204369d;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, zqb zqbVar, int i, int i2) {
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.getChildAt(0);
            TextView textView2 = (TextView) viewGroup.getChildAt(1);
            textView.setText(zqbVar.f204371a);
            textView2.setText(Marker.ANY_NON_NULL_MARKER + zqbVar.f204372b);
        }
    }

    /* JADX INFO: renamed from: l.xm$f */
    public class f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f193518a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f193519b;

        public f(cwf0 cwf0Var, d30 d30Var) {
            this.f193518a = cwf0Var;
            this.f193519b = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f193518a);
            this.f193519b.call();
        }
    }

    /* JADX INFO: renamed from: l.xm$g */
    public class g implements DialogInterface.OnKeyListener {
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

    /* JADX INFO: renamed from: l.xm$h */
    public class h extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f193520a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f193521b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f193522c;

        public h(Activity activity, String str, String str2) {
            this.f193520a = activity;
            this.f193521b = str;
            this.f193522c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f193520a;
            AccountTempApi accountTempApi = qib0.f154697L;
            String str = this.f193521b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m79402J0(activity, str, this.f193522c) : WebViewAct.m80164Z1(activity, str, this.f193522c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: l.xm$i */
    public class i implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f193523a;

        public i(cwf0 cwf0Var) {
            this.f193523a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f193523a);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m209974A(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f16237k4)));
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m209976C(l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        l5j0Var.m101651T();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m209978E(VEditText vEditText, VEditText vEditText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(v2c0.f179511t1);
        } else {
            vButton.setBackgroundResource(v2c0.f179409K1);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m209979F(Act act, l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        e51.m114746K("bind_phone_obs");
        m210003d0(l5j0Var);
        l5j0Var.m101651T();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m209980G(l5j0 l5j0Var, d30 d30Var, View view) {
        zvf0.m220396r("e_force_bindphone_identified_cancel", "p_force_bindphone_identified_popup");
        l5j0Var.m101651T();
        d30Var.call();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m209981H(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, RiskVerification riskVerification) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f16046A3);
        act.duringCreated(e51.m114749N("bind_phone_obs", 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.om
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m209974A(vText, act, (Long) obj);
            }
        }, new e30() { // from class: l.pm
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m210031x((Throwable) obj);
            }
        }, new d30() { // from class: l.qm
            @Override // p149l.d30
            public final void call() {
                C21176xm.m210029v(vText, vEditText2);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m209982I(VText vText, VEditText vEditText, Act act, Throwable th) {
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
        int i2 = ((TantanException.Client.AccountService) th).code;
        if (i2 == 40000) {
            yij0.m214929G(th);
            return;
        }
        String strM214956l = yij0.m214956l(i2);
        if (strM214956l == null) {
            yij0.m214929G(th);
        } else {
            lsi0.m151595y(strM214956l);
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m209984K(e30 e30Var, Dialog dialog, View view, int i2, CharSequence charSequence) {
        String str = Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(i2).f204372b;
        WelcomeAct.f17059h = str;
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m209986M(e30 e30Var, List list, List list2, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (!NullChecker.m81303a(e30Var) || i2 >= list.size()) {
            return;
        }
        e30Var.call(BloodType.get((String) list2.get(i2)));
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m209987N(Dialog dialog, e30 e30Var, Pair pair) {
        dialog.dismiss();
        e30Var.call(pair);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m209988O(Act act, d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_force_bindphone_unidentified_cancel", "p_force_bindphone_unidentified_popup");
        if (e51.m114737B(act.getLocalClassName())) {
            e51.m114746K(act.getLocalClassName());
        }
        d30Var.call();
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m209989P(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, View view) {
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
        AccountModule.f16037c.m28324b2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.em
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m209981H(vEditText2, vText2, act, vEditText, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.fm
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m209982I(vText2, vEditText, act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ boolean m209990Q(e30 e30Var, int i2, int i3, Intent intent) {
        if (i3 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        e30Var.call(Marker.ANY_NON_NULL_MARKER + intent.getIntExtra("ccode", 86));
        return true;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m209992S(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            zvf0.m220396r("e_login_user_agreement_popup_confirm", "p_login_user_agreement_popup");
            d30Var.call();
            l5j0Var.m101651T();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m209993T(l5j0 l5j0Var, View view) {
        zvf0.m220399u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", vwb.m200311Y("cancel_back", "cancle"));
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m209996W(d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_force_bindphone_identified_choose_other", "p_force_bindphone_identified_popup");
        d30Var.call();
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m209997X(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ Unit m209998Y(e30 e30Var, Act act, Integer num, Integer num2, Integer num3, Date date) {
        e30Var.call(Double.valueOf(date.getTime()));
        if (!qib0.f154714c0.signedIn_() || !NullChecker.m81305c(act, SchemeKey.account, CrashHelper.ReportLevel.p9) || !AccountModule.m28132H().instanceofPersonalDetailsAct(act)) {
            return null;
        }
        zvf0.m220396r("e_edit_basic_info_calendar", "p_edit_basic_info_view");
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m210000a0(Act act, final e30<String> e30Var) {
        act.startActivityForResult(CCodeChooseAct.m28658Y1(act), new C4317a.a() { // from class: l.nm
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i2, int i3, Intent intent) {
                return C21176xm.m209990Q(e30Var, i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public static void m210001b0(Act act, e30<String> e30Var) {
        m210002c0(act, e30Var, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m210002c0(Act act, final e30<String> e30Var, final cwf0 cwf0Var) {
        i0e.m133797f(cwf0Var);
        act.dialog().m20547p(new e(act)).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.dl
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C21176xm.m209984K(e30Var, dialog, view, i2, charSequence);
            }
        }).m20527W(true).m20526V(new DialogInterface.OnDismissListener() { // from class: l.ol
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0Var);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: d0 */
    public static void m210003d0(@NonNull l5j0 l5j0Var) {
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

    /* JADX INFO: renamed from: e0 */
    public static SpannableStringBuilder m210004e0(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str2 = strArr[i2];
            spannableStringBuilder.setSpan(new h(activity, str2, strArr[i2 + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m210005f0(final Act act, v9j<Double> v9jVar, final e30<Double> e30Var, final e30<Double> e30Var2, final e30<Boolean> e30Var3, final d30 d30Var) {
        new c03(act).m104725m(new Date((long) v9jVar.call().doubleValue()), new Function1() { // from class: l.jl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C21176xm.m210026s(act, e30Var3, e30Var2, (Date) obj);
            }
        }, new Function4() { // from class: l.kl
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C21176xm.m209998Y(e30Var, act, (Integer) obj, (Integer) obj2, (Integer) obj3, (Date) obj4);
            }
        }, new Function0() { // from class: l.ll
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C21176xm.m210016l(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m210006g(e30 e30Var, List list, List list2, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (!NullChecker.m81303a(e30Var) || i2 >= list.size()) {
            return;
        }
        e30Var.call(QualificationType.get((String) list2.get(i2)));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m210007g0(Act act, final e30<BloodType> e30Var) {
        Application application = App.f15369e;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(application.getResources().getString(R$string.f16057D));
        arrayList.add(application.getResources().getString(R$string.f16067F));
        arrayList.add(application.getResources().getString(R$string.f16072G));
        arrayList.add(application.getResources().getString(R$string.f16062E));
        arrayList.add(application.getResources().getString(R$string.f16077H));
        final ArrayList arrayListM200324f0 = vwb.m200324f0("A", "B", BloodType.f38728O, BloodType.f38726AB, "UNKNOWN");
        act.dialog().m20503E0(R$string.f16052C).m20535e0(arrayList).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.rm
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C21176xm.m209986M(e30Var, arrayList, arrayListM200324f0, dialog, view, i2, charSequence);
            }
        }).m20541k0(R$string.f16178b).m20526V(new DialogInterface.OnDismissListener() { // from class: l.sm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C21176xm.m209997X(dialogInterface);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m210008h(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: h0 */
    public static void m210009h0(Act act, final e30<QualificationType> e30Var) {
        Application application = App.f15369e;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(application.getResources().getString(R$string.f16115O2));
        arrayList.add(application.getResources().getString(R$string.f16125Q2));
        arrayList.add(application.getResources().getString(R$string.f16110N2));
        arrayList.add(application.getResources().getString(R$string.f16130R2));
        arrayList.add(application.getResources().getString(R$string.f16100L2));
        arrayList.add(application.getResources().getString(R$string.f16120P2));
        arrayList.add(application.getResources().getString(R$string.f16105M2));
        final ArrayList arrayListM200324f0 = vwb.m200324f0(QualificationType.LOWER_PRIMARY, QualificationType.UPPER_PRIMARY, QualificationType.HIGH_SCHOOL, QualificationType.VOCATIONAL_SCHOOL, QualificationType.BACHELOR, QualificationType.MASTER, QualificationType.DOCTOR);
        act.dialog().m20503E0(R$string.f16095K2).m20535e0(arrayList).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.zl
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C21176xm.m210006g(e30Var, arrayList, arrayListM200324f0, dialog, view, i2, charSequence);
            }
        }).m20541k0(R$string.f16178b).m20526V(new DialogInterface.OnDismissListener() { // from class: l.km
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C21176xm.m210008h(dialogInterface);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: i0 */
    public static l5j0 m210011i0(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
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
        e51.m114742G(new Runnable() { // from class: l.nl
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
        final Runnable runnable = new Runnable() { // from class: l.pl
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditText, 0);
            }
        };
        final VButton vButton = (VButton) l5j0Var.findViewById(q4c0.f152583a);
        vButton.setBackgroundResource(v2c0.f179511t1);
        vEditText.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.ql
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m210022o(vEditText, vText2, vButton, vEditText2, (CharSequence) obj);
            }
        }));
        vEditText2.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.rl
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m209978E(vEditText, vEditText2, vButton, (CharSequence) obj);
            }
        }));
        vButton.setTypeface(eqh0.m117752c(3), 1);
        l5j0Var.setOnDismissListener(new a(act, runnable, cwf0VarM133794c));
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.sl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m210025r(vEditText, vEditText2, act, vText, l5j0Var, d30Var2, d30Var, vButton, view);
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
        xdl0.m208329E0((VImage) l5j0Var.findViewById(q4c0.f152617w), new View.OnClickListener() { // from class: l.tl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m209988O(act, d30Var3, l5j0Var, view);
            }
        });
        vText.setText(Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(0).f204372b);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.ul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m210000a0(act, new e30() { // from class: l.mm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.vl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m209989P(vEditText, vText, vText2, vEditText2, act, view);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wl
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C21176xm.m210014k(vEditText, act, runnable, dialogInterface);
            }
        });
        if (!e51.m114737B("bind_phone_obs")) {
            xdl0.m208411y(vText2, vEditText.getText().length() > 0);
        }
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m210012j(Act act, d30 d30Var, VButton vButton, Throwable th) {
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.m214929G(th);
            return;
        }
        int i2 = ((TantanException.Client.AccountService) th).code;
        if (i2 == 40000) {
            yij0.m214929G(th);
            return;
        }
        String strM214956l = yij0.m214956l(i2);
        if (strM214956l == null) {
            d30Var.call();
            yij0.m214929G(th);
        } else {
            lsi0.m151595y(strM214956l);
            xdl0.m208360X(vButton, t100.f167261j);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static l5j0 m210013j0(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3, final d30 d30Var4) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_force_bindphone_identified_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("signup_way", str));
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(c6c0.f79489b);
        l5j0Var.setCancelable(false);
        l5j0Var.setOnDismissListener(new i(cwf0VarM133794c));
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f152609o)).setBackgroundResource(v2c0.f179453a0);
        }
        e51.m114742G(new Runnable() { // from class: l.xl
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
        xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.yl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m209996W(d30Var4, l5j0Var, view);
            }
        });
        VButton vButton = (VButton) l5j0Var.findViewById(q4c0.f152583a);
        vButton.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.am
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m210030w(act, d30Var3, l5j0Var, d30Var2, view);
            }
        });
        VText vText3 = (VText) l5j0Var.findViewById(q4c0.f152598h0);
        j760<String, String> j760VarM29595d = ChinaMobileController.m29595d();
        vText3.setText(i0g0.m133835B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + j760VarM29595d.f116564a + "》、《用户协议》、《隐私策略》", "《" + j760VarM29595d.f116564a + "》", j760VarM29595d.f116565b, "《用户协议》", juk.m143328j(), "《隐私策略》", juk.m143327i()));
        vText3.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.m208329E0((VImage) l5j0Var.findViewById(q4c0.f152617w), new View.OnClickListener() { // from class: l.bm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m209980G(l5j0Var, d30Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m210014k(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (vwb.m200298L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static l5j0 m210015k0(Act act, final d30 d30Var, d30 d30Var2) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_login_user_agreement_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(c6c0.f79462B);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setOnDismissListener(new f(cwf0VarM133794c, d30Var2));
        l5j0Var.setOnKeyListener(new g());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f152609o)).setBackgroundResource(v2c0.f179453a0);
        }
        e51.m114742G(new Runnable() { // from class: l.el
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f142609c);
            }
        });
        VText vText = (VText) l5j0Var.findViewById(q4c0.f152620z);
        vText.setTypeface(eqh0.m117752c(3), 1);
        VButton vButton = (VButton) l5j0Var.findViewById(q4c0.f152583a);
        vButton.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.fl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m209992S(d30Var, l5j0Var, view);
            }
        });
        VText vText2 = (VText) l5j0Var.findViewById(q4c0.f152596g0);
        if (IntlCountryCodeController.m28120p()) {
            vText.setText(R$string.f16174a1);
            vButton.setText(R$string.f16168Z0);
            vText2.setTextColor(Color.parseColor("#66000000"));
            vText2.setLinkTextColor(Color.parseColor("#66000000"));
            vText2.setText(m210004e0(act, act.string(R$string.f16273r0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f16278s0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.string(R$string.f16085I2), act.string(R$string.f16273r0), juk.m143328j(), act.string(R$string.f16085I2), juk.m143327i()));
        } else {
            vText2.setText(i0g0.m133835B(act, "《用户协议》和《隐私策略》", "《用户协议》", juk.m143328j(), "《隐私策略》", juk.m143327i()));
        }
        vText2.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.m208329E0((VImage) l5j0Var.findViewById(q4c0.f152617w), new View.OnClickListener() { // from class: l.gl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m209993T(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Unit m210016l(d30 d30Var) {
        d30Var.call();
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public static l5j0 m210017l0(Act act, boolean z, boolean z2, boolean z3, d30 d30Var, d30 d30Var2, final e30<Boolean> e30Var) {
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
        e51.m114742G(new Runnable() { // from class: l.hl
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
        xdl0.m208329E0(vCheckBox, new View.OnClickListener() { // from class: l.il
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176xm.m210018m(e30Var, vCheckBox, view);
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

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m210018m(e30 e30Var, VCheckBox vCheckBox, View view) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.valueOf(vCheckBox.isChecked()));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m210019m0(Act act, String str, String str2, String str3) {
        act.dialog().m20507G0(str).m20504F(str2).m20558u0(str3).m20496B(true).m20567z().show();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m210021n0(final Act act, final e30<Pair<String, String>> e30Var) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_captcha_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        final Dialog dialogM20567z = act.dialog().m20496B(false).m20517M(c6c0.f79496e0).m20526V(new DialogInterface.OnDismissListener() { // from class: l.tm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20557u().m20567z();
        dialogM20567z.show();
        final VCodeCaptchaView vCodeCaptchaView = (VCodeCaptchaView) dialogM20567z.m20458P();
        xdl0.m208329E0(vCodeCaptchaView.f16445d, new View.OnClickListener() { // from class: l.um
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM20567z.dismiss();
            }
        });
        act.duringCreated(AccountModule.f16037c.m28314W0()).subscribe(mkd0.m154956H(new e30() { // from class: l.vm
            @Override // p149l.e30
            public final void call(Object obj) {
                vCodeCaptchaView.m28519w0(act, (CaptchaData) obj, new e30() { // from class: l.ml
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        C21176xm.m209987N(dialog, e30Var, (Pair) obj2);
                    }
                });
            }
        }, new e30() { // from class: l.wm
            @Override // p149l.e30
            public final void call(Object obj) {
                dialogM20567z.dismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m210022o(VEditText vEditText, VText vText, VButton vButton, VEditText vEditText2, CharSequence charSequence) {
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

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m210023p(d30 d30Var, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            lsi0.m151595y("手机绑定失败");
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m210025r(VEditText vEditText, VEditText vEditText2, final Act act, VText vText, final l5j0 l5j0Var, final d30 d30Var, final d30 d30Var2, final VButton vButton, View view) {
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
        AccountModule.f16037c.m28272B2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.cm
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m209979F(act, l5j0Var, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.dm
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m210012j(act, d30Var2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m210026s(Act act, e30 e30Var, e30 e30Var2, Date date) {
        if (date.compareTo(yij0.m214944V()) > 0) {
            msi0.INSTANCE.m156148b(act, act.string(R$string.f16230j3), Integer.valueOf(v2c0.f179448Y));
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(Boolean.TRUE);
            }
            return Boolean.FALSE;
        }
        if (date.compareTo(yij0.m214936N()) >= 0) {
            e30Var2.call(Double.valueOf(date.getTime()));
            return Boolean.TRUE;
        }
        msi0.INSTANCE.m156148b(act, act.string(R$string.f16224i3), Integer.valueOf(v2c0.f179448Y));
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m210028u(d30 d30Var, Act act, Throwable th) {
        d30Var.call();
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            yij0.m214929G(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m210029v(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f16276r3);
        xdl0.m208411y(vText, false);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.m208411y(vText, false);
        } else {
            xdl0.m208411y(vText, true);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m210030w(final Act act, final d30 d30Var, final l5j0 l5j0Var, final d30 d30Var2, View view) {
        zvf0.m220396r("e_force_bindphone_identified_confirm", "p_force_bindphone_identified_popup");
        act.duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.gm
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m210023p(d30Var, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.hm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.im
            @Override // p149l.w9j
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return AccountModule.f16037c.m28306Q1(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.jm
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m209976C(l5j0Var, d30Var2, (roj0) obj);
            }
        }, new e30() { // from class: l.lm
            @Override // p149l.e30
            public final void call(Object obj) {
                C21176xm.m210028u(d30Var, act, (Throwable) obj);
            }
        }));
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m210031x(Throwable th) {
    }
}
