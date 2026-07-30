package p009l;

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
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import l.c95;
import l.cwf0;
import l.d30;
import l.dsa;
import l.e51;
import l.eqh0;
import l.lsi0;
import l.sab0;
import l.t4b;
import l.ura;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.zvf0;
import org.json.JSONObject;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class we60 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<Dialog> f22067a;

    /* JADX INFO: renamed from: b */
    public static final String f22068b;

    /* JADX INFO: renamed from: c */
    public static final String f22069c;

    static {
        f22068b = !juk.m17221e() ? "https://lp.tantanapp.com/vip/auto_renew_protocol" : "https://lp.staging2.p1staff.com/vip/auto_renew_protocol";
        f22069c = !juk.m17221e() ? "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/membership-agreement/index.html?speed=true&_bid=1004258#/service_agreement" : "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/membership-agreement/index.html?speed=true&_bid=1004258#/service_agreement";
    }

    /* JADX INFO: renamed from: A */
    public static CharSequence m24139A(Merchandise merchandise, @ColorInt int i) {
        String str = String.format(Locale.getDefault(), "同意%1$s，到期后以%2$s元/%3$s自动续费，可随时取消", "会员及自动续费协议", new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new c95(f22068b).c(CoreModule.b.getString(R$string.f5908D6)).b(i).d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: B */
    public static CharSequence m24140B(Merchandise merchandise) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int color = Color.parseColor("#66FFDEA2");
        String str = String.format(Locale.getDefault(), "同意%1$s，到期后以%2$s元/%3$s自动续费，可随时取消", "会员及自动续费协议", decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str.toString(), vwb.f0(new String[]{str.toString()}), color, eqh0.c(3));
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).c(CoreModule.b.getString(R$string.f5908D6)).b(color).d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: C */
    public static CharSequence m24141C(Merchandise merchandise, @ColorInt int i) {
        return m24139A(merchandise, i);
    }

    /* JADX INFO: renamed from: D */
    public static Spannable m24142D() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我已阅读并同意会员及自动续费协议，确认开通该服务");
        spannableStringBuilder.setSpan(new c95(f22068b).b(Color.parseColor("#33000000")).c(CoreModule.b.getString(R$string.f5908D6)).a(false).d(true), 7, 16, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: E */
    public static CharSequence m24143E(PurchaseType purchaseType, boolean z) {
        if (!sab0.i(purchaseType) && !sab0.j(purchaseType) && !sab0.p(purchaseType)) {
            return m24175m(purchaseType, z);
        }
        int color = Color.parseColor("#66FFDEA2");
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(sb.toString(), vwb.f0(new String[]{sb.toString()}), color, eqh0.c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM16129b0.setSpan(new c95(f22069c).b(color).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: F */
    public static CharSequence m24144F(@ColorInt int i) {
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(sb.toString(), vwb.f0(new String[]{sb.toString()}), i, eqh0.c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM16129b0.setSpan(new c95(f22069c).b(i).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: G */
    public static CharSequence m24145G(PurchaseType purchaseType, boolean z) {
        String str = t4b.e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), dsa.r() ? "自动订阅随时取消，同意%1$s最高享%2$s" : "自动订阅，随时取消\n同意%1$s最高享%2$s", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str2, vwb.f0(new String[]{str}), m24155Q(z), eqh0.c(t4b.e(purchaseType) ? 2 : 3));
        int iIndexOf = str2.indexOf(str);
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, str.length() + iIndexOf, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: H */
    public static CharSequence m24146H(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = t4b.e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str3 = String.format(Locale.getDefault(), dsa.r() ? "到期以%1$s元/%2$s自动续费，可随时取消。同意%3$s最高享%4$s" : "到期以%1$s元/%2$s自动续费，可随时取消\n同意%3$s最高享%4$s", str, merchandise.quantityName(), str2, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str3, vwb.f0(new String[]{str2}), m24155Q(z), eqh0.c(3));
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, str2.length() + iIndexOf, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: I */
    public static CharSequence m24147I(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = t4b.e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str3 = String.format(Locale.getDefault(), dsa.r() ? "到期以%1$s元/%2$s自动续费，可随时取消。同意%3$s最高享%4$s" : "到期以%1$s元/%2$s自动续费，可随时取消\n同意%3$s最高享%4$s", str, merchandise.quantityName(), str2, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str3, vwb.f0(new String[]{str3}), z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff"), eqh0.c(2));
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff")).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, str2.length() + iIndexOf, 18);
        String str4 = String.format("%s元/%s", str, merchandise.quantityName());
        int iIndexOf2 = str3.indexOf(str4);
        spannableStringBuilderM16129b0.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), iIndexOf2, str4.length() + iIndexOf2, 33);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: J */
    public static CharSequence m24148J(PurchaseType purchaseType, String str, boolean z) {
        String str2 = String.format(Locale.getDefault(), "同意%1$s，随时取消，已享%2$s折优惠，最高%3$s", "会员及自动续费协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str2, vwb.f0(new String[]{"会员及自动续费协议"}), m24155Q(z), eqh0.c(3));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: K */
    public static CharSequence m24149K(Merchandise merchandise, PurchaseType purchaseType, String str, boolean z) {
        String str2 = String.format(Locale.getDefault(), "同意%1$s，随时取消，已享%2$s折优惠，最高%3$s，到期以%4$s元/%5$s自动续费", "会员及自动续费协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)), new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName());
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str2, vwb.f0(new String[]{"会员及自动续费协议"}), m24155Q(z), eqh0.c(3));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: L */
    public static CharSequence m24150L(String str, String str2) {
        return String.format(Locale.getDefault(), "7天后以%1$s%2$s/月订阅，可随时取消", str, str2);
    }

    /* JADX INFO: renamed from: M */
    public static CharSequence m24151M(boolean z) {
        String str = String.format(Locale.getDefault(), dsa.r() ? "自动订阅随时取消，同意%1$s，仅限22岁及以下用户购买" : "自动订阅，随时取消\n同意%1$s，仅限22岁及以下用户购买", "会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str, vwb.f0(new String[]{"会员及自动续费协议"}), m24155Q(z), eqh0.c(3));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 9, 33);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: N */
    public static void m24152N() {
        if (NullChecker.a(f22067a)) {
            Dialog dialog = f22067a.get();
            if (NullChecker.a(dialog) && dialog.isShowing()) {
                Activity activityE = xdl0.E(dialog.P());
                if (NullChecker.a(activityE) && !activityE.isFinishing() && !activityE.isDestroyed()) {
                    dialog.dismiss();
                }
            }
            f22067a = null;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m24153O() {
        if (NullChecker.a(f22067a)) {
            Dialog dialog = f22067a.get();
            if (NullChecker.a(dialog) && dialog.isShowing()) {
                m24152N();
                lsi0.h(R$string.f5975J7);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static CharSequence m24154P(Act act, int i, PurchaseType purchaseType) {
        String str = String.format(Locale.getDefault(), "%s优惠", i + "%");
        String str2 = String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9));
        return i0g0.m16129b0(String.format(Locale.getDefault(), "未开启自动续费，不享受%1$s和最高%2$s，确定要放弃优惠福利吗？", str, str2), vwb.f0(new String[]{str, str2}), act.color(b1c0.f9840l), Typeface.DEFAULT);
    }

    @ColorInt
    /* JADX INFO: renamed from: Q */
    public static int m24155Q(boolean z) {
        return Color.parseColor(z ? "#4c000000" : "#ccffffff");
    }

    @ColorInt
    /* JADX INFO: renamed from: R */
    public static int m24156R(boolean z) {
        return Color.parseColor(z ? "#4c000000" : "#ccffffff");
    }

    /* JADX INFO: renamed from: S */
    public static void m24157S() {
        lsi0.j("恭喜！加速曝光福利已成功恢复！");
    }

    /* JADX INFO: renamed from: T */
    public static void m24158T(Act act) {
        m24153O();
    }

    /* JADX INFO: renamed from: U */
    public static void m24159U(Act act) {
        if (ura.e().d().j3()) {
            m24162X(act);
            return;
        }
        m24152N();
        f22067a = new WeakReference<>(act.dialog().Q().M(m6c0.f16669k0).v().V(new DialogInterface.OnDismissListener() { // from class: l.le60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                we60.m24173k(dialogInterface);
            }
        }).B(false).z0());
        e51.H(act, new Runnable() { // from class: l.ne60
            @Override // java.lang.Runnable
            public final void run() {
                we60.m24153O();
            }
        }, 30000L);
    }

    /* JADX INFO: renamed from: V */
    public static void m24160V(Act act, PurchaseType purchaseType, d dVar, @NonNull final d30 d30Var, @NonNull final d30 d30Var2) {
        String strO;
        String string;
        if (NullChecker.a(dVar) && NullChecker.a(dVar.b())) {
            strO = dVar.b().o();
            if (TextUtils.isEmpty(strO)) {
                strO = dVar.b().q();
            }
        } else {
            strO = "";
        }
        ArrayList arrayList = new ArrayList();
        String strString = act.string(R$string.f5976J8);
        if (sab0.s(purchaseType) || sab0.q(purchaseType) || sab0.m(purchaseType) || sab0.o(purchaseType) || sab0.i(purchaseType)) {
            string = act.getString(R$string.f5954H8, strO);
            arrayList.add(act.getString(R$string.f6212e9, strO));
        } else {
            string = act.getString(R$string.f5965I8, strO);
            arrayList.add(act.getString(R$string.f6200d9, strO));
        }
        new xh0.a(act).j(i0g0.m16129b0(string, arrayList, act.color(b1c0.f9840l), eqh0.c(3))).r(strString).o(new View.OnClickListener() { // from class: l.re60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).e(R$string.f5987K8).c(new View.OnClickListener() { // from class: l.se60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        }).l(new DialogInterface.OnCancelListener() { // from class: l.te60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                d30Var.call();
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: W */
    public static void m24161W(Act act, CharSequence charSequence, @Nullable JSONObject jSONObject, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarM16062c;
        final cwf0 cwf0VarM16062c2 = i0e.m16062c("p_non_renewal_retain_popup", Dialog.class.getName());
        i0e.m16065f(cwf0VarM16062c2);
        if (NullChecker.a(jSONObject)) {
            cwf0VarM16062c = i0e.m16062c("p_purchase_autoguide_pop", Dialog.class.getName());
            cwf0VarM16062c.o(jSONObject);
        } else {
            cwf0VarM16062c = null;
        }
        new xh0.a(act).j(charSequence).f("放弃").r("获取优惠福利").o(new View.OnClickListener() { // from class: l.ue60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                we60.m24172j(d30Var, view);
            }
        }).c(new View.OnClickListener() { // from class: l.ve60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                we60.m24167e(d30Var2, view);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.me60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                we60.m24171i(cwf0VarM16062c2, cwf0VarM16062c, dialogInterface);
            }
        }).a().g();
        if (NullChecker.a(cwf0VarM16062c)) {
            i0e.m16065f(cwf0VarM16062c);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m24162X(Act act) {
        m24152N();
        Dialog dialogZ0 = act.dialog().Q().M(m6c0.f16669k0).v().V(new DialogInterface.OnDismissListener() { // from class: l.oe60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                we60.m24168f(dialogInterface);
            }
        }).B(false).z0();
        final TextView textView = (TextView) dialogZ0.P().findViewById(z4c0.f23419h1);
        e51.H(act, new Runnable() { // from class: l.pe60
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText(R$string.f6226g);
            }
        }, 1000L);
        f22067a = new WeakReference<>(dialogZ0);
        e51.H(act, new Runnable() { // from class: l.qe60
            @Override // java.lang.Runnable
            public final void run() {
                we60.m24153O();
            }
        }, 30000L);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m24167e(d30 d30Var, View view) {
        zvf0.r("e_non_renewal_retain_popup_cancel", "p_non_renewal_retain_popup");
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m24168f(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24171i(cwf0 cwf0Var, cwf0 cwf0Var2, DialogInterface dialogInterface) {
        i0e.m16064e(cwf0Var);
        if (NullChecker.a(cwf0Var2)) {
            i0e.m16064e(cwf0Var2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m24172j(d30 d30Var, View view) {
        zvf0.r("e_non_renewal_retain_popup_confirm", "p_non_renewal_retain_popup");
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m24173k(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l */
    public static CharSequence m24174l(String str, Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        str.getClass();
        if (str.equals("lowPrice3MonthVIP1M1R@local")) {
            return m24179q(act, merchandise, purchaseType, z);
        }
        if (str.equals("lowPriceFirstMonthVIP1M@local")) {
            return m24178p(act, merchandise, purchaseType, z);
        }
        return purchaseType == PurchaseType.TYPE_O_DIAMOND ? m24188z(merchandise) : m24184v(act, merchandise, purchaseType, z);
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m24175m(PurchaseType purchaseType, boolean z) {
        return m24176n(purchaseType, z, m24155Q(z));
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m24176n(PurchaseType purchaseType, boolean z, int i) {
        StringBuilder sb = new StringBuilder("开通前阅读");
        sb.append("《会员服务协议》");
        if (sab0.x(purchaseType)) {
            sb.append("，仅限22岁及以下用户购买");
        }
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(sb.toString(), vwb.f0(new String[]{"《会员服务协议》"}), i, eqh0.c(3));
        int iIndexOf = sb.indexOf("《会员服务协议》");
        spannableStringBuilderM16129b0.setSpan(new c95(f22069c).b(i).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 8, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m24177o(boolean z) {
        String str = String.format(Locale.getDefault(), dsa.r() ? "自动订阅随时取消，同意%1$s" : "自动订阅，随时取消\n同意%1$s", "会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str, vwb.f0(new String[]{"会员及自动续费协议"}), m24155Q(z), eqh0.c(3));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m24178p(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "享前首月¥%s/月优惠", str);
        String str4 = String.format(Locale.getDefault(), "同意%1$s%2$s，第4个月起按¥%3$s/月续订，可随时取消", "会员及自动续费协议", str3, str2);
        if (z) {
            spannableStringBuilder = i0g0.m16129b0(str4, vwb.f0(new String[]{str3}), sab0.w(purchaseType) ? act.color(b1c0.f9840l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str4);
        }
        int iIndexOf = str4.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f22068b).b(Color.parseColor("#de000000")).c(CoreModule.b.getString(R$string.f5908D6)).a(!z).d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q */
    public static CharSequence m24179q(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return m24180r(act, merchandise, purchaseType, z, false);
    }

    /* JADX INFO: renamed from: r */
    public static CharSequence m24180r(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "享前3月¥%s/月优惠", str);
        String str4 = String.format(Locale.getDefault(), "同意%1$s%2$s，第4个月起按¥%3$s/月续订，可随时取消", "会员及自动续费协议", str3, str2);
        if (z) {
            spannableStringBuilder = i0g0.m16129b0(str4, vwb.f0(new String[]{str3}), sab0.w(purchaseType) ? act.color(b1c0.f9840l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str4);
        }
        int iIndexOf = str4.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f22068b).b(Color.parseColor("#de000000")).c(CoreModule.b.getString(R$string.f5908D6)).a(!z).d(z2), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: s */
    public static CharSequence m24181s(Act act, Merchandise merchandise, PurchaseType purchaseType) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format(merchandise.getFirstCouponPrice());
        String str2 = decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        String str3 = String.format(Locale.getDefault(), "同意%1$s%2$s,到期¥%3$s/月续订,可随时取消", "会员及自动续费协议", String.format(Locale.getDefault(), "前3月享优惠¥%s/月", str), str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f22068b).b(Color.parseColor("#4c000000")).c(CoreModule.b.getString(R$string.f5908D6)).a(false).d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: t */
    public static CharSequence m24182t(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = String.format(Locale.getDefault(), "同意%3$s最高享%4$s,到期%1$s元/%2$s续订,可随时取消", new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price), merchandise.quantityName(), "会员及自动续费协议", String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        int iIndexOf = str.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str, vwb.f0(new String[]{"会员及自动续费协议"}), m24155Q(z), eqh0.c(3));
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: u */
    public static CharSequence m24183u(Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = String.format(Locale.getDefault(), "同意%3$s最高享%4$s,到期%1$s元/%2$s续订,可随时取消", str, merchandise.quantityName(), "会员及自动续费协议", String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        int iIndexOf = str2.indexOf("会员及自动续费协议");
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str2, vwb.f0(new String[]{str2}), z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff"), eqh0.c(2));
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(z ? Color.parseColor("#66000000") : Color.parseColor("#fcffffff")).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, iIndexOf + 9, 18);
        String str3 = String.format("%s元/%s", str, merchandise.quantityName());
        int iIndexOf2 = str2.indexOf(str3);
        spannableStringBuilderM16129b0.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), iIndexOf2, str3.length() + iIndexOf2, 33);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: v */
    public static CharSequence m24184v(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z) {
        return m24185w(act, merchandise, purchaseType, z, false);
    }

    /* JADX INFO: renamed from: w */
    public static CharSequence m24185w(Act act, Merchandise merchandise, PurchaseType purchaseType, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        String str = new DecimalFormat("#.##").format(merchandise.defaultStockKeepUnit.prices.price);
        String str2 = String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9));
        String str3 = String.format(Locale.getDefault(), "同意%1$s可享最高%2$s，到期后以¥%3$s/%4$s续订，可随时取消", "会员及自动续费协议", str2, str, merchandise.quantityName());
        if (z) {
            spannableStringBuilder = i0g0.m16129b0(str3, vwb.f0(new String[]{str2}), sab0.w(purchaseType) ? act.color(b1c0.f9840l) : Color.parseColor("#fbc456"), Typeface.DEFAULT);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str3);
        }
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f22068b).b(Color.parseColor("#de000000")).c(CoreModule.b.getString(R$string.f5908D6)).a(!z).d(z2), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: x */
    public static CharSequence m24186x(PurchaseType purchaseType, boolean z) {
        String str = t4b.e(purchaseType) ? "会员协议(含自动续费条款)" : "会员及自动续费协议";
        String str2 = String.format(Locale.getDefault(), "自动订阅,随时取消,同意%1$s最高享%2$s", str, String.format(Locale.getDefault(), "%d倍加速曝光", Integer.valueOf(sab0.w(purchaseType) ? 3 : 9)));
        SpannableStringBuilder spannableStringBuilderM16129b0 = i0g0.m16129b0(str2, vwb.f0(new String[]{str}), m24155Q(z), eqh0.c(t4b.e(purchaseType) ? 2 : 3));
        int iIndexOf = str2.indexOf(str);
        spannableStringBuilderM16129b0.setSpan(new c95(f22068b).b(m24155Q(z)).c(CoreModule.b.getString(R$string.f5908D6)).d(true), iIndexOf, str.length() + iIndexOf, 18);
        return spannableStringBuilderM16129b0;
    }

    /* JADX INFO: renamed from: y */
    public static CharSequence m24187y(String str, String str2) {
        String str3 = String.format(Locale.getDefault(), "同意%1s,7天后以%2$s%3$s/月订阅,可随时取消", "会员及自动续费协议", str, str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        int iIndexOf = str3.indexOf("会员及自动续费协议");
        spannableStringBuilder.setSpan(new c95(f22068b).b(Color.parseColor("#4c000000")).c(CoreModule.b.getString(R$string.f5908D6)).a(false).d(false), iIndexOf, iIndexOf + 9, 18);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z */
    public static CharSequence m24188z(Merchandise merchandise) {
        return m24139A(merchandise, -1);
    }
}
