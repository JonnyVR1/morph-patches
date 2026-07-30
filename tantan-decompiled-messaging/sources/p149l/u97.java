package p149l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.notifications.PushUpdateIntentAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.result.PurchaseResultAct;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class u97 implements gr2.InterfaceC17143a {
    @Override // p149l.gr2.InterfaceC17143a
    /* JADX INFO: renamed from: a */
    public Intent mo104991a(PushMessage pushMessage, boolean z, Context context) {
        Intent intentM151849e;
        if (TextUtils.equals(pushMessage.intent, "group.notification.list")) {
            return tbk.m187860g(context);
        }
        if (nlm0.m160070c() && PushMessageIntent.call_voice_single.equals(pushMessage.intent)) {
            tqm0.m190131p().m190149v(pushMessage, true);
            VoiceCallStatus voiceCallStatus = VoiceCallStatus.get(pushMessage.messageCustom.voiceStatus);
            return (TEnum.equals(voiceCallStatus, VoiceCallStatus.calling) || TEnum.equals(voiceCallStatus, "accepted")) ? lva.m151869y(context) : lva.m151858n(context, pushMessage.content.f38804id, 1);
        }
        if (TextUtils.equals(PushMessageIntent.call_voiceinviting_single, pushMessage.intent)) {
            PushMessageContent pushMessageContent = pushMessage.content;
            String str = pushMessageContent.f38804id;
            boolean zEquals = pushMessageContent.type.equals("conversation");
            PushMessageContent pushMessageContent2 = pushMessage.content;
            if (zEquals) {
                str = pushMessageContent2.f38804id;
            } else if (pushMessageContent2.type.equals("message") && NullChecker.m81303a(pushMessage.content.parent) && !TextUtils.isEmpty(pushMessage.content.parent.f38759id)) {
                str = pushMessage.content.parent.f38759id;
            }
            return lva.m151858n(context, str, 1);
        }
        if (PushMessageIntent.growth_follow.equals(pushMessage.intent)) {
            Intent intentM151863s = lva.m151863s(context, Uri.parse(pushMessage.link));
            intentM151863s.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.m154548d(intentM151863s, true, false);
            return intentM151863s;
        }
        if (TextUtils.equals(PushMessageIntent.membership_expiration, pushMessage.intent)) {
            Intent intentM151863s2 = lva.m151863s(context, Uri.parse(pushMessage.link));
            intentM151863s2.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.m154548d(intentM151863s2, true, false);
            return intentM151863s2;
        }
        if ("common.link".equals(pushMessage.intent) || TextUtils.equals("heartbeat.match.link", pushMessage.intent)) {
            Intent intentM151863s3 = lva.m151863s(context, Uri.parse(pushMessage.link));
            intentM151863s3.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.m154548d(intentM151863s3, true, false);
            if (NullChecker.m81303a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.source) && TextUtils.equals(pushMessage.messageCustom.source, "heartbeat.match.broadcast")) {
                long j = (long) pushMessage.messageCustom.expire;
                intentM151863s3.putExtra("bundle_check_exp", true);
                intentM151863s3.putExtra("bundle_push_exp_time", j);
            }
            pushMessage.toJson();
            return intentM151863s3;
        }
        if (PushMessageIntent.conversation_single.equals(pushMessage.intent) || "male.message.repeat".equals(pushMessage.intent) || "chatheat.exchat".equals(pushMessage.intent)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(pushMessage.content.f38804id);
            if (!User.isMatched(userM169430Pa) && !User.isTeamAccount(pushMessage.content.f38804id) && (!NullChecker.m81303a(userM169430Pa) || !NullChecker.m81303a(userM169430Pa.localRelationship) || !TextUtils.equals(userM169430Pa.localRelationship.convType, "heartbeatMatch"))) {
                Intent intentM151855k = lva.m151855k(context, NavigationIntent.get(NavigationIntent.menu));
                mgh0.m154548d(intentM151855k, true, false);
                return intentM151855k;
            }
            Intent intentM151858n = lva.m151858n(context, pushMessage.content.f38804id, 1);
            intentM151858n.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.m154548d(intentM151858n, true, false);
            return intentM151858n;
        }
        if ("greeting.single".equals(pushMessage.intent) || "greeting.list".equals(pushMessage.intent)) {
            if (User.isMatched(CoreModule.f17545c.f19639e0.m169430Pa(pushMessage.content.f38804id)) || User.isTeamAccount(pushMessage.content.f38804id)) {
                Intent intentM151858n2 = lva.m151858n(context, pushMessage.content.f38804id, 1);
                intentM151858n2.putExtra("bundle_notify_type", pushMessage.intent);
                mgh0.m154548d(intentM151858n2, true, false);
                return intentM151858n2;
            }
            Intent intentM151855k2 = lva.m151855k(context, NavigationIntent.get(NavigationIntent.greetChat));
            mgh0.m154548d(intentM151855k2, true, false);
            intentM151855k2.putExtra("greetingId", pushMessage.content.f38804id);
            return intentM151855k2;
        }
        if ("greeting.kankantab".equals(pushMessage.intent) && !TextUtils.isEmpty(pushMessage.link)) {
            Intent intentM151863s4 = lva.m151863s(context, Uri.parse(pushMessage.link));
            mgh0.m154548d(intentM151863s4, true, false);
            return intentM151863s4;
        }
        if (PushMessageIntent.quickchat_match.equals(pushMessage.intent) || "quickchat.speed-match".equals(pushMessage.intent)) {
            Intent intentM151855k3 = lva.m151855k(context, NavigationIntent.get(NavigationIntent.quickChatMatch));
            OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
            onlineMatchMatchUser.transDataFromPush(pushMessage);
            intentM151855k3.putExtra("otherUser", onlineMatchMatchUser);
            mgh0.m154548d(intentM151855k3, true, false);
            return intentM151855k3;
        }
        if (PushMessageIntent.conversation_group.equals(pushMessage.intent)) {
            Intent intentM151858n3 = lva.m151858n(context, pushMessage.content.f38804id, 1);
            intentM151858n3.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.m154548d(intentM151858n3, true, false);
            return intentM151858n3;
        }
        if (PushMessageIntent.conversation_list.equals(pushMessage.intent) || "kankan.match".equals(pushMessage.intent)) {
            Intent intentM151855k4 = lva.m151855k(context, NavigationIntent.get(NavigationIntent.menu));
            mgh0.m154548d(intentM151855k4, true, false);
            return intentM151855k4;
        }
        if (PushMessageIntent.secretcrush_received.equals(pushMessage.intent)) {
            Intent intentM151855k5 = lva.m151855k(context, NavigationIntent.get(NavigationIntent.secret_crush));
            mgh0.m154548d(intentM151855k5, true, false);
            return intentM151855k5;
        }
        if (PushMessageIntent.superLike_received.equals(pushMessage.intent)) {
            Intent intentM39711T6 = pushMessage.content.type.equals("user") ? NewMainAct.m39711T6(context, "superlike_user_id", pushMessage.content.f38804id) : lva.m151849e(context);
            mgh0.m154548d(intentM39711T6, true, false);
            return intentM39711T6;
        }
        if (PushMessageIntent.letter_received.equals(pushMessage.intent)) {
            String str2 = pushMessage.messageCustom.letter;
            if (!pushMessage.content.type.equals("user") || TextUtils.isEmpty(str2)) {
                intentM151849e = lva.m151849e(context);
            } else {
                intentM151849e = NewMainAct.m39711T6(context, "letter_user_id", pushMessage.content.f38804id);
                intentM151849e.putExtra("letter_content", pushMessage.messageCustom.letter);
            }
            mgh0.m154548d(intentM151849e, true, false);
            return intentM151849e;
        }
        if ((PushMessageIntent.suggested_list.equals(pushMessage.intent) || PushMessageIntent.huawei_unreadMsg.equals(pushMessage.intent)) && !TextUtils.isEmpty(pushMessage.link)) {
            Intent intentM151863s5 = lva.m151863s(context, Uri.parse(pushMessage.link));
            mgh0.m154548d(intentM151863s5, true, true);
            if (!z) {
                xz6.m211889h().m211890i(true);
            }
            return intentM151863s5;
        }
        if ("placesv2.challenge".equals(pushMessage.intent)) {
            Intent intentM151863s6 = lva.m151863s(context, Uri.parse(pushMessage.link));
            mgh0.m154548d(intentM151863s6, true, false);
            return intentM151863s6;
        }
        if (PushMessageIntent.friend_reminder.equals(pushMessage.intent)) {
            Intent intentM39740k7 = NewMainAct.m39740k7(context);
            mgh0.m154548d(intentM39740k7, true, false);
            return intentM39740k7;
        }
        if (PushMessageIntent.push_pay_landpage.equals(pushMessage.intent)) {
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            return PurchaseResultAct.m54733X1(context, pushMessageCustom.category, pushMessageCustom.orderId, pushMessageCustom.currencySymbol, pushMessageCustom.price, pushMessageCustom.privileges);
        }
        if (PushMessageIntent.see_picks.equals(pushMessage.intent)) {
            Intent intentM39744l7 = NewMainAct.m39744l7(context);
            mgh0.m154548d(intentM39744l7, true, true);
            return intentM39744l7;
        }
        if ("guide.update".equals(pushMessage.intent)) {
            return new Intent(context, (Class<?>) PushUpdateIntentAct.class);
        }
        if (TextUtils.equals("heartbeat.match.recall", pushMessage.intent)) {
            Intent intentM151855k6 = lva.m151855k(context, NavigationIntent.get("heartbeatMatch"));
            intentM151855k6.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.m154548d(intentM151855k6, true, false);
            long j2 = (long) pushMessage.messageCustom.expire;
            intentM151855k6.putExtra("bundle_check_exp", true);
            intentM151855k6.putExtra("bundle_push_exp_time", j2);
            intentM151855k6.putExtra("traker", pushMessage.messageCustom.tracker);
            intentM151855k6.putExtra(UserId.TYPE, pushMessage.messageCustom.userId);
            pushMessage.toJson();
            return intentM151855k6;
        }
        if (TextUtils.equals("quickchat.party", pushMessage.intent)) {
            Intent intentM39690K5 = NewMainAct.m39690K5(context, NavigationIntent.get("cards"), NavigationCardIntent.get("cards"), new HashMap());
            intentM39690K5.putExtra("bundle_notify_type", pushMessage.intent);
            mgh0.m154548d(intentM39690K5, true, false);
            return intentM39690K5;
        }
        Intent intentM151849e2 = lva.m151849e(context);
        mgh0.m154548d(intentM151849e2, true, true);
        if (!z) {
            xz6.m211889h().m211890i(true);
        }
        return intentM151849e2;
    }
}
