package p153l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.ConversationAdditionalTag;
import com.p051p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MonetizationPromotion;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.data.PlatinumPinChat;
import com.p051p1.mobile.putong.core.data.PrivateQuestion;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.data.Questions;
import com.p051p1.mobile.putong.core.data.ReSwipeInfo;
import com.p051p1.mobile.putong.core.data.Reminder;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Passby;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.Promotions;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipExtensions;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserActivityInfo;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.VisitPlace;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes9.dex */
public class il8 extends h9c implements gq2<CoreData> {

    /* JADX INFO: renamed from: t */
    public static String f115534t = "invalid_moment_id";

    /* JADX INFO: renamed from: c */
    public t600 f115535c;

    /* JADX INFO: renamed from: d */
    public wzh0<DbLinks> f115536d;

    /* JADX INFO: renamed from: e */
    public wzh0<Question> f115537e;

    /* JADX INFO: renamed from: f */
    public uvv f115538f;

    /* JADX INFO: renamed from: g */
    public wzh0<Sticker> f115539g;

    /* JADX INFO: renamed from: h */
    public wzh0<VerificationCenter> f115540h;

    /* JADX INFO: renamed from: i */
    public x090 f115541i;

    /* JADX INFO: renamed from: j */
    public wzh0<UserPrivilege> f115542j;

    /* JADX INFO: renamed from: k */
    public sry f115543k;

    /* JADX INFO: renamed from: l */
    public gk6 f115544l;

    /* JADX INFO: renamed from: m */
    public mm6 f115545m;

    /* JADX INFO: renamed from: n */
    public xu4 f115546n;

    /* JADX INFO: renamed from: o */
    public wu4 f115547o;

    /* JADX INFO: renamed from: p */
    public u6b0 f115548p;

    /* JADX INFO: renamed from: q */
    public qsb f115549q;

    /* JADX INFO: renamed from: r */
    public jzj f115550r;

    /* JADX INFO: renamed from: s */
    public tv4 f115551s;

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Message m140588A(Message message) {
        return message;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m140595m(ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2, ChatGroupMember chatGroupMember3) {
        if (NullChecker.m82486a(chatGroupMember3)) {
            if (TextUtils.equals(chatGroupMember3.nickName, chatGroupMember2.nickName)) {
                chatGroupMember2.nickNamePinyin = chatGroupMember3.nickNamePinyin.toUpperCase();
            } else {
                chatGroupMember2.nickNamePinyin = uxk.m198498c().m198501d(chatGroupMember2.nickName).toUpperCase();
            }
            chatGroupMember2.avatar = chatGroupMember3.avatar;
            chatGroupMember2.userName = chatGroupMember3.userName;
            chatGroupMember2.gender = chatGroupMember3.gender;
        } else {
            User userQuery = uqb0.f180405k0.f184355d.query(chatGroupMember.userId);
            if (NullChecker.m82486a(userQuery) && userQuery.hasPic()) {
                chatGroupMember2.avatar = userQuery.pictures.get(0).cover().profileSmall().formatted();
                chatGroupMember2.userName = userQuery.name;
                chatGroupMember2.gender = userQuery.gender;
            }
            if (!TextUtils.isEmpty(chatGroupMember2.nickName)) {
                chatGroupMember2.nickNamePinyin = uxk.m198498c().m198501d(chatGroupMember2.nickName).toUpperCase();
            } else if (NullChecker.m82486a(userQuery)) {
                chatGroupMember2.nickNamePinyin = uxk.m198498c().m198501d(userQuery.name).toUpperCase();
            }
        }
        chatGroupMember2.searchCategory = chatGroupMember2.groupMemberName() + "|" + chatGroupMember2.nickNamePinyin;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m140596n(Envelope envelope) {
        if (CoreModule.f18264c.m32487o3() == null) {
            CoreModule.f18264c.m32477F3(envelope.counters);
        } else {
            envelope.counters.mergeData(CoreModule.f18264c.m32487o3());
            CoreModule.f18264c.m32477F3(envelope.counters);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m140598p(ChatHeat chatHeat, ChatHeat chatHeat2) {
        if (NullChecker.m82486a(chatHeat2)) {
            chatHeat.tempDownDegree = chatHeat2.tempDownDegree;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m140600r(Message message, Message message2) {
        return (int) (message2.createdTime - message.createdTime);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m140604v(ChatGroup chatGroup, ChatGroup chatGroup2) {
        if (NullChecker.m82486a(chatGroup2) && !TextUtils.isEmpty(chatGroup2.localConId) && TextUtils.isEmpty(chatGroup.localConId)) {
            chatGroup.localConId = chatGroup2.localConId;
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m140605w() {
        C4883c c4883c = CoreModule.f18264c;
        c4883c.f20352U0.m137019l(c4883c.m32487o3());
    }

    /* JADX INFO: renamed from: F */
    public final boolean m140609F(Conversation conversation) {
        return (conversation.isHeartbeatConv() && ((gta.m132210e().m132214d().mo34942vp() || gta.m132210e().m132213c().mo34653Ig()) && conversation.unreadMessages == 1)) || conversation.lowPayOneSideConv() || conversation.newMatchExpShowInList();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m140610G(Conversation conversation, Conversation conversation2) {
        if (conversation.isHeartbeatConv() || conversation.isSeeUpgradedConv() || "lovescript".equals(conversation2.convType) || conversation.isMediaBuzzConv()) {
            return true;
        }
        return (NullChecker.m82486a(conversation.property) && NullChecker.m82486a(conversation.property.quickchat) && TextUtils.equals(conversation.property.quickchat.bellType, "male")) || conversation.isForceDropDownCell();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m140611H(boolean z, boolean z2, CoreData coreData, final User user, User user2, User user3) {
        Profile profile;
        Long l2;
        UserActivityInfo userActivityInfo;
        Followship followship;
        Passby passby;
        Relationship relationship;
        VisitPlace visitPlace;
        RelationshipExtensions relationshipExtensions;
        if (gta.m132210e().m132214d().mo34679E() && (user3 == null || !TextUtils.equals(user2.name, user3.name) || (!jyb.m147479J(user2.pictures) && !jyb.m147479J(user3.pictures) && !user2.pictures.get(0).equals(user3.pictures.get(0))))) {
            List<ChatGroupMember> listM208674j = this.f115547o.m207918F(user2.f56859id).m208674j();
            if (!jyb.m147479J(listM208674j)) {
                for (ChatGroupMember chatGroupMember : listM208674j) {
                    chatGroupMember.userName = user2.name;
                    chatGroupMember.gender = user2.gender;
                    chatGroupMember.avatar = user2.pictures.get(0).cover().profileSmall().formatted();
                    chatGroupMember.nickNamePinyin = uxk.m198498c().m198501d(chatGroupMember.groupMemberName()).toUpperCase();
                    chatGroupMember.searchCategory = chatGroupMember.groupMemberName() + "|" + chatGroupMember.nickNamePinyin;
                    this.f115547o.upsert(chatGroupMember);
                }
            }
        }
        if (user3 != null && !z) {
            Relationship relationship2 = user2.localRelationship;
            Relationship relationship3 = user3.localRelationship;
            if (relationship2 == null) {
                user2.localRelationship = relationship3;
            } else if (relationship3 != null) {
                ConversationStatus conversationStatus = relationship2.conversationStatus;
                if (conversationStatus == null || TEnum.equals(conversationStatus, "unknown_")) {
                    user2.localRelationship.conversationStatus = user3.localRelationship.conversationStatus;
                }
                if (jyb.m147479J(user2.localRelationship.topics)) {
                    user2.localRelationship.topics = user3.localRelationship.topics;
                }
                Relationship relationship4 = user2.localRelationship;
                if (relationship4.relationshipExtensions == null && (relationshipExtensions = user3.localRelationship.relationshipExtensions) != null) {
                    relationship4.relationshipExtensions = relationshipExtensions;
                }
            }
        }
        if (user3 != null && user2.visitPlace == null && (visitPlace = user3.visitPlace) != null) {
            user2.visitPlace = visitPlace;
        }
        if (gta.m132210e().m132214d().mo34811c() && user3 != null && (relationship = user3.localRelationship) != null && (TEnum.equals(relationship.conversationStatus, ConversationStatus.peeking) || TEnum.equals(user3.localRelationship.conversationStatus, ConversationStatus.peeking_blocked))) {
            Relationship relationship5 = user2.localRelationship;
            if (relationship5 == null) {
                user2.localRelationship = user3.localRelationship;
            } else if (TextUtils.equals("quickchat", relationship5.convType) && TEnum.equals(user2.localRelationship.conversationStatus, "default")) {
                user2.localRelationship.conversationStatus = ConversationStatus.get(ConversationStatus.peeking);
            } else if (TextUtils.equals("quickchat", user2.localRelationship.convType) && TEnum.equals(user2.localRelationship.conversationStatus, "blocked")) {
                user2.localRelationship.conversationStatus = ConversationStatus.get(ConversationStatus.peeking_blocked);
            }
        }
        if (user2.state == null && user3 != null) {
            user2.state = user3.state;
        }
        if (jyb.m147479J(user2.abGroups) && user3 != null && !jyb.m147479J(user3.abGroups)) {
            user2.abGroups = user3.abGroups;
        }
        if (user2.credit == null && user3 != null) {
            user2.credit = user3.credit;
        }
        if (!z2 && user3 != null) {
            user2.voice = user3.voice;
        }
        if (TextUtils.isEmpty(user2.publicId) && user3 != null) {
            user2.publicId = user3.publicId;
        }
        Location location = user2.location;
        if (location.passby == null && user3 != null && (passby = user3.location.passby) != null) {
            location.passby = passby;
        }
        if (NullChecker.m82486a(user3) && jyb.m147479J(user2.profile.contactLookups.lookups) && !jyb.m147479J(user3.profile.contactLookups.lookups)) {
            user2.profile.contactLookups = user3.profile.contactLookups;
        }
        if (!jyb.m147479J(coreData.messages) && !user.isMe()) {
            int iM147476G = jyb.m147476G(coreData.messages, new qcj() { // from class: l.rk8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Message) obj).owner, user.f56859id));
                }
            });
            if (NullChecker.m82486a(user3) && iM147476G >= 0) {
                long j = (long) coreData.messages.get(iM147476G).createdTime;
                if (user3.localLatestReceivedMessageTime < j) {
                    user3.localLatestReceivedMessageTime = j;
                }
            }
        }
        if (user3 != null && (followship = user3.localFollowship) != null && user2.localFollowship == null) {
            user2.localFollowship = followship;
        }
        if (user3 != null) {
            double d = user3.signupTime;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && user2.signupTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                user2.signupTime = d;
            }
        }
        if (user3 != null) {
            user2.matePlanUser = user2.matePlanUser || user3.matePlanUser;
            user2.matePlanAdUser = user2.matePlanAdUser || user3.matePlanAdUser;
        }
        if (user3 != null && (userActivityInfo = user3.userActivityInfo) != null && user2.userActivityInfo == null) {
            user2.userActivityInfo = userActivityInfo;
        }
        Profile profile2 = user2.profile;
        if (profile2 != null && profile2.receivedLikes == null && user3 != null && (profile = user3.profile) != null && (l2 = profile.receivedLikes) != null) {
            profile2.receivedLikes = l2;
        }
        if (gta.m132210e().m132214d().mo34943w() && user3 != null && NullChecker.m82486a(user3.profile.extensions) && NullChecker.m82486a(user3.profile.extensions.basic) && !jyb.m147479J(user3.profile.extensions.basic.ideal) && NullChecker.m82486a(user2.profile.extensions) && NullChecker.m82486a(user2.profile.extensions.basic)) {
            ProfileExtensionBasic profileExtensionBasic = user2.profile.extensions.basic;
            if (profileExtensionBasic.ideal == null) {
                profileExtensionBasic.ideal = user3.profile.extensions.basic.ideal;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x036f  */
    /* JADX WARN: Code duplicated, block: B:168:0x037a  */
    /* JADX WARN: Code duplicated, block: B:173:0x039c  */
    /* JADX WARN: Code duplicated, block: B:175:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:190:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:197:0x041a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0443  */
    /* JADX WARN: Code duplicated, block: B:207:0x044c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m140612I(Message message, HashMap map, HashMap map2, List list, Envelope envelope, String str, Message message2, Message message3) {
        double d;
        F f;
        F f2;
        F f3;
        boolean z;
        User userM116506Q9;
        F f4;
        F f5;
        String next;
        Boolean bool;
        message.messageType = message.messageType();
        if (TEnum.equals(message2.messageType, MessageType.harass_alert)) {
            if (NullChecker.m82486a(message2.additionalData) && NullChecker.m82486a(message2.additionalData.harassAlertInfo) && !TextUtils.isEmpty(message2.additionalData.harassAlertInfo.tips)) {
                message.value = message2.additionalData.harassAlertInfo.tips;
            }
            message2.localNotificationStatus = NotificationStatus.get("removed");
        }
        boolean z2 = true;
        if (!message2.isOtherUser()) {
            Audio audio = message2.audio();
            if (audio != null) {
                audio.audioRead = true;
            }
        } else if (map.size() > 0 && map.containsKey(message2.cid)) {
            if (map.get(message2.cid) == null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Message insert error with null conv ");
                    sb.append("cid:" + message2.cid + SignParameters.NEW_LINE);
                    sb.append("msg detail:\n");
                    sb.append(message2.toJson());
                    sb.append(SignParameters.NEW_LINE);
                    sb.append(message2.cid);
                    sb.append("conv id list");
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                    CrashHelper.m82479c(new RuntimeException(sb.toString()));
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
            String str2 = ((Conversation) ((pf60) map.get(message2.cid)).f152156a).readUntil;
            if (str2 != null && !str2.isEmpty() && map2.get(str2) != null && message2.createdTime <= ((Message) map2.get(str2)).createdTime) {
                message2.localNotificationStatus = NotificationStatus.get("removed");
            }
        }
        if (message3 != null) {
            if (TextUtils.isEmpty(message2.cid) && !TextUtils.isEmpty(message3.cid)) {
                message2.cid = message3.cid;
            }
            if (TextUtils.isEmpty(message2.localExtraInfo) && !TextUtils.isEmpty(message3.localExtraInfo)) {
                message2.localExtraInfo = message3.localExtraInfo;
            }
            message2.localCreatedSession = message3.localCreatedSession;
            long j = message2.localCreatedTime;
            long j2 = message3.localCreatedTime;
            if (j > j2) {
                message2.localCreatedTime = j2;
            }
            String str3 = message3.moment;
            message2.localInMoment = (str3 == null || !str3.equals(CoreMomentInfo.LOCAL_ID_INVALID)) && ((bool = message2.recalled) == null || !bool.booleanValue()) && (message2.localInMoment || message3.localInMoment);
            message2.localInConversation = message2.localInConversation || message3.localInConversation;
            if (message2.audio() != null && message3.audio() != null) {
                message2.audio().audioRead = message2.audio().audioRead || message3.audio().audioRead;
            }
            message2.localAnimationKey = message3.localAnimationKey;
            message2.localSafetyReminder = message3.localSafetyReminder;
            message2.localSensitiveWordReminder = message3.localSensitiveWordReminder;
            message2.localAudioText = message3.localAudioText;
            message2.read = message3.read;
            if (TextUtils.isEmpty(message2.fromConvType) && !TextUtils.isEmpty(message3.fromConvType)) {
                message2.fromConvType = message3.fromConvType;
            }
            if (TEnum.equals(message3.messageType, MessageType.common_tip) && NullChecker.m82486a(message3.extData) && NullChecker.m82486a(message2.extData) && TextUtils.equals(message3.extData.extra, "pat") && TextUtils.equals(message3.extData.extra2, "pat_grey")) {
                message2.extData.extra2 = "pat_grey";
            }
        } else {
            if ((gta.m132210e().m132214d().mo34850i() || gta.m132210e().m132214d().mo34958ym()) && !message.isLocal() && !TEnum.equals(message.messageType, "tacit_test") && !TEnum.equals(message.messageType, MessageType.user_info_card) && !TEnum.equals(message.messageType, MessageType.stripes) && !TEnum.equals(message.messageType, MessageType.normal_card) && !list.contains(message.cid)) {
                list.add(message.cid);
            }
            if (uqb0.f180376H.guessedCurrentServerTime() - message.createdTime < 8.64E7d) {
                if (message.audio() != null) {
                    CoreModule.f18264c.f20402l0.m128577d(uqb0.m197266d0(message.audio().format32()));
                } else {
                    message.picture();
                }
            }
            if ((envelope.localOptions & C4879a.f20232L) != 0) {
                final Conversation conversationQuery = this.f115545m.query(message.cid);
                if (conversationQuery == null) {
                    conversationQuery = CoreModule.f18264c.f20387g0.m32898j9(message.cid);
                }
                if (conversationQuery == null) {
                    return;
                }
                pf60 pf60Var = (pf60) jyb.m147471B(map, message.cid, new pcj() { // from class: l.xk8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return jyb.m147494Y(conversationQuery, Boolean.FALSE);
                    }
                });
                if (!User.isTeamAccount(message.owner) && !message.owner.equals(CoreModule.m30929H().userId()) && message.shouldCheckFoulWords()) {
                    F f6 = pf60Var.f152156a;
                    if (((Conversation) f6).localSpoofingNewTime >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d = 0.0d;
                        if (((Conversation) f6).localSpoofingNewTime < message.createdTime && uqb0.f180394Z.m95958O(message.value) && NullChecker.m82486a(uqb0.f180405k0.f184355d.query(message.owner))) {
                            ((Conversation) pf60Var.f152156a).localSpoofingNewTime = message.createdTime;
                        }
                        z = true;
                        if (TEnum.equals(message2.messageType, MessageType.harass_alert) && !message2.isMe()) {
                            f5 = pf60Var.f152156a;
                            if (((Conversation) f5).localBotheringTime < message2.createdTime) {
                                ((Conversation) f5).localBotheringTime = d;
                                z = true;
                            }
                        }
                        if (z) {
                            map.put(message.cid, jyb.m147494Y((Conversation) pf60Var.f152156a, Boolean.TRUE));
                        }
                    } else {
                        d = 0.0d;
                    }
                    if (gta.m132210e().m132214d().mo34859j()) {
                        F f7 = pf60Var.f152156a;
                        if (((Conversation) f7).localSpoofingReminderTime < d || ((Conversation) f7).localSpoofingReminderTime >= message.createdTime || !uqb0.f180394Z.m95959P(message.value)) {
                            f = pf60Var.f152156a;
                            if (((Conversation) f).localBotherWxTime >= d || ((Conversation) f).localBotherWxTime >= message.createdTime || !yy6.m217928J(CoreModule.f18265d.m217952t(), message.value)) {
                                f2 = pf60Var.f152156a;
                                if (((Conversation) f2).localBotherCodeTime >= d || ((Conversation) f2).localBotherCodeTime >= message.createdTime || !CoreModule.f18265d.m217949K(message.value)) {
                                    f3 = pf60Var.f152156a;
                                    if (((Conversation) f3).localBotheringTime >= d && ((Conversation) f3).localBotheringTime < message.createdTime && (uqb0.f180394Z.m95954K(message.value) || uqb0.f180394Z.m95956M(message.value))) {
                                        userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                        if (NullChecker.m82486a(userM116506Q9) && (TEnum.equals(message.messageType, "moment_comment") || !userM116506Q9.isFemale())) {
                                            f4 = pf60Var.f152156a;
                                            if (((Conversation) f4).localBotheringTime <= d) {
                                                ((Conversation) f4).localBotheringTime = message.createdTime;
                                                ((Conversation) f4).localBotherStatus = 0;
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ((Conversation) pf60Var.f152156a).localBotherCodeTime = message.createdTime;
                                }
                            } else {
                                ((Conversation) pf60Var.f152156a).localBotherWxTime = message.createdTime;
                            }
                            z = true;
                        } else {
                            User userQuery = uqb0.f180405k0.f184355d.query(message.owner);
                            if (NullChecker.m82486a(userQuery) && NullChecker.m82486a(jyb.m147529r(userQuery.status, new qcj() { // from class: l.zk8
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return Boolean.valueOf(TEnum.equals((UserStatus) obj, UserStatus.RISK_TAG_CHAT_SENSITIVE_WORD_SAFETY_REMINDER));
                                }
                            }))) {
                                message.localSensitiveWordReminder = true;
                                ((Conversation) pf60Var.f152156a).localSpoofingReminderTime = message.createdTime;
                            } else {
                                f = pf60Var.f152156a;
                                if (((Conversation) f).localBotherWxTime >= d) {
                                    f2 = pf60Var.f152156a;
                                    if (((Conversation) f2).localBotherCodeTime >= d) {
                                        f3 = pf60Var.f152156a;
                                        if (((Conversation) f3).localBotheringTime >= d) {
                                            userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                            if (NullChecker.m82486a(userM116506Q9)) {
                                                f4 = pf60Var.f152156a;
                                                if (((Conversation) f4).localBotheringTime <= d) {
                                                    ((Conversation) f4).localBotheringTime = message.createdTime;
                                                    ((Conversation) f4).localBotherStatus = 0;
                                                }
                                            }
                                        }
                                        z = false;
                                    } else {
                                        f3 = pf60Var.f152156a;
                                        if (((Conversation) f3).localBotheringTime >= d) {
                                            userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                            if (NullChecker.m82486a(userM116506Q9)) {
                                                f4 = pf60Var.f152156a;
                                                if (((Conversation) f4).localBotheringTime <= d) {
                                                    ((Conversation) f4).localBotheringTime = message.createdTime;
                                                    ((Conversation) f4).localBotherStatus = 0;
                                                }
                                            }
                                        }
                                        z = false;
                                    }
                                } else {
                                    f2 = pf60Var.f152156a;
                                    if (((Conversation) f2).localBotherCodeTime >= d) {
                                        f3 = pf60Var.f152156a;
                                        if (((Conversation) f3).localBotheringTime >= d) {
                                            userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                            if (NullChecker.m82486a(userM116506Q9)) {
                                                f4 = pf60Var.f152156a;
                                                if (((Conversation) f4).localBotheringTime <= d) {
                                                    ((Conversation) f4).localBotheringTime = message.createdTime;
                                                    ((Conversation) f4).localBotherStatus = 0;
                                                }
                                            }
                                        }
                                        z = false;
                                    } else {
                                        f3 = pf60Var.f152156a;
                                        if (((Conversation) f3).localBotheringTime >= d) {
                                            userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                            if (NullChecker.m82486a(userM116506Q9)) {
                                                f4 = pf60Var.f152156a;
                                                if (((Conversation) f4).localBotheringTime <= d) {
                                                    ((Conversation) f4).localBotheringTime = message.createdTime;
                                                    ((Conversation) f4).localBotherStatus = 0;
                                                }
                                            }
                                        }
                                        z = false;
                                    }
                                }
                            }
                            z = true;
                        }
                    } else {
                        f = pf60Var.f152156a;
                        if (((Conversation) f).localBotherWxTime >= d) {
                            f2 = pf60Var.f152156a;
                            if (((Conversation) f2).localBotherCodeTime >= d) {
                                f3 = pf60Var.f152156a;
                                if (((Conversation) f3).localBotheringTime >= d) {
                                    userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                    if (NullChecker.m82486a(userM116506Q9)) {
                                        f4 = pf60Var.f152156a;
                                        if (((Conversation) f4).localBotheringTime <= d) {
                                            ((Conversation) f4).localBotheringTime = message.createdTime;
                                            ((Conversation) f4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                f3 = pf60Var.f152156a;
                                if (((Conversation) f3).localBotheringTime >= d) {
                                    userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                    if (NullChecker.m82486a(userM116506Q9)) {
                                        f4 = pf60Var.f152156a;
                                        if (((Conversation) f4).localBotheringTime <= d) {
                                            ((Conversation) f4).localBotheringTime = message.createdTime;
                                            ((Conversation) f4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            }
                        } else {
                            f2 = pf60Var.f152156a;
                            if (((Conversation) f2).localBotherCodeTime >= d) {
                                f3 = pf60Var.f152156a;
                                if (((Conversation) f3).localBotheringTime >= d) {
                                    userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                    if (NullChecker.m82486a(userM116506Q9)) {
                                        f4 = pf60Var.f152156a;
                                        if (((Conversation) f4).localBotheringTime <= d) {
                                            ((Conversation) f4).localBotheringTime = message.createdTime;
                                            ((Conversation) f4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                f3 = pf60Var.f152156a;
                                if (((Conversation) f3).localBotheringTime >= d) {
                                    userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(message.owner);
                                    if (NullChecker.m82486a(userM116506Q9)) {
                                        f4 = pf60Var.f152156a;
                                        if (((Conversation) f4).localBotheringTime <= d) {
                                            ((Conversation) f4).localBotheringTime = message.createdTime;
                                            ((Conversation) f4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            }
                        }
                    }
                    if (TEnum.equals(message2.messageType, MessageType.harass_alert)) {
                        f5 = pf60Var.f152156a;
                        if (((Conversation) f5).localBotheringTime < message2.createdTime) {
                            ((Conversation) f5).localBotheringTime = d;
                            z = true;
                        }
                    }
                    if (z) {
                        map.put(message.cid, jyb.m147494Y((Conversation) pf60Var.f152156a, Boolean.TRUE));
                    }
                }
                String strM217939u = yy6.m217939u(message.value);
                if (!TextUtils.isEmpty(strM217939u)) {
                    message.localAnimationKey = strM217939u;
                }
                Audio audio2 = message.audio();
                if (audio2 != null && TEnum.equals(message.localNotificationStatus, "removed")) {
                    audio2.audioRead = true;
                }
            }
            m140614K(message2);
        }
        if (!(NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.oneSideNoMatch)) && message.likeOfMoment == null) {
            Boolean bool2 = message2.recalled;
            if (bool2 != null && bool2.booleanValue()) {
                message2.localNotificationStatus = NotificationStatus.get("removed");
            } else if (message3 != null && !TEnum.equals(message3.localNotificationStatus, "unknown_") && !TEnum.equals(message3.localNotificationStatus, NotificationStatus.undefined)) {
                message2.localNotificationStatus = message3.localNotificationStatus;
            } else if ((envelope.localOptions & C4879a.f20232L) != 0) {
                if (message2.isOtherUser() && TEnum.equals(message2.localNotificationStatus, "unknown_")) {
                    message2.localNotificationStatus = NotificationStatus.get("pending");
                } else {
                    message2.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        } else {
            message2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (gta.m132210e().m132214d().mo34679E() && message2.isGroupMessage()) {
            if (TEnum.equals(message2.messageType, "tickle") || TEnum.equals(message2.messageType, MessageType.conversation_notification)) {
                message2.localNotificationStatus = NotificationStatus.get("removed");
            } else {
                Conversation conversationQuery2 = this.f115545m.query(message2.cid);
                if (!jyb.m147479J(message2.notifiedUsers) && !message.isMe()) {
                    Iterator<String> it2 = message2.notifiedUsers.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else {
                            next = it2.next();
                            if (TextUtils.equals("0", next)) {
                                break;
                            }
                        }
                    } while (!TextUtils.equals(CoreModule.m30929H().userId(), next));
                } else {
                    z2 = false;
                    break;
                }
                if (NullChecker.m82486a(conversationQuery2) && conversationQuery2.muted && !z2) {
                    message2.localNotificationStatus = NotificationStatus.get(NotificationStatus.muting);
                }
            }
            if (TextUtils.equals(message.hostId, str)) {
                message2.localNotificationStatus = NotificationStatus.get(NotificationStatus.muting);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m140613J(final Conversation conversation, CoreData coreData, int i, AtomicBoolean atomicBoolean, Envelope envelope, Conversation conversation2, Conversation conversation3) {
        double d;
        ReSwipeInfo reSwipeInfo;
        final qcj qcjVar = new qcj() { // from class: l.sk8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(TEnum.equals(message.messageType, MessageType.moment_user_state) && TextUtils.equals(message.getHostId(), conversation.f56859id));
            }
        };
        final qcj qcjVar2 = new qcj() { // from class: l.tk8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.m82486a(message) && NullChecker.m82486a(message.extData) && TextUtils.equals(message.extData.msgSource, "system") && TextUtils.equals(message.getHostId(), conversation.f56859id));
            }
        };
        Message message = (Message) jyb.m147529r(coreData.messages, new qcj() { // from class: l.uk8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf(((Boolean) qcjVar.call(message2)).booleanValue() || ((Boolean) qcjVar2.call(message2)).booleanValue());
            }
        });
        boolean z = false;
        if (i == 1 && NullChecker.m82486a(message) && message.isMe()) {
            conversation2.localHasMessage = false;
        }
        if (conversation3 != null) {
            if (TextUtils.equals(conversation2.convType, "default") && NullChecker.m82486a(conversation3.additional) && NullChecker.m82486a(conversation3.additional.localMomentInfo)) {
                ConversationAdditional conversationAdditional = conversation2.additional;
                if (conversationAdditional == null) {
                    conversation2.additional = conversation3.additional;
                } else if (conversationAdditional.localMomentInfo == null) {
                    conversationAdditional.localMomentInfo = conversation3.additional.localMomentInfo;
                }
            }
            boolean z2 = conversation3.localHasMessage || conversation2.localHasMessage;
            conversation2.localHasMessage = z2;
            conversation2.localEverHasMessage = z2 || conversation3.localEverHasMessage || !(TextUtils.isEmpty(conversation.clearedUntil) || TextUtils.equals(conversation.clearedUntil, "0")) || ConversationType.free_see_match.equals(conversation.convType);
            if (gta.m132210e().m132214d().mo34887mj()) {
                ConversationAdditional conversationAdditional2 = conversation2.additional;
                if (conversationAdditional2.reSwipe == null && (reSwipeInfo = conversation3.additional.reSwipe) != null) {
                    conversationAdditional2.reSwipe = reSwipeInfo;
                }
                if (NullChecker.m82486a(conversationAdditional2.reSwipe) && TEnum.equals(conversation2.additional.reSwipe.status, "liked")) {
                    double d2 = conversation2.additional.reSwipe.swipedTime;
                    d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (d2 > conversation2.latestTime) {
                        conversation2.latestTime = d2;
                    }
                } else {
                    d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                }
            } else {
                d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            double d3 = conversation2.latestTime;
            double d4 = conversation3.latestTime;
            if (d3 < d4) {
                conversation2.latestTime = d4;
            }
            if (!TextUtils.isEmpty(conversation3.localMessageInsertReportHint)) {
                conversation2.localMessageInsertReportHint = conversation3.localMessageInsertReportHint;
            }
            conversation2.localNotificationStatus = conversation3.localNotificationStatus;
            conversation2.localBotheringTime = conversation3.localBotheringTime;
            conversation2.localBotherStatus = conversation3.localBotherStatus;
            conversation2.localBotherWxTime = conversation3.localBotherWxTime;
            conversation2.localBotherCodeTime = conversation3.localBotherCodeTime;
            conversation2.reminder = conversation3.reminder;
            conversation2.enterTimes = conversation3.enterTimes;
            if (jyb.m147481L(conversation2.place)) {
                conversation2.place = conversation3.place;
            }
            conversation2.localSpoofingNewTime = conversation3.localSpoofingNewTime;
            conversation2.localSafetyReminderTime = conversation3.localSafetyReminderTime;
            conversation2.localSpoofingReminderTime = conversation3.localSpoofingReminderTime;
            conversation2.forceSend = conversation3.forceSend;
            if (conversation2.conversationUserDistance == 0) {
                conversation2.conversationUserDistance = conversation3.conversationUserDistance;
            }
            if (conversation2.conversationUserUpdatedTime == d) {
                conversation2.conversationUserUpdatedTime = conversation3.conversationUserUpdatedTime;
            }
            if (TextUtils.isEmpty(conversation3.convType) && TextUtils.isEmpty(conversation2.convType)) {
                conversation2.convType = "default";
            } else if (!TextUtils.isEmpty(conversation3.convType) && TextUtils.isEmpty(conversation2.convType)) {
                conversation2.convType = conversation3.convType;
            }
            if (conversation3.localGreetDelete && conversation2.unreadMessages == 0) {
                conversation2.localGreetDelete = true;
            } else {
                conversation2.localGreetDelete = false;
            }
            if (gta.m132210e().m132214d().mo34959ys()) {
                double d5 = conversation3.suggestionScore;
                if (d5 != d && conversation2.suggestionScore == d) {
                    conversation2.suggestionScore = d5;
                }
            }
            conversation2.hasLocalBreakIce = conversation3.hasLocalBreakIce;
            if (TextUtils.equals(conversation3.convType, "heartbeatMatch") && TextUtils.equals(conversation2.convType, "default")) {
                t600 t600Var = this.f115535c;
                Filter<Message> filterMo61359EQ = Message.CID.mo61359EQ(conversation2.f56859id);
                TEnumColumn<Message, MessageType> tEnumColumn = Message.MESSAGETYPE;
                t600Var.delete(Filter.AND(filterMo61359EQ, Filter.m82444OR(tEnumColumn.m61360EQ(MessageType.heartbeat_notify), tEnumColumn.m61360EQ("heartbeat_waiting_response"))));
            }
            if (TextUtils.isEmpty(conversation2.localExtraInfo) && !TextUtils.isEmpty(conversation3.localExtraInfo)) {
                conversation2.localExtraInfo = conversation3.localExtraInfo;
            }
            if (conversation3.isExposureTop()) {
                conversation2.level = 50;
            }
            conversation2.isFake = false;
            conversation2.localIsLimitedTrialSee = conversation3.localIsLimitedTrialSee;
        } else {
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (conversation2.localHasMessage || (!TextUtils.isEmpty(conversation.clearedUntil) && !TextUtils.equals(conversation.clearedUntil, "0"))) {
                z = true;
            }
            conversation2.localEverHasMessage = z;
            if (gta.m132210e().m132214d().mo34959ys() && !conversation2.localHasMessage && pzi0.m174454o() - ((long) conversation2.createdTime) < Constants.ONE_MIN_IN_MILLIS) {
                conversation2.suggestionScore = 100.0d;
            }
            if ((gta.m132210e().m132214d().mo34945x() && TEnum.equals(conversation2.status, "dismissed")) || !TextUtils.isEmpty(conversation2.readUntil) || conversation2.read.booleanValue() || conversation2.localHasMessage || conversation2.f56859id.equals(User.ID_TEAM_ACCOUNT) || conversation2.f56859id.equals(User.ID_TEAM_ACCOUNT_SERVICE) || conversation2.f56859id.equals(User.ID_LIVE_SERVICE)) {
                conversation2.localNotificationStatus = NotificationStatus.get("removed");
            } else {
                conversation2.localNotificationStatus = NotificationStatus.get("pending");
            }
            if (ConversationType.free_see_match.equals(conversation.convType)) {
                conversation2.localEverHasMessage = true;
                if (NullChecker.m82486a(conversation2.property) && NullChecker.m82486a(conversation2.property.limitedTrialSee) && TextUtils.equals(conversation2.property.limitedTrialSee.actorId, CoreModule.m30929H().userId())) {
                    conversation2.localIsLimitedTrialSee = 1;
                }
            }
        }
        if (TextUtils.equals(conversation2.convType, "default") && NullChecker.m82486a(conversation2.additional) && NullChecker.m82486a(conversation2.additional.oneSide) && TEnum.equals(conversation2.additional.oneSide.subChannel, "gift")) {
            l51.m152887G(new Runnable() { // from class: l.vk8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20405m0.m31993D8(conversation.f56859id);
                }
            });
        }
        if (gta.m132210e().m132214d().mo34661B() && gta.m132210e().m132214d().mo34659Aj(conversation)) {
            l51.m152887G(new Runnable() { // from class: l.wk8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20405m0.m31997E8(conversation.f56859id);
                }
            });
        }
        if (gta.m132210e().m132214d().mo34679E() && gta.m132210e().m132214d().mo34730Nd(conversation2)) {
            conversation2.localEverHasMessage = true;
            conversation2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (m140610G(conversation2, conversation)) {
            conversation2.localEverHasMessage = true;
            if (!m140609F(conversation2)) {
                conversation2.read = Boolean.TRUE;
            }
            conversation2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (gta.m132210e().m132214d().mo34931tl() && !conversation2.localEverHasMessage && NullChecker.m82486a(conversation2.additional) && NullChecker.m82486a(conversation2.additional.game) && conversation2.additional.game.gameUnread > 0) {
            conversation2.localEverHasMessage = true;
            conversation2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (gta.m132210e().m132214d().mo34878l()) {
            if (NullChecker.m82486a(conversation3) && NullChecker.m82486a(conversation3.localDraft)) {
                conversation2.localDraft = conversation3.localDraft;
            }
            if (NullChecker.m82486a(conversation3) && !jyb.m147479J(conversation3.localChatBg)) {
                conversation2.localChatBg = conversation3.localChatBg;
            }
        }
        if (gta.m132210e().m132214d().mo34792Yh()) {
            if (!conversation2.localEverHasMessage && pzi0.m174454o() - ((long) CoreModule.f18264c.f20381e0.m116593na().createdTime) < 86400000) {
                conversation2.localEverHasMessage = true;
                atomicBoolean.set(true);
            } else if (pzi0.m174454o() - ((long) CoreModule.f18264c.f20381e0.m116593na().createdTime) > 86400000) {
                CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
                if (!jyb.m147479J(commonData.users)) {
                    for (User user : commonData.users) {
                        if (TextUtils.equals(user.f56859id, conversation.f56859id) && user.createdTime > d && pzi0.m174454o() - ((long) user.createdTime) < 86400000) {
                            conversation2.localEverHasMessage = true;
                            atomicBoolean.set(true);
                        }
                    }
                }
            }
        }
        if (conversation2.level == 1) {
            conversation2.level = 100;
        }
        if (conversation2.level < 55 && NullChecker.m82486a(conversation2.additional) && NullChecker.m82486a(conversation2.additional.tag)) {
            ConversationAdditionalTag conversationAdditionalTag = conversation2.additional.tag;
            if (conversationAdditionalTag.top && conversationAdditionalTag.expireTime * 1000 > pzi0.m174454o()) {
                conversation2.level = 55;
            }
        }
        if (NullChecker.m82486a(conversation2.additional) && NullChecker.m82486a(conversation2.additional.pinChat) && TextUtils.equals(conversation2.additional.pinChat.userId, conversation2.f56859id)) {
            PlatinumPinChat platinumPinChat = conversation2.additional.pinChat;
            if (platinumPinChat.pin && platinumPinChat.expireTime > pzi0.m174454o()) {
                CoreModule.m30933P().m143409f().mo37027zb(conversation2.f56859id, conversation2.level);
                conversation2.level = 90;
            }
        }
        if (NullChecker.m82486a(conversation3) && NullChecker.m82486a(conversation2)) {
            double d6 = conversation3.lastActivityTime;
            if (d6 != d && conversation2.lastActivityTime == d) {
                conversation2.lastActivityTime = d6;
            }
        }
        if (NullChecker.m82486a(conversation3) && NullChecker.m82486a(conversation3.additional) && NullChecker.m82486a(conversation3.additional.heartbeatMatch) && NullChecker.m82486a(conversation2) && NullChecker.m82486a(conversation2.additional) && NullChecker.m82486a(conversation2.additional.heartbeatMatch) && conversation3.additional.heartbeatMatch.lock && !conversation2.additional.heartbeatMatch.lock) {
            CoreModule.f18264c.f20297C0.m146425v4();
            CoreModule.f18264c.f20313H1.m123920Z3();
        }
        if (!conversation.isFakeOneSideConv() || conversation.f21116mm > 0 || CoreModule.f18264c.f20381e0.m116593na().isSVIP()) {
            return;
        }
        conversation.localNotificationStatus = NotificationStatus.get("removed");
    }

    /* JADX INFO: renamed from: K */
    public final void m140614K(Message message) {
        if (!DateUtils.isToday((long) message.createdTime) || User.isTeamAccount(message.cid) || message.localInMoment) {
            return;
        }
        gta.m132210e().m132214d().mo34862jd(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.gq2
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo131338a(final Envelope envelope, CoreData coreData, final boolean z, boolean z2, final boolean z3) {
        boolean z4;
        Conversation conversationQuery;
        Conversation conversationQuery2;
        final il8 il8Var = this;
        final CoreData coreData2 = coreData;
        if (envelope != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (!jyb.m147479J(coreData2.privateQuestions)) {
                Iterator<PrivateQuestion> it = coreData2.privateQuestions.iterator();
                while (it.hasNext()) {
                    il8Var.f115541i.upsert(it.next());
                }
            }
            if (!jyb.m147479J(coreData2.summarizedPrivileges)) {
                Iterator<UserPrivilege> it2 = coreData2.summarizedPrivileges.iterator();
                while (it2.hasNext()) {
                    il8Var.f115542j.upsert(it2.next());
                }
            }
            if (!jyb.m147479J(coreData2.stickers)) {
                Iterator<Sticker> it3 = coreData2.stickers.iterator();
                while (it3.hasNext()) {
                    il8Var.f115539g.upsert(it3.next());
                }
            }
            if (!jyb.m147479J(coreData2.questions)) {
                Iterator<Question> it4 = coreData2.questions.iterator();
                while (it4.hasNext()) {
                    il8Var.f115537e.upsert(it4.next());
                }
            }
            if (!jyb.m147479J(coreData2.literatures)) {
                for (Literatures literatures : coreData2.literatures) {
                    if (NullChecker.m82486a(literatures) && !TextUtils.isEmpty(literatures.f21175id)) {
                        CoreModule.f18264c.f20381e0.m116490M9(literatures.f21175id, literatures);
                    }
                }
            }
            new HashMap();
            HashMap mapM147502d = jyb.m147502d(coreData2.messages, new qcj() { // from class: l.nk8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Message) obj).f56859id;
                }
            }, new qcj() { // from class: l.cl8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return il8.m140588A((Message) obj);
                }
            });
            if (!jyb.m147479J(coreData2.conversations)) {
                Iterator<Conversation> it5 = coreData2.conversations.iterator();
                HashSet hashSet = new HashSet();
                if (!CoreModule.m30932N().mo61558n7()) {
                    hashSet.add(User.ID_AI_STORY);
                }
                if (!CoreModule.m30933P().m143405a().mo34317Es()) {
                    hashSet.add(User.ID_AI_1V1);
                }
                while (it5.hasNext()) {
                    Conversation next = it5.next();
                    if (next != null) {
                        if (TEnum.equals(next.status, "deleted")) {
                            il8Var.f115545m.delete(next.f56859id);
                            il8Var.f115535c.m189448J(next.f56859id);
                            il8Var.f115536d.delete(next.f56859id);
                            it5.remove();
                        } else if (hashSet.contains(next.f56859id)) {
                            it5.remove();
                        }
                    }
                }
            }
            final HashMap map = new HashMap();
            StringBuilder sb = new StringBuilder();
            if (jyb.m147479J(coreData2.conversations)) {
                z4 = false;
            } else {
                if (CoreModule.m30933P().m143405a().mo34327Gf()) {
                    final Conversation conversationQuery3 = il8Var.f115545m.query("fake_conversation_local_instant_chat_conversation");
                    if (NullChecker.m82486a(conversationQuery3) && NullChecker.m82486a((Conversation) jyb.m147529r(coreData2.conversations, new qcj() { // from class: l.dl8
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((Conversation) obj).f56859id, conversationQuery3.otherUser));
                        }
                    }))) {
                        il8Var.f115545m.delete(Conversation.CONVTYPE.mo61359EQ(ConversationType.local_instant_chat_guide));
                    }
                }
                z4 = false;
                for (final Conversation conversation : coreData2.conversations) {
                    if (conversation != null) {
                        if (TEnum.equals(conversation.status, "deleted") && conversation.unreadMessages > 0) {
                            sb.append(conversation.f56859id);
                            sb.append(Constants.SEPARATOR_COMMA);
                            z4 = true;
                        }
                        boolean z5 = z4;
                        if (!NullChecker.m82486a(conversation.f56859id)) {
                            CrashHelper.m82479c(new IllegalStateException("【.id判空】conv id = null, mergeLocal = " + conversation.toJson() + "   conv._id = " + conversation._id));
                        }
                        final int size = (!NullChecker.m82486a(conversation.api_only_messages) || jyb.m147479J(conversation.api_only_messages.ids)) ? 0 : conversation.api_only_messages.ids.size();
                        conversation.api_only_messages = null;
                        if ((!wi5.m206550d().m206553f() || !conversation.lowPayOneSideConv() || (conversationQuery2 = il8Var.f115545m.query(conversation.f56859id)) == null || !ConversationType.fakeReceiveLikeGuideSVip.equals(conversationQuery2.convType)) && (!CoreModule.f18276o.m132212b().mo34652wf() || (conversationQuery = il8Var.f115545m.query(conversation.f56859id)) == null || !ConversationType.fakeIntlReceiveLikeGuideSVip.equals(conversationQuery.convType))) {
                            Conversation conversationM159034p1 = il8Var.f115545m.upsert(conversation, new z20() { // from class: l.el8
                                @Override // p153l.z20
                                public final void call(Object obj, Object obj2) {
                                    this.f94486a.m140613J(conversation, coreData2, size, atomicBoolean, envelope, (Conversation) obj, (Conversation) obj2);
                                }
                            });
                            map.put(conversationM159034p1.f56859id, jyb.m147494Y(conversationM159034p1, Boolean.FALSE));
                        }
                        il8Var = this;
                        z4 = z5;
                        atomicBoolean = atomicBoolean;
                    }
                }
            }
            AtomicBoolean atomicBoolean2 = atomicBoolean;
            if (z4) {
                CrashHelper.m82479c(new Exception("Conv merge local has delete status : url = " + envelope.requestLocalUrl + " ids: " + sb.toString()));
            }
            Collections.sort(coreData2.messages, new Comparator() { // from class: l.fl8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return il8.m140600r((Message) obj, (Message) obj2);
                }
            });
            CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
            if (!jyb.m147479J(commonData.users)) {
                for (final User user : commonData.users) {
                    final CoreData coreData3 = coreData2;
                    uqb0.f180405k0.f184355d.upsert(user, new z20() { // from class: l.gl8
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            this.f104821a.m140611H(z, z3, coreData3, user, (User) obj, (User) obj2);
                        }
                    });
                    coreData2 = coreData3;
                }
            }
            CoreData coreData4 = coreData2;
            if (!jyb.m147479J(coreData4.chatGroups)) {
                Iterator<ChatGroup> it6 = coreData4.chatGroups.iterator();
                while (it6.hasNext()) {
                    this.f115546n.upsert(it6.next(), new z20() { // from class: l.hl8
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            il8.m140604v((ChatGroup) obj, (ChatGroup) obj2);
                        }
                    });
                }
            }
            if (!jyb.m147479J(coreData4.chatGroupMembers)) {
                for (final ChatGroupMember chatGroupMember : coreData4.chatGroupMembers) {
                    this.f115547o.upsert(chatGroupMember, new z20() { // from class: l.ok8
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            il8.m140595m(chatGroupMember, (ChatGroupMember) obj, (ChatGroupMember) obj2);
                        }
                    });
                }
            }
            String strMo34799af = gta.m132210e().m132214d().mo34799af();
            if (!jyb.m147479J(coreData4.messages)) {
                final ArrayList<String> arrayList = new ArrayList();
                for (final Message message : coreData4.messages) {
                    if (!gta.m132210e().m132214d().mo34679E() || !TEnum.equals(message.status, "deleted")) {
                        final HashMap map2 = mapM147502d;
                        final String str = strMo34799af;
                        this.f115535c.upsert(message, new z20() { // from class: l.pk8
                            @Override // p153l.z20
                            public final void call(Object obj, Object obj2) {
                                this.f152805a.m140612I(message, map, map2, arrayList, envelope, str, (Message) obj, (Message) obj2);
                            }
                        });
                        strMo34799af = str;
                        mapM147502d = map2;
                    }
                }
                for (String str2 : arrayList) {
                    if (gta.m132210e().m132214d().mo34850i()) {
                        CoreModule.f18264c.f20384f0.m33729Mf(str2);
                    }
                    if (gta.m132210e().m132214d().mo34958ym()) {
                        CoreModule.f18264c.f20384f0.m33981hi(str2);
                    }
                }
            }
            for (pf60 pf60Var : map.values()) {
                if (((Boolean) pf60Var.f152157b).booleanValue()) {
                    this.f115545m.upsert((Conversation) pf60Var.f152156a);
                }
            }
            for (Reminder reminder : coreData4.reminders) {
                Conversation conversationM159013d1 = this.f115545m.m159013d1(reminder.otherUser);
                if (conversationM159013d1 != null) {
                    conversationM159013d1.reminder = reminder;
                    this.f115545m.upsert(conversationM159013d1);
                }
            }
            if (!jyb.m147479J(coreData4.chatHeats)) {
                Iterator<ChatHeat> it7 = coreData4.chatHeats.iterator();
                while (it7.hasNext()) {
                    this.f115551s.upsert(it7.next(), new z20() { // from class: l.qk8
                        @Override // p153l.z20
                        public final void call(Object obj, Object obj2) {
                            il8.m140598p((ChatHeat) obj, (ChatHeat) obj2);
                        }
                    });
                }
            }
            for (VerificationCenter verificationCenter : coreData4.verificationCenter) {
                if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
                    jxd0 jxd0Var = CoreModule.f18264c.f20294B0.f20490V;
                    Boolean bool = Boolean.TRUE;
                    jxd0Var.put(bool);
                    CoreModule.f18264c.f20294B0.f20489U.put(bool);
                }
                if (NullChecker.m82486a(verificationCenter.idCard) && TEnum.equals(verificationCenter.idCard.status, "pending")) {
                    jxd0 jxd0Var2 = CoreModule.f18264c.f20294B0.f20486R;
                    Boolean bool2 = Boolean.TRUE;
                    jxd0Var2.put(bool2);
                    CoreModule.f18264c.f20294B0.f20487S.put(bool2);
                }
                this.f115540h.upsert(verificationCenter);
            }
            if (coreData4.merchandises != null) {
                tu2.m192703a("[core][merchandise]", "start upset merchandise");
                for (Merchandise merchandise : coreData4.merchandises) {
                    if (TEnum.equals(merchandise.category, "oDiamond")) {
                        tu2.m192703a("[core][merchandise]", "upset oDiamond " + merchandise.quantity + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + merchandise.productType + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + merchandise.defaultStockKeepUnit.f21249id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + merchandise.f56859id);
                    }
                    this.f115543k.upsert(merchandise);
                }
                tu2.m192703a("[core][merchandise]", "end upset merchandise");
            }
            List<MonetizationPromotion> list = coreData4.monetizationPromotions;
            if (list != null) {
                Iterator<MonetizationPromotion> it8 = list.iterator();
                while (it8.hasNext()) {
                    this.f115548p.upsert(it8.next());
                }
            }
            List<Coupon> list2 = coreData4.coupons;
            if (list2 != null) {
                Iterator<Coupon> it9 = list2.iterator();
                while (it9.hasNext()) {
                    this.f115549q.upsert(it9.next());
                }
            }
            List<CoreGiftInfo> list3 = coreData4.giftInfos;
            if (list3 != null) {
                Iterator<CoreGiftInfo> it10 = list3.iterator();
                while (it10.hasNext()) {
                    this.f115550r.upsert(it10.next());
                }
            }
            if (CoreModule.f18264c.f20384f0.m33799Se() == null || atomicBoolean2.get()) {
                CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
            }
            Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
            if (counterM32487o3 != null && counterM32487o3.activities.unread < envelope.counters.activities.unread && CoreModule.f18264c.findRequest("activity/poll", 0) == null) {
                l51.m152887G(new Runnable() { // from class: l.yk8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m30932N().coreMomentActivityPoll();
                    }
                });
            }
            l9c.m153394o().m153396A(new x20() { // from class: l.al8
                @Override // p153l.x20
                public final void call() {
                    il8.m140596n(envelope);
                }
            }, new x20() { // from class: l.bl8
                @Override // p153l.x20
                public final void call() {
                    il8.m140605w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m140616M(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN str_localMatchFrom_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN str_localNotificationStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN str_importance_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN str_subtype_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN str_localBusinessTypes_c BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN str_localPlaceBan_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_sentFrom_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_localNotificationStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_localCallHandledStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_msgType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_messageType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_localBusinessTypes_c BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_channel_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_sentFrom_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_localNotificationStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_localCallHandledStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_msgType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_messageType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_localBusinessTypes_c BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_channel_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115537e.f191760d + " ADD COLUMN str_category_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115539g.f191760d + " ADD COLUMN str_source_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115540h.f191760d + " ADD COLUMN str_picVerificationInfo_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115540h.f191760d + " ADD COLUMN str_ageVerificationInfo_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115543k.f191760d + " ADD COLUMN str_category_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115543k.f191760d + " ADD COLUMN str_productType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN str_groupType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN str_groupApply_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115547o.f191760d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115547o.f191760d + " ADD COLUMN str_gender_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f115544l.f191760d + " ADD COLUMN str_state_c TEXT");
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: c */
    public int mo133945c() {
        return 74;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: d */
    public int mo133946d() {
        return 2;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: e */
    public String mo133947e() {
        return "coreDb";
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: f */
    public ArrayList<wzh0> mo134045f() {
        return super.mo134045f();
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: g */
    public void mo133948g() {
        rrq.m182815b().m182819e(CoreData.JSON_ADAPTER, this);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: h */
    public void mo133949h() {
        this.f115546n = new xu4(this, "chat_groups", ChatGroup.DB_ADAPTER, null, 1000);
        this.f115547o = new wu4(this, "chatGroupMembers", ChatGroupMember.DB_ADAPTER, null, 1000);
        this.f115548p = new u6b0(this, Promotions.TYPE, MonetizationPromotion.DB_ADAPTER, null, 1000);
        this.f115549q = new qsb(this, "coupons", Coupon.DB_ADAPTER, null, 100);
        this.f115550r = new jzj(this, "coreGift", CoreGiftInfo.DB_ADAPTER, null, 200);
        vzf0<Message> vzf0Var = Message.DB_ADAPTER;
        DoubleColumn<Message> doubleColumn = Message.CREATEDTIME;
        this.f115535c = new t600(this, "messages", vzf0Var, jyb.m147507f0(new Index(Message.LOCALINCONVERSATION, Message.CID, doubleColumn), new Index(Message.LOCALINMOMENT, Message.MOMENT, doubleColumn), new Index(Message.LOCALNOTIFICATIONSTATUS, doubleColumn)), 1000);
        vzf0<Conversation> vzf0Var2 = Conversation.DB_ADAPTER;
        DoubleColumn<Conversation> doubleColumn2 = Conversation.LATESTTIME;
        this.f115545m = new mm6(this, SchemeKey.conversations, vzf0Var2, jyb.m147507f0(new Index(doubleColumn2), new Index(Conversation.LOCALHASMESSAGE, doubleColumn2), new Index(Conversation.LOCALNOTIFICATIONSTATUS, doubleColumn2)), 1000);
        this.f115536d = new wzh0<>(this, "message_links", DbLinks.DB_ADAPTER, null, 1000);
        this.f115537e = new wzh0<>(this, Questions.TYPE, Question.DB_ADAPTER, null, 1000);
        this.f115538f = new uvv(this, "localMessages", Message.DB_ADAPTER, null, 1000);
        this.f115539g = new wzh0<>(this, "stickers", Sticker.DB_ADAPTER, null, 1000);
        this.f115540h = new wzh0<>(this, "verificationCenter", VerificationCenter.DB_ADAPTER, null, 1000);
        this.f115541i = new x090(this, "private_question", PrivateQuestion.DB_ADAPTER, null, 1000);
        this.f115542j = new wzh0<>(this, "userPrivilege", UserPrivilege.DB_ADAPTER, null, 1000);
        this.f115543k = new sry(this, "merchandises", Merchandise.DB_ADAPTER, null, 100);
        this.f115544l = new gk6(this, "conversation_records", ConversationPatchRecord.DB_ADAPTER, null, 100);
        this.f115551s = new tv4(this, ChatHeat.TYPE, ChatHeat.DB_ADAPTER, null, 100);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: i */
    public void mo133950i() {
        super.mo133950i();
        rrq.m182815b().m182823i(this, CoreData.JSON_ADAPTER);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: j */
    public void mo133951j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 0:
            case 1:
                sQLiteDatabase.execSQL("DROP TABLE " + this.f115543k.f191760d);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f115543k.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,category_c INTEGER,quantity_c INTEGER,productType_c INTEGER,defaultStockKeepUnit_id_c TEXT,defaultStockKeepUnit_type_c TEXT,defaultStockKeepUnit_affiliateProducts_alipay_c TEXT,defaultStockKeepUnit_affiliateProducts_wechat_c TEXT,defaultStockKeepUnit_affiliateProducts_googleplay_c TEXT,defaultStockKeepUnit_affiliateProducts_huawei_c TEXT,defaultStockKeepUnit_prices_currencyCode_c TEXT,defaultStockKeepUnit_prices_currencySymbol_c TEXT,defaultStockKeepUnit_prices_price_c REAL,defaultStockKeepUnit_prices_unitPrice_c REAL,defaultStockKeepUnit_prices_originalPrice_c REAL,defaultStockKeepUnit_prices_originalUnitPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalUnitPrice_c REAL,defaultStockKeepUnit_promotionDetail_promotionType_c TEXT,defaultStockKeepUnit_promotionDetail_beginTime_c REAL,defaultStockKeepUnit_promotionDetail_endTime_c REAL,defaultStockKeepUnit_promotionDetail_promotionPrice_c REAL,defaultStockKeepUnit_promotionDetail_promotionDuration_c INTEGER,defaultStockKeepUnit_promotionDetail_promotionState_c TEXT,defaultStockKeepUnit_promotionDetail_couponToken_c TEXT,defaultStockKeepUnit_promotionDetail_affiliate_c INTEGER,defaultStockKeepUnit_promotionDetail_subscriptionOnly_c INTEGER,defaultStockKeepUnit_promotionDetail_localCouponId_c TEXT,defaultStockKeepUnit_promotionDetail_localPromotionId_c TEXT,defaultStockKeepUnit_tracker_c TEXT,promotionStockKeepUnit_id_c TEXT,promotionStockKeepUnit_type_c TEXT,promotionStockKeepUnit_affiliateProducts_alipay_c TEXT,promotionStockKeepUnit_affiliateProducts_wechat_c TEXT,promotionStockKeepUnit_affiliateProducts_googleplay_c TEXT,promotionStockKeepUnit_affiliateProducts_huawei_c TEXT,promotionStockKeepUnit_prices_currencyCode_c TEXT,promotionStockKeepUnit_prices_currencySymbol_c TEXT,promotionStockKeepUnit_prices_price_c REAL,promotionStockKeepUnit_prices_unitPrice_c REAL,promotionStockKeepUnit_prices_originalPrice_c REAL,promotionStockKeepUnit_prices_originalUnitPrice_c REAL,promotionStockKeepUnit_prices_noneRenewalPrice_c REAL,promotionStockKeepUnit_prices_noneRenewalUnitPrice_c REAL,promotionStockKeepUnit_promotionDetail_promotionType_c TEXT,promotionStockKeepUnit_promotionDetail_beginTime_c REAL,promotionStockKeepUnit_promotionDetail_endTime_c REAL,promotionStockKeepUnit_promotionDetail_promotionPrice_c REAL,promotionStockKeepUnit_promotionDetail_promotionDuration_c INTEGER,promotionStockKeepUnit_promotionDetail_promotionState_c TEXT,promotionStockKeepUnit_promotionDetail_couponToken_c TEXT,promotionStockKeepUnit_promotionDetail_affiliate_c INTEGER,promotionStockKeepUnit_promotionDetail_subscriptionOnly_c INTEGER,promotionStockKeepUnit_promotionDetail_localCouponId_c TEXT,promotionStockKeepUnit_promotionDetail_localPromotionId_c TEXT,promotionStockKeepUnit_tracker_c TEXT)");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_contents_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_resonance_c TEXT");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS kankans (_id INTEGER PRIMARY KEY,id_c TEXT,owner_c TEXT,value_c TEXT,textTheme_backgroundColor_c BLOB,textTheme_bottomColor_c TEXT,emotion_c BLOB,location_c BLOB,resonance_c BLOB,contents_c BLOB,createdTime_c REAL)");
            case 3:
                sQLiteDatabase.execSQL("DELETE FROM " + this.f115545m.f191760d + " WHERE convType_c='group'");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + "  ADD COLUMN localAudioText_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115550r.f191760d + " ADD COLUMN quota_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115550r.f191760d + " ADD COLUMN extra_messageTips_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115550r.f191760d + " ADD COLUMN extra_noQuotaToast_c TEXT");
            case 5:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS greeting_messages (_id INTEGER PRIMARY KEY,id_c TEXT,localCreatedTime_c INTEGER,localCreatedSession_c INTEGER,localInMoment_c INTEGER,localInConversation_c INTEGER,createdTime_c REAL,cid_c TEXT,media_c BLOB,sticker_c TEXT,question_c TEXT,sentFrom_c INTEGER,moment_c TEXT,answerOfMessage_c TEXT,owner_c TEXT,location_c BLOB,recalled_c INTEGER,value_c TEXT,localNotificationStatus_c INTEGER,likeOfMoment_c TEXT,localAnimationKey_c TEXT,api_only_accessory_c BLOB,giftRecords_c BLOB,call_c BLOB,localCallType_c TEXT,localCallStatus_c INTEGER,localCallHandledStatus_c INTEGER,localPrivateQuestions_c BLOB,letter_c BLOB,chatTyping_c INTEGER,localFailType_c INTEGER,recalledReason_c TEXT,recalledHint_c TEXT,msgType_c INTEGER,messageType_c INTEGER,additionalData_c BLOB,localSafetyReminder_c INTEGER,localSensitiveWordReminder_c INTEGER,msgData_c TEXT,localBusinessTypes_c BLOB,settings_anonymous_c INTEGER,channel_c INTEGER,notifiedUsers_c BLOB,status_c INTEGER,referenceMsgId_c TEXT,hostId_c TEXT,localRedPacketType_c TEXT,localAudioText_c BLOB,localGreetingId_c TEXT)");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN localGreetingId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_greetingSummaryDetail_unseen_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_greetingSummaryDetail_latestTime_c REAL");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_greetingSummaryDetail_latestUserId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_greetingSummaryDetail_latestMessageId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE kankans ADD COLUMN status_c TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE kankans ADD COLUMN topic_c BLOB");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_quickChat_bell_isInitiator_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_quickChat_bell_agree_c TEXT");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN localMessageInsertReportHint_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN localNotifyMomentId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN localInsertedMomentId_c TEXT");
                sQLiteDatabase.execSQL("DELETE FROM " + this.f115545m.f191760d + " WHERE status_c=1");
                StringBuilder sb = new StringBuilder("DROP TABLE ");
                sb.append(this.f115550r.f191760d);
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f115550r.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,url_c TEXT,unitCoinPrice_c REAL,unitLikes_c INTEGER,dynamicGift_c INTEGER,dynamicURL_c TEXT,dynamicMD5_c TEXT,quota_c INTEGER,extra_messageTips_c TEXT,extra_noQuotaToast_c TEXT,extra_shopGuide_c TEXT,extra_blessingText_c TEXT)");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115549q.f191760d + " ADD COLUMN benefit_localBenefit_discountBenefit_showDiscount_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115549q.f191760d + " ADD COLUMN benefit_localBenefit_discountBenefit_privilegesChange_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115549q.f191760d + " ADD COLUMN benefit_localBenefit_discountBenefit_hasPrivilegesChange_c INTEGER DEFAULT 0");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN read_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN needRead_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN extData_c BLOB");
            case 11:
                sQLiteDatabase.execSQL("DROP TABLE greeting_messages");
                sQLiteDatabase.execSQL("DELETE FROM " + this.f115536d.f191760d + " WHERE id_c LIKE '%greeting%'");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS greeting_messages (_id INTEGER PRIMARY KEY,id_c TEXT,localCreatedTime_c INTEGER,localCreatedSession_c INTEGER,localInMoment_c INTEGER,localInConversation_c INTEGER,createdTime_c REAL,cid_c TEXT,media_c BLOB,sticker_c TEXT,question_c TEXT,sentFrom_c INTEGER,moment_c TEXT,answerOfMessage_c TEXT,owner_c TEXT,location_c BLOB,recalled_c INTEGER,value_c TEXT,localNotificationStatus_c INTEGER,likeOfMoment_c TEXT,localAnimationKey_c TEXT,api_only_accessory_c BLOB,giftRecords_c BLOB,call_c BLOB,localCallType_c TEXT,localCallStatus_c INTEGER,localCallHandledStatus_c INTEGER,localPrivateQuestions_c BLOB,letter_c BLOB,chatTyping_c INTEGER,localFailType_c INTEGER,recalledReason_c TEXT,recalledHint_c TEXT,msgType_c INTEGER,messageType_c INTEGER,additionalData_c BLOB,localSafetyReminder_c INTEGER,localSensitiveWordReminder_c INTEGER,msgData_c TEXT,localBusinessTypes_c BLOB,settings_anonymous_c INTEGER,channel_c INTEGER,notifiedUsers_c BLOB,status_c INTEGER,referenceMsgId_c TEXT,hostId_c TEXT,localRedPacketType_c TEXT,localAudioText_c BLOB,localGreetingId_c TEXT,read_c INTEGER,needRead_c INTEGER,extData_c BLOB)");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN fromConvType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN fromConvType_c TEXT");
            case 13:
                sQLiteDatabase.execSQL("DELETE FROM " + this.f115545m.f191760d + " WHERE status_c = 3 OR status_c = 5");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN mm_c INTEGER");
            case 14:
                sQLiteDatabase.execSQL("DELETE FROM " + this.f115535c.f191760d + " WHERE messageType_c = 42");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN localExtraInfo_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN localExtraInfo_c TEXT");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_quickChat_expire_c REAL");
                m140616M(sQLiteDatabase);
            case 17:
                sQLiteDatabase.execSQL("DROP TABLE greeting_messages");
                sQLiteDatabase.execSQL("DELETE FROM " + this.f115536d.f191760d + " WHERE id_c LIKE '%greeting%'");
            case 18:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN incTempInfo_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN intimacy_c INTEGER");
            case 19:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN quickChatProgress_c INTEGER");
            case 20:
                sQLiteDatabase.execSQL("DROP TABLE " + this.f115543k.f191760d);
                sQLiteDatabase.execSQL("DROP TABLE " + this.f115549q.f191760d);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f115543k.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,category_c INTEGER,quantity_c INTEGER,productType_c INTEGER,defaultStockKeepUnit_id_c TEXT,defaultStockKeepUnit_type_c TEXT,defaultStockKeepUnit_affiliateProducts_alipay_c TEXT,defaultStockKeepUnit_affiliateProducts_wechat_c TEXT,defaultStockKeepUnit_affiliateProducts_googleplay_c TEXT,defaultStockKeepUnit_affiliateProducts_huawei_c TEXT,defaultStockKeepUnit_prices_currencyCode_c TEXT,defaultStockKeepUnit_prices_currencySymbol_c TEXT,defaultStockKeepUnit_prices_price_c REAL,defaultStockKeepUnit_prices_unitPrice_c REAL,defaultStockKeepUnit_prices_originalPrice_c REAL,defaultStockKeepUnit_prices_originalUnitPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalUnitPrice_c REAL,defaultStockKeepUnit_tracker_c TEXT,str_category_c TEXT,str_productType_c TEXT,localCoupons_c BLOB)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f115549q.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,tags_c BLOB,couponType_c TEXT,ignoreBeginTime_c INTEGER,ignoreEndTime_c INTEGER,beginTime_c REAL,endTime_c REAL,condition_purchaseChannel_c BLOB,condition_skuIDs_c BLOB,condition_merchandiseIDs_c BLOB,benefit_localBenefit_benefitType_c TEXT,benefit_localBenefit_trialBenefit_trialDuration_c INTEGER,benefit_localBenefit_trialBenefit_discount_discountType_c TEXT,benefit_localBenefit_trialBenefit_discount_value_c INTEGER,benefit_localBenefit_trialBenefit_trialReplaceItemID_c INTEGER,benefit_localBenefit_trialBenefit_afterTrialDiscount_discountType_c TEXT,benefit_localBenefit_trialBenefit_afterTrialDiscount_value_c INTEGER,benefit_localBenefit_discountBenefit_discountType_c TEXT,benefit_localBenefit_discountBenefit_value_c INTEGER,userCouponID_c TEXT,couponID_c TEXT,benefit_localBenefit_discountBenefit_showDiscount_c TEXT,benefit_localBenefit_discountBenefit_privilegesChange_c BLOB,benefit_localBenefit_discountBenefit_hasPrivilegesChange_c INTEGER,localApplyPromotions_c BLOB)");
            case 21:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN expiredTime_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN joinRemainedTime_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN source_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN token_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN groupTopic_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN groupTopic_owner_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN groupTopic_value_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN groupTopic_medias_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN upgraded_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN duration_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN group_source_c TEXT DEFAULT ''");
            case 22:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS literaturesComments (_id INTEGER PRIMARY KEY,id_c TEXT,userID_c TEXT,literatureID_c TEXT,interestLevel_c TEXT,createdTime_c INTEGER,localLiteratures_c BLOB)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS literatures (_id INTEGER PRIMARY KEY,id_c TEXT,title_c TEXT,category_c TEXT,author_c BLOB,headUrl_c TEXT,kinds_c BLOB,bgColor_c TEXT)");
            case 23:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_quickChat_progress_c INTEGER");
            case 24:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_feedStateCounter_c BLOB");
            case 25:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115550r.f191760d + " ADD COLUMN extra_grayURL_c TEXT");
            case 26:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_suggestedTimeLimitedMatch_c BLOB");
            case 27:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN joinCondition_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN onlineCount_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN adminLimit_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN permissions_canShareToWeChat_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN permissions_canShareToTantan_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN permissions_canChangeJoinCondition_c INTEGER");
            case 28:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_greetingSummaryDetail_iconURL_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_greetingSummaryDetail_title_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_kankan_greetingSummaryDetail_subtitle_c TEXT");
            case 29:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_heartbeatMatch_c BLOB");
            case 30:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN hasLocalBreakIce_c INTEGER");
            case 31:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_avatarSummary_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_feedInteractionCounter_c BLOB");
            case 32:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115542j.f191760d + " ADD COLUMN content_unlimit_c INTEGER");
            case 33:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN localSpoofingNewTime_c REAL");
            case 34:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN inModeration_nickName_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN inModeration_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN inModeration_description_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115547o.f191760d + " ADD COLUMN inModeration_nickName_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115547o.f191760d + " ADD COLUMN inModeration_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115547o.f191760d + " ADD COLUMN inModeration_description_c TEXT");
            case 35:
                sQLiteDatabase.execSQL("DROP TABLE literaturesComments");
                sQLiteDatabase.execSQL("DROP TABLE literatures");
            case 36:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115542j.f191760d + " ADD COLUMN content_beginTime_c INTEGER");
            case 37:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115537e.f191760d + " ADD COLUMN source_c TEXT");
            case 38:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f115551s.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,degree_c REAL,levelUp_c INTEGER,specialRemind_c INTEGER,exclusiveChatInviteTime_c REAL,exclusiveChatInviteExpireTime_c REAL,exclusiveChatStartTime_c REAL,exclusiveChatEndTime_c REAL,showLevelDown_c INTEGER,tempDownDegree_c REAL)");
            case 39:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115546n.f191760d + " ADD COLUMN shareToken_c TEXT");
            case 40:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN clearedTime_c REAL");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_liveVirtualVoice_c BLOB");
            case 41:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_localMomentInfo_c BLOB");
            case 42:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN localExtraInfo_c TEXT");
            case 43:
                sQLiteDatabase.execSQL("UPDATE " + this.f115545m.f191760d + " SET level_c = 100 WHERE level_c = 1");
            case 44:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN lastActivityTime_c REAL");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_liveActivity_c BLOB");
            case 45:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_game_c BLOB");
            case 46:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_tag_c BLOB");
            case 47:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_chatAssistantQuestion_c BLOB");
            case 48:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_quickChat_guideFakeToGood_c INTEGER");
            case 49:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN otherStatus_c TEXT DEFAULT ''");
            case 50:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_continuousChat_c BLOB");
            case 51:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN riskTags_c BLOB");
            case 52:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_pinChat_c BLOB");
            case 53:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_reSwipe_c BLOB");
            case 54:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_blindbox_c BLOB");
            case 55:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_previewTexts_c BLOB");
            case 56:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115543k.f191760d + " ADD COLUMN duration_times_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115543k.f191760d + " ADD COLUMN duration_timeUnit_c TEXT");
            case 57:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN localMyVisitorCount_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115535c.f191760d + " ADD COLUMN localMyVisitorHidden_c INTEGER");
            case 58:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115540h.f191760d + " ADD COLUMN str_ctdidVerificationInfo_status_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115540h.f191760d + " ADD COLUMN ctdidVerificationInfo_media_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115540h.f191760d + " ADD COLUMN ctdidVerificationInfo_status_c INTEGER");
            case 59:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115543k.f191760d + " ADD COLUMN extra_discountText_c TEXT");
            case 60:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_greetingInfo_c BLOB");
            case 61:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115542j.f191760d + " ADD COLUMN content_refreshMaxRemaining_c INTEGER");
            case 62:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_fateRadar_c BLOB");
            case 63:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN isFake_c INTEGER");
            case 64:
                sQLiteDatabase.execSQL("DROP TABLE kankans");
            case 65:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_lowPayOneside_c BLOB");
            case 66:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_matchInfo_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_newMatch_labelExposureTime_c REAL DEFAULT 0");
            case 67:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_loveLetter_c BLOB");
            case 68:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115549q.f191760d + " ADD COLUMN benefit_localBenefit_giftBenefit_discount_discountType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115549q.f191760d + " ADD COLUMN benefit_localBenefit_giftBenefit_discount_value_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115549q.f191760d + " ADD COLUMN benefit_localBenefit_giftBenefit_giveItemIDs_c BLOB");
            case 69:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN localIsLimitedTrialSee_c INTEGER DEFAULT 0");
            case 70:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_chatMM_c BLOB");
            case 71:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_blackList_c BLOB");
            case 72:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_messageRelate_c BLOB");
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_compliment_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f115545m.f191760d + " ADD COLUMN additional_swiper_c BLOB");
                break;
        }
        yg50.m215836g(sQLiteDatabase);
    }

    @Override // p153l.gq2
    /* JADX INFO: renamed from: b */
    public void mo131339b(Envelope envelope) {
    }
}
