package p006l;

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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.AccountShareItemBean;
import com.p000p1.mobile.putong.account.data.CaptchaData;
import com.p000p1.mobile.putong.account.p002ui.accountnew.VCodeCaptchaView;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.ui.WebViewPreAct;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
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
import l.msi0;
import l.roj0;
import l.t100;
import l.v9j;
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

/* JADX INFO: renamed from: l.xm */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1444xm extends i0e {

    /* JADX INFO: renamed from: l.xm$a */
    public class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f27591a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f27592b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cwf0 f27593c;

        public a(Act act, Runnable runnable, cwf0 cwf0Var) {
            this.f27591a = act;
            this.f27592b = runnable;
            this.f27593c = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f27591a.removeCallbacks(this.f27592b);
            i0e.e(this.f27593c);
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
    public class c implements C0784gy.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f27594a;

        public c(List list) {
            this.f27594a = list;
        }

        @Override // p006l.C0784gy.b
        /* JADX INFO: renamed from: a */
        public void mo15414a(View view, int i) {
            AccountShareItemBean accountShareItemBean = (AccountShareItemBean) this.f27594a.get(i);
            if (NullChecker.a(accountShareItemBean)) {
                String name = accountShareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        zvf0.u("e_other_signin_way", "p_other_signin_popup", new j760[]{vwb.Y("choose_which_signin_way", "wechat")});
                    } else if ("QQ".equals(name)) {
                        zvf0.u("e_other_signin_way", "p_other_signin_popup", new j760[]{vwb.Y("choose_which_signin_way", "qq")});
                    }
                }
                if (NullChecker.a(((AccountShareItemBean) this.f27594a.get(i)).getAction())) {
                    ((AccountShareItemBean) this.f27594a.get(i)).getAction().call();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.xm$d */
    public class d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f27595a;

        public d(cwf0 cwf0Var) {
            this.f27595a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            zvf0.r("e_other_signin_cancel", "p_other_signin_popup");
            i0e.e(this.f27595a);
        }
    }

    /* JADX INFO: renamed from: l.xm$e */
    public class e extends l.a<zqb> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Act f27596c;

        public e(Act act) {
            this.f27596c = act;
        }

        /* JADX INFO: renamed from: m */
        public View m27342m(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f27596c).inflate(c6c0.f9441m, viewGroup, false);
        }

        /* JADX INFO: renamed from: p */
        public List<zqb> m27343p() {
            return zqb.d;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void m27341j(View view, zqb zqbVar, int i, int i2) {
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.getChildAt(0);
            TextView textView2 = (TextView) viewGroup.getChildAt(1);
            textView.setText(zqbVar.a);
            textView2.setText("+" + zqbVar.b);
        }
    }

    /* JADX INFO: renamed from: l.xm$f */
    public class f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f27597a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f27598b;

        public f(cwf0 cwf0Var, d30 d30Var) {
            this.f27597a = cwf0Var;
            this.f27598b = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f27597a);
            this.f27598b.call();
        }
    }

    /* JADX INFO: renamed from: l.xm$g */
    public class g implements DialogInterface.OnKeyListener {
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

    /* JADX INFO: renamed from: l.xm$h */
    public class h extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f27599a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f27600b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f27601c;

        public h(Activity activity, String str, String str2) {
            this.f27599a = activity;
            this.f27600b = str;
            this.f27601c = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f27599a;
            AccountTempApi accountTempApi = qib0.f19788L;
            String str = this.f27600b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.J0(activity, str, this.f27601c) : WebViewAct.Z1(activity, str, this.f27601c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: l.xm$i */
    public class i implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f27602a;

        public i(cwf0 cwf0Var) {
            this.f27602a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f27602a);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m27281A(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f226k4)));
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m27283C(l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        l5j0Var.dismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m27285E(VEditText vEditText, VEditText vEditText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().trim().isEmpty() || vEditText2.getText().toString().trim().isEmpty()) {
            vButton.setBackgroundResource(v2c0.f24075t1);
        } else {
            vButton.setBackgroundResource(v2c0.f23973K1);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m27286F(Act act, l5j0 l5j0Var, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        e51.K("bind_phone_obs");
        m27310d0(l5j0Var);
        l5j0Var.dismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m27287G(l5j0 l5j0Var, d30 d30Var, View view) {
        zvf0.r("e_force_bindphone_identified_cancel", "p_force_bindphone_identified_popup");
        l5j0Var.dismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m27288H(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, RiskVerification riskVerification) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f35A3);
        act.duringCreated(e51.N("bind_phone_obs", 60)).subscribe(mkd0.I(new e30() { // from class: l.om
            public final void call(Object obj) {
                C1444xm.m27281A(vText, act, (Long) obj);
            }
        }, new e30() { // from class: l.pm
            public final void call(Object obj) {
                C1444xm.m27338x((Throwable) obj);
            }
        }, new d30() { // from class: l.qm
            public final void call() {
                C1444xm.m27336v(vText, vEditText2);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m27289I(VText vText, VEditText vEditText, Act act, Throwable th) {
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
        int i2 = ((TantanException.Client.AccountService) th).code;
        if (i2 == 40000) {
            yij0.G(th);
            return;
        }
        String strL = yij0.l(i2);
        if (strL == null) {
            yij0.G(th);
        } else {
            lsi0.y(strL);
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m27291K(e30 e30Var, Dialog dialog, View view, int i2, CharSequence charSequence) {
        String str = "+" + ((zqb) zqb.d.get(i2)).b;
        WelcomeAct.f1048h = str;
        if (NullChecker.a(e30Var)) {
            e30Var.call(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m27293M(e30 e30Var, List list, List list2, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (!NullChecker.a(e30Var) || i2 >= list.size()) {
            return;
        }
        e30Var.call(BloodType.get((String) list2.get(i2)));
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m27294N(Dialog dialog, e30 e30Var, Pair pair) {
        dialog.dismiss();
        e30Var.call(pair);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m27295O(Act act, d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.r("e_force_bindphone_unidentified_cancel", "p_force_bindphone_unidentified_popup");
        if (e51.B(act.getLocalClassName())) {
            e51.K(act.getLocalClassName());
        }
        d30Var.call();
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m27296P(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, View view) {
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
        AccountModule.f26c.m219b2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.em
            public final void call(Object obj) {
                C1444xm.m27288H(vEditText2, vText2, act, vEditText, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.fm
            public final void call(Object obj) {
                C1444xm.m27289I(vText2, vEditText, act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ boolean m27297Q(e30 e30Var, int i2, int i3, Intent intent) {
        if (i3 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        e30Var.call("+" + intent.getIntExtra("ccode", 86));
        return true;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m27299S(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.a(d30Var)) {
            zvf0.r("e_login_user_agreement_popup_confirm", "p_login_user_agreement_popup");
            d30Var.call();
            l5j0Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m27300T(l5j0 l5j0Var, View view) {
        zvf0.u("e_login_user_agreement_popup_cancel", "p_login_user_agreement_popup", new j760[]{vwb.Y("cancel_back", "cancle")});
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m27303W(d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.r("e_force_bindphone_identified_choose_other", "p_force_bindphone_identified_popup");
        d30Var.call();
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m27304X(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ Unit m27305Y(e30 e30Var, Act act, Integer num, Integer num2, Integer num3, Date date) {
        e30Var.call(Double.valueOf(date.getTime()));
        if (!qib0.f19805c0.signedIn_() || !NullChecker.c(act, "account", CrashHelper.ReportLevel.p9) || !AccountModule.m27H().instanceofPersonalDetailsAct(act)) {
            return null;
        }
        zvf0.r("e_edit_basic_info_calendar", "p_edit_basic_info_view");
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m27307a0(Act act, final e30<String> e30Var) {
        act.startActivityForResult(CCodeChooseAct.m557Y1(act), new com.p1.mobile.android.app.a.a() { // from class: l.nm
            /* JADX INFO: renamed from: a */
            public final boolean m20161a(int i2, int i3, Intent intent) {
                return C1444xm.m27297Q(e30Var, i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public static void m27308b0(Act act, e30<String> e30Var) {
        m27309c0(act, e30Var, null);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m27309c0(Act act, final e30<String> e30Var, final cwf0 cwf0Var) {
        i0e.f(cwf0Var);
        act.dialog().p(new e(act)).g0(new Dialog.g() { // from class: l.dl
            /* JADX INFO: renamed from: a */
            public final void m14080a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C1444xm.m27291K(e30Var, dialog, view, i2, charSequence);
            }
        }).W(true).V(new DialogInterface.OnDismissListener() { // from class: l.ol
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0Var);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: d0 */
    public static void m27310d0(@NonNull l5j0 l5j0Var) {
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

    /* JADX INFO: renamed from: e0 */
    public static SpannableStringBuilder m27311e0(Activity activity, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str2 = strArr[i2];
            spannableStringBuilder.setSpan(new h(activity, str2, strArr[i2 + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m27312f0(final Act act, v9j<Double> v9jVar, final e30<Double> e30Var, final e30<Double> e30Var2, final e30<Boolean> e30Var3, final d30 d30Var) {
        new c03(act).m13065m(new Date((long) ((Double) v9jVar.call()).doubleValue()), new Function1() { // from class: l.jl
            public final Object invoke(Object obj) {
                return C1444xm.m27333s(act, e30Var3, e30Var2, (Date) obj);
            }
        }, new Function4() { // from class: l.kl
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return C1444xm.m27305Y(e30Var, act, (Integer) obj, (Integer) obj2, (Integer) obj3, (Date) obj4);
            }
        }, new Function0() { // from class: l.ll
            public final Object invoke() {
                return C1444xm.m27323l(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m27313g(e30 e30Var, List list, List list2, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (!NullChecker.a(e30Var) || i2 >= list.size()) {
            return;
        }
        e30Var.call(QualificationType.get((String) list2.get(i2)));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m27314g0(Act act, final e30<BloodType> e30Var) {
        Application application = App.e;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(application.getResources().getString(R$string.f46D));
        arrayList.add(application.getResources().getString(R$string.f56F));
        arrayList.add(application.getResources().getString(R$string.f61G));
        arrayList.add(application.getResources().getString(R$string.f51E));
        arrayList.add(application.getResources().getString(R$string.f66H));
        final ArrayList arrayListF0 = vwb.f0(new String[]{"A", "B", "O", "AB", "UNKNOWN"});
        act.dialog().E0(R$string.f41C).e0(arrayList).g0(new Dialog.g() { // from class: l.rm
            /* JADX INFO: renamed from: a */
            public final void m22864a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C1444xm.m27293M(e30Var, arrayList, arrayListF0, dialog, view, i2, charSequence);
            }
        }).k0(R$string.f167b).V(new DialogInterface.OnDismissListener() { // from class: l.sm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1444xm.m27304X(dialogInterface);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m27315h(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: h0 */
    public static void m27316h0(Act act, final e30<QualificationType> e30Var) {
        Application application = App.e;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(application.getResources().getString(R$string.f104O2));
        arrayList.add(application.getResources().getString(R$string.f114Q2));
        arrayList.add(application.getResources().getString(R$string.f99N2));
        arrayList.add(application.getResources().getString(R$string.f119R2));
        arrayList.add(application.getResources().getString(R$string.f89L2));
        arrayList.add(application.getResources().getString(R$string.f109P2));
        arrayList.add(application.getResources().getString(R$string.f94M2));
        final ArrayList arrayListF0 = vwb.f0(new String[]{"LOWER_PRIMARY", "UPPER_PRIMARY", "HIGH_SCHOOL", "VOCATIONAL_SCHOOL", "BACHELOR", "MASTER", "DOCTOR"});
        act.dialog().E0(R$string.f84K2).e0(arrayList).g0(new Dialog.g() { // from class: l.zl
            /* JADX INFO: renamed from: a */
            public final void m28718a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                C1444xm.m27313g(e30Var, arrayList, arrayListF0, dialog, view, i2, charSequence);
            }
        }).k0(R$string.f167b).V(new DialogInterface.OnDismissListener() { // from class: l.km
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1444xm.m27315h(dialogInterface);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: i0 */
    public static l5j0 m27318i0(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
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
        e51.G(new Runnable() { // from class: l.nl
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
        final Runnable runnable = new Runnable() { // from class: l.pl
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditTextFindViewById, 0);
            }
        };
        final VButton vButtonFindViewById = l5j0Var.findViewById(q4c0.f19593a);
        vButtonFindViewById.setBackgroundResource(v2c0.f24075t1);
        vEditTextFindViewById.h().subscribe(mkd0.G(new e30() { // from class: l.ql
            public final void call(Object obj) {
                C1444xm.m27329o(vEditTextFindViewById, vTextFindViewById2, vButtonFindViewById, vEditTextFindViewById2, (CharSequence) obj);
            }
        }));
        vEditTextFindViewById2.h().subscribe(mkd0.G(new e30() { // from class: l.rl
            public final void call(Object obj) {
                C1444xm.m27285E(vEditTextFindViewById, vEditTextFindViewById2, vButtonFindViewById, (CharSequence) obj);
            }
        }));
        vButtonFindViewById.setTypeface(eqh0.c(3), 1);
        l5j0Var.setOnDismissListener(new a(act, runnable, cwf0VarC));
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.sl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27332r(vEditTextFindViewById, vEditTextFindViewById2, act, vTextFindViewById, l5j0Var, d30Var2, d30Var, vButtonFindViewById, view);
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
        xdl0.E0(l5j0Var.findViewById(q4c0.f19627w), new View.OnClickListener() { // from class: l.tl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27295O(act, d30Var3, l5j0Var, view);
            }
        });
        vTextFindViewById.setText("+" + ((zqb) zqb.d.get(0)).b);
        xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.ul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27307a0(act, new e30() { // from class: l.mm
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        xdl0.E0(vTextFindViewById2, new View.OnClickListener() { // from class: l.vl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27296P(vEditTextFindViewById, vTextFindViewById, vTextFindViewById2, vEditTextFindViewById2, act, view);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wl
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C1444xm.m27321k(vEditTextFindViewById, act, runnable, dialogInterface);
            }
        });
        if (!e51.B("bind_phone_obs")) {
            xdl0.y(vTextFindViewById2, vEditTextFindViewById.getText().length() > 0);
        }
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m27319j(Act act, d30 d30Var, VButton vButton, Throwable th) {
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.G(th);
            return;
        }
        int i2 = ((TantanException.Client.AccountService) th).code;
        if (i2 == 40000) {
            yij0.G(th);
            return;
        }
        String strL = yij0.l(i2);
        if (strL == null) {
            d30Var.call();
            yij0.G(th);
        } else {
            lsi0.y(strL);
            xdl0.X(vButton, t100.j);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static l5j0 m27320j0(final Act act, String str, String str2, final d30 d30Var, final d30 d30Var2, final d30 d30Var3, final d30 d30Var4) {
        cwf0 cwf0VarC = i0e.c("p_force_bindphone_identified_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("signup_way", str)});
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(c6c0.f9419b);
        l5j0Var.setCancelable(false);
        l5j0Var.setOnDismissListener(new i(cwf0VarC));
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f19619o)).setBackgroundResource(v2c0.f24017a0);
        }
        e51.G(new Runnable() { // from class: l.xl
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
        xdl0.E0(vTextFindViewById2, new View.OnClickListener() { // from class: l.yl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27303W(d30Var4, l5j0Var, view);
            }
        });
        VButton vButtonFindViewById = l5j0Var.findViewById(q4c0.f19593a);
        vButtonFindViewById.setTypeface(eqh0.c(3), 1);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.am
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27337w(act, d30Var3, l5j0Var, d30Var2, view);
            }
        });
        VText vTextFindViewById3 = l5j0Var.findViewById(q4c0.f19608h0);
        j760<String, String> j760VarM1501d = ChinaMobileController.m1501d();
        vTextFindViewById3.setText(i0g0.B(act, "根据国家实名要求，阅读并同意完成手机号绑定，《" + ((String) j760VarM1501d.a) + "》、《用户协议》、《隐私策略》", new String[]{"《" + ((String) j760VarM1501d.a) + "》", (String) j760VarM1501d.b, "《用户协议》", juk.j(), "《隐私策略》", juk.i()}));
        vTextFindViewById3.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.E0(l5j0Var.findViewById(q4c0.f19627w), new View.OnClickListener() { // from class: l.bm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27287G(l5j0Var, d30Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m27321k(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (vwb.L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static l5j0 m27322k0(Act act, final d30 d30Var, d30 d30Var2) {
        cwf0 cwf0VarC = i0e.c("p_login_user_agreement_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(c6c0.f9392B);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setOnDismissListener(new f(cwf0VarC, d30Var2));
        l5j0Var.setOnKeyListener(new g());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(q4c0.f19619o)).setBackgroundResource(v2c0.f24017a0);
        }
        e51.G(new Runnable() { // from class: l.el
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(o8c0.f18072c);
            }
        });
        VText vTextFindViewById = l5j0Var.findViewById(q4c0.f19630z);
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        VButton vButtonFindViewById = l5j0Var.findViewById(q4c0.f19593a);
        vButtonFindViewById.setTypeface(eqh0.c(3), 1);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.fl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27299S(d30Var, l5j0Var, view);
            }
        });
        VText vTextFindViewById2 = l5j0Var.findViewById(q4c0.f19606g0);
        if (IntlCountryCodeController.m15p()) {
            vTextFindViewById.setText(R$string.f163a1);
            vButtonFindViewById.setText(R$string.f157Z0);
            vTextFindViewById2.setTextColor(Color.parseColor("#66000000"));
            vTextFindViewById2.setLinkTextColor(Color.parseColor("#66000000"));
            vTextFindViewById2.setText(m27311e0(act, act.string(R$string.f262r0) + " " + act.getString(R$string.f267s0) + " " + act.string(R$string.f74I2), act.string(R$string.f262r0), juk.j(), act.string(R$string.f74I2), juk.i()));
        } else {
            vTextFindViewById2.setText(i0g0.B(act, "《用户协议》和《隐私策略》", new String[]{"《用户协议》", juk.j(), "《隐私策略》", juk.i()}));
        }
        vTextFindViewById2.setMovementMethod(LinkMovementMethod.getInstance());
        xdl0.E0(l5j0Var.findViewById(q4c0.f19627w), new View.OnClickListener() { // from class: l.gl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27300T(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Unit m27323l(d30 d30Var) {
        d30Var.call();
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public static l5j0 m27324l0(Act act, boolean z, boolean z2, boolean z3, d30 d30Var, d30 d30Var2, final e30<Boolean> e30Var) {
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
        e51.G(new Runnable() { // from class: l.hl
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
        xdl0.E0(vCheckBoxFindViewById, new View.OnClickListener() { // from class: l.il
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444xm.m27325m(e30Var, vCheckBoxFindViewById, view);
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

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m27325m(e30 e30Var, VCheckBox vCheckBox, View view) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.valueOf(vCheckBox.isChecked()));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m27326m0(Act act, String str, String str2, String str3) {
        act.dialog().G0(str).F(str2).u0(str3).B(true).z().show();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m27328n0(final Act act, final e30<Pair<String, String>> e30Var) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_intl_captcha_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        final Dialog dialogZ = act.dialog().B(false).M(c6c0.f9426e0).V(new DialogInterface.OnDismissListener() { // from class: l.tm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).u().z();
        dialogZ.show();
        final VCodeCaptchaView vCodeCaptchaView = (VCodeCaptchaView) dialogZ.P();
        xdl0.E0(vCodeCaptchaView.f434d, new View.OnClickListener() { // from class: l.um
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogZ.dismiss();
            }
        });
        act.duringCreated(AccountModule.f26c.m209W0()).subscribe(mkd0.H(new e30() { // from class: l.vm
            public final void call(Object obj) {
                vCodeCaptchaView.m415w0(act, (CaptchaData) obj, new e30() { // from class: l.ml
                    public final void call(Object obj2) {
                        C1444xm.m27294N(dialog, e30Var, (Pair) obj2);
                    }
                });
            }
        }, new e30() { // from class: l.wm
            public final void call(Object obj) {
                dialogZ.dismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m27329o(VEditText vEditText, VText vText, VButton vButton, VEditText vEditText2, CharSequence charSequence) {
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

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m27330p(d30 d30Var, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            lsi0.y("手机绑定失败");
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m27332r(VEditText vEditText, VEditText vEditText2, final Act act, VText vText, final l5j0 l5j0Var, final d30 d30Var, final d30 d30Var2, final VButton vButton, View view) {
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
        AccountModule.f26c.m167B2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.cm
            public final void call(Object obj) {
                C1444xm.m27286F(act, l5j0Var, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.dm
            public final void call(Object obj) {
                C1444xm.m27319j(act, d30Var2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m27333s(Act act, e30 e30Var, e30 e30Var2, Date date) {
        if (date.compareTo(yij0.V()) > 0) {
            msi0.INSTANCE.b(act, act.string(R$string.f219j3), Integer.valueOf(v2c0.f24012Y));
            if (NullChecker.a(e30Var)) {
                e30Var.call(Boolean.TRUE);
            }
            return Boolean.FALSE;
        }
        if (date.compareTo(yij0.N()) >= 0) {
            e30Var2.call(Double.valueOf(date.getTime()));
            return Boolean.TRUE;
        }
        msi0.INSTANCE.b(act, act.string(R$string.f213i3), Integer.valueOf(v2c0.f24012Y));
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m27335u(d30 d30Var, Act act, Throwable th) {
        d30Var.call();
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            yij0.G(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m27336v(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f265r3);
        xdl0.y(vText, false);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.y(vText, false);
        } else {
            xdl0.y(vText, true);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m27337w(final Act act, final d30 d30Var, final l5j0 l5j0Var, final d30 d30Var2, View view) {
        zvf0.r("e_force_bindphone_identified_confirm", "p_force_bindphone_identified_popup");
        act.duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.gm
            public final void call(Object obj) {
                C1444xm.m27330p(d30Var, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.hm
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.im
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return AccountModule.f26c.m201Q1(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(mkd0.H(new e30() { // from class: l.jm
            public final void call(Object obj) {
                C1444xm.m27283C(l5j0Var, d30Var2, (roj0) obj);
            }
        }, new e30() { // from class: l.lm
            public final void call(Object obj) {
                C1444xm.m27335u(d30Var, act, (Throwable) obj);
            }
        }));
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m27338x(Throwable th) {
    }
}
