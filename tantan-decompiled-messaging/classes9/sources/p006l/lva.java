package p006l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationCenterAct;
import com.p000p1.mobile.putong.core.p004ui.vip.VipAct;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinAct;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p1.mobile.putong.core.ui.account.SwitchAccountAct;
import com.p1.mobile.putong.core.ui.campus.StudentInfoAct;
import com.p1.mobile.putong.core.ui.main.DailyPaperAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.MomentFeedPushArgs;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.putong.ui.webview.mk.AccessTokenMkWebViewAct;
import com.p1.mobile.putong.ui.webview.mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.rud0;
import l.tqm0;
import l.vwb;
import l.wb2;
import l.y9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lva {
    /* JADX INFO: renamed from: A */
    public static Intent m19017A(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return z3 ? AccessTokenMkWebViewAct.p2(context, str, str2, z, false, z2) : AccessTokenWebViewAct.i2(context, str, str2, z, false, z2);
    }

    /* JADX INFO: renamed from: B */
    public static Intent m19018B(Context context, String str) {
        Intent intentX1 = MkDlgWebViewAct.X1(context, "", str);
        intentX1.putExtra("hideNavigationBar", true);
        intentX1.putExtra("skipLoading", true);
        intentX1.putExtra("transparent_status_bar", true);
        intentX1.putExtra("webviewColor", "transparent");
        intentX1.putExtra("hideNotch", true);
        return intentX1;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m19019C(String str) {
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (Character.isDigit(str.charAt(length)));
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static void m19020D(Activity activity, Uri uri) {
        j2e0.m17248m(activity, uri);
    }

    /* JADX INFO: renamed from: E */
    public static void m19021E() {
        j2e0.m17251p("webview", new q1e0());
        j2e0.m17251p("webview_popup", new s1e0());
        j2e0.m17251p("studentVerify", new y0e0());
        j2e0.m17251p("share", new m0e0());
        j2e0.m17251p("setting", new k0e0());
        j2e0.m17251p("goTo", new f1e0());
        j2e0.m17251p("goBack", new vwd0());
        j2e0.m17251p("conversations", new jwd0());
        j2e0.m17251p("secretcrush", new zzd0());
        j2e0.m17251p("profile", new gzd0());
        j2e0.m17251p("moment", new fyd0());
        j2e0.m17251p("vip", new o1e0());
        j2e0.m17251p("svip", new b1e0());
        j2e0.m17251p("see", new a0e0());
        j2e0.m17251p("survey", new a1e0());
        j2e0.m17251p("home", new bxd0());
        j2e0.m17251p("home_welcomeback", new dxd0());
        j2e0.m17251p("switchaccount", new d1e0());
        j2e0.m17251p("vipPurchase", new m1e0());
        j2e0.m17251p("seePurchase", new i0e0());
        j2e0.m17251p("boostPurchase", new mvd0());
        j2e0.m17251p("intlPurchase", new oxd0());
        j2e0.m17251p("superLikePurchase", new z0e0());
        j2e0.m17251p("verificationcenter", new n1e0());
        j2e0.m17251p("seeLikes", new g0e0());
        j2e0.m17251p("mytantan", new nyd0());
        j2e0.m17251p("userCard", new j1e0());
        j2e0.m17251p("push_call2buysee", new ovd0());
        j2e0.m17251p("push_call2buysee_side_new", new pvd0());
        j2e0.m17251p("user_voices", new k1e0());
        j2e0.m17251p("ban.appeal", new ivd0());
        j2e0.m17251p("chatAppeal", new uvd0());
        j2e0.m17251p("contentAppeal", new iwd0());
        j2e0.m17251p("local_message", new byd0());
        j2e0.m17251p("chat", new qvd0());
        j2e0.m17251p("likers", new b0e0());
        j2e0.m17251p("quickChatPurchase", new lzd0());
        j2e0.m17251p("freeTrialPromotion", new uwd0());
        j2e0.m17251p("introPromotion", new txd0());
        j2e0.m17251p("helpcenter", new axd0());
        j2e0.m17251p("newMoment", new m2e0());
        j2e0.m17251p("oms", new x0e0());
        j2e0.m17251p("subscriptions", new y2e0());
        j2e0.m17251p("quickChat2Floor", new sud0());
        j2e0.m17251p("ultra", new h1e0());
        j2e0.m17251p("tribe-promotion", new g1e0());
        j2e0.m17252q(vwb.f0(new String[]{"HOME", "STVE", "CONV", "SECR", "SETT", "PROF", "PRED", "MOME", "VIVI", "VISE", "VIBO", "VIVB", "VISB", "VIBB", "SELI", "PLAC", "MYTT", "CRSC", "USCA", "PCBS", "PCSN", "SMSN", "CHAT", "SWAC", "VECE", "MOUS", "MODE", "FKGD"}), new y9j() { // from class: l.kva
            /* JADX INFO: renamed from: a */
            public final Object m18271a(Object obj, Object obj2, Object obj3) {
                return lva.m19042u((String) obj, (Context) obj2, (Uri) obj3);
            }
        });
        j2e0.m17251p("h5pay", new zwd0());
        j2e0.m17251p("coPay", new yvd0());
        j2e0.m17251p("webview_for_coda", new bwd0());
        j2e0.m17251p("wallet", new p1e0());
        j2e0.m17251p("user", new i1e0());
        j2e0.m17251p("profileEdit", new hzd0());
        j2e0.m17251p("topic", new wwd0());
        j2e0.m17251p("realpicVerify", new mzd0());
        j2e0.m17251p("actualnameVerify", new evd0());
        j2e0.m17251p("fake2good", new lwd0());
        j2e0.m17251p("newmytantan_call2buysee", new pyd0());
        j2e0.m17251p("liveUserProfile", new ayd0());
        j2e0.m17251p("join_group", new g2e0());
        j2e0.m17251p("group", new oud0());
        j2e0.m17251p("zendesk", new u1e0());
        j2e0.m17251p("omsDialog", new rud0());
        j2e0.m17251p("seePicks", new h0e0());
        j2e0.m17251p("game_home", new cxd0());
        j2e0.m17251p("ussswipe", new l1e0());
        j2e0.m17251p("browser", new nvd0());
        j2e0.m17251p("payment", new cwd0());
        j2e0.m17251p("tarot", new e1e0());
        j2e0.m17251p("knowMyselfShare", new yxd0());
        j2e0.m17251p("sameline", new zxd0());
        j2e0.m17251p("knowMyselfMK", new xxd0());
        j2e0.m17251p("horoscope", new exd0());
        j2e0.m17251p("shareUserCard", new r0e0());
        j2e0.m17251p("shareUserMoment", new w0e0());
        j2e0.m17251p("fake-batch-feedback", new pwd0());
        j2e0.m17251p("pettune", new ixd0());
        j2e0.m17251p("sportsman", new ixd0());
        j2e0.m17251p("trip", new ixd0());
        j2e0.m17251p("intl520", new ixd0());
        j2e0.m17251p("campingactivity", new ixd0());
        j2e0.m17251p("regular_main_popup", new ixd0());
        j2e0.m17251p("web", new jxd0());
        j2e0.m17251p("loveBuzz", new cyd0());
        j2e0.m17251p("jumpToMarket", new wxd0());
        j2e0.m17251p("myMeet", new eyd0());
        j2e0.m17251p("intlquickrecharge", new rxd0());
        j2e0.m17251p("diamond", new qyd0());
        j2e0.m17251p("monetization", new xzd0());
        j2e0.m17251p("sendMessage", new j0e0());
        j2e0.m17251p("jumpChat", new uxd0());
        j2e0.m17251p("monetization_promotion", new oyd0());
        j2e0.m17251p("msgReport", new myd0());
        j2e0.m17251p("boost", new lvd0());
        j2e0.m17251p("accelerateMatch", new zud0());
        j2e0.m17251p("create_ai_avatar", new v2e0());
        j2e0.m17251p("membership", new uzd0());
        j2e0.m17251p("intlNativeRecharge", new lxd0());
        j2e0.m17251p("verification", new hvd0());
        j2e0.m17251p("aiAvatar", new fvd0());
        j2e0.m17251p("edit", new v1e0());
        j2e0.m17251p("marriageGuide", new dyd0());
        j2e0.m17251p("intl_spam_control", new d2e0());
        j2e0.m17251p("cityCPurchase", new vvd0());
        j2e0.m17251p("suggestMarryProfile", new z2e0());
        j2e0.m17251p("picksZoneEditProfile", new ryd0());
        j2e0.m17251p("loveRadarSettings", new h2e0());
        j2e0.m17251p("quickchat", new kzd0());
        j2e0.m17251p("iLikes", new hxd0());
        j2e0.m17251p("growth_explore", new kwd0());
        j2e0.m17251p("commonDialog", new ewd0());
        j2e0.m17251p("femaleVIP", new rwd0());
        j2e0.m17251p("youthVipPurchase", new t1e0());
        j2e0.m17251p("avatarExample", new gvd0());
        j2e0.m17251p("swapAnswer", new c1e0());
        j2e0.m17251p("user_mirror", new jzd0());
        j2e0.m17251p("privacy_management", new ezd0());
        j2e0.m17251p("reject_msg", new yzd0());
        j2e0.m17251p("birthday", new kvd0());
        j2e0.m17251p("account", new dvd0());
        j2e0.m17251p("intlTribe", new sxd0());
    }

    /* JADX INFO: renamed from: b */
    public static Intent m19023b(Context context, String str) {
        return VipAct.m9669a2(context);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m19024c(Context context) {
        return DailyPaperAct.e2(context, true);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m19025d(Context context) {
        return NewMainAct.I5(context, NavigationIntent.get("live"));
    }

    /* JADX INFO: renamed from: e */
    public static Intent m19026e(Context context) {
        return NewMainAct.I5(context, (NavigationIntent) null);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m19027f(Context context) {
        return NewMainAct.I5(context, NavigationIntent.get("cards"));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m19028g(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return NewMainAct.K5(context, NavigationIntent.get("cards"), navigationCardIntent, map);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m19029h(Context context, String str) {
        return NewMainAct.W6(context, NavigationIntent.get("cards"), "card_push_link", str);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m19030i(Context context, String str) {
        return NewMainAct.W6(context, NavigationIntent.get("cards"), "oms_dialog_link", str);
    }

    /* JADX INFO: renamed from: j */
    public static Intent m19031j(Context context) {
        return NewMainAct.I5(context, NavigationIntent.get("welcomeBack"));
    }

    /* JADX INFO: renamed from: k */
    public static Intent m19032k(Context context, NavigationIntent navigationIntent) {
        return NewMainAct.I5(context, navigationIntent);
    }

    /* JADX INFO: renamed from: l */
    public static Intent m19033l(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("userId");
        int i = Integer.parseInt(uri.getQueryParameter("from"));
        String queryParameter2 = uri.getQueryParameter("push_type");
        boolean z = Boolean.parseBoolean(uri.getQueryParameter("showKeyboard"));
        if (!TextUtils.isEmpty(queryParameter2)) {
            try {
                return NewMainAct.U6(context, queryParameter, i, Integer.parseInt(queryParameter2), z);
            } catch (Exception unused) {
            }
        }
        return NewMainAct.V6(context, queryParameter, i, z);
    }

    /* JADX INFO: renamed from: m */
    public static Intent m19034m(Context context, int i, String str, boolean z, String str2, String str3) {
        return MessagesAct.g2(context, str, z, i, str2, str3);
    }

    /* JADX INFO: renamed from: n */
    public static Intent m19035n(Context context, String str, int i) {
        return m19036o(context, str, i, false);
    }

    /* JADX INFO: renamed from: o */
    public static Intent m19036o(Context context, String str, int i, boolean z) {
        if (wb2.b(context, NewMainAct.class) && wb2.c()) {
            return MessagesAct.m2(context, str, false, false, i, z);
        }
        Intent intent = new Intent(CoreModule.f1533b, (Class<?>) qib0.f19804b0.f17706a.mo68t5());
        intent.setData(Uri.parse(wb2.a(str, i, z)));
        return intent;
    }

    /* JADX INFO: renamed from: p */
    public static Intent m19037p(Context context, Uri uri, String str) {
        String queryParameter = uri.getQueryParameter("uid");
        String queryParameter2 = uri.getQueryParameter("mid");
        if (!TextUtils.isEmpty(queryParameter)) {
            CoreModule.m1853N().coreMomentLatest(queryParameter);
            MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
            momentFeedPushArgsNew_.uid = queryParameter;
            momentFeedPushArgsNew_.mid = queryParameter2;
            momentFeedPushArgsNew_.path = str;
            CoreModule.f1534c.f3628e0.f18746A0.onNext(momentFeedPushArgsNew_);
        }
        return m19039r(context);
    }

    /* JADX INFO: renamed from: q */
    public static Intent m19038q(Context context) {
        return NewMainAct.I5(context, NavigationIntent.get("profile"));
    }

    /* JADX INFO: renamed from: r */
    public static Intent m19039r(Context context) {
        return NewMainAct.I5(context, NavigationIntent.get("moment"));
    }

    /* JADX INFO: renamed from: s */
    public static Intent m19040s(Context context, Uri uri) {
        return j2e0.m17240e(context, uri);
    }

    /* JADX INFO: renamed from: t */
    public static Intent m19041t(Context context, String str) {
        NavigationIntent navigationIntent;
        if ("msg_call2buysee".equals(str)) {
            navigationIntent = NavigationIntent.get("seeSideMsg");
        } else {
            navigationIntent = "msg_call2buysee_side_new".equals(str) ? NavigationIntent.get("seeSideNewMsg") : null;
        }
        return m19032k(context, navigationIntent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: u */
    public static Intent m19042u(String str, Context context, Uri uri) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "MTCARD":
                return m19028g(context, NavigationCardIntent.get("moment_theme_card"), null);
            case "CHAT":
                String queryParameter = uri.getQueryParameter("uid");
                if (!TextUtils.isEmpty(queryParameter)) {
                    Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(queryParameter);
                    if (NullChecker.a(conversationM4786Xe) && TEnum.equals(conversationM4786Xe.status, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
                        return m19035n(context, queryParameter, 1);
                    }
                }
                return null;
            case "CONV":
                return m19032k(context, NavigationIntent.get("menu"));
            case "HOME":
                return m19027f(context);
            case "MODE":
                return m19037p(context, uri, "detail");
            case "MOME":
                return m19039r(context);
            case "MOUS":
                return m19037p(context, uri, "user");
            case "MYTT":
                return m19024c(context);
            case "PCBS":
                return m19032k(context, NavigationIntent.get("seeSidePush"));
            case "PCSN":
                return m19032k(context, NavigationIntent.get("seeSideNewPush"));
            case "PRED":
                return m19032k(context, NavigationIntent.get("profile_edit"));
            case "PROF":
                return m19032k(context, NavigationIntent.get("profile"));
            case "SECR":
                if (!TEnum.equals(CoreModule.f1534c.f3628e0.m21490p9().source, "facebook")) {
                    return m19032k(context, NavigationIntent.get("secret crush"));
                }
                return null;
            case "SELI":
                if (vdj.m25806c()) {
                    return m19032k(context, NavigationIntent.get("seeLikes"));
                }
                return null;
            case "SETT":
                return m19032k(context, NavigationIntent.get("setting"));
            case "SMSN":
                return m19032k(context, NavigationIntent.get("seeSideNewMsg"));
            case "STVE":
                return StudentInfoAct.V1(CoreModule.f1533b, (String) null, true);
            case "SWAC":
                return m19044w(context);
            case "USCA":
                if (!TextUtils.isEmpty(uri.getQueryParameter("uid"))) {
                    return m19029h(context, uri.toString());
                }
                return null;
            case "VECE":
                return VerificationCenterAct.m9411X1(context, true);
            case "VIBB":
                if (vdj.m25806c()) {
                    return m19045x(context, "boost/buy", null);
                }
                return null;
            case "VIBO":
                if (vdj.m25806c()) {
                    return m19045x(context, "boost", null);
                }
                return null;
            case "VISB":
                if (vdj.m25806c()) {
                    return m19045x(context, "see/buy", null);
                }
                return null;
            case "VISE":
                if (vdj.m25806c()) {
                    return m19045x(context, "see", null);
                }
                return null;
            case "VIVB":
                if (vdj.m25806c()) {
                    return m19045x(context, "vip/buy", null);
                }
                return null;
            case "VIVI":
                if (vdj.m25806c()) {
                    return m19045x(context, "vip", null);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static Intent m19043v(Context context, String str, String str2) {
        if (str.endsWith("/buy")) {
            return VipAct.m9674g2(context, str2, khl0.m18123a(str.split("/")[0]), str);
        }
        return !TextUtils.isEmpty(str2) ? VipAct.m9673e2(context, str2, khl0.m18123a(str)) : VipAct.m9670b2(context, khl0.m18123a(str));
    }

    /* JADX INFO: renamed from: w */
    public static Intent m19044w(Context context) {
        return SwitchAccountAct.V1(context, "scheme_switch");
    }

    /* JADX INFO: renamed from: x */
    public static Intent m19045x(Context context, String str, String str2) {
        if (str.endsWith("/buy")) {
            return VipAct.m9674g2(context, str2, khl0.m18123a(str.split("/")[0]), str);
        }
        return !TextUtils.isEmpty(str2) ? VipAct.m9673e2(context, str2, khl0.m18123a(str)) : VipAct.m9670b2(context, khl0.m18123a(str));
    }

    /* JADX INFO: renamed from: y */
    public static Intent m19046y(Context context) {
        if (tqm0.p().s()) {
            return m19026e(context);
        }
        return !wb2.b(context, NewMainAct.class) ? m19026e(context) : VoiceCallAct.Z1(context);
    }

    /* JADX INFO: renamed from: z */
    public static Intent m19047z(Context context) {
        return TanTanCoinAct.m11603Y1(context, true);
    }
}
