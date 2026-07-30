package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p051p1.mobile.putong.core.p058ui.account.SwitchAccountAct;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.core.p058ui.main.DailyPaperAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinAct;
import com.p051p1.mobile.putong.data.MomentFeedPushArgs;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public class xwa {
    /* JADX INFO: renamed from: A */
    public static Intent m213301A(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return z3 ? AccessTokenMkWebViewAct.m81363q2(context, str, str2, z, false, z2) : AccessTokenWebViewAct.m81337k2(context, str, str2, z, false, z2);
    }

    /* JADX INFO: renamed from: B */
    public static Intent m213302B(Context context, String str) {
        Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(context, "", str);
        intentM81411Y1.putExtra("hideNavigationBar", true);
        intentM81411Y1.putExtra("skipLoading", true);
        intentM81411Y1.putExtra("transparent_status_bar", true);
        intentM81411Y1.putExtra("webviewColor", "transparent");
        intentM81411Y1.putExtra("hideNotch", true);
        return intentM81411Y1;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m213303C(String str) {
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
    public static void m213304D(Activity activity, Uri uri) {
        nae0.m162083m(activity, uri);
    }

    /* JADX INFO: renamed from: E */
    public static void m213305E() {
        nae0.m162086p("webview", new u9e0());
        nae0.m162086p(SchemeKey.webview_popup, new w9e0());
        nae0.m162086p(SchemeKey.studentVerify, new c9e0());
        nae0.m162086p("share", new q8e0());
        nae0.m162086p("setting", new o8e0());
        nae0.m162086p(SchemeKey.goTo, new j9e0());
        nae0.m162086p(SchemeKey.goBack, new z4e0());
        nae0.m162086p(SchemeKey.conversations, new n4e0());
        nae0.m162086p("secretcrush", new d8e0());
        nae0.m162086p("profile", new k7e0());
        nae0.m162086p("moment", new j6e0());
        nae0.m162086p("vip", new s9e0());
        nae0.m162086p("svip", new f9e0());
        nae0.m162086p("see", new e8e0());
        nae0.m162086p("survey", new e9e0());
        nae0.m162086p("home", new f5e0());
        nae0.m162086p(SchemeKey.home_welcomeback, new h5e0());
        nae0.m162086p(SchemeKey.switchaccount, new h9e0());
        nae0.m162086p(SchemeKey.vipPurchase, new q9e0());
        nae0.m162086p(SchemeKey.seePurchase, new m8e0());
        nae0.m162086p(SchemeKey.boostPurchase, new q3e0());
        nae0.m162086p(SchemeKey.intlPurchase, new s5e0());
        nae0.m162086p(SchemeKey.superLikePurchase, new d9e0());
        nae0.m162086p("verificationcenter", new r9e0());
        nae0.m162086p("seeLikes", new k8e0());
        nae0.m162086p("mytantan", new r6e0());
        nae0.m162086p("userCard", new n9e0());
        nae0.m162086p(SchemeKey.push_call2buysee, new s3e0());
        nae0.m162086p(SchemeKey.push_call2buysee_side_new, new t3e0());
        nae0.m162086p(SchemeKey.user_voices, new o9e0());
        nae0.m162086p(SchemeKey.ban_appeal, new m3e0());
        nae0.m162086p(SchemeKey.chatAppeal, new y3e0());
        nae0.m162086p(SchemeKey.contentAppeal, new m4e0());
        nae0.m162086p(SchemeKey.local_message, new f6e0());
        nae0.m162086p("chat", new u3e0());
        nae0.m162086p("likers", new f8e0());
        nae0.m162086p(SchemeKey.quickChatPurchase, new p7e0());
        nae0.m162086p("freeTrialPromotion", new y4e0());
        nae0.m162086p("introPromotion", new x5e0());
        nae0.m162086p(SchemeKey.helpcenter, new e5e0());
        nae0.m162086p(SchemeKey.newMoment, new qae0());
        nae0.m162086p(SchemeKey.oms, new b9e0());
        nae0.m162086p(SchemeKey.subscriptions, new cbe0());
        nae0.m162086p("quickChat2Floor", new w2e0());
        nae0.m162086p("ultra", new l9e0());
        nae0.m162086p("tribe-promotion", new k9e0());
        nae0.m162087q(jyb.m147507f0("HOME", "STVE", "CONV", "SECR", "SETT", "PROF", "PRED", "MOME", "VIVI", "VISE", "VIBO", "VIVB", "VISB", "VIBB", "SELI", "PLAC", "MYTT", "CRSC", "USCA", "PCBS", "PCSN", "SMSN", "CHAT", "SWAC", "VECE", "MOUS", "MODE", "FKGD"), new scj() { // from class: l.wwa
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return xwa.m213326u((String) obj, (Context) obj2, (Uri) obj3);
            }
        });
        nae0.m162086p(SchemeKey.h5pay, new d5e0());
        nae0.m162086p(SchemeKey.coPay, new c4e0());
        nae0.m162086p(SchemeKey.webview_for_coda, new f4e0());
        nae0.m162086p("wallet", new t9e0());
        nae0.m162086p("user", new m9e0());
        nae0.m162086p(SchemeKey.profileEdit, new l7e0());
        nae0.m162086p("topic", new a5e0());
        nae0.m162086p(SchemeKey.realpicVerify, new q7e0());
        nae0.m162086p(SchemeKey.actualnameVerify, new i3e0());
        nae0.m162086p(SchemeKey.fake2good, new p4e0());
        nae0.m162086p(SchemeKey.newmytantan_call2buysee, new t6e0());
        nae0.m162086p(SchemeKey.liveUserProfile, new e6e0());
        nae0.m162086p("join_group", new kae0());
        nae0.m162086p("group", new s2e0());
        nae0.m162086p(SchemeKey.zendesk, new y9e0());
        nae0.m162086p(SchemeKey.omsDialog, new v2e0());
        nae0.m162086p("seePicks", new l8e0());
        nae0.m162086p(SchemeKey.game_home, new g5e0());
        nae0.m162086p(SchemeKey.ussswipe, new p9e0());
        nae0.m162086p("browser", new r3e0());
        nae0.m162086p(SchemeKey.payment, new g4e0());
        nae0.m162086p(SchemeKey.tarot, new i9e0());
        nae0.m162086p(SchemeKey.knowMyselfShare, new c6e0());
        nae0.m162086p(SchemeKey.sameline, new d6e0());
        nae0.m162086p(SchemeKey.knowMyselfMK, new b6e0());
        nae0.m162086p(SchemeKey.horoscope, new i5e0());
        nae0.m162086p(SchemeKey.shareUserCard, new v8e0());
        nae0.m162086p(SchemeKey.shareUserMoment, new a9e0());
        nae0.m162086p(SchemeKey.fake_batch_feedback, new t4e0());
        nae0.m162086p(SchemeKey.pettune, new m5e0());
        nae0.m162086p(SchemeKey.sportsman, new m5e0());
        nae0.m162086p("trip", new m5e0());
        nae0.m162086p(SchemeKey.intl520, new m5e0());
        nae0.m162086p(SchemeKey.campingactivity, new m5e0());
        nae0.m162086p("regular_main_popup", new m5e0());
        nae0.m162086p(SchemeKey.web, new n5e0());
        nae0.m162086p("loveBuzz", new g6e0());
        nae0.m162086p(SchemeKey.jumpToMarket, new a6e0());
        nae0.m162086p(SchemeKey.myMeet, new i6e0());
        nae0.m162086p(SchemeKey.intlquickrecharge, new v5e0());
        nae0.m162086p("diamond", new u6e0());
        nae0.m162086p(SchemeKey.monetization, new b8e0());
        nae0.m162086p(SchemeKey.sendMessage, new n8e0());
        nae0.m162086p(SchemeKey.jumpChat, new y5e0());
        nae0.m162086p(SchemeKey.monetization_promotion, new s6e0());
        nae0.m162086p("msgReport", new q6e0());
        nae0.m162086p("boost", new p3e0());
        nae0.m162086p(SchemeKey.accelerateMatch, new d3e0());
        nae0.m162086p("create_ai_avatar", new zae0());
        nae0.m162086p("membership", new y7e0());
        nae0.m162086p(SchemeKey.intlNativeRecharge, new p5e0());
        nae0.m162086p("verification", new l3e0());
        nae0.m162086p(SchemeKey.aiAvatar, new j3e0());
        nae0.m162086p(SchemeKey.edit, new z9e0());
        nae0.m162086p(SchemeKey.marriageGuide, new h6e0());
        nae0.m162086p(SchemeKey.intl_spam_control, new hae0());
        nae0.m162086p("cityCPurchase", new z3e0());
        nae0.m162086p("suggestMarryProfile", new dbe0());
        nae0.m162086p(SchemeKey.picksZoneEditProfile, new v6e0());
        nae0.m162086p(SchemeKey.loveRadarSettings, new lae0());
        nae0.m162086p("quickchat", new o7e0());
        nae0.m162086p(SchemeKey.iLikes, new l5e0());
        nae0.m162086p(SchemeKey.growth_explore, new o4e0());
        nae0.m162086p(SchemeKey.commonDialog, new i4e0());
        nae0.m162086p(SchemeKey.femaleVIP, new v4e0());
        nae0.m162086p(SchemeKey.youthVipPurchase, new x9e0());
        nae0.m162086p(SchemeKey.avatarExample, new k3e0());
        nae0.m162086p(SchemeKey.swapAnswer, new g9e0());
        nae0.m162086p(SchemeKey.user_mirror, new n7e0());
        nae0.m162086p(SchemeKey.privacy_management, new i7e0());
        nae0.m162086p(SchemeKey.reject_msg, new c8e0());
        nae0.m162086p("birthday", new o3e0());
        nae0.m162086p(SchemeKey.account, new h3e0());
        nae0.m162086p("intlTribe", new w5e0());
    }

    /* JADX INFO: renamed from: b */
    public static Intent m213307b(Context context, String str) {
        return VipAct.m57419b2(context);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m213308c(Context context) {
        return DailyPaperAct.m48511g2(context, true);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m213309d(Context context) {
        return NewMainAct.m40697M5(context, NavigationIntent.get("live"));
    }

    /* JADX INFO: renamed from: e */
    public static Intent m213310e(Context context) {
        return NewMainAct.m40697M5(context, null);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m213311f(Context context) {
        return NewMainAct.m40697M5(context, NavigationIntent.get("cards"));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m213312g(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return NewMainAct.m40702O5(context, NavigationIntent.get("cards"), navigationCardIntent, map);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m213313h(Context context, String str) {
        return NewMainAct.m40733c7(context, NavigationIntent.get("cards"), "card_push_link", str);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m213314i(Context context, String str) {
        return NewMainAct.m40733c7(context, NavigationIntent.get("cards"), "oms_dialog_link", str);
    }

    /* JADX INFO: renamed from: j */
    public static Intent m213315j(Context context) {
        return NewMainAct.m40697M5(context, NavigationIntent.get(NavigationIntent.welcomeBack));
    }

    /* JADX INFO: renamed from: k */
    public static Intent m213316k(Context context, NavigationIntent navigationIntent) {
        return NewMainAct.m40697M5(context, navigationIntent);
    }

    /* JADX INFO: renamed from: l */
    public static Intent m213317l(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("userId");
        int i = Integer.parseInt(uri.getQueryParameter("from"));
        String queryParameter2 = uri.getQueryParameter("push_type");
        boolean z = Boolean.parseBoolean(uri.getQueryParameter("showKeyboard"));
        if (!TextUtils.isEmpty(queryParameter2)) {
            try {
                return NewMainAct.m40729a7(context, queryParameter, i, Integer.parseInt(queryParameter2), z);
            } catch (Exception unused) {
            }
        }
        return NewMainAct.m40731b7(context, queryParameter, i, z);
    }

    /* JADX INFO: renamed from: m */
    public static Intent m213318m(Context context, int i, String str, boolean z, String str2, String str3) {
        return MessagesAct.m50124h2(context, str, z, i, str2, str3);
    }

    /* JADX INFO: renamed from: n */
    public static Intent m213319n(Context context, String str, int i) {
        return m213320o(context, str, i, false);
    }

    /* JADX INFO: renamed from: o */
    public static Intent m213320o(Context context, String str, int i, boolean z) {
        if (dc2.m115210b(context, NewMainAct.class) && dc2.m115211c()) {
            return MessagesAct.m50129n2(context, str, false, false, i, z);
        }
        Intent intent = new Intent(CoreModule.f18263b, (Class<?>) uqb0.f180396b0.f170324a.mo29172t5());
        intent.setData(Uri.parse(dc2.m115209a(str, i, z)));
        return intent;
    }

    /* JADX INFO: renamed from: p */
    public static Intent m213321p(Context context, Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(Oauth2AccessToken.KEY_UID);
        String queryParameter2 = uri.getQueryParameter(BaseSei.MID);
        if (!TextUtils.isEmpty(queryParameter)) {
            CoreModule.m30932N().coreMomentLatest(queryParameter);
            MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
            momentFeedPushArgsNew_.uid = queryParameter;
            momentFeedPushArgsNew_.mid = queryParameter2;
            momentFeedPushArgsNew_.path = str;
            CoreModule.f18264c.f20381e0.f88991A0.onNext(momentFeedPushArgsNew_);
        }
        return m213323r(context);
    }

    /* JADX INFO: renamed from: q */
    public static Intent m213322q(Context context) {
        return NewMainAct.m40697M5(context, NavigationIntent.get("profile"));
    }

    /* JADX INFO: renamed from: r */
    public static Intent m213323r(Context context) {
        return NewMainAct.m40697M5(context, NavigationIntent.get("moment"));
    }

    /* JADX INFO: renamed from: s */
    public static Intent m213324s(Context context, Uri uri) {
        return nae0.m162075e(context, uri);
    }

    /* JADX INFO: renamed from: t */
    public static Intent m213325t(Context context, String str) {
        NavigationIntent navigationIntent;
        if ("msg_call2buysee".equals(str)) {
            navigationIntent = NavigationIntent.get(NavigationIntent.seeSideMsg);
        } else {
            navigationIntent = "msg_call2buysee_side_new".equals(str) ? NavigationIntent.get(NavigationIntent.seeSideNewMsg) : null;
        }
        return m213316k(context, navigationIntent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public static Intent m213326u(String str, Context context, Uri uri) {
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
                return m213312g(context, NavigationCardIntent.get(NavigationCardIntent.moment_theme_card), null);
            case 1:
                String queryParameter = uri.getQueryParameter(Oauth2AccessToken.KEY_UID);
                if (!TextUtils.isEmpty(queryParameter)) {
                    Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(queryParameter);
                    if (NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "default")) {
                        return m213319n(context, queryParameter, 1);
                    }
                }
                return null;
            case 2:
                return m213316k(context, NavigationIntent.get(NavigationIntent.menu));
            case 3:
                return m213311f(context);
            case 4:
                return m213321p(context, uri, "detail");
            case 5:
                return m213323r(context);
            case 6:
                return m213321p(context, uri, "user");
            case 7:
                return m213308c(context);
            case 8:
                return m213316k(context, NavigationIntent.get(NavigationIntent.seeSidePush));
            case 9:
                return m213316k(context, NavigationIntent.get(NavigationIntent.seeSideNewPush));
            case 10:
                return m213316k(context, NavigationIntent.get(NavigationIntent.profile_edit));
            case 11:
                return m213316k(context, NavigationIntent.get("profile"));
            case 12:
                if (!TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "facebook")) {
                    return m213316k(context, NavigationIntent.get(NavigationIntent.secret_crush));
                }
                return null;
            case 13:
                if (pgj.m172246c()) {
                    return m213316k(context, NavigationIntent.get("seeLikes"));
                }
                return null;
            case 14:
                return m213316k(context, NavigationIntent.get("setting"));
            case 15:
                return m213316k(context, NavigationIntent.get(NavigationIntent.seeSideNewMsg));
            case 16:
                return StudentInfoAct.m45668X1(CoreModule.f18263b, null, true);
            case 17:
                return m213328w(context);
            case 18:
                if (!TextUtils.isEmpty(uri.getQueryParameter(Oauth2AccessToken.KEY_UID))) {
                    return m213313h(context, uri.toString());
                }
                return null;
            case 19:
                return VerificationCenterAct.m57174Y1(context, true);
            case 20:
                if (pgj.m172246c()) {
                    return m213329x(context, "boost/buy", null);
                }
                return null;
            case 21:
                if (pgj.m172246c()) {
                    return m213329x(context, "boost", null);
                }
                return null;
            case 22:
                if (pgj.m172246c()) {
                    return m213329x(context, "see/buy", null);
                }
                return null;
            case 23:
                if (pgj.m172246c()) {
                    return m213329x(context, "see", null);
                }
                return null;
            case 24:
                if (pgj.m172246c()) {
                    return m213329x(context, "vip/buy", null);
                }
                return null;
            case 25:
                if (pgj.m172246c()) {
                    return m213329x(context, "vip", null);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static Intent m213327v(Context context, String str, String str2) {
        if (str.endsWith("/buy")) {
            return VipAct.m57424h2(context, str2, oql0.m168817a(str.split("/")[0]), str);
        }
        return !TextUtils.isEmpty(str2) ? VipAct.m57423g2(context, str2, oql0.m168817a(str)) : VipAct.m57420c2(context, oql0.m168817a(str));
    }

    /* JADX INFO: renamed from: w */
    public static Intent m213328w(Context context) {
        return SwitchAccountAct.m45379X1(context, "scheme_switch");
    }

    /* JADX INFO: renamed from: x */
    public static Intent m213329x(Context context, String str, String str2) {
        if (str.endsWith("/buy")) {
            return VipAct.m57424h2(context, str2, oql0.m168817a(str.split("/")[0]), str);
        }
        return !TextUtils.isEmpty(str2) ? VipAct.m57423g2(context, str2, oql0.m168817a(str)) : VipAct.m57420c2(context, oql0.m168817a(str));
    }

    /* JADX INFO: renamed from: y */
    public static Intent m213330y(Context context) {
        if (xzm0.m213760p().m213775s()) {
            return m213310e(context);
        }
        return !dc2.m115210b(context, NewMainAct.class) ? m213310e(context) : VoiceCallAct.m45010a2(context);
    }

    /* JADX INFO: renamed from: z */
    public static Intent m213331z(Context context) {
        return TanTanCoinAct.m59261Z1(context, true);
    }
}
