package p153l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class v5k0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m199890b(PushMessage pushMessage, PushTrackData pushTrackData, BLiveSquareSummary bLiveSquareSummary) {
        String str;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        if (pushMessageCustom.extTabId == null && bLiveSquareSummary != null && (str = bLiveSquareSummary.extTabId) != null) {
            pushMessageCustom.extTabId = str;
        }
        cft.m109594d(pushMessage, pushTrackData);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m199891c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m199892d(IntentParams intentParams) {
        if ("samsung".equals(Build.BRAND) && NullChecker.m82486a(intentParams)) {
            new IntentParams.C13218b("samsung_intent_params_saved", null).put(intentParams);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m199893e(abe0 abe0Var, String str) {
        String str2 = abe0Var.m96743f().get(str);
        return !TextUtils.isEmpty(str2) && str2.equalsIgnoreCase("true");
    }

    /* JADX INFO: renamed from: f */
    public static int m199894f(abe0 abe0Var, String str) {
        String str2 = abe0Var.m96743f().get(str);
        if (TextUtils.isEmpty(str2)) {
            return -1;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            nsh0.m164608j("[live][schema]", "Schema参数异常：" + abe0Var.m96740c());
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m199895g(PushMessage pushMessage) {
        BLiveAbsData bLiveAbsDataNew_;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        String str = pushMessageCustom.liveId;
        String str2 = pushMessageCustom.pullStreamUrl;
        String str3 = pushMessageCustom.roomId;
        String str4 = pushMessageCustom.provider;
        String str5 = pushMessageCustom.businessType;
        String str6 = pushMessageCustom.callback;
        if (str == null || str2 == null || str3 == null || str6 == null || str4 == null || str5 == null) {
            return null;
        }
        String str7 = pushMessageCustom.source;
        if ("live.voiceLiving.push".equals(pushMessage.intent) || "live.voiceFriendLiving.push".equals(pushMessage.intent) || "live.voiceFriendOncall.push".equals(pushMessage.intent) || "live.voiceLikeOrFollowLiving.push".equals(pushMessage.intent) || "live.voiceLikeOrFollowOncall.push".equals(pushMessage.intent) || "live.chatNewMsg.push".equals(pushMessage.intent) || pushMessage.intent.contains("voice.enterroom.push")) {
            bLiveAbsDataNew_ = BLiveVoice.new_();
            bLiveAbsDataNew_.type = BLiveAbsData.VOICE_LIVE;
        } else {
            bLiveAbsDataNew_ = BLive.new_();
            bLiveAbsDataNew_.type = "live";
        }
        bLiveAbsDataNew_.f45171id = str;
        bLiveAbsDataNew_.room.f45267id = str3;
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveAbsDataNew_.anchor = bLiveOwnerNew_;
        bLiveOwnerNew_.f45267id = pushMessage.messageCustom.userId;
        bLiveOwnerNew_.type = "user";
        bLiveAbsDataNew_.streamUrl.pullFlv = str2;
        bLiveAbsDataNew_.streamCdnInfo.provider = Integer.parseInt(str4);
        bLiveAbsDataNew_.streamCdnInfo.businessType = Integer.parseInt(str5);
        bLiveAbsDataNew_.callback = str6;
        Bundle bundleM179824g = r4u.m179824g(bLiveAbsDataNew_, str7);
        bundleM179824g.putString("extra_live_category", pushMessage.messageCustom.category);
        bundleM179824g.putString("extra_live_test_group_name", pushMessage.messageCustom.testGroupName);
        nsh0.m164608j("[live][square]", "Invoked from LiveSysnotif#getLiveIntent");
        return bundleM179824g;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static String m199896h(abe0 abe0Var) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : abe0Var.m96743f().keySet()) {
            if (z) {
                sb.append(str);
                sb.append("=");
                sb.append(o5e0.m166119b(abe0Var.m96743f(), str));
                z = false;
            } else {
                sb.append("&");
                sb.append(str);
                sb.append("=");
                sb.append(o5e0.m166119b(abe0Var.m96743f(), str));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m199897i(PushMessage pushMessage) {
        return "?pushMessage=" + pushMessage.toJson();
    }

    /* JADX INFO: renamed from: j */
    public static String m199898j(abe0 abe0Var, String str) {
        String str2 = abe0Var.m96743f().get(str);
        return !TextUtils.isEmpty(str2) ? str2 : "";
    }

    /* JADX INFO: renamed from: k */
    public static void m199899k(String str, z20<String, String> z20Var) {
        q5k0.m175372I().mo175432e(SchemeKey.get("live"), new abe0.C15681a(tbs.f172988a, str).m96748d(), z20Var);
    }

    /* JADX INFO: renamed from: l */
    public static void m199900l(String str, z20<String, String> z20Var) {
        q5k0.m175372I().mo175432e(SchemeKey.get("live"), new abe0.C15681a(App.f16088e, "tantanapp://live/" + str).m96748d(), z20Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m199901m(Activity activity, String str) {
        nae0.m162083m(activity, Uri.parse("tantanapp://live/" + str));
    }

    /* JADX INFO: renamed from: n */
    public static void m199902n(kfn0 kfn0Var) {
        if (jyb.m147479J(kfn0Var.f126460a)) {
            i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new pf60("liveId", ""), new pf60("anchorId", ""), new pf60("audio_room_type", ""), new pf60("topic_id", ""), new pf60("audio_card_type", "message_audio_assistant"));
        } else {
            BLiveVoiceRoomFeed bLiveVoiceRoomFeed = kfn0Var.f126460a.get(0);
            i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new pf60("liveId", bLiveVoiceRoomFeed.liveId), new pf60("anchorId", bLiveVoiceRoomFeed.anchorId), new pf60("audio_room_type", bLiveVoiceRoomFeed.maskMode ? "mask_audio" : "normal_audio"), new pf60("topic_id", bLiveVoiceRoomFeed.roomTopicId), new pf60("audio_card_type", "message_audio_assistant"));
        }
    }

    /* JADX INFO: renamed from: o */
    public static Act m199903o(Context context) {
        if (context instanceof Act) {
            return (Act) context;
        }
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        if (activity instanceof Act) {
            return (Act) activity;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static void m199904p(final PushMessage pushMessage, final PushTrackData pushTrackData) {
        (!wft.m206159b(2) ? IntlLiveSquareApi.getLiveSquareSummaryInfo() : LiveSquareApi.getLiveSquareSummaryInfo()).map(new qcj() { // from class: l.r5k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((LiveSquareSummaryInfo) obj).getFirstLiveSquareSummary();
            }
        }).filter(new qcj() { // from class: l.s5k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSquareSummary) obj) != null);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.t5k0
            @Override // p153l.y20
            public final void call(Object obj) {
                v5k0.m199890b(pushMessage, pushTrackData, (BLiveSquareSummary) obj);
            }
        }, new y20() { // from class: l.u5k0
            @Override // p153l.y20
            public final void call(Object obj) {
                v5k0.m199891c((Throwable) obj);
            }
        }));
    }
}
