package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ConvAdditionalCompliment;
import com.p046p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p046p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class xp5 {
    /* JADX INFO: renamed from: a */
    public static ConvAdditionalCompliment m210461a(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        if (m210465e(conversation) && (conversationAdditional = conversation.additional) != null) {
            return conversationAdditional.compliment;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m210462b(Act act, Conversation conversation, String str, String str2) {
        if (!m210463c(conversation) || !m210467g(conversation) || m210472l() || act == null || TextUtils.isEmpty(str2)) {
            return false;
        }
        zvf0.m220399u("e_intl_chat_im_user_profile_click", str, j760.m140076a("whisper_profile_entry", str2));
        CoreModule.m29935P().m94651a().mo33565pr(act, "p_intl_message_view,e_intl_check_user_profile_click,click", Privilege.liked_user);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m210463c(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM210461a = m210461a(conversation);
        return convAdditionalComplimentM210461a != null && convAdditionalComplimentM210461a.isActor;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m210464d(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (!m210465e(conversation)) {
            return m210473m(conversation) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor;
        }
        ConvAdditionalCompliment convAdditionalComplimentM210461a = m210461a(conversation);
        return convAdditionalComplimentM210461a != null && convAdditionalComplimentM210461a.isActor;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m210465e(Conversation conversation) {
        return conversation != null && TextUtils.equals(conversation.convType, "compliment");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m210466f(Conversation conversation) {
        return m210465e(conversation) || m210473m(conversation);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m210467g(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM210461a = m210461a(conversation);
        return convAdditionalComplimentM210461a != null && "free".equals(convAdditionalComplimentM210461a.type);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m210468h(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM210461a = m210461a(conversation);
        return convAdditionalComplimentM210461a != null && "paid".equals(convAdditionalComplimentM210461a.type);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m210469i(Message message) {
        MessageAdditionalData messageAdditionalData;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment;
        return m210471k(message) && (messageAdditionalData = message.additionalData) != null && (messageAdditionalDataCompliment = messageAdditionalData.compliment) != null && "paid".equals(messageAdditionalDataCompliment.type);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m210470j(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (!m210465e(conversation)) {
            return m210473m(conversation) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && "paid".equals(convAdditionalSwiper.type);
        }
        ConvAdditionalCompliment convAdditionalComplimentM210461a = m210461a(conversation);
        return convAdditionalComplimentM210461a != null && "paid".equals(convAdditionalComplimentM210461a.type);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m210471k(Message message) {
        return message != null && TEnum.equals(message.messageType(), "picture_compliment");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m210472l() {
        return (xma.m210071e4() && xma.m210081j4()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m210473m(Conversation conversation) {
        return conversation != null && TextUtils.equals(conversation.convType, ConversationType.swiper);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m210474n() {
        return xma.m210040C3();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m210475o(Conversation conversation, User user) {
        if (m210466f(conversation) && !TEnum.equals(conversation.status, "dismissed")) {
            return user == null || !User.isMatched(user);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m210476p(User user) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (user == null || user.isMe() || user.isTeamAccount() || User.isMatched(user)) {
            return true;
        }
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, RelationshipStatus.disliked)) {
            return true;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        if (conversationM32856Xe != null && TextUtils.equals(conversationM32856Xe.convType, "default")) {
            return true;
        }
        if (m210465e(conversationM32856Xe) && m210463c(conversationM32856Xe)) {
            return true;
        }
        return m210473m(conversationM32856Xe) && (conversationAdditional = conversationM32856Xe.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m210477q(User user) {
        return m210478r(user, null);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m210478r(User user, CoreSuggested.UserInfo userInfo) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalCompliment convAdditionalCompliment;
        SuggestedComplimentItem suggestedComplimentItem;
        if (user != null && !user.isMe() && !user.isTeamAccount()) {
            if (userInfo != null && (suggestedComplimentItem = userInfo.compliment) != null && "paid".equals(suggestedComplimentItem.type)) {
                return true;
            }
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
            if (conversationM32856Xe != null && (conversationAdditional = conversationM32856Xe.additional) != null && (convAdditionalCompliment = conversationAdditional.compliment) != null && convAdditionalCompliment != null && !convAdditionalCompliment.isActor && "paid".equals(convAdditionalCompliment.type)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m210479s(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalMatchInfo convAdditionalMatchInfo;
        if (conversation == null) {
            return false;
        }
        if (m210465e(conversation)) {
            return true;
        }
        if (!TextUtils.equals(conversation.convType, "default") || (conversationAdditional = conversation.additional) == null || (convAdditionalMatchInfo = conversationAdditional.matchInfo) == null) {
            return false;
        }
        return !TextUtils.isEmpty(convAdditionalMatchInfo.sourceEn);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m210480t(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (conversation == null) {
            return false;
        }
        if (!TextUtils.equals(conversation.convType, "compliment")) {
            return TextUtils.equals(conversation.convType, ConversationType.swiper) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor && "paid".equals(convAdditionalSwiper.type);
        }
        ConvAdditionalCompliment convAdditionalComplimentM210461a = m210461a(conversation);
        return convAdditionalComplimentM210461a != null && convAdditionalComplimentM210461a.isActor && "paid".equals(convAdditionalComplimentM210461a.type);
    }
}
