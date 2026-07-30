package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.promotion.ConstantCouponId;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes11.dex */
public class bn60 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<Dialog> f77436a;

    /* JADX INFO: renamed from: b */
    public static final String f77437b;

    /* JADX INFO: renamed from: c */
    public static final String f77438c;

    static {
        f77437b = !zwk.m221905e() ? "https://lp.tantanapp.com/vip/auto_renew_protocol" : "https://lp.staging2.p1staff.com/vip/auto_renew_protocol";
        f77438c = !zwk.m221905e() ? "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/membership-agreement/index.html?speed=true&_bid=1004258#/service_agreement" : "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/membership-agreement/index.html?speed=true&_bid=1004258#/service_agreement";
    }

    /* JADX INFO: renamed from: A */
    public static CharSequence m105318A(Merchandise merchandise, @ColorInt int i) {
        String str = String.format(Locale.getDefault(), "同意%1$s，到期后以%2$s元/%3$s自动续费，可随时取消", "会员及自动续费协议", new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new da5(f77437b).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115113b(i).m115115d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: B */
    public static CharSequence m105319B(Merchandise merchandise) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int color = Color.parseColor("#66FFDEA2");
        String str = String.format(Locale.getDefault(), "同意%1$s，到期后以%2$s元/%3$s自动续费，可随时取消", "会员及自动续费协议", decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str.toString(), jyb.m147507f0(str.toString()), color, lyh0.m156283c(3));
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115113b(color).m115115d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: C */
    public static CharSequence m105320C(Merchandise merchandise, @ColorInt int i) {
        return m105318A(merchandise, i);
    }

    /* JADX INFO: renamed from: D */
    public static Spannable m105321D() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我已阅读并同意会员及自动续费协议，确认开通该服务");
        spannableStringBuilder.setSpan(new da5(f77437b).m115113b(Color.parseColor("#33000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115112a(false).m115115d(true), 7, 16, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: E */
    public static CharSequence m105322E(PurchaseType purchaseType, boolean z) {
        if (!wib0.m206565i(purchaseType) && !wib0.m206566j(purchaseType) && !wib0.m206572p(purchaseType)) {
            return m105354m(purchaseType, z);
        }
        int color = Color.parseColor("#66FFDEA2");
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(sb.toString(), jyb.m147507f0(sb.toString()), color, lyh0.m156283c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM175796b0.setSpan(new da5(f77438c).m115113b(color).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: F */
    public static CharSequence m105323F(@ColorInt int i) {
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(sb.toString(), jyb.m147507f0(sb.toString()), i, lyh0.m156283c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM175796b0.setSpan(new da5(f77438c).m115113b(i).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: G */
    public static CharSequence m105324G(PurchaseType purchaseType, boolean z) {
        String str = g6b.m129215e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), pta.m173725r() ? "自动订阅随时取消，同意%1$s最高享%2$s" : "自动订阅，随时取消\n同意%1$s最高享%2$s", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str2, jyb.m147507f0(str), m105334Q(z), lyh0.m156283c(g6b.m129215e(purchaseType) ? 2 : 3));
        int iIndexOf = str2.indexOf(str);
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, str.length() + iIndexOf, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: H */
    public static CharSequence m105325H(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = g6b.m129215e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str3 = String.format(Locale.getDefault(), pta.m173725r() ? "到期以%1$s元/%2$s自动续费，可随时取消。同意%3$s最高享%4$s" : "到期以%1$s元/%2$s自动续费，可随时取消\n同意%3$s最高享%4$s", str, merchandise.quantityName(), str2, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str3, jyb.m147507f0(str2), m105334Q(z), lyh0.m156283c(3));
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, str2.length() + iIndexOf, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: I */
    public static CharSequence m105326I(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = g6b.m129215e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str3 = String.format(Locale.getDefault(), pta.m173725r() ? "到期以%1$s元/%2$s自动续费，可随时取消。同意%3$s最高享%4$s" : "到期以%1$s元/%2$s自动续费，可随时取消\n同意%3$s最高享%4$s", str, merchandise.quantityName(), str2, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str3, jyb.m147507f0(str3), z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff"), lyh0.m156283c(2));
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, str2.length() + iIndexOf, 18);
        String str4 = String.format("%s元/%s", str, merchandise.quantityName());
        int iIndexOf2 = str3.indexOf(str4);
        spannableStringBuilderM175796b0.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), iIndexOf2, str4.length() + iIndexOf2, 33);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: J */
    public static CharSequence m105327J(PurchaseType purchaseType, String str, boolean z) {
        String str2 = String.format(Locale.getDefault(), "同意%1$s，随时取消，已享%2$s折优惠，最高%3$s", "会员及自动续费协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str2, jyb.m147507f0("会员及自动续费协议"), m105334Q(z), lyh0.m156283c(3));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: K */
    public static CharSequence m105328K(Merchandise merchandise, PurchaseType purchaseType, String str, boolean z) {
        String str2 = String.format(Locale.getDefault(), "同意%1$s，随时取消，已享%2$s折优惠，最高%3$s，到期以%4$s元/%5$s自动续费", "会员及自动续费协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)), new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str2, jyb.m147507f0("会员及自动续费协议"), m105334Q(z), lyh0.m156283c(3));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: L */
    public static CharSequence m105329L(String str, String str2) {
        return String.format(Locale.getDefault(), "7天后以%1$s%2$s/月订阅，可随时取消", str, str2);
    }

    /* JADX INFO: renamed from: M */
    public static CharSequence m105330M(boolean z) {
        String str = String.format(Locale.getDefault(), pta.m173725r() ? "自动订阅随时取消，同意%1$s，仅限22岁及以下用户购买" : "自动订阅，随时取消\n同意%1$s，仅限22岁及以下用户购买", "会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str, jyb.m147507f0("会员及自动续费协议"), m105334Q(z), lyh0.m156283c(3));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 9, 33);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: N */
    public static void m105331N() {
        if (NullChecker.m82486a(f77436a)) {
            Dialog dialog = f77436a.get();
            if (NullChecker.m82486a(dialog) && dialog.isShowing()) {
                Activity activityM105508E = bnl0.m105508E(dialog.m21457P());
                if (NullChecker.m82486a(activityM105508E) && !activityM105508E.isFinishing() && !activityM105508E.isDestroyed()) {
                    dialog.dismiss();
                }
            }
            f77436a = null;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m105332O() {
        if (NullChecker.m82486a(f77436a)) {
            Dialog dialog = f77436a.get();
            if (NullChecker.m82486a(dialog) && dialog.isShowing()) {
                m105331N();
                o1j0.m165634h(R$string.f28045J7);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static CharSequence m105333P(Act act, int i, PurchaseType purchaseType) {
        String str = String.format(Locale.getDefault(), "%s优惠", i + "%");
        String str2 = String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9));
        return q8g0.m175796b0(String.format(Locale.getDefault(), "未开启自动续费，不享受%1$s和最高%2$s，确定要放弃优惠福利吗？", str, str2), jyb.m147507f0(str, str2), act.color(h9c0.f108379l), Typeface.DEFAULT);
    }

    @ColorInt
    /* JADX INFO: renamed from: Q */
    public static int m105334Q(boolean z) {
        return Color.parseColor(z ? "#4c000000" : "#ccffffff");
    }

    @ColorInt
    /* JADX INFO: renamed from: R */
    public static int m105335R(boolean z) {
        return Color.parseColor(z ? "#4c000000" : "#ccffffff");
    }

    /* JADX INFO: renamed from: S */
    public static void m105336S() {
        o1j0.m165636j("恭喜！加速曝光福利已成功恢复！");
    }

    /* JADX INFO: renamed from: T */
    public static void m105337T(Act act) {
        m105332O();
    }

    /* JADX INFO: renamed from: U */
    public static void m105338U(Act act) {
        if (gta.m132210e().m132214d().mo34860j3()) {
            m105341X(act);
            return;
        }
        m105331N();
        f77436a = new WeakReference<>(act.dialog().m21520Q().m21516M(rec0.f162570k0).m21558v().m21525V(new DialogInterface.OnDismissListener() { // from class: l.qm60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bn60.m105352k(dialogInterface);
            }
        }).m21495B(false).m21567z0());
        l51.m152888H(act, new Runnable() { // from class: l.sm60
            @Override // java.lang.Runnable
            public final void run() {
                bn60.m105332O();
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: V */
    public static void m105339V(Act act, PurchaseType purchaseType, C8928d c8928d, @NonNull final x20 x20Var, @NonNull final x20 x20Var2) {
        String strM54780o;
        String string;
        if (NullChecker.m82486a(c8928d) && NullChecker.m82486a(c8928d.m54703b())) {
            strM54780o = c8928d.m54703b().m54780o();
            if (TextUtils.isEmpty(strM54780o)) {
                strM54780o = c8928d.m54703b().m54782q();
            }
        } else {
            strM54780o = "";
        }
        ArrayList arrayList = new ArrayList();
        String strString = act.string(R$string.f28046J8);
        if (wib0.m206575s(purchaseType) || wib0.m206573q(purchaseType) || wib0.m206569m(purchaseType) || wib0.m206571o(purchaseType) || wib0.m206565i(purchaseType)) {
            string = act.getString(R$string.f28024H8, strM54780o);
            arrayList.add(act.getString(R$string.f28282e9, strM54780o));
        } else {
            string = act.getString(R$string.f28035I8, strM54780o);
            arrayList.add(act.getString(R$string.f28270d9, strM54780o));
        }
        new th0.C20312a(act).m191151j(q8g0.m175796b0(string, arrayList, act.color(h9c0.f108379l), lyh0.m156283c(3))).m191159r(strString).m191156o(new View.OnClickListener() { // from class: l.wm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        }).m191146e(R$string.f28057K8).m191144c(new View.OnClickListener() { // from class: l.xm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        }).m191153l(new DialogInterface.OnCancelListener() { // from class: l.ym60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                x20Var.call();
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: W */
    public static void m105340W(Act act, CharSequence charSequence, @Nullable JSONObject jSONObject, final x20 x20Var, final x20 x20Var2) {
        final l4g0 l4g0VarM204399c;
        final l4g0 l4g0VarM204399c2 = w1e.m204399c("p_non_renewal_retain_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c2);
        if (NullChecker.m82486a(jSONObject)) {
            l4g0VarM204399c = w1e.m204399c("p_purchase_autoguide_pop", Dialog.class.getName());
            l4g0VarM204399c.m152780o(jSONObject);
        } else {
            l4g0VarM204399c = null;
        }
        new th0.C20312a(act).m191151j(charSequence).m191147f("放弃").m191159r("获取优惠福利").m191156o(new View.OnClickListener() { // from class: l.zm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bn60.m105351j(x20Var, view);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.an60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bn60.m105346e(x20Var2, view);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.rm60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bn60.m105350i(l4g0VarM204399c2, l4g0VarM204399c, dialogInterface);
            }
        }).m191142a().m191141g();
        if (NullChecker.m82486a(l4g0VarM204399c)) {
            w1e.m204402f(l4g0VarM204399c);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m105341X(Act act) {
        m105331N();
        Dialog dialogM21567z0 = act.dialog().m21520Q().m21516M(rec0.f162570k0).m21558v().m21525V(new DialogInterface.OnDismissListener() { // from class: l.tm60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bn60.m105347f(dialogInterface);
            }
        }).m21495B(false).m21567z0();
        final TextView textView = (TextView) dialogM21567z0.m21457P().findViewById(fdc0.f98409h1);
        l51.m152888H(act, new Runnable() { // from class: l.um60
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText(R$string.f28296g);
            }
        }, 1000L);
        f77436a = new WeakReference<>(dialogM21567z0);
        l51.m152888H(act, new Runnable() { // from class: l.vm60
            @Override // java.lang.Runnable
            public final void run() {
                bn60.m105332O();
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m105346e(x20 x20Var, View view) {
        i4g0.m138520r("e_non_renewal_retain_popup_cancel", "p_non_renewal_retain_popup");
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m105347f(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m105350i(l4g0 l4g0Var, l4g0 l4g0Var2, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        if (NullChecker.m82486a(l4g0Var2)) {
            w1e.m204401e(l4g0Var2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m105351j(x20 x20Var, View view) {
        i4g0.m138520r("e_non_renewal_retain_popup_confirm", "p_non_renewal_retain_popup");
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m105352k(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l */
    public static CharSequence m105353l(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        str.getClass();
        if (str.equals(ConstantCouponId.lowPrice3MonthVIP1M1R_local)) {
            return m105358q(act, merchandise, purchaseType, z);
        }
        if (str.equals(ConstantCouponId.lowPriceFirstMonthVIP1M_local)) {
            return m105357p(act, merchandise, purchaseType, z);
        }
        return purchaseType == PurchaseType.TYPE_O_DIAMOND ? m105367z(merchandise) : m105363v(act, merchandise, purchaseType, z);
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m105354m(PurchaseType purchaseType, boolean z) {
        return m105355n(purchaseType, z, m105334Q(z));
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m105355n(PurchaseType purchaseType, boolean z, int i) {
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        if (wib0.m206580x(purchaseType)) {
            sb.append("，仅限22岁及以下用户购买");
        }
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(sb.toString(), jyb.m147507f0("《会员服务协议》"), i, lyh0.m156283c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM175796b0.setSpan(new da5(f77438c).m115113b(i).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m105356o(boolean z) {
        String str = String.format(Locale.getDefault(), pta.m173725r() ? "自动订阅随时取消，同意%1$s" : "自动订阅，随时取消\n同意%1$s", "会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str, jyb.m147507f0("会员及自动续费协议"), m105334Q(z), lyh0.m156283c(3));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m105357p(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "享前首月¥%s/月优惠", str);
        String str4 = String.format(Locale.getDefault(), "同意%1$s%2$s，第4个月起按¥%3$s/月续订，可随时取消", "会员及自动续费协议", str3, str2);
        if (z) {
            spannableStringBuilder = q8g0.m175796b0(str4, jyb.m147507f0(str3), wib0.m206579w(purchaseType) ? act.color(h9c0.f108379l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str4);
        }
        int iIndexOf = str4.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new da5(f77437b).m115113b(Color.parseColor("#de000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115112a(!z).m115115d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q */
    public static CharSequence m105358q(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return m105359r(act, merchandise, purchaseType, z, false);
    }

    /* JADX INFO: renamed from: r */
    public static CharSequence m105359r(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "享前3月¥%s/月优惠", str);
        String str4 = String.format(Locale.getDefault(), "同意%1$s%2$s，第4个月起按¥%3$s/月续订，可随时取消", "会员及自动续费协议", str3, str2);
        if (z) {
            spannableStringBuilder = q8g0.m175796b0(str4, jyb.m147507f0(str3), wib0.m206579w(purchaseType) ? act.color(h9c0.f108379l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str4);
        }
        int iIndexOf = str4.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new da5(f77437b).m115113b(Color.parseColor("#de000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115112a(!z).m115115d(z2), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: s */
    public static CharSequence m105360s(Act act, Merchandise merchandise, PurchaseType purchaseType) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "同意%1$s%2$s,到期¥%3$s/月续订,可随时取消", "会员及自动续费协议", String.format(Locale.getDefault(), "前3月享优惠¥%s/月", str), str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new da5(f77437b).m115113b(Color.parseColor("#4c000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115112a(false).m115115d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: t */
    public static CharSequence m105361t(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = String.format(Locale.getDefault(), "同意%3$s最高享%4$s,到期%1$s元/%2$s续订,可随时取消", new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName(), "会员及自动续费协议", String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str, jyb.m147507f0("会员及自动续费协议"), m105334Q(z), lyh0.m156283c(3));
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: u */
    public static CharSequence m105362u(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = String.format(Locale.getDefault(), "同意%3$s最高享%4$s,到期%1$s元/%2$s续订,可随时取消", str, merchandise.quantityName(), "会员及自动续费协议", String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str2, jyb.m147507f0(str2), z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff"), lyh0.m156283c(2));
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 9, 18);
        String str3 = String.format("%s元/%s", str, merchandise.quantityName());
        int iIndexOf2 = str2.indexOf(str3);
        spannableStringBuilderM175796b0.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), iIndexOf2, str3.length() + iIndexOf2, 33);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: v */
    public static CharSequence m105363v(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return m105364w(act, merchandise, purchaseType, z, false);
    }

    /* JADX INFO: renamed from: w */
    public static CharSequence m105364w(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9));
        String str3 = String.format(Locale.getDefault(), "同意%1$s可享最高%2$s，到期后以¥%3$s/%4$s续订，可随时取消", "会员及自动续费协议", str2, str, merchandise.quantityName());
        if (z) {
            spannableStringBuilder = q8g0.m175796b0(str3, jyb.m147507f0(str2), wib0.m206579w(purchaseType) ? act.color(h9c0.f108379l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str3);
        }
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new da5(f77437b).m115113b(Color.parseColor("#de000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115112a(!z).m115115d(z2), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: x */
    public static CharSequence m105365x(PurchaseType purchaseType, boolean z) {
        String str = g6b.m129215e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), "自动订阅,随时取消,同意%1$s最高享%2$s", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(wib0.m206579w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(str2, jyb.m147507f0(str), m105334Q(z), lyh0.m156283c(g6b.m129215e(purchaseType) ? 2 : 3));
        int iIndexOf = str2.indexOf(str);
        spannableStringBuilderM175796b0.setSpan(new da5(f77437b).m115113b(m105334Q(z)).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, str.length() + iIndexOf, 18);
        return spannableStringBuilderM175796b0;
    }

    /* JADX INFO: renamed from: y */
    public static CharSequence m105366y(String str, String str2) {
        String str3 = String.format(Locale.getDefault(), "同意%1s,7天后以%2$s%3$s/月订阅,可随时取消", "会员及自动续费协议", str, str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new da5(f77437b).m115113b(Color.parseColor("#4c000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115112a(false).m115115d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public static CharSequence m105367z(Merchandise merchandise) {
        return m105318A(merchandise, -1);
    }
}
