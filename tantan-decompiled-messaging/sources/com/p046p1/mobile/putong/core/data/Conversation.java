package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.core.glcore.util.DetectDelayStopHelper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LocalBusinessType;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.LiveActivityConversation;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.Constants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.vwb;
import p149l.w9j;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes10.dex */
public class Conversation extends DbObject implements Cloneable, Serializable {
    public static final String DEFAULT_MATCH = "default";
    public static final int EXPOSURE_LEVEL_TOP = 50;
    public static final String HEARTBEAT_MATCH = "heartbeatMatch";
    public static final String INSTANT_CHAT = "instant_chat";
    public static final int LEVEL_TOP_PLATINUM = 90;
    public static final int NEW_LEVEL_TOP = 100;
    public static final String OTHER_STATUS_DEFAULT = "default";
    public static final String OTHER_STATUS_INVALID = "invalid";
    public static final String OTHER_STATUS_UNKNOWN = "unknown";
    public static final String SEE_UPGRADED_MATCH = "see_upgraded";
    public static final int SERVER_LEVEL_TOP = 1;
    public static final int SURPRISE_LEVEL_TOP = 10;
    public static final int TAG_LEVEL_TOP = 55;
    public static final String TYPE = "conversation";

    @NonNull
    @ProtobufIndex(index = 88)
    public ConversationAdditional additional;

    @Nullable
    public PartialIdList api_only_messages;

    @ProtobufIndex(index = 118)
    public double clearedTime;

    @Nullable
    @ProtobufIndex(index = 71)
    public String clearedUntil;

    @NonNull
    @ProtobufIndex(index = 89)
    public String convType;

    @ProtobufIndex(index = 85)
    public int conversationUserDistance;

    @ProtobufIndex(index = EACTags.TRACK1_APPLICATION)
    public double conversationUserUpdatedTime;

    @ProtobufIndex(index = 56)
    public double createdTime;

    @ProtobufIndex(index = 78)
    public int enterTimes;
    public boolean errorWhenParseReswipeInfo;

    @ProtobufIndex(index = 68)
    @Deprecated
    public boolean follow;

    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public boolean forceSend;

    @NonNull
    @ProtobufIndex(index = 99)
    public ConversationGroupProperty group;

    @ProtobufIndex(index = 116)
    public boolean hasLocalBreakIce;

    @NonNull
    @ProtobufIndex(index = EACTags.HEADER_LIST)
    public FriendHeatScore heat;

    @NonNull
    @ProtobufIndex(index = 66)
    public StickStatus importance;

    @ProtobufIndex(index = 114)
    public int intimacy;

    @ProtobufIndex(index = 122)
    public boolean isFake;

    @ProtobufIndex(index = 120)
    public double lastActivityTime;

    @ProtobufIndex(index = EACTags.TAG_LIST)
    public double latestFriendCommentCreatedTime;

    @ProtobufIndex(index = 55)
    public double latestTime;

    @ProtobufIndex(index = 87)
    public int level;

    @ProtobufIndex(index = 61)
    @Deprecated
    public double localActiveTime;

    @ProtobufIndex(index = 70)
    public double localBotherCodeTime;

    @ProtobufIndex(index = EACTags.APPLICATION_TEMPLATE)
    public int localBotherStatus;

    @ProtobufIndex(index = 69)
    public double localBotherWxTime;

    @ProtobufIndex(index = 59)
    public double localBotheringTime;

    @NonNull
    @ProtobufIndex(index = EACTags.LOGIN_DATA)
    public List<LocalBusinessType> localBusinessTypes;

    @Nullable
    @ProtobufIndex(index = 101)
    public List<Picture> localChatBg;

    @Nullable
    @ProtobufIndex(index = 100)
    public String localDraft;

    @ProtobufIndex(index = 63)
    public boolean localEverHasMessage;

    @Nullable
    @ProtobufIndex(index = 119)
    public String localExtraInfo;

    @ProtobufIndex(index = 95)
    public boolean localGreetDelete;

    @ProtobufIndex(index = 51)
    public boolean localHasMessage;

    @NonNull
    @ProtobufIndex(index = 105)
    public String localInsertedMomentId;

    @ProtobufIndex(index = 123)
    public int localIsLimitedTrialSee;

    @Nullable
    @ProtobufIndex(index = 57)
    @Deprecated
    public MatchFrom localMatchFrom;

    @Nullable
    @ProtobufIndex(index = 103)
    public String localMessageInsertReportHint;

    @NonNull
    @ProtobufIndex(index = 58)
    public NotificationStatus localNotificationStatus;

    @NonNull
    @ProtobufIndex(index = 104)
    public String localNotifyMomentId;

    @Nullable
    @ProtobufIndex(index = 67)
    public String localOnlineTabClick;

    @NonNull
    @ProtobufIndex(index = 102)
    public LocalPlaceBan localPlaceBan;

    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
    public double localSafetyReminderTime;

    @ProtobufIndex(index = 117)
    public double localSpoofingNewTime;

    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public double localSpoofingReminderTime;

    @ProtobufIndex(index = 65)
    public double localUserUpdatedTime;

    /* JADX INFO: renamed from: mm */
    @ProtobufIndex(index = 106)
    public int f20374mm;

    @ProtobufIndex(index = EACTags.FCP_TEMPLATE)
    public boolean muted;

    @NonNull
    @ProtobufIndex(index = 75)
    public TalkInfo myTalk;

    @Nullable
    @ProtobufIndex(index = 77)
    public String otherReadUntil;

    @NonNull
    @ProtobufIndex(index = 121)
    public String otherStatus;

    @NonNull
    @ProtobufIndex(index = 76)
    public TalkInfo otherTalk;

    @NonNull
    @ProtobufIndex(index = 53)
    public String otherUser;

    @Nullable
    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
    public String place;
    public ExpandedProfileLikeCounter profileLikeInfo;

    @NonNull
    @ProtobufIndex(index = 90)
    public ConversationProperty property;

    @ProtobufIndex(index = 115)
    public int quickChatProgress;

    @NonNull
    @ProtobufIndex(index = 52)
    public Boolean read;

    @Nullable
    @ProtobufIndex(index = 54)
    public String readUntil;
    public String recommendType;

    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public long remainedTime;

    @Nullable
    @ProtobufIndex(index = 64)
    public Reminder reminder;

    @Nullable
    @ProtobufIndex(index = 60)
    @Deprecated
    public List<String> scenarios;

    @NonNull
    @ProtobufIndex(index = 72)
    public ConversationStatus status;

    @NonNull
    @ProtobufIndex(index = 74)
    public ConversationType subtype;

    @ProtobufIndex(index = Opcodes.IADD)
    public double suggestionScore;

    @ProtobufIndex(index = 80)
    public boolean unmatchConversation;

    @ProtobufIndex(index = 62)
    public int unreadMessages;

    @ProtobufIndex(index = 79)
    public double updatedTime;

    @ProtobufIndex(index = EACTags.NAME)
    public int userMessageCount;
    public static ProtobufAdapter<Conversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<Conversation>() { // from class: com.p1.mobile.putong.core.data.Conversation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Conversation conversation) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, conversation._id);
            String str = conversation.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17220b = iM17228j + CodedOutputByteBufferNano.m17220b(51, conversation.localHasMessage);
            Boolean bool = conversation.read;
            if (bool != null) {
                iM17220b += CodedOutputByteBufferNano.m17220b(52, bool.booleanValue());
            }
            String str2 = conversation.otherUser;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(53, str2);
            }
            String str3 = conversation.readUntil;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(54, str3);
            }
            int iM17222d = iM17220b + CodedOutputByteBufferNano.m17222d(55, conversation.latestTime) + CodedOutputByteBufferNano.m17222d(56, conversation.createdTime);
            MatchFrom matchFrom = conversation.localMatchFrom;
            if (matchFrom != null) {
                iM17222d += CodedOutputByteBufferNano.m17226h(57, matchFrom.ordinal());
            }
            NotificationStatus notificationStatus = conversation.localNotificationStatus;
            if (notificationStatus != null) {
                iM17222d += CodedOutputByteBufferNano.m17226h(58, notificationStatus.ordinal());
            }
            int iM17222d2 = iM17222d + CodedOutputByteBufferNano.m17222d(59, conversation.localBotheringTime);
            List<String> list = conversation.scenarios;
            if (list != null) {
                iM17222d2 += CodedOutputByteBufferNano.m17230l(60, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17222d3 = iM17222d2 + CodedOutputByteBufferNano.m17222d(61, conversation.localActiveTime) + CodedOutputByteBufferNano.m17226h(62, conversation.unreadMessages) + CodedOutputByteBufferNano.m17220b(63, conversation.localEverHasMessage);
            Reminder reminder = conversation.reminder;
            if (reminder != null) {
                iM17222d3 += CodedOutputByteBufferNano.m17230l(64, reminder, Reminder.PROTOBUF_ADAPTER);
            }
            int iM17222d4 = iM17222d3 + CodedOutputByteBufferNano.m17222d(65, conversation.localUserUpdatedTime);
            StickStatus stickStatus = conversation.importance;
            if (stickStatus != null) {
                iM17222d4 += CodedOutputByteBufferNano.m17226h(66, stickStatus.ordinal());
            }
            String str4 = conversation.localOnlineTabClick;
            if (str4 != null) {
                iM17222d4 += CodedOutputByteBufferNano.m17233o(67, str4);
            }
            int iM17220b2 = iM17222d4 + CodedOutputByteBufferNano.m17220b(68, conversation.follow) + CodedOutputByteBufferNano.m17222d(69, conversation.localBotherWxTime) + CodedOutputByteBufferNano.m17222d(70, conversation.localBotherCodeTime);
            String str5 = conversation.clearedUntil;
            if (str5 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(71, str5);
            }
            ConversationStatus conversationStatus = conversation.status;
            if (conversationStatus != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17226h(72, conversationStatus.ordinal());
            }
            String str6 = conversation.place;
            if (str6 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(73, str6);
            }
            ConversationType conversationType = conversation.subtype;
            if (conversationType != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17226h(74, conversationType.ordinal());
            }
            TalkInfo talkInfo = conversation.myTalk;
            if (talkInfo != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(75, talkInfo, TalkInfo.PROTOBUF_ADAPTER);
            }
            TalkInfo talkInfo2 = conversation.otherTalk;
            if (talkInfo2 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(76, talkInfo2, TalkInfo.PROTOBUF_ADAPTER);
            }
            String str7 = conversation.otherReadUntil;
            if (str7 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(77, str7);
            }
            int iM17226h = iM17220b2 + CodedOutputByteBufferNano.m17226h(78, conversation.enterTimes) + CodedOutputByteBufferNano.m17222d(79, conversation.updatedTime) + CodedOutputByteBufferNano.m17220b(80, conversation.unmatchConversation) + CodedOutputByteBufferNano.m17228j(81, conversation.remainedTime) + CodedOutputByteBufferNano.m17222d(82, conversation.localSafetyReminderTime) + CodedOutputByteBufferNano.m17222d(83, conversation.localSpoofingReminderTime) + CodedOutputByteBufferNano.m17220b(84, conversation.forceSend) + CodedOutputByteBufferNano.m17226h(85, conversation.conversationUserDistance) + CodedOutputByteBufferNano.m17222d(86, conversation.conversationUserUpdatedTime) + CodedOutputByteBufferNano.m17226h(87, conversation.level);
            ConversationAdditional conversationAdditional = conversation.additional;
            if (conversationAdditional != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(88, conversationAdditional, ConversationAdditional.PROTOBUF_ADAPTER);
            }
            String str8 = conversation.convType;
            if (str8 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(89, str8);
            }
            ConversationProperty conversationProperty = conversation.property;
            if (conversationProperty != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(90, conversationProperty, ConversationProperty.PROTOBUF_ADAPTER);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(91, conversation.userMessageCount) + CodedOutputByteBufferNano.m17222d(92, conversation.latestFriendCommentCreatedTime);
            FriendHeatScore friendHeatScore = conversation.heat;
            if (friendHeatScore != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(93, friendHeatScore, FriendHeatScore.PROTOBUF_ADAPTER);
            }
            List<LocalBusinessType> list2 = conversation.localBusinessTypes;
            if (list2 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(94, LocalBusinessType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b3 = iM17226h2 + CodedOutputByteBufferNano.m17220b(95, conversation.localGreetDelete) + CodedOutputByteBufferNano.m17222d(96, conversation.suggestionScore) + CodedOutputByteBufferNano.m17226h(97, conversation.localBotherStatus) + CodedOutputByteBufferNano.m17220b(98, conversation.muted);
            ConversationGroupProperty conversationGroupProperty = conversation.group;
            if (conversationGroupProperty != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(99, conversationGroupProperty, ConversationGroupProperty.PROTOBUF_ADAPTER);
            }
            String str9 = conversation.localDraft;
            if (str9 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(100, str9);
            }
            List<Picture> list3 = conversation.localChatBg;
            if (list3 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(101, list3, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LocalPlaceBan localPlaceBan = conversation.localPlaceBan;
            if (localPlaceBan != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17226h(102, localPlaceBan.ordinal());
            }
            String str10 = conversation.localMessageInsertReportHint;
            if (str10 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(103, str10);
            }
            String str11 = conversation.localNotifyMomentId;
            if (str11 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(104, str11);
            }
            String str12 = conversation.localInsertedMomentId;
            if (str12 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(105, str12);
            }
            int iM17226h3 = iM17220b3 + CodedOutputByteBufferNano.m17226h(106, conversation.f20374mm);
            MatchFrom matchFrom2 = conversation.localMatchFrom;
            if (matchFrom2 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(107, matchFrom2, MatchFrom.PROTOBUF_ADAPTER);
            }
            NotificationStatus notificationStatus2 = conversation.localNotificationStatus;
            if (notificationStatus2 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(108, notificationStatus2, NotificationStatus.PROTOBUF_ADAPTER);
            }
            StickStatus stickStatus2 = conversation.importance;
            if (stickStatus2 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(109, stickStatus2, StickStatus.PROTOBUF_ADAPTER);
            }
            ConversationStatus conversationStatus2 = conversation.status;
            if (conversationStatus2 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(110, conversationStatus2, ConversationStatus.PROTOBUF_ADAPTER);
            }
            ConversationType conversationType2 = conversation.subtype;
            if (conversationType2 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(111, conversationType2, ConversationType.PROTOBUF_ADAPTER);
            }
            List<LocalBusinessType> list4 = conversation.localBusinessTypes;
            if (list4 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(112, list4, LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LocalPlaceBan localPlaceBan2 = conversation.localPlaceBan;
            if (localPlaceBan2 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(113, localPlaceBan2, LocalPlaceBan.PROTOBUF_ADAPTER);
            }
            int iM17226h4 = iM17226h3 + CodedOutputByteBufferNano.m17226h(114, conversation.intimacy) + CodedOutputByteBufferNano.m17226h(115, conversation.quickChatProgress) + CodedOutputByteBufferNano.m17220b(116, conversation.hasLocalBreakIce) + CodedOutputByteBufferNano.m17222d(117, conversation.localSpoofingNewTime) + CodedOutputByteBufferNano.m17222d(118, conversation.clearedTime);
            String str13 = conversation.localExtraInfo;
            if (str13 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17233o(119, str13);
            }
            int iM17222d5 = iM17226h4 + CodedOutputByteBufferNano.m17222d(120, conversation.lastActivityTime);
            String str14 = conversation.otherStatus;
            if (str14 != null) {
                iM17222d5 += CodedOutputByteBufferNano.m17233o(121, str14);
            }
            int iM17220b4 = iM17222d5 + CodedOutputByteBufferNano.m17220b(122, conversation.isFake) + CodedOutputByteBufferNano.m17226h(123, conversation.localIsLimitedTrialSee);
            conversation.cachedSize = iM17220b4;
            return iM17220b4;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Conversation parse(nb5 nb5Var) throws IOException {
            Conversation conversation = new Conversation();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            Integer numValueOf4 = null;
            Integer numValueOf5 = null;
            List list = null;
            Integer numValueOf6 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (conversation.localMatchFrom == null && numValueOf != null) {
                            conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (conversation.localNotificationStatus == null && numValueOf2 != null) {
                            conversation.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (conversation.importance == null && numValueOf3 != null) {
                            conversation.importance = (StickStatus) StickStatus.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (conversation.status == null && numValueOf4 != null) {
                            conversation.status = (ConversationStatus) ConversationStatus.JSON_ADAPTER.newTEnum(null, numValueOf4.intValue());
                        }
                        if (conversation.subtype == null && numValueOf5 != null) {
                            conversation.subtype = (ConversationType) ConversationType.JSON_ADAPTER.newTEnum(null, numValueOf5.intValue());
                        }
                        if (conversation.localBusinessTypes == null && list != null) {
                            conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list);
                        }
                        if (conversation.localPlaceBan == null && numValueOf6 != null) {
                            conversation.localPlaceBan = (LocalPlaceBan) LocalPlaceBan.JSON_ADAPTER.newTEnum(null, numValueOf6.intValue());
                        }
                        if (conversation.read == null) {
                            conversation.read = Boolean.FALSE;
                        }
                        if (conversation.otherUser == null) {
                            conversation.otherUser = "";
                        }
                        if (conversation.localNotificationStatus == null) {
                            conversation.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.importance == null) {
                            conversation.importance = (StickStatus) StickStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.status == null) {
                            conversation.status = (ConversationStatus) ConversationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.subtype == null) {
                            conversation.subtype = (ConversationType) ConversationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.myTalk == null) {
                            conversation.myTalk = TalkInfo.new_();
                        }
                        if (conversation.otherTalk == null) {
                            conversation.otherTalk = TalkInfo.new_();
                        }
                        if (conversation.additional == null) {
                            conversation.additional = ConversationAdditional.new_();
                        }
                        if (conversation.convType == null) {
                            conversation.convType = "";
                        }
                        if (conversation.property == null) {
                            conversation.property = ConversationProperty.new_();
                        }
                        if (conversation.heat == null) {
                            conversation.heat = FriendHeatScore.new_();
                        }
                        if (conversation.localBusinessTypes == null) {
                            conversation.localBusinessTypes = new ArrayList();
                        }
                        if (conversation.group == null) {
                            conversation.group = ConversationGroupProperty.new_();
                        }
                        if (conversation.localPlaceBan == null) {
                            conversation.localPlaceBan = (LocalPlaceBan) LocalPlaceBan.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.localNotifyMomentId == null) {
                            conversation.localNotifyMomentId = "";
                        }
                        if (conversation.localInsertedMomentId == null) {
                            conversation.localInsertedMomentId = "";
                        }
                        if (conversation.otherStatus == null) {
                            conversation.otherStatus = "";
                        }
                        break;
                    case 8:
                        conversation._id = nb5Var.m158742k();
                        continue;
                    case 18:
                        conversation.f56011id = nb5Var.m158750s();
                        continue;
                    case HttpStatus.REQUEST_TIMEOUT_408 /* 408 */:
                        conversation.localHasMessage = nb5Var.m158738g();
                        continue;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        conversation.read = Boolean.valueOf(nb5Var.m158738g());
                        continue;
                    case 426:
                        conversation.otherUser = nb5Var.m158750s();
                        continue;
                    case 434:
                        conversation.readUntil = nb5Var.m158750s();
                        continue;
                    case 441:
                        conversation.latestTime = nb5Var.m158739h();
                        continue;
                    case 449:
                        conversation.createdTime = nb5Var.m158739h();
                        continue;
                    case 456:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 464:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 473:
                        conversation.localBotheringTime = nb5Var.m158739h();
                        continue;
                    case 482:
                        conversation.scenarios = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 489:
                        conversation.localActiveTime = nb5Var.m158739h();
                        continue;
                    case 496:
                        conversation.unreadMessages = nb5Var.m158741j();
                        continue;
                    case HttpStatus.GATEWAY_TIMEOUT_504 /* 504 */:
                        conversation.localEverHasMessage = nb5Var.m158738g();
                        continue;
                    case 514:
                        conversation.reminder = (Reminder) nb5Var.m158743l(Reminder.PROTOBUF_ADAPTER);
                        continue;
                    case 521:
                        conversation.localUserUpdatedTime = nb5Var.m158739h();
                        continue;
                    case 528:
                        numValueOf3 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 538:
                        conversation.localOnlineTabClick = nb5Var.m158750s();
                        continue;
                    case 544:
                        conversation.follow = nb5Var.m158738g();
                        continue;
                    case 553:
                        conversation.localBotherWxTime = nb5Var.m158739h();
                        continue;
                    case 561:
                        conversation.localBotherCodeTime = nb5Var.m158739h();
                        continue;
                    case 570:
                        conversation.clearedUntil = nb5Var.m158750s();
                        continue;
                    case 576:
                        numValueOf4 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 586:
                        conversation.place = nb5Var.m158750s();
                        continue;
                    case 592:
                        numValueOf5 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 602:
                        conversation.myTalk = (TalkInfo) nb5Var.m158743l(TalkInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 610:
                        conversation.otherTalk = (TalkInfo) nb5Var.m158743l(TalkInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 618:
                        conversation.otherReadUntil = nb5Var.m158750s();
                        continue;
                    case 624:
                        conversation.enterTimes = nb5Var.m158741j();
                        continue;
                    case 633:
                        conversation.updatedTime = nb5Var.m158739h();
                        continue;
                    case 640:
                        conversation.unmatchConversation = nb5Var.m158738g();
                        continue;
                    case 648:
                        conversation.remainedTime = nb5Var.m158742k();
                        continue;
                    case 657:
                        conversation.localSafetyReminderTime = nb5Var.m158739h();
                        continue;
                    case 665:
                        conversation.localSpoofingReminderTime = nb5Var.m158739h();
                        continue;
                    case 672:
                        conversation.forceSend = nb5Var.m158738g();
                        continue;
                    case 680:
                        conversation.conversationUserDistance = nb5Var.m158741j();
                        continue;
                    case 689:
                        conversation.conversationUserUpdatedTime = nb5Var.m158739h();
                        continue;
                    case 696:
                        conversation.level = nb5Var.m158741j();
                        continue;
                    case 706:
                        conversation.additional = (ConversationAdditional) nb5Var.m158743l(ConversationAdditional.PROTOBUF_ADAPTER);
                        continue;
                    case Constants.AUDIO_MIXING_STATE_FAILED /* 714 */:
                        conversation.convType = nb5Var.m158750s();
                        continue;
                    case 722:
                        conversation.property = (ConversationProperty) nb5Var.m158743l(ConversationProperty.PROTOBUF_ADAPTER);
                        continue;
                    case 728:
                        conversation.userMessageCount = nb5Var.m158741j();
                        continue;
                    case 737:
                        conversation.latestFriendCommentCreatedTime = nb5Var.m158739h();
                        continue;
                    case 746:
                        conversation.heat = (FriendHeatScore) nb5Var.m158743l(FriendHeatScore.PROTOBUF_ADAPTER);
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_AR_GIFT /* 754 */:
                        list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 760:
                        conversation.localGreetDelete = nb5Var.m158738g();
                        continue;
                    case 769:
                        conversation.suggestionScore = nb5Var.m158739h();
                        continue;
                    case 776:
                        conversation.localBotherStatus = nb5Var.m158741j();
                        continue;
                    case 784:
                        conversation.muted = nb5Var.m158738g();
                        continue;
                    case 794:
                        conversation.group = (ConversationGroupProperty) nb5Var.m158743l(ConversationGroupProperty.PROTOBUF_ADAPTER);
                        continue;
                    case 802:
                        conversation.localDraft = nb5Var.m158750s();
                        continue;
                    case Constants.RHYTHM_PLAYER_STATE_IDLE /* 810 */:
                        conversation.localChatBg = (List) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 816:
                        numValueOf6 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 826:
                        conversation.localMessageInsertReportHint = nb5Var.m158750s();
                        continue;
                    case 834:
                        conversation.localNotifyMomentId = nb5Var.m158750s();
                        continue;
                    case 842:
                        conversation.localInsertedMomentId = nb5Var.m158750s();
                        continue;
                    case 848:
                        conversation.f20374mm = nb5Var.m158741j();
                        continue;
                    case 858:
                        conversation.localMatchFrom = (MatchFrom) nb5Var.m158743l(MatchFrom.PROTOBUF_ADAPTER);
                        continue;
                    case 866:
                        conversation.localNotificationStatus = (NotificationStatus) nb5Var.m158743l(NotificationStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 874:
                        conversation.importance = (StickStatus) nb5Var.m158743l(StickStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 882:
                        conversation.status = (ConversationStatus) nb5Var.m158743l(ConversationStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 890:
                        conversation.subtype = (ConversationType) nb5Var.m158743l(ConversationType.PROTOBUF_ADAPTER);
                        continue;
                    case 898:
                        conversation.localBusinessTypes = (List) nb5Var.m158743l(LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case IMediaPlayer.MEDIA_INFO_V_DELAY /* 906 */:
                        conversation.localPlaceBan = (LocalPlaceBan) nb5Var.m158743l(LocalPlaceBan.PROTOBUF_ADAPTER);
                        continue;
                    case 912:
                        conversation.intimacy = nb5Var.m158741j();
                        continue;
                    case 920:
                        conversation.quickChatProgress = nb5Var.m158741j();
                        continue;
                    case 928:
                        conversation.hasLocalBreakIce = nb5Var.m158738g();
                        continue;
                    case 937:
                        conversation.localSpoofingNewTime = nb5Var.m158739h();
                        continue;
                    case 945:
                        conversation.clearedTime = nb5Var.m158739h();
                        continue;
                    case 954:
                        conversation.localExtraInfo = nb5Var.m158750s();
                        continue;
                    case 961:
                        conversation.lastActivityTime = nb5Var.m158739h();
                        continue;
                    case 970:
                        conversation.otherStatus = nb5Var.m158750s();
                        continue;
                    case 976:
                        conversation.isFake = nb5Var.m158738g();
                        continue;
                    case 984:
                        conversation.localIsLimitedTrialSee = nb5Var.m158741j();
                        continue;
                    default:
                        if (conversation.localMatchFrom == null && numValueOf != null) {
                            conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (conversation.localNotificationStatus == null && numValueOf2 != null) {
                            conversation.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (conversation.importance == null && numValueOf3 != null) {
                            conversation.importance = (StickStatus) StickStatus.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (conversation.status == null && numValueOf4 != null) {
                            conversation.status = (ConversationStatus) ConversationStatus.JSON_ADAPTER.newTEnum(null, numValueOf4.intValue());
                        }
                        if (conversation.subtype == null && numValueOf5 != null) {
                            conversation.subtype = (ConversationType) ConversationType.JSON_ADAPTER.newTEnum(null, numValueOf5.intValue());
                        }
                        if (conversation.localBusinessTypes == null && list != null) {
                            conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list);
                        }
                        if (conversation.localPlaceBan == null && numValueOf6 != null) {
                            conversation.localPlaceBan = (LocalPlaceBan) LocalPlaceBan.JSON_ADAPTER.newTEnum(null, numValueOf6.intValue());
                        }
                        if (conversation.read == null) {
                            conversation.read = Boolean.FALSE;
                        }
                        if (conversation.otherUser == null) {
                            conversation.otherUser = "";
                        }
                        if (conversation.localNotificationStatus == null) {
                            conversation.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.importance == null) {
                            conversation.importance = (StickStatus) StickStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.status == null) {
                            conversation.status = (ConversationStatus) ConversationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.subtype == null) {
                            conversation.subtype = (ConversationType) ConversationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.myTalk == null) {
                            conversation.myTalk = TalkInfo.new_();
                        }
                        if (conversation.otherTalk == null) {
                            conversation.otherTalk = TalkInfo.new_();
                        }
                        if (conversation.additional == null) {
                            conversation.additional = ConversationAdditional.new_();
                        }
                        if (conversation.convType == null) {
                            conversation.convType = "";
                        }
                        if (conversation.property == null) {
                            conversation.property = ConversationProperty.new_();
                        }
                        if (conversation.heat == null) {
                            conversation.heat = FriendHeatScore.new_();
                        }
                        if (conversation.localBusinessTypes == null) {
                            conversation.localBusinessTypes = new ArrayList();
                        }
                        if (conversation.group == null) {
                            conversation.group = ConversationGroupProperty.new_();
                        }
                        if (conversation.localPlaceBan == null) {
                            conversation.localPlaceBan = (LocalPlaceBan) LocalPlaceBan.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversation.localNotifyMomentId == null) {
                            conversation.localNotifyMomentId = "";
                        }
                        if (conversation.localInsertedMomentId == null) {
                            conversation.localInsertedMomentId = "";
                        }
                        if (conversation.otherStatus == null) {
                            conversation.otherStatus = "";
                            return conversation;
                        }
                        break;
                }
            }
            return conversation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Conversation conversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, conversation._id);
            String str = conversation.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17244A(51, conversation.localHasMessage);
            Boolean bool = conversation.read;
            if (bool != null) {
                codedOutputByteBufferNano.m17244A(52, bool.booleanValue());
            }
            String str2 = conversation.otherUser;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(53, str2);
            }
            String str3 = conversation.readUntil;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(54, str3);
            }
            codedOutputByteBufferNano.m17246C(55, conversation.latestTime);
            codedOutputByteBufferNano.m17246C(56, conversation.createdTime);
            MatchFrom matchFrom = conversation.localMatchFrom;
            if (matchFrom != null) {
                codedOutputByteBufferNano.m17250G(57, matchFrom.ordinal());
            }
            NotificationStatus notificationStatus = conversation.localNotificationStatus;
            if (notificationStatus != null) {
                codedOutputByteBufferNano.m17250G(58, notificationStatus.ordinal());
            }
            codedOutputByteBufferNano.m17246C(59, conversation.localBotheringTime);
            List<String> list = conversation.scenarios;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(60, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17246C(61, conversation.localActiveTime);
            codedOutputByteBufferNano.m17250G(62, conversation.unreadMessages);
            codedOutputByteBufferNano.m17244A(63, conversation.localEverHasMessage);
            Reminder reminder = conversation.reminder;
            if (reminder != null) {
                codedOutputByteBufferNano.m17254K(64, reminder, Reminder.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17246C(65, conversation.localUserUpdatedTime);
            StickStatus stickStatus = conversation.importance;
            if (stickStatus != null) {
                codedOutputByteBufferNano.m17250G(66, stickStatus.ordinal());
            }
            String str4 = conversation.localOnlineTabClick;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(67, str4);
            }
            codedOutputByteBufferNano.m17244A(68, conversation.follow);
            codedOutputByteBufferNano.m17246C(69, conversation.localBotherWxTime);
            codedOutputByteBufferNano.m17246C(70, conversation.localBotherCodeTime);
            String str5 = conversation.clearedUntil;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(71, str5);
            }
            ConversationStatus conversationStatus = conversation.status;
            if (conversationStatus != null) {
                codedOutputByteBufferNano.m17250G(72, conversationStatus.ordinal());
            }
            String str6 = conversation.place;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(73, str6);
            }
            ConversationType conversationType = conversation.subtype;
            if (conversationType != null) {
                codedOutputByteBufferNano.m17250G(74, conversationType.ordinal());
            }
            TalkInfo talkInfo = conversation.myTalk;
            if (talkInfo != null) {
                codedOutputByteBufferNano.m17254K(75, talkInfo, TalkInfo.PROTOBUF_ADAPTER);
            }
            TalkInfo talkInfo2 = conversation.otherTalk;
            if (talkInfo2 != null) {
                codedOutputByteBufferNano.m17254K(76, talkInfo2, TalkInfo.PROTOBUF_ADAPTER);
            }
            String str7 = conversation.otherReadUntil;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(77, str7);
            }
            codedOutputByteBufferNano.m17250G(78, conversation.enterTimes);
            codedOutputByteBufferNano.m17246C(79, conversation.updatedTime);
            codedOutputByteBufferNano.m17244A(80, conversation.unmatchConversation);
            codedOutputByteBufferNano.m17252I(81, conversation.remainedTime);
            codedOutputByteBufferNano.m17246C(82, conversation.localSafetyReminderTime);
            codedOutputByteBufferNano.m17246C(83, conversation.localSpoofingReminderTime);
            codedOutputByteBufferNano.m17244A(84, conversation.forceSend);
            codedOutputByteBufferNano.m17250G(85, conversation.conversationUserDistance);
            codedOutputByteBufferNano.m17246C(86, conversation.conversationUserUpdatedTime);
            codedOutputByteBufferNano.m17250G(87, conversation.level);
            ConversationAdditional conversationAdditional = conversation.additional;
            if (conversationAdditional != null) {
                codedOutputByteBufferNano.m17254K(88, conversationAdditional, ConversationAdditional.PROTOBUF_ADAPTER);
            }
            String str8 = conversation.convType;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(89, str8);
            }
            ConversationProperty conversationProperty = conversation.property;
            if (conversationProperty != null) {
                codedOutputByteBufferNano.m17254K(90, conversationProperty, ConversationProperty.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(91, conversation.userMessageCount);
            codedOutputByteBufferNano.m17246C(92, conversation.latestFriendCommentCreatedTime);
            FriendHeatScore friendHeatScore = conversation.heat;
            if (friendHeatScore != null) {
                codedOutputByteBufferNano.m17254K(93, friendHeatScore, FriendHeatScore.PROTOBUF_ADAPTER);
            }
            List<LocalBusinessType> list2 = conversation.localBusinessTypes;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(94, LocalBusinessType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(95, conversation.localGreetDelete);
            codedOutputByteBufferNano.m17246C(96, conversation.suggestionScore);
            codedOutputByteBufferNano.m17250G(97, conversation.localBotherStatus);
            codedOutputByteBufferNano.m17244A(98, conversation.muted);
            ConversationGroupProperty conversationGroupProperty = conversation.group;
            if (conversationGroupProperty != null) {
                codedOutputByteBufferNano.m17254K(99, conversationGroupProperty, ConversationGroupProperty.PROTOBUF_ADAPTER);
            }
            String str9 = conversation.localDraft;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(100, str9);
            }
            List<Picture> list3 = conversation.localChatBg;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(101, list3, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LocalPlaceBan localPlaceBan = conversation.localPlaceBan;
            if (localPlaceBan != null) {
                codedOutputByteBufferNano.m17250G(102, localPlaceBan.ordinal());
            }
            String str10 = conversation.localMessageInsertReportHint;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(103, str10);
            }
            String str11 = conversation.localNotifyMomentId;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(104, str11);
            }
            String str12 = conversation.localInsertedMomentId;
            if (str12 != null) {
                codedOutputByteBufferNano.m17261R(105, str12);
            }
            codedOutputByteBufferNano.m17250G(106, conversation.f20374mm);
            MatchFrom matchFrom2 = conversation.localMatchFrom;
            if (matchFrom2 != null) {
                codedOutputByteBufferNano.m17254K(107, matchFrom2, MatchFrom.PROTOBUF_ADAPTER);
            }
            NotificationStatus notificationStatus2 = conversation.localNotificationStatus;
            if (notificationStatus2 != null) {
                codedOutputByteBufferNano.m17254K(108, notificationStatus2, NotificationStatus.PROTOBUF_ADAPTER);
            }
            StickStatus stickStatus2 = conversation.importance;
            if (stickStatus2 != null) {
                codedOutputByteBufferNano.m17254K(109, stickStatus2, StickStatus.PROTOBUF_ADAPTER);
            }
            ConversationStatus conversationStatus2 = conversation.status;
            if (conversationStatus2 != null) {
                codedOutputByteBufferNano.m17254K(110, conversationStatus2, ConversationStatus.PROTOBUF_ADAPTER);
            }
            ConversationType conversationType2 = conversation.subtype;
            if (conversationType2 != null) {
                codedOutputByteBufferNano.m17254K(111, conversationType2, ConversationType.PROTOBUF_ADAPTER);
            }
            List<LocalBusinessType> list4 = conversation.localBusinessTypes;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(112, list4, LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LocalPlaceBan localPlaceBan2 = conversation.localPlaceBan;
            if (localPlaceBan2 != null) {
                codedOutputByteBufferNano.m17254K(113, localPlaceBan2, LocalPlaceBan.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(114, conversation.intimacy);
            codedOutputByteBufferNano.m17250G(115, conversation.quickChatProgress);
            codedOutputByteBufferNano.m17244A(116, conversation.hasLocalBreakIce);
            codedOutputByteBufferNano.m17246C(117, conversation.localSpoofingNewTime);
            codedOutputByteBufferNano.m17246C(118, conversation.clearedTime);
            String str13 = conversation.localExtraInfo;
            if (str13 != null) {
                codedOutputByteBufferNano.m17261R(119, str13);
            }
            codedOutputByteBufferNano.m17246C(120, conversation.lastActivityTime);
            String str14 = conversation.otherStatus;
            if (str14 != null) {
                codedOutputByteBufferNano.m17261R(121, str14);
            }
            codedOutputByteBufferNano.m17244A(122, conversation.isFake);
            codedOutputByteBufferNano.m17250G(123, conversation.localIsLimitedTrialSee);
        }
    };
    public static JsonAdapter<Conversation> JSON_ADAPTER = new ObjectJsonAdapter<Conversation>() { // from class: com.p1.mobile.putong.core.data.Conversation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Conversation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Conversation newInstance() {
            return new Conversation();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Conversation conversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2085931853:
                    if (str.equals("userMessageCount")) {
                        b = 0;
                    }
                    break;
                case -1945886756:
                    if (str.equals("otherTalk")) {
                        b = 1;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 2;
                    }
                    break;
                case -1931413465:
                    if (str.equals("additional")) {
                        b = 3;
                    }
                    break;
                case -1867567750:
                    if (str.equals("subtype")) {
                        b = 4;
                    }
                    break;
                case -1697796318:
                    if (str.equals("otherStatus")) {
                        b = 5;
                    }
                    break;
                case -1661065490:
                    if (str.equals("suggestionScore")) {
                        b = 6;
                    }
                    break;
                case -1634148302:
                    if (str.equals("quickChatProgress")) {
                        b = 7;
                    }
                    break;
                case -1268958287:
                    if (str.equals("follow")) {
                        b = 8;
                    }
                    break;
                case -1180519521:
                    if (str.equals("isFake")) {
                        b = 9;
                    }
                    break;
                case -1122843800:
                    if (str.equals("readUntil")) {
                        b = 10;
                    }
                    break;
                case -1085836135:
                    if (str.equals("clearedTime")) {
                        b = 11;
                    }
                    break;
                case -1060044680:
                    if (str.equals("myTalk")) {
                        b = 12;
                    }
                    break;
                case -993141291:
                    if (str.equals("property")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 14;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 15;
                    }
                    break;
                case -567781832:
                    if (str.equals("otherReadUntil")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -565970802:
                    if (str.equals("convType")) {
                        b = 17;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 18;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 19;
                    }
                    break;
                case -124830988:
                    if (str.equals("latestTime")) {
                        b = 20;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 21;
                    }
                    break;
                case 3488:
                    if (str.equals("mm")) {
                        b = 22;
                    }
                    break;
                case 3198448:
                    if (str.equals("heat")) {
                        b = 23;
                    }
                    break;
                case 3496342:
                    if (str.equals("read")) {
                        b = 24;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 25;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 26;
                    }
                    break;
                case 104264043:
                    if (str.equals("muted")) {
                        b = 27;
                    }
                    break;
                case 106748167:
                    if (str.equals("place")) {
                        b = 28;
                    }
                    break;
                case 151412616:
                    if (str.equals("localNotificationStatus")) {
                        b = 29;
                    }
                    break;
                case 563841634:
                    if (str.equals("localIsLimitedTrialSee")) {
                        b = 30;
                    }
                    break;
                case 573943396:
                    if (str.equals("intimacy")) {
                        b = 31;
                    }
                    break;
                case 699897618:
                    if (str.equals("clearedUntil")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1155447323:
                    if (str.equals("unreadMessages")) {
                        b = 33;
                    }
                    break;
                case 1397732954:
                    if (str.equals("conversationUserUpdatedTime")) {
                        b = 34;
                    }
                    break;
                case 1621977227:
                    if (str.equals("localBotherStatus")) {
                        b = 35;
                    }
                    break;
                case 1691659640:
                    if (str.equals("remainedTime")) {
                        b = 36;
                    }
                    break;
                case 1726545635:
                    if (str.equals("scenarios")) {
                        b = 37;
                    }
                    break;
                case 1895945179:
                    if (str.equals("latestFriendCommentCreatedTime")) {
                        b = 38;
                    }
                    break;
                case 1903911279:
                    if (str.equals("unmatchConversation")) {
                        b = 39;
                    }
                    break;
                case 2088199427:
                    if (str.equals("conversationUserDistance")) {
                        b = 40;
                    }
                    break;
                case 2125650548:
                    if (str.equals("importance")) {
                        b = 41;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    conversation.userMessageCount = jsonParser.getValueAsInt();
                    return true;
                case 1:
                    conversation.otherTalk = TalkInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    conversation.otherUser = Converter.GROUP_ID.parse(jsonParser, str2);
                    return true;
                case 3:
                    conversation.additional = ConversationAdditional.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    conversation.subtype = ConversationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 5:
                    conversation.otherStatus = jsonParser.getValueAsString();
                    return true;
                case 6:
                    conversation.suggestionScore = jsonParser.getValueAsDouble();
                    return true;
                case 7:
                    conversation.quickChatProgress = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    conversation.follow = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    conversation.isFake = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    conversation.readUntil = jsonParser.getValueAsString();
                    return true;
                case 11:
                    conversation.clearedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 12:
                    conversation.myTalk = TalkInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    conversation.property = ConversationProperty.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    conversation.status = ConversationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 15:
                    conversation.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 16:
                    conversation.otherReadUntil = jsonParser.getValueAsString();
                    return true;
                case 17:
                    conversation.convType = jsonParser.getValueAsString();
                    return true;
                case 18:
                    conversation.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 19:
                    conversation.api_only_messages = PartialIdList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    conversation.latestTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 21:
                    conversation.f56011id = jsonParser.getValueAsString();
                    return false;
                case 22:
                    conversation.f20374mm = jsonParser.getValueAsInt();
                    return true;
                case 23:
                    conversation.heat = FriendHeatScore.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    conversation.read = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case 25:
                    conversation.group = ConversationGroupProperty.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    conversation.level = jsonParser.getValueAsInt();
                    return true;
                case 27:
                    conversation.muted = jsonParser.getValueAsBoolean();
                    return true;
                case 28:
                    conversation.place = jsonParser.getValueAsString();
                    return true;
                case 29:
                    conversation.localNotificationStatus = NotificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 30:
                    conversation.localIsLimitedTrialSee = jsonParser.getValueAsInt();
                    return true;
                case 31:
                    conversation.intimacy = jsonParser.getValueAsInt();
                    return true;
                case 32:
                    conversation.clearedUntil = jsonParser.getValueAsString();
                    return true;
                case 33:
                    conversation.unreadMessages = jsonParser.getValueAsInt();
                    return true;
                case 34:
                    conversation.conversationUserUpdatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 35:
                    conversation.localBotherStatus = jsonParser.getValueAsInt();
                    return true;
                case 36:
                    conversation.remainedTime = jsonParser.getValueAsLong();
                    return true;
                case 37:
                    conversation.scenarios = JsonAdapter.parseArray(jsonParser, Converter.SCENARIO_ID, str2, arrayList, dataChecker);
                    return true;
                case 38:
                    conversation.latestFriendCommentCreatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 39:
                    conversation.unmatchConversation = jsonParser.getValueAsBoolean();
                    return true;
                case 40:
                    conversation.conversationUserDistance = jsonParser.getValueAsInt();
                    return true;
                case 41:
                    conversation.importance = StickStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Conversation conversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2085931853:
                    if (str.equals("userMessageCount")) {
                        b = 0;
                    }
                    break;
                case -1945886756:
                    if (str.equals("otherTalk")) {
                        b = 1;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 2;
                    }
                    break;
                case -1931413465:
                    if (str.equals("additional")) {
                        b = 3;
                    }
                    break;
                case -1867567750:
                    if (str.equals("subtype")) {
                        b = 4;
                    }
                    break;
                case -1697796318:
                    if (str.equals("otherStatus")) {
                        b = 5;
                    }
                    break;
                case -1661065490:
                    if (str.equals("suggestionScore")) {
                        b = 6;
                    }
                    break;
                case -1634148302:
                    if (str.equals("quickChatProgress")) {
                        b = 7;
                    }
                    break;
                case -1268958287:
                    if (str.equals("follow")) {
                        b = 8;
                    }
                    break;
                case -1180519521:
                    if (str.equals("isFake")) {
                        b = 9;
                    }
                    break;
                case -1122843800:
                    if (str.equals("readUntil")) {
                        b = 10;
                    }
                    break;
                case -1085836135:
                    if (str.equals("clearedTime")) {
                        b = 11;
                    }
                    break;
                case -1060044680:
                    if (str.equals("myTalk")) {
                        b = 12;
                    }
                    break;
                case -993141291:
                    if (str.equals("property")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 14;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 15;
                    }
                    break;
                case -567781832:
                    if (str.equals("otherReadUntil")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -565970802:
                    if (str.equals("convType")) {
                        b = 17;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 18;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 19;
                    }
                    break;
                case -124830988:
                    if (str.equals("latestTime")) {
                        b = 20;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 21;
                    }
                    break;
                case 3488:
                    if (str.equals("mm")) {
                        b = 22;
                    }
                    break;
                case 3198448:
                    if (str.equals("heat")) {
                        b = 23;
                    }
                    break;
                case 3496342:
                    if (str.equals("read")) {
                        b = 24;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 25;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 26;
                    }
                    break;
                case 104264043:
                    if (str.equals("muted")) {
                        b = 27;
                    }
                    break;
                case 106748167:
                    if (str.equals("place")) {
                        b = 28;
                    }
                    break;
                case 151412616:
                    if (str.equals("localNotificationStatus")) {
                        b = 29;
                    }
                    break;
                case 563841634:
                    if (str.equals("localIsLimitedTrialSee")) {
                        b = 30;
                    }
                    break;
                case 573943396:
                    if (str.equals("intimacy")) {
                        b = 31;
                    }
                    break;
                case 699897618:
                    if (str.equals("clearedUntil")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1155447323:
                    if (str.equals("unreadMessages")) {
                        b = 33;
                    }
                    break;
                case 1397732954:
                    if (str.equals("conversationUserUpdatedTime")) {
                        b = 34;
                    }
                    break;
                case 1621977227:
                    if (str.equals("localBotherStatus")) {
                        b = 35;
                    }
                    break;
                case 1691659640:
                    if (str.equals("remainedTime")) {
                        b = 36;
                    }
                    break;
                case 1726545635:
                    if (str.equals("scenarios")) {
                        b = 37;
                    }
                    break;
                case 1895945179:
                    if (str.equals("latestFriendCommentCreatedTime")) {
                        b = 38;
                    }
                    break;
                case 1903911279:
                    if (str.equals("unmatchConversation")) {
                        b = 39;
                    }
                    break;
                case 2088199427:
                    if (str.equals("conversationUserDistance")) {
                        b = 40;
                    }
                    break;
                case 2125650548:
                    if (str.equals("importance")) {
                        b = 41;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    return true;
                case 21:
                    return false;
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    return true;
                default:
                    return super.parseFieldCheck(conversation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Conversation conversation, JsonGenerator jsonGenerator) throws IOException {
            String str = conversation.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (conversation.api_only_messages != null) {
                jsonGenerator.writeFieldName("messages");
                PartialIdList.JSON_ADAPTER.serialize(conversation.api_only_messages, jsonGenerator, true);
            }
            Boolean bool = conversation.read;
            if (bool != null) {
                jsonGenerator.writeBooleanField("read", bool.booleanValue());
            }
            if (conversation.otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                Converter.GROUP_ID.serialize(conversation.otherUser, jsonGenerator, true);
            }
            String str2 = conversation.readUntil;
            if (str2 != null) {
                jsonGenerator.writeStringField("readUntil", str2);
            }
            jsonGenerator.writeFieldName("latestTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(conversation.latestTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("createdTime");
            jsonAdapter.serialize(Double.valueOf(conversation.createdTime), jsonGenerator, true);
            if (conversation.localNotificationStatus != null) {
                jsonGenerator.writeFieldName("localNotificationStatus");
                NotificationStatus.JSON_ADAPTER.serialize(conversation.localNotificationStatus, jsonGenerator, true);
            }
            if (conversation.scenarios != null) {
                jsonGenerator.writeFieldName("scenarios");
                JsonAdapter.serializeArray(conversation.scenarios, jsonGenerator, Converter.SCENARIO_ID);
            }
            jsonGenerator.writeNumberField("unreadMessages", conversation.unreadMessages);
            if (conversation.importance != null) {
                jsonGenerator.writeFieldName("importance");
                StickStatus.JSON_ADAPTER.serialize(conversation.importance, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("follow", conversation.follow);
            String str3 = conversation.clearedUntil;
            if (str3 != null) {
                jsonGenerator.writeStringField("clearedUntil", str3);
            }
            if (conversation.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                ConversationStatus.JSON_ADAPTER.serialize(conversation.status, jsonGenerator, true);
            }
            String str4 = conversation.place;
            if (str4 != null) {
                jsonGenerator.writeStringField("place", str4);
            }
            if (conversation.subtype != null) {
                jsonGenerator.writeFieldName("subtype");
                ConversationType.JSON_ADAPTER.serialize(conversation.subtype, jsonGenerator, true);
            }
            if (conversation.myTalk != null) {
                jsonGenerator.writeFieldName("myTalk");
                TalkInfo.JSON_ADAPTER.serialize(conversation.myTalk, jsonGenerator, true);
            }
            if (conversation.otherTalk != null) {
                jsonGenerator.writeFieldName("otherTalk");
                TalkInfo.JSON_ADAPTER.serialize(conversation.otherTalk, jsonGenerator, true);
            }
            String str5 = conversation.otherReadUntil;
            if (str5 != null) {
                jsonGenerator.writeStringField("otherReadUntil", str5);
            }
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            jsonAdapter.serialize(Double.valueOf(conversation.updatedTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("unmatchConversation", conversation.unmatchConversation);
            jsonGenerator.writeNumberField("remainedTime", conversation.remainedTime);
            jsonGenerator.writeNumberField("conversationUserDistance", conversation.conversationUserDistance);
            jsonGenerator.writeFieldName("conversationUserUpdatedTime");
            jsonAdapter.serialize(Double.valueOf(conversation.conversationUserUpdatedTime), jsonGenerator, true);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, conversation.level);
            if (conversation.additional != null) {
                jsonGenerator.writeFieldName("additional");
                ConversationAdditional.JSON_ADAPTER.serialize(conversation.additional, jsonGenerator, true);
            }
            String str6 = conversation.convType;
            if (str6 != null) {
                jsonGenerator.writeStringField("convType", str6);
            }
            if (conversation.property != null) {
                jsonGenerator.writeFieldName("property");
                ConversationProperty.JSON_ADAPTER.serialize(conversation.property, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("userMessageCount", conversation.userMessageCount);
            jsonGenerator.writeFieldName("latestFriendCommentCreatedTime");
            jsonAdapter.serialize(Double.valueOf(conversation.latestFriendCommentCreatedTime), jsonGenerator, true);
            if (conversation.heat != null) {
                jsonGenerator.writeFieldName("heat");
                FriendHeatScore.JSON_ADAPTER.serialize(conversation.heat, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("suggestionScore", conversation.suggestionScore);
            jsonGenerator.writeNumberField("localBotherStatus", conversation.localBotherStatus);
            jsonGenerator.writeBooleanField("muted", conversation.muted);
            if (conversation.group != null) {
                jsonGenerator.writeFieldName("group");
                ConversationGroupProperty.JSON_ADAPTER.serialize(conversation.group, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("mm", conversation.f20374mm);
            jsonGenerator.writeNumberField("intimacy", conversation.intimacy);
            jsonGenerator.writeNumberField("quickChatProgress", conversation.quickChatProgress);
            jsonGenerator.writeFieldName("clearedTime");
            jsonAdapter.serialize(Double.valueOf(conversation.clearedTime), jsonGenerator, true);
            String str7 = conversation.otherStatus;
            if (str7 != null) {
                jsonGenerator.writeStringField("otherStatus", str7);
            }
            jsonGenerator.writeBooleanField("isFake", conversation.isFake);
            jsonGenerator.writeNumberField("localIsLimitedTrialSee", conversation.localIsLimitedTrialSee);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Conversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Conversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Conversation> _ID = new LongColumn<Conversation>("_id") { // from class: com.p1.mobile.putong.core.data.Conversation.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Conversation conversation) {
            return Long.valueOf(conversation._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Long l2) {
            conversation._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Conversation> f20372ID = new StringColumn<Conversation>("id_c") { // from class: com.p1.mobile.putong.core.data.Conversation.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.f56011id = str;
        }
    };
    public static final BooleanColumn<Conversation> LOCALHASMESSAGE = new BooleanColumn<Conversation>("localHasMessage_c") { // from class: com.p1.mobile.putong.core.data.Conversation.5
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.localHasMessage);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.localHasMessage = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Conversation> READ = new BooleanColumn<Conversation>("read_c") { // from class: com.p1.mobile.putong.core.data.Conversation.6
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return conversation.read;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.read = bool;
        }
    };
    public static final StringColumn<Conversation> OTHERUSER = new StringColumn<Conversation>("otherUser_c") { // from class: com.p1.mobile.putong.core.data.Conversation.7
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.otherUser;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.otherUser = str;
        }
    };
    public static final StringColumn<Conversation> READUNTIL = new StringColumn<Conversation>("readUntil_c") { // from class: com.p1.mobile.putong.core.data.Conversation.8
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.readUntil;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.readUntil = str;
        }
    };
    public static final DoubleColumn<Conversation> LATESTTIME = new DoubleColumn<Conversation>("latestTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.9
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.latestTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.latestTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<Conversation> CREATEDTIME = new DoubleColumn<Conversation>("createdTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.10
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.createdTime = d.doubleValue();
        }
    };
    public static final TEnumColumn<Conversation, MatchFrom> LOCALMATCHFROM = new TEnumColumn<Conversation, MatchFrom>("str_localMatchFrom_c", "localMatchFrom_c", MatchFrom.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Conversation.11
        @Override // com.tantanapp.common.data.orm.Column
        public MatchFrom get(Conversation conversation) {
            return conversation.localMatchFrom;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Conversation conversation, MatchFrom matchFrom) {
            conversation.localMatchFrom = matchFrom;
        }
    };
    public static final TEnumColumn<Conversation, NotificationStatus> LOCALNOTIFICATIONSTATUS = new TEnumColumn<Conversation, NotificationStatus>("str_localNotificationStatus_c", "localNotificationStatus_c", NotificationStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Conversation.12
        @Override // com.tantanapp.common.data.orm.Column
        public NotificationStatus get(Conversation conversation) {
            return conversation.localNotificationStatus;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Conversation conversation, NotificationStatus notificationStatus) {
            conversation.localNotificationStatus = notificationStatus;
        }
    };
    public static final DoubleColumn<Conversation> LOCALBOTHERINGTIME = new DoubleColumn<Conversation>("localBotheringTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.13
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localBotheringTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localBotheringTime = d.doubleValue();
        }
    };
    public static final Column<Conversation, List<String>> SCENARIOS = new Column<Conversation, List<String>>("scenarios_c") { // from class: com.p1.mobile.putong.core.data.Conversation.14
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Conversation conversation) {
            return conversation.scenarios;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, List<String> list) {
            conversation.scenarios = list;
        }
    };
    public static final DoubleColumn<Conversation> LOCALACTIVETIME = new DoubleColumn<Conversation>("localActiveTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.15
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localActiveTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localActiveTime = d.doubleValue();
        }
    };
    public static final IntegerColumn<Conversation> UNREADMESSAGES = new IntegerColumn<Conversation>("unreadMessages_c") { // from class: com.p1.mobile.putong.core.data.Conversation.16
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.unreadMessages);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.unreadMessages = num.intValue();
        }
    };
    public static final BooleanColumn<Conversation> LOCALEVERHASMESSAGE = new BooleanColumn<Conversation>("localEverHasMessage_c") { // from class: com.p1.mobile.putong.core.data.Conversation.17
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.localEverHasMessage);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.localEverHasMessage = bool.booleanValue();
        }
    };
    public static final Column<Conversation, Reminder> REMINDER = new Column<Conversation, Reminder>("reminder_c") { // from class: com.p1.mobile.putong.core.data.Conversation.18
        @Override // com.tantanapp.common.data.orm.Column
        public Reminder get(Conversation conversation) {
            return conversation.reminder;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Reminder reminder) {
            conversation.reminder = reminder;
        }
    };
    public static final DoubleColumn<Conversation> LOCALUSERUPDATEDTIME = new DoubleColumn<Conversation>("localUserUpdatedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.19
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localUserUpdatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localUserUpdatedTime = d.doubleValue();
        }
    };
    public static final TEnumColumn<Conversation, StickStatus> IMPORTANCE = new TEnumColumn<Conversation, StickStatus>("str_importance_c", "importance_c", StickStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Conversation.20
        @Override // com.tantanapp.common.data.orm.Column
        public StickStatus get(Conversation conversation) {
            return conversation.importance;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Conversation conversation, StickStatus stickStatus) {
            conversation.importance = stickStatus;
        }
    };
    public static final StringColumn<Conversation> LOCALONLINETABCLICK = new StringColumn<Conversation>("localOnlineTabClick_c") { // from class: com.p1.mobile.putong.core.data.Conversation.21
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.localOnlineTabClick;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.localOnlineTabClick = str;
        }
    };
    public static final BooleanColumn<Conversation> FOLLOW = new BooleanColumn<Conversation>("follow_c") { // from class: com.p1.mobile.putong.core.data.Conversation.22
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.follow);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.follow = bool.booleanValue();
        }
    };
    public static final DoubleColumn<Conversation> LOCALBOTHERWXTIME = new DoubleColumn<Conversation>("localBotherWxTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.23
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localBotherWxTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localBotherWxTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<Conversation> LOCALBOTHERCODETIME = new DoubleColumn<Conversation>("localBotherCodeTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.24
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localBotherCodeTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localBotherCodeTime = d.doubleValue();
        }
    };
    public static final StringColumn<Conversation> CLEAREDUNTIL = new StringColumn<Conversation>("clearedUntil_c") { // from class: com.p1.mobile.putong.core.data.Conversation.25
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.clearedUntil;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.clearedUntil = str;
        }
    };
    public static final TEnumColumn<Conversation, ConversationStatus> STATUS = new TEnumColumn<Conversation, ConversationStatus>("str_status_c", "status_c", ConversationStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Conversation.26
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationStatus get(Conversation conversation) {
            return conversation.status;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Conversation conversation, ConversationStatus conversationStatus) {
            conversation.status = conversationStatus;
        }
    };
    public static final StringColumn<Conversation> PLACE = new StringColumn<Conversation>("place_c") { // from class: com.p1.mobile.putong.core.data.Conversation.27
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.place;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.place = str;
        }
    };
    public static final TEnumColumn<Conversation, ConversationType> SUBTYPE = new TEnumColumn<Conversation, ConversationType>("str_subtype_c", "subtype_c", ConversationType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Conversation.28
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationType get(Conversation conversation) {
            return conversation.subtype;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Conversation conversation, ConversationType conversationType) {
            conversation.subtype = conversationType;
        }
    };
    public static final Column<Conversation, TalkInfo> MYTALK = new Column<Conversation, TalkInfo>("myTalk_c") { // from class: com.p1.mobile.putong.core.data.Conversation.29
        @Override // com.tantanapp.common.data.orm.Column
        public TalkInfo get(Conversation conversation) {
            return conversation.myTalk;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, TalkInfo talkInfo) {
            conversation.myTalk = talkInfo;
        }
    };
    public static final Column<Conversation, TalkInfo> OTHERTALK = new Column<Conversation, TalkInfo>("otherTalk_c") { // from class: com.p1.mobile.putong.core.data.Conversation.30
        @Override // com.tantanapp.common.data.orm.Column
        public TalkInfo get(Conversation conversation) {
            return conversation.otherTalk;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, TalkInfo talkInfo) {
            conversation.otherTalk = talkInfo;
        }
    };
    public static final StringColumn<Conversation> OTHERREADUNTIL = new StringColumn<Conversation>("otherReadUntil_c") { // from class: com.p1.mobile.putong.core.data.Conversation.31
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.otherReadUntil;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.otherReadUntil = str;
        }
    };
    public static final IntegerColumn<Conversation> ENTERTIMES = new IntegerColumn<Conversation>("enterTimes_c") { // from class: com.p1.mobile.putong.core.data.Conversation.32
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.enterTimes);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.enterTimes = num.intValue();
        }
    };
    public static final DoubleColumn<Conversation> UPDATEDTIME = new DoubleColumn<Conversation>("updatedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.33
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.updatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.updatedTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<Conversation> UNMATCHCONVERSATION = new BooleanColumn<Conversation>("unmatchConversation_c") { // from class: com.p1.mobile.putong.core.data.Conversation.34
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.unmatchConversation);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.unmatchConversation = bool.booleanValue();
        }
    };
    public static final LongColumn<Conversation> REMAINEDTIME = new LongColumn<Conversation>("remainedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.35
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Conversation conversation) {
            return Long.valueOf(conversation.remainedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Long l2) {
            conversation.remainedTime = l2.longValue();
        }
    };
    public static final DoubleColumn<Conversation> LOCALSAFETYREMINDERTIME = new DoubleColumn<Conversation>("localSafetyReminderTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.36
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localSafetyReminderTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localSafetyReminderTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<Conversation> LOCALSPOOFINGREMINDERTIME = new DoubleColumn<Conversation>("localSpoofingReminderTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.37
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localSpoofingReminderTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localSpoofingReminderTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<Conversation> FORCESEND = new BooleanColumn<Conversation>("forceSend_c") { // from class: com.p1.mobile.putong.core.data.Conversation.38
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.forceSend);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.forceSend = bool.booleanValue();
        }
    };
    public static final IntegerColumn<Conversation> CONVERSATIONUSERDISTANCE = new IntegerColumn<Conversation>("conversationUserDistance_c") { // from class: com.p1.mobile.putong.core.data.Conversation.39
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.conversationUserDistance);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.conversationUserDistance = num.intValue();
        }
    };
    public static final DoubleColumn<Conversation> CONVERSATIONUSERUPDATEDTIME = new DoubleColumn<Conversation>("conversationUserUpdatedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.40
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.conversationUserUpdatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.conversationUserUpdatedTime = d.doubleValue();
        }
    };
    public static final IntegerColumn<Conversation> LEVEL = new IntegerColumn<Conversation>("level_c") { // from class: com.p1.mobile.putong.core.data.Conversation.41
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.level);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.level = num.intValue();
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_QUICKCHAT_AVATARBLURRED = new BooleanColumn<Conversation>("additional_quickChat_avatarBlurred_c") { // from class: com.p1.mobile.putong.core.data.Conversation.42
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.additional.quickChat.avatarBlurred);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.quickChat.avatarBlurred = bool.booleanValue();
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_VOICECALL_REJECTEDTIME = new StringColumn<Conversation>("additional_voiceCall_rejectedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.43
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.voiceCall.rejectedTime;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.voiceCall.rejectedTime = str;
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_VOICECALL_ACCEPTEDTIME = new StringColumn<Conversation>("additional_voiceCall_acceptedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.44
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.voiceCall.acceptedTime;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.voiceCall.acceptedTime = str;
        }
    };
    public static final LongColumn<Conversation> ADDITIONAL_TIMELIMITED_EXPIREDTIMESTAMP = new LongColumn<Conversation>("additional_timeLimited_expiredTimestamp_c") { // from class: com.p1.mobile.putong.core.data.Conversation.45
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Conversation conversation) {
            return Long.valueOf(conversation.additional.timeLimited.expiredTimestamp);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Long l2) {
            conversation.additional.timeLimited.expiredTimestamp = l2.longValue();
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_TIMELIMITED_PARTICIPATE = new StringColumn<Conversation>("additional_timeLimited_participate_c") { // from class: com.p1.mobile.putong.core.data.Conversation.46
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.timeLimited.participate;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.timeLimited.participate = str;
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_TIMELIMITED_ALLOWEXTENSION = new BooleanColumn<Conversation>("additional_timeLimited_allowExtension_c") { // from class: com.p1.mobile.putong.core.data.Conversation.47
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.additional.timeLimited.allowExtension);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.timeLimited.allowExtension = bool.booleanValue();
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_TIMELIMITED_EXTENSIONOPERATOR = new StringColumn<Conversation>("additional_timeLimited_extensionOperator_c") { // from class: com.p1.mobile.putong.core.data.Conversation.48
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.timeLimited.extensionOperator;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.timeLimited.extensionOperator = str;
        }
    };
    public static final StringColumn<Conversation> CONVTYPE = new StringColumn<Conversation>("convType_c") { // from class: com.p1.mobile.putong.core.data.Conversation.49
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.convType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.convType = str;
        }
    };
    public static final Column<Conversation, ConversationProperty> PROPERTY = new Column<Conversation, ConversationProperty>("property_c") { // from class: com.p1.mobile.putong.core.data.Conversation.50
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationProperty get(Conversation conversation) {
            return conversation.property;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConversationProperty conversationProperty) {
            conversation.property = conversationProperty;
        }
    };
    public static final IntegerColumn<Conversation> USERMESSAGECOUNT = new IntegerColumn<Conversation>("userMessageCount_c") { // from class: com.p1.mobile.putong.core.data.Conversation.51
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.userMessageCount);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.userMessageCount = num.intValue();
        }
    };
    public static final DoubleColumn<Conversation> LATESTFRIENDCOMMENTCREATEDTIME = new DoubleColumn<Conversation>("latestFriendCommentCreatedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.52
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.latestFriendCommentCreatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.latestFriendCommentCreatedTime = d.doubleValue();
        }
    };
    public static final IntegerColumn<Conversation> HEAT_ORDERSCORE = new IntegerColumn<Conversation>("heat_orderScore_c") { // from class: com.p1.mobile.putong.core.data.Conversation.53
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.heat.orderScore);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.heat.orderScore = num.intValue();
        }
    };
    public static final IntegerColumn<Conversation> HEAT_SHOWSCORE = new IntegerColumn<Conversation>("heat_showScore_c") { // from class: com.p1.mobile.putong.core.data.Conversation.54
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.heat.showScore);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.heat.showScore = num.intValue();
        }
    };
    public static final StringColumn<Conversation> HEAT_MARKS = new StringColumn<Conversation>("heat_marks_c") { // from class: com.p1.mobile.putong.core.data.Conversation.55
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.heat.marks;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.heat.marks = str;
        }
    };
    public static final IntegerColumn<Conversation> HEAT_MM = new IntegerColumn<Conversation>("heat_mm_c") { // from class: com.p1.mobile.putong.core.data.Conversation.56
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.heat.f20394mm);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.heat.f20394mm = num.intValue();
        }
    };
    public static final IntegerColumn<Conversation> HEAT_SCORE = new IntegerColumn<Conversation>("heat_score_c") { // from class: com.p1.mobile.putong.core.data.Conversation.57
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.heat.score);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.heat.score = num.intValue();
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_ONESIDENOMATCH_SELFSEND = new BooleanColumn<Conversation>("additional_oneSideNoMatch_selfSend_c") { // from class: com.p1.mobile.putong.core.data.Conversation.58
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return conversation.additional.oneSideNoMatch.selfSend;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.oneSideNoMatch.selfSend = bool;
        }
    };
    public static final BooleanColumn<Conversation> LOCALGREETDELETE = new BooleanColumn<Conversation>("localGreetDelete_c") { // from class: com.p1.mobile.putong.core.data.Conversation.59
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.localGreetDelete);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.localGreetDelete = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_TIMELIMITED_HIDDEN = new BooleanColumn<Conversation>("additional_timeLimited_hidden_c") { // from class: com.p1.mobile.putong.core.data.Conversation.60
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.additional.timeLimited.hidden);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.timeLimited.hidden = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_TIMELIMITED_NEWCONVERSATION = new BooleanColumn<Conversation>("additional_timeLimited_newConversation_c") { // from class: com.p1.mobile.putong.core.data.Conversation.61
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.additional.timeLimited.newConversation);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.timeLimited.newConversation = bool.booleanValue();
        }
    };
    public static final LongColumn<Conversation> ADDITIONAL_TIMELIMITED_EXPIREDSECONDS = new LongColumn<Conversation>("additional_timeLimited_expiredSeconds_c") { // from class: com.p1.mobile.putong.core.data.Conversation.62
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Conversation conversation) {
            return Long.valueOf(conversation.additional.timeLimited.expiredSeconds);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Long l2) {
            conversation.additional.timeLimited.expiredSeconds = l2.longValue();
        }
    };
    public static final DoubleColumn<Conversation> SUGGESTIONSCORE = new DoubleColumn<Conversation>("suggestionScore_c") { // from class: com.p1.mobile.putong.core.data.Conversation.63
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.suggestionScore);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.suggestionScore = d.doubleValue();
        }
    };
    public static final IntegerColumn<Conversation> LOCALBOTHERSTATUS = new IntegerColumn<Conversation>("localBotherStatus_c") { // from class: com.p1.mobile.putong.core.data.Conversation.64
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.localBotherStatus);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.localBotherStatus = num.intValue();
        }
    };
    public static final BooleanColumn<Conversation> MUTED = new BooleanColumn<Conversation>("muted_c") { // from class: com.p1.mobile.putong.core.data.Conversation.65
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.muted);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.muted = bool.booleanValue();
        }
    };
    public static final StringColumn<Conversation> GROUP_LATESTNOTIFICATIONMSGID = new StringColumn<Conversation>("group_latestNotificationMsgId_c") { // from class: com.p1.mobile.putong.core.data.Conversation.66
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.group.latestNotificationMsgId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.group.latestNotificationMsgId = str;
        }
    };
    public static final DoubleColumn<Conversation> GROUP_JOINEDTIME = new DoubleColumn<Conversation>("group_joinedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.67
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.group.joinedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.group.joinedTime = d.doubleValue();
        }
    };
    public static final Column<Conversation, ConversationAdditionalOneSide> ADDITIONAL_ONESIDE = new Column<Conversation, ConversationAdditionalOneSide>("additional_oneSide_c") { // from class: com.p1.mobile.putong.core.data.Conversation.68
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationAdditionalOneSide get(Conversation conversation) {
            return conversation.additional.oneSide;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConversationAdditionalOneSide conversationAdditionalOneSide) {
            conversation.additional.oneSide = conversationAdditionalOneSide;
        }
    };
    public static final StringColumn<Conversation> LOCALDRAFT = new StringColumn<Conversation>("localDraft_c") { // from class: com.p1.mobile.putong.core.data.Conversation.69
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.localDraft;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.localDraft = str;
        }
    };
    public static final Column<Conversation, List<Picture>> LOCALCHATBG = new Column<Conversation, List<Picture>>("localChatBg_c") { // from class: com.p1.mobile.putong.core.data.Conversation.70
        @Override // com.tantanapp.common.data.orm.Column
        public List<Picture> get(Conversation conversation) {
            return conversation.localChatBg;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, List<Picture> list) {
            conversation.localChatBg = list;
        }
    };
    public static final TEnumColumn<Conversation, LocalPlaceBan> LOCALPLACEBAN = new TEnumColumn<Conversation, LocalPlaceBan>("str_localPlaceBan_c", "localPlaceBan_c", LocalPlaceBan.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Conversation.71
        @Override // com.tantanapp.common.data.orm.Column
        public LocalPlaceBan get(Conversation conversation) {
            return conversation.localPlaceBan;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Conversation conversation, LocalPlaceBan localPlaceBan) {
            conversation.localPlaceBan = localPlaceBan;
        }
    };
    public static final Column<Conversation, List<ConversationAdditionalKanKanContentIdWrapper>> ADDITIONAL_KANKAN_CONTENTS = new Column<Conversation, List<ConversationAdditionalKanKanContentIdWrapper>>("additional_kankan_contents_c") { // from class: com.p1.mobile.putong.core.data.Conversation.72
        @Override // com.tantanapp.common.data.orm.Column
        public List<ConversationAdditionalKanKanContentIdWrapper> get(Conversation conversation) {
            return conversation.additional.kankan.contents;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, List<ConversationAdditionalKanKanContentIdWrapper> list) {
            conversation.additional.kankan.contents = list;
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_KANKAN_RESONANCE = new StringColumn<Conversation>("additional_kankan_resonance_c") { // from class: com.p1.mobile.putong.core.data.Conversation.73
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.kankan.resonance;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.kankan.resonance = str;
        }
    };
    public static final IntegerColumn<Conversation> ADDITIONAL_KANKAN_GREETINGSUMMARYDETAIL_UNSEEN = new IntegerColumn<Conversation>("additional_kankan_greetingSummaryDetail_unseen_c") { // from class: com.p1.mobile.putong.core.data.Conversation.74
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.additional.kankan.greetingSummaryDetail.unseen);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.additional.kankan.greetingSummaryDetail.unseen = num.intValue();
        }
    };
    public static final DoubleColumn<Conversation> ADDITIONAL_KANKAN_GREETINGSUMMARYDETAIL_LATESTTIME = new DoubleColumn<Conversation>("additional_kankan_greetingSummaryDetail_latestTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.75
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.additional.kankan.greetingSummaryDetail.latestTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.additional.kankan.greetingSummaryDetail.latestTime = d.doubleValue();
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_KANKAN_GREETINGSUMMARYDETAIL_LATESTUSERID = new StringColumn<Conversation>("additional_kankan_greetingSummaryDetail_latestUserId_c") { // from class: com.p1.mobile.putong.core.data.Conversation.76
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.kankan.greetingSummaryDetail.latestUserId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.kankan.greetingSummaryDetail.latestUserId = str;
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_KANKAN_GREETINGSUMMARYDETAIL_LATESTMESSAGEID = new StringColumn<Conversation>("additional_kankan_greetingSummaryDetail_latestMessageId_c") { // from class: com.p1.mobile.putong.core.data.Conversation.77
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.kankan.greetingSummaryDetail.latestMessageId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.kankan.greetingSummaryDetail.latestMessageId = str;
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_QUICKCHAT_BELL_ISINITIATOR = new BooleanColumn<Conversation>("additional_quickChat_bell_isInitiator_c") { // from class: com.p1.mobile.putong.core.data.Conversation.78
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.additional.quickChat.bell.isInitiator);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.quickChat.bell.isInitiator = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_QUICKCHAT_BELL_AGREE = new BooleanColumn<Conversation>("additional_quickChat_bell_agree_c") { // from class: com.p1.mobile.putong.core.data.Conversation.79
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.additional.quickChat.bell.agree);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.quickChat.bell.agree = bool.booleanValue();
        }
    };
    public static final StringColumn<Conversation> LOCALMESSAGEINSERTREPORTHINT = new StringColumn<Conversation>("localMessageInsertReportHint_c") { // from class: com.p1.mobile.putong.core.data.Conversation.80
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.localMessageInsertReportHint;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.localMessageInsertReportHint = str;
        }
    };
    public static final StringColumn<Conversation> LOCALNOTIFYMOMENTID = new StringColumn<Conversation>("localNotifyMomentId_c") { // from class: com.p1.mobile.putong.core.data.Conversation.81
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.localNotifyMomentId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.localNotifyMomentId = str;
        }
    };
    public static final StringColumn<Conversation> LOCALINSERTEDMOMENTID = new StringColumn<Conversation>("localInsertedMomentId_c") { // from class: com.p1.mobile.putong.core.data.Conversation.82
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.localInsertedMomentId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.localInsertedMomentId = str;
        }
    };

    /* JADX INFO: renamed from: MM */
    public static final IntegerColumn<Conversation> f20373MM = new IntegerColumn<Conversation>("mm_c") { // from class: com.p1.mobile.putong.core.data.Conversation.83
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.f20374mm);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.f20374mm = num.intValue();
        }
    };
    public static final DoubleColumn<Conversation> ADDITIONAL_QUICKCHAT_EXPIRE = new DoubleColumn<Conversation>("additional_quickChat_expire_c") { // from class: com.p1.mobile.putong.core.data.Conversation.84
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.additional.quickChat.expire);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.additional.quickChat.expire = d.doubleValue();
        }
    };
    public static final Column<Conversation, List<LocalBusinessType>> STR_LOCALBUSINESSTYPES = new Column<Conversation, List<LocalBusinessType>>("str_localBusinessTypes_c") { // from class: com.p1.mobile.putong.core.data.Conversation.85
        @Override // com.tantanapp.common.data.orm.Column
        public List<LocalBusinessType> get(Conversation conversation) {
            return conversation.localBusinessTypes;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, List<LocalBusinessType> list) {
            conversation.localBusinessTypes = list;
        }
    };
    public static final IntegerColumn<Conversation> INTIMACY = new IntegerColumn<Conversation>("intimacy_c") { // from class: com.p1.mobile.putong.core.data.Conversation.86
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.intimacy);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.intimacy = num.intValue();
        }
    };
    public static final IntegerColumn<Conversation> QUICKCHATPROGRESS = new IntegerColumn<Conversation>("quickChatProgress_c") { // from class: com.p1.mobile.putong.core.data.Conversation.87
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.quickChatProgress);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.quickChatProgress = num.intValue();
        }
    };
    public static final StringColumn<Conversation> GROUP_SOURCE = new StringColumn<Conversation>("group_source_c") { // from class: com.p1.mobile.putong.core.data.Conversation.88
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.group.source;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.group.source = str;
        }
    };
    public static final IntegerColumn<Conversation> ADDITIONAL_QUICKCHAT_PROGRESS = new IntegerColumn<Conversation>("additional_quickChat_progress_c") { // from class: com.p1.mobile.putong.core.data.Conversation.89
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.additional.quickChat.progress);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.additional.quickChat.progress = num.intValue();
        }
    };
    public static final Column<Conversation, CoreFeedStateCounter> ADDITIONAL_FEEDSTATECOUNTER = new Column<Conversation, CoreFeedStateCounter>("additional_feedStateCounter_c") { // from class: com.p1.mobile.putong.core.data.Conversation.90
        @Override // com.tantanapp.common.data.orm.Column
        public CoreFeedStateCounter get(Conversation conversation) {
            return conversation.additional.feedStateCounter;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, CoreFeedStateCounter coreFeedStateCounter) {
            conversation.additional.feedStateCounter = coreFeedStateCounter;
        }
    };
    public static final Column<Conversation, SuggestedTimeLimitedMatch> ADDITIONAL_SUGGESTEDTIMELIMITEDMATCH = new Column<Conversation, SuggestedTimeLimitedMatch>("additional_suggestedTimeLimitedMatch_c") { // from class: com.p1.mobile.putong.core.data.Conversation.91
        @Override // com.tantanapp.common.data.orm.Column
        public SuggestedTimeLimitedMatch get(Conversation conversation) {
            return conversation.additional.suggestedTimeLimitedMatch;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, SuggestedTimeLimitedMatch suggestedTimeLimitedMatch) {
            conversation.additional.suggestedTimeLimitedMatch = suggestedTimeLimitedMatch;
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_KANKAN_GREETINGSUMMARYDETAIL_ICONURL = new StringColumn<Conversation>("additional_kankan_greetingSummaryDetail_iconURL_c") { // from class: com.p1.mobile.putong.core.data.Conversation.92
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.kankan.greetingSummaryDetail.iconURL;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.kankan.greetingSummaryDetail.iconURL = str;
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_KANKAN_GREETINGSUMMARYDETAIL_TITLE = new StringColumn<Conversation>("additional_kankan_greetingSummaryDetail_title_c") { // from class: com.p1.mobile.putong.core.data.Conversation.93
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.kankan.greetingSummaryDetail.title;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.kankan.greetingSummaryDetail.title = str;
        }
    };
    public static final StringColumn<Conversation> ADDITIONAL_KANKAN_GREETINGSUMMARYDETAIL_SUBTITLE = new StringColumn<Conversation>("additional_kankan_greetingSummaryDetail_subtitle_c") { // from class: com.p1.mobile.putong.core.data.Conversation.94
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.additional.kankan.greetingSummaryDetail.subtitle;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.additional.kankan.greetingSummaryDetail.subtitle = str;
        }
    };
    public static final Column<Conversation, HeartbeatMatch> ADDITIONAL_HEARTBEATMATCH = new Column<Conversation, HeartbeatMatch>("additional_heartbeatMatch_c") { // from class: com.p1.mobile.putong.core.data.Conversation.95
        @Override // com.tantanapp.common.data.orm.Column
        public HeartbeatMatch get(Conversation conversation) {
            return conversation.additional.heartbeatMatch;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, HeartbeatMatch heartbeatMatch) {
            conversation.additional.heartbeatMatch = heartbeatMatch;
        }
    };
    public static final BooleanColumn<Conversation> HASLOCALBREAKICE = new BooleanColumn<Conversation>("hasLocalBreakIce_c") { // from class: com.p1.mobile.putong.core.data.Conversation.96
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.hasLocalBreakIce);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.hasLocalBreakIce = bool.booleanValue();
        }
    };
    public static final Column<Conversation, AvatarSummaryCounter> ADDITIONAL_AVATARSUMMARY = new Column<Conversation, AvatarSummaryCounter>("additional_avatarSummary_c") { // from class: com.p1.mobile.putong.core.data.Conversation.97
        @Override // com.tantanapp.common.data.orm.Column
        public AvatarSummaryCounter get(Conversation conversation) {
            return conversation.additional.avatarSummary;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, AvatarSummaryCounter avatarSummaryCounter) {
            conversation.additional.avatarSummary = avatarSummaryCounter;
        }
    };
    public static final Column<Conversation, CoreInteractionMessageCounter> ADDITIONAL_FEEDINTERACTIONCOUNTER = new Column<Conversation, CoreInteractionMessageCounter>("additional_feedInteractionCounter_c") { // from class: com.p1.mobile.putong.core.data.Conversation.98
        @Override // com.tantanapp.common.data.orm.Column
        public CoreInteractionMessageCounter get(Conversation conversation) {
            return conversation.additional.feedInteractionCounter;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, CoreInteractionMessageCounter coreInteractionMessageCounter) {
            conversation.additional.feedInteractionCounter = coreInteractionMessageCounter;
        }
    };
    public static final DoubleColumn<Conversation> LOCALSPOOFINGNEWTIME = new DoubleColumn<Conversation>("localSpoofingNewTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.99
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.localSpoofingNewTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.localSpoofingNewTime = d.doubleValue();
        }
    };
    public static final Column<Conversation, VirtualVoiceGroupConversationCell> ADDITIONAL_LIVEVIRTUALVOICE = new Column<Conversation, VirtualVoiceGroupConversationCell>("additional_liveVirtualVoice_c") { // from class: com.p1.mobile.putong.core.data.Conversation.100
        @Override // com.tantanapp.common.data.orm.Column
        public VirtualVoiceGroupConversationCell get(Conversation conversation) {
            return conversation.additional.liveVirtualVoice;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
            conversation.additional.liveVirtualVoice = virtualVoiceGroupConversationCell;
        }
    };
    public static final DoubleColumn<Conversation> CLEAREDTIME = new DoubleColumn<Conversation>("clearedTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.101
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.clearedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.clearedTime = d.doubleValue();
        }
    };
    public static final Column<Conversation, ConversationMomentInfo> ADDITIONAL_LOCALMOMENTINFO = new Column<Conversation, ConversationMomentInfo>("additional_localMomentInfo_c") { // from class: com.p1.mobile.putong.core.data.Conversation.102
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationMomentInfo get(Conversation conversation) {
            return conversation.additional.localMomentInfo;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConversationMomentInfo conversationMomentInfo) {
            conversation.additional.localMomentInfo = conversationMomentInfo;
        }
    };
    public static final StringColumn<Conversation> LOCALEXTRAINFO = new StringColumn<Conversation>("localExtraInfo_c") { // from class: com.p1.mobile.putong.core.data.Conversation.103
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.localExtraInfo;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.localExtraInfo = str;
        }
    };
    public static final DoubleColumn<Conversation> LASTACTIVITYTIME = new DoubleColumn<Conversation>("lastActivityTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.104
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.lastActivityTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.lastActivityTime = d.doubleValue();
        }
    };
    public static final Column<Conversation, LiveActivityConversation> ADDITIONAL_LIVEACTIVITY = new Column<Conversation, LiveActivityConversation>("additional_liveActivity_c") { // from class: com.p1.mobile.putong.core.data.Conversation.105
        @Override // com.tantanapp.common.data.orm.Column
        public LiveActivityConversation get(Conversation conversation) {
            return conversation.additional.liveActivity;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, LiveActivityConversation liveActivityConversation) {
            conversation.additional.liveActivity = liveActivityConversation;
        }
    };
    public static final Column<Conversation, ConversationGame> ADDITIONAL_GAME = new Column<Conversation, ConversationGame>("additional_game_c") { // from class: com.p1.mobile.putong.core.data.Conversation.106
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationGame get(Conversation conversation) {
            return conversation.additional.game;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConversationGame conversationGame) {
            conversation.additional.game = conversationGame;
        }
    };
    public static final Column<Conversation, ConversationAdditionalTag> ADDITIONAL_TAG = new Column<Conversation, ConversationAdditionalTag>("additional_tag_c") { // from class: com.p1.mobile.putong.core.data.Conversation.107
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationAdditionalTag get(Conversation conversation) {
            return conversation.additional.tag;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConversationAdditionalTag conversationAdditionalTag) {
            conversation.additional.tag = conversationAdditionalTag;
        }
    };
    public static final Column<Conversation, ConversationAdditionalChatAssistantQuestion> ADDITIONAL_CHATASSISTANTQUESTION = new Column<Conversation, ConversationAdditionalChatAssistantQuestion>("additional_chatAssistantQuestion_c") { // from class: com.p1.mobile.putong.core.data.Conversation.108
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationAdditionalChatAssistantQuestion get(Conversation conversation) {
            return conversation.additional.chatAssistantQuestion;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion) {
            conversation.additional.chatAssistantQuestion = conversationAdditionalChatAssistantQuestion;
        }
    };
    public static final BooleanColumn<Conversation> ADDITIONAL_QUICKCHAT_GUIDEFAKETOGOOD = new BooleanColumn<Conversation>("additional_quickChat_guideFakeToGood_c") { // from class: com.p1.mobile.putong.core.data.Conversation.109
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.additional.quickChat.guideFakeToGood);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.additional.quickChat.guideFakeToGood = bool.booleanValue();
        }
    };
    public static final StringColumn<Conversation> OTHERSTATUS = new StringColumn<Conversation>("otherStatus_c") { // from class: com.p1.mobile.putong.core.data.Conversation.110
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Conversation conversation) {
            return conversation.otherStatus;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, String str) {
            conversation.otherStatus = str;
        }
    };
    public static final Column<Conversation, ContinuousChat> ADDITIONAL_CONTINUOUSCHAT = new Column<Conversation, ContinuousChat>("additional_continuousChat_c") { // from class: com.p1.mobile.putong.core.data.Conversation.111
        @Override // com.tantanapp.common.data.orm.Column
        public ContinuousChat get(Conversation conversation) {
            return conversation.additional.continuousChat;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ContinuousChat continuousChat) {
            conversation.additional.continuousChat = continuousChat;
        }
    };
    public static final Column<Conversation, PlatinumPinChat> ADDITIONAL_PINCHAT = new Column<Conversation, PlatinumPinChat>("additional_pinChat_c") { // from class: com.p1.mobile.putong.core.data.Conversation.112
        @Override // com.tantanapp.common.data.orm.Column
        public PlatinumPinChat get(Conversation conversation) {
            return conversation.additional.pinChat;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, PlatinumPinChat platinumPinChat) {
            conversation.additional.pinChat = platinumPinChat;
        }
    };
    public static final Column<Conversation, ReSwipeInfo> ADDITIONAL_RESWIPE = new Column<Conversation, ReSwipeInfo>("additional_reSwipe_c") { // from class: com.p1.mobile.putong.core.data.Conversation.113
        @Override // com.tantanapp.common.data.orm.Column
        public ReSwipeInfo get(Conversation conversation) {
            return conversation.additional.reSwipe;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ReSwipeInfo reSwipeInfo) {
            conversation.additional.reSwipe = reSwipeInfo;
        }
    };
    public static final Column<Conversation, GrowthConversationBlindBox> ADDITIONAL_BLINDBOX = new Column<Conversation, GrowthConversationBlindBox>("additional_blindbox_c") { // from class: com.p1.mobile.putong.core.data.Conversation.114
        @Override // com.tantanapp.common.data.orm.Column
        public GrowthConversationBlindBox get(Conversation conversation) {
            return conversation.additional.blindbox;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, GrowthConversationBlindBox growthConversationBlindBox) {
            conversation.additional.blindbox = growthConversationBlindBox;
        }
    };
    public static final Column<Conversation, List<String>> ADDITIONAL_PREVIEWTEXTS = new Column<Conversation, List<String>>("additional_previewTexts_c") { // from class: com.p1.mobile.putong.core.data.Conversation.115
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Conversation conversation) {
            return conversation.additional.previewTexts;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, List<String> list) {
            conversation.additional.previewTexts = list;
        }
    };
    public static final Column<Conversation, GreetingInfo> ADDITIONAL_GREETINGINFO = new Column<Conversation, GreetingInfo>("additional_greetingInfo_c") { // from class: com.p1.mobile.putong.core.data.Conversation.116
        @Override // com.tantanapp.common.data.orm.Column
        public GreetingInfo get(Conversation conversation) {
            return conversation.additional.greetingInfo;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, GreetingInfo greetingInfo) {
            conversation.additional.greetingInfo = greetingInfo;
        }
    };
    public static final Column<Conversation, ConversationAdditionalFateRadar> ADDITIONAL_FATERADAR = new Column<Conversation, ConversationAdditionalFateRadar>("additional_fateRadar_c") { // from class: com.p1.mobile.putong.core.data.Conversation.117
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationAdditionalFateRadar get(Conversation conversation) {
            return conversation.additional.fateRadar;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConversationAdditionalFateRadar conversationAdditionalFateRadar) {
            conversation.additional.fateRadar = conversationAdditionalFateRadar;
        }
    };
    public static final BooleanColumn<Conversation> ISFAKE = new BooleanColumn<Conversation>("isFake_c") { // from class: com.p1.mobile.putong.core.data.Conversation.118
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Conversation conversation) {
            return Boolean.valueOf(conversation.isFake);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Boolean bool) {
            conversation.isFake = bool.booleanValue();
        }
    };
    public static final Column<Conversation, LowPayOneside> ADDITIONAL_LOWPAYONESIDE = new Column<Conversation, LowPayOneside>("additional_lowPayOneside_c") { // from class: com.p1.mobile.putong.core.data.Conversation.119
        @Override // com.tantanapp.common.data.orm.Column
        public LowPayOneside get(Conversation conversation) {
            return conversation.additional.lowPayOneside;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, LowPayOneside lowPayOneside) {
            conversation.additional.lowPayOneside = lowPayOneside;
        }
    };
    public static final Column<Conversation, ConvAdditionalMatchInfo> ADDITIONAL_MATCHINFO = new Column<Conversation, ConvAdditionalMatchInfo>("additional_matchInfo_c") { // from class: com.p1.mobile.putong.core.data.Conversation.120
        @Override // com.tantanapp.common.data.orm.Column
        public ConvAdditionalMatchInfo get(Conversation conversation) {
            return conversation.additional.matchInfo;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConvAdditionalMatchInfo convAdditionalMatchInfo) {
            conversation.additional.matchInfo = convAdditionalMatchInfo;
        }
    };
    public static final DoubleColumn<Conversation> ADDITIONAL_NEWMATCH_LABELEXPOSURETIME = new DoubleColumn<Conversation>("additional_newMatch_labelExposureTime_c") { // from class: com.p1.mobile.putong.core.data.Conversation.121
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Conversation conversation) {
            return Double.valueOf(conversation.additional.newMatch.labelExposureTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Double d) {
            conversation.additional.newMatch.labelExposureTime = d.doubleValue();
        }
    };
    public static final Column<Conversation, ConvAdditionalLoveLetter> ADDITIONAL_LOVELETTER = new Column<Conversation, ConvAdditionalLoveLetter>("additional_loveLetter_c") { // from class: com.p1.mobile.putong.core.data.Conversation.122
        @Override // com.tantanapp.common.data.orm.Column
        public ConvAdditionalLoveLetter get(Conversation conversation) {
            return conversation.additional.loveLetter;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConvAdditionalLoveLetter convAdditionalLoveLetter) {
            conversation.additional.loveLetter = convAdditionalLoveLetter;
        }
    };
    public static final IntegerColumn<Conversation> LOCALISLIMITEDTRIALSEE = new IntegerColumn<Conversation>("localIsLimitedTrialSee_c") { // from class: com.p1.mobile.putong.core.data.Conversation.123
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Conversation conversation) {
            return Integer.valueOf(conversation.localIsLimitedTrialSee);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, Integer num) {
            conversation.localIsLimitedTrialSee = num.intValue();
        }
    };
    public static final Column<Conversation, ChatMM> ADDITIONAL_CHATMM = new Column<Conversation, ChatMM>("additional_chatMM_c") { // from class: com.p1.mobile.putong.core.data.Conversation.124
        @Override // com.tantanapp.common.data.orm.Column
        public ChatMM get(Conversation conversation) {
            return conversation.additional.chatMM;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ChatMM chatMM) {
            conversation.additional.chatMM = chatMM;
        }
    };
    public static final Column<Conversation, BlackList> ADDITIONAL_BLACKLIST = new Column<Conversation, BlackList>("additional_blackList_c") { // from class: com.p1.mobile.putong.core.data.Conversation.125
        @Override // com.tantanapp.common.data.orm.Column
        public BlackList get(Conversation conversation) {
            return conversation.additional.blackList;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, BlackList blackList) {
            conversation.additional.blackList = blackList;
        }
    };
    public static final Column<Conversation, MessageRelate> ADDITIONAL_MESSAGERELATE = new Column<Conversation, MessageRelate>("additional_messageRelate_c") { // from class: com.p1.mobile.putong.core.data.Conversation.126
        @Override // com.tantanapp.common.data.orm.Column
        public MessageRelate get(Conversation conversation) {
            return conversation.additional.messageRelate;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, MessageRelate messageRelate) {
            conversation.additional.messageRelate = messageRelate;
        }
    };
    public static final Column<Conversation, ConvAdditionalCompliment> ADDITIONAL_COMPLIMENT = new Column<Conversation, ConvAdditionalCompliment>("additional_compliment_c") { // from class: com.p1.mobile.putong.core.data.Conversation.127
        @Override // com.tantanapp.common.data.orm.Column
        public ConvAdditionalCompliment get(Conversation conversation) {
            return conversation.additional.compliment;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConvAdditionalCompliment convAdditionalCompliment) {
            conversation.additional.compliment = convAdditionalCompliment;
        }
    };
    public static final Column<Conversation, ConvAdditionalSwiper> ADDITIONAL_SWIPER = new Column<Conversation, ConvAdditionalSwiper>("additional_swiper_c") { // from class: com.p1.mobile.putong.core.data.Conversation.128
        @Override // com.tantanapp.common.data.orm.Column
        public ConvAdditionalSwiper get(Conversation conversation) {
            return conversation.additional.swiper;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Conversation conversation, ConvAdditionalSwiper convAdditionalSwiper) {
            conversation.additional.swiper = convAdditionalSwiper;
        }
    };
    public static mrf0<Conversation> DB_ADAPTER = new mrf0<Conversation>() { // from class: com.p1.mobile.putong.core.data.Conversation.129
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,localHasMessage_c INTEGER,read_c INTEGER,otherUser_c TEXT,readUntil_c TEXT,latestTime_c REAL,createdTime_c REAL,localMatchFrom_c INTEGER,localNotificationStatus_c INTEGER,localBotheringTime_c REAL,scenarios_c BLOB,localActiveTime_c REAL,unreadMessages_c INTEGER,localEverHasMessage_c INTEGER,reminder_c BLOB,localUserUpdatedTime_c REAL,importance_c INTEGER,localOnlineTabClick_c TEXT,follow_c INTEGER,localBotherWxTime_c REAL,localBotherCodeTime_c REAL,clearedUntil_c TEXT,status_c INTEGER,place_c TEXT,subtype_c INTEGER,myTalk_c BLOB,otherTalk_c BLOB,otherReadUntil_c TEXT,enterTimes_c INTEGER,updatedTime_c REAL,unmatchConversation_c INTEGER,remainedTime_c INTEGER,localSafetyReminderTime_c REAL,localSpoofingReminderTime_c REAL,forceSend_c INTEGER,conversationUserDistance_c INTEGER,conversationUserUpdatedTime_c REAL,level_c INTEGER,additional_quickChat_avatarBlurred_c INTEGER,additional_voiceCall_rejectedTime_c TEXT,additional_voiceCall_acceptedTime_c TEXT,additional_timeLimited_expiredTimestamp_c INTEGER,additional_timeLimited_participate_c TEXT,additional_timeLimited_allowExtension_c INTEGER,additional_timeLimited_extensionOperator_c TEXT,convType_c TEXT,property_c BLOB,userMessageCount_c INTEGER,latestFriendCommentCreatedTime_c REAL,heat_orderScore_c INTEGER,heat_showScore_c INTEGER,heat_marks_c TEXT,heat_mm_c INTEGER,heat_score_c INTEGER,localBusinessTypes_c BLOB,additional_oneSideNoMatch_selfSend_c INTEGER,localGreetDelete_c INTEGER,additional_timeLimited_hidden_c INTEGER,additional_timeLimited_newConversation_c INTEGER,additional_timeLimited_expiredSeconds_c INTEGER,suggestionScore_c REAL,localBotherStatus_c INTEGER,muted_c INTEGER,group_latestNotificationMsgId_c TEXT,group_joinedTime_c REAL,additional_oneSide_c BLOB,localDraft_c TEXT,localChatBg_c BLOB,localPlaceBan_c INTEGER,additional_kankan_contents_c BLOB,additional_kankan_resonance_c TEXT,additional_kankan_greetingSummaryDetail_unseen_c INTEGER,additional_kankan_greetingSummaryDetail_latestTime_c REAL,additional_kankan_greetingSummaryDetail_latestUserId_c TEXT,additional_kankan_greetingSummaryDetail_latestMessageId_c TEXT,additional_quickChat_bell_isInitiator_c INTEGER,additional_quickChat_bell_agree_c INTEGER,localMessageInsertReportHint_c TEXT,localNotifyMomentId_c TEXT,localInsertedMomentId_c TEXT,mm_c INTEGER,additional_quickChat_expire_c REAL,str_localMatchFrom_c TEXT,str_localNotificationStatus_c TEXT,str_importance_c TEXT,str_status_c TEXT,str_subtype_c TEXT,str_localBusinessTypes_c BLOB,str_localPlaceBan_c TEXT,intimacy_c INTEGER,quickChatProgress_c INTEGER,group_source_c TEXT,additional_quickChat_progress_c INTEGER,additional_feedStateCounter_c BLOB,additional_suggestedTimeLimitedMatch_c BLOB,additional_kankan_greetingSummaryDetail_iconURL_c TEXT,additional_kankan_greetingSummaryDetail_title_c TEXT,additional_kankan_greetingSummaryDetail_subtitle_c TEXT,additional_heartbeatMatch_c BLOB,hasLocalBreakIce_c INTEGER,additional_avatarSummary_c BLOB,additional_feedInteractionCounter_c BLOB,localSpoofingNewTime_c REAL,additional_liveVirtualVoice_c BLOB,clearedTime_c REAL,additional_localMomentInfo_c BLOB,localExtraInfo_c TEXT,lastActivityTime_c REAL,additional_liveActivity_c BLOB,additional_game_c BLOB,additional_tag_c BLOB,additional_chatAssistantQuestion_c BLOB,additional_quickChat_guideFakeToGood_c INTEGER,otherStatus_c TEXT,additional_continuousChat_c BLOB,additional_pinChat_c BLOB,additional_reSwipe_c BLOB,additional_blindbox_c BLOB,additional_previewTexts_c BLOB,additional_greetingInfo_c BLOB,additional_fateRadar_c BLOB,isFake_c INTEGER,additional_lowPayOneside_c BLOB,additional_matchInfo_c BLOB,additional_newMatch_labelExposureTime_c REAL,additional_loveLetter_c BLOB,localIsLimitedTrialSee_c INTEGER,additional_chatMM_c BLOB,additional_blackList_c BLOB,additional_messageRelate_c BLOB,additional_compliment_c BLOB,additional_swiper_c BLOB)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return Conversation.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Conversation init() {
            Conversation conversation = new Conversation();
            if (conversation.read == null) {
                conversation.read = Boolean.FALSE;
            }
            if (conversation.otherUser == null) {
                conversation.otherUser = "";
            }
            if (conversation.localNotificationStatus == null) {
                conversation.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
            }
            if (conversation.importance == null) {
                conversation.importance = (StickStatus) StickStatus.JSON_ADAPTER.defaultEnum();
            }
            if (conversation.status == null) {
                conversation.status = (ConversationStatus) ConversationStatus.JSON_ADAPTER.defaultEnum();
            }
            if (conversation.subtype == null) {
                conversation.subtype = (ConversationType) ConversationType.JSON_ADAPTER.defaultEnum();
            }
            if (conversation.myTalk == null) {
                conversation.myTalk = TalkInfo.new_();
            }
            if (conversation.otherTalk == null) {
                conversation.otherTalk = TalkInfo.new_();
            }
            if (conversation.additional == null) {
                conversation.additional = ConversationAdditional.new_();
            }
            if (conversation.convType == null) {
                conversation.convType = "";
            }
            if (conversation.property == null) {
                conversation.property = ConversationProperty.new_();
            }
            if (conversation.heat == null) {
                conversation.heat = FriendHeatScore.new_();
            }
            if (conversation.localBusinessTypes == null) {
                conversation.localBusinessTypes = new ArrayList();
            }
            if (conversation.group == null) {
                conversation.group = ConversationGroupProperty.new_();
            }
            if (conversation.localPlaceBan == null) {
                conversation.localPlaceBan = (LocalPlaceBan) LocalPlaceBan.JSON_ADAPTER.defaultEnum();
            }
            if (conversation.localNotifyMomentId == null) {
                conversation.localNotifyMomentId = "";
            }
            if (conversation.localInsertedMomentId == null) {
                conversation.localInsertedMomentId = "";
            }
            if (conversation.otherStatus == null) {
                conversation.otherStatus = "";
            }
            return conversation;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:455:0x0a70 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:459:0x0a86  */
        /* JADX WARN: Code duplicated, block: B:462:0x0a90  */
        /* JADX WARN: Code duplicated, block: B:465:0x0a96  */
        /* JADX WARN: Code duplicated, block: B:468:0x0aa2  */
        /* JADX WARN: Code duplicated, block: B:471:0x0aae  */
        /* JADX WARN: Code duplicated, block: B:474:0x0aba  */
        /* JADX WARN: Code duplicated, block: B:477:0x0ac6  */
        /* JADX WARN: Code duplicated, block: B:480:0x0ad0  */
        /* JADX WARN: Code duplicated, block: B:483:0x0ada  */
        /* JADX WARN: Code duplicated, block: B:486:0x0ae4  */
        /* JADX WARN: Code duplicated, block: B:489:0x0aea  */
        /* JADX WARN: Code duplicated, block: B:492:0x0af4  */
        /* JADX WARN: Code duplicated, block: B:495:0x0afe  */
        /* JADX WARN: Code duplicated, block: B:498:0x0b09  */
        /* JADX WARN: Code duplicated, block: B:501:0x0b13  */
        /* JADX WARN: Code duplicated, block: B:504:0x0b1f  */
        /* JADX WARN: Code duplicated, block: B:507:0x0b25  */
        /* JADX WARN: Code duplicated, block: B:510:0x0b2b  */
        @Override // p149l.mrf0
        public Conversation read(Cursor cursor, int i) {
            String string;
            String string2;
            String string3;
            String string4;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            List<Integer> list;
            int i7;
            String string5;
            List<Integer> list2;
            TEnumJsonAdapter<NotificationStatus> tEnumJsonAdapter;
            TEnumJsonAdapter<StickStatus> tEnumJsonAdapter2;
            TEnumJsonAdapter<ConversationStatus> tEnumJsonAdapter3;
            TEnumJsonAdapter<ConversationType> tEnumJsonAdapter4;
            TEnumJsonAdapter<LocalPlaceBan> tEnumJsonAdapter5;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            int i8;
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell;
            String string6 = "unknown_";
            if (i == 0) {
                this.readIndex = 0;
            }
            Conversation conversation = new Conversation();
            try {
                conversation.additional = new ConversationAdditional();
                conversation.heat = new FriendHeatScore();
                conversation.group = new ConversationGroupProperty();
                conversation.additional.quickChat = new ConversationAdditionalQuickChat();
                conversation.additional.voiceCall = new VoiceCallAdditional();
                conversation.additional.timeLimited = new TimeLimited();
                conversation.additional.oneSideNoMatch = new OneSideNoMatchConversation();
                conversation.additional.kankan = new ConversationAdditionalKanKanContent();
                conversation.additional.newMatch = new ExposureNewMatch();
                conversation.additional.kankan.greetingSummaryDetail = new GreetingSummary();
                conversation.additional.quickChat.bell = new QuickChatBell();
                conversation._id = cursor.getLong(i);
                int i9 = i + 1;
                conversation.f56011id = cursor.isNull(i9) ? null : cursor.getString(i9);
                conversation.localHasMessage = cursor.getInt(i + 2) == 1;
                int i10 = i + 3;
                if (cursor.isNull(i10)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursor.getInt(i10) == 1);
                }
                conversation.read = boolValueOf;
                int i11 = i + 4;
                conversation.otherUser = cursor.isNull(i11) ? null : cursor.getString(i11);
                int i12 = i + 5;
                conversation.readUntil = cursor.isNull(i12) ? null : cursor.getString(i12);
                conversation.latestTime = cursor.getDouble(i + 6);
                conversation.createdTime = cursor.getDouble(i + 7);
                int i13 = i + 8;
                i2 = cursor.isNull(i13) ? -1 : cursor.getInt(i13);
                int i14 = i + 9;
                try {
                    i7 = cursor.isNull(i14) ? -1 : cursor.getInt(i14);
                    try {
                        conversation.localBotheringTime = cursor.getDouble(i + 10);
                        int i15 = i + 11;
                        conversation.scenarios = cursor.isNull(i15) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i15));
                        conversation.localActiveTime = cursor.getDouble(i + 12);
                        conversation.unreadMessages = cursor.getInt(i + 13);
                        conversation.localEverHasMessage = cursor.getInt(i + 14) == 1;
                        int i16 = i + 15;
                        conversation.reminder = cursor.isNull(i16) ? null : Reminder.PROTOBUF_ADAPTER.parse(cursor.getBlob(i16));
                        conversation.localUserUpdatedTime = cursor.getDouble(i + 16);
                        int i17 = i + 17;
                        i4 = cursor.isNull(i17) ? -1 : cursor.getInt(i17);
                        int i18 = i + 18;
                        try {
                            conversation.localOnlineTabClick = cursor.isNull(i18) ? null : cursor.getString(i18);
                            conversation.follow = cursor.getInt(i + 19) == 1;
                            conversation.localBotherWxTime = cursor.getDouble(i + 20);
                            conversation.localBotherCodeTime = cursor.getDouble(i + 21);
                            int i19 = i + 22;
                            conversation.clearedUntil = cursor.isNull(i19) ? null : cursor.getString(i19);
                            int i20 = i + 23;
                            i5 = cursor.isNull(i20) ? -1 : cursor.getInt(i20);
                            int i21 = i + 24;
                            try {
                                conversation.place = cursor.isNull(i21) ? null : cursor.getString(i21);
                                int i22 = i + 25;
                                i6 = cursor.isNull(i22) ? -1 : cursor.getInt(i22);
                                int i23 = i + 26;
                                try {
                                    conversation.myTalk = cursor.isNull(i23) ? null : TalkInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i23));
                                    int i24 = i + 27;
                                    conversation.otherTalk = cursor.isNull(i24) ? null : TalkInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i24));
                                    int i25 = i + 28;
                                    conversation.otherReadUntil = cursor.isNull(i25) ? null : cursor.getString(i25);
                                    conversation.enterTimes = cursor.getInt(i + 29);
                                    conversation.updatedTime = cursor.getDouble(i + 30);
                                    conversation.unmatchConversation = cursor.getInt(i + 31) == 1;
                                    conversation.remainedTime = cursor.getLong(i + 32);
                                    conversation.localSafetyReminderTime = cursor.getDouble(i + 33);
                                    conversation.localSpoofingReminderTime = cursor.getDouble(i + 34);
                                    conversation.forceSend = cursor.getInt(i + 35) == 1;
                                    conversation.conversationUserDistance = cursor.getInt(i + 36);
                                    conversation.conversationUserUpdatedTime = cursor.getDouble(i + 37);
                                    conversation.level = cursor.getInt(i + 38);
                                    conversation.additional.quickChat.avatarBlurred = cursor.getInt(i + 39) == 1;
                                    int i26 = i + 40;
                                    conversation.additional.voiceCall.rejectedTime = cursor.isNull(i26) ? null : cursor.getString(i26);
                                    int i27 = i + 41;
                                    conversation.additional.voiceCall.acceptedTime = cursor.isNull(i27) ? null : cursor.getString(i27);
                                    conversation.additional.timeLimited.expiredTimestamp = cursor.getLong(i + 42);
                                    int i28 = i + 43;
                                    conversation.additional.timeLimited.participate = cursor.isNull(i28) ? null : cursor.getString(i28);
                                    conversation.additional.timeLimited.allowExtension = cursor.getInt(i + 44) == 1;
                                    int i29 = i + 45;
                                    conversation.additional.timeLimited.extensionOperator = cursor.isNull(i29) ? null : cursor.getString(i29);
                                    int i30 = i + 46;
                                    conversation.convType = cursor.isNull(i30) ? null : cursor.getString(i30);
                                    int i31 = i + 47;
                                    conversation.property = cursor.isNull(i31) ? null : ConversationProperty.PROTOBUF_ADAPTER.parse(cursor.getBlob(i31));
                                    conversation.userMessageCount = cursor.getInt(i + 48);
                                    conversation.latestFriendCommentCreatedTime = cursor.getDouble(i + 49);
                                    conversation.heat.orderScore = cursor.getInt(i + 50);
                                    conversation.heat.showScore = cursor.getInt(i + 51);
                                    int i32 = i + 52;
                                    conversation.heat.marks = cursor.isNull(i32) ? null : cursor.getString(i32);
                                    conversation.heat.f20394mm = cursor.getInt(i + 53);
                                    conversation.heat.score = cursor.getInt(i + 54);
                                    int i33 = i + 55;
                                    list2 = cursor.isNull(i33) ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i33));
                                    int i34 = i + 56;
                                    try {
                                        OneSideNoMatchConversation oneSideNoMatchConversation = conversation.additional.oneSideNoMatch;
                                        if (cursor.isNull(i34)) {
                                            boolValueOf2 = null;
                                        } else {
                                            boolValueOf2 = Boolean.valueOf(cursor.getInt(i34) == 1);
                                        }
                                        oneSideNoMatchConversation.selfSend = boolValueOf2;
                                        conversation.localGreetDelete = cursor.getInt(i + 57) == 1;
                                        conversation.additional.timeLimited.hidden = cursor.getInt(i + 58) == 1;
                                        conversation.additional.timeLimited.newConversation = cursor.getInt(i + 59) == 1;
                                        i7 = i7;
                                        try {
                                            conversation.additional.timeLimited.expiredSeconds = cursor.getLong(i + 60);
                                            conversation.suggestionScore = cursor.getDouble(i + 61);
                                            conversation.localBotherStatus = cursor.getInt(i + 62);
                                            conversation.muted = cursor.getInt(i + 63) == 1;
                                            int i35 = i + 64;
                                            conversation.group.latestNotificationMsgId = cursor.isNull(i35) ? null : cursor.getString(i35);
                                            conversation.group.joinedTime = cursor.getDouble(i + 65);
                                            int i36 = i + 66;
                                            conversation.additional.oneSide = cursor.isNull(i36) ? null : ConversationAdditionalOneSide.PROTOBUF_ADAPTER.parse(cursor.getBlob(i36));
                                            int i37 = i + 67;
                                            conversation.localDraft = cursor.isNull(i37) ? null : cursor.getString(i37);
                                            int i38 = i + 68;
                                            conversation.localChatBg = cursor.isNull(i38) ? null : Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i38));
                                            int i39 = i + 69;
                                            i3 = cursor.isNull(i39) ? -1 : cursor.getInt(i39);
                                            int i40 = i + 70;
                                            try {
                                                conversation.additional.kankan.contents = cursor.isNull(i40) ? null : ConversationAdditionalKanKanContentIdWrapper.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i40));
                                                int i41 = i + 71;
                                                conversation.additional.kankan.resonance = cursor.isNull(i41) ? null : cursor.getString(i41);
                                                conversation.additional.kankan.greetingSummaryDetail.unseen = cursor.getInt(i + 72);
                                                conversation.additional.kankan.greetingSummaryDetail.latestTime = cursor.getDouble(i + 73);
                                                int i42 = i + 74;
                                                conversation.additional.kankan.greetingSummaryDetail.latestUserId = cursor.isNull(i42) ? null : cursor.getString(i42);
                                                int i43 = i + 75;
                                                conversation.additional.kankan.greetingSummaryDetail.latestMessageId = cursor.isNull(i43) ? null : cursor.getString(i43);
                                                conversation.additional.quickChat.bell.isInitiator = cursor.getInt(i + 76) == 1;
                                                conversation.additional.quickChat.bell.agree = cursor.getInt(i + 77) == 1;
                                                int i44 = i + 78;
                                                conversation.localMessageInsertReportHint = cursor.isNull(i44) ? null : cursor.getString(i44);
                                                int i45 = i + 79;
                                                conversation.localNotifyMomentId = cursor.isNull(i45) ? null : cursor.getString(i45);
                                                int i46 = i + 80;
                                                conversation.localInsertedMomentId = cursor.isNull(i46) ? null : cursor.getString(i46);
                                                conversation.f20374mm = cursor.getInt(i + 81);
                                                conversation.additional.quickChat.expire = cursor.getDouble(i + 82);
                                                int i47 = i + 83;
                                                string5 = cursor.isNull(i47) ? null : cursor.getString(i47);
                                                int i48 = i + 84;
                                                try {
                                                    string = cursor.isNull(i48) ? null : cursor.getString(i48);
                                                    int i49 = i + 85;
                                                    try {
                                                        string2 = cursor.isNull(i49) ? null : cursor.getString(i49);
                                                        int i50 = i + 86;
                                                        try {
                                                            string3 = cursor.isNull(i50) ? null : cursor.getString(i50);
                                                            int i51 = i + 87;
                                                            try {
                                                                string4 = cursor.isNull(i51) ? null : cursor.getString(i51);
                                                                int i52 = i + 88;
                                                                try {
                                                                    conversation.localBusinessTypes = cursor.isNull(i52) ? null : LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i52));
                                                                    int i53 = i + 89;
                                                                    string6 = cursor.isNull(i53) ? null : cursor.getString(i53);
                                                                    conversation.intimacy = cursor.getInt(i + 90);
                                                                    conversation.quickChatProgress = cursor.getInt(i + 91);
                                                                    int i54 = i + 92;
                                                                    conversation.group.source = cursor.isNull(i54) ? null : cursor.getString(i54);
                                                                    conversation.additional.quickChat.progress = cursor.getInt(i + 93);
                                                                    int i55 = i + 94;
                                                                    conversation.additional.feedStateCounter = cursor.isNull(i55) ? null : CoreFeedStateCounter.PROTOBUF_ADAPTER.parse(cursor.getBlob(i55));
                                                                    int i56 = i + 95;
                                                                    conversation.additional.suggestedTimeLimitedMatch = cursor.isNull(i56) ? null : SuggestedTimeLimitedMatch.PROTOBUF_ADAPTER.parse(cursor.getBlob(i56));
                                                                    int i57 = i + 96;
                                                                    conversation.additional.kankan.greetingSummaryDetail.iconURL = cursor.isNull(i57) ? null : cursor.getString(i57);
                                                                    int i58 = i + 97;
                                                                    conversation.additional.kankan.greetingSummaryDetail.title = cursor.isNull(i58) ? null : cursor.getString(i58);
                                                                    int i59 = i + 98;
                                                                    conversation.additional.kankan.greetingSummaryDetail.subtitle = cursor.isNull(i59) ? null : cursor.getString(i59);
                                                                    int i60 = i + 99;
                                                                    conversation.additional.heartbeatMatch = cursor.isNull(i60) ? null : HeartbeatMatch.PROTOBUF_ADAPTER.parse(cursor.getBlob(i60));
                                                                    conversation.hasLocalBreakIce = cursor.getInt(i + 100) == 1;
                                                                    int i61 = i + 101;
                                                                    conversation.additional.avatarSummary = cursor.isNull(i61) ? null : AvatarSummaryCounter.PROTOBUF_ADAPTER.parse(cursor.getBlob(i61));
                                                                    int i62 = i + 102;
                                                                    conversation.additional.feedInteractionCounter = cursor.isNull(i62) ? null : CoreInteractionMessageCounter.PROTOBUF_ADAPTER.parse(cursor.getBlob(i62));
                                                                    conversation.localSpoofingNewTime = cursor.getDouble(i + 103);
                                                                    int i63 = i + 104;
                                                                    try {
                                                                        if (TextUtils.equals(cursor.getColumnName(104), "clearedTime_c")) {
                                                                            conversation.clearedTime = cursor.getDouble(i63);
                                                                            i8 = i + 105;
                                                                            ConversationAdditional conversationAdditional = conversation.additional;
                                                                            if (cursor.isNull(i8)) {
                                                                                virtualVoiceGroupConversationCell = null;
                                                                            } else {
                                                                                virtualVoiceGroupConversationCell = VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER.parse(cursor.getBlob(i8));
                                                                            }
                                                                            conversationAdditional.liveVirtualVoice = virtualVoiceGroupConversationCell;
                                                                        } else {
                                                                            string6 = string6;
                                                                            conversation.additional.liveVirtualVoice = cursor.isNull(i63) ? null : VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER.parse(cursor.getBlob(i63));
                                                                            i8 = i + 105;
                                                                            conversation.clearedTime = cursor.getDouble(i8);
                                                                        }
                                                                        int i64 = i8 + 1;
                                                                        conversation.additional.localMomentInfo = cursor.isNull(i64) ? null : ConversationMomentInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i64));
                                                                        int i65 = i8 + 2;
                                                                        conversation.localExtraInfo = cursor.isNull(i65) ? null : cursor.getString(i65);
                                                                        conversation.lastActivityTime = cursor.getDouble(i8 + 3);
                                                                        int i66 = i8 + 4;
                                                                        conversation.additional.liveActivity = cursor.isNull(i66) ? null : LiveActivityConversation.PROTOBUF_ADAPTER.parse(cursor.getBlob(i66));
                                                                        int i67 = i8 + 5;
                                                                        conversation.additional.game = cursor.isNull(i67) ? null : ConversationGame.PROTOBUF_ADAPTER.parse(cursor.getBlob(i67));
                                                                        int i68 = i8 + 6;
                                                                        conversation.additional.tag = cursor.isNull(i68) ? null : ConversationAdditionalTag.PROTOBUF_ADAPTER.parse(cursor.getBlob(i68));
                                                                        int i69 = i8 + 7;
                                                                        conversation.additional.chatAssistantQuestion = cursor.isNull(i69) ? null : ConversationAdditionalChatAssistantQuestion.PROTOBUF_ADAPTER.parse(cursor.getBlob(i69));
                                                                        conversation.additional.quickChat.guideFakeToGood = cursor.getInt(i8 + 8) == 1;
                                                                        int i70 = i8 + 9;
                                                                        conversation.otherStatus = cursor.isNull(i70) ? null : cursor.getString(i70);
                                                                        int i71 = i8 + 10;
                                                                        conversation.additional.continuousChat = cursor.isNull(i71) ? null : ContinuousChat.PROTOBUF_ADAPTER.parse(cursor.getBlob(i71));
                                                                        int i72 = i8 + 11;
                                                                        conversation.additional.pinChat = cursor.isNull(i72) ? null : PlatinumPinChat.PROTOBUF_ADAPTER.parse(cursor.getBlob(i72));
                                                                        int i73 = i8 + 12;
                                                                        conversation.additional.reSwipe = cursor.isNull(i73) ? null : ReSwipeInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i73));
                                                                        int i74 = i8 + 13;
                                                                        conversation.additional.blindbox = cursor.isNull(i74) ? null : GrowthConversationBlindBox.PROTOBUF_ADAPTER.parse(cursor.getBlob(i74));
                                                                        int i75 = i8 + 14;
                                                                        conversation.additional.previewTexts = cursor.isNull(i75) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i75));
                                                                        int i76 = i8 + 15;
                                                                        conversation.additional.greetingInfo = cursor.isNull(i76) ? null : GreetingInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i76));
                                                                        int i77 = i8 + 16;
                                                                        conversation.additional.fateRadar = cursor.isNull(i77) ? null : ConversationAdditionalFateRadar.PROTOBUF_ADAPTER.parse(cursor.getBlob(i77));
                                                                        boolean z = true;
                                                                        if (cursor.getInt(i8 + 17) != 1) {
                                                                            z = false;
                                                                        }
                                                                        conversation.isFake = z;
                                                                        int i78 = i8 + 18;
                                                                        conversation.additional.lowPayOneside = cursor.isNull(i78) ? null : LowPayOneside.PROTOBUF_ADAPTER.parse(cursor.getBlob(i78));
                                                                        int i79 = i8 + 19;
                                                                        conversation.additional.matchInfo = cursor.isNull(i79) ? null : ConvAdditionalMatchInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i79));
                                                                        int i80 = i8;
                                                                        conversation.additional.newMatch.labelExposureTime = cursor.getDouble(i8 + 20);
                                                                        int i81 = i80 + 21;
                                                                        conversation.additional.loveLetter = cursor.isNull(i81) ? null : ConvAdditionalLoveLetter.PROTOBUF_ADAPTER.parse(cursor.getBlob(i81));
                                                                        conversation.localIsLimitedTrialSee = cursor.getInt(i80 + 22);
                                                                        int i82 = i80 + 23;
                                                                        conversation.additional.chatMM = cursor.isNull(i82) ? null : ChatMM.PROTOBUF_ADAPTER.parse(cursor.getBlob(i82));
                                                                        int i83 = i80 + 24;
                                                                        conversation.additional.blackList = cursor.isNull(i83) ? null : BlackList.PROTOBUF_ADAPTER.parse(cursor.getBlob(i83));
                                                                        int i84 = i80 + 25;
                                                                        conversation.additional.messageRelate = cursor.isNull(i84) ? null : MessageRelate.PROTOBUF_ADAPTER.parse(cursor.getBlob(i84));
                                                                        int i85 = i80 + 26;
                                                                        conversation.additional.compliment = cursor.isNull(i85) ? null : ConvAdditionalCompliment.PROTOBUF_ADAPTER.parse(cursor.getBlob(i85));
                                                                        int i86 = i80 + 27;
                                                                        conversation.additional.swiper = cursor.isNull(i86) ? null : ConvAdditionalSwiper.PROTOBUF_ADAPTER.parse(cursor.getBlob(i86));
                                                                        this.readIndex = i80 + 28;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        list = list2;
                                                                        i2 = i2;
                                                                        string6 = string5;
                                                                        MessageNano.reportError(e, cursor);
                                                                        string5 = string6;
                                                                        i2 = i2;
                                                                        list2 = list;
                                                                    }
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    string6 = string6;
                                                                }
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                string4 = "unknown_";
                                                                string6 = string4;
                                                                list = list2;
                                                                i2 = i2;
                                                                string6 = string5;
                                                                MessageNano.reportError(e, cursor);
                                                                string5 = string6;
                                                                i2 = i2;
                                                                list2 = list;
                                                                int i87 = i7;
                                                                String str = string3;
                                                                String str2 = string4;
                                                                String str3 = string6;
                                                                conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                                                                tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                                                                conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i87);
                                                                tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                                                                conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                                                                tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                                                                conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str, i5);
                                                                tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                                                                conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str2, i6);
                                                                if (conversation.localBusinessTypes == null) {
                                                                    conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                                                }
                                                                tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                                                                conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str3, i3);
                                                                if (conversation.read == null) {
                                                                    conversation.read = Boolean.FALSE;
                                                                }
                                                                if (conversation.otherUser == null) {
                                                                    conversation.otherUser = "";
                                                                }
                                                                if (conversation.localNotificationStatus == null) {
                                                                    conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                                                                }
                                                                if (conversation.importance == null) {
                                                                    conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                                                                }
                                                                if (conversation.status == null) {
                                                                    conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                                                                }
                                                                if (conversation.subtype == null) {
                                                                    conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                                                                }
                                                                if (conversation.myTalk == null) {
                                                                    conversation.myTalk = TalkInfo.new_();
                                                                }
                                                                if (conversation.otherTalk == null) {
                                                                    conversation.otherTalk = TalkInfo.new_();
                                                                }
                                                                if (conversation.additional == null) {
                                                                    conversation.additional = ConversationAdditional.new_();
                                                                }
                                                                if (conversation.convType == null) {
                                                                    conversation.convType = "";
                                                                }
                                                                if (conversation.property == null) {
                                                                    conversation.property = ConversationProperty.new_();
                                                                }
                                                                if (conversation.heat == null) {
                                                                    conversation.heat = FriendHeatScore.new_();
                                                                }
                                                                if (conversation.localBusinessTypes == null) {
                                                                    conversation.localBusinessTypes = new ArrayList();
                                                                }
                                                                if (conversation.group == null) {
                                                                    conversation.group = ConversationGroupProperty.new_();
                                                                }
                                                                if (conversation.localPlaceBan == null) {
                                                                    conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                                                                }
                                                                if (conversation.localNotifyMomentId == null) {
                                                                    conversation.localNotifyMomentId = "";
                                                                }
                                                                if (conversation.localInsertedMomentId == null) {
                                                                    conversation.localInsertedMomentId = "";
                                                                }
                                                                if (conversation.otherStatus == null) {
                                                                    conversation.otherStatus = "";
                                                                }
                                                                return conversation;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            string3 = "unknown_";
                                                            string4 = string3;
                                                            string6 = string4;
                                                            list = list2;
                                                            i2 = i2;
                                                            string6 = string5;
                                                            MessageNano.reportError(e, cursor);
                                                            string5 = string6;
                                                            i2 = i2;
                                                            list2 = list;
                                                            int i88 = i7;
                                                            String str4 = string3;
                                                            String str5 = string4;
                                                            String str6 = string6;
                                                            conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                                                            tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                                                            conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i88);
                                                            tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                                                            conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                                                            tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                                                            conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str4, i5);
                                                            tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                                                            conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str5, i6);
                                                            if (conversation.localBusinessTypes == null) {
                                                                conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                                            }
                                                            tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                                                            conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str6, i3);
                                                            if (conversation.read == null) {
                                                                conversation.read = Boolean.FALSE;
                                                            }
                                                            if (conversation.otherUser == null) {
                                                                conversation.otherUser = "";
                                                            }
                                                            if (conversation.localNotificationStatus == null) {
                                                                conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                                                            }
                                                            if (conversation.importance == null) {
                                                                conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                                                            }
                                                            if (conversation.status == null) {
                                                                conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                                                            }
                                                            if (conversation.subtype == null) {
                                                                conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                                                            }
                                                            if (conversation.myTalk == null) {
                                                                conversation.myTalk = TalkInfo.new_();
                                                            }
                                                            if (conversation.otherTalk == null) {
                                                                conversation.otherTalk = TalkInfo.new_();
                                                            }
                                                            if (conversation.additional == null) {
                                                                conversation.additional = ConversationAdditional.new_();
                                                            }
                                                            if (conversation.convType == null) {
                                                                conversation.convType = "";
                                                            }
                                                            if (conversation.property == null) {
                                                                conversation.property = ConversationProperty.new_();
                                                            }
                                                            if (conversation.heat == null) {
                                                                conversation.heat = FriendHeatScore.new_();
                                                            }
                                                            if (conversation.localBusinessTypes == null) {
                                                                conversation.localBusinessTypes = new ArrayList();
                                                            }
                                                            if (conversation.group == null) {
                                                                conversation.group = ConversationGroupProperty.new_();
                                                            }
                                                            if (conversation.localPlaceBan == null) {
                                                                conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                                                            }
                                                            if (conversation.localNotifyMomentId == null) {
                                                                conversation.localNotifyMomentId = "";
                                                            }
                                                            if (conversation.localInsertedMomentId == null) {
                                                                conversation.localInsertedMomentId = "";
                                                            }
                                                            if (conversation.otherStatus == null) {
                                                                conversation.otherStatus = "";
                                                            }
                                                            return conversation;
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        string2 = "unknown_";
                                                        string3 = string2;
                                                        string4 = string3;
                                                        string6 = string4;
                                                        list = list2;
                                                        i2 = i2;
                                                        string6 = string5;
                                                        MessageNano.reportError(e, cursor);
                                                        string5 = string6;
                                                        i2 = i2;
                                                        list2 = list;
                                                        int i89 = i7;
                                                        String str7 = string3;
                                                        String str8 = string4;
                                                        String str9 = string6;
                                                        conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                                                        tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                                                        conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i89);
                                                        tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                                                        conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                                                        tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                                                        conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str7, i5);
                                                        tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                                                        conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str8, i6);
                                                        if (conversation.localBusinessTypes == null) {
                                                            conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                                        }
                                                        tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                                                        conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str9, i3);
                                                        if (conversation.read == null) {
                                                            conversation.read = Boolean.FALSE;
                                                        }
                                                        if (conversation.otherUser == null) {
                                                            conversation.otherUser = "";
                                                        }
                                                        if (conversation.localNotificationStatus == null) {
                                                            conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                                                        }
                                                        if (conversation.importance == null) {
                                                            conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                                                        }
                                                        if (conversation.status == null) {
                                                            conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                                                        }
                                                        if (conversation.subtype == null) {
                                                            conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                                                        }
                                                        if (conversation.myTalk == null) {
                                                            conversation.myTalk = TalkInfo.new_();
                                                        }
                                                        if (conversation.otherTalk == null) {
                                                            conversation.otherTalk = TalkInfo.new_();
                                                        }
                                                        if (conversation.additional == null) {
                                                            conversation.additional = ConversationAdditional.new_();
                                                        }
                                                        if (conversation.convType == null) {
                                                            conversation.convType = "";
                                                        }
                                                        if (conversation.property == null) {
                                                            conversation.property = ConversationProperty.new_();
                                                        }
                                                        if (conversation.heat == null) {
                                                            conversation.heat = FriendHeatScore.new_();
                                                        }
                                                        if (conversation.localBusinessTypes == null) {
                                                            conversation.localBusinessTypes = new ArrayList();
                                                        }
                                                        if (conversation.group == null) {
                                                            conversation.group = ConversationGroupProperty.new_();
                                                        }
                                                        if (conversation.localPlaceBan == null) {
                                                            conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                                                        }
                                                        if (conversation.localNotifyMomentId == null) {
                                                            conversation.localNotifyMomentId = "";
                                                        }
                                                        if (conversation.localInsertedMomentId == null) {
                                                            conversation.localInsertedMomentId = "";
                                                        }
                                                        if (conversation.otherStatus == null) {
                                                            conversation.otherStatus = "";
                                                        }
                                                        return conversation;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    string = "unknown_";
                                                    string2 = string;
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                string = "unknown_";
                                                string2 = string;
                                                string3 = string2;
                                                string4 = string3;
                                                string6 = string4;
                                                list = list2;
                                                i2 = i2;
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            string = "unknown_";
                                            string2 = string;
                                            string3 = string2;
                                            string4 = string3;
                                            string6 = string4;
                                            list = list2;
                                            i2 = i2;
                                            i3 = -1;
                                            MessageNano.reportError(e, cursor);
                                            string5 = string6;
                                            i2 = i2;
                                            list2 = list;
                                            int i810 = i7;
                                            String str10 = string3;
                                            String str11 = string4;
                                            String str12 = string6;
                                            conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                                            tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                                            conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i810);
                                            tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                                            conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                                            tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                                            conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str10, i5);
                                            tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                                            conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str11, i6);
                                            if (conversation.localBusinessTypes == null) {
                                                conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                            }
                                            tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                                            conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str12, i3);
                                            if (conversation.read == null) {
                                                conversation.read = Boolean.FALSE;
                                            }
                                            if (conversation.otherUser == null) {
                                                conversation.otherUser = "";
                                            }
                                            if (conversation.localNotificationStatus == null) {
                                                conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                                            }
                                            if (conversation.importance == null) {
                                                conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                                            }
                                            if (conversation.status == null) {
                                                conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                                            }
                                            if (conversation.subtype == null) {
                                                conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                                            }
                                            if (conversation.myTalk == null) {
                                                conversation.myTalk = TalkInfo.new_();
                                            }
                                            if (conversation.otherTalk == null) {
                                                conversation.otherTalk = TalkInfo.new_();
                                            }
                                            if (conversation.additional == null) {
                                                conversation.additional = ConversationAdditional.new_();
                                            }
                                            if (conversation.convType == null) {
                                                conversation.convType = "";
                                            }
                                            if (conversation.property == null) {
                                                conversation.property = ConversationProperty.new_();
                                            }
                                            if (conversation.heat == null) {
                                                conversation.heat = FriendHeatScore.new_();
                                            }
                                            if (conversation.localBusinessTypes == null) {
                                                conversation.localBusinessTypes = new ArrayList();
                                            }
                                            if (conversation.group == null) {
                                                conversation.group = ConversationGroupProperty.new_();
                                            }
                                            if (conversation.localPlaceBan == null) {
                                                conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                                            }
                                            if (conversation.localNotifyMomentId == null) {
                                                conversation.localNotifyMomentId = "";
                                            }
                                            if (conversation.localInsertedMomentId == null) {
                                                conversation.localInsertedMomentId = "";
                                            }
                                            if (conversation.otherStatus == null) {
                                                conversation.otherStatus = "";
                                            }
                                            return conversation;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        i7 = i7;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    i7 = i7;
                                    string = "unknown_";
                                    string2 = string;
                                    string3 = string2;
                                    string4 = string3;
                                    string6 = string4;
                                    i2 = i2;
                                    i3 = -1;
                                    list = null;
                                    MessageNano.reportError(e, cursor);
                                    string5 = string6;
                                    i2 = i2;
                                    list2 = list;
                                    int i811 = i7;
                                    String str13 = string3;
                                    String str14 = string4;
                                    String str15 = string6;
                                    conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                                    tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                                    conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i811);
                                    tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                                    conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                                    tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                                    conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str13, i5);
                                    tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                                    conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str14, i6);
                                    if (conversation.localBusinessTypes == null) {
                                        conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                    }
                                    tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                                    conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str15, i3);
                                    if (conversation.read == null) {
                                        conversation.read = Boolean.FALSE;
                                    }
                                    if (conversation.otherUser == null) {
                                        conversation.otherUser = "";
                                    }
                                    if (conversation.localNotificationStatus == null) {
                                        conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                                    }
                                    if (conversation.importance == null) {
                                        conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                                    }
                                    if (conversation.status == null) {
                                        conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                                    }
                                    if (conversation.subtype == null) {
                                        conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                                    }
                                    if (conversation.myTalk == null) {
                                        conversation.myTalk = TalkInfo.new_();
                                    }
                                    if (conversation.otherTalk == null) {
                                        conversation.otherTalk = TalkInfo.new_();
                                    }
                                    if (conversation.additional == null) {
                                        conversation.additional = ConversationAdditional.new_();
                                    }
                                    if (conversation.convType == null) {
                                        conversation.convType = "";
                                    }
                                    if (conversation.property == null) {
                                        conversation.property = ConversationProperty.new_();
                                    }
                                    if (conversation.heat == null) {
                                        conversation.heat = FriendHeatScore.new_();
                                    }
                                    if (conversation.localBusinessTypes == null) {
                                        conversation.localBusinessTypes = new ArrayList();
                                    }
                                    if (conversation.group == null) {
                                        conversation.group = ConversationGroupProperty.new_();
                                    }
                                    if (conversation.localPlaceBan == null) {
                                        conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                                    }
                                    if (conversation.localNotifyMomentId == null) {
                                        conversation.localNotifyMomentId = "";
                                    }
                                    if (conversation.localInsertedMomentId == null) {
                                        conversation.localInsertedMomentId = "";
                                    }
                                    if (conversation.otherStatus == null) {
                                        conversation.otherStatus = "";
                                    }
                                    return conversation;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                i7 = i7;
                                string = "unknown_";
                                string2 = string;
                                string3 = string2;
                                string4 = string3;
                                string6 = string4;
                                i2 = i2;
                                i3 = -1;
                                i6 = -1;
                                list = null;
                                MessageNano.reportError(e, cursor);
                                string5 = string6;
                                i2 = i2;
                                list2 = list;
                                int i812 = i7;
                                String str16 = string3;
                                String str17 = string4;
                                String str18 = string6;
                                conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                                tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                                conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i812);
                                tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                                conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                                tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                                conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str16, i5);
                                tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                                conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str17, i6);
                                if (conversation.localBusinessTypes == null) {
                                    conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                }
                                tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                                conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str18, i3);
                                if (conversation.read == null) {
                                    conversation.read = Boolean.FALSE;
                                }
                                if (conversation.otherUser == null) {
                                    conversation.otherUser = "";
                                }
                                if (conversation.localNotificationStatus == null) {
                                    conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                                }
                                if (conversation.importance == null) {
                                    conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                                }
                                if (conversation.status == null) {
                                    conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                                }
                                if (conversation.subtype == null) {
                                    conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                                }
                                if (conversation.myTalk == null) {
                                    conversation.myTalk = TalkInfo.new_();
                                }
                                if (conversation.otherTalk == null) {
                                    conversation.otherTalk = TalkInfo.new_();
                                }
                                if (conversation.additional == null) {
                                    conversation.additional = ConversationAdditional.new_();
                                }
                                if (conversation.convType == null) {
                                    conversation.convType = "";
                                }
                                if (conversation.property == null) {
                                    conversation.property = ConversationProperty.new_();
                                }
                                if (conversation.heat == null) {
                                    conversation.heat = FriendHeatScore.new_();
                                }
                                if (conversation.localBusinessTypes == null) {
                                    conversation.localBusinessTypes = new ArrayList();
                                }
                                if (conversation.group == null) {
                                    conversation.group = ConversationGroupProperty.new_();
                                }
                                if (conversation.localPlaceBan == null) {
                                    conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                                }
                                if (conversation.localNotifyMomentId == null) {
                                    conversation.localNotifyMomentId = "";
                                }
                                if (conversation.localInsertedMomentId == null) {
                                    conversation.localInsertedMomentId = "";
                                }
                                if (conversation.otherStatus == null) {
                                    conversation.otherStatus = "";
                                }
                                return conversation;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            string = "unknown_";
                            string2 = string;
                            string3 = string2;
                            string4 = string3;
                            string6 = string4;
                            i3 = -1;
                            i5 = -1;
                            i6 = -1;
                            list = null;
                            MessageNano.reportError(e, cursor);
                            string5 = string6;
                            i2 = i2;
                            list2 = list;
                            int i813 = i7;
                            String str19 = string3;
                            String str110 = string4;
                            String str111 = string6;
                            conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                            tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                            conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i813);
                            tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                            conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                            tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                            conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str19, i5);
                            tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                            conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str110, i6);
                            if (conversation.localBusinessTypes == null) {
                                conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                            }
                            tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                            conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str111, i3);
                            if (conversation.read == null) {
                                conversation.read = Boolean.FALSE;
                            }
                            if (conversation.otherUser == null) {
                                conversation.otherUser = "";
                            }
                            if (conversation.localNotificationStatus == null) {
                                conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                            }
                            if (conversation.importance == null) {
                                conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                            }
                            if (conversation.status == null) {
                                conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                            }
                            if (conversation.subtype == null) {
                                conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                            }
                            if (conversation.myTalk == null) {
                                conversation.myTalk = TalkInfo.new_();
                            }
                            if (conversation.otherTalk == null) {
                                conversation.otherTalk = TalkInfo.new_();
                            }
                            if (conversation.additional == null) {
                                conversation.additional = ConversationAdditional.new_();
                            }
                            if (conversation.convType == null) {
                                conversation.convType = "";
                            }
                            if (conversation.property == null) {
                                conversation.property = ConversationProperty.new_();
                            }
                            if (conversation.heat == null) {
                                conversation.heat = FriendHeatScore.new_();
                            }
                            if (conversation.localBusinessTypes == null) {
                                conversation.localBusinessTypes = new ArrayList();
                            }
                            if (conversation.group == null) {
                                conversation.group = ConversationGroupProperty.new_();
                            }
                            if (conversation.localPlaceBan == null) {
                                conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                            }
                            if (conversation.localNotifyMomentId == null) {
                                conversation.localNotifyMomentId = "";
                            }
                            if (conversation.localInsertedMomentId == null) {
                                conversation.localInsertedMomentId = "";
                            }
                            if (conversation.otherStatus == null) {
                                conversation.otherStatus = "";
                            }
                            return conversation;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        string = "unknown_";
                        string2 = string;
                        string3 = string2;
                        string4 = string3;
                        string6 = string4;
                        i3 = -1;
                        i4 = -1;
                    }
                } catch (Exception e14) {
                    e = e14;
                    string = "unknown_";
                    string2 = string;
                    string3 = string2;
                    string4 = string3;
                    string6 = string4;
                    i2 = i2;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = -1;
                    list = null;
                    i7 = -1;
                    MessageNano.reportError(e, cursor);
                    string5 = string6;
                    i2 = i2;
                    list2 = list;
                    int i814 = i7;
                    String str112 = string3;
                    String str113 = string4;
                    String str114 = string6;
                    conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
                    tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
                    conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i814);
                    tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
                    conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                    tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
                    conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str112, i5);
                    tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
                    conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str113, i6);
                    if (conversation.localBusinessTypes == null) {
                        conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                    }
                    tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
                    conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str114, i3);
                    if (conversation.read == null) {
                        conversation.read = Boolean.FALSE;
                    }
                    if (conversation.otherUser == null) {
                        conversation.otherUser = "";
                    }
                    if (conversation.localNotificationStatus == null) {
                        conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
                    }
                    if (conversation.importance == null) {
                        conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
                    }
                    if (conversation.status == null) {
                        conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
                    }
                    if (conversation.subtype == null) {
                        conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
                    }
                    if (conversation.myTalk == null) {
                        conversation.myTalk = TalkInfo.new_();
                    }
                    if (conversation.otherTalk == null) {
                        conversation.otherTalk = TalkInfo.new_();
                    }
                    if (conversation.additional == null) {
                        conversation.additional = ConversationAdditional.new_();
                    }
                    if (conversation.convType == null) {
                        conversation.convType = "";
                    }
                    if (conversation.property == null) {
                        conversation.property = ConversationProperty.new_();
                    }
                    if (conversation.heat == null) {
                        conversation.heat = FriendHeatScore.new_();
                    }
                    if (conversation.localBusinessTypes == null) {
                        conversation.localBusinessTypes = new ArrayList();
                    }
                    if (conversation.group == null) {
                        conversation.group = ConversationGroupProperty.new_();
                    }
                    if (conversation.localPlaceBan == null) {
                        conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
                    }
                    if (conversation.localNotifyMomentId == null) {
                        conversation.localNotifyMomentId = "";
                    }
                    if (conversation.localInsertedMomentId == null) {
                        conversation.localInsertedMomentId = "";
                    }
                    if (conversation.otherStatus == null) {
                        conversation.otherStatus = "";
                    }
                    return conversation;
                }
            } catch (Exception e15) {
                e = e15;
                string = "unknown_";
                string2 = string;
                string3 = string2;
                string4 = string3;
                string6 = string4;
                i2 = -1;
            }
            int i815 = i7;
            String str115 = string3;
            String str116 = string4;
            String str117 = string6;
            conversation.localMatchFrom = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(string5, i2);
            tEnumJsonAdapter = NotificationStatus.JSON_ADAPTER;
            conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.newTEnum(string, i815);
            tEnumJsonAdapter2 = StickStatus.JSON_ADAPTER;
            conversation.importance = (StickStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
            tEnumJsonAdapter3 = ConversationStatus.JSON_ADAPTER;
            conversation.status = (ConversationStatus) tEnumJsonAdapter3.newTEnum(str115, i5);
            tEnumJsonAdapter4 = ConversationType.JSON_ADAPTER;
            conversation.subtype = (ConversationType) tEnumJsonAdapter4.newTEnum(str116, i6);
            if (conversation.localBusinessTypes == null && list2 != null) {
                conversation.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
            }
            tEnumJsonAdapter5 = LocalPlaceBan.JSON_ADAPTER;
            conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.newTEnum(str117, i3);
            if (conversation.read == null) {
                conversation.read = Boolean.FALSE;
            }
            if (conversation.otherUser == null) {
                conversation.otherUser = "";
            }
            if (conversation.localNotificationStatus == null) {
                conversation.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter.defaultEnum();
            }
            if (conversation.importance == null) {
                conversation.importance = (StickStatus) tEnumJsonAdapter2.defaultEnum();
            }
            if (conversation.status == null) {
                conversation.status = (ConversationStatus) tEnumJsonAdapter3.defaultEnum();
            }
            if (conversation.subtype == null) {
                conversation.subtype = (ConversationType) tEnumJsonAdapter4.defaultEnum();
            }
            if (conversation.myTalk == null) {
                conversation.myTalk = TalkInfo.new_();
            }
            if (conversation.otherTalk == null) {
                conversation.otherTalk = TalkInfo.new_();
            }
            if (conversation.additional == null) {
                conversation.additional = ConversationAdditional.new_();
            }
            if (conversation.convType == null) {
                conversation.convType = "";
            }
            if (conversation.property == null) {
                conversation.property = ConversationProperty.new_();
            }
            if (conversation.heat == null) {
                conversation.heat = FriendHeatScore.new_();
            }
            if (conversation.localBusinessTypes == null) {
                conversation.localBusinessTypes = new ArrayList();
            }
            if (conversation.group == null) {
                conversation.group = ConversationGroupProperty.new_();
            }
            if (conversation.localPlaceBan == null) {
                conversation.localPlaceBan = (LocalPlaceBan) tEnumJsonAdapter5.defaultEnum();
            }
            if (conversation.localNotifyMomentId == null) {
                conversation.localNotifyMomentId = "";
            }
            if (conversation.localInsertedMomentId == null) {
                conversation.localInsertedMomentId = "";
            }
            if (conversation.otherStatus == null) {
                conversation.otherStatus = "";
            }
            return conversation;
        }

        @Override // p149l.mrf0
        public void write(Conversation conversation, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", conversation.f56011id);
                DbObject.cvPut(contentValues, "localHasMessage_c", Integer.valueOf(conversation.localHasMessage ? 1 : 0));
                Boolean bool = conversation.read;
                DbObject.cvPut(contentValues, "read_c", bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0));
                DbObject.cvPut(contentValues, "otherUser_c", conversation.otherUser);
                DbObject.cvPut(contentValues, "readUntil_c", conversation.readUntil);
                DbObject.cvPut(contentValues, "latestTime_c", Double.valueOf(conversation.latestTime));
                DbObject.cvPut(contentValues, "createdTime_c", Double.valueOf(conversation.createdTime));
                MatchFrom matchFrom = conversation.localMatchFrom;
                DbObject.cvPut(contentValues, "str_localMatchFrom_c", matchFrom == null ? null : matchFrom.toString());
                MatchFrom matchFrom2 = conversation.localMatchFrom;
                DbObject.cvPut(contentValues, "localMatchFrom_c", matchFrom2 == null ? null : Integer.valueOf(matchFrom2.ordinal()));
                NotificationStatus notificationStatus = conversation.localNotificationStatus;
                DbObject.cvPut(contentValues, "str_localNotificationStatus_c", notificationStatus == null ? null : notificationStatus.toString());
                NotificationStatus notificationStatus2 = conversation.localNotificationStatus;
                DbObject.cvPut(contentValues, "localNotificationStatus_c", notificationStatus2 == null ? null : Integer.valueOf(notificationStatus2.ordinal()));
                DbObject.cvPut(contentValues, "localBotheringTime_c", Double.valueOf(conversation.localBotheringTime));
                DbObject.cvPut(contentValues, "scenarios_c", conversation.scenarios == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(conversation.scenarios));
                DbObject.cvPut(contentValues, "localActiveTime_c", Double.valueOf(conversation.localActiveTime));
                DbObject.cvPut(contentValues, "unreadMessages_c", Integer.valueOf(conversation.unreadMessages));
                DbObject.cvPut(contentValues, "localEverHasMessage_c", Integer.valueOf(conversation.localEverHasMessage ? 1 : 0));
                Reminder reminder = conversation.reminder;
                DbObject.cvPut(contentValues, "reminder_c", reminder == null ? null : Reminder.PROTOBUF_ADAPTER.serialize(reminder));
                DbObject.cvPut(contentValues, "localUserUpdatedTime_c", Double.valueOf(conversation.localUserUpdatedTime));
                StickStatus stickStatus = conversation.importance;
                DbObject.cvPut(contentValues, "str_importance_c", stickStatus == null ? null : stickStatus.toString());
                StickStatus stickStatus2 = conversation.importance;
                DbObject.cvPut(contentValues, "importance_c", stickStatus2 == null ? null : Integer.valueOf(stickStatus2.ordinal()));
                DbObject.cvPut(contentValues, "localOnlineTabClick_c", conversation.localOnlineTabClick);
                DbObject.cvPut(contentValues, "follow_c", Integer.valueOf(conversation.follow ? 1 : 0));
                DbObject.cvPut(contentValues, "localBotherWxTime_c", Double.valueOf(conversation.localBotherWxTime));
                DbObject.cvPut(contentValues, "localBotherCodeTime_c", Double.valueOf(conversation.localBotherCodeTime));
                DbObject.cvPut(contentValues, "clearedUntil_c", conversation.clearedUntil);
                ConversationStatus conversationStatus = conversation.status;
                DbObject.cvPut(contentValues, "str_status_c", conversationStatus == null ? null : conversationStatus.toString());
                ConversationStatus conversationStatus2 = conversation.status;
                DbObject.cvPut(contentValues, "status_c", conversationStatus2 == null ? null : Integer.valueOf(conversationStatus2.ordinal()));
                DbObject.cvPut(contentValues, "place_c", conversation.place);
                ConversationType conversationType = conversation.subtype;
                DbObject.cvPut(contentValues, "str_subtype_c", conversationType == null ? null : conversationType.toString());
                ConversationType conversationType2 = conversation.subtype;
                DbObject.cvPut(contentValues, "subtype_c", conversationType2 == null ? null : Integer.valueOf(conversationType2.ordinal()));
                TalkInfo talkInfo = conversation.myTalk;
                DbObject.cvPut(contentValues, "myTalk_c", talkInfo == null ? null : TalkInfo.PROTOBUF_ADAPTER.serialize(talkInfo));
                TalkInfo talkInfo2 = conversation.otherTalk;
                DbObject.cvPut(contentValues, "otherTalk_c", talkInfo2 == null ? null : TalkInfo.PROTOBUF_ADAPTER.serialize(talkInfo2));
                DbObject.cvPut(contentValues, "otherReadUntil_c", conversation.otherReadUntil);
                DbObject.cvPut(contentValues, "enterTimes_c", Integer.valueOf(conversation.enterTimes));
                DbObject.cvPut(contentValues, "updatedTime_c", Double.valueOf(conversation.updatedTime));
                DbObject.cvPut(contentValues, "unmatchConversation_c", Integer.valueOf(conversation.unmatchConversation ? 1 : 0));
                DbObject.cvPut(contentValues, "remainedTime_c", Long.valueOf(conversation.remainedTime));
                DbObject.cvPut(contentValues, "localSafetyReminderTime_c", Double.valueOf(conversation.localSafetyReminderTime));
                DbObject.cvPut(contentValues, "localSpoofingReminderTime_c", Double.valueOf(conversation.localSpoofingReminderTime));
                DbObject.cvPut(contentValues, "forceSend_c", Integer.valueOf(conversation.forceSend ? 1 : 0));
                DbObject.cvPut(contentValues, "conversationUserDistance_c", Integer.valueOf(conversation.conversationUserDistance));
                DbObject.cvPut(contentValues, "conversationUserUpdatedTime_c", Double.valueOf(conversation.conversationUserUpdatedTime));
                DbObject.cvPut(contentValues, "level_c", Integer.valueOf(conversation.level));
                DbObject.cvPut(contentValues, "additional_quickChat_avatarBlurred_c", Integer.valueOf(conversation.additional.quickChat.avatarBlurred ? 1 : 0));
                DbObject.cvPut(contentValues, "additional_voiceCall_rejectedTime_c", conversation.additional.voiceCall.rejectedTime);
                DbObject.cvPut(contentValues, "additional_voiceCall_acceptedTime_c", conversation.additional.voiceCall.acceptedTime);
                DbObject.cvPut(contentValues, "additional_timeLimited_expiredTimestamp_c", Long.valueOf(conversation.additional.timeLimited.expiredTimestamp));
                DbObject.cvPut(contentValues, "additional_timeLimited_participate_c", conversation.additional.timeLimited.participate);
                DbObject.cvPut(contentValues, "additional_timeLimited_allowExtension_c", Integer.valueOf(conversation.additional.timeLimited.allowExtension ? 1 : 0));
                DbObject.cvPut(contentValues, "additional_timeLimited_extensionOperator_c", conversation.additional.timeLimited.extensionOperator);
                DbObject.cvPut(contentValues, "convType_c", conversation.convType);
                ConversationProperty conversationProperty = conversation.property;
                DbObject.cvPut(contentValues, "property_c", conversationProperty == null ? null : ConversationProperty.PROTOBUF_ADAPTER.serialize(conversationProperty));
                DbObject.cvPut(contentValues, "userMessageCount_c", Integer.valueOf(conversation.userMessageCount));
                DbObject.cvPut(contentValues, "latestFriendCommentCreatedTime_c", Double.valueOf(conversation.latestFriendCommentCreatedTime));
                DbObject.cvPut(contentValues, "heat_orderScore_c", Integer.valueOf(conversation.heat.orderScore));
                DbObject.cvPut(contentValues, "heat_showScore_c", Integer.valueOf(conversation.heat.showScore));
                DbObject.cvPut(contentValues, "heat_marks_c", conversation.heat.marks);
                DbObject.cvPut(contentValues, "heat_mm_c", Integer.valueOf(conversation.heat.f20394mm));
                DbObject.cvPut(contentValues, "heat_score_c", Integer.valueOf(conversation.heat.score));
                DbObject.cvPut(contentValues, "localBusinessTypes_c", conversation.localBusinessTypes == null ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(LocalBusinessType.covertToOldEnumList(conversation.localBusinessTypes)));
                Boolean bool2 = conversation.additional.oneSideNoMatch.selfSend;
                DbObject.cvPut(contentValues, "additional_oneSideNoMatch_selfSend_c", bool2 == null ? null : Integer.valueOf(bool2.booleanValue() ? 1 : 0));
                DbObject.cvPut(contentValues, "localGreetDelete_c", Integer.valueOf(conversation.localGreetDelete ? 1 : 0));
                DbObject.cvPut(contentValues, "additional_timeLimited_hidden_c", Integer.valueOf(conversation.additional.timeLimited.hidden ? 1 : 0));
                DbObject.cvPut(contentValues, "additional_timeLimited_newConversation_c", Integer.valueOf(conversation.additional.timeLimited.newConversation ? 1 : 0));
                DbObject.cvPut(contentValues, "additional_timeLimited_expiredSeconds_c", Long.valueOf(conversation.additional.timeLimited.expiredSeconds));
                DbObject.cvPut(contentValues, "suggestionScore_c", Double.valueOf(conversation.suggestionScore));
                DbObject.cvPut(contentValues, "localBotherStatus_c", Integer.valueOf(conversation.localBotherStatus));
                DbObject.cvPut(contentValues, "muted_c", Integer.valueOf(conversation.muted ? 1 : 0));
                DbObject.cvPut(contentValues, "group_latestNotificationMsgId_c", conversation.group.latestNotificationMsgId);
                DbObject.cvPut(contentValues, "group_joinedTime_c", Double.valueOf(conversation.group.joinedTime));
                ConversationAdditionalOneSide conversationAdditionalOneSide = conversation.additional.oneSide;
                DbObject.cvPut(contentValues, "additional_oneSide_c", conversationAdditionalOneSide == null ? null : ConversationAdditionalOneSide.PROTOBUF_ADAPTER.serialize(conversationAdditionalOneSide));
                DbObject.cvPut(contentValues, "localDraft_c", conversation.localDraft);
                DbObject.cvPut(contentValues, "localChatBg_c", conversation.localChatBg == null ? null : Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(conversation.localChatBg));
                LocalPlaceBan localPlaceBan = conversation.localPlaceBan;
                DbObject.cvPut(contentValues, "str_localPlaceBan_c", localPlaceBan == null ? null : localPlaceBan.toString());
                LocalPlaceBan localPlaceBan2 = conversation.localPlaceBan;
                DbObject.cvPut(contentValues, "localPlaceBan_c", localPlaceBan2 == null ? null : Integer.valueOf(localPlaceBan2.ordinal()));
                DbObject.cvPut(contentValues, "additional_kankan_contents_c", conversation.additional.kankan.contents == null ? null : ConversationAdditionalKanKanContentIdWrapper.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(conversation.additional.kankan.contents));
                DbObject.cvPut(contentValues, "additional_kankan_resonance_c", conversation.additional.kankan.resonance);
                DbObject.cvPut(contentValues, "additional_kankan_greetingSummaryDetail_unseen_c", Integer.valueOf(conversation.additional.kankan.greetingSummaryDetail.unseen));
                DbObject.cvPut(contentValues, "additional_kankan_greetingSummaryDetail_latestTime_c", Double.valueOf(conversation.additional.kankan.greetingSummaryDetail.latestTime));
                DbObject.cvPut(contentValues, "additional_kankan_greetingSummaryDetail_latestUserId_c", conversation.additional.kankan.greetingSummaryDetail.latestUserId);
                DbObject.cvPut(contentValues, "additional_kankan_greetingSummaryDetail_latestMessageId_c", conversation.additional.kankan.greetingSummaryDetail.latestMessageId);
                DbObject.cvPut(contentValues, "additional_quickChat_bell_isInitiator_c", Integer.valueOf(conversation.additional.quickChat.bell.isInitiator ? 1 : 0));
                DbObject.cvPut(contentValues, "additional_quickChat_bell_agree_c", Integer.valueOf(conversation.additional.quickChat.bell.agree ? 1 : 0));
                DbObject.cvPut(contentValues, "localMessageInsertReportHint_c", conversation.localMessageInsertReportHint);
                DbObject.cvPut(contentValues, "localNotifyMomentId_c", conversation.localNotifyMomentId);
                DbObject.cvPut(contentValues, "localInsertedMomentId_c", conversation.localInsertedMomentId);
                DbObject.cvPut(contentValues, "mm_c", Integer.valueOf(conversation.f20374mm));
                DbObject.cvPut(contentValues, "additional_quickChat_expire_c", Double.valueOf(conversation.additional.quickChat.expire));
                DbObject.cvPut(contentValues, "str_localBusinessTypes_c", conversation.localBusinessTypes == null ? null : LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(conversation.localBusinessTypes));
                DbObject.cvPut(contentValues, "intimacy_c", Integer.valueOf(conversation.intimacy));
                DbObject.cvPut(contentValues, "quickChatProgress_c", Integer.valueOf(conversation.quickChatProgress));
                DbObject.cvPut(contentValues, "group_source_c", conversation.group.source);
                DbObject.cvPut(contentValues, "additional_quickChat_progress_c", Integer.valueOf(conversation.additional.quickChat.progress));
                CoreFeedStateCounter coreFeedStateCounter = conversation.additional.feedStateCounter;
                DbObject.cvPut(contentValues, "additional_feedStateCounter_c", coreFeedStateCounter == null ? null : CoreFeedStateCounter.PROTOBUF_ADAPTER.serialize(coreFeedStateCounter));
                SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = conversation.additional.suggestedTimeLimitedMatch;
                DbObject.cvPut(contentValues, "additional_suggestedTimeLimitedMatch_c", suggestedTimeLimitedMatch == null ? null : SuggestedTimeLimitedMatch.PROTOBUF_ADAPTER.serialize(suggestedTimeLimitedMatch));
                DbObject.cvPut(contentValues, "additional_kankan_greetingSummaryDetail_iconURL_c", conversation.additional.kankan.greetingSummaryDetail.iconURL);
                DbObject.cvPut(contentValues, "additional_kankan_greetingSummaryDetail_title_c", conversation.additional.kankan.greetingSummaryDetail.title);
                DbObject.cvPut(contentValues, "additional_kankan_greetingSummaryDetail_subtitle_c", conversation.additional.kankan.greetingSummaryDetail.subtitle);
                HeartbeatMatch heartbeatMatch = conversation.additional.heartbeatMatch;
                DbObject.cvPut(contentValues, "additional_heartbeatMatch_c", heartbeatMatch == null ? null : HeartbeatMatch.PROTOBUF_ADAPTER.serialize(heartbeatMatch));
                DbObject.cvPut(contentValues, "hasLocalBreakIce_c", Integer.valueOf(conversation.hasLocalBreakIce ? 1 : 0));
                AvatarSummaryCounter avatarSummaryCounter = conversation.additional.avatarSummary;
                DbObject.cvPut(contentValues, "additional_avatarSummary_c", avatarSummaryCounter == null ? null : AvatarSummaryCounter.PROTOBUF_ADAPTER.serialize(avatarSummaryCounter));
                CoreInteractionMessageCounter coreInteractionMessageCounter = conversation.additional.feedInteractionCounter;
                DbObject.cvPut(contentValues, "additional_feedInteractionCounter_c", coreInteractionMessageCounter == null ? null : CoreInteractionMessageCounter.PROTOBUF_ADAPTER.serialize(coreInteractionMessageCounter));
                DbObject.cvPut(contentValues, "localSpoofingNewTime_c", Double.valueOf(conversation.localSpoofingNewTime));
                VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = conversation.additional.liveVirtualVoice;
                DbObject.cvPut(contentValues, "additional_liveVirtualVoice_c", virtualVoiceGroupConversationCell == null ? null : VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER.serialize(virtualVoiceGroupConversationCell));
                DbObject.cvPut(contentValues, "clearedTime_c", Double.valueOf(conversation.clearedTime));
                ConversationMomentInfo conversationMomentInfo = conversation.additional.localMomentInfo;
                DbObject.cvPut(contentValues, "additional_localMomentInfo_c", conversationMomentInfo == null ? null : ConversationMomentInfo.PROTOBUF_ADAPTER.serialize(conversationMomentInfo));
                DbObject.cvPut(contentValues, "localExtraInfo_c", conversation.localExtraInfo);
                DbObject.cvPut(contentValues, "lastActivityTime_c", Double.valueOf(conversation.lastActivityTime));
                LiveActivityConversation liveActivityConversation = conversation.additional.liveActivity;
                DbObject.cvPut(contentValues, "additional_liveActivity_c", liveActivityConversation == null ? null : LiveActivityConversation.PROTOBUF_ADAPTER.serialize(liveActivityConversation));
                ConversationGame conversationGame = conversation.additional.game;
                DbObject.cvPut(contentValues, "additional_game_c", conversationGame == null ? null : ConversationGame.PROTOBUF_ADAPTER.serialize(conversationGame));
                ConversationAdditionalTag conversationAdditionalTag = conversation.additional.tag;
                DbObject.cvPut(contentValues, "additional_tag_c", conversationAdditionalTag == null ? null : ConversationAdditionalTag.PROTOBUF_ADAPTER.serialize(conversationAdditionalTag));
                ConversationAdditionalChatAssistantQuestion conversationAdditionalChatAssistantQuestion = conversation.additional.chatAssistantQuestion;
                DbObject.cvPut(contentValues, "additional_chatAssistantQuestion_c", conversationAdditionalChatAssistantQuestion == null ? null : ConversationAdditionalChatAssistantQuestion.PROTOBUF_ADAPTER.serialize(conversationAdditionalChatAssistantQuestion));
                DbObject.cvPut(contentValues, "additional_quickChat_guideFakeToGood_c", Integer.valueOf(conversation.additional.quickChat.guideFakeToGood ? 1 : 0));
                DbObject.cvPut(contentValues, "otherStatus_c", conversation.otherStatus);
                ContinuousChat continuousChat = conversation.additional.continuousChat;
                DbObject.cvPut(contentValues, "additional_continuousChat_c", continuousChat == null ? null : ContinuousChat.PROTOBUF_ADAPTER.serialize(continuousChat));
                PlatinumPinChat platinumPinChat = conversation.additional.pinChat;
                DbObject.cvPut(contentValues, "additional_pinChat_c", platinumPinChat == null ? null : PlatinumPinChat.PROTOBUF_ADAPTER.serialize(platinumPinChat));
                ReSwipeInfo reSwipeInfo = conversation.additional.reSwipe;
                DbObject.cvPut(contentValues, "additional_reSwipe_c", reSwipeInfo == null ? null : ReSwipeInfo.PROTOBUF_ADAPTER.serialize(reSwipeInfo));
                GrowthConversationBlindBox growthConversationBlindBox = conversation.additional.blindbox;
                DbObject.cvPut(contentValues, "additional_blindbox_c", growthConversationBlindBox == null ? null : GrowthConversationBlindBox.PROTOBUF_ADAPTER.serialize(growthConversationBlindBox));
                DbObject.cvPut(contentValues, "additional_previewTexts_c", conversation.additional.previewTexts == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(conversation.additional.previewTexts));
                GreetingInfo greetingInfo = conversation.additional.greetingInfo;
                DbObject.cvPut(contentValues, "additional_greetingInfo_c", greetingInfo == null ? null : GreetingInfo.PROTOBUF_ADAPTER.serialize(greetingInfo));
                ConversationAdditionalFateRadar conversationAdditionalFateRadar = conversation.additional.fateRadar;
                DbObject.cvPut(contentValues, "additional_fateRadar_c", conversationAdditionalFateRadar == null ? null : ConversationAdditionalFateRadar.PROTOBUF_ADAPTER.serialize(conversationAdditionalFateRadar));
                DbObject.cvPut(contentValues, "isFake_c", Integer.valueOf(conversation.isFake ? 1 : 0));
                LowPayOneside lowPayOneside = conversation.additional.lowPayOneside;
                DbObject.cvPut(contentValues, "additional_lowPayOneside_c", lowPayOneside == null ? null : LowPayOneside.PROTOBUF_ADAPTER.serialize(lowPayOneside));
                ConvAdditionalMatchInfo convAdditionalMatchInfo = conversation.additional.matchInfo;
                DbObject.cvPut(contentValues, "additional_matchInfo_c", convAdditionalMatchInfo == null ? null : ConvAdditionalMatchInfo.PROTOBUF_ADAPTER.serialize(convAdditionalMatchInfo));
                DbObject.cvPut(contentValues, "additional_newMatch_labelExposureTime_c", Double.valueOf(conversation.additional.newMatch.labelExposureTime));
                ConvAdditionalLoveLetter convAdditionalLoveLetter = conversation.additional.loveLetter;
                DbObject.cvPut(contentValues, "additional_loveLetter_c", convAdditionalLoveLetter == null ? null : ConvAdditionalLoveLetter.PROTOBUF_ADAPTER.serialize(convAdditionalLoveLetter));
                DbObject.cvPut(contentValues, "localIsLimitedTrialSee_c", Integer.valueOf(conversation.localIsLimitedTrialSee));
                ChatMM chatMM = conversation.additional.chatMM;
                DbObject.cvPut(contentValues, "additional_chatMM_c", chatMM == null ? null : ChatMM.PROTOBUF_ADAPTER.serialize(chatMM));
                BlackList blackList = conversation.additional.blackList;
                DbObject.cvPut(contentValues, "additional_blackList_c", blackList == null ? null : BlackList.PROTOBUF_ADAPTER.serialize(blackList));
                MessageRelate messageRelate = conversation.additional.messageRelate;
                DbObject.cvPut(contentValues, "additional_messageRelate_c", messageRelate == null ? null : MessageRelate.PROTOBUF_ADAPTER.serialize(messageRelate));
                ConvAdditionalCompliment convAdditionalCompliment = conversation.additional.compliment;
                DbObject.cvPut(contentValues, "additional_compliment_c", convAdditionalCompliment == null ? null : ConvAdditionalCompliment.PROTOBUF_ADAPTER.serialize(convAdditionalCompliment));
                ConvAdditionalSwiper convAdditionalSwiper = conversation.additional.swiper;
                DbObject.cvPut(contentValues, "additional_swiper_c", convAdditionalSwiper == null ? null : ConvAdditionalSwiper.PROTOBUF_ADAPTER.serialize(convAdditionalSwiper));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35293a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ LocalBusinessType m35294b(LocalBusinessType localBusinessType) {
        return localBusinessType;
    }

    public static Conversation new_() {
        Conversation conversation = new Conversation();
        conversation.nullCheck();
        return conversation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Conversation mo223809clone() {
        Conversation conversation = new Conversation();
        conversation._id = this._id;
        conversation.f56011id = this.f56011id;
        conversation.localHasMessage = this.localHasMessage;
        PartialIdList partialIdList = this.api_only_messages;
        if (partialIdList != null) {
            conversation.api_only_messages = partialIdList.mo223809clone();
        }
        conversation.read = this.read;
        conversation.otherUser = this.otherUser;
        conversation.readUntil = this.readUntil;
        conversation.latestTime = this.latestTime;
        conversation.createdTime = this.createdTime;
        conversation.localMatchFrom = this.localMatchFrom;
        conversation.localNotificationStatus = this.localNotificationStatus;
        conversation.localBotheringTime = this.localBotheringTime;
        List<String> list = this.scenarios;
        if (list != null) {
            conversation.scenarios = ValueObject.util_map(list, new w9j() { // from class: l.m36
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Conversation.m35293a((String) obj);
                }
            });
        }
        conversation.localActiveTime = this.localActiveTime;
        conversation.unreadMessages = this.unreadMessages;
        conversation.localEverHasMessage = this.localEverHasMessage;
        Reminder reminder = this.reminder;
        if (reminder != null) {
            conversation.reminder = reminder.mo223809clone();
        }
        conversation.localUserUpdatedTime = this.localUserUpdatedTime;
        conversation.importance = this.importance;
        conversation.localOnlineTabClick = this.localOnlineTabClick;
        conversation.follow = this.follow;
        conversation.localBotherWxTime = this.localBotherWxTime;
        conversation.localBotherCodeTime = this.localBotherCodeTime;
        conversation.clearedUntil = this.clearedUntil;
        conversation.status = this.status;
        conversation.place = this.place;
        conversation.subtype = this.subtype;
        TalkInfo talkInfo = this.myTalk;
        if (talkInfo != null) {
            conversation.myTalk = talkInfo.mo223809clone();
        }
        TalkInfo talkInfo2 = this.otherTalk;
        if (talkInfo2 != null) {
            conversation.otherTalk = talkInfo2.mo223809clone();
        }
        conversation.otherReadUntil = this.otherReadUntil;
        conversation.enterTimes = this.enterTimes;
        conversation.updatedTime = this.updatedTime;
        conversation.unmatchConversation = this.unmatchConversation;
        conversation.remainedTime = this.remainedTime;
        conversation.localSafetyReminderTime = this.localSafetyReminderTime;
        conversation.localSpoofingReminderTime = this.localSpoofingReminderTime;
        conversation.forceSend = this.forceSend;
        conversation.conversationUserDistance = this.conversationUserDistance;
        conversation.conversationUserUpdatedTime = this.conversationUserUpdatedTime;
        conversation.level = this.level;
        ConversationAdditional conversationAdditional = this.additional;
        if (conversationAdditional != null) {
            conversation.additional = conversationAdditional.mo223809clone();
        }
        conversation.convType = this.convType;
        ConversationProperty conversationProperty = this.property;
        if (conversationProperty != null) {
            conversation.property = conversationProperty.mo223809clone();
        }
        conversation.userMessageCount = this.userMessageCount;
        conversation.latestFriendCommentCreatedTime = this.latestFriendCommentCreatedTime;
        FriendHeatScore friendHeatScore = this.heat;
        if (friendHeatScore != null) {
            conversation.heat = friendHeatScore.mo223809clone();
        }
        List<LocalBusinessType> list2 = this.localBusinessTypes;
        if (list2 != null) {
            conversation.localBusinessTypes = ValueObject.util_map(list2, new w9j() { // from class: l.n36
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Conversation.m35294b((LocalBusinessType) obj);
                }
            });
        }
        conversation.localGreetDelete = this.localGreetDelete;
        conversation.suggestionScore = this.suggestionScore;
        conversation.localBotherStatus = this.localBotherStatus;
        conversation.muted = this.muted;
        ConversationGroupProperty conversationGroupProperty = this.group;
        if (conversationGroupProperty != null) {
            conversation.group = conversationGroupProperty.mo223809clone();
        }
        conversation.localDraft = this.localDraft;
        List<Picture> list3 = this.localChatBg;
        if (list3 != null) {
            conversation.localChatBg = ValueObject.util_map(list3, new w9j() { // from class: l.o36
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Picture) obj).mo223809clone();
                }
            });
        }
        conversation.localPlaceBan = this.localPlaceBan;
        conversation.localMessageInsertReportHint = this.localMessageInsertReportHint;
        conversation.localNotifyMomentId = this.localNotifyMomentId;
        conversation.localInsertedMomentId = this.localInsertedMomentId;
        conversation.f20374mm = this.f20374mm;
        conversation.intimacy = this.intimacy;
        conversation.quickChatProgress = this.quickChatProgress;
        conversation.hasLocalBreakIce = this.hasLocalBreakIce;
        conversation.localSpoofingNewTime = this.localSpoofingNewTime;
        conversation.clearedTime = this.clearedTime;
        conversation.localExtraInfo = this.localExtraInfo;
        conversation.lastActivityTime = this.lastActivityTime;
        conversation.otherStatus = this.otherStatus;
        conversation.isFake = this.isFake;
        conversation.localIsLimitedTrialSee = this.localIsLimitedTrialSee;
        return conversation;
    }

    public boolean doubleDefault() {
        return TextUtils.equals(this.convType, "default") && TEnum.equals(this.status, "default");
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        return super.equals(obj) && this.localHasMessage == conversation.localHasMessage && ValueObject.util_equals(this.api_only_messages, conversation.api_only_messages) && ValueObject.util_equals(this.read, conversation.read) && ValueObject.util_equals(this.otherUser, conversation.otherUser) && ValueObject.util_equals(this.readUntil, conversation.readUntil) && this.latestTime == conversation.latestTime && this.createdTime == conversation.createdTime && ValueObject.util_equals(this.localMatchFrom, conversation.localMatchFrom) && ValueObject.util_equals(this.localNotificationStatus, conversation.localNotificationStatus) && this.localBotheringTime == conversation.localBotheringTime && ValueObject.util_equals(this.scenarios, conversation.scenarios) && this.localActiveTime == conversation.localActiveTime && this.unreadMessages == conversation.unreadMessages && this.localEverHasMessage == conversation.localEverHasMessage && ValueObject.util_equals(this.reminder, conversation.reminder) && this.localUserUpdatedTime == conversation.localUserUpdatedTime && ValueObject.util_equals(this.importance, conversation.importance) && ValueObject.util_equals(this.localOnlineTabClick, conversation.localOnlineTabClick) && this.follow == conversation.follow && this.localBotherWxTime == conversation.localBotherWxTime && this.localBotherCodeTime == conversation.localBotherCodeTime && ValueObject.util_equals(this.clearedUntil, conversation.clearedUntil) && ValueObject.util_equals(this.status, conversation.status) && ValueObject.util_equals(this.place, conversation.place) && ValueObject.util_equals(this.subtype, conversation.subtype) && ValueObject.util_equals(this.myTalk, conversation.myTalk) && ValueObject.util_equals(this.otherTalk, conversation.otherTalk) && ValueObject.util_equals(this.otherReadUntil, conversation.otherReadUntil) && this.enterTimes == conversation.enterTimes && this.updatedTime == conversation.updatedTime && this.unmatchConversation == conversation.unmatchConversation && this.remainedTime == conversation.remainedTime && this.localSafetyReminderTime == conversation.localSafetyReminderTime && this.localSpoofingReminderTime == conversation.localSpoofingReminderTime && this.forceSend == conversation.forceSend && this.conversationUserDistance == conversation.conversationUserDistance && this.conversationUserUpdatedTime == conversation.conversationUserUpdatedTime && this.level == conversation.level && ValueObject.util_equals(this.additional, conversation.additional) && ValueObject.util_equals(this.convType, conversation.convType) && ValueObject.util_equals(this.property, conversation.property) && this.userMessageCount == conversation.userMessageCount && this.latestFriendCommentCreatedTime == conversation.latestFriendCommentCreatedTime && ValueObject.util_equals(this.heat, conversation.heat) && ValueObject.util_equals(this.localBusinessTypes, conversation.localBusinessTypes) && this.localGreetDelete == conversation.localGreetDelete && this.suggestionScore == conversation.suggestionScore && this.localBotherStatus == conversation.localBotherStatus && this.muted == conversation.muted && ValueObject.util_equals(this.group, conversation.group) && ValueObject.util_equals(this.localDraft, conversation.localDraft) && ValueObject.util_equals(this.localChatBg, conversation.localChatBg) && ValueObject.util_equals(this.localPlaceBan, conversation.localPlaceBan) && ValueObject.util_equals(this.localMessageInsertReportHint, conversation.localMessageInsertReportHint) && ValueObject.util_equals(this.localNotifyMomentId, conversation.localNotifyMomentId) && ValueObject.util_equals(this.localInsertedMomentId, conversation.localInsertedMomentId) && this.f20374mm == conversation.f20374mm && this.intimacy == conversation.intimacy && this.quickChatProgress == conversation.quickChatProgress && this.hasLocalBreakIce == conversation.hasLocalBreakIce && this.localSpoofingNewTime == conversation.localSpoofingNewTime && this.clearedTime == conversation.clearedTime && ValueObject.util_equals(this.localExtraInfo, conversation.localExtraInfo) && this.lastActivityTime == conversation.lastActivityTime && ValueObject.util_equals(this.otherStatus, conversation.otherStatus) && this.isFake == conversation.isFake && this.localIsLimitedTrialSee == conversation.localIsLimitedTrialSee;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "conversation";
    }

    public boolean hasReSwipeConvIceBreak() {
        if (NullChecker.m81303a(Boolean.valueOf(NullChecker.m81303a(this.additional))) && NullChecker.m81303a(this.additional.reSwipe)) {
            return !this.additional.reSwipe.autoSendMessage;
        }
        return false;
    }

    public boolean hasRemoveLabel() {
        ConversationAdditional conversationAdditional = this.additional;
        return (conversationAdditional == null || vwb.m200296J(conversationAdditional.previewTexts) || TextUtils.isEmpty(this.additional.previewTexts.get(0))) ? false : true;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + (this.localHasMessage ? 1231 : 1237)) * 41;
        PartialIdList partialIdList = this.api_only_messages;
        int iHashCode2 = (iHashCode + (partialIdList != null ? partialIdList.hashCode() : 0)) * 41;
        Boolean bool = this.read;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 41;
        String str = this.otherUser;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.readUntil;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestTime);
        int i2 = ((iHashCode4 + iHashCode5) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.createdTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        MatchFrom matchFrom = this.localMatchFrom;
        int iHashCode6 = (i3 + (matchFrom != null ? matchFrom.hashCode() : 0)) * 41;
        NotificationStatus notificationStatus = this.localNotificationStatus;
        int iHashCode7 = iHashCode6 + (notificationStatus != null ? notificationStatus.hashCode() : 0);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.localBotheringTime);
        int i4 = ((iHashCode7 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        List<String> list = this.scenarios;
        int iHashCode8 = i4 + (list != null ? list.hashCode() : 0);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.localActiveTime);
        int i5 = ((((((iHashCode8 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41) + this.unreadMessages) * 41) + (this.localEverHasMessage ? 1231 : 1237)) * 41;
        Reminder reminder = this.reminder;
        int iHashCode9 = i5 + (reminder != null ? reminder.hashCode() : 0);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.localUserUpdatedTime);
        int i6 = ((iHashCode9 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 41;
        StickStatus stickStatus = this.importance;
        int iHashCode10 = (i6 + (stickStatus != null ? stickStatus.hashCode() : 0)) * 41;
        String str3 = this.localOnlineTabClick;
        int iHashCode11 = ((iHashCode10 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.follow ? 1231 : 1237);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.localBotherWxTime);
        int i7 = (iHashCode11 * 41) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.localBotherCodeTime);
        int i8 = ((i7 * 41) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 41;
        String str4 = this.clearedUntil;
        int iHashCode12 = (i8 + (str4 != null ? str4.hashCode() : 0)) * 41;
        ConversationStatus conversationStatus = this.status;
        int iHashCode13 = (iHashCode12 + (conversationStatus != null ? conversationStatus.hashCode() : 0)) * 41;
        String str5 = this.place;
        int iHashCode14 = (iHashCode13 + (str5 != null ? str5.hashCode() : 0)) * 41;
        ConversationType conversationType = this.subtype;
        int iHashCode15 = (iHashCode14 + (conversationType != null ? conversationType.hashCode() : 0)) * 41;
        TalkInfo talkInfo = this.myTalk;
        int iHashCode16 = (iHashCode15 + (talkInfo != null ? talkInfo.hashCode() : 0)) * 41;
        TalkInfo talkInfo2 = this.otherTalk;
        int iHashCode17 = (iHashCode16 + (talkInfo2 != null ? talkInfo2.hashCode() : 0)) * 41;
        String str6 = this.otherReadUntil;
        int iHashCode18 = ((iHashCode17 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.enterTimes;
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.updatedTime);
        int i9 = ((((iHashCode18 * 41) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 41) + (this.unmatchConversation ? 1231 : 1237)) * 41;
        long j = this.remainedTime;
        int i10 = i9 + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.localSafetyReminderTime);
        int i11 = (i10 * 41) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
        long jDoubleToLongBits10 = Double.doubleToLongBits(this.localSpoofingReminderTime);
        int i12 = (((((i11 * 41) + ((int) (jDoubleToLongBits10 ^ (jDoubleToLongBits10 >>> 32)))) * 41) + (this.forceSend ? 1231 : 1237)) * 41) + this.conversationUserDistance;
        long jDoubleToLongBits11 = Double.doubleToLongBits(this.conversationUserUpdatedTime);
        int i13 = ((((i12 * 41) + ((int) (jDoubleToLongBits11 ^ (jDoubleToLongBits11 >>> 32)))) * 41) + this.level) * 41;
        ConversationAdditional conversationAdditional = this.additional;
        int iHashCode19 = (i13 + (conversationAdditional != null ? conversationAdditional.hashCode() : 0)) * 41;
        String str7 = this.convType;
        int iHashCode20 = (iHashCode19 + (str7 != null ? str7.hashCode() : 0)) * 41;
        ConversationProperty conversationProperty = this.property;
        int iHashCode21 = ((iHashCode20 + (conversationProperty != null ? conversationProperty.hashCode() : 0)) * 41) + this.userMessageCount;
        long jDoubleToLongBits12 = Double.doubleToLongBits(this.latestFriendCommentCreatedTime);
        int i14 = ((iHashCode21 * 41) + ((int) (jDoubleToLongBits12 ^ (jDoubleToLongBits12 >>> 32)))) * 41;
        FriendHeatScore friendHeatScore = this.heat;
        int iHashCode22 = (i14 + (friendHeatScore != null ? friendHeatScore.hashCode() : 0)) * 41;
        List<LocalBusinessType> list2 = this.localBusinessTypes;
        int iHashCode23 = ((iHashCode22 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.localGreetDelete ? 1231 : 1237);
        long jDoubleToLongBits13 = Double.doubleToLongBits(this.suggestionScore);
        int i15 = ((((((iHashCode23 * 41) + ((int) (jDoubleToLongBits13 ^ (jDoubleToLongBits13 >>> 32)))) * 41) + this.localBotherStatus) * 41) + (this.muted ? 1231 : 1237)) * 41;
        ConversationGroupProperty conversationGroupProperty = this.group;
        int iHashCode24 = (i15 + (conversationGroupProperty != null ? conversationGroupProperty.hashCode() : 0)) * 41;
        String str8 = this.localDraft;
        int iHashCode25 = (iHashCode24 + (str8 != null ? str8.hashCode() : 0)) * 41;
        List<Picture> list3 = this.localChatBg;
        int iHashCode26 = (iHashCode25 + (list3 != null ? list3.hashCode() : 0)) * 41;
        LocalPlaceBan localPlaceBan = this.localPlaceBan;
        int iHashCode27 = (iHashCode26 + (localPlaceBan != null ? localPlaceBan.hashCode() : 0)) * 41;
        String str9 = this.localMessageInsertReportHint;
        int iHashCode28 = (iHashCode27 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.localNotifyMomentId;
        int iHashCode29 = (iHashCode28 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.localInsertedMomentId;
        int iHashCode30 = ((((((((iHashCode29 + (str11 != null ? str11.hashCode() : 0)) * 41) + this.f20374mm) * 41) + this.intimacy) * 41) + this.quickChatProgress) * 41) + (this.hasLocalBreakIce ? 1231 : 1237);
        long jDoubleToLongBits14 = Double.doubleToLongBits(this.localSpoofingNewTime);
        int i16 = (iHashCode30 * 41) + ((int) (jDoubleToLongBits14 ^ (jDoubleToLongBits14 >>> 32)));
        long jDoubleToLongBits15 = Double.doubleToLongBits(this.clearedTime);
        int i17 = ((i16 * 41) + ((int) (jDoubleToLongBits15 ^ (jDoubleToLongBits15 >>> 32)))) * 41;
        String str12 = this.localExtraInfo;
        int iHashCode31 = i17 + (str12 != null ? str12.hashCode() : 0);
        long jDoubleToLongBits16 = Double.doubleToLongBits(this.lastActivityTime);
        int i18 = ((iHashCode31 * 41) + ((int) (jDoubleToLongBits16 ^ (jDoubleToLongBits16 >>> 32)))) * 41;
        String str13 = this.otherStatus;
        int iHashCode32 = ((((i18 + (str13 != null ? str13.hashCode() : 0)) * 41) + (this.isFake ? 1231 : 1237)) * 41) + this.localIsLimitedTrialSee;
        this.hashCode = iHashCode32;
        return iHashCode32;
    }

    public boolean isAnonymous() {
        return TextUtils.equals(this.convType, "anonymous");
    }

    public boolean isConfessionFirstConv() {
        if (!NullChecker.m81303a(this.additional) || !NullChecker.m81303a(this.additional.greetingInfo)) {
            return false;
        }
        GreetingInfo greetingInfo = this.additional.greetingInfo;
        return greetingInfo.fromGreeting && TEnum.equals(greetingInfo.channel, Channel.confession);
    }

    public boolean isExposureTop() {
        return this.level == 50;
    }

    public boolean isFakeHeartbeatConv() {
        return isHeartbeatConv() && NullChecker.m81303a(this.additional.heartbeatMatch) && this.additional.heartbeatMatch.guideFakeToGood;
    }

    public boolean isFakeOneSideConv() {
        return TextUtils.equals(this.convType, ConversationType.fake_one_side);
    }

    public boolean isFakeQuickChatConv() {
        return isQuickChatConv() && NullChecker.m81303a(this.additional.quickChat) && this.additional.quickChat.guideFakeToGood;
    }

    public boolean isForceDropDownCell() {
        return newMatchExpShowInList() || lowPayOneSideConv();
    }

    public boolean isHeartBeatLock() {
        return TextUtils.equals(this.convType, "heartbeatMatch") && NullChecker.m81303a(this.additional) && NullChecker.m81303a(this.additional.heartbeatMatch) && this.additional.heartbeatMatch.lock;
    }

    public boolean isHeartbeatConv() {
        return TextUtils.equals(this.convType, "heartbeatMatch");
    }

    public boolean isLimitMatch() {
        return TextUtils.equals(this.convType, "heartbeatMatch") && NullChecker.m81303a(this.additional) && NullChecker.m81303a(this.additional.heartbeatMatch) && this.additional.heartbeatMatch.matchType == 1;
    }

    public boolean isLimitedTrialSee(String str) {
        return TextUtils.equals(this.convType, ConversationType.free_see_match) && NullChecker.m81303a(this.property) && NullChecker.m81303a(this.property.limitedTrialSee) && TextUtils.equals(this.property.limitedTrialSee.actorId, str);
    }

    public boolean isMarriageConv() {
        return TextUtils.equals(this.convType, "marriage");
    }

    public boolean isMediaBuzzConv() {
        if (!"lovebuzz".equals(this.convType) || !NullChecker.m81303a(this.property) || !NullChecker.m81303a(this.property.intl_love_buzz)) {
            return false;
        }
        if ("voiceBuzz".equals(this.property.intl_love_buzz.biz) || "videoBuzz".equals(this.property.intl_love_buzz.biz) || "memojiBuzz".equals(this.property.intl_love_buzz.biz)) {
            return true;
        }
        ConversationLoveBuzz conversationLoveBuzz = this.property.intl_love_buzz;
        return conversationLoveBuzz.alwaysShow || Active.TYPE.equals(conversationLoveBuzz.mode);
    }

    public boolean isOtherStatusInvalid() {
        return TextUtils.equals(this.otherStatus, "invalid");
    }

    public boolean isOtherStatusUnknown() {
        return TextUtils.isEmpty(this.otherStatus) || TextUtils.equals(this.otherStatus, "unknown");
    }

    public boolean isPlatinumTop() {
        return this.level == 90;
    }

    public boolean isQuickChatClearAvatar(User user) {
        return NullChecker.m81303a(this.property) && NullChecker.m81303a(this.property.quickchat) && TextUtils.equals("true", this.property.quickchat.clearAvatar) && user.isFakeUser();
    }

    public boolean isQuickChatConv() {
        return TextUtils.equals(this.convType, "quickchat");
    }

    public boolean isReSwipeConv() {
        return NullChecker.m81303a(this.additional) && NullChecker.m81303a(this.additional.reSwipe) && TEnum.equals(this.additional.reSwipe.status, "liked");
    }

    public boolean isSVipAdConversation() {
        return TEnum.equals(this.subtype, ConversationType.svipad);
    }

    public boolean isSeeUpgradedConv() {
        return TextUtils.equals(this.convType, "see_upgraded");
    }

    public boolean isTalkConversation() {
        return TEnum.equals(this.subtype, ConversationType.shuoshuo);
    }

    public boolean isTop() {
        return this.level == 100;
    }

    public double labelExposureTime() {
        return (NullChecker.m81303a(this.additional) && NullChecker.m81303a(this.additional.newMatch)) ? this.additional.newMatch.labelExposureTime : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public String limitMatchGreetEmoji() {
        return isLimitMatch() ? this.additional.heartbeatMatch.greetEmoji : "";
    }

    public String limitMatchGreetText() {
        return isLimitMatch() ? this.additional.heartbeatMatch.greetText : "";
    }

    public boolean lowPayOneSideConv() {
        return NullChecker.m81303a(this.additional) && NullChecker.m81303a(this.additional.lowPayOneside) && ConversationType.fake_one_side.equals(this.convType) && this.additional.lowPayOneside.isActor;
    }

    public boolean mutedByFriend() {
        return NullChecker.m81303a(this.additional) && NullChecker.m81303a(this.additional.blackList) && this.additional.blackList.mutedBy;
    }

    public boolean needCheckValidStatus() {
        return (TextUtils.isEmpty(this.f56011id) || this.f56011id.startsWith("fake_id_") || TextUtils.equals(this.convType, "group")) ? false : true;
    }

    public boolean newMatchExpShowInList() {
        return NullChecker.m81303a(this.property) && NullChecker.m81303a(this.property.conversationTag) && this.property.conversationTag.showInList;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.read == null) {
            this.read = Boolean.FALSE;
        }
        if (this.otherUser == null) {
            this.otherUser = "";
        }
        if (this.localNotificationStatus == null) {
            this.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.importance == null) {
            this.importance = (StickStatus) StickStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.status == null) {
            this.status = (ConversationStatus) ConversationStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.subtype == null) {
            this.subtype = (ConversationType) ConversationType.JSON_ADAPTER.defaultEnum();
        }
        if (this.myTalk == null) {
            this.myTalk = TalkInfo.new_();
        }
        if (this.otherTalk == null) {
            this.otherTalk = TalkInfo.new_();
        }
        if (this.additional == null) {
            this.additional = ConversationAdditional.new_();
        }
        if (this.convType == null) {
            this.convType = "";
        }
        if (this.property == null) {
            this.property = ConversationProperty.new_();
        }
        if (this.heat == null) {
            this.heat = FriendHeatScore.new_();
        }
        if (this.localBusinessTypes == null) {
            this.localBusinessTypes = new ArrayList();
        }
        if (this.group == null) {
            this.group = ConversationGroupProperty.new_();
        }
        if (this.localPlaceBan == null) {
            this.localPlaceBan = (LocalPlaceBan) LocalPlaceBan.JSON_ADAPTER.defaultEnum();
        }
        if (this.localNotifyMomentId == null) {
            this.localNotifyMomentId = "";
        }
        if (this.localInsertedMomentId == null) {
            this.localInsertedMomentId = "";
        }
        if (this.otherStatus == null) {
            this.otherStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        PartialIdList partialIdList = this.api_only_messages;
        this.localHasMessage = (partialIdList == null || partialIdList.ids.isEmpty()) ? false : true;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
