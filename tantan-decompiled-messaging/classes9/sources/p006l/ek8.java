package p006l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.ConversationAdditionalTag;
import com.p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MonetizationPromotion;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.core.data.PlatinumPinChat;
import com.p1.mobile.putong.core.data.PrivateQuestion;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.data.ReSwipeInfo;
import com.p1.mobile.putong.core.data.Reminder;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Passby;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipExtensions;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserActivityInfo;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.VisitPlace;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Column;
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
import l.b8c;
import l.d30;
import l.du2;
import l.e51;
import l.evk;
import l.f30;
import l.f8c;
import l.hpd0;
import l.j760;
import l.mqi0;
import l.mrf0;
import l.orh0;
import l.pp2;
import l.r850;
import l.rpq;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ek8 extends b8c implements pp2<CoreData> {

    /* JADX INFO: renamed from: t */
    public static String f11194t = "invalid_moment_id";

    /* JADX INFO: renamed from: c */
    public wxz f11195c;

    /* JADX INFO: renamed from: d */
    public orh0<DbLinks> f11196d;

    /* JADX INFO: renamed from: e */
    public orh0<Question> f11197e;

    /* JADX INFO: renamed from: f */
    public ttv f11198f;

    /* JADX INFO: renamed from: g */
    public orh0<Sticker> f11199g;

    /* JADX INFO: renamed from: h */
    public orh0<VerificationCenter> f11200h;

    /* JADX INFO: renamed from: i */
    public ts80 f11201i;

    /* JADX INFO: renamed from: j */
    public orh0<UserPrivilege> f11202j;

    /* JADX INFO: renamed from: k */
    public viy f11203k;

    /* JADX INFO: renamed from: l */
    public dj6 f11204l;

    /* JADX INFO: renamed from: m */
    public jl6 f11205m;

    /* JADX INFO: renamed from: n */
    public yt4 f11206n;

    /* JADX INFO: renamed from: o */
    public xt4 f11207o;

    /* JADX INFO: renamed from: p */
    public qya0 f11208p;

    /* JADX INFO: renamed from: q */
    public crb f11209q;

    /* JADX INFO: renamed from: r */
    public twj f11210r;

    /* JADX INFO: renamed from: s */
    public uu4 f11211s;

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Message m14599A(Message message) {
        return message;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m14606m(ChatGroupMember chatGroupMember, ChatGroupMember chatGroupMember2, ChatGroupMember chatGroupMember3) {
        if (NullChecker.a(chatGroupMember3)) {
            if (TextUtils.equals(chatGroupMember3.nickName, chatGroupMember2.nickName)) {
                chatGroupMember2.nickNamePinyin = chatGroupMember3.nickNamePinyin.toUpperCase();
            } else {
                chatGroupMember2.nickNamePinyin = evk.c().d(chatGroupMember2.nickName).toUpperCase();
            }
            chatGroupMember2.avatar = chatGroupMember3.avatar;
            chatGroupMember2.userName = chatGroupMember3.userName;
            chatGroupMember2.gender = chatGroupMember3.gender;
        } else {
            User userQuery = qib0.f19813k0.f23551d.query(chatGroupMember.userId);
            if (NullChecker.a(userQuery) && userQuery.hasPic()) {
                chatGroupMember2.avatar = ((Media) userQuery.pictures.get(0)).cover().profileSmall().formatted();
                chatGroupMember2.userName = userQuery.name;
                chatGroupMember2.gender = userQuery.gender;
            }
            if (!TextUtils.isEmpty(chatGroupMember2.nickName)) {
                chatGroupMember2.nickNamePinyin = evk.c().d(chatGroupMember2.nickName).toUpperCase();
            } else if (NullChecker.a(userQuery)) {
                chatGroupMember2.nickNamePinyin = evk.c().d(userQuery.name).toUpperCase();
            }
        }
        chatGroupMember2.searchCategory = chatGroupMember2.groupMemberName() + "|" + chatGroupMember2.nickNamePinyin;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m14607n(Envelope envelope) {
        if (CoreModule.f1534c.m3414o3() == null) {
            CoreModule.f1534c.m3404F3(envelope.counters);
        } else {
            envelope.counters.mergeData(CoreModule.f1534c.m3414o3());
            CoreModule.f1534c.m3404F3(envelope.counters);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m14609p(ChatHeat chatHeat, ChatHeat chatHeat2) {
        if (NullChecker.a(chatHeat2)) {
            chatHeat.tempDownDegree = chatHeat2.tempDownDegree;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m14611r(Message message, Message message2) {
        return (int) (message2.createdTime - message.createdTime);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m14615v(ChatGroup chatGroup, ChatGroup chatGroup2) {
        if (NullChecker.a(chatGroup2) && !TextUtils.isEmpty(chatGroup2.localConId) && TextUtils.isEmpty(chatGroup.localConId)) {
            chatGroup.localConId = chatGroup2.localConId;
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m14616w() {
        C0158c c0158c = CoreModule.f1534c;
        c0158c.f3599U0.onNext(c0158c.m3414o3());
    }

    /* JADX INFO: renamed from: F */
    public final boolean m14620F(Conversation conversation) {
        return (conversation.isHeartbeatConv() && ((ura.m25555e().m25559d().m5876vp() || ura.m25555e().m25558c().m5587Ig()) && conversation.unreadMessages == 1)) || conversation.lowPayOneSideConv() || conversation.newMatchExpShowInList();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m14621G(Conversation conversation, Conversation conversation2) {
        if (conversation.isHeartbeatConv() || conversation.isSeeUpgradedConv() || "lovescript".equals(conversation2.convType) || conversation.isMediaBuzzConv()) {
            return true;
        }
        return (NullChecker.a(conversation.property) && NullChecker.a(conversation.property.quickchat) && TextUtils.equals(conversation.property.quickchat.bellType, "male")) || conversation.isForceDropDownCell();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m14622H(boolean z, boolean z2, CoreData coreData, final User user, User user2, User user3) {
        Profile profile;
        Long l2;
        UserActivityInfo userActivityInfo;
        Followship followship;
        Passby passby;
        Relationship relationship;
        VisitPlace visitPlace;
        RelationshipExtensions relationshipExtensions;
        if (ura.m25555e().m25559d().m5613E() && (user3 == null || !TextUtils.equals(user2.name, user3.name) || (!vwb.J(user2.pictures) && !vwb.J(user3.pictures) && !((Media) user2.pictures.get(0)).equals(user3.pictures.get(0))))) {
            List<ChatGroupMember> listJ = this.f11207o.m27604F(((DbObject) user2).id).j();
            if (!vwb.J(listJ)) {
                for (ChatGroupMember chatGroupMember : listJ) {
                    chatGroupMember.userName = user2.name;
                    chatGroupMember.gender = user2.gender;
                    chatGroupMember.avatar = ((Media) user2.pictures.get(0)).cover().profileSmall().formatted();
                    chatGroupMember.nickNamePinyin = evk.c().d(chatGroupMember.groupMemberName()).toUpperCase();
                    chatGroupMember.searchCategory = chatGroupMember.groupMemberName() + "|" + chatGroupMember.nickNamePinyin;
                    this.f11207o.upsert(chatGroupMember);
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
                if (vwb.J(user2.localRelationship.topics)) {
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
        if (ura.m25555e().m25559d().m5745c() && user3 != null && (relationship = user3.localRelationship) != null && (TEnum.equals(relationship.conversationStatus, "peeking") || TEnum.equals(user3.localRelationship.conversationStatus, "peeking_blocked"))) {
            Relationship relationship5 = user2.localRelationship;
            if (relationship5 == null) {
                user2.localRelationship = user3.localRelationship;
            } else if (TextUtils.equals("quickchat", relationship5.convType) && TEnum.equals(user2.localRelationship.conversationStatus, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
                user2.localRelationship.conversationStatus = ConversationStatus.get("peeking");
            } else if (TextUtils.equals("quickchat", user2.localRelationship.convType) && TEnum.equals(user2.localRelationship.conversationStatus, "blocked")) {
                user2.localRelationship.conversationStatus = ConversationStatus.get("peeking_blocked");
            }
        }
        if (user2.state == null && user3 != null) {
            user2.state = user3.state;
        }
        if (vwb.J(user2.abGroups) && user3 != null && !vwb.J(user3.abGroups)) {
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
        if (NullChecker.a(user3) && vwb.J(user2.profile.contactLookups.lookups) && !vwb.J(user3.profile.contactLookups.lookups)) {
            user2.profile.contactLookups = user3.profile.contactLookups;
        }
        if (!vwb.J(coreData.messages) && !user.isMe()) {
            int iG = vwb.G(coreData.messages, new w9j() { // from class: l.nj8
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Message) obj).owner, ((DbObject) user).id));
                }
            });
            if (NullChecker.a(user3) && iG >= 0) {
                long j = (long) ((Message) coreData.messages.get(iG)).createdTime;
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
            if (d > 0.0d && user2.signupTime <= 0.0d) {
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
        if (ura.m25555e().m25559d().m5877w() && user3 != null && NullChecker.a(user3.profile.extensions) && NullChecker.a(user3.profile.extensions.basic) && !vwb.J(user3.profile.extensions.basic.ideal) && NullChecker.a(user2.profile.extensions) && NullChecker.a(user2.profile.extensions.basic)) {
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
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m14623I(Message message, HashMap map, HashMap map2, List list, Envelope envelope, String str, Message message2, Message message3) {
        double d;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        User userM21396Q9;
        Object obj4;
        Object obj5;
        String str2;
        Boolean bool;
        message.messageType = message.messageType();
        if (TEnum.equals(message2.messageType, "harass_alert")) {
            if (NullChecker.a(message2.additionalData) && NullChecker.a(message2.additionalData.harassAlertInfo) && !TextUtils.isEmpty(message2.additionalData.harassAlertInfo.tips)) {
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
                    sb.append("cid:" + message2.cid + "\n");
                    sb.append("msg detail:\n");
                    sb.append(message2.toJson());
                    sb.append("\n");
                    sb.append(message2.cid);
                    sb.append("conv id list");
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(",");
                    }
                    CrashHelper.c(new RuntimeException(sb.toString()));
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            }
            String str3 = ((Conversation) ((j760) map.get(message2.cid)).a).readUntil;
            if (str3 != null && !str3.isEmpty() && map2.get(str3) != null && message2.createdTime <= ((Message) map2.get(str3)).createdTime) {
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
            String str4 = message3.moment;
            message2.localInMoment = (str4 == null || !str4.equals(CoreMomentInfo.LOCAL_ID_INVALID)) && ((bool = message2.recalled) == null || !bool.booleanValue()) && (message2.localInMoment || message3.localInMoment);
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
            if (TEnum.equals(message3.messageType, "common_tip") && NullChecker.a(message3.extData) && NullChecker.a(message2.extData) && TextUtils.equals(message3.extData.extra, "pat") && TextUtils.equals(message3.extData.extra2, "pat_grey")) {
                message2.extData.extra2 = "pat_grey";
            }
        } else {
            if ((ura.m25555e().m25559d().m5784i() || ura.m25555e().m25559d().m5892ym()) && !message.isLocal() && !TEnum.equals(message.messageType, "tacit_test") && !TEnum.equals(message.messageType, "user_info_card") && !TEnum.equals(message.messageType, "stripes") && !TEnum.equals(message.messageType, "normal_card") && !list.contains(message.cid)) {
                list.add(message.cid);
            }
            if (qib0.f19784H.guessedCurrentServerTime() - message.createdTime < 8.64E7d) {
                if (message.audio() != null) {
                    CoreModule.f1534c.f3649l0.m17791d(qib0.m22156d0(message.audio().format32()));
                } else {
                    message.picture();
                }
            }
            if ((envelope.localOptions & C0154a.f3479L) != 0) {
                final Conversation conversationQuery = this.f11205m.query(message.cid);
                if (conversationQuery == null) {
                    conversationQuery = CoreModule.f1534c.f3634g0.m3825j9(message.cid);
                }
                if (conversationQuery == null) {
                    return;
                }
                j760 j760Var = (j760) vwb.B(map, message.cid, new v9j() { // from class: l.tj8
                    public final Object call() {
                        return vwb.Y(conversationQuery, Boolean.FALSE);
                    }
                });
                if (!User.isTeamAccount(message.owner) && !message.owner.equals(CoreModule.m1850H().userId()) && message.shouldCheckFoulWords()) {
                    Object obj6 = j760Var.a;
                    if (((Conversation) obj6).localSpoofingNewTime >= 0.0d) {
                        d = 0.0d;
                        if (((Conversation) obj6).localSpoofingNewTime < message.createdTime && qib0.f19802Z.m14994O(message.value) && NullChecker.a(qib0.f19813k0.f23551d.query(message.owner))) {
                            ((Conversation) j760Var.a).localSpoofingNewTime = message.createdTime;
                        }
                        z = true;
                        if (TEnum.equals(message2.messageType, "harass_alert") && !message2.isMe()) {
                            obj5 = j760Var.a;
                            if (((Conversation) obj5).localBotheringTime < message2.createdTime) {
                                ((Conversation) obj5).localBotheringTime = d;
                                z = true;
                            }
                        }
                        if (z) {
                            map.put(message.cid, vwb.Y((Conversation) j760Var.a, Boolean.TRUE));
                        }
                    } else {
                        d = 0.0d;
                    }
                    if (ura.m25555e().m25559d().m5793j()) {
                        Object obj7 = j760Var.a;
                        if (((Conversation) obj7).localSpoofingReminderTime < d || ((Conversation) obj7).localSpoofingReminderTime >= message.createdTime || !qib0.f19802Z.m14995P(message.value)) {
                            obj = j760Var.a;
                            if (((Conversation) obj).localBotherWxTime >= d || ((Conversation) obj).localBotherWxTime >= message.createdTime || !vx6.m25961J(CoreModule.f1535d.m25985t(), message.value)) {
                                obj2 = j760Var.a;
                                if (((Conversation) obj2).localBotherCodeTime >= d || ((Conversation) obj2).localBotherCodeTime >= message.createdTime || !CoreModule.f1535d.m25982K(message.value)) {
                                    obj3 = j760Var.a;
                                    if (((Conversation) obj3).localBotheringTime >= d && ((Conversation) obj3).localBotheringTime < message.createdTime && (qib0.f19802Z.m14990K(message.value) || qib0.f19802Z.m14992M(message.value))) {
                                        userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                        if (NullChecker.a(userM21396Q9) && (TEnum.equals(message.messageType, "moment_comment") || !userM21396Q9.isFemale())) {
                                            obj4 = j760Var.a;
                                            if (((Conversation) obj4).localBotheringTime <= d) {
                                                ((Conversation) obj4).localBotheringTime = message.createdTime;
                                                ((Conversation) obj4).localBotherStatus = 0;
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ((Conversation) j760Var.a).localBotherCodeTime = message.createdTime;
                                }
                            } else {
                                ((Conversation) j760Var.a).localBotherWxTime = message.createdTime;
                            }
                            z = true;
                        } else {
                            User userQuery = qib0.f19813k0.f23551d.query(message.owner);
                            if (NullChecker.a(userQuery) && NullChecker.a(vwb.r(userQuery.status, new w9j() { // from class: l.vj8
                                public final Object call(Object obj8) {
                                    return Boolean.valueOf(TEnum.equals((UserStatus) obj8, "RISK_TAG_CHAT_SENSITIVE_WORD_SAFETY_REMINDER"));
                                }
                            }))) {
                                message.localSensitiveWordReminder = true;
                                ((Conversation) j760Var.a).localSpoofingReminderTime = message.createdTime;
                            } else {
                                obj = j760Var.a;
                                if (((Conversation) obj).localBotherWxTime >= d) {
                                    obj2 = j760Var.a;
                                    if (((Conversation) obj2).localBotherCodeTime >= d) {
                                        obj3 = j760Var.a;
                                        if (((Conversation) obj3).localBotheringTime >= d) {
                                            userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                            if (NullChecker.a(userM21396Q9)) {
                                                obj4 = j760Var.a;
                                                if (((Conversation) obj4).localBotheringTime <= d) {
                                                    ((Conversation) obj4).localBotheringTime = message.createdTime;
                                                    ((Conversation) obj4).localBotherStatus = 0;
                                                }
                                            }
                                        }
                                        z = false;
                                    } else {
                                        obj3 = j760Var.a;
                                        if (((Conversation) obj3).localBotheringTime >= d) {
                                            userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                            if (NullChecker.a(userM21396Q9)) {
                                                obj4 = j760Var.a;
                                                if (((Conversation) obj4).localBotheringTime <= d) {
                                                    ((Conversation) obj4).localBotheringTime = message.createdTime;
                                                    ((Conversation) obj4).localBotherStatus = 0;
                                                }
                                            }
                                        }
                                        z = false;
                                    }
                                } else {
                                    obj2 = j760Var.a;
                                    if (((Conversation) obj2).localBotherCodeTime >= d) {
                                        obj3 = j760Var.a;
                                        if (((Conversation) obj3).localBotheringTime >= d) {
                                            userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                            if (NullChecker.a(userM21396Q9)) {
                                                obj4 = j760Var.a;
                                                if (((Conversation) obj4).localBotheringTime <= d) {
                                                    ((Conversation) obj4).localBotheringTime = message.createdTime;
                                                    ((Conversation) obj4).localBotherStatus = 0;
                                                }
                                            }
                                        }
                                        z = false;
                                    } else {
                                        obj3 = j760Var.a;
                                        if (((Conversation) obj3).localBotheringTime >= d) {
                                            userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                            if (NullChecker.a(userM21396Q9)) {
                                                obj4 = j760Var.a;
                                                if (((Conversation) obj4).localBotheringTime <= d) {
                                                    ((Conversation) obj4).localBotheringTime = message.createdTime;
                                                    ((Conversation) obj4).localBotherStatus = 0;
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
                        obj = j760Var.a;
                        if (((Conversation) obj).localBotherWxTime >= d) {
                            obj2 = j760Var.a;
                            if (((Conversation) obj2).localBotherCodeTime >= d) {
                                obj3 = j760Var.a;
                                if (((Conversation) obj3).localBotheringTime >= d) {
                                    userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                    if (NullChecker.a(userM21396Q9)) {
                                        obj4 = j760Var.a;
                                        if (((Conversation) obj4).localBotheringTime <= d) {
                                            ((Conversation) obj4).localBotheringTime = message.createdTime;
                                            ((Conversation) obj4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                obj3 = j760Var.a;
                                if (((Conversation) obj3).localBotheringTime >= d) {
                                    userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                    if (NullChecker.a(userM21396Q9)) {
                                        obj4 = j760Var.a;
                                        if (((Conversation) obj4).localBotheringTime <= d) {
                                            ((Conversation) obj4).localBotheringTime = message.createdTime;
                                            ((Conversation) obj4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            }
                        } else {
                            obj2 = j760Var.a;
                            if (((Conversation) obj2).localBotherCodeTime >= d) {
                                obj3 = j760Var.a;
                                if (((Conversation) obj3).localBotheringTime >= d) {
                                    userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                    if (NullChecker.a(userM21396Q9)) {
                                        obj4 = j760Var.a;
                                        if (((Conversation) obj4).localBotheringTime <= d) {
                                            ((Conversation) obj4).localBotheringTime = message.createdTime;
                                            ((Conversation) obj4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            } else {
                                obj3 = j760Var.a;
                                if (((Conversation) obj3).localBotheringTime >= d) {
                                    userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(message.owner);
                                    if (NullChecker.a(userM21396Q9)) {
                                        obj4 = j760Var.a;
                                        if (((Conversation) obj4).localBotheringTime <= d) {
                                            ((Conversation) obj4).localBotheringTime = message.createdTime;
                                            ((Conversation) obj4).localBotherStatus = 0;
                                            z = true;
                                        }
                                    }
                                }
                                z = false;
                            }
                        }
                    }
                    if (TEnum.equals(message2.messageType, "harass_alert")) {
                        obj5 = j760Var.a;
                        if (((Conversation) obj5).localBotheringTime < message2.createdTime) {
                            ((Conversation) obj5).localBotheringTime = d;
                            z = true;
                        }
                    }
                    if (z) {
                        map.put(message.cid, vwb.Y((Conversation) j760Var.a, Boolean.TRUE));
                    }
                }
                String strM25972u = vx6.m25972u(message.value);
                if (!TextUtils.isEmpty(strM25972u)) {
                    message.localAnimationKey = strM25972u;
                }
                Audio audio2 = message.audio();
                if (audio2 != null && TEnum.equals(message.localNotificationStatus, "removed")) {
                    audio2.audioRead = true;
                }
            }
            m14625K(message2);
        }
        if (!(NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.oneSideNoMatch)) && message.likeOfMoment == null) {
            Boolean bool2 = message2.recalled;
            if (bool2 != null && bool2.booleanValue()) {
                message2.localNotificationStatus = NotificationStatus.get("removed");
            } else if (message3 != null && !TEnum.equals(message3.localNotificationStatus, "unknown_") && !TEnum.equals(message3.localNotificationStatus, "undefined")) {
                message2.localNotificationStatus = message3.localNotificationStatus;
            } else if ((envelope.localOptions & C0154a.f3479L) != 0) {
                if (message2.isOtherUser() && TEnum.equals(message2.localNotificationStatus, "unknown_")) {
                    message2.localNotificationStatus = NotificationStatus.get("pending");
                } else {
                    message2.localNotificationStatus = NotificationStatus.get("removed");
                }
            }
        } else {
            message2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (ura.m25555e().m25559d().m5613E() && message2.isGroupMessage()) {
            if (TEnum.equals(message2.messageType, "tickle") || TEnum.equals(message2.messageType, "conversation_notification")) {
                message2.localNotificationStatus = NotificationStatus.get("removed");
            } else {
                Conversation conversationQuery2 = this.f11205m.query(message2.cid);
                if (!vwb.J(message2.notifiedUsers) && !message.isMe()) {
                    Iterator it2 = message2.notifiedUsers.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else {
                            str2 = (String) it2.next();
                            if (TextUtils.equals("0", str2)) {
                                break;
                            }
                        }
                    } while (!TextUtils.equals(CoreModule.m1850H().userId(), str2));
                } else {
                    z2 = false;
                    break;
                }
                if (NullChecker.a(conversationQuery2) && conversationQuery2.muted && !z2) {
                    message2.localNotificationStatus = NotificationStatus.get("muting");
                }
            }
            if (TextUtils.equals(message.hostId, str)) {
                message2.localNotificationStatus = NotificationStatus.get("muting");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m14624J(final Conversation conversation, CoreData coreData, int i, AtomicBoolean atomicBoolean, Envelope envelope, Conversation conversation2, Conversation conversation3) {
        double d;
        ReSwipeInfo reSwipeInfo;
        final w9j w9jVar = new w9j() { // from class: l.oj8
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(TEnum.equals(message.messageType, "moment_user_state") && TextUtils.equals(message.getHostId(), ((DbObject) conversation).id));
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.pj8
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.a(message) && NullChecker.a(message.extData) && TextUtils.equals(message.extData.msgSource, "system") && TextUtils.equals(message.getHostId(), ((DbObject) conversation).id));
            }
        };
        Message message = (Message) vwb.r(coreData.messages, new w9j() { // from class: l.qj8
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf(((Boolean) w9jVar.call(message2)).booleanValue() || ((Boolean) w9jVar2.call(message2)).booleanValue());
            }
        });
        boolean z = false;
        if (i == 1 && NullChecker.a(message) && message.isMe()) {
            conversation2.localHasMessage = false;
        }
        if (conversation3 != null) {
            if (TextUtils.equals(conversation2.convType, CameraSticker.CATEGORY_DEFAULT_FILTER) && NullChecker.a(conversation3.additional) && NullChecker.a(conversation3.additional.localMomentInfo)) {
                ConversationAdditional conversationAdditional = conversation2.additional;
                if (conversationAdditional == null) {
                    conversation2.additional = conversation3.additional;
                } else if (conversationAdditional.localMomentInfo == null) {
                    conversationAdditional.localMomentInfo = conversation3.additional.localMomentInfo;
                }
            }
            boolean z2 = conversation3.localHasMessage || conversation2.localHasMessage;
            conversation2.localHasMessage = z2;
            conversation2.localEverHasMessage = z2 || conversation3.localEverHasMessage || !(TextUtils.isEmpty(conversation.clearedUntil) || TextUtils.equals(conversation.clearedUntil, "0")) || "free_see_match".equals(conversation.convType);
            if (ura.m25555e().m25559d().m5821mj()) {
                ConversationAdditional conversationAdditional2 = conversation2.additional;
                if (conversationAdditional2.reSwipe == null && (reSwipeInfo = conversation3.additional.reSwipe) != null) {
                    conversationAdditional2.reSwipe = reSwipeInfo;
                }
                if (NullChecker.a(conversationAdditional2.reSwipe) && TEnum.equals(conversation2.additional.reSwipe.status, "liked")) {
                    double d2 = conversation2.additional.reSwipe.swipedTime;
                    d = 0.0d;
                    if (d2 > conversation2.latestTime) {
                        conversation2.latestTime = d2;
                    }
                } else {
                    d = 0.0d;
                }
            } else {
                d = 0.0d;
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
            if (vwb.L(conversation2.place)) {
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
                conversation2.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
            } else if (!TextUtils.isEmpty(conversation3.convType) && TextUtils.isEmpty(conversation2.convType)) {
                conversation2.convType = conversation3.convType;
            }
            if (conversation3.localGreetDelete && conversation2.unreadMessages == 0) {
                conversation2.localGreetDelete = true;
            } else {
                conversation2.localGreetDelete = false;
            }
            if (ura.m25555e().m25559d().m5893ys()) {
                double d5 = conversation3.suggestionScore;
                if (d5 != d && conversation2.suggestionScore == d) {
                    conversation2.suggestionScore = d5;
                }
            }
            conversation2.hasLocalBreakIce = conversation3.hasLocalBreakIce;
            if (TextUtils.equals(conversation3.convType, "heartbeatMatch") && TextUtils.equals(conversation2.convType, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
                wxz wxzVar = this.f11195c;
                Filter filterEQ = Message.CID.EQ(((DbObject) conversation2).id);
                TEnumColumn tEnumColumn = Message.MESSAGETYPE;
                wxzVar.delete(Filter.AND(new Filter[]{filterEQ, Filter.OR(new Filter[]{tEnumColumn.EQ("heartbeat_notify"), tEnumColumn.EQ("heartbeat_waiting_response")})}));
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
            d = 0.0d;
            if (conversation2.localHasMessage || (!TextUtils.isEmpty(conversation.clearedUntil) && !TextUtils.equals(conversation.clearedUntil, "0"))) {
                z = true;
            }
            conversation2.localEverHasMessage = z;
            if (ura.m25555e().m25559d().m5893ys() && !conversation2.localHasMessage && mqi0.o() - ((long) conversation2.createdTime) < 60000) {
                conversation2.suggestionScore = 100.0d;
            }
            if ((ura.m25555e().m25559d().m5879x() && TEnum.equals(conversation2.status, "dismissed")) || !TextUtils.isEmpty(conversation2.readUntil) || conversation2.read.booleanValue() || conversation2.localHasMessage || ((DbObject) conversation2).id.equals("-1") || ((DbObject) conversation2).id.equals("-10040") || ((DbObject) conversation2).id.equals("-11001")) {
                conversation2.localNotificationStatus = NotificationStatus.get("removed");
            } else {
                conversation2.localNotificationStatus = NotificationStatus.get("pending");
            }
            if ("free_see_match".equals(conversation.convType)) {
                conversation2.localEverHasMessage = true;
                if (NullChecker.a(conversation2.property) && NullChecker.a(conversation2.property.limitedTrialSee) && TextUtils.equals(conversation2.property.limitedTrialSee.actorId, CoreModule.m1850H().userId())) {
                    conversation2.localIsLimitedTrialSee = 1;
                }
            }
        }
        if (TextUtils.equals(conversation2.convType, CameraSticker.CATEGORY_DEFAULT_FILTER) && NullChecker.a(conversation2.additional) && NullChecker.a(conversation2.additional.oneSide) && TEnum.equals(conversation2.additional.oneSide.subChannel, "gift")) {
            e51.G(new Runnable() { // from class: l.rj8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f1534c.f3652m0.m2920D8(((DbObject) conversation).id);
                }
            });
        }
        if (ura.m25555e().m25559d().m5595B() && ura.m25555e().m25559d().m5593Aj(conversation)) {
            e51.G(new Runnable() { // from class: l.sj8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f1534c.f3652m0.m2924E8(((DbObject) conversation).id);
                }
            });
        }
        if (ura.m25555e().m25559d().m5613E() && ura.m25555e().m25559d().m5664Nd(conversation2)) {
            conversation2.localEverHasMessage = true;
            conversation2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (m14621G(conversation2, conversation)) {
            conversation2.localEverHasMessage = true;
            if (!m14620F(conversation2)) {
                conversation2.read = Boolean.TRUE;
            }
            conversation2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (ura.m25555e().m25559d().m5865tl() && !conversation2.localEverHasMessage && NullChecker.a(conversation2.additional) && NullChecker.a(conversation2.additional.game) && conversation2.additional.game.gameUnread > 0) {
            conversation2.localEverHasMessage = true;
            conversation2.localNotificationStatus = NotificationStatus.get("removed");
        }
        if (ura.m25555e().m25559d().m5812l()) {
            if (NullChecker.a(conversation3) && NullChecker.a(conversation3.localDraft)) {
                conversation2.localDraft = conversation3.localDraft;
            }
            if (NullChecker.a(conversation3) && !vwb.J(conversation3.localChatBg)) {
                conversation2.localChatBg = conversation3.localChatBg;
            }
        }
        if (ura.m25555e().m25559d().m5726Yh()) {
            if (!conversation2.localEverHasMessage && mqi0.o() - ((long) CoreModule.f1534c.f3628e0.m21483na().createdTime) < 86400000) {
                conversation2.localEverHasMessage = true;
                atomicBoolean.set(true);
            } else if (mqi0.o() - ((long) CoreModule.f1534c.f3628e0.m21483na().createdTime) > 86400000) {
                CommonData moduleData = envelope.getModuleData(CommonData.class);
                if (!vwb.J(moduleData.users)) {
                    for (User user : moduleData.users) {
                        if (TextUtils.equals(((DbObject) user).id, ((DbObject) conversation).id) && user.createdTime > d && mqi0.o() - ((long) user.createdTime) < 86400000) {
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
        if (conversation2.level < 55 && NullChecker.a(conversation2.additional) && NullChecker.a(conversation2.additional.tag)) {
            ConversationAdditionalTag conversationAdditionalTag = conversation2.additional.tag;
            if (conversationAdditionalTag.top && conversationAdditionalTag.expireTime * 1000 > mqi0.o()) {
                conversation2.level = 55;
            }
        }
        if (NullChecker.a(conversation2.additional) && NullChecker.a(conversation2.additional.pinChat) && TextUtils.equals(conversation2.additional.pinChat.userId, ((DbObject) conversation2).id)) {
            PlatinumPinChat platinumPinChat = conversation2.additional.pinChat;
            if (platinumPinChat.pin && platinumPinChat.expireTime > mqi0.o()) {
                CoreModule.m1854P().m11710f().zb(((DbObject) conversation2).id, conversation2.level);
                conversation2.level = 90;
            }
        }
        if (NullChecker.a(conversation3) && NullChecker.a(conversation2)) {
            double d6 = conversation3.lastActivityTime;
            if (d6 != d && conversation2.lastActivityTime == d) {
                conversation2.lastActivityTime = d6;
            }
        }
        if (NullChecker.a(conversation3) && NullChecker.a(conversation3.additional) && NullChecker.a(conversation3.additional.heartbeatMatch) && NullChecker.a(conversation2) && NullChecker.a(conversation2.additional) && NullChecker.a(conversation2.additional.heartbeatMatch) && conversation3.additional.heartbeatMatch.lock && !conversation2.additional.heartbeatMatch.lock) {
            CoreModule.f1534c.f3544C0.m27420u4();
            CoreModule.f1534c.f3560H1.m26140Z3();
        }
        if (!conversation.isFakeOneSideConv() || conversation.mm > 0 || CoreModule.f1534c.f3628e0.m21483na().isSVIP()) {
            return;
        }
        conversation.localNotificationStatus = NotificationStatus.get("removed");
    }

    /* JADX INFO: renamed from: K */
    public final void m14625K(Message message) {
        if (!DateUtils.isToday((long) message.createdTime) || User.isTeamAccount(message.cid) || message.localInMoment) {
            return;
        }
        ura.m25555e().m25559d().m5796jd(1);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m14628a(final Envelope envelope, CoreData coreData, final boolean z, boolean z2, final boolean z3) {
        boolean z4;
        Conversation conversationQuery;
        Conversation conversationQuery2;
        final ek8 ek8Var = this;
        final CoreData coreData2 = coreData;
        if (envelope != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (!vwb.J(coreData2.privateQuestions)) {
                Iterator it = coreData2.privateQuestions.iterator();
                while (it.hasNext()) {
                    ek8Var.f11201i.upsert((PrivateQuestion) it.next());
                }
            }
            if (!vwb.J(coreData2.summarizedPrivileges)) {
                Iterator it2 = coreData2.summarizedPrivileges.iterator();
                while (it2.hasNext()) {
                    ek8Var.f11202j.upsert((UserPrivilege) it2.next());
                }
            }
            if (!vwb.J(coreData2.stickers)) {
                Iterator it3 = coreData2.stickers.iterator();
                while (it3.hasNext()) {
                    ek8Var.f11199g.upsert((Sticker) it3.next());
                }
            }
            if (!vwb.J(coreData2.questions)) {
                Iterator it4 = coreData2.questions.iterator();
                while (it4.hasNext()) {
                    ek8Var.f11197e.upsert((Question) it4.next());
                }
            }
            if (!vwb.J(coreData2.literatures)) {
                for (Literatures literatures : coreData2.literatures) {
                    if (NullChecker.a(literatures) && !TextUtils.isEmpty(literatures.id)) {
                        CoreModule.f1534c.f3628e0.m21380M9(literatures.id, literatures);
                    }
                }
            }
            new HashMap();
            HashMap mapD = vwb.d(coreData2.messages, new w9j() { // from class: l.jj8
                public final Object call(Object obj) {
                    return ((DbObject) ((Message) obj)).id;
                }
            }, new w9j() { // from class: l.yj8
                public final Object call(Object obj) {
                    return ek8.m14599A((Message) obj);
                }
            });
            if (!vwb.J(coreData2.conversations)) {
                Iterator it5 = coreData2.conversations.iterator();
                HashSet hashSet = new HashSet();
                if (!CoreModule.m1853N().n7()) {
                    hashSet.add("-10021");
                }
                if (!CoreModule.m1854P().m11706a().m5251Es()) {
                    hashSet.add("-10025");
                }
                while (it5.hasNext()) {
                    Conversation conversation = (Conversation) it5.next();
                    if (conversation != null) {
                        if (TEnum.equals(conversation.status, "deleted")) {
                            ek8Var.f11205m.delete(((DbObject) conversation).id);
                            ek8Var.f11195c.m26883J(((DbObject) conversation).id);
                            ek8Var.f11196d.delete(((DbObject) conversation).id);
                            it5.remove();
                        } else if (hashSet.contains(((DbObject) conversation).id)) {
                            it5.remove();
                        }
                    }
                }
            }
            final HashMap map = new HashMap();
            StringBuilder sb = new StringBuilder();
            if (vwb.J(coreData2.conversations)) {
                z4 = false;
            } else {
                if (CoreModule.m1854P().m11706a().m5261Gf()) {
                    final Conversation conversationQuery3 = ek8Var.f11205m.query("fake_conversation_local_instant_chat_conversation");
                    if (NullChecker.a(conversationQuery3) && NullChecker.a((Conversation) vwb.r(coreData2.conversations, new w9j() { // from class: l.zj8
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((DbObject) ((Conversation) obj)).id, conversationQuery3.otherUser));
                        }
                    }))) {
                        ek8Var.f11205m.delete(Conversation.CONVTYPE.EQ("local_instant_chat_guide"));
                    }
                }
                z4 = false;
                for (final Conversation conversation2 : coreData2.conversations) {
                    if (conversation2 != null) {
                        if (TEnum.equals(conversation2.status, "deleted") && conversation2.unreadMessages > 0) {
                            sb.append(((DbObject) conversation2).id);
                            sb.append(",");
                            z4 = true;
                        }
                        boolean z5 = z4;
                        if (!NullChecker.a(((DbObject) conversation2).id)) {
                            CrashHelper.c(new IllegalStateException("【.id判空】conv id = null, mergeLocal = " + conversation2.toJson() + "   conv._id = " + ((DbObject) conversation2)._id));
                        }
                        final int size = (!NullChecker.a(conversation2.api_only_messages) || vwb.J(conversation2.api_only_messages.ids)) ? 0 : conversation2.api_only_messages.ids.size();
                        conversation2.api_only_messages = null;
                        if ((!wh5.d().f() || !conversation2.lowPayOneSideConv() || (conversationQuery2 = ek8Var.f11205m.query(((DbObject) conversation2).id)) == null || !"fakeReceiveLikeGuideSVip".equals(conversationQuery2.convType)) && (!CoreModule.f1546o.m25557b().m5586wf() || (conversationQuery = ek8Var.f11205m.query(((DbObject) conversation2).id)) == null || !"fakeIntlReceiveLikeGuideSVip".equals(conversationQuery.convType))) {
                            Conversation conversationM17605p1 = ek8Var.f11205m.upsert(conversation2, new f30() { // from class: l.ak8
                                public final void call(Object obj, Object obj2) {
                                    this.f8294a.m14624J(conversation2, coreData2, size, atomicBoolean, envelope, (Conversation) obj, (Conversation) obj2);
                                }
                            });
                            map.put(((DbObject) conversationM17605p1).id, vwb.Y(conversationM17605p1, Boolean.FALSE));
                        }
                        ek8Var = this;
                        z4 = z5;
                        atomicBoolean = atomicBoolean;
                    }
                }
            }
            AtomicBoolean atomicBoolean2 = atomicBoolean;
            if (z4) {
                CrashHelper.c(new Exception("Conv merge local has delete status : url = " + envelope.requestLocalUrl + " ids: " + sb.toString()));
            }
            Collections.sort(coreData2.messages, new Comparator() { // from class: l.bk8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ek8.m14611r((Message) obj, (Message) obj2);
                }
            });
            CommonData moduleData = envelope.getModuleData(CommonData.class);
            if (!vwb.J(moduleData.users)) {
                for (final User user : moduleData.users) {
                    final CoreData coreData3 = coreData2;
                    qib0.f19813k0.f23551d.upsert(user, new f30() { // from class: l.ck8
                        public final void call(Object obj, Object obj2) {
                            this.f9699a.m14622H(z, z3, coreData3, user, (User) obj, (User) obj2);
                        }
                    });
                    coreData2 = coreData3;
                }
            }
            CoreData coreData4 = coreData2;
            if (!vwb.J(coreData4.chatGroups)) {
                Iterator it6 = coreData4.chatGroups.iterator();
                while (it6.hasNext()) {
                    this.f11206n.upsert((ChatGroup) it6.next(), new f30() { // from class: l.dk8
                        public final void call(Object obj, Object obj2) {
                            ek8.m14615v((ChatGroup) obj, (ChatGroup) obj2);
                        }
                    });
                }
            }
            if (!vwb.J(coreData4.chatGroupMembers)) {
                for (final ChatGroupMember chatGroupMember : coreData4.chatGroupMembers) {
                    this.f11207o.upsert(chatGroupMember, new f30() { // from class: l.kj8
                        public final void call(Object obj, Object obj2) {
                            ek8.m14606m(chatGroupMember, (ChatGroupMember) obj, (ChatGroupMember) obj2);
                        }
                    });
                }
            }
            String strM5733af = ura.m25555e().m25559d().m5733af();
            if (!vwb.J(coreData4.messages)) {
                final ArrayList<String> arrayList = new ArrayList();
                for (final Message message : coreData4.messages) {
                    if (!ura.m25555e().m25559d().m5613E() || !TEnum.equals(message.status, "deleted")) {
                        final HashMap map2 = mapD;
                        final String str = strM5733af;
                        this.f11195c.upsert(message, new f30() { // from class: l.lj8
                            public final void call(Object obj, Object obj2) {
                                this.f16443a.m14623I(message, map, map2, arrayList, envelope, str, (Message) obj, (Message) obj2);
                            }
                        });
                        strM5733af = str;
                        mapD = map2;
                    }
                }
                for (String str2 : arrayList) {
                    if (ura.m25555e().m25559d().m5784i()) {
                        CoreModule.f1534c.f3631f0.m4656Mf(str2);
                    }
                    if (ura.m25555e().m25559d().m5892ym()) {
                        CoreModule.f1534c.f3631f0.m4908hi(str2);
                    }
                }
            }
            for (j760 j760Var : map.values()) {
                if (((Boolean) j760Var.b).booleanValue()) {
                    this.f11205m.upsert((Conversation) j760Var.a);
                }
            }
            for (Reminder reminder : coreData4.reminders) {
                Conversation conversationM17584d1 = this.f11205m.m17584d1(reminder.otherUser);
                if (conversationM17584d1 != null) {
                    conversationM17584d1.reminder = reminder;
                    this.f11205m.upsert(conversationM17584d1);
                }
            }
            if (!vwb.J(coreData4.chatHeats)) {
                Iterator it7 = coreData4.chatHeats.iterator();
                while (it7.hasNext()) {
                    this.f11211s.upsert((ChatHeat) it7.next(), new f30() { // from class: l.mj8
                        public final void call(Object obj, Object obj2) {
                            ek8.m14609p((ChatHeat) obj, (ChatHeat) obj2);
                        }
                    });
                }
            }
            for (VerificationCenter verificationCenter : coreData4.verificationCenter) {
                if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
                    hpd0 hpd0Var = CoreModule.f1534c.f3541B0.f3737V;
                    Boolean bool = Boolean.TRUE;
                    hpd0Var.put(bool);
                    CoreModule.f1534c.f3541B0.f3736U.put(bool);
                }
                if (NullChecker.a(verificationCenter.idCard) && TEnum.equals(verificationCenter.idCard.status, "pending")) {
                    hpd0 hpd0Var2 = CoreModule.f1534c.f3541B0.f3733R;
                    Boolean bool2 = Boolean.TRUE;
                    hpd0Var2.put(bool2);
                    CoreModule.f1534c.f3541B0.f3734S.put(bool2);
                }
                this.f11200h.upsert(verificationCenter);
            }
            if (coreData4.merchandises != null) {
                du2.a("[core][merchandise]", "start upset merchandise");
                for (Merchandise merchandise : coreData4.merchandises) {
                    if (TEnum.equals(merchandise.category, "oDiamond")) {
                        du2.a("[core][merchandise]", "upset oDiamond " + merchandise.quantity + " " + merchandise.productType + " " + merchandise.defaultStockKeepUnit.id + " " + ((DbObject) merchandise).id);
                    }
                    this.f11203k.upsert(merchandise);
                }
                du2.a("[core][merchandise]", "end upset merchandise");
            }
            List list = coreData4.monetizationPromotions;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    this.f11208p.upsert((MonetizationPromotion) it8.next());
                }
            }
            List list2 = coreData4.coupons;
            if (list2 != null) {
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    this.f11209q.upsert((Coupon) it9.next());
                }
            }
            List list3 = coreData4.giftInfos;
            if (list3 != null) {
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    this.f11210r.upsert((CoreGiftInfo) it10.next());
                }
            }
            if (CoreModule.f1534c.f3631f0.m4726Se() == null || atomicBoolean2.get()) {
                CoreModule.f1534c.f3631f0.m4868dq(qib0.f19784H.guessedCurrentServerTime());
            }
            Counter counterM3414o3 = CoreModule.f1534c.m3414o3();
            if (counterM3414o3 != null && counterM3414o3.activities.unread < envelope.counters.activities.unread && CoreModule.f1534c.findRequest("activity/poll", 0) == null) {
                e51.G(new Runnable() { // from class: l.uj8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.m1853N().coreMomentActivityPoll();
                    }
                });
            }
            f8c.o().A(new d30() { // from class: l.wj8
                public final void call() {
                    ek8.m14607n(envelope);
                }
            }, new d30() { // from class: l.xj8
                public final void call() {
                    ek8.m14616w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m14627M(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN str_localMatchFrom_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN str_localNotificationStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN str_importance_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN str_subtype_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN str_localBusinessTypes_c BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN str_localPlaceBan_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_sentFrom_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_localNotificationStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_localCallHandledStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_msgType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_messageType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_localBusinessTypes_c BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_channel_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_sentFrom_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_localNotificationStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_localCallHandledStatus_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_msgType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_messageType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_localBusinessTypes_c BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_channel_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f11197e.d + " ADD COLUMN str_category_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f11199g.d + " ADD COLUMN str_source_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f11200h.d + " ADD COLUMN str_picVerificationInfo_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + this.f11200h.d + " ADD COLUMN str_ageVerificationInfo_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11203k).d + " ADD COLUMN str_category_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11203k).d + " ADD COLUMN str_productType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN str_groupType_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN str_groupApply_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11207o).d + " ADD COLUMN str_status_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11207o).d + " ADD COLUMN str_gender_c TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11204l).d + " ADD COLUMN str_state_c TEXT");
    }

    /* JADX INFO: renamed from: c */
    public int m14630c() {
        return 74;
    }

    /* JADX INFO: renamed from: d */
    public int m14631d() {
        return 2;
    }

    /* JADX INFO: renamed from: e */
    public String m14632e() {
        return "coreDb";
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> m14633f() {
        return super.f();
    }

    /* JADX INFO: renamed from: g */
    public void m14634g() {
        rpq.b().e(CoreData.JSON_ADAPTER, this);
    }

    /* JADX INFO: renamed from: h */
    public void m14635h() {
        this.f11206n = new yt4(this, "chat_groups", ChatGroup.DB_ADAPTER, null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11207o = new xt4(this, "chatGroupMembers", ChatGroupMember.DB_ADAPTER, null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11208p = new qya0(this, "promotions", MonetizationPromotion.DB_ADAPTER, null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11209q = new crb(this, "coupons", Coupon.DB_ADAPTER, null, 100);
        this.f11210r = new twj(this, "coreGift", CoreGiftInfo.DB_ADAPTER, null, 200);
        mrf0 mrf0Var = Message.DB_ADAPTER;
        Column column = Message.CREATEDTIME;
        this.f11195c = new wxz(this, "messages", mrf0Var, vwb.f0(new Index[]{new Index(new Column[]{Message.LOCALINCONVERSATION, Message.CID, column}), new Index(new Column[]{Message.LOCALINMOMENT, Message.MOMENT, column}), new Index(new Column[]{Message.LOCALNOTIFICATIONSTATUS, column})}), AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        mrf0 mrf0Var2 = Conversation.DB_ADAPTER;
        Column column2 = Conversation.LATESTTIME;
        this.f11205m = new jl6(this, "conversations", mrf0Var2, vwb.f0(new Index[]{new Index(new Column[]{column2}), new Index(new Column[]{Conversation.LOCALHASMESSAGE, column2}), new Index(new Column[]{Conversation.LOCALNOTIFICATIONSTATUS, column2})}), AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11196d = new orh0<>(this, "message_links", DbLinks.DB_ADAPTER, (List) null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11197e = new orh0<>(this, "questions", Question.DB_ADAPTER, (List) null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11198f = new ttv(this, "localMessages", Message.DB_ADAPTER, null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11199g = new orh0<>(this, "stickers", Sticker.DB_ADAPTER, (List) null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11200h = new orh0<>(this, "verificationCenter", VerificationCenter.DB_ADAPTER, (List) null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11201i = new ts80(this, "private_question", PrivateQuestion.DB_ADAPTER, null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11202j = new orh0<>(this, "userPrivilege", UserPrivilege.DB_ADAPTER, (List) null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f11203k = new viy(this, "merchandises", Merchandise.DB_ADAPTER, null, 100);
        this.f11204l = new dj6(this, "conversation_records", ConversationPatchRecord.DB_ADAPTER, null, 100);
        this.f11211s = new uu4(this, "chatheat", ChatHeat.DB_ADAPTER, null, 100);
    }

    /* JADX INFO: renamed from: i */
    public void m14636i() {
        super.i();
        rpq.b().i(this, CoreData.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: j */
    public void m14637j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 0:
            case 1:
                sQLiteDatabase.execSQL("DROP TABLE " + ((orh0) this.f11203k).d);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + ((orh0) this.f11203k).d + " (_id INTEGER PRIMARY KEY,id_c TEXT,category_c INTEGER,quantity_c INTEGER,productType_c INTEGER,defaultStockKeepUnit_id_c TEXT,defaultStockKeepUnit_type_c TEXT,defaultStockKeepUnit_affiliateProducts_alipay_c TEXT,defaultStockKeepUnit_affiliateProducts_wechat_c TEXT,defaultStockKeepUnit_affiliateProducts_googleplay_c TEXT,defaultStockKeepUnit_affiliateProducts_huawei_c TEXT,defaultStockKeepUnit_prices_currencyCode_c TEXT,defaultStockKeepUnit_prices_currencySymbol_c TEXT,defaultStockKeepUnit_prices_price_c REAL,defaultStockKeepUnit_prices_unitPrice_c REAL,defaultStockKeepUnit_prices_originalPrice_c REAL,defaultStockKeepUnit_prices_originalUnitPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalUnitPrice_c REAL,defaultStockKeepUnit_promotionDetail_promotionType_c TEXT,defaultStockKeepUnit_promotionDetail_beginTime_c REAL,defaultStockKeepUnit_promotionDetail_endTime_c REAL,defaultStockKeepUnit_promotionDetail_promotionPrice_c REAL,defaultStockKeepUnit_promotionDetail_promotionDuration_c INTEGER,defaultStockKeepUnit_promotionDetail_promotionState_c TEXT,defaultStockKeepUnit_promotionDetail_couponToken_c TEXT,defaultStockKeepUnit_promotionDetail_affiliate_c INTEGER,defaultStockKeepUnit_promotionDetail_subscriptionOnly_c INTEGER,defaultStockKeepUnit_promotionDetail_localCouponId_c TEXT,defaultStockKeepUnit_promotionDetail_localPromotionId_c TEXT,defaultStockKeepUnit_tracker_c TEXT,promotionStockKeepUnit_id_c TEXT,promotionStockKeepUnit_type_c TEXT,promotionStockKeepUnit_affiliateProducts_alipay_c TEXT,promotionStockKeepUnit_affiliateProducts_wechat_c TEXT,promotionStockKeepUnit_affiliateProducts_googleplay_c TEXT,promotionStockKeepUnit_affiliateProducts_huawei_c TEXT,promotionStockKeepUnit_prices_currencyCode_c TEXT,promotionStockKeepUnit_prices_currencySymbol_c TEXT,promotionStockKeepUnit_prices_price_c REAL,promotionStockKeepUnit_prices_unitPrice_c REAL,promotionStockKeepUnit_prices_originalPrice_c REAL,promotionStockKeepUnit_prices_originalUnitPrice_c REAL,promotionStockKeepUnit_prices_noneRenewalPrice_c REAL,promotionStockKeepUnit_prices_noneRenewalUnitPrice_c REAL,promotionStockKeepUnit_promotionDetail_promotionType_c TEXT,promotionStockKeepUnit_promotionDetail_beginTime_c REAL,promotionStockKeepUnit_promotionDetail_endTime_c REAL,promotionStockKeepUnit_promotionDetail_promotionPrice_c REAL,promotionStockKeepUnit_promotionDetail_promotionDuration_c INTEGER,promotionStockKeepUnit_promotionDetail_promotionState_c TEXT,promotionStockKeepUnit_promotionDetail_couponToken_c TEXT,promotionStockKeepUnit_promotionDetail_affiliate_c INTEGER,promotionStockKeepUnit_promotionDetail_subscriptionOnly_c INTEGER,promotionStockKeepUnit_promotionDetail_localCouponId_c TEXT,promotionStockKeepUnit_promotionDetail_localPromotionId_c TEXT,promotionStockKeepUnit_tracker_c TEXT)");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_contents_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_resonance_c TEXT");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS kankans (_id INTEGER PRIMARY KEY,id_c TEXT,owner_c TEXT,value_c TEXT,textTheme_backgroundColor_c BLOB,textTheme_bottomColor_c TEXT,emotion_c BLOB,location_c BLOB,resonance_c BLOB,contents_c BLOB,createdTime_c REAL)");
            case CameraSticker.STATE_COMPLETE /* 3 */:
                sQLiteDatabase.execSQL("DELETE FROM " + ((orh0) this.f11205m).d + " WHERE convType_c='group'");
            case CameraSticker.STATE_ERROR /* 4 */:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + "  ADD COLUMN localAudioText_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11210r).d + " ADD COLUMN quota_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11210r).d + " ADD COLUMN extra_messageTips_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11210r).d + " ADD COLUMN extra_noQuotaToast_c TEXT");
            case 5:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS greeting_messages (_id INTEGER PRIMARY KEY,id_c TEXT,localCreatedTime_c INTEGER,localCreatedSession_c INTEGER,localInMoment_c INTEGER,localInConversation_c INTEGER,createdTime_c REAL,cid_c TEXT,media_c BLOB,sticker_c TEXT,question_c TEXT,sentFrom_c INTEGER,moment_c TEXT,answerOfMessage_c TEXT,owner_c TEXT,location_c BLOB,recalled_c INTEGER,value_c TEXT,localNotificationStatus_c INTEGER,likeOfMoment_c TEXT,localAnimationKey_c TEXT,api_only_accessory_c BLOB,giftRecords_c BLOB,call_c BLOB,localCallType_c TEXT,localCallStatus_c INTEGER,localCallHandledStatus_c INTEGER,localPrivateQuestions_c BLOB,letter_c BLOB,chatTyping_c INTEGER,localFailType_c INTEGER,recalledReason_c TEXT,recalledHint_c TEXT,msgType_c INTEGER,messageType_c INTEGER,additionalData_c BLOB,localSafetyReminder_c INTEGER,localSensitiveWordReminder_c INTEGER,msgData_c TEXT,localBusinessTypes_c BLOB,settings_anonymous_c INTEGER,channel_c INTEGER,notifiedUsers_c BLOB,status_c INTEGER,referenceMsgId_c TEXT,hostId_c TEXT,localRedPacketType_c TEXT,localAudioText_c BLOB,localGreetingId_c TEXT)");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN localGreetingId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_greetingSummaryDetail_unseen_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_greetingSummaryDetail_latestTime_c REAL");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_greetingSummaryDetail_latestUserId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_greetingSummaryDetail_latestMessageId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE kankans ADD COLUMN status_c TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE kankans ADD COLUMN topic_c BLOB");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_quickChat_bell_isInitiator_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_quickChat_bell_agree_c TEXT");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN localMessageInsertReportHint_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN localNotifyMomentId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN localInsertedMomentId_c TEXT");
                sQLiteDatabase.execSQL("DELETE FROM " + ((orh0) this.f11205m).d + " WHERE status_c=1");
                StringBuilder sb = new StringBuilder("DROP TABLE ");
                sb.append(((orh0) this.f11210r).d);
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + ((orh0) this.f11210r).d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,url_c TEXT,unitCoinPrice_c REAL,unitLikes_c INTEGER,dynamicGift_c INTEGER,dynamicURL_c TEXT,dynamicMD5_c TEXT,quota_c INTEGER,extra_messageTips_c TEXT,extra_noQuotaToast_c TEXT,extra_shopGuide_c TEXT,extra_blessingText_c TEXT)");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11209q).d + " ADD COLUMN benefit_localBenefit_discountBenefit_showDiscount_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11209q).d + " ADD COLUMN benefit_localBenefit_discountBenefit_privilegesChange_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11209q).d + " ADD COLUMN benefit_localBenefit_discountBenefit_hasPrivilegesChange_c INTEGER DEFAULT 0");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN read_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN needRead_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN extData_c BLOB");
            case 11:
                sQLiteDatabase.execSQL("DROP TABLE greeting_messages");
                sQLiteDatabase.execSQL("DELETE FROM " + this.f11196d.d + " WHERE id_c LIKE '%greeting%'");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS greeting_messages (_id INTEGER PRIMARY KEY,id_c TEXT,localCreatedTime_c INTEGER,localCreatedSession_c INTEGER,localInMoment_c INTEGER,localInConversation_c INTEGER,createdTime_c REAL,cid_c TEXT,media_c BLOB,sticker_c TEXT,question_c TEXT,sentFrom_c INTEGER,moment_c TEXT,answerOfMessage_c TEXT,owner_c TEXT,location_c BLOB,recalled_c INTEGER,value_c TEXT,localNotificationStatus_c INTEGER,likeOfMoment_c TEXT,localAnimationKey_c TEXT,api_only_accessory_c BLOB,giftRecords_c BLOB,call_c BLOB,localCallType_c TEXT,localCallStatus_c INTEGER,localCallHandledStatus_c INTEGER,localPrivateQuestions_c BLOB,letter_c BLOB,chatTyping_c INTEGER,localFailType_c INTEGER,recalledReason_c TEXT,recalledHint_c TEXT,msgType_c INTEGER,messageType_c INTEGER,additionalData_c BLOB,localSafetyReminder_c INTEGER,localSensitiveWordReminder_c INTEGER,msgData_c TEXT,localBusinessTypes_c BLOB,settings_anonymous_c INTEGER,channel_c INTEGER,notifiedUsers_c BLOB,status_c INTEGER,referenceMsgId_c TEXT,hostId_c TEXT,localRedPacketType_c TEXT,localAudioText_c BLOB,localGreetingId_c TEXT,read_c INTEGER,needRead_c INTEGER,extData_c BLOB)");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN fromConvType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN fromConvType_c TEXT");
            case 13:
                sQLiteDatabase.execSQL("DELETE FROM " + ((orh0) this.f11205m).d + " WHERE status_c = 3 OR status_c = 5");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN mm_c INTEGER");
            case 14:
                sQLiteDatabase.execSQL("DELETE FROM " + ((orh0) this.f11195c).d + " WHERE messageType_c = 42");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN localExtraInfo_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE greeting_messages ADD COLUMN localExtraInfo_c TEXT");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_quickChat_expire_c REAL");
                m14627M(sQLiteDatabase);
            case 17:
                sQLiteDatabase.execSQL("DROP TABLE greeting_messages");
                sQLiteDatabase.execSQL("DELETE FROM " + this.f11196d.d + " WHERE id_c LIKE '%greeting%'");
            case 18:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN incTempInfo_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN intimacy_c INTEGER");
            case 19:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN quickChatProgress_c INTEGER");
            case 20:
                sQLiteDatabase.execSQL("DROP TABLE " + ((orh0) this.f11203k).d);
                sQLiteDatabase.execSQL("DROP TABLE " + ((orh0) this.f11209q).d);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + ((orh0) this.f11203k).d + " (_id INTEGER PRIMARY KEY,id_c TEXT,category_c INTEGER,quantity_c INTEGER,productType_c INTEGER,defaultStockKeepUnit_id_c TEXT,defaultStockKeepUnit_type_c TEXT,defaultStockKeepUnit_affiliateProducts_alipay_c TEXT,defaultStockKeepUnit_affiliateProducts_wechat_c TEXT,defaultStockKeepUnit_affiliateProducts_googleplay_c TEXT,defaultStockKeepUnit_affiliateProducts_huawei_c TEXT,defaultStockKeepUnit_prices_currencyCode_c TEXT,defaultStockKeepUnit_prices_currencySymbol_c TEXT,defaultStockKeepUnit_prices_price_c REAL,defaultStockKeepUnit_prices_unitPrice_c REAL,defaultStockKeepUnit_prices_originalPrice_c REAL,defaultStockKeepUnit_prices_originalUnitPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalUnitPrice_c REAL,defaultStockKeepUnit_tracker_c TEXT,str_category_c TEXT,str_productType_c TEXT,localCoupons_c BLOB)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + ((orh0) this.f11209q).d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,tags_c BLOB,couponType_c TEXT,ignoreBeginTime_c INTEGER,ignoreEndTime_c INTEGER,beginTime_c REAL,endTime_c REAL,condition_purchaseChannel_c BLOB,condition_skuIDs_c BLOB,condition_merchandiseIDs_c BLOB,benefit_localBenefit_benefitType_c TEXT,benefit_localBenefit_trialBenefit_trialDuration_c INTEGER,benefit_localBenefit_trialBenefit_discount_discountType_c TEXT,benefit_localBenefit_trialBenefit_discount_value_c INTEGER,benefit_localBenefit_trialBenefit_trialReplaceItemID_c INTEGER,benefit_localBenefit_trialBenefit_afterTrialDiscount_discountType_c TEXT,benefit_localBenefit_trialBenefit_afterTrialDiscount_value_c INTEGER,benefit_localBenefit_discountBenefit_discountType_c TEXT,benefit_localBenefit_discountBenefit_value_c INTEGER,userCouponID_c TEXT,couponID_c TEXT,benefit_localBenefit_discountBenefit_showDiscount_c TEXT,benefit_localBenefit_discountBenefit_privilegesChange_c BLOB,benefit_localBenefit_discountBenefit_hasPrivilegesChange_c INTEGER,localApplyPromotions_c BLOB)");
            case 21:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN expiredTime_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN joinRemainedTime_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN source_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN token_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN groupTopic_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN groupTopic_owner_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN groupTopic_value_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN groupTopic_medias_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN upgraded_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN duration_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN group_source_c TEXT DEFAULT ''");
            case 22:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS literaturesComments (_id INTEGER PRIMARY KEY,id_c TEXT,userID_c TEXT,literatureID_c TEXT,interestLevel_c TEXT,createdTime_c INTEGER,localLiteratures_c BLOB)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS literatures (_id INTEGER PRIMARY KEY,id_c TEXT,title_c TEXT,category_c TEXT,author_c BLOB,headUrl_c TEXT,kinds_c BLOB,bgColor_c TEXT)");
            case 23:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_quickChat_progress_c INTEGER");
            case 24:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_feedStateCounter_c BLOB");
            case 25:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11210r).d + " ADD COLUMN extra_grayURL_c TEXT");
            case 26:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_suggestedTimeLimitedMatch_c BLOB");
            case 27:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN joinCondition_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN onlineCount_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN adminLimit_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN permissions_canShareToWeChat_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN permissions_canShareToTantan_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN permissions_canChangeJoinCondition_c INTEGER");
            case 28:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_greetingSummaryDetail_iconURL_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_greetingSummaryDetail_title_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_kankan_greetingSummaryDetail_subtitle_c TEXT");
            case 29:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_heartbeatMatch_c BLOB");
            case 30:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN hasLocalBreakIce_c INTEGER");
            case 31:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_avatarSummary_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_feedInteractionCounter_c BLOB");
            case 32:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f11202j.d + " ADD COLUMN content_unlimit_c INTEGER");
            case 33:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN localSpoofingNewTime_c REAL");
            case 34:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN inModeration_nickName_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN inModeration_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN inModeration_description_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11207o).d + " ADD COLUMN inModeration_nickName_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11207o).d + " ADD COLUMN inModeration_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11207o).d + " ADD COLUMN inModeration_description_c TEXT");
            case 35:
                sQLiteDatabase.execSQL("DROP TABLE literaturesComments");
                sQLiteDatabase.execSQL("DROP TABLE literatures");
            case 36:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f11202j.d + " ADD COLUMN content_beginTime_c INTEGER");
            case 37:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f11197e.d + " ADD COLUMN source_c TEXT");
            case 38:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + ((orh0) this.f11211s).d + " (_id INTEGER PRIMARY KEY,id_c TEXT,degree_c REAL,levelUp_c INTEGER,specialRemind_c INTEGER,exclusiveChatInviteTime_c REAL,exclusiveChatInviteExpireTime_c REAL,exclusiveChatStartTime_c REAL,exclusiveChatEndTime_c REAL,showLevelDown_c INTEGER,tempDownDegree_c REAL)");
            case 39:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11206n).d + " ADD COLUMN shareToken_c TEXT");
            case 40:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN clearedTime_c REAL");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_liveVirtualVoice_c BLOB");
            case 41:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_localMomentInfo_c BLOB");
            case 42:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN localExtraInfo_c TEXT");
            case 43:
                sQLiteDatabase.execSQL("UPDATE " + ((orh0) this.f11205m).d + " SET level_c = 100 WHERE level_c = 1");
            case 44:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN lastActivityTime_c REAL");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_liveActivity_c BLOB");
            case 45:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_game_c BLOB");
            case 46:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_tag_c BLOB");
            case 47:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_chatAssistantQuestion_c BLOB");
            case 48:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_quickChat_guideFakeToGood_c INTEGER");
            case 49:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN otherStatus_c TEXT DEFAULT ''");
            case 50:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_continuousChat_c BLOB");
            case 51:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN riskTags_c BLOB");
            case 52:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_pinChat_c BLOB");
            case 53:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_reSwipe_c BLOB");
            case 54:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_blindbox_c BLOB");
            case 55:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_previewTexts_c BLOB");
            case 56:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11203k).d + " ADD COLUMN duration_times_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11203k).d + " ADD COLUMN duration_timeUnit_c TEXT");
            case 57:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN localMyVisitorCount_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11195c).d + " ADD COLUMN localMyVisitorHidden_c INTEGER");
            case 58:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f11200h.d + " ADD COLUMN str_ctdidVerificationInfo_status_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f11200h.d + " ADD COLUMN ctdidVerificationInfo_media_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f11200h.d + " ADD COLUMN ctdidVerificationInfo_status_c INTEGER");
            case 59:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11203k).d + " ADD COLUMN extra_discountText_c TEXT");
            case 60:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_greetingInfo_c BLOB");
            case 61:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f11202j.d + " ADD COLUMN content_refreshMaxRemaining_c INTEGER");
            case 62:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_fateRadar_c BLOB");
            case 63:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN isFake_c INTEGER");
            case 64:
                sQLiteDatabase.execSQL("DROP TABLE kankans");
            case 65:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_lowPayOneside_c BLOB");
            case 66:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_matchInfo_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_newMatch_labelExposureTime_c REAL DEFAULT 0");
            case 67:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_loveLetter_c BLOB");
            case 68:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11209q).d + " ADD COLUMN benefit_localBenefit_giftBenefit_discount_discountType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11209q).d + " ADD COLUMN benefit_localBenefit_giftBenefit_discount_value_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11209q).d + " ADD COLUMN benefit_localBenefit_giftBenefit_giveItemIDs_c BLOB");
            case 69:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN localIsLimitedTrialSee_c INTEGER DEFAULT 0");
            case 70:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_chatMM_c BLOB");
            case 71:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_blackList_c BLOB");
            case 72:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_messageRelate_c BLOB");
            case 73:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_compliment_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f11205m).d + " ADD COLUMN additional_swiper_c BLOB");
                break;
        }
        r850.g(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: b */
    public void m14629b(Envelope envelope) {
    }
}
