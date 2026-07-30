package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ConvAdditionalCompliment;
import com.p051p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p051p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class br5 {
    /* JADX INFO: renamed from: a */
    public static ConvAdditionalCompliment m106030a(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        if (m106034e(conversation) && (conversationAdditional = conversation.additional) != null) {
            return conversationAdditional.compliment;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106031b(Act act, Conversation conversation, String str, String str2) {
        if (!m106032c(conversation) || !m106036g(conversation) || m106041l() || act == null || TextUtils.isEmpty(str2)) {
            return false;
        }
        i4g0.m138523u("e_intl_chat_im_user_profile_click", str, pf60.m172085a("whisper_profile_entry", str2));
        CoreModule.m30933P().m143405a().mo34568pr(act, "p_intl_message_view,e_intl_check_user_profile_click,click", Privilege.liked_user);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m106032c(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM106030a = m106030a(conversation);
        return convAdditionalComplimentM106030a != null && convAdditionalComplimentM106030a.isActor;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m106033d(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (!m106034e(conversation)) {
            return m106042m(conversation) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor;
        }
        ConvAdditionalCompliment convAdditionalComplimentM106030a = m106030a(conversation);
        return convAdditionalComplimentM106030a != null && convAdditionalComplimentM106030a.isActor;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m106034e(Conversation conversation) {
        return conversation != null && TextUtils.equals(conversation.convType, "compliment");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m106035f(Conversation conversation) {
        return m106034e(conversation) || m106042m(conversation);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m106036g(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM106030a = m106030a(conversation);
        return convAdditionalComplimentM106030a != null && "free".equals(convAdditionalComplimentM106030a.type);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m106037h(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM106030a = m106030a(conversation);
        return convAdditionalComplimentM106030a != null && "paid".equals(convAdditionalComplimentM106030a.type);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m106038i(Message message) {
        MessageAdditionalData messageAdditionalData;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment;
        return m106040k(message) && (messageAdditionalData = message.additionalData) != null && (messageAdditionalDataCompliment = messageAdditionalData.compliment) != null && "paid".equals(messageAdditionalDataCompliment.type);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m106039j(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (!m106034e(conversation)) {
            return m106042m(conversation) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && "paid".equals(convAdditionalSwiper.type);
        }
        ConvAdditionalCompliment convAdditionalComplimentM106030a = m106030a(conversation);
        return convAdditionalComplimentM106030a != null && "paid".equals(convAdditionalComplimentM106030a.type);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m106040k(Message message) {
        return message != null && TEnum.equals(message.messageType(), "picture_compliment");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m106041l() {
        return (joa.m146386f4() && joa.m146396k4()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m106042m(Conversation conversation) {
        return conversation != null && TextUtils.equals(conversation.convType, ConversationType.swiper);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m106043n() {
        return joa.m146354D3();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m106044o(Conversation conversation, User user) {
        if (m106035f(conversation) && !TEnum.equals(conversation.status, "dismissed")) {
            return user == null || !User.isMatched(user);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m106045p(User user) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (user == null || user.isMe() || user.isTeamAccount() || User.isMatched(user)) {
            return true;
        }
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, RelationshipStatus.disliked)) {
            return true;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        if (conversationM33859Xe != null && TextUtils.equals(conversationM33859Xe.convType, "default")) {
            return true;
        }
        if (m106034e(conversationM33859Xe) && m106032c(conversationM33859Xe)) {
            return true;
        }
        return m106042m(conversationM33859Xe) && (conversationAdditional = conversationM33859Xe.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m106046q(User user) {
        return m106047r(user, null);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m106047r(User user, CoreSuggested.UserInfo userInfo) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalCompliment convAdditionalCompliment;
        SuggestedComplimentItem suggestedComplimentItem;
        if (user != null && !user.isMe() && !user.isTeamAccount()) {
            if (userInfo != null && (suggestedComplimentItem = userInfo.compliment) != null && "paid".equals(suggestedComplimentItem.type)) {
                return true;
            }
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
            if (conversationM33859Xe != null && (conversationAdditional = conversationM33859Xe.additional) != null && (convAdditionalCompliment = conversationAdditional.compliment) != null && convAdditionalCompliment != null && !convAdditionalCompliment.isActor && "paid".equals(convAdditionalCompliment.type)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m106048s(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalMatchInfo convAdditionalMatchInfo;
        if (conversation == null) {
            return false;
        }
        if (m106034e(conversation)) {
            return true;
        }
        if (!TextUtils.equals(conversation.convType, "default") || (conversationAdditional = conversation.additional) == null || (convAdditionalMatchInfo = conversationAdditional.matchInfo) == null) {
            return false;
        }
        return !TextUtils.isEmpty(convAdditionalMatchInfo.sourceEn);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m106049t(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (conversation == null) {
            return false;
        }
        if (!TextUtils.equals(conversation.convType, "compliment")) {
            return TextUtils.equals(conversation.convType, ConversationType.swiper) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor && "paid".equals(convAdditionalSwiper.type);
        }
        ConvAdditionalCompliment convAdditionalComplimentM106030a = m106030a(conversation);
        return convAdditionalComplimentM106030a != null && convAdditionalComplimentM106030a.isActor && "paid".equals(convAdditionalComplimentM106030a.type);
    }
}
