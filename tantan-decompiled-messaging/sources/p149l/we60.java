package p149l;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.promotion.ConstantCouponId;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes11.dex */
public class we60 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<Dialog> f185907a;

    /* JADX INFO: renamed from: b */
    public static final String f185908b;

    /* JADX INFO: renamed from: c */
    public static final String f185909c;

    static {
        f185908b = !juk.m143323e() ? "https://lp.tantanapp.com/vip/auto_renew_protocol" : "https://lp.staging2.p1staff.com/vip/auto_renew_protocol";
        f185909c = !juk.m143323e() ? "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/membership-agreement/index.html?speed=true&_bid=1004258#/service_agreement" : "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/membership-agreement/index.html?speed=true&_bid=1004258#/service_agreement";
    }

    /* JADX INFO: renamed from: A */
    public static CharSequence m202836A(Merchandise merchandise, @ColorInt int i) {
        String str = String.format(Locale.getDefault(), "同意%1$s，到期后以%2$s元/%3$s自动续费，可随时取消", "会员及自动续费协议", new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new c95(f185908b).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105841b(i).m105843d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: B */
    public static CharSequence m202837B(Merchandise merchandise) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int color = Color.parseColor("#66FFDEA2");
        String str = String.format(Locale.getDefault(), "同意%1$s，到期后以%2$s元/%3$s自动续费，可随时取消", "会员及自动续费协议", decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str.toString(), vwb.m200324f0(str.toString()), color, eqh0.m117752c(3));
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105841b(color).m105843d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: C */
    public static CharSequence m202838C(Merchandise merchandise, @ColorInt int i) {
        return m202836A(merchandise, i);
    }

    /* JADX INFO: renamed from: D */
    public static Spannable m202839D() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我已阅读并同意会员及自动续费协议，确认开通该服务");
        spannableStringBuilder.setSpan(new c95(f185908b).m105841b(Color.parseColor("#33000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105840a(false).m105843d(true), 7, 16, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: E */
    public static CharSequence m202840E(PurchaseType purchaseType, boolean z) {
        if (!sab0.m182891i(purchaseType) && !sab0.m182892j(purchaseType) && !sab0.m182898p(purchaseType)) {
            return m202872m(purchaseType, z);
        }
        int color = Color.parseColor("#66FFDEA2");
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(sb.toString(), vwb.m200324f0(sb.toString()), color, eqh0.m117752c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM133861b0.setSpan(new c95(f185909c).m105841b(color).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: F */
    public static CharSequence m202841F(@ColorInt int i) {
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(sb.toString(), vwb.m200324f0(sb.toString()), i, eqh0.m117752c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM133861b0.setSpan(new c95(f185909c).m105841b(i).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: G */
    public static CharSequence m202842G(PurchaseType purchaseType, boolean z) {
        String str = t4b.m187164e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), dsa.m113445r() ? "自动订阅随时取消，同意%1$s最高享%2$s" : "自动订阅，随时取消\n同意%1$s最高享%2$s", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str2, vwb.m200324f0(str), m202852Q(z), eqh0.m117752c(t4b.m187164e(purchaseType) ? 2 : 3));
        int iIndexOf = str2.indexOf(str);
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, str.length() + iIndexOf, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: H */
    public static CharSequence m202843H(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = t4b.m187164e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str3 = String.format(Locale.getDefault(), dsa.m113445r() ? "到期以%1$s元/%2$s自动续费，可随时取消。同意%3$s最高享%4$s" : "到期以%1$s元/%2$s自动续费，可随时取消\n同意%3$s最高享%4$s", str, merchandise.quantityName(), str2, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str3, vwb.m200324f0(str2), m202852Q(z), eqh0.m117752c(3));
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, str2.length() + iIndexOf, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: I */
    public static CharSequence m202844I(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = t4b.m187164e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str3 = String.format(Locale.getDefault(), dsa.m113445r() ? "到期以%1$s元/%2$s自动续费，可随时取消。同意%3$s最高享%4$s" : "到期以%1$s元/%2$s自动续费，可随时取消\n同意%3$s最高享%4$s", str, merchandise.quantityName(), str2, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str3, vwb.m200324f0(str3), z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff"), eqh0.m117752c(2));
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, str2.length() + iIndexOf, 18);
        String str4 = String.format("%s元/%s", str, merchandise.quantityName());
        int iIndexOf2 = str3.indexOf(str4);
        spannableStringBuilderM133861b0.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), iIndexOf2, str4.length() + iIndexOf2, 33);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: J */
    public static CharSequence m202845J(PurchaseType purchaseType, String str, boolean z) {
        String str2 = String.format(Locale.getDefault(), "同意%1$s，随时取消，已享%2$s折优惠，最高%3$s", "会员及自动续费协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str2, vwb.m200324f0("会员及自动续费协议"), m202852Q(z), eqh0.m117752c(3));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: K */
    public static CharSequence m202846K(Merchandise merchandise, PurchaseType purchaseType, String str, boolean z) {
        String str2 = String.format(Locale.getDefault(), "同意%1$s，随时取消，已享%2$s折优惠，最高%3$s，到期以%4$s元/%5$s自动续费", "会员及自动续费协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)), new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str2, vwb.m200324f0("会员及自动续费协议"), m202852Q(z), eqh0.m117752c(3));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: L */
    public static CharSequence m202847L(String str, String str2) {
        return String.format(Locale.getDefault(), "7天后以%1$s%2$s/月订阅，可随时取消", str, str2);
    }

    /* JADX INFO: renamed from: M */
    public static CharSequence m202848M(boolean z) {
        String str = String.format(Locale.getDefault(), dsa.m113445r() ? "自动订阅随时取消，同意%1$s，仅限22岁及以下用户购买" : "自动订阅，随时取消\n同意%1$s，仅限22岁及以下用户购买", "会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str, vwb.m200324f0("会员及自动续费协议"), m202852Q(z), eqh0.m117752c(3));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 9, 33);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: N */
    public static void m202849N() {
        if (NullChecker.m81303a(f185907a)) {
            Dialog dialog = f185907a.get();
            if (NullChecker.m81303a(dialog) && dialog.isShowing()) {
                Activity activityM208328E = xdl0.m208328E(dialog.m20458P());
                if (NullChecker.m81303a(activityM208328E) && !activityM208328E.isFinishing() && !activityM208328E.isDestroyed()) {
                    dialog.dismiss();
                }
            }
            f185907a = null;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m202850O() {
        if (NullChecker.m81303a(f185907a)) {
            Dialog dialog = f185907a.get();
            if (NullChecker.m81303a(dialog) && dialog.isShowing()) {
                m202849N();
                lsi0.m151578h(R$string.f27197J7);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static CharSequence m202851P(Act act, int i, PurchaseType purchaseType) {
        String str = String.format(Locale.getDefault(), "%s优惠", i + "%");
        String str2 = String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9));
        return i0g0.m133861b0(String.format(Locale.getDefault(), "未开启自动续费，不享受%1$s和最高%2$s，确定要放弃优惠福利吗？", str, str2), vwb.m200324f0(str, str2), act.color(b1c0.f72559l), Typeface.DEFAULT);
    }

    @ColorInt
    /* JADX INFO: renamed from: Q */
    public static int m202852Q(boolean z) {
        return Color.parseColor(z ? "#4c000000" : "#ccffffff");
    }

    @ColorInt
    /* JADX INFO: renamed from: R */
    public static int m202853R(boolean z) {
        return Color.parseColor(z ? "#4c000000" : "#ccffffff");
    }

    /* JADX INFO: renamed from: S */
    public static void m202854S() {
        lsi0.m151580j("恭喜！加速曝光福利已成功恢复！");
    }

    /* JADX INFO: renamed from: T */
    public static void m202855T(Act act) {
        m202850O();
    }

    /* JADX INFO: renamed from: U */
    public static void m202856U(Act act) {
        if (ura.m195053e().m195057d().mo33857j3()) {
            m202859X(act);
            return;
        }
        m202849N();
        f185907a = new WeakReference<>(act.dialog().m20521Q().m20517M(m6c0.f131610k0).m20559v().m20526V(new DialogInterface.OnDismissListener() { // from class: l.le60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                we60.m202870k(dialogInterface);
            }
        }).m20496B(false).m20568z0());
        e51.m114743H(act, new Runnable() { // from class: l.ne60
            @Override // java.lang.Runnable
            public final void run() {
                we60.m202850O();
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: V */
    public static void m202857V(Act act, PurchaseType purchaseType, C8765d c8765d, @NonNull final d30 d30Var, @NonNull final d30 d30Var2) {
        String strM53597o;
        String string;
        if (NullChecker.m81303a(c8765d) && NullChecker.m81303a(c8765d.m53520b())) {
            strM53597o = c8765d.m53520b().m53597o();
            if (TextUtils.isEmpty(strM53597o)) {
                strM53597o = c8765d.m53520b().m53599q();
            }
        } else {
            strM53597o = "";
        }
        ArrayList arrayList = new ArrayList();
        String strString = act.string(R$string.f27198J8);
        if (sab0.m182901s(purchaseType) || sab0.m182899q(purchaseType) || sab0.m182895m(purchaseType) || sab0.m182897o(purchaseType) || sab0.m182891i(purchaseType)) {
            string = act.getString(R$string.f27176H8, strM53597o);
            arrayList.add(act.getString(R$string.f27434e9, strM53597o));
        } else {
            string = act.getString(R$string.f27187I8, strM53597o);
            arrayList.add(act.getString(R$string.f27422d9, strM53597o));
        }
        new xh0.C21150a(act).m208731j(i0g0.m133861b0(string, arrayList, act.color(b1c0.f72559l), eqh0.m117752c(3))).m208739r(strString).m208736o(new View.OnClickListener() { // from class: l.re60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).m208726e(R$string.f27209K8).m208724c(new View.OnClickListener() { // from class: l.se60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        }).m208733l(new DialogInterface.OnCancelListener() { // from class: l.te60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                d30Var.call();
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: W */
    public static void m202858W(Act act, CharSequence charSequence, @Nullable JSONObject jSONObject, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarM133794c;
        final cwf0 cwf0VarM133794c2 = i0e.m133794c("p_non_renewal_retain_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c2);
        if (NullChecker.m81303a(jSONObject)) {
            cwf0VarM133794c = i0e.m133794c("p_purchase_autoguide_pop", Dialog.class.getName());
            cwf0VarM133794c.m109039o(jSONObject);
        } else {
            cwf0VarM133794c = null;
        }
        new xh0.C21150a(act).m208731j(charSequence).m208727f("放弃").m208739r("获取优惠福利").m208736o(new View.OnClickListener() { // from class: l.ue60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                we60.m202869j(d30Var, view);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.ve60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                we60.m202864e(d30Var2, view);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.me60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                we60.m202868i(cwf0VarM133794c2, cwf0VarM133794c, dialogInterface);
            }
        }).m208722a().m208721g();
        if (NullChecker.m81303a(cwf0VarM133794c)) {
            i0e.m133797f(cwf0VarM133794c);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m202859X(Act act) {
        m202849N();
        Dialog dialogM20568z0 = act.dialog().m20521Q().m20517M(m6c0.f131610k0).m20559v().m20526V(new DialogInterface.OnDismissListener() { // from class: l.oe60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                we60.m202865f(dialogInterface);
            }
        }).m20496B(false).m20568z0();
        final TextView textView = (TextView) dialogM20568z0.m20458P().findViewById(z4c0.f201533h1);
        e51.m114743H(act, new Runnable() { // from class: l.pe60
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText(R$string.f27448g);
            }
        }, 1000L);
        f185907a = new WeakReference<>(dialogM20568z0);
        e51.m114743H(act, new Runnable() { // from class: l.qe60
            @Override // java.lang.Runnable
            public final void run() {
                we60.m202850O();
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m202864e(d30 d30Var, View view) {
        zvf0.m220396r("e_non_renewal_retain_popup_cancel", "p_non_renewal_retain_popup");
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m202865f(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m202868i(cwf0 cwf0Var, cwf0 cwf0Var2, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        if (NullChecker.m81303a(cwf0Var2)) {
            i0e.m133796e(cwf0Var2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m202869j(d30 d30Var, View view) {
        zvf0.m220396r("e_non_renewal_retain_popup_confirm", "p_non_renewal_retain_popup");
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m202870k(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l */
    public static CharSequence m202871l(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        str.getClass();
        if (str.equals(ConstantCouponId.lowPrice3MonthVIP1M1R_local)) {
            return m202876q(act, merchandise, purchaseType, z);
        }
        if (str.equals(ConstantCouponId.lowPriceFirstMonthVIP1M_local)) {
            return m202875p(act, merchandise, purchaseType, z);
        }
        return purchaseType == PurchaseType.TYPE_O_DIAMOND ? m202885z(merchandise) : m202881v(act, merchandise, purchaseType, z);
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m202872m(PurchaseType purchaseType, boolean z) {
        return m202873n(purchaseType, z, m202852Q(z));
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m202873n(PurchaseType purchaseType, boolean z, int i) {
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        if (sab0.m182906x(purchaseType)) {
            sb.append("，仅限22岁及以下用户购买");
        }
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(sb.toString(), vwb.m200324f0("《会员服务协议》"), i, eqh0.m117752c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM133861b0.setSpan(new c95(f185909c).m105841b(i).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m202874o(boolean z) {
        String str = String.format(Locale.getDefault(), dsa.m113445r() ? "自动订阅随时取消，同意%1$s" : "自动订阅，随时取消\n同意%1$s", "会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str, vwb.m200324f0("会员及自动续费协议"), m202852Q(z), eqh0.m117752c(3));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m202875p(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "享前首月¥%s/月优惠", str);
        String str4 = String.format(Locale.getDefault(), "同意%1$s%2$s，第4个月起按¥%3$s/月续订，可随时取消", "会员及自动续费协议", str3, str2);
        if (z) {
            spannableStringBuilder = i0g0.m133861b0(str4, vwb.m200324f0(str3), sab0.m182905w(purchaseType) ? act.color(b1c0.f72559l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str4);
        }
        int iIndexOf = str4.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f185908b).m105841b(Color.parseColor("#de000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105840a(!z).m105843d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q */
    public static CharSequence m202876q(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return m202877r(act, merchandise, purchaseType, z, false);
    }

    /* JADX INFO: renamed from: r */
    public static CharSequence m202877r(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "享前3月¥%s/月优惠", str);
        String str4 = String.format(Locale.getDefault(), "同意%1$s%2$s，第4个月起按¥%3$s/月续订，可随时取消", "会员及自动续费协议", str3, str2);
        if (z) {
            spannableStringBuilder = i0g0.m133861b0(str4, vwb.m200324f0(str3), sab0.m182905w(purchaseType) ? act.color(b1c0.f72559l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str4);
        }
        int iIndexOf = str4.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f185908b).m105841b(Color.parseColor("#de000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105840a(!z).m105843d(z2), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: s */
    public static CharSequence m202878s(Act act, Merchandise merchandise, PurchaseType purchaseType) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "同意%1$s%2$s,到期¥%3$s/月续订,可随时取消", "会员及自动续费协议", String.format(Locale.getDefault(), "前3月享优惠¥%s/月", str), str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f185908b).m105841b(Color.parseColor("#4c000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105840a(false).m105843d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: t */
    public static CharSequence m202879t(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = String.format(Locale.getDefault(), "同意%3$s最高享%4$s,到期%1$s元/%2$s续订,可随时取消", new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName(), "会员及自动续费协议", String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str, vwb.m200324f0("会员及自动续费协议"), m202852Q(z), eqh0.m117752c(3));
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: u */
    public static CharSequence m202880u(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = String.format(Locale.getDefault(), "同意%3$s最高享%4$s,到期%1$s元/%2$s续订,可随时取消", str, merchandise.quantityName(), "会员及自动续费协议", String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str2, vwb.m200324f0(str2), z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff"), eqh0.m117752c(2));
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 9, 18);
        String str3 = String.format("%s元/%s", str, merchandise.quantityName());
        int iIndexOf2 = str2.indexOf(str3);
        spannableStringBuilderM133861b0.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), iIndexOf2, str3.length() + iIndexOf2, 33);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: v */
    public static CharSequence m202881v(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return m202882w(act, merchandise, purchaseType, z, false);
    }

    /* JADX INFO: renamed from: w */
    public static CharSequence m202882w(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9));
        String str3 = String.format(Locale.getDefault(), "同意%1$s可享最高%2$s，到期后以¥%3$s/%4$s续订，可随时取消", "会员及自动续费协议", str2, str, merchandise.quantityName());
        if (z) {
            spannableStringBuilder = i0g0.m133861b0(str3, vwb.m200324f0(str2), sab0.m182905w(purchaseType) ? act.color(b1c0.f72559l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str3);
        }
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f185908b).m105841b(Color.parseColor("#de000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105840a(!z).m105843d(z2), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: x */
    public static CharSequence m202883x(PurchaseType purchaseType, boolean z) {
        String str = t4b.m187164e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), "自动订阅,随时取消,同意%1$s最高享%2$s", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.m182905w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(str2, vwb.m200324f0(str), m202852Q(z), eqh0.m117752c(t4b.m187164e(purchaseType) ? 2 : 3));
        int iIndexOf = str2.indexOf(str);
        spannableStringBuilderM133861b0.setSpan(new c95(f185908b).m105841b(m202852Q(z)).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, str.length() + iIndexOf, 18);
        return spannableStringBuilderM133861b0;
    }

    /* JADX INFO: renamed from: y */
    public static CharSequence m202884y(String str, String str2) {
        String str3 = String.format(Locale.getDefault(), "同意%1s,7天后以%2$s%3$s/月订阅,可随时取消", "会员及自动续费协议", str, str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f185908b).m105841b(Color.parseColor("#4c000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105840a(false).m105843d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public static CharSequence m202885z(Merchandise merchandise) {
        return m202836A(merchandise, -1);
    }
}
