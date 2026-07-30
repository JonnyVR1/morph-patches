package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.core.glcore.util.DetectDelayStopHelper;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.heytap.mcssdk.mode.Message;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.rtmp.TXLiveConstants;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes12.dex */
public class PushMessageCustom extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushmessagecustom";

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA)
    public String USSBusiness;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA)
    public String USSIds;

    @NonNull
    @ProtobufIndex(index = MMConstants.ERR_WATERMARK_READ)
    public String USSInsert;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA)
    public String USSOption;

    @NonNull
    @ProtobufIndex(index = 131)
    public String USSPage;

    @NonNull
    @ProtobufIndex(index = 130)
    public String USSToast;

    @NonNull
    @ProtobufIndex(index = 134)
    public String USSVerify;

    @Nullable
    @ProtobufIndex(index = 3)
    public String action;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256)
    public String added;

    @NonNull
    @ProtobufIndex(index = 8)
    public String age;

    @NonNull
    @ProtobufIndex(index = 165)
    public String alertId;

    @NonNull
    @ProtobufIndex(index = 180)
    public String anchorCallId;

    @NonNull
    @ProtobufIndex(index = 123)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA)
    public String appId;

    @Nullable
    @ProtobufIndex(index = EACTags.NAME)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 118)
    public String avatarState;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA)
    public String avatars;

    @ProtobufIndex(index = 89)
    public int bellNotShowStayTime;

    @ProtobufIndex(index = 88)
    public int bellShowStayTime;

    @NonNull
    @ProtobufIndex(index = 151)
    public String bellType;

    @NonNull
    @ProtobufIndex(index = 169)
    public String bgImg;

    @Nullable
    @ProtobufIndex(index = 7)
    public String big_pic_url;

    @ProtobufIndex(index = 59)
    public long birthday;

    @Nullable
    @ProtobufIndex(index = 112)
    public String biz;

    @Nullable
    @ProtobufIndex(index = 78)
    public String broadcastID;

    @Nullable
    @ProtobufIndex(index = 33)
    public String businessType;

    @Nullable
    @ProtobufIndex(index = 21)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 140)
    public String buzzToken;

    @Nullable
    @ProtobufIndex(index = 34)
    public String callback;

    @Nullable
    @ProtobufIndex(index = 39)
    public String callee;

    @Nullable
    @ProtobufIndex(index = 41)
    public String calleeDeviceId;

    @Nullable
    @ProtobufIndex(index = 45)
    public String calleeToken;

    @NonNull
    @ProtobufIndex(index = 183)
    public String calleeTokenV2;

    @Nullable
    @ProtobufIndex(index = 38)
    public String caller;

    @Nullable
    @ProtobufIndex(index = 40)
    public String callerDeviceId;

    @Nullable
    @ProtobufIndex(index = 44)
    public String callerToken;

    @NonNull
    @ProtobufIndex(index = 182)
    public String callerTokenV2;

    @Nullable
    @ProtobufIndex(index = 177)
    public Boolean canShowNotification;

    @Nullable
    @ProtobufIndex(index = 47)
    public Boolean canUserStartLive;

    @Nullable
    @ProtobufIndex(index = 61)
    public String category;

    @NonNull
    @ProtobufIndex(index = 154)
    public String cell;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA)
    public String channel;

    @NonNull
    @ProtobufIndex(index = 148)
    public String channelKey;

    @Nullable
    @ProtobufIndex(index = 43)
    public String channelName;

    @NonNull
    @ProtobufIndex(index = 181)
    public String channelNameV2;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA)
    public String channelToken;

    @Nullable
    @ProtobufIndex(index = EACTags.TAG_LIST)
    public String city;

    @Nullable
    @ProtobufIndex(index = 71)
    public String content;

    @Nullable
    @ProtobufIndex(index = 77)
    public String contractId;

    @NonNull
    @ProtobufIndex(index = 121)
    public String conversationId;

    @ProtobufIndex(index = 95)
    public long countDownSeconds;

    @Nullable
    @ProtobufIndex(index = 74)
    public String couponDesc;

    @Nullable
    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
    public String couponId;

    @ProtobufIndex(index = 46)
    public double createdTime;

    @Nullable
    @ProtobufIndex(index = 109)
    public String creationData;

    @Nullable
    @ProtobufIndex(index = 62)
    public String currencySymbol;

    @Nullable
    @ProtobufIndex(index = 19)
    public String dates;

    @ProtobufIndex(index = EACTags.HEADER_LIST)
    public long distance;

    @ProtobufIndex(index = 65)
    public long duration;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256)
    public String emoji;

    @Nullable
    @ProtobufIndex(index = 108)
    public String endDate;

    @Nullable
    @ProtobufIndex(index = 24)
    public String eventName;

    @ProtobufIndex(index = 1)
    public double expire;

    @Nullable
    @ProtobufIndex(index = 64)
    public String ext;

    @Nullable
    @ProtobufIndex(index = 17)
    public String extTabId;

    @Nullable
    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
    public String extra;

    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA)
    public int extraPrivileges;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384)
    public String extremePickShowId;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256)
    public String fitReason;

    @NonNull
    @ProtobufIndex(index = 187)
    public String friendPurpose;

    @ProtobufIndex(index = 150)
    public int frozenDuration;

    @ProtobufIndex(index = 2)
    public boolean fullScreen;

    @Nullable
    @ProtobufIndex(index = 5)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 158)
    public String gid;

    @NonNull
    @ProtobufIndex(index = 6)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 104)
    public String greetID;

    @NonNull
    @ProtobufIndex(index = 105)
    public String groupId;

    @NonNull
    @ProtobufIndex(index = 176)
    public String honorGiftCardDetail;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 37)
    public String f38805id;

    @Nullable
    @ProtobufIndex(index = 72)
    public String image;

    @ProtobufIndex(index = 48)
    public long inflow;

    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA)
    public int initialDuration;

    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256)
    public boolean insidePool;

    @NonNull
    @ProtobufIndex(index = 159)
    public String intent;

    @ProtobufIndex(index = EACTags.TRACK1_APPLICATION)
    public boolean isGreet;

    @ProtobufIndex(index = 128)
    public boolean isPassive;

    @Nullable
    @ProtobufIndex(index = 50)
    public String itemId;

    @ProtobufIndex(index = 116)
    public long lastActiveTime;

    @Nullable
    @ProtobufIndex(index = 56)
    public String letter;

    @Nullable
    @ProtobufIndex(index = 66)
    public String likedCount;

    @Nullable
    @ProtobufIndex(index = 67)
    public String likedPopuserCount;

    @Nullable
    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public String link;

    @Nullable
    @ProtobufIndex(index = 13)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_RC4_128_SHA)
    public String liveMode;

    @NonNull
    @ProtobufIndex(index = 122)
    public String liveTitle;

    @NonNull
    @ProtobufIndex(index = 178)
    public String localNotificationCategory;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384)
    public String localNotificationImportance;

    @ProtobufIndex(index = 102)
    public boolean mandatory;

    @ProtobufIndex(index = EACTags.APPLICATION_TEMPLATE)
    public boolean maskMode;

    @Nullable
    @ProtobufIndex(index = 53)
    public String matchTopic;

    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384)
    public boolean matched;

    @ProtobufIndex(index = 167)
    public int memojiDuration;

    @Nullable
    @ProtobufIndex(index = 75)
    public String merchandiseId;

    @Nullable
    @ProtobufIndex(index = 85)
    public String messageID;

    @NonNull
    @ProtobufIndex(index = 157)
    public String mode;

    @NonNull
    @ProtobufIndex(index = 124)
    public String msgId;

    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256)
    public boolean msgSingleUpdateIgnoreConvStatus;

    @NonNull
    @ProtobufIndex(index = 9)
    public String name;

    @ProtobufIndex(index = 163)
    public boolean needReact;

    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256)
    public boolean newToast;

    @NonNull
    @ProtobufIndex(index = 15)
    public String nickname;

    @ProtobufIndex(index = 127)
    public boolean noRecommended;

    @Nullable
    @ProtobufIndex(index = 57)
    public String openingRemark;

    @Nullable
    @ProtobufIndex(index = 51)
    public String orderId;

    @Nullable
    @ProtobufIndex(index = 49)
    public String origin;

    @Nullable
    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public String otherID;

    @Nullable
    @ProtobufIndex(index = 23)
    public String otherUserID;

    @Nullable
    @ProtobufIndex(index = 114)
    public String otherUserId;

    @Nullable
    @ProtobufIndex(index = 117)
    public String otherUserName;

    @NonNull
    @ProtobufIndex(index = 166)
    public String otherUsers;

    @Nullable
    @ProtobufIndex(index = 79)
    public String partyId;

    @Nullable
    @ProtobufIndex(index = 76)
    public String platform;

    @Nullable
    @ProtobufIndex(index = 58)
    public String poolID;

    @Nullable
    @ProtobufIndex(index = 68)
    public String popChange;

    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA)
    public boolean popupsDisplay;

    @Nullable
    @ProtobufIndex(index = 63)
    public String price;

    @Nullable
    @ProtobufIndex(index = 52)
    public String privileges;

    @Nullable
    @ProtobufIndex(index = 60)
    public String productType;

    @ProtobufIndex(index = 144)
    public int prolongCount;

    @Nullable
    @ProtobufIndex(index = 32)
    public String provider;

    @Nullable
    @ProtobufIndex(index = 31)
    public String pullStreamUrl;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256)
    public String pushChannel;

    @Nullable
    @ProtobufIndex(index = 30)
    public String queryOtherUserToken;

    @Nullable
    @ProtobufIndex(index = 22)
    public String queryToken;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA)
    public String questionIdSelected;

    @Nullable
    @ProtobufIndex(index = 29)
    public String quickchatType;

    @Nullable
    @ProtobufIndex(index = 99)
    public String radioType;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256)
    public String reaction;

    @Nullable
    @ProtobufIndex(index = 55)
    public String readUntilId;

    @Nullable
    @ProtobufIndex(index = EACTags.FCP_TEMPLATE)
    public String receiveUserID;

    @Nullable
    @ProtobufIndex(index = 20)
    public String recommendText;

    @ProtobufIndex(index = CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA)
    public int resolutionHeight;

    @ProtobufIndex(index = 153)
    public int resolutionWidth;

    @Nullable
    @ProtobufIndex(index = 14)
    public String roomId;

    @Nullable
    @ProtobufIndex(index = 101)
    public RelationshipStatus rsStateReceiverToSender;

    @Nullable
    @ProtobufIndex(index = 27)
    public String rtcChannel;

    @ProtobufIndex(index = 28)
    public long rtcChannelWaitingTime;

    @NonNull
    @ProtobufIndex(index = 184)
    public String rtcProvider;

    @Nullable
    @ProtobufIndex(index = 26)
    public String rtcToken;

    @NonNull
    @ProtobufIndex(index = 160)
    public String ruleKey;

    @NonNull
    @ProtobufIndex(index = 103)
    public String scene;

    @NonNull
    @ProtobufIndex(index = 125)
    public String schema;

    @Nullable
    @ProtobufIndex(index = 80)
    public String score;

    @NonNull
    @ProtobufIndex(index = 161)
    public String selectedQuestion;

    @Nullable
    @ProtobufIndex(index = 35)
    public String source;

    @Nullable
    @ProtobufIndex(index = 111)
    public String stage;

    @Nullable
    @ProtobufIndex(index = 107)
    public String startDate;

    @NonNull
    @ProtobufIndex(index = 120)
    public String state;

    @Nullable
    @ProtobufIndex(index = 110)
    public String stateID;

    @Nullable
    @ProtobufIndex(index = 36)
    public String subSource;

    @NonNull
    @ProtobufIndex(index = 119)
    public String subTitle;

    @Nullable
    @ProtobufIndex(index = 16)
    public String tabId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String tag1;

    @NonNull
    @ProtobufIndex(index = 11)
    public String tag2;

    @NonNull
    @ProtobufIndex(index = 12)
    public String tag3;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256)
    public String tagID;

    @Nullable
    @ProtobufIndex(index = 18)
    public String taskId;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA)
    public String testGroupName;

    @Nullable
    @ProtobufIndex(index = 113)
    public String text;

    @NonNull
    @ProtobufIndex(index = 162)
    public String timestamp;

    @Nullable
    @ProtobufIndex(index = 70)
    public String title;

    @Nullable
    @ProtobufIndex(index = Opcodes.IADD)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256)
    public String total;

    @ProtobufIndex(index = 149)
    public int totalDuration;

    @Nullable
    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public String traceId;

    @Nullable
    @ProtobufIndex(index = 87)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 126)
    public String triggeredUserId;

    @Nullable
    @ProtobufIndex(index = 115)
    public String type;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384)
    public String unread;

    @Nullable
    @ProtobufIndex(index = 4)
    public String url;

    @Nullable
    @ProtobufIndex(index = 54)
    public String userId;

    @ProtobufIndex(index = 25)
    public boolean userMatched;

    @Nullable
    @ProtobufIndex(index = 69)
    public String userName;

    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA)
    public int vendor;

    @NonNull
    @ProtobufIndex(index = 185)
    public String videoChatId;

    @Nullable
    @ProtobufIndex(index = 106)
    public String videoPartnerFinderId;

    @Nullable
    @ProtobufIndex(index = 90)
    public String voicePartnerFinderId;

    @Nullable
    @ProtobufIndex(index = 42)
    public String voiceStatus;

    @Nullable
    @ProtobufIndex(index = EACTags.LOGIN_DATA)
    public String zodiac;

    @NonNull
    @ProtobufIndex(index = 188)
    public String zodiacFitPercent;
    public static ProtobufAdapter<PushMessageCustom> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushMessageCustom>() { // from class: com.p1.mobile.putong.data.PushMessageCustom.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PushMessageCustom pushMessageCustom) {
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, pushMessageCustom.expire) + CodedOutputByteBufferNano.m17220b(2, pushMessageCustom.fullScreen);
            String str = pushMessageCustom.action;
            if (str != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(3, str);
            }
            String str2 = pushMessageCustom.url;
            if (str2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = pushMessageCustom.gender;
            if (str3 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            String str4 = pushMessageCustom.giftId;
            if (str4 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            String str5 = pushMessageCustom.big_pic_url;
            if (str5 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            String str6 = pushMessageCustom.age;
            if (str6 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(8, str6);
            }
            String str7 = pushMessageCustom.name;
            if (str7 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(9, str7);
            }
            String str8 = pushMessageCustom.tag1;
            if (str8 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(10, str8);
            }
            String str9 = pushMessageCustom.tag2;
            if (str9 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(11, str9);
            }
            String str10 = pushMessageCustom.tag3;
            if (str10 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(12, str10);
            }
            String str11 = pushMessageCustom.liveId;
            if (str11 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(13, str11);
            }
            String str12 = pushMessageCustom.roomId;
            if (str12 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(14, str12);
            }
            String str13 = pushMessageCustom.nickname;
            if (str13 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(15, str13);
            }
            String str14 = pushMessageCustom.tabId;
            if (str14 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(16, str14);
            }
            String str15 = pushMessageCustom.extTabId;
            if (str15 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(17, str15);
            }
            String str16 = pushMessageCustom.taskId;
            if (str16 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(18, str16);
            }
            String str17 = pushMessageCustom.dates;
            if (str17 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(19, str17);
            }
            String str18 = pushMessageCustom.recommendText;
            if (str18 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(20, str18);
            }
            String str19 = pushMessageCustom.buttonText;
            if (str19 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(21, str19);
            }
            String str20 = pushMessageCustom.queryToken;
            if (str20 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(22, str20);
            }
            String str21 = pushMessageCustom.otherUserID;
            if (str21 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(23, str21);
            }
            String str22 = pushMessageCustom.eventName;
            if (str22 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(24, str22);
            }
            int iM17220b = iM17222d + CodedOutputByteBufferNano.m17220b(25, pushMessageCustom.userMatched);
            String str23 = pushMessageCustom.rtcToken;
            if (str23 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(26, str23);
            }
            String str24 = pushMessageCustom.rtcChannel;
            if (str24 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(27, str24);
            }
            int iM17228j = iM17220b + CodedOutputByteBufferNano.m17228j(28, pushMessageCustom.rtcChannelWaitingTime);
            String str25 = pushMessageCustom.quickchatType;
            if (str25 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(29, str25);
            }
            String str26 = pushMessageCustom.queryOtherUserToken;
            if (str26 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(30, str26);
            }
            String str27 = pushMessageCustom.pullStreamUrl;
            if (str27 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(31, str27);
            }
            String str28 = pushMessageCustom.provider;
            if (str28 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(32, str28);
            }
            String str29 = pushMessageCustom.businessType;
            if (str29 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(33, str29);
            }
            String str30 = pushMessageCustom.callback;
            if (str30 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(34, str30);
            }
            String str31 = pushMessageCustom.source;
            if (str31 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(35, str31);
            }
            String str32 = pushMessageCustom.subSource;
            if (str32 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(36, str32);
            }
            String str33 = pushMessageCustom.f38805id;
            if (str33 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(37, str33);
            }
            String str34 = pushMessageCustom.caller;
            if (str34 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(38, str34);
            }
            String str35 = pushMessageCustom.callee;
            if (str35 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(39, str35);
            }
            String str36 = pushMessageCustom.callerDeviceId;
            if (str36 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(40, str36);
            }
            String str37 = pushMessageCustom.calleeDeviceId;
            if (str37 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(41, str37);
            }
            String str38 = pushMessageCustom.voiceStatus;
            if (str38 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(42, str38);
            }
            String str39 = pushMessageCustom.channelName;
            if (str39 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(43, str39);
            }
            String str40 = pushMessageCustom.callerToken;
            if (str40 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(44, str40);
            }
            String str41 = pushMessageCustom.calleeToken;
            if (str41 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(45, str41);
            }
            int iM17222d2 = iM17228j + CodedOutputByteBufferNano.m17222d(46, pushMessageCustom.createdTime);
            Boolean bool = pushMessageCustom.canUserStartLive;
            if (bool != null) {
                iM17222d2 += CodedOutputByteBufferNano.m17220b(47, bool.booleanValue());
            }
            int iM17228j2 = iM17222d2 + CodedOutputByteBufferNano.m17228j(48, pushMessageCustom.inflow);
            String str42 = pushMessageCustom.origin;
            if (str42 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(49, str42);
            }
            String str43 = pushMessageCustom.itemId;
            if (str43 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(50, str43);
            }
            String str44 = pushMessageCustom.orderId;
            if (str44 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(51, str44);
            }
            String str45 = pushMessageCustom.privileges;
            if (str45 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(52, str45);
            }
            String str46 = pushMessageCustom.matchTopic;
            if (str46 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(53, str46);
            }
            String str47 = pushMessageCustom.userId;
            if (str47 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(54, str47);
            }
            String str48 = pushMessageCustom.readUntilId;
            if (str48 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(55, str48);
            }
            String str49 = pushMessageCustom.letter;
            if (str49 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(56, str49);
            }
            String str50 = pushMessageCustom.openingRemark;
            if (str50 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(57, str50);
            }
            String str51 = pushMessageCustom.poolID;
            if (str51 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(58, str51);
            }
            int iM17228j3 = iM17228j2 + CodedOutputByteBufferNano.m17228j(59, pushMessageCustom.birthday);
            String str52 = pushMessageCustom.productType;
            if (str52 != null) {
                iM17228j3 += CodedOutputByteBufferNano.m17233o(60, str52);
            }
            String str53 = pushMessageCustom.category;
            if (str53 != null) {
                iM17228j3 += CodedOutputByteBufferNano.m17233o(61, str53);
            }
            String str54 = pushMessageCustom.currencySymbol;
            if (str54 != null) {
                iM17228j3 += CodedOutputByteBufferNano.m17233o(62, str54);
            }
            String str55 = pushMessageCustom.price;
            if (str55 != null) {
                iM17228j3 += CodedOutputByteBufferNano.m17233o(63, str55);
            }
            String str56 = pushMessageCustom.ext;
            if (str56 != null) {
                iM17228j3 += CodedOutputByteBufferNano.m17233o(64, str56);
            }
            int iM17228j4 = iM17228j3 + CodedOutputByteBufferNano.m17228j(65, pushMessageCustom.duration);
            String str57 = pushMessageCustom.likedCount;
            if (str57 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(66, str57);
            }
            String str58 = pushMessageCustom.likedPopuserCount;
            if (str58 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(67, str58);
            }
            String str59 = pushMessageCustom.popChange;
            if (str59 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(68, str59);
            }
            String str60 = pushMessageCustom.userName;
            if (str60 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(69, str60);
            }
            String str61 = pushMessageCustom.title;
            if (str61 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(70, str61);
            }
            String str62 = pushMessageCustom.content;
            if (str62 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(71, str62);
            }
            String str63 = pushMessageCustom.image;
            if (str63 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(72, str63);
            }
            String str64 = pushMessageCustom.couponId;
            if (str64 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(73, str64);
            }
            String str65 = pushMessageCustom.couponDesc;
            if (str65 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(74, str65);
            }
            String str66 = pushMessageCustom.merchandiseId;
            if (str66 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(75, str66);
            }
            String str67 = pushMessageCustom.platform;
            if (str67 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(76, str67);
            }
            String str68 = pushMessageCustom.contractId;
            if (str68 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(77, str68);
            }
            String str69 = pushMessageCustom.broadcastID;
            if (str69 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(78, str69);
            }
            String str70 = pushMessageCustom.partyId;
            if (str70 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(79, str70);
            }
            String str71 = pushMessageCustom.score;
            if (str71 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(80, str71);
            }
            String str72 = pushMessageCustom.link;
            if (str72 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(81, str72);
            }
            String str73 = pushMessageCustom.extra;
            if (str73 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(82, str73);
            }
            String str74 = pushMessageCustom.traceId;
            if (str74 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(83, str74);
            }
            String str75 = pushMessageCustom.otherID;
            if (str75 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(84, str75);
            }
            String str76 = pushMessageCustom.messageID;
            if (str76 != null) {
                iM17228j4 += CodedOutputByteBufferNano.m17233o(85, str76);
            }
            int iM17220b2 = iM17228j4 + CodedOutputByteBufferNano.m17220b(86, pushMessageCustom.isGreet);
            String str77 = pushMessageCustom.tracker;
            if (str77 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(87, str77);
            }
            int iM17226h = iM17220b2 + CodedOutputByteBufferNano.m17226h(88, pushMessageCustom.bellShowStayTime) + CodedOutputByteBufferNano.m17226h(89, pushMessageCustom.bellNotShowStayTime);
            String str78 = pushMessageCustom.voicePartnerFinderId;
            if (str78 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(90, str78);
            }
            String str79 = pushMessageCustom.avatar;
            if (str79 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(91, str79);
            }
            String str80 = pushMessageCustom.city;
            if (str80 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(92, str80);
            }
            int iM17228j5 = iM17226h + CodedOutputByteBufferNano.m17228j(93, pushMessageCustom.distance);
            String str81 = pushMessageCustom.zodiac;
            if (str81 != null) {
                iM17228j5 += CodedOutputByteBufferNano.m17233o(94, str81);
            }
            int iM17228j6 = iM17228j5 + CodedOutputByteBufferNano.m17228j(95, pushMessageCustom.countDownSeconds);
            String str82 = pushMessageCustom.topicId;
            if (str82 != null) {
                iM17228j6 += CodedOutputByteBufferNano.m17233o(96, str82);
            }
            int iM17220b3 = iM17228j6 + CodedOutputByteBufferNano.m17220b(97, pushMessageCustom.maskMode);
            String str83 = pushMessageCustom.receiveUserID;
            if (str83 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(98, str83);
            }
            String str84 = pushMessageCustom.radioType;
            if (str84 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(99, str84);
            }
            RelationshipStatus relationshipStatus = pushMessageCustom.rsStateReceiverToSender;
            if (relationshipStatus != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(100, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = pushMessageCustom.rsStateReceiverToSender;
            if (relationshipStatus2 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17226h(101, relationshipStatus2.ordinal());
            }
            int iM17220b4 = iM17220b3 + CodedOutputByteBufferNano.m17220b(102, pushMessageCustom.mandatory);
            String str85 = pushMessageCustom.scene;
            if (str85 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(103, str85);
            }
            String str86 = pushMessageCustom.greetID;
            if (str86 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(104, str86);
            }
            String str87 = pushMessageCustom.groupId;
            if (str87 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(105, str87);
            }
            String str88 = pushMessageCustom.videoPartnerFinderId;
            if (str88 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(106, str88);
            }
            String str89 = pushMessageCustom.startDate;
            if (str89 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(107, str89);
            }
            String str90 = pushMessageCustom.endDate;
            if (str90 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(108, str90);
            }
            String str91 = pushMessageCustom.creationData;
            if (str91 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(109, str91);
            }
            String str92 = pushMessageCustom.stateID;
            if (str92 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(110, str92);
            }
            String str93 = pushMessageCustom.stage;
            if (str93 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(111, str93);
            }
            String str94 = pushMessageCustom.biz;
            if (str94 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(112, str94);
            }
            String str95 = pushMessageCustom.text;
            if (str95 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(113, str95);
            }
            String str96 = pushMessageCustom.otherUserId;
            if (str96 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(114, str96);
            }
            String str97 = pushMessageCustom.type;
            if (str97 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(115, str97);
            }
            int iM17228j7 = iM17220b4 + CodedOutputByteBufferNano.m17228j(116, pushMessageCustom.lastActiveTime);
            String str98 = pushMessageCustom.otherUserName;
            if (str98 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(117, str98);
            }
            String str99 = pushMessageCustom.avatarState;
            if (str99 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(118, str99);
            }
            String str100 = pushMessageCustom.subTitle;
            if (str100 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(119, str100);
            }
            String str101 = pushMessageCustom.state;
            if (str101 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(120, str101);
            }
            String str102 = pushMessageCustom.conversationId;
            if (str102 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(121, str102);
            }
            String str103 = pushMessageCustom.liveTitle;
            if (str103 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(122, str103);
            }
            String str104 = pushMessageCustom.anchorId;
            if (str104 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(123, str104);
            }
            String str105 = pushMessageCustom.msgId;
            if (str105 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(124, str105);
            }
            String str106 = pushMessageCustom.schema;
            if (str106 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(125, str106);
            }
            String str107 = pushMessageCustom.triggeredUserId;
            if (str107 != null) {
                iM17228j7 += CodedOutputByteBufferNano.m17233o(126, str107);
            }
            int iM17220b5 = iM17228j7 + CodedOutputByteBufferNano.m17220b(127, pushMessageCustom.noRecommended) + CodedOutputByteBufferNano.m17220b(128, pushMessageCustom.isPassive);
            String str108 = pushMessageCustom.USSInsert;
            if (str108 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(MMConstants.ERR_WATERMARK_READ, str108);
            }
            String str109 = pushMessageCustom.USSToast;
            if (str109 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(130, str109);
            }
            String str110 = pushMessageCustom.USSPage;
            if (str110 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(131, str110);
            }
            String str111 = pushMessageCustom.USSBusiness;
            if (str111 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, str111);
            }
            String str112 = pushMessageCustom.USSIds;
            if (str112 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, str112);
            }
            String str113 = pushMessageCustom.USSVerify;
            if (str113 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(134, str113);
            }
            String str114 = pushMessageCustom.USSOption;
            if (str114 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, str114);
            }
            String str115 = pushMessageCustom.testGroupName;
            if (str115 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, str115);
            }
            String str116 = pushMessageCustom.avatars;
            if (str116 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, str116);
            }
            String str117 = pushMessageCustom.liveMode;
            if (str117 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_PSK_WITH_RC4_128_SHA, str117);
            }
            String str118 = pushMessageCustom.channel;
            if (str118 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, str118);
            }
            String str119 = pushMessageCustom.buzzToken;
            if (str119 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17233o(140, str119);
            }
            int iM17226h2 = iM17220b5 + CodedOutputByteBufferNano.m17226h(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, pushMessageCustom.extraPrivileges) + CodedOutputByteBufferNano.m17220b(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, pushMessageCustom.popupsDisplay) + CodedOutputByteBufferNano.m17226h(CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, pushMessageCustom.initialDuration) + CodedOutputByteBufferNano.m17226h(144, pushMessageCustom.prolongCount);
            String str120 = pushMessageCustom.appId;
            if (str120 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, str120);
            }
            int iM17226h3 = iM17226h2 + CodedOutputByteBufferNano.m17226h(CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, pushMessageCustom.vendor);
            String str121 = pushMessageCustom.channelToken;
            if (str121 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, str121);
            }
            String str122 = pushMessageCustom.channelKey;
            if (str122 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17233o(148, str122);
            }
            int iM17226h4 = iM17226h3 + CodedOutputByteBufferNano.m17226h(149, pushMessageCustom.totalDuration) + CodedOutputByteBufferNano.m17226h(150, pushMessageCustom.frozenDuration);
            String str123 = pushMessageCustom.bellType;
            if (str123 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17233o(151, str123);
            }
            int iM17226h5 = iM17226h4 + CodedOutputByteBufferNano.m17226h(CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, pushMessageCustom.resolutionHeight) + CodedOutputByteBufferNano.m17226h(153, pushMessageCustom.resolutionWidth);
            String str124 = pushMessageCustom.cell;
            if (str124 != null) {
                iM17226h5 += CodedOutputByteBufferNano.m17233o(154, str124);
            }
            String str125 = pushMessageCustom.questionIdSelected;
            if (str125 != null) {
                iM17226h5 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, str125);
            }
            int iM17220b6 = iM17226h5 + CodedOutputByteBufferNano.m17220b(CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, pushMessageCustom.insidePool);
            String str126 = pushMessageCustom.mode;
            if (str126 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17233o(157, str126);
            }
            String str127 = pushMessageCustom.gid;
            if (str127 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17233o(158, str127);
            }
            String str128 = pushMessageCustom.intent;
            if (str128 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17233o(159, str128);
            }
            String str129 = pushMessageCustom.ruleKey;
            if (str129 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17233o(160, str129);
            }
            String str130 = pushMessageCustom.selectedQuestion;
            if (str130 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17233o(161, str130);
            }
            String str131 = pushMessageCustom.timestamp;
            if (str131 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17233o(162, str131);
            }
            int iM17220b7 = iM17220b6 + CodedOutputByteBufferNano.m17220b(163, pushMessageCustom.needReact);
            String str132 = pushMessageCustom.reaction;
            if (str132 != null) {
                iM17220b7 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, str132);
            }
            String str133 = pushMessageCustom.alertId;
            if (str133 != null) {
                iM17220b7 += CodedOutputByteBufferNano.m17233o(165, str133);
            }
            String str134 = pushMessageCustom.otherUsers;
            if (str134 != null) {
                iM17220b7 += CodedOutputByteBufferNano.m17233o(166, str134);
            }
            int iM17226h6 = iM17220b7 + CodedOutputByteBufferNano.m17226h(167, pushMessageCustom.memojiDuration) + CodedOutputByteBufferNano.m17220b(CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, pushMessageCustom.newToast);
            String str135 = pushMessageCustom.bgImg;
            if (str135 != null) {
                iM17226h6 += CodedOutputByteBufferNano.m17233o(169, str135);
            }
            String str136 = pushMessageCustom.pushChannel;
            if (str136 != null) {
                iM17226h6 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, str136);
            }
            String str137 = pushMessageCustom.extremePickShowId;
            if (str137 != null) {
                iM17226h6 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, str137);
            }
            String str138 = pushMessageCustom.added;
            if (str138 != null) {
                iM17226h6 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, str138);
            }
            String str139 = pushMessageCustom.unread;
            if (str139 != null) {
                iM17226h6 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, str139);
            }
            String str140 = pushMessageCustom.total;
            if (str140 != null) {
                iM17226h6 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, str140);
            }
            int iM17220b8 = iM17226h6 + CodedOutputByteBufferNano.m17220b(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, pushMessageCustom.matched);
            String str141 = pushMessageCustom.honorGiftCardDetail;
            if (str141 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(176, str141);
            }
            Boolean bool2 = pushMessageCustom.canShowNotification;
            if (bool2 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17220b(177, bool2.booleanValue());
            }
            String str142 = pushMessageCustom.localNotificationCategory;
            if (str142 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(178, str142);
            }
            String str143 = pushMessageCustom.localNotificationImportance;
            if (str143 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, str143);
            }
            String str144 = pushMessageCustom.anchorCallId;
            if (str144 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(180, str144);
            }
            String str145 = pushMessageCustom.channelNameV2;
            if (str145 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(181, str145);
            }
            String str146 = pushMessageCustom.callerTokenV2;
            if (str146 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(182, str146);
            }
            String str147 = pushMessageCustom.calleeTokenV2;
            if (str147 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(183, str147);
            }
            String str148 = pushMessageCustom.rtcProvider;
            if (str148 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(184, str148);
            }
            String str149 = pushMessageCustom.videoChatId;
            if (str149 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(185, str149);
            }
            String str150 = pushMessageCustom.fitReason;
            if (str150 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, str150);
            }
            String str151 = pushMessageCustom.friendPurpose;
            if (str151 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(187, str151);
            }
            String str152 = pushMessageCustom.zodiacFitPercent;
            if (str152 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(188, str152);
            }
            String str153 = pushMessageCustom.tagID;
            if (str153 != null) {
                iM17220b8 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, str153);
            }
            int iM17220b9 = iM17220b8 + CodedOutputByteBufferNano.m17220b(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, pushMessageCustom.msgSingleUpdateIgnoreConvStatus);
            String str154 = pushMessageCustom.emoji;
            if (str154 != null) {
                iM17220b9 += CodedOutputByteBufferNano.m17233o(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, str154);
            }
            pushMessageCustom.cachedSize = iM17220b9;
            return iM17220b9;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PushMessageCustom parse(nb5 nb5Var) throws IOException {
            PushMessageCustom pushMessageCustom = new PushMessageCustom();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (pushMessageCustom.rsStateReceiverToSender == null && numValueOf != null) {
                            pushMessageCustom.rsStateReceiverToSender = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (pushMessageCustom.giftId == null) {
                            pushMessageCustom.giftId = "";
                        }
                        if (pushMessageCustom.age == null) {
                            pushMessageCustom.age = "";
                        }
                        if (pushMessageCustom.name == null) {
                            pushMessageCustom.name = "";
                        }
                        if (pushMessageCustom.tag1 == null) {
                            pushMessageCustom.tag1 = "";
                        }
                        if (pushMessageCustom.tag2 == null) {
                            pushMessageCustom.tag2 = "";
                        }
                        if (pushMessageCustom.tag3 == null) {
                            pushMessageCustom.tag3 = "";
                        }
                        if (pushMessageCustom.nickname == null) {
                            pushMessageCustom.nickname = "";
                        }
                        if (pushMessageCustom.scene == null) {
                            pushMessageCustom.scene = "";
                        }
                        if (pushMessageCustom.greetID == null) {
                            pushMessageCustom.greetID = "";
                        }
                        if (pushMessageCustom.groupId == null) {
                            pushMessageCustom.groupId = "";
                        }
                        if (pushMessageCustom.avatarState == null) {
                            pushMessageCustom.avatarState = "";
                        }
                        if (pushMessageCustom.subTitle == null) {
                            pushMessageCustom.subTitle = "";
                        }
                        if (pushMessageCustom.state == null) {
                            pushMessageCustom.state = "";
                        }
                        if (pushMessageCustom.conversationId == null) {
                            pushMessageCustom.conversationId = "";
                        }
                        if (pushMessageCustom.liveTitle == null) {
                            pushMessageCustom.liveTitle = "";
                        }
                        if (pushMessageCustom.anchorId == null) {
                            pushMessageCustom.anchorId = "";
                        }
                        if (pushMessageCustom.msgId == null) {
                            pushMessageCustom.msgId = "";
                        }
                        if (pushMessageCustom.schema == null) {
                            pushMessageCustom.schema = "";
                        }
                        if (pushMessageCustom.triggeredUserId == null) {
                            pushMessageCustom.triggeredUserId = "";
                        }
                        if (pushMessageCustom.USSInsert == null) {
                            pushMessageCustom.USSInsert = "";
                        }
                        if (pushMessageCustom.USSToast == null) {
                            pushMessageCustom.USSToast = "";
                        }
                        if (pushMessageCustom.USSPage == null) {
                            pushMessageCustom.USSPage = "";
                        }
                        if (pushMessageCustom.USSBusiness == null) {
                            pushMessageCustom.USSBusiness = "";
                        }
                        if (pushMessageCustom.USSIds == null) {
                            pushMessageCustom.USSIds = "";
                        }
                        if (pushMessageCustom.USSVerify == null) {
                            pushMessageCustom.USSVerify = "";
                        }
                        if (pushMessageCustom.USSOption == null) {
                            pushMessageCustom.USSOption = "";
                        }
                        if (pushMessageCustom.testGroupName == null) {
                            pushMessageCustom.testGroupName = "";
                        }
                        if (pushMessageCustom.avatars == null) {
                            pushMessageCustom.avatars = "";
                        }
                        if (pushMessageCustom.liveMode == null) {
                            pushMessageCustom.liveMode = "";
                        }
                        if (pushMessageCustom.channel == null) {
                            pushMessageCustom.channel = "";
                        }
                        if (pushMessageCustom.buzzToken == null) {
                            pushMessageCustom.buzzToken = "";
                        }
                        if (pushMessageCustom.appId == null) {
                            pushMessageCustom.appId = "";
                        }
                        if (pushMessageCustom.channelToken == null) {
                            pushMessageCustom.channelToken = "";
                        }
                        if (pushMessageCustom.channelKey == null) {
                            pushMessageCustom.channelKey = "";
                        }
                        if (pushMessageCustom.bellType == null) {
                            pushMessageCustom.bellType = "";
                        }
                        if (pushMessageCustom.cell == null) {
                            pushMessageCustom.cell = "";
                        }
                        if (pushMessageCustom.questionIdSelected == null) {
                            pushMessageCustom.questionIdSelected = "";
                        }
                        if (pushMessageCustom.mode == null) {
                            pushMessageCustom.mode = "";
                        }
                        if (pushMessageCustom.gid == null) {
                            pushMessageCustom.gid = "";
                        }
                        if (pushMessageCustom.intent == null) {
                            pushMessageCustom.intent = "";
                        }
                        if (pushMessageCustom.ruleKey == null) {
                            pushMessageCustom.ruleKey = "";
                        }
                        if (pushMessageCustom.selectedQuestion == null) {
                            pushMessageCustom.selectedQuestion = "";
                        }
                        if (pushMessageCustom.timestamp == null) {
                            pushMessageCustom.timestamp = "";
                        }
                        if (pushMessageCustom.reaction == null) {
                            pushMessageCustom.reaction = "";
                        }
                        if (pushMessageCustom.alertId == null) {
                            pushMessageCustom.alertId = "";
                        }
                        if (pushMessageCustom.otherUsers == null) {
                            pushMessageCustom.otherUsers = "";
                        }
                        if (pushMessageCustom.bgImg == null) {
                            pushMessageCustom.bgImg = "";
                        }
                        if (pushMessageCustom.pushChannel == null) {
                            pushMessageCustom.pushChannel = "";
                        }
                        if (pushMessageCustom.extremePickShowId == null) {
                            pushMessageCustom.extremePickShowId = "";
                        }
                        if (pushMessageCustom.added == null) {
                            pushMessageCustom.added = "";
                        }
                        if (pushMessageCustom.unread == null) {
                            pushMessageCustom.unread = "";
                        }
                        if (pushMessageCustom.total == null) {
                            pushMessageCustom.total = "";
                        }
                        if (pushMessageCustom.honorGiftCardDetail == null) {
                            pushMessageCustom.honorGiftCardDetail = "";
                        }
                        if (pushMessageCustom.localNotificationCategory == null) {
                            pushMessageCustom.localNotificationCategory = "";
                        }
                        if (pushMessageCustom.localNotificationImportance == null) {
                            pushMessageCustom.localNotificationImportance = "";
                        }
                        if (pushMessageCustom.anchorCallId == null) {
                            pushMessageCustom.anchorCallId = "";
                        }
                        if (pushMessageCustom.channelNameV2 == null) {
                            pushMessageCustom.channelNameV2 = "";
                        }
                        if (pushMessageCustom.callerTokenV2 == null) {
                            pushMessageCustom.callerTokenV2 = "";
                        }
                        if (pushMessageCustom.calleeTokenV2 == null) {
                            pushMessageCustom.calleeTokenV2 = "";
                        }
                        if (pushMessageCustom.rtcProvider == null) {
                            pushMessageCustom.rtcProvider = "";
                        }
                        if (pushMessageCustom.videoChatId == null) {
                            pushMessageCustom.videoChatId = "";
                        }
                        if (pushMessageCustom.fitReason == null) {
                            pushMessageCustom.fitReason = "";
                        }
                        if (pushMessageCustom.friendPurpose == null) {
                            pushMessageCustom.friendPurpose = "";
                        }
                        if (pushMessageCustom.zodiacFitPercent == null) {
                            pushMessageCustom.zodiacFitPercent = "";
                        }
                        if (pushMessageCustom.tagID == null) {
                            pushMessageCustom.tagID = "";
                        }
                        if (pushMessageCustom.emoji == null) {
                            pushMessageCustom.emoji = "";
                        }
                        break;
                    case 9:
                        pushMessageCustom.expire = nb5Var.m158739h();
                        continue;
                    case 16:
                        pushMessageCustom.fullScreen = nb5Var.m158738g();
                        continue;
                    case 26:
                        pushMessageCustom.action = nb5Var.m158750s();
                        continue;
                    case 34:
                        pushMessageCustom.url = nb5Var.m158750s();
                        continue;
                    case 42:
                        pushMessageCustom.gender = nb5Var.m158750s();
                        continue;
                    case 50:
                        pushMessageCustom.giftId = nb5Var.m158750s();
                        continue;
                    case 58:
                        pushMessageCustom.big_pic_url = nb5Var.m158750s();
                        continue;
                    case 66:
                        pushMessageCustom.age = nb5Var.m158750s();
                        continue;
                    case 74:
                        pushMessageCustom.name = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        pushMessageCustom.tag1 = nb5Var.m158750s();
                        continue;
                    case 90:
                        pushMessageCustom.tag2 = nb5Var.m158750s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        pushMessageCustom.tag3 = nb5Var.m158750s();
                        continue;
                    case 106:
                        pushMessageCustom.liveId = nb5Var.m158750s();
                        continue;
                    case 114:
                        pushMessageCustom.roomId = nb5Var.m158750s();
                        continue;
                    case 122:
                        pushMessageCustom.nickname = nb5Var.m158750s();
                        continue;
                    case 130:
                        pushMessageCustom.tabId = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        pushMessageCustom.extTabId = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        pushMessageCustom.taskId = nb5Var.m158750s();
                        continue;
                    case 154:
                        pushMessageCustom.dates = nb5Var.m158750s();
                        continue;
                    case 162:
                        pushMessageCustom.recommendText = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        pushMessageCustom.buttonText = nb5Var.m158750s();
                        continue;
                    case 178:
                        pushMessageCustom.queryToken = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        pushMessageCustom.otherUserID = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        pushMessageCustom.eventName = nb5Var.m158750s();
                        continue;
                    case 200:
                        pushMessageCustom.userMatched = nb5Var.m158738g();
                        continue;
                    case 210:
                        pushMessageCustom.rtcToken = nb5Var.m158750s();
                        continue;
                    case 218:
                        pushMessageCustom.rtcChannel = nb5Var.m158750s();
                        continue;
                    case 224:
                        pushMessageCustom.rtcChannelWaitingTime = nb5Var.m158742k();
                        continue;
                    case 234:
                        pushMessageCustom.quickchatType = nb5Var.m158750s();
                        continue;
                    case 242:
                        pushMessageCustom.queryOtherUserToken = nb5Var.m158750s();
                        continue;
                    case 250:
                        pushMessageCustom.pullStreamUrl = nb5Var.m158750s();
                        continue;
                    case 258:
                        pushMessageCustom.provider = nb5Var.m158750s();
                        continue;
                    case 266:
                        pushMessageCustom.businessType = nb5Var.m158750s();
                        continue;
                    case 274:
                        pushMessageCustom.callback = nb5Var.m158750s();
                        continue;
                    case 282:
                        pushMessageCustom.source = nb5Var.m158750s();
                        continue;
                    case 290:
                        pushMessageCustom.subSource = nb5Var.m158750s();
                        continue;
                    case 298:
                        pushMessageCustom.f38805id = nb5Var.m158750s();
                        continue;
                    case 306:
                        pushMessageCustom.caller = nb5Var.m158750s();
                        continue;
                    case 314:
                        pushMessageCustom.callee = nb5Var.m158750s();
                        continue;
                    case 322:
                        pushMessageCustom.callerDeviceId = nb5Var.m158750s();
                        continue;
                    case 330:
                        pushMessageCustom.calleeDeviceId = nb5Var.m158750s();
                        continue;
                    case 338:
                        pushMessageCustom.voiceStatus = nb5Var.m158750s();
                        continue;
                    case 346:
                        pushMessageCustom.channelName = nb5Var.m158750s();
                        continue;
                    case 354:
                        pushMessageCustom.callerToken = nb5Var.m158750s();
                        continue;
                    case 362:
                        pushMessageCustom.calleeToken = nb5Var.m158750s();
                        continue;
                    case 369:
                        pushMessageCustom.createdTime = nb5Var.m158739h();
                        continue;
                    case 376:
                        pushMessageCustom.canUserStartLive = Boolean.valueOf(nb5Var.m158738g());
                        continue;
                    case 384:
                        pushMessageCustom.inflow = nb5Var.m158742k();
                        continue;
                    case 394:
                        pushMessageCustom.origin = nb5Var.m158750s();
                        continue;
                    case 402:
                        pushMessageCustom.itemId = nb5Var.m158750s();
                        continue;
                    case 410:
                        pushMessageCustom.orderId = nb5Var.m158750s();
                        continue;
                    case 418:
                        pushMessageCustom.privileges = nb5Var.m158750s();
                        continue;
                    case 426:
                        pushMessageCustom.matchTopic = nb5Var.m158750s();
                        continue;
                    case 434:
                        pushMessageCustom.userId = nb5Var.m158750s();
                        continue;
                    case 442:
                        pushMessageCustom.readUntilId = nb5Var.m158750s();
                        continue;
                    case 450:
                        pushMessageCustom.letter = nb5Var.m158750s();
                        continue;
                    case 458:
                        pushMessageCustom.openingRemark = nb5Var.m158750s();
                        continue;
                    case 466:
                        pushMessageCustom.poolID = nb5Var.m158750s();
                        continue;
                    case 472:
                        pushMessageCustom.birthday = nb5Var.m158742k();
                        continue;
                    case 482:
                        pushMessageCustom.productType = nb5Var.m158750s();
                        continue;
                    case 490:
                        pushMessageCustom.category = nb5Var.m158750s();
                        continue;
                    case 498:
                        pushMessageCustom.currencySymbol = nb5Var.m158750s();
                        continue;
                    case 506:
                        pushMessageCustom.price = nb5Var.m158750s();
                        continue;
                    case 514:
                        pushMessageCustom.ext = nb5Var.m158750s();
                        continue;
                    case 520:
                        pushMessageCustom.duration = nb5Var.m158742k();
                        continue;
                    case 530:
                        pushMessageCustom.likedCount = nb5Var.m158750s();
                        continue;
                    case 538:
                        pushMessageCustom.likedPopuserCount = nb5Var.m158750s();
                        continue;
                    case 546:
                        pushMessageCustom.popChange = nb5Var.m158750s();
                        continue;
                    case 554:
                        pushMessageCustom.userName = nb5Var.m158750s();
                        continue;
                    case 562:
                        pushMessageCustom.title = nb5Var.m158750s();
                        continue;
                    case 570:
                        pushMessageCustom.content = nb5Var.m158750s();
                        continue;
                    case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /* 578 */:
                        pushMessageCustom.image = nb5Var.m158750s();
                        continue;
                    case 586:
                        pushMessageCustom.couponId = nb5Var.m158750s();
                        continue;
                    case 594:
                        pushMessageCustom.couponDesc = nb5Var.m158750s();
                        continue;
                    case 602:
                        pushMessageCustom.merchandiseId = nb5Var.m158750s();
                        continue;
                    case 610:
                        pushMessageCustom.platform = nb5Var.m158750s();
                        continue;
                    case 618:
                        pushMessageCustom.contractId = nb5Var.m158750s();
                        continue;
                    case 626:
                        pushMessageCustom.broadcastID = nb5Var.m158750s();
                        continue;
                    case 634:
                        pushMessageCustom.partyId = nb5Var.m158750s();
                        continue;
                    case 642:
                        pushMessageCustom.score = nb5Var.m158750s();
                        continue;
                    case 650:
                        pushMessageCustom.link = nb5Var.m158750s();
                        continue;
                    case 658:
                        pushMessageCustom.extra = nb5Var.m158750s();
                        continue;
                    case 666:
                        pushMessageCustom.traceId = nb5Var.m158750s();
                        continue;
                    case 674:
                        pushMessageCustom.otherID = nb5Var.m158750s();
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_RIG /* 682 */:
                        pushMessageCustom.messageID = nb5Var.m158750s();
                        continue;
                    case 688:
                        pushMessageCustom.isGreet = nb5Var.m158738g();
                        continue;
                    case 698:
                        pushMessageCustom.tracker = nb5Var.m158750s();
                        continue;
                    case IMediaPlayer.MEDIA_INFO_INITBUFFERING_START /* 704 */:
                        pushMessageCustom.bellShowStayTime = nb5Var.m158741j();
                        continue;
                    case 712:
                        pushMessageCustom.bellNotShowStayTime = nb5Var.m158741j();
                        continue;
                    case 722:
                        pushMessageCustom.voicePartnerFinderId = nb5Var.m158750s();
                        continue;
                    case 730:
                        pushMessageCustom.avatar = nb5Var.m158750s();
                        continue;
                    case 738:
                        pushMessageCustom.city = nb5Var.m158750s();
                        continue;
                    case 744:
                        pushMessageCustom.distance = nb5Var.m158742k();
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_AR_GIFT /* 754 */:
                        pushMessageCustom.zodiac = nb5Var.m158750s();
                        continue;
                    case 760:
                        pushMessageCustom.countDownSeconds = nb5Var.m158742k();
                        continue;
                    case 770:
                        pushMessageCustom.topicId = nb5Var.m158750s();
                        continue;
                    case 776:
                        pushMessageCustom.maskMode = nb5Var.m158738g();
                        continue;
                    case PutongAct.REQUEST_CODE_PICKER /* 786 */:
                        pushMessageCustom.receiveUserID = nb5Var.m158750s();
                        continue;
                    case 794:
                        pushMessageCustom.radioType = nb5Var.m158750s();
                        continue;
                    case 802:
                        pushMessageCustom.rsStateReceiverToSender = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 808:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 816:
                        pushMessageCustom.mandatory = nb5Var.m158738g();
                        continue;
                    case 826:
                        pushMessageCustom.scene = nb5Var.m158750s();
                        continue;
                    case 834:
                        pushMessageCustom.greetID = nb5Var.m158750s();
                        continue;
                    case 842:
                        pushMessageCustom.groupId = nb5Var.m158750s();
                        continue;
                    case 850:
                        pushMessageCustom.videoPartnerFinderId = nb5Var.m158750s();
                        continue;
                    case 858:
                        pushMessageCustom.startDate = nb5Var.m158750s();
                        continue;
                    case 866:
                        pushMessageCustom.endDate = nb5Var.m158750s();
                        continue;
                    case 874:
                        pushMessageCustom.creationData = nb5Var.m158750s();
                        continue;
                    case 882:
                        pushMessageCustom.stateID = nb5Var.m158750s();
                        continue;
                    case 890:
                        pushMessageCustom.stage = nb5Var.m158750s();
                        continue;
                    case 898:
                        pushMessageCustom.biz = nb5Var.m158750s();
                        continue;
                    case IMediaPlayer.MEDIA_INFO_V_DELAY /* 906 */:
                        pushMessageCustom.text = nb5Var.m158750s();
                        continue;
                    case 914:
                        pushMessageCustom.otherUserId = nb5Var.m158750s();
                        continue;
                    case 922:
                        pushMessageCustom.type = nb5Var.m158750s();
                        continue;
                    case 928:
                        pushMessageCustom.lastActiveTime = nb5Var.m158742k();
                        continue;
                    case 938:
                        pushMessageCustom.otherUserName = nb5Var.m158750s();
                        continue;
                    case 946:
                        pushMessageCustom.avatarState = nb5Var.m158750s();
                        continue;
                    case 954:
                        pushMessageCustom.subTitle = nb5Var.m158750s();
                        continue;
                    case 962:
                        pushMessageCustom.state = nb5Var.m158750s();
                        continue;
                    case 970:
                        pushMessageCustom.conversationId = nb5Var.m158750s();
                        continue;
                    case 978:
                        pushMessageCustom.liveTitle = nb5Var.m158750s();
                        continue;
                    case 986:
                        pushMessageCustom.anchorId = nb5Var.m158750s();
                        continue;
                    case 994:
                        pushMessageCustom.msgId = nb5Var.m158750s();
                        continue;
                    case 1002:
                        pushMessageCustom.schema = nb5Var.m158750s();
                        continue;
                    case 1010:
                        pushMessageCustom.triggeredUserId = nb5Var.m158750s();
                        continue;
                    case 1016:
                        pushMessageCustom.noRecommended = nb5Var.m158738g();
                        continue;
                    case 1024:
                        pushMessageCustom.isPassive = nb5Var.m158738g();
                        continue;
                    case 1034:
                        pushMessageCustom.USSInsert = nb5Var.m158750s();
                        continue;
                    case 1042:
                        pushMessageCustom.USSToast = nb5Var.m158750s();
                        continue;
                    case 1050:
                        pushMessageCustom.USSPage = nb5Var.m158750s();
                        continue;
                    case 1058:
                        pushMessageCustom.USSBusiness = nb5Var.m158750s();
                        continue;
                    case 1066:
                        pushMessageCustom.USSIds = nb5Var.m158750s();
                        continue;
                    case 1074:
                        pushMessageCustom.USSVerify = nb5Var.m158750s();
                        continue;
                    case 1082:
                        pushMessageCustom.USSOption = nb5Var.m158750s();
                        continue;
                    case 1090:
                        pushMessageCustom.testGroupName = nb5Var.m158750s();
                        continue;
                    case 1098:
                        pushMessageCustom.avatars = nb5Var.m158750s();
                        continue;
                    case TXLiveConstants.PUSH_WARNING_VIDEO_ENCODE_BITRATE_OVERFLOW /* 1106 */:
                        pushMessageCustom.liveMode = nb5Var.m158750s();
                        continue;
                    case RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE /* 1114 */:
                        pushMessageCustom.channel = nb5Var.m158750s();
                        continue;
                    case RtcEngineEvent.EvtType.EVT_PUBLISH_STREAM_EVENT /* 1122 */:
                        pushMessageCustom.buzzToken = nb5Var.m158750s();
                        continue;
                    case 1128:
                        pushMessageCustom.extraPrivileges = nb5Var.m158741j();
                        continue;
                    case 1136:
                        pushMessageCustom.popupsDisplay = nb5Var.m158738g();
                        continue;
                    case 1144:
                        pushMessageCustom.initialDuration = nb5Var.m158741j();
                        continue;
                    case 1152:
                        pushMessageCustom.prolongCount = nb5Var.m158741j();
                        continue;
                    case 1162:
                        pushMessageCustom.appId = nb5Var.m158750s();
                        continue;
                    case 1168:
                        pushMessageCustom.vendor = nb5Var.m158741j();
                        continue;
                    case 1178:
                        pushMessageCustom.channelToken = nb5Var.m158750s();
                        continue;
                    case 1186:
                        pushMessageCustom.channelKey = nb5Var.m158750s();
                        continue;
                    case 1192:
                        pushMessageCustom.totalDuration = nb5Var.m158741j();
                        continue;
                    case 1200:
                        pushMessageCustom.frozenDuration = nb5Var.m158741j();
                        continue;
                    case 1210:
                        pushMessageCustom.bellType = nb5Var.m158750s();
                        continue;
                    case 1216:
                        pushMessageCustom.resolutionHeight = nb5Var.m158741j();
                        continue;
                    case 1224:
                        pushMessageCustom.resolutionWidth = nb5Var.m158741j();
                        continue;
                    case 1234:
                        pushMessageCustom.cell = nb5Var.m158750s();
                        continue;
                    case 1242:
                        pushMessageCustom.questionIdSelected = nb5Var.m158750s();
                        continue;
                    case 1248:
                        pushMessageCustom.insidePool = nb5Var.m158738g();
                        continue;
                    case 1258:
                        pushMessageCustom.mode = nb5Var.m158750s();
                        continue;
                    case 1266:
                        pushMessageCustom.gid = nb5Var.m158750s();
                        continue;
                    case 1274:
                        pushMessageCustom.intent = nb5Var.m158750s();
                        continue;
                    case 1282:
                        pushMessageCustom.ruleKey = nb5Var.m158750s();
                        continue;
                    case 1290:
                        pushMessageCustom.selectedQuestion = nb5Var.m158750s();
                        continue;
                    case 1298:
                        pushMessageCustom.timestamp = nb5Var.m158750s();
                        continue;
                    case 1304:
                        pushMessageCustom.needReact = nb5Var.m158738g();
                        continue;
                    case 1314:
                        pushMessageCustom.reaction = nb5Var.m158750s();
                        continue;
                    case 1322:
                        pushMessageCustom.alertId = nb5Var.m158750s();
                        continue;
                    case 1330:
                        pushMessageCustom.otherUsers = nb5Var.m158750s();
                        continue;
                    case 1336:
                        pushMessageCustom.memojiDuration = nb5Var.m158741j();
                        continue;
                    case 1344:
                        pushMessageCustom.newToast = nb5Var.m158738g();
                        continue;
                    case 1354:
                        pushMessageCustom.bgImg = nb5Var.m158750s();
                        continue;
                    case 1362:
                        pushMessageCustom.pushChannel = nb5Var.m158750s();
                        continue;
                    case 1370:
                        pushMessageCustom.extremePickShowId = nb5Var.m158750s();
                        continue;
                    case 1378:
                        pushMessageCustom.added = nb5Var.m158750s();
                        continue;
                    case 1386:
                        pushMessageCustom.unread = nb5Var.m158750s();
                        continue;
                    case 1394:
                        pushMessageCustom.total = nb5Var.m158750s();
                        continue;
                    case 1400:
                        pushMessageCustom.matched = nb5Var.m158738g();
                        continue;
                    case 1410:
                        pushMessageCustom.honorGiftCardDetail = nb5Var.m158750s();
                        continue;
                    case 1416:
                        pushMessageCustom.canShowNotification = Boolean.valueOf(nb5Var.m158738g());
                        continue;
                    case 1426:
                        pushMessageCustom.localNotificationCategory = nb5Var.m158750s();
                        continue;
                    case 1434:
                        pushMessageCustom.localNotificationImportance = nb5Var.m158750s();
                        continue;
                    case 1442:
                        pushMessageCustom.anchorCallId = nb5Var.m158750s();
                        continue;
                    case 1450:
                        pushMessageCustom.channelNameV2 = nb5Var.m158750s();
                        continue;
                    case 1458:
                        pushMessageCustom.callerTokenV2 = nb5Var.m158750s();
                        continue;
                    case 1466:
                        pushMessageCustom.calleeTokenV2 = nb5Var.m158750s();
                        continue;
                    case 1474:
                        pushMessageCustom.rtcProvider = nb5Var.m158750s();
                        continue;
                    case 1482:
                        pushMessageCustom.videoChatId = nb5Var.m158750s();
                        continue;
                    case 1490:
                        pushMessageCustom.fitReason = nb5Var.m158750s();
                        continue;
                    case 1498:
                        pushMessageCustom.friendPurpose = nb5Var.m158750s();
                        continue;
                    case 1506:
                        pushMessageCustom.zodiacFitPercent = nb5Var.m158750s();
                        continue;
                    case 1514:
                        pushMessageCustom.tagID = nb5Var.m158750s();
                        continue;
                    case 1520:
                        pushMessageCustom.msgSingleUpdateIgnoreConvStatus = nb5Var.m158738g();
                        continue;
                    case 1530:
                        pushMessageCustom.emoji = nb5Var.m158750s();
                        continue;
                    default:
                        if (pushMessageCustom.rsStateReceiverToSender == null && numValueOf != null) {
                            pushMessageCustom.rsStateReceiverToSender = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (pushMessageCustom.giftId == null) {
                            pushMessageCustom.giftId = "";
                        }
                        if (pushMessageCustom.age == null) {
                            pushMessageCustom.age = "";
                        }
                        if (pushMessageCustom.name == null) {
                            pushMessageCustom.name = "";
                        }
                        if (pushMessageCustom.tag1 == null) {
                            pushMessageCustom.tag1 = "";
                        }
                        if (pushMessageCustom.tag2 == null) {
                            pushMessageCustom.tag2 = "";
                        }
                        if (pushMessageCustom.tag3 == null) {
                            pushMessageCustom.tag3 = "";
                        }
                        if (pushMessageCustom.nickname == null) {
                            pushMessageCustom.nickname = "";
                        }
                        if (pushMessageCustom.scene == null) {
                            pushMessageCustom.scene = "";
                        }
                        if (pushMessageCustom.greetID == null) {
                            pushMessageCustom.greetID = "";
                        }
                        if (pushMessageCustom.groupId == null) {
                            pushMessageCustom.groupId = "";
                        }
                        if (pushMessageCustom.avatarState == null) {
                            pushMessageCustom.avatarState = "";
                        }
                        if (pushMessageCustom.subTitle == null) {
                            pushMessageCustom.subTitle = "";
                        }
                        if (pushMessageCustom.state == null) {
                            pushMessageCustom.state = "";
                        }
                        if (pushMessageCustom.conversationId == null) {
                            pushMessageCustom.conversationId = "";
                        }
                        if (pushMessageCustom.liveTitle == null) {
                            pushMessageCustom.liveTitle = "";
                        }
                        if (pushMessageCustom.anchorId == null) {
                            pushMessageCustom.anchorId = "";
                        }
                        if (pushMessageCustom.msgId == null) {
                            pushMessageCustom.msgId = "";
                        }
                        if (pushMessageCustom.schema == null) {
                            pushMessageCustom.schema = "";
                        }
                        if (pushMessageCustom.triggeredUserId == null) {
                            pushMessageCustom.triggeredUserId = "";
                        }
                        if (pushMessageCustom.USSInsert == null) {
                            pushMessageCustom.USSInsert = "";
                        }
                        if (pushMessageCustom.USSToast == null) {
                            pushMessageCustom.USSToast = "";
                        }
                        if (pushMessageCustom.USSPage == null) {
                            pushMessageCustom.USSPage = "";
                        }
                        if (pushMessageCustom.USSBusiness == null) {
                            pushMessageCustom.USSBusiness = "";
                        }
                        if (pushMessageCustom.USSIds == null) {
                            pushMessageCustom.USSIds = "";
                        }
                        if (pushMessageCustom.USSVerify == null) {
                            pushMessageCustom.USSVerify = "";
                        }
                        if (pushMessageCustom.USSOption == null) {
                            pushMessageCustom.USSOption = "";
                        }
                        if (pushMessageCustom.testGroupName == null) {
                            pushMessageCustom.testGroupName = "";
                        }
                        if (pushMessageCustom.avatars == null) {
                            pushMessageCustom.avatars = "";
                        }
                        if (pushMessageCustom.liveMode == null) {
                            pushMessageCustom.liveMode = "";
                        }
                        if (pushMessageCustom.channel == null) {
                            pushMessageCustom.channel = "";
                        }
                        if (pushMessageCustom.buzzToken == null) {
                            pushMessageCustom.buzzToken = "";
                        }
                        if (pushMessageCustom.appId == null) {
                            pushMessageCustom.appId = "";
                        }
                        if (pushMessageCustom.channelToken == null) {
                            pushMessageCustom.channelToken = "";
                        }
                        if (pushMessageCustom.channelKey == null) {
                            pushMessageCustom.channelKey = "";
                        }
                        if (pushMessageCustom.bellType == null) {
                            pushMessageCustom.bellType = "";
                        }
                        if (pushMessageCustom.cell == null) {
                            pushMessageCustom.cell = "";
                        }
                        if (pushMessageCustom.questionIdSelected == null) {
                            pushMessageCustom.questionIdSelected = "";
                        }
                        if (pushMessageCustom.mode == null) {
                            pushMessageCustom.mode = "";
                        }
                        if (pushMessageCustom.gid == null) {
                            pushMessageCustom.gid = "";
                        }
                        if (pushMessageCustom.intent == null) {
                            pushMessageCustom.intent = "";
                        }
                        if (pushMessageCustom.ruleKey == null) {
                            pushMessageCustom.ruleKey = "";
                        }
                        if (pushMessageCustom.selectedQuestion == null) {
                            pushMessageCustom.selectedQuestion = "";
                        }
                        if (pushMessageCustom.timestamp == null) {
                            pushMessageCustom.timestamp = "";
                        }
                        if (pushMessageCustom.reaction == null) {
                            pushMessageCustom.reaction = "";
                        }
                        if (pushMessageCustom.alertId == null) {
                            pushMessageCustom.alertId = "";
                        }
                        if (pushMessageCustom.otherUsers == null) {
                            pushMessageCustom.otherUsers = "";
                        }
                        if (pushMessageCustom.bgImg == null) {
                            pushMessageCustom.bgImg = "";
                        }
                        if (pushMessageCustom.pushChannel == null) {
                            pushMessageCustom.pushChannel = "";
                        }
                        if (pushMessageCustom.extremePickShowId == null) {
                            pushMessageCustom.extremePickShowId = "";
                        }
                        if (pushMessageCustom.added == null) {
                            pushMessageCustom.added = "";
                        }
                        if (pushMessageCustom.unread == null) {
                            pushMessageCustom.unread = "";
                        }
                        if (pushMessageCustom.total == null) {
                            pushMessageCustom.total = "";
                        }
                        if (pushMessageCustom.honorGiftCardDetail == null) {
                            pushMessageCustom.honorGiftCardDetail = "";
                        }
                        if (pushMessageCustom.localNotificationCategory == null) {
                            pushMessageCustom.localNotificationCategory = "";
                        }
                        if (pushMessageCustom.localNotificationImportance == null) {
                            pushMessageCustom.localNotificationImportance = "";
                        }
                        if (pushMessageCustom.anchorCallId == null) {
                            pushMessageCustom.anchorCallId = "";
                        }
                        if (pushMessageCustom.channelNameV2 == null) {
                            pushMessageCustom.channelNameV2 = "";
                        }
                        if (pushMessageCustom.callerTokenV2 == null) {
                            pushMessageCustom.callerTokenV2 = "";
                        }
                        if (pushMessageCustom.calleeTokenV2 == null) {
                            pushMessageCustom.calleeTokenV2 = "";
                        }
                        if (pushMessageCustom.rtcProvider == null) {
                            pushMessageCustom.rtcProvider = "";
                        }
                        if (pushMessageCustom.videoChatId == null) {
                            pushMessageCustom.videoChatId = "";
                        }
                        if (pushMessageCustom.fitReason == null) {
                            pushMessageCustom.fitReason = "";
                        }
                        if (pushMessageCustom.friendPurpose == null) {
                            pushMessageCustom.friendPurpose = "";
                        }
                        if (pushMessageCustom.zodiacFitPercent == null) {
                            pushMessageCustom.zodiacFitPercent = "";
                        }
                        if (pushMessageCustom.tagID == null) {
                            pushMessageCustom.tagID = "";
                        }
                        if (pushMessageCustom.emoji == null) {
                            pushMessageCustom.emoji = "";
                            return pushMessageCustom;
                        }
                        break;
                }
            }
            return pushMessageCustom;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PushMessageCustom pushMessageCustom, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, pushMessageCustom.expire);
            codedOutputByteBufferNano.m17244A(2, pushMessageCustom.fullScreen);
            String str = pushMessageCustom.action;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            String str2 = pushMessageCustom.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = pushMessageCustom.gender;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            String str4 = pushMessageCustom.giftId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            String str5 = pushMessageCustom.big_pic_url;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            String str6 = pushMessageCustom.age;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(8, str6);
            }
            String str7 = pushMessageCustom.name;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(9, str7);
            }
            String str8 = pushMessageCustom.tag1;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(10, str8);
            }
            String str9 = pushMessageCustom.tag2;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(11, str9);
            }
            String str10 = pushMessageCustom.tag3;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(12, str10);
            }
            String str11 = pushMessageCustom.liveId;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(13, str11);
            }
            String str12 = pushMessageCustom.roomId;
            if (str12 != null) {
                codedOutputByteBufferNano.m17261R(14, str12);
            }
            String str13 = pushMessageCustom.nickname;
            if (str13 != null) {
                codedOutputByteBufferNano.m17261R(15, str13);
            }
            String str14 = pushMessageCustom.tabId;
            if (str14 != null) {
                codedOutputByteBufferNano.m17261R(16, str14);
            }
            String str15 = pushMessageCustom.extTabId;
            if (str15 != null) {
                codedOutputByteBufferNano.m17261R(17, str15);
            }
            String str16 = pushMessageCustom.taskId;
            if (str16 != null) {
                codedOutputByteBufferNano.m17261R(18, str16);
            }
            String str17 = pushMessageCustom.dates;
            if (str17 != null) {
                codedOutputByteBufferNano.m17261R(19, str17);
            }
            String str18 = pushMessageCustom.recommendText;
            if (str18 != null) {
                codedOutputByteBufferNano.m17261R(20, str18);
            }
            String str19 = pushMessageCustom.buttonText;
            if (str19 != null) {
                codedOutputByteBufferNano.m17261R(21, str19);
            }
            String str20 = pushMessageCustom.queryToken;
            if (str20 != null) {
                codedOutputByteBufferNano.m17261R(22, str20);
            }
            String str21 = pushMessageCustom.otherUserID;
            if (str21 != null) {
                codedOutputByteBufferNano.m17261R(23, str21);
            }
            String str22 = pushMessageCustom.eventName;
            if (str22 != null) {
                codedOutputByteBufferNano.m17261R(24, str22);
            }
            codedOutputByteBufferNano.m17244A(25, pushMessageCustom.userMatched);
            String str23 = pushMessageCustom.rtcToken;
            if (str23 != null) {
                codedOutputByteBufferNano.m17261R(26, str23);
            }
            String str24 = pushMessageCustom.rtcChannel;
            if (str24 != null) {
                codedOutputByteBufferNano.m17261R(27, str24);
            }
            codedOutputByteBufferNano.m17252I(28, pushMessageCustom.rtcChannelWaitingTime);
            String str25 = pushMessageCustom.quickchatType;
            if (str25 != null) {
                codedOutputByteBufferNano.m17261R(29, str25);
            }
            String str26 = pushMessageCustom.queryOtherUserToken;
            if (str26 != null) {
                codedOutputByteBufferNano.m17261R(30, str26);
            }
            String str27 = pushMessageCustom.pullStreamUrl;
            if (str27 != null) {
                codedOutputByteBufferNano.m17261R(31, str27);
            }
            String str28 = pushMessageCustom.provider;
            if (str28 != null) {
                codedOutputByteBufferNano.m17261R(32, str28);
            }
            String str29 = pushMessageCustom.businessType;
            if (str29 != null) {
                codedOutputByteBufferNano.m17261R(33, str29);
            }
            String str30 = pushMessageCustom.callback;
            if (str30 != null) {
                codedOutputByteBufferNano.m17261R(34, str30);
            }
            String str31 = pushMessageCustom.source;
            if (str31 != null) {
                codedOutputByteBufferNano.m17261R(35, str31);
            }
            String str32 = pushMessageCustom.subSource;
            if (str32 != null) {
                codedOutputByteBufferNano.m17261R(36, str32);
            }
            String str33 = pushMessageCustom.f38805id;
            if (str33 != null) {
                codedOutputByteBufferNano.m17261R(37, str33);
            }
            String str34 = pushMessageCustom.caller;
            if (str34 != null) {
                codedOutputByteBufferNano.m17261R(38, str34);
            }
            String str35 = pushMessageCustom.callee;
            if (str35 != null) {
                codedOutputByteBufferNano.m17261R(39, str35);
            }
            String str36 = pushMessageCustom.callerDeviceId;
            if (str36 != null) {
                codedOutputByteBufferNano.m17261R(40, str36);
            }
            String str37 = pushMessageCustom.calleeDeviceId;
            if (str37 != null) {
                codedOutputByteBufferNano.m17261R(41, str37);
            }
            String str38 = pushMessageCustom.voiceStatus;
            if (str38 != null) {
                codedOutputByteBufferNano.m17261R(42, str38);
            }
            String str39 = pushMessageCustom.channelName;
            if (str39 != null) {
                codedOutputByteBufferNano.m17261R(43, str39);
            }
            String str40 = pushMessageCustom.callerToken;
            if (str40 != null) {
                codedOutputByteBufferNano.m17261R(44, str40);
            }
            String str41 = pushMessageCustom.calleeToken;
            if (str41 != null) {
                codedOutputByteBufferNano.m17261R(45, str41);
            }
            codedOutputByteBufferNano.m17246C(46, pushMessageCustom.createdTime);
            Boolean bool = pushMessageCustom.canUserStartLive;
            if (bool != null) {
                codedOutputByteBufferNano.m17244A(47, bool.booleanValue());
            }
            codedOutputByteBufferNano.m17252I(48, pushMessageCustom.inflow);
            String str42 = pushMessageCustom.origin;
            if (str42 != null) {
                codedOutputByteBufferNano.m17261R(49, str42);
            }
            String str43 = pushMessageCustom.itemId;
            if (str43 != null) {
                codedOutputByteBufferNano.m17261R(50, str43);
            }
            String str44 = pushMessageCustom.orderId;
            if (str44 != null) {
                codedOutputByteBufferNano.m17261R(51, str44);
            }
            String str45 = pushMessageCustom.privileges;
            if (str45 != null) {
                codedOutputByteBufferNano.m17261R(52, str45);
            }
            String str46 = pushMessageCustom.matchTopic;
            if (str46 != null) {
                codedOutputByteBufferNano.m17261R(53, str46);
            }
            String str47 = pushMessageCustom.userId;
            if (str47 != null) {
                codedOutputByteBufferNano.m17261R(54, str47);
            }
            String str48 = pushMessageCustom.readUntilId;
            if (str48 != null) {
                codedOutputByteBufferNano.m17261R(55, str48);
            }
            String str49 = pushMessageCustom.letter;
            if (str49 != null) {
                codedOutputByteBufferNano.m17261R(56, str49);
            }
            String str50 = pushMessageCustom.openingRemark;
            if (str50 != null) {
                codedOutputByteBufferNano.m17261R(57, str50);
            }
            String str51 = pushMessageCustom.poolID;
            if (str51 != null) {
                codedOutputByteBufferNano.m17261R(58, str51);
            }
            codedOutputByteBufferNano.m17252I(59, pushMessageCustom.birthday);
            String str52 = pushMessageCustom.productType;
            if (str52 != null) {
                codedOutputByteBufferNano.m17261R(60, str52);
            }
            String str53 = pushMessageCustom.category;
            if (str53 != null) {
                codedOutputByteBufferNano.m17261R(61, str53);
            }
            String str54 = pushMessageCustom.currencySymbol;
            if (str54 != null) {
                codedOutputByteBufferNano.m17261R(62, str54);
            }
            String str55 = pushMessageCustom.price;
            if (str55 != null) {
                codedOutputByteBufferNano.m17261R(63, str55);
            }
            String str56 = pushMessageCustom.ext;
            if (str56 != null) {
                codedOutputByteBufferNano.m17261R(64, str56);
            }
            codedOutputByteBufferNano.m17252I(65, pushMessageCustom.duration);
            String str57 = pushMessageCustom.likedCount;
            if (str57 != null) {
                codedOutputByteBufferNano.m17261R(66, str57);
            }
            String str58 = pushMessageCustom.likedPopuserCount;
            if (str58 != null) {
                codedOutputByteBufferNano.m17261R(67, str58);
            }
            String str59 = pushMessageCustom.popChange;
            if (str59 != null) {
                codedOutputByteBufferNano.m17261R(68, str59);
            }
            String str60 = pushMessageCustom.userName;
            if (str60 != null) {
                codedOutputByteBufferNano.m17261R(69, str60);
            }
            String str61 = pushMessageCustom.title;
            if (str61 != null) {
                codedOutputByteBufferNano.m17261R(70, str61);
            }
            String str62 = pushMessageCustom.content;
            if (str62 != null) {
                codedOutputByteBufferNano.m17261R(71, str62);
            }
            String str63 = pushMessageCustom.image;
            if (str63 != null) {
                codedOutputByteBufferNano.m17261R(72, str63);
            }
            String str64 = pushMessageCustom.couponId;
            if (str64 != null) {
                codedOutputByteBufferNano.m17261R(73, str64);
            }
            String str65 = pushMessageCustom.couponDesc;
            if (str65 != null) {
                codedOutputByteBufferNano.m17261R(74, str65);
            }
            String str66 = pushMessageCustom.merchandiseId;
            if (str66 != null) {
                codedOutputByteBufferNano.m17261R(75, str66);
            }
            String str67 = pushMessageCustom.platform;
            if (str67 != null) {
                codedOutputByteBufferNano.m17261R(76, str67);
            }
            String str68 = pushMessageCustom.contractId;
            if (str68 != null) {
                codedOutputByteBufferNano.m17261R(77, str68);
            }
            String str69 = pushMessageCustom.broadcastID;
            if (str69 != null) {
                codedOutputByteBufferNano.m17261R(78, str69);
            }
            String str70 = pushMessageCustom.partyId;
            if (str70 != null) {
                codedOutputByteBufferNano.m17261R(79, str70);
            }
            String str71 = pushMessageCustom.score;
            if (str71 != null) {
                codedOutputByteBufferNano.m17261R(80, str71);
            }
            String str72 = pushMessageCustom.link;
            if (str72 != null) {
                codedOutputByteBufferNano.m17261R(81, str72);
            }
            String str73 = pushMessageCustom.extra;
            if (str73 != null) {
                codedOutputByteBufferNano.m17261R(82, str73);
            }
            String str74 = pushMessageCustom.traceId;
            if (str74 != null) {
                codedOutputByteBufferNano.m17261R(83, str74);
            }
            String str75 = pushMessageCustom.otherID;
            if (str75 != null) {
                codedOutputByteBufferNano.m17261R(84, str75);
            }
            String str76 = pushMessageCustom.messageID;
            if (str76 != null) {
                codedOutputByteBufferNano.m17261R(85, str76);
            }
            codedOutputByteBufferNano.m17244A(86, pushMessageCustom.isGreet);
            String str77 = pushMessageCustom.tracker;
            if (str77 != null) {
                codedOutputByteBufferNano.m17261R(87, str77);
            }
            codedOutputByteBufferNano.m17250G(88, pushMessageCustom.bellShowStayTime);
            codedOutputByteBufferNano.m17250G(89, pushMessageCustom.bellNotShowStayTime);
            String str78 = pushMessageCustom.voicePartnerFinderId;
            if (str78 != null) {
                codedOutputByteBufferNano.m17261R(90, str78);
            }
            String str79 = pushMessageCustom.avatar;
            if (str79 != null) {
                codedOutputByteBufferNano.m17261R(91, str79);
            }
            String str80 = pushMessageCustom.city;
            if (str80 != null) {
                codedOutputByteBufferNano.m17261R(92, str80);
            }
            codedOutputByteBufferNano.m17252I(93, pushMessageCustom.distance);
            String str81 = pushMessageCustom.zodiac;
            if (str81 != null) {
                codedOutputByteBufferNano.m17261R(94, str81);
            }
            codedOutputByteBufferNano.m17252I(95, pushMessageCustom.countDownSeconds);
            String str82 = pushMessageCustom.topicId;
            if (str82 != null) {
                codedOutputByteBufferNano.m17261R(96, str82);
            }
            codedOutputByteBufferNano.m17244A(97, pushMessageCustom.maskMode);
            String str83 = pushMessageCustom.receiveUserID;
            if (str83 != null) {
                codedOutputByteBufferNano.m17261R(98, str83);
            }
            String str84 = pushMessageCustom.radioType;
            if (str84 != null) {
                codedOutputByteBufferNano.m17261R(99, str84);
            }
            RelationshipStatus relationshipStatus = pushMessageCustom.rsStateReceiverToSender;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17254K(100, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = pushMessageCustom.rsStateReceiverToSender;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.m17250G(101, relationshipStatus2.ordinal());
            }
            codedOutputByteBufferNano.m17244A(102, pushMessageCustom.mandatory);
            String str85 = pushMessageCustom.scene;
            if (str85 != null) {
                codedOutputByteBufferNano.m17261R(103, str85);
            }
            String str86 = pushMessageCustom.greetID;
            if (str86 != null) {
                codedOutputByteBufferNano.m17261R(104, str86);
            }
            String str87 = pushMessageCustom.groupId;
            if (str87 != null) {
                codedOutputByteBufferNano.m17261R(105, str87);
            }
            String str88 = pushMessageCustom.videoPartnerFinderId;
            if (str88 != null) {
                codedOutputByteBufferNano.m17261R(106, str88);
            }
            String str89 = pushMessageCustom.startDate;
            if (str89 != null) {
                codedOutputByteBufferNano.m17261R(107, str89);
            }
            String str90 = pushMessageCustom.endDate;
            if (str90 != null) {
                codedOutputByteBufferNano.m17261R(108, str90);
            }
            String str91 = pushMessageCustom.creationData;
            if (str91 != null) {
                codedOutputByteBufferNano.m17261R(109, str91);
            }
            String str92 = pushMessageCustom.stateID;
            if (str92 != null) {
                codedOutputByteBufferNano.m17261R(110, str92);
            }
            String str93 = pushMessageCustom.stage;
            if (str93 != null) {
                codedOutputByteBufferNano.m17261R(111, str93);
            }
            String str94 = pushMessageCustom.biz;
            if (str94 != null) {
                codedOutputByteBufferNano.m17261R(112, str94);
            }
            String str95 = pushMessageCustom.text;
            if (str95 != null) {
                codedOutputByteBufferNano.m17261R(113, str95);
            }
            String str96 = pushMessageCustom.otherUserId;
            if (str96 != null) {
                codedOutputByteBufferNano.m17261R(114, str96);
            }
            String str97 = pushMessageCustom.type;
            if (str97 != null) {
                codedOutputByteBufferNano.m17261R(115, str97);
            }
            codedOutputByteBufferNano.m17252I(116, pushMessageCustom.lastActiveTime);
            String str98 = pushMessageCustom.otherUserName;
            if (str98 != null) {
                codedOutputByteBufferNano.m17261R(117, str98);
            }
            String str99 = pushMessageCustom.avatarState;
            if (str99 != null) {
                codedOutputByteBufferNano.m17261R(118, str99);
            }
            String str100 = pushMessageCustom.subTitle;
            if (str100 != null) {
                codedOutputByteBufferNano.m17261R(119, str100);
            }
            String str101 = pushMessageCustom.state;
            if (str101 != null) {
                codedOutputByteBufferNano.m17261R(120, str101);
            }
            String str102 = pushMessageCustom.conversationId;
            if (str102 != null) {
                codedOutputByteBufferNano.m17261R(121, str102);
            }
            String str103 = pushMessageCustom.liveTitle;
            if (str103 != null) {
                codedOutputByteBufferNano.m17261R(122, str103);
            }
            String str104 = pushMessageCustom.anchorId;
            if (str104 != null) {
                codedOutputByteBufferNano.m17261R(123, str104);
            }
            String str105 = pushMessageCustom.msgId;
            if (str105 != null) {
                codedOutputByteBufferNano.m17261R(124, str105);
            }
            String str106 = pushMessageCustom.schema;
            if (str106 != null) {
                codedOutputByteBufferNano.m17261R(125, str106);
            }
            String str107 = pushMessageCustom.triggeredUserId;
            if (str107 != null) {
                codedOutputByteBufferNano.m17261R(126, str107);
            }
            codedOutputByteBufferNano.m17244A(127, pushMessageCustom.noRecommended);
            codedOutputByteBufferNano.m17244A(128, pushMessageCustom.isPassive);
            String str108 = pushMessageCustom.USSInsert;
            if (str108 != null) {
                codedOutputByteBufferNano.m17261R(MMConstants.ERR_WATERMARK_READ, str108);
            }
            String str109 = pushMessageCustom.USSToast;
            if (str109 != null) {
                codedOutputByteBufferNano.m17261R(130, str109);
            }
            String str110 = pushMessageCustom.USSPage;
            if (str110 != null) {
                codedOutputByteBufferNano.m17261R(131, str110);
            }
            String str111 = pushMessageCustom.USSBusiness;
            if (str111 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, str111);
            }
            String str112 = pushMessageCustom.USSIds;
            if (str112 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, str112);
            }
            String str113 = pushMessageCustom.USSVerify;
            if (str113 != null) {
                codedOutputByteBufferNano.m17261R(134, str113);
            }
            String str114 = pushMessageCustom.USSOption;
            if (str114 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, str114);
            }
            String str115 = pushMessageCustom.testGroupName;
            if (str115 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, str115);
            }
            String str116 = pushMessageCustom.avatars;
            if (str116 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, str116);
            }
            String str117 = pushMessageCustom.liveMode;
            if (str117 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_PSK_WITH_RC4_128_SHA, str117);
            }
            String str118 = pushMessageCustom.channel;
            if (str118 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, str118);
            }
            String str119 = pushMessageCustom.buzzToken;
            if (str119 != null) {
                codedOutputByteBufferNano.m17261R(140, str119);
            }
            codedOutputByteBufferNano.m17250G(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, pushMessageCustom.extraPrivileges);
            codedOutputByteBufferNano.m17244A(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, pushMessageCustom.popupsDisplay);
            codedOutputByteBufferNano.m17250G(CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, pushMessageCustom.initialDuration);
            codedOutputByteBufferNano.m17250G(144, pushMessageCustom.prolongCount);
            String str120 = pushMessageCustom.appId;
            if (str120 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, str120);
            }
            codedOutputByteBufferNano.m17250G(CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, pushMessageCustom.vendor);
            String str121 = pushMessageCustom.channelToken;
            if (str121 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, str121);
            }
            String str122 = pushMessageCustom.channelKey;
            if (str122 != null) {
                codedOutputByteBufferNano.m17261R(148, str122);
            }
            codedOutputByteBufferNano.m17250G(149, pushMessageCustom.totalDuration);
            codedOutputByteBufferNano.m17250G(150, pushMessageCustom.frozenDuration);
            String str123 = pushMessageCustom.bellType;
            if (str123 != null) {
                codedOutputByteBufferNano.m17261R(151, str123);
            }
            codedOutputByteBufferNano.m17250G(CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, pushMessageCustom.resolutionHeight);
            codedOutputByteBufferNano.m17250G(153, pushMessageCustom.resolutionWidth);
            String str124 = pushMessageCustom.cell;
            if (str124 != null) {
                codedOutputByteBufferNano.m17261R(154, str124);
            }
            String str125 = pushMessageCustom.questionIdSelected;
            if (str125 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, str125);
            }
            codedOutputByteBufferNano.m17244A(CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, pushMessageCustom.insidePool);
            String str126 = pushMessageCustom.mode;
            if (str126 != null) {
                codedOutputByteBufferNano.m17261R(157, str126);
            }
            String str127 = pushMessageCustom.gid;
            if (str127 != null) {
                codedOutputByteBufferNano.m17261R(158, str127);
            }
            String str128 = pushMessageCustom.intent;
            if (str128 != null) {
                codedOutputByteBufferNano.m17261R(159, str128);
            }
            String str129 = pushMessageCustom.ruleKey;
            if (str129 != null) {
                codedOutputByteBufferNano.m17261R(160, str129);
            }
            String str130 = pushMessageCustom.selectedQuestion;
            if (str130 != null) {
                codedOutputByteBufferNano.m17261R(161, str130);
            }
            String str131 = pushMessageCustom.timestamp;
            if (str131 != null) {
                codedOutputByteBufferNano.m17261R(162, str131);
            }
            codedOutputByteBufferNano.m17244A(163, pushMessageCustom.needReact);
            String str132 = pushMessageCustom.reaction;
            if (str132 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, str132);
            }
            String str133 = pushMessageCustom.alertId;
            if (str133 != null) {
                codedOutputByteBufferNano.m17261R(165, str133);
            }
            String str134 = pushMessageCustom.otherUsers;
            if (str134 != null) {
                codedOutputByteBufferNano.m17261R(166, str134);
            }
            codedOutputByteBufferNano.m17250G(167, pushMessageCustom.memojiDuration);
            codedOutputByteBufferNano.m17244A(CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, pushMessageCustom.newToast);
            String str135 = pushMessageCustom.bgImg;
            if (str135 != null) {
                codedOutputByteBufferNano.m17261R(169, str135);
            }
            String str136 = pushMessageCustom.pushChannel;
            if (str136 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, str136);
            }
            String str137 = pushMessageCustom.extremePickShowId;
            if (str137 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, str137);
            }
            String str138 = pushMessageCustom.added;
            if (str138 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, str138);
            }
            String str139 = pushMessageCustom.unread;
            if (str139 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, str139);
            }
            String str140 = pushMessageCustom.total;
            if (str140 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, str140);
            }
            codedOutputByteBufferNano.m17244A(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, pushMessageCustom.matched);
            String str141 = pushMessageCustom.honorGiftCardDetail;
            if (str141 != null) {
                codedOutputByteBufferNano.m17261R(176, str141);
            }
            Boolean bool2 = pushMessageCustom.canShowNotification;
            if (bool2 != null) {
                codedOutputByteBufferNano.m17244A(177, bool2.booleanValue());
            }
            String str142 = pushMessageCustom.localNotificationCategory;
            if (str142 != null) {
                codedOutputByteBufferNano.m17261R(178, str142);
            }
            String str143 = pushMessageCustom.localNotificationImportance;
            if (str143 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, str143);
            }
            String str144 = pushMessageCustom.anchorCallId;
            if (str144 != null) {
                codedOutputByteBufferNano.m17261R(180, str144);
            }
            String str145 = pushMessageCustom.channelNameV2;
            if (str145 != null) {
                codedOutputByteBufferNano.m17261R(181, str145);
            }
            String str146 = pushMessageCustom.callerTokenV2;
            if (str146 != null) {
                codedOutputByteBufferNano.m17261R(182, str146);
            }
            String str147 = pushMessageCustom.calleeTokenV2;
            if (str147 != null) {
                codedOutputByteBufferNano.m17261R(183, str147);
            }
            String str148 = pushMessageCustom.rtcProvider;
            if (str148 != null) {
                codedOutputByteBufferNano.m17261R(184, str148);
            }
            String str149 = pushMessageCustom.videoChatId;
            if (str149 != null) {
                codedOutputByteBufferNano.m17261R(185, str149);
            }
            String str150 = pushMessageCustom.fitReason;
            if (str150 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, str150);
            }
            String str151 = pushMessageCustom.friendPurpose;
            if (str151 != null) {
                codedOutputByteBufferNano.m17261R(187, str151);
            }
            String str152 = pushMessageCustom.zodiacFitPercent;
            if (str152 != null) {
                codedOutputByteBufferNano.m17261R(188, str152);
            }
            String str153 = pushMessageCustom.tagID;
            if (str153 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, str153);
            }
            codedOutputByteBufferNano.m17244A(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, pushMessageCustom.msgSingleUpdateIgnoreConvStatus);
            String str154 = pushMessageCustom.emoji;
            if (str154 != null) {
                codedOutputByteBufferNano.m17261R(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, str154);
            }
        }
    };
    public static JsonAdapter<PushMessageCustom> JSON_ADAPTER = new ObjectJsonAdapter<PushMessageCustom>() { // from class: com.p1.mobile.putong.data.PushMessageCustom.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PushMessageCustom.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PushMessageCustom newInstance() {
            return new PushMessageCustom();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(PushMessageCustom pushMessageCustom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129778896:
                    if (str.equals(Message.START_DATE)) {
                        b = 0;
                    }
                    break;
                case -2090050568:
                    if (str.equals("subTitle")) {
                        b = 1;
                    }
                    break;
                case -2054622879:
                    if (str.equals("popChange")) {
                        b = 2;
                    }
                    break;
                case -2041905623:
                    if (str.equals("lastActiveTime")) {
                        b = 3;
                    }
                    break;
                case -2021065568:
                    if (str.equals(ProfileLikeCategoryType.friendPurpose)) {
                        b = 4;
                    }
                    break;
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 5;
                    }
                    break;
                case -1965553416:
                    if (str.equals("totalDuration")) {
                        b = 6;
                    }
                    break;
                case -1955461670:
                    if (str.equals("noRecommended")) {
                        b = 7;
                    }
                    break;
                case -1945743238:
                    if (str.equals("resolutionWidth")) {
                        b = 8;
                    }
                    break;
                case -1930828196:
                    if (str.equals("channelKey")) {
                        b = 9;
                    }
                    break;
                case -1897140884:
                    if (str.equals("stateID")) {
                        b = 10;
                    }
                    break;
                case -1842000754:
                    if (str.equals("USSInsert")) {
                        b = 11;
                    }
                    break;
                case -1836979729:
                    if (str.equals("extTabId")) {
                        b = 12;
                    }
                    break;
                case -1789542636:
                    if (str.equals("localNotificationCategory")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1782291197:
                    if (str.equals("USSIds")) {
                        b = 14;
                    }
                    break;
                case -1676095234:
                    if (str.equals("conversationId")) {
                        b = 15;
                    }
                    break;
                case -1668345270:
                    if (str.equals("USSOption")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1654399006:
                    if (str.equals("privileges")) {
                        b = 17;
                    }
                    break;
                case -1652668442:
                    if (str.equals("prolongCount")) {
                        b = 18;
                    }
                    break;
                case -1641345706:
                    if (str.equals("otherUserID")) {
                        b = 19;
                    }
                    break;
                case -1641345674:
                    if (str.equals("otherUserId")) {
                        b = 20;
                    }
                    break;
                case -1635359571:
                    if (str.equals("memojiDuration")) {
                        b = 21;
                    }
                    break;
                case -1607727319:
                    if (str.equals(Message.END_DATE)) {
                        b = 22;
                    }
                    break;
                case -1605267209:
                    if (str.equals("calleeTokenV2")) {
                        b = 23;
                    }
                    break;
                case -1534979169:
                    if (str.equals("quickchatType")) {
                        b = 24;
                    }
                    break;
                case -1497380959:
                    if (str.equals("selectedQuestion")) {
                        b = 25;
                    }
                    break;
                case -1491615543:
                    if (str.equals("productType")) {
                        b = 26;
                    }
                    break;
                case -1478159794:
                    if (str.equals("USSVerify")) {
                        b = 27;
                    }
                    break;
                case -1446021330:
                    if (str.equals("anchorCallId")) {
                        b = 28;
                    }
                    break;
                case -1440013470:
                    if (str.equals(Message.MESSAGE_ID)) {
                        b = 29;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 30;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 31;
                    }
                    break;
                case -1371818339:
                    if (str.equals("isPassive")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case -1367775362:
                    if (str.equals("callee")) {
                        b = 33;
                    }
                    break;
                case -1367775349:
                    if (str.equals(BLiveRole.caller)) {
                        b = 34;
                    }
                    break;
                case -1290855582:
                    if (str.equals("rtcChannel")) {
                        b = 35;
                    }
                    break;
                case -1289159393:
                    if (str.equals("expire")) {
                        b = 36;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 37;
                    }
                    break;
                case -1246042517:
                    if (str.equals("giftId")) {
                        b = 38;
                    }
                    break;
                case -1207110391:
                    if (str.equals("orderId")) {
                        b = 39;
                    }
                    break;
                case -1184173101:
                    if (str.equals("inflow")) {
                        b = 40;
                    }
                    break;
                case -1183762788:
                    if (str.equals("intent")) {
                        b = 41;
                    }
                    break;
                case -1178662002:
                    if (str.equals("itemId")) {
                        b = 42;
                    }
                    break;
                case -1146158037:
                    if (str.equals("otherID")) {
                        b = 43;
                    }
                    break;
                case -1141961719:
                    if (str.equals("recommendText")) {
                        b = 44;
                    }
                    break;
                case -1139259734:
                    if (str.equals("topicId")) {
                        b = 45;
                    }
                    break;
                case -1106172890:
                    if (str.equals("letter")) {
                        b = 46;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 47;
                    }
                    break;
                case -1080045530:
                    if (str.equals("otherUserName")) {
                        b = 48;
                    }
                    break;
                case -1067401920:
                    if (str.equals("traceId")) {
                        b = 49;
                    }
                    break;
                case -1067395272:
                    if (str.equals("tracker")) {
                        b = 50;
                    }
                    break;
                case -1016098141:
                    if (str.equals("readUntilId")) {
                        b = 51;
                    }
                    break;
                case -1008619738:
                    if (str.equals("origin")) {
                        b = 52;
                    }
                    break;
                case -987494927:
                    if (str.equals("provider")) {
                        b = 53;
                    }
                    break;
                case -986443395:
                    if (str.equals("triggeredUserId")) {
                        b = 54;
                    }
                    break;
                case -982578633:
                    if (str.equals("poolID")) {
                        b = 55;
                    }
                    break;
                case -971181392:
                    if (str.equals("anchorId")) {
                        b = 56;
                    }
                    break;
                case -970219051:
                    if (str.equals("radioType")) {
                        b = 57;
                    }
                    break;
                case -961886820:
                    if (str.equals("broadcastID")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case -952175653:
                    if (str.equals("honorGiftCardDetail")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case -940712581:
                    if (str.equals("popupsDisplay")) {
                        b = 60;
                    }
                    break;
                case -934433014:
                    if (str.equals("localNotificationImportance")) {
                        b = 61;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 62;
                    }
                    break;
                case -917722217:
                    if (str.equals("alertId")) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        b = 64;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 65;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 66;
                    }
                    break;
                case -881483016:
                    if (str.equals("openingRemark")) {
                        b = 67;
                    }
                    break;
                case -880873088:
                    if (str.equals("taskId")) {
                        b = 68;
                    }
                    break;
                case -867509719:
                    if (str.equals("reaction")) {
                        b = 69;
                    }
                    break;
                case -840272977:
                    if (str.equals(LimitTimePictureStatus.unread)) {
                        b = 70;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 71;
                    }
                    break;
                case -820075192:
                    if (str.equals("vendor")) {
                        b = 72;
                    }
                    break;
                case -813470408:
                    if (str.equals("testGroupName")) {
                        b = 73;
                    }
                    break;
                case -806066213:
                    if (str.equals(OMSMorphBaseStyle.fullScreen)) {
                        b = 74;
                    }
                    break;
                case -792919391:
                    if (str.equals("partyId")) {
                        b = 75;
                    }
                    break;
                case -696616932:
                    if (str.equals(ProfileLikeCategoryType.zodiac)) {
                        b = 76;
                    }
                    break;
                case -678862494:
                    if (str.equals("likedCount")) {
                        b = 77;
                    }
                    break;
                case -672734438:
                    if (str.equals("businessType")) {
                        b = 78;
                    }
                    break;
                case -635082182:
                    if (str.equals("avatars")) {
                        b = 79;
                    }
                    break;
                case -621493005:
                    if (str.equals("resolutionHeight")) {
                        b = 80;
                    }
                    break;
                case -602675322:
                    if (str.equals("bellShowStayTime")) {
                        b = 81;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 82;
                    }
                    break;
                case -423569334:
                    if (str.equals("callerTokenV2")) {
                        b = 83;
                    }
                    break;
                case -396598248:
                    if (str.equals("rtcToken")) {
                        b = 84;
                    }
                    break;
                case -392910375:
                    if (str.equals("mandatory")) {
                        b = 85;
                    }
                    break;
                case -390110597:
                    if (str.equals("subSource")) {
                        b = 86;
                    }
                    break;
                case -370315295:
                    if (str.equals("couponId")) {
                        b = 87;
                    }
                    break;
                case -340276176:
                    if (str.equals("zodiacFitPercent")) {
                        b = 88;
                    }
                    break;
                case -312458999:
                    if (str.equals("currencySymbol")) {
                        b = 89;
                    }
                    break;
                case -305637457:
                    if (str.equals("calleeDeviceId")) {
                        b = 90;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 91;
                    }
                    break;
                case -198802184:
                    if (str.equals("initialDuration")) {
                        b = 92;
                    }
                    break;
                case -193561032:
                    if (str.equals("insidePool")) {
                        b = 93;
                    }
                    break;
                case -191493928:
                    if (str.equals("otherUsers")) {
                        b = 94;
                    }
                    break;
                case -178459119:
                    if (str.equals("queryToken")) {
                        b = 95;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 96;
                    }
                    break;
                case -91425098:
                    if (str.equals("channelToken")) {
                        b = 97;
                    }
                    break;
                case -49804731:
                    if (str.equals("extremePickShowId")) {
                        b = 98;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 99;
                    }
                    break;
                case 96511:
                    if (str.equals(SeeTextDynamicParam.age)) {
                        b = 100;
                    }
                    break;
                case 97555:
                    if (str.equals("biz")) {
                        b = 101;
                    }
                    break;
                case 100897:
                    if (str.equals(BaseSei.EXT)) {
                        b = 102;
                    }
                    break;
                case 102338:
                    if (str.equals("gid")) {
                        b = 103;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 104;
                    }
                    break;
                case 3049826:
                    if (str.equals("cell")) {
                        b = 105;
                    }
                    break;
                case 3053931:
                    if (str.equals(RankLevel.city)) {
                        b = 106;
                    }
                    break;
                case 3321850:
                    if (str.equals(Link.TYPE)) {
                        b = 107;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        b = 108;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 109;
                    }
                    break;
                case 3552215:
                    if (str.equals("tag1")) {
                        b = 110;
                    }
                    break;
                case 3552216:
                    if (str.equals("tag2")) {
                        b = 111;
                    }
                    break;
                case 3552217:
                    if (str.equals("tag3")) {
                        b = 112;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        b = 113;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 114;
                    }
                    break;
                case 31228997:
                    if (str.equals("eventName")) {
                        b = 115;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 116;
                    }
                    break;
                case 53666259:
                    if (str.equals("bellNotShowStayTime")) {
                        b = 117;
                    }
                    break;
                case 55126294:
                    if (str.equals("timestamp")) {
                        b = 118;
                    }
                    break;
                case 70690926:
                    if (str.equals("nickname")) {
                        b = 119;
                    }
                    break;
                case 92659968:
                    if (str.equals("added")) {
                        b = 120;
                    }
                    break;
                case 93028124:
                    if (str.equals(RemoteConfigConstants.RequestFieldKey.APP_ID)) {
                        b = 121;
                    }
                    break;
                case 93647166:
                    if (str.equals("bgImg")) {
                        b = 122;
                    }
                    break;
                case 95356549:
                    if (str.equals("dates")) {
                        b = 123;
                    }
                    break;
                case 96632902:
                    if (str.equals("emoji")) {
                        b = 124;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = 125;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        b = 126;
                    }
                    break;
                case 104191100:
                    if (str.equals("msgId")) {
                        b = 127;
                    }
                    break;
                case 106934601:
                    if (str.equals(FirebaseAnalytics.Param.PRICE)) {
                        b = 128;
                    }
                    break;
                case 109254796:
                    if (str.equals("scene")) {
                        b = 129;
                    }
                    break;
                case 109264530:
                    if (str.equals(FirebaseAnalytics.Param.SCORE)) {
                        b = 130;
                    }
                    break;
                case 109757182:
                    if (str.equals("stage")) {
                        b = 131;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 132;
                    }
                    break;
                case 110114704:
                    if (str.equals("tabId")) {
                        b = 133;
                    }
                    break;
                case 110119477:
                    if (str.equals("tagID")) {
                        b = 134;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 135;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        b = 136;
                    }
                    break;
                case 273953326:
                    if (str.equals("channelName")) {
                        b = 137;
                    }
                    break;
                case 274882223:
                    if (str.equals("maskMode")) {
                        b = 138;
                    }
                    break;
                case 283720164:
                    if (str.equals("greetID")) {
                        b = 139;
                    }
                    break;
                case 288459765:
                    if (str.equals("distance")) {
                        b = 140;
                    }
                    break;
                case 293428218:
                    if (str.equals("groupId")) {
                        b = 141;
                    }
                    break;
                case 337994011:
                    if (str.equals("calleeToken")) {
                        b = 142;
                    }
                    break;
                case 358545279:
                    if (str.equals("buttonText")) {
                        b = 143;
                    }
                    break;
                case 386204344:
                    if (str.equals("avatarState")) {
                        b = 144;
                    }
                    break;
                case 513028978:
                    if (str.equals("rtcProvider")) {
                        b = 145;
                    }
                    break;
                case 538995417:
                    if (str.equals("userMatched")) {
                        b = 146;
                    }
                    break;
                case 563903754:
                    if (str.equals("pullStreamUrl")) {
                        b = 147;
                    }
                    break;
                case 573284078:
                    if (str.equals("videoChatId")) {
                        b = 148;
                    }
                    break;
                case 583753124:
                    if (str.equals("USSPage")) {
                        b = 149;
                    }
                    break;
                case 591078484:
                    if (str.equals("frozenDuration")) {
                        b = 150;
                    }
                    break;
                case 592168654:
                    if (str.equals("videoPartnerFinderId")) {
                        b = 151;
                    }
                    break;
                case 609142743:
                    if (str.equals("couponDesc")) {
                        b = 152;
                    }
                    break;
                case 624238029:
                    if (str.equals("contractId")) {
                        b = 153;
                    }
                    break;
                case 656086153:
                    if (str.equals("pushChannel")) {
                        b = 154;
                    }
                    break;
                case 710172974:
                    if (str.equals("callerToken")) {
                        b = 155;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        b = 156;
                    }
                    break;
                case 840861988:
                    if (str.equals("matched")) {
                        b = 157;
                    }
                    break;
                case 920583602:
                    if (str.equals("USSToast")) {
                        b = 158;
                    }
                    break;
                case 949811637:
                    if (str.equals("fitReason")) {
                        b = 159;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = 160;
                    }
                    break;
                case 998520012:
                    if (str.equals("liveTitle")) {
                        b = 161;
                    }
                    break;
                case 1063997065:
                    if (str.equals("needReact")) {
                        b = 162;
                    }
                    break;
                case 1069376125:
                    if (str.equals("birthday")) {
                        b = 163;
                    }
                    break;
                case 1128985851:
                    if (str.equals("big_pic_url")) {
                        b = 164;
                    }
                    break;
                case 1149438702:
                    if (str.equals("countDownSeconds")) {
                        b = 165;
                    }
                    break;
                case 1180313231:
                    if (str.equals("rsStateReceiverToSender")) {
                        b = 166;
                    }
                    break;
                case 1188512486:
                    if (str.equals("buzzToken")) {
                        b = 167;
                    }
                    break;
                case 1268804088:
                    if (str.equals("rtcChannelWaitingTime")) {
                        b = 168;
                    }
                    break;
                case 1273907320:
                    if (str.equals("canShowNotification")) {
                        b = 169;
                    }
                    break;
                case 1276143946:
                    if (str.equals("channelNameV2")) {
                        b = 170;
                    }
                    break;
                case 1281421600:
                    if (str.equals("likedPopuserCount")) {
                        b = 171;
                    }
                    break;
                case 1390378002:
                    if (str.equals("extraPrivileges")) {
                        b = 172;
                    }
                    break;
                case 1417480367:
                    if (str.equals("liveMode")) {
                        b = 173;
                    }
                    break;
                case 1431659655:
                    if (str.equals("NewToast")) {
                        b = 174;
                    }
                    break;
                case 1452015270:
                    if (str.equals("queryOtherUserToken")) {
                        b = 175;
                    }
                    break;
                case 1496975708:
                    if (str.equals("questionIdSelected")) {
                        b = 176;
                    }
                    break;
                case 1528632631:
                    if (str.equals("voicePartnerFinderId")) {
                        b = 177;
                    }
                    break;
                case 1548639683:
                    if (str.equals("ruleKey")) {
                        b = 178;
                    }
                    break;
                case 1562089193:
                    if (str.equals("receiveUserID")) {
                        b = 179;
                    }
                    break;
                case 1585531689:
                    if (str.equals("creationData")) {
                        b = 180;
                    }
                    break;
                case 1624045630:
                    if (str.equals("merchandiseId")) {
                        b = 181;
                    }
                    break;
                case 1634590429:
                    if (str.equals("bellType")) {
                        b = 182;
                    }
                    break;
                case 1701176618:
                    if (str.equals("msgSingleUpdateIgnoreConvStatus")) {
                        b = 183;
                    }
                    break;
                case 1854953066:
                    if (str.equals("matchTopic")) {
                        b = 184;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        b = 185;
                    }
                    break;
                case 1967258300:
                    if (str.equals("callerDeviceId")) {
                        b = 186;
                    }
                    break;
                case 1970153557:
                    if (str.equals("USSBusiness")) {
                        b = 187;
                    }
                    break;
                case 2056917747:
                    if (str.equals("canUserStartLive")) {
                        b = PSSSigner.TRAILER_IMPLICIT;
                    }
                    break;
                case 2060024831:
                    if (str.equals("isGreet")) {
                        b = 189;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    pushMessageCustom.startDate = jsonParser.getValueAsString();
                    return true;
                case 1:
                    pushMessageCustom.subTitle = jsonParser.getValueAsString();
                    return true;
                case 2:
                    pushMessageCustom.popChange = jsonParser.getValueAsString();
                    return true;
                case 3:
                    pushMessageCustom.lastActiveTime = jsonParser.getValueAsLong();
                    return true;
                case 4:
                    pushMessageCustom.friendPurpose = jsonParser.getValueAsString();
                    return true;
                case 5:
                    pushMessageCustom.duration = jsonParser.getValueAsLong();
                    return true;
                case 6:
                    pushMessageCustom.totalDuration = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    pushMessageCustom.noRecommended = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    pushMessageCustom.resolutionWidth = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    pushMessageCustom.channelKey = jsonParser.getValueAsString();
                    return true;
                case 10:
                    pushMessageCustom.stateID = jsonParser.getValueAsString();
                    return true;
                case 11:
                    pushMessageCustom.USSInsert = jsonParser.getValueAsString();
                    return true;
                case 12:
                    pushMessageCustom.extTabId = jsonParser.getValueAsString();
                    return true;
                case 13:
                    pushMessageCustom.localNotificationCategory = jsonParser.getValueAsString();
                    return true;
                case 14:
                    pushMessageCustom.USSIds = jsonParser.getValueAsString();
                    return true;
                case 15:
                    pushMessageCustom.conversationId = jsonParser.getValueAsString();
                    return true;
                case 16:
                    pushMessageCustom.USSOption = jsonParser.getValueAsString();
                    return true;
                case 17:
                    pushMessageCustom.privileges = jsonParser.getValueAsString();
                    return true;
                case 18:
                    pushMessageCustom.prolongCount = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    pushMessageCustom.otherUserID = jsonParser.getValueAsString();
                    return true;
                case 20:
                    pushMessageCustom.otherUserId = jsonParser.getValueAsString();
                    return true;
                case 21:
                    pushMessageCustom.memojiDuration = jsonParser.getValueAsInt();
                    return true;
                case 22:
                    pushMessageCustom.endDate = jsonParser.getValueAsString();
                    return true;
                case 23:
                    pushMessageCustom.calleeTokenV2 = jsonParser.getValueAsString();
                    return true;
                case 24:
                    pushMessageCustom.quickchatType = jsonParser.getValueAsString();
                    return true;
                case 25:
                    pushMessageCustom.selectedQuestion = jsonParser.getValueAsString();
                    return true;
                case 26:
                    pushMessageCustom.productType = jsonParser.getValueAsString();
                    return true;
                case 27:
                    pushMessageCustom.USSVerify = jsonParser.getValueAsString();
                    return true;
                case 28:
                    pushMessageCustom.anchorCallId = jsonParser.getValueAsString();
                    return true;
                case 29:
                    pushMessageCustom.messageID = jsonParser.getValueAsString();
                    return true;
                case 30:
                    pushMessageCustom.action = jsonParser.getValueAsString();
                    return true;
                case 31:
                    pushMessageCustom.avatar = jsonParser.getValueAsString();
                    return true;
                case 32:
                    pushMessageCustom.isPassive = jsonParser.getValueAsBoolean();
                    return true;
                case 33:
                    pushMessageCustom.callee = jsonParser.getValueAsString();
                    return true;
                case 34:
                    pushMessageCustom.caller = jsonParser.getValueAsString();
                    return true;
                case 35:
                    pushMessageCustom.rtcChannel = jsonParser.getValueAsString();
                    return true;
                case 36:
                    pushMessageCustom.expire = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 37:
                    pushMessageCustom.gender = jsonParser.getValueAsString();
                    return true;
                case 38:
                    pushMessageCustom.giftId = jsonParser.getValueAsString();
                    return true;
                case 39:
                    pushMessageCustom.orderId = jsonParser.getValueAsString();
                    return true;
                case 40:
                    pushMessageCustom.inflow = jsonParser.getValueAsLong();
                    return true;
                case 41:
                    pushMessageCustom.intent = jsonParser.getValueAsString();
                    return true;
                case 42:
                    pushMessageCustom.itemId = jsonParser.getValueAsString();
                    return true;
                case 43:
                    pushMessageCustom.otherID = jsonParser.getValueAsString();
                    return true;
                case 44:
                    pushMessageCustom.recommendText = jsonParser.getValueAsString();
                    return true;
                case 45:
                    pushMessageCustom.topicId = jsonParser.getValueAsString();
                    return true;
                case 46:
                    pushMessageCustom.letter = jsonParser.getValueAsString();
                    return true;
                case 47:
                    pushMessageCustom.liveId = jsonParser.getValueAsString();
                    return true;
                case 48:
                    pushMessageCustom.otherUserName = jsonParser.getValueAsString();
                    return true;
                case 49:
                    pushMessageCustom.traceId = jsonParser.getValueAsString();
                    return true;
                case 50:
                    pushMessageCustom.tracker = jsonParser.getValueAsString();
                    return true;
                case 51:
                    pushMessageCustom.readUntilId = jsonParser.getValueAsString();
                    return true;
                case 52:
                    pushMessageCustom.origin = jsonParser.getValueAsString();
                    return true;
                case 53:
                    pushMessageCustom.provider = jsonParser.getValueAsString();
                    return true;
                case 54:
                    pushMessageCustom.triggeredUserId = jsonParser.getValueAsString();
                    return true;
                case 55:
                    pushMessageCustom.poolID = jsonParser.getValueAsString();
                    return true;
                case 56:
                    pushMessageCustom.anchorId = jsonParser.getValueAsString();
                    return true;
                case 57:
                    pushMessageCustom.radioType = jsonParser.getValueAsString();
                    return true;
                case 58:
                    pushMessageCustom.broadcastID = jsonParser.getValueAsString();
                    return true;
                case 59:
                    pushMessageCustom.honorGiftCardDetail = jsonParser.getValueAsString();
                    return true;
                case 60:
                    pushMessageCustom.popupsDisplay = jsonParser.getValueAsBoolean();
                    return true;
                case 61:
                    pushMessageCustom.localNotificationImportance = jsonParser.getValueAsString();
                    return true;
                case 62:
                    pushMessageCustom.roomId = jsonParser.getValueAsString();
                    return true;
                case 63:
                    pushMessageCustom.alertId = jsonParser.getValueAsString();
                    return true;
                case 64:
                    pushMessageCustom.schema = jsonParser.getValueAsString();
                    return true;
                case 65:
                    pushMessageCustom.source = jsonParser.getValueAsString();
                    return true;
                case 66:
                    pushMessageCustom.voiceStatus = jsonParser.getValueAsString();
                    return true;
                case 67:
                    pushMessageCustom.openingRemark = jsonParser.getValueAsString();
                    return true;
                case 68:
                    pushMessageCustom.taskId = jsonParser.getValueAsString();
                    return true;
                case 69:
                    pushMessageCustom.reaction = jsonParser.getValueAsString();
                    return true;
                case 70:
                    pushMessageCustom.unread = jsonParser.getValueAsString();
                    return true;
                case 71:
                    pushMessageCustom.userId = jsonParser.getValueAsString();
                    return true;
                case 72:
                    pushMessageCustom.vendor = jsonParser.getValueAsInt();
                    return true;
                case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                    pushMessageCustom.testGroupName = jsonParser.getValueAsString();
                    return true;
                case 74:
                    pushMessageCustom.fullScreen = jsonParser.getValueAsBoolean();
                    return true;
                case 75:
                    pushMessageCustom.partyId = jsonParser.getValueAsString();
                    return true;
                case 76:
                    pushMessageCustom.zodiac = jsonParser.getValueAsString();
                    return true;
                case 77:
                    pushMessageCustom.likedCount = jsonParser.getValueAsString();
                    return true;
                case 78:
                    pushMessageCustom.businessType = jsonParser.getValueAsString();
                    return true;
                case 79:
                    pushMessageCustom.avatars = jsonParser.getValueAsString();
                    return true;
                case 80:
                    pushMessageCustom.resolutionHeight = jsonParser.getValueAsInt();
                    return true;
                case EACTags.FILE_REFERENCE /* 81 */:
                    pushMessageCustom.bellShowStayTime = jsonParser.getValueAsInt();
                    return true;
                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                    pushMessageCustom.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case EACTags.DISCRETIONARY_DATA /* 83 */:
                    pushMessageCustom.callerTokenV2 = jsonParser.getValueAsString();
                    return true;
                case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                    pushMessageCustom.rtcToken = jsonParser.getValueAsString();
                    return true;
                case 85:
                    pushMessageCustom.mandatory = jsonParser.getValueAsBoolean();
                    return true;
                case EACTags.TRACK1_APPLICATION /* 86 */:
                    pushMessageCustom.subSource = jsonParser.getValueAsString();
                    return true;
                case 87:
                    pushMessageCustom.couponId = jsonParser.getValueAsString();
                    return true;
                case 88:
                    pushMessageCustom.zodiacFitPercent = jsonParser.getValueAsString();
                    return true;
                case 89:
                    pushMessageCustom.currencySymbol = jsonParser.getValueAsString();
                    return true;
                case 90:
                    pushMessageCustom.calleeDeviceId = jsonParser.getValueAsString();
                    return true;
                case EACTags.NAME /* 91 */:
                    pushMessageCustom.userName = jsonParser.getValueAsString();
                    return true;
                case EACTags.TAG_LIST /* 92 */:
                    pushMessageCustom.initialDuration = jsonParser.getValueAsInt();
                    return true;
                case EACTags.HEADER_LIST /* 93 */:
                    pushMessageCustom.insidePool = jsonParser.getValueAsBoolean();
                    return true;
                case EACTags.LOGIN_DATA /* 94 */:
                    pushMessageCustom.otherUsers = jsonParser.getValueAsString();
                    return true;
                case 95:
                    pushMessageCustom.queryToken = jsonParser.getValueAsString();
                    return true;
                case Opcodes.IADD /* 96 */:
                    pushMessageCustom.callback = jsonParser.getValueAsString();
                    return true;
                case EACTags.APPLICATION_TEMPLATE /* 97 */:
                    pushMessageCustom.channelToken = jsonParser.getValueAsString();
                    return true;
                case EACTags.FCP_TEMPLATE /* 98 */:
                    pushMessageCustom.extremePickShowId = jsonParser.getValueAsString();
                    return true;
                case 99:
                    pushMessageCustom.f38805id = jsonParser.getValueAsString();
                    return false;
                case 100:
                    pushMessageCustom.age = jsonParser.getValueAsString();
                    return true;
                case 101:
                    pushMessageCustom.biz = jsonParser.getValueAsString();
                    return true;
                case 102:
                    pushMessageCustom.ext = jsonParser.getValueAsString();
                    return true;
                case 103:
                    pushMessageCustom.gid = jsonParser.getValueAsString();
                    return true;
                case 104:
                    pushMessageCustom.url = jsonParser.getValueAsString();
                    return true;
                case 105:
                    pushMessageCustom.cell = jsonParser.getValueAsString();
                    return true;
                case 106:
                    pushMessageCustom.city = jsonParser.getValueAsString();
                    return true;
                case 107:
                    pushMessageCustom.link = jsonParser.getValueAsString();
                    return true;
                case 108:
                    pushMessageCustom.mode = jsonParser.getValueAsString();
                    return true;
                case 109:
                    pushMessageCustom.name = jsonParser.getValueAsString();
                    return true;
                case 110:
                    pushMessageCustom.tag1 = jsonParser.getValueAsString();
                    return true;
                case 111:
                    pushMessageCustom.tag2 = jsonParser.getValueAsString();
                    return true;
                case 112:
                    pushMessageCustom.tag3 = jsonParser.getValueAsString();
                    return true;
                case 113:
                    pushMessageCustom.text = jsonParser.getValueAsString();
                    return true;
                case 114:
                    pushMessageCustom.type = jsonParser.getValueAsString();
                    return true;
                case 115:
                    pushMessageCustom.eventName = jsonParser.getValueAsString();
                    return true;
                case 116:
                    pushMessageCustom.category = jsonParser.getValueAsString();
                    return true;
                case 117:
                    pushMessageCustom.bellNotShowStayTime = jsonParser.getValueAsInt();
                    return true;
                case 118:
                    pushMessageCustom.timestamp = jsonParser.getValueAsString();
                    return true;
                case 119:
                    pushMessageCustom.nickname = jsonParser.getValueAsString();
                    return true;
                case 120:
                    pushMessageCustom.added = jsonParser.getValueAsString();
                    return true;
                case 121:
                    pushMessageCustom.appId = jsonParser.getValueAsString();
                    return true;
                case 122:
                    pushMessageCustom.bgImg = jsonParser.getValueAsString();
                    return true;
                case 123:
                    pushMessageCustom.dates = jsonParser.getValueAsString();
                    return true;
                case 124:
                    pushMessageCustom.emoji = jsonParser.getValueAsString();
                    return true;
                case 125:
                    pushMessageCustom.extra = jsonParser.getValueAsString();
                    return true;
                case 126:
                    pushMessageCustom.image = jsonParser.getValueAsString();
                    return true;
                case 127:
                    pushMessageCustom.msgId = jsonParser.getValueAsString();
                    return true;
                case 128:
                    pushMessageCustom.price = jsonParser.getValueAsString();
                    return true;
                case MMConstants.ERR_WATERMARK_READ /* 129 */:
                    pushMessageCustom.scene = jsonParser.getValueAsString();
                    return true;
                case 130:
                    pushMessageCustom.score = jsonParser.getValueAsString();
                    return true;
                case 131:
                    pushMessageCustom.stage = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                    pushMessageCustom.state = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                    pushMessageCustom.tabId = jsonParser.getValueAsString();
                    return true;
                case 134:
                    pushMessageCustom.tagID = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                    pushMessageCustom.title = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                    pushMessageCustom.total = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                    pushMessageCustom.channelName = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                    pushMessageCustom.maskMode = jsonParser.getValueAsBoolean();
                    return true;
                case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                    pushMessageCustom.greetID = jsonParser.getValueAsString();
                    return true;
                case 140:
                    pushMessageCustom.distance = jsonParser.getValueAsLong();
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                    pushMessageCustom.groupId = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                    pushMessageCustom.calleeToken = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                    pushMessageCustom.buttonText = jsonParser.getValueAsString();
                    return true;
                case 144:
                    pushMessageCustom.avatarState = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                    pushMessageCustom.rtcProvider = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                    pushMessageCustom.userMatched = jsonParser.getValueAsBoolean();
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                    pushMessageCustom.pullStreamUrl = jsonParser.getValueAsString();
                    return true;
                case 148:
                    pushMessageCustom.videoChatId = jsonParser.getValueAsString();
                    return true;
                case 149:
                    pushMessageCustom.USSPage = jsonParser.getValueAsString();
                    return true;
                case 150:
                    pushMessageCustom.frozenDuration = jsonParser.getValueAsInt();
                    return true;
                case 151:
                    pushMessageCustom.videoPartnerFinderId = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                    pushMessageCustom.couponDesc = jsonParser.getValueAsString();
                    return true;
                case 153:
                    pushMessageCustom.contractId = jsonParser.getValueAsString();
                    return true;
                case 154:
                    pushMessageCustom.pushChannel = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                    pushMessageCustom.callerToken = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                    pushMessageCustom.channel = jsonParser.getValueAsString();
                    return true;
                case 157:
                    pushMessageCustom.matched = jsonParser.getValueAsBoolean();
                    return true;
                case 158:
                    pushMessageCustom.USSToast = jsonParser.getValueAsString();
                    return true;
                case 159:
                    pushMessageCustom.fitReason = jsonParser.getValueAsString();
                    return true;
                case 160:
                    pushMessageCustom.content = jsonParser.getValueAsString();
                    return true;
                case 161:
                    pushMessageCustom.liveTitle = jsonParser.getValueAsString();
                    return true;
                case 162:
                    pushMessageCustom.needReact = jsonParser.getValueAsBoolean();
                    return true;
                case 163:
                    pushMessageCustom.birthday = jsonParser.getValueAsLong();
                    return true;
                case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                    pushMessageCustom.big_pic_url = jsonParser.getValueAsString();
                    return true;
                case 165:
                    pushMessageCustom.countDownSeconds = jsonParser.getValueAsLong();
                    return true;
                case 166:
                    pushMessageCustom.rsStateReceiverToSender = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 167:
                    pushMessageCustom.buzzToken = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                    pushMessageCustom.rtcChannelWaitingTime = jsonParser.getValueAsLong();
                    return true;
                case 169:
                    pushMessageCustom.canShowNotification = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                    pushMessageCustom.channelNameV2 = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                    pushMessageCustom.likedPopuserCount = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                    pushMessageCustom.extraPrivileges = jsonParser.getValueAsInt();
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                    pushMessageCustom.liveMode = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                    pushMessageCustom.newToast = jsonParser.getValueAsBoolean();
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                    pushMessageCustom.queryOtherUserToken = jsonParser.getValueAsString();
                    return true;
                case 176:
                    pushMessageCustom.questionIdSelected = jsonParser.getValueAsString();
                    return true;
                case 177:
                    pushMessageCustom.voicePartnerFinderId = jsonParser.getValueAsString();
                    return true;
                case 178:
                    pushMessageCustom.ruleKey = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                    pushMessageCustom.receiveUserID = jsonParser.getValueAsString();
                    return true;
                case 180:
                    pushMessageCustom.creationData = jsonParser.getValueAsString();
                    return true;
                case 181:
                    pushMessageCustom.merchandiseId = jsonParser.getValueAsString();
                    return true;
                case 182:
                    pushMessageCustom.bellType = jsonParser.getValueAsString();
                    return true;
                case 183:
                    pushMessageCustom.msgSingleUpdateIgnoreConvStatus = jsonParser.getValueAsBoolean();
                    return true;
                case 184:
                    pushMessageCustom.matchTopic = jsonParser.getValueAsString();
                    return true;
                case 185:
                    pushMessageCustom.platform = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                    pushMessageCustom.callerDeviceId = jsonParser.getValueAsString();
                    return true;
                case 187:
                    pushMessageCustom.USSBusiness = jsonParser.getValueAsString();
                    return true;
                case 188:
                    pushMessageCustom.canUserStartLive = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                    pushMessageCustom.isGreet = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(PushMessageCustom pushMessageCustom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129778896:
                    if (str.equals(Message.START_DATE)) {
                        b = 0;
                    }
                    break;
                case -2090050568:
                    if (str.equals("subTitle")) {
                        b = 1;
                    }
                    break;
                case -2054622879:
                    if (str.equals("popChange")) {
                        b = 2;
                    }
                    break;
                case -2041905623:
                    if (str.equals("lastActiveTime")) {
                        b = 3;
                    }
                    break;
                case -2021065568:
                    if (str.equals(ProfileLikeCategoryType.friendPurpose)) {
                        b = 4;
                    }
                    break;
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 5;
                    }
                    break;
                case -1965553416:
                    if (str.equals("totalDuration")) {
                        b = 6;
                    }
                    break;
                case -1955461670:
                    if (str.equals("noRecommended")) {
                        b = 7;
                    }
                    break;
                case -1945743238:
                    if (str.equals("resolutionWidth")) {
                        b = 8;
                    }
                    break;
                case -1930828196:
                    if (str.equals("channelKey")) {
                        b = 9;
                    }
                    break;
                case -1897140884:
                    if (str.equals("stateID")) {
                        b = 10;
                    }
                    break;
                case -1842000754:
                    if (str.equals("USSInsert")) {
                        b = 11;
                    }
                    break;
                case -1836979729:
                    if (str.equals("extTabId")) {
                        b = 12;
                    }
                    break;
                case -1789542636:
                    if (str.equals("localNotificationCategory")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1782291197:
                    if (str.equals("USSIds")) {
                        b = 14;
                    }
                    break;
                case -1676095234:
                    if (str.equals("conversationId")) {
                        b = 15;
                    }
                    break;
                case -1668345270:
                    if (str.equals("USSOption")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1654399006:
                    if (str.equals("privileges")) {
                        b = 17;
                    }
                    break;
                case -1652668442:
                    if (str.equals("prolongCount")) {
                        b = 18;
                    }
                    break;
                case -1641345706:
                    if (str.equals("otherUserID")) {
                        b = 19;
                    }
                    break;
                case -1641345674:
                    if (str.equals("otherUserId")) {
                        b = 20;
                    }
                    break;
                case -1635359571:
                    if (str.equals("memojiDuration")) {
                        b = 21;
                    }
                    break;
                case -1607727319:
                    if (str.equals(Message.END_DATE)) {
                        b = 22;
                    }
                    break;
                case -1605267209:
                    if (str.equals("calleeTokenV2")) {
                        b = 23;
                    }
                    break;
                case -1534979169:
                    if (str.equals("quickchatType")) {
                        b = 24;
                    }
                    break;
                case -1497380959:
                    if (str.equals("selectedQuestion")) {
                        b = 25;
                    }
                    break;
                case -1491615543:
                    if (str.equals("productType")) {
                        b = 26;
                    }
                    break;
                case -1478159794:
                    if (str.equals("USSVerify")) {
                        b = 27;
                    }
                    break;
                case -1446021330:
                    if (str.equals("anchorCallId")) {
                        b = 28;
                    }
                    break;
                case -1440013470:
                    if (str.equals(Message.MESSAGE_ID)) {
                        b = 29;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 30;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 31;
                    }
                    break;
                case -1371818339:
                    if (str.equals("isPassive")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case -1367775362:
                    if (str.equals("callee")) {
                        b = 33;
                    }
                    break;
                case -1367775349:
                    if (str.equals(BLiveRole.caller)) {
                        b = 34;
                    }
                    break;
                case -1290855582:
                    if (str.equals("rtcChannel")) {
                        b = 35;
                    }
                    break;
                case -1289159393:
                    if (str.equals("expire")) {
                        b = 36;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 37;
                    }
                    break;
                case -1246042517:
                    if (str.equals("giftId")) {
                        b = 38;
                    }
                    break;
                case -1207110391:
                    if (str.equals("orderId")) {
                        b = 39;
                    }
                    break;
                case -1184173101:
                    if (str.equals("inflow")) {
                        b = 40;
                    }
                    break;
                case -1183762788:
                    if (str.equals("intent")) {
                        b = 41;
                    }
                    break;
                case -1178662002:
                    if (str.equals("itemId")) {
                        b = 42;
                    }
                    break;
                case -1146158037:
                    if (str.equals("otherID")) {
                        b = 43;
                    }
                    break;
                case -1141961719:
                    if (str.equals("recommendText")) {
                        b = 44;
                    }
                    break;
                case -1139259734:
                    if (str.equals("topicId")) {
                        b = 45;
                    }
                    break;
                case -1106172890:
                    if (str.equals("letter")) {
                        b = 46;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 47;
                    }
                    break;
                case -1080045530:
                    if (str.equals("otherUserName")) {
                        b = 48;
                    }
                    break;
                case -1067401920:
                    if (str.equals("traceId")) {
                        b = 49;
                    }
                    break;
                case -1067395272:
                    if (str.equals("tracker")) {
                        b = 50;
                    }
                    break;
                case -1016098141:
                    if (str.equals("readUntilId")) {
                        b = 51;
                    }
                    break;
                case -1008619738:
                    if (str.equals("origin")) {
                        b = 52;
                    }
                    break;
                case -987494927:
                    if (str.equals("provider")) {
                        b = 53;
                    }
                    break;
                case -986443395:
                    if (str.equals("triggeredUserId")) {
                        b = 54;
                    }
                    break;
                case -982578633:
                    if (str.equals("poolID")) {
                        b = 55;
                    }
                    break;
                case -971181392:
                    if (str.equals("anchorId")) {
                        b = 56;
                    }
                    break;
                case -970219051:
                    if (str.equals("radioType")) {
                        b = 57;
                    }
                    break;
                case -961886820:
                    if (str.equals("broadcastID")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case -952175653:
                    if (str.equals("honorGiftCardDetail")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case -940712581:
                    if (str.equals("popupsDisplay")) {
                        b = 60;
                    }
                    break;
                case -934433014:
                    if (str.equals("localNotificationImportance")) {
                        b = 61;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 62;
                    }
                    break;
                case -917722217:
                    if (str.equals("alertId")) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        b = 64;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 65;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 66;
                    }
                    break;
                case -881483016:
                    if (str.equals("openingRemark")) {
                        b = 67;
                    }
                    break;
                case -880873088:
                    if (str.equals("taskId")) {
                        b = 68;
                    }
                    break;
                case -867509719:
                    if (str.equals("reaction")) {
                        b = 69;
                    }
                    break;
                case -840272977:
                    if (str.equals(LimitTimePictureStatus.unread)) {
                        b = 70;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 71;
                    }
                    break;
                case -820075192:
                    if (str.equals("vendor")) {
                        b = 72;
                    }
                    break;
                case -813470408:
                    if (str.equals("testGroupName")) {
                        b = 73;
                    }
                    break;
                case -806066213:
                    if (str.equals(OMSMorphBaseStyle.fullScreen)) {
                        b = 74;
                    }
                    break;
                case -792919391:
                    if (str.equals("partyId")) {
                        b = 75;
                    }
                    break;
                case -696616932:
                    if (str.equals(ProfileLikeCategoryType.zodiac)) {
                        b = 76;
                    }
                    break;
                case -678862494:
                    if (str.equals("likedCount")) {
                        b = 77;
                    }
                    break;
                case -672734438:
                    if (str.equals("businessType")) {
                        b = 78;
                    }
                    break;
                case -635082182:
                    if (str.equals("avatars")) {
                        b = 79;
                    }
                    break;
                case -621493005:
                    if (str.equals("resolutionHeight")) {
                        b = 80;
                    }
                    break;
                case -602675322:
                    if (str.equals("bellShowStayTime")) {
                        b = 81;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 82;
                    }
                    break;
                case -423569334:
                    if (str.equals("callerTokenV2")) {
                        b = 83;
                    }
                    break;
                case -396598248:
                    if (str.equals("rtcToken")) {
                        b = 84;
                    }
                    break;
                case -392910375:
                    if (str.equals("mandatory")) {
                        b = 85;
                    }
                    break;
                case -390110597:
                    if (str.equals("subSource")) {
                        b = 86;
                    }
                    break;
                case -370315295:
                    if (str.equals("couponId")) {
                        b = 87;
                    }
                    break;
                case -340276176:
                    if (str.equals("zodiacFitPercent")) {
                        b = 88;
                    }
                    break;
                case -312458999:
                    if (str.equals("currencySymbol")) {
                        b = 89;
                    }
                    break;
                case -305637457:
                    if (str.equals("calleeDeviceId")) {
                        b = 90;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 91;
                    }
                    break;
                case -198802184:
                    if (str.equals("initialDuration")) {
                        b = 92;
                    }
                    break;
                case -193561032:
                    if (str.equals("insidePool")) {
                        b = 93;
                    }
                    break;
                case -191493928:
                    if (str.equals("otherUsers")) {
                        b = 94;
                    }
                    break;
                case -178459119:
                    if (str.equals("queryToken")) {
                        b = 95;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 96;
                    }
                    break;
                case -91425098:
                    if (str.equals("channelToken")) {
                        b = 97;
                    }
                    break;
                case -49804731:
                    if (str.equals("extremePickShowId")) {
                        b = 98;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 99;
                    }
                    break;
                case 96511:
                    if (str.equals(SeeTextDynamicParam.age)) {
                        b = 100;
                    }
                    break;
                case 97555:
                    if (str.equals("biz")) {
                        b = 101;
                    }
                    break;
                case 100897:
                    if (str.equals(BaseSei.EXT)) {
                        b = 102;
                    }
                    break;
                case 102338:
                    if (str.equals("gid")) {
                        b = 103;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 104;
                    }
                    break;
                case 3049826:
                    if (str.equals("cell")) {
                        b = 105;
                    }
                    break;
                case 3053931:
                    if (str.equals(RankLevel.city)) {
                        b = 106;
                    }
                    break;
                case 3321850:
                    if (str.equals(Link.TYPE)) {
                        b = 107;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        b = 108;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 109;
                    }
                    break;
                case 3552215:
                    if (str.equals("tag1")) {
                        b = 110;
                    }
                    break;
                case 3552216:
                    if (str.equals("tag2")) {
                        b = 111;
                    }
                    break;
                case 3552217:
                    if (str.equals("tag3")) {
                        b = 112;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        b = 113;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 114;
                    }
                    break;
                case 31228997:
                    if (str.equals("eventName")) {
                        b = 115;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 116;
                    }
                    break;
                case 53666259:
                    if (str.equals("bellNotShowStayTime")) {
                        b = 117;
                    }
                    break;
                case 55126294:
                    if (str.equals("timestamp")) {
                        b = 118;
                    }
                    break;
                case 70690926:
                    if (str.equals("nickname")) {
                        b = 119;
                    }
                    break;
                case 92659968:
                    if (str.equals("added")) {
                        b = 120;
                    }
                    break;
                case 93028124:
                    if (str.equals(RemoteConfigConstants.RequestFieldKey.APP_ID)) {
                        b = 121;
                    }
                    break;
                case 93647166:
                    if (str.equals("bgImg")) {
                        b = 122;
                    }
                    break;
                case 95356549:
                    if (str.equals("dates")) {
                        b = 123;
                    }
                    break;
                case 96632902:
                    if (str.equals("emoji")) {
                        b = 124;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = 125;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        b = 126;
                    }
                    break;
                case 104191100:
                    if (str.equals("msgId")) {
                        b = 127;
                    }
                    break;
                case 106934601:
                    if (str.equals(FirebaseAnalytics.Param.PRICE)) {
                        b = 128;
                    }
                    break;
                case 109254796:
                    if (str.equals("scene")) {
                        b = 129;
                    }
                    break;
                case 109264530:
                    if (str.equals(FirebaseAnalytics.Param.SCORE)) {
                        b = 130;
                    }
                    break;
                case 109757182:
                    if (str.equals("stage")) {
                        b = 131;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 132;
                    }
                    break;
                case 110114704:
                    if (str.equals("tabId")) {
                        b = 133;
                    }
                    break;
                case 110119477:
                    if (str.equals("tagID")) {
                        b = 134;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 135;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        b = 136;
                    }
                    break;
                case 273953326:
                    if (str.equals("channelName")) {
                        b = 137;
                    }
                    break;
                case 274882223:
                    if (str.equals("maskMode")) {
                        b = 138;
                    }
                    break;
                case 283720164:
                    if (str.equals("greetID")) {
                        b = 139;
                    }
                    break;
                case 288459765:
                    if (str.equals("distance")) {
                        b = 140;
                    }
                    break;
                case 293428218:
                    if (str.equals("groupId")) {
                        b = 141;
                    }
                    break;
                case 337994011:
                    if (str.equals("calleeToken")) {
                        b = 142;
                    }
                    break;
                case 358545279:
                    if (str.equals("buttonText")) {
                        b = 143;
                    }
                    break;
                case 386204344:
                    if (str.equals("avatarState")) {
                        b = 144;
                    }
                    break;
                case 513028978:
                    if (str.equals("rtcProvider")) {
                        b = 145;
                    }
                    break;
                case 538995417:
                    if (str.equals("userMatched")) {
                        b = 146;
                    }
                    break;
                case 563903754:
                    if (str.equals("pullStreamUrl")) {
                        b = 147;
                    }
                    break;
                case 573284078:
                    if (str.equals("videoChatId")) {
                        b = 148;
                    }
                    break;
                case 583753124:
                    if (str.equals("USSPage")) {
                        b = 149;
                    }
                    break;
                case 591078484:
                    if (str.equals("frozenDuration")) {
                        b = 150;
                    }
                    break;
                case 592168654:
                    if (str.equals("videoPartnerFinderId")) {
                        b = 151;
                    }
                    break;
                case 609142743:
                    if (str.equals("couponDesc")) {
                        b = 152;
                    }
                    break;
                case 624238029:
                    if (str.equals("contractId")) {
                        b = 153;
                    }
                    break;
                case 656086153:
                    if (str.equals("pushChannel")) {
                        b = 154;
                    }
                    break;
                case 710172974:
                    if (str.equals("callerToken")) {
                        b = 155;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        b = 156;
                    }
                    break;
                case 840861988:
                    if (str.equals("matched")) {
                        b = 157;
                    }
                    break;
                case 920583602:
                    if (str.equals("USSToast")) {
                        b = 158;
                    }
                    break;
                case 949811637:
                    if (str.equals("fitReason")) {
                        b = 159;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = 160;
                    }
                    break;
                case 998520012:
                    if (str.equals("liveTitle")) {
                        b = 161;
                    }
                    break;
                case 1063997065:
                    if (str.equals("needReact")) {
                        b = 162;
                    }
                    break;
                case 1069376125:
                    if (str.equals("birthday")) {
                        b = 163;
                    }
                    break;
                case 1128985851:
                    if (str.equals("big_pic_url")) {
                        b = 164;
                    }
                    break;
                case 1149438702:
                    if (str.equals("countDownSeconds")) {
                        b = 165;
                    }
                    break;
                case 1180313231:
                    if (str.equals("rsStateReceiverToSender")) {
                        b = 166;
                    }
                    break;
                case 1188512486:
                    if (str.equals("buzzToken")) {
                        b = 167;
                    }
                    break;
                case 1268804088:
                    if (str.equals("rtcChannelWaitingTime")) {
                        b = 168;
                    }
                    break;
                case 1273907320:
                    if (str.equals("canShowNotification")) {
                        b = 169;
                    }
                    break;
                case 1276143946:
                    if (str.equals("channelNameV2")) {
                        b = 170;
                    }
                    break;
                case 1281421600:
                    if (str.equals("likedPopuserCount")) {
                        b = 171;
                    }
                    break;
                case 1390378002:
                    if (str.equals("extraPrivileges")) {
                        b = 172;
                    }
                    break;
                case 1417480367:
                    if (str.equals("liveMode")) {
                        b = 173;
                    }
                    break;
                case 1431659655:
                    if (str.equals("NewToast")) {
                        b = 174;
                    }
                    break;
                case 1452015270:
                    if (str.equals("queryOtherUserToken")) {
                        b = 175;
                    }
                    break;
                case 1496975708:
                    if (str.equals("questionIdSelected")) {
                        b = 176;
                    }
                    break;
                case 1528632631:
                    if (str.equals("voicePartnerFinderId")) {
                        b = 177;
                    }
                    break;
                case 1548639683:
                    if (str.equals("ruleKey")) {
                        b = 178;
                    }
                    break;
                case 1562089193:
                    if (str.equals("receiveUserID")) {
                        b = 179;
                    }
                    break;
                case 1585531689:
                    if (str.equals("creationData")) {
                        b = 180;
                    }
                    break;
                case 1624045630:
                    if (str.equals("merchandiseId")) {
                        b = 181;
                    }
                    break;
                case 1634590429:
                    if (str.equals("bellType")) {
                        b = 182;
                    }
                    break;
                case 1701176618:
                    if (str.equals("msgSingleUpdateIgnoreConvStatus")) {
                        b = 183;
                    }
                    break;
                case 1854953066:
                    if (str.equals("matchTopic")) {
                        b = 184;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        b = 185;
                    }
                    break;
                case 1967258300:
                    if (str.equals("callerDeviceId")) {
                        b = 186;
                    }
                    break;
                case 1970153557:
                    if (str.equals("USSBusiness")) {
                        b = 187;
                    }
                    break;
                case 2056917747:
                    if (str.equals("canUserStartLive")) {
                        b = PSSSigner.TRAILER_IMPLICIT;
                    }
                    break;
                case 2060024831:
                    if (str.equals("isGreet")) {
                        b = 189;
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
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case EACTags.FILE_REFERENCE /* 81 */:
                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                case EACTags.DISCRETIONARY_DATA /* 83 */:
                case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                case 85:
                case EACTags.TRACK1_APPLICATION /* 86 */:
                case 87:
                case 88:
                case 89:
                case 90:
                case EACTags.NAME /* 91 */:
                case EACTags.TAG_LIST /* 92 */:
                case EACTags.HEADER_LIST /* 93 */:
                case EACTags.LOGIN_DATA /* 94 */:
                case 95:
                case Opcodes.IADD /* 96 */:
                case EACTags.APPLICATION_TEMPLATE /* 97 */:
                case EACTags.FCP_TEMPLATE /* 98 */:
                    return true;
                case 99:
                    return false;
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case MMConstants.ERR_WATERMARK_READ /* 129 */:
                case 130:
                case 131:
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                case 134:
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                case 140:
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                case 144:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                case 148:
                case 149:
                case 150:
                case 151:
                case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                case 153:
                case 154:
                case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                case 165:
                case 166:
                case 167:
                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                case 169:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                case 176:
                case 177:
                case 178:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                case 187:
                case 188:
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                    return true;
                default:
                    return super.parseFieldCheck(pushMessageCustom, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PushMessageCustom pushMessageCustom, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("expire");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(pushMessageCustom.expire), jsonGenerator, true);
            jsonGenerator.writeBooleanField(OMSMorphBaseStyle.fullScreen, pushMessageCustom.fullScreen);
            String str = pushMessageCustom.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            String str2 = pushMessageCustom.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = pushMessageCustom.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
            String str4 = pushMessageCustom.giftId;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftId", str4);
            }
            String str5 = pushMessageCustom.big_pic_url;
            if (str5 != null) {
                jsonGenerator.writeStringField("big_pic_url", str5);
            }
            String str6 = pushMessageCustom.age;
            if (str6 != null) {
                jsonGenerator.writeStringField(SeeTextDynamicParam.age, str6);
            }
            String str7 = pushMessageCustom.name;
            if (str7 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str7);
            }
            String str8 = pushMessageCustom.tag1;
            if (str8 != null) {
                jsonGenerator.writeStringField("tag1", str8);
            }
            String str9 = pushMessageCustom.tag2;
            if (str9 != null) {
                jsonGenerator.writeStringField("tag2", str9);
            }
            String str10 = pushMessageCustom.tag3;
            if (str10 != null) {
                jsonGenerator.writeStringField("tag3", str10);
            }
            String str11 = pushMessageCustom.liveId;
            if (str11 != null) {
                jsonGenerator.writeStringField("liveId", str11);
            }
            String str12 = pushMessageCustom.roomId;
            if (str12 != null) {
                jsonGenerator.writeStringField("roomId", str12);
            }
            String str13 = pushMessageCustom.nickname;
            if (str13 != null) {
                jsonGenerator.writeStringField("nickname", str13);
            }
            String str14 = pushMessageCustom.tabId;
            if (str14 != null) {
                jsonGenerator.writeStringField("tabId", str14);
            }
            String str15 = pushMessageCustom.extTabId;
            if (str15 != null) {
                jsonGenerator.writeStringField("extTabId", str15);
            }
            String str16 = pushMessageCustom.taskId;
            if (str16 != null) {
                jsonGenerator.writeStringField("taskId", str16);
            }
            String str17 = pushMessageCustom.dates;
            if (str17 != null) {
                jsonGenerator.writeStringField("dates", str17);
            }
            String str18 = pushMessageCustom.recommendText;
            if (str18 != null) {
                jsonGenerator.writeStringField("recommendText", str18);
            }
            String str19 = pushMessageCustom.buttonText;
            if (str19 != null) {
                jsonGenerator.writeStringField("buttonText", str19);
            }
            String str20 = pushMessageCustom.queryToken;
            if (str20 != null) {
                jsonGenerator.writeStringField("queryToken", str20);
            }
            String str21 = pushMessageCustom.otherUserID;
            if (str21 != null) {
                jsonGenerator.writeStringField("otherUserID", str21);
            }
            String str22 = pushMessageCustom.eventName;
            if (str22 != null) {
                jsonGenerator.writeStringField("eventName", str22);
            }
            jsonGenerator.writeBooleanField("userMatched", pushMessageCustom.userMatched);
            String str23 = pushMessageCustom.rtcToken;
            if (str23 != null) {
                jsonGenerator.writeStringField("rtcToken", str23);
            }
            String str24 = pushMessageCustom.rtcChannel;
            if (str24 != null) {
                jsonGenerator.writeStringField("rtcChannel", str24);
            }
            jsonGenerator.writeNumberField("rtcChannelWaitingTime", pushMessageCustom.rtcChannelWaitingTime);
            String str25 = pushMessageCustom.quickchatType;
            if (str25 != null) {
                jsonGenerator.writeStringField("quickchatType", str25);
            }
            String str26 = pushMessageCustom.queryOtherUserToken;
            if (str26 != null) {
                jsonGenerator.writeStringField("queryOtherUserToken", str26);
            }
            String str27 = pushMessageCustom.pullStreamUrl;
            if (str27 != null) {
                jsonGenerator.writeStringField("pullStreamUrl", str27);
            }
            String str28 = pushMessageCustom.provider;
            if (str28 != null) {
                jsonGenerator.writeStringField("provider", str28);
            }
            String str29 = pushMessageCustom.businessType;
            if (str29 != null) {
                jsonGenerator.writeStringField("businessType", str29);
            }
            String str30 = pushMessageCustom.callback;
            if (str30 != null) {
                jsonGenerator.writeStringField("callback", str30);
            }
            String str31 = pushMessageCustom.source;
            if (str31 != null) {
                jsonGenerator.writeStringField("source", str31);
            }
            String str32 = pushMessageCustom.subSource;
            if (str32 != null) {
                jsonGenerator.writeStringField("subSource", str32);
            }
            String str33 = pushMessageCustom.f38805id;
            if (str33 != null) {
                jsonGenerator.writeStringField("id", str33);
            }
            String str34 = pushMessageCustom.caller;
            if (str34 != null) {
                jsonGenerator.writeStringField(BLiveRole.caller, str34);
            }
            String str35 = pushMessageCustom.callee;
            if (str35 != null) {
                jsonGenerator.writeStringField("callee", str35);
            }
            String str36 = pushMessageCustom.callerDeviceId;
            if (str36 != null) {
                jsonGenerator.writeStringField("callerDeviceId", str36);
            }
            String str37 = pushMessageCustom.calleeDeviceId;
            if (str37 != null) {
                jsonGenerator.writeStringField("calleeDeviceId", str37);
            }
            String str38 = pushMessageCustom.voiceStatus;
            if (str38 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str38);
            }
            String str39 = pushMessageCustom.channelName;
            if (str39 != null) {
                jsonGenerator.writeStringField("channelName", str39);
            }
            String str40 = pushMessageCustom.callerToken;
            if (str40 != null) {
                jsonGenerator.writeStringField("callerToken", str40);
            }
            String str41 = pushMessageCustom.calleeToken;
            if (str41 != null) {
                jsonGenerator.writeStringField("calleeToken", str41);
            }
            jsonGenerator.writeFieldName("createdTime");
            jsonAdapter.serialize(Double.valueOf(pushMessageCustom.createdTime), jsonGenerator, true);
            Boolean bool = pushMessageCustom.canUserStartLive;
            if (bool != null) {
                jsonGenerator.writeBooleanField("canUserStartLive", bool.booleanValue());
            }
            jsonGenerator.writeNumberField("inflow", pushMessageCustom.inflow);
            String str42 = pushMessageCustom.origin;
            if (str42 != null) {
                jsonGenerator.writeStringField("origin", str42);
            }
            String str43 = pushMessageCustom.itemId;
            if (str43 != null) {
                jsonGenerator.writeStringField("itemId", str43);
            }
            String str44 = pushMessageCustom.orderId;
            if (str44 != null) {
                jsonGenerator.writeStringField("orderId", str44);
            }
            String str45 = pushMessageCustom.privileges;
            if (str45 != null) {
                jsonGenerator.writeStringField("privileges", str45);
            }
            String str46 = pushMessageCustom.matchTopic;
            if (str46 != null) {
                jsonGenerator.writeStringField("matchTopic", str46);
            }
            String str47 = pushMessageCustom.userId;
            if (str47 != null) {
                jsonGenerator.writeStringField("userId", str47);
            }
            String str48 = pushMessageCustom.readUntilId;
            if (str48 != null) {
                jsonGenerator.writeStringField("readUntilId", str48);
            }
            String str49 = pushMessageCustom.letter;
            if (str49 != null) {
                jsonGenerator.writeStringField("letter", str49);
            }
            String str50 = pushMessageCustom.openingRemark;
            if (str50 != null) {
                jsonGenerator.writeStringField("openingRemark", str50);
            }
            String str51 = pushMessageCustom.poolID;
            if (str51 != null) {
                jsonGenerator.writeStringField("poolID", str51);
            }
            jsonGenerator.writeNumberField("birthday", pushMessageCustom.birthday);
            String str52 = pushMessageCustom.productType;
            if (str52 != null) {
                jsonGenerator.writeStringField("productType", str52);
            }
            String str53 = pushMessageCustom.category;
            if (str53 != null) {
                jsonGenerator.writeStringField("category", str53);
            }
            String str54 = pushMessageCustom.currencySymbol;
            if (str54 != null) {
                jsonGenerator.writeStringField("currencySymbol", str54);
            }
            String str55 = pushMessageCustom.price;
            if (str55 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.PRICE, str55);
            }
            String str56 = pushMessageCustom.ext;
            if (str56 != null) {
                jsonGenerator.writeStringField(BaseSei.EXT, str56);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, pushMessageCustom.duration);
            String str57 = pushMessageCustom.likedCount;
            if (str57 != null) {
                jsonGenerator.writeStringField("likedCount", str57);
            }
            String str58 = pushMessageCustom.likedPopuserCount;
            if (str58 != null) {
                jsonGenerator.writeStringField("likedPopuserCount", str58);
            }
            String str59 = pushMessageCustom.popChange;
            if (str59 != null) {
                jsonGenerator.writeStringField("popChange", str59);
            }
            String str60 = pushMessageCustom.userName;
            if (str60 != null) {
                jsonGenerator.writeStringField("userName", str60);
            }
            String str61 = pushMessageCustom.title;
            if (str61 != null) {
                jsonGenerator.writeStringField("title", str61);
            }
            String str62 = pushMessageCustom.content;
            if (str62 != null) {
                jsonGenerator.writeStringField("content", str62);
            }
            String str63 = pushMessageCustom.image;
            if (str63 != null) {
                jsonGenerator.writeStringField("image", str63);
            }
            String str64 = pushMessageCustom.couponId;
            if (str64 != null) {
                jsonGenerator.writeStringField("couponId", str64);
            }
            String str65 = pushMessageCustom.couponDesc;
            if (str65 != null) {
                jsonGenerator.writeStringField("couponDesc", str65);
            }
            String str66 = pushMessageCustom.merchandiseId;
            if (str66 != null) {
                jsonGenerator.writeStringField("merchandiseId", str66);
            }
            String str67 = pushMessageCustom.platform;
            if (str67 != null) {
                jsonGenerator.writeStringField("platform", str67);
            }
            String str68 = pushMessageCustom.contractId;
            if (str68 != null) {
                jsonGenerator.writeStringField("contractId", str68);
            }
            String str69 = pushMessageCustom.broadcastID;
            if (str69 != null) {
                jsonGenerator.writeStringField("broadcastID", str69);
            }
            String str70 = pushMessageCustom.partyId;
            if (str70 != null) {
                jsonGenerator.writeStringField("partyId", str70);
            }
            String str71 = pushMessageCustom.score;
            if (str71 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.SCORE, str71);
            }
            String str72 = pushMessageCustom.link;
            if (str72 != null) {
                jsonGenerator.writeStringField(Link.TYPE, str72);
            }
            String str73 = pushMessageCustom.extra;
            if (str73 != null) {
                jsonGenerator.writeStringField("extra", str73);
            }
            String str74 = pushMessageCustom.traceId;
            if (str74 != null) {
                jsonGenerator.writeStringField("traceId", str74);
            }
            String str75 = pushMessageCustom.otherID;
            if (str75 != null) {
                jsonGenerator.writeStringField("otherID", str75);
            }
            String str76 = pushMessageCustom.messageID;
            if (str76 != null) {
                jsonGenerator.writeStringField(Message.MESSAGE_ID, str76);
            }
            jsonGenerator.writeBooleanField("isGreet", pushMessageCustom.isGreet);
            String str77 = pushMessageCustom.tracker;
            if (str77 != null) {
                jsonGenerator.writeStringField("tracker", str77);
            }
            jsonGenerator.writeNumberField("bellShowStayTime", pushMessageCustom.bellShowStayTime);
            jsonGenerator.writeNumberField("bellNotShowStayTime", pushMessageCustom.bellNotShowStayTime);
            String str78 = pushMessageCustom.voicePartnerFinderId;
            if (str78 != null) {
                jsonGenerator.writeStringField("voicePartnerFinderId", str78);
            }
            String str79 = pushMessageCustom.avatar;
            if (str79 != null) {
                jsonGenerator.writeStringField("avatar", str79);
            }
            String str80 = pushMessageCustom.city;
            if (str80 != null) {
                jsonGenerator.writeStringField(RankLevel.city, str80);
            }
            jsonGenerator.writeNumberField("distance", pushMessageCustom.distance);
            String str81 = pushMessageCustom.zodiac;
            if (str81 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.zodiac, str81);
            }
            jsonGenerator.writeNumberField("countDownSeconds", pushMessageCustom.countDownSeconds);
            String str82 = pushMessageCustom.topicId;
            if (str82 != null) {
                jsonGenerator.writeStringField("topicId", str82);
            }
            jsonGenerator.writeBooleanField("maskMode", pushMessageCustom.maskMode);
            String str83 = pushMessageCustom.receiveUserID;
            if (str83 != null) {
                jsonGenerator.writeStringField("receiveUserID", str83);
            }
            String str84 = pushMessageCustom.radioType;
            if (str84 != null) {
                jsonGenerator.writeStringField("radioType", str84);
            }
            if (pushMessageCustom.rsStateReceiverToSender != null) {
                jsonGenerator.writeFieldName("rsStateReceiverToSender");
                RelationshipStatus.JSON_ADAPTER.serialize(pushMessageCustom.rsStateReceiverToSender, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("mandatory", pushMessageCustom.mandatory);
            String str85 = pushMessageCustom.scene;
            if (str85 != null) {
                jsonGenerator.writeStringField("scene", str85);
            }
            String str86 = pushMessageCustom.greetID;
            if (str86 != null) {
                jsonGenerator.writeStringField("greetID", str86);
            }
            String str87 = pushMessageCustom.groupId;
            if (str87 != null) {
                jsonGenerator.writeStringField("groupId", str87);
            }
            String str88 = pushMessageCustom.videoPartnerFinderId;
            if (str88 != null) {
                jsonGenerator.writeStringField("videoPartnerFinderId", str88);
            }
            String str89 = pushMessageCustom.startDate;
            if (str89 != null) {
                jsonGenerator.writeStringField(Message.START_DATE, str89);
            }
            String str90 = pushMessageCustom.endDate;
            if (str90 != null) {
                jsonGenerator.writeStringField(Message.END_DATE, str90);
            }
            String str91 = pushMessageCustom.creationData;
            if (str91 != null) {
                jsonGenerator.writeStringField("creationData", str91);
            }
            String str92 = pushMessageCustom.stateID;
            if (str92 != null) {
                jsonGenerator.writeStringField("stateID", str92);
            }
            String str93 = pushMessageCustom.stage;
            if (str93 != null) {
                jsonGenerator.writeStringField("stage", str93);
            }
            String str94 = pushMessageCustom.biz;
            if (str94 != null) {
                jsonGenerator.writeStringField("biz", str94);
            }
            String str95 = pushMessageCustom.text;
            if (str95 != null) {
                jsonGenerator.writeStringField("text", str95);
            }
            String str96 = pushMessageCustom.otherUserId;
            if (str96 != null) {
                jsonGenerator.writeStringField("otherUserId", str96);
            }
            String str97 = pushMessageCustom.type;
            if (str97 != null) {
                jsonGenerator.writeStringField("type", str97);
            }
            jsonGenerator.writeNumberField("lastActiveTime", pushMessageCustom.lastActiveTime);
            String str98 = pushMessageCustom.otherUserName;
            if (str98 != null) {
                jsonGenerator.writeStringField("otherUserName", str98);
            }
            String str99 = pushMessageCustom.avatarState;
            if (str99 != null) {
                jsonGenerator.writeStringField("avatarState", str99);
            }
            String str100 = pushMessageCustom.subTitle;
            if (str100 != null) {
                jsonGenerator.writeStringField("subTitle", str100);
            }
            String str101 = pushMessageCustom.state;
            if (str101 != null) {
                jsonGenerator.writeStringField("state", str101);
            }
            String str102 = pushMessageCustom.conversationId;
            if (str102 != null) {
                jsonGenerator.writeStringField("conversationId", str102);
            }
            String str103 = pushMessageCustom.liveTitle;
            if (str103 != null) {
                jsonGenerator.writeStringField("liveTitle", str103);
            }
            String str104 = pushMessageCustom.anchorId;
            if (str104 != null) {
                jsonGenerator.writeStringField("anchorId", str104);
            }
            String str105 = pushMessageCustom.msgId;
            if (str105 != null) {
                jsonGenerator.writeStringField("msgId", str105);
            }
            String str106 = pushMessageCustom.schema;
            if (str106 != null) {
                jsonGenerator.writeStringField("schema", str106);
            }
            String str107 = pushMessageCustom.triggeredUserId;
            if (str107 != null) {
                jsonGenerator.writeStringField("triggeredUserId", str107);
            }
            jsonGenerator.writeBooleanField("noRecommended", pushMessageCustom.noRecommended);
            jsonGenerator.writeBooleanField("isPassive", pushMessageCustom.isPassive);
            String str108 = pushMessageCustom.USSInsert;
            if (str108 != null) {
                jsonGenerator.writeStringField("USSInsert", str108);
            }
            String str109 = pushMessageCustom.USSToast;
            if (str109 != null) {
                jsonGenerator.writeStringField("USSToast", str109);
            }
            String str110 = pushMessageCustom.USSPage;
            if (str110 != null) {
                jsonGenerator.writeStringField("USSPage", str110);
            }
            String str111 = pushMessageCustom.USSBusiness;
            if (str111 != null) {
                jsonGenerator.writeStringField("USSBusiness", str111);
            }
            String str112 = pushMessageCustom.USSIds;
            if (str112 != null) {
                jsonGenerator.writeStringField("USSIds", str112);
            }
            String str113 = pushMessageCustom.USSVerify;
            if (str113 != null) {
                jsonGenerator.writeStringField("USSVerify", str113);
            }
            String str114 = pushMessageCustom.USSOption;
            if (str114 != null) {
                jsonGenerator.writeStringField("USSOption", str114);
            }
            String str115 = pushMessageCustom.testGroupName;
            if (str115 != null) {
                jsonGenerator.writeStringField("testGroupName", str115);
            }
            String str116 = pushMessageCustom.avatars;
            if (str116 != null) {
                jsonGenerator.writeStringField("avatars", str116);
            }
            String str117 = pushMessageCustom.liveMode;
            if (str117 != null) {
                jsonGenerator.writeStringField("liveMode", str117);
            }
            String str118 = pushMessageCustom.channel;
            if (str118 != null) {
                jsonGenerator.writeStringField("channel", str118);
            }
            String str119 = pushMessageCustom.buzzToken;
            if (str119 != null) {
                jsonGenerator.writeStringField("buzzToken", str119);
            }
            jsonGenerator.writeNumberField("extraPrivileges", pushMessageCustom.extraPrivileges);
            jsonGenerator.writeBooleanField("popupsDisplay", pushMessageCustom.popupsDisplay);
            jsonGenerator.writeNumberField("initialDuration", pushMessageCustom.initialDuration);
            jsonGenerator.writeNumberField("prolongCount", pushMessageCustom.prolongCount);
            String str120 = pushMessageCustom.appId;
            if (str120 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_ID, str120);
            }
            jsonGenerator.writeNumberField("vendor", pushMessageCustom.vendor);
            String str121 = pushMessageCustom.channelToken;
            if (str121 != null) {
                jsonGenerator.writeStringField("channelToken", str121);
            }
            String str122 = pushMessageCustom.channelKey;
            if (str122 != null) {
                jsonGenerator.writeStringField("channelKey", str122);
            }
            jsonGenerator.writeNumberField("totalDuration", pushMessageCustom.totalDuration);
            jsonGenerator.writeNumberField("frozenDuration", pushMessageCustom.frozenDuration);
            String str123 = pushMessageCustom.bellType;
            if (str123 != null) {
                jsonGenerator.writeStringField("bellType", str123);
            }
            jsonGenerator.writeNumberField("resolutionHeight", pushMessageCustom.resolutionHeight);
            jsonGenerator.writeNumberField("resolutionWidth", pushMessageCustom.resolutionWidth);
            String str124 = pushMessageCustom.cell;
            if (str124 != null) {
                jsonGenerator.writeStringField("cell", str124);
            }
            String str125 = pushMessageCustom.questionIdSelected;
            if (str125 != null) {
                jsonGenerator.writeStringField("questionIdSelected", str125);
            }
            jsonGenerator.writeBooleanField("insidePool", pushMessageCustom.insidePool);
            String str126 = pushMessageCustom.mode;
            if (str126 != null) {
                jsonGenerator.writeStringField("mode", str126);
            }
            String str127 = pushMessageCustom.gid;
            if (str127 != null) {
                jsonGenerator.writeStringField("gid", str127);
            }
            String str128 = pushMessageCustom.intent;
            if (str128 != null) {
                jsonGenerator.writeStringField("intent", str128);
            }
            String str129 = pushMessageCustom.ruleKey;
            if (str129 != null) {
                jsonGenerator.writeStringField("ruleKey", str129);
            }
            String str130 = pushMessageCustom.selectedQuestion;
            if (str130 != null) {
                jsonGenerator.writeStringField("selectedQuestion", str130);
            }
            String str131 = pushMessageCustom.timestamp;
            if (str131 != null) {
                jsonGenerator.writeStringField("timestamp", str131);
            }
            jsonGenerator.writeBooleanField("needReact", pushMessageCustom.needReact);
            String str132 = pushMessageCustom.reaction;
            if (str132 != null) {
                jsonGenerator.writeStringField("reaction", str132);
            }
            String str133 = pushMessageCustom.alertId;
            if (str133 != null) {
                jsonGenerator.writeStringField("alertId", str133);
            }
            String str134 = pushMessageCustom.otherUsers;
            if (str134 != null) {
                jsonGenerator.writeStringField("otherUsers", str134);
            }
            jsonGenerator.writeNumberField("memojiDuration", pushMessageCustom.memojiDuration);
            jsonGenerator.writeBooleanField("NewToast", pushMessageCustom.newToast);
            String str135 = pushMessageCustom.bgImg;
            if (str135 != null) {
                jsonGenerator.writeStringField("bgImg", str135);
            }
            String str136 = pushMessageCustom.pushChannel;
            if (str136 != null) {
                jsonGenerator.writeStringField("pushChannel", str136);
            }
            String str137 = pushMessageCustom.extremePickShowId;
            if (str137 != null) {
                jsonGenerator.writeStringField("extremePickShowId", str137);
            }
            String str138 = pushMessageCustom.added;
            if (str138 != null) {
                jsonGenerator.writeStringField("added", str138);
            }
            String str139 = pushMessageCustom.unread;
            if (str139 != null) {
                jsonGenerator.writeStringField(LimitTimePictureStatus.unread, str139);
            }
            String str140 = pushMessageCustom.total;
            if (str140 != null) {
                jsonGenerator.writeStringField("total", str140);
            }
            jsonGenerator.writeBooleanField("matched", pushMessageCustom.matched);
            String str141 = pushMessageCustom.honorGiftCardDetail;
            if (str141 != null) {
                jsonGenerator.writeStringField("honorGiftCardDetail", str141);
            }
            Boolean bool2 = pushMessageCustom.canShowNotification;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("canShowNotification", bool2.booleanValue());
            }
            String str142 = pushMessageCustom.localNotificationCategory;
            if (str142 != null) {
                jsonGenerator.writeStringField("localNotificationCategory", str142);
            }
            String str143 = pushMessageCustom.localNotificationImportance;
            if (str143 != null) {
                jsonGenerator.writeStringField("localNotificationImportance", str143);
            }
            String str144 = pushMessageCustom.anchorCallId;
            if (str144 != null) {
                jsonGenerator.writeStringField("anchorCallId", str144);
            }
            String str145 = pushMessageCustom.channelNameV2;
            if (str145 != null) {
                jsonGenerator.writeStringField("channelNameV2", str145);
            }
            String str146 = pushMessageCustom.callerTokenV2;
            if (str146 != null) {
                jsonGenerator.writeStringField("callerTokenV2", str146);
            }
            String str147 = pushMessageCustom.calleeTokenV2;
            if (str147 != null) {
                jsonGenerator.writeStringField("calleeTokenV2", str147);
            }
            String str148 = pushMessageCustom.rtcProvider;
            if (str148 != null) {
                jsonGenerator.writeStringField("rtcProvider", str148);
            }
            String str149 = pushMessageCustom.videoChatId;
            if (str149 != null) {
                jsonGenerator.writeStringField("videoChatId", str149);
            }
            String str150 = pushMessageCustom.fitReason;
            if (str150 != null) {
                jsonGenerator.writeStringField("fitReason", str150);
            }
            String str151 = pushMessageCustom.friendPurpose;
            if (str151 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.friendPurpose, str151);
            }
            String str152 = pushMessageCustom.zodiacFitPercent;
            if (str152 != null) {
                jsonGenerator.writeStringField("zodiacFitPercent", str152);
            }
            String str153 = pushMessageCustom.tagID;
            if (str153 != null) {
                jsonGenerator.writeStringField("tagID", str153);
            }
            jsonGenerator.writeBooleanField("msgSingleUpdateIgnoreConvStatus", pushMessageCustom.msgSingleUpdateIgnoreConvStatus);
            String str154 = pushMessageCustom.emoji;
            if (str154 != null) {
                jsonGenerator.writeStringField("emoji", str154);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushMessageCustom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushMessageCustom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushMessageCustom new_() {
        PushMessageCustom pushMessageCustom = new PushMessageCustom();
        pushMessageCustom.nullCheck();
        return pushMessageCustom;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PushMessageCustom mo223809clone() {
        PushMessageCustom pushMessageCustom = new PushMessageCustom();
        pushMessageCustom.expire = this.expire;
        pushMessageCustom.fullScreen = this.fullScreen;
        pushMessageCustom.action = this.action;
        pushMessageCustom.url = this.url;
        pushMessageCustom.gender = this.gender;
        pushMessageCustom.giftId = this.giftId;
        pushMessageCustom.big_pic_url = this.big_pic_url;
        pushMessageCustom.age = this.age;
        pushMessageCustom.name = this.name;
        pushMessageCustom.tag1 = this.tag1;
        pushMessageCustom.tag2 = this.tag2;
        pushMessageCustom.tag3 = this.tag3;
        pushMessageCustom.liveId = this.liveId;
        pushMessageCustom.roomId = this.roomId;
        pushMessageCustom.nickname = this.nickname;
        pushMessageCustom.tabId = this.tabId;
        pushMessageCustom.extTabId = this.extTabId;
        pushMessageCustom.taskId = this.taskId;
        pushMessageCustom.dates = this.dates;
        pushMessageCustom.recommendText = this.recommendText;
        pushMessageCustom.buttonText = this.buttonText;
        pushMessageCustom.queryToken = this.queryToken;
        pushMessageCustom.otherUserID = this.otherUserID;
        pushMessageCustom.eventName = this.eventName;
        pushMessageCustom.userMatched = this.userMatched;
        pushMessageCustom.rtcToken = this.rtcToken;
        pushMessageCustom.rtcChannel = this.rtcChannel;
        pushMessageCustom.rtcChannelWaitingTime = this.rtcChannelWaitingTime;
        pushMessageCustom.quickchatType = this.quickchatType;
        pushMessageCustom.queryOtherUserToken = this.queryOtherUserToken;
        pushMessageCustom.pullStreamUrl = this.pullStreamUrl;
        pushMessageCustom.provider = this.provider;
        pushMessageCustom.businessType = this.businessType;
        pushMessageCustom.callback = this.callback;
        pushMessageCustom.source = this.source;
        pushMessageCustom.subSource = this.subSource;
        pushMessageCustom.f38805id = this.f38805id;
        pushMessageCustom.caller = this.caller;
        pushMessageCustom.callee = this.callee;
        pushMessageCustom.callerDeviceId = this.callerDeviceId;
        pushMessageCustom.calleeDeviceId = this.calleeDeviceId;
        pushMessageCustom.voiceStatus = this.voiceStatus;
        pushMessageCustom.channelName = this.channelName;
        pushMessageCustom.callerToken = this.callerToken;
        pushMessageCustom.calleeToken = this.calleeToken;
        pushMessageCustom.createdTime = this.createdTime;
        pushMessageCustom.canUserStartLive = this.canUserStartLive;
        pushMessageCustom.inflow = this.inflow;
        pushMessageCustom.origin = this.origin;
        pushMessageCustom.itemId = this.itemId;
        pushMessageCustom.orderId = this.orderId;
        pushMessageCustom.privileges = this.privileges;
        pushMessageCustom.matchTopic = this.matchTopic;
        pushMessageCustom.userId = this.userId;
        pushMessageCustom.readUntilId = this.readUntilId;
        pushMessageCustom.letter = this.letter;
        pushMessageCustom.openingRemark = this.openingRemark;
        pushMessageCustom.poolID = this.poolID;
        pushMessageCustom.birthday = this.birthday;
        pushMessageCustom.productType = this.productType;
        pushMessageCustom.category = this.category;
        pushMessageCustom.currencySymbol = this.currencySymbol;
        pushMessageCustom.price = this.price;
        pushMessageCustom.ext = this.ext;
        pushMessageCustom.duration = this.duration;
        pushMessageCustom.likedCount = this.likedCount;
        pushMessageCustom.likedPopuserCount = this.likedPopuserCount;
        pushMessageCustom.popChange = this.popChange;
        pushMessageCustom.userName = this.userName;
        pushMessageCustom.title = this.title;
        pushMessageCustom.content = this.content;
        pushMessageCustom.image = this.image;
        pushMessageCustom.couponId = this.couponId;
        pushMessageCustom.couponDesc = this.couponDesc;
        pushMessageCustom.merchandiseId = this.merchandiseId;
        pushMessageCustom.platform = this.platform;
        pushMessageCustom.contractId = this.contractId;
        pushMessageCustom.broadcastID = this.broadcastID;
        pushMessageCustom.partyId = this.partyId;
        pushMessageCustom.score = this.score;
        pushMessageCustom.link = this.link;
        pushMessageCustom.extra = this.extra;
        pushMessageCustom.traceId = this.traceId;
        pushMessageCustom.otherID = this.otherID;
        pushMessageCustom.messageID = this.messageID;
        pushMessageCustom.isGreet = this.isGreet;
        pushMessageCustom.tracker = this.tracker;
        pushMessageCustom.bellShowStayTime = this.bellShowStayTime;
        pushMessageCustom.bellNotShowStayTime = this.bellNotShowStayTime;
        pushMessageCustom.voicePartnerFinderId = this.voicePartnerFinderId;
        pushMessageCustom.avatar = this.avatar;
        pushMessageCustom.city = this.city;
        pushMessageCustom.distance = this.distance;
        pushMessageCustom.zodiac = this.zodiac;
        pushMessageCustom.countDownSeconds = this.countDownSeconds;
        pushMessageCustom.topicId = this.topicId;
        pushMessageCustom.maskMode = this.maskMode;
        pushMessageCustom.receiveUserID = this.receiveUserID;
        pushMessageCustom.radioType = this.radioType;
        pushMessageCustom.rsStateReceiverToSender = this.rsStateReceiverToSender;
        pushMessageCustom.mandatory = this.mandatory;
        pushMessageCustom.scene = this.scene;
        pushMessageCustom.greetID = this.greetID;
        pushMessageCustom.groupId = this.groupId;
        pushMessageCustom.videoPartnerFinderId = this.videoPartnerFinderId;
        pushMessageCustom.startDate = this.startDate;
        pushMessageCustom.endDate = this.endDate;
        pushMessageCustom.creationData = this.creationData;
        pushMessageCustom.stateID = this.stateID;
        pushMessageCustom.stage = this.stage;
        pushMessageCustom.biz = this.biz;
        pushMessageCustom.text = this.text;
        pushMessageCustom.otherUserId = this.otherUserId;
        pushMessageCustom.type = this.type;
        pushMessageCustom.lastActiveTime = this.lastActiveTime;
        pushMessageCustom.otherUserName = this.otherUserName;
        pushMessageCustom.avatarState = this.avatarState;
        pushMessageCustom.subTitle = this.subTitle;
        pushMessageCustom.state = this.state;
        pushMessageCustom.conversationId = this.conversationId;
        pushMessageCustom.liveTitle = this.liveTitle;
        pushMessageCustom.anchorId = this.anchorId;
        pushMessageCustom.msgId = this.msgId;
        pushMessageCustom.schema = this.schema;
        pushMessageCustom.triggeredUserId = this.triggeredUserId;
        pushMessageCustom.noRecommended = this.noRecommended;
        pushMessageCustom.isPassive = this.isPassive;
        pushMessageCustom.USSInsert = this.USSInsert;
        pushMessageCustom.USSToast = this.USSToast;
        pushMessageCustom.USSPage = this.USSPage;
        pushMessageCustom.USSBusiness = this.USSBusiness;
        pushMessageCustom.USSIds = this.USSIds;
        pushMessageCustom.USSVerify = this.USSVerify;
        pushMessageCustom.USSOption = this.USSOption;
        pushMessageCustom.testGroupName = this.testGroupName;
        pushMessageCustom.avatars = this.avatars;
        pushMessageCustom.liveMode = this.liveMode;
        pushMessageCustom.channel = this.channel;
        pushMessageCustom.buzzToken = this.buzzToken;
        pushMessageCustom.extraPrivileges = this.extraPrivileges;
        pushMessageCustom.popupsDisplay = this.popupsDisplay;
        pushMessageCustom.initialDuration = this.initialDuration;
        pushMessageCustom.prolongCount = this.prolongCount;
        pushMessageCustom.appId = this.appId;
        pushMessageCustom.vendor = this.vendor;
        pushMessageCustom.channelToken = this.channelToken;
        pushMessageCustom.channelKey = this.channelKey;
        pushMessageCustom.totalDuration = this.totalDuration;
        pushMessageCustom.frozenDuration = this.frozenDuration;
        pushMessageCustom.bellType = this.bellType;
        pushMessageCustom.resolutionHeight = this.resolutionHeight;
        pushMessageCustom.resolutionWidth = this.resolutionWidth;
        pushMessageCustom.cell = this.cell;
        pushMessageCustom.questionIdSelected = this.questionIdSelected;
        pushMessageCustom.insidePool = this.insidePool;
        pushMessageCustom.mode = this.mode;
        pushMessageCustom.gid = this.gid;
        pushMessageCustom.intent = this.intent;
        pushMessageCustom.ruleKey = this.ruleKey;
        pushMessageCustom.selectedQuestion = this.selectedQuestion;
        pushMessageCustom.timestamp = this.timestamp;
        pushMessageCustom.needReact = this.needReact;
        pushMessageCustom.reaction = this.reaction;
        pushMessageCustom.alertId = this.alertId;
        pushMessageCustom.otherUsers = this.otherUsers;
        pushMessageCustom.memojiDuration = this.memojiDuration;
        pushMessageCustom.newToast = this.newToast;
        pushMessageCustom.bgImg = this.bgImg;
        pushMessageCustom.pushChannel = this.pushChannel;
        pushMessageCustom.extremePickShowId = this.extremePickShowId;
        pushMessageCustom.added = this.added;
        pushMessageCustom.unread = this.unread;
        pushMessageCustom.total = this.total;
        pushMessageCustom.matched = this.matched;
        pushMessageCustom.honorGiftCardDetail = this.honorGiftCardDetail;
        pushMessageCustom.canShowNotification = this.canShowNotification;
        pushMessageCustom.localNotificationCategory = this.localNotificationCategory;
        pushMessageCustom.localNotificationImportance = this.localNotificationImportance;
        pushMessageCustom.anchorCallId = this.anchorCallId;
        pushMessageCustom.channelNameV2 = this.channelNameV2;
        pushMessageCustom.callerTokenV2 = this.callerTokenV2;
        pushMessageCustom.calleeTokenV2 = this.calleeTokenV2;
        pushMessageCustom.rtcProvider = this.rtcProvider;
        pushMessageCustom.videoChatId = this.videoChatId;
        pushMessageCustom.fitReason = this.fitReason;
        pushMessageCustom.friendPurpose = this.friendPurpose;
        pushMessageCustom.zodiacFitPercent = this.zodiacFitPercent;
        pushMessageCustom.tagID = this.tagID;
        pushMessageCustom.msgSingleUpdateIgnoreConvStatus = this.msgSingleUpdateIgnoreConvStatus;
        pushMessageCustom.emoji = this.emoji;
        return pushMessageCustom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushMessageCustom)) {
            return false;
        }
        PushMessageCustom pushMessageCustom = (PushMessageCustom) obj;
        return this.expire == pushMessageCustom.expire && this.fullScreen == pushMessageCustom.fullScreen && ValueObject.util_equals(this.action, pushMessageCustom.action) && ValueObject.util_equals(this.url, pushMessageCustom.url) && ValueObject.util_equals(this.gender, pushMessageCustom.gender) && ValueObject.util_equals(this.giftId, pushMessageCustom.giftId) && ValueObject.util_equals(this.big_pic_url, pushMessageCustom.big_pic_url) && ValueObject.util_equals(this.age, pushMessageCustom.age) && ValueObject.util_equals(this.name, pushMessageCustom.name) && ValueObject.util_equals(this.tag1, pushMessageCustom.tag1) && ValueObject.util_equals(this.tag2, pushMessageCustom.tag2) && ValueObject.util_equals(this.tag3, pushMessageCustom.tag3) && ValueObject.util_equals(this.liveId, pushMessageCustom.liveId) && ValueObject.util_equals(this.roomId, pushMessageCustom.roomId) && ValueObject.util_equals(this.nickname, pushMessageCustom.nickname) && ValueObject.util_equals(this.tabId, pushMessageCustom.tabId) && ValueObject.util_equals(this.extTabId, pushMessageCustom.extTabId) && ValueObject.util_equals(this.taskId, pushMessageCustom.taskId) && ValueObject.util_equals(this.dates, pushMessageCustom.dates) && ValueObject.util_equals(this.recommendText, pushMessageCustom.recommendText) && ValueObject.util_equals(this.buttonText, pushMessageCustom.buttonText) && ValueObject.util_equals(this.queryToken, pushMessageCustom.queryToken) && ValueObject.util_equals(this.otherUserID, pushMessageCustom.otherUserID) && ValueObject.util_equals(this.eventName, pushMessageCustom.eventName) && this.userMatched == pushMessageCustom.userMatched && ValueObject.util_equals(this.rtcToken, pushMessageCustom.rtcToken) && ValueObject.util_equals(this.rtcChannel, pushMessageCustom.rtcChannel) && this.rtcChannelWaitingTime == pushMessageCustom.rtcChannelWaitingTime && ValueObject.util_equals(this.quickchatType, pushMessageCustom.quickchatType) && ValueObject.util_equals(this.queryOtherUserToken, pushMessageCustom.queryOtherUserToken) && ValueObject.util_equals(this.pullStreamUrl, pushMessageCustom.pullStreamUrl) && ValueObject.util_equals(this.provider, pushMessageCustom.provider) && ValueObject.util_equals(this.businessType, pushMessageCustom.businessType) && ValueObject.util_equals(this.callback, pushMessageCustom.callback) && ValueObject.util_equals(this.source, pushMessageCustom.source) && ValueObject.util_equals(this.subSource, pushMessageCustom.subSource) && ValueObject.util_equals(this.f38805id, pushMessageCustom.f38805id) && ValueObject.util_equals(this.caller, pushMessageCustom.caller) && ValueObject.util_equals(this.callee, pushMessageCustom.callee) && ValueObject.util_equals(this.callerDeviceId, pushMessageCustom.callerDeviceId) && ValueObject.util_equals(this.calleeDeviceId, pushMessageCustom.calleeDeviceId) && ValueObject.util_equals(this.voiceStatus, pushMessageCustom.voiceStatus) && ValueObject.util_equals(this.channelName, pushMessageCustom.channelName) && ValueObject.util_equals(this.callerToken, pushMessageCustom.callerToken) && ValueObject.util_equals(this.calleeToken, pushMessageCustom.calleeToken) && this.createdTime == pushMessageCustom.createdTime && ValueObject.util_equals(this.canUserStartLive, pushMessageCustom.canUserStartLive) && this.inflow == pushMessageCustom.inflow && ValueObject.util_equals(this.origin, pushMessageCustom.origin) && ValueObject.util_equals(this.itemId, pushMessageCustom.itemId) && ValueObject.util_equals(this.orderId, pushMessageCustom.orderId) && ValueObject.util_equals(this.privileges, pushMessageCustom.privileges) && ValueObject.util_equals(this.matchTopic, pushMessageCustom.matchTopic) && ValueObject.util_equals(this.userId, pushMessageCustom.userId) && ValueObject.util_equals(this.readUntilId, pushMessageCustom.readUntilId) && ValueObject.util_equals(this.letter, pushMessageCustom.letter) && ValueObject.util_equals(this.openingRemark, pushMessageCustom.openingRemark) && ValueObject.util_equals(this.poolID, pushMessageCustom.poolID) && this.birthday == pushMessageCustom.birthday && ValueObject.util_equals(this.productType, pushMessageCustom.productType) && ValueObject.util_equals(this.category, pushMessageCustom.category) && ValueObject.util_equals(this.currencySymbol, pushMessageCustom.currencySymbol) && ValueObject.util_equals(this.price, pushMessageCustom.price) && ValueObject.util_equals(this.ext, pushMessageCustom.ext) && this.duration == pushMessageCustom.duration && ValueObject.util_equals(this.likedCount, pushMessageCustom.likedCount) && ValueObject.util_equals(this.likedPopuserCount, pushMessageCustom.likedPopuserCount) && ValueObject.util_equals(this.popChange, pushMessageCustom.popChange) && ValueObject.util_equals(this.userName, pushMessageCustom.userName) && ValueObject.util_equals(this.title, pushMessageCustom.title) && ValueObject.util_equals(this.content, pushMessageCustom.content) && ValueObject.util_equals(this.image, pushMessageCustom.image) && ValueObject.util_equals(this.couponId, pushMessageCustom.couponId) && ValueObject.util_equals(this.couponDesc, pushMessageCustom.couponDesc) && ValueObject.util_equals(this.merchandiseId, pushMessageCustom.merchandiseId) && ValueObject.util_equals(this.platform, pushMessageCustom.platform) && ValueObject.util_equals(this.contractId, pushMessageCustom.contractId) && ValueObject.util_equals(this.broadcastID, pushMessageCustom.broadcastID) && ValueObject.util_equals(this.partyId, pushMessageCustom.partyId) && ValueObject.util_equals(this.score, pushMessageCustom.score) && ValueObject.util_equals(this.link, pushMessageCustom.link) && ValueObject.util_equals(this.extra, pushMessageCustom.extra) && ValueObject.util_equals(this.traceId, pushMessageCustom.traceId) && ValueObject.util_equals(this.otherID, pushMessageCustom.otherID) && ValueObject.util_equals(this.messageID, pushMessageCustom.messageID) && this.isGreet == pushMessageCustom.isGreet && ValueObject.util_equals(this.tracker, pushMessageCustom.tracker) && this.bellShowStayTime == pushMessageCustom.bellShowStayTime && this.bellNotShowStayTime == pushMessageCustom.bellNotShowStayTime && ValueObject.util_equals(this.voicePartnerFinderId, pushMessageCustom.voicePartnerFinderId) && ValueObject.util_equals(this.avatar, pushMessageCustom.avatar) && ValueObject.util_equals(this.city, pushMessageCustom.city) && this.distance == pushMessageCustom.distance && ValueObject.util_equals(this.zodiac, pushMessageCustom.zodiac) && this.countDownSeconds == pushMessageCustom.countDownSeconds && ValueObject.util_equals(this.topicId, pushMessageCustom.topicId) && this.maskMode == pushMessageCustom.maskMode && ValueObject.util_equals(this.receiveUserID, pushMessageCustom.receiveUserID) && ValueObject.util_equals(this.radioType, pushMessageCustom.radioType) && ValueObject.util_equals(this.rsStateReceiverToSender, pushMessageCustom.rsStateReceiverToSender) && this.mandatory == pushMessageCustom.mandatory && ValueObject.util_equals(this.scene, pushMessageCustom.scene) && ValueObject.util_equals(this.greetID, pushMessageCustom.greetID) && ValueObject.util_equals(this.groupId, pushMessageCustom.groupId) && ValueObject.util_equals(this.videoPartnerFinderId, pushMessageCustom.videoPartnerFinderId) && ValueObject.util_equals(this.startDate, pushMessageCustom.startDate) && ValueObject.util_equals(this.endDate, pushMessageCustom.endDate) && ValueObject.util_equals(this.creationData, pushMessageCustom.creationData) && ValueObject.util_equals(this.stateID, pushMessageCustom.stateID) && ValueObject.util_equals(this.stage, pushMessageCustom.stage) && ValueObject.util_equals(this.biz, pushMessageCustom.biz) && ValueObject.util_equals(this.text, pushMessageCustom.text) && ValueObject.util_equals(this.otherUserId, pushMessageCustom.otherUserId) && ValueObject.util_equals(this.type, pushMessageCustom.type) && this.lastActiveTime == pushMessageCustom.lastActiveTime && ValueObject.util_equals(this.otherUserName, pushMessageCustom.otherUserName) && ValueObject.util_equals(this.avatarState, pushMessageCustom.avatarState) && ValueObject.util_equals(this.subTitle, pushMessageCustom.subTitle) && ValueObject.util_equals(this.state, pushMessageCustom.state) && ValueObject.util_equals(this.conversationId, pushMessageCustom.conversationId) && ValueObject.util_equals(this.liveTitle, pushMessageCustom.liveTitle) && ValueObject.util_equals(this.anchorId, pushMessageCustom.anchorId) && ValueObject.util_equals(this.msgId, pushMessageCustom.msgId) && ValueObject.util_equals(this.schema, pushMessageCustom.schema) && ValueObject.util_equals(this.triggeredUserId, pushMessageCustom.triggeredUserId) && this.noRecommended == pushMessageCustom.noRecommended && this.isPassive == pushMessageCustom.isPassive && ValueObject.util_equals(this.USSInsert, pushMessageCustom.USSInsert) && ValueObject.util_equals(this.USSToast, pushMessageCustom.USSToast) && ValueObject.util_equals(this.USSPage, pushMessageCustom.USSPage) && ValueObject.util_equals(this.USSBusiness, pushMessageCustom.USSBusiness) && ValueObject.util_equals(this.USSIds, pushMessageCustom.USSIds) && ValueObject.util_equals(this.USSVerify, pushMessageCustom.USSVerify) && ValueObject.util_equals(this.USSOption, pushMessageCustom.USSOption) && ValueObject.util_equals(this.testGroupName, pushMessageCustom.testGroupName) && ValueObject.util_equals(this.avatars, pushMessageCustom.avatars) && ValueObject.util_equals(this.liveMode, pushMessageCustom.liveMode) && ValueObject.util_equals(this.channel, pushMessageCustom.channel) && ValueObject.util_equals(this.buzzToken, pushMessageCustom.buzzToken) && this.extraPrivileges == pushMessageCustom.extraPrivileges && this.popupsDisplay == pushMessageCustom.popupsDisplay && this.initialDuration == pushMessageCustom.initialDuration && this.prolongCount == pushMessageCustom.prolongCount && ValueObject.util_equals(this.appId, pushMessageCustom.appId) && this.vendor == pushMessageCustom.vendor && ValueObject.util_equals(this.channelToken, pushMessageCustom.channelToken) && ValueObject.util_equals(this.channelKey, pushMessageCustom.channelKey) && this.totalDuration == pushMessageCustom.totalDuration && this.frozenDuration == pushMessageCustom.frozenDuration && ValueObject.util_equals(this.bellType, pushMessageCustom.bellType) && this.resolutionHeight == pushMessageCustom.resolutionHeight && this.resolutionWidth == pushMessageCustom.resolutionWidth && ValueObject.util_equals(this.cell, pushMessageCustom.cell) && ValueObject.util_equals(this.questionIdSelected, pushMessageCustom.questionIdSelected) && this.insidePool == pushMessageCustom.insidePool && ValueObject.util_equals(this.mode, pushMessageCustom.mode) && ValueObject.util_equals(this.gid, pushMessageCustom.gid) && ValueObject.util_equals(this.intent, pushMessageCustom.intent) && ValueObject.util_equals(this.ruleKey, pushMessageCustom.ruleKey) && ValueObject.util_equals(this.selectedQuestion, pushMessageCustom.selectedQuestion) && ValueObject.util_equals(this.timestamp, pushMessageCustom.timestamp) && this.needReact == pushMessageCustom.needReact && ValueObject.util_equals(this.reaction, pushMessageCustom.reaction) && ValueObject.util_equals(this.alertId, pushMessageCustom.alertId) && ValueObject.util_equals(this.otherUsers, pushMessageCustom.otherUsers) && this.memojiDuration == pushMessageCustom.memojiDuration && this.newToast == pushMessageCustom.newToast && ValueObject.util_equals(this.bgImg, pushMessageCustom.bgImg) && ValueObject.util_equals(this.pushChannel, pushMessageCustom.pushChannel) && ValueObject.util_equals(this.extremePickShowId, pushMessageCustom.extremePickShowId) && ValueObject.util_equals(this.added, pushMessageCustom.added) && ValueObject.util_equals(this.unread, pushMessageCustom.unread) && ValueObject.util_equals(this.total, pushMessageCustom.total) && this.matched == pushMessageCustom.matched && ValueObject.util_equals(this.honorGiftCardDetail, pushMessageCustom.honorGiftCardDetail) && ValueObject.util_equals(this.canShowNotification, pushMessageCustom.canShowNotification) && ValueObject.util_equals(this.localNotificationCategory, pushMessageCustom.localNotificationCategory) && ValueObject.util_equals(this.localNotificationImportance, pushMessageCustom.localNotificationImportance) && ValueObject.util_equals(this.anchorCallId, pushMessageCustom.anchorCallId) && ValueObject.util_equals(this.channelNameV2, pushMessageCustom.channelNameV2) && ValueObject.util_equals(this.callerTokenV2, pushMessageCustom.callerTokenV2) && ValueObject.util_equals(this.calleeTokenV2, pushMessageCustom.calleeTokenV2) && ValueObject.util_equals(this.rtcProvider, pushMessageCustom.rtcProvider) && ValueObject.util_equals(this.videoChatId, pushMessageCustom.videoChatId) && ValueObject.util_equals(this.fitReason, pushMessageCustom.fitReason) && ValueObject.util_equals(this.friendPurpose, pushMessageCustom.friendPurpose) && ValueObject.util_equals(this.zodiacFitPercent, pushMessageCustom.zodiacFitPercent) && ValueObject.util_equals(this.tagID, pushMessageCustom.tagID) && this.msgSingleUpdateIgnoreConvStatus == pushMessageCustom.msgSingleUpdateIgnoreConvStatus && ValueObject.util_equals(this.emoji, pushMessageCustom.emoji);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.expire);
        int i2 = ((((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.fullScreen ? 1231 : 1237)) * 41;
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gender;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.giftId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.big_pic_url;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.age;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.name;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.tag1;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.tag2;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.tag3;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.liveId;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.roomId;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.nickname;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.tabId;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.extTabId;
        int iHashCode15 = (iHashCode14 + (str15 != null ? str15.hashCode() : 0)) * 41;
        String str16 = this.taskId;
        int iHashCode16 = (iHashCode15 + (str16 != null ? str16.hashCode() : 0)) * 41;
        String str17 = this.dates;
        int iHashCode17 = (iHashCode16 + (str17 != null ? str17.hashCode() : 0)) * 41;
        String str18 = this.recommendText;
        int iHashCode18 = (iHashCode17 + (str18 != null ? str18.hashCode() : 0)) * 41;
        String str19 = this.buttonText;
        int iHashCode19 = (iHashCode18 + (str19 != null ? str19.hashCode() : 0)) * 41;
        String str20 = this.queryToken;
        int iHashCode20 = (iHashCode19 + (str20 != null ? str20.hashCode() : 0)) * 41;
        String str21 = this.otherUserID;
        int iHashCode21 = (iHashCode20 + (str21 != null ? str21.hashCode() : 0)) * 41;
        String str22 = this.eventName;
        int iHashCode22 = (((iHashCode21 + (str22 != null ? str22.hashCode() : 0)) * 41) + (this.userMatched ? 1231 : 1237)) * 41;
        String str23 = this.rtcToken;
        int iHashCode23 = (iHashCode22 + (str23 != null ? str23.hashCode() : 0)) * 41;
        String str24 = this.rtcChannel;
        int iHashCode24 = str24 != null ? str24.hashCode() : 0;
        long j = this.rtcChannelWaitingTime;
        int i3 = (((iHashCode23 + iHashCode24) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str25 = this.quickchatType;
        int iHashCode25 = (i3 + (str25 != null ? str25.hashCode() : 0)) * 41;
        String str26 = this.queryOtherUserToken;
        int iHashCode26 = (iHashCode25 + (str26 != null ? str26.hashCode() : 0)) * 41;
        String str27 = this.pullStreamUrl;
        int iHashCode27 = (iHashCode26 + (str27 != null ? str27.hashCode() : 0)) * 41;
        String str28 = this.provider;
        int iHashCode28 = (iHashCode27 + (str28 != null ? str28.hashCode() : 0)) * 41;
        String str29 = this.businessType;
        int iHashCode29 = (iHashCode28 + (str29 != null ? str29.hashCode() : 0)) * 41;
        String str30 = this.callback;
        int iHashCode30 = (iHashCode29 + (str30 != null ? str30.hashCode() : 0)) * 41;
        String str31 = this.source;
        int iHashCode31 = (iHashCode30 + (str31 != null ? str31.hashCode() : 0)) * 41;
        String str32 = this.subSource;
        int iHashCode32 = (iHashCode31 + (str32 != null ? str32.hashCode() : 0)) * 41;
        String str33 = this.f38805id;
        int iHashCode33 = (iHashCode32 + (str33 != null ? str33.hashCode() : 0)) * 41;
        String str34 = this.caller;
        int iHashCode34 = (iHashCode33 + (str34 != null ? str34.hashCode() : 0)) * 41;
        String str35 = this.callee;
        int iHashCode35 = (iHashCode34 + (str35 != null ? str35.hashCode() : 0)) * 41;
        String str36 = this.callerDeviceId;
        int iHashCode36 = (iHashCode35 + (str36 != null ? str36.hashCode() : 0)) * 41;
        String str37 = this.calleeDeviceId;
        int iHashCode37 = (iHashCode36 + (str37 != null ? str37.hashCode() : 0)) * 41;
        String str38 = this.voiceStatus;
        int iHashCode38 = (iHashCode37 + (str38 != null ? str38.hashCode() : 0)) * 41;
        String str39 = this.channelName;
        int iHashCode39 = (iHashCode38 + (str39 != null ? str39.hashCode() : 0)) * 41;
        String str40 = this.callerToken;
        int iHashCode40 = (iHashCode39 + (str40 != null ? str40.hashCode() : 0)) * 41;
        String str41 = this.calleeToken;
        int iHashCode41 = str41 != null ? str41.hashCode() : 0;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.createdTime);
        int i4 = (((iHashCode40 + iHashCode41) * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        Boolean bool = this.canUserStartLive;
        int iHashCode42 = bool != null ? bool.hashCode() : 0;
        long j2 = this.inflow;
        int i5 = (((i4 + iHashCode42) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str42 = this.origin;
        int iHashCode43 = (i5 + (str42 != null ? str42.hashCode() : 0)) * 41;
        String str43 = this.itemId;
        int iHashCode44 = (iHashCode43 + (str43 != null ? str43.hashCode() : 0)) * 41;
        String str44 = this.orderId;
        int iHashCode45 = (iHashCode44 + (str44 != null ? str44.hashCode() : 0)) * 41;
        String str45 = this.privileges;
        int iHashCode46 = (iHashCode45 + (str45 != null ? str45.hashCode() : 0)) * 41;
        String str46 = this.matchTopic;
        int iHashCode47 = (iHashCode46 + (str46 != null ? str46.hashCode() : 0)) * 41;
        String str47 = this.userId;
        int iHashCode48 = (iHashCode47 + (str47 != null ? str47.hashCode() : 0)) * 41;
        String str48 = this.readUntilId;
        int iHashCode49 = (iHashCode48 + (str48 != null ? str48.hashCode() : 0)) * 41;
        String str49 = this.letter;
        int iHashCode50 = (iHashCode49 + (str49 != null ? str49.hashCode() : 0)) * 41;
        String str50 = this.openingRemark;
        int iHashCode51 = (iHashCode50 + (str50 != null ? str50.hashCode() : 0)) * 41;
        String str51 = this.poolID;
        int iHashCode52 = str51 != null ? str51.hashCode() : 0;
        long j3 = this.birthday;
        int i6 = (((iHashCode51 + iHashCode52) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str52 = this.productType;
        int iHashCode53 = (i6 + (str52 != null ? str52.hashCode() : 0)) * 41;
        String str53 = this.category;
        int iHashCode54 = (iHashCode53 + (str53 != null ? str53.hashCode() : 0)) * 41;
        String str54 = this.currencySymbol;
        int iHashCode55 = (iHashCode54 + (str54 != null ? str54.hashCode() : 0)) * 41;
        String str55 = this.price;
        int iHashCode56 = (iHashCode55 + (str55 != null ? str55.hashCode() : 0)) * 41;
        String str56 = this.ext;
        int iHashCode57 = str56 != null ? str56.hashCode() : 0;
        long j4 = this.duration;
        int i7 = (((iHashCode56 + iHashCode57) * 41) + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        String str57 = this.likedCount;
        int iHashCode58 = (i7 + (str57 != null ? str57.hashCode() : 0)) * 41;
        String str58 = this.likedPopuserCount;
        int iHashCode59 = (iHashCode58 + (str58 != null ? str58.hashCode() : 0)) * 41;
        String str59 = this.popChange;
        int iHashCode60 = (iHashCode59 + (str59 != null ? str59.hashCode() : 0)) * 41;
        String str60 = this.userName;
        int iHashCode61 = (iHashCode60 + (str60 != null ? str60.hashCode() : 0)) * 41;
        String str61 = this.title;
        int iHashCode62 = (iHashCode61 + (str61 != null ? str61.hashCode() : 0)) * 41;
        String str62 = this.content;
        int iHashCode63 = (iHashCode62 + (str62 != null ? str62.hashCode() : 0)) * 41;
        String str63 = this.image;
        int iHashCode64 = (iHashCode63 + (str63 != null ? str63.hashCode() : 0)) * 41;
        String str64 = this.couponId;
        int iHashCode65 = (iHashCode64 + (str64 != null ? str64.hashCode() : 0)) * 41;
        String str65 = this.couponDesc;
        int iHashCode66 = (iHashCode65 + (str65 != null ? str65.hashCode() : 0)) * 41;
        String str66 = this.merchandiseId;
        int iHashCode67 = (iHashCode66 + (str66 != null ? str66.hashCode() : 0)) * 41;
        String str67 = this.platform;
        int iHashCode68 = (iHashCode67 + (str67 != null ? str67.hashCode() : 0)) * 41;
        String str68 = this.contractId;
        int iHashCode69 = (iHashCode68 + (str68 != null ? str68.hashCode() : 0)) * 41;
        String str69 = this.broadcastID;
        int iHashCode70 = (iHashCode69 + (str69 != null ? str69.hashCode() : 0)) * 41;
        String str70 = this.partyId;
        int iHashCode71 = (iHashCode70 + (str70 != null ? str70.hashCode() : 0)) * 41;
        String str71 = this.score;
        int iHashCode72 = (iHashCode71 + (str71 != null ? str71.hashCode() : 0)) * 41;
        String str72 = this.link;
        int iHashCode73 = (iHashCode72 + (str72 != null ? str72.hashCode() : 0)) * 41;
        String str73 = this.extra;
        int iHashCode74 = (iHashCode73 + (str73 != null ? str73.hashCode() : 0)) * 41;
        String str74 = this.traceId;
        int iHashCode75 = (iHashCode74 + (str74 != null ? str74.hashCode() : 0)) * 41;
        String str75 = this.otherID;
        int iHashCode76 = (iHashCode75 + (str75 != null ? str75.hashCode() : 0)) * 41;
        String str76 = this.messageID;
        int iHashCode77 = (((iHashCode76 + (str76 != null ? str76.hashCode() : 0)) * 41) + (this.isGreet ? 1231 : 1237)) * 41;
        String str77 = this.tracker;
        int iHashCode78 = (((((iHashCode77 + (str77 != null ? str77.hashCode() : 0)) * 41) + this.bellShowStayTime) * 41) + this.bellNotShowStayTime) * 41;
        String str78 = this.voicePartnerFinderId;
        int iHashCode79 = (iHashCode78 + (str78 != null ? str78.hashCode() : 0)) * 41;
        String str79 = this.avatar;
        int iHashCode80 = (iHashCode79 + (str79 != null ? str79.hashCode() : 0)) * 41;
        String str80 = this.city;
        int iHashCode81 = str80 != null ? str80.hashCode() : 0;
        long j5 = this.distance;
        int i8 = (((iHashCode80 + iHashCode81) * 41) + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        String str81 = this.zodiac;
        int iHashCode82 = str81 != null ? str81.hashCode() : 0;
        long j6 = this.countDownSeconds;
        int i9 = (((i8 + iHashCode82) * 41) + ((int) (j6 ^ (j6 >>> 32)))) * 41;
        String str82 = this.topicId;
        int iHashCode83 = (((i9 + (str82 != null ? str82.hashCode() : 0)) * 41) + (this.maskMode ? 1231 : 1237)) * 41;
        String str83 = this.receiveUserID;
        int iHashCode84 = (iHashCode83 + (str83 != null ? str83.hashCode() : 0)) * 41;
        String str84 = this.radioType;
        int iHashCode85 = (iHashCode84 + (str84 != null ? str84.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.rsStateReceiverToSender;
        int iHashCode86 = (((iHashCode85 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41) + (this.mandatory ? 1231 : 1237)) * 41;
        String str85 = this.scene;
        int iHashCode87 = (iHashCode86 + (str85 != null ? str85.hashCode() : 0)) * 41;
        String str86 = this.greetID;
        int iHashCode88 = (iHashCode87 + (str86 != null ? str86.hashCode() : 0)) * 41;
        String str87 = this.groupId;
        int iHashCode89 = (iHashCode88 + (str87 != null ? str87.hashCode() : 0)) * 41;
        String str88 = this.videoPartnerFinderId;
        int iHashCode90 = (iHashCode89 + (str88 != null ? str88.hashCode() : 0)) * 41;
        String str89 = this.startDate;
        int iHashCode91 = (iHashCode90 + (str89 != null ? str89.hashCode() : 0)) * 41;
        String str90 = this.endDate;
        int iHashCode92 = (iHashCode91 + (str90 != null ? str90.hashCode() : 0)) * 41;
        String str91 = this.creationData;
        int iHashCode93 = (iHashCode92 + (str91 != null ? str91.hashCode() : 0)) * 41;
        String str92 = this.stateID;
        int iHashCode94 = (iHashCode93 + (str92 != null ? str92.hashCode() : 0)) * 41;
        String str93 = this.stage;
        int iHashCode95 = (iHashCode94 + (str93 != null ? str93.hashCode() : 0)) * 41;
        String str94 = this.biz;
        int iHashCode96 = (iHashCode95 + (str94 != null ? str94.hashCode() : 0)) * 41;
        String str95 = this.text;
        int iHashCode97 = (iHashCode96 + (str95 != null ? str95.hashCode() : 0)) * 41;
        String str96 = this.otherUserId;
        int iHashCode98 = (iHashCode97 + (str96 != null ? str96.hashCode() : 0)) * 41;
        String str97 = this.type;
        int iHashCode99 = str97 != null ? str97.hashCode() : 0;
        long j7 = this.lastActiveTime;
        int i10 = (((iHashCode98 + iHashCode99) * 41) + ((int) (j7 ^ (j7 >>> 32)))) * 41;
        String str98 = this.otherUserName;
        int iHashCode100 = (i10 + (str98 != null ? str98.hashCode() : 0)) * 41;
        String str99 = this.avatarState;
        int iHashCode101 = (iHashCode100 + (str99 != null ? str99.hashCode() : 0)) * 41;
        String str100 = this.subTitle;
        int iHashCode102 = (iHashCode101 + (str100 != null ? str100.hashCode() : 0)) * 41;
        String str101 = this.state;
        int iHashCode103 = (iHashCode102 + (str101 != null ? str101.hashCode() : 0)) * 41;
        String str102 = this.conversationId;
        int iHashCode104 = (iHashCode103 + (str102 != null ? str102.hashCode() : 0)) * 41;
        String str103 = this.liveTitle;
        int iHashCode105 = (iHashCode104 + (str103 != null ? str103.hashCode() : 0)) * 41;
        String str104 = this.anchorId;
        int iHashCode106 = (iHashCode105 + (str104 != null ? str104.hashCode() : 0)) * 41;
        String str105 = this.msgId;
        int iHashCode107 = (iHashCode106 + (str105 != null ? str105.hashCode() : 0)) * 41;
        String str106 = this.schema;
        int iHashCode108 = (iHashCode107 + (str106 != null ? str106.hashCode() : 0)) * 41;
        String str107 = this.triggeredUserId;
        int iHashCode109 = (((((iHashCode108 + (str107 != null ? str107.hashCode() : 0)) * 41) + (this.noRecommended ? 1231 : 1237)) * 41) + (this.isPassive ? 1231 : 1237)) * 41;
        String str108 = this.USSInsert;
        int iHashCode110 = (iHashCode109 + (str108 != null ? str108.hashCode() : 0)) * 41;
        String str109 = this.USSToast;
        int iHashCode111 = (iHashCode110 + (str109 != null ? str109.hashCode() : 0)) * 41;
        String str110 = this.USSPage;
        int iHashCode112 = (iHashCode111 + (str110 != null ? str110.hashCode() : 0)) * 41;
        String str111 = this.USSBusiness;
        int iHashCode113 = (iHashCode112 + (str111 != null ? str111.hashCode() : 0)) * 41;
        String str112 = this.USSIds;
        int iHashCode114 = (iHashCode113 + (str112 != null ? str112.hashCode() : 0)) * 41;
        String str113 = this.USSVerify;
        int iHashCode115 = (iHashCode114 + (str113 != null ? str113.hashCode() : 0)) * 41;
        String str114 = this.USSOption;
        int iHashCode116 = (iHashCode115 + (str114 != null ? str114.hashCode() : 0)) * 41;
        String str115 = this.testGroupName;
        int iHashCode117 = (iHashCode116 + (str115 != null ? str115.hashCode() : 0)) * 41;
        String str116 = this.avatars;
        int iHashCode118 = (iHashCode117 + (str116 != null ? str116.hashCode() : 0)) * 41;
        String str117 = this.liveMode;
        int iHashCode119 = (iHashCode118 + (str117 != null ? str117.hashCode() : 0)) * 41;
        String str118 = this.channel;
        int iHashCode120 = (iHashCode119 + (str118 != null ? str118.hashCode() : 0)) * 41;
        String str119 = this.buzzToken;
        int iHashCode121 = (((((((((iHashCode120 + (str119 != null ? str119.hashCode() : 0)) * 41) + this.extraPrivileges) * 41) + (this.popupsDisplay ? 1231 : 1237)) * 41) + this.initialDuration) * 41) + this.prolongCount) * 41;
        String str120 = this.appId;
        int iHashCode122 = (((iHashCode121 + (str120 != null ? str120.hashCode() : 0)) * 41) + this.vendor) * 41;
        String str121 = this.channelToken;
        int iHashCode123 = (iHashCode122 + (str121 != null ? str121.hashCode() : 0)) * 41;
        String str122 = this.channelKey;
        int iHashCode124 = (((((iHashCode123 + (str122 != null ? str122.hashCode() : 0)) * 41) + this.totalDuration) * 41) + this.frozenDuration) * 41;
        String str123 = this.bellType;
        int iHashCode125 = (((((iHashCode124 + (str123 != null ? str123.hashCode() : 0)) * 41) + this.resolutionHeight) * 41) + this.resolutionWidth) * 41;
        String str124 = this.cell;
        int iHashCode126 = (iHashCode125 + (str124 != null ? str124.hashCode() : 0)) * 41;
        String str125 = this.questionIdSelected;
        int iHashCode127 = (((iHashCode126 + (str125 != null ? str125.hashCode() : 0)) * 41) + (this.insidePool ? 1231 : 1237)) * 41;
        String str126 = this.mode;
        int iHashCode128 = (iHashCode127 + (str126 != null ? str126.hashCode() : 0)) * 41;
        String str127 = this.gid;
        int iHashCode129 = (iHashCode128 + (str127 != null ? str127.hashCode() : 0)) * 41;
        String str128 = this.intent;
        int iHashCode130 = (iHashCode129 + (str128 != null ? str128.hashCode() : 0)) * 41;
        String str129 = this.ruleKey;
        int iHashCode131 = (iHashCode130 + (str129 != null ? str129.hashCode() : 0)) * 41;
        String str130 = this.selectedQuestion;
        int iHashCode132 = (iHashCode131 + (str130 != null ? str130.hashCode() : 0)) * 41;
        String str131 = this.timestamp;
        int iHashCode133 = (((iHashCode132 + (str131 != null ? str131.hashCode() : 0)) * 41) + (this.needReact ? 1231 : 1237)) * 41;
        String str132 = this.reaction;
        int iHashCode134 = (iHashCode133 + (str132 != null ? str132.hashCode() : 0)) * 41;
        String str133 = this.alertId;
        int iHashCode135 = (iHashCode134 + (str133 != null ? str133.hashCode() : 0)) * 41;
        String str134 = this.otherUsers;
        int iHashCode136 = (((((iHashCode135 + (str134 != null ? str134.hashCode() : 0)) * 41) + this.memojiDuration) * 41) + (this.newToast ? 1231 : 1237)) * 41;
        String str135 = this.bgImg;
        int iHashCode137 = (iHashCode136 + (str135 != null ? str135.hashCode() : 0)) * 41;
        String str136 = this.pushChannel;
        int iHashCode138 = (iHashCode137 + (str136 != null ? str136.hashCode() : 0)) * 41;
        String str137 = this.extremePickShowId;
        int iHashCode139 = (iHashCode138 + (str137 != null ? str137.hashCode() : 0)) * 41;
        String str138 = this.added;
        int iHashCode140 = (iHashCode139 + (str138 != null ? str138.hashCode() : 0)) * 41;
        String str139 = this.unread;
        int iHashCode141 = (iHashCode140 + (str139 != null ? str139.hashCode() : 0)) * 41;
        String str140 = this.total;
        int iHashCode142 = (((iHashCode141 + (str140 != null ? str140.hashCode() : 0)) * 41) + (this.matched ? 1231 : 1237)) * 41;
        String str141 = this.honorGiftCardDetail;
        int iHashCode143 = (iHashCode142 + (str141 != null ? str141.hashCode() : 0)) * 41;
        Boolean bool2 = this.canShowNotification;
        int iHashCode144 = (iHashCode143 + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        String str142 = this.localNotificationCategory;
        int iHashCode145 = (iHashCode144 + (str142 != null ? str142.hashCode() : 0)) * 41;
        String str143 = this.localNotificationImportance;
        int iHashCode146 = (iHashCode145 + (str143 != null ? str143.hashCode() : 0)) * 41;
        String str144 = this.anchorCallId;
        int iHashCode147 = (iHashCode146 + (str144 != null ? str144.hashCode() : 0)) * 41;
        String str145 = this.channelNameV2;
        int iHashCode148 = (iHashCode147 + (str145 != null ? str145.hashCode() : 0)) * 41;
        String str146 = this.callerTokenV2;
        int iHashCode149 = (iHashCode148 + (str146 != null ? str146.hashCode() : 0)) * 41;
        String str147 = this.calleeTokenV2;
        int iHashCode150 = (iHashCode149 + (str147 != null ? str147.hashCode() : 0)) * 41;
        String str148 = this.rtcProvider;
        int iHashCode151 = (iHashCode150 + (str148 != null ? str148.hashCode() : 0)) * 41;
        String str149 = this.videoChatId;
        int iHashCode152 = (iHashCode151 + (str149 != null ? str149.hashCode() : 0)) * 41;
        String str150 = this.fitReason;
        int iHashCode153 = (iHashCode152 + (str150 != null ? str150.hashCode() : 0)) * 41;
        String str151 = this.friendPurpose;
        int iHashCode154 = (iHashCode153 + (str151 != null ? str151.hashCode() : 0)) * 41;
        String str152 = this.zodiacFitPercent;
        int iHashCode155 = (iHashCode154 + (str152 != null ? str152.hashCode() : 0)) * 41;
        String str153 = this.tagID;
        int iHashCode156 = (((iHashCode155 + (str153 != null ? str153.hashCode() : 0)) * 41) + (this.msgSingleUpdateIgnoreConvStatus ? 1231 : 1237)) * 41;
        String str154 = this.emoji;
        int iHashCode157 = iHashCode156 + (str154 != null ? str154.hashCode() : 0);
        this.hashCode = iHashCode157;
        return iHashCode157;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.age == null) {
            this.age = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.tag1 == null) {
            this.tag1 = "";
        }
        if (this.tag2 == null) {
            this.tag2 = "";
        }
        if (this.tag3 == null) {
            this.tag3 = "";
        }
        if (this.nickname == null) {
            this.nickname = "";
        }
        if (this.scene == null) {
            this.scene = "";
        }
        if (this.greetID == null) {
            this.greetID = "";
        }
        if (this.groupId == null) {
            this.groupId = "";
        }
        if (this.avatarState == null) {
            this.avatarState = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.conversationId == null) {
            this.conversationId = "";
        }
        if (this.liveTitle == null) {
            this.liveTitle = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.msgId == null) {
            this.msgId = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.triggeredUserId == null) {
            this.triggeredUserId = "";
        }
        if (this.USSInsert == null) {
            this.USSInsert = "";
        }
        if (this.USSToast == null) {
            this.USSToast = "";
        }
        if (this.USSPage == null) {
            this.USSPage = "";
        }
        if (this.USSBusiness == null) {
            this.USSBusiness = "";
        }
        if (this.USSIds == null) {
            this.USSIds = "";
        }
        if (this.USSVerify == null) {
            this.USSVerify = "";
        }
        if (this.USSOption == null) {
            this.USSOption = "";
        }
        if (this.testGroupName == null) {
            this.testGroupName = "";
        }
        if (this.avatars == null) {
            this.avatars = "";
        }
        if (this.liveMode == null) {
            this.liveMode = "";
        }
        if (this.channel == null) {
            this.channel = "";
        }
        if (this.buzzToken == null) {
            this.buzzToken = "";
        }
        if (this.appId == null) {
            this.appId = "";
        }
        if (this.channelToken == null) {
            this.channelToken = "";
        }
        if (this.channelKey == null) {
            this.channelKey = "";
        }
        if (this.bellType == null) {
            this.bellType = "";
        }
        if (this.cell == null) {
            this.cell = "";
        }
        if (this.questionIdSelected == null) {
            this.questionIdSelected = "";
        }
        if (this.mode == null) {
            this.mode = "";
        }
        if (this.gid == null) {
            this.gid = "";
        }
        if (this.intent == null) {
            this.intent = "";
        }
        if (this.ruleKey == null) {
            this.ruleKey = "";
        }
        if (this.selectedQuestion == null) {
            this.selectedQuestion = "";
        }
        if (this.timestamp == null) {
            this.timestamp = "";
        }
        if (this.reaction == null) {
            this.reaction = "";
        }
        if (this.alertId == null) {
            this.alertId = "";
        }
        if (this.otherUsers == null) {
            this.otherUsers = "";
        }
        if (this.bgImg == null) {
            this.bgImg = "";
        }
        if (this.pushChannel == null) {
            this.pushChannel = "";
        }
        if (this.extremePickShowId == null) {
            this.extremePickShowId = "";
        }
        if (this.added == null) {
            this.added = "";
        }
        if (this.unread == null) {
            this.unread = "";
        }
        if (this.total == null) {
            this.total = "";
        }
        if (this.honorGiftCardDetail == null) {
            this.honorGiftCardDetail = "";
        }
        if (this.localNotificationCategory == null) {
            this.localNotificationCategory = "";
        }
        if (this.localNotificationImportance == null) {
            this.localNotificationImportance = "";
        }
        if (this.anchorCallId == null) {
            this.anchorCallId = "";
        }
        if (this.channelNameV2 == null) {
            this.channelNameV2 = "";
        }
        if (this.callerTokenV2 == null) {
            this.callerTokenV2 = "";
        }
        if (this.calleeTokenV2 == null) {
            this.calleeTokenV2 = "";
        }
        if (this.rtcProvider == null) {
            this.rtcProvider = "";
        }
        if (this.videoChatId == null) {
            this.videoChatId = "";
        }
        if (this.fitReason == null) {
            this.fitReason = "";
        }
        if (this.friendPurpose == null) {
            this.friendPurpose = "";
        }
        if (this.zodiacFitPercent == null) {
            this.zodiacFitPercent = "";
        }
        if (this.tagID == null) {
            this.tagID = "";
        }
        if (this.emoji == null) {
            this.emoji = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
