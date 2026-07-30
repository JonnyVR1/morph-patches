package com.p051p1.mobile.putong.core.data;

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
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.GiftRecord;
import com.p051p1.mobile.putong.core.data.LocalBusinessType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.PrivateQuestion;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.Accessory;
import com.p051p1.mobile.putong.feed.data.Reference;
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
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import io.agora.rtc2.Constants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;
import p153l.uqb0;
import p153l.vzf0;
import p153l.wzh0;
import p153l.xi5;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes10.dex */
public class Message extends DbObject<Message> implements Cloneable, Serializable {
    public static final Column<Message, MessageAdditionalData> ADDITIONALDATA;
    public static final TEnumColumn<Message, MessageChannel> CHANNEL;
    public static vzf0<Message> DB_ADAPTER = null;
    public static final Column<Message, MessageExtData> EXTDATA;
    public static final StringColumn<Message> FROMCONVTYPE;
    public static final String HEARTBEAT_ICEBREAK = "heartbeat_icbreak";
    public static final String HEARTBEAT_WAITING_RESPONSE = "heartbeat_waiting_response";
    public static final StringColumn<Message> HOSTID;
    public static final StringColumn<Message> INCTEMPINFO;
    public static final Column<Message, AudioText> LOCALAUDIOTEXT;
    public static final StringColumn<Message> LOCALEXTRAINFO;
    public static final StringColumn<Message> LOCALGREETINGID;
    public static final IntegerColumn<Message> LOCALMYVISITORCOUNT;
    public static final BooleanColumn<Message> LOCALMYVISITORHIDDEN;
    public static final StringColumn<Message> LOCALREDPACKETTYPE;
    public static final BooleanColumn<Message> LOCALSAFETYREMINDER;
    public static final BooleanColumn<Message> LOCALSENSITIVEWORDREMINDER;
    public static final TEnumColumn<Message, MessageType> MESSAGETYPE;
    public static final StringColumn<Message> MSGDATA;
    public static final TEnumColumn<Message, MessageType> MSGTYPE;
    public static final BooleanColumn<Message> NEEDREAD;
    public static final Column<Message, List<String>> NOTIFIEDUSERS;
    public static final BooleanColumn<Message> READ;
    public static final StringColumn<Message> REFERENCEMSGID;
    public static final Column<Message, List<String>> RISKTAGS;
    public static final BooleanColumn<Message> SETTINGS_ANONYMOUS;
    public static final TEnumColumn<Message, MessageStatus> STATUS;
    public static final Column<Message, List<LocalBusinessType>> STR_LOCALBUSINESSTYPES;
    public static final String TYPE = "message";

    @NonNull
    public String action;

    @Nullable
    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public MessageAdditionalData additionalData;
    public String answerIdOfAnswer;

    @Nullable
    @ProtobufIndex(index = 62)
    public String answerOfMessage;

    @Nullable
    @ProtobufIndex(index = 70)
    public MessageAccessory api_only_accessory;

    @NonNull
    public String api_only_otherUser;

    @Nullable
    public MessageReference api_only_reference;

    @Nullable
    @ProtobufIndex(index = 72)
    public CallRecord call;

    @NonNull
    @ProtobufIndex(index = 90)
    public MessageChannel channel;

    @ProtobufIndex(index = 78)
    public boolean chatTyping;

    @NonNull
    @ProtobufIndex(index = 56)
    public String cid;

    @NonNull
    public String coinSign;

    @NonNull
    public CommentInfo commentInfo;

    @NonNull
    public String consumeType;

    @ProtobufIndex(index = 55)
    public double createdTime;

    @Nullable
    @ProtobufIndex(index = 100)
    public MessageExtData extData;

    @Nullable
    @ProtobufIndex(index = 101)
    public String fromConvType;

    @Nullable
    @ProtobufIndex(index = 71)
    public List<GiftRecord> giftRecords;

    @NonNull
    @ProtobufIndex(index = EACTags.LOGIN_DATA)
    public String hostId;

    @Nullable
    @ProtobufIndex(index = 111)
    public String incTempInfo;
    public boolean isBottom;
    public boolean isFromKanKan;
    public boolean isNewComment;

    @Nullable
    @ProtobufIndex(index = 77)
    public Letter letter;

    @Nullable
    @ProtobufIndex(index = 68)
    public String likeOfMoment;
    public boolean liked;
    public int likes;

    @Nullable
    @ProtobufIndex(index = 69)
    public String localAnimationKey;

    @NonNull
    @ProtobufIndex(index = Opcodes.IADD)
    public AudioText localAudioText;

    @NonNull
    @ProtobufIndex(index = 88)
    public List<LocalBusinessType> localBusinessTypes;

    @NonNull
    @ProtobufIndex(index = 75)
    public CallHandledStatus localCallHandledStatus;

    @ProtobufIndex(index = 74)
    public int localCallStatus;

    @Nullable
    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
    public String localCallType;

    @ProtobufIndex(index = 52)
    public int localCreatedSession;

    @ProtobufIndex(index = 51)
    public long localCreatedTime;

    @Nullable
    @ProtobufIndex(index = 102)
    public String localExtraInfo;

    @ProtobufIndex(index = 79)
    public int localFailType;

    @Nullable
    @ProtobufIndex(index = EACTags.APPLICATION_TEMPLATE)
    public String localGreetingId;

    @ProtobufIndex(index = 54)
    public boolean localInConversation;

    @ProtobufIndex(index = 53)
    public boolean localInMoment;

    @ProtobufIndex(index = 113)
    public int localMyVisitorCount;

    @ProtobufIndex(index = 114)
    public boolean localMyVisitorHidden;

    @NonNull
    @ProtobufIndex(index = 67)
    public NotificationStatus localNotificationStatus;

    @NonNull
    @ProtobufIndex(index = 76)
    public List<PrivateQuestion> localPrivateQuestions;

    @Nullable
    @ProtobufIndex(index = 95)
    public String localRedPacketType;

    @ProtobufIndex(index = 85)
    public boolean localSafetyReminder;

    @ProtobufIndex(index = EACTags.TRACK1_APPLICATION)
    public boolean localSensitiveWordReminder;

    @Nullable
    @ProtobufIndex(index = 64)
    public MessageLocation location;

    @Nullable
    @ProtobufIndex(index = 57)
    public List<Media> media;

    @Nullable
    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public MessageType messageType;

    @Nullable
    @ProtobufIndex(index = 61)
    public String moment;
    public String momentShowFromType;

    @NonNull
    public String moreSubComments;

    @Nullable
    @ProtobufIndex(index = 87)
    public String msgData;

    @Nullable
    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
    @Deprecated
    public MessageType msgType;

    @ProtobufIndex(index = 99)
    public boolean needRead;

    @NonNull
    @ProtobufIndex(index = EACTags.NAME)
    public List<String> notifiedUsers;

    @NonNull
    @ProtobufIndex(index = 63)
    public String owner;

    @NonNull
    public String parentCommentId;

    @Nullable
    @ProtobufIndex(index = 59)
    public String question;

    @Nullable
    public QuestionCategory questionCategory;

    @ProtobufIndex(index = EACTags.FCP_TEMPLATE)
    public boolean read;

    @Nullable
    @ProtobufIndex(index = 65)
    public Boolean recalled;

    @Nullable
    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public String recalledHint;

    @Nullable
    @ProtobufIndex(index = 80)
    public String recalledReason;

    @NonNull
    @ProtobufIndex(index = EACTags.HEADER_LIST)
    public String referenceMsgId;

    @Nullable
    public String reminder;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 112)
    public List<String> riskTags;
    public boolean secondSend;

    @Nullable
    @ProtobufIndex(index = 60)
    public MessageSentFrom sentFrom;

    @NonNull
    @ProtobufIndex(index = 89)
    public MessageSetting settings;

    @NonNull
    @ProtobufIndex(index = EACTags.TAG_LIST)
    public MessageStatus status;

    @Nullable
    @ProtobufIndex(index = 58)
    public String sticker;

    @NonNull
    public List<String> subCommentIds;

    @NonNull
    @ProtobufIndex(index = 66)
    public String value;
    public static ProtobufAdapter<Message> PROTOBUF_ADAPTER = new MessageNanoAdapter<Message>() { // from class: com.p1.mobile.putong.core.data.Message.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Message message) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, message._id);
            String str = message.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17283j2 = iM17283j + CodedOutputByteBufferNano.m17283j(51, message.localCreatedTime) + CodedOutputByteBufferNano.m17281h(52, message.localCreatedSession) + CodedOutputByteBufferNano.m17275b(53, message.localInMoment) + CodedOutputByteBufferNano.m17275b(54, message.localInConversation) + CodedOutputByteBufferNano.m17277d(55, message.createdTime);
            String str2 = message.cid;
            if (str2 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(56, str2);
            }
            List<Media> list = message.media;
            if (list != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(57, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = message.sticker;
            if (str3 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(58, str3);
            }
            String str4 = message.question;
            if (str4 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(59, str4);
            }
            MessageSentFrom messageSentFrom = message.sentFrom;
            if (messageSentFrom != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17281h(60, messageSentFrom.ordinal());
            }
            String str5 = message.moment;
            if (str5 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(61, str5);
            }
            String str6 = message.answerOfMessage;
            if (str6 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(62, str6);
            }
            String str7 = message.owner;
            if (str7 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(63, str7);
            }
            MessageLocation messageLocation = message.location;
            if (messageLocation != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(64, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            Boolean bool = message.recalled;
            if (bool != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17275b(65, bool.booleanValue());
            }
            String str8 = message.value;
            if (str8 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(66, str8);
            }
            NotificationStatus notificationStatus = message.localNotificationStatus;
            if (notificationStatus != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17281h(67, notificationStatus.ordinal());
            }
            String str9 = message.likeOfMoment;
            if (str9 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(68, str9);
            }
            String str10 = message.localAnimationKey;
            if (str10 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(69, str10);
            }
            MessageAccessory messageAccessory = message.api_only_accessory;
            if (messageAccessory != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(70, messageAccessory, MessageAccessory.PROTOBUF_ADAPTER);
            }
            List<GiftRecord> list2 = message.giftRecords;
            if (list2 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(71, list2, GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CallRecord callRecord = message.call;
            if (callRecord != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(72, callRecord, CallRecord.PROTOBUF_ADAPTER);
            }
            String str11 = message.localCallType;
            if (str11 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(73, str11);
            }
            int iM17281h = iM17283j2 + CodedOutputByteBufferNano.m17281h(74, message.localCallStatus);
            CallHandledStatus callHandledStatus = message.localCallHandledStatus;
            if (callHandledStatus != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(75, callHandledStatus.ordinal());
            }
            List<PrivateQuestion> list3 = message.localPrivateQuestions;
            if (list3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(76, list3, PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Letter letter = message.letter;
            if (letter != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(77, letter, Letter.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(78, message.chatTyping) + CodedOutputByteBufferNano.m17281h(79, message.localFailType);
            String str12 = message.recalledReason;
            if (str12 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(80, str12);
            }
            String str13 = message.recalledHint;
            if (str13 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(81, str13);
            }
            MessageType messageType = message.msgType;
            if (messageType != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(82, messageType.ordinal());
            }
            MessageType messageType2 = message.messageType;
            if (messageType2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(83, messageType2.ordinal());
            }
            MessageAdditionalData messageAdditionalData = message.additionalData;
            if (messageAdditionalData != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(84, messageAdditionalData, MessageAdditionalData.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(85, message.localSafetyReminder) + CodedOutputByteBufferNano.m17275b(86, message.localSensitiveWordReminder);
            String str14 = message.msgData;
            if (str14 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(87, str14);
            }
            List<LocalBusinessType> list4 = message.localBusinessTypes;
            if (list4 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(88, LocalBusinessType.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageSetting messageSetting = message.settings;
            if (messageSetting != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(89, messageSetting, MessageSetting.PROTOBUF_ADAPTER);
            }
            MessageChannel messageChannel = message.channel;
            if (messageChannel != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17281h(90, messageChannel.ordinal());
            }
            List<String> list5 = message.notifiedUsers;
            if (list5 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(91, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MessageStatus messageStatus = message.status;
            if (messageStatus != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17281h(92, messageStatus.ordinal());
            }
            String str15 = message.referenceMsgId;
            if (str15 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(93, str15);
            }
            String str16 = message.hostId;
            if (str16 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(94, str16);
            }
            String str17 = message.localRedPacketType;
            if (str17 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(95, str17);
            }
            AudioText audioText = message.localAudioText;
            if (audioText != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(96, audioText, AudioText.PROTOBUF_ADAPTER);
            }
            String str18 = message.localGreetingId;
            if (str18 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(97, str18);
            }
            int iM17275b3 = iM17275b2 + CodedOutputByteBufferNano.m17275b(98, message.read) + CodedOutputByteBufferNano.m17275b(99, message.needRead);
            MessageExtData messageExtData = message.extData;
            if (messageExtData != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(100, messageExtData, MessageExtData.PROTOBUF_ADAPTER);
            }
            String str19 = message.fromConvType;
            if (str19 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17288o(101, str19);
            }
            String str20 = message.localExtraInfo;
            if (str20 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17288o(102, str20);
            }
            MessageSentFrom messageSentFrom2 = message.sentFrom;
            if (messageSentFrom2 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(103, messageSentFrom2, MessageSentFrom.PROTOBUF_ADAPTER);
            }
            NotificationStatus notificationStatus2 = message.localNotificationStatus;
            if (notificationStatus2 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(104, notificationStatus2, NotificationStatus.PROTOBUF_ADAPTER);
            }
            CallHandledStatus callHandledStatus2 = message.localCallHandledStatus;
            if (callHandledStatus2 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(105, callHandledStatus2, CallHandledStatus.PROTOBUF_ADAPTER);
            }
            MessageType messageType3 = message.msgType;
            if (messageType3 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(106, messageType3, MessageType.PROTOBUF_ADAPTER);
            }
            MessageType messageType4 = message.messageType;
            if (messageType4 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(107, messageType4, MessageType.PROTOBUF_ADAPTER);
            }
            List<LocalBusinessType> list6 = message.localBusinessTypes;
            if (list6 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(108, list6, LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageChannel messageChannel2 = message.channel;
            if (messageChannel2 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(109, messageChannel2, MessageChannel.PROTOBUF_ADAPTER);
            }
            MessageStatus messageStatus2 = message.status;
            if (messageStatus2 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(110, messageStatus2, MessageStatus.PROTOBUF_ADAPTER);
            }
            String str21 = message.incTempInfo;
            if (str21 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17288o(111, str21);
            }
            List<String> list7 = message.riskTags;
            if (list7 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(112, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17275b3 + CodedOutputByteBufferNano.m17281h(113, message.localMyVisitorCount) + CodedOutputByteBufferNano.m17275b(114, message.localMyVisitorHidden);
            message.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Message parse(nc5 nc5Var) throws IOException {
            Message message = new Message();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            Integer numValueOf4 = null;
            Integer numValueOf5 = null;
            List list = null;
            Integer numValueOf6 = null;
            Integer numValueOf7 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (message.sentFrom == null && numValueOf != null) {
                            message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (message.localNotificationStatus == null && numValueOf2 != null) {
                            message.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (message.localCallHandledStatus == null && numValueOf3 != null) {
                            message.localCallHandledStatus = (CallHandledStatus) CallHandledStatus.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (message.msgType == null && numValueOf4 != null) {
                            message.msgType = (MessageType) MessageType.JSON_ADAPTER.newTEnum(null, numValueOf4.intValue());
                        }
                        if (message.messageType == null && numValueOf5 != null) {
                            message.messageType = (MessageType) MessageType.JSON_ADAPTER.newTEnum(null, numValueOf5.intValue());
                        }
                        if (message.localBusinessTypes == null && list != null) {
                            message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list);
                        }
                        if (message.channel == null && numValueOf6 != null) {
                            message.channel = (MessageChannel) MessageChannel.JSON_ADAPTER.newTEnum(null, numValueOf6.intValue());
                        }
                        if (message.status == null && numValueOf7 != null) {
                            message.status = (MessageStatus) MessageStatus.JSON_ADAPTER.newTEnum(null, numValueOf7.intValue());
                        }
                        if (message.api_only_otherUser == null) {
                            message.api_only_otherUser = "";
                        }
                        if (message.cid == null) {
                            message.cid = "";
                        }
                        if (message.owner == null) {
                            message.owner = "";
                        }
                        if (message.value == null) {
                            message.value = "";
                        }
                        if (message.localNotificationStatus == null) {
                            message.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.localCallHandledStatus == null) {
                            message.localCallHandledStatus = (CallHandledStatus) CallHandledStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.localPrivateQuestions == null) {
                            message.localPrivateQuestions = new ArrayList();
                        }
                        if (message.commentInfo == null) {
                            message.commentInfo = CommentInfo.new_();
                        }
                        if (message.parentCommentId == null) {
                            message.parentCommentId = "";
                        }
                        if (message.subCommentIds == null) {
                            message.subCommentIds = new ArrayList();
                        }
                        if (message.moreSubComments == null) {
                            message.moreSubComments = "";
                        }
                        if (message.localBusinessTypes == null) {
                            message.localBusinessTypes = new ArrayList();
                        }
                        if (message.settings == null) {
                            message.settings = MessageSetting.new_();
                        }
                        if (message.channel == null) {
                            message.channel = (MessageChannel) MessageChannel.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.notifiedUsers == null) {
                            message.notifiedUsers = new ArrayList();
                        }
                        if (message.status == null) {
                            message.status = (MessageStatus) MessageStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.referenceMsgId == null) {
                            message.referenceMsgId = "";
                        }
                        if (message.hostId == null) {
                            message.hostId = "";
                        }
                        if (message.localAudioText == null) {
                            message.localAudioText = AudioText.new_();
                        }
                        if (message.consumeType == null) {
                            message.consumeType = "";
                        }
                        if (message.coinSign == null) {
                            message.coinSign = "";
                        }
                        if (message.action == null) {
                            message.action = "";
                        }
                        if (message.riskTags == null) {
                            message.riskTags = new ArrayList();
                        }
                        break;
                    case 8:
                        message._id = nc5Var.m162487k();
                        continue;
                    case 18:
                        message.f56859id = nc5Var.m162495s();
                        continue;
                    case HttpStatus.REQUEST_TIMEOUT_408 /* 408 */:
                        message.localCreatedTime = nc5Var.m162487k();
                        continue;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        message.localCreatedSession = nc5Var.m162486j();
                        continue;
                    case HttpStatus.FAILED_DEPENDENCY_424 /* 424 */:
                        message.localInMoment = nc5Var.m162483g();
                        continue;
                    case 432:
                        message.localInConversation = nc5Var.m162483g();
                        continue;
                    case 441:
                        message.createdTime = nc5Var.m162484h();
                        continue;
                    case 450:
                        message.cid = nc5Var.m162495s();
                        continue;
                    case 458:
                        message.media = (List) nc5Var.m162488l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 466:
                        message.sticker = nc5Var.m162495s();
                        continue;
                    case 474:
                        message.question = nc5Var.m162495s();
                        continue;
                    case 480:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 490:
                        message.moment = nc5Var.m162495s();
                        continue;
                    case 498:
                        message.answerOfMessage = nc5Var.m162495s();
                        continue;
                    case 506:
                        message.owner = nc5Var.m162495s();
                        continue;
                    case 514:
                        message.location = (MessageLocation) nc5Var.m162488l(MessageLocation.PROTOBUF_ADAPTER);
                        continue;
                    case 520:
                        message.recalled = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 530:
                        message.value = nc5Var.m162495s();
                        continue;
                    case 536:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 546:
                        message.likeOfMoment = nc5Var.m162495s();
                        continue;
                    case 554:
                        message.localAnimationKey = nc5Var.m162495s();
                        continue;
                    case 562:
                        message.api_only_accessory = (MessageAccessory) nc5Var.m162488l(MessageAccessory.PROTOBUF_ADAPTER);
                        continue;
                    case 570:
                        message.giftRecords = (List) nc5Var.m162488l(GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /* 578 */:
                        message.call = (CallRecord) nc5Var.m162488l(CallRecord.PROTOBUF_ADAPTER);
                        continue;
                    case 586:
                        message.localCallType = nc5Var.m162495s();
                        continue;
                    case 592:
                        message.localCallStatus = nc5Var.m162486j();
                        continue;
                    case 600:
                        numValueOf3 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 610:
                        message.localPrivateQuestions = (List) nc5Var.m162488l(PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 618:
                        message.letter = (Letter) nc5Var.m162488l(Letter.PROTOBUF_ADAPTER);
                        continue;
                    case 624:
                        message.chatTyping = nc5Var.m162483g();
                        continue;
                    case 632:
                        message.localFailType = nc5Var.m162486j();
                        continue;
                    case 642:
                        message.recalledReason = nc5Var.m162495s();
                        continue;
                    case 650:
                        message.recalledHint = nc5Var.m162495s();
                        continue;
                    case 656:
                        numValueOf4 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 664:
                        numValueOf5 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 674:
                        message.additionalData = (MessageAdditionalData) nc5Var.m162488l(MessageAdditionalData.PROTOBUF_ADAPTER);
                        continue;
                    case 680:
                        message.localSafetyReminder = nc5Var.m162483g();
                        continue;
                    case 688:
                        message.localSensitiveWordReminder = nc5Var.m162483g();
                        continue;
                    case 698:
                        message.msgData = nc5Var.m162495s();
                        continue;
                    case 706:
                        list = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case Constants.AUDIO_MIXING_STATE_FAILED /* 714 */:
                        message.settings = (MessageSetting) nc5Var.m162488l(MessageSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 720:
                        numValueOf6 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 730:
                        message.notifiedUsers = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 736:
                        numValueOf7 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 746:
                        message.referenceMsgId = nc5Var.m162495s();
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_AR_GIFT /* 754 */:
                        message.hostId = nc5Var.m162495s();
                        continue;
                    case 762:
                        message.localRedPacketType = nc5Var.m162495s();
                        continue;
                    case 770:
                        message.localAudioText = (AudioText) nc5Var.m162488l(AudioText.PROTOBUF_ADAPTER);
                        continue;
                    case 778:
                        message.localGreetingId = nc5Var.m162495s();
                        continue;
                    case 784:
                        message.read = nc5Var.m162483g();
                        continue;
                    case 792:
                        message.needRead = nc5Var.m162483g();
                        continue;
                    case 802:
                        message.extData = (MessageExtData) nc5Var.m162488l(MessageExtData.PROTOBUF_ADAPTER);
                        continue;
                    case Constants.RHYTHM_PLAYER_STATE_IDLE /* 810 */:
                        message.fromConvType = nc5Var.m162495s();
                        continue;
                    case 818:
                        message.localExtraInfo = nc5Var.m162495s();
                        continue;
                    case 826:
                        message.sentFrom = (MessageSentFrom) nc5Var.m162488l(MessageSentFrom.PROTOBUF_ADAPTER);
                        continue;
                    case 834:
                        message.localNotificationStatus = (NotificationStatus) nc5Var.m162488l(NotificationStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 842:
                        message.localCallHandledStatus = (CallHandledStatus) nc5Var.m162488l(CallHandledStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 850:
                        message.msgType = (MessageType) nc5Var.m162488l(MessageType.PROTOBUF_ADAPTER);
                        continue;
                    case 858:
                        message.messageType = (MessageType) nc5Var.m162488l(MessageType.PROTOBUF_ADAPTER);
                        continue;
                    case 866:
                        message.localBusinessTypes = (List) nc5Var.m162488l(LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 874:
                        message.channel = (MessageChannel) nc5Var.m162488l(MessageChannel.PROTOBUF_ADAPTER);
                        continue;
                    case 882:
                        message.status = (MessageStatus) nc5Var.m162488l(MessageStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 890:
                        message.incTempInfo = nc5Var.m162495s();
                        continue;
                    case 898:
                        message.riskTags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case IMediaPlayer.MEDIA_INFO_ML_DROP_STOP /* 904 */:
                        message.localMyVisitorCount = nc5Var.m162486j();
                        continue;
                    case 912:
                        message.localMyVisitorHidden = nc5Var.m162483g();
                        continue;
                    default:
                        if (message.sentFrom == null && numValueOf != null) {
                            message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (message.localNotificationStatus == null && numValueOf2 != null) {
                            message.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (message.localCallHandledStatus == null && numValueOf3 != null) {
                            message.localCallHandledStatus = (CallHandledStatus) CallHandledStatus.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (message.msgType == null && numValueOf4 != null) {
                            message.msgType = (MessageType) MessageType.JSON_ADAPTER.newTEnum(null, numValueOf4.intValue());
                        }
                        if (message.messageType == null && numValueOf5 != null) {
                            message.messageType = (MessageType) MessageType.JSON_ADAPTER.newTEnum(null, numValueOf5.intValue());
                        }
                        if (message.localBusinessTypes == null && list != null) {
                            message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list);
                        }
                        if (message.channel == null && numValueOf6 != null) {
                            message.channel = (MessageChannel) MessageChannel.JSON_ADAPTER.newTEnum(null, numValueOf6.intValue());
                        }
                        if (message.status == null && numValueOf7 != null) {
                            message.status = (MessageStatus) MessageStatus.JSON_ADAPTER.newTEnum(null, numValueOf7.intValue());
                        }
                        if (message.api_only_otherUser == null) {
                            message.api_only_otherUser = "";
                        }
                        if (message.cid == null) {
                            message.cid = "";
                        }
                        if (message.owner == null) {
                            message.owner = "";
                        }
                        if (message.value == null) {
                            message.value = "";
                        }
                        if (message.localNotificationStatus == null) {
                            message.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.localCallHandledStatus == null) {
                            message.localCallHandledStatus = (CallHandledStatus) CallHandledStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.localPrivateQuestions == null) {
                            message.localPrivateQuestions = new ArrayList();
                        }
                        if (message.commentInfo == null) {
                            message.commentInfo = CommentInfo.new_();
                        }
                        if (message.parentCommentId == null) {
                            message.parentCommentId = "";
                        }
                        if (message.subCommentIds == null) {
                            message.subCommentIds = new ArrayList();
                        }
                        if (message.moreSubComments == null) {
                            message.moreSubComments = "";
                        }
                        if (message.localBusinessTypes == null) {
                            message.localBusinessTypes = new ArrayList();
                        }
                        if (message.settings == null) {
                            message.settings = MessageSetting.new_();
                        }
                        if (message.channel == null) {
                            message.channel = (MessageChannel) MessageChannel.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.notifiedUsers == null) {
                            message.notifiedUsers = new ArrayList();
                        }
                        if (message.status == null) {
                            message.status = (MessageStatus) MessageStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (message.referenceMsgId == null) {
                            message.referenceMsgId = "";
                        }
                        if (message.hostId == null) {
                            message.hostId = "";
                        }
                        if (message.localAudioText == null) {
                            message.localAudioText = AudioText.new_();
                        }
                        if (message.consumeType == null) {
                            message.consumeType = "";
                        }
                        if (message.coinSign == null) {
                            message.coinSign = "";
                        }
                        if (message.action == null) {
                            message.action = "";
                        }
                        if (message.riskTags == null) {
                            message.riskTags = new ArrayList();
                            return message;
                        }
                        break;
                }
            }
            return message;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Message message, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, message._id);
            String str = message.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17307I(51, message.localCreatedTime);
            codedOutputByteBufferNano.m17305G(52, message.localCreatedSession);
            codedOutputByteBufferNano.m17299A(53, message.localInMoment);
            codedOutputByteBufferNano.m17299A(54, message.localInConversation);
            codedOutputByteBufferNano.m17301C(55, message.createdTime);
            String str2 = message.cid;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(56, str2);
            }
            List<Media> list = message.media;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(57, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = message.sticker;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(58, str3);
            }
            String str4 = message.question;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(59, str4);
            }
            MessageSentFrom messageSentFrom = message.sentFrom;
            if (messageSentFrom != null) {
                codedOutputByteBufferNano.m17305G(60, messageSentFrom.ordinal());
            }
            String str5 = message.moment;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(61, str5);
            }
            String str6 = message.answerOfMessage;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(62, str6);
            }
            String str7 = message.owner;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(63, str7);
            }
            MessageLocation messageLocation = message.location;
            if (messageLocation != null) {
                codedOutputByteBufferNano.m17309K(64, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            Boolean bool = message.recalled;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(65, bool.booleanValue());
            }
            String str8 = message.value;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(66, str8);
            }
            NotificationStatus notificationStatus = message.localNotificationStatus;
            if (notificationStatus != null) {
                codedOutputByteBufferNano.m17305G(67, notificationStatus.ordinal());
            }
            String str9 = message.likeOfMoment;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(68, str9);
            }
            String str10 = message.localAnimationKey;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(69, str10);
            }
            MessageAccessory messageAccessory = message.api_only_accessory;
            if (messageAccessory != null) {
                codedOutputByteBufferNano.m17309K(70, messageAccessory, MessageAccessory.PROTOBUF_ADAPTER);
            }
            List<GiftRecord> list2 = message.giftRecords;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(71, list2, GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CallRecord callRecord = message.call;
            if (callRecord != null) {
                codedOutputByteBufferNano.m17309K(72, callRecord, CallRecord.PROTOBUF_ADAPTER);
            }
            String str11 = message.localCallType;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(73, str11);
            }
            codedOutputByteBufferNano.m17305G(74, message.localCallStatus);
            CallHandledStatus callHandledStatus = message.localCallHandledStatus;
            if (callHandledStatus != null) {
                codedOutputByteBufferNano.m17305G(75, callHandledStatus.ordinal());
            }
            List<PrivateQuestion> list3 = message.localPrivateQuestions;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(76, list3, PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Letter letter = message.letter;
            if (letter != null) {
                codedOutputByteBufferNano.m17309K(77, letter, Letter.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(78, message.chatTyping);
            codedOutputByteBufferNano.m17305G(79, message.localFailType);
            String str12 = message.recalledReason;
            if (str12 != null) {
                codedOutputByteBufferNano.m17316R(80, str12);
            }
            String str13 = message.recalledHint;
            if (str13 != null) {
                codedOutputByteBufferNano.m17316R(81, str13);
            }
            MessageType messageType = message.msgType;
            if (messageType != null) {
                codedOutputByteBufferNano.m17305G(82, messageType.ordinal());
            }
            MessageType messageType2 = message.messageType;
            if (messageType2 != null) {
                codedOutputByteBufferNano.m17305G(83, messageType2.ordinal());
            }
            MessageAdditionalData messageAdditionalData = message.additionalData;
            if (messageAdditionalData != null) {
                codedOutputByteBufferNano.m17309K(84, messageAdditionalData, MessageAdditionalData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(85, message.localSafetyReminder);
            codedOutputByteBufferNano.m17299A(86, message.localSensitiveWordReminder);
            String str14 = message.msgData;
            if (str14 != null) {
                codedOutputByteBufferNano.m17316R(87, str14);
            }
            List<LocalBusinessType> list4 = message.localBusinessTypes;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(88, LocalBusinessType.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageSetting messageSetting = message.settings;
            if (messageSetting != null) {
                codedOutputByteBufferNano.m17309K(89, messageSetting, MessageSetting.PROTOBUF_ADAPTER);
            }
            MessageChannel messageChannel = message.channel;
            if (messageChannel != null) {
                codedOutputByteBufferNano.m17305G(90, messageChannel.ordinal());
            }
            List<String> list5 = message.notifiedUsers;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(91, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MessageStatus messageStatus = message.status;
            if (messageStatus != null) {
                codedOutputByteBufferNano.m17305G(92, messageStatus.ordinal());
            }
            String str15 = message.referenceMsgId;
            if (str15 != null) {
                codedOutputByteBufferNano.m17316R(93, str15);
            }
            String str16 = message.hostId;
            if (str16 != null) {
                codedOutputByteBufferNano.m17316R(94, str16);
            }
            String str17 = message.localRedPacketType;
            if (str17 != null) {
                codedOutputByteBufferNano.m17316R(95, str17);
            }
            AudioText audioText = message.localAudioText;
            if (audioText != null) {
                codedOutputByteBufferNano.m17309K(96, audioText, AudioText.PROTOBUF_ADAPTER);
            }
            String str18 = message.localGreetingId;
            if (str18 != null) {
                codedOutputByteBufferNano.m17316R(97, str18);
            }
            codedOutputByteBufferNano.m17299A(98, message.read);
            codedOutputByteBufferNano.m17299A(99, message.needRead);
            MessageExtData messageExtData = message.extData;
            if (messageExtData != null) {
                codedOutputByteBufferNano.m17309K(100, messageExtData, MessageExtData.PROTOBUF_ADAPTER);
            }
            String str19 = message.fromConvType;
            if (str19 != null) {
                codedOutputByteBufferNano.m17316R(101, str19);
            }
            String str20 = message.localExtraInfo;
            if (str20 != null) {
                codedOutputByteBufferNano.m17316R(102, str20);
            }
            MessageSentFrom messageSentFrom2 = message.sentFrom;
            if (messageSentFrom2 != null) {
                codedOutputByteBufferNano.m17309K(103, messageSentFrom2, MessageSentFrom.PROTOBUF_ADAPTER);
            }
            NotificationStatus notificationStatus2 = message.localNotificationStatus;
            if (notificationStatus2 != null) {
                codedOutputByteBufferNano.m17309K(104, notificationStatus2, NotificationStatus.PROTOBUF_ADAPTER);
            }
            CallHandledStatus callHandledStatus2 = message.localCallHandledStatus;
            if (callHandledStatus2 != null) {
                codedOutputByteBufferNano.m17309K(105, callHandledStatus2, CallHandledStatus.PROTOBUF_ADAPTER);
            }
            MessageType messageType3 = message.msgType;
            if (messageType3 != null) {
                codedOutputByteBufferNano.m17309K(106, messageType3, MessageType.PROTOBUF_ADAPTER);
            }
            MessageType messageType4 = message.messageType;
            if (messageType4 != null) {
                codedOutputByteBufferNano.m17309K(107, messageType4, MessageType.PROTOBUF_ADAPTER);
            }
            List<LocalBusinessType> list6 = message.localBusinessTypes;
            if (list6 != null) {
                codedOutputByteBufferNano.m17309K(108, list6, LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageChannel messageChannel2 = message.channel;
            if (messageChannel2 != null) {
                codedOutputByteBufferNano.m17309K(109, messageChannel2, MessageChannel.PROTOBUF_ADAPTER);
            }
            MessageStatus messageStatus2 = message.status;
            if (messageStatus2 != null) {
                codedOutputByteBufferNano.m17309K(110, messageStatus2, MessageStatus.PROTOBUF_ADAPTER);
            }
            String str21 = message.incTempInfo;
            if (str21 != null) {
                codedOutputByteBufferNano.m17316R(111, str21);
            }
            List<String> list7 = message.riskTags;
            if (list7 != null) {
                codedOutputByteBufferNano.m17309K(112, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(113, message.localMyVisitorCount);
            codedOutputByteBufferNano.m17299A(114, message.localMyVisitorHidden);
        }
    };
    public static JsonAdapter<Message> JSON_ADAPTER = new ObjectJsonAdapter<Message>() { // from class: com.p1.mobile.putong.core.data.Message.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Message.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Message newInstance() {
            return new Message();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Message message, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2115023086:
                    if (str.equals(Accessory.TYPE)) {
                        b = 0;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 1;
                    }
                    break;
                case -1916634127:
                    if (str.equals("referenceMsgId")) {
                        b = 2;
                    }
                    break;
                case -1865902680:
                    if (str.equals("localRedPacketType")) {
                        b = 3;
                    }
                    break;
                case -1480073705:
                    if (str.equals("recalledHint")) {
                        b = 4;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 5;
                    }
                    break;
                case -1320113003:
                    if (str.equals("localPrivateQuestions")) {
                        b = 6;
                    }
                    break;
                case -1306659477:
                    if (str.equals("extData")) {
                        b = 7;
                    }
                    break;
                case -1211484957:
                    if (str.equals("hostId")) {
                        b = 8;
                    }
                    break;
                case -1190059184:
                    if (str.equals("notifiedUsers")) {
                        b = 9;
                    }
                    break;
                case -1106172890:
                    if (str.equals("letter")) {
                        b = 10;
                    }
                    break;
                case -1090710648:
                    if (str.equals("riskTags")) {
                        b = 11;
                    }
                    break;
                case -974458767:
                    if (str.equals("additionalData")) {
                        b = 12;
                    }
                    break;
                case -925155509:
                    if (str.equals(Reference.TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 14;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = 15;
                    }
                    break;
                case -812334224:
                    if (str.equals("recalled")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -716550162:
                    if (str.equals("coinSign")) {
                        b = 17;
                    }
                    break;
                case -709194763:
                    if (str.equals("isBottom")) {
                        b = 18;
                    }
                    break;
                case -578566807:
                    if (str.equals("isNewComment")) {
                        b = 19;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 20;
                    }
                    break;
                case -434442796:
                    if (str.equals("recalledReason")) {
                        b = 21;
                    }
                    break;
                case -296152496:
                    if (str.equals("parentCommentId")) {
                        b = 22;
                    }
                    break;
                case -18795073:
                    if (str.equals("moreSubComments")) {
                        b = 23;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 24;
                    }
                    break;
                case 3045982:
                    if (str.equals("call")) {
                        b = 25;
                    }
                    break;
                case 102974381:
                    if (str.equals("liked")) {
                        b = 26;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        b = 27;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 28;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 29;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 30;
                    }
                    break;
                case 423833116:
                    if (str.equals("secondSend")) {
                        b = 31;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 865606476:
                    if (str.equals("needRead")) {
                        b = 33;
                    }
                    break;
                case 1261817698:
                    if (str.equals("sentFrom")) {
                        b = 34;
                    }
                    break;
                case 1343251147:
                    if (str.equals("msgData")) {
                        b = 35;
                    }
                    break;
                case 1343750747:
                    if (str.equals("msgType")) {
                        b = 36;
                    }
                    break;
                case 1426221625:
                    if (str.equals("subCommentIds")) {
                        b = 37;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 38;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 39;
                    }
                    break;
                case 2103213997:
                    if (str.equals("commentInfo")) {
                        b = 40;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    message.api_only_accessory = MessageAccessory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    message.api_only_otherUser = Converter.GROUP_ID.parse(jsonParser, str2);
                    return true;
                case 2:
                    message.referenceMsgId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    message.localRedPacketType = jsonParser.getValueAsString();
                    return true;
                case 4:
                    message.recalledHint = jsonParser.getValueAsString();
                    return true;
                case 5:
                    message.action = jsonParser.getValueAsString();
                    return true;
                case 6:
                    message.localPrivateQuestions = JsonAdapter.parseArray(jsonParser, PrivateQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    message.extData = MessageExtData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    message.hostId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    message.notifiedUsers = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    message.letter = Letter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    message.riskTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    message.additionalData = MessageAdditionalData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    message.api_only_reference = MessageReference.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    message.status = MessageStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 15:
                    message.consumeType = jsonParser.getValueAsString();
                    return true;
                case 16:
                    message.recalled = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case 17:
                    message.coinSign = jsonParser.getValueAsString();
                    return true;
                case 18:
                    message.isBottom = jsonParser.getValueAsBoolean();
                    return true;
                case 19:
                    message.isNewComment = jsonParser.getValueAsBoolean();
                    return true;
                case 20:
                    message.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 21:
                    message.recalledReason = jsonParser.getValueAsString();
                    return true;
                case 22:
                    message.parentCommentId = jsonParser.getValueAsString();
                    return true;
                case 23:
                    message.moreSubComments = jsonParser.getValueAsString();
                    return true;
                case 24:
                    message.f56859id = jsonParser.getValueAsString();
                    return false;
                case 25:
                    message.call = CallRecord.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    message.liked = jsonParser.getValueAsBoolean();
                    return true;
                case 27:
                    message.likes = jsonParser.getValueAsInt();
                    return true;
                case 28:
                    message.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    message.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 30:
                    message.value = jsonParser.getValueAsString();
                    return true;
                case 31:
                    message.secondSend = jsonParser.getValueAsBoolean();
                    return true;
                case 32:
                    message.channel = MessageChannel.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 33:
                    message.needRead = jsonParser.getValueAsBoolean();
                    return true;
                case 34:
                    message.sentFrom = MessageSentFrom.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 35:
                    message.msgData = jsonParser.getValueAsString();
                    return true;
                case 36:
                    message.messageType = MessageType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 37:
                    message.subCommentIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 38:
                    message.settings = MessageSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 39:
                    message.location = MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 40:
                    message.commentInfo = CommentInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Message message, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2115023086:
                    if (str.equals(Accessory.TYPE)) {
                        b = 0;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 1;
                    }
                    break;
                case -1916634127:
                    if (str.equals("referenceMsgId")) {
                        b = 2;
                    }
                    break;
                case -1865902680:
                    if (str.equals("localRedPacketType")) {
                        b = 3;
                    }
                    break;
                case -1480073705:
                    if (str.equals("recalledHint")) {
                        b = 4;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 5;
                    }
                    break;
                case -1320113003:
                    if (str.equals("localPrivateQuestions")) {
                        b = 6;
                    }
                    break;
                case -1306659477:
                    if (str.equals("extData")) {
                        b = 7;
                    }
                    break;
                case -1211484957:
                    if (str.equals("hostId")) {
                        b = 8;
                    }
                    break;
                case -1190059184:
                    if (str.equals("notifiedUsers")) {
                        b = 9;
                    }
                    break;
                case -1106172890:
                    if (str.equals("letter")) {
                        b = 10;
                    }
                    break;
                case -1090710648:
                    if (str.equals("riskTags")) {
                        b = 11;
                    }
                    break;
                case -974458767:
                    if (str.equals("additionalData")) {
                        b = 12;
                    }
                    break;
                case -925155509:
                    if (str.equals(Reference.TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 14;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = 15;
                    }
                    break;
                case -812334224:
                    if (str.equals("recalled")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -716550162:
                    if (str.equals("coinSign")) {
                        b = 17;
                    }
                    break;
                case -709194763:
                    if (str.equals("isBottom")) {
                        b = 18;
                    }
                    break;
                case -578566807:
                    if (str.equals("isNewComment")) {
                        b = 19;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 20;
                    }
                    break;
                case -434442796:
                    if (str.equals("recalledReason")) {
                        b = 21;
                    }
                    break;
                case -296152496:
                    if (str.equals("parentCommentId")) {
                        b = 22;
                    }
                    break;
                case -18795073:
                    if (str.equals("moreSubComments")) {
                        b = 23;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 24;
                    }
                    break;
                case 3045982:
                    if (str.equals("call")) {
                        b = 25;
                    }
                    break;
                case 102974381:
                    if (str.equals("liked")) {
                        b = 26;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        b = 27;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 28;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 29;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 30;
                    }
                    break;
                case 423833116:
                    if (str.equals("secondSend")) {
                        b = 31;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 865606476:
                    if (str.equals("needRead")) {
                        b = 33;
                    }
                    break;
                case 1261817698:
                    if (str.equals("sentFrom")) {
                        b = 34;
                    }
                    break;
                case 1343251147:
                    if (str.equals("msgData")) {
                        b = 35;
                    }
                    break;
                case 1343750747:
                    if (str.equals("msgType")) {
                        b = 36;
                    }
                    break;
                case 1426221625:
                    if (str.equals("subCommentIds")) {
                        b = 37;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 38;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 39;
                    }
                    break;
                case 2103213997:
                    if (str.equals("commentInfo")) {
                        b = 40;
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
                case 21:
                case 22:
                case 23:
                    return true;
                case 24:
                    return false;
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
                    return true;
                default:
                    return super.parseFieldCheck(message, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Message message, JsonGenerator jsonGenerator) throws IOException {
            String str = message.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(message.createdTime), jsonGenerator, true);
            if (message.api_only_otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                Converter.GROUP_ID.serialize(message.api_only_otherUser, jsonGenerator, true);
            }
            if (message.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(message.media, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            if (message.sentFrom != null) {
                jsonGenerator.writeFieldName("sentFrom");
                MessageSentFrom.JSON_ADAPTER.serialize(message.sentFrom, jsonGenerator, true);
            }
            if (message.api_only_reference != null) {
                jsonGenerator.writeFieldName(Reference.TYPE);
                MessageReference.JSON_ADAPTER.serialize(message.api_only_reference, jsonGenerator, true);
            }
            if (message.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(message.owner, jsonGenerator, true);
            }
            if (message.location != null) {
                jsonGenerator.writeFieldName("location");
                MessageLocation.JSON_ADAPTER.serialize(message.location, jsonGenerator, true);
            }
            Boolean bool = message.recalled;
            if (bool != null) {
                jsonGenerator.writeBooleanField("recalled", bool.booleanValue());
            }
            String str2 = message.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (message.api_only_accessory != null) {
                jsonGenerator.writeFieldName(Accessory.TYPE);
                MessageAccessory.JSON_ADAPTER.serialize(message.api_only_accessory, jsonGenerator, true);
            }
            if (message.call != null) {
                jsonGenerator.writeFieldName("call");
                CallRecord.JSON_ADAPTER.serialize(message.call, jsonGenerator, true);
            }
            if (message.localPrivateQuestions != null) {
                jsonGenerator.writeFieldName("localPrivateQuestions");
                JsonAdapter.serializeArray(message.localPrivateQuestions, jsonGenerator, PrivateQuestion.JSON_ADAPTER);
            }
            if (message.letter != null) {
                jsonGenerator.writeFieldName("letter");
                Letter.JSON_ADAPTER.serialize(message.letter, jsonGenerator, true);
            }
            String str3 = message.recalledReason;
            if (str3 != null) {
                jsonGenerator.writeStringField("recalledReason", str3);
            }
            String str4 = message.recalledHint;
            if (str4 != null) {
                jsonGenerator.writeStringField("recalledHint", str4);
            }
            if (message.messageType != null) {
                jsonGenerator.writeFieldName("msgType");
                MessageType.JSON_ADAPTER.serialize(message.messageType, jsonGenerator, true);
            }
            if (message.additionalData != null) {
                jsonGenerator.writeFieldName("additionalData");
                MessageAdditionalData.JSON_ADAPTER.serialize(message.additionalData, jsonGenerator, true);
            }
            if (message.commentInfo != null) {
                jsonGenerator.writeFieldName("commentInfo");
                CommentInfo.JSON_ADAPTER.serialize(message.commentInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("likes", message.likes);
            jsonGenerator.writeBooleanField("liked", message.liked);
            String str5 = message.parentCommentId;
            if (str5 != null) {
                jsonGenerator.writeStringField("parentCommentId", str5);
            }
            if (message.subCommentIds != null) {
                jsonGenerator.writeFieldName("subCommentIds");
                JsonAdapter.serializeArray(message.subCommentIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str6 = message.moreSubComments;
            if (str6 != null) {
                jsonGenerator.writeStringField("moreSubComments", str6);
            }
            jsonGenerator.writeBooleanField("isBottom", message.isBottom);
            String str7 = message.msgData;
            if (str7 != null) {
                jsonGenerator.writeStringField("msgData", str7);
            }
            if (message.settings != null) {
                jsonGenerator.writeFieldName(Settings.TYPE);
                MessageSetting.JSON_ADAPTER.serialize(message.settings, jsonGenerator, true);
            }
            if (message.channel != null) {
                jsonGenerator.writeFieldName("channel");
                MessageChannel.JSON_ADAPTER.serialize(message.channel, jsonGenerator, true);
            }
            if (message.notifiedUsers != null) {
                jsonGenerator.writeFieldName("notifiedUsers");
                JsonAdapter.serializeArray(message.notifiedUsers, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (message.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                MessageStatus.JSON_ADAPTER.serialize(message.status, jsonGenerator, true);
            }
            String str8 = message.referenceMsgId;
            if (str8 != null) {
                jsonGenerator.writeStringField("referenceMsgId", str8);
            }
            String str9 = message.hostId;
            if (str9 != null) {
                jsonGenerator.writeStringField("hostId", str9);
            }
            String str10 = message.localRedPacketType;
            if (str10 != null) {
                jsonGenerator.writeStringField("localRedPacketType", str10);
            }
            jsonGenerator.writeBooleanField("isNewComment", message.isNewComment);
            jsonGenerator.writeBooleanField("needRead", message.needRead);
            if (message.extData != null) {
                jsonGenerator.writeFieldName("extData");
                MessageExtData.JSON_ADAPTER.serialize(message.extData, jsonGenerator, true);
            }
            String str11 = message.consumeType;
            if (str11 != null) {
                jsonGenerator.writeStringField("consumeType", str11);
            }
            String str12 = message.coinSign;
            if (str12 != null) {
                jsonGenerator.writeStringField("coinSign", str12);
            }
            String str13 = message.action;
            if (str13 != null) {
                jsonGenerator.writeStringField("action", str13);
            }
            if (message.riskTags != null) {
                jsonGenerator.writeFieldName("riskTags");
                JsonAdapter.serializeArray(message.riskTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("secondSend", message.secondSend);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Message) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Message) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Message> _ID = new LongColumn<Message>("_id") { // from class: com.p1.mobile.putong.core.data.Message.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Message message) {
            return Long.valueOf(message._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Long l2) {
            message._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Message> f21183ID = new StringColumn<Message>("id_c") { // from class: com.p1.mobile.putong.core.data.Message.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.f56859id = str;
        }
    };
    public static final LongColumn<Message> LOCALCREATEDTIME = new LongColumn<Message>("localCreatedTime_c") { // from class: com.p1.mobile.putong.core.data.Message.5
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Message message) {
            return Long.valueOf(message.localCreatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Long l2) {
            message.localCreatedTime = l2.longValue();
        }
    };
    public static final IntegerColumn<Message> LOCALCREATEDSESSION = new IntegerColumn<Message>("localCreatedSession_c") { // from class: com.p1.mobile.putong.core.data.Message.6
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Message message) {
            return Integer.valueOf(message.localCreatedSession);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Integer num) {
            message.localCreatedSession = num.intValue();
        }
    };
    public static final BooleanColumn<Message> LOCALINMOMENT = new BooleanColumn<Message>("localInMoment_c") { // from class: com.p1.mobile.putong.core.data.Message.7
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Message message) {
            return Boolean.valueOf(message.localInMoment);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Boolean bool) {
            message.localInMoment = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Message> LOCALINCONVERSATION = new BooleanColumn<Message>("localInConversation_c") { // from class: com.p1.mobile.putong.core.data.Message.8
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Message message) {
            return Boolean.valueOf(message.localInConversation);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Boolean bool) {
            message.localInConversation = bool.booleanValue();
        }
    };
    public static final DoubleColumn<Message> CREATEDTIME = new DoubleColumn<Message>("createdTime_c") { // from class: com.p1.mobile.putong.core.data.Message.9
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Message message) {
            return Double.valueOf(message.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Double d) {
            message.createdTime = d.doubleValue();
        }
    };
    public static final StringColumn<Message> CID = new StringColumn<Message>("cid_c") { // from class: com.p1.mobile.putong.core.data.Message.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.cid;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.cid = str;
        }
    };
    public static final Column<Message, List<Media>> MEDIA = new Column<Message, List<Media>>("media_c") { // from class: com.p1.mobile.putong.core.data.Message.11
        @Override // com.tantanapp.common.data.orm.Column
        public List<Media> get(Message message) {
            return message.media;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, List<Media> list) {
            message.media = list;
        }
    };
    public static final StringColumn<Message> STICKER = new StringColumn<Message>("sticker_c") { // from class: com.p1.mobile.putong.core.data.Message.12
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.sticker;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.sticker = str;
        }
    };
    public static final StringColumn<Message> QUESTION = new StringColumn<Message>("question_c") { // from class: com.p1.mobile.putong.core.data.Message.13
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.question;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.question = str;
        }
    };
    public static final TEnumColumn<Message, MessageSentFrom> SENTFROM = new TEnumColumn<Message, MessageSentFrom>("str_sentFrom_c", "sentFrom_c", MessageSentFrom.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Message.14
        @Override // com.tantanapp.common.data.orm.Column
        public MessageSentFrom get(Message message) {
            return message.sentFrom;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Message message, MessageSentFrom messageSentFrom) {
            message.sentFrom = messageSentFrom;
        }
    };
    public static final StringColumn<Message> MOMENT = new StringColumn<Message>("moment_c") { // from class: com.p1.mobile.putong.core.data.Message.15
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.moment;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.moment = str;
        }
    };
    public static final StringColumn<Message> ANSWEROFMESSAGE = new StringColumn<Message>("answerOfMessage_c") { // from class: com.p1.mobile.putong.core.data.Message.16
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.answerOfMessage;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.answerOfMessage = str;
        }
    };
    public static final StringColumn<Message> OWNER = new StringColumn<Message>("owner_c") { // from class: com.p1.mobile.putong.core.data.Message.17
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.owner;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.owner = str;
        }
    };
    public static final Column<Message, MessageLocation> LOCATION = new Column<Message, MessageLocation>("location_c") { // from class: com.p1.mobile.putong.core.data.Message.18
        @Override // com.tantanapp.common.data.orm.Column
        public MessageLocation get(Message message) {
            return message.location;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, MessageLocation messageLocation) {
            message.location = messageLocation;
        }
    };
    public static final BooleanColumn<Message> RECALLED = new BooleanColumn<Message>("recalled_c") { // from class: com.p1.mobile.putong.core.data.Message.19
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Message message) {
            return message.recalled;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Boolean bool) {
            message.recalled = bool;
        }
    };
    public static final StringColumn<Message> VALUE = new StringColumn<Message>("value_c") { // from class: com.p1.mobile.putong.core.data.Message.20
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.value;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.value = str;
        }
    };
    public static final TEnumColumn<Message, NotificationStatus> LOCALNOTIFICATIONSTATUS = new TEnumColumn<Message, NotificationStatus>("str_localNotificationStatus_c", "localNotificationStatus_c", NotificationStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Message.21
        @Override // com.tantanapp.common.data.orm.Column
        public NotificationStatus get(Message message) {
            return message.localNotificationStatus;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Message message, NotificationStatus notificationStatus) {
            message.localNotificationStatus = notificationStatus;
        }
    };
    public static final StringColumn<Message> LIKEOFMOMENT = new StringColumn<Message>("likeOfMoment_c") { // from class: com.p1.mobile.putong.core.data.Message.22
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.likeOfMoment;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.likeOfMoment = str;
        }
    };
    public static final StringColumn<Message> LOCALANIMATIONKEY = new StringColumn<Message>("localAnimationKey_c") { // from class: com.p1.mobile.putong.core.data.Message.23
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.localAnimationKey;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.localAnimationKey = str;
        }
    };
    public static final Column<Message, MessageAccessory> API_ONLY_ACCESSORY = new Column<Message, MessageAccessory>("api_only_accessory_c") { // from class: com.p1.mobile.putong.core.data.Message.24
        @Override // com.tantanapp.common.data.orm.Column
        public MessageAccessory get(Message message) {
            return message.api_only_accessory;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, MessageAccessory messageAccessory) {
            message.api_only_accessory = messageAccessory;
        }
    };
    public static final Column<Message, List<GiftRecord>> GIFTRECORDS = new Column<Message, List<GiftRecord>>("giftRecords_c") { // from class: com.p1.mobile.putong.core.data.Message.25
        @Override // com.tantanapp.common.data.orm.Column
        public List<GiftRecord> get(Message message) {
            return message.giftRecords;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, List<GiftRecord> list) {
            message.giftRecords = list;
        }
    };
    public static final Column<Message, CallRecord> CALL = new Column<Message, CallRecord>("call_c") { // from class: com.p1.mobile.putong.core.data.Message.26
        @Override // com.tantanapp.common.data.orm.Column
        public CallRecord get(Message message) {
            return message.call;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, CallRecord callRecord) {
            message.call = callRecord;
        }
    };
    public static final StringColumn<Message> LOCALCALLTYPE = new StringColumn<Message>("localCallType_c") { // from class: com.p1.mobile.putong.core.data.Message.27
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.localCallType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.localCallType = str;
        }
    };
    public static final IntegerColumn<Message> LOCALCALLSTATUS = new IntegerColumn<Message>("localCallStatus_c") { // from class: com.p1.mobile.putong.core.data.Message.28
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Message message) {
            return Integer.valueOf(message.localCallStatus);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Integer num) {
            message.localCallStatus = num.intValue();
        }
    };
    public static final TEnumColumn<Message, CallHandledStatus> LOCALCALLHANDLEDSTATUS = new TEnumColumn<Message, CallHandledStatus>("str_localCallHandledStatus_c", "localCallHandledStatus_c", CallHandledStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Message.29
        @Override // com.tantanapp.common.data.orm.Column
        public CallHandledStatus get(Message message) {
            return message.localCallHandledStatus;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Message message, CallHandledStatus callHandledStatus) {
            message.localCallHandledStatus = callHandledStatus;
        }
    };
    public static final Column<Message, List<PrivateQuestion>> LOCALPRIVATEQUESTIONS = new Column<Message, List<PrivateQuestion>>("localPrivateQuestions_c") { // from class: com.p1.mobile.putong.core.data.Message.30
        @Override // com.tantanapp.common.data.orm.Column
        public List<PrivateQuestion> get(Message message) {
            return message.localPrivateQuestions;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, List<PrivateQuestion> list) {
            message.localPrivateQuestions = list;
        }
    };
    public static final Column<Message, Letter> LETTER = new Column<Message, Letter>("letter_c") { // from class: com.p1.mobile.putong.core.data.Message.31
        @Override // com.tantanapp.common.data.orm.Column
        public Letter get(Message message) {
            return message.letter;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Letter letter) {
            message.letter = letter;
        }
    };
    public static final BooleanColumn<Message> CHATTYPING = new BooleanColumn<Message>("chatTyping_c") { // from class: com.p1.mobile.putong.core.data.Message.32
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Message message) {
            return Boolean.valueOf(message.chatTyping);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Boolean bool) {
            message.chatTyping = bool.booleanValue();
        }
    };
    public static final IntegerColumn<Message> LOCALFAILTYPE = new IntegerColumn<Message>("localFailType_c") { // from class: com.p1.mobile.putong.core.data.Message.33
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Message message) {
            return Integer.valueOf(message.localFailType);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, Integer num) {
            message.localFailType = num.intValue();
        }
    };
    public static final StringColumn<Message> RECALLEDREASON = new StringColumn<Message>("recalledReason_c") { // from class: com.p1.mobile.putong.core.data.Message.34
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.recalledReason;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.recalledReason = str;
        }
    };
    public static final StringColumn<Message> RECALLEDHINT = new StringColumn<Message>("recalledHint_c") { // from class: com.p1.mobile.putong.core.data.Message.35
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Message message) {
            return message.recalledHint;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Message message, String str) {
            message.recalledHint = str;
        }
    };
    public int viewHeight = -1;
    public ProfileLikeSnapshot tempProfileLikeSnapshot = null;
    private AiChatMessageExtraInfo aiChatMessageExtraInfo = null;
    private String msgDataOld = "";
    private HashSet<String> parseFieldSet = new HashSet<>();

    static {
        TEnumJsonAdapter<MessageType> tEnumJsonAdapter = MessageType.JSON_ADAPTER;
        MSGTYPE = new TEnumColumn<Message, MessageType>("str_msgType_c", "msgType_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.Message.36
            @Override // com.tantanapp.common.data.orm.Column
            public MessageType get(Message message) {
                return message.msgType;
            }

            @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
            public void setTEnum(Message message, MessageType messageType) {
                message.msgType = messageType;
            }
        };
        MESSAGETYPE = new TEnumColumn<Message, MessageType>("str_messageType_c", "messageType_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.Message.37
            @Override // com.tantanapp.common.data.orm.Column
            public MessageType get(Message message) {
                return message.messageType;
            }

            @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
            public void setTEnum(Message message, MessageType messageType) {
                message.messageType = messageType;
            }
        };
        ADDITIONALDATA = new Column<Message, MessageAdditionalData>("additionalData_c") { // from class: com.p1.mobile.putong.core.data.Message.38
            @Override // com.tantanapp.common.data.orm.Column
            public MessageAdditionalData get(Message message) {
                return message.additionalData;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, MessageAdditionalData messageAdditionalData) {
                message.additionalData = messageAdditionalData;
            }
        };
        LOCALSAFETYREMINDER = new BooleanColumn<Message>("localSafetyReminder_c") { // from class: com.p1.mobile.putong.core.data.Message.39
            @Override // com.tantanapp.common.data.orm.Column
            public Boolean get(Message message) {
                return Boolean.valueOf(message.localSafetyReminder);
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, Boolean bool) {
                message.localSafetyReminder = bool.booleanValue();
            }
        };
        LOCALSENSITIVEWORDREMINDER = new BooleanColumn<Message>("localSensitiveWordReminder_c") { // from class: com.p1.mobile.putong.core.data.Message.40
            @Override // com.tantanapp.common.data.orm.Column
            public Boolean get(Message message) {
                return Boolean.valueOf(message.localSensitiveWordReminder);
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, Boolean bool) {
                message.localSensitiveWordReminder = bool.booleanValue();
            }
        };
        MSGDATA = new StringColumn<Message>("msgData_c") { // from class: com.p1.mobile.putong.core.data.Message.41
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.msgData;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.msgData = str;
            }
        };
        SETTINGS_ANONYMOUS = new BooleanColumn<Message>("settings_anonymous_c") { // from class: com.p1.mobile.putong.core.data.Message.42
            @Override // com.tantanapp.common.data.orm.Column
            public Boolean get(Message message) {
                return Boolean.valueOf(message.settings.anonymous);
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, Boolean bool) {
                message.settings.anonymous = bool.booleanValue();
            }
        };
        CHANNEL = new TEnumColumn<Message, MessageChannel>("str_channel_c", "channel_c", MessageChannel.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Message.43
            @Override // com.tantanapp.common.data.orm.Column
            public MessageChannel get(Message message) {
                return message.channel;
            }

            @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
            public void setTEnum(Message message, MessageChannel messageChannel) {
                message.channel = messageChannel;
            }
        };
        NOTIFIEDUSERS = new Column<Message, List<String>>("notifiedUsers_c") { // from class: com.p1.mobile.putong.core.data.Message.44
            @Override // com.tantanapp.common.data.orm.Column
            public List<String> get(Message message) {
                return message.notifiedUsers;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, List<String> list) {
                message.notifiedUsers = list;
            }
        };
        STATUS = new TEnumColumn<Message, MessageStatus>("str_status_c", "status_c", MessageStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Message.45
            @Override // com.tantanapp.common.data.orm.Column
            public MessageStatus get(Message message) {
                return message.status;
            }

            @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
            public void setTEnum(Message message, MessageStatus messageStatus) {
                message.status = messageStatus;
            }
        };
        REFERENCEMSGID = new StringColumn<Message>("referenceMsgId_c") { // from class: com.p1.mobile.putong.core.data.Message.46
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.referenceMsgId;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.referenceMsgId = str;
            }
        };
        HOSTID = new StringColumn<Message>("hostId_c") { // from class: com.p1.mobile.putong.core.data.Message.47
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.hostId;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.hostId = str;
            }
        };
        LOCALREDPACKETTYPE = new StringColumn<Message>("localRedPacketType_c") { // from class: com.p1.mobile.putong.core.data.Message.48
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.localRedPacketType;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.localRedPacketType = str;
            }
        };
        LOCALAUDIOTEXT = new Column<Message, AudioText>("localAudioText_c") { // from class: com.p1.mobile.putong.core.data.Message.49
            @Override // com.tantanapp.common.data.orm.Column
            public AudioText get(Message message) {
                return message.localAudioText;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, AudioText audioText) {
                message.localAudioText = audioText;
            }
        };
        LOCALGREETINGID = new StringColumn<Message>("localGreetingId_c") { // from class: com.p1.mobile.putong.core.data.Message.50
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.localGreetingId;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.localGreetingId = str;
            }
        };
        READ = new BooleanColumn<Message>("read_c") { // from class: com.p1.mobile.putong.core.data.Message.51
            @Override // com.tantanapp.common.data.orm.Column
            public Boolean get(Message message) {
                return Boolean.valueOf(message.read);
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, Boolean bool) {
                message.read = bool.booleanValue();
            }
        };
        NEEDREAD = new BooleanColumn<Message>("needRead_c") { // from class: com.p1.mobile.putong.core.data.Message.52
            @Override // com.tantanapp.common.data.orm.Column
            public Boolean get(Message message) {
                return Boolean.valueOf(message.needRead);
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, Boolean bool) {
                message.needRead = bool.booleanValue();
            }
        };
        EXTDATA = new Column<Message, MessageExtData>("extData_c") { // from class: com.p1.mobile.putong.core.data.Message.53
            @Override // com.tantanapp.common.data.orm.Column
            public MessageExtData get(Message message) {
                return message.extData;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, MessageExtData messageExtData) {
                message.extData = messageExtData;
            }
        };
        FROMCONVTYPE = new StringColumn<Message>("fromConvType_c") { // from class: com.p1.mobile.putong.core.data.Message.54
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.fromConvType;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.fromConvType = str;
            }
        };
        LOCALEXTRAINFO = new StringColumn<Message>("localExtraInfo_c") { // from class: com.p1.mobile.putong.core.data.Message.55
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.localExtraInfo;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.localExtraInfo = str;
            }
        };
        STR_LOCALBUSINESSTYPES = new Column<Message, List<LocalBusinessType>>("str_localBusinessTypes_c") { // from class: com.p1.mobile.putong.core.data.Message.56
            @Override // com.tantanapp.common.data.orm.Column
            public List<LocalBusinessType> get(Message message) {
                return message.localBusinessTypes;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, List<LocalBusinessType> list) {
                message.localBusinessTypes = list;
            }
        };
        INCTEMPINFO = new StringColumn<Message>("incTempInfo_c") { // from class: com.p1.mobile.putong.core.data.Message.57
            @Override // com.tantanapp.common.data.orm.Column
            public String get(Message message) {
                return message.incTempInfo;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, String str) {
                message.incTempInfo = str;
            }
        };
        RISKTAGS = new Column<Message, List<String>>("riskTags_c") { // from class: com.p1.mobile.putong.core.data.Message.58
            @Override // com.tantanapp.common.data.orm.Column
            public List<String> get(Message message) {
                return message.riskTags;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, List<String> list) {
                message.riskTags = list;
            }
        };
        LOCALMYVISITORCOUNT = new IntegerColumn<Message>("localMyVisitorCount_c") { // from class: com.p1.mobile.putong.core.data.Message.59
            @Override // com.tantanapp.common.data.orm.Column
            public Integer get(Message message) {
                return Integer.valueOf(message.localMyVisitorCount);
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, Integer num) {
                message.localMyVisitorCount = num.intValue();
            }
        };
        LOCALMYVISITORHIDDEN = new BooleanColumn<Message>("localMyVisitorHidden_c") { // from class: com.p1.mobile.putong.core.data.Message.60
            @Override // com.tantanapp.common.data.orm.Column
            public Boolean get(Message message) {
                return Boolean.valueOf(message.localMyVisitorHidden);
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(Message message, Boolean bool) {
                message.localMyVisitorHidden = bool.booleanValue();
            }
        };
        DB_ADAPTER = new vzf0<Message>() { // from class: com.p1.mobile.putong.core.data.Message.61
            @Override // p153l.vzf0
            public String CREATE_TABLE(wzh0 wzh0Var) {
                return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,localCreatedTime_c INTEGER,localCreatedSession_c INTEGER,localInMoment_c INTEGER,localInConversation_c INTEGER,createdTime_c REAL,cid_c TEXT,media_c BLOB,sticker_c TEXT,question_c TEXT,sentFrom_c INTEGER,moment_c TEXT,answerOfMessage_c TEXT,owner_c TEXT,location_c BLOB,recalled_c INTEGER,value_c TEXT,localNotificationStatus_c INTEGER,likeOfMoment_c TEXT,localAnimationKey_c TEXT,api_only_accessory_c BLOB,giftRecords_c BLOB,call_c BLOB,localCallType_c TEXT,localCallStatus_c INTEGER,localCallHandledStatus_c INTEGER,localPrivateQuestions_c BLOB,letter_c BLOB,chatTyping_c INTEGER,localFailType_c INTEGER,recalledReason_c TEXT,recalledHint_c TEXT,msgType_c INTEGER,messageType_c INTEGER,additionalData_c BLOB,localSafetyReminder_c INTEGER,localSensitiveWordReminder_c INTEGER,msgData_c TEXT,localBusinessTypes_c BLOB,settings_anonymous_c INTEGER,channel_c INTEGER,notifiedUsers_c BLOB,status_c INTEGER,referenceMsgId_c TEXT,hostId_c TEXT,localRedPacketType_c TEXT,localAudioText_c BLOB,localGreetingId_c TEXT,read_c INTEGER,needRead_c INTEGER,extData_c BLOB,fromConvType_c TEXT,localExtraInfo_c TEXT,str_sentFrom_c TEXT,str_localNotificationStatus_c TEXT,str_localCallHandledStatus_c TEXT,str_msgType_c TEXT,str_messageType_c TEXT,str_localBusinessTypes_c BLOB,str_channel_c TEXT,str_status_c TEXT,incTempInfo_c TEXT,riskTags_c BLOB,localMyVisitorCount_c INTEGER,localMyVisitorHidden_c INTEGER)";
            }

            @Override // p153l.vzf0
            public Class getDataClass() {
                return Message.class;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p153l.vzf0
            public Message init() {
                Message message = new Message();
                if (message.api_only_otherUser == null) {
                    message.api_only_otherUser = "";
                }
                if (message.cid == null) {
                    message.cid = "";
                }
                if (message.owner == null) {
                    message.owner = "";
                }
                if (message.value == null) {
                    message.value = "";
                }
                if (message.localNotificationStatus == null) {
                    message.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
                }
                if (message.localCallHandledStatus == null) {
                    message.localCallHandledStatus = (CallHandledStatus) CallHandledStatus.JSON_ADAPTER.defaultEnum();
                }
                if (message.localPrivateQuestions == null) {
                    message.localPrivateQuestions = new ArrayList();
                }
                if (message.commentInfo == null) {
                    message.commentInfo = CommentInfo.new_();
                }
                if (message.parentCommentId == null) {
                    message.parentCommentId = "";
                }
                if (message.subCommentIds == null) {
                    message.subCommentIds = new ArrayList();
                }
                if (message.moreSubComments == null) {
                    message.moreSubComments = "";
                }
                if (message.localBusinessTypes == null) {
                    message.localBusinessTypes = new ArrayList();
                }
                if (message.settings == null) {
                    message.settings = MessageSetting.new_();
                }
                if (message.channel == null) {
                    message.channel = (MessageChannel) MessageChannel.JSON_ADAPTER.defaultEnum();
                }
                if (message.notifiedUsers == null) {
                    message.notifiedUsers = new ArrayList();
                }
                if (message.status == null) {
                    message.status = (MessageStatus) MessageStatus.JSON_ADAPTER.defaultEnum();
                }
                if (message.referenceMsgId == null) {
                    message.referenceMsgId = "";
                }
                if (message.hostId == null) {
                    message.hostId = "";
                }
                if (message.localAudioText == null) {
                    message.localAudioText = AudioText.new_();
                }
                if (message.consumeType == null) {
                    message.consumeType = "";
                }
                if (message.coinSign == null) {
                    message.coinSign = "";
                }
                if (message.action == null) {
                    message.action = "";
                }
                if (message.riskTags == null) {
                    message.riskTags = new ArrayList();
                }
                return message;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code duplicated, block: B:311:0x0589 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:315:0x05ab  */
            /* JADX WARN: Code duplicated, block: B:318:0x05b1  */
            /* JADX WARN: Code duplicated, block: B:321:0x05b7  */
            /* JADX WARN: Code duplicated, block: B:324:0x05bd  */
            /* JADX WARN: Code duplicated, block: B:327:0x05c3  */
            /* JADX WARN: Code duplicated, block: B:330:0x05cf  */
            /* JADX WARN: Code duplicated, block: B:333:0x05db  */
            /* JADX WARN: Code duplicated, block: B:336:0x05e6  */
            /* JADX WARN: Code duplicated, block: B:339:0x05f0  */
            /* JADX WARN: Code duplicated, block: B:342:0x05f6  */
            /* JADX WARN: Code duplicated, block: B:345:0x0601  */
            /* JADX WARN: Code duplicated, block: B:348:0x0607  */
            /* JADX WARN: Code duplicated, block: B:351:0x0612  */
            /* JADX WARN: Code duplicated, block: B:354:0x061c  */
            /* JADX WARN: Code duplicated, block: B:357:0x0628  */
            /* JADX WARN: Code duplicated, block: B:360:0x0633  */
            /* JADX WARN: Code duplicated, block: B:363:0x063f  */
            /* JADX WARN: Code duplicated, block: B:366:0x0645  */
            /* JADX WARN: Code duplicated, block: B:369:0x064b  */
            /* JADX WARN: Code duplicated, block: B:372:0x0655  */
            /* JADX WARN: Code duplicated, block: B:375:0x065b  */
            /* JADX WARN: Code duplicated, block: B:378:0x0661  */
            /* JADX WARN: Code duplicated, block: B:381:0x0667  */
            @Override // p153l.vzf0
            public Message read(Cursor cursor, int i) {
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                String string;
                String string2;
                String string3;
                String string4;
                String str;
                List<Integer> list;
                int i7;
                String str2;
                List<Integer> list2;
                String string5;
                String str3;
                String str4;
                String str5;
                TEnumJsonAdapter<NotificationStatus> tEnumJsonAdapter2;
                TEnumJsonAdapter<CallHandledStatus> tEnumJsonAdapter3;
                TEnumJsonAdapter<MessageChannel> tEnumJsonAdapter4;
                TEnumJsonAdapter<MessageStatus> tEnumJsonAdapter5;
                Boolean boolValueOf;
                List<LocalBusinessType> list3;
                List<String> list4;
                String str6 = "unknown_";
                if (i == 0) {
                    this.readIndex = 0;
                }
                Message message = new Message();
                int i8 = -1;
                try {
                    message.settings = new MessageSetting();
                    message._id = cursor.getLong(i);
                    int i9 = i + 1;
                    message.f56859id = cursor.isNull(i9) ? null : cursor.getString(i9);
                    message.localCreatedTime = cursor.getLong(i + 2);
                    message.localCreatedSession = cursor.getInt(i + 3);
                    message.localInMoment = cursor.getInt(i + 4) == 1;
                    message.localInConversation = cursor.getInt(i + 5) == 1;
                    message.createdTime = cursor.getDouble(i + 6);
                    int i10 = i + 7;
                    message.cid = cursor.isNull(i10) ? null : cursor.getString(i10);
                    int i11 = i + 8;
                    message.media = cursor.isNull(i11) ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i11));
                    int i12 = i + 9;
                    message.sticker = cursor.isNull(i12) ? null : cursor.getString(i12);
                    int i13 = i + 10;
                    message.question = cursor.isNull(i13) ? null : cursor.getString(i13);
                    int i14 = i + 11;
                    i7 = cursor.isNull(i14) ? -1 : cursor.getInt(i14);
                    int i15 = i + 12;
                    try {
                        message.moment = cursor.isNull(i15) ? null : cursor.getString(i15);
                        int i16 = i + 13;
                        message.answerOfMessage = cursor.isNull(i16) ? null : cursor.getString(i16);
                        int i17 = i + 14;
                        message.owner = cursor.isNull(i17) ? null : cursor.getString(i17);
                        int i18 = i + 15;
                        message.location = cursor.isNull(i18) ? null : MessageLocation.PROTOBUF_ADAPTER.parse(cursor.getBlob(i18));
                        int i19 = i + 16;
                        if (cursor.isNull(i19)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursor.getInt(i19) == 1);
                        }
                        message.recalled = boolValueOf;
                        int i20 = i + 17;
                        message.value = cursor.isNull(i20) ? null : cursor.getString(i20);
                        int i21 = i + 18;
                        i2 = cursor.isNull(i21) ? -1 : cursor.getInt(i21);
                        int i22 = i + 19;
                        try {
                            message.likeOfMoment = cursor.isNull(i22) ? null : cursor.getString(i22);
                            int i23 = i + 20;
                            message.localAnimationKey = cursor.isNull(i23) ? null : cursor.getString(i23);
                            int i24 = i + 21;
                            message.api_only_accessory = cursor.isNull(i24) ? null : MessageAccessory.PROTOBUF_ADAPTER.parse(cursor.getBlob(i24));
                            int i25 = i + 22;
                            message.giftRecords = cursor.isNull(i25) ? null : GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i25));
                            int i26 = i + 23;
                            message.call = cursor.isNull(i26) ? null : CallRecord.PROTOBUF_ADAPTER.parse(cursor.getBlob(i26));
                            int i27 = i + 24;
                            message.localCallType = cursor.isNull(i27) ? null : cursor.getString(i27);
                            message.localCallStatus = cursor.getInt(i + 25);
                            int i28 = i + 26;
                            i3 = cursor.isNull(i28) ? -1 : cursor.getInt(i28);
                            int i29 = i + 27;
                            try {
                                message.localPrivateQuestions = cursor.isNull(i29) ? null : PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i29));
                                int i30 = i + 28;
                                message.letter = cursor.isNull(i30) ? null : Letter.PROTOBUF_ADAPTER.parse(cursor.getBlob(i30));
                                message.chatTyping = cursor.getInt(i + 29) == 1;
                                message.localFailType = cursor.getInt(i + 30);
                                int i31 = i + 31;
                                message.recalledReason = cursor.isNull(i31) ? null : cursor.getString(i31);
                                int i32 = i + 32;
                                message.recalledHint = cursor.isNull(i32) ? null : cursor.getString(i32);
                                int i33 = i + 33;
                                i4 = cursor.isNull(i33) ? -1 : cursor.getInt(i33);
                                int i34 = i + 34;
                                try {
                                    i5 = cursor.isNull(i34) ? -1 : cursor.getInt(i34);
                                    int i35 = i + 35;
                                    try {
                                        message.additionalData = cursor.isNull(i35) ? null : MessageAdditionalData.PROTOBUF_ADAPTER.parse(cursor.getBlob(i35));
                                        message.localSafetyReminder = cursor.getInt(i + 36) == 1;
                                        message.localSensitiveWordReminder = cursor.getInt(i + 37) == 1;
                                        int i36 = i + 38;
                                        message.msgData = cursor.isNull(i36) ? null : cursor.getString(i36);
                                        int i37 = i + 39;
                                        list = cursor.isNull(i37) ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i37));
                                        try {
                                            message.settings.anonymous = cursor.getInt(i + 40) == 1;
                                            int i38 = i + 41;
                                            i6 = cursor.isNull(i38) ? -1 : cursor.getInt(i38);
                                            int i39 = i + 42;
                                            try {
                                                message.notifiedUsers = cursor.isNull(i39) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i39));
                                                int i40 = i + 43;
                                                if (!cursor.isNull(i40)) {
                                                    i8 = cursor.getInt(i40);
                                                }
                                                int i41 = i + 44;
                                                message.referenceMsgId = cursor.isNull(i41) ? null : cursor.getString(i41);
                                                int i42 = i + 45;
                                                message.hostId = cursor.isNull(i42) ? null : cursor.getString(i42);
                                                int i43 = i + 46;
                                                message.localRedPacketType = cursor.isNull(i43) ? null : cursor.getString(i43);
                                                int i44 = i + 47;
                                                message.localAudioText = cursor.isNull(i44) ? null : AudioText.PROTOBUF_ADAPTER.parse(cursor.getBlob(i44));
                                                int i45 = i + 48;
                                                message.localGreetingId = cursor.isNull(i45) ? null : cursor.getString(i45);
                                                message.read = cursor.getInt(i + 49) == 1;
                                                message.needRead = cursor.getInt(i + 50) == 1;
                                                int i46 = i + 51;
                                                message.extData = cursor.isNull(i46) ? null : MessageExtData.PROTOBUF_ADAPTER.parse(cursor.getBlob(i46));
                                                int i47 = i + 52;
                                                message.fromConvType = cursor.isNull(i47) ? null : cursor.getString(i47);
                                                int i48 = i + 53;
                                                message.localExtraInfo = cursor.isNull(i48) ? null : cursor.getString(i48);
                                                int i49 = i + 54;
                                                String string6 = cursor.isNull(i49) ? null : cursor.getString(i49);
                                                int i50 = i + 55;
                                                try {
                                                    string5 = cursor.isNull(i50) ? null : cursor.getString(i50);
                                                    int i51 = i + 56;
                                                    try {
                                                        string2 = cursor.isNull(i51) ? null : cursor.getString(i51);
                                                        int i52 = i + 57;
                                                        try {
                                                            string3 = cursor.isNull(i52) ? null : cursor.getString(i52);
                                                            String str7 = "unknown_";
                                                            int i53 = i + 58;
                                                            try {
                                                                string4 = cursor.isNull(i53) ? null : cursor.getString(i53);
                                                                int i54 = i + 59;
                                                                try {
                                                                    if (cursor.isNull(i54)) {
                                                                        string6 = string6;
                                                                        list3 = null;
                                                                    } else {
                                                                        string6 = string6;
                                                                        try {
                                                                            list3 = LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i54));
                                                                        } catch (Exception e) {
                                                                            e = e;
                                                                            int i55 = i7;
                                                                            i8 = i8;
                                                                            i8 = i55;
                                                                            list = list;
                                                                            string = str7;
                                                                            str = string;
                                                                            str6 = string6;
                                                                            str6 = string5;
                                                                            MessageNano.reportError(e, cursor);
                                                                            int i56 = i8;
                                                                            i7 = i8;
                                                                            i8 = i56;
                                                                            str2 = string;
                                                                            list2 = list;
                                                                            string5 = str6;
                                                                            str3 = str6;
                                                                            str4 = str;
                                                                            str5 = string4;
                                                                            message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                                                                            tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                                                                            message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                                                                            tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                                                                            message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                                                                            TEnumJsonAdapter<MessageType> tEnumJsonAdapter6 = MessageType.JSON_ADAPTER;
                                                                            message.msgType = (MessageType) tEnumJsonAdapter6.newTEnum(string3, i4);
                                                                            message.messageType = (MessageType) tEnumJsonAdapter6.newTEnum(str5, i5);
                                                                            if (message.localBusinessTypes == null) {
                                                                                message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                                                            }
                                                                            tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                                                                            message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                                                                            tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                                                                            message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                                                                            if (message.api_only_otherUser == null) {
                                                                                message.api_only_otherUser = "";
                                                                            }
                                                                            if (message.cid == null) {
                                                                                message.cid = "";
                                                                            }
                                                                            if (message.owner == null) {
                                                                                message.owner = "";
                                                                            }
                                                                            if (message.value == null) {
                                                                                message.value = "";
                                                                            }
                                                                            if (message.localNotificationStatus == null) {
                                                                                message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                                                                            }
                                                                            if (message.localCallHandledStatus == null) {
                                                                                message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                                                                            }
                                                                            if (message.localPrivateQuestions == null) {
                                                                                message.localPrivateQuestions = new ArrayList();
                                                                            }
                                                                            if (message.commentInfo == null) {
                                                                                message.commentInfo = CommentInfo.new_();
                                                                            }
                                                                            if (message.parentCommentId == null) {
                                                                                message.parentCommentId = "";
                                                                            }
                                                                            if (message.subCommentIds == null) {
                                                                                message.subCommentIds = new ArrayList();
                                                                            }
                                                                            if (message.moreSubComments == null) {
                                                                                message.moreSubComments = "";
                                                                            }
                                                                            if (message.localBusinessTypes == null) {
                                                                                message.localBusinessTypes = new ArrayList();
                                                                            }
                                                                            if (message.settings == null) {
                                                                                message.settings = MessageSetting.new_();
                                                                            }
                                                                            if (message.channel == null) {
                                                                                message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                                                                            }
                                                                            if (message.notifiedUsers == null) {
                                                                                message.notifiedUsers = new ArrayList();
                                                                            }
                                                                            if (message.status == null) {
                                                                                message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                                                                            }
                                                                            if (message.referenceMsgId == null) {
                                                                                message.referenceMsgId = "";
                                                                            }
                                                                            if (message.hostId == null) {
                                                                                message.hostId = "";
                                                                            }
                                                                            if (message.localAudioText == null) {
                                                                                message.localAudioText = AudioText.new_();
                                                                            }
                                                                            if (message.consumeType == null) {
                                                                                message.consumeType = "";
                                                                            }
                                                                            if (message.coinSign == null) {
                                                                                message.coinSign = "";
                                                                            }
                                                                            if (message.action == null) {
                                                                                message.action = "";
                                                                            }
                                                                            if (message.riskTags == null) {
                                                                                message.riskTags = new ArrayList();
                                                                            }
                                                                            return message;
                                                                        }
                                                                    }
                                                                    message.localBusinessTypes = list3;
                                                                    int i57 = i + 60;
                                                                    String string7 = cursor.isNull(i57) ? null : cursor.getString(i57);
                                                                    int i58 = i + 61;
                                                                    try {
                                                                        string = cursor.isNull(i58) ? null : cursor.getString(i58);
                                                                        str = string7;
                                                                        int i59 = i + 62;
                                                                        try {
                                                                            message.incTempInfo = cursor.isNull(i59) ? null : cursor.getString(i59);
                                                                            int i60 = i + 63;
                                                                            if (cursor.isNull(i60)) {
                                                                                str7 = string;
                                                                                list4 = null;
                                                                            } else {
                                                                                str7 = string;
                                                                                try {
                                                                                    list4 = ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i60));
                                                                                } catch (Exception e2) {
                                                                                    e = e2;
                                                                                    int i61 = i7;
                                                                                    i8 = i8;
                                                                                    i8 = i61;
                                                                                    list = list;
                                                                                    string = str7;
                                                                                    str6 = string6;
                                                                                    str6 = string5;
                                                                                    MessageNano.reportError(e, cursor);
                                                                                    int i510 = i8;
                                                                                    i7 = i8;
                                                                                    i8 = i510;
                                                                                    str2 = string;
                                                                                    list2 = list;
                                                                                    string5 = str6;
                                                                                    str3 = str6;
                                                                                    str4 = str;
                                                                                    str5 = string4;
                                                                                }
                                                                            }
                                                                            message.riskTags = list4;
                                                                            message.localMyVisitorCount = cursor.getInt(i + 64);
                                                                            boolean z = true;
                                                                            if (cursor.getInt(i + 65) != 1) {
                                                                                z = false;
                                                                            }
                                                                            message.localMyVisitorHidden = z;
                                                                            this.readIndex = i + 66;
                                                                            list2 = list;
                                                                            str2 = str7;
                                                                            str3 = string6;
                                                                            str5 = string4;
                                                                            str4 = str;
                                                                        } catch (Exception e3) {
                                                                            e = e3;
                                                                            int i62 = i7;
                                                                            i8 = i8;
                                                                            i8 = i62;
                                                                            list = list;
                                                                            str6 = string6;
                                                                            str6 = string5;
                                                                            MessageNano.reportError(e, cursor);
                                                                            int i511 = i8;
                                                                            i7 = i8;
                                                                            i8 = i511;
                                                                            str2 = string;
                                                                            list2 = list;
                                                                            string5 = str6;
                                                                            str3 = str6;
                                                                            str4 = str;
                                                                            str5 = string4;
                                                                        }
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        str = string7;
                                                                    }
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    string6 = string6;
                                                                }
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                string6 = string6;
                                                                int i63 = i7;
                                                                i8 = i8;
                                                                i8 = i63;
                                                                list = list;
                                                                string = str7;
                                                                string4 = string;
                                                                str = string4;
                                                                str6 = string6;
                                                                str6 = string5;
                                                                MessageNano.reportError(e, cursor);
                                                                int i512 = i8;
                                                                i7 = i8;
                                                                i8 = i512;
                                                                str2 = string;
                                                                list2 = list;
                                                                string5 = str6;
                                                                str3 = str6;
                                                                str4 = str;
                                                                str5 = string4;
                                                                message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                                                                tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                                                                message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                                                                tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                                                                message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                                                                TEnumJsonAdapter<MessageType> tEnumJsonAdapter7 = MessageType.JSON_ADAPTER;
                                                                message.msgType = (MessageType) tEnumJsonAdapter7.newTEnum(string3, i4);
                                                                message.messageType = (MessageType) tEnumJsonAdapter7.newTEnum(str5, i5);
                                                                if (message.localBusinessTypes == null) {
                                                                    message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                                                }
                                                                tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                                                                message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                                                                tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                                                                message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                                                                if (message.api_only_otherUser == null) {
                                                                    message.api_only_otherUser = "";
                                                                }
                                                                if (message.cid == null) {
                                                                    message.cid = "";
                                                                }
                                                                if (message.owner == null) {
                                                                    message.owner = "";
                                                                }
                                                                if (message.value == null) {
                                                                    message.value = "";
                                                                }
                                                                if (message.localNotificationStatus == null) {
                                                                    message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                                                                }
                                                                if (message.localCallHandledStatus == null) {
                                                                    message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                                                                }
                                                                if (message.localPrivateQuestions == null) {
                                                                    message.localPrivateQuestions = new ArrayList();
                                                                }
                                                                if (message.commentInfo == null) {
                                                                    message.commentInfo = CommentInfo.new_();
                                                                }
                                                                if (message.parentCommentId == null) {
                                                                    message.parentCommentId = "";
                                                                }
                                                                if (message.subCommentIds == null) {
                                                                    message.subCommentIds = new ArrayList();
                                                                }
                                                                if (message.moreSubComments == null) {
                                                                    message.moreSubComments = "";
                                                                }
                                                                if (message.localBusinessTypes == null) {
                                                                    message.localBusinessTypes = new ArrayList();
                                                                }
                                                                if (message.settings == null) {
                                                                    message.settings = MessageSetting.new_();
                                                                }
                                                                if (message.channel == null) {
                                                                    message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                                                                }
                                                                if (message.notifiedUsers == null) {
                                                                    message.notifiedUsers = new ArrayList();
                                                                }
                                                                if (message.status == null) {
                                                                    message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                                                                }
                                                                if (message.referenceMsgId == null) {
                                                                    message.referenceMsgId = "";
                                                                }
                                                                if (message.hostId == null) {
                                                                    message.hostId = "";
                                                                }
                                                                if (message.localAudioText == null) {
                                                                    message.localAudioText = AudioText.new_();
                                                                }
                                                                if (message.consumeType == null) {
                                                                    message.consumeType = "";
                                                                }
                                                                if (message.coinSign == null) {
                                                                    message.coinSign = "";
                                                                }
                                                                if (message.action == null) {
                                                                    message.action = "";
                                                                }
                                                                if (message.riskTags == null) {
                                                                    message.riskTags = new ArrayList();
                                                                }
                                                                return message;
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            i8 = i7;
                                                            string = "unknown_";
                                                            string3 = string;
                                                            string4 = string3;
                                                            str = string4;
                                                            str6 = string6;
                                                            str6 = string5;
                                                            MessageNano.reportError(e, cursor);
                                                            int i513 = i8;
                                                            i7 = i8;
                                                            i8 = i513;
                                                            str2 = string;
                                                            list2 = list;
                                                            string5 = str6;
                                                            str3 = str6;
                                                            str4 = str;
                                                            str5 = string4;
                                                            message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                                                            tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                                                            message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                                                            tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                                                            message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                                                            TEnumJsonAdapter<MessageType> tEnumJsonAdapter8 = MessageType.JSON_ADAPTER;
                                                            message.msgType = (MessageType) tEnumJsonAdapter8.newTEnum(string3, i4);
                                                            message.messageType = (MessageType) tEnumJsonAdapter8.newTEnum(str5, i5);
                                                            if (message.localBusinessTypes == null) {
                                                                message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                                            }
                                                            tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                                                            message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                                                            tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                                                            message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                                                            if (message.api_only_otherUser == null) {
                                                                message.api_only_otherUser = "";
                                                            }
                                                            if (message.cid == null) {
                                                                message.cid = "";
                                                            }
                                                            if (message.owner == null) {
                                                                message.owner = "";
                                                            }
                                                            if (message.value == null) {
                                                                message.value = "";
                                                            }
                                                            if (message.localNotificationStatus == null) {
                                                                message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                                                            }
                                                            if (message.localCallHandledStatus == null) {
                                                                message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                                                            }
                                                            if (message.localPrivateQuestions == null) {
                                                                message.localPrivateQuestions = new ArrayList();
                                                            }
                                                            if (message.commentInfo == null) {
                                                                message.commentInfo = CommentInfo.new_();
                                                            }
                                                            if (message.parentCommentId == null) {
                                                                message.parentCommentId = "";
                                                            }
                                                            if (message.subCommentIds == null) {
                                                                message.subCommentIds = new ArrayList();
                                                            }
                                                            if (message.moreSubComments == null) {
                                                                message.moreSubComments = "";
                                                            }
                                                            if (message.localBusinessTypes == null) {
                                                                message.localBusinessTypes = new ArrayList();
                                                            }
                                                            if (message.settings == null) {
                                                                message.settings = MessageSetting.new_();
                                                            }
                                                            if (message.channel == null) {
                                                                message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                                                            }
                                                            if (message.notifiedUsers == null) {
                                                                message.notifiedUsers = new ArrayList();
                                                            }
                                                            if (message.status == null) {
                                                                message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                                                            }
                                                            if (message.referenceMsgId == null) {
                                                                message.referenceMsgId = "";
                                                            }
                                                            if (message.hostId == null) {
                                                                message.hostId = "";
                                                            }
                                                            if (message.localAudioText == null) {
                                                                message.localAudioText = AudioText.new_();
                                                            }
                                                            if (message.consumeType == null) {
                                                                message.consumeType = "";
                                                            }
                                                            if (message.coinSign == null) {
                                                                message.coinSign = "";
                                                            }
                                                            if (message.action == null) {
                                                                message.action = "";
                                                            }
                                                            if (message.riskTags == null) {
                                                                message.riskTags = new ArrayList();
                                                            }
                                                            return message;
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        i8 = i7;
                                                        string = "unknown_";
                                                        string2 = string;
                                                        string3 = string2;
                                                    }
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    str6 = "unknown_";
                                                    String str8 = string6;
                                                    int i64 = i7;
                                                    i8 = i8;
                                                    i8 = i64;
                                                    list = list;
                                                    string = str6;
                                                    string2 = string;
                                                    string3 = string2;
                                                    string4 = string3;
                                                    str = string4;
                                                    str6 = str8;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                str6 = "unknown_";
                                                int i65 = i7;
                                                i8 = i8;
                                                i8 = i65;
                                                list = list;
                                                str6 = str6;
                                                string = str6;
                                                string2 = string;
                                                string3 = string2;
                                                string4 = string3;
                                                str = string4;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            str6 = "unknown_";
                                            i6 = -1;
                                            list = list;
                                            string = "unknown_";
                                            string2 = string;
                                            string3 = string2;
                                            string4 = string3;
                                            str = string4;
                                            i8 = i7;
                                            i8 = i6;
                                            MessageNano.reportError(e, cursor);
                                            int i514 = i8;
                                            i7 = i8;
                                            i8 = i514;
                                            str2 = string;
                                            list2 = list;
                                            string5 = str6;
                                            str3 = str6;
                                            str4 = str;
                                            str5 = string4;
                                            message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                                            tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                                            message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                                            tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                                            message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                                            TEnumJsonAdapter<MessageType> tEnumJsonAdapter9 = MessageType.JSON_ADAPTER;
                                            message.msgType = (MessageType) tEnumJsonAdapter9.newTEnum(string3, i4);
                                            message.messageType = (MessageType) tEnumJsonAdapter9.newTEnum(str5, i5);
                                            if (message.localBusinessTypes == null) {
                                                message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                            }
                                            tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                                            message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                                            tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                                            message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                                            if (message.api_only_otherUser == null) {
                                                message.api_only_otherUser = "";
                                            }
                                            if (message.cid == null) {
                                                message.cid = "";
                                            }
                                            if (message.owner == null) {
                                                message.owner = "";
                                            }
                                            if (message.value == null) {
                                                message.value = "";
                                            }
                                            if (message.localNotificationStatus == null) {
                                                message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                                            }
                                            if (message.localCallHandledStatus == null) {
                                                message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                                            }
                                            if (message.localPrivateQuestions == null) {
                                                message.localPrivateQuestions = new ArrayList();
                                            }
                                            if (message.commentInfo == null) {
                                                message.commentInfo = CommentInfo.new_();
                                            }
                                            if (message.parentCommentId == null) {
                                                message.parentCommentId = "";
                                            }
                                            if (message.subCommentIds == null) {
                                                message.subCommentIds = new ArrayList();
                                            }
                                            if (message.moreSubComments == null) {
                                                message.moreSubComments = "";
                                            }
                                            if (message.localBusinessTypes == null) {
                                                message.localBusinessTypes = new ArrayList();
                                            }
                                            if (message.settings == null) {
                                                message.settings = MessageSetting.new_();
                                            }
                                            if (message.channel == null) {
                                                message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                                            }
                                            if (message.notifiedUsers == null) {
                                                message.notifiedUsers = new ArrayList();
                                            }
                                            if (message.status == null) {
                                                message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                                            }
                                            if (message.referenceMsgId == null) {
                                                message.referenceMsgId = "";
                                            }
                                            if (message.hostId == null) {
                                                message.hostId = "";
                                            }
                                            if (message.localAudioText == null) {
                                                message.localAudioText = AudioText.new_();
                                            }
                                            if (message.consumeType == null) {
                                                message.consumeType = "";
                                            }
                                            if (message.coinSign == null) {
                                                message.coinSign = "";
                                            }
                                            if (message.action == null) {
                                                message.action = "";
                                            }
                                            if (message.riskTags == null) {
                                                message.riskTags = new ArrayList();
                                            }
                                            return message;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        str6 = "unknown_";
                                        i6 = -1;
                                        string = "unknown_";
                                        string2 = string;
                                        string3 = string2;
                                        string4 = string3;
                                        str = string4;
                                        list = null;
                                        i8 = i7;
                                        i8 = i6;
                                        MessageNano.reportError(e, cursor);
                                        int i515 = i8;
                                        i7 = i8;
                                        i8 = i515;
                                        str2 = string;
                                        list2 = list;
                                        string5 = str6;
                                        str3 = str6;
                                        str4 = str;
                                        str5 = string4;
                                        message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                                        tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                                        message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                                        tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                                        message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                                        TEnumJsonAdapter<MessageType> tEnumJsonAdapter10 = MessageType.JSON_ADAPTER;
                                        message.msgType = (MessageType) tEnumJsonAdapter10.newTEnum(string3, i4);
                                        message.messageType = (MessageType) tEnumJsonAdapter10.newTEnum(str5, i5);
                                        if (message.localBusinessTypes == null) {
                                            message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                        }
                                        tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                                        message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                                        tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                                        message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                                        if (message.api_only_otherUser == null) {
                                            message.api_only_otherUser = "";
                                        }
                                        if (message.cid == null) {
                                            message.cid = "";
                                        }
                                        if (message.owner == null) {
                                            message.owner = "";
                                        }
                                        if (message.value == null) {
                                            message.value = "";
                                        }
                                        if (message.localNotificationStatus == null) {
                                            message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                                        }
                                        if (message.localCallHandledStatus == null) {
                                            message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                                        }
                                        if (message.localPrivateQuestions == null) {
                                            message.localPrivateQuestions = new ArrayList();
                                        }
                                        if (message.commentInfo == null) {
                                            message.commentInfo = CommentInfo.new_();
                                        }
                                        if (message.parentCommentId == null) {
                                            message.parentCommentId = "";
                                        }
                                        if (message.subCommentIds == null) {
                                            message.subCommentIds = new ArrayList();
                                        }
                                        if (message.moreSubComments == null) {
                                            message.moreSubComments = "";
                                        }
                                        if (message.localBusinessTypes == null) {
                                            message.localBusinessTypes = new ArrayList();
                                        }
                                        if (message.settings == null) {
                                            message.settings = MessageSetting.new_();
                                        }
                                        if (message.channel == null) {
                                            message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                                        }
                                        if (message.notifiedUsers == null) {
                                            message.notifiedUsers = new ArrayList();
                                        }
                                        if (message.status == null) {
                                            message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                                        }
                                        if (message.referenceMsgId == null) {
                                            message.referenceMsgId = "";
                                        }
                                        if (message.hostId == null) {
                                            message.hostId = "";
                                        }
                                        if (message.localAudioText == null) {
                                            message.localAudioText = AudioText.new_();
                                        }
                                        if (message.consumeType == null) {
                                            message.consumeType = "";
                                        }
                                        if (message.coinSign == null) {
                                            message.coinSign = "";
                                        }
                                        if (message.action == null) {
                                            message.action = "";
                                        }
                                        if (message.riskTags == null) {
                                            message.riskTags = new ArrayList();
                                        }
                                        return message;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    str6 = "unknown_";
                                    i5 = -1;
                                    i6 = i5;
                                    string = "unknown_";
                                    string2 = string;
                                    string3 = string2;
                                    string4 = string3;
                                    str = string4;
                                    list = null;
                                    i8 = i7;
                                    i8 = i6;
                                    MessageNano.reportError(e, cursor);
                                    int i516 = i8;
                                    i7 = i8;
                                    i8 = i516;
                                    str2 = string;
                                    list2 = list;
                                    string5 = str6;
                                    str3 = str6;
                                    str4 = str;
                                    str5 = string4;
                                    message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                                    tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                                    message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                                    tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                                    message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                                    TEnumJsonAdapter<MessageType> tEnumJsonAdapter11 = MessageType.JSON_ADAPTER;
                                    message.msgType = (MessageType) tEnumJsonAdapter11.newTEnum(string3, i4);
                                    message.messageType = (MessageType) tEnumJsonAdapter11.newTEnum(str5, i5);
                                    if (message.localBusinessTypes == null) {
                                        message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                    }
                                    tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                                    message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                                    tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                                    message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                                    if (message.api_only_otherUser == null) {
                                        message.api_only_otherUser = "";
                                    }
                                    if (message.cid == null) {
                                        message.cid = "";
                                    }
                                    if (message.owner == null) {
                                        message.owner = "";
                                    }
                                    if (message.value == null) {
                                        message.value = "";
                                    }
                                    if (message.localNotificationStatus == null) {
                                        message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                                    }
                                    if (message.localCallHandledStatus == null) {
                                        message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                                    }
                                    if (message.localPrivateQuestions == null) {
                                        message.localPrivateQuestions = new ArrayList();
                                    }
                                    if (message.commentInfo == null) {
                                        message.commentInfo = CommentInfo.new_();
                                    }
                                    if (message.parentCommentId == null) {
                                        message.parentCommentId = "";
                                    }
                                    if (message.subCommentIds == null) {
                                        message.subCommentIds = new ArrayList();
                                    }
                                    if (message.moreSubComments == null) {
                                        message.moreSubComments = "";
                                    }
                                    if (message.localBusinessTypes == null) {
                                        message.localBusinessTypes = new ArrayList();
                                    }
                                    if (message.settings == null) {
                                        message.settings = MessageSetting.new_();
                                    }
                                    if (message.channel == null) {
                                        message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                                    }
                                    if (message.notifiedUsers == null) {
                                        message.notifiedUsers = new ArrayList();
                                    }
                                    if (message.status == null) {
                                        message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                                    }
                                    if (message.referenceMsgId == null) {
                                        message.referenceMsgId = "";
                                    }
                                    if (message.hostId == null) {
                                        message.hostId = "";
                                    }
                                    if (message.localAudioText == null) {
                                        message.localAudioText = AudioText.new_();
                                    }
                                    if (message.consumeType == null) {
                                        message.consumeType = "";
                                    }
                                    if (message.coinSign == null) {
                                        message.coinSign = "";
                                    }
                                    if (message.action == null) {
                                        message.action = "";
                                    }
                                    if (message.riskTags == null) {
                                        message.riskTags = new ArrayList();
                                    }
                                    return message;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                str6 = "unknown_";
                                i4 = -1;
                                i5 = i4;
                                i6 = i5;
                                string = "unknown_";
                                string2 = string;
                                string3 = string2;
                                string4 = string3;
                                str = string4;
                                list = null;
                                i8 = i7;
                                i8 = i6;
                                MessageNano.reportError(e, cursor);
                                int i517 = i8;
                                i7 = i8;
                                i8 = i517;
                                str2 = string;
                                list2 = list;
                                string5 = str6;
                                str3 = str6;
                                str4 = str;
                                str5 = string4;
                                message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                                tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                                message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                                tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                                message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                                TEnumJsonAdapter<MessageType> tEnumJsonAdapter12 = MessageType.JSON_ADAPTER;
                                message.msgType = (MessageType) tEnumJsonAdapter12.newTEnum(string3, i4);
                                message.messageType = (MessageType) tEnumJsonAdapter12.newTEnum(str5, i5);
                                if (message.localBusinessTypes == null) {
                                    message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                                }
                                tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                                message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                                tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                                message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                                if (message.api_only_otherUser == null) {
                                    message.api_only_otherUser = "";
                                }
                                if (message.cid == null) {
                                    message.cid = "";
                                }
                                if (message.owner == null) {
                                    message.owner = "";
                                }
                                if (message.value == null) {
                                    message.value = "";
                                }
                                if (message.localNotificationStatus == null) {
                                    message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                                }
                                if (message.localCallHandledStatus == null) {
                                    message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                                }
                                if (message.localPrivateQuestions == null) {
                                    message.localPrivateQuestions = new ArrayList();
                                }
                                if (message.commentInfo == null) {
                                    message.commentInfo = CommentInfo.new_();
                                }
                                if (message.parentCommentId == null) {
                                    message.parentCommentId = "";
                                }
                                if (message.subCommentIds == null) {
                                    message.subCommentIds = new ArrayList();
                                }
                                if (message.moreSubComments == null) {
                                    message.moreSubComments = "";
                                }
                                if (message.localBusinessTypes == null) {
                                    message.localBusinessTypes = new ArrayList();
                                }
                                if (message.settings == null) {
                                    message.settings = MessageSetting.new_();
                                }
                                if (message.channel == null) {
                                    message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                                }
                                if (message.notifiedUsers == null) {
                                    message.notifiedUsers = new ArrayList();
                                }
                                if (message.status == null) {
                                    message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                                }
                                if (message.referenceMsgId == null) {
                                    message.referenceMsgId = "";
                                }
                                if (message.hostId == null) {
                                    message.hostId = "";
                                }
                                if (message.localAudioText == null) {
                                    message.localAudioText = AudioText.new_();
                                }
                                if (message.consumeType == null) {
                                    message.consumeType = "";
                                }
                                if (message.coinSign == null) {
                                    message.coinSign = "";
                                }
                                if (message.action == null) {
                                    message.action = "";
                                }
                                if (message.riskTags == null) {
                                    message.riskTags = new ArrayList();
                                }
                                return message;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            i3 = -1;
                            i4 = i3;
                            i5 = i4;
                            i6 = i5;
                            string = "unknown_";
                            string2 = string;
                            string3 = string2;
                            string4 = string3;
                            str = string4;
                            list = null;
                            i8 = i7;
                            i8 = i6;
                            MessageNano.reportError(e, cursor);
                            int i518 = i8;
                            i7 = i8;
                            i8 = i518;
                            str2 = string;
                            list2 = list;
                            string5 = str6;
                            str3 = str6;
                            str4 = str;
                            str5 = string4;
                            message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                            tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                            message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                            tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                            message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                            TEnumJsonAdapter<MessageType> tEnumJsonAdapter13 = MessageType.JSON_ADAPTER;
                            message.msgType = (MessageType) tEnumJsonAdapter13.newTEnum(string3, i4);
                            message.messageType = (MessageType) tEnumJsonAdapter13.newTEnum(str5, i5);
                            if (message.localBusinessTypes == null) {
                                message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                            }
                            tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                            message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                            tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                            message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                            if (message.api_only_otherUser == null) {
                                message.api_only_otherUser = "";
                            }
                            if (message.cid == null) {
                                message.cid = "";
                            }
                            if (message.owner == null) {
                                message.owner = "";
                            }
                            if (message.value == null) {
                                message.value = "";
                            }
                            if (message.localNotificationStatus == null) {
                                message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                            }
                            if (message.localCallHandledStatus == null) {
                                message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                            }
                            if (message.localPrivateQuestions == null) {
                                message.localPrivateQuestions = new ArrayList();
                            }
                            if (message.commentInfo == null) {
                                message.commentInfo = CommentInfo.new_();
                            }
                            if (message.parentCommentId == null) {
                                message.parentCommentId = "";
                            }
                            if (message.subCommentIds == null) {
                                message.subCommentIds = new ArrayList();
                            }
                            if (message.moreSubComments == null) {
                                message.moreSubComments = "";
                            }
                            if (message.localBusinessTypes == null) {
                                message.localBusinessTypes = new ArrayList();
                            }
                            if (message.settings == null) {
                                message.settings = MessageSetting.new_();
                            }
                            if (message.channel == null) {
                                message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                            }
                            if (message.notifiedUsers == null) {
                                message.notifiedUsers = new ArrayList();
                            }
                            if (message.status == null) {
                                message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                            }
                            if (message.referenceMsgId == null) {
                                message.referenceMsgId = "";
                            }
                            if (message.hostId == null) {
                                message.hostId = "";
                            }
                            if (message.localAudioText == null) {
                                message.localAudioText = AudioText.new_();
                            }
                            if (message.consumeType == null) {
                                message.consumeType = "";
                            }
                            if (message.coinSign == null) {
                                message.coinSign = "";
                            }
                            if (message.action == null) {
                                message.action = "";
                            }
                            if (message.riskTags == null) {
                                message.riskTags = new ArrayList();
                            }
                            return message;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        i2 = -1;
                        i3 = -1;
                    }
                } catch (Exception e17) {
                    e = e17;
                    str6 = "unknown_";
                    i8 = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = -1;
                    string = "unknown_";
                    string2 = string;
                    string3 = string2;
                    string4 = string3;
                    str = string4;
                    list = null;
                }
                message.sentFrom = (MessageSentFrom) MessageSentFrom.JSON_ADAPTER.newTEnum(str3, i7);
                tEnumJsonAdapter2 = NotificationStatus.JSON_ADAPTER;
                message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.newTEnum(string5, i2);
                tEnumJsonAdapter3 = CallHandledStatus.JSON_ADAPTER;
                message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.newTEnum(string2, i3);
                TEnumJsonAdapter<MessageType> tEnumJsonAdapter14 = MessageType.JSON_ADAPTER;
                message.msgType = (MessageType) tEnumJsonAdapter14.newTEnum(string3, i4);
                message.messageType = (MessageType) tEnumJsonAdapter14.newTEnum(str5, i5);
                if (message.localBusinessTypes == null && list2 != null) {
                    message.localBusinessTypes = LocalBusinessType.oldEnumCovertList(list2);
                }
                tEnumJsonAdapter4 = MessageChannel.JSON_ADAPTER;
                message.channel = (MessageChannel) tEnumJsonAdapter4.newTEnum(str4, i6);
                tEnumJsonAdapter5 = MessageStatus.JSON_ADAPTER;
                message.status = (MessageStatus) tEnumJsonAdapter5.newTEnum(str2, i8);
                if (message.api_only_otherUser == null) {
                    message.api_only_otherUser = "";
                }
                if (message.cid == null) {
                    message.cid = "";
                }
                if (message.owner == null) {
                    message.owner = "";
                }
                if (message.value == null) {
                    message.value = "";
                }
                if (message.localNotificationStatus == null) {
                    message.localNotificationStatus = (NotificationStatus) tEnumJsonAdapter2.defaultEnum();
                }
                if (message.localCallHandledStatus == null) {
                    message.localCallHandledStatus = (CallHandledStatus) tEnumJsonAdapter3.defaultEnum();
                }
                if (message.localPrivateQuestions == null) {
                    message.localPrivateQuestions = new ArrayList();
                }
                if (message.commentInfo == null) {
                    message.commentInfo = CommentInfo.new_();
                }
                if (message.parentCommentId == null) {
                    message.parentCommentId = "";
                }
                if (message.subCommentIds == null) {
                    message.subCommentIds = new ArrayList();
                }
                if (message.moreSubComments == null) {
                    message.moreSubComments = "";
                }
                if (message.localBusinessTypes == null) {
                    message.localBusinessTypes = new ArrayList();
                }
                if (message.settings == null) {
                    message.settings = MessageSetting.new_();
                }
                if (message.channel == null) {
                    message.channel = (MessageChannel) tEnumJsonAdapter4.defaultEnum();
                }
                if (message.notifiedUsers == null) {
                    message.notifiedUsers = new ArrayList();
                }
                if (message.status == null) {
                    message.status = (MessageStatus) tEnumJsonAdapter5.defaultEnum();
                }
                if (message.referenceMsgId == null) {
                    message.referenceMsgId = "";
                }
                if (message.hostId == null) {
                    message.hostId = "";
                }
                if (message.localAudioText == null) {
                    message.localAudioText = AudioText.new_();
                }
                if (message.consumeType == null) {
                    message.consumeType = "";
                }
                if (message.coinSign == null) {
                    message.coinSign = "";
                }
                if (message.action == null) {
                    message.action = "";
                }
                if (message.riskTags == null) {
                    message.riskTags = new ArrayList();
                }
                return message;
            }

            @Override // p153l.vzf0
            public void write(Message message, ContentValues contentValues) {
                try {
                    DbObject.cvPut(contentValues, "id_c", message.f56859id);
                    DbObject.cvPut(contentValues, "localCreatedTime_c", Long.valueOf(message.localCreatedTime));
                    DbObject.cvPut(contentValues, "localCreatedSession_c", Integer.valueOf(message.localCreatedSession));
                    DbObject.cvPut(contentValues, "localInMoment_c", Integer.valueOf(message.localInMoment ? 1 : 0));
                    DbObject.cvPut(contentValues, "localInConversation_c", Integer.valueOf(message.localInConversation ? 1 : 0));
                    DbObject.cvPut(contentValues, "createdTime_c", Double.valueOf(message.createdTime));
                    DbObject.cvPut(contentValues, "cid_c", message.cid);
                    DbObject.cvPut(contentValues, "media_c", message.media == null ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(message.media));
                    DbObject.cvPut(contentValues, "sticker_c", message.sticker);
                    DbObject.cvPut(contentValues, "question_c", message.question);
                    MessageSentFrom messageSentFrom = message.sentFrom;
                    DbObject.cvPut(contentValues, "str_sentFrom_c", messageSentFrom == null ? null : messageSentFrom.toString());
                    MessageSentFrom messageSentFrom2 = message.sentFrom;
                    DbObject.cvPut(contentValues, "sentFrom_c", messageSentFrom2 == null ? null : Integer.valueOf(messageSentFrom2.ordinal()));
                    DbObject.cvPut(contentValues, "moment_c", message.moment);
                    DbObject.cvPut(contentValues, "answerOfMessage_c", message.answerOfMessage);
                    DbObject.cvPut(contentValues, "owner_c", message.owner);
                    MessageLocation messageLocation = message.location;
                    DbObject.cvPut(contentValues, "location_c", messageLocation == null ? null : MessageLocation.PROTOBUF_ADAPTER.serialize(messageLocation));
                    Boolean bool = message.recalled;
                    DbObject.cvPut(contentValues, "recalled_c", bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0));
                    DbObject.cvPut(contentValues, "value_c", message.value);
                    NotificationStatus notificationStatus = message.localNotificationStatus;
                    DbObject.cvPut(contentValues, "str_localNotificationStatus_c", notificationStatus == null ? null : notificationStatus.toString());
                    NotificationStatus notificationStatus2 = message.localNotificationStatus;
                    DbObject.cvPut(contentValues, "localNotificationStatus_c", notificationStatus2 == null ? null : Integer.valueOf(notificationStatus2.ordinal()));
                    DbObject.cvPut(contentValues, "likeOfMoment_c", message.likeOfMoment);
                    DbObject.cvPut(contentValues, "localAnimationKey_c", message.localAnimationKey);
                    MessageAccessory messageAccessory = message.api_only_accessory;
                    DbObject.cvPut(contentValues, "api_only_accessory_c", messageAccessory == null ? null : MessageAccessory.PROTOBUF_ADAPTER.serialize(messageAccessory));
                    DbObject.cvPut(contentValues, "giftRecords_c", message.giftRecords == null ? null : GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(message.giftRecords));
                    CallRecord callRecord = message.call;
                    DbObject.cvPut(contentValues, "call_c", callRecord == null ? null : CallRecord.PROTOBUF_ADAPTER.serialize(callRecord));
                    DbObject.cvPut(contentValues, "localCallType_c", message.localCallType);
                    DbObject.cvPut(contentValues, "localCallStatus_c", Integer.valueOf(message.localCallStatus));
                    CallHandledStatus callHandledStatus = message.localCallHandledStatus;
                    DbObject.cvPut(contentValues, "str_localCallHandledStatus_c", callHandledStatus == null ? null : callHandledStatus.toString());
                    CallHandledStatus callHandledStatus2 = message.localCallHandledStatus;
                    DbObject.cvPut(contentValues, "localCallHandledStatus_c", callHandledStatus2 == null ? null : Integer.valueOf(callHandledStatus2.ordinal()));
                    DbObject.cvPut(contentValues, "localPrivateQuestions_c", message.localPrivateQuestions == null ? null : PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(message.localPrivateQuestions));
                    Letter letter = message.letter;
                    DbObject.cvPut(contentValues, "letter_c", letter == null ? null : Letter.PROTOBUF_ADAPTER.serialize(letter));
                    DbObject.cvPut(contentValues, "chatTyping_c", Integer.valueOf(message.chatTyping ? 1 : 0));
                    DbObject.cvPut(contentValues, "localFailType_c", Integer.valueOf(message.localFailType));
                    DbObject.cvPut(contentValues, "recalledReason_c", message.recalledReason);
                    DbObject.cvPut(contentValues, "recalledHint_c", message.recalledHint);
                    MessageType messageType = message.msgType;
                    DbObject.cvPut(contentValues, "str_msgType_c", messageType == null ? null : messageType.toString());
                    MessageType messageType2 = message.msgType;
                    DbObject.cvPut(contentValues, "msgType_c", messageType2 == null ? null : Integer.valueOf(messageType2.ordinal()));
                    MessageType messageType3 = message.messageType;
                    DbObject.cvPut(contentValues, "str_messageType_c", messageType3 == null ? null : messageType3.toString());
                    MessageType messageType4 = message.messageType;
                    DbObject.cvPut(contentValues, "messageType_c", messageType4 == null ? null : Integer.valueOf(messageType4.ordinal()));
                    MessageAdditionalData messageAdditionalData = message.additionalData;
                    DbObject.cvPut(contentValues, "additionalData_c", messageAdditionalData == null ? null : MessageAdditionalData.PROTOBUF_ADAPTER.serialize(messageAdditionalData));
                    DbObject.cvPut(contentValues, "localSafetyReminder_c", Integer.valueOf(message.localSafetyReminder ? 1 : 0));
                    DbObject.cvPut(contentValues, "localSensitiveWordReminder_c", Integer.valueOf(message.localSensitiveWordReminder ? 1 : 0));
                    DbObject.cvPut(contentValues, "msgData_c", message.msgData);
                    DbObject.cvPut(contentValues, "localBusinessTypes_c", message.localBusinessTypes == null ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(LocalBusinessType.covertToOldEnumList(message.localBusinessTypes)));
                    DbObject.cvPut(contentValues, "settings_anonymous_c", Integer.valueOf(message.settings.anonymous ? 1 : 0));
                    MessageChannel messageChannel = message.channel;
                    DbObject.cvPut(contentValues, "str_channel_c", messageChannel == null ? null : messageChannel.toString());
                    MessageChannel messageChannel2 = message.channel;
                    DbObject.cvPut(contentValues, "channel_c", messageChannel2 == null ? null : Integer.valueOf(messageChannel2.ordinal()));
                    DbObject.cvPut(contentValues, "notifiedUsers_c", message.notifiedUsers == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(message.notifiedUsers));
                    MessageStatus messageStatus = message.status;
                    DbObject.cvPut(contentValues, "str_status_c", messageStatus == null ? null : messageStatus.toString());
                    MessageStatus messageStatus2 = message.status;
                    DbObject.cvPut(contentValues, "status_c", messageStatus2 == null ? null : Integer.valueOf(messageStatus2.ordinal()));
                    DbObject.cvPut(contentValues, "referenceMsgId_c", message.referenceMsgId);
                    DbObject.cvPut(contentValues, "hostId_c", message.hostId);
                    DbObject.cvPut(contentValues, "localRedPacketType_c", message.localRedPacketType);
                    AudioText audioText = message.localAudioText;
                    DbObject.cvPut(contentValues, "localAudioText_c", audioText == null ? null : AudioText.PROTOBUF_ADAPTER.serialize(audioText));
                    DbObject.cvPut(contentValues, "localGreetingId_c", message.localGreetingId);
                    DbObject.cvPut(contentValues, "read_c", Integer.valueOf(message.read ? 1 : 0));
                    DbObject.cvPut(contentValues, "needRead_c", Integer.valueOf(message.needRead ? 1 : 0));
                    MessageExtData messageExtData = message.extData;
                    DbObject.cvPut(contentValues, "extData_c", messageExtData == null ? null : MessageExtData.PROTOBUF_ADAPTER.serialize(messageExtData));
                    DbObject.cvPut(contentValues, "fromConvType_c", message.fromConvType);
                    DbObject.cvPut(contentValues, "localExtraInfo_c", message.localExtraInfo);
                    DbObject.cvPut(contentValues, "str_localBusinessTypes_c", message.localBusinessTypes == null ? null : LocalBusinessType.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(message.localBusinessTypes));
                    DbObject.cvPut(contentValues, "incTempInfo_c", message.incTempInfo);
                    DbObject.cvPut(contentValues, "riskTags_c", message.riskTags == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(message.riskTags));
                    DbObject.cvPut(contentValues, "localMyVisitorCount_c", Integer.valueOf(message.localMyVisitorCount));
                    DbObject.cvPut(contentValues, "localMyVisitorHidden_c", Integer.valueOf(message.localMyVisitorHidden ? 1 : 0));
                } catch (Exception e) {
                    MessageNano.reportError(e, null);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LocalBusinessType m36672a(LocalBusinessType localBusinessType) {
        return localBusinessType;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m36676e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m36677f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m36678k(String str) {
        return str;
    }

    public static Message new_() {
        Message message = new Message();
        message.nullCheck();
        return message;
    }

    public Audio audio() {
        List<Media> list = this.media;
        if (list == null || list.size() <= 0 || !(this.media.get(0) instanceof Audio)) {
            return null;
        }
        return (Audio) this.media.get(0);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public Message beforeApiSerialize() {
        Message messageMo225055clone = mo225055clone();
        messageMo225055clone.reverseParseComplete();
        return messageMo225055clone;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Message mo225055clone() {
        Message message = new Message();
        message._id = this._id;
        message.f56859id = this.f56859id;
        message.localCreatedTime = this.localCreatedTime;
        message.localCreatedSession = this.localCreatedSession;
        message.localInMoment = this.localInMoment;
        message.localInConversation = this.localInConversation;
        message.createdTime = this.createdTime;
        message.api_only_otherUser = this.api_only_otherUser;
        message.cid = this.cid;
        List<Media> list = this.media;
        if (list != null) {
            message.media = ValueObject.util_map(list, new qcj() { // from class: l.tsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).mo225055clone();
                }
            });
        }
        message.sticker = this.sticker;
        message.question = this.question;
        message.questionCategory = this.questionCategory;
        message.sentFrom = this.sentFrom;
        MessageReference messageReference = this.api_only_reference;
        if (messageReference != null) {
            message.api_only_reference = messageReference.mo225055clone();
        }
        message.moment = this.moment;
        message.answerOfMessage = this.answerOfMessage;
        message.owner = this.owner;
        MessageLocation messageLocation = this.location;
        if (messageLocation != null) {
            message.location = messageLocation.mo225055clone();
        }
        message.recalled = this.recalled;
        message.value = this.value;
        message.localNotificationStatus = this.localNotificationStatus;
        message.likeOfMoment = this.likeOfMoment;
        message.localAnimationKey = this.localAnimationKey;
        message.reminder = this.reminder;
        MessageAccessory messageAccessory = this.api_only_accessory;
        if (messageAccessory != null) {
            message.api_only_accessory = messageAccessory.mo225055clone();
        }
        List<GiftRecord> list2 = this.giftRecords;
        if (list2 != null) {
            message.giftRecords = ValueObject.util_map(list2, new qcj() { // from class: l.usy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GiftRecord) obj).mo225055clone();
                }
            });
        }
        CallRecord callRecord = this.call;
        if (callRecord != null) {
            message.call = callRecord.mo225055clone();
        }
        message.localCallType = this.localCallType;
        message.localCallStatus = this.localCallStatus;
        message.localCallHandledStatus = this.localCallHandledStatus;
        List<PrivateQuestion> list3 = this.localPrivateQuestions;
        if (list3 != null) {
            message.localPrivateQuestions = ValueObject.util_map(list3, new qcj() { // from class: l.vsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PrivateQuestion) obj).mo225055clone();
                }
            });
        }
        Letter letter = this.letter;
        if (letter != null) {
            message.letter = letter.mo225055clone();
        }
        message.chatTyping = this.chatTyping;
        message.localFailType = this.localFailType;
        message.recalledReason = this.recalledReason;
        message.recalledHint = this.recalledHint;
        message.msgType = this.msgType;
        message.messageType = this.messageType;
        MessageAdditionalData messageAdditionalData = this.additionalData;
        if (messageAdditionalData != null) {
            message.additionalData = messageAdditionalData.mo225055clone();
        }
        CommentInfo commentInfo = this.commentInfo;
        if (commentInfo != null) {
            message.commentInfo = commentInfo.mo225055clone();
        }
        message.likes = this.likes;
        message.liked = this.liked;
        message.parentCommentId = this.parentCommentId;
        List<String> list4 = this.subCommentIds;
        if (list4 != null) {
            message.subCommentIds = ValueObject.util_map(list4, new qcj() { // from class: l.wsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Message.m36678k((String) obj);
                }
            });
        }
        message.moreSubComments = this.moreSubComments;
        message.isBottom = this.isBottom;
        message.localSafetyReminder = this.localSafetyReminder;
        message.localSensitiveWordReminder = this.localSensitiveWordReminder;
        message.msgData = this.msgData;
        List<LocalBusinessType> list5 = this.localBusinessTypes;
        if (list5 != null) {
            message.localBusinessTypes = ValueObject.util_map(list5, new qcj() { // from class: l.xsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Message.m36672a((LocalBusinessType) obj);
                }
            });
        }
        MessageSetting messageSetting = this.settings;
        if (messageSetting != null) {
            message.settings = messageSetting.mo225055clone();
        }
        message.channel = this.channel;
        List<String> list6 = this.notifiedUsers;
        if (list6 != null) {
            message.notifiedUsers = ValueObject.util_map(list6, new qcj() { // from class: l.ysy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Message.m36677f((String) obj);
                }
            });
        }
        message.status = this.status;
        message.referenceMsgId = this.referenceMsgId;
        message.hostId = this.hostId;
        message.localRedPacketType = this.localRedPacketType;
        message.isNewComment = this.isNewComment;
        AudioText audioText = this.localAudioText;
        if (audioText != null) {
            message.localAudioText = audioText.mo225055clone();
        }
        message.localGreetingId = this.localGreetingId;
        message.read = this.read;
        message.needRead = this.needRead;
        MessageExtData messageExtData = this.extData;
        if (messageExtData != null) {
            message.extData = messageExtData.mo225055clone();
        }
        message.fromConvType = this.fromConvType;
        message.localExtraInfo = this.localExtraInfo;
        message.incTempInfo = this.incTempInfo;
        message.consumeType = this.consumeType;
        message.coinSign = this.coinSign;
        message.action = this.action;
        List<String> list7 = this.riskTags;
        if (list7 != null) {
            message.riskTags = ValueObject.util_map(list7, new qcj() { // from class: l.zsy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Message.m36676e((String) obj);
                }
            });
        }
        message.localMyVisitorCount = this.localMyVisitorCount;
        message.localMyVisitorHidden = this.localMyVisitorHidden;
        message.secondSend = this.secondSend;
        return message;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return super.equals(obj) && this.localInMoment == message.localInMoment && this.localInConversation == message.localInConversation && this.createdTime == message.createdTime && ValueObject.util_equals(this.api_only_otherUser, message.api_only_otherUser) && ValueObject.util_equals(this.cid, message.cid) && ValueObject.util_equals(this.media, message.media) && ValueObject.util_equals(this.sticker, message.sticker) && ValueObject.util_equals(this.question, message.question) && ValueObject.util_equals(this.questionCategory, message.questionCategory) && ValueObject.util_equals(this.sentFrom, message.sentFrom) && ValueObject.util_equals(this.api_only_reference, message.api_only_reference) && ValueObject.util_equals(this.moment, message.moment) && ValueObject.util_equals(this.answerOfMessage, message.answerOfMessage) && ValueObject.util_equals(this.owner, message.owner) && ValueObject.util_equals(this.location, message.location) && ValueObject.util_equals(this.recalled, message.recalled) && ValueObject.util_equals(this.value, message.value) && ValueObject.util_equals(this.localNotificationStatus, message.localNotificationStatus) && ValueObject.util_equals(this.likeOfMoment, message.likeOfMoment) && ValueObject.util_equals(this.localAnimationKey, message.localAnimationKey) && ValueObject.util_equals(this.reminder, message.reminder) && ValueObject.util_equals(this.api_only_accessory, message.api_only_accessory) && ValueObject.util_equals(this.giftRecords, message.giftRecords) && ValueObject.util_equals(this.call, message.call) && ValueObject.util_equals(this.localCallType, message.localCallType) && this.localCallStatus == message.localCallStatus && ValueObject.util_equals(this.localCallHandledStatus, message.localCallHandledStatus) && ValueObject.util_equals(this.localPrivateQuestions, message.localPrivateQuestions) && ValueObject.util_equals(this.letter, message.letter) && this.chatTyping == message.chatTyping && ValueObject.util_equals(this.recalledReason, message.recalledReason) && ValueObject.util_equals(this.recalledHint, message.recalledHint) && ValueObject.util_equals(this.msgType, message.msgType) && ValueObject.util_equals(this.messageType, message.messageType) && ValueObject.util_equals(this.additionalData, message.additionalData) && ValueObject.util_equals(this.commentInfo, message.commentInfo) && this.likes == message.likes && this.liked == message.liked && ValueObject.util_equals(this.parentCommentId, message.parentCommentId) && ValueObject.util_equals(this.subCommentIds, message.subCommentIds) && ValueObject.util_equals(this.moreSubComments, message.moreSubComments) && this.isBottom == message.isBottom && this.localSafetyReminder == message.localSafetyReminder && this.localSensitiveWordReminder == message.localSensitiveWordReminder && ValueObject.util_equals(this.msgData, message.msgData) && ValueObject.util_equals(this.localBusinessTypes, message.localBusinessTypes) && ValueObject.util_equals(this.settings, message.settings) && ValueObject.util_equals(this.channel, message.channel) && ValueObject.util_equals(this.notifiedUsers, message.notifiedUsers) && ValueObject.util_equals(this.status, message.status) && ValueObject.util_equals(this.referenceMsgId, message.referenceMsgId) && ValueObject.util_equals(this.hostId, message.hostId) && ValueObject.util_equals(this.localRedPacketType, message.localRedPacketType) && this.isNewComment == message.isNewComment && ValueObject.util_equals(this.localAudioText, message.localAudioText) && ValueObject.util_equals(this.localGreetingId, message.localGreetingId) && this.read == message.read && this.needRead == message.needRead && ValueObject.util_equals(this.extData, message.extData) && ValueObject.util_equals(this.fromConvType, message.fromConvType) && ValueObject.util_equals(this.localExtraInfo, message.localExtraInfo) && ValueObject.util_equals(this.incTempInfo, message.incTempInfo) && ValueObject.util_equals(this.consumeType, message.consumeType) && ValueObject.util_equals(this.coinSign, message.coinSign) && ValueObject.util_equals(this.action, message.action) && ValueObject.util_equals(this.riskTags, message.riskTags) && this.localMyVisitorCount == message.localMyVisitorCount && this.localMyVisitorHidden == message.localMyVisitorHidden && this.secondSend == message.secondSend;
    }

    public AiChatMessageExtraInfo getAiChatMessageExtraInfo() {
        if (TextUtils.isEmpty(this.msgData)) {
            return null;
        }
        if (NullChecker.m82486a(this.aiChatMessageExtraInfo) && TextUtils.equals(this.msgDataOld, this.msgData)) {
            return this.aiChatMessageExtraInfo;
        }
        try {
            this.aiChatMessageExtraInfo = AiChatMessageExtraInfo.JSON_ADAPTER.parse(this.msgData);
            this.msgDataOld = this.msgData;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
        return this.aiChatMessageExtraInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "message";
    }

    public String getHostId() {
        return TextUtils.isEmpty(this.hostId) ? this.cid : this.hostId;
    }

    public String getMomentShowFromType() {
        String str = this.momentShowFromType;
        return str == null ? "" : str;
    }

    public OperationTopicInfo getOperationTopicInfo() {
        if (!TEnum.equals(messageType(), MessageType.operation)) {
            return null;
        }
        try {
            return OperationTopicInfo.JSON_ADAPTER.parse(this.msgData);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + (this.localInMoment ? 1231 : 1237)) * 41;
        int i2 = this.localInConversation ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode + i2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.api_only_otherUser;
        int iHashCode2 = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.cid;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Media> list = this.media;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.sticker;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.question;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        QuestionCategory questionCategory = this.questionCategory;
        int iHashCode7 = (iHashCode6 + (questionCategory != null ? questionCategory.hashCode() : 0)) * 41;
        MessageSentFrom messageSentFrom = this.sentFrom;
        int iHashCode8 = (iHashCode7 + (messageSentFrom != null ? messageSentFrom.hashCode() : 0)) * 41;
        MessageReference messageReference = this.api_only_reference;
        int iHashCode9 = (iHashCode8 + (messageReference != null ? messageReference.hashCode() : 0)) * 41;
        String str5 = this.moment;
        int iHashCode10 = (iHashCode9 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.answerOfMessage;
        int iHashCode11 = (iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.owner;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 41;
        MessageLocation messageLocation = this.location;
        int iHashCode13 = (iHashCode12 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41;
        Boolean bool = this.recalled;
        int iHashCode14 = (iHashCode13 + (bool != null ? bool.hashCode() : 0)) * 41;
        String str8 = this.value;
        int iHashCode15 = (iHashCode14 + (str8 != null ? str8.hashCode() : 0)) * 41;
        NotificationStatus notificationStatus = this.localNotificationStatus;
        int iHashCode16 = (iHashCode15 + (notificationStatus != null ? notificationStatus.hashCode() : 0)) * 41;
        String str9 = this.likeOfMoment;
        int iHashCode17 = (iHashCode16 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.localAnimationKey;
        int iHashCode18 = (iHashCode17 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.reminder;
        int iHashCode19 = (iHashCode18 + (str11 != null ? str11.hashCode() : 0)) * 41;
        MessageAccessory messageAccessory = this.api_only_accessory;
        int iHashCode20 = (iHashCode19 + (messageAccessory != null ? messageAccessory.hashCode() : 0)) * 41;
        List<GiftRecord> list2 = this.giftRecords;
        int iHashCode21 = (iHashCode20 + (list2 != null ? list2.hashCode() : 0)) * 41;
        CallRecord callRecord = this.call;
        int iHashCode22 = (iHashCode21 + (callRecord != null ? callRecord.hashCode() : 0)) * 41;
        String str12 = this.localCallType;
        int iHashCode23 = (((iHashCode22 + (str12 != null ? str12.hashCode() : 0)) * 41) + this.localCallStatus) * 41;
        CallHandledStatus callHandledStatus = this.localCallHandledStatus;
        int iHashCode24 = (iHashCode23 + (callHandledStatus != null ? callHandledStatus.hashCode() : 0)) * 41;
        List<PrivateQuestion> list3 = this.localPrivateQuestions;
        int iHashCode25 = (iHashCode24 + (list3 != null ? list3.hashCode() : 0)) * 41;
        Letter letter = this.letter;
        int iHashCode26 = (((iHashCode25 + (letter != null ? letter.hashCode() : 0)) * 41) + (this.chatTyping ? 1231 : 1237)) * 41;
        String str13 = this.recalledReason;
        int iHashCode27 = (iHashCode26 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.recalledHint;
        int iHashCode28 = (iHashCode27 + (str14 != null ? str14.hashCode() : 0)) * 41;
        MessageType messageType = this.msgType;
        int iHashCode29 = (iHashCode28 + (messageType != null ? messageType.hashCode() : 0)) * 41;
        MessageType messageType2 = this.messageType;
        int iHashCode30 = (iHashCode29 + (messageType2 != null ? messageType2.hashCode() : 0)) * 41;
        MessageAdditionalData messageAdditionalData = this.additionalData;
        int iHashCode31 = (iHashCode30 + (messageAdditionalData != null ? messageAdditionalData.hashCode() : 0)) * 41;
        CommentInfo commentInfo = this.commentInfo;
        int iHashCode32 = (((((iHashCode31 + (commentInfo != null ? commentInfo.hashCode() : 0)) * 41) + this.likes) * 41) + (this.liked ? 1231 : 1237)) * 41;
        String str15 = this.parentCommentId;
        int iHashCode33 = (iHashCode32 + (str15 != null ? str15.hashCode() : 0)) * 41;
        List<String> list4 = this.subCommentIds;
        int iHashCode34 = (iHashCode33 + (list4 != null ? list4.hashCode() : 0)) * 41;
        String str16 = this.moreSubComments;
        int iHashCode35 = (((((((iHashCode34 + (str16 != null ? str16.hashCode() : 0)) * 41) + (this.isBottom ? 1231 : 1237)) * 41) + (this.localSafetyReminder ? 1231 : 1237)) * 41) + (this.localSensitiveWordReminder ? 1231 : 1237)) * 41;
        String str17 = this.msgData;
        int iHashCode36 = (iHashCode35 + (str17 != null ? str17.hashCode() : 0)) * 41;
        List<LocalBusinessType> list5 = this.localBusinessTypes;
        int iHashCode37 = (iHashCode36 + (list5 != null ? list5.hashCode() : 0)) * 41;
        MessageSetting messageSetting = this.settings;
        int iHashCode38 = (iHashCode37 + (messageSetting != null ? messageSetting.hashCode() : 0)) * 41;
        MessageChannel messageChannel = this.channel;
        int iHashCode39 = (iHashCode38 + (messageChannel != null ? messageChannel.hashCode() : 0)) * 41;
        List<String> list6 = this.notifiedUsers;
        int iHashCode40 = (iHashCode39 + (list6 != null ? list6.hashCode() : 0)) * 41;
        MessageStatus messageStatus = this.status;
        int iHashCode41 = (iHashCode40 + (messageStatus != null ? messageStatus.hashCode() : 0)) * 41;
        String str18 = this.referenceMsgId;
        int iHashCode42 = (iHashCode41 + (str18 != null ? str18.hashCode() : 0)) * 41;
        String str19 = this.hostId;
        int iHashCode43 = (iHashCode42 + (str19 != null ? str19.hashCode() : 0)) * 41;
        String str20 = this.localRedPacketType;
        int iHashCode44 = (((iHashCode43 + (str20 != null ? str20.hashCode() : 0)) * 41) + (this.isNewComment ? 1231 : 1237)) * 41;
        AudioText audioText = this.localAudioText;
        int iHashCode45 = (iHashCode44 + (audioText != null ? audioText.hashCode() : 0)) * 41;
        String str21 = this.localGreetingId;
        int iHashCode46 = (((((iHashCode45 + (str21 != null ? str21.hashCode() : 0)) * 41) + (this.read ? 1231 : 1237)) * 41) + (this.needRead ? 1231 : 1237)) * 41;
        MessageExtData messageExtData = this.extData;
        int iHashCode47 = (iHashCode46 + (messageExtData != null ? messageExtData.hashCode() : 0)) * 41;
        String str22 = this.fromConvType;
        int iHashCode48 = (iHashCode47 + (str22 != null ? str22.hashCode() : 0)) * 41;
        String str23 = this.localExtraInfo;
        int iHashCode49 = (iHashCode48 + (str23 != null ? str23.hashCode() : 0)) * 41;
        String str24 = this.incTempInfo;
        int iHashCode50 = (iHashCode49 + (str24 != null ? str24.hashCode() : 0)) * 41;
        String str25 = this.consumeType;
        int iHashCode51 = (iHashCode50 + (str25 != null ? str25.hashCode() : 0)) * 41;
        String str26 = this.coinSign;
        int iHashCode52 = (iHashCode51 + (str26 != null ? str26.hashCode() : 0)) * 41;
        String str27 = this.action;
        int iHashCode53 = (iHashCode52 + (str27 != null ? str27.hashCode() : 0)) * 41;
        List<String> list7 = this.riskTags;
        int iHashCode54 = ((((((iHashCode53 + (list7 != null ? list7.hashCode() : 0)) * 41) + this.localMyVisitorCount) * 41) + (this.localMyVisitorHidden ? 1231 : 1237)) * 41) + (this.secondSend ? 1231 : 1237);
        this.hashCode = iHashCode54;
        return iHashCode54;
    }

    public boolean isCaller() {
        return this.additionalData == null ? isMe() : TextUtils.equals(uqb0.f180397c0.userId(), this.additionalData.caller);
    }

    public boolean isChildComment() {
        CommentInfo commentInfo = this.commentInfo;
        if (commentInfo == null || TextUtils.isEmpty(commentInfo.parentMessageId) || this.commentInfo.parentMessageId.equals("0")) {
            return (TextUtils.isEmpty(this.parentCommentId) || this.parentCommentId.equals("0")) ? false : true;
        }
        return true;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isGroupMessage() {
        return TEnum.equals(this.channel, "group");
    }

    public boolean isLocal() {
        return !TEnum.equals(status(), "normal");
    }

    public boolean isMe() {
        return uqb0.f180397c0.userId().equals(this.owner);
    }

    public boolean isOtherUser() {
        return !isMe();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(Message message) {
        if (!shouldMergeData() || equals(message)) {
            return;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = message.createdTime;
        }
        if (!isFieldParsed("otherUser")) {
            this.api_only_otherUser = message.api_only_otherUser;
        }
        if (!isFieldParsed("media")) {
            this.media = message.media;
        }
        if (!isFieldParsed("sentFrom")) {
            this.sentFrom = message.sentFrom;
        }
        if (!isFieldParsed(Reference.TYPE)) {
            this.api_only_reference = message.api_only_reference;
        }
        if (!isFieldParsed(Owner.TYPE)) {
            this.owner = message.owner;
        }
        if (!isFieldParsed("location")) {
            this.location = message.location;
        }
        if (!isFieldParsed("recalled")) {
            this.recalled = message.recalled;
        }
        if (!isFieldParsed("value")) {
            this.value = message.value;
        }
        if (!isFieldParsed(Accessory.TYPE)) {
            this.api_only_accessory = message.api_only_accessory;
        }
        if (!isFieldParsed("call")) {
            this.call = message.call;
        }
        if (!isFieldParsed("localPrivateQuestions")) {
            this.localPrivateQuestions = message.localPrivateQuestions;
        }
        if (!isFieldParsed("letter")) {
            this.letter = message.letter;
        }
        if (!isFieldParsed("recalledReason")) {
            this.recalledReason = message.recalledReason;
        }
        if (!isFieldParsed("recalledHint")) {
            this.recalledHint = message.recalledHint;
        }
        if (!isFieldParsed("msgType")) {
            this.messageType = message.messageType;
        }
        if (!isFieldParsed("additionalData")) {
            this.additionalData = message.additionalData;
        }
        if (!isFieldParsed("commentInfo")) {
            this.commentInfo = message.commentInfo;
        }
        if (!isFieldParsed("likes")) {
            this.likes = message.likes;
        }
        if (!isFieldParsed("liked")) {
            this.liked = message.liked;
        }
        if (!isFieldParsed("parentCommentId")) {
            this.parentCommentId = message.parentCommentId;
        }
        if (!isFieldParsed("subCommentIds")) {
            this.subCommentIds = message.subCommentIds;
        }
        if (!isFieldParsed("moreSubComments")) {
            this.moreSubComments = message.moreSubComments;
        }
        if (!isFieldParsed("isBottom")) {
            this.isBottom = message.isBottom;
        }
        if (!isFieldParsed("msgData")) {
            this.msgData = message.msgData;
        }
        if (!isFieldParsed(Settings.TYPE)) {
            this.settings = message.settings;
        }
        if (!isFieldParsed("channel")) {
            this.channel = message.channel;
        }
        if (!isFieldParsed("notifiedUsers")) {
            this.notifiedUsers = message.notifiedUsers;
        }
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
            this.status = message.status;
        }
        if (!isFieldParsed("referenceMsgId")) {
            this.referenceMsgId = message.referenceMsgId;
        }
        if (!isFieldParsed("hostId")) {
            this.hostId = message.hostId;
        }
        if (!isFieldParsed("localRedPacketType")) {
            this.localRedPacketType = message.localRedPacketType;
        }
        if (!isFieldParsed("isNewComment")) {
            this.isNewComment = message.isNewComment;
        }
        if (!isFieldParsed("needRead")) {
            this.needRead = message.needRead;
        }
        if (!isFieldParsed("extData")) {
            this.extData = message.extData;
        }
        if (!isFieldParsed("consumeType")) {
            this.consumeType = message.consumeType;
        }
        if (!isFieldParsed("coinSign")) {
            this.coinSign = message.coinSign;
        }
        if (!isFieldParsed("action")) {
            this.action = message.action;
        }
        if (!isFieldParsed("riskTags")) {
            this.riskTags = message.riskTags;
        }
        if (!isFieldParsed("secondSend")) {
            this.secondSend = message.secondSend;
        }
        this.parseFieldSet.clear();
    }

    public MessageType messageType() {
        MessageType messageType = this.messageType;
        if (messageType != null && !TEnum.equals(messageType, "default")) {
            return this.messageType;
        }
        if (this.moment != null) {
            return MessageType.get("moment_comment");
        }
        if (this.likeOfMoment != null) {
            return MessageType.get("moment_like");
        }
        if (this.location != null) {
            return MessageType.get("location");
        }
        if (this.sticker != null) {
            return MessageType.get("sticker");
        }
        if (this.question != null) {
            return MessageType.get("question");
        }
        List<Media> list = this.media;
        if (list == null || list.size() == 0) {
            if (this.letter != null) {
                return MessageType.get("express_heart");
            }
            MessageType messageType2 = this.msgType;
            return (messageType2 == null || TEnum.equals(messageType2, "unknown_")) ? MessageType.get("text") : this.msgType;
        }
        if (this.media.get(0) instanceof Video) {
            return MessageType.get("video");
        }
        if (this.media.get(0) instanceof Picture) {
            return MessageType.get("picture");
        }
        return this.media.get(0) instanceof Audio ? MessageType.get("audio") : MessageType.get("default");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.api_only_otherUser == null) {
            this.api_only_otherUser = "";
        }
        if (this.cid == null) {
            this.cid = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.localNotificationStatus == null) {
            this.localNotificationStatus = (NotificationStatus) NotificationStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.localCallHandledStatus == null) {
            this.localCallHandledStatus = (CallHandledStatus) CallHandledStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.localPrivateQuestions == null) {
            this.localPrivateQuestions = new ArrayList();
        }
        if (this.commentInfo == null) {
            this.commentInfo = CommentInfo.new_();
        }
        if (this.parentCommentId == null) {
            this.parentCommentId = "";
        }
        if (this.subCommentIds == null) {
            this.subCommentIds = new ArrayList();
        }
        if (this.moreSubComments == null) {
            this.moreSubComments = "";
        }
        if (this.localBusinessTypes == null) {
            this.localBusinessTypes = new ArrayList();
        }
        if (this.settings == null) {
            this.settings = MessageSetting.new_();
        }
        if (this.channel == null) {
            this.channel = (MessageChannel) MessageChannel.JSON_ADAPTER.defaultEnum();
        }
        if (this.notifiedUsers == null) {
            this.notifiedUsers = new ArrayList();
        }
        if (this.status == null) {
            this.status = (MessageStatus) MessageStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.referenceMsgId == null) {
            this.referenceMsgId = "";
        }
        if (this.hostId == null) {
            this.hostId = "";
        }
        if (this.localAudioText == null) {
            this.localAudioText = AudioText.new_();
        }
        if (this.consumeType == null) {
            this.consumeType = "";
        }
        if (this.coinSign == null) {
            this.coinSign = "";
        }
        if (this.action == null) {
            this.action = "";
        }
        if (this.riskTags == null) {
            this.riskTags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        if (!TEnum.equals(this.channel, "group")) {
            this.cid = this.owner.equals(uqb0.f180397c0.userId()) ? this.api_only_otherUser : this.owner;
        }
        this.hostId = this.api_only_otherUser;
        this.api_only_otherUser = null;
        this.localCreatedSession = App.f16092i.get().intValue();
        this.localCreatedTime = System.nanoTime();
        MessageReference messageReference = this.api_only_reference;
        if (messageReference != null) {
            boolean zEquals = "message".equals(messageReference.type);
            MessageReference messageReference2 = this.api_only_reference;
            if (zEquals) {
                this.answerOfMessage = messageReference2.f21189id;
            } else {
                boolean zEquals2 = "moment".equals(messageReference2.type);
                MessageReference messageReference3 = this.api_only_reference;
                if (zEquals2) {
                    boolean zEquals3 = TEnum.equals(messageReference3.action, "like");
                    MessageReference messageReference4 = this.api_only_reference;
                    if (zEquals3) {
                        this.likeOfMoment = messageReference4.f21189id;
                    } else {
                        this.moment = messageReference4.f21189id;
                    }
                } else if (TextUtils.equals("topic", messageReference3.type) && NullChecker.m82486a(this.api_only_reference.topic)) {
                    this.incTempInfo = this.api_only_reference.topic.toJson();
                } else {
                    this.referenceMsgId = this.api_only_reference.f21189id;
                }
            }
            this.api_only_reference = null;
        }
        MessageAccessory messageAccessory = this.api_only_accessory;
        if (messageAccessory != null) {
            boolean zEquals4 = messageAccessory.type.equals("question");
            MessageAccessory messageAccessory2 = this.api_only_accessory;
            if (zEquals4) {
                this.question = messageAccessory2.f21184id;
            } else if (messageAccessory2.type.equals("sticker")) {
                this.sticker = this.api_only_accessory.f21184id;
            }
        }
        List<Media> list = this.media;
        if (list != null && list.isEmpty()) {
            this.media = null;
        }
        CallRecord callRecord = this.call;
        if (callRecord != null) {
            this.localCallStatus = callRecord.status;
            this.localCallType = callRecord.callType;
        }
    }

    public Picture picture() {
        List<Media> list = this.media;
        if (list == null || list.size() <= 0 || !(this.media.get(0) instanceof Picture)) {
            return null;
        }
        return (Picture) this.media.get(0);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void putParsedField(String str) {
        if ("v2".equals(xi5.m211120v(this.requestUrl)) || xi5.API_VERSION_V3.equals(xi5.m211120v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public void reverseParseComplete() {
        if (TextUtils.isEmpty(this.api_only_otherUser) && !TEnum.equals(this.channel, "group")) {
            String str = this.owner;
            this.api_only_otherUser = (str == null || !str.equals(uqb0.f180397c0.userId())) ? uqb0.f180397c0.userId() : this.cid;
        }
        if (this.answerOfMessage != null) {
            MessageReference messageReference = new MessageReference();
            this.api_only_reference = messageReference;
            messageReference.f21189id = this.answerOfMessage;
            messageReference.type = "message";
            String str2 = this.answerIdOfAnswer;
            if (str2 != null) {
                messageReference.answerId = str2;
            }
        }
        if (this.moment != null) {
            MessageReference messageReference2 = new MessageReference();
            this.api_only_reference = messageReference2;
            messageReference2.f21189id = this.moment;
            messageReference2.type = "moment";
            if (this.likeOfMoment != null) {
                messageReference2.action = MomentAction.get("like");
            }
            if (this.moment != null) {
                this.api_only_reference.action = MomentAction.get("comment");
            }
        }
        if (this.sticker != null) {
            MessageAccessory messageAccessory = new MessageAccessory();
            this.api_only_accessory = messageAccessory;
            messageAccessory.type = "sticker";
            messageAccessory.f21184id = this.sticker;
        }
        if (this.questionCategory != null) {
            MessageAccessory messageAccessory2 = new MessageAccessory();
            this.api_only_accessory = messageAccessory2;
            messageAccessory2.type = "question";
            messageAccessory2.category = this.questionCategory;
        }
        CallRecord callRecord = this.call;
        if (callRecord != null) {
            this.localCallStatus = callRecord.status;
            this.localCallType = callRecord.callType;
        }
        if (TextUtils.isEmpty(this.referenceMsgId) || this.api_only_reference != null) {
            return;
        }
        MessageReference messageReferenceNew_ = MessageReference.new_();
        this.api_only_reference = messageReferenceNew_;
        messageReferenceNew_.f21189id = this.referenceMsgId;
        messageReferenceNew_.type = Ref.TYPE;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public boolean shouldCheckFoulWords() {
        return this.location == null && this.question == null && this.answerOfMessage == null && this.media == null;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean shouldMergeData() {
        return "v2".equals(xi5.m211120v(this.requestUrl)) || xi5.API_VERSION_V3.equals(xi5.m211120v(this.requestUrl));
    }

    public LocalStatus status() {
        if (TEnum.equals(this.messageType, "tantan_verify_toast") || TEnum.equals(this.messageType, "live_vip_greet") || TEnum.equals(this.messageType, "wechat_block_toast") || TEnum.equals(this.messageType, MessageType.soul_test_guide) || TEnum.equals(this.messageType, MessageType.local_real_shot_tips) || TEnum.equals(this.messageType, MessageType.local_normal_tips) || TEnum.equals(this.messageType, MessageType.local_greeting_reply) || TEnum.equals(this.messageType, MessageType.local_send_agreematch_notice) || TEnum.equals(this.messageType, MessageType.local_greeting_agree_match) || TEnum.equals(this.messageType, MessageType.local_greeting_match_success) || TEnum.equals(this.messageType, MessageType.moment_notification) || TEnum.equals(this.messageType, MessageType.local_chat_greeting_tip) || TEnum.equals(this.messageType, MessageType.local_meet_reply) || TEnum.equals(this.messageType, MessageType.local_greet_send_notice) || TEnum.equals(this.messageType, MessageType.local_greet_receive_match_tip) || TEnum.equals(this.messageType, MessageType.heartbeat_notify) || TEnum.equals(this.messageType, MessageType.heartbeat_success) || TEnum.equals(this.messageType, MessageType.local_soul_match_tags) || TEnum.equals(this.messageType, MessageType.local_soul_match_like) || TEnum.equals(this.messageType, MessageType.local_break_ice) || TEnum.equals(this.messageType, MessageType.local_soul_match_profile_limit) || TEnum.equals(this.messageType, MessageType.local_chanllenge_tips) || TEnum.equals(this.messageType, MessageType.wanwan_tip) || TEnum.equals(this.messageType, MessageType.local_push_switch) || TEnum.equals(this.messageType, MessageType.local_love_buzz_break_ice) || TEnum.equals(this.messageType, MessageType.local_chat_assistant_question_new) || TEnum.equals(this.messageType, MessageType.chat_assistant_question) || TEnum.equals(this.messageType, MessageType.local_birthday_tip) || TEnum.equals(this.messageType, MessageType.local_platinum_pin_guide) || TEnum.equals(this.messageType, MessageType.local_wechat_notify_guide) || TEnum.equals(this.messageType, MessageType.local_pic_cert_guide) || TEnum.equals(this.messageType, MessageType.local_blindbox_guide) || TEnum.equals(this.messageType, MessageType.local_visitor_hide_footprint) || TEnum.equals(this.messageType, MessageType.local_intl_prompt_message_type) || TEnum.equals(this.messageType, MessageType.local_ux_questionnaire) || TEnum.equals(this.messageType, MessageType.local_ux_questionnaire_tip) || TEnum.equals(this.messageType, MessageType.local_intl_read_receipts_guide) || TEnum.equals(this.messageType, MessageType.local_o_diamond_visitor_guide)) {
            return LocalStatus.get("normal");
        }
        if (this.f56859id.startsWith("fake_id_")) {
            return this.localCreatedSession == App.f16092i.get().intValue() ? LocalStatus.get(LocalStatus.sending) : LocalStatus.get("failed");
        }
        return LocalStatus.get("normal");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public Video video() {
        List<Media> list = this.media;
        if (list == null || list.size() <= 0 || !(this.media.get(0) instanceof Video)) {
            return null;
        }
        return (Video) this.media.get(0);
    }
}
