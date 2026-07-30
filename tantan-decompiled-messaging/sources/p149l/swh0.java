package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.CoinGuideView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.Locale;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class swh0 {

    /* JADX INFO: renamed from: x */
    public static swh0 f166669x;

    /* JADX INFO: renamed from: a */
    public final hpd0 f166670a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f166671b;

    /* JADX INFO: renamed from: c */
    public final hpd0 f166672c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f166673d;

    /* JADX INFO: renamed from: e */
    public final hpd0 f166674e;

    /* JADX INFO: renamed from: f */
    public final hpd0 f166675f;

    /* JADX INFO: renamed from: g */
    public final hpd0 f166676g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f166677h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f166678i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f166679j;

    /* JADX INFO: renamed from: k */
    public final hpd0 f166680k;

    /* JADX INFO: renamed from: l */
    public final hpd0 f166681l;

    /* JADX INFO: renamed from: m */
    public final hpd0 f166682m;

    /* JADX INFO: renamed from: n */
    public final hpd0 f166683n;

    /* JADX INFO: renamed from: o */
    public final hpd0 f166684o;

    /* JADX INFO: renamed from: p */
    public final hpd0 f166685p;

    /* JADX INFO: renamed from: q */
    public final uqd0 f166686q;

    /* JADX INFO: renamed from: r */
    public final uqd0 f166687r;

    /* JADX INFO: renamed from: s */
    public final hpd0 f166688s;

    /* JADX INFO: renamed from: t */
    public final hpd0 f166689t;

    /* JADX INFO: renamed from: u */
    public final hpd0 f166690u;

    /* JADX INFO: renamed from: v */
    public final hpd0 f166691v;

    /* JADX INFO: renamed from: w */
    public final hpd0 f166692w;

    /* JADX INFO: renamed from: l.swh0$a */
    public class C20051a extends TypeToken<LinkedList<String>> {
        public C20051a() {
        }
    }

    /* JADX INFO: renamed from: l.swh0$b */
    public class C20052b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f166694a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f166695b;

        public C20052b(Act act, String str) {
            this.f166694a = act;
            this.f166695b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = this.f166694a;
            act.startActivity(WebViewAct.m80164Z1(act, act.string(R$string.f27493j8), this.f166695b));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public swh0() {
        String str = "tantan_coin_boost_guide_confirm_dialog_shown_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f166670a = new hpd0(str, bool);
        String str2 = "tantan_coin_boost_guide_confirm_checkbox_state_" + CoreModule.m29931H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f166671b = new hpd0(str2, bool2);
        this.f166672c = new hpd0("tantan_coin_super_like_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166673d = new hpd0("tantan_coin_super_like_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166674e = new hpd0("tantan_coin_quick_chat_number_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166675f = new hpd0("tantan_coin_quick_chat_number_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166676g = new hpd0("tantan_coin_letter_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166677h = new hpd0("tantan_coin_letter_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166678i = new hpd0("tantan_coin_intl_letter_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166679j = new hpd0("tantan_coin_letter_intl_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166680k = new hpd0("tantan_coin_voice_quick_chat_number_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166681l = new hpd0("tantan_coin_voice_quick_chat_number_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166682m = new hpd0("tantan_coin_voice_profile_like_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166683n = new hpd0("tantan_coin_profile_like_guide_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166684o = new hpd0("tantan_coin_instant_chat_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166685p = new hpd0("tantan_coin_instant_chat_guide_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166686q = new uqd0("coin_pay_type_history_" + qib0.f154713b0.f139230a.userId(), "");
        this.f166687r = new uqd0("last_pay_item_id_" + qib0.f154713b0.f139230a.userId(), "");
        this.f166688s = new hpd0("tantan_coin_see_letter_config_" + CoreModule.m29931H().userId(), bool);
        this.f166689t = new hpd0("tantan_coin_say_hi_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166690u = new hpd0("tantan_coin_say_hi_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
        this.f166691v = new hpd0("tantan_coin_pre_confession_confirm_dialog_shown_" + CoreModule.m29931H().userId(), bool);
        this.f166692w = new hpd0("tantan_coin_pre_confession_confirm_checkbox_state_" + CoreModule.m29931H().userId(), bool2);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m186176A() {
        return m186178B() && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) CoreModule.f17545c.f19570H0.m210362l4());
    }

    /* JADX INFO: renamed from: A1 */
    public static void m186177A1(Act act, String str, final d30 d30Var) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(0).m120955g(new g30() { // from class: l.qwh0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    swh0.m186243l(d30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m120960l();
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m186178B() {
        return CoreModule.f17545c.f19570H0.m210362l4() > 0;
    }

    /* JADX INFO: renamed from: B0 */
    public static void m186179B0(Act act, PayMethod payMethod, PurchaseType purchaseType, l6b0 l6b0Var) {
        if (TEnum.equals(payMethod, "alipay")) {
            sd60.m183467y(act, payMethod, purchaseType, l6b0Var);
            return;
        }
        if (TEnum.equals(payMethod, "wechat")) {
            if (sd60.m183465p()) {
                sd60.m183467y(act, payMethod, purchaseType, l6b0Var);
                return;
            }
            zvf0.m220371D("e_purchase_order_response", "p_purchase_page", vwb.m200311Y("skuID", ""), vwb.m200311Y("platform", "wechat"), vwb.m200311Y("code", 202001), vwb.m200311Y("order_id", ""), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", "wx not install"));
            hab0.Companion companion = hab0.INSTANCE;
            PurchasePaymentParam purchasePaymentParam = l6b0Var.f126250a;
            companion.m130133g(purchasePaymentParam.purchaseTrackId, purchasePaymentParam.itemId, "wx not install");
        }
    }

    /* JADX INFO: renamed from: B1 */
    public static void m186180B1(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        if (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA == purchaseType) {
            CoreModule.m29935P().m94651a().mo33345J7(act, purchaseType, d30Var, d30Var2);
            return;
        }
        if (PurchaseType.TYPE_GET_VIP_SUPERLIKE == purchaseType) {
            CoreModule.m29935P().m94651a().mo33413T9(act, purchaseType, d30Var, d30Var2, 1);
            return;
        }
        if (PurchaseType.TYPE_GET_LETTER == purchaseType) {
            CoreModule.m29935P().m94651a().mo33503fr(act, d30Var, d30Var2);
            return;
        }
        if (PurchaseType.TYPE_INTL_READ_MESSAGE == purchaseType) {
            m186184D1(act, purchaseType, d30Var, d30Var2);
        } else if (PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA == purchaseType) {
            CoreModule.m29935P().m94651a().mo33490ea(act, purchaseType, d30Var, d30Var2);
        } else {
            m186182C1(act, purchaseType, d30Var, d30Var2, 1);
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m186181C() {
        return m186272w() && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) CoreModule.f17545c.f19570H0.m210364m4());
    }

    /* JADX INFO: renamed from: C1 */
    public static void m186182C1(Act act, final PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2, int i) {
        final boolean[] zArr = {true};
        final cwf0 cwf0VarM186207N1 = m186207N1(purchaseType);
        i0e.m133797f(cwf0VarM186207N1);
        Dialog dialogM20567z = act.dialog().m20559v().m20517M(m6c0.f131512N2).m20564x0(act.drawable(d3c0.f83555Eb)).m20556t0(R$string.f27329V7, new Runnable() { // from class: l.jwh0
            @Override // java.lang.Runnable
            public final void run() {
                swh0.m186229e(purchaseType, zArr, d30Var);
            }
        }).m20542l0(R$string.f27376a, new Runnable() { // from class: l.kwh0
            @Override // java.lang.Runnable
            public final void run() {
                swh0.m186260r(zArr, d30Var2);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.lwh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                swh0.m186251o(cwf0VarM186207N1, zArr, d30Var2, dialogInterface);
            }
        }).m20567z();
        CoinGuideView coinGuideView = (CoinGuideView) dialogM20567z.m20458P();
        if (i > 0) {
            coinGuideView.setPayCount(i);
        }
        coinGuideView.m53095j(purchaseType);
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m186183D() {
        return m186185E() && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) CoreModule.f17545c.f19570H0.m210388y4());
    }

    /* JADX INFO: renamed from: D1 */
    public static void m186184D1(Act act, PurchaseType purchaseType, final d30 d30Var, d30 d30Var2) {
        final cwf0 cwf0Var = new cwf0("p_purchase_read_receipt_confirm_popup", Dialog.class.getName());
        int iM210320B4 = CoreModule.f17545c.f19570H0.m210320B4();
        View viewInflate = act.inflater().inflate(m6c0.f131490I0, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(z4c0.f201564t);
        VText vText = (VText) viewInflate.findViewById(z4c0.f201509Z0);
        VText vText2 = (VText) viewInflate.findViewById(z4c0.f201491Q0);
        VButton vButton = (VButton) viewInflate.findViewById(z4c0.f201566u);
        vText.setTypeface(eqh0.m117752c(3), 1);
        vText2.setText(n6a.m158023b0(act.getString(R$string.f27110B8, iM210320B4 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), vwb.m200324f0(String.valueOf(iM210320B4)), act.getResources().getColor(b1c0.f72559l), eqh0.m117752c(2)));
        final dd80 dd80VarM110989r0 = act.newDialog().m110963R(viewInflate).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.nwh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                swh0.m186235h(cwf0Var, dialogInterface);
            }
        }).m110989r0();
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.owh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                swh0.m186233g(dd80VarM110989r0, d30Var, view);
            }
        });
        xdl0.m208329E0(imageView, new View.OnClickListener() { // from class: l.pwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarM110989r0.dismiss();
            }
        });
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m186185E() {
        return CoreModule.f17545c.f19570H0.m210388y4() > 0;
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m186186E0() {
        return CoreModule.m29935P().m94651a().mo33468b3() <= 0;
    }

    /* JADX INFO: renamed from: E1 */
    public static boolean m186187E1(Act act, final d30 d30Var) {
        if (xma.m210041D3() || !m186191G() || !m186255p0().m186311e1()) {
            return false;
        }
        m186180B1(act, PurchaseType.TYPE_GET_LETTER, new d30() { // from class: l.rwh0
            @Override // p149l.d30
            public final void call() {
                swh0.m186225c(d30Var);
            }
        }, null);
        return true;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m186188F() {
        int iM210318A4 = CoreModule.f17545c.f19570H0.m210318A4();
        return iM210318A4 > 0 && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) iM210318A4);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m186189F0() {
        f166669x = null;
    }

    /* JADX INFO: renamed from: F1 */
    public static void m186190F1(Act act, String str) {
        new fd5.C16808e(act).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120951c(15).m120952d(str).m120960l();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m186191G() {
        return m186194H() && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) CoreModule.f17545c.f19570H0.m210346X4());
    }

    /* JADX INFO: renamed from: G0 */
    public static void m186192G0(Act act, TextView textView) {
        String language;
        Locale locale = act.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            language = locale.getLanguage();
        } else {
            language = locale.getLanguage() + "-" + locale.getCountry();
        }
        String strString = act.string(R$string.f27481i8);
        String str = act.getString(R$string.f27340W7) + strString;
        String string = Uri.parse(xh5.m208767o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", language).appendQueryParameter("country", IntlCountryCodeController.m28108d(qib0.f154717f0)).toString();
        int iIndexOf = str.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(act.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C20052b(act, string), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: G1 */
    public static boolean m186193G1(Act act, final d30 d30Var) {
        if (!m186203L1() || !m186200J1() || !m186255p0().m186316j1()) {
            return false;
        }
        m186180B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new d30() { // from class: l.yvh0
            @Override // p149l.d30
            public final void call() {
                swh0.m186245m(d30Var);
            }
        }, null);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m186194H() {
        return CoreModule.f17545c.f19570H0.m210346X4() > 0;
    }

    /* JADX INFO: renamed from: H0 */
    public static void m186195H0() {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (!NullChecker.m81303a(counterM31484o3) || !NullChecker.m81303a(counterM31484o3.superLikeLimit)) {
            CrashHelper.m81296c(new Exception("superLikeNumError num = 0 counter or superLikeLimit =null"));
        } else {
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3.superLikeLimit;
            CrashHelper.m81296c(new Exception(String.format("superLikeNumError num = 0 remaining=%s count=%s limit=%s", Integer.valueOf(counterSuperlikeAndUndoLimit.remaining), Integer.valueOf(counterSuperlikeAndUndoLimit.count), Integer.valueOf(counterSuperlikeAndUndoLimit.limit))));
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static void m186196H1(Act act, long j, int i, final d30 d30Var, final d30 d30Var2) {
        if (j <= 0 || i <= 0) {
            return;
        }
        View viewInflate = act.inflater().inflate(m6c0.f131632p2, (ViewGroup) null);
        final dd80 dd80VarM110960O = act.newDialog().m110963R(viewInflate).m110960O();
        TextView textView = (TextView) viewInflate.findViewById(z4c0.f201509Z0);
        TextView textView2 = (TextView) viewInflate.findViewById(z4c0.f201558q);
        TextView textView3 = (TextView) viewInflate.findViewById(z4c0.f201568v);
        m186192G0(act, (TextView) viewInflate.findViewById(z4c0.f201541k0));
        String string = act.getString(R$string.f27354Y, Long.valueOf(j));
        String str = (((long) i) * j) + act.getString(R$string.f27445f8);
        textView.setText(n6a.m158023b0(act.getString(R$string.f27373Z7, string, str), vwb.m200324f0(string, str), act.getResources().getColor(b1c0.f72559l), eqh0.m117752c(2)));
        xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.zvh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                swh0.m186254p(d30Var2, dd80VarM110960O, view);
            }
        });
        xdl0.m208329E0(textView3, new View.OnClickListener() { // from class: l.awh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                swh0.m186241k(dd80VarM110960O, d30Var, view);
            }
        });
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m186197I() {
        return m186199J() && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) CoreModule.f17545c.f19570H0.m210350b5());
    }

    /* JADX INFO: renamed from: I1 */
    public static boolean m186198I1() {
        return j17.m139231E3() > 0;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m186199J() {
        return CoreModule.f17545c.f19570H0.m210350b5() > 0;
    }

    /* JADX INFO: renamed from: J1 */
    public static boolean m186200J1() {
        return CoreModule.m29932K().mo30835xf() ? m186213S() : m186206N();
    }

    /* JADX INFO: renamed from: K */
    public static boolean m186201K() {
        return m186202L() && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) CoreModule.f17545c.f19570H0.m210354f5());
    }

    /* JADX INFO: renamed from: L */
    public static boolean m186202L() {
        return !CoreModule.f17554l.m94651a().mo33554o6() && CoreModule.f17545c.f19570H0.m210354f5() > 0;
    }

    /* JADX INFO: renamed from: L1 */
    public static boolean m186203L1() {
        return !ura.m195053e().m195057d().mo33882m3() && m186270v0() <= 0;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m186204M() {
        return CoreModule.f17545c.f19570H0.m210379t5() > 0;
    }

    /* JADX INFO: renamed from: M1 */
    public static void m186205M1(PurchaseType purchaseType) {
        boolean zM186322y0;
        if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            zM186322y0 = m186255p0().m186321u();
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            zM186322y0 = m186255p0().m186288K1();
        } else if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA) {
            zM186322y0 = m186255p0().m186284D0();
        } else if (purchaseType == PurchaseType.TYPE_SAY_HI_PKG) {
            zM186322y0 = m186255p0().m186314h1();
        } else {
            zM186322y0 = sab0.m182891i(purchaseType) ? m186255p0().m186322y0() : false;
        }
        zvf0.m220399u("e_coin_usage_confirm_button", "p_alert_coin_usage_confirm", vwb.m200311Y("is_shown_next_time", Boolean.valueOf(!zM186322y0)));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m186206N() {
        return m186208O() && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) CoreModule.f17545c.f19570H0.m210391z5());
    }

    /* JADX INFO: renamed from: N1 */
    public static cwf0 m186207N1(PurchaseType purchaseType) {
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
            } else if (sab0.m182891i(purchaseType)) {
                str3 = "diamondSayhiNumber";
                str2 = OMSDialogPositon.p_suggest_user_profile_info_view;
                str = "instant_chat_button";
            } else {
                str = "";
                str2 = "";
                str3 = str2;
            }
        }
        cwf0 cwf0Var = new cwf0("p_alert_coin_usage_confirm", Dialog.class.getName());
        cwf0Var.m109040p(vwb.m200311Y("exchange_type", str3), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.m200311Y("tooltips_trigger_mode", Active.TYPE), vwb.m200311Y("tooltips_trigger_page", str2), vwb.m200311Y("tooltips_trigger_module", str), vwb.m200311Y("tooltips_trigger_reason", "click"));
        return cwf0Var;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m186208O() {
        return (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG) || !xma.m210071e4() || ura.m195053e().m195057d().mo33742Qi()) && CoreModule.f17545c.f19570H0.m210391z5() > 0;
    }

    /* JADX INFO: renamed from: O1 */
    public static void m186209O1(int i, boolean z) {
        zvf0.m220399u("e_wallet_function_button", OMSDialogPositon.p_wallet, vwb.m200311Y("exchange_type", m186249n0(i)), vwb.m200311Y("is_privileged", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m186210P() {
        return CoreModule.m29932K().mo30835xf() ? m186212R() : m186181C();
    }

    /* JADX INFO: renamed from: P1 */
    public static void m186211P1(int i, boolean z) {
        zvf0.m220368A("e_wallet_function_button", OMSDialogPositon.p_wallet, vwb.m200311Y("exchange_type", m186249n0(i)), vwb.m200311Y("is_privileged", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: R */
    public static boolean m186212R() {
        return m186272w() && CoreModule.f17545c.f19573I0.m140257K3() >= ((long) CoreModule.f17545c.f19573I0.m140268s3());
    }

    /* JADX INFO: renamed from: S */
    public static boolean m186213S() {
        return m186214T() && CoreModule.f17545c.f19573I0.m140257K3() >= ((long) CoreModule.f17545c.f19573I0.m140267U3());
    }

    /* JADX INFO: renamed from: T */
    public static boolean m186214T() {
        return (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG) || !xma.m210071e4() || ura.m195053e().m195057d().mo33742Qi()) && CoreModule.f17545c.f19573I0.m140267U3() > 0;
    }

    /* JADX INFO: renamed from: U */
    public static String m186215U(long j) {
        return t0g0.m186860a(j, 99999999L);
    }

    /* JADX INFO: renamed from: V */
    public static int m186216V() {
        return CoreModule.f17554l.m94651a().mo33375Nf();
    }

    /* JADX INFO: renamed from: W */
    public static int m186217W() {
        return m186216V() + (CoreModule.m29932K().mo30835xf() ? m186234g0() : m186219Y());
    }

    /* JADX INFO: renamed from: X */
    public static int m186218X() {
        return m186216V() + (CoreModule.m29932K().mo30835xf() ? m186236h0() : m186220Z());
    }

    /* JADX INFO: renamed from: Y */
    public static int m186219Y() {
        if (m186272w()) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210364m4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: Z */
    public static int m186220Z() {
        if (CoreModule.f17545c.f19570H0.m210380u4() > 0) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210380u4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m186221a(LinkedList linkedList, String str) {
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
    public static int m186222a0() {
        if (CoreModule.f17545c.f19570H0.m210348Z4() > 0) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210348Z4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m186223b(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m186224b0() {
        if (m186176A()) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210362l4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m186225c(d30 d30Var) {
        m186255p0().m186301U0();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static int m186226c0() {
        if (m186202L()) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210354f5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m186227d(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: d0 */
    public static int m186228d0() {
        if (m186198I1()) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210389y5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m186229e(PurchaseType purchaseType, boolean[] zArr, d30 d30Var) {
        m186205M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: e0 */
    public static int m186230e0() {
        if (m186208O()) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210391z5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m186231f(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static int m186232f0() {
        return CoreModule.m29932K().mo30835xf() ? m186240j0() : m186228d0();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m186233g(dd80 dd80Var, d30 d30Var, View view) {
        dd80Var.dismiss();
        o6j0.m162859c("e_purchase_read_receipt_confirm_popup_confirm", "p_purchase_read_receipt_confirm_popup", new o6j0.C18854a[0]);
        d30Var.call();
    }

    /* JADX INFO: renamed from: g0 */
    public static int m186234g0() {
        if (m186212R()) {
            return (int) (CoreModule.f17545c.f19573I0.m140257K3() / ((long) CoreModule.f17545c.f19573I0.m140268s3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m186235h(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        o6j0.m162859c("e_purchase_read_receipt_confirm_popup_cancel", "p_purchase_read_receipt_confirm_popup", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: h0 */
    public static int m186236h0() {
        if (CoreModule.f17545c.f19573I0.m140275z3() > 0) {
            return (int) (CoreModule.f17545c.f19573I0.m140257K3() / ((long) CoreModule.f17545c.f19573I0.m140275z3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m186237i(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(purchaseType.toString());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static int m186238i0() {
        if (CoreModule.f17545c.f19573I0.m140258L3() > 0) {
            return (int) (CoreModule.f17545c.f19573I0.m140257K3() / ((long) CoreModule.f17545c.f19573I0.m140258L3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m186240j0() {
        if (m186198I1()) {
            return (int) (CoreModule.f17545c.f19573I0.m140257K3() / ((long) CoreModule.f17545c.f19573I0.m140266T3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m186241k(dd80 dd80Var, d30 d30Var, View view) {
        if (dd80Var == null || d30Var == null) {
            return;
        }
        d30Var.call();
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public static int m186242k0() {
        if (m186213S()) {
            return (int) (CoreModule.f17545c.f19573I0.m140257K3() / ((long) CoreModule.f17545c.f19573I0.m140267U3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m186243l(d30 d30Var, PurchaseType purchaseType, Act act, String str) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static int m186244l0() {
        return CoreModule.m29932K().mo30835xf() ? m186238i0() : m186222a0();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m186245m(d30 d30Var) {
        m186255p0().m186305Y0();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static int m186246m0() {
        if (m186204M()) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210379t5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public static void m186247m1(Act act, String str, final e30<PurchaseType> e30Var) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
            return;
        }
        int i = (CoreModule.m29935P().m94651a().mo33633z7() && NullChecker.m81303a(e30Var)) ? 14 : 1;
        if ("p_messages_view,e_messages_spotlight,click".equals(str)) {
            i = 22;
        }
        new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(i).m120955g(new g30() { // from class: l.hwh0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                swh0.m186223b(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m120960l();
    }

    /* JADX INFO: renamed from: n0 */
    public static String m186249n0(int i) {
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
    public static void m186250n1(Act act, String str, int i, final e30<PurchaseType> e30Var) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(i).m120955g(new g30() { // from class: l.bwh0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    swh0.m186231f(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m120960l();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m186251o(cwf0 cwf0Var, boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        if (zArr[0] && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static String m186252o0(int i) {
        String strM186249n0;
        if (i == 8 || i == 9) {
            strM186249n0 = "giftVas";
        } else {
            strM186249n0 = i == 12 ? "read_receipt" : m186249n0(i);
        }
        return TextUtils.isEmpty(strM186249n0) ? "other" : strM186249n0;
    }

    /* JADX INFO: renamed from: o1 */
    public static void m186253o1(Act act, String str, long j) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(8).m120953e(j).m120960l();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m186254p(d30 d30Var, dd80 dd80Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
        if (dd80Var != null) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static swh0 m186255p0() {
        if (f166669x == null) {
            synchronized (swh0.class) {
                try {
                    if (f166669x == null) {
                        f166669x = new swh0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f166669x;
    }

    /* JADX INFO: renamed from: p1 */
    public static void m186256p1(Act act, String str) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(9).m120960l();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m186257q(final Act act) {
        act.progress(R$string.f27301T1);
        xob xobVar = CoreModule.f17545c.f19570H0;
        act.duringCreated(xobVar.m210387x5(xobVar.m210376s4(SummarizedPrivilegesId.get("intlReadMessage")), SummarizedPrivilegesId.get("intlReadMessage"), "coin", CoreModule.f17545c.f19570H0.m210320B4())).subscribe(mkd0.m154956H(new e30() { // from class: l.ewh0
            @Override // p149l.e30
            public final void call(Object obj) {
                swh0.m186262s(act, (Boolean) obj);
            }
        }, new e30() { // from class: l.fwh0
            @Override // p149l.e30
            public final void call(Object obj) {
                swh0.m186227d(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static int m186258q0() {
        if (CoreModule.f17545c.f19570H0.m210320B4() > 0) {
            return (int) (CoreModule.f17545c.f19570H0.m210347Y4() / ((long) CoreModule.f17545c.f19570H0.m210320B4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: q1 */
    public static void m186259q1(Act act, String str, int i) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120952d(str).m120950b(i).m120951c(26).m120960l();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m186260r(boolean[] zArr, d30 d30Var) {
        zArr[0] = true;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static void m186261r1(Act act, String str, int i) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120956h(i).m120951c(12).m120960l();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m186262s(Act act, Boolean bool) {
        act.progressDismiss();
        if (bool.booleanValue()) {
            CoreModule.f17545c.f19555C0.m210112u4();
            lsi0.m151578h(R$string.f27420d7);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static int m186263s0() {
        return CoreModule.m29935P().m94651a().mo33468b3() + m186226c0();
    }

    /* JADX INFO: renamed from: s1 */
    public static void m186264s1(Act act, String str) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(6).m120960l();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m186265t(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(purchaseType.toString());
        }
    }

    /* JADX INFO: renamed from: t1 */
    public static void m186266t1(Act act, String str, final e30<String> e30Var) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(33).m120955g(new g30() { // from class: l.iwh0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    swh0.m186237i(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m120960l();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static int m186267u0() {
        return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140267U3() : CoreModule.f17545c.f19570H0.m210391z5();
    }

    @Nullable
    /* JADX INFO: renamed from: u1 */
    public static fd5 m186268u1(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        if (!IntlCountryCodeController.m28115k()) {
            return new fd5.C16808e(act).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120952d(str).m120951c(3).m120954f(d30Var).m120955g(g30Var).m120960l();
        }
        kkp0.m146350c(act, act.pageId());
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m186269v() {
        return CoreModule.m29935P().m94651a().mo33586s8();
    }

    /* JADX INFO: renamed from: v0 */
    public static int m186270v0() {
        if (NullChecker.m81303a(CoreModule.f17545c.m31484o3())) {
            return CoreModule.f17545c.m31484o3().superLikeLimit.remainToday();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v1 */
    public static void m186271v1(Act act, String str, final e30<String> e30Var) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
        } else {
            new fd5.C16808e(act).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120952d(str).m120951c(31).m120955g(new g30() { // from class: l.cwh0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    swh0.m186265t(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m120960l();
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m186272w() {
        return j17.m139251z3() > 0;
    }

    /* JADX INFO: renamed from: w0 */
    public static int m186273w0(int i) {
        if (!CoreModule.m29935P().m94651a().mo33542m3()) {
            return (CoreModule.m29932K().mo30835xf() ? m186242k0() : m186230e0()) + i;
        }
        if (i != 0) {
            return 200000;
        }
        m186195H0();
        return 200000;
    }

    /* JADX INFO: renamed from: w1 */
    public static void m186274w1(Act act, String str) {
        m186277x1(act, str, null);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m186275x(Privilege privilege) {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (Privilege.vip_super_like == privilege) {
            return CoreModule.f17545c.f19639e0.m169527p9().isVIP() || (counterM31484o3 != null && counterM31484o3.superLikeLimit.remaining > 0);
        }
        if (Privilege.online_match_tickets_extra == privilege) {
            return CoreModule.m29935P().m94651a().mo33468b3() > 0 || CoreModule.m29935P().m94651a().mo33634z9() || CoreModule.f17545c.f19639e0.m169527p9().isFemale();
        }
        if (Privilege.boost == privilege) {
            return true;
        }
        if (Privilege.accelerate_pairing == privilege || Privilege.see_greet_gp == privilege || Privilege.letter == privilege || Privilege.vip_letter_gp == privilege) {
            return false;
        }
        if (Privilege.see_letter_gp == privilege) {
            return CoreModule.m29935P().m94651a().mo33378No() && n3b0.m157734i() > 0;
        }
        if (Privilege.intl_message_read == privilege) {
            return CoreModule.m29935P().m94651a().mo33352Kf();
        }
        if (Privilege.immediately_match == privilege) {
            return CoreModule.f17557o.m195057d().mo33766Vd() && CoreModule.f17557o.m195057d().mo33800aq();
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m186276x0() {
        return m186270v0() + (CoreModule.m29932K().mo30835xf() ? m186242k0() : m186230e0());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m186277x1(Act act, String str, g30<PurchaseType, Act, String> g30Var) {
        if (IntlCountryCodeController.m28115k()) {
            kkp0.m146350c(act, act.pageId());
            return;
        }
        fd5.C16808e c16808eM120951c = new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(2);
        if (NullChecker.m81303a(g30Var)) {
            c16808eM120951c.m120955g(g30Var);
        }
        c16808eM120951c.m120960l();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m186278y() {
        return CoreModule.m29935P().m94651a().mo33586s8() && m186210P();
    }

    /* JADX INFO: renamed from: y1 */
    public static void m186279y1(Act act, String str, int i, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        new fd5.C16808e(act).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120952d(str).m120951c(25).m120955g(g30Var).m120954f(d30Var).m120959k(i).m120960l();
    }

    /* JADX INFO: renamed from: z */
    public static void m186280z(final Act act, String str) {
        if (m186258q0() <= 0) {
            m186261r1(act, str, CoreModule.f17545c.f19570H0.m210320B4());
        } else {
            m186180B1(act, PurchaseType.TYPE_INTL_READ_MESSAGE, new d30() { // from class: l.dwh0
                @Override // p149l.d30
                public final void call() {
                    swh0.m186257q(act);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static void m186281z1(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        new fd5.C16808e(act).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120952d(str).m120951c(13).m120954f(d30Var).m120955g(g30Var).m120960l();
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m186282A0() {
        return this.f166677h.get().booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m186283C0() {
        return this.f166692w.get().booleanValue();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m186284D0() {
        return this.f166675f.get().booleanValue();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m186285I0() {
        return this.f166690u.get().booleanValue();
    }

    /* JADX INFO: renamed from: J0 */
    public void m186286J0(boolean z) {
        this.f166671b.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K0 */
    public void m186287K0(boolean z) {
        this.f166685p.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K1 */
    public boolean m186288K1() {
        return this.f166673d.get().booleanValue();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m186289L0(boolean z) {
        return this.f166679j.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: M0 */
    public void m186290M0(String str) {
        this.f166687r.put(str);
    }

    /* JADX INFO: renamed from: N0 */
    public void m186291N0(PayMethod payMethod) {
        LinkedList<String> linkedListM186319r0 = m186319r0();
        if (linkedListM186319r0.contains(String.valueOf(1)) || linkedListM186319r0.contains(String.valueOf(3))) {
            final LinkedList<String> linkedList = new LinkedList<>();
            vwb.m200354z(linkedListM186319r0, new e30() { // from class: l.mwh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    swh0.m186221a(linkedList, (String) obj);
                }
            });
            linkedListM186319r0 = linkedList;
        }
        if (linkedListM186319r0.size() >= 3) {
            linkedListM186319r0.removeLast();
        }
        linkedListM186319r0.addFirst(payMethod.toString());
        this.f166686q.put(new Gson().toJson(linkedListM186319r0));
    }

    /* JADX INFO: renamed from: O0 */
    public void m186292O0(boolean z) {
        this.f166677h.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: P0 */
    public void m186293P0(boolean z) {
        this.f166692w.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q */
    public void m186294Q() {
        this.f166685p.put(Boolean.TRUE);
        this.f166684o.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m186295Q0(boolean z) {
        this.f166675f.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q1 */
    public void m186296Q1(boolean z) {
        this.f166688s.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R0 */
    public void m186297R0(boolean z) {
        this.f166690u.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m186298R1() {
        return this.f166681l.get().booleanValue();
    }

    /* JADX INFO: renamed from: S0 */
    public void m186299S0() {
        if (this.f166671b.get().booleanValue()) {
            this.f166670a.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m186300T0() {
        if (this.f166685p.get().booleanValue()) {
            this.f166684o.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m186301U0() {
        if (this.f166677h.get().booleanValue()) {
            this.f166676g.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m186302V0() {
        if (this.f166692w.get().booleanValue()) {
            this.f166691v.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m186303W0() {
        if (this.f166675f.get().booleanValue()) {
            this.f166674e.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m186304X0() {
        if (this.f166690u.get().booleanValue()) {
            this.f166689t.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m186305Y0() {
        if (this.f166673d.get().booleanValue()) {
            this.f166672c.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m186306Z0() {
        if (this.f166681l.get().booleanValue()) {
            this.f166680k.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m186307a1(boolean z) {
        this.f166673d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: b1 */
    public void m186308b1(boolean z) {
        this.f166681l.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m186309c1() {
        return (this.f166670a.get().booleanValue() && this.f166671b.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m186310d1() {
        return (this.f166684o.get().booleanValue() && this.f166685p.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m186311e1() {
        return (this.f166676g.get().booleanValue() && this.f166677h.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m186312f1() {
        return (this.f166691v.get().booleanValue() && this.f166692w.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m186313g1() {
        return (this.f166674e.get().booleanValue() && this.f166675f.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m186314h1() {
        return (this.f166689t.get().booleanValue() && this.f166690u.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m186315i1() {
        return !this.f166688s.get().booleanValue();
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m186316j1() {
        return (this.f166672c.get().booleanValue() && this.f166673d.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m186317k1() {
        return (this.f166680k.get().booleanValue() && this.f166681l.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m186318l1() {
        if (CoreModule.f17545c.f19598Q1.f20117R.m34759M()) {
            return false;
        }
        LinkedList<String> linkedListM186319r0 = m186319r0();
        if (linkedListM186319r0.size() == 3) {
            return !vwb.m200353y(linkedListM186319r0, new w9j() { // from class: l.gwh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, "wechat"));
                }
            });
        }
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final LinkedList<String> m186319r0() {
        LinkedList<String> linkedList = new LinkedList<>();
        String str = this.f166686q.get();
        return str.isEmpty() ? linkedList : (LinkedList) new Gson().fromJson(str, new C20051a().getType());
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m186320t0() {
        return this.f166688s.get().booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public boolean m186321u() {
        return this.f166671b.get().booleanValue();
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m186322y0() {
        return this.f166685p.get().booleanValue();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m186323z0() {
        return this.f166679j.get().booleanValue();
    }
}
