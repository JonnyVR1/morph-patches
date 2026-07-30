package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p046p1.mobile.putong.core.p053ui.account.SwitchAccountAct;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.core.p053ui.main.DailyPaperAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinAct;
import com.p046p1.mobile.putong.data.MomentFeedPushArgs;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public class lva {
    /* JADX INFO: renamed from: A */
    public static Intent m151840A(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return z3 ? AccessTokenMkWebViewAct.m80180p2(context, str, str2, z, false, z2) : AccessTokenWebViewAct.m80154i2(context, str, str2, z, false, z2);
    }

    /* JADX INFO: renamed from: B */
    public static Intent m151841B(Context context, String str) {
        Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(context, "", str);
        intentM80228X1.putExtra("hideNavigationBar", true);
        intentM80228X1.putExtra("skipLoading", true);
        intentM80228X1.putExtra("transparent_status_bar", true);
        intentM80228X1.putExtra("webviewColor", "transparent");
        intentM80228X1.putExtra("hideNotch", true);
        return intentM80228X1;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m151842C(String str) {
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
    public static void m151843D(Activity activity, Uri uri) {
        j2e0.m139446m(activity, uri);
    }

    /* JADX INFO: renamed from: E */
    public static void m151844E() {
        j2e0.m139449p("webview", new q1e0());
        j2e0.m139449p(SchemeKey.webview_popup, new s1e0());
        j2e0.m139449p(SchemeKey.studentVerify, new y0e0());
        j2e0.m139449p("share", new m0e0());
        j2e0.m139449p("setting", new k0e0());
        j2e0.m139449p(SchemeKey.goTo, new f1e0());
        j2e0.m139449p(SchemeKey.goBack, new vwd0());
        j2e0.m139449p(SchemeKey.conversations, new jwd0());
        j2e0.m139449p("secretcrush", new zzd0());
        j2e0.m139449p("profile", new gzd0());
        j2e0.m139449p("moment", new fyd0());
        j2e0.m139449p("vip", new o1e0());
        j2e0.m139449p("svip", new b1e0());
        j2e0.m139449p("see", new a0e0());
        j2e0.m139449p("survey", new a1e0());
        j2e0.m139449p("home", new bxd0());
        j2e0.m139449p(SchemeKey.home_welcomeback, new dxd0());
        j2e0.m139449p(SchemeKey.switchaccount, new d1e0());
        j2e0.m139449p(SchemeKey.vipPurchase, new m1e0());
        j2e0.m139449p(SchemeKey.seePurchase, new i0e0());
        j2e0.m139449p(SchemeKey.boostPurchase, new mvd0());
        j2e0.m139449p(SchemeKey.intlPurchase, new oxd0());
        j2e0.m139449p(SchemeKey.superLikePurchase, new z0e0());
        j2e0.m139449p("verificationcenter", new n1e0());
        j2e0.m139449p("seeLikes", new g0e0());
        j2e0.m139449p("mytantan", new nyd0());
        j2e0.m139449p("userCard", new j1e0());
        j2e0.m139449p(SchemeKey.push_call2buysee, new ovd0());
        j2e0.m139449p(SchemeKey.push_call2buysee_side_new, new pvd0());
        j2e0.m139449p(SchemeKey.user_voices, new k1e0());
        j2e0.m139449p(SchemeKey.ban_appeal, new ivd0());
        j2e0.m139449p(SchemeKey.chatAppeal, new uvd0());
        j2e0.m139449p(SchemeKey.contentAppeal, new iwd0());
        j2e0.m139449p(SchemeKey.local_message, new byd0());
        j2e0.m139449p("chat", new qvd0());
        j2e0.m139449p("likers", new b0e0());
        j2e0.m139449p(SchemeKey.quickChatPurchase, new lzd0());
        j2e0.m139449p("freeTrialPromotion", new uwd0());
        j2e0.m139449p("introPromotion", new txd0());
        j2e0.m139449p(SchemeKey.helpcenter, new axd0());
        j2e0.m139449p(SchemeKey.newMoment, new m2e0());
        j2e0.m139449p(SchemeKey.oms, new x0e0());
        j2e0.m139449p(SchemeKey.subscriptions, new y2e0());
        j2e0.m139449p("quickChat2Floor", new sud0());
        j2e0.m139449p("ultra", new h1e0());
        j2e0.m139449p("tribe-promotion", new g1e0());
        j2e0.m139450q(vwb.m200324f0("HOME", "STVE", "CONV", "SECR", "SETT", "PROF", "PRED", "MOME", "VIVI", "VISE", "VIBO", "VIVB", "VISB", "VIBB", "SELI", "PLAC", "MYTT", "CRSC", "USCA", "PCBS", "PCSN", "SMSN", "CHAT", "SWAC", "VECE", "MOUS", "MODE", "FKGD"), new y9j() { // from class: l.kva
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return lva.m151865u((String) obj, (Context) obj2, (Uri) obj3);
            }
        });
        j2e0.m139449p(SchemeKey.h5pay, new zwd0());
        j2e0.m139449p(SchemeKey.coPay, new yvd0());
        j2e0.m139449p(SchemeKey.webview_for_coda, new bwd0());
        j2e0.m139449p("wallet", new p1e0());
        j2e0.m139449p("user", new i1e0());
        j2e0.m139449p(SchemeKey.profileEdit, new hzd0());
        j2e0.m139449p("topic", new wwd0());
        j2e0.m139449p(SchemeKey.realpicVerify, new mzd0());
        j2e0.m139449p(SchemeKey.actualnameVerify, new evd0());
        j2e0.m139449p(SchemeKey.fake2good, new lwd0());
        j2e0.m139449p(SchemeKey.newmytantan_call2buysee, new pyd0());
        j2e0.m139449p(SchemeKey.liveUserProfile, new ayd0());
        j2e0.m139449p("join_group", new g2e0());
        j2e0.m139449p("group", new oud0());
        j2e0.m139449p(SchemeKey.zendesk, new u1e0());
        j2e0.m139449p(SchemeKey.omsDialog, new rud0());
        j2e0.m139449p("seePicks", new h0e0());
        j2e0.m139449p(SchemeKey.game_home, new cxd0());
        j2e0.m139449p(SchemeKey.ussswipe, new l1e0());
        j2e0.m139449p("browser", new nvd0());
        j2e0.m139449p(SchemeKey.payment, new cwd0());
        j2e0.m139449p(SchemeKey.tarot, new e1e0());
        j2e0.m139449p(SchemeKey.knowMyselfShare, new yxd0());
        j2e0.m139449p(SchemeKey.sameline, new zxd0());
        j2e0.m139449p(SchemeKey.knowMyselfMK, new xxd0());
        j2e0.m139449p(SchemeKey.horoscope, new exd0());
        j2e0.m139449p(SchemeKey.shareUserCard, new r0e0());
        j2e0.m139449p(SchemeKey.shareUserMoment, new w0e0());
        j2e0.m139449p(SchemeKey.fake_batch_feedback, new pwd0());
        j2e0.m139449p(SchemeKey.pettune, new ixd0());
        j2e0.m139449p(SchemeKey.sportsman, new ixd0());
        j2e0.m139449p("trip", new ixd0());
        j2e0.m139449p(SchemeKey.intl520, new ixd0());
        j2e0.m139449p(SchemeKey.campingactivity, new ixd0());
        j2e0.m139449p("regular_main_popup", new ixd0());
        j2e0.m139449p(SchemeKey.web, new jxd0());
        j2e0.m139449p("loveBuzz", new cyd0());
        j2e0.m139449p(SchemeKey.jumpToMarket, new wxd0());
        j2e0.m139449p(SchemeKey.myMeet, new eyd0());
        j2e0.m139449p(SchemeKey.intlquickrecharge, new rxd0());
        j2e0.m139449p("diamond", new qyd0());
        j2e0.m139449p(SchemeKey.monetization, new xzd0());
        j2e0.m139449p(SchemeKey.sendMessage, new j0e0());
        j2e0.m139449p(SchemeKey.jumpChat, new uxd0());
        j2e0.m139449p(SchemeKey.monetization_promotion, new oyd0());
        j2e0.m139449p("msgReport", new myd0());
        j2e0.m139449p("boost", new lvd0());
        j2e0.m139449p(SchemeKey.accelerateMatch, new zud0());
        j2e0.m139449p("create_ai_avatar", new v2e0());
        j2e0.m139449p("membership", new uzd0());
        j2e0.m139449p(SchemeKey.intlNativeRecharge, new lxd0());
        j2e0.m139449p("verification", new hvd0());
        j2e0.m139449p(SchemeKey.aiAvatar, new fvd0());
        j2e0.m139449p(SchemeKey.edit, new v1e0());
        j2e0.m139449p(SchemeKey.marriageGuide, new dyd0());
        j2e0.m139449p(SchemeKey.intl_spam_control, new d2e0());
        j2e0.m139449p("cityCPurchase", new vvd0());
        j2e0.m139449p("suggestMarryProfile", new z2e0());
        j2e0.m139449p(SchemeKey.picksZoneEditProfile, new ryd0());
        j2e0.m139449p(SchemeKey.loveRadarSettings, new h2e0());
        j2e0.m139449p("quickchat", new kzd0());
        j2e0.m139449p(SchemeKey.iLikes, new hxd0());
        j2e0.m139449p(SchemeKey.growth_explore, new kwd0());
        j2e0.m139449p(SchemeKey.commonDialog, new ewd0());
        j2e0.m139449p(SchemeKey.femaleVIP, new rwd0());
        j2e0.m139449p(SchemeKey.youthVipPurchase, new t1e0());
        j2e0.m139449p(SchemeKey.avatarExample, new gvd0());
        j2e0.m139449p(SchemeKey.swapAnswer, new c1e0());
        j2e0.m139449p(SchemeKey.user_mirror, new jzd0());
        j2e0.m139449p(SchemeKey.privacy_management, new ezd0());
        j2e0.m139449p(SchemeKey.reject_msg, new yzd0());
        j2e0.m139449p("birthday", new kvd0());
        j2e0.m139449p(SchemeKey.account, new dvd0());
        j2e0.m139449p("intlTribe", new sxd0());
    }

    /* JADX INFO: renamed from: b */
    public static Intent m151846b(Context context, String str) {
        return VipAct.m56236a2(context);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m151847c(Context context) {
        return DailyPaperAct.m47328e2(context, true);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m151848d(Context context) {
        return NewMainAct.m39685I5(context, NavigationIntent.get("live"));
    }

    /* JADX INFO: renamed from: e */
    public static Intent m151849e(Context context) {
        return NewMainAct.m39685I5(context, null);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m151850f(Context context) {
        return NewMainAct.m39685I5(context, NavigationIntent.get("cards"));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m151851g(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return NewMainAct.m39690K5(context, NavigationIntent.get("cards"), navigationCardIntent, map);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m151852h(Context context, String str) {
        return NewMainAct.m39717W6(context, NavigationIntent.get("cards"), "card_push_link", str);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m151853i(Context context, String str) {
        return NewMainAct.m39717W6(context, NavigationIntent.get("cards"), "oms_dialog_link", str);
    }

    /* JADX INFO: renamed from: j */
    public static Intent m151854j(Context context) {
        return NewMainAct.m39685I5(context, NavigationIntent.get(NavigationIntent.welcomeBack));
    }

    /* JADX INFO: renamed from: k */
    public static Intent m151855k(Context context, NavigationIntent navigationIntent) {
        return NewMainAct.m39685I5(context, navigationIntent);
    }

    /* JADX INFO: renamed from: l */
    public static Intent m151856l(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("userId");
        int i = Integer.parseInt(uri.getQueryParameter("from"));
        String queryParameter2 = uri.getQueryParameter("push_type");
        boolean z = Boolean.parseBoolean(uri.getQueryParameter("showKeyboard"));
        if (!TextUtils.isEmpty(queryParameter2)) {
            try {
                return NewMainAct.m39713U6(context, queryParameter, i, Integer.parseInt(queryParameter2), z);
            } catch (Exception unused) {
            }
        }
        return NewMainAct.m39715V6(context, queryParameter, i, z);
    }

    /* JADX INFO: renamed from: m */
    public static Intent m151857m(Context context, int i, String str, boolean z, String str2, String str3) {
        return MessagesAct.m48941g2(context, str, z, i, str2, str3);
    }

    /* JADX INFO: renamed from: n */
    public static Intent m151858n(Context context, String str, int i) {
        return m151859o(context, str, i, false);
    }

    /* JADX INFO: renamed from: o */
    public static Intent m151859o(Context context, String str, int i, boolean z) {
        if (wb2.m202499b(context, NewMainAct.class) && wb2.m202500c()) {
            return MessagesAct.m48946m2(context, str, false, false, i, z);
        }
        Intent intent = new Intent(CoreModule.f17544b, (Class<?>) qib0.f154713b0.f139230a.mo28173t5());
        intent.setData(Uri.parse(wb2.m202498a(str, i, z)));
        return intent;
    }

    /* JADX INFO: renamed from: p */
    public static Intent m151860p(Context context, Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(Oauth2AccessToken.KEY_UID);
        String queryParameter2 = uri.getQueryParameter(BaseSei.MID);
        if (!TextUtils.isEmpty(queryParameter)) {
            CoreModule.m29934N().coreMomentLatest(queryParameter);
            MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
            momentFeedPushArgsNew_.uid = queryParameter;
            momentFeedPushArgsNew_.mid = queryParameter2;
            momentFeedPushArgsNew_.path = str;
            CoreModule.f17545c.f19639e0.f149134A0.onNext(momentFeedPushArgsNew_);
        }
        return m151862r(context);
    }

    /* JADX INFO: renamed from: q */
    public static Intent m151861q(Context context) {
        return NewMainAct.m39685I5(context, NavigationIntent.get("profile"));
    }

    /* JADX INFO: renamed from: r */
    public static Intent m151862r(Context context) {
        return NewMainAct.m39685I5(context, NavigationIntent.get("moment"));
    }

    /* JADX INFO: renamed from: s */
    public static Intent m151863s(Context context, Uri uri) {
        return j2e0.m139438e(context, uri);
    }

    /* JADX INFO: renamed from: t */
    public static Intent m151864t(Context context, String str) {
        NavigationIntent navigationIntent;
        if ("msg_call2buysee".equals(str)) {
            navigationIntent = NavigationIntent.get(NavigationIntent.seeSideMsg);
        } else {
            navigationIntent = "msg_call2buysee_side_new".equals(str) ? NavigationIntent.get(NavigationIntent.seeSideNewMsg) : null;
        }
        return m151855k(context, navigationIntent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public static Intent m151865u(String str, Context context, Uri uri) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2010885833:
                if (str.equals("MTCARD")) {
                    b = 0;
                }
                break;
            case 2067288:
                if (str.equals("CHAT")) {
                    b = 1;
                }
                break;
            case 2074420:
                if (str.equals("CONV")) {
                    b = 2;
                }
                break;
            case 2223327:
                if (str.equals("HOME")) {
                    b = 3;
                }
                break;
            case 2372003:
                if (str.equals("MODE")) {
                    b = 4;
                }
                break;
            case 2372282:
                if (str.equals("MOME")) {
                    b = 5;
                }
                break;
            case 2372544:
                if (str.equals("MOUS")) {
                    b = 6;
                }
                break;
            case 2382124:
                if (str.equals("MYTT")) {
                    b = 7;
                }
                break;
            case 2449796:
                if (str.equals("PCBS")) {
                    b = 8;
                }
                break;
            case 2450318:
                if (str.equals("PCSN")) {
                    b = 9;
                }
                break;
            case 2464289:
                if (str.equals("PRED")) {
                    b = 10;
                }
                break;
            case 2464601:
                if (str.equals("PROF")) {
                    b = 11;
                }
                break;
            case 2541121:
                if (str.equals("SECR")) {
                    b = 12;
                }
                break;
            case 2541391:
                if (str.equals("SELI")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 2541650:
                if (str.equals("SETT")) {
                    b = 14;
                }
                break;
            case 2549301:
                if (str.equals("SMSN")) {
                    b = 15;
                }
                break;
            case 2556112:
                if (str.equals("STVE")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 2558342:
                if (str.equals("SWAC")) {
                    b = 17;
                }
                break;
            case 2614140:
                if (str.equals("USCA")) {
                    b = 18;
                }
                break;
            case 2630481:
                if (str.equals("VECE")) {
                    b = 19;
                }
                break;
            case 2634291:
                if (str.equals("VIBB")) {
                    b = 20;
                }
                break;
            case 2634304:
                if (str.equals("VIBO")) {
                    b = 21;
                }
                break;
            case 2634818:
                if (str.equals("VISB")) {
                    b = 22;
                }
                break;
            case 2634821:
                if (str.equals("VISE")) {
                    b = 23;
                }
                break;
            case 2634911:
                if (str.equals("VIVB")) {
                    b = 24;
                }
                break;
            case 2634918:
                if (str.equals("VIVI")) {
                    b = 25;
                }
                break;
        }
        switch (b) {
            case 0:
                return m151851g(context, NavigationCardIntent.get(NavigationCardIntent.moment_theme_card), null);
            case 1:
                String queryParameter = uri.getQueryParameter(Oauth2AccessToken.KEY_UID);
                if (!TextUtils.isEmpty(queryParameter)) {
                    Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(queryParameter);
                    if (NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "default")) {
                        return m151858n(context, queryParameter, 1);
                    }
                }
                return null;
            case 2:
                return m151855k(context, NavigationIntent.get(NavigationIntent.menu));
            case 3:
                return m151850f(context);
            case 4:
                return m151860p(context, uri, "detail");
            case 5:
                return m151862r(context);
            case 6:
                return m151860p(context, uri, "user");
            case 7:
                return m151847c(context);
            case 8:
                return m151855k(context, NavigationIntent.get(NavigationIntent.seeSidePush));
            case 9:
                return m151855k(context, NavigationIntent.get(NavigationIntent.seeSideNewPush));
            case 10:
                return m151855k(context, NavigationIntent.get(NavigationIntent.profile_edit));
            case 11:
                return m151855k(context, NavigationIntent.get("profile"));
            case 12:
                if (!TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "facebook")) {
                    return m151855k(context, NavigationIntent.get(NavigationIntent.secret_crush));
                }
                return null;
            case 13:
                if (vdj.m198001c()) {
                    return m151855k(context, NavigationIntent.get("seeLikes"));
                }
                return null;
            case 14:
                return m151855k(context, NavigationIntent.get("setting"));
            case 15:
                return m151855k(context, NavigationIntent.get(NavigationIntent.seeSideNewMsg));
            case 16:
                return StudentInfoAct.m44485V1(CoreModule.f17544b, null, true);
            case 17:
                return m151867w(context);
            case 18:
                if (!TextUtils.isEmpty(uri.getQueryParameter(Oauth2AccessToken.KEY_UID))) {
                    return m151852h(context, uri.toString());
                }
                return null;
            case 19:
                return VerificationCenterAct.m55991X1(context, true);
            case 20:
                if (vdj.m198001c()) {
                    return m151868x(context, "boost/buy", null);
                }
                return null;
            case 21:
                if (vdj.m198001c()) {
                    return m151868x(context, "boost", null);
                }
                return null;
            case 22:
                if (vdj.m198001c()) {
                    return m151868x(context, "see/buy", null);
                }
                return null;
            case 23:
                if (vdj.m198001c()) {
                    return m151868x(context, "see", null);
                }
                return null;
            case 24:
                if (vdj.m198001c()) {
                    return m151868x(context, "vip/buy", null);
                }
                return null;
            case 25:
                if (vdj.m198001c()) {
                    return m151868x(context, "vip", null);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static Intent m151866v(Context context, String str, String str2) {
        if (str.endsWith("/buy")) {
            return VipAct.m56241g2(context, str2, khl0.m145975a(str.split("/")[0]), str);
        }
        return !TextUtils.isEmpty(str2) ? VipAct.m56240e2(context, str2, khl0.m145975a(str)) : VipAct.m56237b2(context, khl0.m145975a(str));
    }

    /* JADX INFO: renamed from: w */
    public static Intent m151867w(Context context) {
        return SwitchAccountAct.m44196V1(context, "scheme_switch");
    }

    /* JADX INFO: renamed from: x */
    public static Intent m151868x(Context context, String str, String str2) {
        if (str.endsWith("/buy")) {
            return VipAct.m56241g2(context, str2, khl0.m145975a(str.split("/")[0]), str);
        }
        return !TextUtils.isEmpty(str2) ? VipAct.m56240e2(context, str2, khl0.m145975a(str)) : VipAct.m56237b2(context, khl0.m145975a(str));
    }

    /* JADX INFO: renamed from: y */
    public static Intent m151869y(Context context) {
        if (tqm0.m190131p().m190146s()) {
            return m151849e(context);
        }
        return !wb2.m202499b(context, NewMainAct.class) ? m151849e(context) : VoiceCallAct.m43824Z1(context);
    }

    /* JADX INFO: renamed from: z */
    public static Intent m151870z(Context context) {
        return TanTanCoinAct.m58078Y1(context, true);
    }
}
