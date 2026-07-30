package p153l;

import android.app.Activity;
import android.app.PendingIntent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.gson.Gson;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class odt {

    /* JADX INFO: renamed from: l.odt$a */
    public class C19112a implements cmb0.InterfaceC16312g {
        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: a */
        public boolean mo103259a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (!uqb0.f180396b0.f170326c.mo68476yn() || !uqb0.f180396b0.f170324a.signedIn_() || !tbs.f172990c) {
                return false;
            }
            if (fss.m127253p(v5k0.m199903o(null), pushMessage, pushTrackData)) {
                return true;
            }
            gss.m132147c(pushMessage.intent, false, pushMessage.link);
            return odt.m167338i(pushMessage, pushTrackData);
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo103260b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            pushMessage.toString();
            if (!mqr.m159592l()) {
                return null;
            }
            PendingIntent pendingIntentM127245h = fss.m127245h(pushMessage, pushTrackData);
            if (pendingIntentM127245h != null) {
                return pendingIntentM127245h;
            }
            return (("live.schema.push.all".equals(str2) || "live.schema.boutique.enter".equals(str2)) && !pushMessage.silent) ? cft.m109592b(pushMessage.link, pushTrackData) : cft.m109591a(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m167330a(String str, String str2) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m167331b(PushMessage pushMessage, Activity activity) {
        if (activity instanceof LiveVChatAct) {
            ((LiveVChatAct) activity).m70353g2(pushMessage.messageCustom);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m167332c(@NotNull PushMessage pushMessage) {
        if (!"live.schema.push.in.app".equals(pushMessage.intent) && !"live.audience.signin.push".equals(pushMessage.intent) && !"live.voiceLiving.partnerFinder.push".equals(pushMessage.intent) && !"live.anchor.living.push".equals(pushMessage.intent) && !"live.card.push.in.app".equals(pushMessage.intent) && !"live.ongoingLive.pinkCard".equals(pushMessage.intent)) {
            return false;
        }
        m167334e(pushMessage);
        z0n.m218136a().m218138c(pushMessage);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m167333d(PushMessage pushMessage, PushTrackData pushTrackData) {
        if (pushMessage != null) {
            String str = pushMessage.intent;
            str.getClass();
            switch (str) {
                case "live.square.push":
                    v5k0.m199904p(pushMessage, pushTrackData);
                    return true;
                case "live.suggest.room":
                    v5k0.m199900l("updateSuggestRoom" + v5k0.m199897i(pushMessage), null);
                    return true;
                case "live.suggest.activity":
                    v5k0.m199900l("updateSuggestActivity" + v5k0.m199897i(pushMessage), null);
                    return true;
                default:
                    if (!pushMessage.silent) {
                        cft.m109594d(pushMessage, pushTrackData);
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m167334e(PushMessage pushMessage) {
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
    public static boolean m167335f(PushMessage pushMessage, PushTrackData pushTrackData) {
        if (!"live.schema.push.all".equals(pushMessage.intent) && !"live.schema.boutique.enter".equals(pushMessage.intent)) {
            return false;
        }
        if (pushMessage.silent) {
            if (m167337h() && App.m21425e() > 10000) {
                v5k0.m199899k(pushMessage.link, null);
            }
        } else {
            if (m167337h() && m167336g(pushMessage.link)) {
                z0n.m218136a().m218138c(pushMessage);
                return true;
            }
            if (TextUtils.equals(pushMessage.messageCustom.category, OMSResourceType.background) && m167337h()) {
                return true;
            }
            if (TextUtils.equals(pushMessage.messageCustom.category, DownloadService.KEY_FOREGROUND) && !m167337h()) {
                return true;
            }
            if (!TextUtils.isEmpty(pushMessage.link) && !pushMessage.link.contains("&from=")) {
                pushMessage.link += "&from=from_push";
            }
            if (TextUtils.equals(pushMessage.messageCustom.liveMode, "virtualAvatar") && !TextUtils.isEmpty(pushMessage.link) && !pushMessage.link.contains("&liveMode=")) {
                pushMessage.link += "&liveMode=virtualAvatar";
            }
            if (q5k0.m175372I().mo175434f(SchemeKey.get(Uri.parse(pushMessage.link).getHost()), new abe0.C15681a(tbs.f172988a, Uri.parse(pushMessage.link).toString()).m96748d(), new z20() { // from class: l.ndt
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    odt.m167330a((String) obj, (String) obj2);
                }
            }) == null) {
                return true;
            }
            PendingIntent pendingIntentM109592b = cft.m109592b(pushMessage.link, pushTrackData);
            m167334e(pushMessage);
            mbs.m157851f(pushMessage, pendingIntentM109592b, null, null, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m167336g(@NotNull String str) {
        return str.contains(SchemeKey.enterSuggestVoiceRoom) || str.contains(SchemeKey.enterVoiceRoom);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m167337h() {
        return (Act.foreground_() == null || Act.foreground_().f16062a.get() == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m167338i(final PushMessage pushMessage, PushTrackData pushTrackData) {
        boolean z = false;
        if ("live.startlive.authorized".equals(pushMessage.intent)) {
            StringBuilder sb = new StringBuilder("updateCanUserStartLive?hasPermission=");
            Boolean bool = pushMessage.messageCustom.canUserStartLive;
            if (bool != null && bool.booleanValue()) {
                z = true;
            }
            sb.append(z);
            v5k0.m199900l(sb.toString(), null);
            return true;
        }
        if (!mqr.m159592l()) {
            return false;
        }
        if (m167335f(pushMessage, pushTrackData) || m167332c(pushMessage)) {
            return true;
        }
        if ("live.videochat.fakeCall".equals(pushMessage.intent)) {
            Act actM199903o = v5k0.m199903o(null);
            if (actM199903o == null) {
                return true;
            }
            z = pb1.m171472b().mo171474c() != null;
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            String str = pushMessageCustom.anchorCallId;
            if (z) {
                jwu.m147240O(str, VoiceCallStatus.busy).subscribe(dhw.m115824c());
            } else {
                jwk0.m147170d(actM199903o, pushMessageCustom.anchorId, pushMessageCustom.source, str);
            }
            return true;
        }
        if ("live.summary.refresh".equals(pushMessage.intent)) {
            v5k0.m199900l("updateLiveSummary", null);
            return true;
        }
        if ("voice.live.activity.refresh".equals(pushMessage.intent)) {
            v5k0.m199900l("updateVoiceActivitiesNum", null);
            return true;
        }
        if ("voice.live.counter.refresh".equals(pushMessage.intent)) {
            v5k0.m199900l("updateNewVoiceActivitiesNum", null);
            return true;
        }
        if ("livechat.fixedroom.cell.newmsg".equals(pushMessage.intent)) {
            String str2 = pushMessage.messageCustom.cell;
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            try {
                mbs.m157821G().mo68463r9().mo108368b(VirtualVoiceGroupConversationCell.JSON_ADAPTER.parse(str2));
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
                xys xysVar = (xys) new Gson().fromJson(str3, xys.class);
                xysVar.isFromLongLink = true;
                ((gm3) tbs.m190077m(itd0.f116821c)).m130736k(xysVar);
            } catch (Exception unused2) {
            }
            return true;
        }
        if (pushMessage.intent.contains("voice.enterroom.push")) {
            cft.m109594d(pushMessage, pushTrackData);
            return true;
        }
        if (pushMessage.intent.contains("live.videochat.randomMatch.success")) {
            cft.m109595e(new y20() { // from class: l.mdt
                @Override // p153l.y20
                public final void call(Object obj) {
                    odt.m167331b(pushMessage, (Activity) obj);
                }
            });
            return true;
        }
        if (cft.m109596f()) {
            return true;
        }
        if (PushMessageIntent.conversation_single.equals(pushMessage.intent)) {
            return false;
        }
        return m167333d(pushMessage, pushTrackData);
    }

    /* JADX INFO: renamed from: j */
    public static void m167339j() {
        TantanApp.f17899c.m111141b0(new C19112a(), jyb.m147507f0(PushMessageIntent.live_living_push, PushMessageIntent.live_square_push, PushMessageIntent.live_anchor_push, "live.suggest.room", "live.suggest.activity", "live.summary.refresh", "live.startlive.authorized", "live.voiceLiving.push", "live.voiceFriendLiving.push", "live.voiceFriendOncall.push", "live.voiceLikeOrFollowLiving.push", "live.voiceLikeOrFollowOncall.push", "live.voiceLiving.start", "live.anchor.living.push", "voice.live.activity.refresh", "voice.live.counter.refresh", "live.audience.suggest.push", "live.audience.signin.push", "live.schema.push.in.app", "live.schema.push", "voice.live.newcomerTask.accomplished", "live.voiceLiving.partnerFinder.push", "live.schema.push.all", "live.card.push.in.app", "live.schema.boutique.enter", PushMessageIntent.conversation_single, "livechat.fixedroom.cell.newmsg", "live.chatNewMsg.push", "voice.square.honorGift.refresh", "live.ongoingLive.pinkCard", "video.chat.notify.push", "live.videochat.fakeCall", "live.videochat.randomMatch.success"), jyb.m147507f0("voice.enterroom.push", "voice.enterroom.push-managerRecall", "goPage.live.", "goRun.live."));
    }
}
