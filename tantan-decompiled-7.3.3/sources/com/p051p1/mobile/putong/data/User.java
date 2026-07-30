package com.p051p1.mobile.putong.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.core.glcore.util.DetectDelayStopHelper;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Membership;
import com.p051p1.mobile.putong.data.PrivateAnswer;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import com.tencent.mmkv.MMKV;
import io.agora.rtc2.Constants;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okio.Utf8;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p151v.VImage;
import p153l.bnl0;
import p153l.jm5;
import p153l.jyb;
import p153l.nc5;
import p153l.nrb0;
import p153l.pzi0;
import p153l.qcj;
import p153l.uqb0;
import p153l.vzf0;
import p153l.wyd0;
import p153l.wzh0;
import p153l.xi5;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes12.dex */
public class User extends DbObject<User> implements Cloneable, Serializable {
    public static int AGE_DEFAULT_SEARCH_MAX = 50;
    public static int AGE_DEFAULT_SEARCH_MIN = 18;
    public static int AGE_MAX = 100;
    public static int AGE_MAX_KOREAN = 99;
    public static int AGE_MIN = 16;
    public static int AGE_MIN_GOOGLEPLAY = 18;
    public static int AGE_MIN_KOREAN = 19;
    public static final int EMPTY = 2;
    public static final String ID_AI_1V1 = "-10025";
    public static final String ID_AI_STORY = "-10021";
    public static final String ID_CHRISTMAS_SERVICE = "-10007";
    public static final String ID_INTL_LIVE_VIP_SERVICE = "-11004";
    public static final String ID_LIVE_SERVICE = "-11001";
    public static final String ID_LIVE_VIP_SERVICE = "-11000";
    public static final String ID_ODIAMOND_SERVICE = "-11006";
    public static final String ID_OFFICIAL_CHANNEL = "-11005";
    public static final String ID_TEAM_ACCOUNT = "-1";
    public static final String ID_TEAM_ACCOUNT_SERVICE = "-10040";
    public static final String ID_VERIVICATION_ASSISTANT = "-10023";
    public static final String ID_WISDOM_STAR = "-10015";
    public static final String LOCAL_ID_INTL_SEE_LETTER = "-770011";
    public static final int MASKFOLLOW = 1;
    public static final int MAX_MEDIA_SIZE = 9;

    /* JADX INFO: renamed from: ME */
    public static final int f39674ME = 4;
    private static int MEMBERSHIP_DEFAULT_EXPIRE_TIME = -1;
    public static int NAME_MAX = 50;
    public static int NAME_MIN = 1;
    public static final int RELATION_OR_FOLLOW = 0;
    public static int SEPARATING_AGE = 23;
    public static final int TEAM_ACCOUNT = 3;
    public static final String TYPE = "user";
    private static Pattern inp = null;
    public static int newHereDay = -1;

    /* JADX INFO: renamed from: np */
    private static Pattern f39675np;
    private static Pattern tnp;

    @Nullable
    @ProtobufIndex(index = 70)
    public List<String> abGroups;

    @NonNull
    @ProtobufIndex(index = 88)
    public UserAbroad abroad;

    @NonNull
    @ProtobufIndex(index = 113)
    public ActivityUser activityUser;

    @NonNull
    @ProtobufIndex(index = 54)
    public Integer age;
    public boolean aiOrderPicture;

    @NonNull
    @ProtobufIndex(index = EACTags.FCP_TEMPLATE)
    public String aiTag;

    @NonNull
    public LiveAnchorLevel anchorHierarchy;

    @Nullable
    @ProtobufIndex(index = 108)
    public AnonymousLikeInfo anonymousLike;

    @NonNull
    public AvatarFrame avatarFrame;

    @NonNull
    @ProtobufIndex(index = 106)
    public BanStatus banStatus;

    @Nullable
    public Broadcast broadcast;

    @ProtobufIndex(index = 56)
    public double createdTime;

    @Nullable
    @ProtobufIndex(index = 76)
    @Deprecated
    public UserCreditData credit;

    @ProtobufIndex(index = EACTags.TRACK1_APPLICATION)
    public boolean datingMode;
    private DefaultRiskAuditUser defaultRiskAuditUser;

    @ProtobufIndex(index = 118)
    public boolean deleted;

    @NonNull
    @ProtobufIndex(index = 53)
    public String description;

    @ProtobufIndex(index = EACTags.APPLICATION_TEMPLATE)
    @Deprecated
    public double diamondVIPExpiresTime;

    @ProtobufIndex(index = EACTags.NAME)
    public boolean displayAudit;

    @Nullable
    @ProtobufIndex(index = 89)
    public StatusesItem fakeStatus;

    @NonNull
    public LiveFansClubLevel fanbaseHierarchy;

    @NonNull
    public List<StepSignupStage> finishedStages;

    @Nullable
    @ProtobufIndex(index = 99)
    public FriendCommentInfo friendCommentInfo;

    @NonNull
    @ProtobufIndex(index = 60)
    public Gender gender;

    @ProtobufIndex(index = 77)
    public double goPlaceTimestamp;

    @NonNull
    @ProtobufIndex(index = 103)
    public LiveUserLevel hierarchy;

    @Nullable
    public UserIdealInfo ideal;

    @ProtobufIndex(index = 109)
    public boolean inactivated;

    @ProtobufIndex(index = 78)
    public boolean isLord;

    @NonNull
    public LiveRevenueCampaignVip liveRevenueCampaignVip;

    @NonNull
    public UserLiveState liveState;
    private LiveUserAvatarFrame liveUserAvatarFrame;

    @Nullable
    @ProtobufIndex(index = 107)
    public List<String> localDiamondPrivateMatchTags;

    @Nullable
    @ProtobufIndex(index = 65)
    public Followship localFollowship;

    @ProtobufIndex(index = 102)
    public long localLatestReceivedMessageTime;
    public boolean localLetterUnRead;

    @NonNull
    @ProtobufIndex(index = 117)
    public List<String> localLikeIdentifiers;

    @Nullable
    @ProtobufIndex(index = 61)
    public Relationship localRelationship;

    @NonNull
    public RichListUsers localRichListUsers;

    @NonNull
    public String localSeeReminderType;

    @Nullable
    @ProtobufIndex(index = 104)
    public SoulShip localSoulShip;

    @NonNull
    @ProtobufIndex(index = 52)
    public Location location;

    @ProtobufIndex(index = 115)
    public boolean matePlanAdUser;

    @ProtobufIndex(index = 114)
    public boolean matePlanUser;

    @NonNull
    public UserMedalWrapper medal;

    @NonNull
    @ProtobufIndex(index = 62)
    public Membership membership;

    @Nullable
    @ProtobufIndex(index = 66)
    public List<Membership> memberships;

    @ProtobufIndex(index = 100)
    public int minRichListPosition;

    @NonNull
    @ProtobufIndex(index = 51)
    public String name;

    @NonNull
    @ProtobufIndex(index = 67)
    public String nameRemark;

    @Nullable
    @ProtobufIndex(index = 90)
    public StatusesItem nameStatus;

    @Nullable
    @ProtobufIndex(index = 72)
    public Membership peepership;

    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
    public long picksExpiredTimestamp;

    @ProtobufIndex(index = 74)
    public boolean picksSwipable;

    @NonNull
    @ProtobufIndex(index = 75)
    public String picksTag;
    public int picksTagType;

    @NonNull
    public String picksTracker;

    @NonNull
    @ProtobufIndex(index = 55)
    public List<Media> pictures;
    private List<String> pinyinOfRealName;

    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public int popLevel;
    public float popularity;

    @NonNull
    @ProtobufIndex(index = 71)
    public List<PrivateAnswer> privateAnswers;

    @ProtobufIndex(index = 79)
    public double privateAnswersUpdatedTime;

    @NonNull
    @ProtobufIndex(index = 57)
    public Profile profile;

    @NonNull
    @ProtobufIndex(index = EACTags.HEADER_LIST)
    public String publicId;

    @NonNull
    @ProtobufIndex(index = 64)
    public String realName;

    @Nullable
    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
    public String receivedLetter;

    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public long receivedLetterTimestamp;

    @NonNull
    @ProtobufIndex(index = 116)
    public String regionTag;
    private String requestUrl;

    @ProtobufIndex(index = 95)
    public int richListPosition;

    @NonNull
    @ProtobufIndex(index = Opcodes.IADD)
    public String richListTracker;

    @NonNull
    public String richListType;

    @Nullable
    @ProtobufIndex(index = 80)
    public String sendLetter;

    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public long sendLetterTimestamp;

    @Nullable
    @ProtobufIndex(index = 59)
    public Settings settings;

    @NonNull
    public SignupStage signupStage;

    @ProtobufIndex(index = 105)
    public double signupTime;

    @NonNull
    @ProtobufIndex(index = EACTags.LOGIN_DATA)
    public UserSoulSettings soulSettings;

    @Nullable
    @ProtobufIndex(index = 63)
    public UserSource source;

    @Nullable
    @ProtobufIndex(index = 119)
    public SpecialEffect specialEffect;

    @Nullable
    @ProtobufIndex(index = 68)
    public UserState state;

    @NonNull
    @ProtobufIndex(index = 58)
    public List<UserStatus> status;

    @Nullable
    public TotalRewardPoint totalRewardPoint;

    @Nullable
    @ProtobufIndex(index = 120)
    public UserActivityInfo userActivityInfo;
    private UserAvatarFrame userAvatarFrame;

    @Nullable
    @ProtobufIndex(index = 87)
    public UssTags ussTags;

    @NonNull
    @ProtobufIndex(index = 101)
    public String ussTracker;

    @NonNull
    @ProtobufIndex(index = 69)
    public PicVerification verifications;

    @Nullable
    @ProtobufIndex(index = EACTags.TAG_LIST)
    public VisitPlace visitPlace;

    @NonNull
    @ProtobufIndex(index = 85)
    public AudioSignature voice;

    @NonNull
    public VoiceLiveState voiceLiveState;
    public static ProtobufAdapter<User> PROTOBUF_ADAPTER = new MessageNanoAdapter<User>() { // from class: com.p1.mobile.putong.data.User.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(User user) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, user._id);
            String str = user.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = user.name;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(51, str2);
            }
            Location location = user.location;
            if (location != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(52, location, Location.PROTOBUF_ADAPTER);
            }
            String str3 = user.description;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(53, str3);
            }
            Integer num = user.age;
            if (num != null) {
                iM17283j += CodedOutputByteBufferNano.m17281h(54, num.intValue());
            }
            List<Media> list = user.pictures;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(55, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17277d = iM17283j + CodedOutputByteBufferNano.m17277d(56, user.createdTime);
            Profile profile = user.profile;
            if (profile != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(57, profile, Profile.PROTOBUF_ADAPTER);
            }
            List<UserStatus> list2 = user.status;
            if (list2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(58, UserStatus.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Settings settings = user.settings;
            if (settings != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(59, settings, Settings.PROTOBUF_ADAPTER);
            }
            Gender gender = user.gender;
            if (gender != null) {
                iM17277d += CodedOutputByteBufferNano.m17281h(60, gender.ordinal());
            }
            Relationship relationship = user.localRelationship;
            if (relationship != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(61, relationship, Relationship.PROTOBUF_ADAPTER);
            }
            Membership membership = user.membership;
            if (membership != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(62, membership, Membership.PROTOBUF_ADAPTER);
            }
            UserSource userSource = user.source;
            if (userSource != null) {
                iM17277d += CodedOutputByteBufferNano.m17281h(63, userSource.ordinal());
            }
            String str4 = user.realName;
            if (str4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(64, str4);
            }
            Followship followship = user.localFollowship;
            if (followship != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(65, followship, Followship.PROTOBUF_ADAPTER);
            }
            List<Membership> list3 = user.memberships;
            if (list3 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(66, list3, Membership.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = user.nameRemark;
            if (str5 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(67, str5);
            }
            UserState userState = user.state;
            if (userState != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(68, userState, UserState.PROTOBUF_ADAPTER);
            }
            PicVerification picVerification = user.verifications;
            if (picVerification != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(69, picVerification, PicVerification.PROTOBUF_ADAPTER);
            }
            List<String> list4 = user.abGroups;
            if (list4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(70, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivateAnswer> list5 = user.privateAnswers;
            if (list5 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(71, list5, PrivateAnswer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Membership membership2 = user.peepership;
            if (membership2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(72, membership2, Membership.PROTOBUF_ADAPTER);
            }
            int iM17283j2 = iM17277d + CodedOutputByteBufferNano.m17283j(73, user.picksExpiredTimestamp) + CodedOutputByteBufferNano.m17275b(74, user.picksSwipable);
            String str6 = user.picksTag;
            if (str6 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(75, str6);
            }
            UserCreditData userCreditData = user.credit;
            if (userCreditData != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(76, userCreditData, UserCreditData.PROTOBUF_ADAPTER);
            }
            int iM17277d2 = iM17283j2 + CodedOutputByteBufferNano.m17277d(77, user.goPlaceTimestamp) + CodedOutputByteBufferNano.m17275b(78, user.isLord) + CodedOutputByteBufferNano.m17277d(79, user.privateAnswersUpdatedTime);
            String str7 = user.sendLetter;
            if (str7 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17288o(80, str7);
            }
            int iM17283j3 = iM17277d2 + CodedOutputByteBufferNano.m17283j(81, user.sendLetterTimestamp);
            String str8 = user.receivedLetter;
            if (str8 != null) {
                iM17283j3 += CodedOutputByteBufferNano.m17288o(82, str8);
            }
            int iM17283j4 = iM17283j3 + CodedOutputByteBufferNano.m17283j(83, user.receivedLetterTimestamp) + CodedOutputByteBufferNano.m17281h(84, user.popLevel);
            AudioSignature audioSignature = user.voice;
            if (audioSignature != null) {
                iM17283j4 += CodedOutputByteBufferNano.m17285l(85, audioSignature, AudioSignature.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17283j4 + CodedOutputByteBufferNano.m17275b(86, user.datingMode);
            UssTags ussTags = user.ussTags;
            if (ussTags != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(87, ussTags, UssTags.PROTOBUF_ADAPTER);
            }
            UserAbroad userAbroad = user.abroad;
            if (userAbroad != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(88, userAbroad, UserAbroad.PROTOBUF_ADAPTER);
            }
            StatusesItem statusesItem = user.fakeStatus;
            if (statusesItem != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(89, statusesItem, StatusesItem.PROTOBUF_ADAPTER);
            }
            StatusesItem statusesItem2 = user.nameStatus;
            if (statusesItem2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(90, statusesItem2, StatusesItem.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(91, user.displayAudit);
            VisitPlace visitPlace = user.visitPlace;
            if (visitPlace != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(92, visitPlace, VisitPlace.PROTOBUF_ADAPTER);
            }
            String str9 = user.publicId;
            if (str9 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(93, str9);
            }
            UserSoulSettings userSoulSettings = user.soulSettings;
            if (userSoulSettings != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(94, userSoulSettings, UserSoulSettings.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17275b2 + CodedOutputByteBufferNano.m17281h(95, user.richListPosition);
            String str10 = user.richListTracker;
            if (str10 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(96, str10);
            }
            int iM17277d3 = iM17281h + CodedOutputByteBufferNano.m17277d(97, user.diamondVIPExpiresTime);
            String str11 = user.aiTag;
            if (str11 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17288o(98, str11);
            }
            FriendCommentInfo friendCommentInfo = user.friendCommentInfo;
            if (friendCommentInfo != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17285l(99, friendCommentInfo, FriendCommentInfo.PROTOBUF_ADAPTER);
            }
            int iM17281h2 = iM17277d3 + CodedOutputByteBufferNano.m17281h(100, user.minRichListPosition);
            String str12 = user.ussTracker;
            if (str12 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(101, str12);
            }
            int iM17283j5 = iM17281h2 + CodedOutputByteBufferNano.m17283j(102, user.localLatestReceivedMessageTime);
            LiveUserLevel liveUserLevel = user.hierarchy;
            if (liveUserLevel != null) {
                iM17283j5 += CodedOutputByteBufferNano.m17285l(103, liveUserLevel, LiveUserLevel.PROTOBUF_ADAPTER);
            }
            SoulShip soulShip = user.localSoulShip;
            if (soulShip != null) {
                iM17283j5 += CodedOutputByteBufferNano.m17285l(104, soulShip, SoulShip.PROTOBUF_ADAPTER);
            }
            int iM17277d4 = iM17283j5 + CodedOutputByteBufferNano.m17277d(105, user.signupTime);
            BanStatus banStatus = user.banStatus;
            if (banStatus != null) {
                iM17277d4 += CodedOutputByteBufferNano.m17285l(106, banStatus, BanStatus.PROTOBUF_ADAPTER);
            }
            List<String> list6 = user.localDiamondPrivateMatchTags;
            if (list6 != null) {
                iM17277d4 += CodedOutputByteBufferNano.m17285l(107, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            AnonymousLikeInfo anonymousLikeInfo = user.anonymousLike;
            if (anonymousLikeInfo != null) {
                iM17277d4 += CodedOutputByteBufferNano.m17285l(108, anonymousLikeInfo, AnonymousLikeInfo.PROTOBUF_ADAPTER);
            }
            int iM17275b3 = iM17277d4 + CodedOutputByteBufferNano.m17275b(109, user.inactivated);
            List<UserStatus> list7 = user.status;
            if (list7 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(110, list7, UserStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Gender gender2 = user.gender;
            if (gender2 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(111, gender2, Gender.PROTOBUF_ADAPTER);
            }
            UserSource userSource2 = user.source;
            if (userSource2 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(112, userSource2, UserSource.PROTOBUF_ADAPTER);
            }
            ActivityUser activityUser = user.activityUser;
            if (activityUser != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(113, activityUser, ActivityUser.PROTOBUF_ADAPTER);
            }
            int iM17275b4 = iM17275b3 + CodedOutputByteBufferNano.m17275b(114, user.matePlanUser) + CodedOutputByteBufferNano.m17275b(115, user.matePlanAdUser);
            String str13 = user.regionTag;
            if (str13 != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17288o(116, str13);
            }
            List<String> list8 = user.localLikeIdentifiers;
            if (list8 != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(117, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17275b5 = iM17275b4 + CodedOutputByteBufferNano.m17275b(118, user.deleted);
            SpecialEffect specialEffect = user.specialEffect;
            if (specialEffect != null) {
                iM17275b5 += CodedOutputByteBufferNano.m17285l(119, specialEffect, SpecialEffect.PROTOBUF_ADAPTER);
            }
            UserActivityInfo userActivityInfo = user.userActivityInfo;
            if (userActivityInfo != null) {
                iM17275b5 += CodedOutputByteBufferNano.m17285l(120, userActivityInfo, UserActivityInfo.PROTOBUF_ADAPTER);
            }
            user.cachedSize = iM17275b5;
            return iM17275b5;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public User parse(nc5 nc5Var) throws IOException {
            User user = new User();
            List list = null;
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (user.status == null && list != null) {
                            user.status = UserStatus.oldEnumCovertList(list);
                        }
                        if (user.gender == null && numValueOf != null) {
                            user.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (user.source == null && numValueOf2 != null) {
                            user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (user.name == null) {
                            user.name = "";
                        }
                        if (user.location == null) {
                            user.location = Location.new_();
                        }
                        if (user.description == null) {
                            user.description = "";
                        }
                        if (user.age == null) {
                            user.age = 0;
                        }
                        if (user.pictures == null) {
                            user.pictures = new ArrayList();
                        }
                        if (user.profile == null) {
                            user.profile = Profile.new_();
                        }
                        if (user.status == null) {
                            user.status = new ArrayList();
                        }
                        if (user.gender == null) {
                            user.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (user.membership == null) {
                            user.membership = Membership.new_();
                        }
                        if (user.realName == null) {
                            user.realName = "";
                        }
                        if (user.nameRemark == null) {
                            user.nameRemark = "";
                        }
                        if (user.verifications == null) {
                            user.verifications = PicVerification.new_();
                        }
                        if (user.privateAnswers == null) {
                            user.privateAnswers = new ArrayList();
                        }
                        if (user.picksTag == null) {
                            user.picksTag = "";
                        }
                        if (user.picksTracker == null) {
                            user.picksTracker = "";
                        }
                        if (user.voice == null) {
                            user.voice = AudioSignature.new_();
                        }
                        if (user.liveState == null) {
                            user.liveState = UserLiveState.new_();
                        }
                        if (user.abroad == null) {
                            user.abroad = UserAbroad.new_();
                        }
                        if (user.medal == null) {
                            user.medal = UserMedalWrapper.new_();
                        }
                        if (user.signupStage == null) {
                            user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                        }
                        if (user.publicId == null) {
                            user.publicId = "";
                        }
                        if (user.soulSettings == null) {
                            user.soulSettings = UserSoulSettings.new_();
                        }
                        if (user.richListTracker == null) {
                            user.richListTracker = "";
                        }
                        if (user.localRichListUsers == null) {
                            user.localRichListUsers = RichListUsers.new_();
                        }
                        if (user.richListType == null) {
                            user.richListType = "";
                        }
                        if (user.liveRevenueCampaignVip == null) {
                            user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                        }
                        if (user.aiTag == null) {
                            user.aiTag = "";
                        }
                        if (user.ussTracker == null) {
                            user.ussTracker = "";
                        }
                        if (user.anchorHierarchy == null) {
                            user.anchorHierarchy = LiveAnchorLevel.new_();
                        }
                        if (user.fanbaseHierarchy == null) {
                            user.fanbaseHierarchy = LiveFansClubLevel.new_();
                        }
                        if (user.avatarFrame == null) {
                            user.avatarFrame = AvatarFrame.new_();
                        }
                        if (user.hierarchy == null) {
                            user.hierarchy = LiveUserLevel.new_();
                        }
                        if (user.banStatus == null) {
                            user.banStatus = BanStatus.new_();
                        }
                        if (user.finishedStages == null) {
                            user.finishedStages = new ArrayList();
                        }
                        if (user.activityUser == null) {
                            user.activityUser = ActivityUser.new_();
                        }
                        if (user.regionTag == null) {
                            user.regionTag = "";
                        }
                        if (user.localLikeIdentifiers == null) {
                            user.localLikeIdentifiers = new ArrayList();
                        }
                        if (user.voiceLiveState == null) {
                            user.voiceLiveState = VoiceLiveState.new_();
                        }
                        if (user.localSeeReminderType == null) {
                            user.localSeeReminderType = "";
                        }
                        break;
                    case 8:
                        user._id = nc5Var.m162487k();
                        continue;
                    case 18:
                        user.f56859id = nc5Var.m162495s();
                        continue;
                    case 410:
                        user.name = nc5Var.m162495s();
                        continue;
                    case 418:
                        user.location = (Location) nc5Var.m162488l(Location.PROTOBUF_ADAPTER);
                        continue;
                    case 426:
                        user.description = nc5Var.m162495s();
                        continue;
                    case 432:
                        user.age = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 442:
                        user.pictures = (List) nc5Var.m162488l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 449:
                        user.createdTime = nc5Var.m162484h();
                        continue;
                    case 458:
                        user.profile = (Profile) nc5Var.m162488l(Profile.PROTOBUF_ADAPTER);
                        continue;
                    case 466:
                        list = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 474:
                        user.settings = (Settings) nc5Var.m162488l(Settings.PROTOBUF_ADAPTER);
                        continue;
                    case 480:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 490:
                        user.localRelationship = (Relationship) nc5Var.m162488l(Relationship.PROTOBUF_ADAPTER);
                        continue;
                    case 498:
                        user.membership = (Membership) nc5Var.m162488l(Membership.PROTOBUF_ADAPTER);
                        continue;
                    case HttpStatus.GATEWAY_TIMEOUT_504 /* 504 */:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 514:
                        user.realName = nc5Var.m162495s();
                        continue;
                    case 522:
                        user.localFollowship = (Followship) nc5Var.m162488l(Followship.PROTOBUF_ADAPTER);
                        continue;
                    case 530:
                        user.memberships = (List) nc5Var.m162488l(Membership.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 538:
                        user.nameRemark = nc5Var.m162495s();
                        continue;
                    case 546:
                        user.state = (UserState) nc5Var.m162488l(UserState.PROTOBUF_ADAPTER);
                        continue;
                    case 554:
                        user.verifications = (PicVerification) nc5Var.m162488l(PicVerification.PROTOBUF_ADAPTER);
                        continue;
                    case 562:
                        user.abGroups = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 570:
                        user.privateAnswers = (List) nc5Var.m162488l(PrivateAnswer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /* 578 */:
                        user.peepership = (Membership) nc5Var.m162488l(Membership.PROTOBUF_ADAPTER);
                        continue;
                    case 584:
                        user.picksExpiredTimestamp = nc5Var.m162487k();
                        continue;
                    case 592:
                        user.picksSwipable = nc5Var.m162483g();
                        continue;
                    case 602:
                        user.picksTag = nc5Var.m162495s();
                        continue;
                    case 610:
                        user.credit = (UserCreditData) nc5Var.m162488l(UserCreditData.PROTOBUF_ADAPTER);
                        continue;
                    case 617:
                        user.goPlaceTimestamp = nc5Var.m162484h();
                        continue;
                    case 624:
                        user.isLord = nc5Var.m162483g();
                        continue;
                    case 633:
                        user.privateAnswersUpdatedTime = nc5Var.m162484h();
                        continue;
                    case 642:
                        user.sendLetter = nc5Var.m162495s();
                        continue;
                    case 648:
                        user.sendLetterTimestamp = nc5Var.m162487k();
                        continue;
                    case 658:
                        user.receivedLetter = nc5Var.m162495s();
                        continue;
                    case 664:
                        user.receivedLetterTimestamp = nc5Var.m162487k();
                        continue;
                    case 672:
                        user.popLevel = nc5Var.m162486j();
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_RIG /* 682 */:
                        user.voice = (AudioSignature) nc5Var.m162488l(AudioSignature.PROTOBUF_ADAPTER);
                        continue;
                    case 688:
                        user.datingMode = nc5Var.m162483g();
                        continue;
                    case 698:
                        user.ussTags = (UssTags) nc5Var.m162488l(UssTags.PROTOBUF_ADAPTER);
                        continue;
                    case 706:
                        user.abroad = (UserAbroad) nc5Var.m162488l(UserAbroad.PROTOBUF_ADAPTER);
                        continue;
                    case Constants.AUDIO_MIXING_STATE_FAILED /* 714 */:
                        user.fakeStatus = (StatusesItem) nc5Var.m162488l(StatusesItem.PROTOBUF_ADAPTER);
                        continue;
                    case 722:
                        user.nameStatus = (StatusesItem) nc5Var.m162488l(StatusesItem.PROTOBUF_ADAPTER);
                        continue;
                    case 728:
                        user.displayAudit = nc5Var.m162483g();
                        continue;
                    case 738:
                        user.visitPlace = (VisitPlace) nc5Var.m162488l(VisitPlace.PROTOBUF_ADAPTER);
                        continue;
                    case 746:
                        user.publicId = nc5Var.m162495s();
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_AR_GIFT /* 754 */:
                        user.soulSettings = (UserSoulSettings) nc5Var.m162488l(UserSoulSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 760:
                        user.richListPosition = nc5Var.m162486j();
                        continue;
                    case 770:
                        user.richListTracker = nc5Var.m162495s();
                        continue;
                    case 777:
                        user.diamondVIPExpiresTime = nc5Var.m162484h();
                        continue;
                    case PutongAct.REQUEST_CODE_PICKER /* 786 */:
                        user.aiTag = nc5Var.m162495s();
                        continue;
                    case 794:
                        user.friendCommentInfo = (FriendCommentInfo) nc5Var.m162488l(FriendCommentInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 800:
                        user.minRichListPosition = nc5Var.m162486j();
                        continue;
                    case Constants.RHYTHM_PLAYER_STATE_IDLE /* 810 */:
                        user.ussTracker = nc5Var.m162495s();
                        continue;
                    case 816:
                        user.localLatestReceivedMessageTime = nc5Var.m162487k();
                        continue;
                    case 826:
                        user.hierarchy = (LiveUserLevel) nc5Var.m162488l(LiveUserLevel.PROTOBUF_ADAPTER);
                        continue;
                    case 834:
                        user.localSoulShip = (SoulShip) nc5Var.m162488l(SoulShip.PROTOBUF_ADAPTER);
                        continue;
                    case 841:
                        user.signupTime = nc5Var.m162484h();
                        continue;
                    case 850:
                        user.banStatus = (BanStatus) nc5Var.m162488l(BanStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 858:
                        user.localDiamondPrivateMatchTags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 866:
                        user.anonymousLike = (AnonymousLikeInfo) nc5Var.m162488l(AnonymousLikeInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 872:
                        user.inactivated = nc5Var.m162483g();
                        continue;
                    case 882:
                        user.status = (List) nc5Var.m162488l(UserStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 890:
                        user.gender = (Gender) nc5Var.m162488l(Gender.PROTOBUF_ADAPTER);
                        continue;
                    case 898:
                        user.source = (UserSource) nc5Var.m162488l(UserSource.PROTOBUF_ADAPTER);
                        continue;
                    case IMediaPlayer.MEDIA_INFO_V_DELAY /* 906 */:
                        user.activityUser = (ActivityUser) nc5Var.m162488l(ActivityUser.PROTOBUF_ADAPTER);
                        continue;
                    case 912:
                        user.matePlanUser = nc5Var.m162483g();
                        continue;
                    case 920:
                        user.matePlanAdUser = nc5Var.m162483g();
                        continue;
                    case 930:
                        user.regionTag = nc5Var.m162495s();
                        continue;
                    case 938:
                        user.localLikeIdentifiers = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 944:
                        user.deleted = nc5Var.m162483g();
                        continue;
                    case 954:
                        user.specialEffect = (SpecialEffect) nc5Var.m162488l(SpecialEffect.PROTOBUF_ADAPTER);
                        continue;
                    case 962:
                        user.userActivityInfo = (UserActivityInfo) nc5Var.m162488l(UserActivityInfo.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (user.status == null && list != null) {
                            user.status = UserStatus.oldEnumCovertList(list);
                        }
                        if (user.gender == null && numValueOf != null) {
                            user.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (user.source == null && numValueOf2 != null) {
                            user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (user.name == null) {
                            user.name = "";
                        }
                        if (user.location == null) {
                            user.location = Location.new_();
                        }
                        if (user.description == null) {
                            user.description = "";
                        }
                        if (user.age == null) {
                            user.age = 0;
                        }
                        if (user.pictures == null) {
                            user.pictures = new ArrayList();
                        }
                        if (user.profile == null) {
                            user.profile = Profile.new_();
                        }
                        if (user.status == null) {
                            user.status = new ArrayList();
                        }
                        if (user.gender == null) {
                            user.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (user.membership == null) {
                            user.membership = Membership.new_();
                        }
                        if (user.realName == null) {
                            user.realName = "";
                        }
                        if (user.nameRemark == null) {
                            user.nameRemark = "";
                        }
                        if (user.verifications == null) {
                            user.verifications = PicVerification.new_();
                        }
                        if (user.privateAnswers == null) {
                            user.privateAnswers = new ArrayList();
                        }
                        if (user.picksTag == null) {
                            user.picksTag = "";
                        }
                        if (user.picksTracker == null) {
                            user.picksTracker = "";
                        }
                        if (user.voice == null) {
                            user.voice = AudioSignature.new_();
                        }
                        if (user.liveState == null) {
                            user.liveState = UserLiveState.new_();
                        }
                        if (user.abroad == null) {
                            user.abroad = UserAbroad.new_();
                        }
                        if (user.medal == null) {
                            user.medal = UserMedalWrapper.new_();
                        }
                        if (user.signupStage == null) {
                            user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                        }
                        if (user.publicId == null) {
                            user.publicId = "";
                        }
                        if (user.soulSettings == null) {
                            user.soulSettings = UserSoulSettings.new_();
                        }
                        if (user.richListTracker == null) {
                            user.richListTracker = "";
                        }
                        if (user.localRichListUsers == null) {
                            user.localRichListUsers = RichListUsers.new_();
                        }
                        if (user.richListType == null) {
                            user.richListType = "";
                        }
                        if (user.liveRevenueCampaignVip == null) {
                            user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                        }
                        if (user.aiTag == null) {
                            user.aiTag = "";
                        }
                        if (user.ussTracker == null) {
                            user.ussTracker = "";
                        }
                        if (user.anchorHierarchy == null) {
                            user.anchorHierarchy = LiveAnchorLevel.new_();
                        }
                        if (user.fanbaseHierarchy == null) {
                            user.fanbaseHierarchy = LiveFansClubLevel.new_();
                        }
                        if (user.avatarFrame == null) {
                            user.avatarFrame = AvatarFrame.new_();
                        }
                        if (user.hierarchy == null) {
                            user.hierarchy = LiveUserLevel.new_();
                        }
                        if (user.banStatus == null) {
                            user.banStatus = BanStatus.new_();
                        }
                        if (user.finishedStages == null) {
                            user.finishedStages = new ArrayList();
                        }
                        if (user.activityUser == null) {
                            user.activityUser = ActivityUser.new_();
                        }
                        if (user.regionTag == null) {
                            user.regionTag = "";
                        }
                        if (user.localLikeIdentifiers == null) {
                            user.localLikeIdentifiers = new ArrayList();
                        }
                        if (user.voiceLiveState == null) {
                            user.voiceLiveState = VoiceLiveState.new_();
                        }
                        if (user.localSeeReminderType == null) {
                            user.localSeeReminderType = "";
                            return user;
                        }
                        break;
                }
            }
            return user;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(User user, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, user._id);
            String str = user.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = user.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(51, str2);
            }
            Location location = user.location;
            if (location != null) {
                codedOutputByteBufferNano.m17309K(52, location, Location.PROTOBUF_ADAPTER);
            }
            String str3 = user.description;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(53, str3);
            }
            Integer num = user.age;
            if (num != null) {
                codedOutputByteBufferNano.m17305G(54, num.intValue());
            }
            List<Media> list = user.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(55, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(56, user.createdTime);
            Profile profile = user.profile;
            if (profile != null) {
                codedOutputByteBufferNano.m17309K(57, profile, Profile.PROTOBUF_ADAPTER);
            }
            List<UserStatus> list2 = user.status;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(58, UserStatus.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Settings settings = user.settings;
            if (settings != null) {
                codedOutputByteBufferNano.m17309K(59, settings, Settings.PROTOBUF_ADAPTER);
            }
            Gender gender = user.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17305G(60, gender.ordinal());
            }
            Relationship relationship = user.localRelationship;
            if (relationship != null) {
                codedOutputByteBufferNano.m17309K(61, relationship, Relationship.PROTOBUF_ADAPTER);
            }
            Membership membership = user.membership;
            if (membership != null) {
                codedOutputByteBufferNano.m17309K(62, membership, Membership.PROTOBUF_ADAPTER);
            }
            UserSource userSource = user.source;
            if (userSource != null) {
                codedOutputByteBufferNano.m17305G(63, userSource.ordinal());
            }
            String str4 = user.realName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(64, str4);
            }
            Followship followship = user.localFollowship;
            if (followship != null) {
                codedOutputByteBufferNano.m17309K(65, followship, Followship.PROTOBUF_ADAPTER);
            }
            List<Membership> list3 = user.memberships;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(66, list3, Membership.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = user.nameRemark;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(67, str5);
            }
            UserState userState = user.state;
            if (userState != null) {
                codedOutputByteBufferNano.m17309K(68, userState, UserState.PROTOBUF_ADAPTER);
            }
            PicVerification picVerification = user.verifications;
            if (picVerification != null) {
                codedOutputByteBufferNano.m17309K(69, picVerification, PicVerification.PROTOBUF_ADAPTER);
            }
            List<String> list4 = user.abGroups;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(70, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivateAnswer> list5 = user.privateAnswers;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(71, list5, PrivateAnswer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Membership membership2 = user.peepership;
            if (membership2 != null) {
                codedOutputByteBufferNano.m17309K(72, membership2, Membership.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17307I(73, user.picksExpiredTimestamp);
            codedOutputByteBufferNano.m17299A(74, user.picksSwipable);
            String str6 = user.picksTag;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(75, str6);
            }
            UserCreditData userCreditData = user.credit;
            if (userCreditData != null) {
                codedOutputByteBufferNano.m17309K(76, userCreditData, UserCreditData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(77, user.goPlaceTimestamp);
            codedOutputByteBufferNano.m17299A(78, user.isLord);
            codedOutputByteBufferNano.m17301C(79, user.privateAnswersUpdatedTime);
            String str7 = user.sendLetter;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(80, str7);
            }
            codedOutputByteBufferNano.m17307I(81, user.sendLetterTimestamp);
            String str8 = user.receivedLetter;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(82, str8);
            }
            codedOutputByteBufferNano.m17307I(83, user.receivedLetterTimestamp);
            codedOutputByteBufferNano.m17305G(84, user.popLevel);
            AudioSignature audioSignature = user.voice;
            if (audioSignature != null) {
                codedOutputByteBufferNano.m17309K(85, audioSignature, AudioSignature.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(86, user.datingMode);
            UssTags ussTags = user.ussTags;
            if (ussTags != null) {
                codedOutputByteBufferNano.m17309K(87, ussTags, UssTags.PROTOBUF_ADAPTER);
            }
            UserAbroad userAbroad = user.abroad;
            if (userAbroad != null) {
                codedOutputByteBufferNano.m17309K(88, userAbroad, UserAbroad.PROTOBUF_ADAPTER);
            }
            StatusesItem statusesItem = user.fakeStatus;
            if (statusesItem != null) {
                codedOutputByteBufferNano.m17309K(89, statusesItem, StatusesItem.PROTOBUF_ADAPTER);
            }
            StatusesItem statusesItem2 = user.nameStatus;
            if (statusesItem2 != null) {
                codedOutputByteBufferNano.m17309K(90, statusesItem2, StatusesItem.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(91, user.displayAudit);
            VisitPlace visitPlace = user.visitPlace;
            if (visitPlace != null) {
                codedOutputByteBufferNano.m17309K(92, visitPlace, VisitPlace.PROTOBUF_ADAPTER);
            }
            String str9 = user.publicId;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(93, str9);
            }
            UserSoulSettings userSoulSettings = user.soulSettings;
            if (userSoulSettings != null) {
                codedOutputByteBufferNano.m17309K(94, userSoulSettings, UserSoulSettings.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(95, user.richListPosition);
            String str10 = user.richListTracker;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(96, str10);
            }
            codedOutputByteBufferNano.m17301C(97, user.diamondVIPExpiresTime);
            String str11 = user.aiTag;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(98, str11);
            }
            FriendCommentInfo friendCommentInfo = user.friendCommentInfo;
            if (friendCommentInfo != null) {
                codedOutputByteBufferNano.m17309K(99, friendCommentInfo, FriendCommentInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(100, user.minRichListPosition);
            String str12 = user.ussTracker;
            if (str12 != null) {
                codedOutputByteBufferNano.m17316R(101, str12);
            }
            codedOutputByteBufferNano.m17307I(102, user.localLatestReceivedMessageTime);
            LiveUserLevel liveUserLevel = user.hierarchy;
            if (liveUserLevel != null) {
                codedOutputByteBufferNano.m17309K(103, liveUserLevel, LiveUserLevel.PROTOBUF_ADAPTER);
            }
            SoulShip soulShip = user.localSoulShip;
            if (soulShip != null) {
                codedOutputByteBufferNano.m17309K(104, soulShip, SoulShip.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(105, user.signupTime);
            BanStatus banStatus = user.banStatus;
            if (banStatus != null) {
                codedOutputByteBufferNano.m17309K(106, banStatus, BanStatus.PROTOBUF_ADAPTER);
            }
            List<String> list6 = user.localDiamondPrivateMatchTags;
            if (list6 != null) {
                codedOutputByteBufferNano.m17309K(107, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            AnonymousLikeInfo anonymousLikeInfo = user.anonymousLike;
            if (anonymousLikeInfo != null) {
                codedOutputByteBufferNano.m17309K(108, anonymousLikeInfo, AnonymousLikeInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(109, user.inactivated);
            List<UserStatus> list7 = user.status;
            if (list7 != null) {
                codedOutputByteBufferNano.m17309K(110, list7, UserStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Gender gender2 = user.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17309K(111, gender2, Gender.PROTOBUF_ADAPTER);
            }
            UserSource userSource2 = user.source;
            if (userSource2 != null) {
                codedOutputByteBufferNano.m17309K(112, userSource2, UserSource.PROTOBUF_ADAPTER);
            }
            ActivityUser activityUser = user.activityUser;
            if (activityUser != null) {
                codedOutputByteBufferNano.m17309K(113, activityUser, ActivityUser.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(114, user.matePlanUser);
            codedOutputByteBufferNano.m17299A(115, user.matePlanAdUser);
            String str13 = user.regionTag;
            if (str13 != null) {
                codedOutputByteBufferNano.m17316R(116, str13);
            }
            List<String> list8 = user.localLikeIdentifiers;
            if (list8 != null) {
                codedOutputByteBufferNano.m17309K(117, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(118, user.deleted);
            SpecialEffect specialEffect = user.specialEffect;
            if (specialEffect != null) {
                codedOutputByteBufferNano.m17309K(119, specialEffect, SpecialEffect.PROTOBUF_ADAPTER);
            }
            UserActivityInfo userActivityInfo = user.userActivityInfo;
            if (userActivityInfo != null) {
                codedOutputByteBufferNano.m17309K(120, userActivityInfo, UserActivityInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<User> JSON_ADAPTER = new ObjectJsonAdapter<User>() { // from class: com.p1.mobile.putong.data.User.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return User.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public User newInstance() {
            return new User();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(User user, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2060476904:
                    if (str.equals("aiOrderPicture")) {
                        b = 0;
                    }
                    break;
                case -2027133452:
                    if (str.equals("richListType")) {
                        b = 1;
                    }
                    break;
                case -2023617739:
                    if (str.equals("popularity")) {
                        b = 2;
                    }
                    break;
                case -1852639966:
                    if (str.equals("picksTagType")) {
                        b = 3;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        b = 4;
                    }
                    break;
                case -1608179857:
                    if (str.equals("receivedLetterTimestamp")) {
                        b = 5;
                    }
                    break;
                case -1423928639:
                    if (str.equals("abroad")) {
                        b = 6;
                    }
                    break;
                case -1371052442:
                    if (str.equals("picksTracker")) {
                        b = 7;
                    }
                    break;
                case -1352291591:
                    if (str.equals("credit")) {
                        b = 8;
                    }
                    break;
                case -1340241962:
                    if (str.equals("membership")) {
                        b = 9;
                    }
                    break;
                case -1304053846:
                    if (str.equals("specialEffect")) {
                        b = 10;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 11;
                    }
                    break;
                case -1180327105:
                    if (str.equals("isLord")) {
                        b = 12;
                    }
                    break;
                case -1149954627:
                    if (str.equals("totalRewardPoint")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1140096654:
                    if (str.equals("privateAnswers")) {
                        b = 14;
                    }
                    break;
                case -1124342111:
                    if (str.equals("localLatestReceivedMessageTime")) {
                        b = 15;
                    }
                    break;
                case -1012323584:
                    if (str.equals("anchorHierarchy")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -912473865:
                    if (str.equals("picksSwipable")) {
                        b = 17;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 18;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 19;
                    }
                    break;
                case -860337847:
                    if (str.equals("realName")) {
                        b = 20;
                    }
                    break;
                case -755880288:
                    if (str.equals("localLetterUnRead")) {
                        b = 21;
                    }
                    break;
                case -748363171:
                    if (str.equals("nameStatus")) {
                        b = 22;
                    }
                    break;
                case -738519608:
                    if (str.equals("picksTag")) {
                        b = 23;
                    }
                    break;
                case -730119371:
                    if (str.equals("pictures")) {
                        b = 24;
                    }
                    break;
                case -510727163:
                    if (str.equals("signupTime")) {
                        b = 25;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 26;
                    }
                    break;
                case -309425751:
                    if (str.equals("profile")) {
                        b = 27;
                    }
                    break;
                case -135095474:
                    if (str.equals("ussTags")) {
                        b = 28;
                    }
                    break;
                case -68269379:
                    if (str.equals("soul-settings")) {
                        b = 29;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 30;
                    }
                    break;
                case 96511:
                    if (str.equals(SeeTextDynamicParam.age)) {
                        b = 31;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 40335677:
                    if (str.equals("liveRevenueCampaignVip")) {
                        b = 33;
                    }
                    break;
                case 48923363:
                    if (str.equals("richListPosition")) {
                        b = 34;
                    }
                    break;
                case 62790612:
                    if (str.equals("localSeeReminderType")) {
                        b = 35;
                    }
                    break;
                case 74337286:
                    if (str.equals("regionTag")) {
                        b = 36;
                    }
                    break;
                case 92793426:
                    if (str.equals("aiTag")) {
                        b = 37;
                    }
                    break;
                case 100048981:
                    if (str.equals("ideal")) {
                        b = 38;
                    }
                    break;
                case 103771895:
                    if (str.equals(Medal.TYPE)) {
                        b = 39;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 40;
                    }
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        b = 41;
                    }
                    break;
                case 235874275:
                    if (str.equals("ussTracker")) {
                        b = 42;
                    }
                    break;
                case 270801358:
                    if (str.equals("sendLetter")) {
                        b = 43;
                    }
                    break;
                case 301530454:
                    if (str.equals("privateAnswersUpdatedTime")) {
                        b = 44;
                    }
                    break;
                case 305944296:
                    if (str.equals("sendLetterTimestamp")) {
                        b = 45;
                    }
                    break;
                case 355106819:
                    if (str.equals("picksExpiredTimestamp")) {
                        b = 46;
                    }
                    break;
                case 361412172:
                    if (str.equals("inactivated")) {
                        b = 47;
                    }
                    break;
                case 374138772:
                    if (str.equals("avatarFrame")) {
                        b = 48;
                    }
                    break;
                case 471299413:
                    if (str.equals("abGroups")) {
                        b = 49;
                    }
                    break;
                case 491343207:
                    if (str.equals("receivedLetter")) {
                        b = 50;
                    }
                    break;
                case 634700723:
                    if (str.equals("popLevel")) {
                        b = 51;
                    }
                    break;
                case 847753673:
                    if (str.equals("peepership")) {
                        b = 52;
                    }
                    break;
                case 896792572:
                    if (str.equals("matePlanAdUser")) {
                        b = 53;
                    }
                    break;
                case 921886264:
                    if (str.equals("diamondVIPExpiresTime")) {
                        b = 54;
                    }
                    break;
                case 988270142:
                    if (str.equals("richListTracker")) {
                        b = 55;
                    }
                    break;
                case 997906181:
                    if (str.equals("liveState")) {
                        b = 56;
                    }
                    break;
                case 1105107364:
                    if (str.equals("anonymousLike")) {
                        b = 57;
                    }
                    break;
                case 1189006039:
                    if (str.equals("goPlaceTimestamp")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case 1228205496:
                    if (str.equals("verifications")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case 1293600100:
                    if (str.equals("publicId")) {
                        b = 60;
                    }
                    break;
                case 1346719942:
                    if (str.equals("signupStage")) {
                        b = 61;
                    }
                    break;
                case 1402172253:
                    if (str.equals("memberships")) {
                        b = 62;
                    }
                    break;
                case 1422771385:
                    if (str.equals("matePlanUser")) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 64;
                    }
                    break;
                case 1463766515:
                    if (str.equals("voiceLiveState")) {
                        b = 65;
                    }
                    break;
                case 1550463001:
                    if (str.equals("deleted")) {
                        b = 66;
                    }
                    break;
                case 1587592249:
                    if (str.equals("displayAudit")) {
                        b = 67;
                    }
                    break;
                case 1628844922:
                    if (str.equals("activityUser")) {
                        b = 68;
                    }
                    break;
                case 1633091495:
                    if (str.equals("fakeStatus")) {
                        b = 69;
                    }
                    break;
                case 1667482088:
                    if (str.equals("localLikeIdentifiers")) {
                        b = 70;
                    }
                    break;
                case 1694608455:
                    if (str.equals("finishedStages")) {
                        b = 71;
                    }
                    break;
                case 1799426609:
                    if (str.equals("fanbaseHierarchy")) {
                        b = 72;
                    }
                    break;
                case 1839509729:
                    if (str.equals("banStatus")) {
                        b = 73;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 74;
                    }
                    break;
                case 2115146293:
                    if (str.equals("hierarchy")) {
                        b = 75;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    user.aiOrderPicture = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    user.richListType = jsonParser.getValueAsString();
                    return true;
                case 2:
                    user.popularity = (float) jsonParser.getValueAsDouble();
                    return true;
                case 3:
                    user.picksTagType = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    user.description = jsonParser.getValueAsString();
                    return true;
                case 5:
                    user.receivedLetterTimestamp = jsonParser.getValueAsLong();
                    return true;
                case 6:
                    user.abroad = UserAbroad.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    user.picksTracker = jsonParser.getValueAsString();
                    return true;
                case 8:
                    user.credit = UserCreditData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    user.membership = Membership.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    user.specialEffect = SpecialEffect.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    user.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 12:
                    user.isLord = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    user.totalRewardPoint = TotalRewardPoint.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    user.privateAnswers = JsonAdapter.parseArray(jsonParser, PrivateAnswer.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    user.localLatestReceivedMessageTime = jsonParser.getValueAsLong();
                    return true;
                case 16:
                    user.anchorHierarchy = LiveAnchorLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    user.picksSwipable = jsonParser.getValueAsBoolean();
                    return true;
                case 18:
                    user.source = UserSource.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 19:
                    user.status = JsonAdapter.parseArray(jsonParser, UserStatus.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    user.realName = jsonParser.getValueAsString();
                    return true;
                case 21:
                    user.localLetterUnRead = jsonParser.getValueAsBoolean();
                    return true;
                case 22:
                    user.nameStatus = StatusesItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    user.picksTag = jsonParser.getValueAsString();
                    return true;
                case 24:
                    user.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    user.signupTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 26:
                    user.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 27:
                    user.profile = Profile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    user.ussTags = UssTags.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    user.soulSettings = UserSoulSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    user.f56859id = jsonParser.getValueAsString();
                    return false;
                case 31:
                    user.age = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Integer.valueOf(jsonParser.getValueAsInt());
                    return true;
                case 32:
                    user.name = jsonParser.getValueAsString();
                    return true;
                case 33:
                    user.liveRevenueCampaignVip = LiveRevenueCampaignVip.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    user.richListPosition = jsonParser.getValueAsInt();
                    return true;
                case 35:
                    user.localSeeReminderType = jsonParser.getValueAsString();
                    return true;
                case 36:
                    user.regionTag = jsonParser.getValueAsString();
                    return true;
                case 37:
                    user.aiTag = jsonParser.getValueAsString();
                    return true;
                case 38:
                    user.ideal = UserIdealInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 39:
                    user.medal = UserMedalWrapper.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 40:
                    user.state = UserState.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 41:
                    user.voice = AudioSignature.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 42:
                    user.ussTracker = jsonParser.getValueAsString();
                    return true;
                case 43:
                    user.sendLetter = jsonParser.getValueAsString();
                    return true;
                case 44:
                    user.privateAnswersUpdatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 45:
                    user.sendLetterTimestamp = jsonParser.getValueAsLong();
                    return true;
                case 46:
                    user.picksExpiredTimestamp = jsonParser.getValueAsLong();
                    return true;
                case 47:
                    user.inactivated = jsonParser.getValueAsBoolean();
                    return true;
                case 48:
                    user.avatarFrame = AvatarFrame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 49:
                    user.abGroups = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 50:
                    user.receivedLetter = jsonParser.getValueAsString();
                    return true;
                case 51:
                    user.popLevel = jsonParser.getValueAsInt();
                    return true;
                case 52:
                    user.peepership = Membership.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 53:
                    user.matePlanAdUser = jsonParser.getValueAsBoolean();
                    return true;
                case 54:
                    user.diamondVIPExpiresTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 55:
                    user.richListTracker = jsonParser.getValueAsString();
                    return true;
                case 56:
                    user.liveState = UserLiveState.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 57:
                    user.anonymousLike = AnonymousLikeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 58:
                    user.goPlaceTimestamp = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 59:
                    user.verifications = PicVerification.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 60:
                    user.publicId = jsonParser.getValueAsString();
                    return true;
                case 61:
                    user.signupStage = SignupStage.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 62:
                    user.memberships = JsonAdapter.parseArray(jsonParser, Membership.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 63:
                    user.matePlanUser = jsonParser.getValueAsBoolean();
                    return true;
                case 64:
                    user.settings = Settings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 65:
                    user.voiceLiveState = VoiceLiveState.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 66:
                    user.deleted = jsonParser.getValueAsBoolean();
                    return true;
                case 67:
                    user.displayAudit = jsonParser.getValueAsBoolean();
                    return true;
                case 68:
                    user.activityUser = ActivityUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 69:
                    user.fakeStatus = StatusesItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 70:
                    user.localLikeIdentifiers = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 71:
                    user.finishedStages = JsonAdapter.parseArray(jsonParser, StepSignupStage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 72:
                    user.fanbaseHierarchy = LiveFansClubLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                    user.banStatus = BanStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 74:
                    user.location = Location.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 75:
                    user.hierarchy = LiveUserLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(User user, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2060476904:
                    if (str.equals("aiOrderPicture")) {
                        b = 0;
                    }
                    break;
                case -2027133452:
                    if (str.equals("richListType")) {
                        b = 1;
                    }
                    break;
                case -2023617739:
                    if (str.equals("popularity")) {
                        b = 2;
                    }
                    break;
                case -1852639966:
                    if (str.equals("picksTagType")) {
                        b = 3;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        b = 4;
                    }
                    break;
                case -1608179857:
                    if (str.equals("receivedLetterTimestamp")) {
                        b = 5;
                    }
                    break;
                case -1423928639:
                    if (str.equals("abroad")) {
                        b = 6;
                    }
                    break;
                case -1371052442:
                    if (str.equals("picksTracker")) {
                        b = 7;
                    }
                    break;
                case -1352291591:
                    if (str.equals("credit")) {
                        b = 8;
                    }
                    break;
                case -1340241962:
                    if (str.equals("membership")) {
                        b = 9;
                    }
                    break;
                case -1304053846:
                    if (str.equals("specialEffect")) {
                        b = 10;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 11;
                    }
                    break;
                case -1180327105:
                    if (str.equals("isLord")) {
                        b = 12;
                    }
                    break;
                case -1149954627:
                    if (str.equals("totalRewardPoint")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1140096654:
                    if (str.equals("privateAnswers")) {
                        b = 14;
                    }
                    break;
                case -1124342111:
                    if (str.equals("localLatestReceivedMessageTime")) {
                        b = 15;
                    }
                    break;
                case -1012323584:
                    if (str.equals("anchorHierarchy")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -912473865:
                    if (str.equals("picksSwipable")) {
                        b = 17;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 18;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 19;
                    }
                    break;
                case -860337847:
                    if (str.equals("realName")) {
                        b = 20;
                    }
                    break;
                case -755880288:
                    if (str.equals("localLetterUnRead")) {
                        b = 21;
                    }
                    break;
                case -748363171:
                    if (str.equals("nameStatus")) {
                        b = 22;
                    }
                    break;
                case -738519608:
                    if (str.equals("picksTag")) {
                        b = 23;
                    }
                    break;
                case -730119371:
                    if (str.equals("pictures")) {
                        b = 24;
                    }
                    break;
                case -510727163:
                    if (str.equals("signupTime")) {
                        b = 25;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 26;
                    }
                    break;
                case -309425751:
                    if (str.equals("profile")) {
                        b = 27;
                    }
                    break;
                case -135095474:
                    if (str.equals("ussTags")) {
                        b = 28;
                    }
                    break;
                case -68269379:
                    if (str.equals("soul-settings")) {
                        b = 29;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 30;
                    }
                    break;
                case 96511:
                    if (str.equals(SeeTextDynamicParam.age)) {
                        b = 31;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 40335677:
                    if (str.equals("liveRevenueCampaignVip")) {
                        b = 33;
                    }
                    break;
                case 48923363:
                    if (str.equals("richListPosition")) {
                        b = 34;
                    }
                    break;
                case 62790612:
                    if (str.equals("localSeeReminderType")) {
                        b = 35;
                    }
                    break;
                case 74337286:
                    if (str.equals("regionTag")) {
                        b = 36;
                    }
                    break;
                case 92793426:
                    if (str.equals("aiTag")) {
                        b = 37;
                    }
                    break;
                case 100048981:
                    if (str.equals("ideal")) {
                        b = 38;
                    }
                    break;
                case 103771895:
                    if (str.equals(Medal.TYPE)) {
                        b = 39;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 40;
                    }
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        b = 41;
                    }
                    break;
                case 235874275:
                    if (str.equals("ussTracker")) {
                        b = 42;
                    }
                    break;
                case 270801358:
                    if (str.equals("sendLetter")) {
                        b = 43;
                    }
                    break;
                case 301530454:
                    if (str.equals("privateAnswersUpdatedTime")) {
                        b = 44;
                    }
                    break;
                case 305944296:
                    if (str.equals("sendLetterTimestamp")) {
                        b = 45;
                    }
                    break;
                case 355106819:
                    if (str.equals("picksExpiredTimestamp")) {
                        b = 46;
                    }
                    break;
                case 361412172:
                    if (str.equals("inactivated")) {
                        b = 47;
                    }
                    break;
                case 374138772:
                    if (str.equals("avatarFrame")) {
                        b = 48;
                    }
                    break;
                case 471299413:
                    if (str.equals("abGroups")) {
                        b = 49;
                    }
                    break;
                case 491343207:
                    if (str.equals("receivedLetter")) {
                        b = 50;
                    }
                    break;
                case 634700723:
                    if (str.equals("popLevel")) {
                        b = 51;
                    }
                    break;
                case 847753673:
                    if (str.equals("peepership")) {
                        b = 52;
                    }
                    break;
                case 896792572:
                    if (str.equals("matePlanAdUser")) {
                        b = 53;
                    }
                    break;
                case 921886264:
                    if (str.equals("diamondVIPExpiresTime")) {
                        b = 54;
                    }
                    break;
                case 988270142:
                    if (str.equals("richListTracker")) {
                        b = 55;
                    }
                    break;
                case 997906181:
                    if (str.equals("liveState")) {
                        b = 56;
                    }
                    break;
                case 1105107364:
                    if (str.equals("anonymousLike")) {
                        b = 57;
                    }
                    break;
                case 1189006039:
                    if (str.equals("goPlaceTimestamp")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case 1228205496:
                    if (str.equals("verifications")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case 1293600100:
                    if (str.equals("publicId")) {
                        b = 60;
                    }
                    break;
                case 1346719942:
                    if (str.equals("signupStage")) {
                        b = 61;
                    }
                    break;
                case 1402172253:
                    if (str.equals("memberships")) {
                        b = 62;
                    }
                    break;
                case 1422771385:
                    if (str.equals("matePlanUser")) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 64;
                    }
                    break;
                case 1463766515:
                    if (str.equals("voiceLiveState")) {
                        b = 65;
                    }
                    break;
                case 1550463001:
                    if (str.equals("deleted")) {
                        b = 66;
                    }
                    break;
                case 1587592249:
                    if (str.equals("displayAudit")) {
                        b = 67;
                    }
                    break;
                case 1628844922:
                    if (str.equals("activityUser")) {
                        b = 68;
                    }
                    break;
                case 1633091495:
                    if (str.equals("fakeStatus")) {
                        b = 69;
                    }
                    break;
                case 1667482088:
                    if (str.equals("localLikeIdentifiers")) {
                        b = 70;
                    }
                    break;
                case 1694608455:
                    if (str.equals("finishedStages")) {
                        b = 71;
                    }
                    break;
                case 1799426609:
                    if (str.equals("fanbaseHierarchy")) {
                        b = 72;
                    }
                    break;
                case 1839509729:
                    if (str.equals("banStatus")) {
                        b = 73;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 74;
                    }
                    break;
                case 2115146293:
                    if (str.equals("hierarchy")) {
                        b = 75;
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
                    return true;
                case 30:
                    return false;
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
                    return true;
                default:
                    return super.parseFieldCheck(user, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(User user, JsonGenerator jsonGenerator) throws IOException {
            String str = user.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = user.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (user.location != null) {
                jsonGenerator.writeFieldName("location");
                Location.JSON_ADAPTER.serialize(user.location, jsonGenerator, true);
            }
            String str3 = user.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            Integer num = user.age;
            if (num != null) {
                jsonGenerator.writeNumberField(SeeTextDynamicParam.age, num.intValue());
            }
            if (user.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(user.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(user.createdTime), jsonGenerator, true);
            if (user.profile != null) {
                jsonGenerator.writeFieldName("profile");
                Profile.JSON_ADAPTER.serialize(user.profile, jsonGenerator, true);
            }
            if (user.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                JsonAdapter.serializeArray(user.status, jsonGenerator, UserStatus.JSON_ADAPTER);
            }
            if (user.settings != null) {
                jsonGenerator.writeFieldName(Settings.TYPE);
                Settings.JSON_ADAPTER.serialize(user.settings, jsonGenerator, true);
            }
            if (user.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(user.gender, jsonGenerator, true);
            }
            if (user.membership != null) {
                jsonGenerator.writeFieldName("membership");
                Membership.JSON_ADAPTER.serialize(user.membership, jsonGenerator, true);
            }
            if (user.source != null) {
                jsonGenerator.writeFieldName("source");
                UserSource.JSON_ADAPTER.serialize(user.source, jsonGenerator, true);
            }
            String str4 = user.realName;
            if (str4 != null) {
                jsonGenerator.writeStringField("realName", str4);
            }
            if (user.memberships != null) {
                jsonGenerator.writeFieldName("memberships");
                JsonAdapter.serializeArray(user.memberships, jsonGenerator, Membership.JSON_ADAPTER);
            }
            if (user.state != null) {
                jsonGenerator.writeFieldName("state");
                UserState.JSON_ADAPTER.serialize(user.state, jsonGenerator, true);
            }
            if (user.verifications != null) {
                jsonGenerator.writeFieldName("verifications");
                PicVerification.JSON_ADAPTER.serialize(user.verifications, jsonGenerator, true);
            }
            if (user.abGroups != null) {
                jsonGenerator.writeFieldName("abGroups");
                JsonAdapter.serializeArray(user.abGroups, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (user.privateAnswers != null) {
                jsonGenerator.writeFieldName("privateAnswers");
                JsonAdapter.serializeArray(user.privateAnswers, jsonGenerator, PrivateAnswer.JSON_ADAPTER);
            }
            if (user.peepership != null) {
                jsonGenerator.writeFieldName("peepership");
                Membership.JSON_ADAPTER.serialize(user.peepership, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("picksExpiredTimestamp", user.picksExpiredTimestamp);
            jsonGenerator.writeBooleanField("picksSwipable", user.picksSwipable);
            String str5 = user.picksTag;
            if (str5 != null) {
                jsonGenerator.writeStringField("picksTag", str5);
            }
            if (user.credit != null) {
                jsonGenerator.writeFieldName("credit");
                UserCreditData.JSON_ADAPTER.serialize(user.credit, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("picksTagType", user.picksTagType);
            String str6 = user.picksTracker;
            if (str6 != null) {
                jsonGenerator.writeStringField("picksTracker", str6);
            }
            jsonGenerator.writeFieldName("goPlaceTimestamp");
            jsonAdapter.serialize(Double.valueOf(user.goPlaceTimestamp), jsonGenerator, true);
            jsonGenerator.writeBooleanField("isLord", user.isLord);
            jsonGenerator.writeFieldName("privateAnswersUpdatedTime");
            jsonAdapter.serialize(Double.valueOf(user.privateAnswersUpdatedTime), jsonGenerator, true);
            String str7 = user.sendLetter;
            if (str7 != null) {
                jsonGenerator.writeStringField("sendLetter", str7);
            }
            jsonGenerator.writeNumberField("sendLetterTimestamp", user.sendLetterTimestamp);
            String str8 = user.receivedLetter;
            if (str8 != null) {
                jsonGenerator.writeStringField("receivedLetter", str8);
            }
            jsonGenerator.writeNumberField("receivedLetterTimestamp", user.receivedLetterTimestamp);
            jsonGenerator.writeBooleanField("localLetterUnRead", user.localLetterUnRead);
            jsonGenerator.writeNumberField("popLevel", user.popLevel);
            if (user.voice != null) {
                jsonGenerator.writeFieldName("voice");
                AudioSignature.JSON_ADAPTER.serialize(user.voice, jsonGenerator, true);
            }
            if (user.liveState != null) {
                jsonGenerator.writeFieldName("liveState");
                UserLiveState.JSON_ADAPTER.serialize(user.liveState, jsonGenerator, true);
            }
            if (user.ussTags != null) {
                jsonGenerator.writeFieldName("ussTags");
                UssTags.JSON_ADAPTER.serialize(user.ussTags, jsonGenerator, true);
            }
            if (user.abroad != null) {
                jsonGenerator.writeFieldName("abroad");
                UserAbroad.JSON_ADAPTER.serialize(user.abroad, jsonGenerator, true);
            }
            if (user.fakeStatus != null) {
                jsonGenerator.writeFieldName("fakeStatus");
                StatusesItem.JSON_ADAPTER.serialize(user.fakeStatus, jsonGenerator, true);
            }
            if (user.nameStatus != null) {
                jsonGenerator.writeFieldName("nameStatus");
                StatusesItem.JSON_ADAPTER.serialize(user.nameStatus, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("displayAudit", user.displayAudit);
            jsonGenerator.writeBooleanField("aiOrderPicture", user.aiOrderPicture);
            if (user.medal != null) {
                jsonGenerator.writeFieldName(Medal.TYPE);
                UserMedalWrapper.JSON_ADAPTER.serialize(user.medal, jsonGenerator, true);
            }
            if (user.signupStage != null) {
                jsonGenerator.writeFieldName("signupStage");
                SignupStage.JSON_ADAPTER.serialize(user.signupStage, jsonGenerator, true);
            }
            String str9 = user.publicId;
            if (str9 != null) {
                jsonGenerator.writeStringField("publicId", str9);
            }
            if (user.soulSettings != null) {
                jsonGenerator.writeFieldName("soul-settings");
                UserSoulSettings.JSON_ADAPTER.serialize(user.soulSettings, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("richListPosition", user.richListPosition);
            String str10 = user.richListTracker;
            if (str10 != null) {
                jsonGenerator.writeStringField("richListTracker", str10);
            }
            String str11 = user.richListType;
            if (str11 != null) {
                jsonGenerator.writeStringField("richListType", str11);
            }
            if (user.liveRevenueCampaignVip != null) {
                jsonGenerator.writeFieldName("liveRevenueCampaignVip");
                LiveRevenueCampaignVip.JSON_ADAPTER.serialize(user.liveRevenueCampaignVip, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("diamondVIPExpiresTime");
            jsonAdapter.serialize(Double.valueOf(user.diamondVIPExpiresTime), jsonGenerator, true);
            String str12 = user.aiTag;
            if (str12 != null) {
                jsonGenerator.writeStringField("aiTag", str12);
            }
            if (user.totalRewardPoint != null) {
                jsonGenerator.writeFieldName("totalRewardPoint");
                TotalRewardPoint.JSON_ADAPTER.serialize(user.totalRewardPoint, jsonGenerator, true);
            }
            String str13 = user.ussTracker;
            if (str13 != null) {
                jsonGenerator.writeStringField("ussTracker", str13);
            }
            if (user.anchorHierarchy != null) {
                jsonGenerator.writeFieldName("anchorHierarchy");
                LiveAnchorLevel.JSON_ADAPTER.serialize(user.anchorHierarchy, jsonGenerator, true);
            }
            if (user.fanbaseHierarchy != null) {
                jsonGenerator.writeFieldName("fanbaseHierarchy");
                LiveFansClubLevel.JSON_ADAPTER.serialize(user.fanbaseHierarchy, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("localLatestReceivedMessageTime", user.localLatestReceivedMessageTime);
            if (user.avatarFrame != null) {
                jsonGenerator.writeFieldName("avatarFrame");
                AvatarFrame.JSON_ADAPTER.serialize(user.avatarFrame, jsonGenerator, true);
            }
            if (user.hierarchy != null) {
                jsonGenerator.writeFieldName("hierarchy");
                LiveUserLevel.JSON_ADAPTER.serialize(user.hierarchy, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("signupTime");
            jsonAdapter.serialize(Double.valueOf(user.signupTime), jsonGenerator, true);
            if (user.banStatus != null) {
                jsonGenerator.writeFieldName("banStatus");
                BanStatus.JSON_ADAPTER.serialize(user.banStatus, jsonGenerator, true);
            }
            if (user.anonymousLike != null) {
                jsonGenerator.writeFieldName("anonymousLike");
                AnonymousLikeInfo.JSON_ADAPTER.serialize(user.anonymousLike, jsonGenerator, true);
            }
            if (user.finishedStages != null) {
                jsonGenerator.writeFieldName("finishedStages");
                JsonAdapter.serializeArray(user.finishedStages, jsonGenerator, StepSignupStage.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("inactivated", user.inactivated);
            if (user.activityUser != null) {
                jsonGenerator.writeFieldName("activityUser");
                ActivityUser.JSON_ADAPTER.serialize(user.activityUser, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("matePlanUser", user.matePlanUser);
            jsonGenerator.writeBooleanField("matePlanAdUser", user.matePlanAdUser);
            String str14 = user.regionTag;
            if (str14 != null) {
                jsonGenerator.writeStringField("regionTag", str14);
            }
            if (user.localLikeIdentifiers != null) {
                jsonGenerator.writeFieldName("localLikeIdentifiers");
                JsonAdapter.serializeArray(user.localLikeIdentifiers, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("deleted", user.deleted);
            if (user.voiceLiveState != null) {
                jsonGenerator.writeFieldName("voiceLiveState");
                VoiceLiveState.JSON_ADAPTER.serialize(user.voiceLiveState, jsonGenerator, true);
            }
            String str15 = user.localSeeReminderType;
            if (str15 != null) {
                jsonGenerator.writeStringField("localSeeReminderType", str15);
            }
            if (user.specialEffect != null) {
                jsonGenerator.writeFieldName("specialEffect");
                SpecialEffect.JSON_ADAPTER.serialize(user.specialEffect, jsonGenerator, true);
            }
            if (user.ideal != null) {
                jsonGenerator.writeFieldName("ideal");
                UserIdealInfo.JSON_ADAPTER.serialize(user.ideal, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("popularity", user.popularity);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((User) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((User) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<User> _ID = new LongColumn<User>("_id") { // from class: com.p1.mobile.putong.data.User.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return Long.valueOf(user._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<User> f39673ID = new StringColumn<User>("id_c") { // from class: com.p1.mobile.putong.data.User.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.f56859id = str;
        }
    };
    public static final StringColumn<User> NAME = new StringColumn<User>("name_c") { // from class: com.p1.mobile.putong.data.User.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.name = str;
        }
    };
    public static final IntegerColumn<User> LOCATION_DISTANCE = new IntegerColumn<User>("location_distance_c") { // from class: com.p1.mobile.putong.data.User.6
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.location.distance);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.location.distance = num.intValue();
        }
    };
    public static final DoubleColumn<User> LOCATION_UPDATEDTIME = new DoubleColumn<User>("location_updatedTime_c") { // from class: com.p1.mobile.putong.data.User.7
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.location.updatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.location.updatedTime = d.doubleValue();
        }
    };
    public static final StringColumn<User> LOCATION_REGION_DISTRICT = new StringColumn<User>("location_region_district_c") { // from class: com.p1.mobile.putong.data.User.8
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.location.region.district;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.location.region.district = str;
        }
    };
    public static final StringColumn<User> LOCATION_REGION_CITY = new StringColumn<User>("location_region_city_c") { // from class: com.p1.mobile.putong.data.User.9
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.location.region.city;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.location.region.city = str;
        }
    };
    public static final StringColumn<User> LOCATION_REGION_COUNTRY = new StringColumn<User>("location_region_country_c") { // from class: com.p1.mobile.putong.data.User.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.location.region.country;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.location.region.country = str;
        }
    };
    public static final Column<User, Passby> LOCATION_PASSBY = new Column<User, Passby>("location_passby_c") { // from class: com.p1.mobile.putong.data.User.11
        @Override // com.tantanapp.common.data.orm.Column
        public Passby get(User user) {
            return user.location.passby;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Passby passby) {
            user.location.passby = passby;
        }
    };
    public static final StringColumn<User> DESCRIPTION = new StringColumn<User>("description_c") { // from class: com.p1.mobile.putong.data.User.12
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.description;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.description = str;
        }
    };
    public static final IntegerColumn<User> AGE = new IntegerColumn<User>("age_c") { // from class: com.p1.mobile.putong.data.User.13
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return user.age;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.age = num;
        }
    };
    public static final Column<User, List<Media>> PICTURES = new Column<User, List<Media>>("pictures_c") { // from class: com.p1.mobile.putong.data.User.14
        @Override // com.tantanapp.common.data.orm.Column
        public List<Media> get(User user) {
            return user.pictures;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Media> list) {
            user.pictures = list;
        }
    };
    public static final DoubleColumn<User> CREATEDTIME = new DoubleColumn<User>("createdTime_c") { // from class: com.p1.mobile.putong.data.User.15
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.createdTime = d.doubleValue();
        }
    };
    public static final StringColumn<User> PROFILE_SCHOOL = new StringColumn<User>("profile_school_c") { // from class: com.p1.mobile.putong.data.User.16
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.school;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.school = str;
        }
    };
    public static final StringColumn<User> PROFILE_HANGOUTS = new StringColumn<User>("profile_hangouts_c") { // from class: com.p1.mobile.putong.data.User.17
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.hangouts;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.hangouts = str;
        }
    };
    public static final StringColumn<User> PROFILE_HOMETOWN = new StringColumn<User>("profile_hometown_c") { // from class: com.p1.mobile.putong.data.User.18
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.hometown;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.hometown = str;
        }
    };
    public static final LongColumn<User> PROFILE_RECEIVEDLIKES = new LongColumn<User>("profile_receivedLikes_c") { // from class: com.p1.mobile.putong.data.User.19
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return user.profile.receivedLikes;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user.profile.receivedLikes = l2;
        }
    };
    public static final Column<User, List<Tag>> PROFILE_TAGS = new Column<User, List<Tag>>("profile_tags_c") { // from class: com.p1.mobile.putong.data.User.20
        @Override // com.tantanapp.common.data.orm.Column
        public List<Tag> get(User user) {
            return user.profile.tags;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Tag> list) {
            user.profile.tags = list;
        }
    };
    public static final StringColumn<User> PROFILE_JOB = new StringColumn<User>("profile_job_c") { // from class: com.p1.mobile.putong.data.User.21
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.job;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.job = str;
        }
    };
    public static final IntegerColumn<User> PROFILE_CONTACTLOOKUPS_BATCHSIZE = new IntegerColumn<User>("profile_contactLookups_batchSize_c") { // from class: com.p1.mobile.putong.data.User.22
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.contactLookups.batchSize);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.contactLookups.batchSize = num.intValue();
        }
    };
    public static final Column<User, List<Contact>> PROFILE_CONTACTLOOKUPS_LOOKUPS = new Column<User, List<Contact>>("profile_contactLookups_lookups_c") { // from class: com.p1.mobile.putong.data.User.23
        @Override // com.tantanapp.common.data.orm.Column
        public List<Contact> get(User user) {
            return user.profile.contactLookups.lookups;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Contact> list) {
            user.profile.contactLookups.lookups = list;
        }
    };
    public static final StringColumn<User> PROFILE_CONTACTLOOKUPS_NEXT = new StringColumn<User>("profile_contactLookups_next_c") { // from class: com.p1.mobile.putong.data.User.24
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.contactLookups.next;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.contactLookups.next = str;
        }
    };
    public static final Column<User, List<Social>> PROFILE_SOCIAL = new Column<User, List<Social>>("profile_social_c") { // from class: com.p1.mobile.putong.data.User.25
        @Override // com.tantanapp.common.data.orm.Column
        public List<Social> get(User user) {
            return user.profile.social;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Social> list) {
            user.profile.social = list;
        }
    };
    public static final Column<User, List<Answer>> PROFILE_ANSWERS = new Column<User, List<Answer>>("profile_answers_c") { // from class: com.p1.mobile.putong.data.User.26
        @Override // com.tantanapp.common.data.orm.Column
        public List<Answer> get(User user) {
            return user.profile.answers;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Answer> list) {
            user.profile.answers = list;
        }
    };
    public static final TEnumColumn<User, ProfileZodiac> PROFILE_ZODIAC = new TEnumColumn<User, ProfileZodiac>("str_profile_zodiac_c", "profile_zodiac_c", ProfileZodiac.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.User.27
        @Override // com.tantanapp.common.data.orm.Column
        public ProfileZodiac get(User user) {
            return user.profile.zodiac;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(User user, ProfileZodiac profileZodiac) {
            user.profile.zodiac = profileZodiac;
        }
    };
    public static final StringColumn<User> PROFILE_OCCUPATION = new StringColumn<User>("profile_occupation_c") { // from class: com.p1.mobile.putong.data.User.28
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.occupation;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.occupation = str;
        }
    };
    public static final Column<User, Settings> SETTINGS = new Column<User, Settings>("settings_c") { // from class: com.p1.mobile.putong.data.User.29
        @Override // com.tantanapp.common.data.orm.Column
        public Settings get(User user) {
            return user.settings;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Settings settings) {
            user.settings = settings;
        }
    };
    public static final TEnumColumn<User, Gender> GENDER = new TEnumColumn<User, Gender>("str_gender_c", "gender_c", Gender.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.User.30
        @Override // com.tantanapp.common.data.orm.Column
        public Gender get(User user) {
            return user.gender;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(User user, Gender gender) {
            user.gender = gender;
        }
    };
    public static final StringColumn<User> PROFILE_WORK_INDUSTRY = new StringColumn<User>("profile_work_industry_c") { // from class: com.p1.mobile.putong.data.User.31
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.work.industry;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.work.industry = str;
        }
    };
    public static final StringColumn<User> PROFILE_WORK_DEPARTMENT = new StringColumn<User>("profile_work_department_c") { // from class: com.p1.mobile.putong.data.User.32
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.work.department;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.work.department = str;
        }
    };
    public static final StringColumn<User> PROFILE_WORK_COMPANY = new StringColumn<User>("profile_work_company_c") { // from class: com.p1.mobile.putong.data.User.33
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.work.company;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.work.company = str;
        }
    };
    public static final BooleanColumn<User> PROFILE_WORK_ACTIVE = new BooleanColumn<User>("profile_work_active_c") { // from class: com.p1.mobile.putong.data.User.34
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.profile.work.active);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.profile.work.active = bool.booleanValue();
        }
    };
    public static final StringColumn<User> PROFILE_STUDIES_MAJOR = new StringColumn<User>("profile_studies_major_c") { // from class: com.p1.mobile.putong.data.User.35
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.studies.major;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.studies.major = str;
        }
    };
    public static final StringColumn<User> PROFILE_STUDIES_SCHOOL = new StringColumn<User>("profile_studies_school_c") { // from class: com.p1.mobile.putong.data.User.36
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.studies.school;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.studies.school = str;
        }
    };
    public static final BooleanColumn<User> PROFILE_STUDIES_ACTIVE = new BooleanColumn<User>("profile_studies_active_c") { // from class: com.p1.mobile.putong.data.User.37
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.profile.studies.active);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.profile.studies.active = bool.booleanValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_SCENARIOS = new Column<User, List<String>>("profile_scenarios_c") { // from class: com.p1.mobile.putong.data.User.38
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.scenarios;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.scenarios = list;
        }
    };
    public static final StringColumn<User> PROFILE_RECEIVEDLIKESRANK = new StringColumn<User>("profile_receivedLikesRank_c") { // from class: com.p1.mobile.putong.data.User.39
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.receivedLikesRank;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.receivedLikesRank = str;
        }
    };
    public static final Column<User, Relationship> LOCALRELATIONSHIP = new Column<User, Relationship>("localRelationship_c") { // from class: com.p1.mobile.putong.data.User.40
        @Override // com.tantanapp.common.data.orm.Column
        public Relationship get(User user) {
            return user.localRelationship;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Relationship relationship) {
            user.localRelationship = relationship;
        }
    };
    public static final TEnumColumn<User, MembershipType> MEMBERSHIP_NAME = new TEnumColumn<User, MembershipType>("str_membership_name_c", "membership_name_c", MembershipType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.User.41
        @Override // com.tantanapp.common.data.orm.Column
        public MembershipType get(User user) {
            return user.membership.name;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(User user, MembershipType membershipType) {
            user.membership.name = membershipType;
        }
    };
    public static final BooleanColumn<User> MEMBERSHIP_ACTIVE = new BooleanColumn<User>("membership_active_c") { // from class: com.p1.mobile.putong.data.User.42
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.membership.active);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.membership.active = bool.booleanValue();
        }
    };
    public static final DoubleColumn<User> MEMBERSHIP_EXPIRESTIME = new DoubleColumn<User>("membership_expiresTime_c") { // from class: com.p1.mobile.putong.data.User.43
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.membership.expiresTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.membership.expiresTime = d.doubleValue();
        }
    };
    public static final TEnumColumn<User, UserSource> SOURCE = new TEnumColumn<User, UserSource>("str_source_c", "source_c", UserSource.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.User.44
        @Override // com.tantanapp.common.data.orm.Column
        public UserSource get(User user) {
            return user.source;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(User user, UserSource userSource) {
            user.source = userSource;
        }
    };
    public static final BooleanColumn<User> PROFILE_STUDIES_VERIFIED = new BooleanColumn<User>("profile_studies_verified_c") { // from class: com.p1.mobile.putong.data.User.45
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.profile.studies.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.profile.studies.verified = bool.booleanValue();
        }
    };
    public static final StringColumn<User> PROFILE_STUDIES_GRADE = new StringColumn<User>("profile_studies_grade_c") { // from class: com.p1.mobile.putong.data.User.46
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.profile.studies.grade;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.profile.studies.grade = str;
        }
    };
    public static final IntegerColumn<User> PROFILE_TBH_FRIENDS = new IntegerColumn<User>("profile_tbh_friends_c") { // from class: com.p1.mobile.putong.data.User.47
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.tbh.friends);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.tbh.friends = num.intValue();
        }
    };
    public static final IntegerColumn<User> PROFILE_TBH_RECEIVEDVOTES = new IntegerColumn<User>("profile_tbh_receivedVotes_c") { // from class: com.p1.mobile.putong.data.User.48
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.tbh.receivedVotes);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.tbh.receivedVotes = num.intValue();
        }
    };
    public static final IntegerColumn<User> PROFILE_TBH_RECEIVEDVOTEDPOLLS = new IntegerColumn<User>("profile_tbh_receivedVotedPolls_c") { // from class: com.p1.mobile.putong.data.User.49
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.tbh.receivedVotedPolls);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.tbh.receivedVotedPolls = num.intValue();
        }
    };
    public static final DoubleColumn<User> PROFILE_TBH_CREATEDTIME = new DoubleColumn<User>("profile_tbh_createdTime_c") { // from class: com.p1.mobile.putong.data.User.50
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.profile.tbh.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.profile.tbh.createdTime = d.doubleValue();
        }
    };
    public static final StringColumn<User> REALNAME = new StringColumn<User>("realName_c") { // from class: com.p1.mobile.putong.data.User.51
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.realName;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.realName = str;
        }
    };
    public static final IntegerColumn<User> PROFILE_FOLLOWSHIPS_COUNTERS_FOLLOWINGS = new IntegerColumn<User>("profile_followships_counters_followings_c") { // from class: com.p1.mobile.putong.data.User.52
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.followships.counters.followings);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.followships.counters.followings = num.intValue();
        }
    };
    public static final IntegerColumn<User> PROFILE_FOLLOWSHIPS_COUNTERS_FOLLOWERS = new IntegerColumn<User>("profile_followships_counters_followers_c") { // from class: com.p1.mobile.putong.data.User.53
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.followships.counters.followers);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.followships.counters.followers = num.intValue();
        }
    };
    public static final BooleanColumn<User> PROFILE_MOMENTS_HIDEPUBLICMOMENTS = new BooleanColumn<User>("profile_moments_hidePublicMoments_c") { // from class: com.p1.mobile.putong.data.User.54
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.profile.moments.hidePublicMoments);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.profile.moments.hidePublicMoments = bool.booleanValue();
        }
    };
    public static final IntegerColumn<User> PROFILE_MOMENTS_COUNTERS_TOTALMOMENTS = new IntegerColumn<User>("profile_moments_counters_totalMoments_c") { // from class: com.p1.mobile.putong.data.User.55
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.moments.counters.totalMoments);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.moments.counters.totalMoments = num.intValue();
        }
    };
    public static final IntegerColumn<User> PROFILE_MOMENTS_COUNTERS_RECEIVEMOMENTLIKES = new IntegerColumn<User>("profile_moments_counters_receiveMomentLikes_c") { // from class: com.p1.mobile.putong.data.User.56
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.moments.counters.receiveMomentLikes);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.moments.counters.receiveMomentLikes = num.intValue();
        }
    };
    public static final Column<User, Followship> LOCALFOLLOWSHIP = new Column<User, Followship>("localFollowship_c") { // from class: com.p1.mobile.putong.data.User.57
        @Override // com.tantanapp.common.data.orm.Column
        public Followship get(User user) {
            return user.localFollowship;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Followship followship) {
            user.localFollowship = followship;
        }
    };
    public static final LongColumn<User> MEMBERSHIP_DURATION = new LongColumn<User>("membership_duration_c") { // from class: com.p1.mobile.putong.data.User.58
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return Long.valueOf(user.membership.duration);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user.membership.duration = l2.longValue();
        }
    };
    public static final Column<User, List<Membership>> MEMBERSHIPS = new Column<User, List<Membership>>("memberships_c") { // from class: com.p1.mobile.putong.data.User.59
        @Override // com.tantanapp.common.data.orm.Column
        public List<Membership> get(User user) {
            return user.memberships;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Membership> list) {
            user.memberships = list;
        }
    };
    public static final StringColumn<User> NAMEREMARK = new StringColumn<User>("nameRemark_c") { // from class: com.p1.mobile.putong.data.User.60
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.nameRemark;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.nameRemark = str;
        }
    };
    public static final Column<User, UserState> STATE = new Column<User, UserState>("state_c") { // from class: com.p1.mobile.putong.data.User.61
        @Override // com.tantanapp.common.data.orm.Column
        public UserState get(User user) {
            return user.state;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UserState userState) {
            user.state = userState;
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_PICVERIFICATIONRESULT_VERIFIED = new BooleanColumn<User>("verifications_picVerificationResult_verified_c") { // from class: com.p1.mobile.putong.data.User.62
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.picVerificationResult.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.picVerificationResult.verified = bool.booleanValue();
        }
    };
    public static final Column<User, List<String>> ABGROUPS = new Column<User, List<String>>("abGroups_c") { // from class: com.p1.mobile.putong.data.User.63
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.abGroups;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.abGroups = list;
        }
    };
    public static final Column<User, List<PrivateAnswer>> PRIVATEANSWERS = new Column<User, List<PrivateAnswer>>("privateAnswers_c") { // from class: com.p1.mobile.putong.data.User.64
        @Override // com.tantanapp.common.data.orm.Column
        public List<PrivateAnswer> get(User user) {
            return user.privateAnswers;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<PrivateAnswer> list) {
            user.privateAnswers = list;
        }
    };
    public static final Column<User, Membership> PEEPERSHIP = new Column<User, Membership>("peepership_c") { // from class: com.p1.mobile.putong.data.User.65
        @Override // com.tantanapp.common.data.orm.Column
        public Membership get(User user) {
            return user.peepership;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Membership membership) {
            user.peepership = membership;
        }
    };
    public static final LongColumn<User> PICKSEXPIREDTIMESTAMP = new LongColumn<User>("picksExpiredTimestamp_c") { // from class: com.p1.mobile.putong.data.User.66
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return Long.valueOf(user.picksExpiredTimestamp);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user.picksExpiredTimestamp = l2.longValue();
        }
    };
    public static final BooleanColumn<User> PICKSSWIPABLE = new BooleanColumn<User>("picksSwipable_c") { // from class: com.p1.mobile.putong.data.User.67
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.picksSwipable);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.picksSwipable = bool.booleanValue();
        }
    };
    public static final StringColumn<User> PICKSTAG = new StringColumn<User>("picksTag_c") { // from class: com.p1.mobile.putong.data.User.68
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.picksTag;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.picksTag = str;
        }
    };
    public static final Column<User, UserCreditData> CREDIT = new Column<User, UserCreditData>("credit_c") { // from class: com.p1.mobile.putong.data.User.69
        @Override // com.tantanapp.common.data.orm.Column
        public UserCreditData get(User user) {
            return user.credit;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UserCreditData userCreditData) {
            user.credit = userCreditData;
        }
    };
    public static final DoubleColumn<User> GOPLACETIMESTAMP = new DoubleColumn<User>("goPlaceTimestamp_c") { // from class: com.p1.mobile.putong.data.User.70
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.goPlaceTimestamp);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.goPlaceTimestamp = d.doubleValue();
        }
    };
    public static final BooleanColumn<User> ISLORD = new BooleanColumn<User>("isLord_c") { // from class: com.p1.mobile.putong.data.User.71
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.isLord);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.isLord = bool.booleanValue();
        }
    };
    public static final DoubleColumn<User> PRIVATEANSWERSUPDATEDTIME = new DoubleColumn<User>("privateAnswersUpdatedTime_c") { // from class: com.p1.mobile.putong.data.User.72
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.privateAnswersUpdatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.privateAnswersUpdatedTime = d.doubleValue();
        }
    };
    public static final StringColumn<User> SENDLETTER = new StringColumn<User>("sendLetter_c") { // from class: com.p1.mobile.putong.data.User.73
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.sendLetter;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.sendLetter = str;
        }
    };
    public static final LongColumn<User> SENDLETTERTIMESTAMP = new LongColumn<User>("sendLetterTimestamp_c") { // from class: com.p1.mobile.putong.data.User.74
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return Long.valueOf(user.sendLetterTimestamp);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user.sendLetterTimestamp = l2.longValue();
        }
    };
    public static final StringColumn<User> RECEIVEDLETTER = new StringColumn<User>("receivedLetter_c") { // from class: com.p1.mobile.putong.data.User.75
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.receivedLetter;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.receivedLetter = str;
        }
    };
    public static final LongColumn<User> RECEIVEDLETTERTIMESTAMP = new LongColumn<User>("receivedLetterTimestamp_c") { // from class: com.p1.mobile.putong.data.User.76
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return Long.valueOf(user.receivedLetterTimestamp);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user.receivedLetterTimestamp = l2.longValue();
        }
    };
    public static final IntegerColumn<User> POPLEVEL = new IntegerColumn<User>("popLevel_c") { // from class: com.p1.mobile.putong.data.User.77
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.popLevel);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.popLevel = num.intValue();
        }
    };
    public static final Column<User, AudioSignature> VOICE = new Column<User, AudioSignature>("voice_c") { // from class: com.p1.mobile.putong.data.User.78
        @Override // com.tantanapp.common.data.orm.Column
        public AudioSignature get(User user) {
            return user.voice;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, AudioSignature audioSignature) {
            user.voice = audioSignature;
        }
    };
    public static final BooleanColumn<User> DATINGMODE = new BooleanColumn<User>("datingMode_c") { // from class: com.p1.mobile.putong.data.User.79
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.datingMode);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.datingMode = bool.booleanValue();
        }
    };
    public static final Column<User, UssTags> USSTAGS = new Column<User, UssTags>("ussTags_c") { // from class: com.p1.mobile.putong.data.User.80
        @Override // com.tantanapp.common.data.orm.Column
        public UssTags get(User user) {
            return user.ussTags;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UssTags ussTags) {
            user.ussTags = ussTags;
        }
    };
    public static final TEnumColumn<User, VIPBadgeType> MEMBERSHIP_VIPBADGETYPE = new TEnumColumn<User, VIPBadgeType>("str_membership_vipBadgeType_c", "membership_vipBadgeType_c", VIPBadgeType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.User.81
        @Override // com.tantanapp.common.data.orm.Column
        public VIPBadgeType get(User user) {
            return user.membership.vipBadgeType;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(User user, VIPBadgeType vIPBadgeType) {
            user.membership.vipBadgeType = vIPBadgeType;
        }
    };
    public static final Column<User, UserAbroad> ABROAD = new Column<User, UserAbroad>("abroad_c") { // from class: com.p1.mobile.putong.data.User.82
        @Override // com.tantanapp.common.data.orm.Column
        public UserAbroad get(User user) {
            return user.abroad;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UserAbroad userAbroad) {
            user.abroad = userAbroad;
        }
    };
    public static final Column<User, StatusesItem> FAKESTATUS = new Column<User, StatusesItem>("fakeStatus_c") { // from class: com.p1.mobile.putong.data.User.83
        @Override // com.tantanapp.common.data.orm.Column
        public StatusesItem get(User user) {
            return user.fakeStatus;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, StatusesItem statusesItem) {
            user.fakeStatus = statusesItem;
        }
    };
    public static final Column<User, StatusesItem> NAMESTATUS = new Column<User, StatusesItem>("nameStatus_c") { // from class: com.p1.mobile.putong.data.User.84
        @Override // com.tantanapp.common.data.orm.Column
        public StatusesItem get(User user) {
            return user.nameStatus;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, StatusesItem statusesItem) {
            user.nameStatus = statusesItem;
        }
    };
    public static final BooleanColumn<User> DISPLAYAUDIT = new BooleanColumn<User>("displayAudit_c") { // from class: com.p1.mobile.putong.data.User.85
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.displayAudit);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.displayAudit = bool.booleanValue();
        }
    };
    public static final Column<User, VisitPlace> VISITPLACE = new Column<User, VisitPlace>("visitPlace_c") { // from class: com.p1.mobile.putong.data.User.86
        @Override // com.tantanapp.common.data.orm.Column
        public VisitPlace get(User user) {
            return user.visitPlace;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, VisitPlace visitPlace) {
            user.visitPlace = visitPlace;
        }
    };
    public static final StringColumn<User> PUBLICID = new StringColumn<User>("publicId_c") { // from class: com.p1.mobile.putong.data.User.87
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.publicId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.publicId = str;
        }
    };
    public static final Column<User, UserSoulSettings> SOULSETTINGS = new Column<User, UserSoulSettings>("soulSettings_c") { // from class: com.p1.mobile.putong.data.User.88
        @Override // com.tantanapp.common.data.orm.Column
        public UserSoulSettings get(User user) {
            return user.soulSettings;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UserSoulSettings userSoulSettings) {
            user.soulSettings = userSoulSettings;
        }
    };
    public static final IntegerColumn<User> RICHLISTPOSITION = new IntegerColumn<User>("richListPosition_c") { // from class: com.p1.mobile.putong.data.User.89
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.richListPosition);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.richListPosition = num.intValue();
        }
    };
    public static final StringColumn<User> RICHLISTTRACKER = new StringColumn<User>("richListTracker_c") { // from class: com.p1.mobile.putong.data.User.90
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.richListTracker;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.richListTracker = str;
        }
    };
    public static final DoubleColumn<User> DIAMONDVIPEXPIRESTIME = new DoubleColumn<User>("diamondVIPExpiresTime_c") { // from class: com.p1.mobile.putong.data.User.91
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.diamondVIPExpiresTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.diamondVIPExpiresTime = d.doubleValue();
        }
    };
    public static final StringColumn<User> AITAG = new StringColumn<User>("aiTag_c") { // from class: com.p1.mobile.putong.data.User.92
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.aiTag;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.aiTag = str;
        }
    };
    public static final Column<User, FriendCommentInfo> FRIENDCOMMENTINFO = new Column<User, FriendCommentInfo>("friendCommentInfo_c") { // from class: com.p1.mobile.putong.data.User.93
        @Override // com.tantanapp.common.data.orm.Column
        public FriendCommentInfo get(User user) {
            return user.friendCommentInfo;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, FriendCommentInfo friendCommentInfo) {
            user.friendCommentInfo = friendCommentInfo;
        }
    };
    public static final IntegerColumn<User> MINRICHLISTPOSITION = new IntegerColumn<User>("minRichListPosition_c") { // from class: com.p1.mobile.putong.data.User.94
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.minRichListPosition);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.minRichListPosition = num.intValue();
        }
    };
    public static final BooleanColumn<User> MEMBERSHIP_HIDEVIP = new BooleanColumn<User>("membership_hideVIP_c") { // from class: com.p1.mobile.putong.data.User.95
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.membership.hideVIP);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.membership.hideVIP = bool.booleanValue();
        }
    };
    public static final StringColumn<User> USSTRACKER = new StringColumn<User>("ussTracker_c") { // from class: com.p1.mobile.putong.data.User.96
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.ussTracker;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.ussTracker = str;
        }
    };
    public static final Column<User, UserProfileMood> PROFILE_MOOD = new Column<User, UserProfileMood>("profile_mood_c") { // from class: com.p1.mobile.putong.data.User.97
        @Override // com.tantanapp.common.data.orm.Column
        public UserProfileMood get(User user) {
            return user.profile.mood;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UserProfileMood userProfileMood) {
            user.profile.mood = userProfileMood;
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_IDCARD_VERIFIED = new BooleanColumn<User>("verifications_idCard_verified_c") { // from class: com.p1.mobile.putong.data.User.98
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.idCard.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.idCard.verified = bool.booleanValue();
        }
    };
    public static final BooleanColumn<User> MEMBERSHIP_HIDEACTIVITYTIME = new BooleanColumn<User>("membership_hideActivityTime_c") { // from class: com.p1.mobile.putong.data.User.99
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.membership.hideActivityTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.membership.hideActivityTime = bool.booleanValue();
        }
    };
    public static final TEnumColumn<User, QualificationType> PROFILE_STUDIES_QUALIFICATION = new TEnumColumn<User, QualificationType>("str_profile_studies_qualification_c", "profile_studies_qualification_c", QualificationType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.User.100
        @Override // com.tantanapp.common.data.orm.Column
        public QualificationType get(User user) {
            return user.profile.studies.qualification;
        }

        @Override // com.p051p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(User user, QualificationType qualificationType) {
            user.profile.studies.qualification = qualificationType;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BUSINESS_CARDTYPE = new Column<User, List<String>>("profile_extensions_business_cardType_c") { // from class: com.p1.mobile.putong.data.User.101
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.business.cardType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.business.cardType = list;
        }
    };
    public static final Column<User, MoodMoment> PROFILE_MOODMOMENT = new Column<User, MoodMoment>("profile_moodMoment_c") { // from class: com.p1.mobile.putong.data.User.102
        @Override // com.tantanapp.common.data.orm.Column
        public MoodMoment get(User user) {
            return user.profile.moodMoment;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, MoodMoment moodMoment) {
            user.profile.moodMoment = moodMoment;
        }
    };
    public static final Column<User, BizAnswers> PROFILE_BIZANSWERS = new Column<User, BizAnswers>("profile_bizAnswers_c") { // from class: com.p1.mobile.putong.data.User.103
        @Override // com.tantanapp.common.data.orm.Column
        public BizAnswers get(User user) {
            return user.profile.bizAnswers;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, BizAnswers bizAnswers) {
            user.profile.bizAnswers = bizAnswers;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_INTEREST_EMOJI = new Column<User, List<String>>("profile_extensions_interest_emoji_c") { // from class: com.p1.mobile.putong.data.User.104
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.interest.emoji;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.interest.emoji = list;
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_AGE_VERIFIED = new BooleanColumn<User>("verifications_age_verified_c") { // from class: com.p1.mobile.putong.data.User.105
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.age.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.age.verified = bool.booleanValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_ABOUTME = new Column<User, List<String>>("profile_extensions_basic_aboutMe_c") { // from class: com.p1.mobile.putong.data.User.106
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.aboutMe;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.aboutMe = list;
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_ANCHOR_VERIFIED = new BooleanColumn<User>("verifications_anchor_verified_c") { // from class: com.p1.mobile.putong.data.User.107
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.anchor.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.anchor.verified = bool.booleanValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_TICKLE = new Column<User, List<String>>("profile_extensions_basic_tickle_c") { // from class: com.p1.mobile.putong.data.User.108
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.tickle;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.tickle = list;
        }
    };
    public static final LongColumn<User> LOCALLATESTRECEIVEDMESSAGETIME = new LongColumn<User>("localLatestReceivedMessageTime_c") { // from class: com.p1.mobile.putong.data.User.109
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return Long.valueOf(user.localLatestReceivedMessageTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user.localLatestReceivedMessageTime = l2.longValue();
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_OTHERS_OTHERDVIPSCHOOL_VERIFIED = new BooleanColumn<User>("verifications_others_otherDVIPSchool_verified_c") { // from class: com.p1.mobile.putong.data.User.110
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.others.otherDVIPSchool.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.others.otherDVIPSchool.verified = bool.booleanValue();
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_OTHERS_OTHERDVIPCOMPANY_VERIFIED = new BooleanColumn<User>("verifications_others_otherDVIPCompany_verified_c") { // from class: com.p1.mobile.putong.data.User.111
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.others.otherDVIPCompany.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.others.otherDVIPCompany.verified = bool.booleanValue();
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_OTHERS_OTHERDVIPJOB_VERIFIED = new BooleanColumn<User>("verifications_others_otherDVIPJob_verified_c") { // from class: com.p1.mobile.putong.data.User.112
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.others.otherDVIPJob.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.others.otherDVIPJob.verified = bool.booleanValue();
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_OTHERS_OTHERDVIPSALARY_VERIFIED = new BooleanColumn<User>("verifications_others_otherDVIPSalary_verified_c") { // from class: com.p1.mobile.putong.data.User.113
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.others.otherDVIPSalary.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.others.otherDVIPSalary.verified = bool.booleanValue();
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_OTHERS_OTHERDVIPMEMBERSHIP_VERIFIED = new BooleanColumn<User>("verifications_others_otherDVIPMembership_verified_c") { // from class: com.p1.mobile.putong.data.User.114
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.others.otherDVIPMembership.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.others.otherDVIPMembership.verified = bool.booleanValue();
        }
    };
    public static final Column<User, LiveUserLevel> HIERARCHY = new Column<User, LiveUserLevel>("hierarchy_c") { // from class: com.p1.mobile.putong.data.User.115
        @Override // com.tantanapp.common.data.orm.Column
        public LiveUserLevel get(User user) {
            return user.hierarchy;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, LiveUserLevel liveUserLevel) {
            user.hierarchy = liveUserLevel;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_HOBBY = new Column<User, List<String>>("profile_extensions_basic_hobby_c") { // from class: com.p1.mobile.putong.data.User.116
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.hobby;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.hobby = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_RECENT = new Column<User, List<String>>("profile_extensions_basic_recent_c") { // from class: com.p1.mobile.putong.data.User.117
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.recent;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.recent = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_TOGETHER = new Column<User, List<String>>("profile_extensions_basic_together_c") { // from class: com.p1.mobile.putong.data.User.118
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.together;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.together = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_ANONYMITY_ID = new Column<User, List<String>>("profile_extensions_anonymity_id_c") { // from class: com.p1.mobile.putong.data.User.119
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.anonymity.f39568id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.anonymity.f39568id = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_ANONYMITY_IDENTIFIER = new Column<User, List<String>>("profile_extensions_anonymity_identifier_c") { // from class: com.p1.mobile.putong.data.User.120
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.anonymity.identifier;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.anonymity.identifier = list;
        }
    };
    public static final Column<User, SoulShip> LOCALSOULSHIP = new Column<User, SoulShip>("localSoulShip_c") { // from class: com.p1.mobile.putong.data.User.121
        @Override // com.tantanapp.common.data.orm.Column
        public SoulShip get(User user) {
            return user.localSoulShip;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, SoulShip soulShip) {
            user.localSoulShip = soulShip;
        }
    };
    public static final DoubleColumn<User> SIGNUPTIME = new DoubleColumn<User>("signupTime_c") { // from class: com.p1.mobile.putong.data.User.122
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(User user) {
            return Double.valueOf(user.signupTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Double d) {
            user.signupTime = d.doubleValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_HEADFRAME_URL = new Column<User, List<String>>("profile_extensions_headFrame_url_c") { // from class: com.p1.mobile.putong.data.User.123
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.headFrame.url;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.headFrame.url = list;
        }
    };
    public static final Column<User, List<Double>> PROFILE_EXTENSIONS_HEADFRAME_EXPIREDTIME = new Column<User, List<Double>>("profile_extensions_headFrame_expiredTime_c") { // from class: com.p1.mobile.putong.data.User.124
        @Override // com.tantanapp.common.data.orm.Column
        public List<Double> get(User user) {
            return user.profile.extensions.headFrame.expiredTime;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Double> list) {
            user.profile.extensions.headFrame.expiredTime = list;
        }
    };
    public static final Column<User, BanStatus> BANSTATUS = new Column<User, BanStatus>("banStatus_c") { // from class: com.p1.mobile.putong.data.User.125
        @Override // com.tantanapp.common.data.orm.Column
        public BanStatus get(User user) {
            return user.banStatus;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, BanStatus banStatus) {
            user.banStatus = banStatus;
        }
    };
    public static final BooleanColumn<User> PROFILE_ONLYSHOWABOUTMEINSIDE = new BooleanColumn<User>("profile_onlyShowAboutMeInside_c") { // from class: com.p1.mobile.putong.data.User.126
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.profile.onlyShowAboutMeInside);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.profile.onlyShowAboutMeInside = bool.booleanValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_FRIENDSTATUS_LABELTYPE = new Column<User, List<String>>("profile_extensions_friendStatus_labelType_c") { // from class: com.p1.mobile.putong.data.User.127
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.friendStatus.labelType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.friendStatus.labelType = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_FRIENDSTATUS_LABELNAME = new Column<User, List<String>>("profile_extensions_friendStatus_labelName_c") { // from class: com.p1.mobile.putong.data.User.128
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.friendStatus.labelName;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.friendStatus.labelName = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_FRIENDSTATUS_ENDTIME = new Column<User, List<String>>("profile_extensions_friendStatus_endTime_c") { // from class: com.p1.mobile.putong.data.User.129
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.friendStatus.endTime;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.friendStatus.endTime = list;
        }
    };
    public static final Column<User, List<String>> LOCALDIAMONDPRIVATEMATCHTAGS = new Column<User, List<String>>("localDiamondPrivateMatchTags_c") { // from class: com.p1.mobile.putong.data.User.130
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.localDiamondPrivateMatchTags;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.localDiamondPrivateMatchTags = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_INTEREST = new Column<User, List<String>>("profile_extensions_basic_interest_c") { // from class: com.p1.mobile.putong.data.User.131
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.interest;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.interest = list;
        }
    };
    public static final Column<User, AnonymousLikeInfo> ANONYMOUSLIKE = new Column<User, AnonymousLikeInfo>("anonymousLike_c") { // from class: com.p1.mobile.putong.data.User.132
        @Override // com.tantanapp.common.data.orm.Column
        public AnonymousLikeInfo get(User user) {
            return user.anonymousLike;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, AnonymousLikeInfo anonymousLikeInfo) {
            user.anonymousLike = anonymousLikeInfo;
        }
    };
    public static final BooleanColumn<User> INACTIVATED = new BooleanColumn<User>("inactivated_c") { // from class: com.p1.mobile.putong.data.User.133
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.inactivated);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.inactivated = bool.booleanValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_COUNTRY = new Column<User, List<String>>("profile_extensions_basic_country_c") { // from class: com.p1.mobile.putong.data.User.134
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.country;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.country = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_PROVINCE = new Column<User, List<String>>("profile_extensions_basic_province_c") { // from class: com.p1.mobile.putong.data.User.135
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.province;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.province = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_CITY = new Column<User, List<String>>("profile_extensions_basic_city_c") { // from class: com.p1.mobile.putong.data.User.136
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.city;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.city = list;
        }
    };
    public static final Column<User, List<UserStatus>> STR_STATUS = new Column<User, List<UserStatus>>("str_status_c") { // from class: com.p1.mobile.putong.data.User.137
        @Override // com.tantanapp.common.data.orm.Column
        public List<UserStatus> get(User user) {
            return user.status;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<UserStatus> list) {
            user.status = list;
        }
    };
    public static final Column<User, List<LocationInvisibleField>> STR_LOCATION_INVISIBLEFIELDS = new Column<User, List<LocationInvisibleField>>("str_location_invisibleFields_c") { // from class: com.p1.mobile.putong.data.User.138
        @Override // com.tantanapp.common.data.orm.Column
        public List<LocationInvisibleField> get(User user) {
            return user.location.invisibleFields;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<LocationInvisibleField> list) {
            user.location.invisibleFields = list;
        }
    };
    public static final Column<User, List<BloodType>> STR_PROFILE_EXTENSIONS_PHYSICAL_BLOODTYPE = new Column<User, List<BloodType>>("str_profile_extensions_physical_bloodType_c") { // from class: com.p1.mobile.putong.data.User.139
        @Override // com.tantanapp.common.data.orm.Column
        public List<BloodType> get(User user) {
            return user.profile.extensions.physical.bloodType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<BloodType> list) {
            user.profile.extensions.physical.bloodType = list;
        }
    };
    public static final Column<User, List<Purpose>> STR_PROFILE_EXTENSIONS_BASIC_FRIENDPURPOSE = new Column<User, List<Purpose>>("str_profile_extensions_basic_friendPurpose_c") { // from class: com.p1.mobile.putong.data.User.140
        @Override // com.tantanapp.common.data.orm.Column
        public List<Purpose> get(User user) {
            return user.profile.extensions.basic.friendPurpose;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Purpose> list) {
            user.profile.extensions.basic.friendPurpose = list;
        }
    };
    public static final Column<User, List<FriendState>> STR_PROFILE_EXTENSIONS_FRIENDSTATUS_STATUS = new Column<User, List<FriendState>>("str_profile_extensions_friendStatus_status_c") { // from class: com.p1.mobile.putong.data.User.141
        @Override // com.tantanapp.common.data.orm.Column
        public List<FriendState> get(User user) {
            return user.profile.extensions.friendStatus.status;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<FriendState> list) {
            user.profile.extensions.friendStatus.status = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_MOMENTSWITCH_NOSYNCMOMENT = new Column<User, List<String>>("profile_extensions_momentSwitch_noSyncMoment_c") { // from class: com.p1.mobile.putong.data.User.142
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.momentSwitch.noSyncMoment;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.momentSwitch.noSyncMoment = list;
        }
    };
    public static final Column<User, UserWealth> PROFILE_EXTENSIONS_WEALTH = new Column<User, UserWealth>("profile_extensions_wealth_c") { // from class: com.p1.mobile.putong.data.User.143
        @Override // com.tantanapp.common.data.orm.Column
        public UserWealth get(User user) {
            return user.profile.extensions.wealth;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UserWealth userWealth) {
            user.profile.extensions.wealth = userWealth;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_QUALIFICATION = new Column<User, List<String>>("profile_extensions_basic_qualification_c") { // from class: com.p1.mobile.putong.data.User.144
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.qualification;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.qualification = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_PHYSICAL_HEIGHT = new Column<User, List<String>>("profile_extensions_physical_height_c") { // from class: com.p1.mobile.putong.data.User.145
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.physical.height;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.physical.height = list;
        }
    };
    public static final Column<User, ProfileCompletion> PROFILE_EXTENSIONS_PROFILECOMPLETION = new Column<User, ProfileCompletion>("profile_extensions_profileCompletion_c") { // from class: com.p1.mobile.putong.data.User.146
        @Override // com.tantanapp.common.data.orm.Column
        public ProfileCompletion get(User user) {
            return user.profile.extensions.profileCompletion;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, ProfileCompletion profileCompletion) {
            user.profile.extensions.profileCompletion = profileCompletion;
        }
    };
    public static final Column<User, VoiceSignature> PROFILE_EXTENSIONS_VOICESIGNATURE = new Column<User, VoiceSignature>("profile_extensions_voiceSignature_c") { // from class: com.p1.mobile.putong.data.User.147
        @Override // com.tantanapp.common.data.orm.Column
        public VoiceSignature get(User user) {
            return user.profile.extensions.voiceSignature;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, VoiceSignature voiceSignature) {
            user.profile.extensions.voiceSignature = voiceSignature;
        }
    };
    public static final StringColumn<User> ACTIVITYUSER_ACTION = new StringColumn<User>("activityUser_action_c") { // from class: com.p1.mobile.putong.data.User.148
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.activityUser.action;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.activityUser.action = str;
        }
    };
    public static final LongColumn<User> ACTIVITYUSER_SCORE = new LongColumn<User>("activityUser_score_c") { // from class: com.p1.mobile.putong.data.User.149
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(User user) {
            return Long.valueOf(user.activityUser.score);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Long l2) {
            user.activityUser.score = l2.longValue();
        }
    };
    public static final BooleanColumn<User> MATEPLANUSER = new BooleanColumn<User>("matePlanUser_c") { // from class: com.p1.mobile.putong.data.User.150
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.matePlanUser);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.matePlanUser = bool.booleanValue();
        }
    };
    public static final BooleanColumn<User> MATEPLANADUSER = new BooleanColumn<User>("matePlanAdUser_c") { // from class: com.p1.mobile.putong.data.User.151
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.matePlanAdUser);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.matePlanAdUser = bool.booleanValue();
        }
    };
    public static final StringColumn<User> REGIONTAG = new StringColumn<User>("regionTag_c") { // from class: com.p1.mobile.putong.data.User.152
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.regionTag;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.regionTag = str;
        }
    };
    public static final Column<User, List<String>> LOCALLIKEIDENTIFIERS = new Column<User, List<String>>("localLikeIdentifiers_c") { // from class: com.p1.mobile.putong.data.User.153
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.localLikeIdentifiers;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.localLikeIdentifiers = list;
        }
    };
    public static final BooleanColumn<User> DELETED = new BooleanColumn<User>("deleted_c") { // from class: com.p1.mobile.putong.data.User.154
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.deleted);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.deleted = bool.booleanValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_INTEREST_TAGS = new Column<User, List<String>>("profile_extensions_interest_tags_c") { // from class: com.p1.mobile.putong.data.User.155
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.interest.tags;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.interest.tags = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_LIVE_VOICEIMGID = new Column<User, List<String>>("profile_extensions_live_voiceImgId_c") { // from class: com.p1.mobile.putong.data.User.156
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.live.voiceImgId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.live.voiceImgId = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_LIVE_VOICEIMGURL = new Column<User, List<String>>("profile_extensions_live_voiceImgUrl_c") { // from class: com.p1.mobile.putong.data.User.157
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.live.voiceImgUrl;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.live.voiceImgUrl = list;
        }
    };
    public static final Column<User, ProfileMate> PROFILE_EXTENSIONS_MATE = new Column<User, ProfileMate>("profile_extensions_mate_c") { // from class: com.p1.mobile.putong.data.User.158
        @Override // com.tantanapp.common.data.orm.Column
        public ProfileMate get(User user) {
            return user.profile.extensions.mate;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, ProfileMate profileMate) {
            user.profile.extensions.mate = profileMate;
        }
    };
    public static final Column<User, PetInfo> PROFILE_EXTENSIONS_PET = new Column<User, PetInfo>("profile_extensions_pet_c") { // from class: com.p1.mobile.putong.data.User.159
        @Override // com.tantanapp.common.data.orm.Column
        public PetInfo get(User user) {
            return user.profile.extensions.pet;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, PetInfo petInfo) {
            user.profile.extensions.pet = petInfo;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_TAILFRAME_URL = new Column<User, List<String>>("profile_extensions_tailFrame_url_c") { // from class: com.p1.mobile.putong.data.User.160
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.tailFrame.url;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.tailFrame.url = list;
        }
    };
    public static final Column<User, List<Double>> PROFILE_EXTENSIONS_TAILFRAME_EXPIREDTIME = new Column<User, List<Double>>("profile_extensions_tailFrame_expiredTime_c") { // from class: com.p1.mobile.putong.data.User.161
        @Override // com.tantanapp.common.data.orm.Column
        public List<Double> get(User user) {
            return user.profile.extensions.tailFrame.expiredTime;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Double> list) {
            user.profile.extensions.tailFrame.expiredTime = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BUSINESS_AVATARID = new Column<User, List<String>>("profile_extensions_business_avatarID_c") { // from class: com.p1.mobile.putong.data.User.162
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.business.avatarID;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.business.avatarID = list;
        }
    };
    public static final Column<User, List<Long>> PROFILE_EXTENSIONS_BUSINESS_AVATAREXPIRETIME = new Column<User, List<Long>>("profile_extensions_business_avatarExpireTime_c") { // from class: com.p1.mobile.putong.data.User.163
        @Override // com.tantanapp.common.data.orm.Column
        public List<Long> get(User user) {
            return user.profile.extensions.business.avatarExpireTime;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<Long> list) {
            user.profile.extensions.business.avatarExpireTime = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BUSINESS_AVATARCLOSE = new Column<User, List<String>>("profile_extensions_business_avatarClose_c") { // from class: com.p1.mobile.putong.data.User.164
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.business.avatarClose;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.business.avatarClose = list;
        }
    };
    public static final Column<User, SpecialEffect> SPECIALEFFECT = new Column<User, SpecialEffect>("specialEffect_c") { // from class: com.p1.mobile.putong.data.User.165
        @Override // com.tantanapp.common.data.orm.Column
        public SpecialEffect get(User user) {
            return user.specialEffect;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, SpecialEffect specialEffect) {
            user.specialEffect = specialEffect;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_ETHNICITY = new Column<User, List<String>>("profile_extensions_basic_ethnicity_c") { // from class: com.p1.mobile.putong.data.User.166
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.ethnicity;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.ethnicity = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_LANGUAGE = new Column<User, List<String>>("profile_extensions_basic_language_c") { // from class: com.p1.mobile.putong.data.User.167
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.language;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.language = list;
        }
    };
    public static final Column<User, VoiceAvatarFrame> PROFILE_EXTENSIONS_VOICEAVATARFRAME = new Column<User, VoiceAvatarFrame>("profile_extensions_voiceAvatarFrame_c") { // from class: com.p1.mobile.putong.data.User.168
        @Override // com.tantanapp.common.data.orm.Column
        public VoiceAvatarFrame get(User user) {
            return user.profile.extensions.voiceAvatarFrame;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, VoiceAvatarFrame voiceAvatarFrame) {
            user.profile.extensions.voiceAvatarFrame = voiceAvatarFrame;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_PHYSICAL_HEIGHTIMG = new Column<User, List<String>>("profile_extensions_physical_heightImg_c") { // from class: com.p1.mobile.putong.data.User.169
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.physical.heightImg;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.physical.heightImg = list;
        }
    };
    public static final Column<User, ProfileExtensionMarriage> PROFILE_EXTENSIONS_MARRIAGE = new Column<User, ProfileExtensionMarriage>("profile_extensions_marriage_c") { // from class: com.p1.mobile.putong.data.User.170
        @Override // com.tantanapp.common.data.orm.Column
        public ProfileExtensionMarriage get(User user) {
            return user.profile.extensions.marriage;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, ProfileExtensionMarriage profileExtensionMarriage) {
            user.profile.extensions.marriage = profileExtensionMarriage;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_ADDRESS = new Column<User, List<String>>("profile_extensions_basic_address_c") { // from class: com.p1.mobile.putong.data.User.171
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.address;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.address = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_FAMILYBACKGROUND = new Column<User, List<String>>("profile_extensions_basic_familyBackground_c") { // from class: com.p1.mobile.putong.data.User.172
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.familyBackground;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.familyBackground = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_PHYSICAL_WEIGHT = new Column<User, List<String>>("profile_extensions_physical_weight_c") { // from class: com.p1.mobile.putong.data.User.173
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.physical.weight;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.physical.weight = list;
        }
    };
    public static final BooleanColumn<User> VERIFICATIONS_OTHERS_OTHERCTDID_VERIFIED = new BooleanColumn<User>("verifications_others_otherCTDID_verified_c") { // from class: com.p1.mobile.putong.data.User.174
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(User user) {
            return Boolean.valueOf(user.verifications.others.otherCTDID.verified);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Boolean bool) {
            user.verifications.others.otherCTDID.verified = bool.booleanValue();
        }
    };
    public static final Column<User, ExtensionGame> PROFILE_EXTENSIONS_GAME = new Column<User, ExtensionGame>("profile_extensions_game_c") { // from class: com.p1.mobile.putong.data.User.175
        @Override // com.tantanapp.common.data.orm.Column
        public ExtensionGame get(User user) {
            return user.profile.extensions.game;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, ExtensionGame extensionGame) {
            user.profile.extensions.game = extensionGame;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_FACIALFEATURE = new Column<User, List<String>>("profile_extensions_basic_facialFeature_c") { // from class: com.p1.mobile.putong.data.User.176
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.facialFeature;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.facialFeature = list;
        }
    };
    public static final IntegerColumn<User> VERIFICATIONS_IDCARD_AGE = new IntegerColumn<User>("verifications_idCard_age_c") { // from class: com.p1.mobile.putong.data.User.177
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.verifications.idCard.age);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.verifications.idCard.age = num.intValue();
        }
    };
    public static final StringColumn<User> VERIFICATIONS_IDCARD_FIRST4 = new StringColumn<User>("verifications_idCard_first4_c") { // from class: com.p1.mobile.putong.data.User.178
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.verifications.idCard.first4;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.verifications.idCard.first4 = str;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_PHYSICAL_FITNESS = new Column<User, List<String>>("profile_extensions_physical_fitness_c") { // from class: com.p1.mobile.putong.data.User.179
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.physical.fitness;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.physical.fitness = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_PHYSICAL_DRINK = new Column<User, List<String>>("profile_extensions_physical_drink_c") { // from class: com.p1.mobile.putong.data.User.180
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.physical.drink;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.physical.drink = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_PHYSICAL_SMOKE = new Column<User, List<String>>("profile_extensions_physical_smoke_c") { // from class: com.p1.mobile.putong.data.User.181
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.physical.smoke;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.physical.smoke = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_MBTI = new Column<User, List<String>>("profile_extensions_basic_mbti_c") { // from class: com.p1.mobile.putong.data.User.182
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.mbti;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.mbti = list;
        }
    };
    public static final Column<User, UserActivityInfo> USERACTIVITYINFO = new Column<User, UserActivityInfo>("userActivityInfo_c") { // from class: com.p1.mobile.putong.data.User.183
        @Override // com.tantanapp.common.data.orm.Column
        public UserActivityInfo get(User user) {
            return user.userActivityInfo;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, UserActivityInfo userActivityInfo) {
            user.userActivityInfo = userActivityInfo;
        }
    };
    public static final Column<User, List<IdealTag>> PROFILE_EXTENSIONS_BASIC_IDEAL = new Column<User, List<IdealTag>>("profile_extensions_basic_ideal_c") { // from class: com.p1.mobile.putong.data.User.184
        @Override // com.tantanapp.common.data.orm.Column
        public List<IdealTag> get(User user) {
            return user.profile.extensions.basic.ideal;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<IdealTag> list) {
            user.profile.extensions.basic.ideal = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_UNIDEAL = new Column<User, List<String>>("profile_extensions_basic_unideal_c") { // from class: com.p1.mobile.putong.data.User.185
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.unideal;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.unideal = list;
        }
    };
    public static final IntegerColumn<User> PROFILE_MOMENTS_COUNTERS_TOTALNORMALMOMENTS = new IntegerColumn<User>("profile_moments_counters_totalNormalMoments_c") { // from class: com.p1.mobile.putong.data.User.186
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(User user) {
            return Integer.valueOf(user.profile.moments.counters.totalNormalMoments);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, Integer num) {
            user.profile.moments.counters.totalNormalMoments = num.intValue();
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_INTEREST_TASTE = new Column<User, List<String>>("profile_extensions_interest_taste_c") { // from class: com.p1.mobile.putong.data.User.187
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.interest.taste;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.interest.taste = list;
        }
    };
    public static final StringColumn<User> LOCATION_REGION_PROVINCE = new StringColumn<User>("location_region_province_c") { // from class: com.p1.mobile.putong.data.User.188
        @Override // com.tantanapp.common.data.orm.Column
        public String get(User user) {
            return user.location.region.province;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, String str) {
            user.location.region.province = str;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_INTLFRIENDPURPOSE = new Column<User, List<String>>("profile_extensions_basic_intlFriendPurpose_c") { // from class: com.p1.mobile.putong.data.User.189
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.intlFriendPurpose;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.intlFriendPurpose = list;
        }
    };
    public static final Column<User, List<String>> PROFILE_EXTENSIONS_BASIC_INTLFRIENDPURPOSEV2 = new Column<User, List<String>>("profile_extensions_basic_intlFriendPurposeV2_c") { // from class: com.p1.mobile.putong.data.User.190
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(User user) {
            return user.profile.extensions.basic.intlFriendPurposeV2;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(User user, List<String> list) {
            user.profile.extensions.basic.intlFriendPurposeV2 = list;
        }
    };
    public static vzf0<User> DB_ADAPTER = new vzf0<User>() { // from class: com.p1.mobile.putong.data.User.191
        @Override // p153l.vzf0
        public String CREATE_TABLE(wzh0 wzh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,location_distance_c INTEGER,location_updatedTime_c REAL,location_region_district_c TEXT,location_region_city_c TEXT,location_region_country_c TEXT,location_passby_c BLOB,description_c TEXT,age_c INTEGER,pictures_c BLOB,createdTime_c REAL,profile_school_c TEXT,profile_hangouts_c TEXT,profile_hometown_c TEXT,profile_receivedLikes_c INTEGER,profile_tags_c BLOB,profile_job_c TEXT,profile_contactLookups_batchSize_c INTEGER,profile_contactLookups_lookups_c BLOB,profile_contactLookups_next_c TEXT,profile_social_c BLOB,profile_answers_c BLOB,profile_zodiac_c INTEGER,profile_occupation_c TEXT,status_c BLOB,settings_c BLOB,gender_c INTEGER,profile_work_industry_c TEXT,profile_work_department_c TEXT,profile_work_company_c TEXT,profile_work_active_c INTEGER,profile_studies_major_c TEXT,profile_studies_school_c TEXT,profile_studies_active_c INTEGER,profile_scenarios_c BLOB,profile_receivedLikesRank_c TEXT,localRelationship_c BLOB,membership_name_c INTEGER,membership_active_c INTEGER,membership_expiresTime_c REAL,source_c INTEGER,profile_studies_verified_c INTEGER,profile_studies_grade_c TEXT,profile_tbh_friends_c INTEGER,profile_tbh_receivedVotes_c INTEGER,profile_tbh_receivedVotedPolls_c INTEGER,profile_tbh_createdTime_c REAL,realName_c TEXT,profile_followships_counters_followings_c INTEGER,profile_followships_counters_followers_c INTEGER,profile_moments_hidePublicMoments_c INTEGER,profile_moments_counters_totalMoments_c INTEGER,profile_moments_counters_receiveMomentLikes_c INTEGER,localFollowship_c BLOB,membership_duration_c INTEGER,memberships_c BLOB,nameRemark_c TEXT,state_c BLOB,verifications_picVerificationResult_verified_c INTEGER,abGroups_c BLOB,privateAnswers_c BLOB,peepership_c BLOB,picksExpiredTimestamp_c INTEGER,picksSwipable_c INTEGER,picksTag_c TEXT,credit_c BLOB,goPlaceTimestamp_c REAL,isLord_c INTEGER,privateAnswersUpdatedTime_c REAL,sendLetter_c TEXT,sendLetterTimestamp_c INTEGER,receivedLetter_c TEXT,receivedLetterTimestamp_c INTEGER,popLevel_c INTEGER,voice_c BLOB,datingMode_c INTEGER,ussTags_c BLOB,membership_vipBadgeType_c INTEGER,abroad_c BLOB,fakeStatus_c BLOB,nameStatus_c BLOB,displayAudit_c INTEGER,visitPlace_c BLOB,publicId_c TEXT,soulSettings_c BLOB,richListPosition_c INTEGER,richListTracker_c TEXT,diamondVIPExpiresTime_c REAL,aiTag_c TEXT,friendCommentInfo_c BLOB,minRichListPosition_c INTEGER,membership_hideVIP_c INTEGER,ussTracker_c TEXT,profile_mood_c BLOB,verifications_idCard_verified_c INTEGER,membership_hideActivityTime_c INTEGER,profile_studies_qualification_c INTEGER,location_invisibleFields_c BLOB,profile_extensions_physical_bloodType_c BLOB,profile_extensions_business_cardType_c BLOB,profile_moodMoment_c BLOB,profile_bizAnswers_c BLOB,profile_extensions_interest_emoji_c BLOB,verifications_age_verified_c INTEGER,profile_extensions_basic_aboutMe_c BLOB,verifications_anchor_verified_c INTEGER,profile_extensions_basic_tickle_c BLOB,localLatestReceivedMessageTime_c INTEGER,verifications_others_otherDVIPSchool_verified_c INTEGER,verifications_others_otherDVIPCompany_verified_c INTEGER,verifications_others_otherDVIPJob_verified_c INTEGER,verifications_others_otherDVIPSalary_verified_c INTEGER,verifications_others_otherDVIPMembership_verified_c INTEGER,hierarchy_c BLOB,profile_extensions_basic_hobby_c BLOB,profile_extensions_basic_recent_c BLOB,profile_extensions_basic_together_c BLOB,profile_extensions_anonymity_id_c BLOB,profile_extensions_anonymity_identifier_c BLOB,localSoulShip_c BLOB,signupTime_c REAL,profile_extensions_headFrame_url_c BLOB,profile_extensions_headFrame_expiredTime_c BLOB,banStatus_c BLOB,profile_onlyShowAboutMeInside_c INTEGER,profile_extensions_basic_friendPurpose_c BLOB,profile_extensions_friendStatus_labelType_c BLOB,profile_extensions_friendStatus_labelName_c BLOB,profile_extensions_friendStatus_endTime_c BLOB,profile_extensions_friendStatus_status_c BLOB,localDiamondPrivateMatchTags_c BLOB,profile_extensions_basic_interest_c BLOB,anonymousLike_c BLOB,inactivated_c INTEGER,profile_extensions_basic_country_c BLOB,profile_extensions_basic_province_c BLOB,profile_extensions_basic_city_c BLOB,str_profile_zodiac_c TEXT,str_status_c BLOB,str_gender_c TEXT,str_membership_name_c TEXT,str_source_c TEXT,str_membership_vipBadgeType_c TEXT,str_profile_studies_qualification_c TEXT,str_location_invisibleFields_c BLOB,str_profile_extensions_physical_bloodType_c BLOB,str_profile_extensions_basic_friendPurpose_c BLOB,str_profile_extensions_friendStatus_status_c BLOB,profile_extensions_momentSwitch_noSyncMoment_c BLOB,profile_extensions_wealth_c BLOB,profile_extensions_basic_qualification_c BLOB,profile_extensions_physical_height_c BLOB,profile_extensions_profileCompletion_c BLOB,profile_extensions_voiceSignature_c BLOB,activityUser_action_c TEXT,activityUser_score_c INTEGER,matePlanUser_c INTEGER,matePlanAdUser_c INTEGER,regionTag_c TEXT,localLikeIdentifiers_c BLOB,deleted_c INTEGER,profile_extensions_interest_tags_c BLOB,profile_extensions_live_voiceImgId_c BLOB,profile_extensions_live_voiceImgUrl_c BLOB,profile_extensions_mate_c BLOB,profile_extensions_pet_c BLOB,profile_extensions_tailFrame_url_c BLOB,profile_extensions_tailFrame_expiredTime_c BLOB,profile_extensions_business_avatarID_c BLOB,profile_extensions_business_avatarExpireTime_c BLOB,profile_extensions_business_avatarClose_c BLOB,specialEffect_c BLOB,profile_extensions_basic_ethnicity_c BLOB,profile_extensions_basic_language_c BLOB,profile_extensions_voiceAvatarFrame_c BLOB,profile_extensions_physical_heightImg_c BLOB,profile_extensions_marriage_c BLOB,profile_extensions_basic_address_c BLOB,profile_extensions_basic_familyBackground_c BLOB,profile_extensions_physical_weight_c BLOB,verifications_others_otherCTDID_verified_c INTEGER,profile_extensions_game_c BLOB,profile_extensions_basic_facialFeature_c BLOB,verifications_idCard_age_c INTEGER,verifications_idCard_first4_c TEXT,profile_extensions_physical_fitness_c BLOB,profile_extensions_physical_drink_c BLOB,profile_extensions_physical_smoke_c BLOB,profile_extensions_basic_mbti_c BLOB,userActivityInfo_c BLOB,profile_extensions_basic_ideal_c BLOB,profile_extensions_basic_unideal_c BLOB,profile_moments_counters_totalNormalMoments_c INTEGER,profile_extensions_interest_taste_c BLOB,location_region_province_c TEXT,profile_extensions_basic_intlFriendPurpose_c BLOB,profile_extensions_basic_intlFriendPurposeV2_c BLOB)";
        }

        @Override // p153l.vzf0
        public Class getDataClass() {
            return User.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public User init() {
            User user = new User();
            if (user.name == null) {
                user.name = "";
            }
            if (user.location == null) {
                user.location = Location.new_();
            }
            if (user.description == null) {
                user.description = "";
            }
            if (user.age == null) {
                user.age = 0;
            }
            if (user.pictures == null) {
                user.pictures = new ArrayList();
            }
            if (user.profile == null) {
                user.profile = Profile.new_();
            }
            if (user.status == null) {
                user.status = new ArrayList();
            }
            if (user.gender == null) {
                user.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
            }
            if (user.membership == null) {
                user.membership = Membership.new_();
            }
            if (user.realName == null) {
                user.realName = "";
            }
            if (user.nameRemark == null) {
                user.nameRemark = "";
            }
            if (user.verifications == null) {
                user.verifications = PicVerification.new_();
            }
            if (user.privateAnswers == null) {
                user.privateAnswers = new ArrayList();
            }
            if (user.picksTag == null) {
                user.picksTag = "";
            }
            if (user.picksTracker == null) {
                user.picksTracker = "";
            }
            if (user.voice == null) {
                user.voice = AudioSignature.new_();
            }
            if (user.liveState == null) {
                user.liveState = UserLiveState.new_();
            }
            if (user.abroad == null) {
                user.abroad = UserAbroad.new_();
            }
            if (user.medal == null) {
                user.medal = UserMedalWrapper.new_();
            }
            if (user.signupStage == null) {
                user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
            }
            if (user.publicId == null) {
                user.publicId = "";
            }
            if (user.soulSettings == null) {
                user.soulSettings = UserSoulSettings.new_();
            }
            if (user.richListTracker == null) {
                user.richListTracker = "";
            }
            if (user.localRichListUsers == null) {
                user.localRichListUsers = RichListUsers.new_();
            }
            if (user.richListType == null) {
                user.richListType = "";
            }
            if (user.liveRevenueCampaignVip == null) {
                user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
            }
            if (user.aiTag == null) {
                user.aiTag = "";
            }
            if (user.ussTracker == null) {
                user.ussTracker = "";
            }
            if (user.anchorHierarchy == null) {
                user.anchorHierarchy = LiveAnchorLevel.new_();
            }
            if (user.fanbaseHierarchy == null) {
                user.fanbaseHierarchy = LiveFansClubLevel.new_();
            }
            if (user.avatarFrame == null) {
                user.avatarFrame = AvatarFrame.new_();
            }
            if (user.hierarchy == null) {
                user.hierarchy = LiveUserLevel.new_();
            }
            if (user.banStatus == null) {
                user.banStatus = BanStatus.new_();
            }
            if (user.finishedStages == null) {
                user.finishedStages = new ArrayList();
            }
            if (user.activityUser == null) {
                user.activityUser = ActivityUser.new_();
            }
            if (user.regionTag == null) {
                user.regionTag = "";
            }
            if (user.localLikeIdentifiers == null) {
                user.localLikeIdentifiers = new ArrayList();
            }
            if (user.voiceLiveState == null) {
                user.voiceLiveState = VoiceLiveState.new_();
            }
            if (user.localSeeReminderType == null) {
                user.localSeeReminderType = "";
            }
            return user;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:776:0x1495 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:780:0x14dd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:784:0x14ef A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:788:0x1501 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:792:0x1513 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:796:0x1521  */
        /* JADX WARN: Code duplicated, block: B:799:0x1527  */
        /* JADX WARN: Code duplicated, block: B:802:0x1531  */
        /* JADX WARN: Code duplicated, block: B:805:0x1537  */
        /* JADX WARN: Code duplicated, block: B:808:0x1541  */
        /* JADX WARN: Code duplicated, block: B:811:0x154c  */
        /* JADX WARN: Code duplicated, block: B:814:0x1556  */
        /* JADX WARN: Code duplicated, block: B:817:0x1561  */
        /* JADX WARN: Code duplicated, block: B:820:0x156d  */
        /* JADX WARN: Code duplicated, block: B:823:0x1577  */
        /* JADX WARN: Code duplicated, block: B:826:0x157d  */
        /* JADX WARN: Code duplicated, block: B:829:0x1583  */
        /* JADX WARN: Code duplicated, block: B:832:0x158d  */
        /* JADX WARN: Code duplicated, block: B:835:0x1598  */
        /* JADX WARN: Code duplicated, block: B:838:0x159e  */
        /* JADX WARN: Code duplicated, block: B:841:0x15a4  */
        /* JADX WARN: Code duplicated, block: B:844:0x15ae  */
        /* JADX WARN: Code duplicated, block: B:847:0x15b8  */
        /* JADX WARN: Code duplicated, block: B:850:0x15c2  */
        /* JADX WARN: Code duplicated, block: B:853:0x15cc  */
        /* JADX WARN: Code duplicated, block: B:856:0x15da  */
        /* JADX WARN: Code duplicated, block: B:859:0x15e0  */
        /* JADX WARN: Code duplicated, block: B:862:0x15ea  */
        /* JADX WARN: Code duplicated, block: B:865:0x15f0  */
        /* JADX WARN: Code duplicated, block: B:868:0x15fa  */
        /* JADX WARN: Code duplicated, block: B:871:0x1600  */
        /* JADX WARN: Code duplicated, block: B:874:0x160a  */
        /* JADX WARN: Code duplicated, block: B:877:0x1610  */
        /* JADX WARN: Code duplicated, block: B:880:0x1616  */
        /* JADX WARN: Code duplicated, block: B:883:0x1620  */
        /* JADX WARN: Code duplicated, block: B:886:0x162a  */
        /* JADX WARN: Code duplicated, block: B:889:0x1634  */
        /* JADX WARN: Code duplicated, block: B:892:0x163e  */
        /* JADX WARN: Code duplicated, block: B:895:0x1648  */
        /* JADX WARN: Code duplicated, block: B:898:0x1653  */
        /* JADX WARN: Code duplicated, block: B:901:0x165d  */
        /* JADX WARN: Code duplicated, block: B:904:0x1663  */
        /* JADX WARN: Code duplicated, block: B:907:0x166e  */
        /* JADX WARN: Code duplicated, block: B:910:0x1678  */
        @Override // p153l.vzf0
        public User read(Cursor cursor, int i) {
            String string;
            String str;
            String string2;
            String string3;
            String string4;
            String string5;
            int i2;
            List<Integer> list;
            int i3;
            int i4;
            List<Integer> list2;
            List<Integer> list3;
            int i5;
            List<Integer> list4;
            List<Integer> list5;
            int i6;
            int i7;
            List<Integer> list6;
            String str2;
            List<Integer> list7;
            TEnumJsonAdapter<Gender> tEnumJsonAdapter;
            Location location;
            Physical physical;
            ProfileExtensionBasic profileExtensionBasic;
            FriendStatus friendStatus;
            List<String> list8;
            List<Integer> list9;
            List<String> list10;
            List<String> list11;
            List<LocationInvisibleField> list12;
            int i8 = 0;
            if (i == 0) {
                this.readIndex = 0;
            }
            User user = new User();
            try {
                user.location = new Location();
                user.profile = new Profile();
                user.membership = new Membership();
                user.verifications = new PicVerification();
                user.activityUser = new ActivityUser();
                user.location.region = new Region();
                user.profile.contactLookups = new MutualContactsLocalLookups();
                user.profile.work = new Work();
                user.profile.studies = new Studies();
                user.profile.tbh = new ProfileTbh();
                user.profile.followships = new FollowshipCounters();
                user.profile.moments = new Moments();
                user.verifications.picVerificationResult = new PicVerificationResult();
                user.verifications.idCard = new IdVerificationResult();
                user.profile.extensions = new Extensions();
                user.verifications.age = new VerificationResult();
                user.verifications.anchor = new VerificationResult();
                user.verifications.others = new OtherVerificationWrapper();
                user.profile.followships.counters = new FollowshipCounter();
                user.profile.moments.counters = new MomentCounter();
                user.profile.extensions.physical = new Physical();
                user.profile.extensions.business = new Business();
                user.profile.extensions.interest = new Interest();
                user.profile.extensions.basic = new ProfileExtensionBasic();
                user.verifications.others.otherDVIPSchool = new VerificationResult();
                user.verifications.others.otherDVIPCompany = new VerificationResult();
                user.verifications.others.otherDVIPJob = new VerificationResult();
                user.verifications.others.otherDVIPSalary = new VerificationResult();
                user.verifications.others.otherDVIPMembership = new VerificationResult();
                user.profile.extensions.anonymity = new Anonymity();
                user.profile.extensions.headFrame = new HeadFrame();
                user.profile.extensions.friendStatus = new FriendStatus();
                user.profile.extensions.momentSwitch = new MomentSwitch();
                user.profile.extensions.live = new VirtualVoiceLive();
                user.profile.extensions.tailFrame = new TailFrame();
                user.verifications.others.otherCTDID = new VerificationResult();
                user._id = cursor.getLong(i);
                int i9 = i + 1;
                user.f56859id = cursor.isNull(i9) ? null : cursor.getString(i9);
                int i10 = i + 2;
                user.name = cursor.isNull(i10) ? null : cursor.getString(i10);
                user.location.distance = cursor.getInt(i + 3);
                user.location.updatedTime = cursor.getDouble(i + 4);
                int i11 = i + 5;
                user.location.region.district = cursor.isNull(i11) ? null : cursor.getString(i11);
                int i12 = i + 6;
                user.location.region.city = cursor.isNull(i12) ? null : cursor.getString(i12);
                int i13 = i + 7;
                user.location.region.country = cursor.isNull(i13) ? null : cursor.getString(i13);
                int i14 = i + 8;
                user.location.passby = cursor.isNull(i14) ? null : Passby.PROTOBUF_ADAPTER.parse(cursor.getBlob(i14));
                int i15 = i + 9;
                user.description = cursor.isNull(i15) ? null : cursor.getString(i15);
                int i16 = i + 10;
                user.age = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
                int i17 = i + 11;
                user.pictures = cursor.isNull(i17) ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i17));
                user.createdTime = cursor.getDouble(i + 12);
                int i18 = i + 13;
                user.profile.school = cursor.isNull(i18) ? null : cursor.getString(i18);
                int i19 = i + 14;
                user.profile.hangouts = cursor.isNull(i19) ? null : cursor.getString(i19);
                int i20 = i + 15;
                user.profile.hometown = cursor.isNull(i20) ? null : cursor.getString(i20);
                int i21 = i + 16;
                user.profile.receivedLikes = cursor.isNull(i21) ? null : Long.valueOf(cursor.getLong(i21));
                int i22 = i + 17;
                user.profile.tags = cursor.isNull(i22) ? null : Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i22));
                int i23 = i + 18;
                user.profile.job = cursor.isNull(i23) ? null : cursor.getString(i23);
                user.profile.contactLookups.batchSize = cursor.getInt(i + 19);
                int i24 = i + 20;
                user.profile.contactLookups.lookups = cursor.isNull(i24) ? null : Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i24));
                int i25 = i + 21;
                user.profile.contactLookups.next = cursor.isNull(i25) ? null : cursor.getString(i25);
                int i26 = i + 22;
                user.profile.social = cursor.isNull(i26) ? null : Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i26));
                int i27 = i + 23;
                user.profile.answers = cursor.isNull(i27) ? null : Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i27));
                int i28 = i + 24;
                i2 = cursor.isNull(i28) ? -1 : cursor.getInt(i28);
                int i29 = i + 25;
                try {
                    user.profile.occupation = cursor.isNull(i29) ? null : cursor.getString(i29);
                    int i30 = i + 26;
                    list = cursor.isNull(i30) ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i30));
                    int i31 = i + 27;
                    try {
                        user.settings = cursor.isNull(i31) ? null : Settings.PROTOBUF_ADAPTER.parse(cursor.getBlob(i31));
                        int i32 = i + 28;
                        i3 = cursor.isNull(i32) ? -1 : cursor.getInt(i32);
                        int i33 = i + 29;
                        try {
                            user.profile.work.industry = cursor.isNull(i33) ? null : cursor.getString(i33);
                            int i34 = i + 30;
                            user.profile.work.department = cursor.isNull(i34) ? null : cursor.getString(i34);
                            int i35 = i + 31;
                            user.profile.work.company = cursor.isNull(i35) ? null : cursor.getString(i35);
                            user.profile.work.active = cursor.getInt(i + 32) == 1;
                            int i36 = i + 33;
                            user.profile.studies.major = cursor.isNull(i36) ? null : cursor.getString(i36);
                            int i37 = i + 34;
                            user.profile.studies.school = cursor.isNull(i37) ? null : cursor.getString(i37);
                            user.profile.studies.active = cursor.getInt(i + 35) == 1;
                            int i38 = i + 36;
                            user.profile.scenarios = cursor.isNull(i38) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i38));
                            int i39 = i + 37;
                            user.profile.receivedLikesRank = cursor.isNull(i39) ? null : cursor.getString(i39);
                            int i40 = i + 38;
                            user.localRelationship = cursor.isNull(i40) ? null : Relationship.PROTOBUF_ADAPTER.parse(cursor.getBlob(i40));
                            int i41 = i + 39;
                            i4 = cursor.isNull(i41) ? -1 : cursor.getInt(i41);
                            try {
                                user.membership.active = cursor.getInt(i + 40) == 1;
                                user.membership.expiresTime = cursor.getDouble(i + 41);
                                int i42 = i + 42;
                                i7 = cursor.isNull(i42) ? -1 : cursor.getInt(i42);
                                try {
                                    user.profile.studies.verified = cursor.getInt(i + 43) == 1;
                                    int i43 = i + 44;
                                    user.profile.studies.grade = cursor.isNull(i43) ? null : cursor.getString(i43);
                                    user.profile.tbh.friends = cursor.getInt(i + 45);
                                    user.profile.tbh.receivedVotes = cursor.getInt(i + 46);
                                    user.profile.tbh.receivedVotedPolls = cursor.getInt(i + 47);
                                    user.profile.tbh.createdTime = cursor.getDouble(i + 48);
                                    int i44 = i + 49;
                                    user.realName = cursor.isNull(i44) ? null : cursor.getString(i44);
                                    user.profile.followships.counters.followings = cursor.getInt(i + 50);
                                    user.profile.followships.counters.followers = cursor.getInt(i + 51);
                                    user.profile.moments.hidePublicMoments = cursor.getInt(i + 52) == 1;
                                    user.profile.moments.counters.totalMoments = cursor.getInt(i + 53);
                                    user.profile.moments.counters.receiveMomentLikes = cursor.getInt(i + 54);
                                    int i45 = i + 55;
                                    user.localFollowship = cursor.isNull(i45) ? null : Followship.PROTOBUF_ADAPTER.parse(cursor.getBlob(i45));
                                    user.membership.duration = cursor.getLong(i + 56);
                                    int i46 = i + 57;
                                    user.memberships = cursor.isNull(i46) ? null : Membership.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i46));
                                    int i47 = i + 58;
                                    user.nameRemark = cursor.isNull(i47) ? null : cursor.getString(i47);
                                    int i48 = i + 59;
                                    user.state = cursor.isNull(i48) ? null : UserState.PROTOBUF_ADAPTER.parse(cursor.getBlob(i48));
                                    user.verifications.picVerificationResult.verified = cursor.getInt(i + 60) == 1;
                                    int i49 = i + 61;
                                    user.abGroups = cursor.isNull(i49) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i49));
                                    int i50 = i + 62;
                                    user.privateAnswers = cursor.isNull(i50) ? null : PrivateAnswer.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i50));
                                    int i51 = i + 63;
                                    user.peepership = cursor.isNull(i51) ? null : Membership.PROTOBUF_ADAPTER.parse(cursor.getBlob(i51));
                                    user.picksExpiredTimestamp = cursor.getLong(i + 64);
                                    user.picksSwipable = cursor.getInt(i + 65) == 1;
                                    int i52 = i + 66;
                                    user.picksTag = cursor.isNull(i52) ? null : cursor.getString(i52);
                                    int i53 = i + 67;
                                    user.credit = cursor.isNull(i53) ? null : UserCreditData.PROTOBUF_ADAPTER.parse(cursor.getBlob(i53));
                                    user.goPlaceTimestamp = cursor.getDouble(i + 68);
                                    user.isLord = cursor.getInt(i + 69) == 1;
                                    user.privateAnswersUpdatedTime = cursor.getDouble(i + 70);
                                    int i54 = i + 71;
                                    user.sendLetter = cursor.isNull(i54) ? null : cursor.getString(i54);
                                    user.sendLetterTimestamp = cursor.getLong(i + 72);
                                    int i55 = i + 73;
                                    user.receivedLetter = cursor.isNull(i55) ? null : cursor.getString(i55);
                                    user.receivedLetterTimestamp = cursor.getLong(i + 74);
                                    user.popLevel = cursor.getInt(i + 75);
                                    int i56 = i + 76;
                                    user.voice = cursor.isNull(i56) ? null : AudioSignature.PROTOBUF_ADAPTER.parse(cursor.getBlob(i56));
                                    user.datingMode = cursor.getInt(i + 77) == 1;
                                    int i57 = i + 78;
                                    user.ussTags = cursor.isNull(i57) ? null : UssTags.PROTOBUF_ADAPTER.parse(cursor.getBlob(i57));
                                    int i58 = i + 79;
                                    i6 = cursor.isNull(i58) ? -1 : cursor.getInt(i58);
                                    int i59 = i + 80;
                                    try {
                                        user.abroad = cursor.isNull(i59) ? null : UserAbroad.PROTOBUF_ADAPTER.parse(cursor.getBlob(i59));
                                        int i60 = i + 81;
                                        user.fakeStatus = cursor.isNull(i60) ? null : StatusesItem.PROTOBUF_ADAPTER.parse(cursor.getBlob(i60));
                                        int i61 = i + 82;
                                        user.nameStatus = cursor.isNull(i61) ? null : StatusesItem.PROTOBUF_ADAPTER.parse(cursor.getBlob(i61));
                                        user.displayAudit = cursor.getInt(i + 83) == 1;
                                        int i62 = i + 84;
                                        user.visitPlace = cursor.isNull(i62) ? null : VisitPlace.PROTOBUF_ADAPTER.parse(cursor.getBlob(i62));
                                        int i63 = i + 85;
                                        user.publicId = cursor.isNull(i63) ? null : cursor.getString(i63);
                                        int i64 = i + 86;
                                        user.soulSettings = cursor.isNull(i64) ? null : UserSoulSettings.PROTOBUF_ADAPTER.parse(cursor.getBlob(i64));
                                        user.richListPosition = cursor.getInt(i + 87);
                                        int i65 = i + 88;
                                        user.richListTracker = cursor.isNull(i65) ? null : cursor.getString(i65);
                                        user.diamondVIPExpiresTime = cursor.getDouble(i + 89);
                                        int i66 = i + 90;
                                        user.aiTag = cursor.isNull(i66) ? null : cursor.getString(i66);
                                        int i67 = i + 91;
                                        user.friendCommentInfo = cursor.isNull(i67) ? null : FriendCommentInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i67));
                                        user.minRichListPosition = cursor.getInt(i + 92);
                                        user.membership.hideVIP = cursor.getInt(i + 93) == 1;
                                        int i68 = i + 94;
                                        user.ussTracker = cursor.isNull(i68) ? null : cursor.getString(i68);
                                        int i69 = i + 95;
                                        user.profile.mood = cursor.isNull(i69) ? null : UserProfileMood.PROTOBUF_ADAPTER.parse(cursor.getBlob(i69));
                                        user.verifications.idCard.verified = cursor.getInt(i + 96) == 1;
                                        user.membership.hideActivityTime = cursor.getInt(i + 97) == 1;
                                        int i70 = i + 98;
                                        i5 = cursor.isNull(i70) ? -1 : cursor.getInt(i70);
                                        int i71 = i + 99;
                                        try {
                                            list2 = cursor.isNull(i71) ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i71));
                                            int i72 = i + 100;
                                            try {
                                                list3 = cursor.isNull(i72) ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i72));
                                                int i73 = i + 101;
                                                i8 = 0;
                                                try {
                                                    Business business = user.profile.extensions.business;
                                                    if (cursor.isNull(i73)) {
                                                        string = "unknown_";
                                                        list8 = null;
                                                    } else {
                                                        string = "unknown_";
                                                        try {
                                                            list8 = ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i73));
                                                        } catch (Exception e) {
                                                            e = e;
                                                            i7 = i7;
                                                            i6 = i6;
                                                            i2 = i2;
                                                            list = list;
                                                            str = string;
                                                            string2 = str;
                                                            string3 = string2;
                                                            string4 = string3;
                                                            string5 = string4;
                                                            list4 = null;
                                                            list5 = null;
                                                            MessageNano.reportError(e, cursor);
                                                            i2 = i2;
                                                            list6 = list;
                                                            str2 = string;
                                                            String str3 = string4;
                                                            String str4 = string5;
                                                            int i74 = i6;
                                                            int i75 = i7;
                                                            list7 = list2;
                                                            user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                            if (user.status == null) {
                                                                user.status = UserStatus.oldEnumCovertList(list6);
                                                            }
                                                            tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                            user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                            user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                            user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str3, i75);
                                                            user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str4, i74);
                                                            user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                            location = user.location;
                                                            if (location.invisibleFields == null) {
                                                                location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                            }
                                                            physical = user.profile.extensions.physical;
                                                            if (physical.bloodType == null) {
                                                                physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                            }
                                                            profileExtensionBasic = user.profile.extensions.basic;
                                                            if (profileExtensionBasic.friendPurpose == null) {
                                                                profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                            }
                                                            friendStatus = user.profile.extensions.friendStatus;
                                                            if (friendStatus.status == null) {
                                                                friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                            }
                                                            if (user.name == null) {
                                                                user.name = "";
                                                            }
                                                            if (user.location == null) {
                                                                user.location = Location.new_();
                                                            }
                                                            if (user.description == null) {
                                                                user.description = "";
                                                            }
                                                            if (user.age == null) {
                                                                user.age = Integer.valueOf(i8);
                                                            }
                                                            if (user.pictures == null) {
                                                                user.pictures = new ArrayList();
                                                            }
                                                            if (user.profile == null) {
                                                                user.profile = Profile.new_();
                                                            }
                                                            if (user.status == null) {
                                                                user.status = new ArrayList();
                                                            }
                                                            if (user.gender == null) {
                                                                user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                            }
                                                            if (user.membership == null) {
                                                                user.membership = Membership.new_();
                                                            }
                                                            if (user.realName == null) {
                                                                user.realName = "";
                                                            }
                                                            if (user.nameRemark == null) {
                                                                user.nameRemark = "";
                                                            }
                                                            if (user.verifications == null) {
                                                                user.verifications = PicVerification.new_();
                                                            }
                                                            if (user.privateAnswers == null) {
                                                                user.privateAnswers = new ArrayList();
                                                            }
                                                            if (user.picksTag == null) {
                                                                user.picksTag = "";
                                                            }
                                                            if (user.picksTracker == null) {
                                                                user.picksTracker = "";
                                                            }
                                                            if (user.voice == null) {
                                                                user.voice = AudioSignature.new_();
                                                            }
                                                            if (user.liveState == null) {
                                                                user.liveState = UserLiveState.new_();
                                                            }
                                                            if (user.abroad == null) {
                                                                user.abroad = UserAbroad.new_();
                                                            }
                                                            if (user.medal == null) {
                                                                user.medal = UserMedalWrapper.new_();
                                                            }
                                                            if (user.signupStage == null) {
                                                                user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                            }
                                                            if (user.publicId == null) {
                                                                user.publicId = "";
                                                            }
                                                            if (user.soulSettings == null) {
                                                                user.soulSettings = UserSoulSettings.new_();
                                                            }
                                                            if (user.richListTracker == null) {
                                                                user.richListTracker = "";
                                                            }
                                                            if (user.localRichListUsers == null) {
                                                                user.localRichListUsers = RichListUsers.new_();
                                                            }
                                                            if (user.richListType == null) {
                                                                user.richListType = "";
                                                            }
                                                            if (user.liveRevenueCampaignVip == null) {
                                                                user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                            }
                                                            if (user.aiTag == null) {
                                                                user.aiTag = "";
                                                            }
                                                            if (user.ussTracker == null) {
                                                                user.ussTracker = "";
                                                            }
                                                            if (user.anchorHierarchy == null) {
                                                                user.anchorHierarchy = LiveAnchorLevel.new_();
                                                            }
                                                            if (user.fanbaseHierarchy == null) {
                                                                user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                            }
                                                            if (user.avatarFrame == null) {
                                                                user.avatarFrame = AvatarFrame.new_();
                                                            }
                                                            if (user.hierarchy == null) {
                                                                user.hierarchy = LiveUserLevel.new_();
                                                            }
                                                            if (user.banStatus == null) {
                                                                user.banStatus = BanStatus.new_();
                                                            }
                                                            if (user.finishedStages == null) {
                                                                user.finishedStages = new ArrayList();
                                                            }
                                                            if (user.activityUser == null) {
                                                                user.activityUser = ActivityUser.new_();
                                                            }
                                                            if (user.regionTag == null) {
                                                                user.regionTag = "";
                                                            }
                                                            if (user.localLikeIdentifiers == null) {
                                                                user.localLikeIdentifiers = new ArrayList();
                                                            }
                                                            if (user.voiceLiveState == null) {
                                                                user.voiceLiveState = VoiceLiveState.new_();
                                                            }
                                                            if (user.localSeeReminderType == null) {
                                                                user.localSeeReminderType = "";
                                                            }
                                                            return user;
                                                        }
                                                    }
                                                    business.cardType = list8;
                                                    int i76 = i + 102;
                                                    user.profile.moodMoment = cursor.isNull(i76) ? null : MoodMoment.PROTOBUF_ADAPTER.parse(cursor.getBlob(i76));
                                                    int i77 = i + 103;
                                                    user.profile.bizAnswers = cursor.isNull(i77) ? null : BizAnswers.PROTOBUF_ADAPTER.parse(cursor.getBlob(i77));
                                                    int i78 = i + 104;
                                                    user.profile.extensions.interest.emoji = cursor.isNull(i78) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i78));
                                                    user.verifications.age.verified = cursor.getInt(i + 105) == 1;
                                                    int i79 = i + 106;
                                                    user.profile.extensions.basic.aboutMe = cursor.isNull(i79) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i79));
                                                    user.verifications.anchor.verified = cursor.getInt(i + 107) == 1;
                                                    int i80 = i + 108;
                                                    user.profile.extensions.basic.tickle = cursor.isNull(i80) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i80));
                                                    user.localLatestReceivedMessageTime = cursor.getLong(i + 109);
                                                    user.verifications.others.otherDVIPSchool.verified = cursor.getInt(i + 110) == 1;
                                                    user.verifications.others.otherDVIPCompany.verified = cursor.getInt(i + 111) == 1;
                                                    user.verifications.others.otherDVIPJob.verified = cursor.getInt(i + 112) == 1;
                                                    user.verifications.others.otherDVIPSalary.verified = cursor.getInt(i + 113) == 1;
                                                    user.verifications.others.otherDVIPMembership.verified = cursor.getInt(i + 114) == 1;
                                                    int i81 = i + 115;
                                                    user.hierarchy = cursor.isNull(i81) ? null : LiveUserLevel.PROTOBUF_ADAPTER.parse(cursor.getBlob(i81));
                                                    int i82 = i + 116;
                                                    user.profile.extensions.basic.hobby = cursor.isNull(i82) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i82));
                                                    int i83 = i + 117;
                                                    user.profile.extensions.basic.recent = cursor.isNull(i83) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i83));
                                                    int i84 = i + 118;
                                                    user.profile.extensions.basic.together = cursor.isNull(i84) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i84));
                                                    int i85 = i + 119;
                                                    user.profile.extensions.anonymity.f39568id = cursor.isNull(i85) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i85));
                                                    int i86 = i + 120;
                                                    user.profile.extensions.anonymity.identifier = cursor.isNull(i86) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i86));
                                                    int i87 = i + 121;
                                                    user.localSoulShip = cursor.isNull(i87) ? null : SoulShip.PROTOBUF_ADAPTER.parse(cursor.getBlob(i87));
                                                    user.signupTime = cursor.getDouble(i + 122);
                                                    int i88 = i + 123;
                                                    user.profile.extensions.headFrame.url = cursor.isNull(i88) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i88));
                                                    int i89 = i + 124;
                                                    user.profile.extensions.headFrame.expiredTime = cursor.isNull(i89) ? null : ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i89));
                                                    int i90 = i + 125;
                                                    user.banStatus = cursor.isNull(i90) ? null : BanStatus.PROTOBUF_ADAPTER.parse(cursor.getBlob(i90));
                                                    user.profile.onlyShowAboutMeInside = cursor.getInt(i + 126) == 1;
                                                    int i91 = i + 127;
                                                    List<Integer> list13 = cursor.isNull(i91) ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i91));
                                                    int i92 = i + 128;
                                                    try {
                                                        FriendStatus friendStatus2 = user.profile.extensions.friendStatus;
                                                        if (cursor.isNull(i92)) {
                                                            list9 = list13;
                                                            list10 = null;
                                                        } else {
                                                            list9 = list13;
                                                            try {
                                                                list10 = ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i92));
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                i7 = i7;
                                                                i6 = i6;
                                                                i2 = i2;
                                                                list = list;
                                                                str = string;
                                                                string2 = str;
                                                                string3 = string2;
                                                                string4 = string3;
                                                                string5 = string4;
                                                                list4 = list9;
                                                                list5 = null;
                                                                MessageNano.reportError(e, cursor);
                                                                i2 = i2;
                                                                list6 = list;
                                                                str2 = string;
                                                                String str5 = string4;
                                                                String str6 = string5;
                                                                int i710 = i6;
                                                                int i711 = i7;
                                                                list7 = list2;
                                                                user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                                if (user.status == null) {
                                                                    user.status = UserStatus.oldEnumCovertList(list6);
                                                                }
                                                                tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                                user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                                user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                                user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str5, i711);
                                                                user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str6, i710);
                                                                user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                                location = user.location;
                                                                if (location.invisibleFields == null) {
                                                                    location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                                }
                                                                physical = user.profile.extensions.physical;
                                                                if (physical.bloodType == null) {
                                                                    physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                                }
                                                                profileExtensionBasic = user.profile.extensions.basic;
                                                                if (profileExtensionBasic.friendPurpose == null) {
                                                                    profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                                }
                                                                friendStatus = user.profile.extensions.friendStatus;
                                                                if (friendStatus.status == null) {
                                                                    friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                                }
                                                                if (user.name == null) {
                                                                    user.name = "";
                                                                }
                                                                if (user.location == null) {
                                                                    user.location = Location.new_();
                                                                }
                                                                if (user.description == null) {
                                                                    user.description = "";
                                                                }
                                                                if (user.age == null) {
                                                                    user.age = Integer.valueOf(i8);
                                                                }
                                                                if (user.pictures == null) {
                                                                    user.pictures = new ArrayList();
                                                                }
                                                                if (user.profile == null) {
                                                                    user.profile = Profile.new_();
                                                                }
                                                                if (user.status == null) {
                                                                    user.status = new ArrayList();
                                                                }
                                                                if (user.gender == null) {
                                                                    user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                                }
                                                                if (user.membership == null) {
                                                                    user.membership = Membership.new_();
                                                                }
                                                                if (user.realName == null) {
                                                                    user.realName = "";
                                                                }
                                                                if (user.nameRemark == null) {
                                                                    user.nameRemark = "";
                                                                }
                                                                if (user.verifications == null) {
                                                                    user.verifications = PicVerification.new_();
                                                                }
                                                                if (user.privateAnswers == null) {
                                                                    user.privateAnswers = new ArrayList();
                                                                }
                                                                if (user.picksTag == null) {
                                                                    user.picksTag = "";
                                                                }
                                                                if (user.picksTracker == null) {
                                                                    user.picksTracker = "";
                                                                }
                                                                if (user.voice == null) {
                                                                    user.voice = AudioSignature.new_();
                                                                }
                                                                if (user.liveState == null) {
                                                                    user.liveState = UserLiveState.new_();
                                                                }
                                                                if (user.abroad == null) {
                                                                    user.abroad = UserAbroad.new_();
                                                                }
                                                                if (user.medal == null) {
                                                                    user.medal = UserMedalWrapper.new_();
                                                                }
                                                                if (user.signupStage == null) {
                                                                    user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                                }
                                                                if (user.publicId == null) {
                                                                    user.publicId = "";
                                                                }
                                                                if (user.soulSettings == null) {
                                                                    user.soulSettings = UserSoulSettings.new_();
                                                                }
                                                                if (user.richListTracker == null) {
                                                                    user.richListTracker = "";
                                                                }
                                                                if (user.localRichListUsers == null) {
                                                                    user.localRichListUsers = RichListUsers.new_();
                                                                }
                                                                if (user.richListType == null) {
                                                                    user.richListType = "";
                                                                }
                                                                if (user.liveRevenueCampaignVip == null) {
                                                                    user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                                }
                                                                if (user.aiTag == null) {
                                                                    user.aiTag = "";
                                                                }
                                                                if (user.ussTracker == null) {
                                                                    user.ussTracker = "";
                                                                }
                                                                if (user.anchorHierarchy == null) {
                                                                    user.anchorHierarchy = LiveAnchorLevel.new_();
                                                                }
                                                                if (user.fanbaseHierarchy == null) {
                                                                    user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                                }
                                                                if (user.avatarFrame == null) {
                                                                    user.avatarFrame = AvatarFrame.new_();
                                                                }
                                                                if (user.hierarchy == null) {
                                                                    user.hierarchy = LiveUserLevel.new_();
                                                                }
                                                                if (user.banStatus == null) {
                                                                    user.banStatus = BanStatus.new_();
                                                                }
                                                                if (user.finishedStages == null) {
                                                                    user.finishedStages = new ArrayList();
                                                                }
                                                                if (user.activityUser == null) {
                                                                    user.activityUser = ActivityUser.new_();
                                                                }
                                                                if (user.regionTag == null) {
                                                                    user.regionTag = "";
                                                                }
                                                                if (user.localLikeIdentifiers == null) {
                                                                    user.localLikeIdentifiers = new ArrayList();
                                                                }
                                                                if (user.voiceLiveState == null) {
                                                                    user.voiceLiveState = VoiceLiveState.new_();
                                                                }
                                                                if (user.localSeeReminderType == null) {
                                                                    user.localSeeReminderType = "";
                                                                }
                                                                return user;
                                                            }
                                                        }
                                                        friendStatus2.labelType = list10;
                                                        int i93 = i + MMConstants.ERR_WATERMARK_READ;
                                                        user.profile.extensions.friendStatus.labelName = cursor.isNull(i93) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i93));
                                                        int i94 = i + 130;
                                                        user.profile.extensions.friendStatus.endTime = cursor.isNull(i94) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i94));
                                                        int i95 = i + 131;
                                                        List<Integer> list14 = cursor.isNull(i95) ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i95));
                                                        int i96 = i + CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
                                                        try {
                                                            user.localDiamondPrivateMatchTags = cursor.isNull(i96) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i96));
                                                            int i97 = i + CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA;
                                                            ProfileExtensionBasic profileExtensionBasic2 = user.profile.extensions.basic;
                                                            if (cursor.isNull(i97)) {
                                                                list5 = list14;
                                                                list11 = null;
                                                            } else {
                                                                list5 = list14;
                                                                try {
                                                                    list11 = ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i97));
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    str = string;
                                                                    string2 = str;
                                                                    string3 = string2;
                                                                    string4 = string3;
                                                                    string5 = string4;
                                                                    list4 = list9;
                                                                    MessageNano.reportError(e, cursor);
                                                                    i2 = i2;
                                                                    list6 = list;
                                                                    str2 = string;
                                                                    String str7 = string4;
                                                                    String str8 = string5;
                                                                    int i712 = i6;
                                                                    int i713 = i7;
                                                                    list7 = list2;
                                                                    user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                                    if (user.status == null) {
                                                                        user.status = UserStatus.oldEnumCovertList(list6);
                                                                    }
                                                                    tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                                    user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                                    user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                                    user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str7, i713);
                                                                    user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str8, i712);
                                                                    user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                                    location = user.location;
                                                                    if (location.invisibleFields == null) {
                                                                        location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                                    }
                                                                    physical = user.profile.extensions.physical;
                                                                    if (physical.bloodType == null) {
                                                                        physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                                    }
                                                                    profileExtensionBasic = user.profile.extensions.basic;
                                                                    if (profileExtensionBasic.friendPurpose == null) {
                                                                        profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                                    }
                                                                    friendStatus = user.profile.extensions.friendStatus;
                                                                    if (friendStatus.status == null) {
                                                                        friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                                    }
                                                                    if (user.name == null) {
                                                                        user.name = "";
                                                                    }
                                                                    if (user.location == null) {
                                                                        user.location = Location.new_();
                                                                    }
                                                                    if (user.description == null) {
                                                                        user.description = "";
                                                                    }
                                                                    if (user.age == null) {
                                                                        user.age = Integer.valueOf(i8);
                                                                    }
                                                                    if (user.pictures == null) {
                                                                        user.pictures = new ArrayList();
                                                                    }
                                                                    if (user.profile == null) {
                                                                        user.profile = Profile.new_();
                                                                    }
                                                                    if (user.status == null) {
                                                                        user.status = new ArrayList();
                                                                    }
                                                                    if (user.gender == null) {
                                                                        user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                                    }
                                                                    if (user.membership == null) {
                                                                        user.membership = Membership.new_();
                                                                    }
                                                                    if (user.realName == null) {
                                                                        user.realName = "";
                                                                    }
                                                                    if (user.nameRemark == null) {
                                                                        user.nameRemark = "";
                                                                    }
                                                                    if (user.verifications == null) {
                                                                        user.verifications = PicVerification.new_();
                                                                    }
                                                                    if (user.privateAnswers == null) {
                                                                        user.privateAnswers = new ArrayList();
                                                                    }
                                                                    if (user.picksTag == null) {
                                                                        user.picksTag = "";
                                                                    }
                                                                    if (user.picksTracker == null) {
                                                                        user.picksTracker = "";
                                                                    }
                                                                    if (user.voice == null) {
                                                                        user.voice = AudioSignature.new_();
                                                                    }
                                                                    if (user.liveState == null) {
                                                                        user.liveState = UserLiveState.new_();
                                                                    }
                                                                    if (user.abroad == null) {
                                                                        user.abroad = UserAbroad.new_();
                                                                    }
                                                                    if (user.medal == null) {
                                                                        user.medal = UserMedalWrapper.new_();
                                                                    }
                                                                    if (user.signupStage == null) {
                                                                        user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                                    }
                                                                    if (user.publicId == null) {
                                                                        user.publicId = "";
                                                                    }
                                                                    if (user.soulSettings == null) {
                                                                        user.soulSettings = UserSoulSettings.new_();
                                                                    }
                                                                    if (user.richListTracker == null) {
                                                                        user.richListTracker = "";
                                                                    }
                                                                    if (user.localRichListUsers == null) {
                                                                        user.localRichListUsers = RichListUsers.new_();
                                                                    }
                                                                    if (user.richListType == null) {
                                                                        user.richListType = "";
                                                                    }
                                                                    if (user.liveRevenueCampaignVip == null) {
                                                                        user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                                    }
                                                                    if (user.aiTag == null) {
                                                                        user.aiTag = "";
                                                                    }
                                                                    if (user.ussTracker == null) {
                                                                        user.ussTracker = "";
                                                                    }
                                                                    if (user.anchorHierarchy == null) {
                                                                        user.anchorHierarchy = LiveAnchorLevel.new_();
                                                                    }
                                                                    if (user.fanbaseHierarchy == null) {
                                                                        user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                                    }
                                                                    if (user.avatarFrame == null) {
                                                                        user.avatarFrame = AvatarFrame.new_();
                                                                    }
                                                                    if (user.hierarchy == null) {
                                                                        user.hierarchy = LiveUserLevel.new_();
                                                                    }
                                                                    if (user.banStatus == null) {
                                                                        user.banStatus = BanStatus.new_();
                                                                    }
                                                                    if (user.finishedStages == null) {
                                                                        user.finishedStages = new ArrayList();
                                                                    }
                                                                    if (user.activityUser == null) {
                                                                        user.activityUser = ActivityUser.new_();
                                                                    }
                                                                    if (user.regionTag == null) {
                                                                        user.regionTag = "";
                                                                    }
                                                                    if (user.localLikeIdentifiers == null) {
                                                                        user.localLikeIdentifiers = new ArrayList();
                                                                    }
                                                                    if (user.voiceLiveState == null) {
                                                                        user.voiceLiveState = VoiceLiveState.new_();
                                                                    }
                                                                    if (user.localSeeReminderType == null) {
                                                                        user.localSeeReminderType = "";
                                                                    }
                                                                    return user;
                                                                }
                                                            }
                                                            profileExtensionBasic2.interest = list11;
                                                            int i98 = i + 134;
                                                            user.anonymousLike = cursor.isNull(i98) ? null : AnonymousLikeInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i98));
                                                            user.inactivated = cursor.getInt(i + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA) == 1;
                                                            int i99 = i + CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
                                                            user.profile.extensions.basic.country = cursor.isNull(i99) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i99));
                                                            int i100 = i + CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA;
                                                            user.profile.extensions.basic.province = cursor.isNull(i100) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i100));
                                                            int i101 = i + CipherSuite.TLS_PSK_WITH_RC4_128_SHA;
                                                            user.profile.extensions.basic.city = cursor.isNull(i101) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i101));
                                                            int i102 = i + CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA;
                                                            string2 = cursor.isNull(i102) ? null : cursor.getString(i102);
                                                            int i103 = i + 140;
                                                            try {
                                                                user.status = cursor.isNull(i103) ? null : UserStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i103));
                                                                int i104 = i + CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA;
                                                                String string6 = cursor.isNull(i104) ? null : cursor.getString(i104);
                                                                int i105 = i + CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA;
                                                                try {
                                                                    string3 = cursor.isNull(i105) ? null : cursor.getString(i105);
                                                                    String str9 = string2;
                                                                    int i106 = i + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                                                                    try {
                                                                        string4 = cursor.isNull(i106) ? null : cursor.getString(i106);
                                                                        int i107 = i + 144;
                                                                        try {
                                                                            string5 = cursor.isNull(i107) ? null : cursor.getString(i107);
                                                                            int i108 = i + CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA;
                                                                            try {
                                                                                string = cursor.isNull(i108) ? null : cursor.getString(i108);
                                                                                int i109 = i + CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA;
                                                                                string6 = string6;
                                                                                try {
                                                                                    Location location2 = user.location;
                                                                                    if (cursor.isNull(i109)) {
                                                                                        i7 = i7;
                                                                                        list12 = null;
                                                                                    } else {
                                                                                        i7 = i7;
                                                                                        try {
                                                                                            list12 = LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i109));
                                                                                        } catch (Exception e4) {
                                                                                            e = e4;
                                                                                            i6 = i6;
                                                                                            i2 = i2;
                                                                                            list = list;
                                                                                            string2 = str9;
                                                                                            str = string;
                                                                                            list4 = list9;
                                                                                            string = string6;
                                                                                            MessageNano.reportError(e, cursor);
                                                                                            i2 = i2;
                                                                                            list6 = list;
                                                                                            str2 = string;
                                                                                            String str10 = string4;
                                                                                            String str11 = string5;
                                                                                            int i714 = i6;
                                                                                            int i715 = i7;
                                                                                            list7 = list2;
                                                                                            user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                                                            if (user.status == null) {
                                                                                                user.status = UserStatus.oldEnumCovertList(list6);
                                                                                            }
                                                                                            tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                                                            user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                                                            user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                                                            user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str10, i715);
                                                                                            user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str11, i714);
                                                                                            user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                                                            location = user.location;
                                                                                            if (location.invisibleFields == null) {
                                                                                                location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                                                            }
                                                                                            physical = user.profile.extensions.physical;
                                                                                            if (physical.bloodType == null) {
                                                                                                physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                                                            }
                                                                                            profileExtensionBasic = user.profile.extensions.basic;
                                                                                            if (profileExtensionBasic.friendPurpose == null) {
                                                                                                profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                                                            }
                                                                                            friendStatus = user.profile.extensions.friendStatus;
                                                                                            if (friendStatus.status == null) {
                                                                                                friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                                                            }
                                                                                            if (user.name == null) {
                                                                                                user.name = "";
                                                                                            }
                                                                                            if (user.location == null) {
                                                                                                user.location = Location.new_();
                                                                                            }
                                                                                            if (user.description == null) {
                                                                                                user.description = "";
                                                                                            }
                                                                                            if (user.age == null) {
                                                                                                user.age = Integer.valueOf(i8);
                                                                                            }
                                                                                            if (user.pictures == null) {
                                                                                                user.pictures = new ArrayList();
                                                                                            }
                                                                                            if (user.profile == null) {
                                                                                                user.profile = Profile.new_();
                                                                                            }
                                                                                            if (user.status == null) {
                                                                                                user.status = new ArrayList();
                                                                                            }
                                                                                            if (user.gender == null) {
                                                                                                user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                                                            }
                                                                                            if (user.membership == null) {
                                                                                                user.membership = Membership.new_();
                                                                                            }
                                                                                            if (user.realName == null) {
                                                                                                user.realName = "";
                                                                                            }
                                                                                            if (user.nameRemark == null) {
                                                                                                user.nameRemark = "";
                                                                                            }
                                                                                            if (user.verifications == null) {
                                                                                                user.verifications = PicVerification.new_();
                                                                                            }
                                                                                            if (user.privateAnswers == null) {
                                                                                                user.privateAnswers = new ArrayList();
                                                                                            }
                                                                                            if (user.picksTag == null) {
                                                                                                user.picksTag = "";
                                                                                            }
                                                                                            if (user.picksTracker == null) {
                                                                                                user.picksTracker = "";
                                                                                            }
                                                                                            if (user.voice == null) {
                                                                                                user.voice = AudioSignature.new_();
                                                                                            }
                                                                                            if (user.liveState == null) {
                                                                                                user.liveState = UserLiveState.new_();
                                                                                            }
                                                                                            if (user.abroad == null) {
                                                                                                user.abroad = UserAbroad.new_();
                                                                                            }
                                                                                            if (user.medal == null) {
                                                                                                user.medal = UserMedalWrapper.new_();
                                                                                            }
                                                                                            if (user.signupStage == null) {
                                                                                                user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                                                            }
                                                                                            if (user.publicId == null) {
                                                                                                user.publicId = "";
                                                                                            }
                                                                                            if (user.soulSettings == null) {
                                                                                                user.soulSettings = UserSoulSettings.new_();
                                                                                            }
                                                                                            if (user.richListTracker == null) {
                                                                                                user.richListTracker = "";
                                                                                            }
                                                                                            if (user.localRichListUsers == null) {
                                                                                                user.localRichListUsers = RichListUsers.new_();
                                                                                            }
                                                                                            if (user.richListType == null) {
                                                                                                user.richListType = "";
                                                                                            }
                                                                                            if (user.liveRevenueCampaignVip == null) {
                                                                                                user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                                                            }
                                                                                            if (user.aiTag == null) {
                                                                                                user.aiTag = "";
                                                                                            }
                                                                                            if (user.ussTracker == null) {
                                                                                                user.ussTracker = "";
                                                                                            }
                                                                                            if (user.anchorHierarchy == null) {
                                                                                                user.anchorHierarchy = LiveAnchorLevel.new_();
                                                                                            }
                                                                                            if (user.fanbaseHierarchy == null) {
                                                                                                user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                                                            }
                                                                                            if (user.avatarFrame == null) {
                                                                                                user.avatarFrame = AvatarFrame.new_();
                                                                                            }
                                                                                            if (user.hierarchy == null) {
                                                                                                user.hierarchy = LiveUserLevel.new_();
                                                                                            }
                                                                                            if (user.banStatus == null) {
                                                                                                user.banStatus = BanStatus.new_();
                                                                                            }
                                                                                            if (user.finishedStages == null) {
                                                                                                user.finishedStages = new ArrayList();
                                                                                            }
                                                                                            if (user.activityUser == null) {
                                                                                                user.activityUser = ActivityUser.new_();
                                                                                            }
                                                                                            if (user.regionTag == null) {
                                                                                                user.regionTag = "";
                                                                                            }
                                                                                            if (user.localLikeIdentifiers == null) {
                                                                                                user.localLikeIdentifiers = new ArrayList();
                                                                                            }
                                                                                            if (user.voiceLiveState == null) {
                                                                                                user.voiceLiveState = VoiceLiveState.new_();
                                                                                            }
                                                                                            if (user.localSeeReminderType == null) {
                                                                                                user.localSeeReminderType = "";
                                                                                            }
                                                                                            return user;
                                                                                        }
                                                                                    }
                                                                                    location2.invisibleFields = list12;
                                                                                    int i110 = i + CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA;
                                                                                    user.profile.extensions.physical.bloodType = cursor.isNull(i110) ? null : BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i110));
                                                                                    int i111 = i + 148;
                                                                                    user.profile.extensions.basic.friendPurpose = cursor.isNull(i111) ? null : Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i111));
                                                                                    int i112 = i + 149;
                                                                                    user.profile.extensions.friendStatus.status = cursor.isNull(i112) ? null : FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i112));
                                                                                    int i113 = i + 150;
                                                                                    user.profile.extensions.momentSwitch.noSyncMoment = cursor.isNull(i113) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i113));
                                                                                    int i114 = i + 151;
                                                                                    user.profile.extensions.wealth = cursor.isNull(i114) ? null : UserWealth.PROTOBUF_ADAPTER.parse(cursor.getBlob(i114));
                                                                                    int i115 = i + CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA;
                                                                                    user.profile.extensions.basic.qualification = cursor.isNull(i115) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i115));
                                                                                    int i116 = i + 153;
                                                                                    user.profile.extensions.physical.height = cursor.isNull(i116) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i116));
                                                                                    int i117 = i + 154;
                                                                                    user.profile.extensions.profileCompletion = cursor.isNull(i117) ? null : ProfileCompletion.PROTOBUF_ADAPTER.parse(cursor.getBlob(i117));
                                                                                    int i118 = i + CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
                                                                                    user.profile.extensions.voiceSignature = cursor.isNull(i118) ? null : VoiceSignature.PROTOBUF_ADAPTER.parse(cursor.getBlob(i118));
                                                                                    int i119 = i + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                                                                    user.activityUser.action = cursor.isNull(i119) ? null : cursor.getString(i119);
                                                                                    i6 = i6;
                                                                                    try {
                                                                                        user.activityUser.score = cursor.getLong(i + 157);
                                                                                        user.matePlanUser = cursor.getInt(i + 158) == 1;
                                                                                        user.matePlanAdUser = cursor.getInt(i + 159) == 1;
                                                                                        int i120 = i + 160;
                                                                                        user.regionTag = cursor.isNull(i120) ? null : cursor.getString(i120);
                                                                                        int i121 = i + 161;
                                                                                        user.localLikeIdentifiers = cursor.isNull(i121) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i121));
                                                                                        user.deleted = cursor.getInt(i + 162) == 1;
                                                                                        int i122 = i + 163;
                                                                                        user.profile.extensions.interest.tags = cursor.isNull(i122) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i122));
                                                                                        int i123 = i + CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256;
                                                                                        user.profile.extensions.live.voiceImgId = cursor.isNull(i123) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i123));
                                                                                        int i124 = i + 165;
                                                                                        user.profile.extensions.live.voiceImgUrl = cursor.isNull(i124) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i124));
                                                                                        int i125 = i + 166;
                                                                                        user.profile.extensions.mate = cursor.isNull(i125) ? null : ProfileMate.PROTOBUF_ADAPTER.parse(cursor.getBlob(i125));
                                                                                        int i126 = i + 167;
                                                                                        user.profile.extensions.pet = cursor.isNull(i126) ? null : PetInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i126));
                                                                                        int i127 = i + CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256;
                                                                                        user.profile.extensions.tailFrame.url = cursor.isNull(i127) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i127));
                                                                                        int i128 = i + 169;
                                                                                        user.profile.extensions.tailFrame.expiredTime = cursor.isNull(i128) ? null : ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i128));
                                                                                        int i129 = i + CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
                                                                                        user.profile.extensions.business.avatarID = cursor.isNull(i129) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i129));
                                                                                        int i130 = i + CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384;
                                                                                        user.profile.extensions.business.avatarExpireTime = cursor.isNull(i130) ? null : ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i130));
                                                                                        int i131 = i + CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256;
                                                                                        user.profile.extensions.business.avatarClose = cursor.isNull(i131) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i131));
                                                                                        int i132 = i + CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
                                                                                        user.specialEffect = cursor.isNull(i132) ? null : SpecialEffect.PROTOBUF_ADAPTER.parse(cursor.getBlob(i132));
                                                                                        int i133 = i + CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256;
                                                                                        user.profile.extensions.basic.ethnicity = cursor.isNull(i133) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i133));
                                                                                        int i134 = i + CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384;
                                                                                        user.profile.extensions.basic.language = cursor.isNull(i134) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i134));
                                                                                        int i135 = i + 176;
                                                                                        user.profile.extensions.voiceAvatarFrame = cursor.isNull(i135) ? null : VoiceAvatarFrame.PROTOBUF_ADAPTER.parse(cursor.getBlob(i135));
                                                                                        int i136 = i + 177;
                                                                                        user.profile.extensions.physical.heightImg = cursor.isNull(i136) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i136));
                                                                                        int i137 = i + 178;
                                                                                        user.profile.extensions.marriage = cursor.isNull(i137) ? null : ProfileExtensionMarriage.PROTOBUF_ADAPTER.parse(cursor.getBlob(i137));
                                                                                        int i138 = i + CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384;
                                                                                        user.profile.extensions.basic.address = cursor.isNull(i138) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i138));
                                                                                        int i139 = i + 180;
                                                                                        user.profile.extensions.basic.familyBackground = cursor.isNull(i139) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i139));
                                                                                        int i140 = i + 181;
                                                                                        user.profile.extensions.physical.weight = cursor.isNull(i140) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i140));
                                                                                        VerificationResult verificationResult = user.verifications.others.otherCTDID;
                                                                                        boolean z = true;
                                                                                        if (cursor.getInt(i + 182) != 1) {
                                                                                            z = false;
                                                                                        }
                                                                                        verificationResult.verified = z;
                                                                                        int i141 = i + 183;
                                                                                        user.profile.extensions.game = cursor.isNull(i141) ? null : ExtensionGame.PROTOBUF_ADAPTER.parse(cursor.getBlob(i141));
                                                                                        int i142 = i + 184;
                                                                                        user.profile.extensions.basic.facialFeature = cursor.isNull(i142) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i142));
                                                                                        user.verifications.idCard.age = cursor.getInt(i + 185);
                                                                                        int i143 = i + CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                                                                                        user.verifications.idCard.first4 = cursor.isNull(i143) ? null : cursor.getString(i143);
                                                                                        int i144 = i + 187;
                                                                                        user.profile.extensions.physical.fitness = cursor.isNull(i144) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i144));
                                                                                        int i145 = i + 188;
                                                                                        user.profile.extensions.physical.drink = cursor.isNull(i145) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i145));
                                                                                        int i146 = i + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256;
                                                                                        user.profile.extensions.physical.smoke = cursor.isNull(i146) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i146));
                                                                                        int i147 = i + CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                                                                                        user.profile.extensions.basic.mbti = cursor.isNull(i147) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i147));
                                                                                        int i148 = i + CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256;
                                                                                        user.userActivityInfo = cursor.isNull(i148) ? null : UserActivityInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i148));
                                                                                        int i149 = i + 192;
                                                                                        user.profile.extensions.basic.ideal = cursor.isNull(i149) ? null : IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i149));
                                                                                        int i150 = i + 193;
                                                                                        user.profile.extensions.basic.unideal = cursor.isNull(i150) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i150));
                                                                                        user.profile.moments.counters.totalNormalMoments = cursor.getInt(i + CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256);
                                                                                        int i151 = i + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                                                                                        user.profile.extensions.interest.taste = cursor.isNull(i151) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i151));
                                                                                        int i152 = i + CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256;
                                                                                        user.location.region.province = cursor.isNull(i152) ? null : cursor.getString(i152);
                                                                                        int i153 = i + CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256;
                                                                                        user.profile.extensions.basic.intlFriendPurpose = cursor.isNull(i153) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i153));
                                                                                        int i154 = i + Opcodes.IFNULL;
                                                                                        user.profile.extensions.basic.intlFriendPurposeV2 = cursor.isNull(i154) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i154));
                                                                                        this.readIndex = i + Opcodes.IFNONNULL;
                                                                                        list6 = list;
                                                                                        string2 = str9;
                                                                                        str = string;
                                                                                        list4 = list9;
                                                                                        str2 = string6;
                                                                                    } catch (Exception e5) {
                                                                                        e = e5;
                                                                                        i2 = i2;
                                                                                        list = list;
                                                                                        string2 = str9;
                                                                                        str = string;
                                                                                        list4 = list9;
                                                                                        string = string6;
                                                                                        MessageNano.reportError(e, cursor);
                                                                                        i2 = i2;
                                                                                        list6 = list;
                                                                                        str2 = string;
                                                                                    }
                                                                                } catch (Exception e6) {
                                                                                    e = e6;
                                                                                    i7 = i7;
                                                                                    i6 = i6;
                                                                                    i2 = i2;
                                                                                    list = list;
                                                                                    string2 = str9;
                                                                                    str = string;
                                                                                    list4 = list9;
                                                                                    string = string6;
                                                                                    MessageNano.reportError(e, cursor);
                                                                                    i2 = i2;
                                                                                    list6 = list;
                                                                                    str2 = string;
                                                                                    String str12 = string4;
                                                                                    String str13 = string5;
                                                                                    int i716 = i6;
                                                                                    int i717 = i7;
                                                                                    list7 = list2;
                                                                                    user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                                                    if (user.status == null) {
                                                                                        user.status = UserStatus.oldEnumCovertList(list6);
                                                                                    }
                                                                                    tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                                                    user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                                                    user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                                                    user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str12, i717);
                                                                                    user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str13, i716);
                                                                                    user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                                                    location = user.location;
                                                                                    if (location.invisibleFields == null) {
                                                                                        location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                                                    }
                                                                                    physical = user.profile.extensions.physical;
                                                                                    if (physical.bloodType == null) {
                                                                                        physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                                                    }
                                                                                    profileExtensionBasic = user.profile.extensions.basic;
                                                                                    if (profileExtensionBasic.friendPurpose == null) {
                                                                                        profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                                                    }
                                                                                    friendStatus = user.profile.extensions.friendStatus;
                                                                                    if (friendStatus.status == null) {
                                                                                        friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                                                    }
                                                                                    if (user.name == null) {
                                                                                        user.name = "";
                                                                                    }
                                                                                    if (user.location == null) {
                                                                                        user.location = Location.new_();
                                                                                    }
                                                                                    if (user.description == null) {
                                                                                        user.description = "";
                                                                                    }
                                                                                    if (user.age == null) {
                                                                                        user.age = Integer.valueOf(i8);
                                                                                    }
                                                                                    if (user.pictures == null) {
                                                                                        user.pictures = new ArrayList();
                                                                                    }
                                                                                    if (user.profile == null) {
                                                                                        user.profile = Profile.new_();
                                                                                    }
                                                                                    if (user.status == null) {
                                                                                        user.status = new ArrayList();
                                                                                    }
                                                                                    if (user.gender == null) {
                                                                                        user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                                                    }
                                                                                    if (user.membership == null) {
                                                                                        user.membership = Membership.new_();
                                                                                    }
                                                                                    if (user.realName == null) {
                                                                                        user.realName = "";
                                                                                    }
                                                                                    if (user.nameRemark == null) {
                                                                                        user.nameRemark = "";
                                                                                    }
                                                                                    if (user.verifications == null) {
                                                                                        user.verifications = PicVerification.new_();
                                                                                    }
                                                                                    if (user.privateAnswers == null) {
                                                                                        user.privateAnswers = new ArrayList();
                                                                                    }
                                                                                    if (user.picksTag == null) {
                                                                                        user.picksTag = "";
                                                                                    }
                                                                                    if (user.picksTracker == null) {
                                                                                        user.picksTracker = "";
                                                                                    }
                                                                                    if (user.voice == null) {
                                                                                        user.voice = AudioSignature.new_();
                                                                                    }
                                                                                    if (user.liveState == null) {
                                                                                        user.liveState = UserLiveState.new_();
                                                                                    }
                                                                                    if (user.abroad == null) {
                                                                                        user.abroad = UserAbroad.new_();
                                                                                    }
                                                                                    if (user.medal == null) {
                                                                                        user.medal = UserMedalWrapper.new_();
                                                                                    }
                                                                                    if (user.signupStage == null) {
                                                                                        user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                                                    }
                                                                                    if (user.publicId == null) {
                                                                                        user.publicId = "";
                                                                                    }
                                                                                    if (user.soulSettings == null) {
                                                                                        user.soulSettings = UserSoulSettings.new_();
                                                                                    }
                                                                                    if (user.richListTracker == null) {
                                                                                        user.richListTracker = "";
                                                                                    }
                                                                                    if (user.localRichListUsers == null) {
                                                                                        user.localRichListUsers = RichListUsers.new_();
                                                                                    }
                                                                                    if (user.richListType == null) {
                                                                                        user.richListType = "";
                                                                                    }
                                                                                    if (user.liveRevenueCampaignVip == null) {
                                                                                        user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                                                    }
                                                                                    if (user.aiTag == null) {
                                                                                        user.aiTag = "";
                                                                                    }
                                                                                    if (user.ussTracker == null) {
                                                                                        user.ussTracker = "";
                                                                                    }
                                                                                    if (user.anchorHierarchy == null) {
                                                                                        user.anchorHierarchy = LiveAnchorLevel.new_();
                                                                                    }
                                                                                    if (user.fanbaseHierarchy == null) {
                                                                                        user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                                                    }
                                                                                    if (user.avatarFrame == null) {
                                                                                        user.avatarFrame = AvatarFrame.new_();
                                                                                    }
                                                                                    if (user.hierarchy == null) {
                                                                                        user.hierarchy = LiveUserLevel.new_();
                                                                                    }
                                                                                    if (user.banStatus == null) {
                                                                                        user.banStatus = BanStatus.new_();
                                                                                    }
                                                                                    if (user.finishedStages == null) {
                                                                                        user.finishedStages = new ArrayList();
                                                                                    }
                                                                                    if (user.activityUser == null) {
                                                                                        user.activityUser = ActivityUser.new_();
                                                                                    }
                                                                                    if (user.regionTag == null) {
                                                                                        user.regionTag = "";
                                                                                    }
                                                                                    if (user.localLikeIdentifiers == null) {
                                                                                        user.localLikeIdentifiers = new ArrayList();
                                                                                    }
                                                                                    if (user.voiceLiveState == null) {
                                                                                        user.voiceLiveState = VoiceLiveState.new_();
                                                                                    }
                                                                                    if (user.localSeeReminderType == null) {
                                                                                        user.localSeeReminderType = "";
                                                                                    }
                                                                                    return user;
                                                                                }
                                                                            } catch (Exception e7) {
                                                                                e = e7;
                                                                                string6 = string6;
                                                                            }
                                                                        } catch (Exception e8) {
                                                                            e = e8;
                                                                            string6 = string6;
                                                                            i7 = i7;
                                                                            i6 = i6;
                                                                            i2 = i2;
                                                                            list = list;
                                                                            string2 = str9;
                                                                            str = string;
                                                                            string5 = str;
                                                                        }
                                                                    } catch (Exception e9) {
                                                                        e = e9;
                                                                        string2 = str9;
                                                                        str = string;
                                                                        string4 = str;
                                                                        string5 = string4;
                                                                        list4 = list9;
                                                                        string = string6;
                                                                        MessageNano.reportError(e, cursor);
                                                                        i2 = i2;
                                                                        list6 = list;
                                                                        str2 = string;
                                                                        String str14 = string4;
                                                                        String str15 = string5;
                                                                        int i718 = i6;
                                                                        int i719 = i7;
                                                                        list7 = list2;
                                                                        user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                                        if (user.status == null) {
                                                                            user.status = UserStatus.oldEnumCovertList(list6);
                                                                        }
                                                                        tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                                        user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                                        user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                                        user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str14, i719);
                                                                        user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str15, i718);
                                                                        user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                                        location = user.location;
                                                                        if (location.invisibleFields == null) {
                                                                            location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                                        }
                                                                        physical = user.profile.extensions.physical;
                                                                        if (physical.bloodType == null) {
                                                                            physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                                        }
                                                                        profileExtensionBasic = user.profile.extensions.basic;
                                                                        if (profileExtensionBasic.friendPurpose == null) {
                                                                            profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                                        }
                                                                        friendStatus = user.profile.extensions.friendStatus;
                                                                        if (friendStatus.status == null) {
                                                                            friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                                        }
                                                                        if (user.name == null) {
                                                                            user.name = "";
                                                                        }
                                                                        if (user.location == null) {
                                                                            user.location = Location.new_();
                                                                        }
                                                                        if (user.description == null) {
                                                                            user.description = "";
                                                                        }
                                                                        if (user.age == null) {
                                                                            user.age = Integer.valueOf(i8);
                                                                        }
                                                                        if (user.pictures == null) {
                                                                            user.pictures = new ArrayList();
                                                                        }
                                                                        if (user.profile == null) {
                                                                            user.profile = Profile.new_();
                                                                        }
                                                                        if (user.status == null) {
                                                                            user.status = new ArrayList();
                                                                        }
                                                                        if (user.gender == null) {
                                                                            user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                                        }
                                                                        if (user.membership == null) {
                                                                            user.membership = Membership.new_();
                                                                        }
                                                                        if (user.realName == null) {
                                                                            user.realName = "";
                                                                        }
                                                                        if (user.nameRemark == null) {
                                                                            user.nameRemark = "";
                                                                        }
                                                                        if (user.verifications == null) {
                                                                            user.verifications = PicVerification.new_();
                                                                        }
                                                                        if (user.privateAnswers == null) {
                                                                            user.privateAnswers = new ArrayList();
                                                                        }
                                                                        if (user.picksTag == null) {
                                                                            user.picksTag = "";
                                                                        }
                                                                        if (user.picksTracker == null) {
                                                                            user.picksTracker = "";
                                                                        }
                                                                        if (user.voice == null) {
                                                                            user.voice = AudioSignature.new_();
                                                                        }
                                                                        if (user.liveState == null) {
                                                                            user.liveState = UserLiveState.new_();
                                                                        }
                                                                        if (user.abroad == null) {
                                                                            user.abroad = UserAbroad.new_();
                                                                        }
                                                                        if (user.medal == null) {
                                                                            user.medal = UserMedalWrapper.new_();
                                                                        }
                                                                        if (user.signupStage == null) {
                                                                            user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                                        }
                                                                        if (user.publicId == null) {
                                                                            user.publicId = "";
                                                                        }
                                                                        if (user.soulSettings == null) {
                                                                            user.soulSettings = UserSoulSettings.new_();
                                                                        }
                                                                        if (user.richListTracker == null) {
                                                                            user.richListTracker = "";
                                                                        }
                                                                        if (user.localRichListUsers == null) {
                                                                            user.localRichListUsers = RichListUsers.new_();
                                                                        }
                                                                        if (user.richListType == null) {
                                                                            user.richListType = "";
                                                                        }
                                                                        if (user.liveRevenueCampaignVip == null) {
                                                                            user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                                        }
                                                                        if (user.aiTag == null) {
                                                                            user.aiTag = "";
                                                                        }
                                                                        if (user.ussTracker == null) {
                                                                            user.ussTracker = "";
                                                                        }
                                                                        if (user.anchorHierarchy == null) {
                                                                            user.anchorHierarchy = LiveAnchorLevel.new_();
                                                                        }
                                                                        if (user.fanbaseHierarchy == null) {
                                                                            user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                                        }
                                                                        if (user.avatarFrame == null) {
                                                                            user.avatarFrame = AvatarFrame.new_();
                                                                        }
                                                                        if (user.hierarchy == null) {
                                                                            user.hierarchy = LiveUserLevel.new_();
                                                                        }
                                                                        if (user.banStatus == null) {
                                                                            user.banStatus = BanStatus.new_();
                                                                        }
                                                                        if (user.finishedStages == null) {
                                                                            user.finishedStages = new ArrayList();
                                                                        }
                                                                        if (user.activityUser == null) {
                                                                            user.activityUser = ActivityUser.new_();
                                                                        }
                                                                        if (user.regionTag == null) {
                                                                            user.regionTag = "";
                                                                        }
                                                                        if (user.localLikeIdentifiers == null) {
                                                                            user.localLikeIdentifiers = new ArrayList();
                                                                        }
                                                                        if (user.voiceLiveState == null) {
                                                                            user.voiceLiveState = VoiceLiveState.new_();
                                                                        }
                                                                        if (user.localSeeReminderType == null) {
                                                                            user.localSeeReminderType = "";
                                                                        }
                                                                        return user;
                                                                    }
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    str = string;
                                                                    string3 = str;
                                                                    string4 = string3;
                                                                }
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                str = string;
                                                                string3 = str;
                                                                string4 = string3;
                                                                string5 = string4;
                                                                list4 = list9;
                                                                MessageNano.reportError(e, cursor);
                                                                i2 = i2;
                                                                list6 = list;
                                                                str2 = string;
                                                                String str16 = string4;
                                                                String str17 = string5;
                                                                int i7110 = i6;
                                                                int i7111 = i7;
                                                                list7 = list2;
                                                                user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                                if (user.status == null) {
                                                                    user.status = UserStatus.oldEnumCovertList(list6);
                                                                }
                                                                tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                                user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                                user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                                user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str16, i7111);
                                                                user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str17, i7110);
                                                                user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                                location = user.location;
                                                                if (location.invisibleFields == null) {
                                                                    location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                                }
                                                                physical = user.profile.extensions.physical;
                                                                if (physical.bloodType == null) {
                                                                    physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                                }
                                                                profileExtensionBasic = user.profile.extensions.basic;
                                                                if (profileExtensionBasic.friendPurpose == null) {
                                                                    profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                                }
                                                                friendStatus = user.profile.extensions.friendStatus;
                                                                if (friendStatus.status == null) {
                                                                    friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                                }
                                                                if (user.name == null) {
                                                                    user.name = "";
                                                                }
                                                                if (user.location == null) {
                                                                    user.location = Location.new_();
                                                                }
                                                                if (user.description == null) {
                                                                    user.description = "";
                                                                }
                                                                if (user.age == null) {
                                                                    user.age = Integer.valueOf(i8);
                                                                }
                                                                if (user.pictures == null) {
                                                                    user.pictures = new ArrayList();
                                                                }
                                                                if (user.profile == null) {
                                                                    user.profile = Profile.new_();
                                                                }
                                                                if (user.status == null) {
                                                                    user.status = new ArrayList();
                                                                }
                                                                if (user.gender == null) {
                                                                    user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                                }
                                                                if (user.membership == null) {
                                                                    user.membership = Membership.new_();
                                                                }
                                                                if (user.realName == null) {
                                                                    user.realName = "";
                                                                }
                                                                if (user.nameRemark == null) {
                                                                    user.nameRemark = "";
                                                                }
                                                                if (user.verifications == null) {
                                                                    user.verifications = PicVerification.new_();
                                                                }
                                                                if (user.privateAnswers == null) {
                                                                    user.privateAnswers = new ArrayList();
                                                                }
                                                                if (user.picksTag == null) {
                                                                    user.picksTag = "";
                                                                }
                                                                if (user.picksTracker == null) {
                                                                    user.picksTracker = "";
                                                                }
                                                                if (user.voice == null) {
                                                                    user.voice = AudioSignature.new_();
                                                                }
                                                                if (user.liveState == null) {
                                                                    user.liveState = UserLiveState.new_();
                                                                }
                                                                if (user.abroad == null) {
                                                                    user.abroad = UserAbroad.new_();
                                                                }
                                                                if (user.medal == null) {
                                                                    user.medal = UserMedalWrapper.new_();
                                                                }
                                                                if (user.signupStage == null) {
                                                                    user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                                }
                                                                if (user.publicId == null) {
                                                                    user.publicId = "";
                                                                }
                                                                if (user.soulSettings == null) {
                                                                    user.soulSettings = UserSoulSettings.new_();
                                                                }
                                                                if (user.richListTracker == null) {
                                                                    user.richListTracker = "";
                                                                }
                                                                if (user.localRichListUsers == null) {
                                                                    user.localRichListUsers = RichListUsers.new_();
                                                                }
                                                                if (user.richListType == null) {
                                                                    user.richListType = "";
                                                                }
                                                                if (user.liveRevenueCampaignVip == null) {
                                                                    user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                                }
                                                                if (user.aiTag == null) {
                                                                    user.aiTag = "";
                                                                }
                                                                if (user.ussTracker == null) {
                                                                    user.ussTracker = "";
                                                                }
                                                                if (user.anchorHierarchy == null) {
                                                                    user.anchorHierarchy = LiveAnchorLevel.new_();
                                                                }
                                                                if (user.fanbaseHierarchy == null) {
                                                                    user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                                }
                                                                if (user.avatarFrame == null) {
                                                                    user.avatarFrame = AvatarFrame.new_();
                                                                }
                                                                if (user.hierarchy == null) {
                                                                    user.hierarchy = LiveUserLevel.new_();
                                                                }
                                                                if (user.banStatus == null) {
                                                                    user.banStatus = BanStatus.new_();
                                                                }
                                                                if (user.finishedStages == null) {
                                                                    user.finishedStages = new ArrayList();
                                                                }
                                                                if (user.activityUser == null) {
                                                                    user.activityUser = ActivityUser.new_();
                                                                }
                                                                if (user.regionTag == null) {
                                                                    user.regionTag = "";
                                                                }
                                                                if (user.localLikeIdentifiers == null) {
                                                                    user.localLikeIdentifiers = new ArrayList();
                                                                }
                                                                if (user.voiceLiveState == null) {
                                                                    user.voiceLiveState = VoiceLiveState.new_();
                                                                }
                                                                if (user.localSeeReminderType == null) {
                                                                    user.localSeeReminderType = "";
                                                                }
                                                                return user;
                                                            }
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            list5 = list14;
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        list9 = list13;
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    string = "unknown_";
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                string = "unknown_";
                                                str = string;
                                                string2 = str;
                                                string3 = string2;
                                                string4 = string3;
                                                string5 = string4;
                                                list3 = null;
                                                list4 = null;
                                                list5 = null;
                                                MessageNano.reportError(e, cursor);
                                                i2 = i2;
                                                list6 = list;
                                                str2 = string;
                                                String str18 = string4;
                                                String str19 = string5;
                                                int i7112 = i6;
                                                int i7113 = i7;
                                                list7 = list2;
                                                user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                                if (user.status == null) {
                                                    user.status = UserStatus.oldEnumCovertList(list6);
                                                }
                                                tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                                user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                                user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                                user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str18, i7113);
                                                user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str19, i7112);
                                                user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                                location = user.location;
                                                if (location.invisibleFields == null) {
                                                    location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                                }
                                                physical = user.profile.extensions.physical;
                                                if (physical.bloodType == null) {
                                                    physical.bloodType = BloodType.oldEnumCovertList(list3);
                                                }
                                                profileExtensionBasic = user.profile.extensions.basic;
                                                if (profileExtensionBasic.friendPurpose == null) {
                                                    profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                                }
                                                friendStatus = user.profile.extensions.friendStatus;
                                                if (friendStatus.status == null) {
                                                    friendStatus.status = FriendState.oldEnumCovertList(list5);
                                                }
                                                if (user.name == null) {
                                                    user.name = "";
                                                }
                                                if (user.location == null) {
                                                    user.location = Location.new_();
                                                }
                                                if (user.description == null) {
                                                    user.description = "";
                                                }
                                                if (user.age == null) {
                                                    user.age = Integer.valueOf(i8);
                                                }
                                                if (user.pictures == null) {
                                                    user.pictures = new ArrayList();
                                                }
                                                if (user.profile == null) {
                                                    user.profile = Profile.new_();
                                                }
                                                if (user.status == null) {
                                                    user.status = new ArrayList();
                                                }
                                                if (user.gender == null) {
                                                    user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                                }
                                                if (user.membership == null) {
                                                    user.membership = Membership.new_();
                                                }
                                                if (user.realName == null) {
                                                    user.realName = "";
                                                }
                                                if (user.nameRemark == null) {
                                                    user.nameRemark = "";
                                                }
                                                if (user.verifications == null) {
                                                    user.verifications = PicVerification.new_();
                                                }
                                                if (user.privateAnswers == null) {
                                                    user.privateAnswers = new ArrayList();
                                                }
                                                if (user.picksTag == null) {
                                                    user.picksTag = "";
                                                }
                                                if (user.picksTracker == null) {
                                                    user.picksTracker = "";
                                                }
                                                if (user.voice == null) {
                                                    user.voice = AudioSignature.new_();
                                                }
                                                if (user.liveState == null) {
                                                    user.liveState = UserLiveState.new_();
                                                }
                                                if (user.abroad == null) {
                                                    user.abroad = UserAbroad.new_();
                                                }
                                                if (user.medal == null) {
                                                    user.medal = UserMedalWrapper.new_();
                                                }
                                                if (user.signupStage == null) {
                                                    user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                                }
                                                if (user.publicId == null) {
                                                    user.publicId = "";
                                                }
                                                if (user.soulSettings == null) {
                                                    user.soulSettings = UserSoulSettings.new_();
                                                }
                                                if (user.richListTracker == null) {
                                                    user.richListTracker = "";
                                                }
                                                if (user.localRichListUsers == null) {
                                                    user.localRichListUsers = RichListUsers.new_();
                                                }
                                                if (user.richListType == null) {
                                                    user.richListType = "";
                                                }
                                                if (user.liveRevenueCampaignVip == null) {
                                                    user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                                }
                                                if (user.aiTag == null) {
                                                    user.aiTag = "";
                                                }
                                                if (user.ussTracker == null) {
                                                    user.ussTracker = "";
                                                }
                                                if (user.anchorHierarchy == null) {
                                                    user.anchorHierarchy = LiveAnchorLevel.new_();
                                                }
                                                if (user.fanbaseHierarchy == null) {
                                                    user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                                }
                                                if (user.avatarFrame == null) {
                                                    user.avatarFrame = AvatarFrame.new_();
                                                }
                                                if (user.hierarchy == null) {
                                                    user.hierarchy = LiveUserLevel.new_();
                                                }
                                                if (user.banStatus == null) {
                                                    user.banStatus = BanStatus.new_();
                                                }
                                                if (user.finishedStages == null) {
                                                    user.finishedStages = new ArrayList();
                                                }
                                                if (user.activityUser == null) {
                                                    user.activityUser = ActivityUser.new_();
                                                }
                                                if (user.regionTag == null) {
                                                    user.regionTag = "";
                                                }
                                                if (user.localLikeIdentifiers == null) {
                                                    user.localLikeIdentifiers = new ArrayList();
                                                }
                                                if (user.voiceLiveState == null) {
                                                    user.voiceLiveState = VoiceLiveState.new_();
                                                }
                                                if (user.localSeeReminderType == null) {
                                                    user.localSeeReminderType = "";
                                                }
                                                return user;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            string = "unknown_";
                                            str = string;
                                            string2 = str;
                                            string3 = string2;
                                            string4 = string3;
                                            string5 = string4;
                                            list2 = null;
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        string = "unknown_";
                                        i8 = 0;
                                        i7 = i7;
                                        i6 = i6;
                                        i2 = i2;
                                        list = list;
                                        str = string;
                                        string2 = str;
                                        string3 = string2;
                                        string4 = string3;
                                        string5 = string4;
                                        list2 = null;
                                        list3 = null;
                                        i5 = -1;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    string = "unknown_";
                                    i8 = 0;
                                    i7 = i7;
                                    i2 = i2;
                                    list = list;
                                    str = string;
                                    string2 = str;
                                    string3 = string2;
                                    string4 = string3;
                                    string5 = string4;
                                    list2 = null;
                                    list3 = null;
                                    i5 = -1;
                                    list4 = null;
                                    list5 = null;
                                    i6 = -1;
                                }
                            } catch (Exception e19) {
                                e = e19;
                                string = "unknown_";
                                i8 = 0;
                                i2 = i2;
                                list = list;
                                str = string;
                                string2 = str;
                                string3 = string2;
                                string4 = string3;
                                string5 = string4;
                                list2 = null;
                                list3 = null;
                                i5 = -1;
                                list4 = null;
                                list5 = null;
                                i6 = -1;
                                i7 = -1;
                                MessageNano.reportError(e, cursor);
                                i2 = i2;
                                list6 = list;
                                str2 = string;
                                String str110 = string4;
                                String str111 = string5;
                                int i7114 = i6;
                                int i7115 = i7;
                                list7 = list2;
                                user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                                if (user.status == null) {
                                    user.status = UserStatus.oldEnumCovertList(list6);
                                }
                                tEnumJsonAdapter = Gender.JSON_ADAPTER;
                                user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                                user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                                user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str110, i7115);
                                user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str111, i7114);
                                user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                                location = user.location;
                                if (location.invisibleFields == null) {
                                    location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                                }
                                physical = user.profile.extensions.physical;
                                if (physical.bloodType == null) {
                                    physical.bloodType = BloodType.oldEnumCovertList(list3);
                                }
                                profileExtensionBasic = user.profile.extensions.basic;
                                if (profileExtensionBasic.friendPurpose == null) {
                                    profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                                }
                                friendStatus = user.profile.extensions.friendStatus;
                                if (friendStatus.status == null) {
                                    friendStatus.status = FriendState.oldEnumCovertList(list5);
                                }
                                if (user.name == null) {
                                    user.name = "";
                                }
                                if (user.location == null) {
                                    user.location = Location.new_();
                                }
                                if (user.description == null) {
                                    user.description = "";
                                }
                                if (user.age == null) {
                                    user.age = Integer.valueOf(i8);
                                }
                                if (user.pictures == null) {
                                    user.pictures = new ArrayList();
                                }
                                if (user.profile == null) {
                                    user.profile = Profile.new_();
                                }
                                if (user.status == null) {
                                    user.status = new ArrayList();
                                }
                                if (user.gender == null) {
                                    user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                                }
                                if (user.membership == null) {
                                    user.membership = Membership.new_();
                                }
                                if (user.realName == null) {
                                    user.realName = "";
                                }
                                if (user.nameRemark == null) {
                                    user.nameRemark = "";
                                }
                                if (user.verifications == null) {
                                    user.verifications = PicVerification.new_();
                                }
                                if (user.privateAnswers == null) {
                                    user.privateAnswers = new ArrayList();
                                }
                                if (user.picksTag == null) {
                                    user.picksTag = "";
                                }
                                if (user.picksTracker == null) {
                                    user.picksTracker = "";
                                }
                                if (user.voice == null) {
                                    user.voice = AudioSignature.new_();
                                }
                                if (user.liveState == null) {
                                    user.liveState = UserLiveState.new_();
                                }
                                if (user.abroad == null) {
                                    user.abroad = UserAbroad.new_();
                                }
                                if (user.medal == null) {
                                    user.medal = UserMedalWrapper.new_();
                                }
                                if (user.signupStage == null) {
                                    user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                                }
                                if (user.publicId == null) {
                                    user.publicId = "";
                                }
                                if (user.soulSettings == null) {
                                    user.soulSettings = UserSoulSettings.new_();
                                }
                                if (user.richListTracker == null) {
                                    user.richListTracker = "";
                                }
                                if (user.localRichListUsers == null) {
                                    user.localRichListUsers = RichListUsers.new_();
                                }
                                if (user.richListType == null) {
                                    user.richListType = "";
                                }
                                if (user.liveRevenueCampaignVip == null) {
                                    user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                                }
                                if (user.aiTag == null) {
                                    user.aiTag = "";
                                }
                                if (user.ussTracker == null) {
                                    user.ussTracker = "";
                                }
                                if (user.anchorHierarchy == null) {
                                    user.anchorHierarchy = LiveAnchorLevel.new_();
                                }
                                if (user.fanbaseHierarchy == null) {
                                    user.fanbaseHierarchy = LiveFansClubLevel.new_();
                                }
                                if (user.avatarFrame == null) {
                                    user.avatarFrame = AvatarFrame.new_();
                                }
                                if (user.hierarchy == null) {
                                    user.hierarchy = LiveUserLevel.new_();
                                }
                                if (user.banStatus == null) {
                                    user.banStatus = BanStatus.new_();
                                }
                                if (user.finishedStages == null) {
                                    user.finishedStages = new ArrayList();
                                }
                                if (user.activityUser == null) {
                                    user.activityUser = ActivityUser.new_();
                                }
                                if (user.regionTag == null) {
                                    user.regionTag = "";
                                }
                                if (user.localLikeIdentifiers == null) {
                                    user.localLikeIdentifiers = new ArrayList();
                                }
                                if (user.voiceLiveState == null) {
                                    user.voiceLiveState = VoiceLiveState.new_();
                                }
                                if (user.localSeeReminderType == null) {
                                    user.localSeeReminderType = "";
                                }
                                return user;
                            }
                        } catch (Exception e20) {
                            e = e20;
                            string = "unknown_";
                            i8 = 0;
                            i2 = i2;
                            list = list;
                            str = string;
                            string2 = str;
                            string3 = string2;
                            string4 = string3;
                            string5 = string4;
                            i4 = -1;
                            list2 = null;
                            list3 = null;
                            i5 = -1;
                            list4 = null;
                            list5 = null;
                            i6 = -1;
                            i7 = -1;
                            MessageNano.reportError(e, cursor);
                            i2 = i2;
                            list6 = list;
                            str2 = string;
                            String str112 = string4;
                            String str113 = string5;
                            int i7116 = i6;
                            int i7117 = i7;
                            list7 = list2;
                            user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                            if (user.status == null) {
                                user.status = UserStatus.oldEnumCovertList(list6);
                            }
                            tEnumJsonAdapter = Gender.JSON_ADAPTER;
                            user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                            user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                            user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str112, i7117);
                            user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str113, i7116);
                            user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                            location = user.location;
                            if (location.invisibleFields == null) {
                                location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                            }
                            physical = user.profile.extensions.physical;
                            if (physical.bloodType == null) {
                                physical.bloodType = BloodType.oldEnumCovertList(list3);
                            }
                            profileExtensionBasic = user.profile.extensions.basic;
                            if (profileExtensionBasic.friendPurpose == null) {
                                profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                            }
                            friendStatus = user.profile.extensions.friendStatus;
                            if (friendStatus.status == null) {
                                friendStatus.status = FriendState.oldEnumCovertList(list5);
                            }
                            if (user.name == null) {
                                user.name = "";
                            }
                            if (user.location == null) {
                                user.location = Location.new_();
                            }
                            if (user.description == null) {
                                user.description = "";
                            }
                            if (user.age == null) {
                                user.age = Integer.valueOf(i8);
                            }
                            if (user.pictures == null) {
                                user.pictures = new ArrayList();
                            }
                            if (user.profile == null) {
                                user.profile = Profile.new_();
                            }
                            if (user.status == null) {
                                user.status = new ArrayList();
                            }
                            if (user.gender == null) {
                                user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                            }
                            if (user.membership == null) {
                                user.membership = Membership.new_();
                            }
                            if (user.realName == null) {
                                user.realName = "";
                            }
                            if (user.nameRemark == null) {
                                user.nameRemark = "";
                            }
                            if (user.verifications == null) {
                                user.verifications = PicVerification.new_();
                            }
                            if (user.privateAnswers == null) {
                                user.privateAnswers = new ArrayList();
                            }
                            if (user.picksTag == null) {
                                user.picksTag = "";
                            }
                            if (user.picksTracker == null) {
                                user.picksTracker = "";
                            }
                            if (user.voice == null) {
                                user.voice = AudioSignature.new_();
                            }
                            if (user.liveState == null) {
                                user.liveState = UserLiveState.new_();
                            }
                            if (user.abroad == null) {
                                user.abroad = UserAbroad.new_();
                            }
                            if (user.medal == null) {
                                user.medal = UserMedalWrapper.new_();
                            }
                            if (user.signupStage == null) {
                                user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                            }
                            if (user.publicId == null) {
                                user.publicId = "";
                            }
                            if (user.soulSettings == null) {
                                user.soulSettings = UserSoulSettings.new_();
                            }
                            if (user.richListTracker == null) {
                                user.richListTracker = "";
                            }
                            if (user.localRichListUsers == null) {
                                user.localRichListUsers = RichListUsers.new_();
                            }
                            if (user.richListType == null) {
                                user.richListType = "";
                            }
                            if (user.liveRevenueCampaignVip == null) {
                                user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                            }
                            if (user.aiTag == null) {
                                user.aiTag = "";
                            }
                            if (user.ussTracker == null) {
                                user.ussTracker = "";
                            }
                            if (user.anchorHierarchy == null) {
                                user.anchorHierarchy = LiveAnchorLevel.new_();
                            }
                            if (user.fanbaseHierarchy == null) {
                                user.fanbaseHierarchy = LiveFansClubLevel.new_();
                            }
                            if (user.avatarFrame == null) {
                                user.avatarFrame = AvatarFrame.new_();
                            }
                            if (user.hierarchy == null) {
                                user.hierarchy = LiveUserLevel.new_();
                            }
                            if (user.banStatus == null) {
                                user.banStatus = BanStatus.new_();
                            }
                            if (user.finishedStages == null) {
                                user.finishedStages = new ArrayList();
                            }
                            if (user.activityUser == null) {
                                user.activityUser = ActivityUser.new_();
                            }
                            if (user.regionTag == null) {
                                user.regionTag = "";
                            }
                            if (user.localLikeIdentifiers == null) {
                                user.localLikeIdentifiers = new ArrayList();
                            }
                            if (user.voiceLiveState == null) {
                                user.voiceLiveState = VoiceLiveState.new_();
                            }
                            if (user.localSeeReminderType == null) {
                                user.localSeeReminderType = "";
                            }
                            return user;
                        }
                    } catch (Exception e21) {
                        e = e21;
                        string = "unknown_";
                        i8 = 0;
                        i2 = i2;
                        list = list;
                        str = string;
                        string2 = str;
                        string3 = string2;
                        string4 = string3;
                        string5 = string4;
                        i3 = -1;
                        i4 = -1;
                        list2 = null;
                        list3 = null;
                        i5 = -1;
                        list4 = null;
                        list5 = null;
                        i6 = -1;
                        i7 = -1;
                        MessageNano.reportError(e, cursor);
                        i2 = i2;
                        list6 = list;
                        str2 = string;
                        String str114 = string4;
                        String str115 = string5;
                        int i7118 = i6;
                        int i7119 = i7;
                        list7 = list2;
                        user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                        if (user.status == null) {
                            user.status = UserStatus.oldEnumCovertList(list6);
                        }
                        tEnumJsonAdapter = Gender.JSON_ADAPTER;
                        user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                        user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                        user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str114, i7119);
                        user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str115, i7118);
                        user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                        location = user.location;
                        if (location.invisibleFields == null) {
                            location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                        }
                        physical = user.profile.extensions.physical;
                        if (physical.bloodType == null) {
                            physical.bloodType = BloodType.oldEnumCovertList(list3);
                        }
                        profileExtensionBasic = user.profile.extensions.basic;
                        if (profileExtensionBasic.friendPurpose == null) {
                            profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                        }
                        friendStatus = user.profile.extensions.friendStatus;
                        if (friendStatus.status == null) {
                            friendStatus.status = FriendState.oldEnumCovertList(list5);
                        }
                        if (user.name == null) {
                            user.name = "";
                        }
                        if (user.location == null) {
                            user.location = Location.new_();
                        }
                        if (user.description == null) {
                            user.description = "";
                        }
                        if (user.age == null) {
                            user.age = Integer.valueOf(i8);
                        }
                        if (user.pictures == null) {
                            user.pictures = new ArrayList();
                        }
                        if (user.profile == null) {
                            user.profile = Profile.new_();
                        }
                        if (user.status == null) {
                            user.status = new ArrayList();
                        }
                        if (user.gender == null) {
                            user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                        }
                        if (user.membership == null) {
                            user.membership = Membership.new_();
                        }
                        if (user.realName == null) {
                            user.realName = "";
                        }
                        if (user.nameRemark == null) {
                            user.nameRemark = "";
                        }
                        if (user.verifications == null) {
                            user.verifications = PicVerification.new_();
                        }
                        if (user.privateAnswers == null) {
                            user.privateAnswers = new ArrayList();
                        }
                        if (user.picksTag == null) {
                            user.picksTag = "";
                        }
                        if (user.picksTracker == null) {
                            user.picksTracker = "";
                        }
                        if (user.voice == null) {
                            user.voice = AudioSignature.new_();
                        }
                        if (user.liveState == null) {
                            user.liveState = UserLiveState.new_();
                        }
                        if (user.abroad == null) {
                            user.abroad = UserAbroad.new_();
                        }
                        if (user.medal == null) {
                            user.medal = UserMedalWrapper.new_();
                        }
                        if (user.signupStage == null) {
                            user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                        }
                        if (user.publicId == null) {
                            user.publicId = "";
                        }
                        if (user.soulSettings == null) {
                            user.soulSettings = UserSoulSettings.new_();
                        }
                        if (user.richListTracker == null) {
                            user.richListTracker = "";
                        }
                        if (user.localRichListUsers == null) {
                            user.localRichListUsers = RichListUsers.new_();
                        }
                        if (user.richListType == null) {
                            user.richListType = "";
                        }
                        if (user.liveRevenueCampaignVip == null) {
                            user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                        }
                        if (user.aiTag == null) {
                            user.aiTag = "";
                        }
                        if (user.ussTracker == null) {
                            user.ussTracker = "";
                        }
                        if (user.anchorHierarchy == null) {
                            user.anchorHierarchy = LiveAnchorLevel.new_();
                        }
                        if (user.fanbaseHierarchy == null) {
                            user.fanbaseHierarchy = LiveFansClubLevel.new_();
                        }
                        if (user.avatarFrame == null) {
                            user.avatarFrame = AvatarFrame.new_();
                        }
                        if (user.hierarchy == null) {
                            user.hierarchy = LiveUserLevel.new_();
                        }
                        if (user.banStatus == null) {
                            user.banStatus = BanStatus.new_();
                        }
                        if (user.finishedStages == null) {
                            user.finishedStages = new ArrayList();
                        }
                        if (user.activityUser == null) {
                            user.activityUser = ActivityUser.new_();
                        }
                        if (user.regionTag == null) {
                            user.regionTag = "";
                        }
                        if (user.localLikeIdentifiers == null) {
                            user.localLikeIdentifiers = new ArrayList();
                        }
                        if (user.voiceLiveState == null) {
                            user.voiceLiveState = VoiceLiveState.new_();
                        }
                        if (user.localSeeReminderType == null) {
                            user.localSeeReminderType = "";
                        }
                        return user;
                    }
                } catch (Exception e22) {
                    e = e22;
                    string = "unknown_";
                    i2 = i2;
                    str = string;
                    string2 = str;
                    string3 = string2;
                    string4 = string3;
                    string5 = string4;
                    list = null;
                    i3 = -1;
                    i4 = -1;
                    list2 = null;
                    list3 = null;
                    i5 = -1;
                    list4 = null;
                    list5 = null;
                    i6 = -1;
                    i7 = -1;
                    MessageNano.reportError(e, cursor);
                    i2 = i2;
                    list6 = list;
                    str2 = string;
                    String str116 = string4;
                    String str117 = string5;
                    int i71110 = i6;
                    int i71111 = i7;
                    list7 = list2;
                    user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
                    if (user.status == null) {
                        user.status = UserStatus.oldEnumCovertList(list6);
                    }
                    tEnumJsonAdapter = Gender.JSON_ADAPTER;
                    user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
                    user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
                    user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str116, i71111);
                    user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str117, i71110);
                    user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
                    location = user.location;
                    if (location.invisibleFields == null) {
                        location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
                    }
                    physical = user.profile.extensions.physical;
                    if (physical.bloodType == null) {
                        physical.bloodType = BloodType.oldEnumCovertList(list3);
                    }
                    profileExtensionBasic = user.profile.extensions.basic;
                    if (profileExtensionBasic.friendPurpose == null) {
                        profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
                    }
                    friendStatus = user.profile.extensions.friendStatus;
                    if (friendStatus.status == null) {
                        friendStatus.status = FriendState.oldEnumCovertList(list5);
                    }
                    if (user.name == null) {
                        user.name = "";
                    }
                    if (user.location == null) {
                        user.location = Location.new_();
                    }
                    if (user.description == null) {
                        user.description = "";
                    }
                    if (user.age == null) {
                        user.age = Integer.valueOf(i8);
                    }
                    if (user.pictures == null) {
                        user.pictures = new ArrayList();
                    }
                    if (user.profile == null) {
                        user.profile = Profile.new_();
                    }
                    if (user.status == null) {
                        user.status = new ArrayList();
                    }
                    if (user.gender == null) {
                        user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
                    }
                    if (user.membership == null) {
                        user.membership = Membership.new_();
                    }
                    if (user.realName == null) {
                        user.realName = "";
                    }
                    if (user.nameRemark == null) {
                        user.nameRemark = "";
                    }
                    if (user.verifications == null) {
                        user.verifications = PicVerification.new_();
                    }
                    if (user.privateAnswers == null) {
                        user.privateAnswers = new ArrayList();
                    }
                    if (user.picksTag == null) {
                        user.picksTag = "";
                    }
                    if (user.picksTracker == null) {
                        user.picksTracker = "";
                    }
                    if (user.voice == null) {
                        user.voice = AudioSignature.new_();
                    }
                    if (user.liveState == null) {
                        user.liveState = UserLiveState.new_();
                    }
                    if (user.abroad == null) {
                        user.abroad = UserAbroad.new_();
                    }
                    if (user.medal == null) {
                        user.medal = UserMedalWrapper.new_();
                    }
                    if (user.signupStage == null) {
                        user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                    }
                    if (user.publicId == null) {
                        user.publicId = "";
                    }
                    if (user.soulSettings == null) {
                        user.soulSettings = UserSoulSettings.new_();
                    }
                    if (user.richListTracker == null) {
                        user.richListTracker = "";
                    }
                    if (user.localRichListUsers == null) {
                        user.localRichListUsers = RichListUsers.new_();
                    }
                    if (user.richListType == null) {
                        user.richListType = "";
                    }
                    if (user.liveRevenueCampaignVip == null) {
                        user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
                    }
                    if (user.aiTag == null) {
                        user.aiTag = "";
                    }
                    if (user.ussTracker == null) {
                        user.ussTracker = "";
                    }
                    if (user.anchorHierarchy == null) {
                        user.anchorHierarchy = LiveAnchorLevel.new_();
                    }
                    if (user.fanbaseHierarchy == null) {
                        user.fanbaseHierarchy = LiveFansClubLevel.new_();
                    }
                    if (user.avatarFrame == null) {
                        user.avatarFrame = AvatarFrame.new_();
                    }
                    if (user.hierarchy == null) {
                        user.hierarchy = LiveUserLevel.new_();
                    }
                    if (user.banStatus == null) {
                        user.banStatus = BanStatus.new_();
                    }
                    if (user.finishedStages == null) {
                        user.finishedStages = new ArrayList();
                    }
                    if (user.activityUser == null) {
                        user.activityUser = ActivityUser.new_();
                    }
                    if (user.regionTag == null) {
                        user.regionTag = "";
                    }
                    if (user.localLikeIdentifiers == null) {
                        user.localLikeIdentifiers = new ArrayList();
                    }
                    if (user.voiceLiveState == null) {
                        user.voiceLiveState = VoiceLiveState.new_();
                    }
                    if (user.localSeeReminderType == null) {
                        user.localSeeReminderType = "";
                    }
                    return user;
                }
            } catch (Exception e23) {
                e = e23;
                string = "unknown_";
                str = string;
                string2 = str;
                string3 = string2;
                string4 = string3;
                string5 = string4;
                i2 = -1;
            }
            String str118 = string4;
            String str119 = string5;
            int i71112 = i6;
            int i71113 = i7;
            list7 = list2;
            user.profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(string2, i2);
            if (user.status == null && list6 != null) {
                user.status = UserStatus.oldEnumCovertList(list6);
            }
            tEnumJsonAdapter = Gender.JSON_ADAPTER;
            user.gender = (Gender) tEnumJsonAdapter.newTEnum(str2, i3);
            user.membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(string3, i4);
            user.source = (UserSource) UserSource.JSON_ADAPTER.newTEnum(str118, i71113);
            user.membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(str119, i71112);
            user.profile.studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(str, i5);
            location = user.location;
            if (location.invisibleFields == null && list7 != null) {
                location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list7);
            }
            physical = user.profile.extensions.physical;
            if (physical.bloodType == null && list3 != null) {
                physical.bloodType = BloodType.oldEnumCovertList(list3);
            }
            profileExtensionBasic = user.profile.extensions.basic;
            if (profileExtensionBasic.friendPurpose == null && list4 != null) {
                profileExtensionBasic.friendPurpose = Purpose.oldEnumCovertList(list4);
            }
            friendStatus = user.profile.extensions.friendStatus;
            if (friendStatus.status == null && list5 != null) {
                friendStatus.status = FriendState.oldEnumCovertList(list5);
            }
            if (user.name == null) {
                user.name = "";
            }
            if (user.location == null) {
                user.location = Location.new_();
            }
            if (user.description == null) {
                user.description = "";
            }
            if (user.age == null) {
                user.age = Integer.valueOf(i8);
            }
            if (user.pictures == null) {
                user.pictures = new ArrayList();
            }
            if (user.profile == null) {
                user.profile = Profile.new_();
            }
            if (user.status == null) {
                user.status = new ArrayList();
            }
            if (user.gender == null) {
                user.gender = (Gender) tEnumJsonAdapter.defaultEnum();
            }
            if (user.membership == null) {
                user.membership = Membership.new_();
            }
            if (user.realName == null) {
                user.realName = "";
            }
            if (user.nameRemark == null) {
                user.nameRemark = "";
            }
            if (user.verifications == null) {
                user.verifications = PicVerification.new_();
            }
            if (user.privateAnswers == null) {
                user.privateAnswers = new ArrayList();
            }
            if (user.picksTag == null) {
                user.picksTag = "";
            }
            if (user.picksTracker == null) {
                user.picksTracker = "";
            }
            if (user.voice == null) {
                user.voice = AudioSignature.new_();
            }
            if (user.liveState == null) {
                user.liveState = UserLiveState.new_();
            }
            if (user.abroad == null) {
                user.abroad = UserAbroad.new_();
            }
            if (user.medal == null) {
                user.medal = UserMedalWrapper.new_();
            }
            if (user.signupStage == null) {
                user.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
            }
            if (user.publicId == null) {
                user.publicId = "";
            }
            if (user.soulSettings == null) {
                user.soulSettings = UserSoulSettings.new_();
            }
            if (user.richListTracker == null) {
                user.richListTracker = "";
            }
            if (user.localRichListUsers == null) {
                user.localRichListUsers = RichListUsers.new_();
            }
            if (user.richListType == null) {
                user.richListType = "";
            }
            if (user.liveRevenueCampaignVip == null) {
                user.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
            }
            if (user.aiTag == null) {
                user.aiTag = "";
            }
            if (user.ussTracker == null) {
                user.ussTracker = "";
            }
            if (user.anchorHierarchy == null) {
                user.anchorHierarchy = LiveAnchorLevel.new_();
            }
            if (user.fanbaseHierarchy == null) {
                user.fanbaseHierarchy = LiveFansClubLevel.new_();
            }
            if (user.avatarFrame == null) {
                user.avatarFrame = AvatarFrame.new_();
            }
            if (user.hierarchy == null) {
                user.hierarchy = LiveUserLevel.new_();
            }
            if (user.banStatus == null) {
                user.banStatus = BanStatus.new_();
            }
            if (user.finishedStages == null) {
                user.finishedStages = new ArrayList();
            }
            if (user.activityUser == null) {
                user.activityUser = ActivityUser.new_();
            }
            if (user.regionTag == null) {
                user.regionTag = "";
            }
            if (user.localLikeIdentifiers == null) {
                user.localLikeIdentifiers = new ArrayList();
            }
            if (user.voiceLiveState == null) {
                user.voiceLiveState = VoiceLiveState.new_();
            }
            if (user.localSeeReminderType == null) {
                user.localSeeReminderType = "";
            }
            return user;
        }

        @Override // p153l.vzf0
        public void write(User user, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", user.f56859id);
                DbObject.cvPut(contentValues, "name_c", user.name);
                DbObject.cvPut(contentValues, "location_distance_c", Integer.valueOf(user.location.distance));
                DbObject.cvPut(contentValues, "location_updatedTime_c", Double.valueOf(user.location.updatedTime));
                DbObject.cvPut(contentValues, "location_region_district_c", user.location.region.district);
                DbObject.cvPut(contentValues, "location_region_city_c", user.location.region.city);
                DbObject.cvPut(contentValues, "location_region_country_c", user.location.region.country);
                Passby passby = user.location.passby;
                DbObject.cvPut(contentValues, "location_passby_c", passby == null ? null : Passby.PROTOBUF_ADAPTER.serialize(passby));
                DbObject.cvPut(contentValues, "description_c", user.description);
                DbObject.cvPut(contentValues, "age_c", user.age);
                DbObject.cvPut(contentValues, "pictures_c", user.pictures == null ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.pictures));
                DbObject.cvPut(contentValues, "createdTime_c", Double.valueOf(user.createdTime));
                DbObject.cvPut(contentValues, "profile_school_c", user.profile.school);
                DbObject.cvPut(contentValues, "profile_hangouts_c", user.profile.hangouts);
                DbObject.cvPut(contentValues, "profile_hometown_c", user.profile.hometown);
                DbObject.cvPut(contentValues, "profile_receivedLikes_c", user.profile.receivedLikes);
                DbObject.cvPut(contentValues, "profile_tags_c", user.profile.tags == null ? null : Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.tags));
                DbObject.cvPut(contentValues, "profile_job_c", user.profile.job);
                DbObject.cvPut(contentValues, "profile_contactLookups_batchSize_c", Integer.valueOf(user.profile.contactLookups.batchSize));
                DbObject.cvPut(contentValues, "profile_contactLookups_lookups_c", user.profile.contactLookups.lookups == null ? null : Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.contactLookups.lookups));
                DbObject.cvPut(contentValues, "profile_contactLookups_next_c", user.profile.contactLookups.next);
                DbObject.cvPut(contentValues, "profile_social_c", user.profile.social == null ? null : Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.social));
                DbObject.cvPut(contentValues, "profile_answers_c", user.profile.answers == null ? null : Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.answers));
                ProfileZodiac profileZodiac = user.profile.zodiac;
                DbObject.cvPut(contentValues, "str_profile_zodiac_c", profileZodiac == null ? null : profileZodiac.toString());
                ProfileZodiac profileZodiac2 = user.profile.zodiac;
                DbObject.cvPut(contentValues, "profile_zodiac_c", profileZodiac2 == null ? null : Integer.valueOf(profileZodiac2.ordinal()));
                DbObject.cvPut(contentValues, "profile_occupation_c", user.profile.occupation);
                DbObject.cvPut(contentValues, "status_c", user.status == null ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(UserStatus.covertToOldEnumList(user.status)));
                Settings settings = user.settings;
                DbObject.cvPut(contentValues, "settings_c", settings == null ? null : Settings.PROTOBUF_ADAPTER.serialize(settings));
                Gender gender = user.gender;
                DbObject.cvPut(contentValues, "str_gender_c", gender == null ? null : gender.toString());
                Gender gender2 = user.gender;
                DbObject.cvPut(contentValues, "gender_c", gender2 == null ? null : Integer.valueOf(gender2.ordinal()));
                DbObject.cvPut(contentValues, "profile_work_industry_c", user.profile.work.industry);
                DbObject.cvPut(contentValues, "profile_work_department_c", user.profile.work.department);
                DbObject.cvPut(contentValues, "profile_work_company_c", user.profile.work.company);
                DbObject.cvPut(contentValues, "profile_work_active_c", Integer.valueOf(user.profile.work.active ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_studies_major_c", user.profile.studies.major);
                DbObject.cvPut(contentValues, "profile_studies_school_c", user.profile.studies.school);
                DbObject.cvPut(contentValues, "profile_studies_active_c", Integer.valueOf(user.profile.studies.active ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_scenarios_c", user.profile.scenarios == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.scenarios));
                DbObject.cvPut(contentValues, "profile_receivedLikesRank_c", user.profile.receivedLikesRank);
                Relationship relationship = user.localRelationship;
                DbObject.cvPut(contentValues, "localRelationship_c", relationship == null ? null : Relationship.PROTOBUF_ADAPTER.serialize(relationship));
                MembershipType membershipType = user.membership.name;
                DbObject.cvPut(contentValues, "str_membership_name_c", membershipType == null ? null : membershipType.toString());
                MembershipType membershipType2 = user.membership.name;
                DbObject.cvPut(contentValues, "membership_name_c", membershipType2 == null ? null : Integer.valueOf(membershipType2.ordinal()));
                DbObject.cvPut(contentValues, "membership_active_c", Integer.valueOf(user.membership.active ? 1 : 0));
                DbObject.cvPut(contentValues, "membership_expiresTime_c", Double.valueOf(user.membership.expiresTime));
                UserSource userSource = user.source;
                DbObject.cvPut(contentValues, "str_source_c", userSource == null ? null : userSource.toString());
                UserSource userSource2 = user.source;
                DbObject.cvPut(contentValues, "source_c", userSource2 == null ? null : Integer.valueOf(userSource2.ordinal()));
                DbObject.cvPut(contentValues, "profile_studies_verified_c", Integer.valueOf(user.profile.studies.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_studies_grade_c", user.profile.studies.grade);
                DbObject.cvPut(contentValues, "profile_tbh_friends_c", Integer.valueOf(user.profile.tbh.friends));
                DbObject.cvPut(contentValues, "profile_tbh_receivedVotes_c", Integer.valueOf(user.profile.tbh.receivedVotes));
                DbObject.cvPut(contentValues, "profile_tbh_receivedVotedPolls_c", Integer.valueOf(user.profile.tbh.receivedVotedPolls));
                DbObject.cvPut(contentValues, "profile_tbh_createdTime_c", Double.valueOf(user.profile.tbh.createdTime));
                DbObject.cvPut(contentValues, "realName_c", user.realName);
                DbObject.cvPut(contentValues, "profile_followships_counters_followings_c", Integer.valueOf(user.profile.followships.counters.followings));
                DbObject.cvPut(contentValues, "profile_followships_counters_followers_c", Integer.valueOf(user.profile.followships.counters.followers));
                DbObject.cvPut(contentValues, "profile_moments_hidePublicMoments_c", Integer.valueOf(user.profile.moments.hidePublicMoments ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_moments_counters_totalMoments_c", Integer.valueOf(user.profile.moments.counters.totalMoments));
                DbObject.cvPut(contentValues, "profile_moments_counters_receiveMomentLikes_c", Integer.valueOf(user.profile.moments.counters.receiveMomentLikes));
                Followship followship = user.localFollowship;
                DbObject.cvPut(contentValues, "localFollowship_c", followship == null ? null : Followship.PROTOBUF_ADAPTER.serialize(followship));
                DbObject.cvPut(contentValues, "membership_duration_c", Long.valueOf(user.membership.duration));
                DbObject.cvPut(contentValues, "memberships_c", user.memberships == null ? null : Membership.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.memberships));
                DbObject.cvPut(contentValues, "nameRemark_c", user.nameRemark);
                UserState userState = user.state;
                DbObject.cvPut(contentValues, "state_c", userState == null ? null : UserState.PROTOBUF_ADAPTER.serialize(userState));
                DbObject.cvPut(contentValues, "verifications_picVerificationResult_verified_c", Integer.valueOf(user.verifications.picVerificationResult.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "abGroups_c", user.abGroups == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.abGroups));
                DbObject.cvPut(contentValues, "privateAnswers_c", user.privateAnswers == null ? null : PrivateAnswer.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.privateAnswers));
                Membership membership = user.peepership;
                DbObject.cvPut(contentValues, "peepership_c", membership == null ? null : Membership.PROTOBUF_ADAPTER.serialize(membership));
                DbObject.cvPut(contentValues, "picksExpiredTimestamp_c", Long.valueOf(user.picksExpiredTimestamp));
                DbObject.cvPut(contentValues, "picksSwipable_c", Integer.valueOf(user.picksSwipable ? 1 : 0));
                DbObject.cvPut(contentValues, "picksTag_c", user.picksTag);
                UserCreditData userCreditData = user.credit;
                DbObject.cvPut(contentValues, "credit_c", userCreditData == null ? null : UserCreditData.PROTOBUF_ADAPTER.serialize(userCreditData));
                DbObject.cvPut(contentValues, "goPlaceTimestamp_c", Double.valueOf(user.goPlaceTimestamp));
                DbObject.cvPut(contentValues, "isLord_c", Integer.valueOf(user.isLord ? 1 : 0));
                DbObject.cvPut(contentValues, "privateAnswersUpdatedTime_c", Double.valueOf(user.privateAnswersUpdatedTime));
                DbObject.cvPut(contentValues, "sendLetter_c", user.sendLetter);
                DbObject.cvPut(contentValues, "sendLetterTimestamp_c", Long.valueOf(user.sendLetterTimestamp));
                DbObject.cvPut(contentValues, "receivedLetter_c", user.receivedLetter);
                DbObject.cvPut(contentValues, "receivedLetterTimestamp_c", Long.valueOf(user.receivedLetterTimestamp));
                DbObject.cvPut(contentValues, "popLevel_c", Integer.valueOf(user.popLevel));
                AudioSignature audioSignature = user.voice;
                DbObject.cvPut(contentValues, "voice_c", audioSignature == null ? null : AudioSignature.PROTOBUF_ADAPTER.serialize(audioSignature));
                DbObject.cvPut(contentValues, "datingMode_c", Integer.valueOf(user.datingMode ? 1 : 0));
                UssTags ussTags = user.ussTags;
                DbObject.cvPut(contentValues, "ussTags_c", ussTags == null ? null : UssTags.PROTOBUF_ADAPTER.serialize(ussTags));
                VIPBadgeType vIPBadgeType = user.membership.vipBadgeType;
                DbObject.cvPut(contentValues, "str_membership_vipBadgeType_c", vIPBadgeType == null ? null : vIPBadgeType.toString());
                VIPBadgeType vIPBadgeType2 = user.membership.vipBadgeType;
                DbObject.cvPut(contentValues, "membership_vipBadgeType_c", vIPBadgeType2 == null ? null : Integer.valueOf(vIPBadgeType2.ordinal()));
                UserAbroad userAbroad = user.abroad;
                DbObject.cvPut(contentValues, "abroad_c", userAbroad == null ? null : UserAbroad.PROTOBUF_ADAPTER.serialize(userAbroad));
                StatusesItem statusesItem = user.fakeStatus;
                DbObject.cvPut(contentValues, "fakeStatus_c", statusesItem == null ? null : StatusesItem.PROTOBUF_ADAPTER.serialize(statusesItem));
                StatusesItem statusesItem2 = user.nameStatus;
                DbObject.cvPut(contentValues, "nameStatus_c", statusesItem2 == null ? null : StatusesItem.PROTOBUF_ADAPTER.serialize(statusesItem2));
                DbObject.cvPut(contentValues, "displayAudit_c", Integer.valueOf(user.displayAudit ? 1 : 0));
                VisitPlace visitPlace = user.visitPlace;
                DbObject.cvPut(contentValues, "visitPlace_c", visitPlace == null ? null : VisitPlace.PROTOBUF_ADAPTER.serialize(visitPlace));
                DbObject.cvPut(contentValues, "publicId_c", user.publicId);
                UserSoulSettings userSoulSettings = user.soulSettings;
                DbObject.cvPut(contentValues, "soulSettings_c", userSoulSettings == null ? null : UserSoulSettings.PROTOBUF_ADAPTER.serialize(userSoulSettings));
                DbObject.cvPut(contentValues, "richListPosition_c", Integer.valueOf(user.richListPosition));
                DbObject.cvPut(contentValues, "richListTracker_c", user.richListTracker);
                DbObject.cvPut(contentValues, "diamondVIPExpiresTime_c", Double.valueOf(user.diamondVIPExpiresTime));
                DbObject.cvPut(contentValues, "aiTag_c", user.aiTag);
                FriendCommentInfo friendCommentInfo = user.friendCommentInfo;
                DbObject.cvPut(contentValues, "friendCommentInfo_c", friendCommentInfo == null ? null : FriendCommentInfo.PROTOBUF_ADAPTER.serialize(friendCommentInfo));
                DbObject.cvPut(contentValues, "minRichListPosition_c", Integer.valueOf(user.minRichListPosition));
                DbObject.cvPut(contentValues, "membership_hideVIP_c", Integer.valueOf(user.membership.hideVIP ? 1 : 0));
                DbObject.cvPut(contentValues, "ussTracker_c", user.ussTracker);
                UserProfileMood userProfileMood = user.profile.mood;
                DbObject.cvPut(contentValues, "profile_mood_c", userProfileMood == null ? null : UserProfileMood.PROTOBUF_ADAPTER.serialize(userProfileMood));
                DbObject.cvPut(contentValues, "verifications_idCard_verified_c", Integer.valueOf(user.verifications.idCard.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "membership_hideActivityTime_c", Integer.valueOf(user.membership.hideActivityTime ? 1 : 0));
                QualificationType qualificationType = user.profile.studies.qualification;
                DbObject.cvPut(contentValues, "str_profile_studies_qualification_c", qualificationType == null ? null : qualificationType.toString());
                QualificationType qualificationType2 = user.profile.studies.qualification;
                DbObject.cvPut(contentValues, "profile_studies_qualification_c", qualificationType2 == null ? null : Integer.valueOf(qualificationType2.ordinal()));
                DbObject.cvPut(contentValues, "location_invisibleFields_c", user.location.invisibleFields == null ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(LocationInvisibleField.covertToOldEnumList(user.location.invisibleFields)));
                DbObject.cvPut(contentValues, "profile_extensions_physical_bloodType_c", user.profile.extensions.physical.bloodType == null ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(BloodType.covertToOldEnumList(user.profile.extensions.physical.bloodType)));
                DbObject.cvPut(contentValues, "profile_extensions_business_cardType_c", user.profile.extensions.business.cardType == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.business.cardType));
                MoodMoment moodMoment = user.profile.moodMoment;
                DbObject.cvPut(contentValues, "profile_moodMoment_c", moodMoment == null ? null : MoodMoment.PROTOBUF_ADAPTER.serialize(moodMoment));
                BizAnswers bizAnswers = user.profile.bizAnswers;
                DbObject.cvPut(contentValues, "profile_bizAnswers_c", bizAnswers == null ? null : BizAnswers.PROTOBUF_ADAPTER.serialize(bizAnswers));
                DbObject.cvPut(contentValues, "profile_extensions_interest_emoji_c", user.profile.extensions.interest.emoji == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.interest.emoji));
                DbObject.cvPut(contentValues, "verifications_age_verified_c", Integer.valueOf(user.verifications.age.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_extensions_basic_aboutMe_c", user.profile.extensions.basic.aboutMe == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.aboutMe));
                DbObject.cvPut(contentValues, "verifications_anchor_verified_c", Integer.valueOf(user.verifications.anchor.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_extensions_basic_tickle_c", user.profile.extensions.basic.tickle == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.tickle));
                DbObject.cvPut(contentValues, "localLatestReceivedMessageTime_c", Long.valueOf(user.localLatestReceivedMessageTime));
                DbObject.cvPut(contentValues, "verifications_others_otherDVIPSchool_verified_c", Integer.valueOf(user.verifications.others.otherDVIPSchool.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "verifications_others_otherDVIPCompany_verified_c", Integer.valueOf(user.verifications.others.otherDVIPCompany.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "verifications_others_otherDVIPJob_verified_c", Integer.valueOf(user.verifications.others.otherDVIPJob.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "verifications_others_otherDVIPSalary_verified_c", Integer.valueOf(user.verifications.others.otherDVIPSalary.verified ? 1 : 0));
                DbObject.cvPut(contentValues, "verifications_others_otherDVIPMembership_verified_c", Integer.valueOf(user.verifications.others.otherDVIPMembership.verified ? 1 : 0));
                LiveUserLevel liveUserLevel = user.hierarchy;
                DbObject.cvPut(contentValues, "hierarchy_c", liveUserLevel == null ? null : LiveUserLevel.PROTOBUF_ADAPTER.serialize(liveUserLevel));
                DbObject.cvPut(contentValues, "profile_extensions_basic_hobby_c", user.profile.extensions.basic.hobby == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.hobby));
                DbObject.cvPut(contentValues, "profile_extensions_basic_recent_c", user.profile.extensions.basic.recent == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.recent));
                DbObject.cvPut(contentValues, "profile_extensions_basic_together_c", user.profile.extensions.basic.together == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.together));
                DbObject.cvPut(contentValues, "profile_extensions_anonymity_id_c", user.profile.extensions.anonymity.f39568id == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.anonymity.f39568id));
                DbObject.cvPut(contentValues, "profile_extensions_anonymity_identifier_c", user.profile.extensions.anonymity.identifier == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.anonymity.identifier));
                SoulShip soulShip = user.localSoulShip;
                DbObject.cvPut(contentValues, "localSoulShip_c", soulShip == null ? null : SoulShip.PROTOBUF_ADAPTER.serialize(soulShip));
                DbObject.cvPut(contentValues, "signupTime_c", Double.valueOf(user.signupTime));
                DbObject.cvPut(contentValues, "profile_extensions_headFrame_url_c", user.profile.extensions.headFrame.url == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.headFrame.url));
                DbObject.cvPut(contentValues, "profile_extensions_headFrame_expiredTime_c", user.profile.extensions.headFrame.expiredTime == null ? null : ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.headFrame.expiredTime));
                BanStatus banStatus = user.banStatus;
                DbObject.cvPut(contentValues, "banStatus_c", banStatus == null ? null : BanStatus.PROTOBUF_ADAPTER.serialize(banStatus));
                DbObject.cvPut(contentValues, "profile_onlyShowAboutMeInside_c", Integer.valueOf(user.profile.onlyShowAboutMeInside ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_extensions_basic_friendPurpose_c", user.profile.extensions.basic.friendPurpose == null ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(Purpose.covertToOldEnumList(user.profile.extensions.basic.friendPurpose)));
                DbObject.cvPut(contentValues, "profile_extensions_friendStatus_labelType_c", user.profile.extensions.friendStatus.labelType == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.friendStatus.labelType));
                DbObject.cvPut(contentValues, "profile_extensions_friendStatus_labelName_c", user.profile.extensions.friendStatus.labelName == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.friendStatus.labelName));
                DbObject.cvPut(contentValues, "profile_extensions_friendStatus_endTime_c", user.profile.extensions.friendStatus.endTime == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.friendStatus.endTime));
                DbObject.cvPut(contentValues, "profile_extensions_friendStatus_status_c", user.profile.extensions.friendStatus.status == null ? null : OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(FriendState.covertToOldEnumList(user.profile.extensions.friendStatus.status)));
                DbObject.cvPut(contentValues, "localDiamondPrivateMatchTags_c", user.localDiamondPrivateMatchTags == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.localDiamondPrivateMatchTags));
                DbObject.cvPut(contentValues, "profile_extensions_basic_interest_c", user.profile.extensions.basic.interest == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.interest));
                AnonymousLikeInfo anonymousLikeInfo = user.anonymousLike;
                DbObject.cvPut(contentValues, "anonymousLike_c", anonymousLikeInfo == null ? null : AnonymousLikeInfo.PROTOBUF_ADAPTER.serialize(anonymousLikeInfo));
                DbObject.cvPut(contentValues, "inactivated_c", Integer.valueOf(user.inactivated ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_extensions_basic_country_c", user.profile.extensions.basic.country == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.country));
                DbObject.cvPut(contentValues, "profile_extensions_basic_province_c", user.profile.extensions.basic.province == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.province));
                DbObject.cvPut(contentValues, "profile_extensions_basic_city_c", user.profile.extensions.basic.city == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.city));
                DbObject.cvPut(contentValues, "str_status_c", user.status == null ? null : UserStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.status));
                DbObject.cvPut(contentValues, "str_location_invisibleFields_c", user.location.invisibleFields == null ? null : LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.location.invisibleFields));
                DbObject.cvPut(contentValues, "str_profile_extensions_physical_bloodType_c", user.profile.extensions.physical.bloodType == null ? null : BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.physical.bloodType));
                DbObject.cvPut(contentValues, "str_profile_extensions_basic_friendPurpose_c", user.profile.extensions.basic.friendPurpose == null ? null : Purpose.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.friendPurpose));
                DbObject.cvPut(contentValues, "str_profile_extensions_friendStatus_status_c", user.profile.extensions.friendStatus.status == null ? null : FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.friendStatus.status));
                DbObject.cvPut(contentValues, "profile_extensions_momentSwitch_noSyncMoment_c", user.profile.extensions.momentSwitch.noSyncMoment == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.momentSwitch.noSyncMoment));
                UserWealth userWealth = user.profile.extensions.wealth;
                DbObject.cvPut(contentValues, "profile_extensions_wealth_c", userWealth == null ? null : UserWealth.PROTOBUF_ADAPTER.serialize(userWealth));
                DbObject.cvPut(contentValues, "profile_extensions_basic_qualification_c", user.profile.extensions.basic.qualification == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.qualification));
                DbObject.cvPut(contentValues, "profile_extensions_physical_height_c", user.profile.extensions.physical.height == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.physical.height));
                ProfileCompletion profileCompletion = user.profile.extensions.profileCompletion;
                DbObject.cvPut(contentValues, "profile_extensions_profileCompletion_c", profileCompletion == null ? null : ProfileCompletion.PROTOBUF_ADAPTER.serialize(profileCompletion));
                VoiceSignature voiceSignature = user.profile.extensions.voiceSignature;
                DbObject.cvPut(contentValues, "profile_extensions_voiceSignature_c", voiceSignature == null ? null : VoiceSignature.PROTOBUF_ADAPTER.serialize(voiceSignature));
                DbObject.cvPut(contentValues, "activityUser_action_c", user.activityUser.action);
                DbObject.cvPut(contentValues, "activityUser_score_c", Long.valueOf(user.activityUser.score));
                DbObject.cvPut(contentValues, "matePlanUser_c", Integer.valueOf(user.matePlanUser ? 1 : 0));
                DbObject.cvPut(contentValues, "matePlanAdUser_c", Integer.valueOf(user.matePlanAdUser ? 1 : 0));
                DbObject.cvPut(contentValues, "regionTag_c", user.regionTag);
                DbObject.cvPut(contentValues, "localLikeIdentifiers_c", user.localLikeIdentifiers == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.localLikeIdentifiers));
                DbObject.cvPut(contentValues, "deleted_c", Integer.valueOf(user.deleted ? 1 : 0));
                DbObject.cvPut(contentValues, "profile_extensions_interest_tags_c", user.profile.extensions.interest.tags == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.interest.tags));
                DbObject.cvPut(contentValues, "profile_extensions_live_voiceImgId_c", user.profile.extensions.live.voiceImgId == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.live.voiceImgId));
                DbObject.cvPut(contentValues, "profile_extensions_live_voiceImgUrl_c", user.profile.extensions.live.voiceImgUrl == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.live.voiceImgUrl));
                ProfileMate profileMate = user.profile.extensions.mate;
                DbObject.cvPut(contentValues, "profile_extensions_mate_c", profileMate == null ? null : ProfileMate.PROTOBUF_ADAPTER.serialize(profileMate));
                PetInfo petInfo = user.profile.extensions.pet;
                DbObject.cvPut(contentValues, "profile_extensions_pet_c", petInfo == null ? null : PetInfo.PROTOBUF_ADAPTER.serialize(petInfo));
                DbObject.cvPut(contentValues, "profile_extensions_tailFrame_url_c", user.profile.extensions.tailFrame.url == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.tailFrame.url));
                DbObject.cvPut(contentValues, "profile_extensions_tailFrame_expiredTime_c", user.profile.extensions.tailFrame.expiredTime == null ? null : ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.tailFrame.expiredTime));
                DbObject.cvPut(contentValues, "profile_extensions_business_avatarID_c", user.profile.extensions.business.avatarID == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.business.avatarID));
                DbObject.cvPut(contentValues, "profile_extensions_business_avatarExpireTime_c", user.profile.extensions.business.avatarExpireTime == null ? null : ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.business.avatarExpireTime));
                DbObject.cvPut(contentValues, "profile_extensions_business_avatarClose_c", user.profile.extensions.business.avatarClose == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.business.avatarClose));
                SpecialEffect specialEffect = user.specialEffect;
                DbObject.cvPut(contentValues, "specialEffect_c", specialEffect == null ? null : SpecialEffect.PROTOBUF_ADAPTER.serialize(specialEffect));
                DbObject.cvPut(contentValues, "profile_extensions_basic_ethnicity_c", user.profile.extensions.basic.ethnicity == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.ethnicity));
                DbObject.cvPut(contentValues, "profile_extensions_basic_language_c", user.profile.extensions.basic.language == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.language));
                VoiceAvatarFrame voiceAvatarFrame = user.profile.extensions.voiceAvatarFrame;
                DbObject.cvPut(contentValues, "profile_extensions_voiceAvatarFrame_c", voiceAvatarFrame == null ? null : VoiceAvatarFrame.PROTOBUF_ADAPTER.serialize(voiceAvatarFrame));
                DbObject.cvPut(contentValues, "profile_extensions_physical_heightImg_c", user.profile.extensions.physical.heightImg == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.physical.heightImg));
                ProfileExtensionMarriage profileExtensionMarriage = user.profile.extensions.marriage;
                DbObject.cvPut(contentValues, "profile_extensions_marriage_c", profileExtensionMarriage == null ? null : ProfileExtensionMarriage.PROTOBUF_ADAPTER.serialize(profileExtensionMarriage));
                DbObject.cvPut(contentValues, "profile_extensions_basic_address_c", user.profile.extensions.basic.address == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.address));
                DbObject.cvPut(contentValues, "profile_extensions_basic_familyBackground_c", user.profile.extensions.basic.familyBackground == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.familyBackground));
                DbObject.cvPut(contentValues, "profile_extensions_physical_weight_c", user.profile.extensions.physical.weight == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.physical.weight));
                DbObject.cvPut(contentValues, "verifications_others_otherCTDID_verified_c", Integer.valueOf(user.verifications.others.otherCTDID.verified ? 1 : 0));
                ExtensionGame extensionGame = user.profile.extensions.game;
                DbObject.cvPut(contentValues, "profile_extensions_game_c", extensionGame == null ? null : ExtensionGame.PROTOBUF_ADAPTER.serialize(extensionGame));
                DbObject.cvPut(contentValues, "profile_extensions_basic_facialFeature_c", user.profile.extensions.basic.facialFeature == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.facialFeature));
                DbObject.cvPut(contentValues, "verifications_idCard_age_c", Integer.valueOf(user.verifications.idCard.age));
                DbObject.cvPut(contentValues, "verifications_idCard_first4_c", user.verifications.idCard.first4);
                DbObject.cvPut(contentValues, "profile_extensions_physical_fitness_c", user.profile.extensions.physical.fitness == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.physical.fitness));
                DbObject.cvPut(contentValues, "profile_extensions_physical_drink_c", user.profile.extensions.physical.drink == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.physical.drink));
                DbObject.cvPut(contentValues, "profile_extensions_physical_smoke_c", user.profile.extensions.physical.smoke == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.physical.smoke));
                DbObject.cvPut(contentValues, "profile_extensions_basic_mbti_c", user.profile.extensions.basic.mbti == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.mbti));
                UserActivityInfo userActivityInfo = user.userActivityInfo;
                DbObject.cvPut(contentValues, "userActivityInfo_c", userActivityInfo == null ? null : UserActivityInfo.PROTOBUF_ADAPTER.serialize(userActivityInfo));
                DbObject.cvPut(contentValues, "profile_extensions_basic_ideal_c", user.profile.extensions.basic.ideal == null ? null : IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.ideal));
                DbObject.cvPut(contentValues, "profile_extensions_basic_unideal_c", user.profile.extensions.basic.unideal == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.unideal));
                DbObject.cvPut(contentValues, "profile_moments_counters_totalNormalMoments_c", Integer.valueOf(user.profile.moments.counters.totalNormalMoments));
                DbObject.cvPut(contentValues, "profile_extensions_interest_taste_c", user.profile.extensions.interest.taste == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.interest.taste));
                DbObject.cvPut(contentValues, "location_region_province_c", user.location.region.province);
                DbObject.cvPut(contentValues, "profile_extensions_basic_intlFriendPurpose_c", user.profile.extensions.basic.intlFriendPurpose == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.intlFriendPurpose));
                DbObject.cvPut(contentValues, "profile_extensions_basic_intlFriendPurposeV2_c", user.profile.extensions.basic.intlFriendPurposeV2 == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(user.profile.extensions.basic.intlFriendPurposeV2));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };
    public String NO_ASSISTANT_MSG = "no_assistant_msg";
    private HashSet<String> parseFieldSet = new HashSet<>();

    public class DefaultRiskAuditUser implements Serializable {
        public boolean isOpenRiskAudit;
        public String userName;
        public String userPicture;

        public DefaultRiskAuditUser() {
            this.isOpenRiskAudit = true;
            this.userName = "昵称审核中";
            this.userPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IklXUEs3V1hHUVU0RkhQR0pXQTdTMlRLWFk0TVY0VDA4IiwidyI6NjQwLCJoIjo2NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0Njg1MDM0NjI0NTMwNjc4ODE3fQ";
            try {
                JSONObject jSONObject = new JSONObject(RemoteConfig.m80481x().m80485F("default_user_info"));
                this.isOpenRiskAudit = jSONObject.optBoolean("switch");
                this.userName = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                this.userPicture = jSONObject.optString("picture");
            } catch (JSONException unused) {
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RelationStatus {
    }

    public static final Pattern ILLEGAL_NAME_PATTERN() {
        if (inp == null) {
            synchronized (User.class) {
                try {
                    if (inp == null) {
                        inp = Pattern.compile("^[-.\\040]+$");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return inp;
    }

    public static final Pattern NAME_PATTERN() {
        if (f39675np == null) {
            synchronized (User.class) {
                try {
                    if (f39675np == null) {
                        f39675np = Pattern.compile("^[\\p{L}-.\\040]{1,50}$");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f39675np;
    }

    public static final Pattern NEW_NAME_PATTERN() {
        if (f39675np == null) {
            synchronized (User.class) {
                try {
                    if (f39675np == null) {
                        f39675np = Pattern.compile("^[\\p{L}\\040]{1,50}$");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f39675np;
    }

    public static final Pattern ThAI_NAME_PATTERN() {
        if (tnp == null) {
            synchronized (User.class) {
                try {
                    if (tnp == null) {
                        tnp = Pattern.compile("[\\u0E00-\\u0E7F0-9]{1,50}$");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return tnp;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61297b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ StepSignupStage m61298c(StepSignupStage stepSignupStage) {
        return stepSignupStage;
    }

    private boolean checkRelationshipStatus() {
        if (this.localRelationship.status != null) {
            return true;
        }
        CrashHelper.m82479c(new NullPointerException("------------localRelationship.status==null------------"));
        return false;
    }

    private long getFrozenActiveTime() {
        long activeTimeFromSvip = getActiveTimeFromSvip();
        long j = this.localLatestReceivedMessageTime;
        return j > activeTimeFromSvip ? j : activeTimeFromSvip;
    }

    private void initAvatarFrame() {
        if (NullChecker.m82486a(this.userAvatarFrame)) {
            return;
        }
        if (!NullChecker.m82486a(this.profile.extensions) || !NullChecker.m82486a(this.profile.extensions.business) || jyb.m147479J(this.profile.extensions.business.avatarID) || jyb.m147479J(this.profile.extensions.business.avatarClose) || jyb.m147479J(this.profile.extensions.business.avatarExpireTime)) {
            UserAvatarFrame userAvatarFrameNew_ = UserAvatarFrame.new_();
            this.userAvatarFrame = userAvatarFrameNew_;
            userAvatarFrameNew_.isShow = false;
            return;
        }
        this.userAvatarFrame = UserAvatarFrame.new_();
        String strM113364x = uqb0.f180410p0.m113364x(this.profile.extensions.business.avatarID.get(0));
        UserAvatarFrame userAvatarFrame = this.userAvatarFrame;
        userAvatarFrame.url = strM113364x;
        userAvatarFrame.expireTime = this.profile.extensions.business.avatarExpireTime.get(0).longValue();
        this.userAvatarFrame.isShow = TextUtils.equals(this.profile.extensions.business.avatarClose.get(0), "false");
    }

    private void initLiveAvatarFrame() {
        if (NullChecker.m82486a(this.liveUserAvatarFrame)) {
            return;
        }
        if (!NullChecker.m82486a(this.profile.extensions) || !NullChecker.m82486a(this.profile.extensions.voiceAvatarFrame) || jyb.m147479J(this.profile.extensions.voiceAvatarFrame.f39683id) || jyb.m147479J(this.profile.extensions.voiceAvatarFrame.expiredTime)) {
            this.liveUserAvatarFrame = LiveUserAvatarFrame.new_();
            return;
        }
        LiveUserAvatarFrame liveUserAvatarFrameNew_ = LiveUserAvatarFrame.new_();
        this.liveUserAvatarFrame = liveUserAvatarFrameNew_;
        liveUserAvatarFrameNew_.f39625id = this.profile.extensions.voiceAvatarFrame.f39683id.get(0);
        LiveRight liveRightM113365y = uqb0.f180410p0.m113365y(this.liveUserAvatarFrame.f39625id);
        if (NullChecker.m82486a(liveRightM113365y)) {
            this.liveUserAvatarFrame.url = liveRightM113365y.getUrl();
        }
        LiveUserAvatarFrame liveUserAvatarFrame = this.liveUserAvatarFrame;
        liveUserAvatarFrame.liveRight = liveRightM113365y;
        try {
            liveUserAvatarFrame.expireTime = Long.parseLong(this.profile.extensions.voiceAvatarFrame.expiredTime.get(0));
        } catch (Exception unused) {
            this.liveUserAvatarFrame.expireTime = 0L;
        }
    }

    public static boolean isAiStory(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(ID_AI_STORY);
    }

    public static boolean isBusinessAI1V1(String str) {
        return TextUtils.equals(ID_AI_1V1, str);
    }

    public static boolean isFollowshipMatched(User user) {
        Followship followship;
        return (user == null || (followship = user.localFollowship) == null || !TEnum.equals(followship.state, "matched")) ? false : true;
    }

    public static boolean isLiveServiceAccount(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(ID_LIVE_VIP_SERVICE) || str.equals(ID_LIVE_SERVICE);
    }

    public static boolean isMatched(User user) {
        if (user == null) {
            return false;
        }
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.state, "matched")) {
            return true;
        }
        Followship followship = user.localFollowship;
        return followship != null && TEnum.equals(followship.state, "matched");
    }

    public static boolean isRelationshipMatched(User user) {
        Relationship relationship;
        return (user == null || (relationship = user.localRelationship) == null || !TEnum.equals(relationship.state, "matched")) ? false : true;
    }

    public static boolean isTeamAccount(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(ID_TEAM_ACCOUNT) || str.equals(ID_TEAM_ACCOUNT_SERVICE) || str.equals(ID_LIVE_VIP_SERVICE) || str.equals(ID_INTL_LIVE_VIP_SERVICE) || str.equals(ID_LIVE_SERVICE) || str.equals(ID_CHRISTMAS_SERVICE) || str.equals(ID_ODIAMOND_SERVICE) || str.equals(ID_WISDOM_STAR) || str.equals(ID_AI_STORY) || str.startsWith("-");
    }

    public static boolean isWisdomStar(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(ID_WISDOM_STAR);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ UserStatus m61302k(UserStatus userStatus) {
        return userStatus;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m61305n(String str) {
        return str;
    }

    public static User new_() {
        User user = new User();
        user.nullCheck();
        return user;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m61306o(String str) {
        return str;
    }

    public boolean boosted() {
        if (this.f56859id.equals(uqb0.f180397c0.userId()) || isTeamAccount() || this.localRelationship == null || !checkRelationshipStatus()) {
            return false;
        }
        return this.localRelationship.status.contains(MatchFrom.get("boosted"));
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public User mo225055clone() {
        User user = new User();
        user._id = this._id;
        user.f56859id = this.f56859id;
        user.name = this.name;
        Location location = this.location;
        if (location != null) {
            user.location = location.mo225055clone();
        }
        user.description = this.description;
        user.age = this.age;
        List<Media> list = this.pictures;
        if (list != null) {
            user.pictures = ValueObject.util_map(list, new qcj() { // from class: l.j6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).mo225055clone();
                }
            });
        }
        user.createdTime = this.createdTime;
        Profile profile = this.profile;
        if (profile != null) {
            user.profile = profile.mo225055clone();
        }
        List<UserStatus> list2 = this.status;
        if (list2 != null) {
            user.status = ValueObject.util_map(list2, new qcj() { // from class: l.k6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return User.m61302k((UserStatus) obj);
                }
            });
        }
        Settings settings = this.settings;
        if (settings != null) {
            user.settings = settings.mo225055clone();
        }
        user.gender = this.gender;
        Relationship relationship = this.localRelationship;
        if (relationship != null) {
            user.localRelationship = relationship.mo225055clone();
        }
        Membership membership = this.membership;
        if (membership != null) {
            user.membership = membership.mo225055clone();
        }
        user.source = this.source;
        user.realName = this.realName;
        Followship followship = this.localFollowship;
        if (followship != null) {
            user.localFollowship = followship.mo225055clone();
        }
        List<Membership> list3 = this.memberships;
        if (list3 != null) {
            user.memberships = ValueObject.util_map(list3, new qcj() { // from class: l.l6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Membership) obj).mo225055clone();
                }
            });
        }
        user.nameRemark = this.nameRemark;
        UserState userState = this.state;
        if (userState != null) {
            user.state = userState.mo225055clone();
        }
        PicVerification picVerification = this.verifications;
        if (picVerification != null) {
            user.verifications = picVerification.mo225055clone();
        }
        List<String> list4 = this.abGroups;
        if (list4 != null) {
            user.abGroups = ValueObject.util_map(list4, new qcj() { // from class: l.m6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return User.m61305n((String) obj);
                }
            });
        }
        List<PrivateAnswer> list5 = this.privateAnswers;
        if (list5 != null) {
            user.privateAnswers = ValueObject.util_map(list5, new qcj() { // from class: l.n6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PrivateAnswer) obj).mo225055clone();
                }
            });
        }
        Membership membership2 = this.peepership;
        if (membership2 != null) {
            user.peepership = membership2.mo225055clone();
        }
        user.picksExpiredTimestamp = this.picksExpiredTimestamp;
        user.picksSwipable = this.picksSwipable;
        user.picksTag = this.picksTag;
        UserCreditData userCreditData = this.credit;
        if (userCreditData != null) {
            user.credit = userCreditData.mo225055clone();
        }
        user.picksTagType = this.picksTagType;
        user.picksTracker = this.picksTracker;
        user.goPlaceTimestamp = this.goPlaceTimestamp;
        user.isLord = this.isLord;
        user.privateAnswersUpdatedTime = this.privateAnswersUpdatedTime;
        user.sendLetter = this.sendLetter;
        user.sendLetterTimestamp = this.sendLetterTimestamp;
        user.receivedLetter = this.receivedLetter;
        user.receivedLetterTimestamp = this.receivedLetterTimestamp;
        user.localLetterUnRead = this.localLetterUnRead;
        user.popLevel = this.popLevel;
        AudioSignature audioSignature = this.voice;
        if (audioSignature != null) {
            user.voice = audioSignature.mo225055clone();
        }
        user.datingMode = this.datingMode;
        UserLiveState userLiveState = this.liveState;
        if (userLiveState != null) {
            user.liveState = userLiveState.mo225055clone();
        }
        UssTags ussTags = this.ussTags;
        if (ussTags != null) {
            user.ussTags = ussTags.mo225055clone();
        }
        UserAbroad userAbroad = this.abroad;
        if (userAbroad != null) {
            user.abroad = userAbroad.mo225055clone();
        }
        StatusesItem statusesItem = this.fakeStatus;
        if (statusesItem != null) {
            user.fakeStatus = statusesItem.mo225055clone();
        }
        StatusesItem statusesItem2 = this.nameStatus;
        if (statusesItem2 != null) {
            user.nameStatus = statusesItem2.mo225055clone();
        }
        user.displayAudit = this.displayAudit;
        user.aiOrderPicture = this.aiOrderPicture;
        UserMedalWrapper userMedalWrapper = this.medal;
        if (userMedalWrapper != null) {
            user.medal = userMedalWrapper.mo225055clone();
        }
        VisitPlace visitPlace = this.visitPlace;
        if (visitPlace != null) {
            user.visitPlace = visitPlace.mo225055clone();
        }
        user.signupStage = this.signupStage;
        user.publicId = this.publicId;
        Broadcast broadcast = this.broadcast;
        if (broadcast != null) {
            user.broadcast = broadcast.mo225055clone();
        }
        UserSoulSettings userSoulSettings = this.soulSettings;
        if (userSoulSettings != null) {
            user.soulSettings = userSoulSettings.mo225055clone();
        }
        user.richListPosition = this.richListPosition;
        user.richListTracker = this.richListTracker;
        RichListUsers richListUsers = this.localRichListUsers;
        if (richListUsers != null) {
            user.localRichListUsers = richListUsers.mo225055clone();
        }
        user.richListType = this.richListType;
        LiveRevenueCampaignVip liveRevenueCampaignVip = this.liveRevenueCampaignVip;
        if (liveRevenueCampaignVip != null) {
            user.liveRevenueCampaignVip = liveRevenueCampaignVip.mo225055clone();
        }
        user.diamondVIPExpiresTime = this.diamondVIPExpiresTime;
        user.aiTag = this.aiTag;
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        if (friendCommentInfo != null) {
            user.friendCommentInfo = friendCommentInfo.mo225055clone();
        }
        TotalRewardPoint totalRewardPoint = this.totalRewardPoint;
        if (totalRewardPoint != null) {
            user.totalRewardPoint = totalRewardPoint.mo225055clone();
        }
        user.minRichListPosition = this.minRichListPosition;
        user.ussTracker = this.ussTracker;
        LiveAnchorLevel liveAnchorLevel = this.anchorHierarchy;
        if (liveAnchorLevel != null) {
            user.anchorHierarchy = liveAnchorLevel.mo225055clone();
        }
        LiveFansClubLevel liveFansClubLevel = this.fanbaseHierarchy;
        if (liveFansClubLevel != null) {
            user.fanbaseHierarchy = liveFansClubLevel.mo225055clone();
        }
        user.localLatestReceivedMessageTime = this.localLatestReceivedMessageTime;
        AvatarFrame avatarFrame = this.avatarFrame;
        if (avatarFrame != null) {
            user.avatarFrame = avatarFrame.mo225055clone();
        }
        LiveUserLevel liveUserLevel = this.hierarchy;
        if (liveUserLevel != null) {
            user.hierarchy = liveUserLevel.mo225055clone();
        }
        SoulShip soulShip = this.localSoulShip;
        if (soulShip != null) {
            user.localSoulShip = soulShip.mo225055clone();
        }
        user.signupTime = this.signupTime;
        BanStatus banStatus = this.banStatus;
        if (banStatus != null) {
            user.banStatus = banStatus.mo225055clone();
        }
        List<String> list6 = this.localDiamondPrivateMatchTags;
        if (list6 != null) {
            user.localDiamondPrivateMatchTags = ValueObject.util_map(list6, new qcj() { // from class: l.o6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return User.m61306o((String) obj);
                }
            });
        }
        AnonymousLikeInfo anonymousLikeInfo = this.anonymousLike;
        if (anonymousLikeInfo != null) {
            user.anonymousLike = anonymousLikeInfo.mo225055clone();
        }
        List<StepSignupStage> list7 = this.finishedStages;
        if (list7 != null) {
            user.finishedStages = ValueObject.util_map(list7, new qcj() { // from class: l.p6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return User.m61298c((StepSignupStage) obj);
                }
            });
        }
        user.inactivated = this.inactivated;
        ActivityUser activityUser = this.activityUser;
        if (activityUser != null) {
            user.activityUser = activityUser.mo225055clone();
        }
        user.matePlanUser = this.matePlanUser;
        user.matePlanAdUser = this.matePlanAdUser;
        user.regionTag = this.regionTag;
        List<String> list8 = this.localLikeIdentifiers;
        if (list8 != null) {
            user.localLikeIdentifiers = ValueObject.util_map(list8, new qcj() { // from class: l.f6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return User.m61297b((String) obj);
                }
            });
        }
        user.deleted = this.deleted;
        VoiceLiveState voiceLiveState = this.voiceLiveState;
        if (voiceLiveState != null) {
            user.voiceLiveState = voiceLiveState.mo225055clone();
        }
        user.localSeeReminderType = this.localSeeReminderType;
        SpecialEffect specialEffect = this.specialEffect;
        if (specialEffect != null) {
            user.specialEffect = specialEffect.mo225055clone();
        }
        UserActivityInfo userActivityInfo = this.userActivityInfo;
        if (userActivityInfo != null) {
            user.userActivityInfo = userActivityInfo.mo225055clone();
        }
        UserIdealInfo userIdealInfo = this.ideal;
        if (userIdealInfo != null) {
            user.ideal = userIdealInfo.mo225055clone();
        }
        user.popularity = this.popularity;
        return user;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return super.equals(obj) && ValueObject.util_equals(this.name, user.name) && ValueObject.util_equals(this.location, user.location) && ValueObject.util_equals(this.description, user.description) && ValueObject.util_equals(this.age, user.age) && ValueObject.util_equals(this.pictures, user.pictures) && this.createdTime == user.createdTime && ValueObject.util_equals(this.profile, user.profile) && ValueObject.util_equals(this.status, user.status) && ValueObject.util_equals(this.settings, user.settings) && ValueObject.util_equals(this.gender, user.gender) && ValueObject.util_equals(this.localRelationship, user.localRelationship) && ValueObject.util_equals(this.membership, user.membership) && ValueObject.util_equals(this.source, user.source) && ValueObject.util_equals(this.realName, user.realName) && ValueObject.util_equals(this.localFollowship, user.localFollowship) && ValueObject.util_equals(this.memberships, user.memberships) && ValueObject.util_equals(this.nameRemark, user.nameRemark) && ValueObject.util_equals(this.state, user.state) && ValueObject.util_equals(this.verifications, user.verifications) && ValueObject.util_equals(this.abGroups, user.abGroups) && ValueObject.util_equals(this.privateAnswers, user.privateAnswers) && ValueObject.util_equals(this.peepership, user.peepership) && this.picksExpiredTimestamp == user.picksExpiredTimestamp && this.picksSwipable == user.picksSwipable && ValueObject.util_equals(this.picksTag, user.picksTag) && ValueObject.util_equals(this.credit, user.credit) && this.picksTagType == user.picksTagType && ValueObject.util_equals(this.picksTracker, user.picksTracker) && this.goPlaceTimestamp == user.goPlaceTimestamp && this.isLord == user.isLord && this.privateAnswersUpdatedTime == user.privateAnswersUpdatedTime && ValueObject.util_equals(this.sendLetter, user.sendLetter) && this.sendLetterTimestamp == user.sendLetterTimestamp && ValueObject.util_equals(this.receivedLetter, user.receivedLetter) && this.receivedLetterTimestamp == user.receivedLetterTimestamp && this.localLetterUnRead == user.localLetterUnRead && this.popLevel == user.popLevel && ValueObject.util_equals(this.voice, user.voice) && this.datingMode == user.datingMode && ValueObject.util_equals(this.liveState, user.liveState) && ValueObject.util_equals(this.ussTags, user.ussTags) && ValueObject.util_equals(this.abroad, user.abroad) && ValueObject.util_equals(this.fakeStatus, user.fakeStatus) && ValueObject.util_equals(this.nameStatus, user.nameStatus) && this.displayAudit == user.displayAudit && this.aiOrderPicture == user.aiOrderPicture && ValueObject.util_equals(this.medal, user.medal) && ValueObject.util_equals(this.visitPlace, user.visitPlace) && ValueObject.util_equals(this.signupStage, user.signupStage) && ValueObject.util_equals(this.publicId, user.publicId) && ValueObject.util_equals(this.broadcast, user.broadcast) && ValueObject.util_equals(this.soulSettings, user.soulSettings) && this.richListPosition == user.richListPosition && ValueObject.util_equals(this.richListTracker, user.richListTracker) && ValueObject.util_equals(this.localRichListUsers, user.localRichListUsers) && ValueObject.util_equals(this.richListType, user.richListType) && ValueObject.util_equals(this.liveRevenueCampaignVip, user.liveRevenueCampaignVip) && this.diamondVIPExpiresTime == user.diamondVIPExpiresTime && ValueObject.util_equals(this.aiTag, user.aiTag) && ValueObject.util_equals(this.friendCommentInfo, user.friendCommentInfo) && ValueObject.util_equals(this.totalRewardPoint, user.totalRewardPoint) && this.minRichListPosition == user.minRichListPosition && ValueObject.util_equals(this.ussTracker, user.ussTracker) && ValueObject.util_equals(this.anchorHierarchy, user.anchorHierarchy) && ValueObject.util_equals(this.fanbaseHierarchy, user.fanbaseHierarchy) && this.localLatestReceivedMessageTime == user.localLatestReceivedMessageTime && ValueObject.util_equals(this.avatarFrame, user.avatarFrame) && ValueObject.util_equals(this.hierarchy, user.hierarchy) && ValueObject.util_equals(this.localSoulShip, user.localSoulShip) && this.signupTime == user.signupTime && ValueObject.util_equals(this.banStatus, user.banStatus) && ValueObject.util_equals(this.localDiamondPrivateMatchTags, user.localDiamondPrivateMatchTags) && ValueObject.util_equals(this.anonymousLike, user.anonymousLike) && ValueObject.util_equals(this.finishedStages, user.finishedStages) && this.inactivated == user.inactivated && ValueObject.util_equals(this.activityUser, user.activityUser) && this.matePlanUser == user.matePlanUser && this.matePlanAdUser == user.matePlanAdUser && ValueObject.util_equals(this.regionTag, user.regionTag) && ValueObject.util_equals(this.localLikeIdentifiers, user.localLikeIdentifiers) && this.deleted == user.deleted && ValueObject.util_equals(this.voiceLiveState, user.voiceLiveState) && ValueObject.util_equals(this.localSeeReminderType, user.localSeeReminderType) && ValueObject.util_equals(this.specialEffect, user.specialEffect) && ValueObject.util_equals(this.userActivityInfo, user.userActivityInfo) && ValueObject.util_equals(this.ideal, user.ideal) && this.popularity == user.popularity;
    }

    public boolean followedButNotMatched() {
        Followship followship;
        Relationship relationship = this.localRelationship;
        return (relationship == null || !TEnum.equals(relationship.state, "matched")) && (followship = this.localFollowship) != null && (TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(followship.state, "matched"));
    }

    /* JADX INFO: renamed from: fp */
    public Picture m61308fp() {
        return this.pictures.get(0).cover();
    }

    public long getActiveTimeFromSvip() {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m82486a(this.settings) || jyb.m147479J(this.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = this.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        return svipPrivacySettings.frozenTime;
    }

    public String getAiPictureStatus() {
        return NullChecker.m82486a(this.settings) ? this.settings.getAiPictureEnable() : "none";
    }

    public String getAnonymousCoverIdentifier() {
        List<String> list = this.profile.extensions.anonymity.identifier;
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public String getAnonymousUrl() {
        return !jyb.m147479J(this.profile.extensions.live.voiceImgUrl) ? this.profile.extensions.live.voiceImgUrl.get(0) : "";
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "user";
    }

    public String getCurrentPureMode() {
        SettingGroups settingGroup;
        UserLiveSettings userLiveSettings;
        Settings settings = this.settings;
        return (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (userLiveSettings = settingGroup.live) == null) ? "" : userLiveSettings.pureModeGroup;
    }

    public DefaultRiskAuditUser getDefaultRiskAuditUser() {
        if (this.defaultRiskAuditUser == null) {
            this.defaultRiskAuditUser = new DefaultRiskAuditUser();
        }
        return this.defaultRiskAuditUser;
    }

    public int getFriendCommentCount() {
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        if (friendCommentInfo == null || jyb.m147479J(friendCommentInfo.friendsComments)) {
            return 0;
        }
        return this.friendCommentInfo.friendsComments.size();
    }

    public int getFriendHistoryCommentCount() {
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        if (friendCommentInfo == null || jyb.m147479J(friendCommentInfo.friendsCommentsHistory)) {
            return 0;
        }
        return this.friendCommentInfo.friendsCommentsHistory.size();
    }

    public String getHometown() {
        if (!NullChecker.m82486a(this.profile) || !NullChecker.m82486a(this.profile.extensions) || !NullChecker.m82486a(this.profile.extensions.basic)) {
            return "";
        }
        if (!jyb.m147479J(this.profile.extensions.basic.city) && !TextUtils.isEmpty(this.profile.extensions.basic.city.get(0))) {
            return this.profile.extensions.basic.city.get(0);
        }
        if (jyb.m147479J(this.profile.extensions.basic.province) || TextUtils.isEmpty(this.profile.extensions.basic.province.get(0))) {
            return !jyb.m147479J(this.profile.extensions.basic.country) ? this.profile.extensions.basic.country.get(0) : "";
        }
        return this.profile.extensions.basic.province.get(0);
    }

    @Nullable
    public List<String> getIdealList() {
        if (!NullChecker.m82486a(this.profile) || !NullChecker.m82486a(this.profile.extensions) || !NullChecker.m82486a(this.profile.extensions.basic) || jyb.m147479J(this.profile.extensions.basic.ideal)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IdealTag> it = this.profile.extensions.basic.ideal.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f39608id);
        }
        return arrayList;
    }

    public int getInterestCount() {
        int i;
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        if (friendCommentInfo == null || (i = friendCommentInfo.interestsCount) <= 0) {
            return 0;
        }
        return i;
    }

    public long getLastActiveTimeMillis() {
        return isHideActiveFromSVip() ? getFrozenActiveTime() : (long) this.location.updatedTime;
    }

    public DoublePair getLatitudeAndLongitude() {
        Settings settings = this.settings;
        if (settings == null) {
            return null;
        }
        return settings.getLatitudeAndLongitude();
    }

    public String getMarriageDeclaration() {
        return (NullChecker.m82486a(this.profile) && NullChecker.m82486a(this.profile.extensions) && NullChecker.m82486a(this.profile.extensions.marriage) && !jyb.m147479J(this.profile.extensions.marriage.declaration) && !TextUtils.isEmpty(this.profile.extensions.marriage.declaration.get(0))) ? this.profile.extensions.marriage.declaration.get(0) : "";
    }

    public String getMarriageFamilyBackground() {
        return (NullChecker.m82486a(this.profile) && NullChecker.m82486a(this.profile.extensions) && NullChecker.m82486a(this.profile.extensions.basic) && !jyb.m147479J(this.profile.extensions.basic.familyBackground) && !TextUtils.isEmpty(this.profile.extensions.basic.familyBackground.get(0))) ? this.profile.extensions.basic.familyBackground.get(0) : "";
    }

    public String getMarriageFamilyBridePrice() {
        return (NullChecker.m82486a(this.profile) && NullChecker.m82486a(this.profile.extensions) && NullChecker.m82486a(this.profile.extensions.marriage) && !jyb.m147479J(this.profile.extensions.marriage.bridePrice) && !TextUtils.isEmpty(this.profile.extensions.marriage.bridePrice.get(0))) ? this.profile.extensions.marriage.bridePrice.get(0) : "";
    }

    public String getMarriagePrologue() {
        return (NullChecker.m82486a(this.profile) && NullChecker.m82486a(this.profile.extensions) && NullChecker.m82486a(this.profile.extensions.marriage) && !jyb.m147479J(this.profile.extensions.marriage.prologue) && !TextUtils.isEmpty(this.profile.extensions.marriage.prologue.get(0))) ? this.profile.extensions.marriage.prologue.get(0) : "";
    }

    public List<String> getMarryLifeMoment() {
        if (NullChecker.m82486a(this.profile) && NullChecker.m82486a(this.profile.extensions) && NullChecker.m82486a(this.profile.extensions.marriage) && !jyb.m147479J(this.profile.extensions.marriage.lifeMoment)) {
            return this.profile.extensions.marriage.lifeMoment;
        }
        return null;
    }

    public String getMarryPosition() {
        if (!NullChecker.m82486a(this.profile) || !NullChecker.m82486a(this.profile.extensions) || !NullChecker.m82486a(this.profile.extensions.basic)) {
            return "";
        }
        List<String> list = this.profile.extensions.basic.address;
        if (jyb.m147479J(list)) {
            return "";
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            String str = list.get(size);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public long getMembershipExpireTime(final MembershipType membershipType) {
        ArrayList arrayListM147522n = jyb.m147522n(this.memberships, new qcj() { // from class: l.h6k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Membership) obj).name, membershipType));
            }
        });
        if (arrayListM147522n.size() <= 0) {
            return MEMBERSHIP_DEFAULT_EXPIRE_TIME;
        }
        long j = MEMBERSHIP_DEFAULT_EXPIRE_TIME;
        Iterator it = arrayListM147522n.iterator();
        while (it.hasNext()) {
            long j2 = (long) ((Membership) it.next()).expiresTime;
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public DoublePair getMomentRoamLatitudeAndLongitude() {
        Settings settings = this.settings;
        return settings == null ? DoublePair.new_() : settings.getMomentLatitudeAndLongitude();
    }

    public List<String> getPinyinOfRealName() {
        return this.pinyinOfRealName;
    }

    public String getPronoun() {
        return TEnum.equals(this.gender, "female") ? "她" : "他";
    }

    public String getQualificationText() {
        if (!NullChecker.m82486a(this.profile) || !NullChecker.m82486a(this.profile.extensions) || !NullChecker.m82486a(this.profile.extensions.basic) || jyb.m147479J(this.profile.extensions.basic.qualification)) {
            return "";
        }
        List<String> list = this.profile.extensions.basic.qualification;
        if (jyb.m147479J(list)) {
            return "";
        }
        String str = list.get(0);
        return !TextUtils.isEmpty(str) ? str : "";
    }

    public String getSchool() {
        return this.profile.studies.school;
    }

    public int getSupremePartnerUserCode() {
        if (NullChecker.m82486a(this.settings)) {
            return this.settings.getSupremePartnerUserCode();
        }
        return 0;
    }

    public String getUserHeight() {
        if (!NullChecker.m82486a(this.profile) || !NullChecker.m82486a(this.profile.extensions) || !NullChecker.m82486a(this.profile.extensions.physical) || jyb.m147479J(this.profile.extensions.physical.height)) {
            return "";
        }
        List<String> list = this.profile.extensions.physical.height;
        return (jyb.m147479J(list) || TextUtils.isEmpty(list.get(0))) ? "" : list.get(0);
    }

    public String getUserInfoForMarryStatus() {
        SettingGroups settingGroup;
        MarrySettings marrySettings;
        Settings settings = this.settings;
        return (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (marrySettings = settingGroup.marriage) == null || TextUtils.isEmpty(marrySettings.profileAudit)) ? "" : settingGroup.marriage.profileAudit;
    }

    public wyd0 getUserName() {
        return new wyd0("UserName" + this.f56859id, "");
    }

    public wyd0 getUserPicture() {
        return new wyd0("UserPicture" + this.f56859id, "");
    }

    public boolean getUserPushAllEnable() {
        if (NullChecker.m82486a(this.settings)) {
            return this.settings.userPushAllEnable().booleanValue();
        }
        return true;
    }

    public long getVipExpireTime() {
        return jyb.m147522n(this.memberships, new qcj() { // from class: l.e6k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Membership) obj).name, "vip"));
            }
        }).size() > 0 ? getMembershipExpireTime(MembershipType.get("vip")) : (long) this.membership.expiresTime;
    }

    public long getVipToExpireTimeInMill() {
        return getVipExpireTime() - uqb0.f180376H.guessedCurrentServerTime();
    }

    public boolean gpHideActiveTime() {
        return isVIP() && this.membership.hideActivityTime;
    }

    public boolean gpHideVip() {
        return this.membership.hideVIP || isHideIconFromSVip();
    }

    public boolean hasAuditedMarray() {
        SettingGroups settingGroup;
        MarrySettings marrySettings;
        Settings settings = this.settings;
        if (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (marrySettings = settingGroup.marriage) == null) {
            return false;
        }
        return marrySettings.hasEntered;
    }

    public boolean hasFriendComment() {
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        return (friendCommentInfo == null || jyb.m147479J(friendCommentInfo.friendsComments)) ? false : true;
    }

    public boolean hasHistoryFriendComment() {
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        return (friendCommentInfo == null || jyb.m147479J(friendCommentInfo.friendsCommentsHistory)) ? false : true;
    }

    public boolean hasIdealInfo() {
        return NullChecker.m82486a(this.profile) && NullChecker.m82486a(this.profile.extensions) && NullChecker.m82486a(this.profile.extensions.basic) && !jyb.m147479J(this.profile.extensions.basic.ideal);
    }

    public boolean hasInterestUser() {
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        return friendCommentInfo != null && friendCommentInfo.interestsCount > 0;
    }

    public boolean hasPic() {
        return (jyb.m147479J(this.pictures) || TextUtils.isEmpty(this.pictures.get(0).url)) ? false : true;
    }

    public boolean hasSoulAvatar() {
        return !TextUtils.isEmpty(this.soulSettings.picture.url);
    }

    public boolean hasVideoMedia() {
        if (jyb.m147479J(this.pictures)) {
            return false;
        }
        Iterator<Media> it = this.pictures.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof Video) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        Location location = this.location;
        int iHashCode3 = (iHashCode2 + (location != null ? location.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        Integer num = this.age;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 41;
        List<Media> list = this.pictures;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i2 = (((iHashCode5 + iHashCode6) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        Profile profile = this.profile;
        int iHashCode7 = (i2 + (profile != null ? profile.hashCode() : 0)) * 41;
        List<UserStatus> list2 = this.status;
        int iHashCode8 = (iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 41;
        Settings settings = this.settings;
        int iHashCode9 = (iHashCode8 + (settings != null ? settings.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode10 = (iHashCode9 + (gender != null ? gender.hashCode() : 0)) * 41;
        Relationship relationship = this.localRelationship;
        int iHashCode11 = (iHashCode10 + (relationship != null ? relationship.hashCode() : 0)) * 41;
        Membership membership = this.membership;
        int iHashCode12 = (iHashCode11 + (membership != null ? membership.hashCode() : 0)) * 41;
        UserSource userSource = this.source;
        int iHashCode13 = (iHashCode12 + (userSource != null ? userSource.hashCode() : 0)) * 41;
        String str3 = this.realName;
        int iHashCode14 = (iHashCode13 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Followship followship = this.localFollowship;
        int iHashCode15 = (iHashCode14 + (followship != null ? followship.hashCode() : 0)) * 41;
        List<Membership> list3 = this.memberships;
        int iHashCode16 = (iHashCode15 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str4 = this.nameRemark;
        int iHashCode17 = (iHashCode16 + (str4 != null ? str4.hashCode() : 0)) * 41;
        UserState userState = this.state;
        int iHashCode18 = (iHashCode17 + (userState != null ? userState.hashCode() : 0)) * 41;
        PicVerification picVerification = this.verifications;
        int iHashCode19 = (iHashCode18 + (picVerification != null ? picVerification.hashCode() : 0)) * 41;
        List<String> list4 = this.abGroups;
        int iHashCode20 = (iHashCode19 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<PrivateAnswer> list5 = this.privateAnswers;
        int iHashCode21 = (iHashCode20 + (list5 != null ? list5.hashCode() : 0)) * 41;
        Membership membership2 = this.peepership;
        int iHashCode22 = (iHashCode21 + (membership2 != null ? membership2.hashCode() : 0)) * 41;
        long j = this.picksExpiredTimestamp;
        int i3 = (((iHashCode22 + ((int) (j ^ (j >>> 32)))) * 41) + (this.picksSwipable ? 1231 : 1237)) * 41;
        String str5 = this.picksTag;
        int iHashCode23 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 41;
        UserCreditData userCreditData = this.credit;
        int iHashCode24 = (((iHashCode23 + (userCreditData != null ? userCreditData.hashCode() : 0)) * 41) + this.picksTagType) * 41;
        String str6 = this.picksTracker;
        int iHashCode25 = str6 != null ? str6.hashCode() : 0;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.goPlaceTimestamp);
        int i4 = (((iHashCode24 + iHashCode25) * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        int i5 = this.isLord ? 1231 : 1237;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.privateAnswersUpdatedTime);
        int i6 = (((i4 + i5) * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        String str7 = this.sendLetter;
        int iHashCode26 = str7 != null ? str7.hashCode() : 0;
        long j2 = this.sendLetterTimestamp;
        int i7 = (((i6 + iHashCode26) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str8 = this.receivedLetter;
        int iHashCode27 = str8 != null ? str8.hashCode() : 0;
        long j3 = this.receivedLetterTimestamp;
        int i8 = (((((((i7 + iHashCode27) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41) + (this.localLetterUnRead ? 1231 : 1237)) * 41) + this.popLevel) * 41;
        AudioSignature audioSignature = this.voice;
        int iHashCode28 = (((i8 + (audioSignature != null ? audioSignature.hashCode() : 0)) * 41) + (this.datingMode ? 1231 : 1237)) * 41;
        UserLiveState userLiveState = this.liveState;
        int iHashCode29 = (iHashCode28 + (userLiveState != null ? userLiveState.hashCode() : 0)) * 41;
        UssTags ussTags = this.ussTags;
        int iHashCode30 = (iHashCode29 + (ussTags != null ? ussTags.hashCode() : 0)) * 41;
        UserAbroad userAbroad = this.abroad;
        int iHashCode31 = (iHashCode30 + (userAbroad != null ? userAbroad.hashCode() : 0)) * 41;
        StatusesItem statusesItem = this.fakeStatus;
        int iHashCode32 = (iHashCode31 + (statusesItem != null ? statusesItem.hashCode() : 0)) * 41;
        StatusesItem statusesItem2 = this.nameStatus;
        int iHashCode33 = (((((iHashCode32 + (statusesItem2 != null ? statusesItem2.hashCode() : 0)) * 41) + (this.displayAudit ? 1231 : 1237)) * 41) + (this.aiOrderPicture ? 1231 : 1237)) * 41;
        UserMedalWrapper userMedalWrapper = this.medal;
        int iHashCode34 = (iHashCode33 + (userMedalWrapper != null ? userMedalWrapper.hashCode() : 0)) * 41;
        VisitPlace visitPlace = this.visitPlace;
        int iHashCode35 = (iHashCode34 + (visitPlace != null ? visitPlace.hashCode() : 0)) * 41;
        SignupStage signupStage = this.signupStage;
        int iHashCode36 = (iHashCode35 + (signupStage != null ? signupStage.hashCode() : 0)) * 41;
        String str9 = this.publicId;
        int iHashCode37 = (iHashCode36 + (str9 != null ? str9.hashCode() : 0)) * 41;
        Broadcast broadcast = this.broadcast;
        int iHashCode38 = (iHashCode37 + (broadcast != null ? broadcast.hashCode() : 0)) * 41;
        UserSoulSettings userSoulSettings = this.soulSettings;
        int iHashCode39 = (((iHashCode38 + (userSoulSettings != null ? userSoulSettings.hashCode() : 0)) * 41) + this.richListPosition) * 41;
        String str10 = this.richListTracker;
        int iHashCode40 = (iHashCode39 + (str10 != null ? str10.hashCode() : 0)) * 41;
        RichListUsers richListUsers = this.localRichListUsers;
        int iHashCode41 = (iHashCode40 + (richListUsers != null ? richListUsers.hashCode() : 0)) * 41;
        String str11 = this.richListType;
        int iHashCode42 = (iHashCode41 + (str11 != null ? str11.hashCode() : 0)) * 41;
        LiveRevenueCampaignVip liveRevenueCampaignVip = this.liveRevenueCampaignVip;
        int iHashCode43 = liveRevenueCampaignVip != null ? liveRevenueCampaignVip.hashCode() : 0;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.diamondVIPExpiresTime);
        int i9 = (((iHashCode42 + iHashCode43) * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        String str12 = this.aiTag;
        int iHashCode44 = (i9 + (str12 != null ? str12.hashCode() : 0)) * 41;
        FriendCommentInfo friendCommentInfo = this.friendCommentInfo;
        int iHashCode45 = (iHashCode44 + (friendCommentInfo != null ? friendCommentInfo.hashCode() : 0)) * 41;
        TotalRewardPoint totalRewardPoint = this.totalRewardPoint;
        int iHashCode46 = (((iHashCode45 + (totalRewardPoint != null ? totalRewardPoint.hashCode() : 0)) * 41) + this.minRichListPosition) * 41;
        String str13 = this.ussTracker;
        int iHashCode47 = (iHashCode46 + (str13 != null ? str13.hashCode() : 0)) * 41;
        LiveAnchorLevel liveAnchorLevel = this.anchorHierarchy;
        int iHashCode48 = (iHashCode47 + (liveAnchorLevel != null ? liveAnchorLevel.hashCode() : 0)) * 41;
        LiveFansClubLevel liveFansClubLevel = this.fanbaseHierarchy;
        int iHashCode49 = liveFansClubLevel != null ? liveFansClubLevel.hashCode() : 0;
        long j4 = this.localLatestReceivedMessageTime;
        int i10 = (((iHashCode48 + iHashCode49) * 41) + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        AvatarFrame avatarFrame = this.avatarFrame;
        int iHashCode50 = (i10 + (avatarFrame != null ? avatarFrame.hashCode() : 0)) * 41;
        LiveUserLevel liveUserLevel = this.hierarchy;
        int iHashCode51 = (iHashCode50 + (liveUserLevel != null ? liveUserLevel.hashCode() : 0)) * 41;
        SoulShip soulShip = this.localSoulShip;
        int iHashCode52 = soulShip != null ? soulShip.hashCode() : 0;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.signupTime);
        int i11 = (((iHashCode51 + iHashCode52) * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 41;
        BanStatus banStatus = this.banStatus;
        int iHashCode53 = (i11 + (banStatus != null ? banStatus.hashCode() : 0)) * 41;
        List<String> list6 = this.localDiamondPrivateMatchTags;
        int iHashCode54 = (iHashCode53 + (list6 != null ? list6.hashCode() : 0)) * 41;
        AnonymousLikeInfo anonymousLikeInfo = this.anonymousLike;
        int iHashCode55 = (iHashCode54 + (anonymousLikeInfo != null ? anonymousLikeInfo.hashCode() : 0)) * 41;
        List<StepSignupStage> list7 = this.finishedStages;
        int iHashCode56 = (((iHashCode55 + (list7 != null ? list7.hashCode() : 0)) * 41) + (this.inactivated ? 1231 : 1237)) * 41;
        ActivityUser activityUser = this.activityUser;
        int iHashCode57 = (((((iHashCode56 + (activityUser != null ? activityUser.hashCode() : 0)) * 41) + (this.matePlanUser ? 1231 : 1237)) * 41) + (this.matePlanAdUser ? 1231 : 1237)) * 41;
        String str14 = this.regionTag;
        int iHashCode58 = (iHashCode57 + (str14 != null ? str14.hashCode() : 0)) * 41;
        List<String> list8 = this.localLikeIdentifiers;
        int iHashCode59 = (((iHashCode58 + (list8 != null ? list8.hashCode() : 0)) * 41) + (this.deleted ? 1231 : 1237)) * 41;
        VoiceLiveState voiceLiveState = this.voiceLiveState;
        int iHashCode60 = (iHashCode59 + (voiceLiveState != null ? voiceLiveState.hashCode() : 0)) * 41;
        String str15 = this.localSeeReminderType;
        int iHashCode61 = (iHashCode60 + (str15 != null ? str15.hashCode() : 0)) * 41;
        SpecialEffect specialEffect = this.specialEffect;
        int iHashCode62 = (iHashCode61 + (specialEffect != null ? specialEffect.hashCode() : 0)) * 41;
        UserActivityInfo userActivityInfo = this.userActivityInfo;
        int iHashCode63 = (iHashCode62 + (userActivityInfo != null ? userActivityInfo.hashCode() : 0)) * 41;
        UserIdealInfo userIdealInfo = this.ideal;
        int iHashCode64 = ((iHashCode63 + (userIdealInfo != null ? userIdealInfo.hashCode() : 0)) * 41) + Float.floatToIntBits(this.popularity);
        this.hashCode = iHashCode64;
        return iHashCode64;
    }

    public String headFrameUrl() {
        return "";
    }

    public boolean hideBlackDiamondTag() {
        SettingGroups settingGroup;
        UserLiveSettings userLiveSettings;
        Settings settings = this.settings;
        if (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (userLiveSettings = settingGroup.live) == null) {
            return false;
        }
        return userLiveSettings.hideDiamondTag.booleanValue();
    }

    public boolean isAccountCancellation() {
        return this.inactivated;
    }

    public boolean isActive() {
        UssTags ussTags = this.ussTags;
        return ussTags != null && ussTags.onlineStatus == 1;
    }

    public boolean isAgeVerified() {
        VerificationResult verificationResult;
        PicVerification picVerification = this.verifications;
        return (picVerification == null || (verificationResult = picVerification.age) == null || !verificationResult.verified) ? false : true;
    }

    public boolean isAiFakeAvatar() {
        return m61308fp().isAiFakePic();
    }

    public boolean isAiPictureEnable() {
        if (NullChecker.m82486a(this.settings)) {
            return this.settings.aiPictureEnable().booleanValue();
        }
        return true;
    }

    public boolean isAudit() {
        List<UserStatus> list = this.status;
        if (list == null) {
            return false;
        }
        return list.contains(UserStatus.get(UserStatus.audit));
    }

    public boolean isBanedOrInactivated() {
        return isBanned() || isBannedNew() || isAccountCancellation();
    }

    public boolean isBanned() {
        UserStateContent userStateContent;
        UserState userState = this.state;
        return userState != null && (userStateContent = userState.jailed) != null && userStateContent.active && UserStateContent.BANNED_CODE.equals(userStateContent.code);
    }

    public boolean isBannedNew() {
        return this.banStatus.code > 0;
    }

    public boolean isBlackDiamondVIP() {
        SettingGroups settingGroup;
        UserLiveSettings userLiveSettings;
        Settings settings = this.settings;
        if (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (userLiveSettings = settingGroup.live) == null) {
            return false;
        }
        return userLiveSettings.isDiamondVIP.booleanValue();
    }

    public boolean isChatJailed() {
        if (!NullChecker.m82486a(this.state) || !NullChecker.m82486a(this.state.jailedBusiness) || !NullChecker.m82486a(this.state.jailedBusiness.chat)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = this.state.jailedBusiness.chat;
        return jailedGroupChat.active && jailedGroupChat.expireTime > ((double) pzi0.m174454o());
    }

    public boolean isCustomerServiceAccount() {
        return this.status.contains(UserStatus.get(UserStatus.customer_service_account));
    }

    public boolean isDelIn() {
        return this.inactivated && !this.deleted;
    }

    public boolean isDelOut() {
        return this.inactivated && this.deleted;
    }

    public boolean isFakePlayEnable() {
        GrowthSettings growthSettings;
        Settings settings = this.settings;
        if (settings == null || (growthSettings = settings.getSettingGroup().growth) == null) {
            return false;
        }
        return growthSettings.fakeTag;
    }

    public boolean isFakeUser() {
        return !jyb.m147479J(this.status) && this.status.contains(UserStatus.get("hidden")) && this.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL));
    }

    public boolean isFemale() {
        return TEnum.equals(this.gender, "female");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isGreetingJailed() {
        if (!NullChecker.m82486a(this.state) || !NullChecker.m82486a(this.state.jailedBusiness) || !NullChecker.m82486a(this.state.jailedBusiness.greeting)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = this.state.jailedBusiness.greeting;
        return jailedGroupChat.active && jailedGroupChat.expireTime > ((double) pzi0.m174454o());
    }

    public boolean isHideActiveFromSVip() {
        SvipPrivacySettings svipPrivacySettings;
        if (NullChecker.m82486a(this.settings) && !jyb.m147479J(this.settings.settingGroups)) {
            SettingGroups settingGroup = this.settings.getSettingGroup();
            if (NullChecker.m82486a(settingGroup) && (svipPrivacySettings = settingGroup.svipPrivacy) != null && svipPrivacySettings.frozenTime != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isHideAgeForTeamAccount() {
        return TextUtils.equals(ID_VERIVICATION_ASSISTANT, this.f56859id);
    }

    public boolean isHideAgeFromSVip() {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m82486a(this.settings) || jyb.m147479J(this.settings.settingGroups)) {
            return false;
        }
        SettingGroups settingGroup = this.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return false;
        }
        return svipPrivacySettings.hideAge;
    }

    public boolean isHideAgeFromSVipWithOutMe() {
        return !isMe() && isHideAgeFromSVip();
    }

    public boolean isHideIconFromSVip() {
        SvipPrivacySettings svipPrivacySettings;
        if (isMe() || !NullChecker.m82486a(this.settings) || jyb.m147479J(this.settings.settingGroups)) {
            return false;
        }
        SettingGroups settingGroup = this.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return false;
        }
        return svipPrivacySettings.hideIcon;
    }

    public boolean isHideIconFromSVipWithMe() {
        if (NullChecker.m82486a(this.settings) && !jyb.m147479J(this.settings.settingGroups)) {
            SettingGroups settingGroup = this.settings.getSettingGroup();
            if (NullChecker.m82486a(settingGroup) && NullChecker.m82486a(settingGroup.svipPrivacy)) {
                return settingGroup.svipPrivacy.hideIcon;
            }
        }
        return this.membership.hideVIP;
    }

    public boolean isHideLocationFromSVip() {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m82486a(this.settings) || jyb.m147479J(this.settings.settingGroups)) {
            return false;
        }
        SettingGroups settingGroup = this.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return false;
        }
        return svipPrivacySettings.hideLocation;
    }

    public boolean isIdAndPicBothVerified() {
        return isPicVerificationVerified() && isIdCardVerified();
    }

    public boolean isIdCardVerified() {
        IdVerificationResult idVerificationResult;
        PicVerification picVerification = this.verifications;
        return (picVerification == null || (idVerificationResult = picVerification.idCard) == null || !idVerificationResult.verified) ? false : true;
    }

    public boolean isIntlFaceless() {
        if (NullChecker.m82486a(this.status)) {
            return this.status.contains(UserStatus.get(UserStatus.RISK_TAG_GOOD_FACELESS_STATUS_2)) || this.status.contains(UserStatus.get(UserStatus.RISK_TAG_GOOD_FACELESS_STATUS_3));
        }
        return false;
    }

    public boolean isIntlSpammerOrScammer() {
        if (NullChecker.m82486a(this.status)) {
            return this.status.contains(UserStatus.get(UserStatus.RISK_TAG_INTL_SUSPECT));
        }
        return false;
    }

    public boolean isJailed() {
        UserStateContent userStateContent;
        UserState userState = this.state;
        if (userState == null || (userStateContent = userState.jailed) == null) {
            return false;
        }
        return userStateContent.active;
    }

    public boolean isJailedOrRestrict() {
        return isRestrict() || isJailed();
    }

    public boolean isLiveJailed() {
        if (!NullChecker.m82486a(this.state) || !NullChecker.m82486a(this.state.jailedBusiness) || !NullChecker.m82486a(this.state.jailedBusiness.live)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = this.state.jailedBusiness.live;
        return jailedGroupChat.active && jailedGroupChat.expireTime > ((double) pzi0.m174454o());
    }

    public boolean isLoveBuzz() {
        if (isMe() || isTeamAccount() || !NullChecker.m82486a(this.localRelationship)) {
            return false;
        }
        return TextUtils.equals("lovebuzz", this.localRelationship.convType);
    }

    public boolean isMe() {
        return TextUtils.equals(this.f56859id, uqb0.f180397c0.userId());
    }

    public boolean isMembership(MembershipType membershipType) {
        return getMembershipExpireTime(membershipType) - uqb0.f180376H.guessedCurrentServerTime() > 0;
    }

    public boolean isMembershipUsed(MembershipType membershipType) {
        return getMembershipExpireTime(membershipType) > 0;
    }

    public boolean isMomentCommentJailed() {
        if (!NullChecker.m82486a(this.state) || !NullChecker.m82486a(this.state.jailedBusiness) || !NullChecker.m82486a(this.state.jailedBusiness.momentComment)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = this.state.jailedBusiness.momentComment;
        return jailedGroupChat.active && jailedGroupChat.expireTime > ((double) pzi0.m174454o());
    }

    public boolean isMomentJailed() {
        if (!NullChecker.m82486a(this.state) || !NullChecker.m82486a(this.state.jailedBusiness) || !NullChecker.m82486a(this.state.jailedBusiness.moment)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = this.state.jailedBusiness.moment;
        return jailedGroupChat.active && jailedGroupChat.expireTime > ((double) pzi0.m174454o());
    }

    public boolean isNameFake() {
        StatusesItem statusesItem = this.nameStatus;
        return (statusesItem == null || statusesItem.code == 0) ? false : true;
    }

    public boolean isNew(long j) {
        Relationship relationship;
        if (j != 0 && (relationship = this.localRelationship) != null) {
            double d = relationship.updateTime;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && j < ((long) d)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNewHere() {
        if (newHereDay < 0) {
            try {
                String strM80485F = RemoteConfig.m80481x().m80485F("ttt_new_here_days");
                if (TextUtils.isEmpty(strM80485F)) {
                    newHereDay = 7;
                } else {
                    newHereDay = new JSONObject(strM80485F).optInt("register_days");
                }
            } catch (Exception unused) {
                newHereDay = 7;
            }
        }
        return this.createdTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && newHereDay > 0 && ((double) pzi0.m174454o()) - this.createdTime <= ((double) (newHereDay * 86400000));
    }

    public boolean isNewUser() {
        UssTags ussTags = this.ussTags;
        if (ussTags != null) {
            return ussTags.newUser;
        }
        return false;
    }

    public boolean isNewUserIn24H() {
        return !pzi0.m174462w((long) this.createdTime, 24);
    }

    public boolean isNonBinary() {
        IntlGender intlGender;
        Settings settings = this.settings;
        if (settings == null || (intlGender = settings.getSettingGroup().gender.newGender) == null) {
            return false;
        }
        return TEnum.equals(intlGender, "nonbinary");
    }

    public boolean isODiamond() {
        if (NullChecker.m82486a(this.settings)) {
            return this.settings.userIsODiamond();
        }
        return false;
    }

    public boolean isOnCityTop() {
        return NullChecker.m82486a(this.settings) && this.settings.isCityTop();
    }

    public boolean isOnlinePending() {
        Relationship relationship;
        return onlineMatch() && (relationship = this.localRelationship) != null && ((TextUtils.equals("quickchat", relationship.convType) && TEnum.equals(this.localRelationship.conversationStatus, "default")) || TEnum.equals(this.localRelationship.conversationStatus, ConversationStatus.peeking));
    }

    public boolean isOpenFilterVeriMsg() {
        UserPrivacySettings userPrivacySettings;
        Boolean bool;
        Settings settings = this.settings;
        if (settings == null || (userPrivacySettings = settings.getSettingGroup().privacy) == null || (bool = userPrivacySettings.verifiedUserMsg) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isPicVerificationVerified() {
        PicVerificationResult picVerificationResult;
        PicVerification picVerification = this.verifications;
        return (picVerification == null || (picVerificationResult = picVerification.picVerificationResult) == null || !picVerificationResult.verified) ? false : true;
    }

    public boolean isPlatinum() {
        if (NullChecker.m82486a(this.settings)) {
            return this.settings.isPlatinum();
        }
        return false;
    }

    public boolean isProfileJailed() {
        if (!NullChecker.m82486a(this.state) || !NullChecker.m82486a(this.state.jailedBusiness) || !NullChecker.m82486a(this.state.jailedBusiness.changeProfile)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = this.state.jailedBusiness.changeProfile;
        return jailedGroupChat.active && jailedGroupChat.expireTime > ((double) pzi0.m174454o());
    }

    public boolean isRepeatUser() {
        UssTags ussTags = this.ussTags;
        if (ussTags != null) {
            return ussTags.repeatedUser;
        }
        return false;
    }

    public boolean isRestrict() {
        UserStateContent userStateContent;
        UserState userState = this.state;
        if (userState == null || (userStateContent = userState.restricted) == null) {
            return false;
        }
        return userStateContent.active;
    }

    public boolean isRiskAudit() {
        return false;
    }

    public boolean isRiskAuditAvatar() {
        return NullChecker.m82486a(this.status) && this.status.contains(UserStatus.get(UserStatus.RISK_TAG_AVATAR_IN_AUDIT));
    }

    public boolean isRiskAuditName() {
        return NullChecker.m82486a(this.status) && this.status.contains(UserStatus.get(UserStatus.RISK_TAG_NAME_IN_AUDIT));
    }

    public boolean isSVIP() {
        SettingGroups settingGroup;
        UserSVIPSettings userSVIPSettings;
        Settings settings = this.settings;
        if (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (userSVIPSettings = settingGroup.svip) == null) {
            return false;
        }
        return userSVIPSettings.isSvip.booleanValue();
    }

    public boolean isSendQuestions() {
        SettingGroupsProfile settingGroupsProfile;
        Settings settings = this.settings;
        if (settings == null || (settingGroupsProfile = settings.getSettingGroup().profile) == null) {
            return false;
        }
        return settingGroupsProfile.sendQuestions;
    }

    public boolean isStudentVerified() {
        boolean z = NullChecker.m82486a(this.settings) && NullChecker.m82486a(this.settings.verification) && NullChecker.m82486a(this.settings.verification.studies) && TEnum.equals(this.settings.verification.studies.status, "verified");
        Studies studies = this.profile.studies;
        return z || (studies.verified && studies.active);
    }

    public boolean isSupremePartner() {
        if (NullChecker.m82486a(this.settings)) {
            return this.settings.isSupremePartner();
        }
        return false;
    }

    public boolean isSupremePartnerOpenMystery() {
        return NullChecker.m82486a(this.settings) && this.settings.isSupremePartner() && this.settings.isSupremePartnerOpenMystery();
    }

    public boolean isSwipeJailed() {
        if (!NullChecker.m82486a(this.state) || !NullChecker.m82486a(this.state.jailedBusiness) || !NullChecker.m82486a(this.state.jailedBusiness.swipe)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = this.state.jailedBusiness.swipe;
        return jailedGroupChat.active && jailedGroupChat.expireTime > ((double) pzi0.m174454o());
    }

    public boolean isTalkLocked() {
        Relationship relationship;
        if (isMe() || isTeamAccount() || (relationship = this.localRelationship) == null) {
            return false;
        }
        return TextUtils.equals("quickchat", relationship.convType);
    }

    public boolean isThinProfile() {
        List<Tag> list;
        List<Answer> list2;
        Profile profile = this.profile;
        if (profile != null && (list2 = profile.answers) != null && list2.size() != 0) {
            return false;
        }
        List<Media> list3 = this.pictures;
        if (list3 != null && list3.size() > 1) {
            return false;
        }
        Profile profile2 = this.profile;
        if (profile2 != null && profile2.work.active) {
            return false;
        }
        if (profile2 != null && profile2.studies.active) {
            return false;
        }
        if (profile2 != null && !TextUtils.isEmpty(profile2.hometown)) {
            return false;
        }
        Profile profile3 = this.profile;
        if (profile3 != null && !TextUtils.isEmpty(profile3.hangouts)) {
            return false;
        }
        Profile profile4 = this.profile;
        return profile4 == null || (list = profile4.tags) == null || list.size() == 0;
    }

    public boolean isUltraPremium() {
        SettingGroups settingGroup;
        UserUpVipSettings userUpVipSettings;
        Settings settings = this.settings;
        if (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (userUpVipSettings = settingGroup.upvip) == null) {
            return false;
        }
        return userUpVipSettings.isUpvip.booleanValue();
    }

    public boolean isVIP() {
        return getVipToExpireTimeInMill() > 0;
    }

    public boolean isVIPExpired() {
        return getVipExpireTime() > 0 && getVipToExpireTimeInMill() <= 0;
    }

    public boolean isVIPUsed() {
        return getVipExpireTime() > 0;
    }

    public boolean isVedioforFp() {
        return this.pictures.get(0) instanceof Video;
    }

    public boolean isYoungRisk() {
        return NullChecker.m82486a(this.status) && this.status.contains(UserStatus.get(UserStatus.RISK_TAG_MANDATORY_IDENTITY_VERIFICATION_UNDERAGE));
    }

    public boolean jailedBusinessChatHadReason() {
        return (NullChecker.m82486a(this.state) && NullChecker.m82486a(this.state.jailedBusiness) && NullChecker.m82486a(this.state.jailedBusiness.chat) && TextUtils.equals(this.state.jailedBusiness.chat.reason, this.NO_ASSISTANT_MSG)) ? false : true;
    }

    public boolean jailedBusinessMomentCommentHadReason() {
        return (NullChecker.m82486a(this.state) && NullChecker.m82486a(this.state.jailedBusiness) && NullChecker.m82486a(this.state.jailedBusiness.momentComment) && TextUtils.equals(this.state.jailedBusiness.momentComment.reason, this.NO_ASSISTANT_MSG)) ? false : true;
    }

    public boolean jailedBusinessMomentHadReason() {
        return (NullChecker.m82486a(this.state) && NullChecker.m82486a(this.state.jailedBusiness) && NullChecker.m82486a(this.state.jailedBusiness.moment) && TextUtils.equals(this.state.jailedBusiness.moment.reason, this.NO_ASSISTANT_MSG)) ? false : true;
    }

    public boolean jailedBusinessProfileHadReason() {
        return (NullChecker.m82486a(this.state) && NullChecker.m82486a(this.state.jailedBusiness) && NullChecker.m82486a(this.state.jailedBusiness.changeProfile) && TextUtils.equals(this.state.jailedBusiness.changeProfile.reason, this.NO_ASSISTANT_MSG)) ? false : true;
    }

    public boolean jailedBusinessSwipeHadReason() {
        return (NullChecker.m82486a(this.state) && NullChecker.m82486a(this.state.jailedBusiness) && NullChecker.m82486a(this.state.jailedBusiness.swipe) && TextUtils.equals(this.state.jailedBusiness.swipe.reason, this.NO_ASSISTANT_MSG)) ? false : true;
    }

    public boolean lessThanFifteenPrivateAnswer() {
        return jyb.m147522n(this.privateAnswers, new qcj() { // from class: l.g6k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((PrivateAnswer) obj).selection));
            }
        }).size() <= 15;
    }

    public boolean lessThanFivePrivateAnswer() {
        return jyb.m147522n(this.privateAnswers, new qcj() { // from class: l.i6k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((PrivateAnswer) obj).selection));
            }
        }).size() < 5;
    }

    public boolean letter() {
        if (this.f56859id.equals(uqb0.f180397c0.userId()) || isTeamAccount()) {
            return false;
        }
        if (this.localRelationship == null) {
            return !TextUtils.isEmpty(this.sendLetter);
        }
        if (checkRelationshipStatus()) {
            return this.localRelationship.status.contains(MatchFrom.get("letter"));
        }
        return false;
    }

    @Nullable
    public String letterString() {
        if (letter()) {
            return (NullChecker.m82486a(this.localRelationship) && NullChecker.m82486a(this.localRelationship.relationshipExtensions)) ? this.localRelationship.relationshipExtensions.otherLetter : this.sendLetter;
        }
        return null;
    }

    public boolean likedMe() {
        Relationship relationship;
        if (this.f56859id.equals(uqb0.f180397c0.userId()) || isTeamAccount() || (relationship = this.localRelationship) == null) {
            return false;
        }
        return TEnum.equals(relationship.state, "liked");
    }

    public LiveRight liveHeadFrameConfig() {
        return null;
    }

    public String matchFromForTrack() {
        Followship followship = this.localFollowship;
        if (followship != null && TEnum.equals(followship.state, "matched")) {
            return "follow";
        }
        if (this.localRelationship == null) {
            return "";
        }
        if (!checkRelationshipStatus()) {
            return "default";
        }
        if (this.localRelationship.status.contains(MatchFrom.get("quickchat"))) {
            return "quickchat";
        }
        if (this.localRelationship.status.contains(MatchFrom.get("secretcrush"))) {
            return "secret_crush";
        }
        return this.localRelationship.status.contains(MatchFrom.get(MatchFrom.vipseen)) ? "see_who_like_me" : "";
    }

    public boolean matchedOrFollowed() {
        Relationship relationship = this.localRelationship;
        if (relationship != null && TEnum.equals(relationship.state, "matched")) {
            return true;
        }
        Followship followship = this.localFollowship;
        if (followship != null) {
            return TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(followship.state, "matched");
        }
        return false;
    }

    public Media media(int i) {
        return this.pictures.get(i);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(User user) {
        Settings settings;
        if (!shouldMergeData() || equals(user)) {
            return;
        }
        if (!isFieldParsed(AuthenticationTokenClaims.JSON_KEY_NAME)) {
            this.name = user.name;
        }
        if (!isFieldParsed("location")) {
            this.location = user.location;
        }
        if (!isFieldParsed("description")) {
            this.description = user.description;
        }
        if (!isFieldParsed(SeeTextDynamicParam.age)) {
            this.age = user.age;
        }
        if (!isFieldParsed("pictures")) {
            this.pictures = user.pictures;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = user.createdTime;
        }
        if (isFieldParsed("profile")) {
            this.profile.mergeData(user.profile);
        } else {
            this.profile = user.profile;
        }
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
            this.status = user.status;
        }
        if (isFieldParsed(Settings.TYPE) && (settings = this.settings) != null) {
            Settings settings2 = user.settings;
            if (settings2 != null) {
                settings.mergeData(settings2);
            }
        } else {
            this.settings = user.settings;
        }
        if (!isFieldParsed("gender")) {
            this.gender = user.gender;
        }
        if (!isFieldParsed("membership")) {
            this.membership = user.membership;
        }
        if (!isFieldParsed("source")) {
            this.source = user.source;
        }
        if (!isFieldParsed("realName")) {
            this.realName = user.realName;
        }
        if (!isFieldParsed("memberships")) {
            this.memberships = user.memberships;
        }
        if (!isFieldParsed("state")) {
            this.state = user.state;
        }
        if (!isFieldParsed("verifications")) {
            this.verifications = user.verifications;
        }
        if (!isFieldParsed("abGroups")) {
            this.abGroups = user.abGroups;
        }
        if (!isFieldParsed("privateAnswers")) {
            this.privateAnswers = user.privateAnswers;
        }
        if (!isFieldParsed("peepership")) {
            this.peepership = user.peepership;
        }
        if (!isFieldParsed("picksExpiredTimestamp")) {
            this.picksExpiredTimestamp = user.picksExpiredTimestamp;
        }
        if (!isFieldParsed("picksSwipable")) {
            this.picksSwipable = user.picksSwipable;
        }
        if (!isFieldParsed("picksTag")) {
            this.picksTag = user.picksTag;
        }
        if (!isFieldParsed("credit")) {
            this.credit = user.credit;
        }
        if (!isFieldParsed("picksTagType")) {
            this.picksTagType = user.picksTagType;
        }
        if (!isFieldParsed("picksTracker")) {
            this.picksTracker = user.picksTracker;
        }
        if (!isFieldParsed("goPlaceTimestamp")) {
            this.goPlaceTimestamp = user.goPlaceTimestamp;
        }
        if (!isFieldParsed("isLord")) {
            this.isLord = user.isLord;
        }
        if (!isFieldParsed("privateAnswersUpdatedTime")) {
            this.privateAnswersUpdatedTime = user.privateAnswersUpdatedTime;
        }
        if (!isFieldParsed("sendLetter")) {
            this.sendLetter = user.sendLetter;
        }
        if (!isFieldParsed("sendLetterTimestamp")) {
            this.sendLetterTimestamp = user.sendLetterTimestamp;
        }
        if (!isFieldParsed("receivedLetter")) {
            this.receivedLetter = user.receivedLetter;
        }
        if (!isFieldParsed("receivedLetterTimestamp")) {
            this.receivedLetterTimestamp = user.receivedLetterTimestamp;
        }
        if (!isFieldParsed("localLetterUnRead")) {
            this.localLetterUnRead = user.localLetterUnRead;
        }
        if (!isFieldParsed("popLevel")) {
            this.popLevel = user.popLevel;
        }
        if (!isFieldParsed("voice")) {
            this.voice = user.voice;
        }
        if (!isFieldParsed("liveState")) {
            this.liveState = user.liveState;
        }
        if (!isFieldParsed("ussTags")) {
            this.ussTags = user.ussTags;
        }
        if (!isFieldParsed("abroad")) {
            this.abroad = user.abroad;
        }
        if (!isFieldParsed("fakeStatus")) {
            this.fakeStatus = user.fakeStatus;
        }
        if (!isFieldParsed("nameStatus")) {
            this.nameStatus = user.nameStatus;
        }
        if (!isFieldParsed("displayAudit")) {
            this.displayAudit = user.displayAudit;
        }
        if (!isFieldParsed("aiOrderPicture")) {
            this.aiOrderPicture = user.aiOrderPicture;
        }
        if (!isFieldParsed(Medal.TYPE)) {
            this.medal = user.medal;
        }
        if (!isFieldParsed("signupStage")) {
            this.signupStage = user.signupStage;
        }
        if (!isFieldParsed("publicId")) {
            this.publicId = user.publicId;
        }
        if (!isFieldParsed("soul-settings")) {
            this.soulSettings = user.soulSettings;
        }
        if (!isFieldParsed("richListPosition")) {
            this.richListPosition = user.richListPosition;
        }
        if (!isFieldParsed("richListTracker")) {
            this.richListTracker = user.richListTracker;
        }
        if (!isFieldParsed("richListType")) {
            this.richListType = user.richListType;
        }
        if (!isFieldParsed("liveRevenueCampaignVip")) {
            this.liveRevenueCampaignVip = user.liveRevenueCampaignVip;
        }
        if (!isFieldParsed("diamondVIPExpiresTime")) {
            this.diamondVIPExpiresTime = user.diamondVIPExpiresTime;
        }
        if (!isFieldParsed("aiTag")) {
            this.aiTag = user.aiTag;
        }
        if (!isFieldParsed("totalRewardPoint")) {
            this.totalRewardPoint = user.totalRewardPoint;
        }
        if (!isFieldParsed("ussTracker")) {
            this.ussTracker = user.ussTracker;
        }
        if (!isFieldParsed("anchorHierarchy")) {
            this.anchorHierarchy = user.anchorHierarchy;
        }
        if (!isFieldParsed("fanbaseHierarchy")) {
            this.fanbaseHierarchy = user.fanbaseHierarchy;
        }
        if (!isFieldParsed("localLatestReceivedMessageTime")) {
            this.localLatestReceivedMessageTime = user.localLatestReceivedMessageTime;
        }
        if (!isFieldParsed("avatarFrame")) {
            this.avatarFrame = user.avatarFrame;
        }
        if (!isFieldParsed("hierarchy")) {
            this.hierarchy = user.hierarchy;
        }
        if (!isFieldParsed("signupTime")) {
            this.signupTime = user.signupTime;
        }
        if (!isFieldParsed("banStatus")) {
            this.banStatus = user.banStatus;
        }
        if (!isFieldParsed("anonymousLike")) {
            this.anonymousLike = user.anonymousLike;
        }
        if (!isFieldParsed("finishedStages")) {
            this.finishedStages = user.finishedStages;
        }
        if (!isFieldParsed("inactivated")) {
            this.inactivated = user.inactivated;
        }
        if (isFieldParsed("activityUser")) {
            this.activityUser.mergeData(user.activityUser);
        } else {
            this.activityUser = user.activityUser;
        }
        if (!isFieldParsed("matePlanUser")) {
            this.matePlanUser = user.matePlanUser;
        }
        if (!isFieldParsed("matePlanAdUser")) {
            this.matePlanAdUser = user.matePlanAdUser;
        }
        if (!isFieldParsed("regionTag")) {
            this.regionTag = user.regionTag;
        }
        if (!isFieldParsed("localLikeIdentifiers")) {
            this.localLikeIdentifiers = user.localLikeIdentifiers;
        }
        if (!isFieldParsed("deleted")) {
            this.deleted = user.deleted;
        }
        if (!isFieldParsed("voiceLiveState")) {
            this.voiceLiveState = user.voiceLiveState;
        }
        if (!isFieldParsed("localSeeReminderType")) {
            this.localSeeReminderType = user.localSeeReminderType;
        }
        if (!isFieldParsed("specialEffect")) {
            this.specialEffect = user.specialEffect;
        }
        if (!isFieldParsed("ideal")) {
            this.ideal = user.ideal;
        }
        if (!isFieldParsed("popularity")) {
            this.popularity = user.popularity;
        }
        this.parseFieldSet.clear();
    }

    public boolean needShowFrame() {
        return false;
    }

    public boolean needShowLiveFrame() {
        return false;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.name == null) {
            this.name = "";
        }
        if (this.location == null) {
            this.location = Location.new_();
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.age == null) {
            this.age = 0;
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.profile == null) {
            this.profile = Profile.new_();
        }
        if (this.status == null) {
            this.status = new ArrayList();
        }
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
        if (this.membership == null) {
            this.membership = Membership.new_();
        }
        if (this.realName == null) {
            this.realName = "";
        }
        if (this.nameRemark == null) {
            this.nameRemark = "";
        }
        if (this.verifications == null) {
            this.verifications = PicVerification.new_();
        }
        if (this.privateAnswers == null) {
            this.privateAnswers = new ArrayList();
        }
        if (this.picksTag == null) {
            this.picksTag = "";
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
        if (this.voice == null) {
            this.voice = AudioSignature.new_();
        }
        if (this.liveState == null) {
            this.liveState = UserLiveState.new_();
        }
        if (this.abroad == null) {
            this.abroad = UserAbroad.new_();
        }
        if (this.medal == null) {
            this.medal = UserMedalWrapper.new_();
        }
        if (this.signupStage == null) {
            this.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
        }
        if (this.publicId == null) {
            this.publicId = "";
        }
        if (this.soulSettings == null) {
            this.soulSettings = UserSoulSettings.new_();
        }
        if (this.richListTracker == null) {
            this.richListTracker = "";
        }
        if (this.localRichListUsers == null) {
            this.localRichListUsers = RichListUsers.new_();
        }
        if (this.richListType == null) {
            this.richListType = "";
        }
        if (this.liveRevenueCampaignVip == null) {
            this.liveRevenueCampaignVip = LiveRevenueCampaignVip.new_();
        }
        if (this.aiTag == null) {
            this.aiTag = "";
        }
        if (this.ussTracker == null) {
            this.ussTracker = "";
        }
        if (this.anchorHierarchy == null) {
            this.anchorHierarchy = LiveAnchorLevel.new_();
        }
        if (this.fanbaseHierarchy == null) {
            this.fanbaseHierarchy = LiveFansClubLevel.new_();
        }
        if (this.avatarFrame == null) {
            this.avatarFrame = AvatarFrame.new_();
        }
        if (this.hierarchy == null) {
            this.hierarchy = LiveUserLevel.new_();
        }
        if (this.banStatus == null) {
            this.banStatus = BanStatus.new_();
        }
        if (this.finishedStages == null) {
            this.finishedStages = new ArrayList();
        }
        if (this.activityUser == null) {
            this.activityUser = ActivityUser.new_();
        }
        if (this.regionTag == null) {
            this.regionTag = "";
        }
        if (this.localLikeIdentifiers == null) {
            this.localLikeIdentifiers = new ArrayList();
        }
        if (this.voiceLiveState == null) {
            this.voiceLiveState = VoiceLiveState.new_();
        }
        if (this.localSeeReminderType == null) {
            this.localSeeReminderType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        if (this.pictures.size() == 0) {
            this.pictures = new ArrayList();
            Picture pictureNew_ = Picture.new_();
            pictureNew_.size = new Dimension(1, 1);
            this.pictures.add(pictureNew_);
        }
        if (this.pictures.size() > 9) {
            this.pictures = new ArrayList(this.pictures.subList(0, 9));
        }
        if (isRiskAudit()) {
            wyd0 userName = getUserName();
            wyd0 userPicture = getUserPicture();
            if (isRiskAuditName()) {
                userName.put(this.name);
                this.name = getDefaultRiskAuditUser().userName;
            }
            if (isRiskAuditAvatar()) {
                userPicture.put(this.pictures.get(0).url);
                this.pictures.get(0).url = TextUtils.isEmpty(jm5.f121641d.get()) ? getDefaultRiskAuditUser().userPicture : jm5.f121641d.get();
            }
        }
    }

    public boolean onlineMatch() {
        Relationship relationship;
        if (isMe() || isTeamAccount() || (relationship = this.localRelationship) == null) {
            return false;
        }
        if (TextUtils.equals("quickchat", relationship.convType)) {
            return true;
        }
        if (checkRelationshipStatus()) {
            return this.localRelationship.status.contains(MatchFrom.get("quickchat"));
        }
        return false;
    }

    public boolean onlineMatchAvatarUnlock(boolean z) {
        Relationship relationship;
        if (onlineMatch() && (relationship = this.localRelationship) != null) {
            return TextUtils.equals("quickchat", relationship.convType);
        }
        return false;
    }

    public boolean onlineMatchLocked() {
        Relationship relationship;
        if (onlineMatch() && (relationship = this.localRelationship) != null) {
            return TextUtils.equals("quickchat", relationship.convType) || TEnum.equals(this.localRelationship.conversationStatus, ConversationStatus.peeking) || TEnum.equals(this.localRelationship.conversationStatus, ConversationStatus.peeking_blocked);
        }
        return false;
    }

    public boolean onlineMatchUnlock() {
        Relationship relationship;
        if (!onlineMatch() || (relationship = this.localRelationship) == null) {
            return false;
        }
        return TEnum.equals(relationship.conversationStatus, "default");
    }

    public int parseRelationStatus() {
        if (isTeamAccount(this.f56859id)) {
            return 3;
        }
        if (isMe()) {
            return 4;
        }
        if (NullChecker.m82486a(this.localRelationship) && TEnum.equals(this.localRelationship.state, "matched")) {
            return 0;
        }
        if (NullChecker.m82486a(this.localFollowship) && NullChecker.m82486a(this.localFollowship.maskState) && (TEnum.equals(this.localFollowship.maskState, FollowshipStatus.followed) || TEnum.equals(this.localFollowship.maskState, FollowshipStatus.following) || TEnum.equals(this.localFollowship.maskState, "matched"))) {
            return 1;
        }
        if (NullChecker.m82486a(this.localFollowship) && NullChecker.m82486a(this.localFollowship.state)) {
            return (TEnum.equals(this.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(this.localFollowship.state, FollowshipStatus.following) || TEnum.equals(this.localFollowship.state, "matched")) ? 0 : 2;
        }
        return 2;
    }

    public Picture picture(int i) {
        return this.pictures.get(i).cover();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a A[PHI: r0
      0x002a: PHI (r0v15 int) = (r0v4 int), (r0v18 int) binds: [B:20:0x0055, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public int profileIntegrity() {
        int size = this.pictures.size() * 4;
        Profile profile = this.profile;
        Studies studies = profile.studies;
        if (studies.active) {
            size = !TextUtils.isEmpty(studies.major) ? size + 8 : size + 4;
            if (!TextUtils.isEmpty(this.profile.studies.school)) {
                size += 4;
            }
        } else {
            Work work = profile.work;
            if (work.active) {
                if (!TextUtils.isEmpty(work.industry)) {
                    size += 4;
                }
                if (!TextUtils.isEmpty(this.profile.work.department)) {
                    size += 4;
                }
                if (!TextUtils.isEmpty(this.profile.work.company)) {
                    size += 4;
                }
            }
        }
        if (!TextUtils.isEmpty(this.profile.hometown)) {
            size += 4;
        }
        if (!TextUtils.isEmpty(this.description)) {
            size += 20;
        }
        List<Tag> list = this.profile.tags;
        if (list != null && !list.isEmpty()) {
            size += 20;
        }
        List<Answer> list2 = this.profile.answers;
        return (list2 == null || list2.isEmpty()) ? size : size + 20;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void putParsedField(String str) {
        if ("v2".equals(xi5.m211120v(this.requestUrl)) || xi5.API_VERSION_V3.equals(xi5.m211120v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public int receiveSuperLikeNum() {
        if (NullChecker.m82486a(this.localRelationship) && NullChecker.m82486a(this.localRelationship.relationshipExtensions)) {
            try {
                return Integer.parseInt(this.localRelationship.relationshipExtensions.recvSuperLikedNum);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public String relativeTimeForTrack() {
        int i;
        int i2;
        int i3;
        Calendar calendar = Calendar.getInstance();
        long lastActiveTimeMillis = getLastActiveTimeMillis();
        calendar.setTimeInMillis(lastActiveTimeMillis);
        if (calendar.get(1) <= 1970) {
            return "60";
        }
        long jGuessedCurrentServerTime = (uqb0.f180376H.guessedCurrentServerTime() - lastActiveTimeMillis) / 1000;
        if (jGuessedCurrentServerTime > 31536000) {
            i2 = (int) (jGuessedCurrentServerTime / 31536000);
            i3 = 31536000;
        } else if (jGuessedCurrentServerTime > 2592000) {
            i2 = (int) (jGuessedCurrentServerTime / 2592000);
            i3 = MMKV.ExpireInMonth;
        } else {
            if (jGuessedCurrentServerTime <= 604800) {
                if (jGuessedCurrentServerTime > 86400) {
                    i2 = (int) (jGuessedCurrentServerTime / 86400);
                    i3 = MMKV.ExpireInDay;
                } else if (jGuessedCurrentServerTime > 3600) {
                    i = ((int) (jGuessedCurrentServerTime / 3600)) * MMKV.ExpireInHour;
                } else {
                    i = jGuessedCurrentServerTime > 60 ? ((int) (jGuessedCurrentServerTime / 60)) * 60 : 60;
                }
                return String.valueOf(i);
            }
            i2 = (int) (jGuessedCurrentServerTime / 604800);
            i3 = 604800;
        }
        i = i2 * i3;
        return String.valueOf(i);
    }

    public User riskAuditUser(User user) {
        if (!isRiskAudit() || user == null) {
            return this;
        }
        User userMo225055clone = mo225055clone();
        if (isRiskAuditAvatar()) {
            userMo225055clone.pictures.get(0).url = user.pictures.get(0).url;
        }
        if (isRiskAuditName()) {
            userMo225055clone.name = user.name;
        }
        return userMo225055clone;
    }

    public void setBlackDiamondTag(boolean z) {
        SettingGroups settingGroup;
        UserLiveSettings userLiveSettings;
        Settings settings = this.settings;
        if (settings == null || jyb.m147479J(settings.settingGroups) || (settingGroup = this.settings.getSettingGroup()) == null || (userLiveSettings = settingGroup.live) == null) {
            return;
        }
        userLiveSettings.hideDiamondTag = Boolean.valueOf(z);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public void setPinyinOfRealName(List<String> list) {
        this.pinyinOfRealName = list;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean shouldMergeData() {
        return "v2".equals(xi5.m211120v(this.requestUrl)) || xi5.API_VERSION_V3.equals(xi5.m211120v(this.requestUrl));
    }

    public void showPicVerificationIcon(View view, VImage vImage) {
        uqb0.f180396b0.f170325b.showUserVerificationLogo(vImage.getContext(), this, vImage);
        if (nrb0.m164466b()) {
            bnl0.m105524M(view, bnl0.m105529O0(vImage));
        } else {
            bnl0.m105524M(view, isPicVerificationVerified());
        }
    }

    public User subtract(User user) {
        User user2 = new User();
        if (!ValueObject.util_equals(this.name, user.name)) {
            user2.name = this.name;
        }
        if (!ValueObject.util_equals(this.description, user.description)) {
            user2.description = this.description;
        }
        if (!ValueObject.util_equals(this.pictures, user.pictures)) {
            user2.pictures = this.pictures;
        }
        Profile profile = this.profile;
        if (profile != null) {
            user2.profile = profile.subtract(user.profile);
        }
        Settings settings = this.settings;
        if (settings != null) {
            user2.settings = settings.subtract(user.settings);
        }
        if (!ValueObject.util_equals(this.gender, user.gender)) {
            user2.gender = this.gender;
        }
        if (!ValueObject.util_equals(this.membership, user.membership)) {
            user2.membership = this.membership;
        }
        if (!ValueObject.util_equals(this.source, user.source)) {
            user2.source = this.source;
        }
        if (!ValueObject.util_equals(this.realName, user.realName)) {
            user2.realName = this.realName;
        }
        if (!ValueObject.util_equals(this.memberships, user.memberships)) {
            user2.memberships = this.memberships;
        }
        if (!ValueObject.util_equals(this.state, user.state)) {
            user2.state = this.state;
        }
        if (!ValueObject.util_equals(this.verifications, user.verifications)) {
            user2.verifications = this.verifications;
        }
        if (!ValueObject.util_equals(this.abGroups, user.abGroups)) {
            user2.abGroups = this.abGroups;
        }
        if (!ValueObject.util_equals(this.privateAnswers, user.privateAnswers)) {
            user2.privateAnswers = this.privateAnswers;
        }
        if (!ValueObject.util_equals(this.peepership, user.peepership)) {
            user2.peepership = this.peepership;
        }
        if (!ValueObject.util_equals(this.picksTag, user.picksTag)) {
            user2.picksTag = this.picksTag;
        }
        if (!ValueObject.util_equals(this.credit, user.credit)) {
            user2.credit = this.credit;
        }
        if (!ValueObject.util_equals(this.picksTracker, user.picksTracker)) {
            user2.picksTracker = this.picksTracker;
        }
        if (!ValueObject.util_equals(this.sendLetter, user.sendLetter)) {
            user2.sendLetter = this.sendLetter;
        }
        if (!ValueObject.util_equals(this.receivedLetter, user.receivedLetter)) {
            user2.receivedLetter = this.receivedLetter;
        }
        if (!ValueObject.util_equals(this.voice, user.voice)) {
            user2.voice = this.voice;
        }
        if (!ValueObject.util_equals(this.liveState, user.liveState)) {
            user2.liveState = this.liveState;
        }
        if (!ValueObject.util_equals(this.ussTags, user.ussTags)) {
            user2.ussTags = this.ussTags;
        }
        if (!ValueObject.util_equals(this.abroad, user.abroad)) {
            user2.abroad = this.abroad;
        }
        if (!ValueObject.util_equals(this.fakeStatus, user.fakeStatus)) {
            user2.fakeStatus = this.fakeStatus;
        }
        if (!ValueObject.util_equals(this.nameStatus, user.nameStatus)) {
            user2.nameStatus = this.nameStatus;
        }
        if (!ValueObject.util_equals(this.medal, user.medal)) {
            user2.medal = this.medal;
        }
        if (!ValueObject.util_equals(this.signupStage, user.signupStage)) {
            user2.signupStage = this.signupStage;
        }
        if (!ValueObject.util_equals(this.publicId, user.publicId)) {
            user2.publicId = this.publicId;
        }
        if (!ValueObject.util_equals(this.soulSettings, user.soulSettings)) {
            user2.soulSettings = this.soulSettings;
        }
        if (!ValueObject.util_equals(this.richListTracker, user.richListTracker)) {
            user2.richListTracker = this.richListTracker;
        }
        if (!ValueObject.util_equals(this.richListType, user.richListType)) {
            user2.richListType = this.richListType;
        }
        if (!ValueObject.util_equals(this.liveRevenueCampaignVip, user.liveRevenueCampaignVip)) {
            user2.liveRevenueCampaignVip = this.liveRevenueCampaignVip;
        }
        if (!ValueObject.util_equals(this.aiTag, user.aiTag)) {
            user2.aiTag = this.aiTag;
        }
        if (!ValueObject.util_equals(this.totalRewardPoint, user.totalRewardPoint)) {
            user2.totalRewardPoint = this.totalRewardPoint;
        }
        if (!ValueObject.util_equals(this.ussTracker, user.ussTracker)) {
            user2.ussTracker = this.ussTracker;
        }
        if (!ValueObject.util_equals(this.anchorHierarchy, user.anchorHierarchy)) {
            user2.anchorHierarchy = this.anchorHierarchy;
        }
        if (!ValueObject.util_equals(this.fanbaseHierarchy, user.fanbaseHierarchy)) {
            user2.fanbaseHierarchy = this.fanbaseHierarchy;
        }
        if (!ValueObject.util_equals(this.avatarFrame, user.avatarFrame)) {
            user2.avatarFrame = this.avatarFrame;
        }
        if (!ValueObject.util_equals(this.hierarchy, user.hierarchy)) {
            user2.hierarchy = this.hierarchy;
        }
        if (!ValueObject.util_equals(this.banStatus, user.banStatus)) {
            user2.banStatus = this.banStatus;
        }
        if (!ValueObject.util_equals(this.anonymousLike, user.anonymousLike)) {
            user2.anonymousLike = this.anonymousLike;
        }
        if (!ValueObject.util_equals(this.finishedStages, user.finishedStages)) {
            user2.finishedStages = this.finishedStages;
        }
        ActivityUser activityUser = this.activityUser;
        if (activityUser != null) {
            user2.activityUser = activityUser.subtract(user.activityUser);
        }
        if (!ValueObject.util_equals(this.regionTag, user.regionTag)) {
            user2.regionTag = this.regionTag;
        }
        if (!ValueObject.util_equals(this.localLikeIdentifiers, user.localLikeIdentifiers)) {
            user2.localLikeIdentifiers = this.localLikeIdentifiers;
        }
        if (!ValueObject.util_equals(this.voiceLiveState, user.voiceLiveState)) {
            user2.voiceLiveState = this.voiceLiveState;
        }
        if (!ValueObject.util_equals(this.localSeeReminderType, user.localSeeReminderType)) {
            user2.localSeeReminderType = this.localSeeReminderType;
        }
        if (!ValueObject.util_equals(this.specialEffect, user.specialEffect)) {
            user2.specialEffect = this.specialEffect;
        }
        if (!ValueObject.util_equals(this.ideal, user.ideal)) {
            user2.ideal = this.ideal;
        }
        if (user2.equals(new User())) {
            return null;
        }
        return user2;
    }

    public boolean superLikedMe() {
        if (this.f56859id.equals(uqb0.f180397c0.userId()) || isTeamAccount() || this.localRelationship == null || !checkRelationshipStatus()) {
            return false;
        }
        return this.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked));
    }

    public boolean talkMatchUnlock() {
        Relationship relationship;
        if (isMe() || isTeamAccount() || (relationship = this.localRelationship) == null) {
            return false;
        }
        return TEnum.equals(relationship.conversationStatus, "default");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public boolean unilateralBlock() {
        if (isMe() || isTeamAccount() || this.localRelationship == null) {
            return false;
        }
        boolean zM164469e = nrb0.m164469e();
        Relationship relationship = this.localRelationship;
        if (zM164469e) {
            return TEnum.equals(relationship.conversationStatus, "blocked") || TEnum.equals(this.localRelationship.conversationStatus, ConversationStatus.peeking_blocked);
        }
        return TEnum.equals(relationship.conversationStatus, "blocked");
    }

    public boolean veryUgly() {
        List<UserStatus> list = this.status;
        if (list == null) {
            return false;
        }
        return list.contains(UserStatus.get(UserStatus.lowPopularity));
    }

    public boolean vipSeen() {
        if (this.f56859id.equals(uqb0.f180397c0.userId()) || isTeamAccount() || this.localRelationship == null || !checkRelationshipStatus()) {
            return false;
        }
        return this.localRelationship.status.contains(MatchFrom.get(MatchFrom.vipseen));
    }

    public boolean onlineMatchAvatarUnlock() {
        return onlineMatchAvatarUnlock(false);
    }

    public boolean isTeamAccount() {
        return this.status.contains(UserStatus.get("teamaccount")) || isTeamAccount(this.f56859id);
    }
}
