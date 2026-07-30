package p149l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class rwj0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m181403b(PushMessage pushMessage, PushTrackData pushTrackData, BLiveSquareSummary bLiveSquareSummary) {
        String str;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        if (pushMessageCustom.extTabId == null && bLiveSquareSummary != null && (str = bLiveSquareSummary.extTabId) != null) {
            pushMessageCustom.extTabId = str;
        }
        bdt.m101235d(pushMessage, pushTrackData);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m181404c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m181405d(IntentParams intentParams) {
        if ("samsung".equals(Build.BRAND) && NullChecker.m81303a(intentParams)) {
            new IntentParams.C13055b("samsung_intent_params_saved", null).put(intentParams);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m181406e(w2e0 w2e0Var, String str) {
        String str2 = w2e0Var.m201098f().get(str);
        return !TextUtils.isEmpty(str2) && str2.equalsIgnoreCase("true");
    }

    /* JADX INFO: renamed from: f */
    public static int m181407f(w2e0 w2e0Var, String str) {
        String str2 = w2e0Var.m201098f().get(str);
        if (TextUtils.isEmpty(str2)) {
            return -1;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            gkh0.m126627j("[live][schema]", "Schema参数异常：" + w2e0Var.m201095c());
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m181408g(PushMessage pushMessage) {
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
        bLiveAbsDataNew_.f44323id = str;
        bLiveAbsDataNew_.room.f44419id = str3;
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveAbsDataNew_.anchor = bLiveOwnerNew_;
        bLiveOwnerNew_.f44419id = pushMessage.messageCustom.userId;
        bLiveOwnerNew_.type = "user";
        bLiveAbsDataNew_.streamUrl.pullFlv = str2;
        bLiveAbsDataNew_.streamCdnInfo.provider = Integer.parseInt(str4);
        bLiveAbsDataNew_.streamCdnInfo.businessType = Integer.parseInt(str5);
        bLiveAbsDataNew_.callback = str6;
        Bundle bundleM172515g = q2u.m172515g(bLiveAbsDataNew_, str7);
        bundleM172515g.putString("extra_live_category", pushMessage.messageCustom.category);
        bundleM172515g.putString("extra_live_test_group_name", pushMessage.messageCustom.testGroupName);
        gkh0.m126627j("[live][square]", "Invoked from LiveSysnotif#getLiveIntent");
        return bundleM172515g;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static String m181409h(w2e0 w2e0Var) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : w2e0Var.m201098f().keySet()) {
            if (z) {
                sb.append(str);
                sb.append("=");
                sb.append(kxd0.m147736b(w2e0Var.m201098f(), str));
                z = false;
            } else {
                sb.append("&");
                sb.append(str);
                sb.append("=");
                sb.append(kxd0.m147736b(w2e0Var.m201098f(), str));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m181410i(PushMessage pushMessage) {
        return "?pushMessage=" + pushMessage.toJson();
    }

    /* JADX INFO: renamed from: j */
    public static String m181411j(w2e0 w2e0Var, String str) {
        String str2 = w2e0Var.m201098f().get(str);
        return !TextUtils.isEmpty(str2) ? str2 : "";
    }

    /* JADX INFO: renamed from: k */
    public static void m181412k(String str, f30<String, String> f30Var) {
        mwj0.m156660I().mo156716e(SchemeKey.get("live"), new w2e0.C20787a(s9s.f163227a, str).m201103d(), f30Var);
    }

    /* JADX INFO: renamed from: l */
    public static void m181413l(String str, f30<String, String> f30Var) {
        mwj0.m156660I().mo156716e(SchemeKey.get("live"), new w2e0.C20787a(App.f15369e, "tantanapp://live/" + str).m201103d(), f30Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m181414m(Activity activity, String str) {
        j2e0.m139446m(activity, Uri.parse("tantanapp://live/" + str));
    }

    /* JADX INFO: renamed from: n */
    public static void m181415n(g6n0 g6n0Var) {
        if (vwb.m200296J(g6n0Var.f101294a)) {
            zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new j760("liveId", ""), new j760("anchorId", ""), new j760("audio_room_type", ""), new j760("topic_id", ""), new j760("audio_card_type", "message_audio_assistant"));
        } else {
            BLiveVoiceRoomFeed bLiveVoiceRoomFeed = g6n0Var.f101294a.get(0);
            zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new j760("liveId", bLiveVoiceRoomFeed.liveId), new j760("anchorId", bLiveVoiceRoomFeed.anchorId), new j760("audio_room_type", bLiveVoiceRoomFeed.maskMode ? "mask_audio" : "normal_audio"), new j760("topic_id", bLiveVoiceRoomFeed.roomTopicId), new j760("audio_card_type", "message_audio_assistant"));
        }
    }

    /* JADX INFO: renamed from: o */
    public static Act m181416o(Context context) {
        if (context instanceof Act) {
            return (Act) context;
        }
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        if (activity instanceof Act) {
            return (Act) activity;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static void m181417p(final PushMessage pushMessage, final PushTrackData pushTrackData) {
        (!vdt.m198092b(2) ? IntlLiveSquareApi.getLiveSquareSummaryInfo() : LiveSquareApi.getLiveSquareSummaryInfo()).map(new w9j() { // from class: l.nwj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((LiveSquareSummaryInfo) obj).getFirstLiveSquareSummary();
            }
        }).filter(new w9j() { // from class: l.owj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSquareSummary) obj) != null);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.pwj0
            @Override // p149l.e30
            public final void call(Object obj) {
                rwj0.m181403b(pushMessage, pushTrackData, (BLiveSquareSummary) obj);
            }
        }, new e30() { // from class: l.qwj0
            @Override // p149l.e30
            public final void call(Object obj) {
                rwj0.m181404c((Throwable) obj);
            }
        }));
    }
}
