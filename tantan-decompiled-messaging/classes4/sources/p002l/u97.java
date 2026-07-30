package p002l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.notifications.PushUpdateIntentAct;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VoiceCallStatus;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.result.PurchaseResultAct;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.lva;
import l.mgh0;
import l.nlm0;
import l.tbk;
import l.tqm0;
import l.xz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u97 implements gr2.InterfaceC0597a {
    @Override // p002l.gr2.InterfaceC0597a
    /* JADX INFO: renamed from: a */
    public Intent mo14018a(PushMessage pushMessage, boolean z, Context context) {
        Intent intentE;
        if (TextUtils.equals(pushMessage.intent, "group.notification.list")) {
            return tbk.g(context);
        }
        if (nlm0.c() && "call.voice.single".equals(pushMessage.intent)) {
            tqm0.p().v(pushMessage, true);
            VoiceCallStatus voiceCallStatus = VoiceCallStatus.get(pushMessage.messageCustom.voiceStatus);
            return (TEnum.equals(voiceCallStatus, "calling") || TEnum.equals(voiceCallStatus, "accepted")) ? lva.y(context) : lva.n(context, pushMessage.content.id, 1);
        }
        if (TextUtils.equals("call.voiceinviting.single", pushMessage.intent)) {
            PushMessageContent pushMessageContent = pushMessage.content;
            String str = pushMessageContent.id;
            boolean zEquals = pushMessageContent.type.equals("conversation");
            PushMessageContent pushMessageContent2 = pushMessage.content;
            if (zEquals) {
                str = pushMessageContent2.id;
            } else if (pushMessageContent2.type.equals("message") && NullChecker.a(pushMessage.content.parent) && !TextUtils.isEmpty(pushMessage.content.parent.id)) {
                str = pushMessage.content.parent.id;
            }
            return lva.n(context, str, 1);
        }
        if ("growth.follow".equals(pushMessage.intent)) {
            Intent intentS = lva.s(context, Uri.parse(pushMessage.link));
            intentS.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.d(intentS, true, false);
            return intentS;
        }
        if (TextUtils.equals("membership.expiration", pushMessage.intent)) {
            Intent intentS2 = lva.s(context, Uri.parse(pushMessage.link));
            intentS2.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.d(intentS2, true, false);
            return intentS2;
        }
        if ("common.link".equals(pushMessage.intent) || TextUtils.equals("heartbeat.match.link", pushMessage.intent)) {
            Intent intentS3 = lva.s(context, Uri.parse(pushMessage.link));
            intentS3.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.d(intentS3, true, false);
            if (NullChecker.a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.source) && TextUtils.equals(pushMessage.messageCustom.source, "heartbeat.match.broadcast")) {
                long j = (long) pushMessage.messageCustom.expire;
                intentS3.putExtra("bundle_check_exp", true);
                intentS3.putExtra("bundle_push_exp_time", j);
            }
            pushMessage.toJson();
            return intentS3;
        }
        if ("conversation.single".equals(pushMessage.intent) || "male.message.repeat".equals(pushMessage.intent) || "chatheat.exchat".equals(pushMessage.intent)) {
            User userPa = CoreModule.c.e0.Pa(pushMessage.content.id);
            if (!User.isMatched(userPa) && !User.isTeamAccount(pushMessage.content.id) && (!NullChecker.a(userPa) || !NullChecker.a(userPa.localRelationship) || !TextUtils.equals(userPa.localRelationship.convType, "heartbeatMatch"))) {
                Intent intentK = lva.k(context, NavigationIntent.get("menu"));
                mgh0.d(intentK, true, false);
                return intentK;
            }
            Intent intentN = lva.n(context, pushMessage.content.id, 1);
            intentN.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.d(intentN, true, false);
            return intentN;
        }
        if ("greeting.single".equals(pushMessage.intent) || "greeting.list".equals(pushMessage.intent)) {
            if (User.isMatched(CoreModule.c.e0.Pa(pushMessage.content.id)) || User.isTeamAccount(pushMessage.content.id)) {
                Intent intentN2 = lva.n(context, pushMessage.content.id, 1);
                intentN2.putExtra("bundle_notify_type", pushMessage.intent);
                mgh0.d(intentN2, true, false);
                return intentN2;
            }
            Intent intentK2 = lva.k(context, NavigationIntent.get("greetChat"));
            mgh0.d(intentK2, true, false);
            intentK2.putExtra("greetingId", pushMessage.content.id);
            return intentK2;
        }
        if ("greeting.kankantab".equals(pushMessage.intent) && !TextUtils.isEmpty(pushMessage.link)) {
            Intent intentS4 = lva.s(context, Uri.parse(pushMessage.link));
            mgh0.d(intentS4, true, false);
            return intentS4;
        }
        if ("quickchat.match".equals(pushMessage.intent) || "quickchat.speed-match".equals(pushMessage.intent)) {
            Intent intentK3 = lva.k(context, NavigationIntent.get("quickChatMatch"));
            OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
            onlineMatchMatchUser.transDataFromPush(pushMessage);
            intentK3.putExtra("otherUser", onlineMatchMatchUser);
            mgh0.d(intentK3, true, false);
            return intentK3;
        }
        if ("conversation.group".equals(pushMessage.intent)) {
            Intent intentN3 = lva.n(context, pushMessage.content.id, 1);
            intentN3.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.d(intentN3, true, false);
            return intentN3;
        }
        if ("conversation.list".equals(pushMessage.intent) || "kankan.match".equals(pushMessage.intent)) {
            Intent intentK4 = lva.k(context, NavigationIntent.get("menu"));
            mgh0.d(intentK4, true, false);
            return intentK4;
        }
        if ("secretcrush.received".equals(pushMessage.intent)) {
            Intent intentK5 = lva.k(context, NavigationIntent.get("secret crush"));
            mgh0.d(intentK5, true, false);
            return intentK5;
        }
        if ("superLike.received".equals(pushMessage.intent)) {
            Intent intentT6 = pushMessage.content.type.equals("user") ? NewMainAct.T6(context, "superlike_user_id", pushMessage.content.id) : lva.e(context);
            mgh0.d(intentT6, true, false);
            return intentT6;
        }
        if ("letter.received".equals(pushMessage.intent)) {
            String str2 = pushMessage.messageCustom.letter;
            if (!pushMessage.content.type.equals("user") || TextUtils.isEmpty(str2)) {
                intentE = lva.e(context);
            } else {
                intentE = NewMainAct.T6(context, "letter_user_id", pushMessage.content.id);
                intentE.putExtra("letter_content", pushMessage.messageCustom.letter);
            }
            mgh0.d(intentE, true, false);
            return intentE;
        }
        if (("suggested.list".equals(pushMessage.intent) || "huawei.unreadMsg".equals(pushMessage.intent)) && !TextUtils.isEmpty(pushMessage.link)) {
            Intent intentS5 = lva.s(context, Uri.parse(pushMessage.link));
            mgh0.d(intentS5, true, true);
            if (!z) {
                xz6.h().i(true);
            }
            return intentS5;
        }
        if ("placesv2.challenge".equals(pushMessage.intent)) {
            Intent intentS6 = lva.s(context, Uri.parse(pushMessage.link));
            mgh0.d(intentS6, true, false);
            return intentS6;
        }
        if ("friend.reminder".equals(pushMessage.intent)) {
            Intent intentK7 = NewMainAct.k7(context);
            mgh0.d(intentK7, true, false);
            return intentK7;
        }
        if ("push.pay.landpage".equals(pushMessage.intent)) {
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            return PurchaseResultAct.X1(context, pushMessageCustom.category, pushMessageCustom.orderId, pushMessageCustom.currencySymbol, pushMessageCustom.price, pushMessageCustom.privileges);
        }
        if ("see.picks".equals(pushMessage.intent)) {
            Intent intentL7 = NewMainAct.l7(context);
            mgh0.d(intentL7, true, true);
            return intentL7;
        }
        if ("guide.update".equals(pushMessage.intent)) {
            return new Intent(context, (Class<?>) PushUpdateIntentAct.class);
        }
        if (TextUtils.equals("heartbeat.match.recall", pushMessage.intent)) {
            Intent intentK6 = lva.k(context, NavigationIntent.get("heartbeatMatch"));
            intentK6.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.d(intentK6, true, false);
            long j2 = (long) pushMessage.messageCustom.expire;
            intentK6.putExtra("bundle_check_exp", true);
            intentK6.putExtra("bundle_push_exp_time", j2);
            intentK6.putExtra("traker", pushMessage.messageCustom.tracker);
            intentK6.putExtra("userid", pushMessage.messageCustom.userId);
            pushMessage.toJson();
            return intentK6;
        }
        if (TextUtils.equals("quickchat.party", pushMessage.intent)) {
            Intent intentK8 = NewMainAct.K5(context, NavigationIntent.get("cards"), NavigationCardIntent.get("cards"), new HashMap());
            intentK8.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.d(intentK8, true, false);
            return intentK8;
        }
        Intent intentE2 = lva.e(context);
        mgh0.d(intentE2, true, true);
        if (!z) {
            xz6.h().i(true);
        }
        return intentE2;
    }
}
