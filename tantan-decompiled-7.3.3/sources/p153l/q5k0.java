package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.intl.feedback.IntlFeedbackActivity;
import com.p051p1.mobile.putong.live.external.intl.feedback.upload.IntlFeedbackCategoryAct;
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupActivity;
import com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeActivity;
import com.p051p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;
import com.p051p1.mobile.putong.live.external.page.rights.manage.LiveRightAct;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public class q5k0 extends t4k0 {

    /* JADX INFO: renamed from: b */
    public static q5k0 f155729b;

    /* JADX INFO: renamed from: a */
    public long f155730a;

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m175369C(Act act, String str, List list) {
        if (jyb.m147479J(list)) {
            return;
        }
        act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68777E(((BLiveVoice) list.get(0)).f45171id).m68787O(str).m68789Q(true).m68794u()));
    }

    /* JADX INFO: renamed from: H */
    public static void m175371H(String str, String str2, String str3, String str4) {
        if ("manager-recall-invite-card".equals(str4)) {
            i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, jyb.m147494Y("audio_card_type", "user_invite_room_admin"));
        } else if ("live-chat-tab-report".equals(str4)) {
            i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, jyb.m147494Y("anchorId", str), jyb.m147494Y("liveId", str2), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("profile_user_id", str3), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_card_type", str4));
        }
    }

    /* JADX INFO: renamed from: I */
    public static t4k0 m175372I() {
        if (f155729b == null) {
            synchronized (q5k0.class) {
                try {
                    if (f155729b == null) {
                        f155729b = new q5k0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f155729b;
    }

    /* JADX INFO: renamed from: O */
    public static String m175373O(String str) {
        try {
            return URLDecoder.decode(new String(Base64.decode(str, 0)), "UTF-8");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Boolean m175381p(Act.C4450r c4450r) {
        WeakReference<Activity> weakReference;
        return Boolean.valueOf((c4450r == null || (weakReference = c4450r.f16062a) == null || weakReference.get() == null || !tbs.f172993f.m143711m(c4450r.f16062a.get())) ? false : true);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m175384s(Act.C4450r c4450r) {
        WeakReference<Activity> weakReference;
        return Boolean.valueOf((c4450r == null || (weakReference = c4450r.f16062a) == null || weakReference.get() == null || !tbs.f172993f.m143711m(c4450r.f16062a.get())) ? false : true);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m175387v(BLiveSchema bLiveSchema) {
        if (mbs.m157849e().signedIn_()) {
            Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
            if (activity == null || TextUtils.isEmpty(bLiveSchema.schema)) {
                return;
            }
            nae0.m162083m(activity, Uri.parse(bLiveSchema.schema));
            if (TextUtils.isEmpty(bLiveSchema.tip)) {
                return;
            }
            o1j0.m165651y(bLiveSchema.tip);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m175390y(Act act) {
        LiveVerificationApi.requestLiveVerification();
        if (act instanceof LiveWebViewAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m175392A0(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        m175393B0(context, str, str2, str3, str4, null, str5, str6, "", "");
    }

    /* JADX INFO: renamed from: B0 */
    public void m175393B0(final Context context, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9) {
        final String str10 = TextUtils.isEmpty(str3) ? "default" : str3;
        l51.m152893M(new Runnable() { // from class: l.c5k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79872a.m175441l0(context, str2, str3, str, str6, str10, str8, str9, str5, str7, str4);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public void m175394C0(final Act act, final boolean z, abe0 abe0Var) {
        String str;
        if (act == null) {
            return;
        }
        Map<String, String> mapM96743f = abe0Var.m96743f();
        final String strM175373O = m175373O(o5e0.m166119b(mapM96743f, "liveSchema"));
        final String strM166119b = o5e0.m166119b(mapM96743f, "source");
        String strM166119b2 = o5e0.m166119b(mapM96743f, "action");
        final String strM166119b3 = o5e0.m166119b(mapM96743f, "gender");
        final String strM166119b4 = o5e0.m166119b(mapM96743f, "anchor");
        if (TextUtils.isEmpty(strM166119b4)) {
            str = TextUtils.isEmpty(strM166119b) ? "voice-chat-admin" : strM166119b;
        } else {
            str = strM166119b4;
        }
        act.duringCreated(LiveVoiceApi.getVoiceDataByChatAssistant(str, strM166119b2)).map(new qcj() { // from class: l.w4k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187415a.m175442m0(strM166119b3, (kfn0) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.x4k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192416a.m175443n0(strM166119b4, act, strM166119b, z, strM175373O, (kfn0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m175395D0(Act act, abe0 abe0Var, String str) {
        h3g0.m133482a(act, str);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m175396E(SchemeKey schemeKey, abe0 abe0Var) {
        String strReplaceFirst = abe0Var.m96744g().replaceFirst("/", "");
        if ("live".equals(schemeKey.toString())) {
            return "room".equals(strReplaceFirst) || "room/jumpRoom".equals(strReplaceFirst) || "openLiveRoom".equals(strReplaceFirst);
        }
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m175397E0(Act act, abe0 abe0Var) {
        fss.m127251n(act, abe0Var.m96740c().replace("tantanapp://" + abe0Var.m96741d() + abe0Var.m96744g(), "voiceRoom"));
    }

    /* JADX INFO: renamed from: F */
    public void m175398F(String str) {
        if (mbs.m157849e().signedIn_()) {
            LiveSquareApi.getLiveSchema(str).subscribe(dhw.m115826e(new y20() { // from class: l.n5k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    q5k0.m175387v((BLiveSchema) obj);
                }
            }, new y20() { // from class: l.o5k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    fhw.m125605a("[live]dynamic_schema", "error:" + ((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m175399F0(final Act act) {
        l51.m152887G(new Runnable() { // from class: l.z4k0
            @Override // java.lang.Runnable
            public final void run() {
                q5k0.m175390y(act);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m175400G(final Act act, abe0 abe0Var) {
        if (act != null) {
            String strM199898j = v5k0.m199898j(abe0Var, "roomId");
            final String strM199898j2 = v5k0.m199898j(abe0Var, "source");
            act.duringCreated(VirtualVoiceRoomApiProvider.getNewestLiveByRoomId(strM199898j)).subscribe(dhw.m115826e(new y20() { // from class: l.a5k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    q5k0.m175369C(act, strM199898j2, (List) obj);
                }
            }, new wnt()));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m175401G0(final Act act) {
        l51.m152887G(new Runnable() { // from class: l.m5k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f134908a.m175445p0(act);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public void m175402H0(final Act act, final String str) {
        l51.m152893M(new Runnable() { // from class: l.l5k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f130123a.m175446q0(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public void m175403I0(boolean z) {
        LiveAssertApi.updateCanUserStartLive(z);
    }

    /* JADX INFO: renamed from: J */
    public Intent m175404J(Context context) {
        return LiveIndependentSettingAct.m71882Z1(context, "privacy_setting", null);
    }

    /* JADX INFO: renamed from: J0 */
    public void m175405J0() {
        if (!wft.m206159b(2)) {
            ((fk3) tbs.m190077m(itd0.f116820b)).m125942I("live_schema");
        } else if (pzi0.m174454o() - this.f155730a > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f155730a = pzi0.m174454o();
            t4u.f172135e.m137019l(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public final Act m175406K() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        if (jyb.m147479J(next)) {
            return null;
        }
        Activity activity = next.get(next.size() - 1).f16062a.get();
        if (tbs.f172993f.m143711m(activity)) {
            return (Act) activity;
        }
        return null;
    }

    /* JADX INFO: renamed from: K0 */
    public void m175407K0() {
        uqb0.f180396b0.f170326c.mo68411Lh().mo175951h();
    }

    /* JADX INFO: renamed from: L */
    public Intent m175408L(Context context, String str) {
        LiveSettingArgs liveSettingArgs;
        if (TextUtils.isEmpty(str)) {
            liveSettingArgs = null;
        } else {
            try {
                liveSettingArgs = new LiveSettingArgs(Integer.parseInt(str));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                liveSettingArgs = null;
            }
        }
        return mbs.m157821G().mo68403Gr(context, liveSettingArgs);
    }

    /* JADX INFO: renamed from: L0 */
    public void m175409L0() {
        LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
    }

    /* JADX INFO: renamed from: M */
    public Intent m175410M(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        IntentParams intentParamsM79956a = new IntentParams.C13217a().m79959d(str).m79964i(str2).m79957b(str3).m79961f(str4).m79960e(str5).m79962g(str6).m79956a();
        v5k0.m199892d(intentParamsM79956a);
        if (!TextUtils.isEmpty(str)) {
            return mbs.m157869o(context, intentParamsM79956a);
        }
        CrashHelper.m82479c(new Exception("SchemeDoLive live id is null"));
        return m175413P(context);
    }

    /* JADX INFO: renamed from: M0 */
    public void m175411M0(final boolean z, final int i) {
        l51.m152887G(new Runnable() { // from class: l.k5k0
            @Override // java.lang.Runnable
            public final void run() {
                ppi0.m173207l().m173220p(z, i);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public Intent m175412N(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        return tbs.f172993f.m143704f(context, AudienceStartData.getBuilder().m68777E(str).m68787O(str2).m68798y(str3).m68782J(str4).m68783K(str6).m68789Q(z).m68794u());
    }

    /* JADX INFO: renamed from: P */
    public Intent m175413P(Context context) {
        return mbs.m157871p(context);
    }

    /* JADX INFO: renamed from: Q */
    public Intent m175414Q(Context context, String str, String str2, String str3, String str4, String str5) {
        Bundle bundleM179822e;
        if ("vipCooperation".equals(str2)) {
            bundleM179822e = r4u.m179823f(str, null);
        } else {
            bundleM179822e = "from_push".equals(str2) ? r4u.m179822e(str, str3) : r4u.m179822e(str, str3);
        }
        bundleM179822e.putString("action", str4);
        bundleM179822e.putString("userId", str5);
        nsh0.m164608j("[live][square]", "Invoked from SchemeDoLiveSquare#getSchemeIntent");
        return mo175428c(context, bundleM179822e);
    }

    /* JADX INFO: renamed from: R */
    public final Intent m175415R(abe0 abe0Var) {
        String strM166119b = o5e0.m166119b(abe0Var.m96743f(), "source");
        if (TextUtils.isEmpty(strM166119b)) {
            strM166119b = "default";
        }
        BLiveVoice bLiveVoiceNew_ = BLiveVoice.new_();
        bLiveVoiceNew_.type = BLiveAbsData.VOICE_LIVE;
        Bundle bundleM179824g = r4u.m179824g(bLiveVoiceNew_, strM166119b);
        bundleM179824g.putString("live_push_voice", "live.schema.push.all");
        bundleM179824g.putBoolean("voice-push-big-anchor", true);
        bundleM179824g.putString("voice-suggest-scheme", abe0Var.m96740c());
        return bjo0.m104636c(abe0Var.m96739b(), bundleM179824g);
    }

    /* JADX INFO: renamed from: S */
    public Intent m175416S(Context context) {
        Intent intent = new Intent(context, (Class<?>) LiveUserRightListAct.class);
        Bundle bundle = new Bundle();
        bundle.putString("right_type", UserRightType.USER_MEDAL_MANAGE.toString());
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: T */
    public Intent m175417T(Context context) {
        return bjo0.m104636c(context, new Bundle());
    }

    /* JADX INFO: renamed from: U */
    public Intent m175418U(Context context, String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        BLiveVoice bLiveVoiceNew_ = BLiveVoice.new_();
        bLiveVoiceNew_.type = BLiveAbsData.VOICE_LIVE;
        bLiveVoiceNew_.f45171id = str;
        bLiveVoiceNew_.anchor = BLiveOwner.new_();
        if (TextUtils.equals(str4, "virtualAvatar")) {
            AudienceStartData.C11593a c11593aM68787O = AudienceStartData.getBuilder().m68789Q(true).m68777E(str).m68787O(str2);
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            return tbs.f172993f.m143704f(context, c11593aM68787O.m68799z(str3).m68794u());
        }
        Bundle bundleM179824g = r4u.m179824g(bLiveVoiceNew_, str2);
        if (!TextUtils.isEmpty(str3)) {
            bundleM179824g.putString("live_push_voice_focus_user_id", str3);
            bundleM179824g.putString("live_push_voice", "live.schema.push.all");
        }
        return bjo0.m104636c(context, bundleM179824g);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: V */
    public final void m175419V(Act act, abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = abe0Var.m96744g().replaceFirst("/", "");
        if (TextUtils.isEmpty(strReplaceFirst)) {
            strReplaceFirst = abe0Var.m96741d();
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
                m175433e0(act, v5k0.m199898j(abe0Var, "userId"), v5k0.m199898j(abe0Var, "from"));
                break;
            case 1:
                m175403I0(v5k0.m199893e(abe0Var, "hasPermission"));
                break;
            case 2:
                if (!m189292g(act)) {
                    m175401G0(act);
                }
                break;
            case 3:
                m175429c0(act);
                break;
            case 4:
                m175452w0(act, v5k0.m199898j(abe0Var, "anchorSource"), false);
                break;
            case 5:
                m175394C0(act, true, abe0Var);
                break;
            case 6:
                act.startActivity(FansGroupNoticeActivity.m71680X1(act));
                break;
            case 7:
                m175397E0(act, abe0Var);
                break;
            case 8:
                m175407K0();
                break;
            case 9:
            case 11:
            case 25:
                if (TextUtils.isEmpty(abe0Var.m96743f().get("liveId"))) {
                    CrashHelper.m82479c(new Exception("SchemeDoLive live id is null"));
                    act.startActivity(m175413P(act));
                } else if (act != null) {
                    m175450u0(act, v5k0.m199898j(abe0Var, "liveId"), v5k0.m199898j(abe0Var, "roomId"), v5k0.m199898j(abe0Var, "source"), v5k0.m199898j(abe0Var, "liveMode"), m175373O(v5k0.m199898j(abe0Var, "liveSchema")));
                }
                break;
            case 10:
                m175453x0(act);
                break;
            case 12:
                m175405J0();
                break;
            case 13:
                m175394C0(act, false, abe0Var);
                break;
            case 14:
                if (act != null) {
                    m175402H0(act, abe0Var.m96743f().get("from"));
                }
                break;
            case 15:
                m175452w0(act, v5k0.m199898j(abe0Var, "anchorSource"), true);
                break;
            case 16:
                m175411M0(v5k0.m199893e(abe0Var, "verified"), v5k0.m199894f(abe0Var, "scenes"));
                break;
            case 17:
                m175435f0(act);
                break;
            case 18:
                m175454y0(act);
                break;
            case 19:
                m175451v0(act, v5k0.m199898j(abe0Var, "subCode"));
                break;
            case 20:
                act.startActivity(m175413P(act));
                break;
            case 21:
                act.startActivity(m175410M(act, User.ID_TEAM_ACCOUNT, v5k0.m199898j(abe0Var, "source"), v5k0.m199898j(abe0Var, "category"), v5k0.m199898j(abe0Var, "open"), v5k0.m199898j(abe0Var, "schema"), v5k0.m199896h(abe0Var)));
                break;
            case 22:
                m175431d0(act, "from_message");
                break;
            case 23:
                m175427b0(act);
                break;
            case 24:
                act.startActivity(FansGroupActivity.m71679X1(act));
                break;
            case 26:
                m175409L0();
                break;
            case 27:
                if (!m189292g(act)) {
                    m175399F0(act);
                }
                break;
            case 28:
                m175448s0(v5k0.m199893e(abe0Var, "enable"));
                break;
        }
    }

    /* JADX INFO: renamed from: W */
    public Intent m175420W(abe0 abe0Var, z20<String, String> z20Var) {
        if (!TextUtils.isEmpty(abe0Var.m96744g())) {
            String strM166119b = o5e0.m166119b(abe0Var.m96743f(), "source");
            String strM166119b2 = o5e0.m166119b(abe0Var.m96743f(), "category");
            String strM166119b3 = o5e0.m166119b(abe0Var.m96743f(), "open");
            String strM166119b4 = o5e0.m166119b(abe0Var.m96743f(), "back");
            String strM166119b5 = o5e0.m166119b(abe0Var.m96743f(), "liveId");
            String strM199896h = v5k0.m199896h(abe0Var);
            String strM175373O = m175373O(o5e0.m166119b(abe0Var.m96743f(), "liveSchema"));
            nsh0.m164608j("[live][schema]", "schema:" + abe0Var.m96740c() + "path:" + abe0Var.m96744g());
            String strReplaceFirst = abe0Var.m96744g().replaceFirst("/", "");
            strReplaceFirst.getClass();
            switch (strReplaceFirst) {
                case "livePrivacy":
                    return m175404J(abe0Var.m96739b());
                case "withOpen":
                    return m175412N(abe0Var.m96739b(), User.ID_TEAM_ACCOUNT, strM166119b, strM166119b2, strM166119b3, strM199896h, strM175373O, false);
                case "square":
                    return m175413P(abe0Var.m96739b());
                case "room/showUserMedal":
                    return m175416S(abe0Var.m96739b());
                case "room":
                case "room/jumpRoom":
                    if (!TextUtils.isEmpty(strM166119b5)) {
                        return "true".equalsIgnoreCase(strM166119b4) ? m175412N(abe0Var.m96739b(), strM166119b5, strM166119b, strM166119b2, strM166119b3, strM199896h, strM175373O, false) : m175410M(abe0Var.m96739b(), strM166119b5, strM166119b, strM166119b2, "", strM175373O, "");
                    }
                    CrashHelper.m82479c(new Exception("SchemeDoLive live id is null"));
                    return m175413P(abe0Var.m96739b());
                case "jumpToVoiceFrame":
                    return m175417T(abe0Var.m96739b());
                case "liveSetting":
                    return m175408L(abe0Var.m96739b(), abe0Var.m96743f().get("subCode"));
                case "audience/suggest":
                    return m175410M(abe0Var.m96739b(), User.ID_TEAM_ACCOUNT, strM166119b, strM166119b2, strM166119b3, strM175373O, strM199896h);
            }
        }
        if (!NullChecker.m82486a(z20Var)) {
            o1j0.m165634h(R$string.f44958G0);
            return null;
        }
        z20Var.call("error:schema not support", "schema is:" + abe0Var.m96740c());
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m175421X(Context context, String str) {
        if (TextUtils.equals(str, mbs.m157824J().f56859id)) {
            Act.foreground().filter(new qcj() { // from class: l.d5k0
                /* JADX WARN: Failed to inline method: l.q5k0.p(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
                /* JADX WARN: Not passed register '(r0v0 'weakReference' java.lang.ref.WeakReference<android.app.Activity>)' in method call: l.q5k0.p(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Act.C4450r c4450r = (Act.C4450r) obj;
                    return q5k0.m175381p(c4450r);
                }
            }).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.e5k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y("已在自己的群聊中");
                }
            }));
            context.startActivity(LiveIndependentSettingAct.m71882Z1(context, "scheme_fake_frag", null));
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
            return true;
        }
        Act.foreground().filter(new qcj() { // from class: l.g5k0
            /* JADX WARN: Failed to inline method: l.q5k0.s(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
            /* JADX WARN: Not passed register '(r0v0 'weakReference' java.lang.ref.WeakReference<android.app.Activity>)' in method call: l.q5k0.s(com.p1.mobile.android.app.Act$r):java.lang.Boolean */
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Act.C4450r c4450r = (Act.C4450r) obj;
                return q5k0.m175384s(c4450r);
            }
        }).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.h5k0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("正在麦上，无法进入其他群聊");
            }
        }));
        context.startActivity(LiveIndependentSettingAct.m71882Z1(context, "scheme_fake_frag", null));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m175422Y() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        if (jyb.m147479J(next)) {
            return false;
        }
        return tbs.f172993f.m143711m(next.get(next.size() - 1).f16062a.get());
    }

    /* JADX INFO: renamed from: Z */
    public final void m175423Z(Act act) {
        act.startActivity(new Intent(act, (Class<?>) IntlFeedbackActivity.class));
    }

    @Override // p153l.swl
    /* JADX INFO: renamed from: a */
    public Intent mo175424a(Context context, String str, String str2, String str3) {
        return m175414Q(context, str, str2, str3, null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m175425a0(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "live";
        }
        Intent intent = new Intent(act, (Class<?>) IntlFeedbackCategoryAct.class);
        intent.putExtra("liveType", str);
        act.startActivity(intent);
    }

    @Override // p153l.swl
    /* JADX INFO: renamed from: b */
    public Intent mo175426b(Context context, String str, PushMessage pushMessage) {
        pushMessage.toJson();
        if ("live.voiceLiving.push".equals(str) || "live.voiceFriendLiving.push".equals(str) || "live.voiceFriendOncall.push".equals(str) || "live.voiceLikeOrFollowLiving.push".equals(str) || "live.voiceLikeOrFollowOncall.push".equals(str)) {
            return bjo0.m104636c(context, v5k0.m199895g(pushMessage));
        }
        if (!str.contains("voice.enterroom.push")) {
            return "live.chatNewMsg.push".equals(str) ? bjo0.m104634a(context, v5k0.m199895g(pushMessage)) : r4u.m179820c(context, v5k0.m199895g(pushMessage));
        }
        Bundle bundleM199895g = v5k0.m199895g(pushMessage);
        bundleM199895g.putString("live_push_voice", str);
        return bjo0.m104636c(context, bundleM199895g);
    }

    /* JADX INFO: renamed from: b0 */
    public void m175427b0(Context context) {
        LiveRightAct.m71835Y1(context);
    }

    @Override // p153l.swl
    /* JADX INFO: renamed from: c */
    public Intent mo175428c(Context context, Bundle bundle) {
        return r4u.m179820c(context, bundle);
    }

    /* JADX INFO: renamed from: c0 */
    public void m175429c0(Context context) {
        context.startActivity(m175404J(context));
    }

    @Override // p153l.swl
    /* JADX INFO: renamed from: d */
    public Intent mo175430d(Context context, String str) {
        return nae0.m162075e(context, Uri.parse(str));
    }

    /* JADX INFO: renamed from: d0 */
    public void m175431d0(final Context context, final String str) {
        l51.m152887G(new Runnable() { // from class: l.y4k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f197474a.m175437h0(context, str);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.t4k0
    /* JADX INFO: renamed from: e */
    public void mo175432e(SchemeKey schemeKey, abe0 abe0Var, z20<String, String> z20Var) {
        String string = schemeKey.toString();
        if ("live".equals(string)) {
            string = string + abe0Var.m96744g();
        }
        Act actM199903o = v5k0.m199903o(abe0Var.m96739b());
        if (SchemeKey.enterVoiceRoom.equals(schemeKey.toString()) || m175396E(schemeKey, abe0Var)) {
            if (actM199903o == null && m175422Y()) {
                actM199903o = m175406K();
            }
            if (actM199903o == null && !sw0.f170906b) {
                itd0<fk3> itd0Var = itd0.f116820b;
                ((fk3) tbs.m190077m(itd0Var)).m125955f();
                ((fk3) tbs.m190077m(itd0Var)).m125948O(schemeKey, abe0Var, z20Var);
                if (abe0Var.m96739b() != null) {
                    Intent intentM71882Z1 = LiveIndependentSettingAct.m71882Z1(abe0Var.m96739b(), "scheme_dummy_frag", null);
                    intentM71882Z1.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    abe0Var.m96739b().startActivity(intentM71882Z1);
                    if (abe0Var.m96739b() instanceof Activity) {
                        ((Activity) abe0Var.m96739b()).overridePendingTransition(0, 0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (actM199903o == null) {
            return;
        }
        gss.m132148d(string, false);
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
                m175436g0(actM199903o);
                break;
            case 1:
                m175429c0(actM199903o);
                break;
            case 2:
                m175452w0(actM199903o, v5k0.m199898j(abe0Var, "anchorSource"), false);
                break;
            case 3:
                m175425a0(actM199903o, v5k0.m199898j(abe0Var, "liveType"));
                break;
            case 4:
                m175395D0(actM199903o, abe0Var, v5k0.m199898j(abe0Var, "tabId"));
                break;
            case 5:
                m175394C0(actM199903o, true, abe0Var);
                break;
            case 6:
                m175397E0(actM199903o, abe0Var);
                break;
            case 7:
                nsh0.m164608j("[live][schema]", "path:" + abe0Var.m96744g());
                m175419V(actM199903o, abe0Var, z20Var);
                break;
            case 8:
                m175394C0(actM199903o, false, abe0Var);
                break;
            case 9:
                m175452w0(actM199903o, v5k0.m199898j(abe0Var, "anchorSource"), true);
                break;
            case 10:
                m175423Z(actM199903o);
                break;
            case 11:
                m175454y0(actM199903o);
                break;
            case 12:
                m175451v0(actM199903o, v5k0.m199898j(abe0Var, "subCode"));
                break;
            case 13:
                String str = abe0Var.m96743f().get("tabId");
                String str2 = abe0Var.m96743f().get("from");
                String str3 = abe0Var.m96743f().get("extTabId");
                abe0Var.m96743f().get("action");
                abe0Var.m96743f().get("userId");
                actM199903o.startActivity(mo175424a(actM199903o, str, str2, str3));
                break;
            case 14:
                m175398F("{\"search\":\"" + v5k0.m199898j(abe0Var, "extra") + "\"}");
                break;
            case 15:
                m175431d0(actM199903o, "from_message");
                break;
            case 16:
                m175427b0(actM199903o);
                break;
            case 17:
                m175400G(actM199903o, abe0Var);
                break;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m175433e0(final Act act, final String str, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.u4k0
            @Override // java.lang.Runnable
            public final void run() {
                mbs.m157862k0(act, str, str2, true);
            }
        });
    }

    @Override // p153l.t4k0
    /* JADX INFO: renamed from: f */
    public Intent mo175434f(SchemeKey schemeKey, abe0 abe0Var, z20<String, String> z20Var) {
        String string = schemeKey.toString();
        string.getClass();
        switch (string) {
            case "livePrivacy":
                return m175404J(abe0Var.m96739b());
            case "startVoiceLive":
                return mbs.m157876s(abe0Var.m96739b(), NavigationIntent.get("startVoiceLive"));
            case "jumpVoiceSquare":
                return bjo0.m104635b(abe0Var.m96739b(), v5k0.m199898j(abe0Var, "tabId"));
            case "enterVoiceRoom":
                String strM199898j = v5k0.m199898j(abe0Var, "recallSourceId");
                if (TextUtils.isEmpty(strM199898j)) {
                    strM199898j = v5k0.m199898j(abe0Var, "fromUserId");
                }
                if (TextUtils.isEmpty(strM199898j)) {
                    strM199898j = v5k0.m199898j(abe0Var, "sourceUserId");
                }
                return m175418U(abe0Var.m96739b(), v5k0.m199898j(abe0Var, "liveId"), v5k0.m199898j(abe0Var, "source"), strM199898j, v5k0.m199898j(abe0Var, "liveMode"), v5k0.m199898j(abe0Var, "from"));
            case "live":
                return m175420W(abe0Var, z20Var);
            case "enterSuggestVoiceRoom":
                return m175415R(abe0Var);
            case "liveAnchor":
                return mbs.m157876s(abe0Var.m96739b(), NavigationIntent.get("liveAnchor"));
            case "jumpToVoiceFrame":
                return m175417T(abe0Var.m96739b());
            case "liveSetting":
                return m175408L(abe0Var.m96739b(), abe0Var.m96743f().get("subCode"));
            case "liveSquare":
                return m175414Q(abe0Var.m96739b(), abe0Var.m96743f().get("tabId"), abe0Var.m96743f().get("from"), abe0Var.m96743f().get("extTabId"), abe0Var.m96743f().get("action"), abe0Var.m96743f().get("userId"));
            case "liveDynamic":
                return m175372I().mo175428c(abe0Var.m96739b(), r4u.m179821d("{\"search\":\"" + v5k0.m199898j(abe0Var, "extra") + "\"}", v5k0.m199898j(abe0Var, NotificationCompat.CATEGORY_NAVIGATION)));
            case "liveRight":
                return LiveRightAct.m71834X1(abe0Var.m96739b(), v5k0.m199898j(abe0Var, "liveId"), v5k0.m199898j(abe0Var, "roomId"), v5k0.m199898j(abe0Var, "anchor_name"), v5k0.m199898j(abe0Var, "anchor_id"), v5k0.m199898j(abe0Var, "live_mode"), "live");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m175435f0(final Act act) {
        l51.m152887G(new Runnable() { // from class: l.j5k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f118445a.m175438i0(act);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m175436g0(Context context) {
        LiveRightAct.m71836Z1(context, "", "", "", "", BLiveAbsData.VOICE_LIVE, "");
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m175437h0(Context context, String str) {
        if ((context instanceof Act) && m189292g((Act) context)) {
            return;
        }
        tbs.f172993f.m143718t(context, str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m175438i0(Act act) {
        if (m189292g(act)) {
            return;
        }
        if (mqr.m159587g()) {
            wtm.m207899e().m207904j(act);
        } else {
            tbs.f172993f.m143699a(act, AnchorStartData.getBuilder().m68745m(true).m68744l(true).m68746n(AnchorStartData.ANCHOR_SOURCE_MULTI_CALL_MATCH).m68743k());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m175439j0(Act act, String str, boolean z) {
        if (m189292g(act)) {
            return;
        }
        if (mqr.m159587g()) {
            wtm.m207899e().m207904j(act);
        } else {
            tbs.f172993f.m143699a(act, AnchorStartData.getBuilder().m68745m(true).m68746n(str).m68744l(z).m68743k());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m175440k0(Act act, String str, String str2, String str3, String str4) {
        if (m189292g(act) || m189293h(act)) {
            return;
        }
        AudienceStartData.C11593a c11593aM68798y = AudienceStartData.getBuilder().m68777E(str).m68779G(str2).m68787O(str3).m68798y(null);
        c11593aM68798y.m68778F(str4);
        act.startActivity(tbs.f172993f.m143704f(act, c11593aM68798y.m68794u()));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m175441l0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (context instanceof Act) {
            Act act = (Act) context;
            if (m189292g(act) || TextUtils.isEmpty(str) || m189292g(act)) {
                return;
            }
        }
        if (TextUtils.equals(str2, "link-share-voice-live") && m175422Y()) {
            m175421X(context, str3);
            return;
        }
        m175371H(str3, str, str4, str2);
        String str11 = str4;
        Intent intentM175418U = m175418U(context, str, str5, str11, str6, str7);
        if (!TextUtils.equals(str6, "virtualAvatar")) {
            AudienceStartData.C11593a c11593aM68779G = AudienceStartData.getBuilder().m68789Q(true).m68777E(str).m68787O(str5).m68779G(str8);
            if (TextUtils.isEmpty(str11)) {
                str11 = "";
            }
            AudienceStartData.C11593a c11593aM68799z = c11593aM68779G.m68799z(str11);
            if (TextUtils.isEmpty(str9)) {
                str9 = "";
            }
            intentM175418U.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, c11593aM68799z.m68773A(str9).m68792T(str10).m68794u());
        }
        context.startActivity(intentM175418U);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m175443n0(String str, Act act, String str2, boolean z, String str3, kfn0 kfn0Var) {
        String str4;
        v5k0.m199902n(kfn0Var);
        if (TextUtils.isEmpty(str)) {
            m175454y0(act);
        }
        if (!jyb.m147479J(kfn0Var.f126460a)) {
            String str5 = kfn0Var.f126460a.get(0).liveId;
            if (TextUtils.isEmpty(str)) {
                str4 = z ? AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT : "";
            } else {
                str4 = AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR_SHOW_PACKAGE;
            }
            m175392A0(act, "", str5, "voice-chat-admin", str4, str3, "");
            return;
        }
        if (TextUtils.equals(str, "my-fixed-room")) {
            r1j0.m179419f(com.p051p1.mobile.putong.live.external.R$string.f45714D0);
            h3g0.m133482a(act, "tabId");
        } else {
            if ("start-push-follow".equals(str2)) {
                return;
            }
            o1j0.m165651y("当前没有房间，创建一个吧～");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m175444o0(Act act, Boolean bool) {
        if (bool.booleanValue()) {
            m175449t0(act, "", true);
        } else {
            o1j0.m165649w(com.p051p1.mobile.putong.live.external.R$string.f45728R);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m175445p0(final Act act) {
        LiveVerificationApi.requestLiveVerification(new y20() { // from class: l.b5k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75073a.m175444o0(act, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m175446q0(Act act, String str) {
        if (m189292g(act)) {
            return;
        }
        mbs.m157850e0(act, str, null);
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final kfn0 m175442m0(kfn0 kfn0Var, String str) {
        return TextUtils.isEmpty(str) ? kfn0Var : kfn0Var.m149584h(str);
    }

    /* JADX INFO: renamed from: s0 */
    public void m175448s0(final boolean z) {
        l51.m152887G(new Runnable() { // from class: l.p5k0
            @Override // java.lang.Runnable
            public final void run() {
                ppi0.m173207l().m173222r(z);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public void m175449t0(final Act act, final String str, final boolean z) {
        l51.m152893M(new Runnable() { // from class: l.v4k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182378a.m175439j0(act, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public void m175450u0(final Act act, final String str, String str2, final String str3, final String str4, final String str5) {
        l51.m152893M(new Runnable() { // from class: l.f5k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97230a.m175440k0(act, str, str5, str3, str4);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m175451v0(Context context, String str) {
        context.startActivity(m175408L(context, str));
    }

    /* JADX INFO: renamed from: w0 */
    public void m175452w0(Context context, String str, boolean z) {
        Act act;
        if (z && !mqr.m159590j()) {
            o1j0.m165649w(com.p051p1.mobile.putong.live.external.R$string.f45736Z);
            return;
        }
        if (context instanceof Act) {
            act = (Act) context;
        } else {
            Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
            act = activity instanceof Act ? (Act) activity : null;
        }
        if (act == null) {
            context.startActivity(mbs.m157876s(context, NavigationIntent.get(z ? "liveAnchor" : "startVoiceLive")));
        } else if (z) {
            m175449t0(act, str, false);
        } else {
            m175455z0(act);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m175453x0(Context context) {
        context.startActivity(m175416S(context));
    }

    /* JADX INFO: renamed from: y0 */
    public void m175454y0(Context context) {
        context.startActivity(m175417T(context));
    }

    /* JADX INFO: renamed from: z0 */
    public void m175455z0(final Act act) {
        if (m189292g(act) || m189293h(act)) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.i5k0
            @Override // java.lang.Runnable
            public final void run() {
                iqn0.m141677e(act, null);
            }
        });
    }
}
