package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.notifications.PushUpdateIntentAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.result.PurchaseResultAct;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ya7 implements wr2.InterfaceC21168a {
    @Override // p153l.wr2.InterfaceC21168a
    /* JADX INFO: renamed from: a */
    public Intent mo96415a(PushMessage pushMessage, boolean z, Context context) {
        Intent intentM213310e;
        if (TextUtils.equals(pushMessage.intent, "group.notification.list")) {
            return jek.m144575g(context);
        }
        if (rum0.m183208c() && PushMessageIntent.call_voice_single.equals(pushMessage.intent)) {
            xzm0.m213760p().m213778v(pushMessage, true);
            VoiceCallStatus voiceCallStatus = VoiceCallStatus.get(pushMessage.messageCustom.voiceStatus);
            return (TEnum.equals(voiceCallStatus, VoiceCallStatus.calling) || TEnum.equals(voiceCallStatus, "accepted")) ? xwa.m213330y(context) : xwa.m213319n(context, pushMessage.content.f39652id, 1);
        }
        if (TextUtils.equals(PushMessageIntent.call_voiceinviting_single, pushMessage.intent)) {
            PushMessageContent pushMessageContent = pushMessage.content;
            String str = pushMessageContent.f39652id;
            boolean zEquals = pushMessageContent.type.equals("conversation");
            PushMessageContent pushMessageContent2 = pushMessage.content;
            if (zEquals) {
                str = pushMessageContent2.f39652id;
            } else if (pushMessageContent2.type.equals("message") && NullChecker.m82486a(pushMessage.content.parent) && !TextUtils.isEmpty(pushMessage.content.parent.f39607id)) {
                str = pushMessage.content.parent.f39607id;
            }
            return xwa.m213319n(context, str, 1);
        }
        if (PushMessageIntent.growth_follow.equals(pushMessage.intent)) {
            Intent intentM213324s = xwa.m213324s(context, Uri.parse(pushMessage.link));
            intentM213324s.putExtra("bundle_notify_type", pushMessage.intent);
            toh0.m192044d(intentM213324s, true, false);
            return intentM213324s;
        }
        if (TextUtils.equals(PushMessageIntent.membership_expiration, pushMessage.intent)) {
            Intent intentM213324s2 = xwa.m213324s(context, Uri.parse(pushMessage.link));
            intentM213324s2.putExtra("bundle_notify_type", pushMessage.intent);
            toh0.m192044d(intentM213324s2, true, false);
            return intentM213324s2;
        }
        if ("common.link".equals(pushMessage.intent) || TextUtils.equals("heartbeat.match.link", pushMessage.intent)) {
            Intent intentM213324s3 = xwa.m213324s(context, Uri.parse(pushMessage.link));
            intentM213324s3.putExtra("bundle_notify_type", pushMessage.intent);
            toh0.m192044d(intentM213324s3, true, false);
            if (NullChecker.m82486a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.source) && TextUtils.equals(pushMessage.messageCustom.source, "heartbeat.match.broadcast")) {
                long j = (long) pushMessage.messageCustom.expire;
                intentM213324s3.putExtra("bundle_check_exp", true);
                intentM213324s3.putExtra("bundle_push_exp_time", j);
            }
            pushMessage.toJson();
            return intentM213324s3;
        }
        if (PushMessageIntent.conversation_single.equals(pushMessage.intent) || "male.message.repeat".equals(pushMessage.intent) || "chatheat.exchat".equals(pushMessage.intent)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(pushMessage.content.f39652id);
            if (!User.isMatched(userM116503Pa) && !User.isTeamAccount(pushMessage.content.f39652id) && (!NullChecker.m82486a(userM116503Pa) || !NullChecker.m82486a(userM116503Pa.localRelationship) || !TextUtils.equals(userM116503Pa.localRelationship.convType, "heartbeatMatch"))) {
                Intent intentM213316k = xwa.m213316k(context, NavigationIntent.get(NavigationIntent.menu));
                toh0.m192044d(intentM213316k, true, false);
                return intentM213316k;
            }
            Intent intentM213319n = xwa.m213319n(context, pushMessage.content.f39652id, 1);
            intentM213319n.putExtra("bundle_notify_type", pushMessage.intent);
            toh0.m192044d(intentM213319n, true, false);
            return intentM213319n;
        }
        if ("greeting.single".equals(pushMessage.intent) || "greeting.list".equals(pushMessage.intent)) {
            if (User.isMatched(CoreModule.f18264c.f20381e0.m116503Pa(pushMessage.content.f39652id)) || User.isTeamAccount(pushMessage.content.f39652id)) {
                Intent intentM213319n2 = xwa.m213319n(context, pushMessage.content.f39652id, 1);
                intentM213319n2.putExtra("bundle_notify_type", pushMessage.intent);
                toh0.m192044d(intentM213319n2, true, false);
                return intentM213319n2;
            }
            Intent intentM213316k2 = xwa.m213316k(context, NavigationIntent.get(NavigationIntent.greetChat));
            toh0.m192044d(intentM213316k2, true, false);
            intentM213316k2.putExtra("greetingId", pushMessage.content.f39652id);
            return intentM213316k2;
        }
        if ("greeting.kankantab".equals(pushMessage.intent) && !TextUtils.isEmpty(pushMessage.link)) {
            Intent intentM213324s4 = xwa.m213324s(context, Uri.parse(pushMessage.link));
            toh0.m192044d(intentM213324s4, true, false);
            return intentM213324s4;
        }
        if (PushMessageIntent.quickchat_match.equals(pushMessage.intent) || "quickchat.speed-match".equals(pushMessage.intent)) {
            Intent intentM213316k3 = xwa.m213316k(context, NavigationIntent.get(NavigationIntent.quickChatMatch));
            OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
            onlineMatchMatchUser.transDataFromPush(pushMessage);
            intentM213316k3.putExtra("otherUser", onlineMatchMatchUser);
            toh0.m192044d(intentM213316k3, true, false);
            return intentM213316k3;
        }
        if (PushMessageIntent.conversation_group.equals(pushMessage.intent)) {
            Intent intentM213319n3 = xwa.m213319n(context, pushMessage.content.f39652id, 1);
            intentM213319n3.putExtra("bundle_notify_type", pushMessage.intent);
            toh0.m192044d(intentM213319n3, true, false);
            return intentM213319n3;
        }
        if (PushMessageIntent.conversation_list.equals(pushMessage.intent) || "kankan.match".equals(pushMessage.intent)) {
            Intent intentM213316k4 = xwa.m213316k(context, NavigationIntent.get(NavigationIntent.menu));
            toh0.m192044d(intentM213316k4, true, false);
            return intentM213316k4;
        }
        if (PushMessageIntent.secretcrush_received.equals(pushMessage.intent)) {
            Intent intentM213316k5 = xwa.m213316k(context, NavigationIntent.get(NavigationIntent.secret_crush));
            toh0.m192044d(intentM213316k5, true, false);
            return intentM213316k5;
        }
        if (PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            Intent intentM40727Z6 = pushMessage.content.type.equals("user") ? NewMainAct.m40727Z6(context, "superlike_user_id", pushMessage.content.f39652id) : xwa.m213310e(context);
            toh0.m192044d(intentM40727Z6, true, false);
            return intentM40727Z6;
        }
        if (PushMessageIntent.letter_received.equals(pushMessage.intent)) {
            String str2 = pushMessage.messageCustom.letter;
            if (!pushMessage.content.type.equals("user") || TextUtils.isEmpty(str2)) {
                intentM213310e = xwa.m213310e(context);
            } else {
                intentM213310e = NewMainAct.m40727Z6(context, "letter_user_id", pushMessage.content.f39652id);
                intentM213310e.putExtra("letter_content", pushMessage.messageCustom.letter);
            }
            toh0.m192044d(intentM213310e, true, false);
            return intentM213310e;
        }
        if ((PushMessageIntent.suggested_list.equals(pushMessage.intent) || PushMessageIntent.huawei_unreadMsg.equals(pushMessage.intent)) && !TextUtils.isEmpty(pushMessage.link)) {
            Intent intentM213324s5 = xwa.m213324s(context, Uri.parse(pushMessage.link));
            toh0.m192044d(intentM213324s5, true, true);
            if (!z) {
                a17.m95457h().m95458i(true);
            }
            return intentM213324s5;
        }
        if ("placesv2.challenge".equals(pushMessage.intent)) {
            Intent intentM213324s6 = xwa.m213324s(context, Uri.parse(pushMessage.link));
            toh0.m192044d(intentM213324s6, true, false);
            return intentM213324s6;
        }
        if (PushMessageIntent.friend_reminder.equals(pushMessage.intent)) {
            Intent intentM40761q7 = NewMainAct.m40761q7(context);
            toh0.m192044d(intentM40761q7, true, false);
            return intentM40761q7;
        }
        if (PushMessageIntent.push_pay_landpage.equals(pushMessage.intent)) {
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            return PurchaseResultAct.m55916Y1(context, pushMessageCustom.category, pushMessageCustom.orderId, pushMessageCustom.currencySymbol, pushMessageCustom.price, pushMessageCustom.privileges);
        }
        if (PushMessageIntent.see_picks.equals(pushMessage.intent)) {
            Intent intentM40764r7 = NewMainAct.m40764r7(context);
            toh0.m192044d(intentM40764r7, true, true);
            return intentM40764r7;
        }
        if ("guide.update".equals(pushMessage.intent)) {
            return new Intent(context, (Class<?>) PushUpdateIntentAct.class);
        }
        if (TextUtils.equals("heartbeat.match.recall", pushMessage.intent)) {
            Intent intentM213316k6 = xwa.m213316k(context, NavigationIntent.get("heartbeatMatch"));
            intentM213316k6.putExtra("bundle_notify_type", pushMessage.intent);
            toh0.m192044d(intentM213316k6, true, false);
            long j2 = (long) pushMessage.messageCustom.expire;
            intentM213316k6.putExtra("bundle_check_exp", true);
            intentM213316k6.putExtra("bundle_push_exp_time", j2);
            intentM213316k6.putExtra("traker", pushMessage.messageCustom.tracker);
            intentM213316k6.putExtra(UserId.TYPE, pushMessage.messageCustom.userId);
            pushMessage.toJson();
            return intentM213316k6;
        }
        if (TextUtils.equals("quickchat.party", pushMessage.intent)) {
            Intent intentM40702O5 = NewMainAct.m40702O5(context, NavigationIntent.get("cards"), NavigationCardIntent.get("cards"), new HashMap());
            intentM40702O5.putExtra("bundle_notify_type", pushMessage.intent);
            toh0.m192044d(intentM40702O5, true, false);
            return intentM40702O5;
        }
        Intent intentM213310e2 = xwa.m213310e(context);
        toh0.m192044d(intentM213310e2, true, true);
        if (!z) {
            a17.m95457h().m95458i(true);
        }
        return intentM213310e2;
    }
}
