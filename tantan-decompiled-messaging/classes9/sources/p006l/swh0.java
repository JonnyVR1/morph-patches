package p006l;

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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.CoinGuideView;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.Locale;
import l.b1c0;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.dd80;
import l.e30;
import l.eqh0;
import l.fd5;
import l.g30;
import l.hpd0;
import l.i0e;
import l.j760;
import l.l6b0;
import l.lsi0;
import l.m6c0;
import l.mb90;
import l.mkd0;
import l.n3b0;
import l.n4i0;
import l.n6a;
import l.o6j0;
import l.sab0;
import l.sd60;
import l.t0g0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.z4c0;
import l.zvf0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class swh0 {

    /* JADX INFO: renamed from: x */
    public static swh0 f21704x;

    /* JADX INFO: renamed from: a */
    public final hpd0 f21705a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f21706b;

    /* JADX INFO: renamed from: c */
    public final hpd0 f21707c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f21708d;

    /* JADX INFO: renamed from: e */
    public final hpd0 f21709e;

    /* JADX INFO: renamed from: f */
    public final hpd0 f21710f;

    /* JADX INFO: renamed from: g */
    public final hpd0 f21711g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f21712h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f21713i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f21714j;

    /* JADX INFO: renamed from: k */
    public final hpd0 f21715k;

    /* JADX INFO: renamed from: l */
    public final hpd0 f21716l;

    /* JADX INFO: renamed from: m */
    public final hpd0 f21717m;

    /* JADX INFO: renamed from: n */
    public final hpd0 f21718n;

    /* JADX INFO: renamed from: o */
    public final hpd0 f21719o;

    /* JADX INFO: renamed from: p */
    public final hpd0 f21720p;

    /* JADX INFO: renamed from: q */
    public final uqd0 f21721q;

    /* JADX INFO: renamed from: r */
    public final uqd0 f21722r;

    /* JADX INFO: renamed from: s */
    public final hpd0 f21723s;

    /* JADX INFO: renamed from: t */
    public final hpd0 f21724t;

    /* JADX INFO: renamed from: u */
    public final hpd0 f21725u;

    /* JADX INFO: renamed from: v */
    public final hpd0 f21726v;

    /* JADX INFO: renamed from: w */
    public final hpd0 f21727w;

    /* JADX INFO: renamed from: l.swh0$a */
    public class C1287a extends TypeToken<LinkedList<String>> {
        public C1287a() {
        }
    }

    /* JADX INFO: renamed from: l.swh0$b */
    public class C1288b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f21729a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f21730b;

        public C1288b(Act act, String str) {
            this.f21729a = act;
            this.f21730b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = this.f21729a;
            act.startActivity(WebViewAct.Z1(act, act.string(R.string.j8), this.f21730b));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public swh0() {
        String str = "tantan_coin_boost_guide_confirm_dialog_shown_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f21705a = new hpd0(str, bool);
        String str2 = "tantan_coin_boost_guide_confirm_checkbox_state_" + CoreModule.m1850H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f21706b = new hpd0(str2, bool2);
        this.f21707c = new hpd0("tantan_coin_super_like_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21708d = new hpd0("tantan_coin_super_like_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21709e = new hpd0("tantan_coin_quick_chat_number_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21710f = new hpd0("tantan_coin_quick_chat_number_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21711g = new hpd0("tantan_coin_letter_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21712h = new hpd0("tantan_coin_letter_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21713i = new hpd0("tantan_coin_intl_letter_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21714j = new hpd0("tantan_coin_letter_intl_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21715k = new hpd0("tantan_coin_voice_quick_chat_number_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21716l = new hpd0("tantan_coin_voice_quick_chat_number_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21717m = new hpd0("tantan_coin_voice_profile_like_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21718n = new hpd0("tantan_coin_profile_like_guide_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21719o = new hpd0("tantan_coin_instant_chat_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21720p = new hpd0("tantan_coin_instant_chat_guide_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21721q = new uqd0("coin_pay_type_history_" + qib0.f19804b0.f17706a.userId(), "");
        this.f21722r = new uqd0("last_pay_item_id_" + qib0.f19804b0.f17706a.userId(), "");
        this.f21723s = new hpd0("tantan_coin_see_letter_config_" + CoreModule.m1850H().userId(), bool);
        this.f21724t = new hpd0("tantan_coin_say_hi_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21725u = new hpd0("tantan_coin_say_hi_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
        this.f21726v = new hpd0("tantan_coin_pre_confession_confirm_dialog_shown_" + CoreModule.m1850H().userId(), bool);
        this.f21727w = new hpd0("tantan_coin_pre_confession_confirm_checkbox_state_" + CoreModule.m1850H().userId(), bool2);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m24227A() {
        return m24229B() && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) CoreModule.f1534c.f3559H0.m27537l4());
    }

    /* JADX INFO: renamed from: A1 */
    public static void m24228A1(Act act, String str, final d30 d30Var) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(0).g(new g30() { // from class: l.qwh0
                /* JADX INFO: renamed from: a */
                public final void m22464a(Object obj, Object obj2, Object obj3) {
                    swh0.m24294l(d30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).l();
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m24229B() {
        return CoreModule.f1534c.f3559H0.m27537l4() > 0;
    }

    /* JADX INFO: renamed from: B0 */
    public static void m24230B0(Act act, PayMethod payMethod, PurchaseType purchaseType, l6b0 l6b0Var) {
        if (TEnum.equals(payMethod, "alipay")) {
            sd60.y(act, payMethod, purchaseType, l6b0Var);
            return;
        }
        if (TEnum.equals(payMethod, "wechat")) {
            if (sd60.p()) {
                sd60.y(act, payMethod, purchaseType, l6b0Var);
                return;
            }
            zvf0.D("e_purchase_order_response", "p_purchase_page", new j760[]{vwb.Y("skuID", ""), vwb.Y("platform", "wechat"), vwb.Y("code", 202001), vwb.Y("order_id", ""), vwb.Y("order_type", "pay"), vwb.Y("error_message", "wx not install")});
            hab0.Companion companion = hab0.INSTANCE;
            PurchasePaymentParam purchasePaymentParam = l6b0Var.a;
            companion.m16140g(((PaymentParam) purchasePaymentParam).purchaseTrackId, ((PaymentParam) purchasePaymentParam).itemId, "wx not install");
        }
    }

    /* JADX INFO: renamed from: B1 */
    public static void m24231B1(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        if (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA == purchaseType) {
            CoreModule.m1854P().m11706a().m5282J7(act, purchaseType, d30Var, d30Var2);
            return;
        }
        if (PurchaseType.TYPE_GET_VIP_SUPERLIKE == purchaseType) {
            CoreModule.m1854P().m11706a().m5350T9(act, purchaseType, d30Var, d30Var2, 1);
            return;
        }
        if (PurchaseType.TYPE_GET_LETTER == purchaseType) {
            CoreModule.m1854P().m11706a().m5440fr(act, d30Var, d30Var2);
            return;
        }
        if (PurchaseType.TYPE_INTL_READ_MESSAGE == purchaseType) {
            m24235D1(act, purchaseType, d30Var, d30Var2);
        } else if (PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA == purchaseType) {
            CoreModule.m1854P().m11706a().m5427ea(act, purchaseType, d30Var, d30Var2);
        } else {
            m24233C1(act, purchaseType, d30Var, d30Var2, 1);
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m24232C() {
        return m24323w() && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) CoreModule.f1534c.f3559H0.m27539m4());
    }

    /* JADX INFO: renamed from: C1 */
    public static void m24233C1(Act act, final PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2, int i) {
        final boolean[] zArr = {true};
        final cwf0 cwf0VarM24258N1 = m24258N1(purchaseType);
        i0e.f(cwf0VarM24258N1);
        Dialog dialogZ = act.dialog().v().M(m6c0.N2).x0(act.drawable(d3c0.Eb)).t0(R.string.V7, new Runnable() { // from class: l.jwh0
            @Override // java.lang.Runnable
            public final void run() {
                swh0.m24280e(purchaseType, zArr, d30Var);
            }
        }).l0(R.string.a, new Runnable() { // from class: l.kwh0
            @Override // java.lang.Runnable
            public final void run() {
                swh0.m24311r(zArr, d30Var2);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.lwh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                swh0.m24302o(cwf0VarM24258N1, zArr, d30Var2, dialogInterface);
            }
        }).z();
        CoinGuideView coinGuideViewP = dialogZ.P();
        if (i > 0) {
            coinGuideViewP.setPayCount(i);
        }
        coinGuideViewP.j(purchaseType);
        dialogZ.show();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m24234D() {
        return m24236E() && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) CoreModule.f1534c.f3559H0.m27563y4());
    }

    /* JADX INFO: renamed from: D1 */
    public static void m24235D1(Act act, PurchaseType purchaseType, final d30 d30Var, d30 d30Var2) {
        final cwf0 cwf0Var = new cwf0("p_purchase_read_receipt_confirm_popup", Dialog.class.getName());
        int iM27495B4 = CoreModule.f1534c.f3559H0.m27495B4();
        View viewInflate = act.inflater().inflate(m6c0.I0, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(z4c0.t);
        VText vTextFindViewById = viewInflate.findViewById(z4c0.Z0);
        VText vTextFindViewById2 = viewInflate.findViewById(z4c0.Q0);
        VButton vButtonFindViewById = viewInflate.findViewById(z4c0.u);
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        vTextFindViewById2.setText(n6a.b0(act.getString(R.string.B8, iM27495B4 + " "), vwb.f0(new String[]{String.valueOf(iM27495B4)}), act.getResources().getColor(b1c0.l), eqh0.c(2)));
        final dd80 dd80VarR0 = act.newDialog().R(viewInflate).n0(new DialogInterface.OnDismissListener() { // from class: l.nwh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                swh0.m24286h(cwf0Var, dialogInterface);
            }
        }).r0();
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.owh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                swh0.m24284g(dd80VarR0, d30Var, view);
            }
        });
        xdl0.E0(imageView, new View.OnClickListener() { // from class: l.pwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarR0.dismiss();
            }
        });
        i0e.f(cwf0Var);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m24236E() {
        return CoreModule.f1534c.f3559H0.m27563y4() > 0;
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m24237E0() {
        return CoreModule.m1854P().m11706a().m5405b3() <= 0;
    }

    /* JADX INFO: renamed from: E1 */
    public static boolean m24238E1(Act act, final d30 d30Var) {
        if (xma.m27349D3() || !m24242G() || !m24306p0().m24362e1()) {
            return false;
        }
        m24231B1(act, PurchaseType.TYPE_GET_LETTER, new d30() { // from class: l.rwh0
            public final void call() {
                swh0.m24276c(d30Var);
            }
        }, null);
        return true;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m24239F() {
        int iM27493A4 = CoreModule.f1534c.f3559H0.m27493A4();
        return iM27493A4 > 0 && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) iM27493A4);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m24240F0() {
        f21704x = null;
    }

    /* JADX INFO: renamed from: F1 */
    public static void m24241F1(Act act, String str) {
        new fd5.e(act).j(PurchaseType.TYPE_INTL_TTT_COIN).c(15).d(str).l();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m24242G() {
        return m24245H() && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) CoreModule.f1534c.f3559H0.m27521X4());
    }

    /* JADX INFO: renamed from: G0 */
    public static void m24243G0(Act act, TextView textView) {
        String language;
        Locale locale = act.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            language = locale.getLanguage();
        } else {
            language = locale.getLanguage() + "-" + locale.getCountry();
        }
        String strString = act.string(R.string.i8);
        String str = act.getString(R.string.W7) + strString;
        String string = Uri.parse(xh5.m27256o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", language).appendQueryParameter("country", IntlCountryCodeController.m3d(qib0.f19808f0)).toString();
        int iIndexOf = str.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(act.color(b1c0.l));
        spannableStringBuilder.setSpan(new C1288b(act, string), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: G1 */
    public static boolean m24244G1(Act act, final d30 d30Var) {
        if (!m24254L1() || !m24251J1() || !m24306p0().m24367j1()) {
            return false;
        }
        m24231B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new d30() { // from class: l.yvh0
            public final void call() {
                swh0.m24296m(d30Var);
            }
        }, null);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m24245H() {
        return CoreModule.f1534c.f3559H0.m27521X4() > 0;
    }

    /* JADX INFO: renamed from: H0 */
    public static void m24246H0() {
        Counter counterM3414o3 = CoreModule.f1534c.m3414o3();
        if (!NullChecker.a(counterM3414o3) || !NullChecker.a(counterM3414o3.superLikeLimit)) {
            CrashHelper.c(new Exception("superLikeNumError num = 0 counter or superLikeLimit =null"));
        } else {
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM3414o3.superLikeLimit;
            CrashHelper.c(new Exception(String.format("superLikeNumError num = 0 remaining=%s count=%s limit=%s", Integer.valueOf(counterSuperlikeAndUndoLimit.remaining), Integer.valueOf(counterSuperlikeAndUndoLimit.count), Integer.valueOf(counterSuperlikeAndUndoLimit.limit))));
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static void m24247H1(Act act, long j, int i, final d30 d30Var, final d30 d30Var2) {
        if (j <= 0 || i <= 0) {
            return;
        }
        View viewInflate = act.inflater().inflate(m6c0.p2, (ViewGroup) null);
        final dd80 dd80VarO = act.newDialog().R(viewInflate).O();
        TextView textView = (TextView) viewInflate.findViewById(z4c0.Z0);
        TextView textView2 = (TextView) viewInflate.findViewById(z4c0.q);
        TextView textView3 = (TextView) viewInflate.findViewById(z4c0.v);
        m24243G0(act, (TextView) viewInflate.findViewById(z4c0.k0));
        String string = act.getString(R.string.Y, Long.valueOf(j));
        String str = (((long) i) * j) + act.getString(R.string.f8);
        textView.setText(n6a.b0(act.getString(R.string.Z7, string, str), vwb.f0(new String[]{string, str}), act.getResources().getColor(b1c0.l), eqh0.c(2)));
        xdl0.E0(textView2, new View.OnClickListener() { // from class: l.zvh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                swh0.m24305p(d30Var2, dd80VarO, view);
            }
        });
        xdl0.E0(textView3, new View.OnClickListener() { // from class: l.awh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                swh0.m24292k(dd80VarO, d30Var, view);
            }
        });
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m24248I() {
        return m24250J() && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) CoreModule.f1534c.f3559H0.m27525b5());
    }

    /* JADX INFO: renamed from: I1 */
    public static boolean m24249I1() {
        return j17.m17181E3() > 0;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m24250J() {
        return CoreModule.f1534c.f3559H0.m27525b5() > 0;
    }

    /* JADX INFO: renamed from: J1 */
    public static boolean m24251J1() {
        return CoreModule.m1851K().xf() ? m24264S() : m24257N();
    }

    /* JADX INFO: renamed from: K */
    public static boolean m24252K() {
        return m24253L() && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) CoreModule.f1534c.f3559H0.m27529f5());
    }

    /* JADX INFO: renamed from: L */
    public static boolean m24253L() {
        return !CoreModule.f1543l.m11706a().m5491o6() && CoreModule.f1534c.f3559H0.m27529f5() > 0;
    }

    /* JADX INFO: renamed from: L1 */
    public static boolean m24254L1() {
        return !ura.m25555e().m25559d().m5819m3() && m24321v0() <= 0;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m24255M() {
        return CoreModule.f1534c.f3559H0.m27554t5() > 0;
    }

    /* JADX INFO: renamed from: M1 */
    public static void m24256M1(PurchaseType purchaseType) {
        boolean zM24373y0;
        if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
            zM24373y0 = m24306p0().m24372u();
        } else if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
            zM24373y0 = m24306p0().m24339K1();
        } else if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA) {
            zM24373y0 = m24306p0().m24335D0();
        } else if (purchaseType == PurchaseType.TYPE_SAY_HI_PKG) {
            zM24373y0 = m24306p0().m24365h1();
        } else {
            zM24373y0 = sab0.i(purchaseType) ? m24306p0().m24373y0() : false;
        }
        zvf0.u("e_coin_usage_confirm_button", "p_alert_coin_usage_confirm", new j760[]{vwb.Y("is_shown_next_time", Boolean.valueOf(!zM24373y0))});
    }

    /* JADX INFO: renamed from: N */
    public static boolean m24257N() {
        return m24259O() && CoreModule.f1534c.f3559H0.m27522Y4() >= ((long) CoreModule.f1534c.f3559H0.m27566z5());
    }

    /* JADX INFO: renamed from: N1 */
    public static cwf0 m24258N1(PurchaseType purchaseType) {
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
            } else if (sab0.i(purchaseType)) {
                str3 = "diamondSayhiNumber";
                str2 = "p_suggest_user_profile_info_view";
                str = "instant_chat_button";
            } else {
                str = "";
                str2 = "";
                str3 = str2;
            }
        }
        cwf0 cwf0Var = new cwf0("p_alert_coin_usage_confirm", Dialog.class.getName());
        cwf0Var.p(new j760[]{vwb.Y("exchange_type", str3), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.Y("tooltips_trigger_mode", "active"), vwb.Y("tooltips_trigger_page", str2), vwb.Y("tooltips_trigger_module", str), vwb.Y("tooltips_trigger_reason", "click")});
        return cwf0Var;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m24259O() {
        return (mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG) || !xma.m27379e4() || ura.m25555e().m25559d().m5679Qi()) && CoreModule.f1534c.f3559H0.m27566z5() > 0;
    }

    /* JADX INFO: renamed from: O1 */
    public static void m24260O1(int i, boolean z) {
        zvf0.u("e_wallet_function_button", "p_wallet", new j760[]{vwb.Y("exchange_type", m24300n0(i)), vwb.Y("is_privileged", Boolean.valueOf(z))});
    }

    /* JADX INFO: renamed from: P */
    public static boolean m24261P() {
        return CoreModule.m1851K().xf() ? m24263R() : m24232C();
    }

    /* JADX INFO: renamed from: P1 */
    public static void m24262P1(int i, boolean z) {
        zvf0.A("e_wallet_function_button", "p_wallet", new j760[]{vwb.Y("exchange_type", m24300n0(i)), vwb.Y("is_privileged", Boolean.valueOf(z))});
    }

    /* JADX INFO: renamed from: R */
    public static boolean m24263R() {
        return m24323w() && CoreModule.f1534c.f3562I0.m17373K3() >= ((long) CoreModule.f1534c.f3562I0.m17384s3());
    }

    /* JADX INFO: renamed from: S */
    public static boolean m24264S() {
        return m24265T() && CoreModule.f1534c.f3562I0.m17373K3() >= ((long) CoreModule.f1534c.f3562I0.m17383U3());
    }

    /* JADX INFO: renamed from: T */
    public static boolean m24265T() {
        return (mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG) || !xma.m27379e4() || ura.m25555e().m25559d().m5679Qi()) && CoreModule.f1534c.f3562I0.m17383U3() > 0;
    }

    /* JADX INFO: renamed from: U */
    public static String m24266U(long j) {
        return t0g0.a(j, 99999999L);
    }

    /* JADX INFO: renamed from: V */
    public static int m24267V() {
        return CoreModule.f1543l.m11706a().m5312Nf();
    }

    /* JADX INFO: renamed from: W */
    public static int m24268W() {
        return m24267V() + (CoreModule.m1851K().xf() ? m24285g0() : m24270Y());
    }

    /* JADX INFO: renamed from: X */
    public static int m24269X() {
        return m24267V() + (CoreModule.m1851K().xf() ? m24287h0() : m24271Z());
    }

    /* JADX INFO: renamed from: Y */
    public static int m24270Y() {
        if (m24323w()) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27539m4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: Z */
    public static int m24271Z() {
        if (CoreModule.f1534c.f3559H0.m27555u4() > 0) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27555u4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24272a(LinkedList linkedList, String str) {
        String str2;
        if (TextUtils.equals(str, String.valueOf(1))) {
            str2 = "alipay";
        } else if (TextUtils.equals(str, String.valueOf(3))) {
            str2 = "wechat";
        } else {
            str2 = (!TextUtils.equals(str, String.valueOf(0)) && TextUtils.equals(str, String.valueOf(2))) ? "huabei" : CameraSticker.CATEGORY_DEFAULT_FILTER;
        }
        linkedList.add(str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static int m24273a0() {
        if (CoreModule.f1534c.f3559H0.m27523Z4() > 0) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27523Z4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m24274b(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m24275b0() {
        if (m24227A()) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27537l4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m24276c(d30 d30Var) {
        m24306p0().m24352U0();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static int m24277c0() {
        if (m24253L()) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27529f5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m24278d(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: d0 */
    public static int m24279d0() {
        if (m24249I1()) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27564y5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m24280e(PurchaseType purchaseType, boolean[] zArr, d30 d30Var) {
        m24256M1(purchaseType);
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: e0 */
    public static int m24281e0() {
        if (m24259O()) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27566z5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m24282f(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static int m24283f0() {
        return CoreModule.m1851K().xf() ? m24291j0() : m24279d0();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m24284g(dd80 dd80Var, d30 d30Var, View view) {
        dd80Var.dismiss();
        o6j0.c("e_purchase_read_receipt_confirm_popup_confirm", "p_purchase_read_receipt_confirm_popup", new o6j0.a[0]);
        d30Var.call();
    }

    /* JADX INFO: renamed from: g0 */
    public static int m24285g0() {
        if (m24263R()) {
            return (int) (CoreModule.f1534c.f3562I0.m17373K3() / ((long) CoreModule.f1534c.f3562I0.m17384s3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m24286h(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
        o6j0.c("e_purchase_read_receipt_confirm_popup_cancel", "p_purchase_read_receipt_confirm_popup", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: h0 */
    public static int m24287h0() {
        if (CoreModule.f1534c.f3562I0.m17391z3() > 0) {
            return (int) (CoreModule.f1534c.f3562I0.m17373K3() / ((long) CoreModule.f1534c.f3562I0.m17391z3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24288i(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(purchaseType.toString());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static int m24289i0() {
        if (CoreModule.f1534c.f3562I0.m17374L3() > 0) {
            return (int) (CoreModule.f1534c.f3562I0.m17373K3() / ((long) CoreModule.f1534c.f3562I0.m17374L3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m24291j0() {
        if (m24249I1()) {
            return (int) (CoreModule.f1534c.f3562I0.m17373K3() / ((long) CoreModule.f1534c.f3562I0.m17382T3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m24292k(dd80 dd80Var, d30 d30Var, View view) {
        if (dd80Var == null || d30Var == null) {
            return;
        }
        d30Var.call();
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public static int m24293k0() {
        if (m24264S()) {
            return (int) (CoreModule.f1534c.f3562I0.m17373K3() / ((long) CoreModule.f1534c.f3562I0.m17383U3()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m24294l(d30 d30Var, PurchaseType purchaseType, Act act, String str) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static int m24295l0() {
        return CoreModule.m1851K().xf() ? m24289i0() : m24273a0();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m24296m(d30 d30Var) {
        m24306p0().m24356Y0();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static int m24297m0() {
        if (m24255M()) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27554t5()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public static void m24298m1(Act act, String str, final e30<PurchaseType> e30Var) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
            return;
        }
        int i = (CoreModule.m1854P().m11706a().m5570z7() && NullChecker.a(e30Var)) ? 14 : 1;
        if ("p_messages_view,e_messages_spotlight,click".equals(str)) {
            i = 22;
        }
        new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(i).g(new g30() { // from class: l.hwh0
            /* JADX INFO: renamed from: a */
            public final void m16390a(Object obj, Object obj2, Object obj3) {
                swh0.m24274b(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).l();
    }

    /* JADX INFO: renamed from: n0 */
    public static String m24300n0(int i) {
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
    public static void m24301n1(Act act, String str, int i, final e30<PurchaseType> e30Var) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(i).g(new g30() { // from class: l.bwh0
                /* JADX INFO: renamed from: a */
                public final void m12939a(Object obj, Object obj2, Object obj3) {
                    swh0.m24282f(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).l();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m24302o(cwf0 cwf0Var, boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
        if (zArr[0] && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static String m24303o0(int i) {
        String strM24300n0;
        if (i == 8 || i == 9) {
            strM24300n0 = "giftVas";
        } else {
            strM24300n0 = i == 12 ? "read_receipt" : m24300n0(i);
        }
        return TextUtils.isEmpty(strM24300n0) ? "other" : strM24300n0;
    }

    /* JADX INFO: renamed from: o1 */
    public static void m24304o1(Act act, String str, long j) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(8).e(j).l();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m24305p(d30 d30Var, dd80 dd80Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
        if (dd80Var != null) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static swh0 m24306p0() {
        if (f21704x == null) {
            synchronized (swh0.class) {
                try {
                    if (f21704x == null) {
                        f21704x = new swh0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21704x;
    }

    /* JADX INFO: renamed from: p1 */
    public static void m24307p1(Act act, String str) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(9).l();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m24308q(final Act act) {
        act.progress(R.string.T1);
        xob xobVar = CoreModule.f1534c.f3559H0;
        act.duringCreated(xobVar.m27562x5(xobVar.m27551s4(SummarizedPrivilegesId.get("intlReadMessage")), SummarizedPrivilegesId.get("intlReadMessage"), "coin", CoreModule.f1534c.f3559H0.m27495B4())).subscribe(mkd0.H(new e30() { // from class: l.ewh0
            public final void call(Object obj) {
                swh0.m24313s(act, (Boolean) obj);
            }
        }, new e30() { // from class: l.fwh0
            public final void call(Object obj) {
                swh0.m24278d(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static int m24309q0() {
        if (CoreModule.f1534c.f3559H0.m27495B4() > 0) {
            return (int) (CoreModule.f1534c.f3559H0.m27522Y4() / ((long) CoreModule.f1534c.f3559H0.m27495B4()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: q1 */
    public static void m24310q1(Act act, String str, int i) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(PurchaseType.TYPE_INTL_TTT_COIN).d(str).b(i).c(26).l();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m24311r(boolean[] zArr, d30 d30Var) {
        zArr[0] = true;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static void m24312r1(Act act, String str, int i) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).h(i).c(12).l();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m24313s(Act act, Boolean bool) {
        act.progressDismiss();
        if (bool.booleanValue()) {
            CoreModule.f1534c.f3544C0.m27420u4();
            lsi0.h(R.string.d7);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static int m24314s0() {
        return CoreModule.m1854P().m11706a().m5405b3() + m24277c0();
    }

    /* JADX INFO: renamed from: s1 */
    public static void m24315s1(Act act, String str) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(6).l();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m24316t(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(purchaseType.toString());
        }
    }

    /* JADX INFO: renamed from: t1 */
    public static void m24317t1(Act act, String str, final e30<String> e30Var) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(33).g(new g30() { // from class: l.iwh0
                /* JADX INFO: renamed from: a */
                public final void m17138a(Object obj, Object obj2, Object obj3) {
                    swh0.m24288i(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).l();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static int m24318u0() {
        return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17383U3() : CoreModule.f1534c.f3559H0.m27566z5();
    }

    @Nullable
    /* JADX INFO: renamed from: u1 */
    public static fd5 m24319u1(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        if (!IntlCountryCodeController.m10k()) {
            return new fd5.e(act).j(PurchaseType.TYPE_INTL_TTT_COIN).d(str).c(3).f(d30Var).g(g30Var).l();
        }
        kkp0.m18162c(act, act.pageId());
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m24320v() {
        return CoreModule.m1854P().m11706a().m5523s8();
    }

    /* JADX INFO: renamed from: v0 */
    public static int m24321v0() {
        if (NullChecker.a(CoreModule.f1534c.m3414o3())) {
            return CoreModule.f1534c.m3414o3().superLikeLimit.remainToday();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v1 */
    public static void m24322v1(Act act, String str, final e30<String> e30Var) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
        } else {
            new fd5.e(act).j(PurchaseType.TYPE_INTL_TTT_COIN).d(str).c(31).g(new g30() { // from class: l.cwh0
                /* JADX INFO: renamed from: a */
                public final void m13681a(Object obj, Object obj2, Object obj3) {
                    swh0.m24316t(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).l();
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m24323w() {
        return j17.m17201z3() > 0;
    }

    /* JADX INFO: renamed from: w0 */
    public static int m24324w0(int i) {
        if (!CoreModule.m1854P().m11706a().m5479m3()) {
            return (CoreModule.m1851K().xf() ? m24293k0() : m24281e0()) + i;
        }
        if (i != 0) {
            return 200000;
        }
        m24246H0();
        return 200000;
    }

    /* JADX INFO: renamed from: w1 */
    public static void m24325w1(Act act, String str) {
        m24328x1(act, str, null);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m24326x(Privilege privilege) {
        Counter counterM3414o3 = CoreModule.f1534c.m3414o3();
        if (Privilege.vip_super_like == privilege) {
            return CoreModule.f1534c.f3628e0.m21490p9().isVIP() || (counterM3414o3 != null && counterM3414o3.superLikeLimit.remaining > 0);
        }
        if (Privilege.online_match_tickets_extra == privilege) {
            return CoreModule.m1854P().m11706a().m5405b3() > 0 || CoreModule.m1854P().m11706a().m5571z9() || CoreModule.f1534c.f3628e0.m21490p9().isFemale();
        }
        if (Privilege.boost == privilege) {
            return true;
        }
        if (Privilege.accelerate_pairing == privilege || Privilege.see_greet_gp == privilege || Privilege.letter == privilege || Privilege.vip_letter_gp == privilege) {
            return false;
        }
        if (Privilege.see_letter_gp == privilege) {
            return CoreModule.m1854P().m11706a().m5315No() && n3b0.i() > 0;
        }
        if (Privilege.intl_message_read == privilege) {
            return CoreModule.m1854P().m11706a().m5289Kf();
        }
        if (Privilege.immediately_match == privilege) {
            return CoreModule.f1546o.m25559d().m5703Vd() && CoreModule.f1546o.m25559d().m5737aq();
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m24327x0() {
        return m24321v0() + (CoreModule.m1851K().xf() ? m24293k0() : m24281e0());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m24328x1(Act act, String str, g30<PurchaseType, Act, String> g30Var) {
        if (IntlCountryCodeController.m10k()) {
            kkp0.m18162c(act, act.pageId());
            return;
        }
        fd5.e eVarC = new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(2);
        if (NullChecker.a(g30Var)) {
            eVarC.g(g30Var);
        }
        eVarC.l();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m24329y() {
        return CoreModule.m1854P().m11706a().m5523s8() && m24261P();
    }

    /* JADX INFO: renamed from: y1 */
    public static void m24330y1(Act act, String str, int i, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        new fd5.e(act).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).d(str).c(25).g(g30Var).f(d30Var).k(i).l();
    }

    /* JADX INFO: renamed from: z */
    public static void m24331z(final Act act, String str) {
        if (m24309q0() <= 0) {
            m24312r1(act, str, CoreModule.f1534c.f3559H0.m27495B4());
        } else {
            m24231B1(act, PurchaseType.TYPE_INTL_READ_MESSAGE, new d30() { // from class: l.dwh0
                public final void call() {
                    swh0.m24308q(act);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static void m24332z1(Act act, String str, g30<PurchaseType, Act, String> g30Var, d30 d30Var) {
        new fd5.e(act).j(PurchaseType.TYPE_INTL_TTT_COIN).d(str).c(13).f(d30Var).g(g30Var).l();
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m24333A0() {
        return ((Boolean) this.f21712h.get()).booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m24334C0() {
        return ((Boolean) this.f21727w.get()).booleanValue();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m24335D0() {
        return ((Boolean) this.f21710f.get()).booleanValue();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m24336I0() {
        return ((Boolean) this.f21725u.get()).booleanValue();
    }

    /* JADX INFO: renamed from: J0 */
    public void m24337J0(boolean z) {
        this.f21706b.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K0 */
    public void m24338K0(boolean z) {
        this.f21720p.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K1 */
    public boolean m24339K1() {
        return ((Boolean) this.f21708d.get()).booleanValue();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m24340L0(boolean z) {
        return this.f21714j.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: M0 */
    public void m24341M0(String str) {
        this.f21722r.put(str);
    }

    /* JADX INFO: renamed from: N0 */
    public void m24342N0(PayMethod payMethod) {
        LinkedList<String> linkedListM24370r0 = m24370r0();
        if (linkedListM24370r0.contains(String.valueOf(1)) || linkedListM24370r0.contains(String.valueOf(3))) {
            final LinkedList<String> linkedList = new LinkedList<>();
            vwb.z(linkedListM24370r0, new e30() { // from class: l.mwh0
                public final void call(Object obj) {
                    swh0.m24272a(linkedList, (String) obj);
                }
            });
            linkedListM24370r0 = linkedList;
        }
        if (linkedListM24370r0.size() >= 3) {
            linkedListM24370r0.removeLast();
        }
        linkedListM24370r0.addFirst(payMethod.toString());
        this.f21721q.put(new Gson().toJson(linkedListM24370r0));
    }

    /* JADX INFO: renamed from: O0 */
    public void m24343O0(boolean z) {
        this.f21712h.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: P0 */
    public void m24344P0(boolean z) {
        this.f21727w.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q */
    public void m24345Q() {
        this.f21720p.put(Boolean.TRUE);
        this.f21719o.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m24346Q0(boolean z) {
        this.f21710f.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q1 */
    public void m24347Q1(boolean z) {
        this.f21723s.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R0 */
    public void m24348R0(boolean z) {
        this.f21725u.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m24349R1() {
        return ((Boolean) this.f21716l.get()).booleanValue();
    }

    /* JADX INFO: renamed from: S0 */
    public void m24350S0() {
        if (((Boolean) this.f21706b.get()).booleanValue()) {
            this.f21705a.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m24351T0() {
        if (((Boolean) this.f21720p.get()).booleanValue()) {
            this.f21719o.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m24352U0() {
        if (((Boolean) this.f21712h.get()).booleanValue()) {
            this.f21711g.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m24353V0() {
        if (((Boolean) this.f21727w.get()).booleanValue()) {
            this.f21726v.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m24354W0() {
        if (((Boolean) this.f21710f.get()).booleanValue()) {
            this.f21709e.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m24355X0() {
        if (((Boolean) this.f21725u.get()).booleanValue()) {
            this.f21724t.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m24356Y0() {
        if (((Boolean) this.f21708d.get()).booleanValue()) {
            this.f21707c.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m24357Z0() {
        if (((Boolean) this.f21716l.get()).booleanValue()) {
            this.f21715k.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m24358a1(boolean z) {
        this.f21708d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: b1 */
    public void m24359b1(boolean z) {
        this.f21716l.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m24360c1() {
        return (((Boolean) this.f21705a.get()).booleanValue() && ((Boolean) this.f21706b.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m24361d1() {
        return (((Boolean) this.f21719o.get()).booleanValue() && ((Boolean) this.f21720p.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m24362e1() {
        return (((Boolean) this.f21711g.get()).booleanValue() && ((Boolean) this.f21712h.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m24363f1() {
        return (((Boolean) this.f21726v.get()).booleanValue() && ((Boolean) this.f21727w.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m24364g1() {
        return (((Boolean) this.f21709e.get()).booleanValue() && ((Boolean) this.f21710f.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m24365h1() {
        return (((Boolean) this.f21724t.get()).booleanValue() && ((Boolean) this.f21725u.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m24366i1() {
        return !((Boolean) this.f21723s.get()).booleanValue();
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m24367j1() {
        return (((Boolean) this.f21707c.get()).booleanValue() && ((Boolean) this.f21708d.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m24368k1() {
        return (((Boolean) this.f21715k.get()).booleanValue() && ((Boolean) this.f21716l.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m24369l1() {
        if (CoreModule.f1534c.f3587Q1.f4106R.m6696M()) {
            return false;
        }
        LinkedList<String> linkedListM24370r0 = m24370r0();
        if (linkedListM24370r0.size() == 3) {
            return !vwb.y(linkedListM24370r0, new w9j() { // from class: l.gwh0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, "wechat"));
                }
            });
        }
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final LinkedList<String> m24370r0() {
        LinkedList<String> linkedList = new LinkedList<>();
        String str = (String) this.f21721q.get();
        return str.isEmpty() ? linkedList : (LinkedList) new Gson().fromJson(str, new C1287a().getType());
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m24371t0() {
        return ((Boolean) this.f21723s.get()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public boolean m24372u() {
        return ((Boolean) this.f21706b.get()).booleanValue();
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m24373y0() {
        return ((Boolean) this.f21720p.get()).booleanValue();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m24374z0() {
        return ((Boolean) this.f21714j.get()).booleanValue();
    }
}
