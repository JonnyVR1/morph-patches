package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ConvAdditionalCompliment;
import com.p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xp5 {
    /* JADX INFO: renamed from: a */
    public static ConvAdditionalCompliment m27580a(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        if (m27584e(conversation) && (conversationAdditional = conversation.additional) != null) {
            return conversationAdditional.compliment;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27581b(Act act, Conversation conversation, String str, String str2) {
        if (!m27582c(conversation) || !m27586g(conversation) || m27591l() || act == null || TextUtils.isEmpty(str2)) {
            return false;
        }
        zvf0.u("e_intl_chat_im_user_profile_click", str, new j760[]{j760.a("whisper_profile_entry", str2)});
        CoreModule.m1854P().m11706a().m5502pr(act, "p_intl_message_view,e_intl_check_user_profile_click,click", Privilege.liked_user);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m27582c(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM27580a = m27580a(conversation);
        return convAdditionalComplimentM27580a != null && convAdditionalComplimentM27580a.isActor;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m27583d(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (!m27584e(conversation)) {
            return m27592m(conversation) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor;
        }
        ConvAdditionalCompliment convAdditionalComplimentM27580a = m27580a(conversation);
        return convAdditionalComplimentM27580a != null && convAdditionalComplimentM27580a.isActor;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m27584e(Conversation conversation) {
        return conversation != null && TextUtils.equals(conversation.convType, "compliment");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m27585f(Conversation conversation) {
        return m27584e(conversation) || m27592m(conversation);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m27586g(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM27580a = m27580a(conversation);
        return convAdditionalComplimentM27580a != null && "free".equals(convAdditionalComplimentM27580a.type);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m27587h(Conversation conversation) {
        ConvAdditionalCompliment convAdditionalComplimentM27580a = m27580a(conversation);
        return convAdditionalComplimentM27580a != null && "paid".equals(convAdditionalComplimentM27580a.type);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m27588i(Message message) {
        MessageAdditionalData messageAdditionalData;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment;
        return m27590k(message) && (messageAdditionalData = message.additionalData) != null && (messageAdditionalDataCompliment = messageAdditionalData.compliment) != null && "paid".equals(messageAdditionalDataCompliment.type);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m27589j(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (!m27584e(conversation)) {
            return m27592m(conversation) && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && "paid".equals(convAdditionalSwiper.type);
        }
        ConvAdditionalCompliment convAdditionalComplimentM27580a = m27580a(conversation);
        return convAdditionalComplimentM27580a != null && "paid".equals(convAdditionalComplimentM27580a.type);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m27590k(Message message) {
        return message != null && TEnum.equals(message.messageType(), "picture_compliment");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m27591l() {
        return (xma.m27379e4() && xma.m27389j4()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m27592m(Conversation conversation) {
        return conversation != null && TextUtils.equals(conversation.convType, "swiper");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m27593n() {
        return xma.m27348C3();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m27594o(Conversation conversation, User user) {
        if (m27585f(conversation) && !TEnum.equals(conversation.status, "dismissed")) {
            return user == null || !User.isMatched(user);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m27595p(User user) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (user == null || user.isMe() || user.isTeamAccount() || User.isMatched(user)) {
            return true;
        }
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "disliked")) {
            return true;
        }
        Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(((DbObject) user).id);
        if (conversationM4786Xe != null && TextUtils.equals(conversationM4786Xe.convType, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            return true;
        }
        if (m27584e(conversationM4786Xe) && m27582c(conversationM4786Xe)) {
            return true;
        }
        return m27592m(conversationM4786Xe) && (conversationAdditional = conversationM4786Xe.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m27596q(User user) {
        return m27597r(user, null);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m27597r(User user, CoreSuggested.UserInfo userInfo) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalCompliment convAdditionalCompliment;
        SuggestedComplimentItem suggestedComplimentItem;
        if (user != null && !user.isMe() && !user.isTeamAccount()) {
            if (userInfo != null && (suggestedComplimentItem = userInfo.compliment) != null && "paid".equals(suggestedComplimentItem.type)) {
                return true;
            }
            Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(((DbObject) user).id);
            if (conversationM4786Xe != null && (conversationAdditional = conversationM4786Xe.additional) != null && (convAdditionalCompliment = conversationAdditional.compliment) != null && convAdditionalCompliment != null && !convAdditionalCompliment.isActor && "paid".equals(convAdditionalCompliment.type)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m27598s(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalMatchInfo convAdditionalMatchInfo;
        if (conversation == null) {
            return false;
        }
        if (m27584e(conversation)) {
            return true;
        }
        if (!TextUtils.equals(conversation.convType, CameraSticker.CATEGORY_DEFAULT_FILTER) || (conversationAdditional = conversation.additional) == null || (convAdditionalMatchInfo = conversationAdditional.matchInfo) == null) {
            return false;
        }
        return !TextUtils.isEmpty(convAdditionalMatchInfo.sourceEn);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m27599t(Conversation conversation) {
        ConversationAdditional conversationAdditional;
        ConvAdditionalSwiper convAdditionalSwiper;
        if (conversation == null) {
            return false;
        }
        if (!TextUtils.equals(conversation.convType, "compliment")) {
            return TextUtils.equals(conversation.convType, "swiper") && (conversationAdditional = conversation.additional) != null && (convAdditionalSwiper = conversationAdditional.swiper) != null && convAdditionalSwiper.isActor && "paid".equals(convAdditionalSwiper.type);
        }
        ConvAdditionalCompliment convAdditionalComplimentM27580a = m27580a(conversation);
        return convAdditionalComplimentM27580a != null && convAdditionalComplimentM27580a.isActor && "paid".equals(convAdditionalComplimentM27580a.type);
    }
}
