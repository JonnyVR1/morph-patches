package p153l;

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
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.AccountShareItemBean;
import com.p051p1.mobile.putong.account.data.CaptchaData;
import com.p051p1.mobile.putong.account.p055ui.accountnew.VCodeCaptchaView;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.WebViewPreAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
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
import p137rx.C22421c;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: renamed from: l.sm */
/* JADX INFO: loaded from: classes9.dex */
public class C20102sm extends w1e {

    /* JADX INFO: renamed from: l.sm$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f169469a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f169470b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ l4g0 f169471c;

        public a(Act act, Runnable runnable, l4g0 l4g0Var) {
            this.f169469a = act;
            this.f169470b = runnable;
            this.f169471c = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f169469a.removeCallbacks(this.f169470b);
            w1e.m204401e(this.f169471c);
        }
    }

    /* JADX INFO: renamed from: l.sm$b */
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

    /* JADX INFO: renamed from: l.sm$c */
    public class c implements C21914zx.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f169472a;

        public c(List list) {
            this.f169472a = list;
        }

        @Override // p153l.C21914zx.b
        /* JADX INFO: renamed from: a */
        public void mo186719a(View view, int i) {
            AccountShareItemBean accountShareItemBean = (AccountShareItemBean) this.f169472a.get(i);
            if (NullChecker.m82486a(accountShareItemBean)) {
                String name = accountShareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        i4g0.m138523u("e_other_signin_way", "p_other_signin_popup", jyb.m147494Y("choose_which_signin_way", "wechat"));
                    } else if (Constants.SOURCE_QQ.equals(name)) {
                        i4g0.m138523u("e_other_signin_way", "p_other_signin_popup", jyb.m147494Y("choose_which_signin_way", "qq"));
                    }
                }
                if (NullChecker.m82486a(((AccountShareItemBean) this.f169472a.get(i)).getAction())) {
                    ((AccountShareItemBean) this.f169472a.get(i)).getAction().call();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.sm$d */
    public class d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f169473a;

        public d(l4g0 l4g0Var) {
            this.f169473a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i4g0.m138520r("e_other_signin_cancel", "p_other_signin_popup");
            w1e.m204401e(this.f169473a);
        }
    }

    /* JADX INFO: renamed from: l.sm$e */
    public class e extends AbstractC15610a<nsb> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Act f169474c;

        public e(Act act) {
            this.f169474c = act;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f169474c).inflate(hec0.f109123m, viewGroup, false);
        }

        @Override // p153l.AbstractC15610a
        /* JADX INFO: renamed from: p */
        public List<nsb> mo21403p() {
            return nsb.f143476d;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, nsb nsbVar, int i, int i2) {
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.getChildAt(0);
            TextView textView2 = (TextView) viewGroup.getChildAt(1);
            textView.setText(nsbVar.f143478a);
            textView2.setText(Marker.ANY_NON_NULL_MARKER + nsbVar.f143479b);
        }
    }

    /* JADX INFO: renamed from: l.sm$f */
    public class f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f169475a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f169476b;

        public f(l4g0 l4g0Var, x20 x20Var) {
            this.f169475a = l4g0Var;
            this.f169476b = x20Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f169475a);
            this.f169476b.call();
        }
    }

    /* JADX INFO: renamed from: l.sm$g */
    public class g implements DialogInterface.OnKeyListener {
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

    /* JADX INFO: renamed from: l.sm$h */
    public class h extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f169477a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f169478b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f169479c;

        public h(Activity activity, String str, String str2) {
            this.f169477a = activity;
            this.f169478b = str;
            this.f169479c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f169477a;
            AccountTempApi accountTempApi = uqb0.f180380L;
            String str = this.f169478b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m80585K0(activity, str, this.f169479c) : WebViewAct.m81347a2(activity, str, this.f169479c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: l.sm$i */
    public class i implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f169480a;

        public i(l4g0 l4g0Var) {
            this.f169480a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f169480a);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m186659A(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f16956k4)));
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m186661C(pej0 pej0Var, x20 x20Var, uxj0 uxj0Var) {
        pej0Var.m176562T();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m186663E(VEditText vEditText, VEditText vEditText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(bbc0.f75917t1);
        } else {
            vButton.setBackgroundResource(bbc0.f75815K1);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m186664F(Act act, pej0 pej0Var, x20 x20Var, uxj0 uxj0Var) {
        act.progressDismiss();
        l51.m152891K("bind_phone_obs");
        m186688d0(pej0Var);
        pej0Var.m176562T();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m186665G(pej0 pej0Var, x20 x20Var, View view) {
        i4g0.m138520r("e_force_bindphone_identified_cancel", "p_force_bindphone_identified_popup");
        pej0Var.m176562T();
        x20Var.call();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m186666H(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, RiskVerification riskVerification) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f16765A3);
        act.duringCreated(l51.m152894N("bind_phone_obs", 60)).subscribe(psd0.m173598I(new y20() { // from class: l.jm
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186659A(vText, act, (Long) obj);
            }
        }, new y20() { // from class: l.km
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186716x((Throwable) obj);
            }
        }, new x20() { // from class: l.lm
            @Override // p153l.x20
            public final void call() {
                C20102sm.m186714v(vText, vEditText2);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m186667I(VText vText, VEditText vEditText, Act act, Throwable th) {
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
        int i2 = ((TantanException.Client.AccountService) th).code;
        if (i2 == 40000) {
            bsj0.m106249G(th);
            return;
        }
        String strM106276l = bsj0.m106276l(i2);
        if (strM106276l == null) {
            bsj0.m106249G(th);
        } else {
            o1j0.m165651y(strM106276l);
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m186669K(y20 y20Var, Dialog dialog, View view, int i2, CharSequence charSequence) {
        String str = Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(i2).f143479b;
        WelcomeAct.f17778h = str;
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m186671M(y20 y20Var, List list, List list2, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (!NullChecker.m82486a(y20Var) || i2 >= list.size()) {
            return;
        }
        y20Var.call(BloodType.get((String) list2.get(i2)));
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m186672N(Dialog dialog, y20 y20Var, Pair pair) {
        dialog.dismiss();
        y20Var.call(pair);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m186673O(Act act, x20 x20Var, pej0 pej0Var, View view) {
        i4g0.m138520r("e_force_bindphone_unidentified_cancel", "p_force_bindphone_unidentified_popup");
        if (l51.m152882B(act.getLocalClassName())) {
            l51.m152891K(act.getLocalClassName());
        }
        x20Var.call();
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m186674P(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, View view) {
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
        AccountModule.f16756c.m29323b2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.zl
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186666H(vEditText2, vText2, act, vEditText, (RiskVerification) obj);
            }
        }, new y20() { // from class: l.am
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186667I(vText2, vEditText, act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ boolean m186675Q(y20 y20Var, int i2, int i3, Intent intent) {
        if (i3 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        y20Var.call(Marker.ANY_NON_NULL_MARKER + intent.getIntExtra("ccode", 86));
        return true;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m186677S(x20 x20Var, pej0 pej0Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            i4g0.m138520r("e_login_user_agreement_popup_confirm", "p_login_user_agreement_popup");
            x20Var.call();
            pej0Var.m176562T();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m186678T(pej0 pej0Var, View view) {
        i4g0.m138523u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", jyb.m147494Y("cancel_back", "cancle"));
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m186681W(x20 x20Var, pej0 pej0Var, View view) {
        i4g0.m138520r("e_force_bindphone_identified_choose_other", "p_force_bindphone_identified_popup");
        x20Var.call();
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m186682X(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ Unit m186683Y(y20 y20Var, Act act, Integer num, Integer num2, Integer num3, Date date) {
        y20Var.call(Double.valueOf(date.getTime()));
        if (!uqb0.f180397c0.signedIn_() || !NullChecker.m82488c(act, SchemeKey.account, CrashHelper.ReportLevel.p9) || !AccountModule.m29131H().instanceofPersonalDetailsAct(act)) {
            return null;
        }
        i4g0.m138520r("e_edit_basic_info_calendar", "p_edit_basic_info_view");
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m186685a0(Act act, final y20<String> y20Var) {
        act.startActivityForResult(CCodeChooseAct.m29657Z1(act), new C4468a.a() { // from class: l.im
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i2, int i3, Intent intent) {
                return C20102sm.m186675Q(y20Var, i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public static void m186686b0(Act act, y20<String> y20Var) {
        m186687c0(act, y20Var, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m186687c0(Act act, final y20<String> y20Var, final l4g0 l4g0Var) {
        w1e.m204402f(l4g0Var);
        act.dialog().m21546p(new e(act)).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.yk
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C20102sm.m186669K(y20Var, dialog, view, i2, charSequence);
            }
        }).m21526W(true).m21525V(new DialogInterface.OnDismissListener() { // from class: l.jl
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0Var);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: d0 */
    public static void m186688d0(@NonNull pej0 pej0Var) {
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

    /* JADX INFO: renamed from: e0 */
    public static SpannableStringBuilder m186689e0(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str2 = strArr[i2];
            spannableStringBuilder.setSpan(new h(activity, str2, strArr[i2 + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m186690f0(final Act act, pcj<Double> pcjVar, final y20<Double> y20Var, final y20<Double> y20Var2, final y20<Boolean> y20Var3, final x20 x20Var) {
        new r03(act).m179208m(new Date((long) pcjVar.call().doubleValue()), new Function1() { // from class: l.el
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20102sm.m186711s(act, y20Var3, y20Var2, (Date) obj);
            }
        }, new Function4() { // from class: l.fl
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C20102sm.m186683Y(y20Var, act, (Integer) obj, (Integer) obj2, (Integer) obj3, (Date) obj4);
            }
        }, new Function0() { // from class: l.gl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C20102sm.m186701l(x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m186691g(y20 y20Var, List list, List list2, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (!NullChecker.m82486a(y20Var) || i2 >= list.size()) {
            return;
        }
        y20Var.call(QualificationType.get((String) list2.get(i2)));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m186692g0(Act act, final y20<BloodType> y20Var) {
        Application application = App.f16088e;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(application.getResources().getString(R$string.f16776D));
        arrayList.add(application.getResources().getString(R$string.f16786F));
        arrayList.add(application.getResources().getString(R$string.f16791G));
        arrayList.add(application.getResources().getString(R$string.f16781E));
        arrayList.add(application.getResources().getString(R$string.f16796H));
        final ArrayList arrayListM147507f0 = jyb.m147507f0("A", "B", BloodType.f39576O, BloodType.f39574AB, "UNKNOWN");
        act.dialog().m21502E0(R$string.f16771C).m21534e0(arrayList).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.mm
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C20102sm.m186671M(y20Var, arrayList, arrayListM147507f0, dialog, view, i2, charSequence);
            }
        }).m21540k0(R$string.f16897b).m21525V(new DialogInterface.OnDismissListener() { // from class: l.nm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C20102sm.m186682X(dialogInterface);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m186693h(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: h0 */
    public static void m186694h0(Act act, final y20<QualificationType> y20Var) {
        Application application = App.f16088e;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(application.getResources().getString(R$string.f16834O2));
        arrayList.add(application.getResources().getString(R$string.f16844Q2));
        arrayList.add(application.getResources().getString(R$string.f16829N2));
        arrayList.add(application.getResources().getString(R$string.f16849R2));
        arrayList.add(application.getResources().getString(R$string.f16819L2));
        arrayList.add(application.getResources().getString(R$string.f16839P2));
        arrayList.add(application.getResources().getString(R$string.f16824M2));
        final ArrayList arrayListM147507f0 = jyb.m147507f0(QualificationType.LOWER_PRIMARY, QualificationType.UPPER_PRIMARY, QualificationType.HIGH_SCHOOL, QualificationType.VOCATIONAL_SCHOOL, QualificationType.BACHELOR, QualificationType.MASTER, QualificationType.DOCTOR);
        act.dialog().m21502E0(R$string.f16814K2).m21534e0(arrayList).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ul
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C20102sm.m186691g(y20Var, arrayList, arrayListM147507f0, dialog, view, i2, charSequence);
            }
        }).m21540k0(R$string.f16897b).m21525V(new DialogInterface.OnDismissListener() { // from class: l.fm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C20102sm.m186693h(dialogInterface);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: i0 */
    public static pej0 m186696i0(final Act act, String str, String str2, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
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
        l51.m152887G(new Runnable() { // from class: l.il
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
        final Runnable runnable = new Runnable() { // from class: l.kl
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditText, 0);
            }
        };
        final VButton vButton = (VButton) pej0Var.findViewById(wcc0.f188431a);
        vButton.setBackgroundResource(bbc0.f75917t1);
        vEditText.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.ll
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186707o(vEditText, vText2, vButton, vEditText2, (CharSequence) obj);
            }
        }));
        vEditText2.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.ml
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186663E(vEditText, vEditText2, vButton, (CharSequence) obj);
            }
        }));
        vButton.setTypeface(lyh0.m156283c(3), 1);
        pej0Var.setOnDismissListener(new a(act, runnable, l4g0VarM204399c));
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.nl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186710r(vEditText, vEditText2, act, vText, pej0Var, x20Var2, x20Var, vButton, view);
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
        bnl0.m105509E0((VImage) pej0Var.findViewById(wcc0.f188465w), new View.OnClickListener() { // from class: l.ol
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186673O(act, x20Var3, pej0Var, view);
            }
        });
        vText.setText(Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(0).f143479b);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.pl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186685a0(act, new y20() { // from class: l.hm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.ql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186674P(vEditText, vText, vText2, vEditText2, act, view);
            }
        });
        pej0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.rl
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C20102sm.m186699k(vEditText, act, runnable, dialogInterface);
            }
        });
        if (!l51.m152882B("bind_phone_obs")) {
            bnl0.m105591y(vText2, vEditText.getText().length() > 0);
        }
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m186697j(Act act, x20 x20Var, VButton vButton, Throwable th) {
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            bsj0.m106249G(th);
            return;
        }
        int i2 = ((TantanException.Client.AccountService) th).code;
        if (i2 == 40000) {
            bsj0.m106249G(th);
            return;
        }
        String strM106276l = bsj0.m106276l(i2);
        if (strM106276l == null) {
            x20Var.call();
            bsj0.m106249G(th);
        } else {
            o1j0.m165651y(strM106276l);
            bnl0.m105540X(vButton, qa00.f156323j);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static pej0 m186698j0(final Act act, String str, String str2, final x20 x20Var, final x20 x20Var2, final x20 x20Var3, final x20 x20Var4) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_force_bindphone_identified_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("signup_way", str));
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCanceledOnTouchOutside(false);
        pej0Var.setContentView(hec0.f109101b);
        pej0Var.setCancelable(false);
        pej0Var.setOnDismissListener(new i(l4g0VarM204399c));
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(wcc0.f188457o)).setBackgroundResource(bbc0.f75859a0);
        }
        l51.m152887G(new Runnable() { // from class: l.sl
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
        bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.tl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186681W(x20Var4, pej0Var, view);
            }
        });
        VButton vButton = (VButton) pej0Var.findViewById(wcc0.f188431a);
        vButton.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.vl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186715w(act, x20Var3, pej0Var, x20Var2, view);
            }
        });
        VText vText3 = (VText) pej0Var.findViewById(wcc0.f188446h0);
        pf60<String, String> pf60VarM30593d = ChinaMobileController.m30593d();
        vText3.setText(q8g0.m175770B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + pf60VarM30593d.f152156a + "》、《用户协议》、《隐私策略》", "《" + pf60VarM30593d.f152156a + "》", pf60VarM30593d.f152157b, "《用户协议》", zwk.m221910j(), "《隐私策略》", zwk.m221909i()));
        vText3.setMovementMethod(LinkMovementMethod.getInstance());
        bnl0.m105509E0((VImage) pej0Var.findViewById(wcc0.f188465w), new View.OnClickListener() { // from class: l.wl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186665G(pej0Var, x20Var, view);
            }
        });
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m186699k(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (jyb.m147481L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static pej0 m186700k0(Act act, final x20 x20Var, x20 x20Var2) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_login_user_agreement_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setContentView(hec0.f109074B);
        pej0Var.setCanceledOnTouchOutside(false);
        pej0Var.setOnDismissListener(new f(l4g0VarM204399c, x20Var2));
        pej0Var.setOnKeyListener(new g());
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(wcc0.f188457o)).setBackgroundResource(bbc0.f75859a0);
        }
        l51.m152887G(new Runnable() { // from class: l.zk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(yfc0.f199490c);
            }
        });
        VText vText = (VText) pej0Var.findViewById(wcc0.f188468z);
        vText.setTypeface(lyh0.m156283c(3), 1);
        VButton vButton = (VButton) pej0Var.findViewById(wcc0.f188431a);
        vButton.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.al
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186677S(x20Var, pej0Var, view);
            }
        });
        VText vText2 = (VText) pej0Var.findViewById(wcc0.f188444g0);
        if (IntlCountryCodeController.m29119p()) {
            vText.setText(R$string.f16893a1);
            vButton.setText(R$string.f16887Z0);
            vText2.setTextColor(Color.parseColor("#66000000"));
            vText2.setLinkTextColor(Color.parseColor("#66000000"));
            vText2.setText(m186689e0(act, act.string(R$string.f16992r0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f16997s0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.string(R$string.f16804I2), act.string(R$string.f16992r0), zwk.m221910j(), act.string(R$string.f16804I2), zwk.m221909i()));
        } else {
            vText2.setText(q8g0.m175770B(act, "《用户协议》和《隐私策略》", "《用户协议》", zwk.m221910j(), "《隐私策略》", zwk.m221909i()));
        }
        vText2.setMovementMethod(LinkMovementMethod.getInstance());
        bnl0.m105509E0((VImage) pej0Var.findViewById(wcc0.f188465w), new View.OnClickListener() { // from class: l.bl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186678T(pej0Var, view);
            }
        });
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Unit m186701l(x20 x20Var) {
        x20Var.call();
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public static pej0 m186702l0(Act act, boolean z, boolean z2, boolean z3, x20 x20Var, x20 x20Var2, final y20<Boolean> y20Var) {
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
        l51.m152887G(new Runnable() { // from class: l.cl
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
        bnl0.m105509E0(vCheckBox, new View.OnClickListener() { // from class: l.dl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20102sm.m186703m(y20Var, vCheckBox, view);
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

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m186703m(y20 y20Var, VCheckBox vCheckBox, View view) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.valueOf(vCheckBox.isChecked()));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m186704m0(Act act, String str, String str2, String str3) {
        act.dialog().m21506G0(str).m21503F(str2).m21557u0(str3).m21495B(true).m21566z().show();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m186706n0(final Act act, final y20<Pair<String, String>> y20Var) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_captcha_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        final Dialog dialogM21566z = act.dialog().m21495B(false).m21516M(hec0.f109108e0).m21525V(new DialogInterface.OnDismissListener() { // from class: l.om
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21556u().m21566z();
        dialogM21566z.show();
        final VCodeCaptchaView vCodeCaptchaView = (VCodeCaptchaView) dialogM21566z.m21457P();
        bnl0.m105509E0(vCodeCaptchaView.f17164d, new View.OnClickListener() { // from class: l.pm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM21566z.dismiss();
            }
        });
        act.duringCreated(AccountModule.f16756c.m29313W0()).subscribe(psd0.m173597H(new y20() { // from class: l.qm
            @Override // p153l.y20
            public final void call(Object obj) {
                vCodeCaptchaView.m29518w0(act, (CaptchaData) obj, new y20() { // from class: l.hl
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        C20102sm.m186672N(dialog, y20Var, (Pair) obj2);
                    }
                });
            }
        }, new y20() { // from class: l.rm
            @Override // p153l.y20
            public final void call(Object obj) {
                dialogM21566z.dismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m186707o(VEditText vEditText, VText vText, VButton vButton, VEditText vEditText2, CharSequence charSequence) {
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

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m186708p(x20 x20Var, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            o1j0.m165651y("手机绑定失败");
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m186710r(VEditText vEditText, VEditText vEditText2, final Act act, VText vText, final pej0 pej0Var, final x20 x20Var, final x20 x20Var2, final VButton vButton, View view) {
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
        AccountModule.f16756c.m29271B2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.xl
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186664F(act, pej0Var, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.yl
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186697j(act, x20Var2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m186711s(Act act, y20 y20Var, y20 y20Var2, Date date) {
        if (date.compareTo(bsj0.m106264V()) > 0) {
            p1j0.INSTANCE.m170210b(act, act.string(R$string.f16949j3), Integer.valueOf(bbc0.f75854Y));
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(Boolean.TRUE);
            }
            return Boolean.FALSE;
        }
        if (date.compareTo(bsj0.m106256N()) >= 0) {
            y20Var2.call(Double.valueOf(date.getTime()));
            return Boolean.TRUE;
        }
        p1j0.INSTANCE.m170210b(act, act.string(R$string.f16943i3), Integer.valueOf(bbc0.f75854Y));
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m186713u(x20 x20Var, Act act, Throwable th) {
        x20Var.call();
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            bsj0.m106249G(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m186714v(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f16995r3);
        bnl0.m105591y(vText, false);
        if (vEditText.getText().toString().isEmpty()) {
            bnl0.m105591y(vText, false);
        } else {
            bnl0.m105591y(vText, true);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m186715w(final Act act, final x20 x20Var, final pej0 pej0Var, final x20 x20Var2, View view) {
        i4g0.m138520r("e_force_bindphone_identified_confirm", "p_force_bindphone_identified_popup");
        act.duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.bm
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186708p(x20Var, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.cm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.dm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return AccountModule.f16756c.m29305Q1(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(psd0.m173597H(new y20() { // from class: l.em
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186661C(pej0Var, x20Var2, (uxj0) obj);
            }
        }, new y20() { // from class: l.gm
            @Override // p153l.y20
            public final void call(Object obj) {
                C20102sm.m186713u(x20Var, act, (Throwable) obj);
            }
        }));
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m186716x(Throwable th) {
    }
}
