package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveSchema;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.intl.feedback.IntlFeedbackActivity;
import com.p046p1.mobile.putong.live.external.intl.feedback.upload.IntlFeedbackCategoryAct;
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupActivity;
import com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeActivity;
import com.p046p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;
import com.p046p1.mobile.putong.live.external.page.rights.manage.LiveRightAct;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class mwj0 extends pvj0 {

    /* JADX INFO: renamed from: b */
    public static mwj0 f136060b;

    /* JADX INFO: renamed from: a */
    public long f136061a;

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m156657C(Act act, String str, List list) {
        if (vwb.m200296J(list)) {
            return;
        }
        act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67594E(((BLiveVoice) list.get(0)).f44323id).m67604O(str).m67606Q(true).m67611u()));
    }

    /* JADX INFO: renamed from: H */
    public static void m156659H(String str, String str2, String str3, String str4) {
        if ("manager-recall-invite-card".equals(str4)) {
            zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, vwb.m200311Y("audio_card_type", "user_invite_room_admin"));
        } else if ("live-chat-tab-report".equals(str4)) {
            zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, vwb.m200311Y("anchorId", str), vwb.m200311Y("liveId", str2), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("profile_user_id", str3), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_card_type", str4));
        }
    }

    /* JADX INFO: renamed from: I */
    public static pvj0 m156660I() {
        if (f136060b == null) {
            synchronized (mwj0.class) {
                try {
                    if (f136060b == null) {
                        f136060b = new mwj0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f136060b;
    }

    /* JADX INFO: renamed from: O */
    public static String m156661O(String str) {
        try {
            return URLDecoder.decode(new String(Base64.decode(str, 0)), "UTF-8");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Boolean m156669p(Act.C4299r c4299r) {
        WeakReference<Activity> weakReference;
        return Boolean.valueOf((c4299r == null || (weakReference = c4299r.f15343a) == null || weakReference.get() == null || !s9s.f163232f.m134380m(c4299r.f15343a.get())) ? false : true);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m156672s(Act.C4299r c4299r) {
        WeakReference<Activity> weakReference;
        return Boolean.valueOf((c4299r == null || (weakReference = c4299r.f15343a) == null || weakReference.get() == null || !s9s.f163232f.m134380m(c4299r.f15343a.get())) ? false : true);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m156675v(BLiveSchema bLiveSchema) {
        if (l9s.m149072e().signedIn_()) {
            Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
            if (activity == null || TextUtils.isEmpty(bLiveSchema.schema)) {
                return;
            }
            j2e0.m139446m(activity, Uri.parse(bLiveSchema.schema));
            if (TextUtils.isEmpty(bLiveSchema.tip)) {
                return;
            }
            lsi0.m151595y(bLiveSchema.tip);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m156678y(Act act) {
        LiveVerificationApi.requestLiveVerification();
        if (act instanceof LiveWebViewAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m156680A0(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        m156681B0(context, str, str2, str3, str4, null, str5, str6, "", "");
    }

    /* JADX INFO: renamed from: B0 */
    public void m156681B0(final Context context, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9) {
        final String str10 = TextUtils.isEmpty(str3) ? "default" : str3;
        e51.m114748M(new Runnable() { // from class: l.yvj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200267a.m156725l0(context, str2, str3, str, str6, str10, str8, str9, str5, str7, str4);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public void m156682C0(final Act act, final boolean z, w2e0 w2e0Var) {
        String str;
        if (act == null) {
            return;
        }
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        final String strM156661O = m156661O(kxd0.m147736b(mapM201098f, "liveSchema"));
        final String strM147736b = kxd0.m147736b(mapM201098f, "source");
        String strM147736b2 = kxd0.m147736b(mapM201098f, "action");
        final String strM147736b3 = kxd0.m147736b(mapM201098f, "gender");
        final String strM147736b4 = kxd0.m147736b(mapM201098f, "anchor");
        if (TextUtils.isEmpty(strM147736b4)) {
            str = TextUtils.isEmpty(strM147736b) ? "voice-chat-admin" : strM147736b;
        } else {
            str = strM147736b4;
        }
        act.duringCreated(LiveVoiceApi.getVoiceDataByChatAssistant(str, strM147736b2)).map(new w9j() { // from class: l.svj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166579a.m156726m0(strM147736b3, (g6n0) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.tvj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172310a.m156727n0(strM147736b4, act, strM147736b, z, strM156661O, (g6n0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m156683D0(Act act, w2e0 w2e0Var, String str) {
        yuf0.m216111a(act, str);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m156684E(SchemeKey schemeKey, w2e0 w2e0Var) {
        String strReplaceFirst = w2e0Var.m201099g().replaceFirst("/", "");
        if ("live".equals(schemeKey.toString())) {
            return "room".equals(strReplaceFirst) || "room/jumpRoom".equals(strReplaceFirst) || "openLiveRoom".equals(strReplaceFirst);
        }
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m156685E0(Act act, w2e0 w2e0Var) {
        eqs.m117786n(act, w2e0Var.m201095c().replace("tantanapp://" + w2e0Var.m201096d() + w2e0Var.m201099g(), "voiceRoom"));
    }

    /* JADX INFO: renamed from: F */
    public void m156686F(String str) {
        if (l9s.m149072e().signedIn_()) {
            LiveSquareApi.getLiveSchema(str).subscribe(ffw.m121194e(new e30() { // from class: l.jwj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    mwj0.m156675v((BLiveSchema) obj);
                }
            }, new e30() { // from class: l.kwj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    hfw.m130790a("[live]dynamic_schema", "error:" + ((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m156687F0(final Act act) {
        e51.m114742G(new Runnable() { // from class: l.vvj0
            @Override // java.lang.Runnable
            public final void run() {
                mwj0.m156678y(act);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m156688G(final Act act, w2e0 w2e0Var) {
        if (act != null) {
            String strM181411j = rwj0.m181411j(w2e0Var, "roomId");
            final String strM181411j2 = rwj0.m181411j(w2e0Var, "source");
            act.duringCreated(VirtualVoiceRoomApiProvider.getNewestLiveByRoomId(strM181411j)).subscribe(ffw.m121194e(new e30() { // from class: l.wvj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    mwj0.m156657C(act, strM181411j2, (List) obj);
                }
            }, new ult()));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m156689G0(final Act act) {
        e51.m114742G(new Runnable() { // from class: l.iwj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f115280a.m156729p0(act);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public void m156690H0(final Act act, final String str) {
        e51.m114748M(new Runnable() { // from class: l.hwj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109762a.m156730q0(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public void m156691I0(boolean z) {
        LiveAssertApi.updateCanUserStartLive(z);
    }

    /* JADX INFO: renamed from: J */
    public Intent m156692J(Context context) {
        return LiveIndependentSettingAct.m70699Y1(context, "privacy_setting", null);
    }

    /* JADX INFO: renamed from: J0 */
    public void m156693J0() {
        if (!vdt.m198092b(2)) {
            ((nj3) s9s.m182763m(gld0.f103312b)).m159611I("live_schema");
        } else if (mqi0.m155944o() - this.f136061a > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f136061a = mqi0.m155944o();
            s2u.f162012e.m132487l(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public final Act m156694K() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        if (vwb.m200296J(next)) {
            return null;
        }
        Activity activity = next.get(next.size() - 1).f15343a.get();
        if (s9s.f163232f.m134380m(activity)) {
            return (Act) activity;
        }
        return null;
    }

    /* JADX INFO: renamed from: K0 */
    public void m156695K0() {
        qib0.f154713b0.f139232c.mo67228Lh().mo95354h();
    }

    /* JADX INFO: renamed from: L */
    public Intent m156696L(Context context, String str) {
        LiveSettingArgs liveSettingArgs;
        if (TextUtils.isEmpty(str)) {
            liveSettingArgs = null;
        } else {
            try {
                liveSettingArgs = new LiveSettingArgs(Integer.parseInt(str));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                liveSettingArgs = null;
            }
        }
        return l9s.m149044G().mo67220Gr(context, liveSettingArgs);
    }

    /* JADX INFO: renamed from: L0 */
    public void m156697L0() {
        LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
    }

    /* JADX INFO: renamed from: M */
    public Intent m156698M(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IntentParams intentParamsM78773a = new IntentParams.C13054a().m78776d(str).m78781i(str2).m78774b(str3).m78778f(str4).m78777e(str5).m78779g(str6).m78773a();
        rwj0.m181405d(intentParamsM78773a);
        if (!TextUtils.isEmpty(str)) {
            return l9s.m149092o(context, intentParamsM78773a);
        }
        CrashHelper.m81296c(new Exception("SchemeDoLive live id is null"));
        return m156701P(context);
    }

    /* JADX INFO: renamed from: M0 */
    public void m156699M0(final boolean z, final int i) {
        e51.m114742G(new Runnable() { // from class: l.gwj0
            @Override // java.lang.Runnable
            public final void run() {
                pgi0.m168730l().m168743p(z, i);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public Intent m156700N(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        return s9s.f163232f.m134373f(context, AudienceStartData.getBuilder().m67594E(str).m67604O(str2).m67615y(str3).m67599J(str4).m67600K(str6).m67606Q(z).m67611u());
    }

    /* JADX INFO: renamed from: P */
    public Intent m156701P(Context context) {
        return l9s.m149094p(context);
    }

    /* JADX INFO: renamed from: Q */
    public Intent m156702Q(Context context, String str, String str2, String str3, String str4, String str5) {
        Bundle bundleM172513e;
        if ("vipCooperation".equals(str2)) {
            bundleM172513e = q2u.m172514f(str, null);
        } else {
            bundleM172513e = "from_push".equals(str2) ? q2u.m172513e(str, str3) : q2u.m172513e(str, str3);
        }
        bundleM172513e.putString("action", str4);
        bundleM172513e.putString("userId", str5);
        gkh0.m126627j("[live][square]", "Invoked from SchemeDoLiveSquare#getSchemeIntent");
        return mo118176c(context, bundleM172513e);
    }

    /* JADX INFO: renamed from: R */
    public final Intent m156703R(w2e0 w2e0Var) {
        String strM147736b = kxd0.m147736b(w2e0Var.m201098f(), "source");
        if (TextUtils.isEmpty(strM147736b)) {
            strM147736b = "default";
        }
        BLiveVoice bLiveVoiceNew_ = BLiveVoice.new_();
        bLiveVoiceNew_.type = BLiveAbsData.VOICE_LIVE;
        Bundle bundleM172515g = q2u.m172515g(bLiveVoiceNew_, strM147736b);
        bundleM172515g.putString("live_push_voice", "live.schema.push.all");
        bundleM172515g.putBoolean("voice-push-big-anchor", true);
        bundleM172515g.putString("voice-suggest-scheme", w2e0Var.m201095c());
        return x9o0.m207503c(w2e0Var.m201094b(), bundleM172515g);
    }

    /* JADX INFO: renamed from: S */
    public Intent m156704S(Context context) {
        Intent intent = new Intent(context, (Class<?>) LiveUserRightListAct.class);
        Bundle bundle = new Bundle();
        bundle.putString("right_type", UserRightType.USER_MEDAL_MANAGE.toString());
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: T */
    public Intent m156705T(Context context) {
        return x9o0.m207503c(context, new Bundle());
    }

    /* JADX INFO: renamed from: U */
    public Intent m156706U(Context context, String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        BLiveVoice bLiveVoiceNew_ = BLiveVoice.new_();
        bLiveVoiceNew_.type = BLiveAbsData.VOICE_LIVE;
        bLiveVoiceNew_.f44323id = str;
        bLiveVoiceNew_.anchor = BLiveOwner.new_();
        if (TextUtils.equals(str4, "virtualAvatar")) {
            AudienceStartData.C11430a c11430aM67604O = AudienceStartData.getBuilder().m67606Q(true).m67594E(str).m67604O(str2);
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            return s9s.f163232f.m134373f(context, c11430aM67604O.m67616z(str3).m67611u());
        }
        Bundle bundleM172515g = q2u.m172515g(bLiveVoiceNew_, str2);
        if (!TextUtils.isEmpty(str3)) {
            bundleM172515g.putString("live_push_voice_focus_user_id", str3);
            bundleM172515g.putString("live_push_voice", "live.schema.push.all");
        }
        return x9o0.m207503c(context, bundleM172515g);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: V */
    public final void m156707V(Act act, w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = w2e0Var.m201099g().replaceFirst("/", "");
        if (TextUtils.isEmpty(strReplaceFirst)) {
            strReplaceFirst = w2e0Var.m201096d();
        }
        strReplaceFirst.getClass();
        byte b = -1;
        switch (strReplaceFirst.hashCode()) {
            case -1915690464:
                if (strReplaceFirst.equals("jumpToProfile")) {
                    b = 0;
                }
                break;
            case -1806836260:
                if (strReplaceFirst.equals("updateCanUserStartLive")) {
                    b = 1;
                }
                break;
            case -1528981329:
                if (strReplaceFirst.equals("refreshLiveAuth")) {
                    b = 2;
                }
                break;
            case -1502189316:
                if (strReplaceFirst.equals(SchemeKey.livePrivacy)) {
                    b = 3;
                }
                break;
            case -1373616388:
                if (strReplaceFirst.equals("startVoiceLive")) {
                    b = 4;
                }
                break;
            case -1142632302:
                if (strReplaceFirst.equals(SchemeKey.enterVoiceRoomPackageGiftRecall)) {
                    b = 5;
                }
                break;
            case -790355738:
                if (strReplaceFirst.equals("fanBaseGroupNotification")) {
                    b = 6;
                }
                break;
            case -688965323:
                if (strReplaceFirst.equals(SchemeKey.enterVoiceRoom)) {
                    b = 7;
                }
                break;
            case -533397314:
                if (strReplaceFirst.equals("updateNewVoiceActivitiesNum")) {
                    b = 8;
                }
                break;
            case -389025711:
                if (strReplaceFirst.equals("openLiveRoom")) {
                    b = 9;
                }
                break;
            case -134220485:
                if (strReplaceFirst.equals("room/showUserMedal")) {
                    b = 10;
                }
                break;
            case 3506395:
                if (strReplaceFirst.equals("room")) {
                    b = 11;
                }
                break;
            case 109917329:
                if (strReplaceFirst.equals("updateLiveSummary")) {
                    b = 12;
                }
                break;
            case 211709185:
                if (strReplaceFirst.equals(SchemeKey.enterSuggestVoiceRoom)) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 238925142:
                if (strReplaceFirst.equals("showTTCoinDialog")) {
                    b = 14;
                }
                break;
            case 349503169:
                if (strReplaceFirst.equals("liveAnchor")) {
                    b = 15;
                }
                break;
            case 356638705:
                if (strReplaceFirst.equals("verifyTeenModePassword")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 438304549:
                if (strReplaceFirst.equals("jumpToStartLive")) {
                    b = 17;
                }
                break;
            case 755533700:
                if (strReplaceFirst.equals(SchemeKey.jumpToVoiceFrame)) {
                    b = 18;
                }
                break;
            case 798249924:
                if (strReplaceFirst.equals(SchemeKey.liveSetting)) {
                    b = 19;
                }
                break;
            case 868128041:
                if (strReplaceFirst.equals(SchemeKey.liveSquare)) {
                    b = 20;
                }
                break;
            case 905269881:
                if (strReplaceFirst.equals("audience/suggest")) {
                    b = 21;
                }
                break;
            case 983000619:
                if (strReplaceFirst.equals(SchemeKey.liveCover)) {
                    b = 22;
                }
                break;
            case 996660368:
                if (strReplaceFirst.equals(SchemeKey.liveRight)) {
                    b = 23;
                }
                break;
            case 1108905376:
                if (strReplaceFirst.equals("fanBaseGroupManage")) {
                    b = 24;
                }
                break;
            case 1210435805:
                if (strReplaceFirst.equals("room/jumpRoom")) {
                    b = 25;
                }
                break;
            case 1222891760:
                if (strReplaceFirst.equals("updateVoiceActivitiesNum")) {
                    b = 26;
                }
                break;
            case 1310977952:
                if (strReplaceFirst.equals("refreshGuildAuth")) {
                    b = 27;
                }
                break;
            case 1457636159:
                if (strReplaceFirst.equals("onTeenModeEnable")) {
                    b = 28;
                }
                break;
        }
        switch (b) {
            case 0:
                m156717e0(act, rwj0.m181411j(w2e0Var, "userId"), rwj0.m181411j(w2e0Var, "from"));
                break;
            case 1:
                m156691I0(rwj0.m181406e(w2e0Var, "hasPermission"));
                break;
            case 2:
                if (!m171659g(act)) {
                    m156689G0(act);
                }
                break;
            case 3:
                m156714c0(act);
                break;
            case 4:
                m156736w0(act, rwj0.m181411j(w2e0Var, "anchorSource"), false);
                break;
            case 5:
                m156682C0(act, true, w2e0Var);
                break;
            case 6:
                act.startActivity(FansGroupNoticeActivity.m70497V1(act));
                break;
            case 7:
                m156685E0(act, w2e0Var);
                break;
            case 8:
                m156695K0();
                break;
            case 9:
            case 11:
            case 25:
                if (TextUtils.isEmpty(w2e0Var.m201098f().get("liveId"))) {
                    CrashHelper.m81296c(new Exception("SchemeDoLive live id is null"));
                    act.startActivity(m156701P(act));
                } else if (act != null) {
                    m156734u0(act, rwj0.m181411j(w2e0Var, "liveId"), rwj0.m181411j(w2e0Var, "roomId"), rwj0.m181411j(w2e0Var, "source"), rwj0.m181411j(w2e0Var, "liveMode"), m156661O(rwj0.m181411j(w2e0Var, "liveSchema")));
                }
                break;
            case 10:
                m156737x0(act);
                break;
            case 12:
                m156693J0();
                break;
            case 13:
                m156682C0(act, false, w2e0Var);
                break;
            case 14:
                if (act != null) {
                    m156690H0(act, w2e0Var.m201098f().get("from"));
                }
                break;
            case 15:
                m156736w0(act, rwj0.m181411j(w2e0Var, "anchorSource"), true);
                break;
            case 16:
                m156699M0(rwj0.m181406e(w2e0Var, "verified"), rwj0.m181407f(w2e0Var, "scenes"));
                break;
            case 17:
                m156719f0(act);
                break;
            case 18:
                m156738y0(act);
                break;
            case 19:
                m156735v0(act, rwj0.m181411j(w2e0Var, "subCode"));
                break;
            case 20:
                act.startActivity(m156701P(act));
                break;
            case 21:
                act.startActivity(m156698M(act, User.ID_TEAM_ACCOUNT, rwj0.m181411j(w2e0Var, "source"), rwj0.m181411j(w2e0Var, "category"), rwj0.m181411j(w2e0Var, "open"), rwj0.m181411j(w2e0Var, "schema"), rwj0.m181409h(w2e0Var)));
                break;
            case 22:
                m156715d0(act, "from_message");
                break;
            case 23:
                m156713b0(act);
                break;
            case 24:
                act.startActivity(FansGroupActivity.m70496V1(act));
                break;
            case 26:
                m156697L0();
                break;
            case 27:
                if (!m171659g(act)) {
                    m156687F0(act);
                }
                break;
            case 28:
                m156732s0(rwj0.m181406e(w2e0Var, "enable"));
                break;
        }
    }

    /* JADX INFO: renamed from: W */
    public Intent m156708W(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!TextUtils.isEmpty(w2e0Var.m201099g())) {
            String strM147736b = kxd0.m147736b(w2e0Var.m201098f(), "source");
            String strM147736b2 = kxd0.m147736b(w2e0Var.m201098f(), "category");
            String strM147736b3 = kxd0.m147736b(w2e0Var.m201098f(), "open");
            String strM147736b4 = kxd0.m147736b(w2e0Var.m201098f(), "back");
            String strM147736b5 = kxd0.m147736b(w2e0Var.m201098f(), "liveId");
            String strM181409h = rwj0.m181409h(w2e0Var);
            String strM156661O = m156661O(kxd0.m147736b(w2e0Var.m201098f(), "liveSchema"));
            gkh0.m126627j("[live][schema]", "schema:" + w2e0Var.m201095c() + "path:" + w2e0Var.m201099g());
            String strReplaceFirst = w2e0Var.m201099g().replaceFirst("/", "");
            strReplaceFirst.getClass();
            switch (strReplaceFirst) {
                case "livePrivacy":
                    return m156692J(w2e0Var.m201094b());
                case "withOpen":
                    return m156700N(w2e0Var.m201094b(), User.ID_TEAM_ACCOUNT, strM147736b, strM147736b2, strM147736b3, strM181409h, strM156661O, false);
                case "square":
                    return m156701P(w2e0Var.m201094b());
                case "room/showUserMedal":
                    return m156704S(w2e0Var.m201094b());
                case "room":
                case "room/jumpRoom":
                    if (!TextUtils.isEmpty(strM147736b5)) {
                        return "true".equalsIgnoreCase(strM147736b4) ? m156700N(w2e0Var.m201094b(), strM147736b5, strM147736b, strM147736b2, strM147736b3, strM181409h, strM156661O, false) : m156698M(w2e0Var.m201094b(), strM147736b5, strM147736b, strM147736b2, "", strM156661O, "");
                    }
                    CrashHelper.m81296c(new Exception("SchemeDoLive live id is null"));
                    return m156701P(w2e0Var.m201094b());
                case "jumpToVoiceFrame":
                    return m156705T(w2e0Var.m201094b());
                case "liveSetting":
                    return m156696L(w2e0Var.m201094b(), w2e0Var.m201098f().get("subCode"));
                case "audience/suggest":
                    return m156698M(w2e0Var.m201094b(), User.ID_TEAM_ACCOUNT, strM147736b, strM147736b2, strM147736b3, strM156661O, strM181409h);
            }
        }
        if (!NullChecker.m81303a(f30Var)) {
            lsi0.m151578h(R$string.f44110G0);
            return null;
        }
        f30Var.call("error:schema not support", "schema is:" + w2e0Var.m201095c());
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m156709X(Context context, String str) {
        if (TextUtils.equals(str, l9s.m149047J().f56011id)) {
            Act.foreground().filter(new w9j() { // from class: l.zvj0
                /* JADX WARN: Failed to inline method: l.mwj0.p(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
                /* JADX WARN: Not passed register '(r0v0 'weakReference' java.lang.ref.WeakReference<android.app.Activity>)' in method call: l.mwj0.p(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Act.C4299r c4299r = (Act.C4299r) obj;
                    return mwj0.m156669p(c4299r);
                }
            }).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.awj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y("已在自己的群聊中");
                }
            }));
            context.startActivity(LiveIndependentSettingAct.m70699Y1(context, "scheme_fake_frag", null));
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
            return true;
        }
        Act.foreground().filter(new w9j() { // from class: l.cwj0
            /* JADX WARN: Failed to inline method: l.mwj0.s(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
            /* JADX WARN: Not passed register '(r0v0 'weakReference' java.lang.ref.WeakReference<android.app.Activity>)' in method call: l.mwj0.s(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Act.C4299r c4299r = (Act.C4299r) obj;
                return mwj0.m156672s(c4299r);
            }
        }).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.dwj0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("正在麦上，无法进入其他群聊");
            }
        }));
        context.startActivity(LiveIndependentSettingAct.m70699Y1(context, "scheme_fake_frag", null));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m156710Y() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        if (vwb.m200296J(next)) {
            return false;
        }
        return s9s.f163232f.m134380m(next.get(next.size() - 1).f15343a.get());
    }

    /* JADX INFO: renamed from: Z */
    public final void m156711Z(Act act) {
        act.startActivity(new Intent(act, (Class<?>) IntlFeedbackActivity.class));
    }

    @Override // p149l.eul
    /* JADX INFO: renamed from: a */
    public Intent mo118174a(Context context, String str, String str2, String str3) {
        return m156702Q(context, str, str2, str3, null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m156712a0(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "live";
        }
        Intent intent = new Intent(act, (Class<?>) IntlFeedbackCategoryAct.class);
        intent.putExtra("liveType", str);
        act.startActivity(intent);
    }

    @Override // p149l.eul
    /* JADX INFO: renamed from: b */
    public Intent mo118175b(Context context, String str, PushMessage pushMessage) {
        pushMessage.toJson();
        if ("live.voiceLiving.push".equals(str) || "live.voiceFriendLiving.push".equals(str) || "live.voiceFriendOncall.push".equals(str) || "live.voiceLikeOrFollowLiving.push".equals(str) || "live.voiceLikeOrFollowOncall.push".equals(str)) {
            return x9o0.m207503c(context, rwj0.m181408g(pushMessage));
        }
        if (!str.contains("voice.enterroom.push")) {
            return "live.chatNewMsg.push".equals(str) ? x9o0.m207501a(context, rwj0.m181408g(pushMessage)) : q2u.m172511c(context, rwj0.m181408g(pushMessage));
        }
        Bundle bundleM181408g = rwj0.m181408g(pushMessage);
        bundleM181408g.putString("live_push_voice", str);
        return x9o0.m207503c(context, bundleM181408g);
    }

    /* JADX INFO: renamed from: b0 */
    public void m156713b0(Context context) {
        LiveRightAct.m70652X1(context);
    }

    @Override // p149l.eul
    /* JADX INFO: renamed from: c */
    public Intent mo118176c(Context context, Bundle bundle) {
        return q2u.m172511c(context, bundle);
    }

    /* JADX INFO: renamed from: c0 */
    public void m156714c0(Context context) {
        context.startActivity(m156692J(context));
    }

    @Override // p149l.eul
    /* JADX INFO: renamed from: d */
    public Intent mo118177d(Context context, String str) {
        return j2e0.m139438e(context, Uri.parse(str));
    }

    /* JADX INFO: renamed from: d0 */
    public void m156715d0(final Context context, final String str) {
        e51.m114742G(new Runnable() { // from class: l.uvj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178539a.m156721h0(context, str);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.pvj0
    /* JADX INFO: renamed from: e */
    public void mo156716e(SchemeKey schemeKey, w2e0 w2e0Var, f30<String, String> f30Var) {
        String string = schemeKey.toString();
        if ("live".equals(string)) {
            string = string + w2e0Var.m201099g();
        }
        Act actM181416o = rwj0.m181416o(w2e0Var.m201094b());
        if (SchemeKey.enterVoiceRoom.equals(schemeKey.toString()) || m156684E(schemeKey, w2e0Var)) {
            if (actM181416o == null && m156710Y()) {
                actM181416o = m156694K();
            }
            if (actM181416o == null && !lw0.f130219b) {
                gld0<nj3> gld0Var = gld0.f103312b;
                ((nj3) s9s.m182763m(gld0Var)).m159624f();
                ((nj3) s9s.m182763m(gld0Var)).m159617O(schemeKey, w2e0Var, f30Var);
                if (w2e0Var.m201094b() != null) {
                    Intent intentM70699Y1 = LiveIndependentSettingAct.m70699Y1(w2e0Var.m201094b(), "scheme_dummy_frag", null);
                    intentM70699Y1.addFlags(268435456);
                    w2e0Var.m201094b().startActivity(intentM70699Y1);
                    if (w2e0Var.m201094b() instanceof Activity) {
                        ((Activity) w2e0Var.m201094b()).overridePendingTransition(0, 0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (actM181416o == null) {
            return;
        }
        fqs.m122744d(string, false);
        String string2 = schemeKey.toString();
        string2.getClass();
        byte b = -1;
        switch (string2.hashCode()) {
            case -1527193590:
                if (string2.equals(SchemeKey.voiceRight)) {
                    b = 0;
                }
                break;
            case -1502189316:
                if (string2.equals(SchemeKey.livePrivacy)) {
                    b = 1;
                }
                break;
            case -1373616388:
                if (string2.equals("startVoiceLive")) {
                    b = 2;
                }
                break;
            case -1183124204:
                if (string2.equals(SchemeKey.jumpLiveFeedbackQuestionPage)) {
                    b = 3;
                }
                break;
            case -1166941215:
                if (string2.equals(SchemeKey.jumpVoiceSquare)) {
                    b = 4;
                }
                break;
            case -1142632302:
                if (string2.equals(SchemeKey.enterVoiceRoomPackageGiftRecall)) {
                    b = 5;
                }
                break;
            case -688965323:
                if (string2.equals(SchemeKey.enterVoiceRoom)) {
                    b = 6;
                }
                break;
            case 3322092:
                if (string2.equals("live")) {
                    b = 7;
                }
                break;
            case 211709185:
                if (string2.equals(SchemeKey.enterSuggestVoiceRoom)) {
                    b = 8;
                }
                break;
            case 349503169:
                if (string2.equals("liveAnchor")) {
                    b = 9;
                }
                break;
            case 740039039:
                if (string2.equals(SchemeKey.jumpIntlServiceCenter)) {
                    b = 10;
                }
                break;
            case 755533700:
                if (string2.equals(SchemeKey.jumpToVoiceFrame)) {
                    b = 11;
                }
                break;
            case 798249924:
                if (string2.equals(SchemeKey.liveSetting)) {
                    b = 12;
                }
                break;
            case 868128041:
                if (string2.equals(SchemeKey.liveSquare)) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 937076147:
                if (string2.equals(SchemeKey.liveDynamic)) {
                    b = 14;
                }
                break;
            case 983000619:
                if (string2.equals(SchemeKey.liveCover)) {
                    b = 15;
                }
                break;
            case 996660368:
                if (string2.equals(SchemeKey.liveRight)) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1304303533:
                if (string2.equals(SchemeKey.enterVoiceChatRoom)) {
                    b = 17;
                }
                break;
        }
        switch (b) {
            case 0:
                m156720g0(actM181416o);
                break;
            case 1:
                m156714c0(actM181416o);
                break;
            case 2:
                m156736w0(actM181416o, rwj0.m181411j(w2e0Var, "anchorSource"), false);
                break;
            case 3:
                m156712a0(actM181416o, rwj0.m181411j(w2e0Var, "liveType"));
                break;
            case 4:
                m156683D0(actM181416o, w2e0Var, rwj0.m181411j(w2e0Var, "tabId"));
                break;
            case 5:
                m156682C0(actM181416o, true, w2e0Var);
                break;
            case 6:
                m156685E0(actM181416o, w2e0Var);
                break;
            case 7:
                gkh0.m126627j("[live][schema]", "path:" + w2e0Var.m201099g());
                m156707V(actM181416o, w2e0Var, f30Var);
                break;
            case 8:
                m156682C0(actM181416o, false, w2e0Var);
                break;
            case 9:
                m156736w0(actM181416o, rwj0.m181411j(w2e0Var, "anchorSource"), true);
                break;
            case 10:
                m156711Z(actM181416o);
                break;
            case 11:
                m156738y0(actM181416o);
                break;
            case 12:
                m156735v0(actM181416o, rwj0.m181411j(w2e0Var, "subCode"));
                break;
            case 13:
                String str = w2e0Var.m201098f().get("tabId");
                String str2 = w2e0Var.m201098f().get("from");
                String str3 = w2e0Var.m201098f().get("extTabId");
                w2e0Var.m201098f().get("action");
                w2e0Var.m201098f().get("userId");
                actM181416o.startActivity(mo118174a(actM181416o, str, str2, str3));
                break;
            case 14:
                m156686F("{\"search\":\"" + rwj0.m181411j(w2e0Var, "extra") + "\"}");
                break;
            case 15:
                m156715d0(actM181416o, "from_message");
                break;
            case 16:
                m156713b0(actM181416o);
                break;
            case 17:
                m156688G(actM181416o, w2e0Var);
                break;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m156717e0(final Act act, final String str, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.qvj0
            @Override // java.lang.Runnable
            public final void run() {
                l9s.m149085k0(act, str, str2, true);
            }
        });
    }

    @Override // p149l.pvj0
    /* JADX INFO: renamed from: f */
    public Intent mo156718f(SchemeKey schemeKey, w2e0 w2e0Var, f30<String, String> f30Var) {
        String string = schemeKey.toString();
        string.getClass();
        switch (string) {
            case "livePrivacy":
                return m156692J(w2e0Var.m201094b());
            case "startVoiceLive":
                return l9s.m149099s(w2e0Var.m201094b(), NavigationIntent.get("startVoiceLive"));
            case "jumpVoiceSquare":
                return x9o0.m207502b(w2e0Var.m201094b(), rwj0.m181411j(w2e0Var, "tabId"));
            case "enterVoiceRoom":
                String strM181411j = rwj0.m181411j(w2e0Var, "recallSourceId");
                if (TextUtils.isEmpty(strM181411j)) {
                    strM181411j = rwj0.m181411j(w2e0Var, "fromUserId");
                }
                if (TextUtils.isEmpty(strM181411j)) {
                    strM181411j = rwj0.m181411j(w2e0Var, "sourceUserId");
                }
                return m156706U(w2e0Var.m201094b(), rwj0.m181411j(w2e0Var, "liveId"), rwj0.m181411j(w2e0Var, "source"), strM181411j, rwj0.m181411j(w2e0Var, "liveMode"), rwj0.m181411j(w2e0Var, "from"));
            case "live":
                return m156708W(w2e0Var, f30Var);
            case "enterSuggestVoiceRoom":
                return m156703R(w2e0Var);
            case "liveAnchor":
                return l9s.m149099s(w2e0Var.m201094b(), NavigationIntent.get("liveAnchor"));
            case "jumpToVoiceFrame":
                return m156705T(w2e0Var.m201094b());
            case "liveSetting":
                return m156696L(w2e0Var.m201094b(), w2e0Var.m201098f().get("subCode"));
            case "liveSquare":
                return m156702Q(w2e0Var.m201094b(), w2e0Var.m201098f().get("tabId"), w2e0Var.m201098f().get("from"), w2e0Var.m201098f().get("extTabId"), w2e0Var.m201098f().get("action"), w2e0Var.m201098f().get("userId"));
            case "liveDynamic":
                return m156660I().mo118176c(w2e0Var.m201094b(), q2u.m172512d("{\"search\":\"" + rwj0.m181411j(w2e0Var, "extra") + "\"}", rwj0.m181411j(w2e0Var, NotificationCompat.CATEGORY_NAVIGATION)));
            case "liveRight":
                return LiveRightAct.m70651V1(w2e0Var.m201094b(), rwj0.m181411j(w2e0Var, "liveId"), rwj0.m181411j(w2e0Var, "roomId"), rwj0.m181411j(w2e0Var, "anchor_name"), rwj0.m181411j(w2e0Var, "anchor_id"), rwj0.m181411j(w2e0Var, "live_mode"), "live");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m156719f0(final Act act) {
        e51.m114742G(new Runnable() { // from class: l.fwj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99660a.m156722i0(act);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m156720g0(Context context) {
        LiveRightAct.m70653Y1(context, "", "", "", "", BLiveAbsData.VOICE_LIVE, "");
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m156721h0(Context context, String str) {
        if ((context instanceof Act) && m171659g((Act) context)) {
            return;
        }
        s9s.f163232f.m134387t(context, str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m156722i0(Act act) {
        if (m171659g(act)) {
            return;
        }
        if (lor.m150802g()) {
            urm.m195083e().m195088j(act);
        } else {
            s9s.f163232f.m134368a(act, AnchorStartData.getBuilder().m67562m(true).m67561l(true).m67563n(AnchorStartData.ANCHOR_SOURCE_MULTI_CALL_MATCH).m67560k());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m156723j0(Act act, String str, boolean z) {
        if (m171659g(act)) {
            return;
        }
        if (lor.m150802g()) {
            urm.m195083e().m195088j(act);
        } else {
            s9s.f163232f.m134368a(act, AnchorStartData.getBuilder().m67562m(true).m67563n(str).m67561l(z).m67560k());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m156724k0(Act act, String str, String str2, String str3, String str4) {
        if (m171659g(act) || m171660h(act)) {
            return;
        }
        AudienceStartData.C11430a c11430aM67615y = AudienceStartData.getBuilder().m67594E(str).m67596G(str2).m67604O(str3).m67615y(null);
        c11430aM67615y.m67595F(str4);
        act.startActivity(s9s.f163232f.m134373f(act, c11430aM67615y.m67611u()));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m156725l0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (context instanceof Act) {
            Act act = (Act) context;
            if (m171659g(act) || TextUtils.isEmpty(str) || m171659g(act)) {
                return;
            }
        }
        if (TextUtils.equals(str2, "link-share-voice-live") && m156710Y()) {
            m156709X(context, str3);
            return;
        }
        m156659H(str3, str, str4, str2);
        String str11 = str4;
        Intent intentM156706U = m156706U(context, str, str5, str11, str6, str7);
        if (!TextUtils.equals(str6, "virtualAvatar")) {
            AudienceStartData.C11430a c11430aM67596G = AudienceStartData.getBuilder().m67606Q(true).m67594E(str).m67604O(str5).m67596G(str8);
            if (TextUtils.isEmpty(str11)) {
                str11 = "";
            }
            AudienceStartData.C11430a c11430aM67616z = c11430aM67596G.m67616z(str11);
            if (TextUtils.isEmpty(str9)) {
                str9 = "";
            }
            intentM156706U.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, c11430aM67616z.m67590A(str9).m67609T(str10).m67611u());
        }
        context.startActivity(intentM156706U);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m156727n0(String str, Act act, String str2, boolean z, String str3, g6n0 g6n0Var) {
        String str4;
        rwj0.m181415n(g6n0Var);
        if (TextUtils.isEmpty(str)) {
            m156738y0(act);
        }
        if (!vwb.m200296J(g6n0Var.f101294a)) {
            String str5 = g6n0Var.f101294a.get(0).liveId;
            if (TextUtils.isEmpty(str)) {
                str4 = z ? AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT : "";
            } else {
                str4 = AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR_SHOW_PACKAGE;
            }
            m156680A0(act, "", str5, "voice-chat-admin", str4, str3, "");
            return;
        }
        if (TextUtils.equals(str, "my-fixed-room")) {
            osi0.m165782f(com.p046p1.mobile.putong.live.external.R$string.f44866D0);
            yuf0.m216111a(act, "tabId");
        } else {
            if ("start-push-follow".equals(str2)) {
                return;
            }
            lsi0.m151595y("当前没有房间，创建一个吧～");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m156728o0(Act act, Boolean bool) {
        if (bool.booleanValue()) {
            m156733t0(act, "", true);
        } else {
            lsi0.m151593w(com.p046p1.mobile.putong.live.external.R$string.f44880R);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m156729p0(final Act act) {
        LiveVerificationApi.requestLiveVerification(new e30() { // from class: l.xvj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194645a.m156728o0(act, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m156730q0(Act act, String str) {
        if (m171659g(act)) {
            return;
        }
        l9s.m149073e0(act, str, null);
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final g6n0 m156726m0(g6n0 g6n0Var, String str) {
        return TextUtils.isEmpty(str) ? g6n0Var : g6n0Var.m124621h(str);
    }

    /* JADX INFO: renamed from: s0 */
    public void m156732s0(final boolean z) {
        e51.m114742G(new Runnable() { // from class: l.lwj0
            @Override // java.lang.Runnable
            public final void run() {
                pgi0.m168730l().m168745r(z);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public void m156733t0(final Act act, final String str, final boolean z) {
        e51.m114748M(new Runnable() { // from class: l.rvj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161208a.m156723j0(act, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public void m156734u0(final Act act, final String str, String str2, final String str3, final String str4, final String str5) {
        e51.m114748M(new Runnable() { // from class: l.bwj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f77621a.m156724k0(act, str, str5, str3, str4);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m156735v0(Context context, String str) {
        context.startActivity(m156696L(context, str));
    }

    /* JADX INFO: renamed from: w0 */
    public void m156736w0(Context context, String str, boolean z) {
        Act act;
        if (z && !lor.m150805j()) {
            lsi0.m151593w(com.p046p1.mobile.putong.live.external.R$string.f44888Z);
            return;
        }
        if (context instanceof Act) {
            act = (Act) context;
        } else {
            Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
            act = activity instanceof Act ? (Act) activity : null;
        }
        if (act == null) {
            context.startActivity(l9s.m149099s(context, NavigationIntent.get(z ? "liveAnchor" : "startVoiceLive")));
        } else if (z) {
            m156733t0(act, str, false);
        } else {
            m156739z0(act);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m156737x0(Context context) {
        context.startActivity(m156704S(context));
    }

    /* JADX INFO: renamed from: y0 */
    public void m156738y0(Context context) {
        context.startActivity(m156705T(context));
    }

    /* JADX INFO: renamed from: z0 */
    public void m156739z0(final Act act) {
        if (m171659g(act) || m171660h(act)) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.ewj0
            @Override // java.lang.Runnable
            public final void run() {
                ehn0.m116502e(act, null);
            }
        });
    }
}
