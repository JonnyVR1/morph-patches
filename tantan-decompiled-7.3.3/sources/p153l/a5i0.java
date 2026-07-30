package p153l;

import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.CoinGuideView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.Locale;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class a5i0 {

    /* JADX INFO: renamed from: x */
    public static a5i0 f68586x;

    /* JADX INFO: renamed from: a */
    public final jxd0 f68587a;

    /* JADX INFO: renamed from: b */
    public final jxd0 f68588b;

    /* JADX INFO: renamed from: c */
    public final jxd0 f68589c;

    /* JADX INFO: renamed from: d */
    public final jxd0 f68590d;

    /* JADX INFO: renamed from: e */
    public final jxd0 f68591e;

    /* JADX INFO: renamed from: f */
    public final jxd0 f68592f;

    /* JADX INFO: renamed from: g */
    public final jxd0 f68593g;

    /* JADX INFO: renamed from: h */
    public final jxd0 f68594h;

    /* JADX INFO: renamed from: i */
    public final jxd0 f68595i;

    /* JADX INFO: renamed from: j */
    public final jxd0 f68596j;

    /* JADX INFO: renamed from: k */
    public final jxd0 f68597k;

    /* JADX INFO: renamed from: l */
    public final jxd0 f68598l;

    /* JADX INFO: renamed from: m */
    public final jxd0 f68599m;

    /* JADX INFO: renamed from: n */
    public final jxd0 f68600n;

    /* JADX INFO: renamed from: o */
    public final jxd0 f68601o;

    /* JADX INFO: renamed from: p */
    public final jxd0 f68602p;

    /* JADX INFO: renamed from: q */
    public final wyd0 f68603q;

    /* JADX INFO: renamed from: r */
    public final wyd0 f68604r;

    /* JADX INFO: renamed from: s */
    public final jxd0 f68605s;

    /* JADX INFO: renamed from: t */
    public final jxd0 f68606t;

    /* JADX INFO: renamed from: u */
    public final jxd0 f68607u;

    /* JADX INFO: renamed from: v */
    public final jxd0 f68608v;

    /* JADX INFO: renamed from: w */
    public final jxd0 f68609w;

    /* JADX INFO: renamed from: l.a5i0$a */
    public class C15655a extends TypeToken<LinkedList<String>> {
        public C15655a() {
        }
    }

    /* JADX INFO: renamed from: l.a5i0$b */
    public class C15656b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f68611a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f68612b;

        public C15656b(Act act, String str) {
            this.f68611a = act;
            this.f68612b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = this.f68611a;
            act.startActivity(WebViewAct.m81347a2(act, act.string(R$string.f28341j8), this.f68612b));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public a5i0() {
        String str = "tantan_coin_boost_guide_confirm_dialog_shown_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f68587a = new jxd0(str, bool);
        String str2 = "tantan_coin_boost_guide_confirm_checkbox_state_" + CoreModule.m30929H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f68588b = new jxd0(str2, bool2);
        this.f68589c = new jxd0("tantan_coin_super_like_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68590d = new jxd0("tantan_coin_super_like_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68591e = new jxd0("tantan_coin_quick_chat_number_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68592f = new jxd0("tantan_coin_quick_chat_number_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68593g = new jxd0("tantan_coin_letter_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68594h = new jxd0("tantan_coin_letter_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68595i = new jxd0("tantan_coin_intl_letter_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68596j = new jxd0("tantan_coin_letter_intl_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68597k = new jxd0("tantan_coin_voice_quick_chat_number_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68598l = new jxd0("tantan_coin_voice_quick_chat_number_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68599m = new jxd0("tantan_coin_voice_profile_like_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68600n = new jxd0("tantan_coin_profile_like_guide_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68601o = new jxd0("tantan_coin_instant_chat_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68602p = new jxd0("tantan_coin_instant_chat_guide_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68603q = new wyd0("coin_pay_type_history_" + uqb0.f180396b0.f170324a.userId(), "");
        this.f68604r = new wyd0("last_pay_item_id_" + uqb0.f180396b0.f170324a.userId(), "");
        this.f68605s = new jxd0("tantan_coin_see_letter_config_" + CoreModule.m30929H().userId(), bool);
        this.f68606t = new jxd0("tantan_coin_say_hi_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68607u = new jxd0("tantan_coin_say_hi_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
        this.f68608v = new jxd0("tantan_coin_pre_confession_confirm_dialog_shown_" + CoreModule.m30929H().userId(), bool);
        this.f68609w = new jxd0("tantan_coin_pre_confession_confirm_checkbox_state_" + CoreModule.m30929H().userId(), bool2);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m96081A() {
        return m96083B() && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) CoreModule.f18264c.f20312H0.m155450l4());
    }

    /* JADX INFO: renamed from: A1 */
    public static void m96082A1(Act act, String str, final x20 x20Var) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(0).m125278g(new a30() { // from class: l.y4i0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    a5i0.m96148l(x20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m125283l();
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m96083B() {
        return CoreModule.f18264c.f20312H0.m155450l4() > 0;
    }

    /* JADX INFO: renamed from: B0 */
    public static void m96084B0(Act act, PayMethod payMethod, PurchaseType purchaseType, peb0 peb0Var) {
        if (TEnum.equals(payMethod, "alipay")) {
            xl60.m211513y(act, payMethod, purchaseType, peb0Var);
            return;
        }
        if (TEnum.equals(payMethod, "wechat")) {
            if (xl60.m211511p()) {
                xl60.m211513y(act, payMethod, purchaseType, peb0Var);
                return;
            }
            i4g0.m138495D("e_purchase_order_response", "p_purchase_page", jyb.m147494Y("skuID", ""), jyb.m147494Y("platform", "wechat"), jyb.m147494Y("code", 202001), jyb.m147494Y("order_id", ""), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", "wx not install"));
            lib0.Companion companion = lib0.INSTANCE;
            PurchasePaymentParam purchasePaymentParam = peb0Var.f151885a;
            companion.m154355g(purchasePaymentParam.purchaseTrackId, purchasePaymentParam.itemId, "wx not install");
        }
    }

    /* JADX INFO: renamed from: B1 */
    public static void m96085B1(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2) {
        if (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA == purchaseType) {
            CoreModule.m30933P().m143405a().mo34348J7(act, purchaseType, x20Var, x20Var2);
            return;
        }
        if (PurchaseType.TYPE_GET_VIP_SUPERLIKE == purchaseType) {
            CoreModule.m30933P().m143405a().mo34416T9(act, purchaseType, x20Var, x20Var2, 1);
            return;
        }
        if (PurchaseType.TYPE_GET_LETTER == purchaseType) {
            CoreModule.m30933P().m143405a().mo34506fr(act, x20Var, x20Var2);
            return;
        }
        if (PurchaseType.TYPE_INTL_READ_MESSAGE == purchaseType) {
            m96089D1(act, purchaseType, x20Var, x20Var2);
        } else if (PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA == purchaseType) {
            CoreModule.m30933P().m143405a().mo34493ea(act, purchaseType, x20Var, x20Var2);
        } else {
            m96087C1(act, purchaseType, x20Var, x20Var2, 1);
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m96086C() {
        return m96177w() && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) CoreModule.f18264c.f20312H0.m155452m4());
    }

    /* JADX INFO: renamed from: C1 */
    public static void m96087C1(Act act, final PurchaseType purchaseType, final x20 x20Var, final x20 x20Var2, int i) {
        final boolean[] zArr = {true};
        final l4g0 l4g0VarM96112N1 = m96112N1(purchaseType);
        w1e.m204402f(l4g0VarM96112N1);
        Dialog dialogM21566z = act.dialog().m21558v().m21516M(rec0.f162472N2).m21563x0(act.drawable(jbc0.f119210Eb)).m21555t0(R$string.f28177V7, new Runnable() { // from class: l.r4i0
            @Override // java.lang.Runnable
            public final void run() {
                a5i0.m96134e(purchaseType, zArr, x20Var);
            }
        }).m21541l0(R$string.f28224a, new Runnable() { // from class: l.s4i0
            @Override // java.lang.Runnable
            public final void run() {
                a5i0.m96165r(zArr, x20Var2);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.t4i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a5i0.m96156o(l4g0VarM96112N1, zArr, x20Var2, dialogInterface);
            }
        }).m21566z();
        CoinGuideView coinGuideView = (CoinGuideView) dialogM21566z.m21457P();
        if (i > 0) {
            coinGuideView.setPayCount(i);
        }
        coinGuideView.m54278j(purchaseType);
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m96088D() {
        return m96090E() && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) CoreModule.f18264c.f20312H0.m155476y4());
    }

    /* JADX INFO: renamed from: D1 */
    public static void m96089D1(Act act, PurchaseType purchaseType, final x20 x20Var, x20 x20Var2) {
        final l4g0 l4g0Var = new l4g0("p_purchase_read_receipt_confirm_popup", Dialog.class.getName());
        int iM155408B4 = CoreModule.f18264c.f20312H0.m155408B4();
        View viewInflate = act.inflater().inflate(rec0.f162450I0, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(fdc0.f98440t);
        VText vText = (VText) viewInflate.findViewById(fdc0.f98385Z0);
        VText vText2 = (VText) viewInflate.findViewById(fdc0.f98367Q0);
        VButton vButton = (VButton) viewInflate.findViewById(fdc0.f98442u);
        vText.setTypeface(lyh0.m156283c(3), 1);
        vText2.setText(z7a.m218868b0(act.getString(R$string.f27958B8, iM155408B4 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), jyb.m147507f0(String.valueOf(iM155408B4)), act.getResources().getColor(h9c0.f108379l), lyh0.m156283c(2)));
        final jl80 jl80VarM146049r0 = act.newDialog().m146023R(viewInflate).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.v4i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a5i0.m96140h(l4g0Var, dialogInterface);
            }
        }).m146049r0();
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.w4i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a5i0.m96138g(jl80VarM146049r0, x20Var, view);
            }
        });
        bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.x4i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jl80VarM146049r0.dismiss();
            }
        });
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m96090E() {
        return CoreModule.f18264c.f20312H0.m155476y4() > 0;
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m96091E0() {
        return CoreModule.m30933P().m143405a().mo34471b3() <= 0;
    }

    /* JADX INFO: renamed from: E1 */
    public static boolean m96092E1(Act act, final x20 x20Var) {
        if (joa.m146355E3() || !m96096G() || !m96160p0().m96216e1()) {
            return false;
        }
        m96085B1(act, PurchaseType.TYPE_GET_LETTER, new x20() { // from class: l.z4i0
            @Override // p153l.x20
            public final void call() {
                a5i0.m96130c(x20Var);
            }
        }, null);
        return true;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m96093F() {
        int iM155406A4 = CoreModule.f18264c.f20312H0.m155406A4();
        return iM155406A4 > 0 && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) iM155406A4);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m96094F0() {
        f68586x = null;
    }

    /* JADX INFO: renamed from: F1 */
    public static void m96095F1(Act act, String str) {
        new fe5.C16962e(act).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125274c(15).m125275d(str).m125283l();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m96096G() {
        return m96099H() && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) CoreModule.f18264c.f20312H0.m155434X4());
    }

    /* JADX INFO: renamed from: G0 */
    public static void m96097G0(Act act, TextView textView) {
        String language;
        Locale locale = act.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            language = locale.getLanguage();
        } else {
            language = locale.getLanguage() + "-" + locale.getCountry();
        }
        String strString = act.string(R$string.f28329i8);
        String str = act.getString(R$string.f28188W7) + strString;
        String string = Uri.parse(xi5.m211113o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", language).appendQueryParameter("country", IntlCountryCodeController.m29107d(uqb0.f180400f0)).toString();
        int iIndexOf = str.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(act.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C15656b(act, string), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: G1 */
    public static boolean m96098G1(Act act, final x20 x20Var) {
        if (!m96108L1() || !m96105J1() || !m96160p0().m96221j1()) {
            return false;
        }
        m96085B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new x20() { // from class: l.g4i0
            @Override // p153l.x20
            public final void call() {
                a5i0.m96150m(x20Var);
            }
        }, null);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m96099H() {
        return CoreModule.f18264c.f20312H0.m155434X4() > 0;
    }

    /* JADX INFO: renamed from: H0 */
    public static void m96100H0() {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (!NullChecker.m82486a(counterM32487o3) || !NullChecker.m82486a(counterM32487o3.superLikeLimit)) {
            CrashHelper.m82479c(new Exception("superLikeNumError num = 0 counter or superLikeLimit =null"));
        } else {
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3.superLikeLimit;
            CrashHelper.m82479c(new Exception(String.format("superLikeNumError num = 0 remaining=%s count=%s limit=%s", Integer.valueOf(counterSuperlikeAndUndoLimit.remaining), Integer.valueOf(counterSuperlikeAndUndoLimit.count), Integer.valueOf(counterSuperlikeAndUndoLimit.limit))));
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static void m96101H1(Act act, long j, int i, final x20 x20Var, final x20 x20Var2) {
        if (j <= 0 || i <= 0) {
            return;
        }
        View viewInflate = act.inflater().inflate(rec0.f162592p2, (ViewGroup) null);
        final jl80 jl80VarM146020O = act.newDialog().m146023R(viewInflate).m146020O();
        TextView textView = (TextView) viewInflate.findViewById(fdc0.f98385Z0);
        TextView textView2 = (TextView) viewInflate.findViewById(fdc0.f98434q);
        TextView textView3 = (TextView) viewInflate.findViewById(fdc0.f98444v);
        m96097G0(act, (TextView) viewInflate.findViewById(fdc0.f98417k0));
        String string = act.getString(R$string.f28202Y, Long.valueOf(j));
        String str = (((long) i) * j) + act.getString(R$string.f28293f8);
        textView.setText(z7a.m218868b0(act.getString(R$string.f28221Z7, string, str), jyb.m147507f0(string, str), act.getResources().getColor(h9c0.f108379l), lyh0.m156283c(2)));
        bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.h4i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a5i0.m96159p(x20Var2, jl80VarM146020O, view);
            }
        });
        bnl0.m105509E0(textView3, new View.OnClickListener() { // from class: l.i4i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a5i0.m96146k(jl80VarM146020O, x20Var, view);
            }
        });
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m96102I() {
        return m96104J() && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) CoreModule.f18264c.f20312H0.m155438b5());
    }

    /* JADX INFO: renamed from: I1 */
    public static boolean m96103I1() {
        return m27.m156743E3() > 0;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m96104J() {
        return CoreModule.f18264c.f20312H0.m155438b5() > 0;
    }

    /* JADX INFO: renamed from: J1 */
    public static boolean m96105J1() {
        return CoreModule.m30930K().mo31838xf() ? m96118S() : m96111N();
    }

    /* JADX INFO: renamed from: K */
    public static boolean m96106K() {
        return m96107L() && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) CoreModule.f18264c.f20312H0.m155442f5());
    }

    /* JADX INFO: renamed from: L */
    public static boolean m96107L() {
        return !CoreModule.f18273l.m143405a().mo34557o6() && CoreModule.f18264c.f20312H0.m155442f5() > 0;
    }

    /* JADX INFO: renamed from: L1 */
    public static boolean m96108L1() {
        return !gta.m132210e().m132214d().mo34885m3() && m96175v0() <= 0;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m96109M() {
        return CoreModule.f18264c.f20312H0.m155467t5() > 0;
    }

    /* JADX INFO: renamed from: M1 */
    public static void m96110M1(PurchaseType purchaseType) {
        boolean zM96227y0;
        if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            zM96227y0 = m96160p0().m96226u();
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            zM96227y0 = m96160p0().m96193K1();
        } else if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA) {
            zM96227y0 = m96160p0().m96189D0();
        } else if (purchaseType == PurchaseType.TYPE_SAY_HI_PKG) {
            zM96227y0 = m96160p0().m96219h1();
        } else {
            zM96227y0 = wib0.m206565i(purchaseType) ? m96160p0().m96227y0() : false;
        }
        i4g0.m138523u("e_coin_usage_confirm_button", "p_alert_coin_usage_confirm", jyb.m147494Y("is_shown_next_time", Boolean.valueOf(!zM96227y0)));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m96111N() {
        return m96113O() && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) CoreModule.f18264c.f20312H0.m155479z5());
    }

    /* JADX INFO: renamed from: N1 */
    public static l4g0 m96112N1(PurchaseType purchaseType) {
        String str = "boost_button";
        String str2 = "swipe_page";
        String str3 = "boost";
        if (purchaseType != PurchaseType.TYPE_GET_BOOST) {
            if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
                str3 = "superlike";
                str = "superlike_button";
            } else if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA) {
                str3 = "quickchatNumber";
                str2 = "message_list_page";
                str = "quickchat_button";
            } else if (purchaseType == PurchaseType.TYPE_SPOTLIGHT) {
                str2 = "p_purchase_spotlight_confirm_popup";
            } else if (wib0.m206565i(purchaseType)) {
                str3 = "diamondSayhiNumber";
                str2 = OMSDialogPositon.p_suggest_user_profile_info_view;
                str = "instant_chat_button";
            } else {
                str = "";
                str2 = "";
                str3 = str2;
            }
        }
        l4g0 l4g0Var = new l4g0("p_alert_coin_usage_confirm", Dialog.class.getName());
        l4g0Var.m152781p(jyb.m147494Y("exchange_type", str3), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_basic"), jyb.m147494Y("tooltips_trigger_mode", Active.TYPE), jyb.m147494Y("tooltips_trigger_page", str2), jyb.m147494Y("tooltips_trigger_module", str), jyb.m147494Y("tooltips_trigger_reason", "click"));
        return l4g0Var;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m96113O() {
        return (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG) || !joa.m146386f4() || gta.m132210e().m132214d().mo34745Qi()) && CoreModule.f18264c.f20312H0.m155479z5() > 0;
    }

    /* JADX INFO: renamed from: O1 */
    public static void m96114O1(int i, boolean z) {
        i4g0.m138523u("e_wallet_function_button", OMSDialogPositon.p_wallet, jyb.m147494Y("exchange_type", m96154n0(i)), jyb.m147494Y("is_privileged", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m96115P() {
        return CoreModule.m30930K().mo31838xf() ? m96117R() : m96086C();
    }

    /* JADX INFO: renamed from: P1 */
    public static void m96116P1(int i, boolean z) {
        i4g0.m138492A("e_wallet_function_button", OMSDialogPositon.p_wallet, jyb.m147494Y("exchange_type", m96154n0(i)), jyb.m147494Y("is_privileged", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: R */
    public static boolean m96117R() {
        return m96177w() && CoreModule.f18264c.f20315I0.m144054K3() >= ((long) CoreModule.f18264c.f20315I0.m144065s3());
    }

    /* JADX INFO: renamed from: S */
    public static boolean m96118S() {
        return m96119T() && CoreModule.f18264c.f20315I0.m144054K3() >= ((long) CoreModule.f18264c.f20315I0.m144064U3());
    }

    /* JADX INFO: renamed from: T */
    public static boolean m96119T() {
        return (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG) || !joa.m146386f4() || gta.m132210e().m132214d().mo34745Qi()) && CoreModule.f18264c.f20315I0.m144064U3() > 0;
    }

    /* JADX INFO: renamed from: U */
    public static String m96120U(long j) {
        return a9g0.m96566a(j, 99999999L);
    }

    /* JADX INFO: renamed from: V */
    public static int m96121V() {
        return CoreModule.f18273l.m143405a().mo34378Nf();
    }

    /* JADX INFO: renamed from: W */
    public static int m96122W() {
        return m96121V() + (CoreModule.m30930K().mo31838xf() ? m96139g0() : m96124Y());
    }

    /* JADX INFO: renamed from: X */
    public static int m96123X() {
        return m96121V() + (CoreModule.m30930K().mo31838xf() ? m96141h0() : m96125Z());
    }

    /* JADX INFO: renamed from: Y */
    public static int m96124Y() {
        if (m96177w()) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155452m4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: Z */
    public static int m96125Z() {
        if (CoreModule.f18264c.f20312H0.m155468u4() > 0) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155468u4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m96126a(LinkedList linkedList, String str) {
        String str2;
        if (TextUtils.equals(str, String.valueOf(1))) {
            str2 = "alipay";
        } else if (TextUtils.equals(str, String.valueOf(3))) {
            str2 = "wechat";
        } else {
            str2 = (!TextUtils.equals(str, String.valueOf(0)) && TextUtils.equals(str, String.valueOf(2))) ? PayMethod.huabei : "default";
        }
        linkedList.add(str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static int m96127a0() {
        if (CoreModule.f18264c.f20312H0.m155436Z4() > 0) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155436Z4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m96128b(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m96129b0() {
        if (m96081A()) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155450l4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m96130c(x20 x20Var) {
        m96160p0().m96206U0();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static int m96131c0() {
        if (m96107L()) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155442f5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m96132d(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: d0 */
    public static int m96133d0() {
        if (m96103I1()) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155477y5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m96134e(PurchaseType purchaseType, boolean[] zArr, x20 x20Var) {
        m96110M1(purchaseType);
        zArr[0] = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: e0 */
    public static int m96135e0() {
        if (m96113O()) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155479z5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m96136f(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static int m96137f0() {
        return CoreModule.m30930K().mo31838xf() ? m96145j0() : m96133d0();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m96138g(jl80 jl80Var, x20 x20Var, View view) {
        jl80Var.dismiss();
        sfj0.m185596c("e_purchase_read_receipt_confirm_popup_confirm", "p_purchase_read_receipt_confirm_popup", new sfj0.C20032a[0]);
        x20Var.call();
    }

    /* JADX INFO: renamed from: g0 */
    public static int m96139g0() {
        if (m96117R()) {
            return (int) (CoreModule.f18264c.f20315I0.m144054K3() / ((long) CoreModule.f18264c.f20315I0.m144065s3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m96140h(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        sfj0.m185596c("e_purchase_read_receipt_confirm_popup_cancel", "p_purchase_read_receipt_confirm_popup", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: h0 */
    public static int m96141h0() {
        if (CoreModule.f18264c.f20315I0.m144072z3() > 0) {
            return (int) (CoreModule.f18264c.f20315I0.m144054K3() / ((long) CoreModule.f18264c.f20315I0.m144072z3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m96142i(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(purchaseType.toString());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static int m96143i0() {
        if (CoreModule.f18264c.f20315I0.m144055L3() > 0) {
            return (int) (CoreModule.f18264c.f20315I0.m144054K3() / ((long) CoreModule.f18264c.f20315I0.m144055L3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m96145j0() {
        if (m96103I1()) {
            return (int) (CoreModule.f18264c.f20315I0.m144054K3() / ((long) CoreModule.f18264c.f20315I0.m144063T3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m96146k(jl80 jl80Var, x20 x20Var, View view) {
        if (jl80Var == null || x20Var == null) {
            return;
        }
        x20Var.call();
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public static int m96147k0() {
        if (m96118S()) {
            return (int) (CoreModule.f18264c.f20315I0.m144054K3() / ((long) CoreModule.f18264c.f20315I0.m144064U3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m96148l(x20 x20Var, PurchaseType purchaseType, Act act, String str) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static int m96149l0() {
        return CoreModule.m30930K().mo31838xf() ? m96143i0() : m96127a0();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m96150m(x20 x20Var) {
        m96160p0().m96210Y0();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static int m96151m0() {
        if (m96109M()) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155467t5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public static void m96152m1(Act act, String str, final y20<PurchaseType> y20Var) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
            return;
        }
        int i = (CoreModule.m30933P().m143405a().mo34636z7() && NullChecker.m82486a(y20Var)) ? 14 : 1;
        if ("p_messages_view,e_messages_spotlight,click".equals(str)) {
            i = 22;
        }
        new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(i).m125278g(new a30() { // from class: l.p4i0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                a5i0.m96128b(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m125283l();
    }

    /* JADX INFO: renamed from: n0 */
    public static String m96154n0(int i) {
        if (i == 1) {
            return "boost";
        }
        if (i == 2) {
            return "superLike";
        }
        if (i == 3) {
            return "quickchatNumber";
        }
        if (i == 6) {
            return "letter";
        }
        if (i == 17) {
            return "knowmyself";
        }
        if (i == 22) {
            return "spotlight";
        }
        if (i == 8 || i == 9) {
            return "gift";
        }
        switch (i) {
            case 12:
                return "intlReadMessage";
            case 13:
                return "quickchatNumber";
            case 14:
                return "boost";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: n1 */
    public static void m96155n1(Act act, String str, int i, final y20<PurchaseType> y20Var) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(i).m125278g(new a30() { // from class: l.j4i0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    a5i0.m96136f(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m125283l();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m96156o(l4g0 l4g0Var, boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        if (zArr[0] && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static String m96157o0(int i) {
        String strM96154n0;
        if (i == 8 || i == 9) {
            strM96154n0 = "giftVas";
        } else {
            strM96154n0 = i == 12 ? "read_receipt" : m96154n0(i);
        }
        return TextUtils.isEmpty(strM96154n0) ? "other" : strM96154n0;
    }

    /* JADX INFO: renamed from: o1 */
    public static void m96158o1(Act act, String str, long j) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(8).m125276e(j).m125283l();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m96159p(x20 x20Var, jl80 jl80Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
        if (jl80Var != null) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static a5i0 m96160p0() {
        if (f68586x == null) {
            synchronized (a5i0.class) {
                try {
                    if (f68586x == null) {
                        f68586x = new a5i0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f68586x;
    }

    /* JADX INFO: renamed from: p1 */
    public static void m96161p1(Act act, String str) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(9).m125283l();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m96162q(final Act act) {
        act.progress(R$string.f28149T1);
        lqb lqbVar = CoreModule.f18264c.f20312H0;
        act.duringCreated(lqbVar.m155475x5(lqbVar.m155464s4(SummarizedPrivilegesId.get("intlReadMessage")), SummarizedPrivilegesId.get("intlReadMessage"), "coin", CoreModule.f18264c.f20312H0.m155408B4())).subscribe(psd0.m173597H(new y20() { // from class: l.m4i0
            @Override // p153l.y20
            public final void call(Object obj) {
                a5i0.m96167s(act, (Boolean) obj);
            }
        }, new y20() { // from class: l.n4i0
            @Override // p153l.y20
            public final void call(Object obj) {
                a5i0.m96132d(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static int m96163q0() {
        if (CoreModule.f18264c.f20312H0.m155408B4() > 0) {
            return (int) (CoreModule.f18264c.f20312H0.m155435Y4() / ((long) CoreModule.f18264c.f20312H0.m155408B4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: q1 */
    public static void m96164q1(Act act, String str, int i) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125275d(str).m125273b(i).m125274c(26).m125283l();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m96165r(boolean[] zArr, x20 x20Var) {
        zArr[0] = true;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static void m96166r1(Act act, String str, int i) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125279h(i).m125274c(12).m125283l();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m96167s(Act act, Boolean bool) {
        act.progressDismiss();
        if (bool.booleanValue()) {
            CoreModule.f18264c.f20297C0.m146425v4();
            o1j0.m165634h(R$string.f28268d7);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static int m96168s0() {
        return CoreModule.m30933P().m143405a().mo34471b3() + m96131c0();
    }

    /* JADX INFO: renamed from: s1 */
    public static void m96169s1(Act act, String str) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(6).m125283l();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m96170t(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(purchaseType.toString());
        }
    }

    /* JADX INFO: renamed from: t1 */
    public static void m96171t1(Act act, String str, final y20<String> y20Var) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(33).m125278g(new a30() { // from class: l.q4i0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    a5i0.m96142i(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m125283l();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static int m96172u0() {
        return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144064U3() : CoreModule.f18264c.f20312H0.m155479z5();
    }

    @Nullable
    /* JADX INFO: renamed from: u1 */
    public static fe5 m96173u1(Act act, String str, a30<PurchaseType, Act, String> a30Var, x20 x20Var) {
        if (!IntlCountryCodeController.m29114k()) {
            return new fe5.C16962e(act).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125275d(str).m125274c(3).m125277f(x20Var).m125278g(a30Var).m125283l();
        }
        otp0.m169162c(act, act.pageId());
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m96174v() {
        return CoreModule.m30933P().m143405a().mo34589s8();
    }

    /* JADX INFO: renamed from: v0 */
    public static int m96175v0() {
        if (NullChecker.m82486a(CoreModule.f18264c.m32487o3())) {
            return CoreModule.f18264c.m32487o3().superLikeLimit.remainToday();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v1 */
    public static void m96176v1(Act act, String str, final y20<String> y20Var) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
        } else {
            new fe5.C16962e(act).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125275d(str).m125274c(31).m125278g(new a30() { // from class: l.k4i0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    a5i0.m96170t(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m125283l();
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m96177w() {
        return m27.m156763z3() > 0;
    }

    /* JADX INFO: renamed from: w0 */
    public static int m96178w0(int i) {
        if (!CoreModule.m30933P().m143405a().mo34545m3()) {
            return (CoreModule.m30930K().mo31838xf() ? m96147k0() : m96135e0()) + i;
        }
        if (i != 0) {
            return 200000;
        }
        m96100H0();
        return 200000;
    }

    /* JADX INFO: renamed from: w1 */
    public static void m96179w1(Act act, String str) {
        m96182x1(act, str, null);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m96180x(Privilege privilege) {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (Privilege.vip_super_like == privilege) {
            return CoreModule.f18264c.f20381e0.m116600p9().isVIP() || (counterM32487o3 != null && counterM32487o3.superLikeLimit.remaining > 0);
        }
        if (Privilege.online_match_tickets_extra == privilege) {
            return CoreModule.m30933P().m143405a().mo34471b3() > 0 || CoreModule.m30933P().m143405a().mo34637z9() || CoreModule.f18264c.f20381e0.m116600p9().isFemale();
        }
        if (Privilege.boost == privilege) {
            return true;
        }
        if (Privilege.accelerate_pairing == privilege || Privilege.see_greet_gp == privilege || Privilege.letter == privilege || Privilege.vip_letter_gp == privilege) {
            return false;
        }
        if (Privilege.see_letter_gp == privilege) {
            return CoreModule.m30933P().m143405a().mo34381No() && rbb0.m180736i() > 0;
        }
        if (Privilege.intl_message_read == privilege) {
            return CoreModule.m30933P().m143405a().mo34355Kf();
        }
        if (Privilege.immediately_match == privilege) {
            return CoreModule.f18276o.m132214d().mo34769Vd() && CoreModule.f18276o.m132214d().mo34803aq();
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m96181x0() {
        return m96175v0() + (CoreModule.m30930K().mo31838xf() ? m96147k0() : m96135e0());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m96182x1(Act act, String str, a30<PurchaseType, Act, String> a30Var) {
        if (IntlCountryCodeController.m29114k()) {
            otp0.m169162c(act, act.pageId());
            return;
        }
        fe5.C16962e c16962eM125274c = new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(2);
        if (NullChecker.m82486a(a30Var)) {
            c16962eM125274c.m125278g(a30Var);
        }
        c16962eM125274c.m125283l();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m96183y() {
        return CoreModule.m30933P().m143405a().mo34589s8() && m96115P();
    }

    /* JADX INFO: renamed from: y1 */
    public static void m96184y1(Act act, String str, int i, a30<PurchaseType, Act, String> a30Var, x20 x20Var) {
        new fe5.C16962e(act).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125275d(str).m125274c(25).m125278g(a30Var).m125277f(x20Var).m125282k(i).m125283l();
    }

    /* JADX INFO: renamed from: z */
    public static void m96185z(final Act act, String str) {
        if (m96163q0() <= 0) {
            m96166r1(act, str, CoreModule.f18264c.f20312H0.m155408B4());
        } else {
            m96085B1(act, PurchaseType.TYPE_INTL_READ_MESSAGE, new x20() { // from class: l.l4i0
                @Override // p153l.x20
                public final void call() {
                    a5i0.m96162q(act);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static void m96186z1(Act act, String str, a30<PurchaseType, Act, String> a30Var, x20 x20Var) {
        new fe5.C16962e(act).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125275d(str).m125274c(13).m125277f(x20Var).m125278g(a30Var).m125283l();
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m96187A0() {
        return this.f68594h.get().booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m96188C0() {
        return this.f68609w.get().booleanValue();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m96189D0() {
        return this.f68592f.get().booleanValue();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m96190I0() {
        return this.f68607u.get().booleanValue();
    }

    /* JADX INFO: renamed from: J0 */
    public void m96191J0(boolean z) {
        this.f68588b.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K0 */
    public void m96192K0(boolean z) {
        this.f68602p.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K1 */
    public boolean m96193K1() {
        return this.f68590d.get().booleanValue();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m96194L0(boolean z) {
        return this.f68596j.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: M0 */
    public void m96195M0(String str) {
        this.f68604r.put(str);
    }

    /* JADX INFO: renamed from: N0 */
    public void m96196N0(PayMethod payMethod) {
        LinkedList<String> linkedListM96224r0 = m96224r0();
        if (linkedListM96224r0.contains(String.valueOf(1)) || linkedListM96224r0.contains(String.valueOf(3))) {
            final LinkedList<String> linkedList = new LinkedList<>();
            jyb.m147537z(linkedListM96224r0, new y20() { // from class: l.u4i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    a5i0.m96126a(linkedList, (String) obj);
                }
            });
            linkedListM96224r0 = linkedList;
        }
        if (linkedListM96224r0.size() >= 3) {
            linkedListM96224r0.removeLast();
        }
        linkedListM96224r0.addFirst(payMethod.toString());
        this.f68603q.put(new Gson().toJson(linkedListM96224r0));
    }

    /* JADX INFO: renamed from: O0 */
    public void m96197O0(boolean z) {
        this.f68594h.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: P0 */
    public void m96198P0(boolean z) {
        this.f68609w.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q */
    public void m96199Q() {
        this.f68602p.put(Boolean.TRUE);
        this.f68601o.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m96200Q0(boolean z) {
        this.f68592f.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q1 */
    public void m96201Q1(boolean z) {
        this.f68605s.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R0 */
    public void m96202R0(boolean z) {
        this.f68607u.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m96203R1() {
        return this.f68598l.get().booleanValue();
    }

    /* JADX INFO: renamed from: S0 */
    public void m96204S0() {
        if (this.f68588b.get().booleanValue()) {
            this.f68587a.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m96205T0() {
        if (this.f68602p.get().booleanValue()) {
            this.f68601o.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m96206U0() {
        if (this.f68594h.get().booleanValue()) {
            this.f68593g.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m96207V0() {
        if (this.f68609w.get().booleanValue()) {
            this.f68608v.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m96208W0() {
        if (this.f68592f.get().booleanValue()) {
            this.f68591e.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m96209X0() {
        if (this.f68607u.get().booleanValue()) {
            this.f68606t.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m96210Y0() {
        if (this.f68590d.get().booleanValue()) {
            this.f68589c.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m96211Z0() {
        if (this.f68598l.get().booleanValue()) {
            this.f68597k.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m96212a1(boolean z) {
        this.f68590d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: b1 */
    public void m96213b1(boolean z) {
        this.f68598l.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m96214c1() {
        return (this.f68587a.get().booleanValue() && this.f68588b.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m96215d1() {
        return (this.f68601o.get().booleanValue() && this.f68602p.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m96216e1() {
        return (this.f68593g.get().booleanValue() && this.f68594h.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m96217f1() {
        return (this.f68608v.get().booleanValue() && this.f68609w.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m96218g1() {
        return (this.f68591e.get().booleanValue() && this.f68592f.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m96219h1() {
        return (this.f68606t.get().booleanValue() && this.f68607u.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m96220i1() {
        return !this.f68605s.get().booleanValue();
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m96221j1() {
        return (this.f68589c.get().booleanValue() && this.f68590d.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m96222k1() {
        return (this.f68597k.get().booleanValue() && this.f68598l.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m96223l1() {
        if (CoreModule.f18264c.f20340Q1.f20859R.m35762M()) {
            return false;
        }
        LinkedList<String> linkedListM96224r0 = m96224r0();
        if (linkedListM96224r0.size() == 3) {
            return !jyb.m147536y(linkedListM96224r0, new qcj() { // from class: l.o4i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, "wechat"));
                }
            });
        }
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final LinkedList<String> m96224r0() {
        LinkedList<String> linkedList = new LinkedList<>();
        String str = this.f68603q.get();
        return str.isEmpty() ? linkedList : (LinkedList) new Gson().fromJson(str, new C15655a().getType());
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m96225t0() {
        return this.f68605s.get().booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public boolean m96226u() {
        return this.f68588b.get().booleanValue();
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m96227y0() {
        return this.f68602p.get().booleanValue();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m96228z0() {
        return this.f68596j.get().booleanValue();
    }
}
