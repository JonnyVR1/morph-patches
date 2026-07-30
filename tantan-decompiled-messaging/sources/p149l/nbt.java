package p149l;

import android.app.Activity;
import android.app.PendingIntent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.gson.Gson;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class nbt {

    /* JADX INFO: renamed from: l.nbt$a */
    public class C18667a implements ydb0.InterfaceC21375g {
        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: a */
        public boolean mo98941a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (!qib0.f154713b0.f139232c.mo67293yn() || !qib0.f154713b0.f139230a.signedIn_() || !s9s.f163229c) {
                return false;
            }
            if (eqs.m117788p(rwj0.m181416o(null), pushMessage, pushTrackData)) {
                return true;
            }
            fqs.m122743c(pushMessage.intent, false, pushMessage.link);
            return nbt.m158839i(pushMessage, pushTrackData);
        }

        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo98942b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            pushMessage.toString();
            if (!lor.m150807l()) {
                return null;
            }
            PendingIntent pendingIntentM117780h = eqs.m117780h(pushMessage, pushTrackData);
            if (pendingIntentM117780h != null) {
                return pendingIntentM117780h;
            }
            return (("live.schema.push.all".equals(str2) || "live.schema.boutique.enter".equals(str2)) && !pushMessage.silent) ? bdt.m101233b(pushMessage.link, pushTrackData) : bdt.m101232a(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m158831a(String str, String str2) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m158832b(PushMessage pushMessage, Activity activity) {
        if (activity instanceof LiveVChatAct) {
            ((LiveVChatAct) activity).m69170e2(pushMessage.messageCustom);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m158833c(@NotNull PushMessage pushMessage) {
        if (!"live.schema.push.in.app".equals(pushMessage.intent) && !"live.audience.signin.push".equals(pushMessage.intent) && !"live.voiceLiving.partnerFinder.push".equals(pushMessage.intent) && !"live.anchor.living.push".equals(pushMessage.intent) && !"live.card.push.in.app".equals(pushMessage.intent) && !"live.ongoingLive.pinkCard".equals(pushMessage.intent)) {
            return false;
        }
        m158835e(pushMessage);
        zym.m220932a().m220934c(pushMessage);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m158834d(PushMessage pushMessage, PushTrackData pushTrackData) {
        if (pushMessage != null) {
            String str = pushMessage.intent;
            str.getClass();
            switch (str) {
                case "live.square.push":
                    rwj0.m181417p(pushMessage, pushTrackData);
                    return true;
                case "live.suggest.room":
                    rwj0.m181413l("updateSuggestRoom" + rwj0.m181410i(pushMessage), null);
                    return true;
                case "live.suggest.activity":
                    rwj0.m181413l("updateSuggestActivity" + rwj0.m181410i(pushMessage), null);
                    return true;
                default:
                    if (!pushMessage.silent) {
                        bdt.m101235d(pushMessage, pushTrackData);
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m158835e(PushMessage pushMessage) {
        if (pushMessage.messageCustom.title != null && TextUtils.isEmpty(pushMessage.title)) {
            pushMessage.title = pushMessage.messageCustom.title;
        }
        if (pushMessage.messageCustom.content != null && (TextUtils.isEmpty(pushMessage.value) || TextUtils.isEmpty(pushMessage.ticker))) {
            String str = pushMessage.messageCustom.content;
            pushMessage.value = str;
            pushMessage.ticker = str;
        }
        if (pushMessage.title != null && TextUtils.isEmpty(pushMessage.messageCustom.title)) {
            pushMessage.messageCustom.title = pushMessage.title;
        }
        if (TextUtils.isEmpty(pushMessage.ticker) || !TextUtils.isEmpty(pushMessage.messageCustom.content)) {
            return;
        }
        pushMessage.messageCustom.content = pushMessage.ticker;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m158836f(PushMessage pushMessage, PushTrackData pushTrackData) {
        if (!"live.schema.push.all".equals(pushMessage.intent) && !"live.schema.boutique.enter".equals(pushMessage.intent)) {
            return false;
        }
        if (pushMessage.silent) {
            if (m158838h() && App.m20426e() > 10000) {
                rwj0.m181412k(pushMessage.link, null);
            }
        } else {
            if (m158838h() && m158837g(pushMessage.link)) {
                zym.m220932a().m220934c(pushMessage);
                return true;
            }
            if (TextUtils.equals(pushMessage.messageCustom.category, OMSResourceType.background) && m158838h()) {
                return true;
            }
            if (TextUtils.equals(pushMessage.messageCustom.category, DownloadService.KEY_FOREGROUND) && !m158838h()) {
                return true;
            }
            if (!TextUtils.isEmpty(pushMessage.link) && !pushMessage.link.contains("&from=")) {
                pushMessage.link += "&from=from_push";
            }
            if (TextUtils.equals(pushMessage.messageCustom.liveMode, "virtualAvatar") && !TextUtils.isEmpty(pushMessage.link) && !pushMessage.link.contains("&liveMode=")) {
                pushMessage.link += "&liveMode=virtualAvatar";
            }
            if (mwj0.m156660I().mo156718f(SchemeKey.get(Uri.parse(pushMessage.link).getHost()), new w2e0.C20787a(s9s.f163227a, Uri.parse(pushMessage.link).toString()).m201103d(), new f30() { // from class: l.mbt
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    nbt.m158831a((String) obj, (String) obj2);
                }
            }) == null) {
                return true;
            }
            PendingIntent pendingIntentM101233b = bdt.m101233b(pushMessage.link, pushTrackData);
            m158835e(pushMessage);
            l9s.m149074f(pushMessage, pendingIntentM101233b, null, null, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m158837g(@NotNull String str) {
        return str.contains(SchemeKey.enterSuggestVoiceRoom) || str.contains(SchemeKey.enterVoiceRoom);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m158838h() {
        return (Act.foreground_() == null || Act.foreground_().f15343a.get() == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m158839i(final PushMessage pushMessage, PushTrackData pushTrackData) {
        boolean z = false;
        if ("live.startlive.authorized".equals(pushMessage.intent)) {
            StringBuilder sb = new StringBuilder("updateCanUserStartLive?hasPermission=");
            Boolean bool = pushMessage.messageCustom.canUserStartLive;
            if (bool != null && bool.booleanValue()) {
                z = true;
            }
            sb.append(z);
            rwj0.m181413l(sb.toString(), null);
            return true;
        }
        if (!lor.m150807l()) {
            return false;
        }
        if (m158836f(pushMessage, pushTrackData) || m158833c(pushMessage)) {
            return true;
        }
        if ("live.videochat.fakeCall".equals(pushMessage.intent)) {
            Act actM181416o = rwj0.m181416o(null);
            if (actM181416o == null) {
                return true;
            }
            z = ib1.m135233b().mo135235c() != null;
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            String str = pushMessageCustom.anchorCallId;
            if (z) {
                iuu.m138454O(str, VoiceCallStatus.busy).subscribe(ffw.m121192c());
            } else {
                dnk0.m112645d(actM181416o, pushMessageCustom.anchorId, pushMessageCustom.source, str);
            }
            return true;
        }
        if ("live.summary.refresh".equals(pushMessage.intent)) {
            rwj0.m181413l("updateLiveSummary", null);
            return true;
        }
        if ("voice.live.activity.refresh".equals(pushMessage.intent)) {
            rwj0.m181413l("updateVoiceActivitiesNum", null);
            return true;
        }
        if ("voice.live.counter.refresh".equals(pushMessage.intent)) {
            rwj0.m181413l("updateNewVoiceActivitiesNum", null);
            return true;
        }
        if ("livechat.fixedroom.cell.newmsg".equals(pushMessage.intent)) {
            String str2 = pushMessage.messageCustom.cell;
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            try {
                l9s.m149044G().mo67280r9().mo123876b(VirtualVoiceGroupConversationCell.JSON_ADAPTER.parse(str2));
            } catch (IOException unused) {
            }
            return true;
        }
        if ("voice.square.honorGift.refresh".equals(pushMessage.intent)) {
            String str3 = pushMessage.messageCustom.honorGiftCardDetail;
            if (TextUtils.isEmpty(str3)) {
                return true;
            }
            try {
                wws wwsVar = (wws) new Gson().fromJson(str3, wws.class);
                wwsVar.isFromLongLink = true;
                ((hl3) s9s.m182763m(gld0.f103313c)).m131637k(wwsVar);
            } catch (Exception unused2) {
            }
            return true;
        }
        if (pushMessage.intent.contains("voice.enterroom.push")) {
            bdt.m101235d(pushMessage, pushTrackData);
            return true;
        }
        if (pushMessage.intent.contains("live.videochat.randomMatch.success")) {
            bdt.m101236e(new e30() { // from class: l.lbt
                @Override // p149l.e30
                public final void call(Object obj) {
                    nbt.m158832b(pushMessage, (Activity) obj);
                }
            });
            return true;
        }
        if (bdt.m101237f()) {
            return true;
        }
        if (PushMessageIntent.conversation_single.equals(pushMessage.intent)) {
            return false;
        }
        return m158834d(pushMessage, pushTrackData);
    }

    /* JADX INFO: renamed from: j */
    public static void m158840j() {
        TantanApp.f17180c.m214263b0(new C18667a(), vwb.m200324f0(PushMessageIntent.live_living_push, PushMessageIntent.live_square_push, PushMessageIntent.live_anchor_push, "live.suggest.room", "live.suggest.activity", "live.summary.refresh", "live.startlive.authorized", "live.voiceLiving.push", "live.voiceFriendLiving.push", "live.voiceFriendOncall.push", "live.voiceLikeOrFollowLiving.push", "live.voiceLikeOrFollowOncall.push", "live.voiceLiving.start", "live.anchor.living.push", "voice.live.activity.refresh", "voice.live.counter.refresh", "live.audience.suggest.push", "live.audience.signin.push", "live.schema.push.in.app", "live.schema.push", "voice.live.newcomerTask.accomplished", "live.voiceLiving.partnerFinder.push", "live.schema.push.all", "live.card.push.in.app", "live.schema.boutique.enter", PushMessageIntent.conversation_single, "livechat.fixedroom.cell.newmsg", "live.chatNewMsg.push", "voice.square.honorGift.refresh", "live.ongoingLive.pinkCard", "video.chat.notify.push", "live.videochat.fakeCall", "live.videochat.randomMatch.success"), vwb.m200324f0("voice.enterroom.push", "voice.enterroom.push-managerRecall", "goPage.live.", "goRun.live."));
    }
}
