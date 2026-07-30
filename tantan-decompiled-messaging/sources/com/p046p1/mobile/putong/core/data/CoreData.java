package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.asm.Opcodes;
import com.core.glcore.util.DetectDelayStopHelper;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.core.data.AccountRecord;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.AudioText;
import com.p046p1.mobile.putong.core.data.AuditPictureTag;
import com.p046p1.mobile.putong.core.data.AutoDeducts;
import com.p046p1.mobile.putong.core.data.BCoreLiveActivity;
import com.p046p1.mobile.putong.core.data.BarLoverCitys;
import com.p046p1.mobile.putong.core.data.BarLoverplaces;
import com.p046p1.mobile.putong.core.data.BoostStatus;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.BuzzUser;
import com.p046p1.mobile.putong.core.data.CardCornerMark;
import com.p046p1.mobile.putong.core.data.CardExtraInfo;
import com.p046p1.mobile.putong.core.data.CardInfos;
import com.p046p1.mobile.putong.core.data.CardModel;
import com.p046p1.mobile.putong.core.data.CardStyle;
import com.p046p1.mobile.putong.core.data.CardsIcons;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p046p1.mobile.putong.core.data.ChatProfile;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.ComStatusAward;
import com.p046p1.mobile.putong.core.data.Complain;
import com.p046p1.mobile.putong.core.data.ComplimentText;
import com.p046p1.mobile.putong.core.data.ContractInfo;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationLatestMoment;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreGiftPanel;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.CountdownItem;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.CreditScoreData;
import com.p046p1.mobile.putong.core.data.DislikedUsers;
import com.p046p1.mobile.putong.core.data.DynamicLable;
import com.p046p1.mobile.putong.core.data.Evaluation;
import com.p046p1.mobile.putong.core.data.EvaluationReport;
import com.p046p1.mobile.putong.core.data.ExtremePickItem;
import com.p046p1.mobile.putong.core.data.FaceidToken;
import com.p046p1.mobile.putong.core.data.FakePhotoFeedback;
import com.p046p1.mobile.putong.core.data.FeedbackQuestion;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.data.FloatsCardData;
import com.p046p1.mobile.putong.core.data.FriendInfo;
import com.p046p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p046p1.mobile.putong.core.data.GiftWallSocial;
import com.p046p1.mobile.putong.core.data.GiftWallTitle;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.GreetingNewPeopleMessage;
import com.p046p1.mobile.putong.core.data.GreetingPermission;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupAttribute;
import com.p046p1.mobile.putong.core.data.GroupNotification;
import com.p046p1.mobile.putong.core.data.GroupSetting;
import com.p046p1.mobile.putong.core.data.GroupTab;
import com.p046p1.mobile.putong.core.data.HeartBeat;
import com.p046p1.mobile.putong.core.data.IPRegion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IceBreakQuestion;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.InsertCard;
import com.p046p1.mobile.putong.core.data.InstantMatchGiveCountInfo;
import com.p046p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p046p1.mobile.putong.core.data.IntlVisitor;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.LiveSchema;
import com.p046p1.mobile.putong.core.data.MembershipRecommendUser;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MonetizationPromotion;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.NewGiftWall;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.NotificationCounter;
import com.p046p1.mobile.putong.core.data.OfficialAccount;
import com.p046p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p046p1.mobile.putong.core.data.OrderInfo;
import com.p046p1.mobile.putong.core.data.PaymentOrder;
import com.p046p1.mobile.putong.core.data.PermissionsItem;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.PrivateQuestion;
import com.p046p1.mobile.putong.core.data.PrivilegeGift;
import com.p046p1.mobile.putong.core.data.ProfileCountInfo;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.Prologue;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.data.ReadMessage;
import com.p046p1.mobile.putong.core.data.RecentConversation;
import com.p046p1.mobile.putong.core.data.Recommended;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.data.Reminder;
import com.p046p1.mobile.putong.core.data.ResourceTriggers;
import com.p046p1.mobile.putong.core.data.RiskSelfData;
import com.p046p1.mobile.putong.core.data.SamesCardData;
import com.p046p1.mobile.putong.core.data.School;
import com.p046p1.mobile.putong.core.data.SeeInfos;
import com.p046p1.mobile.putong.core.data.SeePortrait;
import com.p046p1.mobile.putong.core.data.SelectionUser;
import com.p046p1.mobile.putong.core.data.ShowOnlineForWhoIMeet;
import com.p046p1.mobile.putong.core.data.SpecialSuggestUsers;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.core.data.SuperLikeCount;
import com.p046p1.mobile.putong.core.data.SuperlikeByCount;
import com.p046p1.mobile.putong.core.data.Surveys;
import com.p046p1.mobile.putong.core.data.SwipeUpperLimit;
import com.p046p1.mobile.putong.core.data.TagCategories;
import com.p046p1.mobile.putong.core.data.TagUserCounts;
import com.p046p1.mobile.putong.core.data.TickleSettingInfo;
import com.p046p1.mobile.putong.core.data.TribeSubset;
import com.p046p1.mobile.putong.core.data.UrlTag;
import com.p046p1.mobile.putong.core.data.UserAudits;
import com.p046p1.mobile.putong.core.data.UserGreetInfo;
import com.p046p1.mobile.putong.core.data.UserIdType;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.UserSticker;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VisitorHidden;
import com.p046p1.mobile.putong.core.data.VisitorInfo;
import com.p046p1.mobile.putong.core.data.Voice;
import com.p046p1.mobile.putong.core.data.VoiceCall;
import com.p046p1.mobile.putong.core.data.WalletAccount;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Contact;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Promotions;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.StateEmotion;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserActivityInfo;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.rtmp.TXLiveConstants;
import io.agora.rtc2.Constants;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;
import org.apache.commons.sudcompress.archivers.zip.X5455_ExtendedTimestamp;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.i18n.ErrorBundle;
import org.spongycastle.math.Primes;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;
import p149l.w9j;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes10.dex */
public class CoreData extends BaseData implements Cloneable, Serializable {
    public static int PA_VERSION = 60;
    public static final String TYPE = "coredata";

    @Nullable
    @ProtobufIndex(index = 188)
    public AcceleratePairingStatus acceleratePairing;

    @Nullable
    @ProtobufIndex(index = 34)
    public List<AccountRecord> accountRecords;

    @Nullable
    @ProtobufIndex(index = MMConstants.ERR_WATERMARK_READ)
    public ActionData action;

    @NonNull
    @ProtobufIndex(index = 121)
    public List<Active> actives;

    @Nullable
    @ProtobufIndex(index = 24)
    public List<AdvancedSettings> advancedSettings;

    @NonNull
    @ProtobufIndex(index = 269)
    public AIChatAdvice aiChatAdvice;

    @NonNull
    @ProtobufIndex(index = 270)
    public AIChatAnalysis aiChatAnalysis;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256)
    public AiPictureAuth aiPictureAuth;

    @Nullable
    @ProtobufIndex(index = 280)
    public AnalysisGuide analysisGuide;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA)
    public GreetingSummary anonymousSummary;

    @Nullable
    @ProtobufIndex(index = 26)
    public List<AppealInfo> appealInfos;

    @NonNull
    @ProtobufIndex(index = 71)
    public List<AudioText> audioTexts;

    @NonNull
    @ProtobufIndex(index = 215)
    public List<AuditPictureTag> auditPictureTags;

    @Nullable
    @ProtobufIndex(index = 27)
    public List<AutoDeducts> autoDeducts;

    @NonNull
    @ProtobufIndex(index = 127)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 225)
    public List<BarLoverCitys> barLoverCities;

    @NonNull
    @ProtobufIndex(index = 224)
    public List<BarLoverplaces> barLoverPlaces;

    @Nullable
    @ProtobufIndex(index = EACTags.APPLICATION_TEMPLATE)
    public QuickChatBellData bell;

    @Nullable
    @ProtobufIndex(index = 193)
    public GrowthBlindBox blindbox;

    @NonNull
    @ProtobufIndex(index = 184)
    public BoostResultEntry boostResultEntry;

    @Nullable
    @ProtobufIndex(index = 22)
    public List<BoostStatus> boostStatus;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<StickerBundle> bundles;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256)
    public List<BuzzUser> buzzUsers;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256)
    public QuickChatPartyCampaignPage campaignPage;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256)
    public List<SamesCardData> camping;

    @ProtobufIndex(index = 274)
    public boolean canChange;

    @Nullable
    @ProtobufIndex(index = 200)
    public List<CardCornerMark> cardCornerMarks;

    @Nullable
    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public List<CardExtraInfo> cardExtraInfos;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_RC4_128_SHA)
    public List<CardInfos> cardInfos;

    @Nullable
    @ProtobufIndex(index = 115)
    public List<CardModel> cardModels;

    @NonNull
    @ProtobufIndex(index = 70)
    public List<CardStyle> cardStyles;

    @NonNull
    @ProtobufIndex(index = 122)
    public List<CardsIcons> cardsIcons;

    @NonNull
    @ProtobufIndex(index = 178)
    public List<ChatAssistantQuestion> chatAssistantQuestions;

    @NonNull
    @ProtobufIndex(index = 169)
    public ChatGameInfo chatGameInfo;

    @NonNull
    @ProtobufIndex(index = 41)
    public List<ChatGroupMember> chatGroupMembers;

    @NonNull
    @ProtobufIndex(index = 40)
    public List<ChatGroup> chatGroups;

    @NonNull
    @ProtobufIndex(index = 151)
    public List<PermissionsItem> chatHeatPermissions;

    @NonNull
    @ProtobufIndex(index = 150)
    public List<ChatHeat> chatHeats;

    @NonNull
    @ProtobufIndex(index = 257)
    public ChatPage chatPage;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256)
    public ChatPartners chatPartners;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256)
    public List<ChatPartnersHistoryItem> chatPartnersSignals;

    @Nullable
    @ProtobufIndex(index = 57)
    public List<ChatProfile> chatProfiles;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA)
    public CipherId cipherId;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256)
    public CityCBanner cityCBanner;

    @Nullable
    @ProtobufIndex(index = 203)
    public CityCConfig cityCConfig;

    @NonNull
    @ProtobufIndex(index = 192)
    public List<CityCData> cityCData;

    @Nullable
    @ProtobufIndex(index = 15)
    public Coin coins;

    @Nullable
    @ProtobufIndex(index = 69)
    public List<ComStatusAward> comStatusAwards;

    @Nullable
    @ProtobufIndex(index = 29)
    public List<Complain> complain;

    @Nullable
    @ProtobufIndex(index = 298)
    public ComplimentFromOther compliment;

    @Nullable
    @ProtobufIndex(index = 297)
    public List<ComplimentText> complimentTexts;

    @Nullable
    @ProtobufIndex(index = 299)
    public List<SuggestedComplimentItem> compliments;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Contact> contacts;

    @NonNull
    @ProtobufIndex(index = 36)
    public Contract contract;

    @Nullable
    @ProtobufIndex(index = 39)
    public List<ContractInfo> contractInfos;

    @NonNull
    @ProtobufIndex(index = 68)
    public ConversationDiff conversationDiff;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Conversation> conversations;

    @ProtobufIndex(index = 176)
    public int count;

    @Nullable
    @ProtobufIndex(index = 90)
    public List<CountdownItem> countdownLikes;

    @NonNull
    @ProtobufIndex(index = 64)
    public CounterVerification counterVerification;

    @Nullable
    @ProtobufIndex(index = 60)
    public Couponbag couponBag;

    @Nullable
    @ProtobufIndex(index = 56)
    public List<Coupon> coupons;

    @Nullable
    @ProtobufIndex(index = 278)
    public List<CreditScoreData> creditScores;

    @Nullable
    @ProtobufIndex(index = 222)
    public RiskOtherData descriptionRisk;

    @Nullable
    @ProtobufIndex(index = 213)
    public List<DetectText> details;

    @NonNull
    @ProtobufIndex(index = 273)
    public IntlCurrencyDiamond diamond;

    @NonNull
    @ProtobufIndex(index = 279)
    public List<DislikedUsers> dislikedUsers;

    @Nullable
    @ProtobufIndex(index = 212)
    public List<DynamicLable> dynamicLabels;

    @Nullable
    @ProtobufIndex(index = 111)
    public Evaluation evaluation;

    @Nullable
    @ProtobufIndex(index = 109)
    public List<EvaluationReport> evaluationReports;

    @Nullable
    @ProtobufIndex(index = 108)
    public List<Evaluation> evaluations;

    @NonNull
    @ProtobufIndex(index = 231)
    public Explore explore;

    @NonNull
    @ProtobufIndex(index = 165)
    public GrowthExposureInfo exposureInfo;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA)
    public ExtraPrivileges extraPrivileges;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256)
    public List<ExtremePickItem> extremePickByList;

    @NonNull
    @ProtobufIndex(index = 181)
    public ExtremeQuestions extremeQuestions;

    @Nullable
    @ProtobufIndex(index = 17)
    public List<FaceidToken> faceidTokens;

    @Nullable
    @ProtobufIndex(index = 234)
    public FakeGuideData fakeGuideData;

    @Nullable
    @ProtobufIndex(index = 239)
    public List<FakePhotoFeedback> fakePhotoFeedback;

    @Nullable
    @ProtobufIndex(index = 220)
    public FakeQuickChatSuggestStatus fakeSuggest;

    @NonNull
    @ProtobufIndex(index = 226)
    public FateRadar fateRadar;

    @Nullable
    @ProtobufIndex(index = 237)
    public QuestionnaireFeature features;

    @Nullable
    @ProtobufIndex(index = 266)
    public List<FeedbackQuestion> feedbackQuestions;

    @ProtobufIndex(index = 267)
    public int feedbackRemainedNum;

    @Nullable
    @ProtobufIndex(index = 20)
    public List<Figure> figures;

    @NonNull
    @ProtobufIndex(index = 160)
    public List<FloatsCardData> floats;

    @NonNull
    @ProtobufIndex(index = 103)
    public FreeTrialInfo freeTrialInfo;

    @NonNull
    @ProtobufIndex(index = 104)
    public FreeTrialOperateResult freeTrialOperateResult;

    @NonNull
    @ProtobufIndex(index = 66)
    public List<FriendInfo> friends;

    @Nullable
    @ProtobufIndex(index = 72)
    public CoreGiftGuide giftGuide;

    @Nullable
    @ProtobufIndex(index = 63)
    public List<CoreGiftInfo> giftInfos;

    @Nullable
    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
    public List<CoreGiftPanel> giftPanel;

    @Nullable
    @ProtobufIndex(index = 75)
    public List<GiftWallRankInfo> giftWallRankInfos;

    @Nullable
    @ProtobufIndex(index = 74)
    public List<GiftWallSocial> giftWallSocials;

    @Nullable
    @ProtobufIndex(index = 76)
    public List<GiftWallTitle> giftWallTitles;

    @Nullable
    @ProtobufIndex(index = 79)
    public GreetingCounter greetingCounter;

    @Nullable
    @ProtobufIndex(index = 125)
    public GreetingHotLevelInfo greetingHotLevelInfo;

    @Nullable
    @ProtobufIndex(index = 182)
    public List<UserIdType> greetingNewPeople;

    @Nullable
    @ProtobufIndex(index = 183)
    public List<GreetingNewPeopleMessage> greetingNewPeopleMessage;

    @Nullable
    @ProtobufIndex(index = 80)
    public List<GreetingPermission> greetingPermissions;

    @NonNull
    @ProtobufIndex(index = 153)
    public GreetingResult greetingResult;

    @Nullable
    @ProtobufIndex(index = EACTags.NAME)
    public GreetingSetting greetingSetting;

    @Nullable
    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public GreetingSummary greetingSummary;

    @NonNull
    @ProtobufIndex(index = 78)
    public List<Greeting> greetings;

    @NonNull
    @ProtobufIndex(index = 114)
    public List<UserGreetInfo> greets;

    @NonNull
    @ProtobufIndex(index = 42)
    public List<GroupApply> groupApplies;

    @Nullable
    @ProtobufIndex(index = 45)
    public List<GroupAttribute> groupAttributes;

    @Nullable
    @ProtobufIndex(index = 44)
    public List<GroupNotification> groupNotifications;

    @Nullable
    @ProtobufIndex(index = 49)
    public List<GroupSetting> groupSettings;

    @NonNull
    @ProtobufIndex(index = 47)
    public List<GroupTab> groupTabs;

    @NonNull
    @ProtobufIndex(index = 187)
    public GrowthMesInfo growthMesInfo;

    @NonNull
    @ProtobufIndex(index = 116)
    public HeartBeatMatched heartbeatMatch;

    @Nullable
    @ProtobufIndex(index = 38)
    public List<HeartBeat> heartbeats;

    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
    public boolean hint;

    @Nullable
    @ProtobufIndex(index = 300)
    public List<IapAffiliatePromotion> iapAffiliatePromotions;

    @Nullable
    @ProtobufIndex(index = 233)
    public List<IceBreakQuestion> iceBreakQuestions;

    @NonNull
    @ProtobufIndex(index = 124)
    public List<BreakIce> iceBreakings;

    @Nullable
    @ProtobufIndex(index = 243)
    public List<IdealTag> idealDetails;

    @Nullable
    @ProtobufIndex(index = IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE)
    public IdealInfo idealInfo;

    @Nullable
    @ProtobufIndex(index = 245)
    public List<IdealInfo> idealInfos;

    @Nullable
    @ProtobufIndex(index = 268)
    public ConversationInstantChat instantChat;

    @Nullable
    @ProtobufIndex(index = 277)
    public List<InstantMatchGiveCountInfo> instantMatchGiveCountInfo;

    @Nullable
    @ProtobufIndex(index = 283)
    public List<InstantMatchUserInfo> instantMatchUserInfo;

    @NonNull
    @ProtobufIndex(index = 46)
    public List<ChatGroup> interestedGroups;

    @Nullable
    @ProtobufIndex(index = 285)
    public IntlTribeBubble intlBubble;

    @NonNull
    @ProtobufIndex(index = 120)
    public List<InsertCard> intlInsertCardSets;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384)
    public List<IntlVisitor> intlVisitorInfo;

    @NonNull
    @ProtobufIndex(index = 177)
    public List<String> invalidCardList;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256)
    public QuickChatPartyInvitation invitation;

    @Nullable
    @ProtobufIndex(index = 271)
    public InvitationInfo invitationInfo;

    @Nullable
    @ProtobufIndex(index = 252)
    public List<IPRegion> ipRegion;

    @ProtobufIndex(index = EACTags.FCP_TEMPLATE)
    public boolean isHit;

    @ProtobufIndex(index = 180)
    public boolean isRecallUser;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA)
    public JmpTarget jmpTarget;

    @NonNull
    @ProtobufIndex(index = 48)
    public List<String> keywords;

    @NonNull
    @ProtobufIndex(index = 154)
    public List<ConversationLatestMoment> latestMoments;

    @Nullable
    @ProtobufIndex(index = 214)
    public ColdStartLayer layer;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA)
    public List<LikeUser> likeUsers;

    @ProtobufIndex(index = 265)
    public int likedByToday;

    @NonNull
    @ProtobufIndex(index = EACTags.HEADER_LIST)
    public List<CardStyle> likedMes;

    @Nullable
    @ProtobufIndex(index = 31)
    public List<LikedUser> likedUsers;

    @Nullable
    @ProtobufIndex(index = 162)
    public String link;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<Link> links;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA)
    public LiteratureConfigInfo literatureConfigInfo;

    @NonNull
    @ProtobufIndex(index = 101)
    public List<Literatures> literatures;

    @NonNull
    @ProtobufIndex(index = 100)
    public List<LiteraturesComments> literaturesComments;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256)
    public List<BCoreLiveActivity> liveActivities;

    @Nullable
    @ProtobufIndex(index = 30)
    public List<UserLiveLabel> liveLabels;

    @Nullable
    @ProtobufIndex(index = 65)
    public List<LiveSchema> liveSchemas;

    @Nullable
    @ProtobufIndex(index = 51)
    public List<Live> lives;

    @NonNull
    @ProtobufIndex(index = 166)
    public List<SamesCardData> love520;

    @Nullable
    @ProtobufIndex(index = 254)
    public LoveLetterEntryInfo loveLetter;

    @Nullable
    @ProtobufIndex(index = 256)
    public LoveLetterContent loveLetterContent;

    @Nullable
    @ProtobufIndex(index = 255)
    public LoveLetterGroupInfo loveLetterGroup;

    @NonNull
    @ProtobufIndex(index = 201)
    public PhotoLowModelData lowPhotoResult;

    @Nullable
    @ProtobufIndex(index = 208)
    public MarriageGuide marriageGuide;

    @Nullable
    @ProtobufIndex(index = 102)
    public List<MembershipRecommendUser> membershipRecommendUsers;

    @Nullable
    @ProtobufIndex(index = 286)
    public MembershipUpgradeInfo membershipUpgradeInfo;

    @Nullable
    @ProtobufIndex(index = 53)
    public List<OfficialAccountsMenu> menus;

    @Nullable
    @ProtobufIndex(index = 18)
    public List<Merchandise> merchandises;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Message> messages;

    @NonNull
    @ProtobufIndex(index = 202)
    public List<SamesCardData> mkt_activity_flash;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384)
    public List<SamesCardData> mkt_activity_quiz;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384)
    public List<SamesCardData> mkt_activity_regular;

    @Nullable
    @ProtobufIndex(index = 95)
    public List<CoreMomentInfo> moments;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256)
    public MonetizationChatSeeUser monetizationChatSeeUser;

    @Nullable
    @ProtobufIndex(index = 35)
    public MonetizationConfiguration monetizationConfiguration;

    @NonNull
    @ProtobufIndex(index = 161)
    public MonetizationMsg monetizationMsg;

    @Nullable
    @ProtobufIndex(index = 55)
    public List<MonetizationPromotion> monetizationPromotions;

    @Nullable
    @ProtobufIndex(index = 110)
    public MessageFeedbackStatus msgData;

    @Nullable
    @ProtobufIndex(index = EACTags.LOGIN_DATA)
    public MyMeetExtra myMeet;

    @Nullable
    @ProtobufIndex(index = 119)
    public MyMeetEntryV3 myMeetEntryV3;

    @Nullable
    @ProtobufIndex(index = 118)
    public MyMeetListV3 myMeetListV3;

    @Nullable
    @ProtobufIndex(index = 216)
    public DatingGuideData myTabGuide;

    @Nullable
    @ProtobufIndex(index = 262)
    public List<MyTabTask> myTabTasks;

    @NonNull
    @ProtobufIndex(index = 241)
    public PhotoLowModelData netPictureResult;

    @Nullable
    @ProtobufIndex(index = 77)
    public List<NewGiftWall> newGiftWalls;

    @ProtobufIndex(index = 144)
    public boolean next;

    @ProtobufIndex(index = 67)
    public double nextTime;

    @NonNull
    @ProtobufIndex(index = 260)
    public PhotoLowModelData notVerificationResultData;

    @Nullable
    @ProtobufIndex(index = 43)
    public List<NotificationCounter> notificationCounters;

    @NonNull
    @ProtobufIndex(index = 157)
    public ODiamondListItem odiamondList;

    @Nullable
    @ProtobufIndex(index = 52)
    public List<OfficialAccount> officialAccounts;

    @Nullable
    @ProtobufIndex(index = 117)
    public QuickChatOneside oneside;

    @Nullable
    @ProtobufIndex(index = EACTags.TAG_LIST)
    public OnlineLiveChatPair onlineLiveChatPair;

    @Nullable
    @ProtobufIndex(index = EACTags.TRACK1_APPLICATION)
    public List<OrderInfo> orderInfos;

    @Nullable
    @ProtobufIndex(index = 21)
    public List<PaymentOrder> orders;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<StickerPackage> packages;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256)
    public GrowthPartner partner;

    @NonNull
    @ProtobufIndex(index = 167)
    public String payWill;

    @ProtobufIndex(index = 289)
    public int payWillInfo;

    @ProtobufIndex(index = 291)
    public double payWillScore;

    @ProtobufIndex(index = 292)
    public double payWillScoreThreshold;

    @Nullable
    @ProtobufIndex(index = 259)
    public PendingPaymentGuidance pendingPaymentGuidance;

    @NonNull
    @ProtobufIndex(index = 89)
    public Picks picks;

    @Nullable
    @ProtobufIndex(index = 294)
    public List<InstantMatchUserInfo> picksInfo;

    @Nullable
    @ProtobufIndex(index = 88)
    public List<PicksUser> picksUsers;

    @NonNull
    @ProtobufIndex(index = 219)
    public List<NewTags> pictureTags;

    @Nullable
    @ProtobufIndex(index = 272)
    public PictureVerifyRightedInfo pictureVerifyRightedInfo;

    @NonNull
    @ProtobufIndex(index = 158)
    public PopGuide popGuide;

    @Nullable
    @ProtobufIndex(index = 59)
    public PriorityLike priorityLike;

    @Nullable
    @ProtobufIndex(index = 19)
    public List<PrivacyMembershipSetting> privacySettings;

    @Nullable
    @ProtobufIndex(index = 248)
    public PrivateCustomResult privateCustomResult;

    @Nullable
    @ProtobufIndex(index = 205)
    public PrivateCustomResult privateCustomResults;

    @Nullable
    @ProtobufIndex(index = 204)
    public PrivateCustomSetting privateCustomSetting;

    @NonNull
    @ProtobufIndex(index = 14)
    public List<PrivateQuestion> privateQuestions;

    @NonNull
    @ProtobufIndex(index = 112)
    public List<PrivilegeGift> privilegeGifts;

    @Nullable
    @ProtobufIndex(index = 247)
    public List<ProfileCountInfo> profileCounts;

    @ProtobufIndex(index = 217)
    public boolean profileGuide;

    @NonNull
    @ProtobufIndex(index = 227)
    public ExpandedProfileLikeCounter profileLikeCounter;

    @NonNull
    @ProtobufIndex(index = 228)
    public List<ProfileLikeComment> profileLikesComments;

    @Nullable
    @ProtobufIndex(index = 276)
    public List<Prologue> prologues;

    @Nullable
    public PurchaseDialogConfigs purchaseDialogConfigs;

    @Nullable
    @ProtobufIndex(index = 287)
    public PurchaseSavePop purchaseSavePop;

    @Nullable
    @ProtobufIndex(index = 236)
    public Questionnaire questionnaire;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Question> questions;

    @Nullable
    @ProtobufIndex(index = 87)
    public QuickChatCardInfo quickchatCard;

    @Nullable
    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public List<ReadMessage> readMessages;

    @Nullable
    @ProtobufIndex(index = 253)
    public RealFeelInfo realFeelInfo;

    @Nullable
    @ProtobufIndex(index = 250)
    public RealPicturesBanner realPicturesBanner;

    @Nullable
    @ProtobufIndex(index = 251)
    public RealPicturesInfo realPicturesInfo;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384)
    public RecallMatch recallMatch;

    @NonNull
    @ProtobufIndex(index = 85)
    public List<RecentConversation> recentConversations;

    @Nullable
    @ProtobufIndex(index = 284)
    public List<TribeSubset> recommendList;

    @NonNull
    @ProtobufIndex(index = 113)
    public List<RecommendMessage> recommendMessages;

    @NonNull
    @ProtobufIndex(index = 149)
    public List<Recommended> recommended;

    @NonNull
    @ProtobufIndex(index = 62)
    public List<RedPacket> redPackets;

    @Nullable
    @ProtobufIndex(index = 32)
    public List<RefundDetail> refundDetails;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Relationship> relationships;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<Reminder> reminders;

    @NonNull
    @ProtobufIndex(index = 240)
    public PhotoLowModelData repeatPictureResult;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA)
    public List<ResourceTriggers> resources;

    @Nullable
    @ProtobufIndex(index = 223)
    public List<RiskSelfData> risks;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA)
    public List<SamesCardData> sames;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<School> schools;

    @ProtobufIndex(index = 293)
    public double scoreThresholdOther;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256)
    public SeeExposedUser seeExposedUser;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA)
    public List<SeeInfos> seeInfos;

    @NonNull
    @ProtobufIndex(index = 148)
    public SeePortraitCounter seePortraitCounter;

    @NonNull
    @ProtobufIndex(index = 140)
    public List<SeePortrait> seePortraits;

    @NonNull
    @ProtobufIndex(index = 263)
    public SeeTrialEligible seeTrialEligible;

    @NonNull
    @ProtobufIndex(index = 264)
    public SeeTrialStatus seeTrialStatus;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA)
    public ProfileSelectedQue selectedQuestion;

    @Nullable
    @ProtobufIndex(index = 210)
    public SelectionUserInfo selectionUserInfo;

    @Nullable
    @ProtobufIndex(index = 209)
    public List<SelectionUser> selectionUsers;

    @NonNull
    @ProtobufIndex(index = 50)
    public List<SettingGroups> settingGroups;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA)
    public ShareId shareId;

    @NonNull
    @ProtobufIndex(index = 258)
    public List<ShowOnlineForWhoIMeet> showOnlineForWhoIMeet;

    @Nullable
    @ProtobufIndex(index = 105)
    public Note speedUpCard;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA)
    public List<StateEmotion> stateEmotion;

    @NonNull
    @ProtobufIndex(index = 106)
    public List<BubbleInfo> states;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Sticker> stickers;

    @Nullable
    @ProtobufIndex(index = 128)
    public List<SpecialSuggestUsers> suggestUsers;

    @Nullable
    @ProtobufIndex(index = 23)
    public List<SummarizedPrivilegePrice> summarizedPrivilegePrices;

    @NonNull
    @ProtobufIndex(index = 16)
    public List<UserPrivilege> summarizedPrivileges;

    @Nullable
    @ProtobufIndex(index = 159)
    public List<SuperLikeCount> superLikeCount;

    @Nullable
    @ProtobufIndex(index = 295)
    public List<SuperlikeByCount> superlikeByCounts;

    @Nullable
    @ProtobufIndex(index = Opcodes.IFNULL)
    public SurpriseGift surpriseGift;

    @ProtobufIndex(index = Opcodes.IFNONNULL)
    public long surpriseGiftExpirationTime;

    @Nullable
    @ProtobufIndex(index = 25)
    public List<Surveys> surveys;

    @Nullable
    @ProtobufIndex(index = 230)
    public SvipWeeklyReport svipWeeklyReport;

    @Nullable
    @ProtobufIndex(index = 288)
    public List<SwipeUpperLimit> swipeUpperLimit;

    @Nullable
    @ProtobufIndex(index = 58)
    public List<IceBreakingQuestion> systemQuestions;

    @NonNull
    @ProtobufIndex(index = 163)
    public GrowthMomentThemeCardInfo tab;

    @NonNull
    @ProtobufIndex(index = 123)
    public TacitTestProfileCard tacitTest;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA)
    public List<TagCategories> tagCategories;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA)
    public TagStrategy tagCategoryStrategy;

    @NonNull
    @ProtobufIndex(index = 130)
    public TagStrategy tagLoadStrategy;

    @NonNull
    @ProtobufIndex(index = 218)
    public TagStrategy tagPictureStrategy;

    @NonNull
    @ProtobufIndex(index = 134)
    public List<TagUserCounts> tagUserCounts;

    @NonNull
    @ProtobufIndex(index = 131)
    public List<NewTags> tags;

    @NonNull
    @ProtobufIndex(index = 107)
    public ThirdPartyInfo thirdPartyInfo;

    @Nullable
    @ProtobufIndex(index = 54)
    public List<TickleSettingInfo> tickles;

    @NonNull
    @ProtobufIndex(index = 185)
    public MatchInfo todayMatchInfo;

    @ProtobufIndex(index = 275)
    public int ttcToDiamondRate;

    @Nullable
    @ProtobufIndex(index = 296)
    public UltraRightsUpgradeInfo ultraRightsUpgradeInfo;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256)
    public List<String> unReadUserIds;

    @NonNull
    @ProtobufIndex(index = 246)
    public List<UrlTag> urlTags;

    @Nullable
    @ProtobufIndex(index = 99)
    public User user;

    @Nullable
    @ProtobufIndex(index = 235)
    public List<UserActivityInfo> userActivityInfos;

    @Nullable
    @ProtobufIndex(index = Primes.SMALL_FACTOR_LIMIT)
    public List<UserAudits> userAudits;

    @NonNull
    @ProtobufIndex(index = 242)
    public UserFeedbackInfo userFeedbackInfo;

    @Nullable
    @ProtobufIndex(index = 221)
    public RiskOtherData userRisk;

    @Nullable
    @ProtobufIndex(index = 61)
    public List<UserSticker> userStickers;

    @Nullable
    @ProtobufIndex(index = 238)
    public UserStrategyConfiguration userStrategyConfiguration;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<VerificationCenter> verificationCenter;

    @NonNull
    @ProtobufIndex(index = 261)
    public List<String> verificationLowLabels;

    @Nullable
    @ProtobufIndex(index = 37)
    public List<VerificationToken> verificationTokens;

    @Nullable
    @ProtobufIndex(index = 249)
    public VideoChatSecondFloorSummary videoChatSecondFloorSummary;

    @Nullable
    @ProtobufIndex(index = 232)
    public VipSetting vipSettings;

    @ProtobufIndex(index = 290)
    public int visitorAllCount;

    @Nullable
    @ProtobufIndex(index = 281)
    public VisitorDoorInfo visitorDoorInfo;

    @Nullable
    @ProtobufIndex(index = 207)
    public List<VisitorHidden> visitorHiddens;

    @Nullable
    @ProtobufIndex(index = 282)
    public List<VisitorInfo> visitorInfo;

    @Nullable
    @ProtobufIndex(index = 206)
    public VisitorSetting visitorSetting;

    @NonNull
    @ProtobufIndex(index = 28)
    public List<VoiceCall> voiceCall;

    @Nullable
    @ProtobufIndex(index = Opcodes.IADD)
    public VoiceChatInfo voicechat;

    @Nullable
    @ProtobufIndex(index = 126)
    public List<Voice> voices;

    @NonNull
    @ProtobufIndex(index = 13)
    public Wallet wallet;

    @Nullable
    @ProtobufIndex(index = 33)
    public List<WalletAccount> walletAccounts;

    @Nullable
    @ProtobufIndex(index = 229)
    public WechatNotifySetting wechat;
    public static ProtobufAdapter<CoreData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreData>() { // from class: com.p1.mobile.putong.core.data.CoreData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreData coreData) {
            List<Relationship> list = coreData.relationships;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Conversation> list2 = coreData.conversations;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Message> list3 = coreData.messages;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, Message.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Contact> list4 = coreData.contacts;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list4, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Question> list5 = coreData.questions;
            if (list5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, list5, Question.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Sticker> list6 = coreData.stickers;
            if (list6 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, list6, Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<StickerPackage> list7 = coreData.packages;
            if (list7 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, list7, StickerPackage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<StickerBundle> list8 = coreData.bundles;
            if (list8 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, list8, StickerBundle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Link> list9 = coreData.links;
            if (list9 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(9, list9, Link.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<School> list10 = coreData.schools;
            if (list10 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(10, list10, School.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Reminder> list11 = coreData.reminders;
            if (list11 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(11, list11, Reminder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VerificationCenter> list12 = coreData.verificationCenter;
            if (list12 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(12, list12, VerificationCenter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Wallet wallet = coreData.wallet;
            if (wallet != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(13, wallet, Wallet.PROTOBUF_ADAPTER);
            }
            List<PrivateQuestion> list13 = coreData.privateQuestions;
            if (list13 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(14, list13, PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Coin coin = coreData.coins;
            if (coin != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(15, coin, Coin.PROTOBUF_ADAPTER);
            }
            List<UserPrivilege> list14 = coreData.summarizedPrivileges;
            if (list14 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(16, list14, UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FaceidToken> list15 = coreData.faceidTokens;
            if (list15 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(17, list15, FaceidToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Merchandise> list16 = coreData.merchandises;
            if (list16 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(18, list16, Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivacyMembershipSetting> list17 = coreData.privacySettings;
            if (list17 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(19, list17, PrivacyMembershipSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Figure> list18 = coreData.figures;
            if (list18 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(20, list18, Figure.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PaymentOrder> list19 = coreData.orders;
            if (list19 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(21, list19, PaymentOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BoostStatus> list20 = coreData.boostStatus;
            if (list20 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(22, list20, BoostStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SummarizedPrivilegePrice> list21 = coreData.summarizedPrivilegePrices;
            if (list21 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(23, list21, SummarizedPrivilegePrice.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AdvancedSettings> list22 = coreData.advancedSettings;
            if (list22 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(24, list22, AdvancedSettings.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Surveys> list23 = coreData.surveys;
            if (list23 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(25, list23, Surveys.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AppealInfo> list24 = coreData.appealInfos;
            if (list24 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(26, list24, AppealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AutoDeducts> list25 = coreData.autoDeducts;
            if (list25 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(27, list25, AutoDeducts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceCall> list26 = coreData.voiceCall;
            if (list26 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(28, list26, VoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Complain> list27 = coreData.complain;
            if (list27 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(29, list27, Complain.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserLiveLabel> list28 = coreData.liveLabels;
            if (list28 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(30, list28, UserLiveLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LikedUser> list29 = coreData.likedUsers;
            if (list29 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(31, list29, LikedUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RefundDetail> list30 = coreData.refundDetails;
            if (list30 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(32, list30, RefundDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<WalletAccount> list31 = coreData.walletAccounts;
            if (list31 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(33, list31, WalletAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AccountRecord> list32 = coreData.accountRecords;
            if (list32 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(34, list32, AccountRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MonetizationConfiguration monetizationConfiguration = coreData.monetizationConfiguration;
            if (monetizationConfiguration != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(35, monetizationConfiguration, MonetizationConfiguration.PROTOBUF_ADAPTER);
            }
            Contract contract = coreData.contract;
            if (contract != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(36, contract, Contract.PROTOBUF_ADAPTER);
            }
            List<VerificationToken> list33 = coreData.verificationTokens;
            if (list33 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(37, list33, VerificationToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<HeartBeat> list34 = coreData.heartbeats;
            if (list34 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(38, list34, HeartBeat.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ContractInfo> list35 = coreData.contractInfos;
            if (list35 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(39, list35, ContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatGroup> list36 = coreData.chatGroups;
            if (list36 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(40, list36, ChatGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatGroupMember> list37 = coreData.chatGroupMembers;
            if (list37 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(41, list37, ChatGroupMember.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupApply> list38 = coreData.groupApplies;
            if (list38 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(42, list38, GroupApply.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<NotificationCounter> list39 = coreData.notificationCounters;
            if (list39 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(43, list39, NotificationCounter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupNotification> list40 = coreData.groupNotifications;
            if (list40 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(44, list40, GroupNotification.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupAttribute> list41 = coreData.groupAttributes;
            if (list41 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(45, list41, GroupAttribute.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatGroup> list42 = coreData.interestedGroups;
            if (list42 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(46, list42, ChatGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupTab> list43 = coreData.groupTabs;
            if (list43 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(47, list43, GroupTab.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list44 = coreData.keywords;
            if (list44 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(48, list44, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupSetting> list45 = coreData.groupSettings;
            if (list45 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(49, list45, GroupSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SettingGroups> list46 = coreData.settingGroups;
            if (list46 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(50, list46, SettingGroups.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Live> list47 = coreData.lives;
            if (list47 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(51, list47, Live.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccount> list48 = coreData.officialAccounts;
            if (list48 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(52, list48, OfficialAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccountsMenu> list49 = coreData.menus;
            if (list49 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(53, list49, OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TickleSettingInfo> list50 = coreData.tickles;
            if (list50 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(54, list50, TickleSettingInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MonetizationPromotion> list51 = coreData.monetizationPromotions;
            if (list51 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(55, list51, MonetizationPromotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Coupon> list52 = coreData.coupons;
            if (list52 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(56, list52, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatProfile> list53 = coreData.chatProfiles;
            if (list53 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(57, list53, ChatProfile.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IceBreakingQuestion> list54 = coreData.systemQuestions;
            if (list54 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(58, list54, IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PriorityLike priorityLike = coreData.priorityLike;
            if (priorityLike != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(59, priorityLike, PriorityLike.PROTOBUF_ADAPTER);
            }
            Couponbag couponbag = coreData.couponBag;
            if (couponbag != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(60, couponbag, Couponbag.PROTOBUF_ADAPTER);
            }
            List<UserSticker> list55 = coreData.userStickers;
            if (list55 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(61, list55, UserSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RedPacket> list56 = coreData.redPackets;
            if (list56 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(62, list56, RedPacket.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CoreGiftInfo> list57 = coreData.giftInfos;
            if (list57 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(63, list57, CoreGiftInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CounterVerification counterVerification = coreData.counterVerification;
            if (counterVerification != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(64, counterVerification, CounterVerification.PROTOBUF_ADAPTER);
            }
            List<LiveSchema> list58 = coreData.liveSchemas;
            if (list58 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(65, list58, LiveSchema.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendInfo> list59 = coreData.friends;
            if (list59 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(66, list59, FriendInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17222d = iM17230l + CodedOutputByteBufferNano.m17222d(67, coreData.nextTime);
            ConversationDiff conversationDiff = coreData.conversationDiff;
            if (conversationDiff != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(68, conversationDiff, ConversationDiff.PROTOBUF_ADAPTER);
            }
            List<ComStatusAward> list60 = coreData.comStatusAwards;
            if (list60 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(69, list60, ComStatusAward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardStyle> list61 = coreData.cardStyles;
            if (list61 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(70, list61, CardStyle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AudioText> list62 = coreData.audioTexts;
            if (list62 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(71, list62, AudioText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CoreGiftGuide coreGiftGuide = coreData.giftGuide;
            if (coreGiftGuide != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(72, coreGiftGuide, CoreGiftGuide.PROTOBUF_ADAPTER);
            }
            List<CoreGiftPanel> list63 = coreData.giftPanel;
            if (list63 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(73, list63, CoreGiftPanel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GiftWallSocial> list64 = coreData.giftWallSocials;
            if (list64 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(74, list64, GiftWallSocial.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GiftWallRankInfo> list65 = coreData.giftWallRankInfos;
            if (list65 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(75, list65, GiftWallRankInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GiftWallTitle> list66 = coreData.giftWallTitles;
            if (list66 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(76, list66, GiftWallTitle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<NewGiftWall> list67 = coreData.newGiftWalls;
            if (list67 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(77, list67, NewGiftWall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Greeting> list68 = coreData.greetings;
            if (list68 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(78, list68, Greeting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingCounter greetingCounter = coreData.greetingCounter;
            if (greetingCounter != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(79, greetingCounter, GreetingCounter.PROTOBUF_ADAPTER);
            }
            List<GreetingPermission> list69 = coreData.greetingPermissions;
            if (list69 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(80, list69, GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingSummary greetingSummary = coreData.greetingSummary;
            if (greetingSummary != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(81, greetingSummary, GreetingSummary.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17222d + CodedOutputByteBufferNano.m17220b(82, coreData.hint);
            List<CardExtraInfo> list70 = coreData.cardExtraInfos;
            if (list70 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(83, list70, CardExtraInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ReadMessage> list71 = coreData.readMessages;
            if (list71 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(84, list71, ReadMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RecentConversation> list72 = coreData.recentConversations;
            if (list72 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(85, list72, RecentConversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OrderInfo> list73 = coreData.orderInfos;
            if (list73 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(86, list73, OrderInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuickChatCardInfo quickChatCardInfo = coreData.quickchatCard;
            if (quickChatCardInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(87, quickChatCardInfo, QuickChatCardInfo.PROTOBUF_ADAPTER);
            }
            List<PicksUser> list74 = coreData.picksUsers;
            if (list74 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(88, list74, PicksUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Picks picks = coreData.picks;
            if (picks != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(89, picks, Picks.PROTOBUF_ADAPTER);
            }
            List<CountdownItem> list75 = coreData.countdownLikes;
            if (list75 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(90, list75, CountdownItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingSetting greetingSetting = coreData.greetingSetting;
            if (greetingSetting != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(91, greetingSetting, GreetingSetting.PROTOBUF_ADAPTER);
            }
            OnlineLiveChatPair onlineLiveChatPair = coreData.onlineLiveChatPair;
            if (onlineLiveChatPair != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(92, onlineLiveChatPair, OnlineLiveChatPair.PROTOBUF_ADAPTER);
            }
            List<CardStyle> list76 = coreData.likedMes;
            if (list76 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(93, list76, CardStyle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MyMeetExtra myMeetExtra = coreData.myMeet;
            if (myMeetExtra != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(94, myMeetExtra, MyMeetExtra.PROTOBUF_ADAPTER);
            }
            List<CoreMomentInfo> list77 = coreData.moments;
            if (list77 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(95, list77, CoreMomentInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            VoiceChatInfo voiceChatInfo = coreData.voicechat;
            if (voiceChatInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(96, voiceChatInfo, VoiceChatInfo.PROTOBUF_ADAPTER);
            }
            QuickChatBellData quickChatBellData = coreData.bell;
            if (quickChatBellData != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(97, quickChatBellData, QuickChatBellData.PROTOBUF_ADAPTER);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(98, coreData.isHit);
            User user = coreData.user;
            if (user != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(99, user, User.PROTOBUF_ADAPTER);
            }
            List<LiteraturesComments> list78 = coreData.literaturesComments;
            if (list78 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(100, list78, LiteraturesComments.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Literatures> list79 = coreData.literatures;
            if (list79 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(101, list79, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MembershipRecommendUser> list80 = coreData.membershipRecommendUsers;
            if (list80 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(102, list80, MembershipRecommendUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FreeTrialInfo freeTrialInfo = coreData.freeTrialInfo;
            if (freeTrialInfo != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(103, freeTrialInfo, FreeTrialInfo.PROTOBUF_ADAPTER);
            }
            FreeTrialOperateResult freeTrialOperateResult = coreData.freeTrialOperateResult;
            if (freeTrialOperateResult != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(104, freeTrialOperateResult, FreeTrialOperateResult.PROTOBUF_ADAPTER);
            }
            Note note = coreData.speedUpCard;
            if (note != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(105, note, Note.PROTOBUF_ADAPTER);
            }
            List<BubbleInfo> list81 = coreData.states;
            if (list81 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(106, list81, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ThirdPartyInfo thirdPartyInfo = coreData.thirdPartyInfo;
            if (thirdPartyInfo != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(107, thirdPartyInfo, ThirdPartyInfo.PROTOBUF_ADAPTER);
            }
            List<Evaluation> list82 = coreData.evaluations;
            if (list82 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(108, list82, Evaluation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<EvaluationReport> list83 = coreData.evaluationReports;
            if (list83 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(109, list83, EvaluationReport.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageFeedbackStatus messageFeedbackStatus = coreData.msgData;
            if (messageFeedbackStatus != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(110, messageFeedbackStatus, MessageFeedbackStatus.PROTOBUF_ADAPTER);
            }
            Evaluation evaluation = coreData.evaluation;
            if (evaluation != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(111, evaluation, Evaluation.PROTOBUF_ADAPTER);
            }
            List<PrivilegeGift> list84 = coreData.privilegeGifts;
            if (list84 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(112, list84, PrivilegeGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RecommendMessage> list85 = coreData.recommendMessages;
            if (list85 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(113, list85, RecommendMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserGreetInfo> list86 = coreData.greets;
            if (list86 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(114, list86, UserGreetInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardModel> list87 = coreData.cardModels;
            if (list87 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(115, list87, CardModel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            HeartBeatMatched heartBeatMatched = coreData.heartbeatMatch;
            if (heartBeatMatched != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(116, heartBeatMatched, HeartBeatMatched.PROTOBUF_ADAPTER);
            }
            QuickChatOneside quickChatOneside = coreData.oneside;
            if (quickChatOneside != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(117, quickChatOneside, QuickChatOneside.PROTOBUF_ADAPTER);
            }
            MyMeetListV3 myMeetListV3 = coreData.myMeetListV3;
            if (myMeetListV3 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(118, myMeetListV3, MyMeetListV3.PROTOBUF_ADAPTER);
            }
            MyMeetEntryV3 myMeetEntryV3 = coreData.myMeetEntryV3;
            if (myMeetEntryV3 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(119, myMeetEntryV3, MyMeetEntryV3.PROTOBUF_ADAPTER);
            }
            List<InsertCard> list88 = coreData.intlInsertCardSets;
            if (list88 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(120, list88, InsertCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Active> list89 = coreData.actives;
            if (list89 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(121, list89, Active.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardsIcons> list90 = coreData.cardsIcons;
            if (list90 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(122, list90, CardsIcons.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            TacitTestProfileCard tacitTestProfileCard = coreData.tacitTest;
            if (tacitTestProfileCard != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(123, tacitTestProfileCard, TacitTestProfileCard.PROTOBUF_ADAPTER);
            }
            List<BreakIce> list91 = coreData.iceBreakings;
            if (list91 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(124, list91, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingHotLevelInfo greetingHotLevelInfo = coreData.greetingHotLevelInfo;
            if (greetingHotLevelInfo != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(125, greetingHotLevelInfo, GreetingHotLevelInfo.PROTOBUF_ADAPTER);
            }
            List<Voice> list92 = coreData.voices;
            if (list92 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(126, list92, Voice.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = coreData.avatar;
            if (str != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(127, str);
            }
            List<SpecialSuggestUsers> list93 = coreData.suggestUsers;
            if (list93 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(128, list93, SpecialSuggestUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ActionData actionData = coreData.action;
            if (actionData != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(MMConstants.ERR_WATERMARK_READ, actionData, ActionData.PROTOBUF_ADAPTER);
            }
            TagStrategy tagStrategy = coreData.tagLoadStrategy;
            if (tagStrategy != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(130, tagStrategy, TagStrategy.PROTOBUF_ADAPTER);
            }
            List<NewTags> list94 = coreData.tags;
            if (list94 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(131, list94, NewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            TagStrategy tagStrategy2 = coreData.tagCategoryStrategy;
            if (tagStrategy2 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, tagStrategy2, TagStrategy.PROTOBUF_ADAPTER);
            }
            List<TagCategories> list95 = coreData.tagCategories;
            if (list95 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, list95, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TagUserCounts> list96 = coreData.tagUserCounts;
            if (list96 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(134, list96, TagUserCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SamesCardData> list97 = coreData.sames;
            if (list97 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, list97, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiteratureConfigInfo literatureConfigInfo = coreData.literatureConfigInfo;
            if (literatureConfigInfo != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, literatureConfigInfo, LiteratureConfigInfo.PROTOBUF_ADAPTER);
            }
            GreetingSummary greetingSummary2 = coreData.anonymousSummary;
            if (greetingSummary2 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, greetingSummary2, GreetingSummary.PROTOBUF_ADAPTER);
            }
            List<CardInfos> list98 = coreData.cardInfos;
            if (list98 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_PSK_WITH_RC4_128_SHA, list98, CardInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SeeInfos> list99 = coreData.seeInfos;
            if (list99 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, list99, SeeInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SeePortrait> list100 = coreData.seePortraits;
            if (list100 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(140, list100, SeePortrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ExtraPrivileges extraPrivileges = coreData.extraPrivileges;
            if (extraPrivileges != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, extraPrivileges, ExtraPrivileges.PROTOBUF_ADAPTER);
            }
            ProfileSelectedQue profileSelectedQue = coreData.selectedQuestion;
            if (profileSelectedQue != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, profileSelectedQue, ProfileSelectedQue.PROTOBUF_ADAPTER);
            }
            List<LikeUser> list101 = coreData.likeUsers;
            if (list101 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, list101, LikeUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(144, coreData.next);
            CipherId cipherId = coreData.cipherId;
            if (cipherId != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, cipherId, CipherId.PROTOBUF_ADAPTER);
            }
            ShareId shareId = coreData.shareId;
            if (shareId != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, shareId, ShareId.PROTOBUF_ADAPTER);
            }
            List<StateEmotion> list102 = coreData.stateEmotion;
            if (list102 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, list102, StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SeePortraitCounter seePortraitCounter = coreData.seePortraitCounter;
            if (seePortraitCounter != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(148, seePortraitCounter, SeePortraitCounter.PROTOBUF_ADAPTER);
            }
            List<Recommended> list103 = coreData.recommended;
            if (list103 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(149, list103, Recommended.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatHeat> list104 = coreData.chatHeats;
            if (list104 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(150, list104, ChatHeat.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PermissionsItem> list105 = coreData.chatHeatPermissions;
            if (list105 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(151, list105, PermissionsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ResourceTriggers> list106 = coreData.resources;
            if (list106 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, list106, ResourceTriggers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingResult greetingResult = coreData.greetingResult;
            if (greetingResult != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(153, greetingResult, GreetingResult.PROTOBUF_ADAPTER);
            }
            List<ConversationLatestMoment> list107 = coreData.latestMoments;
            if (list107 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(154, list107, ConversationLatestMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            JmpTarget jmpTarget = coreData.jmpTarget;
            if (jmpTarget != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, jmpTarget, JmpTarget.PROTOBUF_ADAPTER);
            }
            List<BuzzUser> list108 = coreData.buzzUsers;
            if (list108 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, list108, BuzzUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ODiamondListItem oDiamondListItem = coreData.odiamondList;
            if (oDiamondListItem != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(157, oDiamondListItem, ODiamondListItem.PROTOBUF_ADAPTER);
            }
            PopGuide popGuide = coreData.popGuide;
            if (popGuide != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(158, popGuide, PopGuide.PROTOBUF_ADAPTER);
            }
            List<SuperLikeCount> list109 = coreData.superLikeCount;
            if (list109 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(159, list109, SuperLikeCount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FloatsCardData> list110 = coreData.floats;
            if (list110 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(160, list110, FloatsCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MonetizationMsg monetizationMsg = coreData.monetizationMsg;
            if (monetizationMsg != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(161, monetizationMsg, MonetizationMsg.PROTOBUF_ADAPTER);
            }
            String str2 = coreData.link;
            if (str2 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(162, str2);
            }
            GrowthMomentThemeCardInfo growthMomentThemeCardInfo = coreData.tab;
            if (growthMomentThemeCardInfo != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(163, growthMomentThemeCardInfo, GrowthMomentThemeCardInfo.PROTOBUF_ADAPTER);
            }
            SeeExposedUser seeExposedUser = coreData.seeExposedUser;
            if (seeExposedUser != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, seeExposedUser, SeeExposedUser.PROTOBUF_ADAPTER);
            }
            GrowthExposureInfo growthExposureInfo = coreData.exposureInfo;
            if (growthExposureInfo != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(165, growthExposureInfo, GrowthExposureInfo.PROTOBUF_ADAPTER);
            }
            List<SamesCardData> list111 = coreData.love520;
            if (list111 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(166, list111, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = coreData.payWill;
            if (str3 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(167, str3);
            }
            List<ExtremePickItem> list112 = coreData.extremePickByList;
            if (list112 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, list112, ExtremePickItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChatGameInfo chatGameInfo = coreData.chatGameInfo;
            if (chatGameInfo != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(169, chatGameInfo, ChatGameInfo.PROTOBUF_ADAPTER);
            }
            List<SamesCardData> list113 = coreData.camping;
            if (list113 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, list113, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RecallMatch recallMatch = coreData.recallMatch;
            if (recallMatch != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, recallMatch, RecallMatch.PROTOBUF_ADAPTER);
            }
            List<BCoreLiveActivity> list114 = coreData.liveActivities;
            if (list114 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, list114, BCoreLiveActivity.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SamesCardData> list115 = coreData.mkt_activity_regular;
            if (list115 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, list115, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MonetizationChatSeeUser monetizationChatSeeUser = coreData.monetizationChatSeeUser;
            if (monetizationChatSeeUser != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, monetizationChatSeeUser, MonetizationChatSeeUser.PROTOBUF_ADAPTER);
            }
            List<IntlVisitor> list116 = coreData.intlVisitorInfo;
            if (list116 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, list116, IntlVisitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17220b3 + CodedOutputByteBufferNano.m17226h(176, coreData.count);
            List<String> list117 = coreData.invalidCardList;
            if (list117 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(177, list117, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatAssistantQuestion> list118 = coreData.chatAssistantQuestions;
            if (list118 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(178, list118, ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SamesCardData> list119 = coreData.mkt_activity_quiz;
            if (list119 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, list119, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b4 = iM17226h + CodedOutputByteBufferNano.m17220b(180, coreData.isRecallUser);
            ExtremeQuestions extremeQuestions = coreData.extremeQuestions;
            if (extremeQuestions != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(181, extremeQuestions, ExtremeQuestions.PROTOBUF_ADAPTER);
            }
            List<UserIdType> list120 = coreData.greetingNewPeople;
            if (list120 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(182, list120, UserIdType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GreetingNewPeopleMessage> list121 = coreData.greetingNewPeopleMessage;
            if (list121 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(183, list121, GreetingNewPeopleMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            BoostResultEntry boostResultEntry = coreData.boostResultEntry;
            if (boostResultEntry != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(184, boostResultEntry, BoostResultEntry.PROTOBUF_ADAPTER);
            }
            MatchInfo matchInfo = coreData.todayMatchInfo;
            if (matchInfo != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(185, matchInfo, MatchInfo.PROTOBUF_ADAPTER);
            }
            AiPictureAuth aiPictureAuth = coreData.aiPictureAuth;
            if (aiPictureAuth != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, aiPictureAuth, AiPictureAuth.PROTOBUF_ADAPTER);
            }
            GrowthMesInfo growthMesInfo = coreData.growthMesInfo;
            if (growthMesInfo != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(187, growthMesInfo, GrowthMesInfo.PROTOBUF_ADAPTER);
            }
            AcceleratePairingStatus acceleratePairingStatus = coreData.acceleratePairing;
            if (acceleratePairingStatus != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(188, acceleratePairingStatus, AcceleratePairingStatus.PROTOBUF_ADAPTER);
            }
            QuickChatPartyInvitation quickChatPartyInvitation = coreData.invitation;
            if (quickChatPartyInvitation != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, quickChatPartyInvitation, QuickChatPartyInvitation.PROTOBUF_ADAPTER);
            }
            QuickChatPartyCampaignPage quickChatPartyCampaignPage = coreData.campaignPage;
            if (quickChatPartyCampaignPage != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, quickChatPartyCampaignPage, QuickChatPartyCampaignPage.PROTOBUF_ADAPTER);
            }
            GrowthPartner growthPartner = coreData.partner;
            if (growthPartner != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, growthPartner, GrowthPartner.PROTOBUF_ADAPTER);
            }
            List<CityCData> list122 = coreData.cityCData;
            if (list122 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(192, list122, CityCData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GrowthBlindBox growthBlindBox = coreData.blindbox;
            if (growthBlindBox != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(193, growthBlindBox, GrowthBlindBox.PROTOBUF_ADAPTER);
            }
            List<String> list123 = coreData.unReadUserIds;
            if (list123 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, list123, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            CityCBanner cityCBanner = coreData.cityCBanner;
            if (cityCBanner != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, cityCBanner, CityCBanner.PROTOBUF_ADAPTER);
            }
            ChatPartners chatPartners = coreData.chatPartners;
            if (chatPartners != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, chatPartners, ChatPartners.PROTOBUF_ADAPTER);
            }
            List<ChatPartnersHistoryItem> list124 = coreData.chatPartnersSignals;
            if (list124 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, list124, ChatPartnersHistoryItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SurpriseGift surpriseGift = coreData.surpriseGift;
            if (surpriseGift != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(Opcodes.IFNULL, surpriseGift, SurpriseGift.PROTOBUF_ADAPTER);
            }
            int iM17228j = iM17220b4 + CodedOutputByteBufferNano.m17228j(Opcodes.IFNONNULL, coreData.surpriseGiftExpirationTime);
            List<CardCornerMark> list125 = coreData.cardCornerMarks;
            if (list125 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(200, list125, CardCornerMark.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PhotoLowModelData photoLowModelData = coreData.lowPhotoResult;
            if (photoLowModelData != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(201, photoLowModelData, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            List<SamesCardData> list126 = coreData.mkt_activity_flash;
            if (list126 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(202, list126, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CityCConfig cityCConfig = coreData.cityCConfig;
            if (cityCConfig != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(203, cityCConfig, CityCConfig.PROTOBUF_ADAPTER);
            }
            PrivateCustomSetting privateCustomSetting = coreData.privateCustomSetting;
            if (privateCustomSetting != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(204, privateCustomSetting, PrivateCustomSetting.PROTOBUF_ADAPTER);
            }
            PrivateCustomResult privateCustomResult = coreData.privateCustomResults;
            if (privateCustomResult != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(205, privateCustomResult, PrivateCustomResult.PROTOBUF_ADAPTER);
            }
            VisitorSetting visitorSetting = coreData.visitorSetting;
            if (visitorSetting != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(206, visitorSetting, VisitorSetting.PROTOBUF_ADAPTER);
            }
            List<VisitorHidden> list127 = coreData.visitorHiddens;
            if (list127 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(207, list127, VisitorHidden.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MarriageGuide marriageGuide = coreData.marriageGuide;
            if (marriageGuide != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(208, marriageGuide, MarriageGuide.PROTOBUF_ADAPTER);
            }
            List<SelectionUser> list128 = coreData.selectionUsers;
            if (list128 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(209, list128, SelectionUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SelectionUserInfo selectionUserInfo = coreData.selectionUserInfo;
            if (selectionUserInfo != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(210, selectionUserInfo, SelectionUserInfo.PROTOBUF_ADAPTER);
            }
            List<UserAudits> list129 = coreData.userAudits;
            if (list129 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(Primes.SMALL_FACTOR_LIMIT, list129, UserAudits.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DynamicLable> list130 = coreData.dynamicLabels;
            if (list130 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(212, list130, DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectText> list131 = coreData.details;
            if (list131 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(213, list131, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ColdStartLayer coldStartLayer = coreData.layer;
            if (coldStartLayer != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(214, coldStartLayer, ColdStartLayer.PROTOBUF_ADAPTER);
            }
            List<AuditPictureTag> list132 = coreData.auditPictureTags;
            if (list132 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(215, list132, AuditPictureTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            DatingGuideData datingGuideData = coreData.myTabGuide;
            if (datingGuideData != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(216, datingGuideData, DatingGuideData.PROTOBUF_ADAPTER);
            }
            int iM17220b5 = iM17228j + CodedOutputByteBufferNano.m17220b(217, coreData.profileGuide);
            TagStrategy tagStrategy3 = coreData.tagPictureStrategy;
            if (tagStrategy3 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(218, tagStrategy3, TagStrategy.PROTOBUF_ADAPTER);
            }
            List<NewTags> list133 = coreData.pictureTags;
            if (list133 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(219, list133, NewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = coreData.fakeSuggest;
            if (fakeQuickChatSuggestStatus != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(220, fakeQuickChatSuggestStatus, FakeQuickChatSuggestStatus.PROTOBUF_ADAPTER);
            }
            RiskOtherData riskOtherData = coreData.userRisk;
            if (riskOtherData != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(221, riskOtherData, RiskOtherData.PROTOBUF_ADAPTER);
            }
            RiskOtherData riskOtherData2 = coreData.descriptionRisk;
            if (riskOtherData2 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(222, riskOtherData2, RiskOtherData.PROTOBUF_ADAPTER);
            }
            List<RiskSelfData> list134 = coreData.risks;
            if (list134 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(223, list134, RiskSelfData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BarLoverplaces> list135 = coreData.barLoverPlaces;
            if (list135 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(224, list135, BarLoverplaces.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BarLoverCitys> list136 = coreData.barLoverCities;
            if (list136 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(225, list136, BarLoverCitys.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FateRadar fateRadar = coreData.fateRadar;
            if (fateRadar != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(226, fateRadar, FateRadar.PROTOBUF_ADAPTER);
            }
            ExpandedProfileLikeCounter expandedProfileLikeCounter = coreData.profileLikeCounter;
            if (expandedProfileLikeCounter != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(227, expandedProfileLikeCounter, ExpandedProfileLikeCounter.PROTOBUF_ADAPTER);
            }
            List<ProfileLikeComment> list137 = coreData.profileLikesComments;
            if (list137 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(228, list137, ProfileLikeComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            WechatNotifySetting wechatNotifySetting = coreData.wechat;
            if (wechatNotifySetting != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(229, wechatNotifySetting, WechatNotifySetting.PROTOBUF_ADAPTER);
            }
            SvipWeeklyReport svipWeeklyReport = coreData.svipWeeklyReport;
            if (svipWeeklyReport != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(230, svipWeeklyReport, SvipWeeklyReport.PROTOBUF_ADAPTER);
            }
            Explore explore = coreData.explore;
            if (explore != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(231, explore, Explore.PROTOBUF_ADAPTER);
            }
            VipSetting vipSetting = coreData.vipSettings;
            if (vipSetting != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(232, vipSetting, VipSetting.PROTOBUF_ADAPTER);
            }
            List<IceBreakQuestion> list138 = coreData.iceBreakQuestions;
            if (list138 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(233, list138, IceBreakQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FakeGuideData fakeGuideData = coreData.fakeGuideData;
            if (fakeGuideData != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(234, fakeGuideData, FakeGuideData.PROTOBUF_ADAPTER);
            }
            List<UserActivityInfo> list139 = coreData.userActivityInfos;
            if (list139 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(235, list139, UserActivityInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Questionnaire questionnaire = coreData.questionnaire;
            if (questionnaire != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(236, questionnaire, Questionnaire.PROTOBUF_ADAPTER);
            }
            QuestionnaireFeature questionnaireFeature = coreData.features;
            if (questionnaireFeature != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(237, questionnaireFeature, QuestionnaireFeature.PROTOBUF_ADAPTER);
            }
            UserStrategyConfiguration userStrategyConfiguration = coreData.userStrategyConfiguration;
            if (userStrategyConfiguration != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(238, userStrategyConfiguration, UserStrategyConfiguration.PROTOBUF_ADAPTER);
            }
            List<FakePhotoFeedback> list140 = coreData.fakePhotoFeedback;
            if (list140 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(239, list140, FakePhotoFeedback.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PhotoLowModelData photoLowModelData2 = coreData.repeatPictureResult;
            if (photoLowModelData2 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(240, photoLowModelData2, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData3 = coreData.netPictureResult;
            if (photoLowModelData3 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(241, photoLowModelData3, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            UserFeedbackInfo userFeedbackInfo = coreData.userFeedbackInfo;
            if (userFeedbackInfo != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(242, userFeedbackInfo, UserFeedbackInfo.PROTOBUF_ADAPTER);
            }
            List<IdealTag> list141 = coreData.idealDetails;
            if (list141 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(243, list141, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IdealInfo idealInfo = coreData.idealInfo;
            if (idealInfo != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, idealInfo, IdealInfo.PROTOBUF_ADAPTER);
            }
            List<IdealInfo> list142 = coreData.idealInfos;
            if (list142 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(245, list142, IdealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UrlTag> list143 = coreData.urlTags;
            if (list143 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(246, list143, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileCountInfo> list144 = coreData.profileCounts;
            if (list144 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(247, list144, ProfileCountInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PrivateCustomResult privateCustomResult2 = coreData.privateCustomResult;
            if (privateCustomResult2 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(248, privateCustomResult2, PrivateCustomResult.PROTOBUF_ADAPTER);
            }
            VideoChatSecondFloorSummary videoChatSecondFloorSummary = coreData.videoChatSecondFloorSummary;
            if (videoChatSecondFloorSummary != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(249, videoChatSecondFloorSummary, VideoChatSecondFloorSummary.PROTOBUF_ADAPTER);
            }
            RealPicturesBanner realPicturesBanner = coreData.realPicturesBanner;
            if (realPicturesBanner != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(250, realPicturesBanner, RealPicturesBanner.PROTOBUF_ADAPTER);
            }
            RealPicturesInfo realPicturesInfo = coreData.realPicturesInfo;
            if (realPicturesInfo != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(251, realPicturesInfo, RealPicturesInfo.PROTOBUF_ADAPTER);
            }
            List<IPRegion> list145 = coreData.ipRegion;
            if (list145 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(252, list145, IPRegion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RealFeelInfo realFeelInfo = coreData.realFeelInfo;
            if (realFeelInfo != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(253, realFeelInfo, RealFeelInfo.PROTOBUF_ADAPTER);
            }
            LoveLetterEntryInfo loveLetterEntryInfo = coreData.loveLetter;
            if (loveLetterEntryInfo != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(254, loveLetterEntryInfo, LoveLetterEntryInfo.PROTOBUF_ADAPTER);
            }
            LoveLetterGroupInfo loveLetterGroupInfo = coreData.loveLetterGroup;
            if (loveLetterGroupInfo != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(255, loveLetterGroupInfo, LoveLetterGroupInfo.PROTOBUF_ADAPTER);
            }
            LoveLetterContent loveLetterContent = coreData.loveLetterContent;
            if (loveLetterContent != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(256, loveLetterContent, LoveLetterContent.PROTOBUF_ADAPTER);
            }
            ChatPage chatPage = coreData.chatPage;
            if (chatPage != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(257, chatPage, ChatPage.PROTOBUF_ADAPTER);
            }
            List<ShowOnlineForWhoIMeet> list146 = coreData.showOnlineForWhoIMeet;
            if (list146 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(258, list146, ShowOnlineForWhoIMeet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PendingPaymentGuidance pendingPaymentGuidance = coreData.pendingPaymentGuidance;
            if (pendingPaymentGuidance != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(259, pendingPaymentGuidance, PendingPaymentGuidance.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData4 = coreData.notVerificationResultData;
            if (photoLowModelData4 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(260, photoLowModelData4, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            List<String> list147 = coreData.verificationLowLabels;
            if (list147 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(261, list147, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<MyTabTask> list148 = coreData.myTabTasks;
            if (list148 != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(262, list148, MyTabTask.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SeeTrialEligible seeTrialEligible = coreData.seeTrialEligible;
            if (seeTrialEligible != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(263, seeTrialEligible, SeeTrialEligible.PROTOBUF_ADAPTER);
            }
            SeeTrialStatus seeTrialStatus = coreData.seeTrialStatus;
            if (seeTrialStatus != null) {
                iM17220b5 += CodedOutputByteBufferNano.m17230l(264, seeTrialStatus, SeeTrialStatus.PROTOBUF_ADAPTER);
            }
            int iM17226h2 = iM17220b5 + CodedOutputByteBufferNano.m17226h(265, coreData.likedByToday);
            List<FeedbackQuestion> list149 = coreData.feedbackQuestions;
            if (list149 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(266, list149, FeedbackQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h3 = iM17226h2 + CodedOutputByteBufferNano.m17226h(267, coreData.feedbackRemainedNum);
            ConversationInstantChat conversationInstantChat = coreData.instantChat;
            if (conversationInstantChat != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(268, conversationInstantChat, ConversationInstantChat.PROTOBUF_ADAPTER);
            }
            AIChatAdvice aIChatAdvice = coreData.aiChatAdvice;
            if (aIChatAdvice != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(269, aIChatAdvice, AIChatAdvice.PROTOBUF_ADAPTER);
            }
            AIChatAnalysis aIChatAnalysis = coreData.aiChatAnalysis;
            if (aIChatAnalysis != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(270, aIChatAnalysis, AIChatAnalysis.PROTOBUF_ADAPTER);
            }
            InvitationInfo invitationInfo = coreData.invitationInfo;
            if (invitationInfo != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(271, invitationInfo, InvitationInfo.PROTOBUF_ADAPTER);
            }
            PictureVerifyRightedInfo pictureVerifyRightedInfo = coreData.pictureVerifyRightedInfo;
            if (pictureVerifyRightedInfo != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(272, pictureVerifyRightedInfo, PictureVerifyRightedInfo.PROTOBUF_ADAPTER);
            }
            IntlCurrencyDiamond intlCurrencyDiamond = coreData.diamond;
            if (intlCurrencyDiamond != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(273, intlCurrencyDiamond, IntlCurrencyDiamond.PROTOBUF_ADAPTER);
            }
            int iM17220b6 = iM17226h3 + CodedOutputByteBufferNano.m17220b(274, coreData.canChange) + CodedOutputByteBufferNano.m17226h(275, coreData.ttcToDiamondRate);
            List<Prologue> list150 = coreData.prologues;
            if (list150 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(276, list150, Prologue.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<InstantMatchGiveCountInfo> list151 = coreData.instantMatchGiveCountInfo;
            if (list151 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(277, list151, InstantMatchGiveCountInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CreditScoreData> list152 = coreData.creditScores;
            if (list152 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(278, list152, CreditScoreData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DislikedUsers> list153 = coreData.dislikedUsers;
            if (list153 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(279, list153, DislikedUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AnalysisGuide analysisGuide = coreData.analysisGuide;
            if (analysisGuide != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(280, analysisGuide, AnalysisGuide.PROTOBUF_ADAPTER);
            }
            VisitorDoorInfo visitorDoorInfo = coreData.visitorDoorInfo;
            if (visitorDoorInfo != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(281, visitorDoorInfo, VisitorDoorInfo.PROTOBUF_ADAPTER);
            }
            List<VisitorInfo> list154 = coreData.visitorInfo;
            if (list154 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(282, list154, VisitorInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<InstantMatchUserInfo> list155 = coreData.instantMatchUserInfo;
            if (list155 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(283, list155, InstantMatchUserInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TribeSubset> list156 = coreData.recommendList;
            if (list156 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(284, list156, TribeSubset.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IntlTribeBubble intlTribeBubble = coreData.intlBubble;
            if (intlTribeBubble != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(285, intlTribeBubble, IntlTribeBubble.PROTOBUF_ADAPTER);
            }
            MembershipUpgradeInfo membershipUpgradeInfo = coreData.membershipUpgradeInfo;
            if (membershipUpgradeInfo != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(286, membershipUpgradeInfo, MembershipUpgradeInfo.PROTOBUF_ADAPTER);
            }
            PurchaseSavePop purchaseSavePop = coreData.purchaseSavePop;
            if (purchaseSavePop != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(287, purchaseSavePop, PurchaseSavePop.PROTOBUF_ADAPTER);
            }
            List<SwipeUpperLimit> list157 = coreData.swipeUpperLimit;
            if (list157 != null) {
                iM17220b6 += CodedOutputByteBufferNano.m17230l(288, list157, SwipeUpperLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h4 = iM17220b6 + CodedOutputByteBufferNano.m17226h(289, coreData.payWillInfo) + CodedOutputByteBufferNano.m17226h(290, coreData.visitorAllCount) + CodedOutputByteBufferNano.m17222d(291, coreData.payWillScore) + CodedOutputByteBufferNano.m17222d(292, coreData.payWillScoreThreshold) + CodedOutputByteBufferNano.m17222d(293, coreData.scoreThresholdOther);
            List<InstantMatchUserInfo> list158 = coreData.picksInfo;
            if (list158 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17230l(294, list158, InstantMatchUserInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SuperlikeByCount> list159 = coreData.superlikeByCounts;
            if (list159 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17230l(295, list159, SuperlikeByCount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UltraRightsUpgradeInfo ultraRightsUpgradeInfo = coreData.ultraRightsUpgradeInfo;
            if (ultraRightsUpgradeInfo != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17230l(296, ultraRightsUpgradeInfo, UltraRightsUpgradeInfo.PROTOBUF_ADAPTER);
            }
            List<ComplimentText> list160 = coreData.complimentTexts;
            if (list160 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17230l(297, list160, ComplimentText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ComplimentFromOther complimentFromOther = coreData.compliment;
            if (complimentFromOther != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17230l(298, complimentFromOther, ComplimentFromOther.PROTOBUF_ADAPTER);
            }
            List<SuggestedComplimentItem> list161 = coreData.compliments;
            if (list161 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17230l(299, list161, SuggestedComplimentItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IapAffiliatePromotion> list162 = coreData.iapAffiliatePromotions;
            if (list162 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17230l(300, list162, IapAffiliatePromotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            coreData.cachedSize = iM17226h4;
            return iM17226h4;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreData parse(nb5 nb5Var) throws IOException {
            CoreData coreData = new CoreData();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (coreData.relationships == null) {
                            coreData.relationships = new ArrayList();
                        }
                        if (coreData.conversations == null) {
                            coreData.conversations = new ArrayList();
                        }
                        if (coreData.messages == null) {
                            coreData.messages = new ArrayList();
                        }
                        if (coreData.contacts == null) {
                            coreData.contacts = new ArrayList();
                        }
                        if (coreData.questions == null) {
                            coreData.questions = new ArrayList();
                        }
                        if (coreData.stickers == null) {
                            coreData.stickers = new ArrayList();
                        }
                        if (coreData.packages == null) {
                            coreData.packages = new ArrayList();
                        }
                        if (coreData.bundles == null) {
                            coreData.bundles = new ArrayList();
                        }
                        if (coreData.links == null) {
                            coreData.links = new ArrayList();
                        }
                        if (coreData.schools == null) {
                            coreData.schools = new ArrayList();
                        }
                        if (coreData.reminders == null) {
                            coreData.reminders = new ArrayList();
                        }
                        if (coreData.verificationCenter == null) {
                            coreData.verificationCenter = new ArrayList();
                        }
                        if (coreData.wallet == null) {
                            coreData.wallet = Wallet.new_();
                        }
                        if (coreData.privateQuestions == null) {
                            coreData.privateQuestions = new ArrayList();
                        }
                        if (coreData.summarizedPrivileges == null) {
                            coreData.summarizedPrivileges = new ArrayList();
                        }
                        if (coreData.voiceCall == null) {
                            coreData.voiceCall = new ArrayList();
                        }
                        if (coreData.contract == null) {
                            coreData.contract = Contract.new_();
                        }
                        if (coreData.chatGroups == null) {
                            coreData.chatGroups = new ArrayList();
                        }
                        if (coreData.chatGroupMembers == null) {
                            coreData.chatGroupMembers = new ArrayList();
                        }
                        if (coreData.groupApplies == null) {
                            coreData.groupApplies = new ArrayList();
                        }
                        if (coreData.interestedGroups == null) {
                            coreData.interestedGroups = new ArrayList();
                        }
                        if (coreData.groupTabs == null) {
                            coreData.groupTabs = new ArrayList();
                        }
                        if (coreData.keywords == null) {
                            coreData.keywords = new ArrayList();
                        }
                        if (coreData.settingGroups == null) {
                            coreData.settingGroups = new ArrayList();
                        }
                        if (coreData.redPackets == null) {
                            coreData.redPackets = new ArrayList();
                        }
                        if (coreData.counterVerification == null) {
                            coreData.counterVerification = CounterVerification.new_();
                        }
                        if (coreData.friends == null) {
                            coreData.friends = new ArrayList();
                        }
                        if (coreData.conversationDiff == null) {
                            coreData.conversationDiff = ConversationDiff.new_();
                        }
                        if (coreData.cardStyles == null) {
                            coreData.cardStyles = new ArrayList();
                        }
                        if (coreData.audioTexts == null) {
                            coreData.audioTexts = new ArrayList();
                        }
                        if (coreData.greetings == null) {
                            coreData.greetings = new ArrayList();
                        }
                        if (coreData.recentConversations == null) {
                            coreData.recentConversations = new ArrayList();
                        }
                        if (coreData.picks == null) {
                            coreData.picks = Picks.new_();
                        }
                        if (coreData.likedMes == null) {
                            coreData.likedMes = new ArrayList();
                        }
                        if (coreData.literaturesComments == null) {
                            coreData.literaturesComments = new ArrayList();
                        }
                        if (coreData.literatures == null) {
                            coreData.literatures = new ArrayList();
                        }
                        if (coreData.freeTrialInfo == null) {
                            coreData.freeTrialInfo = FreeTrialInfo.new_();
                        }
                        if (coreData.freeTrialOperateResult == null) {
                            coreData.freeTrialOperateResult = FreeTrialOperateResult.new_();
                        }
                        if (coreData.states == null) {
                            coreData.states = new ArrayList();
                        }
                        if (coreData.thirdPartyInfo == null) {
                            coreData.thirdPartyInfo = ThirdPartyInfo.new_();
                        }
                        if (coreData.privilegeGifts == null) {
                            coreData.privilegeGifts = new ArrayList();
                        }
                        if (coreData.recommendMessages == null) {
                            coreData.recommendMessages = new ArrayList();
                        }
                        if (coreData.greets == null) {
                            coreData.greets = new ArrayList();
                        }
                        if (coreData.heartbeatMatch == null) {
                            coreData.heartbeatMatch = HeartBeatMatched.new_();
                        }
                        if (coreData.intlInsertCardSets == null) {
                            coreData.intlInsertCardSets = new ArrayList();
                        }
                        if (coreData.actives == null) {
                            coreData.actives = new ArrayList();
                        }
                        if (coreData.cardsIcons == null) {
                            coreData.cardsIcons = new ArrayList();
                        }
                        if (coreData.tacitTest == null) {
                            coreData.tacitTest = TacitTestProfileCard.new_();
                        }
                        if (coreData.iceBreakings == null) {
                            coreData.iceBreakings = new ArrayList();
                        }
                        if (coreData.avatar == null) {
                            coreData.avatar = "";
                        }
                        if (coreData.tagLoadStrategy == null) {
                            coreData.tagLoadStrategy = TagStrategy.new_();
                        }
                        if (coreData.tags == null) {
                            coreData.tags = new ArrayList();
                        }
                        if (coreData.tagCategoryStrategy == null) {
                            coreData.tagCategoryStrategy = TagStrategy.new_();
                        }
                        if (coreData.tagCategories == null) {
                            coreData.tagCategories = new ArrayList();
                        }
                        if (coreData.tagUserCounts == null) {
                            coreData.tagUserCounts = new ArrayList();
                        }
                        if (coreData.sames == null) {
                            coreData.sames = new ArrayList();
                        }
                        if (coreData.literatureConfigInfo == null) {
                            coreData.literatureConfigInfo = LiteratureConfigInfo.new_();
                        }
                        if (coreData.cardInfos == null) {
                            coreData.cardInfos = new ArrayList();
                        }
                        if (coreData.seeInfos == null) {
                            coreData.seeInfos = new ArrayList();
                        }
                        if (coreData.seePortraits == null) {
                            coreData.seePortraits = new ArrayList();
                        }
                        if (coreData.profileLikesComments == null) {
                            coreData.profileLikesComments = new ArrayList();
                        }
                        if (coreData.profileLikeCounter == null) {
                            coreData.profileLikeCounter = ExpandedProfileLikeCounter.new_();
                        }
                        if (coreData.extraPrivileges == null) {
                            coreData.extraPrivileges = ExtraPrivileges.new_();
                        }
                        if (coreData.selectedQuestion == null) {
                            coreData.selectedQuestion = ProfileSelectedQue.new_();
                        }
                        if (coreData.likeUsers == null) {
                            coreData.likeUsers = new ArrayList();
                        }
                        if (coreData.cipherId == null) {
                            coreData.cipherId = CipherId.new_();
                        }
                        if (coreData.shareId == null) {
                            coreData.shareId = ShareId.new_();
                        }
                        if (coreData.stateEmotion == null) {
                            coreData.stateEmotion = new ArrayList();
                        }
                        if (coreData.seePortraitCounter == null) {
                            coreData.seePortraitCounter = SeePortraitCounter.new_();
                        }
                        if (coreData.recommended == null) {
                            coreData.recommended = new ArrayList();
                        }
                        if (coreData.chatHeats == null) {
                            coreData.chatHeats = new ArrayList();
                        }
                        if (coreData.chatHeatPermissions == null) {
                            coreData.chatHeatPermissions = new ArrayList();
                        }
                        if (coreData.resources == null) {
                            coreData.resources = new ArrayList();
                        }
                        if (coreData.greetingResult == null) {
                            coreData.greetingResult = GreetingResult.new_();
                        }
                        if (coreData.latestMoments == null) {
                            coreData.latestMoments = new ArrayList();
                        }
                        if (coreData.jmpTarget == null) {
                            coreData.jmpTarget = JmpTarget.new_();
                        }
                        if (coreData.buzzUsers == null) {
                            coreData.buzzUsers = new ArrayList();
                        }
                        if (coreData.odiamondList == null) {
                            coreData.odiamondList = ODiamondListItem.new_();
                        }
                        if (coreData.popGuide == null) {
                            coreData.popGuide = PopGuide.new_();
                        }
                        if (coreData.floats == null) {
                            coreData.floats = new ArrayList();
                        }
                        if (coreData.monetizationMsg == null) {
                            coreData.monetizationMsg = MonetizationMsg.new_();
                        }
                        if (coreData.tab == null) {
                            coreData.tab = GrowthMomentThemeCardInfo.new_();
                        }
                        if (coreData.seeExposedUser == null) {
                            coreData.seeExposedUser = SeeExposedUser.new_();
                        }
                        if (coreData.exposureInfo == null) {
                            coreData.exposureInfo = GrowthExposureInfo.new_();
                        }
                        if (coreData.love520 == null) {
                            coreData.love520 = new ArrayList();
                        }
                        if (coreData.payWill == null) {
                            coreData.payWill = "";
                        }
                        if (coreData.extremePickByList == null) {
                            coreData.extremePickByList = new ArrayList();
                        }
                        if (coreData.chatGameInfo == null) {
                            coreData.chatGameInfo = ChatGameInfo.new_();
                        }
                        if (coreData.camping == null) {
                            coreData.camping = new ArrayList();
                        }
                        if (coreData.recallMatch == null) {
                            coreData.recallMatch = RecallMatch.new_();
                        }
                        if (coreData.mkt_activity_regular == null) {
                            coreData.mkt_activity_regular = new ArrayList();
                        }
                        if (coreData.intlVisitorInfo == null) {
                            coreData.intlVisitorInfo = new ArrayList();
                        }
                        if (coreData.invalidCardList == null) {
                            coreData.invalidCardList = new ArrayList();
                        }
                        if (coreData.chatAssistantQuestions == null) {
                            coreData.chatAssistantQuestions = new ArrayList();
                        }
                        if (coreData.mkt_activity_quiz == null) {
                            coreData.mkt_activity_quiz = new ArrayList();
                        }
                        if (coreData.extremeQuestions == null) {
                            coreData.extremeQuestions = ExtremeQuestions.new_();
                        }
                        if (coreData.boostResultEntry == null) {
                            coreData.boostResultEntry = BoostResultEntry.new_();
                        }
                        if (coreData.todayMatchInfo == null) {
                            coreData.todayMatchInfo = MatchInfo.new_();
                        }
                        if (coreData.growthMesInfo == null) {
                            coreData.growthMesInfo = GrowthMesInfo.new_();
                        }
                        if (coreData.aiPictureAuth == null) {
                            coreData.aiPictureAuth = AiPictureAuth.new_();
                        }
                        if (coreData.campaignPage == null) {
                            coreData.campaignPage = QuickChatPartyCampaignPage.new_();
                        }
                        if (coreData.partner == null) {
                            coreData.partner = GrowthPartner.new_();
                        }
                        if (coreData.cityCData == null) {
                            coreData.cityCData = new ArrayList();
                        }
                        if (coreData.cityCBanner == null) {
                            coreData.cityCBanner = CityCBanner.new_();
                        }
                        if (coreData.chatPartners == null) {
                            coreData.chatPartners = ChatPartners.new_();
                        }
                        if (coreData.chatPartnersSignals == null) {
                            coreData.chatPartnersSignals = new ArrayList();
                        }
                        if (coreData.lowPhotoResult == null) {
                            coreData.lowPhotoResult = PhotoLowModelData.new_();
                        }
                        if (coreData.mkt_activity_flash == null) {
                            coreData.mkt_activity_flash = new ArrayList();
                        }
                        if (coreData.auditPictureTags == null) {
                            coreData.auditPictureTags = new ArrayList();
                        }
                        if (coreData.tagPictureStrategy == null) {
                            coreData.tagPictureStrategy = TagStrategy.new_();
                        }
                        if (coreData.pictureTags == null) {
                            coreData.pictureTags = new ArrayList();
                        }
                        if (coreData.barLoverPlaces == null) {
                            coreData.barLoverPlaces = new ArrayList();
                        }
                        if (coreData.barLoverCities == null) {
                            coreData.barLoverCities = new ArrayList();
                        }
                        if (coreData.fateRadar == null) {
                            coreData.fateRadar = FateRadar.new_();
                        }
                        if (coreData.explore == null) {
                            coreData.explore = Explore.new_();
                        }
                        if (coreData.repeatPictureResult == null) {
                            coreData.repeatPictureResult = PhotoLowModelData.new_();
                        }
                        if (coreData.netPictureResult == null) {
                            coreData.netPictureResult = PhotoLowModelData.new_();
                        }
                        if (coreData.userFeedbackInfo == null) {
                            coreData.userFeedbackInfo = UserFeedbackInfo.new_();
                        }
                        if (coreData.urlTags == null) {
                            coreData.urlTags = new ArrayList();
                        }
                        if (coreData.chatPage == null) {
                            coreData.chatPage = ChatPage.new_();
                        }
                        if (coreData.showOnlineForWhoIMeet == null) {
                            coreData.showOnlineForWhoIMeet = new ArrayList();
                        }
                        if (coreData.notVerificationResultData == null) {
                            coreData.notVerificationResultData = PhotoLowModelData.new_();
                        }
                        if (coreData.verificationLowLabels == null) {
                            coreData.verificationLowLabels = new ArrayList();
                        }
                        if (coreData.seeTrialEligible == null) {
                            coreData.seeTrialEligible = SeeTrialEligible.new_();
                        }
                        if (coreData.seeTrialStatus == null) {
                            coreData.seeTrialStatus = SeeTrialStatus.new_();
                        }
                        if (coreData.aiChatAdvice == null) {
                            coreData.aiChatAdvice = AIChatAdvice.new_();
                        }
                        if (coreData.aiChatAnalysis == null) {
                            coreData.aiChatAnalysis = AIChatAnalysis.new_();
                        }
                        if (coreData.diamond == null) {
                            coreData.diamond = IntlCurrencyDiamond.new_();
                        }
                        if (coreData.dislikedUsers == null) {
                            coreData.dislikedUsers = new ArrayList();
                        }
                        break;
                    case 10:
                        coreData.relationships = (List) nb5Var.m158743l(Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        coreData.conversations = (List) nb5Var.m158743l(Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        coreData.messages = (List) nb5Var.m158743l(Message.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        coreData.contacts = (List) nb5Var.m158743l(Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        coreData.questions = (List) nb5Var.m158743l(Question.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        coreData.stickers = (List) nb5Var.m158743l(Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        coreData.packages = (List) nb5Var.m158743l(StickerPackage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        coreData.bundles = (List) nb5Var.m158743l(StickerBundle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        coreData.links = (List) nb5Var.m158743l(Link.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        coreData.schools = (List) nb5Var.m158743l(School.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        coreData.reminders = (List) nb5Var.m158743l(Reminder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        coreData.verificationCenter = (List) nb5Var.m158743l(VerificationCenter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        coreData.wallet = (Wallet) nb5Var.m158743l(Wallet.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        coreData.privateQuestions = (List) nb5Var.m158743l(PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        coreData.coins = (Coin) nb5Var.m158743l(Coin.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        coreData.summarizedPrivileges = (List) nb5Var.m158743l(UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        coreData.faceidTokens = (List) nb5Var.m158743l(FaceidToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        coreData.merchandises = (List) nb5Var.m158743l(Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 154:
                        coreData.privacySettings = (List) nb5Var.m158743l(PrivacyMembershipSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 162:
                        coreData.figures = (List) nb5Var.m158743l(Figure.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        coreData.orders = (List) nb5Var.m158743l(PaymentOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 178:
                        coreData.boostStatus = (List) nb5Var.m158743l(BoostStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        coreData.summarizedPrivilegePrices = (List) nb5Var.m158743l(SummarizedPrivilegePrice.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        coreData.advancedSettings = (List) nb5Var.m158743l(AdvancedSettings.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 202:
                        coreData.surveys = (List) nb5Var.m158743l(Surveys.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 210:
                        coreData.appealInfos = (List) nb5Var.m158743l(AppealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 218:
                        coreData.autoDeducts = (List) nb5Var.m158743l(AutoDeducts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 226:
                        coreData.voiceCall = (List) nb5Var.m158743l(VoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 234:
                        coreData.complain = (List) nb5Var.m158743l(Complain.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 242:
                        coreData.liveLabels = (List) nb5Var.m158743l(UserLiveLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 250:
                        coreData.likedUsers = (List) nb5Var.m158743l(LikedUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 258:
                        coreData.refundDetails = (List) nb5Var.m158743l(RefundDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 266:
                        coreData.walletAccounts = (List) nb5Var.m158743l(WalletAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 274:
                        coreData.accountRecords = (List) nb5Var.m158743l(AccountRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 282:
                        coreData.monetizationConfiguration = (MonetizationConfiguration) nb5Var.m158743l(MonetizationConfiguration.PROTOBUF_ADAPTER);
                        continue;
                    case 290:
                        coreData.contract = (Contract) nb5Var.m158743l(Contract.PROTOBUF_ADAPTER);
                        continue;
                    case 298:
                        coreData.verificationTokens = (List) nb5Var.m158743l(VerificationToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 306:
                        coreData.heartbeats = (List) nb5Var.m158743l(HeartBeat.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 314:
                        coreData.contractInfos = (List) nb5Var.m158743l(ContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 322:
                        coreData.chatGroups = (List) nb5Var.m158743l(ChatGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 330:
                        coreData.chatGroupMembers = (List) nb5Var.m158743l(ChatGroupMember.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 338:
                        coreData.groupApplies = (List) nb5Var.m158743l(GroupApply.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 346:
                        coreData.notificationCounters = (List) nb5Var.m158743l(NotificationCounter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 354:
                        coreData.groupNotifications = (List) nb5Var.m158743l(GroupNotification.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 362:
                        coreData.groupAttributes = (List) nb5Var.m158743l(GroupAttribute.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 370:
                        coreData.interestedGroups = (List) nb5Var.m158743l(ChatGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 378:
                        coreData.groupTabs = (List) nb5Var.m158743l(GroupTab.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 386:
                        coreData.keywords = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 394:
                        coreData.groupSettings = (List) nb5Var.m158743l(GroupSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 402:
                        coreData.settingGroups = (List) nb5Var.m158743l(SettingGroups.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 410:
                        coreData.lives = (List) nb5Var.m158743l(Live.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 418:
                        coreData.officialAccounts = (List) nb5Var.m158743l(OfficialAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 426:
                        coreData.menus = (List) nb5Var.m158743l(OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 434:
                        coreData.tickles = (List) nb5Var.m158743l(TickleSettingInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 442:
                        coreData.monetizationPromotions = (List) nb5Var.m158743l(MonetizationPromotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 450:
                        coreData.coupons = (List) nb5Var.m158743l(Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 458:
                        coreData.chatProfiles = (List) nb5Var.m158743l(ChatProfile.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 466:
                        coreData.systemQuestions = (List) nb5Var.m158743l(IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 474:
                        coreData.priorityLike = (PriorityLike) nb5Var.m158743l(PriorityLike.PROTOBUF_ADAPTER);
                        continue;
                    case 482:
                        coreData.couponBag = (Couponbag) nb5Var.m158743l(Couponbag.PROTOBUF_ADAPTER);
                        continue;
                    case 490:
                        coreData.userStickers = (List) nb5Var.m158743l(UserSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 498:
                        coreData.redPackets = (List) nb5Var.m158743l(RedPacket.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 506:
                        coreData.giftInfos = (List) nb5Var.m158743l(CoreGiftInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 514:
                        coreData.counterVerification = (CounterVerification) nb5Var.m158743l(CounterVerification.PROTOBUF_ADAPTER);
                        continue;
                    case 522:
                        coreData.liveSchemas = (List) nb5Var.m158743l(LiveSchema.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 530:
                        coreData.friends = (List) nb5Var.m158743l(FriendInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 537:
                        coreData.nextTime = nb5Var.m158739h();
                        continue;
                    case 546:
                        coreData.conversationDiff = (ConversationDiff) nb5Var.m158743l(ConversationDiff.PROTOBUF_ADAPTER);
                        continue;
                    case 554:
                        coreData.comStatusAwards = (List) nb5Var.m158743l(ComStatusAward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 562:
                        coreData.cardStyles = (List) nb5Var.m158743l(CardStyle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 570:
                        coreData.audioTexts = (List) nb5Var.m158743l(AudioText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /* 578 */:
                        coreData.giftGuide = (CoreGiftGuide) nb5Var.m158743l(CoreGiftGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 586:
                        coreData.giftPanel = (List) nb5Var.m158743l(CoreGiftPanel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 594:
                        coreData.giftWallSocials = (List) nb5Var.m158743l(GiftWallSocial.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 602:
                        coreData.giftWallRankInfos = (List) nb5Var.m158743l(GiftWallRankInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 610:
                        coreData.giftWallTitles = (List) nb5Var.m158743l(GiftWallTitle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 618:
                        coreData.newGiftWalls = (List) nb5Var.m158743l(NewGiftWall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 626:
                        coreData.greetings = (List) nb5Var.m158743l(Greeting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 634:
                        coreData.greetingCounter = (GreetingCounter) nb5Var.m158743l(GreetingCounter.PROTOBUF_ADAPTER);
                        continue;
                    case 642:
                        coreData.greetingPermissions = (List) nb5Var.m158743l(GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 650:
                        coreData.greetingSummary = (GreetingSummary) nb5Var.m158743l(GreetingSummary.PROTOBUF_ADAPTER);
                        continue;
                    case 656:
                        coreData.hint = nb5Var.m158738g();
                        continue;
                    case 666:
                        coreData.cardExtraInfos = (List) nb5Var.m158743l(CardExtraInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 674:
                        coreData.readMessages = (List) nb5Var.m158743l(ReadMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_RIG /* 682 */:
                        coreData.recentConversations = (List) nb5Var.m158743l(RecentConversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 690:
                        coreData.orderInfos = (List) nb5Var.m158743l(OrderInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 698:
                        coreData.quickchatCard = (QuickChatCardInfo) nb5Var.m158743l(QuickChatCardInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 706:
                        coreData.picksUsers = (List) nb5Var.m158743l(PicksUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case Constants.AUDIO_MIXING_STATE_FAILED /* 714 */:
                        coreData.picks = (Picks) nb5Var.m158743l(Picks.PROTOBUF_ADAPTER);
                        continue;
                    case 722:
                        coreData.countdownLikes = (List) nb5Var.m158743l(CountdownItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 730:
                        coreData.greetingSetting = (GreetingSetting) nb5Var.m158743l(GreetingSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 738:
                        coreData.onlineLiveChatPair = (OnlineLiveChatPair) nb5Var.m158743l(OnlineLiveChatPair.PROTOBUF_ADAPTER);
                        continue;
                    case 746:
                        coreData.likedMes = (List) nb5Var.m158743l(CardStyle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case DetectDelayStopHelper.TYPE_DETECT_AR_GIFT /* 754 */:
                        coreData.myMeet = (MyMeetExtra) nb5Var.m158743l(MyMeetExtra.PROTOBUF_ADAPTER);
                        continue;
                    case 762:
                        coreData.moments = (List) nb5Var.m158743l(CoreMomentInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 770:
                        coreData.voicechat = (VoiceChatInfo) nb5Var.m158743l(VoiceChatInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 778:
                        coreData.bell = (QuickChatBellData) nb5Var.m158743l(QuickChatBellData.PROTOBUF_ADAPTER);
                        continue;
                    case 784:
                        coreData.isHit = nb5Var.m158738g();
                        continue;
                    case 794:
                        coreData.user = (User) nb5Var.m158743l(User.PROTOBUF_ADAPTER);
                        continue;
                    case 802:
                        coreData.literaturesComments = (List) nb5Var.m158743l(LiteraturesComments.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case Constants.RHYTHM_PLAYER_STATE_IDLE /* 810 */:
                        coreData.literatures = (List) nb5Var.m158743l(Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 818:
                        coreData.membershipRecommendUsers = (List) nb5Var.m158743l(MembershipRecommendUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 826:
                        coreData.freeTrialInfo = (FreeTrialInfo) nb5Var.m158743l(FreeTrialInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 834:
                        coreData.freeTrialOperateResult = (FreeTrialOperateResult) nb5Var.m158743l(FreeTrialOperateResult.PROTOBUF_ADAPTER);
                        continue;
                    case 842:
                        coreData.speedUpCard = (Note) nb5Var.m158743l(Note.PROTOBUF_ADAPTER);
                        continue;
                    case 850:
                        coreData.states = (List) nb5Var.m158743l(BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 858:
                        coreData.thirdPartyInfo = (ThirdPartyInfo) nb5Var.m158743l(ThirdPartyInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 866:
                        coreData.evaluations = (List) nb5Var.m158743l(Evaluation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 874:
                        coreData.evaluationReports = (List) nb5Var.m158743l(EvaluationReport.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 882:
                        coreData.msgData = (MessageFeedbackStatus) nb5Var.m158743l(MessageFeedbackStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 890:
                        coreData.evaluation = (Evaluation) nb5Var.m158743l(Evaluation.PROTOBUF_ADAPTER);
                        continue;
                    case 898:
                        coreData.privilegeGifts = (List) nb5Var.m158743l(PrivilegeGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case IMediaPlayer.MEDIA_INFO_V_DELAY /* 906 */:
                        coreData.recommendMessages = (List) nb5Var.m158743l(RecommendMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 914:
                        coreData.greets = (List) nb5Var.m158743l(UserGreetInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 922:
                        coreData.cardModels = (List) nb5Var.m158743l(CardModel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 930:
                        coreData.heartbeatMatch = (HeartBeatMatched) nb5Var.m158743l(HeartBeatMatched.PROTOBUF_ADAPTER);
                        continue;
                    case 938:
                        coreData.oneside = (QuickChatOneside) nb5Var.m158743l(QuickChatOneside.PROTOBUF_ADAPTER);
                        continue;
                    case 946:
                        coreData.myMeetListV3 = (MyMeetListV3) nb5Var.m158743l(MyMeetListV3.PROTOBUF_ADAPTER);
                        continue;
                    case 954:
                        coreData.myMeetEntryV3 = (MyMeetEntryV3) nb5Var.m158743l(MyMeetEntryV3.PROTOBUF_ADAPTER);
                        continue;
                    case 962:
                        coreData.intlInsertCardSets = (List) nb5Var.m158743l(InsertCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 970:
                        coreData.actives = (List) nb5Var.m158743l(Active.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 978:
                        coreData.cardsIcons = (List) nb5Var.m158743l(CardsIcons.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 986:
                        coreData.tacitTest = (TacitTestProfileCard) nb5Var.m158743l(TacitTestProfileCard.PROTOBUF_ADAPTER);
                        continue;
                    case 994:
                        coreData.iceBreakings = (List) nb5Var.m158743l(BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1002:
                        coreData.greetingHotLevelInfo = (GreetingHotLevelInfo) nb5Var.m158743l(GreetingHotLevelInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1010:
                        coreData.voices = (List) nb5Var.m158743l(Voice.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1018:
                        coreData.avatar = nb5Var.m158750s();
                        continue;
                    case TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START /* 1026 */:
                        coreData.suggestUsers = (List) nb5Var.m158743l(SpecialSuggestUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1034:
                        coreData.action = (ActionData) nb5Var.m158743l(ActionData.PROTOBUF_ADAPTER);
                        continue;
                    case 1042:
                        coreData.tagLoadStrategy = (TagStrategy) nb5Var.m158743l(TagStrategy.PROTOBUF_ADAPTER);
                        continue;
                    case 1050:
                        coreData.tags = (List) nb5Var.m158743l(NewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1058:
                        coreData.tagCategoryStrategy = (TagStrategy) nb5Var.m158743l(TagStrategy.PROTOBUF_ADAPTER);
                        continue;
                    case 1066:
                        coreData.tagCategories = (List) nb5Var.m158743l(TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1074:
                        coreData.tagUserCounts = (List) nb5Var.m158743l(TagUserCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1082:
                        coreData.sames = (List) nb5Var.m158743l(SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1090:
                        coreData.literatureConfigInfo = (LiteratureConfigInfo) nb5Var.m158743l(LiteratureConfigInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1098:
                        coreData.anonymousSummary = (GreetingSummary) nb5Var.m158743l(GreetingSummary.PROTOBUF_ADAPTER);
                        continue;
                    case TXLiveConstants.PUSH_WARNING_VIDEO_ENCODE_BITRATE_OVERFLOW /* 1106 */:
                        coreData.cardInfos = (List) nb5Var.m158743l(CardInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE /* 1114 */:
                        coreData.seeInfos = (List) nb5Var.m158743l(SeeInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case RtcEngineEvent.EvtType.EVT_PUBLISH_STREAM_EVENT /* 1122 */:
                        coreData.seePortraits = (List) nb5Var.m158743l(SeePortrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1130:
                        coreData.extraPrivileges = (ExtraPrivileges) nb5Var.m158743l(ExtraPrivileges.PROTOBUF_ADAPTER);
                        continue;
                    case 1138:
                        coreData.selectedQuestion = (ProfileSelectedQue) nb5Var.m158743l(ProfileSelectedQue.PROTOBUF_ADAPTER);
                        continue;
                    case 1146:
                        coreData.likeUsers = (List) nb5Var.m158743l(LikeUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1152:
                        coreData.next = nb5Var.m158738g();
                        continue;
                    case 1162:
                        coreData.cipherId = (CipherId) nb5Var.m158743l(CipherId.PROTOBUF_ADAPTER);
                        continue;
                    case 1170:
                        coreData.shareId = (ShareId) nb5Var.m158743l(ShareId.PROTOBUF_ADAPTER);
                        continue;
                    case 1178:
                        coreData.stateEmotion = (List) nb5Var.m158743l(StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1186:
                        coreData.seePortraitCounter = (SeePortraitCounter) nb5Var.m158743l(SeePortraitCounter.PROTOBUF_ADAPTER);
                        continue;
                    case 1194:
                        coreData.recommended = (List) nb5Var.m158743l(Recommended.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY /* 1202 */:
                        coreData.chatHeats = (List) nb5Var.m158743l(ChatHeat.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1210:
                        coreData.chatHeatPermissions = (List) nb5Var.m158743l(PermissionsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1218:
                        coreData.resources = (List) nb5Var.m158743l(ResourceTriggers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1226:
                        coreData.greetingResult = (GreetingResult) nb5Var.m158743l(GreetingResult.PROTOBUF_ADAPTER);
                        continue;
                    case 1234:
                        coreData.latestMoments = (List) nb5Var.m158743l(ConversationLatestMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1242:
                        coreData.jmpTarget = (JmpTarget) nb5Var.m158743l(JmpTarget.PROTOBUF_ADAPTER);
                        continue;
                    case 1250:
                        coreData.buzzUsers = (List) nb5Var.m158743l(BuzzUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1258:
                        coreData.odiamondList = (ODiamondListItem) nb5Var.m158743l(ODiamondListItem.PROTOBUF_ADAPTER);
                        continue;
                    case 1266:
                        coreData.popGuide = (PopGuide) nb5Var.m158743l(PopGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 1274:
                        coreData.superLikeCount = (List) nb5Var.m158743l(SuperLikeCount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1282:
                        coreData.floats = (List) nb5Var.m158743l(FloatsCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1290:
                        coreData.monetizationMsg = (MonetizationMsg) nb5Var.m158743l(MonetizationMsg.PROTOBUF_ADAPTER);
                        continue;
                    case 1298:
                        coreData.link = nb5Var.m158750s();
                        continue;
                    case 1306:
                        coreData.tab = (GrowthMomentThemeCardInfo) nb5Var.m158743l(GrowthMomentThemeCardInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1314:
                        coreData.seeExposedUser = (SeeExposedUser) nb5Var.m158743l(SeeExposedUser.PROTOBUF_ADAPTER);
                        continue;
                    case 1322:
                        coreData.exposureInfo = (GrowthExposureInfo) nb5Var.m158743l(GrowthExposureInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1330:
                        coreData.love520 = (List) nb5Var.m158743l(SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1338:
                        coreData.payWill = nb5Var.m158750s();
                        continue;
                    case 1346:
                        coreData.extremePickByList = (List) nb5Var.m158743l(ExtremePickItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1354:
                        coreData.chatGameInfo = (ChatGameInfo) nb5Var.m158743l(ChatGameInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1362:
                        coreData.camping = (List) nb5Var.m158743l(SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1370:
                        coreData.recallMatch = (RecallMatch) nb5Var.m158743l(RecallMatch.PROTOBUF_ADAPTER);
                        continue;
                    case 1378:
                        coreData.liveActivities = (List) nb5Var.m158743l(BCoreLiveActivity.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1386:
                        coreData.mkt_activity_regular = (List) nb5Var.m158743l(SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1394:
                        coreData.monetizationChatSeeUser = (MonetizationChatSeeUser) nb5Var.m158743l(MonetizationChatSeeUser.PROTOBUF_ADAPTER);
                        continue;
                    case 1402:
                        coreData.intlVisitorInfo = (List) nb5Var.m158743l(IntlVisitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1408:
                        coreData.count = nb5Var.m158741j();
                        continue;
                    case 1418:
                        coreData.invalidCardList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1426:
                        coreData.chatAssistantQuestions = (List) nb5Var.m158743l(ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1434:
                        coreData.mkt_activity_quiz = (List) nb5Var.m158743l(SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1440:
                        coreData.isRecallUser = nb5Var.m158738g();
                        continue;
                    case 1450:
                        coreData.extremeQuestions = (ExtremeQuestions) nb5Var.m158743l(ExtremeQuestions.PROTOBUF_ADAPTER);
                        continue;
                    case 1458:
                        coreData.greetingNewPeople = (List) nb5Var.m158743l(UserIdType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1466:
                        coreData.greetingNewPeopleMessage = (List) nb5Var.m158743l(GreetingNewPeopleMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1474:
                        coreData.boostResultEntry = (BoostResultEntry) nb5Var.m158743l(BoostResultEntry.PROTOBUF_ADAPTER);
                        continue;
                    case 1482:
                        coreData.todayMatchInfo = (MatchInfo) nb5Var.m158743l(MatchInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1490:
                        coreData.aiPictureAuth = (AiPictureAuth) nb5Var.m158743l(AiPictureAuth.PROTOBUF_ADAPTER);
                        continue;
                    case 1498:
                        coreData.growthMesInfo = (GrowthMesInfo) nb5Var.m158743l(GrowthMesInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1506:
                        coreData.acceleratePairing = (AcceleratePairingStatus) nb5Var.m158743l(AcceleratePairingStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 1514:
                        coreData.invitation = (QuickChatPartyInvitation) nb5Var.m158743l(QuickChatPartyInvitation.PROTOBUF_ADAPTER);
                        continue;
                    case 1522:
                        coreData.campaignPage = (QuickChatPartyCampaignPage) nb5Var.m158743l(QuickChatPartyCampaignPage.PROTOBUF_ADAPTER);
                        continue;
                    case 1530:
                        coreData.partner = (GrowthPartner) nb5Var.m158743l(GrowthPartner.PROTOBUF_ADAPTER);
                        continue;
                    case 1538:
                        coreData.cityCData = (List) nb5Var.m158743l(CityCData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1546:
                        coreData.blindbox = (GrowthBlindBox) nb5Var.m158743l(GrowthBlindBox.PROTOBUF_ADAPTER);
                        continue;
                    case 1554:
                        coreData.unReadUserIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1562:
                        coreData.cityCBanner = (CityCBanner) nb5Var.m158743l(CityCBanner.PROTOBUF_ADAPTER);
                        continue;
                    case 1570:
                        coreData.chatPartners = (ChatPartners) nb5Var.m158743l(ChatPartners.PROTOBUF_ADAPTER);
                        continue;
                    case 1578:
                        coreData.chatPartnersSignals = (List) nb5Var.m158743l(ChatPartnersHistoryItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1586:
                        coreData.surpriseGift = (SurpriseGift) nb5Var.m158743l(SurpriseGift.PROTOBUF_ADAPTER);
                        continue;
                    case 1592:
                        coreData.surpriseGiftExpirationTime = nb5Var.m158742k();
                        continue;
                    case MMConstants.ERR_VCM_ENCODER_ENCODE_ERROR /* 1602 */:
                        coreData.cardCornerMarks = (List) nb5Var.m158743l(CardCornerMark.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1610:
                        coreData.lowPhotoResult = (PhotoLowModelData) nb5Var.m158743l(PhotoLowModelData.PROTOBUF_ADAPTER);
                        continue;
                    case 1618:
                        coreData.mkt_activity_flash = (List) nb5Var.m158743l(SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1626:
                        coreData.cityCConfig = (CityCConfig) nb5Var.m158743l(CityCConfig.PROTOBUF_ADAPTER);
                        continue;
                    case 1634:
                        coreData.privateCustomSetting = (PrivateCustomSetting) nb5Var.m158743l(PrivateCustomSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 1642:
                        coreData.privateCustomResults = (PrivateCustomResult) nb5Var.m158743l(PrivateCustomResult.PROTOBUF_ADAPTER);
                        continue;
                    case 1650:
                        coreData.visitorSetting = (VisitorSetting) nb5Var.m158743l(VisitorSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 1658:
                        coreData.visitorHiddens = (List) nb5Var.m158743l(VisitorHidden.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1666:
                        coreData.marriageGuide = (MarriageGuide) nb5Var.m158743l(MarriageGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 1674:
                        coreData.selectionUsers = (List) nb5Var.m158743l(SelectionUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1682:
                        coreData.selectionUserInfo = (SelectionUserInfo) nb5Var.m158743l(SelectionUserInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1690:
                        coreData.userAudits = (List) nb5Var.m158743l(UserAudits.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1698:
                        coreData.dynamicLabels = (List) nb5Var.m158743l(DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1706:
                        coreData.details = (List) nb5Var.m158743l(DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1714:
                        coreData.layer = (ColdStartLayer) nb5Var.m158743l(ColdStartLayer.PROTOBUF_ADAPTER);
                        continue;
                    case 1722:
                        coreData.auditPictureTags = (List) nb5Var.m158743l(AuditPictureTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1730:
                        coreData.myTabGuide = (DatingGuideData) nb5Var.m158743l(DatingGuideData.PROTOBUF_ADAPTER);
                        continue;
                    case 1736:
                        coreData.profileGuide = nb5Var.m158738g();
                        continue;
                    case 1746:
                        coreData.tagPictureStrategy = (TagStrategy) nb5Var.m158743l(TagStrategy.PROTOBUF_ADAPTER);
                        continue;
                    case 1754:
                        coreData.pictureTags = (List) nb5Var.m158743l(NewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1762:
                        coreData.fakeSuggest = (FakeQuickChatSuggestStatus) nb5Var.m158743l(FakeQuickChatSuggestStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 1770:
                        coreData.userRisk = (RiskOtherData) nb5Var.m158743l(RiskOtherData.PROTOBUF_ADAPTER);
                        continue;
                    case 1778:
                        coreData.descriptionRisk = (RiskOtherData) nb5Var.m158743l(RiskOtherData.PROTOBUF_ADAPTER);
                        continue;
                    case 1786:
                        coreData.risks = (List) nb5Var.m158743l(RiskSelfData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1794:
                        coreData.barLoverPlaces = (List) nb5Var.m158743l(BarLoverplaces.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1802:
                        coreData.barLoverCities = (List) nb5Var.m158743l(BarLoverCitys.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1810:
                        coreData.fateRadar = (FateRadar) nb5Var.m158743l(FateRadar.PROTOBUF_ADAPTER);
                        continue;
                    case 1818:
                        coreData.profileLikeCounter = (ExpandedProfileLikeCounter) nb5Var.m158743l(ExpandedProfileLikeCounter.PROTOBUF_ADAPTER);
                        continue;
                    case 1826:
                        coreData.profileLikesComments = (List) nb5Var.m158743l(ProfileLikeComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1834:
                        coreData.wechat = (WechatNotifySetting) nb5Var.m158743l(WechatNotifySetting.PROTOBUF_ADAPTER);
                        continue;
                    case 1842:
                        coreData.svipWeeklyReport = (SvipWeeklyReport) nb5Var.m158743l(SvipWeeklyReport.PROTOBUF_ADAPTER);
                        continue;
                    case 1850:
                        coreData.explore = (Explore) nb5Var.m158743l(Explore.PROTOBUF_ADAPTER);
                        continue;
                    case 1858:
                        coreData.vipSettings = (VipSetting) nb5Var.m158743l(VipSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 1866:
                        coreData.iceBreakQuestions = (List) nb5Var.m158743l(IceBreakQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1874:
                        coreData.fakeGuideData = (FakeGuideData) nb5Var.m158743l(FakeGuideData.PROTOBUF_ADAPTER);
                        continue;
                    case 1882:
                        coreData.userActivityInfos = (List) nb5Var.m158743l(UserActivityInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1890:
                        coreData.questionnaire = (Questionnaire) nb5Var.m158743l(Questionnaire.PROTOBUF_ADAPTER);
                        continue;
                    case 1898:
                        coreData.features = (QuestionnaireFeature) nb5Var.m158743l(QuestionnaireFeature.PROTOBUF_ADAPTER);
                        continue;
                    case 1906:
                        coreData.userStrategyConfiguration = (UserStrategyConfiguration) nb5Var.m158743l(UserStrategyConfiguration.PROTOBUF_ADAPTER);
                        continue;
                    case 1914:
                        coreData.fakePhotoFeedback = (List) nb5Var.m158743l(FakePhotoFeedback.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1922:
                        coreData.repeatPictureResult = (PhotoLowModelData) nb5Var.m158743l(PhotoLowModelData.PROTOBUF_ADAPTER);
                        continue;
                    case 1930:
                        coreData.netPictureResult = (PhotoLowModelData) nb5Var.m158743l(PhotoLowModelData.PROTOBUF_ADAPTER);
                        continue;
                    case 1938:
                        coreData.userFeedbackInfo = (UserFeedbackInfo) nb5Var.m158743l(UserFeedbackInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1946:
                        coreData.idealDetails = (List) nb5Var.m158743l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1954:
                        coreData.idealInfo = (IdealInfo) nb5Var.m158743l(IdealInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 1962:
                        coreData.idealInfos = (List) nb5Var.m158743l(IdealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1970:
                        coreData.urlTags = (List) nb5Var.m158743l(UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1978:
                        coreData.profileCounts = (List) nb5Var.m158743l(ProfileCountInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 1986:
                        coreData.privateCustomResult = (PrivateCustomResult) nb5Var.m158743l(PrivateCustomResult.PROTOBUF_ADAPTER);
                        continue;
                    case 1994:
                        coreData.videoChatSecondFloorSummary = (VideoChatSecondFloorSummary) nb5Var.m158743l(VideoChatSecondFloorSummary.PROTOBUF_ADAPTER);
                        continue;
                    case 2002:
                        coreData.realPicturesBanner = (RealPicturesBanner) nb5Var.m158743l(RealPicturesBanner.PROTOBUF_ADAPTER);
                        continue;
                    case 2010:
                        coreData.realPicturesInfo = (RealPicturesInfo) nb5Var.m158743l(RealPicturesInfo.PROTOBUF_ADAPTER);
                        continue;
                    case TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED /* 2018 */:
                        coreData.ipRegion = (List) nb5Var.m158743l(IPRegion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY /* 2026 */:
                        coreData.realFeelInfo = (RealFeelInfo) nb5Var.m158743l(RealFeelInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2034:
                        coreData.loveLetter = (LoveLetterEntryInfo) nb5Var.m158743l(LoveLetterEntryInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2042:
                        coreData.loveLetterGroup = (LoveLetterGroupInfo) nb5Var.m158743l(LoveLetterGroupInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2050:
                        coreData.loveLetterContent = (LoveLetterContent) nb5Var.m158743l(LoveLetterContent.PROTOBUF_ADAPTER);
                        continue;
                    case 2058:
                        coreData.chatPage = (ChatPage) nb5Var.m158743l(ChatPage.PROTOBUF_ADAPTER);
                        continue;
                    case 2066:
                        coreData.showOnlineForWhoIMeet = (List) nb5Var.m158743l(ShowOnlineForWhoIMeet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2074:
                        coreData.pendingPaymentGuidance = (PendingPaymentGuidance) nb5Var.m158743l(PendingPaymentGuidance.PROTOBUF_ADAPTER);
                        continue;
                    case 2082:
                        coreData.notVerificationResultData = (PhotoLowModelData) nb5Var.m158743l(PhotoLowModelData.PROTOBUF_ADAPTER);
                        continue;
                    case 2090:
                        coreData.verificationLowLabels = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2098:
                        coreData.myTabTasks = (List) nb5Var.m158743l(MyTabTask.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2106:
                        coreData.seeTrialEligible = (SeeTrialEligible) nb5Var.m158743l(SeeTrialEligible.PROTOBUF_ADAPTER);
                        continue;
                    case 2114:
                        coreData.seeTrialStatus = (SeeTrialStatus) nb5Var.m158743l(SeeTrialStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 2120:
                        coreData.likedByToday = nb5Var.m158741j();
                        continue;
                    case 2130:
                        coreData.feedbackQuestions = (List) nb5Var.m158743l(FeedbackQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2136:
                        coreData.feedbackRemainedNum = nb5Var.m158741j();
                        continue;
                    case 2146:
                        coreData.instantChat = (ConversationInstantChat) nb5Var.m158743l(ConversationInstantChat.PROTOBUF_ADAPTER);
                        continue;
                    case 2154:
                        coreData.aiChatAdvice = (AIChatAdvice) nb5Var.m158743l(AIChatAdvice.PROTOBUF_ADAPTER);
                        continue;
                    case 2162:
                        coreData.aiChatAnalysis = (AIChatAnalysis) nb5Var.m158743l(AIChatAnalysis.PROTOBUF_ADAPTER);
                        continue;
                    case IjkMediaMeta.FF_PROFILE_H264_HIGH_422_INTRA /* 2170 */:
                        coreData.invitationInfo = (InvitationInfo) nb5Var.m158743l(InvitationInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2178:
                        coreData.pictureVerifyRightedInfo = (PictureVerifyRightedInfo) nb5Var.m158743l(PictureVerifyRightedInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2186:
                        coreData.diamond = (IntlCurrencyDiamond) nb5Var.m158743l(IntlCurrencyDiamond.PROTOBUF_ADAPTER);
                        continue;
                    case 2192:
                        coreData.canChange = nb5Var.m158738g();
                        continue;
                    case 2200:
                        coreData.ttcToDiamondRate = nb5Var.m158741j();
                        continue;
                    case 2210:
                        coreData.prologues = (List) nb5Var.m158743l(Prologue.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2218:
                        coreData.instantMatchGiveCountInfo = (List) nb5Var.m158743l(InstantMatchGiveCountInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2226:
                        coreData.creditScores = (List) nb5Var.m158743l(CreditScoreData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2234:
                        coreData.dislikedUsers = (List) nb5Var.m158743l(DislikedUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2242:
                        coreData.analysisGuide = (AnalysisGuide) nb5Var.m158743l(AnalysisGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 2250:
                        coreData.visitorDoorInfo = (VisitorDoorInfo) nb5Var.m158743l(VisitorDoorInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2258:
                        coreData.visitorInfo = (List) nb5Var.m158743l(VisitorInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2266:
                        coreData.instantMatchUserInfo = (List) nb5Var.m158743l(InstantMatchUserInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2274:
                        coreData.recommendList = (List) nb5Var.m158743l(TribeSubset.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2282:
                        coreData.intlBubble = (IntlTribeBubble) nb5Var.m158743l(IntlTribeBubble.PROTOBUF_ADAPTER);
                        continue;
                    case 2290:
                        coreData.membershipUpgradeInfo = (MembershipUpgradeInfo) nb5Var.m158743l(MembershipUpgradeInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2298:
                        coreData.purchaseSavePop = (PurchaseSavePop) nb5Var.m158743l(PurchaseSavePop.PROTOBUF_ADAPTER);
                        continue;
                    case 2306:
                        coreData.swipeUpperLimit = (List) nb5Var.m158743l(SwipeUpperLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2312:
                        coreData.payWillInfo = nb5Var.m158741j();
                        continue;
                    case 2320:
                        coreData.visitorAllCount = nb5Var.m158741j();
                        continue;
                    case 2329:
                        coreData.payWillScore = nb5Var.m158739h();
                        continue;
                    case 2337:
                        coreData.payWillScoreThreshold = nb5Var.m158739h();
                        continue;
                    case 2345:
                        coreData.scoreThresholdOther = nb5Var.m158739h();
                        continue;
                    case 2354:
                        coreData.picksInfo = (List) nb5Var.m158743l(InstantMatchUserInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2362:
                        coreData.superlikeByCounts = (List) nb5Var.m158743l(SuperlikeByCount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2370:
                        coreData.ultraRightsUpgradeInfo = (UltraRightsUpgradeInfo) nb5Var.m158743l(UltraRightsUpgradeInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 2378:
                        coreData.complimentTexts = (List) nb5Var.m158743l(ComplimentText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2386:
                        coreData.compliment = (ComplimentFromOther) nb5Var.m158743l(ComplimentFromOther.PROTOBUF_ADAPTER);
                        continue;
                    case 2394:
                        coreData.compliments = (List) nb5Var.m158743l(SuggestedComplimentItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 2402:
                        coreData.iapAffiliatePromotions = (List) nb5Var.m158743l(IapAffiliatePromotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (coreData.relationships == null) {
                            coreData.relationships = new ArrayList();
                        }
                        if (coreData.conversations == null) {
                            coreData.conversations = new ArrayList();
                        }
                        if (coreData.messages == null) {
                            coreData.messages = new ArrayList();
                        }
                        if (coreData.contacts == null) {
                            coreData.contacts = new ArrayList();
                        }
                        if (coreData.questions == null) {
                            coreData.questions = new ArrayList();
                        }
                        if (coreData.stickers == null) {
                            coreData.stickers = new ArrayList();
                        }
                        if (coreData.packages == null) {
                            coreData.packages = new ArrayList();
                        }
                        if (coreData.bundles == null) {
                            coreData.bundles = new ArrayList();
                        }
                        if (coreData.links == null) {
                            coreData.links = new ArrayList();
                        }
                        if (coreData.schools == null) {
                            coreData.schools = new ArrayList();
                        }
                        if (coreData.reminders == null) {
                            coreData.reminders = new ArrayList();
                        }
                        if (coreData.verificationCenter == null) {
                            coreData.verificationCenter = new ArrayList();
                        }
                        if (coreData.wallet == null) {
                            coreData.wallet = Wallet.new_();
                        }
                        if (coreData.privateQuestions == null) {
                            coreData.privateQuestions = new ArrayList();
                        }
                        if (coreData.summarizedPrivileges == null) {
                            coreData.summarizedPrivileges = new ArrayList();
                        }
                        if (coreData.voiceCall == null) {
                            coreData.voiceCall = new ArrayList();
                        }
                        if (coreData.contract == null) {
                            coreData.contract = Contract.new_();
                        }
                        if (coreData.chatGroups == null) {
                            coreData.chatGroups = new ArrayList();
                        }
                        if (coreData.chatGroupMembers == null) {
                            coreData.chatGroupMembers = new ArrayList();
                        }
                        if (coreData.groupApplies == null) {
                            coreData.groupApplies = new ArrayList();
                        }
                        if (coreData.interestedGroups == null) {
                            coreData.interestedGroups = new ArrayList();
                        }
                        if (coreData.groupTabs == null) {
                            coreData.groupTabs = new ArrayList();
                        }
                        if (coreData.keywords == null) {
                            coreData.keywords = new ArrayList();
                        }
                        if (coreData.settingGroups == null) {
                            coreData.settingGroups = new ArrayList();
                        }
                        if (coreData.redPackets == null) {
                            coreData.redPackets = new ArrayList();
                        }
                        if (coreData.counterVerification == null) {
                            coreData.counterVerification = CounterVerification.new_();
                        }
                        if (coreData.friends == null) {
                            coreData.friends = new ArrayList();
                        }
                        if (coreData.conversationDiff == null) {
                            coreData.conversationDiff = ConversationDiff.new_();
                        }
                        if (coreData.cardStyles == null) {
                            coreData.cardStyles = new ArrayList();
                        }
                        if (coreData.audioTexts == null) {
                            coreData.audioTexts = new ArrayList();
                        }
                        if (coreData.greetings == null) {
                            coreData.greetings = new ArrayList();
                        }
                        if (coreData.recentConversations == null) {
                            coreData.recentConversations = new ArrayList();
                        }
                        if (coreData.picks == null) {
                            coreData.picks = Picks.new_();
                        }
                        if (coreData.likedMes == null) {
                            coreData.likedMes = new ArrayList();
                        }
                        if (coreData.literaturesComments == null) {
                            coreData.literaturesComments = new ArrayList();
                        }
                        if (coreData.literatures == null) {
                            coreData.literatures = new ArrayList();
                        }
                        if (coreData.freeTrialInfo == null) {
                            coreData.freeTrialInfo = FreeTrialInfo.new_();
                        }
                        if (coreData.freeTrialOperateResult == null) {
                            coreData.freeTrialOperateResult = FreeTrialOperateResult.new_();
                        }
                        if (coreData.states == null) {
                            coreData.states = new ArrayList();
                        }
                        if (coreData.thirdPartyInfo == null) {
                            coreData.thirdPartyInfo = ThirdPartyInfo.new_();
                        }
                        if (coreData.privilegeGifts == null) {
                            coreData.privilegeGifts = new ArrayList();
                        }
                        if (coreData.recommendMessages == null) {
                            coreData.recommendMessages = new ArrayList();
                        }
                        if (coreData.greets == null) {
                            coreData.greets = new ArrayList();
                        }
                        if (coreData.heartbeatMatch == null) {
                            coreData.heartbeatMatch = HeartBeatMatched.new_();
                        }
                        if (coreData.intlInsertCardSets == null) {
                            coreData.intlInsertCardSets = new ArrayList();
                        }
                        if (coreData.actives == null) {
                            coreData.actives = new ArrayList();
                        }
                        if (coreData.cardsIcons == null) {
                            coreData.cardsIcons = new ArrayList();
                        }
                        if (coreData.tacitTest == null) {
                            coreData.tacitTest = TacitTestProfileCard.new_();
                        }
                        if (coreData.iceBreakings == null) {
                            coreData.iceBreakings = new ArrayList();
                        }
                        if (coreData.avatar == null) {
                            coreData.avatar = "";
                        }
                        if (coreData.tagLoadStrategy == null) {
                            coreData.tagLoadStrategy = TagStrategy.new_();
                        }
                        if (coreData.tags == null) {
                            coreData.tags = new ArrayList();
                        }
                        if (coreData.tagCategoryStrategy == null) {
                            coreData.tagCategoryStrategy = TagStrategy.new_();
                        }
                        if (coreData.tagCategories == null) {
                            coreData.tagCategories = new ArrayList();
                        }
                        if (coreData.tagUserCounts == null) {
                            coreData.tagUserCounts = new ArrayList();
                        }
                        if (coreData.sames == null) {
                            coreData.sames = new ArrayList();
                        }
                        if (coreData.literatureConfigInfo == null) {
                            coreData.literatureConfigInfo = LiteratureConfigInfo.new_();
                        }
                        if (coreData.cardInfos == null) {
                            coreData.cardInfos = new ArrayList();
                        }
                        if (coreData.seeInfos == null) {
                            coreData.seeInfos = new ArrayList();
                        }
                        if (coreData.seePortraits == null) {
                            coreData.seePortraits = new ArrayList();
                        }
                        if (coreData.profileLikesComments == null) {
                            coreData.profileLikesComments = new ArrayList();
                        }
                        if (coreData.profileLikeCounter == null) {
                            coreData.profileLikeCounter = ExpandedProfileLikeCounter.new_();
                        }
                        if (coreData.extraPrivileges == null) {
                            coreData.extraPrivileges = ExtraPrivileges.new_();
                        }
                        if (coreData.selectedQuestion == null) {
                            coreData.selectedQuestion = ProfileSelectedQue.new_();
                        }
                        if (coreData.likeUsers == null) {
                            coreData.likeUsers = new ArrayList();
                        }
                        if (coreData.cipherId == null) {
                            coreData.cipherId = CipherId.new_();
                        }
                        if (coreData.shareId == null) {
                            coreData.shareId = ShareId.new_();
                        }
                        if (coreData.stateEmotion == null) {
                            coreData.stateEmotion = new ArrayList();
                        }
                        if (coreData.seePortraitCounter == null) {
                            coreData.seePortraitCounter = SeePortraitCounter.new_();
                        }
                        if (coreData.recommended == null) {
                            coreData.recommended = new ArrayList();
                        }
                        if (coreData.chatHeats == null) {
                            coreData.chatHeats = new ArrayList();
                        }
                        if (coreData.chatHeatPermissions == null) {
                            coreData.chatHeatPermissions = new ArrayList();
                        }
                        if (coreData.resources == null) {
                            coreData.resources = new ArrayList();
                        }
                        if (coreData.greetingResult == null) {
                            coreData.greetingResult = GreetingResult.new_();
                        }
                        if (coreData.latestMoments == null) {
                            coreData.latestMoments = new ArrayList();
                        }
                        if (coreData.jmpTarget == null) {
                            coreData.jmpTarget = JmpTarget.new_();
                        }
                        if (coreData.buzzUsers == null) {
                            coreData.buzzUsers = new ArrayList();
                        }
                        if (coreData.odiamondList == null) {
                            coreData.odiamondList = ODiamondListItem.new_();
                        }
                        if (coreData.popGuide == null) {
                            coreData.popGuide = PopGuide.new_();
                        }
                        if (coreData.floats == null) {
                            coreData.floats = new ArrayList();
                        }
                        if (coreData.monetizationMsg == null) {
                            coreData.monetizationMsg = MonetizationMsg.new_();
                        }
                        if (coreData.tab == null) {
                            coreData.tab = GrowthMomentThemeCardInfo.new_();
                        }
                        if (coreData.seeExposedUser == null) {
                            coreData.seeExposedUser = SeeExposedUser.new_();
                        }
                        if (coreData.exposureInfo == null) {
                            coreData.exposureInfo = GrowthExposureInfo.new_();
                        }
                        if (coreData.love520 == null) {
                            coreData.love520 = new ArrayList();
                        }
                        if (coreData.payWill == null) {
                            coreData.payWill = "";
                        }
                        if (coreData.extremePickByList == null) {
                            coreData.extremePickByList = new ArrayList();
                        }
                        if (coreData.chatGameInfo == null) {
                            coreData.chatGameInfo = ChatGameInfo.new_();
                        }
                        if (coreData.camping == null) {
                            coreData.camping = new ArrayList();
                        }
                        if (coreData.recallMatch == null) {
                            coreData.recallMatch = RecallMatch.new_();
                        }
                        if (coreData.mkt_activity_regular == null) {
                            coreData.mkt_activity_regular = new ArrayList();
                        }
                        if (coreData.intlVisitorInfo == null) {
                            coreData.intlVisitorInfo = new ArrayList();
                        }
                        if (coreData.invalidCardList == null) {
                            coreData.invalidCardList = new ArrayList();
                        }
                        if (coreData.chatAssistantQuestions == null) {
                            coreData.chatAssistantQuestions = new ArrayList();
                        }
                        if (coreData.mkt_activity_quiz == null) {
                            coreData.mkt_activity_quiz = new ArrayList();
                        }
                        if (coreData.extremeQuestions == null) {
                            coreData.extremeQuestions = ExtremeQuestions.new_();
                        }
                        if (coreData.boostResultEntry == null) {
                            coreData.boostResultEntry = BoostResultEntry.new_();
                        }
                        if (coreData.todayMatchInfo == null) {
                            coreData.todayMatchInfo = MatchInfo.new_();
                        }
                        if (coreData.growthMesInfo == null) {
                            coreData.growthMesInfo = GrowthMesInfo.new_();
                        }
                        if (coreData.aiPictureAuth == null) {
                            coreData.aiPictureAuth = AiPictureAuth.new_();
                        }
                        if (coreData.campaignPage == null) {
                            coreData.campaignPage = QuickChatPartyCampaignPage.new_();
                        }
                        if (coreData.partner == null) {
                            coreData.partner = GrowthPartner.new_();
                        }
                        if (coreData.cityCData == null) {
                            coreData.cityCData = new ArrayList();
                        }
                        if (coreData.cityCBanner == null) {
                            coreData.cityCBanner = CityCBanner.new_();
                        }
                        if (coreData.chatPartners == null) {
                            coreData.chatPartners = ChatPartners.new_();
                        }
                        if (coreData.chatPartnersSignals == null) {
                            coreData.chatPartnersSignals = new ArrayList();
                        }
                        if (coreData.lowPhotoResult == null) {
                            coreData.lowPhotoResult = PhotoLowModelData.new_();
                        }
                        if (coreData.mkt_activity_flash == null) {
                            coreData.mkt_activity_flash = new ArrayList();
                        }
                        if (coreData.auditPictureTags == null) {
                            coreData.auditPictureTags = new ArrayList();
                        }
                        if (coreData.tagPictureStrategy == null) {
                            coreData.tagPictureStrategy = TagStrategy.new_();
                        }
                        if (coreData.pictureTags == null) {
                            coreData.pictureTags = new ArrayList();
                        }
                        if (coreData.barLoverPlaces == null) {
                            coreData.barLoverPlaces = new ArrayList();
                        }
                        if (coreData.barLoverCities == null) {
                            coreData.barLoverCities = new ArrayList();
                        }
                        if (coreData.fateRadar == null) {
                            coreData.fateRadar = FateRadar.new_();
                        }
                        if (coreData.explore == null) {
                            coreData.explore = Explore.new_();
                        }
                        if (coreData.repeatPictureResult == null) {
                            coreData.repeatPictureResult = PhotoLowModelData.new_();
                        }
                        if (coreData.netPictureResult == null) {
                            coreData.netPictureResult = PhotoLowModelData.new_();
                        }
                        if (coreData.userFeedbackInfo == null) {
                            coreData.userFeedbackInfo = UserFeedbackInfo.new_();
                        }
                        if (coreData.urlTags == null) {
                            coreData.urlTags = new ArrayList();
                        }
                        if (coreData.chatPage == null) {
                            coreData.chatPage = ChatPage.new_();
                        }
                        if (coreData.showOnlineForWhoIMeet == null) {
                            coreData.showOnlineForWhoIMeet = new ArrayList();
                        }
                        if (coreData.notVerificationResultData == null) {
                            coreData.notVerificationResultData = PhotoLowModelData.new_();
                        }
                        if (coreData.verificationLowLabels == null) {
                            coreData.verificationLowLabels = new ArrayList();
                        }
                        if (coreData.seeTrialEligible == null) {
                            coreData.seeTrialEligible = SeeTrialEligible.new_();
                        }
                        if (coreData.seeTrialStatus == null) {
                            coreData.seeTrialStatus = SeeTrialStatus.new_();
                        }
                        if (coreData.aiChatAdvice == null) {
                            coreData.aiChatAdvice = AIChatAdvice.new_();
                        }
                        if (coreData.aiChatAnalysis == null) {
                            coreData.aiChatAnalysis = AIChatAnalysis.new_();
                        }
                        if (coreData.diamond == null) {
                            coreData.diamond = IntlCurrencyDiamond.new_();
                        }
                        if (coreData.dislikedUsers == null) {
                            coreData.dislikedUsers = new ArrayList();
                            return coreData;
                        }
                        break;
                }
            }
            return coreData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreData coreData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Relationship> list = coreData.relationships;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Conversation> list2 = coreData.conversations;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Message> list3 = coreData.messages;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, Message.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Contact> list4 = coreData.contacts;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(4, list4, Contact.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Question> list5 = coreData.questions;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(5, list5, Question.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Sticker> list6 = coreData.stickers;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(6, list6, Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<StickerPackage> list7 = coreData.packages;
            if (list7 != null) {
                codedOutputByteBufferNano.m17254K(7, list7, StickerPackage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<StickerBundle> list8 = coreData.bundles;
            if (list8 != null) {
                codedOutputByteBufferNano.m17254K(8, list8, StickerBundle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Link> list9 = coreData.links;
            if (list9 != null) {
                codedOutputByteBufferNano.m17254K(9, list9, Link.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<School> list10 = coreData.schools;
            if (list10 != null) {
                codedOutputByteBufferNano.m17254K(10, list10, School.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Reminder> list11 = coreData.reminders;
            if (list11 != null) {
                codedOutputByteBufferNano.m17254K(11, list11, Reminder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VerificationCenter> list12 = coreData.verificationCenter;
            if (list12 != null) {
                codedOutputByteBufferNano.m17254K(12, list12, VerificationCenter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Wallet wallet = coreData.wallet;
            if (wallet != null) {
                codedOutputByteBufferNano.m17254K(13, wallet, Wallet.PROTOBUF_ADAPTER);
            }
            List<PrivateQuestion> list13 = coreData.privateQuestions;
            if (list13 != null) {
                codedOutputByteBufferNano.m17254K(14, list13, PrivateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Coin coin = coreData.coins;
            if (coin != null) {
                codedOutputByteBufferNano.m17254K(15, coin, Coin.PROTOBUF_ADAPTER);
            }
            List<UserPrivilege> list14 = coreData.summarizedPrivileges;
            if (list14 != null) {
                codedOutputByteBufferNano.m17254K(16, list14, UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FaceidToken> list15 = coreData.faceidTokens;
            if (list15 != null) {
                codedOutputByteBufferNano.m17254K(17, list15, FaceidToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Merchandise> list16 = coreData.merchandises;
            if (list16 != null) {
                codedOutputByteBufferNano.m17254K(18, list16, Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivacyMembershipSetting> list17 = coreData.privacySettings;
            if (list17 != null) {
                codedOutputByteBufferNano.m17254K(19, list17, PrivacyMembershipSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Figure> list18 = coreData.figures;
            if (list18 != null) {
                codedOutputByteBufferNano.m17254K(20, list18, Figure.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PaymentOrder> list19 = coreData.orders;
            if (list19 != null) {
                codedOutputByteBufferNano.m17254K(21, list19, PaymentOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BoostStatus> list20 = coreData.boostStatus;
            if (list20 != null) {
                codedOutputByteBufferNano.m17254K(22, list20, BoostStatus.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SummarizedPrivilegePrice> list21 = coreData.summarizedPrivilegePrices;
            if (list21 != null) {
                codedOutputByteBufferNano.m17254K(23, list21, SummarizedPrivilegePrice.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AdvancedSettings> list22 = coreData.advancedSettings;
            if (list22 != null) {
                codedOutputByteBufferNano.m17254K(24, list22, AdvancedSettings.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Surveys> list23 = coreData.surveys;
            if (list23 != null) {
                codedOutputByteBufferNano.m17254K(25, list23, Surveys.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AppealInfo> list24 = coreData.appealInfos;
            if (list24 != null) {
                codedOutputByteBufferNano.m17254K(26, list24, AppealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AutoDeducts> list25 = coreData.autoDeducts;
            if (list25 != null) {
                codedOutputByteBufferNano.m17254K(27, list25, AutoDeducts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceCall> list26 = coreData.voiceCall;
            if (list26 != null) {
                codedOutputByteBufferNano.m17254K(28, list26, VoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Complain> list27 = coreData.complain;
            if (list27 != null) {
                codedOutputByteBufferNano.m17254K(29, list27, Complain.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserLiveLabel> list28 = coreData.liveLabels;
            if (list28 != null) {
                codedOutputByteBufferNano.m17254K(30, list28, UserLiveLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LikedUser> list29 = coreData.likedUsers;
            if (list29 != null) {
                codedOutputByteBufferNano.m17254K(31, list29, LikedUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RefundDetail> list30 = coreData.refundDetails;
            if (list30 != null) {
                codedOutputByteBufferNano.m17254K(32, list30, RefundDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<WalletAccount> list31 = coreData.walletAccounts;
            if (list31 != null) {
                codedOutputByteBufferNano.m17254K(33, list31, WalletAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AccountRecord> list32 = coreData.accountRecords;
            if (list32 != null) {
                codedOutputByteBufferNano.m17254K(34, list32, AccountRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MonetizationConfiguration monetizationConfiguration = coreData.monetizationConfiguration;
            if (monetizationConfiguration != null) {
                codedOutputByteBufferNano.m17254K(35, monetizationConfiguration, MonetizationConfiguration.PROTOBUF_ADAPTER);
            }
            Contract contract = coreData.contract;
            if (contract != null) {
                codedOutputByteBufferNano.m17254K(36, contract, Contract.PROTOBUF_ADAPTER);
            }
            List<VerificationToken> list33 = coreData.verificationTokens;
            if (list33 != null) {
                codedOutputByteBufferNano.m17254K(37, list33, VerificationToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<HeartBeat> list34 = coreData.heartbeats;
            if (list34 != null) {
                codedOutputByteBufferNano.m17254K(38, list34, HeartBeat.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ContractInfo> list35 = coreData.contractInfos;
            if (list35 != null) {
                codedOutputByteBufferNano.m17254K(39, list35, ContractInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatGroup> list36 = coreData.chatGroups;
            if (list36 != null) {
                codedOutputByteBufferNano.m17254K(40, list36, ChatGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatGroupMember> list37 = coreData.chatGroupMembers;
            if (list37 != null) {
                codedOutputByteBufferNano.m17254K(41, list37, ChatGroupMember.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupApply> list38 = coreData.groupApplies;
            if (list38 != null) {
                codedOutputByteBufferNano.m17254K(42, list38, GroupApply.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<NotificationCounter> list39 = coreData.notificationCounters;
            if (list39 != null) {
                codedOutputByteBufferNano.m17254K(43, list39, NotificationCounter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupNotification> list40 = coreData.groupNotifications;
            if (list40 != null) {
                codedOutputByteBufferNano.m17254K(44, list40, GroupNotification.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupAttribute> list41 = coreData.groupAttributes;
            if (list41 != null) {
                codedOutputByteBufferNano.m17254K(45, list41, GroupAttribute.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatGroup> list42 = coreData.interestedGroups;
            if (list42 != null) {
                codedOutputByteBufferNano.m17254K(46, list42, ChatGroup.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupTab> list43 = coreData.groupTabs;
            if (list43 != null) {
                codedOutputByteBufferNano.m17254K(47, list43, GroupTab.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list44 = coreData.keywords;
            if (list44 != null) {
                codedOutputByteBufferNano.m17254K(48, list44, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<GroupSetting> list45 = coreData.groupSettings;
            if (list45 != null) {
                codedOutputByteBufferNano.m17254K(49, list45, GroupSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SettingGroups> list46 = coreData.settingGroups;
            if (list46 != null) {
                codedOutputByteBufferNano.m17254K(50, list46, SettingGroups.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Live> list47 = coreData.lives;
            if (list47 != null) {
                codedOutputByteBufferNano.m17254K(51, list47, Live.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccount> list48 = coreData.officialAccounts;
            if (list48 != null) {
                codedOutputByteBufferNano.m17254K(52, list48, OfficialAccount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccountsMenu> list49 = coreData.menus;
            if (list49 != null) {
                codedOutputByteBufferNano.m17254K(53, list49, OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TickleSettingInfo> list50 = coreData.tickles;
            if (list50 != null) {
                codedOutputByteBufferNano.m17254K(54, list50, TickleSettingInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MonetizationPromotion> list51 = coreData.monetizationPromotions;
            if (list51 != null) {
                codedOutputByteBufferNano.m17254K(55, list51, MonetizationPromotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Coupon> list52 = coreData.coupons;
            if (list52 != null) {
                codedOutputByteBufferNano.m17254K(56, list52, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatProfile> list53 = coreData.chatProfiles;
            if (list53 != null) {
                codedOutputByteBufferNano.m17254K(57, list53, ChatProfile.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IceBreakingQuestion> list54 = coreData.systemQuestions;
            if (list54 != null) {
                codedOutputByteBufferNano.m17254K(58, list54, IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PriorityLike priorityLike = coreData.priorityLike;
            if (priorityLike != null) {
                codedOutputByteBufferNano.m17254K(59, priorityLike, PriorityLike.PROTOBUF_ADAPTER);
            }
            Couponbag couponbag = coreData.couponBag;
            if (couponbag != null) {
                codedOutputByteBufferNano.m17254K(60, couponbag, Couponbag.PROTOBUF_ADAPTER);
            }
            List<UserSticker> list55 = coreData.userStickers;
            if (list55 != null) {
                codedOutputByteBufferNano.m17254K(61, list55, UserSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RedPacket> list56 = coreData.redPackets;
            if (list56 != null) {
                codedOutputByteBufferNano.m17254K(62, list56, RedPacket.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CoreGiftInfo> list57 = coreData.giftInfos;
            if (list57 != null) {
                codedOutputByteBufferNano.m17254K(63, list57, CoreGiftInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CounterVerification counterVerification = coreData.counterVerification;
            if (counterVerification != null) {
                codedOutputByteBufferNano.m17254K(64, counterVerification, CounterVerification.PROTOBUF_ADAPTER);
            }
            List<LiveSchema> list58 = coreData.liveSchemas;
            if (list58 != null) {
                codedOutputByteBufferNano.m17254K(65, list58, LiveSchema.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendInfo> list59 = coreData.friends;
            if (list59 != null) {
                codedOutputByteBufferNano.m17254K(66, list59, FriendInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17246C(67, coreData.nextTime);
            ConversationDiff conversationDiff = coreData.conversationDiff;
            if (conversationDiff != null) {
                codedOutputByteBufferNano.m17254K(68, conversationDiff, ConversationDiff.PROTOBUF_ADAPTER);
            }
            List<ComStatusAward> list60 = coreData.comStatusAwards;
            if (list60 != null) {
                codedOutputByteBufferNano.m17254K(69, list60, ComStatusAward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardStyle> list61 = coreData.cardStyles;
            if (list61 != null) {
                codedOutputByteBufferNano.m17254K(70, list61, CardStyle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<AudioText> list62 = coreData.audioTexts;
            if (list62 != null) {
                codedOutputByteBufferNano.m17254K(71, list62, AudioText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CoreGiftGuide coreGiftGuide = coreData.giftGuide;
            if (coreGiftGuide != null) {
                codedOutputByteBufferNano.m17254K(72, coreGiftGuide, CoreGiftGuide.PROTOBUF_ADAPTER);
            }
            List<CoreGiftPanel> list63 = coreData.giftPanel;
            if (list63 != null) {
                codedOutputByteBufferNano.m17254K(73, list63, CoreGiftPanel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GiftWallSocial> list64 = coreData.giftWallSocials;
            if (list64 != null) {
                codedOutputByteBufferNano.m17254K(74, list64, GiftWallSocial.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GiftWallRankInfo> list65 = coreData.giftWallRankInfos;
            if (list65 != null) {
                codedOutputByteBufferNano.m17254K(75, list65, GiftWallRankInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GiftWallTitle> list66 = coreData.giftWallTitles;
            if (list66 != null) {
                codedOutputByteBufferNano.m17254K(76, list66, GiftWallTitle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<NewGiftWall> list67 = coreData.newGiftWalls;
            if (list67 != null) {
                codedOutputByteBufferNano.m17254K(77, list67, NewGiftWall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Greeting> list68 = coreData.greetings;
            if (list68 != null) {
                codedOutputByteBufferNano.m17254K(78, list68, Greeting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingCounter greetingCounter = coreData.greetingCounter;
            if (greetingCounter != null) {
                codedOutputByteBufferNano.m17254K(79, greetingCounter, GreetingCounter.PROTOBUF_ADAPTER);
            }
            List<GreetingPermission> list69 = coreData.greetingPermissions;
            if (list69 != null) {
                codedOutputByteBufferNano.m17254K(80, list69, GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingSummary greetingSummary = coreData.greetingSummary;
            if (greetingSummary != null) {
                codedOutputByteBufferNano.m17254K(81, greetingSummary, GreetingSummary.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(82, coreData.hint);
            List<CardExtraInfo> list70 = coreData.cardExtraInfos;
            if (list70 != null) {
                codedOutputByteBufferNano.m17254K(83, list70, CardExtraInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ReadMessage> list71 = coreData.readMessages;
            if (list71 != null) {
                codedOutputByteBufferNano.m17254K(84, list71, ReadMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RecentConversation> list72 = coreData.recentConversations;
            if (list72 != null) {
                codedOutputByteBufferNano.m17254K(85, list72, RecentConversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OrderInfo> list73 = coreData.orderInfos;
            if (list73 != null) {
                codedOutputByteBufferNano.m17254K(86, list73, OrderInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuickChatCardInfo quickChatCardInfo = coreData.quickchatCard;
            if (quickChatCardInfo != null) {
                codedOutputByteBufferNano.m17254K(87, quickChatCardInfo, QuickChatCardInfo.PROTOBUF_ADAPTER);
            }
            List<PicksUser> list74 = coreData.picksUsers;
            if (list74 != null) {
                codedOutputByteBufferNano.m17254K(88, list74, PicksUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Picks picks = coreData.picks;
            if (picks != null) {
                codedOutputByteBufferNano.m17254K(89, picks, Picks.PROTOBUF_ADAPTER);
            }
            List<CountdownItem> list75 = coreData.countdownLikes;
            if (list75 != null) {
                codedOutputByteBufferNano.m17254K(90, list75, CountdownItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingSetting greetingSetting = coreData.greetingSetting;
            if (greetingSetting != null) {
                codedOutputByteBufferNano.m17254K(91, greetingSetting, GreetingSetting.PROTOBUF_ADAPTER);
            }
            OnlineLiveChatPair onlineLiveChatPair = coreData.onlineLiveChatPair;
            if (onlineLiveChatPair != null) {
                codedOutputByteBufferNano.m17254K(92, onlineLiveChatPair, OnlineLiveChatPair.PROTOBUF_ADAPTER);
            }
            List<CardStyle> list76 = coreData.likedMes;
            if (list76 != null) {
                codedOutputByteBufferNano.m17254K(93, list76, CardStyle.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MyMeetExtra myMeetExtra = coreData.myMeet;
            if (myMeetExtra != null) {
                codedOutputByteBufferNano.m17254K(94, myMeetExtra, MyMeetExtra.PROTOBUF_ADAPTER);
            }
            List<CoreMomentInfo> list77 = coreData.moments;
            if (list77 != null) {
                codedOutputByteBufferNano.m17254K(95, list77, CoreMomentInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            VoiceChatInfo voiceChatInfo = coreData.voicechat;
            if (voiceChatInfo != null) {
                codedOutputByteBufferNano.m17254K(96, voiceChatInfo, VoiceChatInfo.PROTOBUF_ADAPTER);
            }
            QuickChatBellData quickChatBellData = coreData.bell;
            if (quickChatBellData != null) {
                codedOutputByteBufferNano.m17254K(97, quickChatBellData, QuickChatBellData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(98, coreData.isHit);
            User user = coreData.user;
            if (user != null) {
                codedOutputByteBufferNano.m17254K(99, user, User.PROTOBUF_ADAPTER);
            }
            List<LiteraturesComments> list78 = coreData.literaturesComments;
            if (list78 != null) {
                codedOutputByteBufferNano.m17254K(100, list78, LiteraturesComments.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Literatures> list79 = coreData.literatures;
            if (list79 != null) {
                codedOutputByteBufferNano.m17254K(101, list79, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MembershipRecommendUser> list80 = coreData.membershipRecommendUsers;
            if (list80 != null) {
                codedOutputByteBufferNano.m17254K(102, list80, MembershipRecommendUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FreeTrialInfo freeTrialInfo = coreData.freeTrialInfo;
            if (freeTrialInfo != null) {
                codedOutputByteBufferNano.m17254K(103, freeTrialInfo, FreeTrialInfo.PROTOBUF_ADAPTER);
            }
            FreeTrialOperateResult freeTrialOperateResult = coreData.freeTrialOperateResult;
            if (freeTrialOperateResult != null) {
                codedOutputByteBufferNano.m17254K(104, freeTrialOperateResult, FreeTrialOperateResult.PROTOBUF_ADAPTER);
            }
            Note note = coreData.speedUpCard;
            if (note != null) {
                codedOutputByteBufferNano.m17254K(105, note, Note.PROTOBUF_ADAPTER);
            }
            List<BubbleInfo> list81 = coreData.states;
            if (list81 != null) {
                codedOutputByteBufferNano.m17254K(106, list81, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ThirdPartyInfo thirdPartyInfo = coreData.thirdPartyInfo;
            if (thirdPartyInfo != null) {
                codedOutputByteBufferNano.m17254K(107, thirdPartyInfo, ThirdPartyInfo.PROTOBUF_ADAPTER);
            }
            List<Evaluation> list82 = coreData.evaluations;
            if (list82 != null) {
                codedOutputByteBufferNano.m17254K(108, list82, Evaluation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<EvaluationReport> list83 = coreData.evaluationReports;
            if (list83 != null) {
                codedOutputByteBufferNano.m17254K(109, list83, EvaluationReport.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageFeedbackStatus messageFeedbackStatus = coreData.msgData;
            if (messageFeedbackStatus != null) {
                codedOutputByteBufferNano.m17254K(110, messageFeedbackStatus, MessageFeedbackStatus.PROTOBUF_ADAPTER);
            }
            Evaluation evaluation = coreData.evaluation;
            if (evaluation != null) {
                codedOutputByteBufferNano.m17254K(111, evaluation, Evaluation.PROTOBUF_ADAPTER);
            }
            List<PrivilegeGift> list84 = coreData.privilegeGifts;
            if (list84 != null) {
                codedOutputByteBufferNano.m17254K(112, list84, PrivilegeGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RecommendMessage> list85 = coreData.recommendMessages;
            if (list85 != null) {
                codedOutputByteBufferNano.m17254K(113, list85, RecommendMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserGreetInfo> list86 = coreData.greets;
            if (list86 != null) {
                codedOutputByteBufferNano.m17254K(114, list86, UserGreetInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardModel> list87 = coreData.cardModels;
            if (list87 != null) {
                codedOutputByteBufferNano.m17254K(115, list87, CardModel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            HeartBeatMatched heartBeatMatched = coreData.heartbeatMatch;
            if (heartBeatMatched != null) {
                codedOutputByteBufferNano.m17254K(116, heartBeatMatched, HeartBeatMatched.PROTOBUF_ADAPTER);
            }
            QuickChatOneside quickChatOneside = coreData.oneside;
            if (quickChatOneside != null) {
                codedOutputByteBufferNano.m17254K(117, quickChatOneside, QuickChatOneside.PROTOBUF_ADAPTER);
            }
            MyMeetListV3 myMeetListV3 = coreData.myMeetListV3;
            if (myMeetListV3 != null) {
                codedOutputByteBufferNano.m17254K(118, myMeetListV3, MyMeetListV3.PROTOBUF_ADAPTER);
            }
            MyMeetEntryV3 myMeetEntryV3 = coreData.myMeetEntryV3;
            if (myMeetEntryV3 != null) {
                codedOutputByteBufferNano.m17254K(119, myMeetEntryV3, MyMeetEntryV3.PROTOBUF_ADAPTER);
            }
            List<InsertCard> list88 = coreData.intlInsertCardSets;
            if (list88 != null) {
                codedOutputByteBufferNano.m17254K(120, list88, InsertCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Active> list89 = coreData.actives;
            if (list89 != null) {
                codedOutputByteBufferNano.m17254K(121, list89, Active.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardsIcons> list90 = coreData.cardsIcons;
            if (list90 != null) {
                codedOutputByteBufferNano.m17254K(122, list90, CardsIcons.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            TacitTestProfileCard tacitTestProfileCard = coreData.tacitTest;
            if (tacitTestProfileCard != null) {
                codedOutputByteBufferNano.m17254K(123, tacitTestProfileCard, TacitTestProfileCard.PROTOBUF_ADAPTER);
            }
            List<BreakIce> list91 = coreData.iceBreakings;
            if (list91 != null) {
                codedOutputByteBufferNano.m17254K(124, list91, BreakIce.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingHotLevelInfo greetingHotLevelInfo = coreData.greetingHotLevelInfo;
            if (greetingHotLevelInfo != null) {
                codedOutputByteBufferNano.m17254K(125, greetingHotLevelInfo, GreetingHotLevelInfo.PROTOBUF_ADAPTER);
            }
            List<Voice> list92 = coreData.voices;
            if (list92 != null) {
                codedOutputByteBufferNano.m17254K(126, list92, Voice.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = coreData.avatar;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(127, str);
            }
            List<SpecialSuggestUsers> list93 = coreData.suggestUsers;
            if (list93 != null) {
                codedOutputByteBufferNano.m17254K(128, list93, SpecialSuggestUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ActionData actionData = coreData.action;
            if (actionData != null) {
                codedOutputByteBufferNano.m17254K(MMConstants.ERR_WATERMARK_READ, actionData, ActionData.PROTOBUF_ADAPTER);
            }
            TagStrategy tagStrategy = coreData.tagLoadStrategy;
            if (tagStrategy != null) {
                codedOutputByteBufferNano.m17254K(130, tagStrategy, TagStrategy.PROTOBUF_ADAPTER);
            }
            List<NewTags> list94 = coreData.tags;
            if (list94 != null) {
                codedOutputByteBufferNano.m17254K(131, list94, NewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            TagStrategy tagStrategy2 = coreData.tagCategoryStrategy;
            if (tagStrategy2 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, tagStrategy2, TagStrategy.PROTOBUF_ADAPTER);
            }
            List<TagCategories> list95 = coreData.tagCategories;
            if (list95 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, list95, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TagUserCounts> list96 = coreData.tagUserCounts;
            if (list96 != null) {
                codedOutputByteBufferNano.m17254K(134, list96, TagUserCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SamesCardData> list97 = coreData.sames;
            if (list97 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, list97, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiteratureConfigInfo literatureConfigInfo = coreData.literatureConfigInfo;
            if (literatureConfigInfo != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, literatureConfigInfo, LiteratureConfigInfo.PROTOBUF_ADAPTER);
            }
            GreetingSummary greetingSummary2 = coreData.anonymousSummary;
            if (greetingSummary2 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, greetingSummary2, GreetingSummary.PROTOBUF_ADAPTER);
            }
            List<CardInfos> list98 = coreData.cardInfos;
            if (list98 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_PSK_WITH_RC4_128_SHA, list98, CardInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SeeInfos> list99 = coreData.seeInfos;
            if (list99 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, list99, SeeInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SeePortrait> list100 = coreData.seePortraits;
            if (list100 != null) {
                codedOutputByteBufferNano.m17254K(140, list100, SeePortrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ExtraPrivileges extraPrivileges = coreData.extraPrivileges;
            if (extraPrivileges != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, extraPrivileges, ExtraPrivileges.PROTOBUF_ADAPTER);
            }
            ProfileSelectedQue profileSelectedQue = coreData.selectedQuestion;
            if (profileSelectedQue != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, profileSelectedQue, ProfileSelectedQue.PROTOBUF_ADAPTER);
            }
            List<LikeUser> list101 = coreData.likeUsers;
            if (list101 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, list101, LikeUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(144, coreData.next);
            CipherId cipherId = coreData.cipherId;
            if (cipherId != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, cipherId, CipherId.PROTOBUF_ADAPTER);
            }
            ShareId shareId = coreData.shareId;
            if (shareId != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, shareId, ShareId.PROTOBUF_ADAPTER);
            }
            List<StateEmotion> list102 = coreData.stateEmotion;
            if (list102 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, list102, StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SeePortraitCounter seePortraitCounter = coreData.seePortraitCounter;
            if (seePortraitCounter != null) {
                codedOutputByteBufferNano.m17254K(148, seePortraitCounter, SeePortraitCounter.PROTOBUF_ADAPTER);
            }
            List<Recommended> list103 = coreData.recommended;
            if (list103 != null) {
                codedOutputByteBufferNano.m17254K(149, list103, Recommended.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatHeat> list104 = coreData.chatHeats;
            if (list104 != null) {
                codedOutputByteBufferNano.m17254K(150, list104, ChatHeat.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PermissionsItem> list105 = coreData.chatHeatPermissions;
            if (list105 != null) {
                codedOutputByteBufferNano.m17254K(151, list105, PermissionsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ResourceTriggers> list106 = coreData.resources;
            if (list106 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, list106, ResourceTriggers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GreetingResult greetingResult = coreData.greetingResult;
            if (greetingResult != null) {
                codedOutputByteBufferNano.m17254K(153, greetingResult, GreetingResult.PROTOBUF_ADAPTER);
            }
            List<ConversationLatestMoment> list107 = coreData.latestMoments;
            if (list107 != null) {
                codedOutputByteBufferNano.m17254K(154, list107, ConversationLatestMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            JmpTarget jmpTarget = coreData.jmpTarget;
            if (jmpTarget != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, jmpTarget, JmpTarget.PROTOBUF_ADAPTER);
            }
            List<BuzzUser> list108 = coreData.buzzUsers;
            if (list108 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, list108, BuzzUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ODiamondListItem oDiamondListItem = coreData.odiamondList;
            if (oDiamondListItem != null) {
                codedOutputByteBufferNano.m17254K(157, oDiamondListItem, ODiamondListItem.PROTOBUF_ADAPTER);
            }
            PopGuide popGuide = coreData.popGuide;
            if (popGuide != null) {
                codedOutputByteBufferNano.m17254K(158, popGuide, PopGuide.PROTOBUF_ADAPTER);
            }
            List<SuperLikeCount> list109 = coreData.superLikeCount;
            if (list109 != null) {
                codedOutputByteBufferNano.m17254K(159, list109, SuperLikeCount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FloatsCardData> list110 = coreData.floats;
            if (list110 != null) {
                codedOutputByteBufferNano.m17254K(160, list110, FloatsCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MonetizationMsg monetizationMsg = coreData.monetizationMsg;
            if (monetizationMsg != null) {
                codedOutputByteBufferNano.m17254K(161, monetizationMsg, MonetizationMsg.PROTOBUF_ADAPTER);
            }
            String str2 = coreData.link;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(162, str2);
            }
            GrowthMomentThemeCardInfo growthMomentThemeCardInfo = coreData.tab;
            if (growthMomentThemeCardInfo != null) {
                codedOutputByteBufferNano.m17254K(163, growthMomentThemeCardInfo, GrowthMomentThemeCardInfo.PROTOBUF_ADAPTER);
            }
            SeeExposedUser seeExposedUser = coreData.seeExposedUser;
            if (seeExposedUser != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, seeExposedUser, SeeExposedUser.PROTOBUF_ADAPTER);
            }
            GrowthExposureInfo growthExposureInfo = coreData.exposureInfo;
            if (growthExposureInfo != null) {
                codedOutputByteBufferNano.m17254K(165, growthExposureInfo, GrowthExposureInfo.PROTOBUF_ADAPTER);
            }
            List<SamesCardData> list111 = coreData.love520;
            if (list111 != null) {
                codedOutputByteBufferNano.m17254K(166, list111, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = coreData.payWill;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(167, str3);
            }
            List<ExtremePickItem> list112 = coreData.extremePickByList;
            if (list112 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, list112, ExtremePickItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChatGameInfo chatGameInfo = coreData.chatGameInfo;
            if (chatGameInfo != null) {
                codedOutputByteBufferNano.m17254K(169, chatGameInfo, ChatGameInfo.PROTOBUF_ADAPTER);
            }
            List<SamesCardData> list113 = coreData.camping;
            if (list113 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, list113, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RecallMatch recallMatch = coreData.recallMatch;
            if (recallMatch != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, recallMatch, RecallMatch.PROTOBUF_ADAPTER);
            }
            List<BCoreLiveActivity> list114 = coreData.liveActivities;
            if (list114 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, list114, BCoreLiveActivity.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SamesCardData> list115 = coreData.mkt_activity_regular;
            if (list115 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, list115, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MonetizationChatSeeUser monetizationChatSeeUser = coreData.monetizationChatSeeUser;
            if (monetizationChatSeeUser != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, monetizationChatSeeUser, MonetizationChatSeeUser.PROTOBUF_ADAPTER);
            }
            List<IntlVisitor> list116 = coreData.intlVisitorInfo;
            if (list116 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, list116, IntlVisitor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(176, coreData.count);
            List<String> list117 = coreData.invalidCardList;
            if (list117 != null) {
                codedOutputByteBufferNano.m17254K(177, list117, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatAssistantQuestion> list118 = coreData.chatAssistantQuestions;
            if (list118 != null) {
                codedOutputByteBufferNano.m17254K(178, list118, ChatAssistantQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SamesCardData> list119 = coreData.mkt_activity_quiz;
            if (list119 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, list119, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(180, coreData.isRecallUser);
            ExtremeQuestions extremeQuestions = coreData.extremeQuestions;
            if (extremeQuestions != null) {
                codedOutputByteBufferNano.m17254K(181, extremeQuestions, ExtremeQuestions.PROTOBUF_ADAPTER);
            }
            List<UserIdType> list120 = coreData.greetingNewPeople;
            if (list120 != null) {
                codedOutputByteBufferNano.m17254K(182, list120, UserIdType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<GreetingNewPeopleMessage> list121 = coreData.greetingNewPeopleMessage;
            if (list121 != null) {
                codedOutputByteBufferNano.m17254K(183, list121, GreetingNewPeopleMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            BoostResultEntry boostResultEntry = coreData.boostResultEntry;
            if (boostResultEntry != null) {
                codedOutputByteBufferNano.m17254K(184, boostResultEntry, BoostResultEntry.PROTOBUF_ADAPTER);
            }
            MatchInfo matchInfo = coreData.todayMatchInfo;
            if (matchInfo != null) {
                codedOutputByteBufferNano.m17254K(185, matchInfo, MatchInfo.PROTOBUF_ADAPTER);
            }
            AiPictureAuth aiPictureAuth = coreData.aiPictureAuth;
            if (aiPictureAuth != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, aiPictureAuth, AiPictureAuth.PROTOBUF_ADAPTER);
            }
            GrowthMesInfo growthMesInfo = coreData.growthMesInfo;
            if (growthMesInfo != null) {
                codedOutputByteBufferNano.m17254K(187, growthMesInfo, GrowthMesInfo.PROTOBUF_ADAPTER);
            }
            AcceleratePairingStatus acceleratePairingStatus = coreData.acceleratePairing;
            if (acceleratePairingStatus != null) {
                codedOutputByteBufferNano.m17254K(188, acceleratePairingStatus, AcceleratePairingStatus.PROTOBUF_ADAPTER);
            }
            QuickChatPartyInvitation quickChatPartyInvitation = coreData.invitation;
            if (quickChatPartyInvitation != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, quickChatPartyInvitation, QuickChatPartyInvitation.PROTOBUF_ADAPTER);
            }
            QuickChatPartyCampaignPage quickChatPartyCampaignPage = coreData.campaignPage;
            if (quickChatPartyCampaignPage != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, quickChatPartyCampaignPage, QuickChatPartyCampaignPage.PROTOBUF_ADAPTER);
            }
            GrowthPartner growthPartner = coreData.partner;
            if (growthPartner != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, growthPartner, GrowthPartner.PROTOBUF_ADAPTER);
            }
            List<CityCData> list122 = coreData.cityCData;
            if (list122 != null) {
                codedOutputByteBufferNano.m17254K(192, list122, CityCData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GrowthBlindBox growthBlindBox = coreData.blindbox;
            if (growthBlindBox != null) {
                codedOutputByteBufferNano.m17254K(193, growthBlindBox, GrowthBlindBox.PROTOBUF_ADAPTER);
            }
            List<String> list123 = coreData.unReadUserIds;
            if (list123 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, list123, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            CityCBanner cityCBanner = coreData.cityCBanner;
            if (cityCBanner != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, cityCBanner, CityCBanner.PROTOBUF_ADAPTER);
            }
            ChatPartners chatPartners = coreData.chatPartners;
            if (chatPartners != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, chatPartners, ChatPartners.PROTOBUF_ADAPTER);
            }
            List<ChatPartnersHistoryItem> list124 = coreData.chatPartnersSignals;
            if (list124 != null) {
                codedOutputByteBufferNano.m17254K(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, list124, ChatPartnersHistoryItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SurpriseGift surpriseGift = coreData.surpriseGift;
            if (surpriseGift != null) {
                codedOutputByteBufferNano.m17254K(Opcodes.IFNULL, surpriseGift, SurpriseGift.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17252I(Opcodes.IFNONNULL, coreData.surpriseGiftExpirationTime);
            List<CardCornerMark> list125 = coreData.cardCornerMarks;
            if (list125 != null) {
                codedOutputByteBufferNano.m17254K(200, list125, CardCornerMark.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PhotoLowModelData photoLowModelData = coreData.lowPhotoResult;
            if (photoLowModelData != null) {
                codedOutputByteBufferNano.m17254K(201, photoLowModelData, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            List<SamesCardData> list126 = coreData.mkt_activity_flash;
            if (list126 != null) {
                codedOutputByteBufferNano.m17254K(202, list126, SamesCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CityCConfig cityCConfig = coreData.cityCConfig;
            if (cityCConfig != null) {
                codedOutputByteBufferNano.m17254K(203, cityCConfig, CityCConfig.PROTOBUF_ADAPTER);
            }
            PrivateCustomSetting privateCustomSetting = coreData.privateCustomSetting;
            if (privateCustomSetting != null) {
                codedOutputByteBufferNano.m17254K(204, privateCustomSetting, PrivateCustomSetting.PROTOBUF_ADAPTER);
            }
            PrivateCustomResult privateCustomResult = coreData.privateCustomResults;
            if (privateCustomResult != null) {
                codedOutputByteBufferNano.m17254K(205, privateCustomResult, PrivateCustomResult.PROTOBUF_ADAPTER);
            }
            VisitorSetting visitorSetting = coreData.visitorSetting;
            if (visitorSetting != null) {
                codedOutputByteBufferNano.m17254K(206, visitorSetting, VisitorSetting.PROTOBUF_ADAPTER);
            }
            List<VisitorHidden> list127 = coreData.visitorHiddens;
            if (list127 != null) {
                codedOutputByteBufferNano.m17254K(207, list127, VisitorHidden.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MarriageGuide marriageGuide = coreData.marriageGuide;
            if (marriageGuide != null) {
                codedOutputByteBufferNano.m17254K(208, marriageGuide, MarriageGuide.PROTOBUF_ADAPTER);
            }
            List<SelectionUser> list128 = coreData.selectionUsers;
            if (list128 != null) {
                codedOutputByteBufferNano.m17254K(209, list128, SelectionUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SelectionUserInfo selectionUserInfo = coreData.selectionUserInfo;
            if (selectionUserInfo != null) {
                codedOutputByteBufferNano.m17254K(210, selectionUserInfo, SelectionUserInfo.PROTOBUF_ADAPTER);
            }
            List<UserAudits> list129 = coreData.userAudits;
            if (list129 != null) {
                codedOutputByteBufferNano.m17254K(Primes.SMALL_FACTOR_LIMIT, list129, UserAudits.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DynamicLable> list130 = coreData.dynamicLabels;
            if (list130 != null) {
                codedOutputByteBufferNano.m17254K(212, list130, DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectText> list131 = coreData.details;
            if (list131 != null) {
                codedOutputByteBufferNano.m17254K(213, list131, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ColdStartLayer coldStartLayer = coreData.layer;
            if (coldStartLayer != null) {
                codedOutputByteBufferNano.m17254K(214, coldStartLayer, ColdStartLayer.PROTOBUF_ADAPTER);
            }
            List<AuditPictureTag> list132 = coreData.auditPictureTags;
            if (list132 != null) {
                codedOutputByteBufferNano.m17254K(215, list132, AuditPictureTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            DatingGuideData datingGuideData = coreData.myTabGuide;
            if (datingGuideData != null) {
                codedOutputByteBufferNano.m17254K(216, datingGuideData, DatingGuideData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(217, coreData.profileGuide);
            TagStrategy tagStrategy3 = coreData.tagPictureStrategy;
            if (tagStrategy3 != null) {
                codedOutputByteBufferNano.m17254K(218, tagStrategy3, TagStrategy.PROTOBUF_ADAPTER);
            }
            List<NewTags> list133 = coreData.pictureTags;
            if (list133 != null) {
                codedOutputByteBufferNano.m17254K(219, list133, NewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = coreData.fakeSuggest;
            if (fakeQuickChatSuggestStatus != null) {
                codedOutputByteBufferNano.m17254K(220, fakeQuickChatSuggestStatus, FakeQuickChatSuggestStatus.PROTOBUF_ADAPTER);
            }
            RiskOtherData riskOtherData = coreData.userRisk;
            if (riskOtherData != null) {
                codedOutputByteBufferNano.m17254K(221, riskOtherData, RiskOtherData.PROTOBUF_ADAPTER);
            }
            RiskOtherData riskOtherData2 = coreData.descriptionRisk;
            if (riskOtherData2 != null) {
                codedOutputByteBufferNano.m17254K(222, riskOtherData2, RiskOtherData.PROTOBUF_ADAPTER);
            }
            List<RiskSelfData> list134 = coreData.risks;
            if (list134 != null) {
                codedOutputByteBufferNano.m17254K(223, list134, RiskSelfData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BarLoverplaces> list135 = coreData.barLoverPlaces;
            if (list135 != null) {
                codedOutputByteBufferNano.m17254K(224, list135, BarLoverplaces.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BarLoverCitys> list136 = coreData.barLoverCities;
            if (list136 != null) {
                codedOutputByteBufferNano.m17254K(225, list136, BarLoverCitys.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FateRadar fateRadar = coreData.fateRadar;
            if (fateRadar != null) {
                codedOutputByteBufferNano.m17254K(226, fateRadar, FateRadar.PROTOBUF_ADAPTER);
            }
            ExpandedProfileLikeCounter expandedProfileLikeCounter = coreData.profileLikeCounter;
            if (expandedProfileLikeCounter != null) {
                codedOutputByteBufferNano.m17254K(227, expandedProfileLikeCounter, ExpandedProfileLikeCounter.PROTOBUF_ADAPTER);
            }
            List<ProfileLikeComment> list137 = coreData.profileLikesComments;
            if (list137 != null) {
                codedOutputByteBufferNano.m17254K(228, list137, ProfileLikeComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            WechatNotifySetting wechatNotifySetting = coreData.wechat;
            if (wechatNotifySetting != null) {
                codedOutputByteBufferNano.m17254K(229, wechatNotifySetting, WechatNotifySetting.PROTOBUF_ADAPTER);
            }
            SvipWeeklyReport svipWeeklyReport = coreData.svipWeeklyReport;
            if (svipWeeklyReport != null) {
                codedOutputByteBufferNano.m17254K(230, svipWeeklyReport, SvipWeeklyReport.PROTOBUF_ADAPTER);
            }
            Explore explore = coreData.explore;
            if (explore != null) {
                codedOutputByteBufferNano.m17254K(231, explore, Explore.PROTOBUF_ADAPTER);
            }
            VipSetting vipSetting = coreData.vipSettings;
            if (vipSetting != null) {
                codedOutputByteBufferNano.m17254K(232, vipSetting, VipSetting.PROTOBUF_ADAPTER);
            }
            List<IceBreakQuestion> list138 = coreData.iceBreakQuestions;
            if (list138 != null) {
                codedOutputByteBufferNano.m17254K(233, list138, IceBreakQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FakeGuideData fakeGuideData = coreData.fakeGuideData;
            if (fakeGuideData != null) {
                codedOutputByteBufferNano.m17254K(234, fakeGuideData, FakeGuideData.PROTOBUF_ADAPTER);
            }
            List<UserActivityInfo> list139 = coreData.userActivityInfos;
            if (list139 != null) {
                codedOutputByteBufferNano.m17254K(235, list139, UserActivityInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Questionnaire questionnaire = coreData.questionnaire;
            if (questionnaire != null) {
                codedOutputByteBufferNano.m17254K(236, questionnaire, Questionnaire.PROTOBUF_ADAPTER);
            }
            QuestionnaireFeature questionnaireFeature = coreData.features;
            if (questionnaireFeature != null) {
                codedOutputByteBufferNano.m17254K(237, questionnaireFeature, QuestionnaireFeature.PROTOBUF_ADAPTER);
            }
            UserStrategyConfiguration userStrategyConfiguration = coreData.userStrategyConfiguration;
            if (userStrategyConfiguration != null) {
                codedOutputByteBufferNano.m17254K(238, userStrategyConfiguration, UserStrategyConfiguration.PROTOBUF_ADAPTER);
            }
            List<FakePhotoFeedback> list140 = coreData.fakePhotoFeedback;
            if (list140 != null) {
                codedOutputByteBufferNano.m17254K(239, list140, FakePhotoFeedback.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PhotoLowModelData photoLowModelData2 = coreData.repeatPictureResult;
            if (photoLowModelData2 != null) {
                codedOutputByteBufferNano.m17254K(240, photoLowModelData2, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData3 = coreData.netPictureResult;
            if (photoLowModelData3 != null) {
                codedOutputByteBufferNano.m17254K(241, photoLowModelData3, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            UserFeedbackInfo userFeedbackInfo = coreData.userFeedbackInfo;
            if (userFeedbackInfo != null) {
                codedOutputByteBufferNano.m17254K(242, userFeedbackInfo, UserFeedbackInfo.PROTOBUF_ADAPTER);
            }
            List<IdealTag> list141 = coreData.idealDetails;
            if (list141 != null) {
                codedOutputByteBufferNano.m17254K(243, list141, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IdealInfo idealInfo = coreData.idealInfo;
            if (idealInfo != null) {
                codedOutputByteBufferNano.m17254K(IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, idealInfo, IdealInfo.PROTOBUF_ADAPTER);
            }
            List<IdealInfo> list142 = coreData.idealInfos;
            if (list142 != null) {
                codedOutputByteBufferNano.m17254K(245, list142, IdealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UrlTag> list143 = coreData.urlTags;
            if (list143 != null) {
                codedOutputByteBufferNano.m17254K(246, list143, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileCountInfo> list144 = coreData.profileCounts;
            if (list144 != null) {
                codedOutputByteBufferNano.m17254K(247, list144, ProfileCountInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PrivateCustomResult privateCustomResult2 = coreData.privateCustomResult;
            if (privateCustomResult2 != null) {
                codedOutputByteBufferNano.m17254K(248, privateCustomResult2, PrivateCustomResult.PROTOBUF_ADAPTER);
            }
            VideoChatSecondFloorSummary videoChatSecondFloorSummary = coreData.videoChatSecondFloorSummary;
            if (videoChatSecondFloorSummary != null) {
                codedOutputByteBufferNano.m17254K(249, videoChatSecondFloorSummary, VideoChatSecondFloorSummary.PROTOBUF_ADAPTER);
            }
            RealPicturesBanner realPicturesBanner = coreData.realPicturesBanner;
            if (realPicturesBanner != null) {
                codedOutputByteBufferNano.m17254K(250, realPicturesBanner, RealPicturesBanner.PROTOBUF_ADAPTER);
            }
            RealPicturesInfo realPicturesInfo = coreData.realPicturesInfo;
            if (realPicturesInfo != null) {
                codedOutputByteBufferNano.m17254K(251, realPicturesInfo, RealPicturesInfo.PROTOBUF_ADAPTER);
            }
            List<IPRegion> list145 = coreData.ipRegion;
            if (list145 != null) {
                codedOutputByteBufferNano.m17254K(252, list145, IPRegion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RealFeelInfo realFeelInfo = coreData.realFeelInfo;
            if (realFeelInfo != null) {
                codedOutputByteBufferNano.m17254K(253, realFeelInfo, RealFeelInfo.PROTOBUF_ADAPTER);
            }
            LoveLetterEntryInfo loveLetterEntryInfo = coreData.loveLetter;
            if (loveLetterEntryInfo != null) {
                codedOutputByteBufferNano.m17254K(254, loveLetterEntryInfo, LoveLetterEntryInfo.PROTOBUF_ADAPTER);
            }
            LoveLetterGroupInfo loveLetterGroupInfo = coreData.loveLetterGroup;
            if (loveLetterGroupInfo != null) {
                codedOutputByteBufferNano.m17254K(255, loveLetterGroupInfo, LoveLetterGroupInfo.PROTOBUF_ADAPTER);
            }
            LoveLetterContent loveLetterContent = coreData.loveLetterContent;
            if (loveLetterContent != null) {
                codedOutputByteBufferNano.m17254K(256, loveLetterContent, LoveLetterContent.PROTOBUF_ADAPTER);
            }
            ChatPage chatPage = coreData.chatPage;
            if (chatPage != null) {
                codedOutputByteBufferNano.m17254K(257, chatPage, ChatPage.PROTOBUF_ADAPTER);
            }
            List<ShowOnlineForWhoIMeet> list146 = coreData.showOnlineForWhoIMeet;
            if (list146 != null) {
                codedOutputByteBufferNano.m17254K(258, list146, ShowOnlineForWhoIMeet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PendingPaymentGuidance pendingPaymentGuidance = coreData.pendingPaymentGuidance;
            if (pendingPaymentGuidance != null) {
                codedOutputByteBufferNano.m17254K(259, pendingPaymentGuidance, PendingPaymentGuidance.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData4 = coreData.notVerificationResultData;
            if (photoLowModelData4 != null) {
                codedOutputByteBufferNano.m17254K(260, photoLowModelData4, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            List<String> list147 = coreData.verificationLowLabels;
            if (list147 != null) {
                codedOutputByteBufferNano.m17254K(261, list147, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<MyTabTask> list148 = coreData.myTabTasks;
            if (list148 != null) {
                codedOutputByteBufferNano.m17254K(262, list148, MyTabTask.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SeeTrialEligible seeTrialEligible = coreData.seeTrialEligible;
            if (seeTrialEligible != null) {
                codedOutputByteBufferNano.m17254K(263, seeTrialEligible, SeeTrialEligible.PROTOBUF_ADAPTER);
            }
            SeeTrialStatus seeTrialStatus = coreData.seeTrialStatus;
            if (seeTrialStatus != null) {
                codedOutputByteBufferNano.m17254K(264, seeTrialStatus, SeeTrialStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(265, coreData.likedByToday);
            List<FeedbackQuestion> list149 = coreData.feedbackQuestions;
            if (list149 != null) {
                codedOutputByteBufferNano.m17254K(266, list149, FeedbackQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(267, coreData.feedbackRemainedNum);
            ConversationInstantChat conversationInstantChat = coreData.instantChat;
            if (conversationInstantChat != null) {
                codedOutputByteBufferNano.m17254K(268, conversationInstantChat, ConversationInstantChat.PROTOBUF_ADAPTER);
            }
            AIChatAdvice aIChatAdvice = coreData.aiChatAdvice;
            if (aIChatAdvice != null) {
                codedOutputByteBufferNano.m17254K(269, aIChatAdvice, AIChatAdvice.PROTOBUF_ADAPTER);
            }
            AIChatAnalysis aIChatAnalysis = coreData.aiChatAnalysis;
            if (aIChatAnalysis != null) {
                codedOutputByteBufferNano.m17254K(270, aIChatAnalysis, AIChatAnalysis.PROTOBUF_ADAPTER);
            }
            InvitationInfo invitationInfo = coreData.invitationInfo;
            if (invitationInfo != null) {
                codedOutputByteBufferNano.m17254K(271, invitationInfo, InvitationInfo.PROTOBUF_ADAPTER);
            }
            PictureVerifyRightedInfo pictureVerifyRightedInfo = coreData.pictureVerifyRightedInfo;
            if (pictureVerifyRightedInfo != null) {
                codedOutputByteBufferNano.m17254K(272, pictureVerifyRightedInfo, PictureVerifyRightedInfo.PROTOBUF_ADAPTER);
            }
            IntlCurrencyDiamond intlCurrencyDiamond = coreData.diamond;
            if (intlCurrencyDiamond != null) {
                codedOutputByteBufferNano.m17254K(273, intlCurrencyDiamond, IntlCurrencyDiamond.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(274, coreData.canChange);
            codedOutputByteBufferNano.m17250G(275, coreData.ttcToDiamondRate);
            List<Prologue> list150 = coreData.prologues;
            if (list150 != null) {
                codedOutputByteBufferNano.m17254K(276, list150, Prologue.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<InstantMatchGiveCountInfo> list151 = coreData.instantMatchGiveCountInfo;
            if (list151 != null) {
                codedOutputByteBufferNano.m17254K(277, list151, InstantMatchGiveCountInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CreditScoreData> list152 = coreData.creditScores;
            if (list152 != null) {
                codedOutputByteBufferNano.m17254K(278, list152, CreditScoreData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DislikedUsers> list153 = coreData.dislikedUsers;
            if (list153 != null) {
                codedOutputByteBufferNano.m17254K(279, list153, DislikedUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AnalysisGuide analysisGuide = coreData.analysisGuide;
            if (analysisGuide != null) {
                codedOutputByteBufferNano.m17254K(280, analysisGuide, AnalysisGuide.PROTOBUF_ADAPTER);
            }
            VisitorDoorInfo visitorDoorInfo = coreData.visitorDoorInfo;
            if (visitorDoorInfo != null) {
                codedOutputByteBufferNano.m17254K(281, visitorDoorInfo, VisitorDoorInfo.PROTOBUF_ADAPTER);
            }
            List<VisitorInfo> list154 = coreData.visitorInfo;
            if (list154 != null) {
                codedOutputByteBufferNano.m17254K(282, list154, VisitorInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<InstantMatchUserInfo> list155 = coreData.instantMatchUserInfo;
            if (list155 != null) {
                codedOutputByteBufferNano.m17254K(283, list155, InstantMatchUserInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TribeSubset> list156 = coreData.recommendList;
            if (list156 != null) {
                codedOutputByteBufferNano.m17254K(284, list156, TribeSubset.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            IntlTribeBubble intlTribeBubble = coreData.intlBubble;
            if (intlTribeBubble != null) {
                codedOutputByteBufferNano.m17254K(285, intlTribeBubble, IntlTribeBubble.PROTOBUF_ADAPTER);
            }
            MembershipUpgradeInfo membershipUpgradeInfo = coreData.membershipUpgradeInfo;
            if (membershipUpgradeInfo != null) {
                codedOutputByteBufferNano.m17254K(286, membershipUpgradeInfo, MembershipUpgradeInfo.PROTOBUF_ADAPTER);
            }
            PurchaseSavePop purchaseSavePop = coreData.purchaseSavePop;
            if (purchaseSavePop != null) {
                codedOutputByteBufferNano.m17254K(287, purchaseSavePop, PurchaseSavePop.PROTOBUF_ADAPTER);
            }
            List<SwipeUpperLimit> list157 = coreData.swipeUpperLimit;
            if (list157 != null) {
                codedOutputByteBufferNano.m17254K(288, list157, SwipeUpperLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(289, coreData.payWillInfo);
            codedOutputByteBufferNano.m17250G(290, coreData.visitorAllCount);
            codedOutputByteBufferNano.m17246C(291, coreData.payWillScore);
            codedOutputByteBufferNano.m17246C(292, coreData.payWillScoreThreshold);
            codedOutputByteBufferNano.m17246C(293, coreData.scoreThresholdOther);
            List<InstantMatchUserInfo> list158 = coreData.picksInfo;
            if (list158 != null) {
                codedOutputByteBufferNano.m17254K(294, list158, InstantMatchUserInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SuperlikeByCount> list159 = coreData.superlikeByCounts;
            if (list159 != null) {
                codedOutputByteBufferNano.m17254K(295, list159, SuperlikeByCount.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UltraRightsUpgradeInfo ultraRightsUpgradeInfo = coreData.ultraRightsUpgradeInfo;
            if (ultraRightsUpgradeInfo != null) {
                codedOutputByteBufferNano.m17254K(296, ultraRightsUpgradeInfo, UltraRightsUpgradeInfo.PROTOBUF_ADAPTER);
            }
            List<ComplimentText> list160 = coreData.complimentTexts;
            if (list160 != null) {
                codedOutputByteBufferNano.m17254K(297, list160, ComplimentText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ComplimentFromOther complimentFromOther = coreData.compliment;
            if (complimentFromOther != null) {
                codedOutputByteBufferNano.m17254K(298, complimentFromOther, ComplimentFromOther.PROTOBUF_ADAPTER);
            }
            List<SuggestedComplimentItem> list161 = coreData.compliments;
            if (list161 != null) {
                codedOutputByteBufferNano.m17254K(299, list161, SuggestedComplimentItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IapAffiliatePromotion> list162 = coreData.iapAffiliatePromotions;
            if (list162 != null) {
                codedOutputByteBufferNano.m17254K(300, list162, IapAffiliatePromotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CoreData> JSON_ADAPTER = new ObjectJsonAdapter<CoreData>() { // from class: com.p1.mobile.putong.core.data.CoreData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreData newInstance() {
            return new CoreData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CoreData coreData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2144674781:
                    if (str.equals("chatPartners")) {
                        b = 0;
                    }
                    break;
                case -2135931940:
                    if (str.equals("selectionUsers")) {
                        b = 1;
                    }
                    break;
                case -2120258817:
                    if (str.equals("walletAccounts")) {
                        b = 2;
                    }
                    break;
                case -2087299879:
                    if (str.equals("instantChat")) {
                        b = 3;
                    }
                    break;
                case -2070782702:
                    if (str.equals("privilegeGifts")) {
                        b = 4;
                    }
                    break;
                case -2005174452:
                    if (str.equals("chatGroups")) {
                        b = 5;
                    }
                    break;
                case -1998195199:
                    if (str.equals("extremeQuestions")) {
                        b = 6;
                    }
                    break;
                case -1991798675:
                    if (str.equals("purchaseDialogConf")) {
                        b = 7;
                    }
                    break;
                case -1983070683:
                    if (str.equals("resources")) {
                        b = 8;
                    }
                    break;
                case -1967425295:
                    if (str.equals("fakeGuideData")) {
                        b = 9;
                    }
                    break;
                case -1938314965:
                    if (str.equals("acceleratePairing")) {
                        b = 10;
                    }
                    break;
                case -1909143294:
                    if (str.equals("readMessages")) {
                        b = 11;
                    }
                    break;
                case -1888029730:
                    if (str.equals("systemQuestions")) {
                        b = 12;
                    }
                    break;
                case -1852750759:
                    if (str.equals(Surveys.TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1846421436:
                    if (str.equals("settingGroups")) {
                        b = 14;
                    }
                    break;
                case -1837461230:
                    if (str.equals("chatGroupMembers")) {
                        b = 15;
                    }
                    break;
                case -1805720505:
                    if (str.equals("ultraRightsUpgradeInfo")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1792656437:
                    if (str.equals("privacySettings")) {
                        b = 17;
                    }
                    break;
                case -1782234803:
                    if (str.equals(Questions.TYPE)) {
                        b = 18;
                    }
                    break;
                case -1736501353:
                    if (str.equals("tagPictureStrategy")) {
                        b = 19;
                    }
                    break;
                case -1689030265:
                    if (str.equals("chatAssistantQuestions")) {
                        b = 20;
                    }
                    break;
                case -1687259573:
                    if (str.equals("tagCategoryStrategy")) {
                        b = 21;
                    }
                    break;
                case -1686290760:
                    if (str.equals("seeExposedUser")) {
                        b = 22;
                    }
                    break;
                case -1649247659:
                    if (str.equals("exposureInfo")) {
                        b = 23;
                    }
                    break;
                case -1626803586:
                    if (str.equals("aiPictureAuth")) {
                        b = 24;
                    }
                    break;
                case -1613248471:
                    if (str.equals("tagUserCounts")) {
                        b = 25;
                    }
                    break;
                case -1609076539:
                    if (str.equals("selectionUserInfo")) {
                        b = 26;
                    }
                    break;
                case -1598162376:
                    if (str.equals("loveLetter")) {
                        b = 27;
                    }
                    break;
                case -1551198074:
                    if (str.equals("cipherId")) {
                        b = 28;
                    }
                    break;
                case -1529222039:
                    if (str.equals("comStatusAwards")) {
                        b = 29;
                    }
                    break;
                case -1519868851:
                    if (str.equals("profileCounts")) {
                        b = 30;
                    }
                    break;
                case -1519129791:
                    if (str.equals("literatureConfigInfo")) {
                        b = 31;
                    }
                    break;
                case -1511756925:
                    if (str.equals("greetingCounter")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case -1497380959:
                    if (str.equals("selectedQuestion")) {
                        b = 33;
                    }
                    break;
                case -1482996067:
                    if (str.equals("groupTabs")) {
                        b = 34;
                    }
                    break;
                case -1451499894:
                    if (str.equals("stateEmotion")) {
                        b = 35;
                    }
                    break;
                case -1446270634:
                    if (str.equals("tagCategories")) {
                        b = 36;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 37;
                    }
                    break;
                case -1419586496:
                    if (str.equals("picksInfo")) {
                        b = 38;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 39;
                    }
                    break;
                case -1322971299:
                    if (str.equals("tickles")) {
                        b = 40;
                    }
                    break;
                case -1321472373:
                    if (str.equals("greetingPermissions")) {
                        b = 41;
                    }
                    break;
                case -1320294211:
                    if (str.equals(ConversationAdditionalTagType.oneside)) {
                        b = 42;
                    }
                    break;
                case -1309148525:
                    if (str.equals(Explore.TYPE)) {
                        b = 43;
                    }
                    break;
                case -1272739758:
                    if (str.equals(SchemeKey.marriageGuide)) {
                        b = 44;
                    }
                    break;
                case -1272621513:
                    if (str.equals("pictureTags")) {
                        b = 45;
                    }
                    break;
                case -1271649897:
                    if (str.equals("floats")) {
                        b = 46;
                    }
                    break;
                case -1263530366:
                    if (str.equals("privateCustomResults")) {
                        b = 47;
                    }
                    break;
                case -1253119451:
                    if (str.equals("userMomentSetting")) {
                        b = 48;
                    }
                    break;
                case -1237773686:
                    if (str.equals("greets")) {
                        b = 49;
                    }
                    break;
                case -1205060170:
                    if (str.equals("ttcToDiamondRate")) {
                        b = 50;
                    }
                    break;
                case -1173065869:
                    if (str.equals("tacitTest")) {
                        b = 51;
                    }
                    break;
                case -1170781062:
                    if (str.equals("creditScores")) {
                        b = 52;
                    }
                    break;
                case -1161797075:
                    if (str.equals("actives")) {
                        b = 53;
                    }
                    break;
                case -1146723551:
                    if (str.equals("loveLetterContent")) {
                        b = 54;
                    }
                    break;
                case -1143959316:
                    if (str.equals("latestMoments")) {
                        b = 55;
                    }
                    break;
                case -1142663923:
                    if (str.equals("groupApplies")) {
                        b = 56;
                    }
                    break;
                case -1142196358:
                    if (str.equals("recommendList")) {
                        b = 57;
                    }
                    break;
                case -1133503486:
                    if (str.equals("cityCData")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case -1127781538:
                    if (str.equals("greetingHotLevelInfo")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case -1113567082:
                    if (str.equals("barLoverCities")) {
                        b = 60;
                    }
                    break;
                case -1093295290:
                    if (str.equals("isRecallUser")) {
                        b = 61;
                    }
                    break;
                case -1084800831:
                    if (str.equals("cardCornerMarks")) {
                        b = 62;
                    }
                    break;
                case -1060249581:
                    if (str.equals(SchemeKey.myMeet)) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case -1046277962:
                    if (str.equals("picksUsers")) {
                        b = 64;
                    }
                    break;
                case -1041298103:
                    if (str.equals("intlBubble")) {
                        b = 65;
                    }
                    break;
                case -1022310868:
                    if (str.equals("giftWallSocials")) {
                        b = 66;
                    }
                    break;
                case -1018590326:
                    if (str.equals("voicechat")) {
                        b = 67;
                    }
                    break;
                case -1017049693:
                    if (str.equals(Questionnaire.TYPE)) {
                        b = 68;
                    }
                    break;
                case -1008770331:
                    if (str.equals("orders")) {
                        b = 69;
                    }
                    break;
                case -985556152:
                    if (str.equals("feedbackQuestions")) {
                        b = 70;
                    }
                    break;
                case -976673220:
                    if (str.equals("visitorInfo")) {
                        b = 71;
                    }
                    break;
                case -923775928:
                    if (str.equals("instantMatchGiveCountInfo")) {
                        b = 72;
                    }
                    break;
                case -917519747:
                    if (str.equals("superLikeCount")) {
                        b = 73;
                    }
                    break;
                case -901938948:
                    if (str.equals("profileLikeCounter")) {
                        b = 74;
                    }
                    break;
                case -892482046:
                    if (str.equals("states")) {
                        b = 75;
                    }
                    break;
                case -881315773:
                    if (str.equals("odiamondList")) {
                        b = 76;
                    }
                    break;
                case -880003473:
                    if (str.equals("fakeSuggest")) {
                        b = 77;
                    }
                    break;
                case -859123185:
                    if (str.equals("figures")) {
                        b = 78;
                    }
                    break;
                case -854750854:
                    if (str.equals("seeTrialEligible")) {
                        b = 79;
                    }
                    break;
                case -828217588:
                    if (str.equals("prologues")) {
                        b = 80;
                    }
                    break;
                case -826404266:
                    if (str.equals("blindbox")) {
                        b = 81;
                    }
                    break;
                case -818215019:
                    if (str.equals("verificationTokens")) {
                        b = 82;
                    }
                    break;
                case -810990207:
                    if (str.equals("voices")) {
                        b = 83;
                    }
                    break;
                case -810612299:
                    if (str.equals("recentConversations")) {
                        b = 84;
                    }
                    break;
                case -808191176:
                    if (str.equals("chatGameInfo")) {
                        b = 85;
                    }
                    break;
                case -807721022:
                    if (str.equals("groupSettings")) {
                        b = 86;
                    }
                    break;
                case -804553603:
                    if (str.equals("interestedGroups")) {
                        b = 87;
                    }
                    break;
                case -795192327:
                    if (str.equals("wallet")) {
                        b = 88;
                    }
                    break;
                case -792929080:
                    if (str.equals("partner")) {
                        b = 89;
                    }
                    break;
                case -791770330:
                    if (str.equals("wechat")) {
                        b = 90;
                    }
                    break;
                case -787332966:
                    if (str.equals("payWill")) {
                        b = 91;
                    }
                    break;
                case -774616455:
                    if (str.equals("iceBreakQuestions")) {
                        b = 92;
                    }
                    break;
                case -747042311:
                    if (str.equals("scoreThreshold")) {
                        b = 93;
                    }
                    break;
                case -739189351:
                    if (str.equals("barLoverPlaces")) {
                        b = 94;
                    }
                    break;
                case -724152003:
                    if (str.equals("monetizationChatSeeUser")) {
                        b = 95;
                    }
                    break;
                case -702519687:
                    if (str.equals("anonymousSummary")) {
                        b = 96;
                    }
                    break;
                case -677109505:
                    if (str.equals("svipWeeklyReport")) {
                        b = 97;
                    }
                    break;
                case -662135205:
                    if (str.equals("likedUsers")) {
                        b = 98;
                    }
                    break;
                case -625604459:
                    if (str.equals("notVerificationResultData")) {
                        b = 99;
                    }
                    break;
                case -616042536:
                    if (str.equals("freeTrialInfo")) {
                        b = 100;
                    }
                    break;
                case -600094315:
                    if (str.equals("friends")) {
                        b = 101;
                    }
                    break;
                case -599449367:
                    if (str.equals(Complain.TYPE)) {
                        b = 102;
                    }
                    break;
                case -598448714:
                    if (str.equals("greetingResult")) {
                        b = 103;
                    }
                    break;
                case -592540335:
                    if (str.equals("onlineLiveChatPair")) {
                        b = 104;
                    }
                    break;
                case -567451565:
                    if (str.equals("contacts")) {
                        b = 105;
                    }
                    break;
                case -566947566:
                    if (str.equals("contract")) {
                        b = 106;
                    }
                    break;
                case -537721814:
                    if (str.equals("compliment")) {
                        b = 107;
                    }
                    break;
                case -532870253:
                    if (str.equals("contractInfos")) {
                        b = 108;
                    }
                    break;
                case -529428944:
                    if (str.equals("idealInfos")) {
                        b = 109;
                    }
                    break;
                case -521855262:
                    if (str.equals("extremePickByList")) {
                        b = 110;
                    }
                    break;
                case -503998794:
                    if (str.equals("feedbackRemainedNum")) {
                        b = 111;
                    }
                    break;
                case -483646505:
                    if (str.equals("greetingSetting")) {
                        b = 112;
                    }
                    break;
                case -477795673:
                    if (str.equals("profileLikesComments")) {
                        b = 113;
                    }
                    break;
                case -468253133:
                    if (str.equals("myTabGuide")) {
                        b = 114;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 115;
                    }
                    break;
                case -456833339:
                    if (str.equals("myTabTasks")) {
                        b = 116;
                    }
                    break;
                case -437099616:
                    if (str.equals("canChange")) {
                        b = 117;
                    }
                    break;
                case -426072135:
                    if (str.equals("surpriseGift")) {
                        b = 118;
                    }
                    break;
                case -389076133:
                    if (str.equals("priorityLike")) {
                        b = 119;
                    }
                    break;
                case -375136036:
                    if (str.equals("privateCustomSetting")) {
                        b = 120;
                    }
                    break;
                case -360878853:
                    if (str.equals("lowPhotoResult")) {
                        b = 121;
                    }
                    break;
                case -348015716:
                    if (str.equals("mkt_activity_quiz")) {
                        b = 122;
                    }
                    break;
                case -330263242:
                    if (str.equals("appealInfos")) {
                        b = 123;
                    }
                    break;
                case -294173021:
                    if (str.equals("idealInfo")) {
                        b = 124;
                    }
                    break;
                case -290659267:
                    if (str.equals("features")) {
                        b = 125;
                    }
                    break;
                case -270021892:
                    if (str.equals("myMeetEntryV3")) {
                        b = 126;
                    }
                    break;
                case -266539718:
                    if (str.equals("userRisk")) {
                        b = 127;
                    }
                    break;
                case -265539499:
                    if (str.equals("cardInfos")) {
                        b = 128;
                    }
                    break;
                case -261427016:
                    if (str.equals(SummarizedPrivilegesId.aiChatAdvice)) {
                        b = 129;
                    }
                    break;
                case -251102587:
                    if (str.equals("cardExtraInfos")) {
                        b = 130;
                    }
                    break;
                case -242766163:
                    if (str.equals("advancedSearchSettings")) {
                        b = 131;
                    }
                    break;
                case -183498563:
                    if (str.equals("likedByToday")) {
                        b = 132;
                    }
                    break;
                case -172878671:
                    if (str.equals("likeUsers")) {
                        b = 133;
                    }
                    break;
                case -170189272:
                    if (str.equals("urlTags")) {
                        b = 134;
                    }
                    break;
                case -159974872:
                    if (str.equals("recommendMessages")) {
                        b = 135;
                    }
                    break;
                case -154097087:
                    if (str.equals("realPicturesInfo")) {
                        b = 136;
                    }
                    break;
                case -114924760:
                    if (str.equals("conversationDiff")) {
                        b = 137;
                    }
                    break;
                case -58638108:
                    if (str.equals("suggestUsers")) {
                        b = 138;
                    }
                    break;
                case -40973470:
                    if (str.equals("chatProfiles")) {
                        b = 139;
                    }
                    break;
                case -32260819:
                    if (str.equals("greetingSummary")) {
                        b = 140;
                    }
                    break;
                case -9757131:
                    if (str.equals("surpriseGiftExpirationTime")) {
                        b = 141;
                    }
                    break;
                case -9718472:
                    if (str.equals("userStrategyConfiguration")) {
                        b = 142;
                    }
                    break;
                case 104120:
                    if (str.equals("ids")) {
                        b = 143;
                    }
                    break;
                case 114581:
                    if (str.equals("tab")) {
                        b = 144;
                    }
                    break;
                case 3020035:
                    if (str.equals("bell")) {
                        b = 145;
                    }
                    break;
                case 3046160:
                    if (str.equals("card")) {
                        b = 146;
                    }
                    break;
                case 3202695:
                    if (str.equals(TrackReferenceTypeBox.TYPE1)) {
                        b = 147;
                    }
                    break;
                case 3321850:
                    if (str.equals(Link.TYPE)) {
                        b = 148;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        b = 149;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 150;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        b = 151;
                    }
                    break;
                case 14142561:
                    if (str.equals("videoChatSecondFloorSummary")) {
                        b = 152;
                    }
                    break;
                case 32901351:
                    if (str.equals("pendingPaymentGuidance")) {
                        b = 153;
                    }
                    break;
                case 67961651:
                    if (str.equals("tagLoadStrategy")) {
                        b = 154;
                    }
                    break;
                case 94425557:
                    if (str.equals("calls")) {
                        b = 155;
                    }
                    break;
                case 94839810:
                    if (str.equals("coins")) {
                        b = 156;
                    }
                    break;
                case 94851343:
                    if (str.equals("count")) {
                        b = 157;
                    }
                    break;
                case 100468233:
                    if (str.equals("isHit")) {
                        b = 158;
                    }
                    break;
                case 102749521:
                    if (str.equals("layer")) {
                        b = 159;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 160;
                    }
                    break;
                case 102977465:
                    if (str.equals("links")) {
                        b = 161;
                    }
                    break;
                case 102984967:
                    if (str.equals("lives")) {
                        b = 162;
                    }
                    break;
                case 103782132:
                    if (str.equals("menus")) {
                        b = 163;
                    }
                    break;
                case 106660978:
                    if (str.equals("picks")) {
                        b = 164;
                    }
                    break;
                case 108523396:
                    if (str.equals("risks")) {
                        b = 165;
                    }
                    break;
                case 109202637:
                    if (str.equals("sames")) {
                        b = 166;
                    }
                    break;
                case 109264530:
                    if (str.equals(FirebaseAnalytics.Param.SCORE)) {
                        b = 167;
                    }
                    break;
                case 123245329:
                    if (str.equals("greetingNewPeopleMessage")) {
                        b = 168;
                    }
                    break;
                case 152453985:
                    if (str.equals("autoDeducts")) {
                        b = 169;
                    }
                    break;
                case 172478399:
                    if (str.equals("campaignPage")) {
                        b = 170;
                    }
                    break;
                case 181893984:
                    if (str.equals("vipSettings")) {
                        b = 171;
                    }
                    break;
                case 235331633:
                    if (str.equals("bundles")) {
                        b = 172;
                    }
                    break;
                case 240142697:
                    if (str.equals("dislikedUsers")) {
                        b = 173;
                    }
                    break;
                case 247959322:
                    if (str.equals("redPackets")) {
                        b = 174;
                    }
                    break;
                case 267698684:
                    if (str.equals("chatHeatPermissions")) {
                        b = 175;
                    }
                    break;
                case 284901662:
                    if (str.equals("dynamicLabels")) {
                        b = 176;
                    }
                    break;
                case 289193994:
                    if (str.equals("visitorDoorInfo")) {
                        b = 177;
                    }
                    break;
                case 303925282:
                    if (str.equals("membershipRecommendUsers")) {
                        b = 178;
                    }
                    break;
                case 356022401:
                    if (str.equals("love520")) {
                        b = 179;
                    }
                    break;
                case 393745272:
                    if (str.equals("monetizationMsg")) {
                        b = 180;
                    }
                    break;
                case 402964234:
                    if (str.equals("privateQuestions")) {
                        b = 181;
                    }
                    break;
                case 418622970:
                    if (str.equals("fateRadar")) {
                        b = 182;
                    }
                    break;
                case 443719665:
                    if (str.equals("officialAccounts")) {
                        b = 183;
                    }
                    break;
                case 464141742:
                    if (str.equals("myMeetListV3")) {
                        b = 184;
                    }
                    break;
                case 472535355:
                    if (str.equals("relationships")) {
                        b = 185;
                    }
                    break;
                case 473580954:
                    if (str.equals("cardModels")) {
                        b = 186;
                    }
                    break;
                case 501941044:
                    if (str.equals("membershipUpgradeInfo")) {
                        b = 187;
                    }
                    break;
                case 510493065:
                    if (str.equals("compliments")) {
                        b = PSSSigner.TRAILER_IMPLICIT;
                    }
                    break;
                case 523149226:
                    if (str.equals("keywords")) {
                        b = 189;
                    }
                    break;
                case 548478892:
                    if (str.equals("giftGuide")) {
                        b = 190;
                    }
                    break;
                case 549683649:
                    if (str.equals("camping")) {
                        b = 191;
                    }
                    break;
                case 550114869:
                    if (str.equals("giftInfos")) {
                        b = 192;
                    }
                    break;
                case 556199604:
                    if (str.equals("giftPanel")) {
                        b = 193;
                    }
                    break;
                case 578079410:
                    if (str.equals("boostResultEntry")) {
                        b = 194;
                    }
                    break;
                case 583632941:
                    if (str.equals("superlikeByCounts")) {
                        b = 195;
                    }
                    break;
                case 597875717:
                    if (str.equals("iceBreakings")) {
                        b = 196;
                    }
                    break;
                case 606577936:
                    if (str.equals("merchandises")) {
                        b = 197;
                    }
                    break;
                case 624614375:
                    if (str.equals("invitationInfo")) {
                        b = 198;
                    }
                    break;
                case 626632734:
                    if (str.equals("netPictureResult")) {
                        b = 199;
                    }
                    break;
                case 630547243:
                    if (str.equals("popGuide")) {
                        b = 200;
                    }
                    break;
                case 650605586:
                    if (str.equals("cardStyles")) {
                        b = 201;
                    }
                    break;
                case 652385291:
                    if (str.equals("liveLabels")) {
                        b = 202;
                    }
                    break;
                case 671597445:
                    if (str.equals("summarizedPrivileges")) {
                        b = 203;
                    }
                    break;
                case 683356373:
                    if (str.equals("giftWallTitles")) {
                        b = 204;
                    }
                    break;
                case 723641771:
                    if (str.equals("userActivityInfos")) {
                        b = 205;
                    }
                    break;
                case 729465958:
                    if (str.equals("liveSchemas")) {
                        b = 206;
                    }
                    break;
                case 735910615:
                    if (str.equals("orderInfos")) {
                        b = 207;
                    }
                    break;
                case 737868636:
                    if (str.equals("auditPictureTags")) {
                        b = 208;
                    }
                    break;
                case 742405365:
                    if (str.equals("mkt_activity_regular")) {
                        b = 209;
                    }
                    break;
                case 750867693:
                    if (str.equals("packages")) {
                        b = 210;
                    }
                    break;
                case 756535053:
                    if (str.equals("thirdPartyInfo")) {
                        b = 211;
                    }
                    break;
                case 763786177:
                    if (str.equals("userStickers")) {
                        b = 212;
                    }
                    break;
                case 777753769:
                    if (str.equals("groupNotifications")) {
                        b = 213;
                    }
                    break;
                case 790524945:
                    if (str.equals("privateCustomResult")) {
                        b = 214;
                    }
                    break;
                case 814861139:
                    if (str.equals("purchaseSavePop")) {
                        b = 215;
                    }
                    break;
                case 834824462:
                    if (str.equals("seePortraitCounter")) {
                        b = 216;
                    }
                    break;
                case 840429271:
                    if (str.equals("freeTrialOperateResult")) {
                        b = 217;
                    }
                    break;
                case 844423351:
                    if (str.equals("evaluations")) {
                        b = 218;
                    }
                    break;
                case 856472728:
                    if (str.equals("summarizedPrivilegePrices")) {
                        b = 219;
                    }
                    break;
                case 858523452:
                    if (str.equals(Evaluation.TYPE)) {
                        b = 220;
                    }
                    break;
                case 860032636:
                    if (str.equals("visitorAllCount")) {
                        b = 221;
                    }
                    break;
                case 867096281:
                    if (str.equals("newGiftWalls")) {
                        b = 222;
                    }
                    break;
                case 957885709:
                    if (str.equals("coupons")) {
                        b = 223;
                    }
                    break;
                case 965624050:
                    if (str.equals("seeInfos")) {
                        b = 224;
                    }
                    break;
                case 985793771:
                    if (str.equals("descriptionRisk")) {
                        b = 225;
                    }
                    break;
                case 994220080:
                    if (str.equals(Promotions.TYPE)) {
                        b = 226;
                    }
                    break;
                case 1032458464:
                    if (str.equals("repeatPictureResult")) {
                        b = 227;
                    }
                    break;
                case 1033585522:
                    if (str.equals("pictureVerifyRightedInfo")) {
                        b = 228;
                    }
                    break;
                case 1070216203:
                    if (str.equals("countdownLikes")) {
                        b = 229;
                    }
                    break;
                case 1070233308:
                    if (str.equals("complimentTexts")) {
                        b = 230;
                    }
                    break;
                case 1077310371:
                    if (str.equals("userAudits")) {
                        b = 231;
                    }
                    break;
                case 1088338738:
                    if (str.equals("realFeelInfo")) {
                        b = 232;
                    }
                    break;
                case 1099813802:
                    if (str.equals("refundDetails")) {
                        b = 233;
                    }
                    break;
                case 1103187521:
                    if (str.equals("reminders")) {
                        b = 234;
                    }
                    break;
                case 1103212270:
                    if (str.equals("likedMes")) {
                        b = 235;
                    }
                    break;
                case 1108894162:
                    if (str.equals("todayMatchInfo")) {
                        b = 236;
                    }
                    break;
                case 1147723798:
                    if (str.equals("greetingNewPeople")) {
                        b = 237;
                    }
                    break;
                case 1189549813:
                    if (str.equals("buzzUsers")) {
                        b = 238;
                    }
                    break;
                case 1195341721:
                    if (str.equals("invitation")) {
                        b = 239;
                    }
                    break;
                case 1197463231:
                    if (str.equals("giftWallRankInfos")) {
                        b = 240;
                    }
                    break;
                case 1201758931:
                    if (str.equals("profileGuide")) {
                        b = 241;
                    }
                    break;
                case 1221297891:
                    if (str.equals("evaluationReports")) {
                        b = 242;
                    }
                    break;
                case 1225504086:
                    if (str.equals("literaturesComments")) {
                        b = 243;
                    }
                    break;
                case 1228205496:
                    if (str.equals("verifications")) {
                        b = 244;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 245;
                    }
                    break;
                case 1242261047:
                    if (str.equals("counterVerification")) {
                        b = 246;
                    }
                    break;
                case 1259346009:
                    if (str.equals("monetizationPromotions")) {
                        b = 247;
                    }
                    break;
                case 1285271335:
                    if (str.equals("loveLetterGroup")) {
                        b = 248;
                    }
                    break;
                case 1298809787:
                    if (str.equals("visitorHiddens")) {
                        b = 249;
                    }
                    break;
                case 1304831986:
                    if (str.equals("faceidTokens")) {
                        b = 250;
                    }
                    break;
                case 1323281493:
                    if (str.equals("seeTrialStatus")) {
                        b = 251;
                    }
                    break;
                case 1324566821:
                    if (str.equals("seePortraits")) {
                        b = 252;
                    }
                    break;
                case 1343251147:
                    if (str.equals("msgData")) {
                        b = 253;
                    }
                    break;
                case 1371694843:
                    if (str.equals("ipRegion")) {
                        b = 254;
                    }
                    break;
                case 1390378002:
                    if (str.equals("extraPrivileges")) {
                        b = 255;
                    }
                    break;
                case 1402476696:
                    if (str.equals("verificationLowLabels")) {
                        b = 256;
                    }
                    break;
                case 1405121026:
                    if (str.equals("couponBag")) {
                        b = X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
                    }
                    break;
                case 1424400480:
                    if (str.equals("nextTime")) {
                        b = X5455_ExtendedTimestamp.ACCESS_TIME_BIT;
                    }
                    break;
                case 1437269511:
                    if (str.equals("chatPage")) {
                        b = 259;
                    }
                    break;
                case 1437916763:
                    if (str.equals(Recommended.TYPE)) {
                        b = 260;
                    }
                    break;
                case 1469953104:
                    if (str.equals(SchemeKey.conversations)) {
                        b = 261;
                    }
                    break;
                case 1482199545:
                    if (str.equals("liveActivities")) {
                        b = 262;
                    }
                    break;
                case 1490246526:
                    if (str.equals("jmpTarget")) {
                        b = 263;
                    }
                    break;
                case 1490859561:
                    if (str.equals("heartbeatMatch")) {
                        b = 264;
                    }
                    break;
                case 1526374775:
                    if (str.equals("cardsIcons")) {
                        b = HttpTokens.TAB;
                    }
                    break;
                case 1531715286:
                    if (str.equals("stickers")) {
                        b = HttpTokens.LINE_FEED;
                    }
                    break;
                case 1538771632:
                    if (str.equals("audioTexts")) {
                        b = 267;
                    }
                    break;
                case 1557721666:
                    if (str.equals(ErrorBundle.DETAIL_ENTRY)) {
                        b = 268;
                    }
                    break;
                case 1567421828:
                    if (str.equals("cityCBanner")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1575940883:
                    if (str.equals("swipeUpperLimit")) {
                        b = 270;
                    }
                    break;
                case 1578740022:
                    if (str.equals("groupAttributes")) {
                        b = 271;
                    }
                    break;
                case 1598407691:
                    if (str.equals("chatHeats")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1608972698:
                    if (str.equals("cityCConfig")) {
                        b = 273;
                    }
                    break;
                case 1625850240:
                    if (str.equals("analysisGuide")) {
                        b = 274;
                    }
                    break;
                case 1655054676:
                    if (str.equals("diamond")) {
                        b = 275;
                    }
                    break;
                case 1674492831:
                    if (str.equals("intlVisitorInfo")) {
                        b = 276;
                    }
                    break;
                case 1738939723:
                    if (str.equals("showOnlineForWhoIMeet")) {
                        b = 277;
                    }
                    break;
                case 1746523458:
                    if (str.equals(Literatures.TYPE)) {
                        b = 278;
                    }
                    break;
                case 1794990398:
                    if (str.equals("userFeedbackInfo")) {
                        b = 279;
                    }
                    break;
                case 1800523605:
                    if (str.equals("accountRecords")) {
                        b = 280;
                    }
                    break;
                case 1807571317:
                    if (str.equals("boostStatus")) {
                        b = 281;
                    }
                    break;
                case 1827814402:
                    if (str.equals("notificationCounters")) {
                        b = 282;
                    }
                    break;
                case 1854445613:
                    if (str.equals("monetizationConfiguration")) {
                        b = 283;
                    }
                    break;
                case 1859040924:
                    if (str.equals(SummarizedPrivilegesId.aiChatAnalysis)) {
                        b = 284;
                    }
                    break;
                case 1869706548:
                    if (str.equals("recallMatch")) {
                        b = 285;
                    }
                    break;
                case 1873080221:
                    if (str.equals("instantMatchUserInfo")) {
                        b = 286;
                    }
                    break;
                case 1917457279:
                    if (str.equals("schools")) {
                        b = 287;
                    }
                    break;
                case 1923073320:
                    if (str.equals("chatPartnersSignals")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1926489730:
                    if (str.equals("fakePhotoFeedback")) {
                        b = 289;
                    }
                    break;
                case 1932185645:
                    if (str.equals("idealDetails")) {
                        b = 290;
                    }
                    break;
                case 1932832503:
                    if (str.equals("heartbeats")) {
                        b = 291;
                    }
                    break;
                case 2024385535:
                    if (str.equals("realPicturesBanner")) {
                        b = 292;
                    }
                    break;
                case 2033899671:
                    if (str.equals("scoreThresholdOther")) {
                        b = 293;
                    }
                    break;
                case 2049073431:
                    if (str.equals("intlInsertCardSets")) {
                        b = 294;
                    }
                    break;
                case 2054217050:
                    if (str.equals("shareId")) {
                        b = 295;
                    }
                    break;
                case 2073134938:
                    if (str.equals("greetings")) {
                        b = 296;
                    }
                    break;
                case 2085980041:
                    if (str.equals("mkt_activity_flash")) {
                        b = 297;
                    }
                    break;
                case 2127082526:
                    if (str.equals("unReadUserIds")) {
                        b = 298;
                    }
                    break;
                case 2130285426:
                    if (str.equals("speedUpCard")) {
                        b = 299;
                    }
                    break;
                case 2142081378:
                    if (str.equals("growthMesInfo")) {
                        b = 300;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    coreData.chatPartners = ChatPartners.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    coreData.selectionUsers = JsonAdapter.parseArray(jsonParser, SelectionUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    coreData.walletAccounts = JsonAdapter.parseArray(jsonParser, WalletAccount.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    coreData.instantChat = ConversationInstantChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    coreData.privilegeGifts = JsonAdapter.parseArray(jsonParser, PrivilegeGift.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    coreData.chatGroups = JsonAdapter.parseArray(jsonParser, ChatGroup.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    coreData.extremeQuestions = ExtremeQuestions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    coreData.purchaseDialogConfigs = PurchaseDialogConfigs.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    coreData.resources = JsonAdapter.parseArray(jsonParser, ResourceTriggers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    coreData.fakeGuideData = FakeGuideData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    coreData.acceleratePairing = AcceleratePairingStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    coreData.readMessages = JsonAdapter.parseArray(jsonParser, ReadMessage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    coreData.systemQuestions = JsonAdapter.parseArray(jsonParser, IceBreakingQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    coreData.surveys = JsonAdapter.parseArray(jsonParser, Surveys.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    coreData.settingGroups = JsonAdapter.parseArray(jsonParser, SettingGroups.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    coreData.chatGroupMembers = JsonAdapter.parseArray(jsonParser, ChatGroupMember.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    coreData.ultraRightsUpgradeInfo = UltraRightsUpgradeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    coreData.privacySettings = JsonAdapter.parseArray(jsonParser, PrivacyMembershipSetting.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    coreData.questions = JsonAdapter.parseArray(jsonParser, Question.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    coreData.tagPictureStrategy = TagStrategy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    coreData.chatAssistantQuestions = JsonAdapter.parseArray(jsonParser, ChatAssistantQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    coreData.tagCategoryStrategy = TagStrategy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    coreData.seeExposedUser = SeeExposedUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    coreData.exposureInfo = GrowthExposureInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    coreData.aiPictureAuth = AiPictureAuth.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    coreData.tagUserCounts = JsonAdapter.parseArray(jsonParser, TagUserCounts.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    coreData.selectionUserInfo = SelectionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    coreData.loveLetter = LoveLetterEntryInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    coreData.cipherId = CipherId.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    coreData.comStatusAwards = JsonAdapter.parseArray(jsonParser, ComStatusAward.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    coreData.profileCounts = JsonAdapter.parseArray(jsonParser, ProfileCountInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    coreData.literatureConfigInfo = LiteratureConfigInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 32:
                    coreData.greetingCounter = GreetingCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    coreData.selectedQuestion = ProfileSelectedQue.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    coreData.groupTabs = JsonAdapter.parseArray(jsonParser, GroupTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 35:
                    coreData.stateEmotion = JsonAdapter.parseArray(jsonParser, StateEmotion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 36:
                    coreData.tagCategories = JsonAdapter.parseArray(jsonParser, TagCategories.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 37:
                    coreData.action = ActionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 38:
                    coreData.picksInfo = JsonAdapter.parseArray(jsonParser, InstantMatchUserInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 39:
                    coreData.avatar = jsonParser.getValueAsString();
                    return true;
                case 40:
                    coreData.tickles = JsonAdapter.parseArray(jsonParser, TickleSettingInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 41:
                    coreData.greetingPermissions = JsonAdapter.parseArray(jsonParser, GreetingPermission.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 42:
                    coreData.oneside = QuickChatOneside.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 43:
                    coreData.explore = Explore.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 44:
                    coreData.marriageGuide = MarriageGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 45:
                    coreData.pictureTags = JsonAdapter.parseArray(jsonParser, NewTags.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 46:
                    coreData.floats = JsonAdapter.parseArray(jsonParser, FloatsCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 47:
                    coreData.privateCustomResults = PrivateCustomResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 48:
                    coreData.visitorSetting = VisitorSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 49:
                    coreData.greets = JsonAdapter.parseArray(jsonParser, UserGreetInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 50:
                    coreData.ttcToDiamondRate = jsonParser.getValueAsInt();
                    return true;
                case 51:
                    coreData.tacitTest = TacitTestProfileCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 52:
                    coreData.creditScores = JsonAdapter.parseArray(jsonParser, CreditScoreData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 53:
                    coreData.actives = JsonAdapter.parseArray(jsonParser, Active.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 54:
                    coreData.loveLetterContent = LoveLetterContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 55:
                    coreData.latestMoments = JsonAdapter.parseArray(jsonParser, ConversationLatestMoment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 56:
                    coreData.groupApplies = JsonAdapter.parseArray(jsonParser, GroupApply.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 57:
                    coreData.recommendList = JsonAdapter.parseArray(jsonParser, TribeSubset.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 58:
                    coreData.cityCData = JsonAdapter.parseArray(jsonParser, CityCData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 59:
                    coreData.greetingHotLevelInfo = GreetingHotLevelInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 60:
                    coreData.barLoverCities = JsonAdapter.parseArray(jsonParser, BarLoverCitys.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 61:
                    coreData.isRecallUser = jsonParser.getValueAsBoolean();
                    return true;
                case 62:
                    coreData.cardCornerMarks = JsonAdapter.parseArray(jsonParser, CardCornerMark.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 63:
                    coreData.myMeet = MyMeetExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 64:
                    coreData.picksUsers = JsonAdapter.parseArray(jsonParser, PicksUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 65:
                    coreData.intlBubble = IntlTribeBubble.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 66:
                    coreData.giftWallSocials = JsonAdapter.parseArray(jsonParser, GiftWallSocial.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 67:
                    coreData.voicechat = VoiceChatInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 68:
                    coreData.questionnaire = Questionnaire.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 69:
                    coreData.orders = JsonAdapter.parseArray(jsonParser, PaymentOrder.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 70:
                    coreData.feedbackQuestions = JsonAdapter.parseArray(jsonParser, FeedbackQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 71:
                    coreData.visitorInfo = JsonAdapter.parseArray(jsonParser, VisitorInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 72:
                    coreData.instantMatchGiveCountInfo = JsonAdapter.parseArray(jsonParser, InstantMatchGiveCountInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                    coreData.superLikeCount = JsonAdapter.parseArray(jsonParser, SuperLikeCount.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 74:
                    coreData.profileLikeCounter = ExpandedProfileLikeCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 75:
                    coreData.states = JsonAdapter.parseArray(jsonParser, BubbleInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 76:
                    coreData.odiamondList = ODiamondListItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 77:
                    coreData.fakeSuggest = FakeQuickChatSuggestStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 78:
                    coreData.figures = JsonAdapter.parseArray(jsonParser, Figure.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 79:
                    coreData.seeTrialEligible = SeeTrialEligible.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 80:
                    coreData.prologues = JsonAdapter.parseArray(jsonParser, Prologue.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.FILE_REFERENCE /* 81 */:
                    coreData.blindbox = GrowthBlindBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                    coreData.verificationTokens = JsonAdapter.parseArray(jsonParser, VerificationToken.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.DISCRETIONARY_DATA /* 83 */:
                    coreData.voices = JsonAdapter.parseArray(jsonParser, Voice.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                    coreData.recentConversations = JsonAdapter.parseArray(jsonParser, RecentConversation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 85:
                    coreData.chatGameInfo = ChatGameInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.TRACK1_APPLICATION /* 86 */:
                    coreData.groupSettings = JsonAdapter.parseArray(jsonParser, GroupSetting.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 87:
                    coreData.interestedGroups = JsonAdapter.parseArray(jsonParser, ChatGroup.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 88:
                    coreData.wallet = Wallet.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 89:
                    coreData.partner = GrowthPartner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 90:
                    coreData.wechat = WechatNotifySetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.NAME /* 91 */:
                    coreData.payWill = jsonParser.getValueAsString();
                    return true;
                case EACTags.TAG_LIST /* 92 */:
                    coreData.iceBreakQuestions = JsonAdapter.parseArray(jsonParser, IceBreakQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.HEADER_LIST /* 93 */:
                    coreData.payWillScoreThreshold = jsonParser.getValueAsDouble();
                    return true;
                case EACTags.LOGIN_DATA /* 94 */:
                    coreData.barLoverPlaces = JsonAdapter.parseArray(jsonParser, BarLoverplaces.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 95:
                    coreData.monetizationChatSeeUser = MonetizationChatSeeUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case Opcodes.IADD /* 96 */:
                    coreData.anonymousSummary = GreetingSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.APPLICATION_TEMPLATE /* 97 */:
                    coreData.svipWeeklyReport = SvipWeeklyReport.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.FCP_TEMPLATE /* 98 */:
                    coreData.likedUsers = JsonAdapter.parseArray(jsonParser, LikedUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 99:
                    coreData.notVerificationResultData = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 100:
                    coreData.freeTrialInfo = FreeTrialInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 101:
                    coreData.friends = JsonAdapter.parseArray(jsonParser, FriendInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 102:
                    coreData.complain = JsonAdapter.parseArray(jsonParser, Complain.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 103:
                    coreData.greetingResult = GreetingResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 104:
                    coreData.onlineLiveChatPair = OnlineLiveChatPair.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 105:
                    coreData.contacts = JsonAdapter.parseArray(jsonParser, Contact.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 106:
                    coreData.contract = Contract.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 107:
                    coreData.compliment = ComplimentFromOther.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 108:
                    coreData.contractInfos = JsonAdapter.parseArray(jsonParser, ContractInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 109:
                    coreData.idealInfos = JsonAdapter.parseArray(jsonParser, IdealInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 110:
                    coreData.extremePickByList = JsonAdapter.parseArray(jsonParser, ExtremePickItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 111:
                    coreData.feedbackRemainedNum = jsonParser.getValueAsInt();
                    return true;
                case 112:
                    coreData.greetingSetting = GreetingSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 113:
                    coreData.profileLikesComments = JsonAdapter.parseArray(jsonParser, ProfileLikeComment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 114:
                    coreData.myTabGuide = DatingGuideData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 115:
                    coreData.messages = JsonAdapter.parseArray(jsonParser, Message.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 116:
                    coreData.myTabTasks = JsonAdapter.parseArray(jsonParser, MyTabTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 117:
                    coreData.canChange = jsonParser.getValueAsBoolean();
                    return true;
                case 118:
                    coreData.surpriseGift = SurpriseGift.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 119:
                    coreData.priorityLike = PriorityLike.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 120:
                    coreData.privateCustomSetting = PrivateCustomSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 121:
                    coreData.lowPhotoResult = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 122:
                    coreData.mkt_activity_quiz = JsonAdapter.parseArray(jsonParser, SamesCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 123:
                    coreData.appealInfos = JsonAdapter.parseArray(jsonParser, AppealInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 124:
                    coreData.idealInfo = IdealInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 125:
                    coreData.features = QuestionnaireFeature.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 126:
                    coreData.myMeetEntryV3 = MyMeetEntryV3.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 127:
                    coreData.userRisk = RiskOtherData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 128:
                    coreData.cardInfos = JsonAdapter.parseArray(jsonParser, CardInfos.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case MMConstants.ERR_WATERMARK_READ /* 129 */:
                    coreData.aiChatAdvice = AIChatAdvice.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 130:
                    coreData.cardExtraInfos = JsonAdapter.parseArray(jsonParser, CardExtraInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 131:
                    coreData.advancedSettings = JsonAdapter.parseArray(jsonParser, AdvancedSettings.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                    coreData.likedByToday = jsonParser.getValueAsInt();
                    return true;
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                    coreData.likeUsers = JsonAdapter.parseArray(jsonParser, LikeUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 134:
                    coreData.urlTags = JsonAdapter.parseArray(jsonParser, UrlTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                    coreData.recommendMessages = JsonAdapter.parseArray(jsonParser, RecommendMessage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                    coreData.realPicturesInfo = RealPicturesInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                    coreData.conversationDiff = ConversationDiff.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                    coreData.suggestUsers = JsonAdapter.parseArray(jsonParser, SpecialSuggestUsers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                    coreData.chatProfiles = JsonAdapter.parseArray(jsonParser, ChatProfile.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 140:
                    coreData.greetingSummary = GreetingSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                    coreData.surpriseGiftExpirationTime = jsonParser.getValueAsLong();
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                    coreData.userStrategyConfiguration = UserStrategyConfiguration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                    coreData.invalidCardList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 144:
                    coreData.tab = GrowthMomentThemeCardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                    coreData.bell = QuickChatBellData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                    coreData.quickchatCard = QuickChatCardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                    coreData.hint = jsonParser.getValueAsBoolean();
                    return true;
                case 148:
                    coreData.link = jsonParser.getValueAsString();
                    return true;
                case 149:
                    coreData.next = jsonParser.getValueAsBoolean();
                    return true;
                case 150:
                    coreData.tags = JsonAdapter.parseArray(jsonParser, NewTags.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 151:
                    coreData.user = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                    coreData.videoChatSecondFloorSummary = VideoChatSecondFloorSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 153:
                    coreData.pendingPaymentGuidance = PendingPaymentGuidance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 154:
                    coreData.tagLoadStrategy = TagStrategy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                    coreData.voiceCall = JsonAdapter.parseArray(jsonParser, VoiceCall.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                    coreData.coins = Coin.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 157:
                    coreData.count = jsonParser.getValueAsInt();
                    return true;
                case 158:
                    coreData.isHit = jsonParser.getValueAsBoolean();
                    return true;
                case 159:
                    coreData.layer = ColdStartLayer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 160:
                    coreData.payWillInfo = jsonParser.getValueAsInt();
                    return true;
                case 161:
                    coreData.links = JsonAdapter.parseArray(jsonParser, Link.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 162:
                    coreData.lives = JsonAdapter.parseArray(jsonParser, Live.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 163:
                    coreData.menus = JsonAdapter.parseArray(jsonParser, OfficialAccountsMenu.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                    coreData.picks = Picks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 165:
                    coreData.risks = JsonAdapter.parseArray(jsonParser, RiskSelfData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 166:
                    coreData.sames = JsonAdapter.parseArray(jsonParser, SamesCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 167:
                    coreData.payWillScore = jsonParser.getValueAsDouble();
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                    coreData.greetingNewPeopleMessage = JsonAdapter.parseArray(jsonParser, GreetingNewPeopleMessage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 169:
                    coreData.autoDeducts = JsonAdapter.parseArray(jsonParser, AutoDeducts.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                    coreData.campaignPage = QuickChatPartyCampaignPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                    coreData.vipSettings = VipSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                    coreData.bundles = JsonAdapter.parseArray(jsonParser, StickerBundle.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                    coreData.dislikedUsers = JsonAdapter.parseArray(jsonParser, DislikedUsers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                    coreData.redPackets = JsonAdapter.parseArray(jsonParser, RedPacket.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                    coreData.chatHeatPermissions = JsonAdapter.parseArray(jsonParser, PermissionsItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 176:
                    coreData.dynamicLabels = JsonAdapter.parseArray(jsonParser, DynamicLable.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 177:
                    coreData.visitorDoorInfo = VisitorDoorInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 178:
                    coreData.membershipRecommendUsers = JsonAdapter.parseArray(jsonParser, MembershipRecommendUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                    coreData.love520 = JsonAdapter.parseArray(jsonParser, SamesCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 180:
                    coreData.monetizationMsg = MonetizationMsg.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 181:
                    coreData.privateQuestions = JsonAdapter.parseArray(jsonParser, PrivateQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 182:
                    coreData.fateRadar = FateRadar.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 183:
                    coreData.officialAccounts = JsonAdapter.parseArray(jsonParser, OfficialAccount.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 184:
                    coreData.myMeetListV3 = MyMeetListV3.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 185:
                    coreData.relationships = JsonAdapter.parseArray(jsonParser, Relationship.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                    coreData.cardModels = JsonAdapter.parseArray(jsonParser, CardModel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 187:
                    coreData.membershipUpgradeInfo = MembershipUpgradeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 188:
                    coreData.compliments = JsonAdapter.parseArray(jsonParser, SuggestedComplimentItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                    coreData.keywords = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                    coreData.giftGuide = CoreGiftGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                    coreData.camping = JsonAdapter.parseArray(jsonParser, SamesCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 192:
                    coreData.giftInfos = JsonAdapter.parseArray(jsonParser, CoreGiftInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 193:
                    coreData.giftPanel = JsonAdapter.parseArray(jsonParser, CoreGiftPanel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                    coreData.boostResultEntry = BoostResultEntry.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                    coreData.superlikeByCounts = JsonAdapter.parseArray(jsonParser, SuperlikeByCount.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                    coreData.iceBreakings = JsonAdapter.parseArray(jsonParser, BreakIce.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                    coreData.merchandises = JsonAdapter.parseArray(jsonParser, Merchandise.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case Opcodes.IFNULL /* 198 */:
                    coreData.invitationInfo = InvitationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case Opcodes.IFNONNULL /* 199 */:
                    coreData.netPictureResult = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 200:
                    coreData.popGuide = PopGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 201:
                    coreData.cardStyles = JsonAdapter.parseArray(jsonParser, CardStyle.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 202:
                    coreData.liveLabels = JsonAdapter.parseArray(jsonParser, UserLiveLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 203:
                    coreData.summarizedPrivileges = JsonAdapter.parseArray(jsonParser, UserPrivilege.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 204:
                    coreData.giftWallTitles = JsonAdapter.parseArray(jsonParser, GiftWallTitle.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 205:
                    coreData.userActivityInfos = JsonAdapter.parseArray(jsonParser, UserActivityInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 206:
                    coreData.liveSchemas = JsonAdapter.parseArray(jsonParser, LiveSchema.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 207:
                    coreData.orderInfos = JsonAdapter.parseArray(jsonParser, OrderInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 208:
                    coreData.auditPictureTags = JsonAdapter.parseArray(jsonParser, AuditPictureTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 209:
                    coreData.mkt_activity_regular = JsonAdapter.parseArray(jsonParser, SamesCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 210:
                    coreData.packages = JsonAdapter.parseArray(jsonParser, StickerPackage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                    coreData.thirdPartyInfo = ThirdPartyInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 212:
                    coreData.userStickers = JsonAdapter.parseArray(jsonParser, UserSticker.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 213:
                    coreData.groupNotifications = JsonAdapter.parseArray(jsonParser, GroupNotification.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 214:
                    coreData.privateCustomResult = PrivateCustomResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 215:
                    coreData.purchaseSavePop = PurchaseSavePop.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 216:
                    coreData.seePortraitCounter = SeePortraitCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 217:
                    coreData.freeTrialOperateResult = FreeTrialOperateResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 218:
                    coreData.evaluations = JsonAdapter.parseArray(jsonParser, Evaluation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 219:
                    coreData.summarizedPrivilegePrices = JsonAdapter.parseArray(jsonParser, SummarizedPrivilegePrice.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 220:
                    coreData.evaluation = Evaluation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 221:
                    coreData.visitorAllCount = jsonParser.getValueAsInt();
                    return true;
                case 222:
                    coreData.newGiftWalls = JsonAdapter.parseArray(jsonParser, NewGiftWall.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 223:
                    coreData.coupons = JsonAdapter.parseArray(jsonParser, Coupon.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 224:
                    coreData.seeInfos = JsonAdapter.parseArray(jsonParser, SeeInfos.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 225:
                    coreData.descriptionRisk = RiskOtherData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 226:
                    coreData.iapAffiliatePromotions = JsonAdapter.parseArray(jsonParser, IapAffiliatePromotion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 227:
                    coreData.repeatPictureResult = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 228:
                    coreData.pictureVerifyRightedInfo = PictureVerifyRightedInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 229:
                    coreData.countdownLikes = JsonAdapter.parseArray(jsonParser, CountdownItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 230:
                    coreData.complimentTexts = JsonAdapter.parseArray(jsonParser, ComplimentText.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 231:
                    coreData.userAudits = JsonAdapter.parseArray(jsonParser, UserAudits.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 232:
                    coreData.realFeelInfo = RealFeelInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 233:
                    coreData.refundDetails = JsonAdapter.parseArray(jsonParser, RefundDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 234:
                    coreData.reminders = JsonAdapter.parseArray(jsonParser, Reminder.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 235:
                    coreData.likedMes = JsonAdapter.parseArray(jsonParser, CardStyle.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 236:
                    coreData.todayMatchInfo = MatchInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 237:
                    coreData.greetingNewPeople = JsonAdapter.parseArray(jsonParser, UserIdType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 238:
                    coreData.buzzUsers = JsonAdapter.parseArray(jsonParser, BuzzUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 239:
                    coreData.invitation = QuickChatPartyInvitation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 240:
                    coreData.giftWallRankInfos = JsonAdapter.parseArray(jsonParser, GiftWallRankInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 241:
                    coreData.profileGuide = jsonParser.getValueAsBoolean();
                    return true;
                case 242:
                    coreData.evaluationReports = JsonAdapter.parseArray(jsonParser, EvaluationReport.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 243:
                    coreData.literaturesComments = JsonAdapter.parseArray(jsonParser, LiteraturesComments.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                    coreData.verificationCenter = JsonAdapter.parseArray(jsonParser, VerificationCenter.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 245:
                    coreData.moments = JsonAdapter.parseArray(jsonParser, CoreMomentInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 246:
                    coreData.counterVerification = CounterVerification.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 247:
                    coreData.monetizationPromotions = JsonAdapter.parseArray(jsonParser, MonetizationPromotion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 248:
                    coreData.loveLetterGroup = LoveLetterGroupInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 249:
                    coreData.visitorHiddens = JsonAdapter.parseArray(jsonParser, VisitorHidden.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 250:
                    coreData.faceidTokens = JsonAdapter.parseArray(jsonParser, FaceidToken.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 251:
                    coreData.seeTrialStatus = SeeTrialStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 252:
                    coreData.seePortraits = JsonAdapter.parseArray(jsonParser, SeePortrait.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 253:
                    coreData.msgData = MessageFeedbackStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 254:
                    coreData.ipRegion = JsonAdapter.parseArray(jsonParser, IPRegion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 255:
                    coreData.extraPrivileges = ExtraPrivileges.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 256:
                    coreData.verificationLowLabels = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 257:
                    coreData.couponBag = Couponbag.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 258:
                    coreData.nextTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 259:
                    coreData.chatPage = ChatPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 260:
                    coreData.recommended = JsonAdapter.parseArray(jsonParser, Recommended.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 261:
                    coreData.conversations = JsonAdapter.parseArray(jsonParser, Conversation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 262:
                    coreData.liveActivities = JsonAdapter.parseArray(jsonParser, BCoreLiveActivity.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 263:
                    coreData.jmpTarget = JmpTarget.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 264:
                    coreData.heartbeatMatch = HeartBeatMatched.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 265:
                    coreData.cardsIcons = JsonAdapter.parseArray(jsonParser, CardsIcons.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 266:
                    coreData.stickers = JsonAdapter.parseArray(jsonParser, Sticker.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 267:
                    coreData.audioTexts = JsonAdapter.parseArray(jsonParser, AudioText.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 268:
                    coreData.details = JsonAdapter.parseArray(jsonParser, DetectText.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 269:
                    coreData.cityCBanner = CityCBanner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 270:
                    coreData.swipeUpperLimit = JsonAdapter.parseArray(jsonParser, SwipeUpperLimit.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 271:
                    coreData.groupAttributes = JsonAdapter.parseArray(jsonParser, GroupAttribute.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 272:
                    coreData.chatHeats = JsonAdapter.parseArray(jsonParser, ChatHeat.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 273:
                    coreData.cityCConfig = CityCConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 274:
                    coreData.analysisGuide = AnalysisGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 275:
                    coreData.diamond = IntlCurrencyDiamond.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 276:
                    coreData.intlVisitorInfo = JsonAdapter.parseArray(jsonParser, IntlVisitor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 277:
                    coreData.showOnlineForWhoIMeet = JsonAdapter.parseArray(jsonParser, ShowOnlineForWhoIMeet.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 278:
                    coreData.literatures = JsonAdapter.parseArray(jsonParser, Literatures.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 279:
                    coreData.userFeedbackInfo = UserFeedbackInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 280:
                    coreData.accountRecords = JsonAdapter.parseArray(jsonParser, AccountRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 281:
                    coreData.boostStatus = JsonAdapter.parseArray(jsonParser, BoostStatus.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 282:
                    coreData.notificationCounters = JsonAdapter.parseArray(jsonParser, NotificationCounter.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 283:
                    coreData.monetizationConfiguration = MonetizationConfiguration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 284:
                    coreData.aiChatAnalysis = AIChatAnalysis.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 285:
                    coreData.recallMatch = RecallMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 286:
                    coreData.instantMatchUserInfo = JsonAdapter.parseArray(jsonParser, InstantMatchUserInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 287:
                    coreData.schools = JsonAdapter.parseArray(jsonParser, School.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 288:
                    coreData.chatPartnersSignals = JsonAdapter.parseArray(jsonParser, ChatPartnersHistoryItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 289:
                    coreData.fakePhotoFeedback = JsonAdapter.parseArray(jsonParser, FakePhotoFeedback.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 290:
                    coreData.idealDetails = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 291:
                    coreData.heartbeats = JsonAdapter.parseArray(jsonParser, HeartBeat.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 292:
                    coreData.realPicturesBanner = RealPicturesBanner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 293:
                    coreData.scoreThresholdOther = jsonParser.getValueAsDouble();
                    return true;
                case 294:
                    coreData.intlInsertCardSets = JsonAdapter.parseArray(jsonParser, InsertCard.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 295:
                    coreData.shareId = ShareId.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 296:
                    coreData.greetings = JsonAdapter.parseArray(jsonParser, Greeting.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 297:
                    coreData.mkt_activity_flash = JsonAdapter.parseArray(jsonParser, SamesCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 298:
                    coreData.unReadUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 299:
                    coreData.speedUpCard = Note.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 300:
                    coreData.growthMesInfo = GrowthMesInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(CoreData coreData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2144674781:
                    if (str.equals("chatPartners")) {
                        b = 0;
                    }
                    break;
                case -2135931940:
                    if (str.equals("selectionUsers")) {
                        b = 1;
                    }
                    break;
                case -2120258817:
                    if (str.equals("walletAccounts")) {
                        b = 2;
                    }
                    break;
                case -2087299879:
                    if (str.equals("instantChat")) {
                        b = 3;
                    }
                    break;
                case -2070782702:
                    if (str.equals("privilegeGifts")) {
                        b = 4;
                    }
                    break;
                case -2005174452:
                    if (str.equals("chatGroups")) {
                        b = 5;
                    }
                    break;
                case -1998195199:
                    if (str.equals("extremeQuestions")) {
                        b = 6;
                    }
                    break;
                case -1991798675:
                    if (str.equals("purchaseDialogConf")) {
                        b = 7;
                    }
                    break;
                case -1983070683:
                    if (str.equals("resources")) {
                        b = 8;
                    }
                    break;
                case -1967425295:
                    if (str.equals("fakeGuideData")) {
                        b = 9;
                    }
                    break;
                case -1938314965:
                    if (str.equals("acceleratePairing")) {
                        b = 10;
                    }
                    break;
                case -1909143294:
                    if (str.equals("readMessages")) {
                        b = 11;
                    }
                    break;
                case -1888029730:
                    if (str.equals("systemQuestions")) {
                        b = 12;
                    }
                    break;
                case -1852750759:
                    if (str.equals(Surveys.TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1846421436:
                    if (str.equals("settingGroups")) {
                        b = 14;
                    }
                    break;
                case -1837461230:
                    if (str.equals("chatGroupMembers")) {
                        b = 15;
                    }
                    break;
                case -1805720505:
                    if (str.equals("ultraRightsUpgradeInfo")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1792656437:
                    if (str.equals("privacySettings")) {
                        b = 17;
                    }
                    break;
                case -1782234803:
                    if (str.equals(Questions.TYPE)) {
                        b = 18;
                    }
                    break;
                case -1736501353:
                    if (str.equals("tagPictureStrategy")) {
                        b = 19;
                    }
                    break;
                case -1689030265:
                    if (str.equals("chatAssistantQuestions")) {
                        b = 20;
                    }
                    break;
                case -1687259573:
                    if (str.equals("tagCategoryStrategy")) {
                        b = 21;
                    }
                    break;
                case -1686290760:
                    if (str.equals("seeExposedUser")) {
                        b = 22;
                    }
                    break;
                case -1649247659:
                    if (str.equals("exposureInfo")) {
                        b = 23;
                    }
                    break;
                case -1626803586:
                    if (str.equals("aiPictureAuth")) {
                        b = 24;
                    }
                    break;
                case -1613248471:
                    if (str.equals("tagUserCounts")) {
                        b = 25;
                    }
                    break;
                case -1609076539:
                    if (str.equals("selectionUserInfo")) {
                        b = 26;
                    }
                    break;
                case -1598162376:
                    if (str.equals("loveLetter")) {
                        b = 27;
                    }
                    break;
                case -1551198074:
                    if (str.equals("cipherId")) {
                        b = 28;
                    }
                    break;
                case -1529222039:
                    if (str.equals("comStatusAwards")) {
                        b = 29;
                    }
                    break;
                case -1519868851:
                    if (str.equals("profileCounts")) {
                        b = 30;
                    }
                    break;
                case -1519129791:
                    if (str.equals("literatureConfigInfo")) {
                        b = 31;
                    }
                    break;
                case -1511756925:
                    if (str.equals("greetingCounter")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case -1497380959:
                    if (str.equals("selectedQuestion")) {
                        b = 33;
                    }
                    break;
                case -1482996067:
                    if (str.equals("groupTabs")) {
                        b = 34;
                    }
                    break;
                case -1451499894:
                    if (str.equals("stateEmotion")) {
                        b = 35;
                    }
                    break;
                case -1446270634:
                    if (str.equals("tagCategories")) {
                        b = 36;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 37;
                    }
                    break;
                case -1419586496:
                    if (str.equals("picksInfo")) {
                        b = 38;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 39;
                    }
                    break;
                case -1322971299:
                    if (str.equals("tickles")) {
                        b = 40;
                    }
                    break;
                case -1321472373:
                    if (str.equals("greetingPermissions")) {
                        b = 41;
                    }
                    break;
                case -1320294211:
                    if (str.equals(ConversationAdditionalTagType.oneside)) {
                        b = 42;
                    }
                    break;
                case -1309148525:
                    if (str.equals(Explore.TYPE)) {
                        b = 43;
                    }
                    break;
                case -1272739758:
                    if (str.equals(SchemeKey.marriageGuide)) {
                        b = 44;
                    }
                    break;
                case -1272621513:
                    if (str.equals("pictureTags")) {
                        b = 45;
                    }
                    break;
                case -1271649897:
                    if (str.equals("floats")) {
                        b = 46;
                    }
                    break;
                case -1263530366:
                    if (str.equals("privateCustomResults")) {
                        b = 47;
                    }
                    break;
                case -1253119451:
                    if (str.equals("userMomentSetting")) {
                        b = 48;
                    }
                    break;
                case -1237773686:
                    if (str.equals("greets")) {
                        b = 49;
                    }
                    break;
                case -1205060170:
                    if (str.equals("ttcToDiamondRate")) {
                        b = 50;
                    }
                    break;
                case -1173065869:
                    if (str.equals("tacitTest")) {
                        b = 51;
                    }
                    break;
                case -1170781062:
                    if (str.equals("creditScores")) {
                        b = 52;
                    }
                    break;
                case -1161797075:
                    if (str.equals("actives")) {
                        b = 53;
                    }
                    break;
                case -1146723551:
                    if (str.equals("loveLetterContent")) {
                        b = 54;
                    }
                    break;
                case -1143959316:
                    if (str.equals("latestMoments")) {
                        b = 55;
                    }
                    break;
                case -1142663923:
                    if (str.equals("groupApplies")) {
                        b = 56;
                    }
                    break;
                case -1142196358:
                    if (str.equals("recommendList")) {
                        b = 57;
                    }
                    break;
                case -1133503486:
                    if (str.equals("cityCData")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case -1127781538:
                    if (str.equals("greetingHotLevelInfo")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case -1113567082:
                    if (str.equals("barLoverCities")) {
                        b = 60;
                    }
                    break;
                case -1093295290:
                    if (str.equals("isRecallUser")) {
                        b = 61;
                    }
                    break;
                case -1084800831:
                    if (str.equals("cardCornerMarks")) {
                        b = 62;
                    }
                    break;
                case -1060249581:
                    if (str.equals(SchemeKey.myMeet)) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case -1046277962:
                    if (str.equals("picksUsers")) {
                        b = 64;
                    }
                    break;
                case -1041298103:
                    if (str.equals("intlBubble")) {
                        b = 65;
                    }
                    break;
                case -1022310868:
                    if (str.equals("giftWallSocials")) {
                        b = 66;
                    }
                    break;
                case -1018590326:
                    if (str.equals("voicechat")) {
                        b = 67;
                    }
                    break;
                case -1017049693:
                    if (str.equals(Questionnaire.TYPE)) {
                        b = 68;
                    }
                    break;
                case -1008770331:
                    if (str.equals("orders")) {
                        b = 69;
                    }
                    break;
                case -985556152:
                    if (str.equals("feedbackQuestions")) {
                        b = 70;
                    }
                    break;
                case -976673220:
                    if (str.equals("visitorInfo")) {
                        b = 71;
                    }
                    break;
                case -923775928:
                    if (str.equals("instantMatchGiveCountInfo")) {
                        b = 72;
                    }
                    break;
                case -917519747:
                    if (str.equals("superLikeCount")) {
                        b = 73;
                    }
                    break;
                case -901938948:
                    if (str.equals("profileLikeCounter")) {
                        b = 74;
                    }
                    break;
                case -892482046:
                    if (str.equals("states")) {
                        b = 75;
                    }
                    break;
                case -881315773:
                    if (str.equals("odiamondList")) {
                        b = 76;
                    }
                    break;
                case -880003473:
                    if (str.equals("fakeSuggest")) {
                        b = 77;
                    }
                    break;
                case -859123185:
                    if (str.equals("figures")) {
                        b = 78;
                    }
                    break;
                case -854750854:
                    if (str.equals("seeTrialEligible")) {
                        b = 79;
                    }
                    break;
                case -828217588:
                    if (str.equals("prologues")) {
                        b = 80;
                    }
                    break;
                case -826404266:
                    if (str.equals("blindbox")) {
                        b = 81;
                    }
                    break;
                case -818215019:
                    if (str.equals("verificationTokens")) {
                        b = 82;
                    }
                    break;
                case -810990207:
                    if (str.equals("voices")) {
                        b = 83;
                    }
                    break;
                case -810612299:
                    if (str.equals("recentConversations")) {
                        b = 84;
                    }
                    break;
                case -808191176:
                    if (str.equals("chatGameInfo")) {
                        b = 85;
                    }
                    break;
                case -807721022:
                    if (str.equals("groupSettings")) {
                        b = 86;
                    }
                    break;
                case -804553603:
                    if (str.equals("interestedGroups")) {
                        b = 87;
                    }
                    break;
                case -795192327:
                    if (str.equals("wallet")) {
                        b = 88;
                    }
                    break;
                case -792929080:
                    if (str.equals("partner")) {
                        b = 89;
                    }
                    break;
                case -791770330:
                    if (str.equals("wechat")) {
                        b = 90;
                    }
                    break;
                case -787332966:
                    if (str.equals("payWill")) {
                        b = 91;
                    }
                    break;
                case -774616455:
                    if (str.equals("iceBreakQuestions")) {
                        b = 92;
                    }
                    break;
                case -747042311:
                    if (str.equals("scoreThreshold")) {
                        b = 93;
                    }
                    break;
                case -739189351:
                    if (str.equals("barLoverPlaces")) {
                        b = 94;
                    }
                    break;
                case -724152003:
                    if (str.equals("monetizationChatSeeUser")) {
                        b = 95;
                    }
                    break;
                case -702519687:
                    if (str.equals("anonymousSummary")) {
                        b = 96;
                    }
                    break;
                case -677109505:
                    if (str.equals("svipWeeklyReport")) {
                        b = 97;
                    }
                    break;
                case -662135205:
                    if (str.equals("likedUsers")) {
                        b = 98;
                    }
                    break;
                case -625604459:
                    if (str.equals("notVerificationResultData")) {
                        b = 99;
                    }
                    break;
                case -616042536:
                    if (str.equals("freeTrialInfo")) {
                        b = 100;
                    }
                    break;
                case -600094315:
                    if (str.equals("friends")) {
                        b = 101;
                    }
                    break;
                case -599449367:
                    if (str.equals(Complain.TYPE)) {
                        b = 102;
                    }
                    break;
                case -598448714:
                    if (str.equals("greetingResult")) {
                        b = 103;
                    }
                    break;
                case -592540335:
                    if (str.equals("onlineLiveChatPair")) {
                        b = 104;
                    }
                    break;
                case -567451565:
                    if (str.equals("contacts")) {
                        b = 105;
                    }
                    break;
                case -566947566:
                    if (str.equals("contract")) {
                        b = 106;
                    }
                    break;
                case -537721814:
                    if (str.equals("compliment")) {
                        b = 107;
                    }
                    break;
                case -532870253:
                    if (str.equals("contractInfos")) {
                        b = 108;
                    }
                    break;
                case -529428944:
                    if (str.equals("idealInfos")) {
                        b = 109;
                    }
                    break;
                case -521855262:
                    if (str.equals("extremePickByList")) {
                        b = 110;
                    }
                    break;
                case -503998794:
                    if (str.equals("feedbackRemainedNum")) {
                        b = 111;
                    }
                    break;
                case -483646505:
                    if (str.equals("greetingSetting")) {
                        b = 112;
                    }
                    break;
                case -477795673:
                    if (str.equals("profileLikesComments")) {
                        b = 113;
                    }
                    break;
                case -468253133:
                    if (str.equals("myTabGuide")) {
                        b = 114;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 115;
                    }
                    break;
                case -456833339:
                    if (str.equals("myTabTasks")) {
                        b = 116;
                    }
                    break;
                case -437099616:
                    if (str.equals("canChange")) {
                        b = 117;
                    }
                    break;
                case -426072135:
                    if (str.equals("surpriseGift")) {
                        b = 118;
                    }
                    break;
                case -389076133:
                    if (str.equals("priorityLike")) {
                        b = 119;
                    }
                    break;
                case -375136036:
                    if (str.equals("privateCustomSetting")) {
                        b = 120;
                    }
                    break;
                case -360878853:
                    if (str.equals("lowPhotoResult")) {
                        b = 121;
                    }
                    break;
                case -348015716:
                    if (str.equals("mkt_activity_quiz")) {
                        b = 122;
                    }
                    break;
                case -330263242:
                    if (str.equals("appealInfos")) {
                        b = 123;
                    }
                    break;
                case -294173021:
                    if (str.equals("idealInfo")) {
                        b = 124;
                    }
                    break;
                case -290659267:
                    if (str.equals("features")) {
                        b = 125;
                    }
                    break;
                case -270021892:
                    if (str.equals("myMeetEntryV3")) {
                        b = 126;
                    }
                    break;
                case -266539718:
                    if (str.equals("userRisk")) {
                        b = 127;
                    }
                    break;
                case -265539499:
                    if (str.equals("cardInfos")) {
                        b = 128;
                    }
                    break;
                case -261427016:
                    if (str.equals(SummarizedPrivilegesId.aiChatAdvice)) {
                        b = 129;
                    }
                    break;
                case -251102587:
                    if (str.equals("cardExtraInfos")) {
                        b = 130;
                    }
                    break;
                case -242766163:
                    if (str.equals("advancedSearchSettings")) {
                        b = 131;
                    }
                    break;
                case -183498563:
                    if (str.equals("likedByToday")) {
                        b = 132;
                    }
                    break;
                case -172878671:
                    if (str.equals("likeUsers")) {
                        b = 133;
                    }
                    break;
                case -170189272:
                    if (str.equals("urlTags")) {
                        b = 134;
                    }
                    break;
                case -159974872:
                    if (str.equals("recommendMessages")) {
                        b = 135;
                    }
                    break;
                case -154097087:
                    if (str.equals("realPicturesInfo")) {
                        b = 136;
                    }
                    break;
                case -114924760:
                    if (str.equals("conversationDiff")) {
                        b = 137;
                    }
                    break;
                case -58638108:
                    if (str.equals("suggestUsers")) {
                        b = 138;
                    }
                    break;
                case -40973470:
                    if (str.equals("chatProfiles")) {
                        b = 139;
                    }
                    break;
                case -32260819:
                    if (str.equals("greetingSummary")) {
                        b = 140;
                    }
                    break;
                case -9757131:
                    if (str.equals("surpriseGiftExpirationTime")) {
                        b = 141;
                    }
                    break;
                case -9718472:
                    if (str.equals("userStrategyConfiguration")) {
                        b = 142;
                    }
                    break;
                case 104120:
                    if (str.equals("ids")) {
                        b = 143;
                    }
                    break;
                case 114581:
                    if (str.equals("tab")) {
                        b = 144;
                    }
                    break;
                case 3020035:
                    if (str.equals("bell")) {
                        b = 145;
                    }
                    break;
                case 3046160:
                    if (str.equals("card")) {
                        b = 146;
                    }
                    break;
                case 3202695:
                    if (str.equals(TrackReferenceTypeBox.TYPE1)) {
                        b = 147;
                    }
                    break;
                case 3321850:
                    if (str.equals(Link.TYPE)) {
                        b = 148;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        b = 149;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 150;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        b = 151;
                    }
                    break;
                case 14142561:
                    if (str.equals("videoChatSecondFloorSummary")) {
                        b = 152;
                    }
                    break;
                case 32901351:
                    if (str.equals("pendingPaymentGuidance")) {
                        b = 153;
                    }
                    break;
                case 67961651:
                    if (str.equals("tagLoadStrategy")) {
                        b = 154;
                    }
                    break;
                case 94425557:
                    if (str.equals("calls")) {
                        b = 155;
                    }
                    break;
                case 94839810:
                    if (str.equals("coins")) {
                        b = 156;
                    }
                    break;
                case 94851343:
                    if (str.equals("count")) {
                        b = 157;
                    }
                    break;
                case 100468233:
                    if (str.equals("isHit")) {
                        b = 158;
                    }
                    break;
                case 102749521:
                    if (str.equals("layer")) {
                        b = 159;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 160;
                    }
                    break;
                case 102977465:
                    if (str.equals("links")) {
                        b = 161;
                    }
                    break;
                case 102984967:
                    if (str.equals("lives")) {
                        b = 162;
                    }
                    break;
                case 103782132:
                    if (str.equals("menus")) {
                        b = 163;
                    }
                    break;
                case 106660978:
                    if (str.equals("picks")) {
                        b = 164;
                    }
                    break;
                case 108523396:
                    if (str.equals("risks")) {
                        b = 165;
                    }
                    break;
                case 109202637:
                    if (str.equals("sames")) {
                        b = 166;
                    }
                    break;
                case 109264530:
                    if (str.equals(FirebaseAnalytics.Param.SCORE)) {
                        b = 167;
                    }
                    break;
                case 123245329:
                    if (str.equals("greetingNewPeopleMessage")) {
                        b = 168;
                    }
                    break;
                case 152453985:
                    if (str.equals("autoDeducts")) {
                        b = 169;
                    }
                    break;
                case 172478399:
                    if (str.equals("campaignPage")) {
                        b = 170;
                    }
                    break;
                case 181893984:
                    if (str.equals("vipSettings")) {
                        b = 171;
                    }
                    break;
                case 235331633:
                    if (str.equals("bundles")) {
                        b = 172;
                    }
                    break;
                case 240142697:
                    if (str.equals("dislikedUsers")) {
                        b = 173;
                    }
                    break;
                case 247959322:
                    if (str.equals("redPackets")) {
                        b = 174;
                    }
                    break;
                case 267698684:
                    if (str.equals("chatHeatPermissions")) {
                        b = 175;
                    }
                    break;
                case 284901662:
                    if (str.equals("dynamicLabels")) {
                        b = 176;
                    }
                    break;
                case 289193994:
                    if (str.equals("visitorDoorInfo")) {
                        b = 177;
                    }
                    break;
                case 303925282:
                    if (str.equals("membershipRecommendUsers")) {
                        b = 178;
                    }
                    break;
                case 356022401:
                    if (str.equals("love520")) {
                        b = 179;
                    }
                    break;
                case 393745272:
                    if (str.equals("monetizationMsg")) {
                        b = 180;
                    }
                    break;
                case 402964234:
                    if (str.equals("privateQuestions")) {
                        b = 181;
                    }
                    break;
                case 418622970:
                    if (str.equals("fateRadar")) {
                        b = 182;
                    }
                    break;
                case 443719665:
                    if (str.equals("officialAccounts")) {
                        b = 183;
                    }
                    break;
                case 464141742:
                    if (str.equals("myMeetListV3")) {
                        b = 184;
                    }
                    break;
                case 472535355:
                    if (str.equals("relationships")) {
                        b = 185;
                    }
                    break;
                case 473580954:
                    if (str.equals("cardModels")) {
                        b = 186;
                    }
                    break;
                case 501941044:
                    if (str.equals("membershipUpgradeInfo")) {
                        b = 187;
                    }
                    break;
                case 510493065:
                    if (str.equals("compliments")) {
                        b = PSSSigner.TRAILER_IMPLICIT;
                    }
                    break;
                case 523149226:
                    if (str.equals("keywords")) {
                        b = 189;
                    }
                    break;
                case 548478892:
                    if (str.equals("giftGuide")) {
                        b = 190;
                    }
                    break;
                case 549683649:
                    if (str.equals("camping")) {
                        b = 191;
                    }
                    break;
                case 550114869:
                    if (str.equals("giftInfos")) {
                        b = 192;
                    }
                    break;
                case 556199604:
                    if (str.equals("giftPanel")) {
                        b = 193;
                    }
                    break;
                case 578079410:
                    if (str.equals("boostResultEntry")) {
                        b = 194;
                    }
                    break;
                case 583632941:
                    if (str.equals("superlikeByCounts")) {
                        b = 195;
                    }
                    break;
                case 597875717:
                    if (str.equals("iceBreakings")) {
                        b = 196;
                    }
                    break;
                case 606577936:
                    if (str.equals("merchandises")) {
                        b = 197;
                    }
                    break;
                case 624614375:
                    if (str.equals("invitationInfo")) {
                        b = 198;
                    }
                    break;
                case 626632734:
                    if (str.equals("netPictureResult")) {
                        b = 199;
                    }
                    break;
                case 630547243:
                    if (str.equals("popGuide")) {
                        b = 200;
                    }
                    break;
                case 650605586:
                    if (str.equals("cardStyles")) {
                        b = 201;
                    }
                    break;
                case 652385291:
                    if (str.equals("liveLabels")) {
                        b = 202;
                    }
                    break;
                case 671597445:
                    if (str.equals("summarizedPrivileges")) {
                        b = 203;
                    }
                    break;
                case 683356373:
                    if (str.equals("giftWallTitles")) {
                        b = 204;
                    }
                    break;
                case 723641771:
                    if (str.equals("userActivityInfos")) {
                        b = 205;
                    }
                    break;
                case 729465958:
                    if (str.equals("liveSchemas")) {
                        b = 206;
                    }
                    break;
                case 735910615:
                    if (str.equals("orderInfos")) {
                        b = 207;
                    }
                    break;
                case 737868636:
                    if (str.equals("auditPictureTags")) {
                        b = 208;
                    }
                    break;
                case 742405365:
                    if (str.equals("mkt_activity_regular")) {
                        b = 209;
                    }
                    break;
                case 750867693:
                    if (str.equals("packages")) {
                        b = 210;
                    }
                    break;
                case 756535053:
                    if (str.equals("thirdPartyInfo")) {
                        b = 211;
                    }
                    break;
                case 763786177:
                    if (str.equals("userStickers")) {
                        b = 212;
                    }
                    break;
                case 777753769:
                    if (str.equals("groupNotifications")) {
                        b = 213;
                    }
                    break;
                case 790524945:
                    if (str.equals("privateCustomResult")) {
                        b = 214;
                    }
                    break;
                case 814861139:
                    if (str.equals("purchaseSavePop")) {
                        b = 215;
                    }
                    break;
                case 834824462:
                    if (str.equals("seePortraitCounter")) {
                        b = 216;
                    }
                    break;
                case 840429271:
                    if (str.equals("freeTrialOperateResult")) {
                        b = 217;
                    }
                    break;
                case 844423351:
                    if (str.equals("evaluations")) {
                        b = 218;
                    }
                    break;
                case 856472728:
                    if (str.equals("summarizedPrivilegePrices")) {
                        b = 219;
                    }
                    break;
                case 858523452:
                    if (str.equals(Evaluation.TYPE)) {
                        b = 220;
                    }
                    break;
                case 860032636:
                    if (str.equals("visitorAllCount")) {
                        b = 221;
                    }
                    break;
                case 867096281:
                    if (str.equals("newGiftWalls")) {
                        b = 222;
                    }
                    break;
                case 957885709:
                    if (str.equals("coupons")) {
                        b = 223;
                    }
                    break;
                case 965624050:
                    if (str.equals("seeInfos")) {
                        b = 224;
                    }
                    break;
                case 985793771:
                    if (str.equals("descriptionRisk")) {
                        b = 225;
                    }
                    break;
                case 994220080:
                    if (str.equals(Promotions.TYPE)) {
                        b = 226;
                    }
                    break;
                case 1032458464:
                    if (str.equals("repeatPictureResult")) {
                        b = 227;
                    }
                    break;
                case 1033585522:
                    if (str.equals("pictureVerifyRightedInfo")) {
                        b = 228;
                    }
                    break;
                case 1070216203:
                    if (str.equals("countdownLikes")) {
                        b = 229;
                    }
                    break;
                case 1070233308:
                    if (str.equals("complimentTexts")) {
                        b = 230;
                    }
                    break;
                case 1077310371:
                    if (str.equals("userAudits")) {
                        b = 231;
                    }
                    break;
                case 1088338738:
                    if (str.equals("realFeelInfo")) {
                        b = 232;
                    }
                    break;
                case 1099813802:
                    if (str.equals("refundDetails")) {
                        b = 233;
                    }
                    break;
                case 1103187521:
                    if (str.equals("reminders")) {
                        b = 234;
                    }
                    break;
                case 1103212270:
                    if (str.equals("likedMes")) {
                        b = 235;
                    }
                    break;
                case 1108894162:
                    if (str.equals("todayMatchInfo")) {
                        b = 236;
                    }
                    break;
                case 1147723798:
                    if (str.equals("greetingNewPeople")) {
                        b = 237;
                    }
                    break;
                case 1189549813:
                    if (str.equals("buzzUsers")) {
                        b = 238;
                    }
                    break;
                case 1195341721:
                    if (str.equals("invitation")) {
                        b = 239;
                    }
                    break;
                case 1197463231:
                    if (str.equals("giftWallRankInfos")) {
                        b = 240;
                    }
                    break;
                case 1201758931:
                    if (str.equals("profileGuide")) {
                        b = 241;
                    }
                    break;
                case 1221297891:
                    if (str.equals("evaluationReports")) {
                        b = 242;
                    }
                    break;
                case 1225504086:
                    if (str.equals("literaturesComments")) {
                        b = 243;
                    }
                    break;
                case 1228205496:
                    if (str.equals("verifications")) {
                        b = 244;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 245;
                    }
                    break;
                case 1242261047:
                    if (str.equals("counterVerification")) {
                        b = 246;
                    }
                    break;
                case 1259346009:
                    if (str.equals("monetizationPromotions")) {
                        b = 247;
                    }
                    break;
                case 1285271335:
                    if (str.equals("loveLetterGroup")) {
                        b = 248;
                    }
                    break;
                case 1298809787:
                    if (str.equals("visitorHiddens")) {
                        b = 249;
                    }
                    break;
                case 1304831986:
                    if (str.equals("faceidTokens")) {
                        b = 250;
                    }
                    break;
                case 1323281493:
                    if (str.equals("seeTrialStatus")) {
                        b = 251;
                    }
                    break;
                case 1324566821:
                    if (str.equals("seePortraits")) {
                        b = 252;
                    }
                    break;
                case 1343251147:
                    if (str.equals("msgData")) {
                        b = 253;
                    }
                    break;
                case 1371694843:
                    if (str.equals("ipRegion")) {
                        b = 254;
                    }
                    break;
                case 1390378002:
                    if (str.equals("extraPrivileges")) {
                        b = 255;
                    }
                    break;
                case 1402476696:
                    if (str.equals("verificationLowLabels")) {
                        b = 256;
                    }
                    break;
                case 1405121026:
                    if (str.equals("couponBag")) {
                        b = X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
                    }
                    break;
                case 1424400480:
                    if (str.equals("nextTime")) {
                        b = X5455_ExtendedTimestamp.ACCESS_TIME_BIT;
                    }
                    break;
                case 1437269511:
                    if (str.equals("chatPage")) {
                        b = 259;
                    }
                    break;
                case 1437916763:
                    if (str.equals(Recommended.TYPE)) {
                        b = 260;
                    }
                    break;
                case 1469953104:
                    if (str.equals(SchemeKey.conversations)) {
                        b = 261;
                    }
                    break;
                case 1482199545:
                    if (str.equals("liveActivities")) {
                        b = 262;
                    }
                    break;
                case 1490246526:
                    if (str.equals("jmpTarget")) {
                        b = 263;
                    }
                    break;
                case 1490859561:
                    if (str.equals("heartbeatMatch")) {
                        b = 264;
                    }
                    break;
                case 1526374775:
                    if (str.equals("cardsIcons")) {
                        b = HttpTokens.TAB;
                    }
                    break;
                case 1531715286:
                    if (str.equals("stickers")) {
                        b = HttpTokens.LINE_FEED;
                    }
                    break;
                case 1538771632:
                    if (str.equals("audioTexts")) {
                        b = 267;
                    }
                    break;
                case 1557721666:
                    if (str.equals(ErrorBundle.DETAIL_ENTRY)) {
                        b = 268;
                    }
                    break;
                case 1567421828:
                    if (str.equals("cityCBanner")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1575940883:
                    if (str.equals("swipeUpperLimit")) {
                        b = 270;
                    }
                    break;
                case 1578740022:
                    if (str.equals("groupAttributes")) {
                        b = 271;
                    }
                    break;
                case 1598407691:
                    if (str.equals("chatHeats")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1608972698:
                    if (str.equals("cityCConfig")) {
                        b = 273;
                    }
                    break;
                case 1625850240:
                    if (str.equals("analysisGuide")) {
                        b = 274;
                    }
                    break;
                case 1655054676:
                    if (str.equals("diamond")) {
                        b = 275;
                    }
                    break;
                case 1674492831:
                    if (str.equals("intlVisitorInfo")) {
                        b = 276;
                    }
                    break;
                case 1738939723:
                    if (str.equals("showOnlineForWhoIMeet")) {
                        b = 277;
                    }
                    break;
                case 1746523458:
                    if (str.equals(Literatures.TYPE)) {
                        b = 278;
                    }
                    break;
                case 1794990398:
                    if (str.equals("userFeedbackInfo")) {
                        b = 279;
                    }
                    break;
                case 1800523605:
                    if (str.equals("accountRecords")) {
                        b = 280;
                    }
                    break;
                case 1807571317:
                    if (str.equals("boostStatus")) {
                        b = 281;
                    }
                    break;
                case 1827814402:
                    if (str.equals("notificationCounters")) {
                        b = 282;
                    }
                    break;
                case 1854445613:
                    if (str.equals("monetizationConfiguration")) {
                        b = 283;
                    }
                    break;
                case 1859040924:
                    if (str.equals(SummarizedPrivilegesId.aiChatAnalysis)) {
                        b = 284;
                    }
                    break;
                case 1869706548:
                    if (str.equals("recallMatch")) {
                        b = 285;
                    }
                    break;
                case 1873080221:
                    if (str.equals("instantMatchUserInfo")) {
                        b = 286;
                    }
                    break;
                case 1917457279:
                    if (str.equals("schools")) {
                        b = 287;
                    }
                    break;
                case 1923073320:
                    if (str.equals("chatPartnersSignals")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1926489730:
                    if (str.equals("fakePhotoFeedback")) {
                        b = 289;
                    }
                    break;
                case 1932185645:
                    if (str.equals("idealDetails")) {
                        b = 290;
                    }
                    break;
                case 1932832503:
                    if (str.equals("heartbeats")) {
                        b = 291;
                    }
                    break;
                case 2024385535:
                    if (str.equals("realPicturesBanner")) {
                        b = 292;
                    }
                    break;
                case 2033899671:
                    if (str.equals("scoreThresholdOther")) {
                        b = 293;
                    }
                    break;
                case 2049073431:
                    if (str.equals("intlInsertCardSets")) {
                        b = 294;
                    }
                    break;
                case 2054217050:
                    if (str.equals("shareId")) {
                        b = 295;
                    }
                    break;
                case 2073134938:
                    if (str.equals("greetings")) {
                        b = 296;
                    }
                    break;
                case 2085980041:
                    if (str.equals("mkt_activity_flash")) {
                        b = 297;
                    }
                    break;
                case 2127082526:
                    if (str.equals("unReadUserIds")) {
                        b = 298;
                    }
                    break;
                case 2130285426:
                    if (str.equals("speedUpCard")) {
                        b = 299;
                    }
                    break;
                case 2142081378:
                    if (str.equals("growthMesInfo")) {
                        b = 300;
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
                case 99:
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
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                case 192:
                case 193:
                case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                case Opcodes.IFNULL /* 198 */:
                case Opcodes.IFNONNULL /* 199 */:
                case 200:
                case 201:
                case 202:
                case 203:
                case 204:
                case 205:
                case 206:
                case 207:
                case 208:
                case 209:
                case 210:
                case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                case 217:
                case 218:
                case 219:
                case 220:
                case 221:
                case 222:
                case 223:
                case 224:
                case 225:
                case 226:
                case 227:
                case 228:
                case 229:
                case 230:
                case 231:
                case 232:
                case 233:
                case 234:
                case 235:
                case 236:
                case 237:
                case 238:
                case 239:
                case 240:
                case 241:
                case 242:
                case 243:
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                case 245:
                case 246:
                case 247:
                case 248:
                case 249:
                case 250:
                case 251:
                case 252:
                case 253:
                case 254:
                case 255:
                case 256:
                case 257:
                case 258:
                case 259:
                case 260:
                case 261:
                case 262:
                case 263:
                case 264:
                case 265:
                case 266:
                case 267:
                case 268:
                case 269:
                case 270:
                case 271:
                case 272:
                case 273:
                case 274:
                case 275:
                case 276:
                case 277:
                case 278:
                case 279:
                case 280:
                case 281:
                case 282:
                case 283:
                case 284:
                case 285:
                case 286:
                case 287:
                case 288:
                case 289:
                case 290:
                case 291:
                case 292:
                case 293:
                case 294:
                case 295:
                case 296:
                case 297:
                case 298:
                case 299:
                case 300:
                    return true;
                default:
                    return super.parseFieldCheck(coreData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreData coreData, JsonGenerator jsonGenerator) throws IOException {
            if (coreData.relationships != null) {
                jsonGenerator.writeFieldName("relationships");
                JsonAdapter.serializeArray(coreData.relationships, jsonGenerator, Relationship.JSON_ADAPTER);
            }
            if (coreData.conversations != null) {
                jsonGenerator.writeFieldName(SchemeKey.conversations);
                JsonAdapter.serializeArray(coreData.conversations, jsonGenerator, Conversation.JSON_ADAPTER);
            }
            if (coreData.messages != null) {
                jsonGenerator.writeFieldName("messages");
                JsonAdapter.serializeArray(coreData.messages, jsonGenerator, Message.JSON_ADAPTER);
            }
            if (coreData.contacts != null) {
                jsonGenerator.writeFieldName("contacts");
                JsonAdapter.serializeArray(coreData.contacts, jsonGenerator, Contact.JSON_ADAPTER);
            }
            if (coreData.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(coreData.questions, jsonGenerator, Question.JSON_ADAPTER);
            }
            if (coreData.stickers != null) {
                jsonGenerator.writeFieldName("stickers");
                JsonAdapter.serializeArray(coreData.stickers, jsonGenerator, Sticker.JSON_ADAPTER);
            }
            if (coreData.packages != null) {
                jsonGenerator.writeFieldName("packages");
                JsonAdapter.serializeArray(coreData.packages, jsonGenerator, StickerPackage.JSON_ADAPTER);
            }
            if (coreData.bundles != null) {
                jsonGenerator.writeFieldName("bundles");
                JsonAdapter.serializeArray(coreData.bundles, jsonGenerator, StickerBundle.JSON_ADAPTER);
            }
            if (coreData.links != null) {
                jsonGenerator.writeFieldName("links");
                JsonAdapter.serializeArray(coreData.links, jsonGenerator, Link.JSON_ADAPTER);
            }
            if (coreData.schools != null) {
                jsonGenerator.writeFieldName("schools");
                JsonAdapter.serializeArray(coreData.schools, jsonGenerator, School.JSON_ADAPTER);
            }
            if (coreData.reminders != null) {
                jsonGenerator.writeFieldName("reminders");
                JsonAdapter.serializeArray(coreData.reminders, jsonGenerator, Reminder.JSON_ADAPTER);
            }
            if (coreData.verificationCenter != null) {
                jsonGenerator.writeFieldName("verifications");
                JsonAdapter.serializeArray(coreData.verificationCenter, jsonGenerator, VerificationCenter.JSON_ADAPTER);
            }
            if (coreData.wallet != null) {
                jsonGenerator.writeFieldName("wallet");
                Wallet.JSON_ADAPTER.serialize(coreData.wallet, jsonGenerator, true);
            }
            if (coreData.privateQuestions != null) {
                jsonGenerator.writeFieldName("privateQuestions");
                JsonAdapter.serializeArray(coreData.privateQuestions, jsonGenerator, PrivateQuestion.JSON_ADAPTER);
            }
            if (coreData.coins != null) {
                jsonGenerator.writeFieldName("coins");
                Coin.JSON_ADAPTER.serialize(coreData.coins, jsonGenerator, true);
            }
            if (coreData.summarizedPrivileges != null) {
                jsonGenerator.writeFieldName("summarizedPrivileges");
                JsonAdapter.serializeArray(coreData.summarizedPrivileges, jsonGenerator, UserPrivilege.JSON_ADAPTER);
            }
            if (coreData.faceidTokens != null) {
                jsonGenerator.writeFieldName("faceidTokens");
                JsonAdapter.serializeArray(coreData.faceidTokens, jsonGenerator, FaceidToken.JSON_ADAPTER);
            }
            if (coreData.merchandises != null) {
                jsonGenerator.writeFieldName("merchandises");
                JsonAdapter.serializeArray(coreData.merchandises, jsonGenerator, Merchandise.JSON_ADAPTER);
            }
            if (coreData.privacySettings != null) {
                jsonGenerator.writeFieldName("privacySettings");
                JsonAdapter.serializeArray(coreData.privacySettings, jsonGenerator, PrivacyMembershipSetting.JSON_ADAPTER);
            }
            if (coreData.figures != null) {
                jsonGenerator.writeFieldName("figures");
                JsonAdapter.serializeArray(coreData.figures, jsonGenerator, Figure.JSON_ADAPTER);
            }
            if (coreData.orders != null) {
                jsonGenerator.writeFieldName("orders");
                JsonAdapter.serializeArray(coreData.orders, jsonGenerator, PaymentOrder.JSON_ADAPTER);
            }
            if (coreData.boostStatus != null) {
                jsonGenerator.writeFieldName("boostStatus");
                JsonAdapter.serializeArray(coreData.boostStatus, jsonGenerator, BoostStatus.JSON_ADAPTER);
            }
            if (coreData.summarizedPrivilegePrices != null) {
                jsonGenerator.writeFieldName("summarizedPrivilegePrices");
                JsonAdapter.serializeArray(coreData.summarizedPrivilegePrices, jsonGenerator, SummarizedPrivilegePrice.JSON_ADAPTER);
            }
            if (coreData.advancedSettings != null) {
                jsonGenerator.writeFieldName("advancedSearchSettings");
                JsonAdapter.serializeArray(coreData.advancedSettings, jsonGenerator, AdvancedSettings.JSON_ADAPTER);
            }
            if (coreData.surveys != null) {
                jsonGenerator.writeFieldName(Surveys.TYPE);
                JsonAdapter.serializeArray(coreData.surveys, jsonGenerator, Surveys.JSON_ADAPTER);
            }
            if (coreData.appealInfos != null) {
                jsonGenerator.writeFieldName("appealInfos");
                JsonAdapter.serializeArray(coreData.appealInfos, jsonGenerator, AppealInfo.JSON_ADAPTER);
            }
            if (coreData.autoDeducts != null) {
                jsonGenerator.writeFieldName("autoDeducts");
                JsonAdapter.serializeArray(coreData.autoDeducts, jsonGenerator, AutoDeducts.JSON_ADAPTER);
            }
            if (coreData.voiceCall != null) {
                jsonGenerator.writeFieldName("calls");
                JsonAdapter.serializeArray(coreData.voiceCall, jsonGenerator, VoiceCall.JSON_ADAPTER);
            }
            if (coreData.complain != null) {
                jsonGenerator.writeFieldName(Complain.TYPE);
                JsonAdapter.serializeArray(coreData.complain, jsonGenerator, Complain.JSON_ADAPTER);
            }
            if (coreData.liveLabels != null) {
                jsonGenerator.writeFieldName("liveLabels");
                JsonAdapter.serializeArray(coreData.liveLabels, jsonGenerator, UserLiveLabel.JSON_ADAPTER);
            }
            if (coreData.likedUsers != null) {
                jsonGenerator.writeFieldName("likedUsers");
                JsonAdapter.serializeArray(coreData.likedUsers, jsonGenerator, LikedUser.JSON_ADAPTER);
            }
            if (coreData.refundDetails != null) {
                jsonGenerator.writeFieldName("refundDetails");
                JsonAdapter.serializeArray(coreData.refundDetails, jsonGenerator, RefundDetail.JSON_ADAPTER);
            }
            if (coreData.walletAccounts != null) {
                jsonGenerator.writeFieldName("walletAccounts");
                JsonAdapter.serializeArray(coreData.walletAccounts, jsonGenerator, WalletAccount.JSON_ADAPTER);
            }
            if (coreData.accountRecords != null) {
                jsonGenerator.writeFieldName("accountRecords");
                JsonAdapter.serializeArray(coreData.accountRecords, jsonGenerator, AccountRecord.JSON_ADAPTER);
            }
            if (coreData.monetizationConfiguration != null) {
                jsonGenerator.writeFieldName("monetizationConfiguration");
                MonetizationConfiguration.JSON_ADAPTER.serialize(coreData.monetizationConfiguration, jsonGenerator, true);
            }
            if (coreData.contract != null) {
                jsonGenerator.writeFieldName("contract");
                Contract.JSON_ADAPTER.serialize(coreData.contract, jsonGenerator, true);
            }
            if (coreData.verificationTokens != null) {
                jsonGenerator.writeFieldName("verificationTokens");
                JsonAdapter.serializeArray(coreData.verificationTokens, jsonGenerator, VerificationToken.JSON_ADAPTER);
            }
            if (coreData.heartbeats != null) {
                jsonGenerator.writeFieldName("heartbeats");
                JsonAdapter.serializeArray(coreData.heartbeats, jsonGenerator, HeartBeat.JSON_ADAPTER);
            }
            if (coreData.contractInfos != null) {
                jsonGenerator.writeFieldName("contractInfos");
                JsonAdapter.serializeArray(coreData.contractInfos, jsonGenerator, ContractInfo.JSON_ADAPTER);
            }
            if (coreData.chatGroups != null) {
                jsonGenerator.writeFieldName("chatGroups");
                JsonAdapter.serializeArray(coreData.chatGroups, jsonGenerator, ChatGroup.JSON_ADAPTER);
            }
            if (coreData.chatGroupMembers != null) {
                jsonGenerator.writeFieldName("chatGroupMembers");
                JsonAdapter.serializeArray(coreData.chatGroupMembers, jsonGenerator, ChatGroupMember.JSON_ADAPTER);
            }
            if (coreData.groupApplies != null) {
                jsonGenerator.writeFieldName("groupApplies");
                JsonAdapter.serializeArray(coreData.groupApplies, jsonGenerator, GroupApply.JSON_ADAPTER);
            }
            if (coreData.notificationCounters != null) {
                jsonGenerator.writeFieldName("notificationCounters");
                JsonAdapter.serializeArray(coreData.notificationCounters, jsonGenerator, NotificationCounter.JSON_ADAPTER);
            }
            if (coreData.groupNotifications != null) {
                jsonGenerator.writeFieldName("groupNotifications");
                JsonAdapter.serializeArray(coreData.groupNotifications, jsonGenerator, GroupNotification.JSON_ADAPTER);
            }
            if (coreData.groupAttributes != null) {
                jsonGenerator.writeFieldName("groupAttributes");
                JsonAdapter.serializeArray(coreData.groupAttributes, jsonGenerator, GroupAttribute.JSON_ADAPTER);
            }
            if (coreData.interestedGroups != null) {
                jsonGenerator.writeFieldName("interestedGroups");
                JsonAdapter.serializeArray(coreData.interestedGroups, jsonGenerator, ChatGroup.JSON_ADAPTER);
            }
            if (coreData.groupTabs != null) {
                jsonGenerator.writeFieldName("groupTabs");
                JsonAdapter.serializeArray(coreData.groupTabs, jsonGenerator, GroupTab.JSON_ADAPTER);
            }
            if (coreData.keywords != null) {
                jsonGenerator.writeFieldName("keywords");
                JsonAdapter.serializeArray(coreData.keywords, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (coreData.groupSettings != null) {
                jsonGenerator.writeFieldName("groupSettings");
                JsonAdapter.serializeArray(coreData.groupSettings, jsonGenerator, GroupSetting.JSON_ADAPTER);
            }
            if (coreData.settingGroups != null) {
                jsonGenerator.writeFieldName("settingGroups");
                JsonAdapter.serializeArray(coreData.settingGroups, jsonGenerator, SettingGroups.JSON_ADAPTER);
            }
            if (coreData.lives != null) {
                jsonGenerator.writeFieldName("lives");
                JsonAdapter.serializeArray(coreData.lives, jsonGenerator, Live.JSON_ADAPTER);
            }
            if (coreData.officialAccounts != null) {
                jsonGenerator.writeFieldName("officialAccounts");
                JsonAdapter.serializeArray(coreData.officialAccounts, jsonGenerator, OfficialAccount.JSON_ADAPTER);
            }
            if (coreData.menus != null) {
                jsonGenerator.writeFieldName("menus");
                JsonAdapter.serializeArray(coreData.menus, jsonGenerator, OfficialAccountsMenu.JSON_ADAPTER);
            }
            if (coreData.tickles != null) {
                jsonGenerator.writeFieldName("tickles");
                JsonAdapter.serializeArray(coreData.tickles, jsonGenerator, TickleSettingInfo.JSON_ADAPTER);
            }
            if (coreData.monetizationPromotions != null) {
                jsonGenerator.writeFieldName("monetizationPromotions");
                JsonAdapter.serializeArray(coreData.monetizationPromotions, jsonGenerator, MonetizationPromotion.JSON_ADAPTER);
            }
            if (coreData.coupons != null) {
                jsonGenerator.writeFieldName("coupons");
                JsonAdapter.serializeArray(coreData.coupons, jsonGenerator, Coupon.JSON_ADAPTER);
            }
            if (coreData.chatProfiles != null) {
                jsonGenerator.writeFieldName("chatProfiles");
                JsonAdapter.serializeArray(coreData.chatProfiles, jsonGenerator, ChatProfile.JSON_ADAPTER);
            }
            if (coreData.systemQuestions != null) {
                jsonGenerator.writeFieldName("systemQuestions");
                JsonAdapter.serializeArray(coreData.systemQuestions, jsonGenerator, IceBreakingQuestion.JSON_ADAPTER);
            }
            if (coreData.priorityLike != null) {
                jsonGenerator.writeFieldName("priorityLike");
                PriorityLike.JSON_ADAPTER.serialize(coreData.priorityLike, jsonGenerator, true);
            }
            if (coreData.couponBag != null) {
                jsonGenerator.writeFieldName("couponBag");
                Couponbag.JSON_ADAPTER.serialize(coreData.couponBag, jsonGenerator, true);
            }
            if (coreData.userStickers != null) {
                jsonGenerator.writeFieldName("userStickers");
                JsonAdapter.serializeArray(coreData.userStickers, jsonGenerator, UserSticker.JSON_ADAPTER);
            }
            if (coreData.redPackets != null) {
                jsonGenerator.writeFieldName("redPackets");
                JsonAdapter.serializeArray(coreData.redPackets, jsonGenerator, RedPacket.JSON_ADAPTER);
            }
            if (coreData.giftInfos != null) {
                jsonGenerator.writeFieldName("giftInfos");
                JsonAdapter.serializeArray(coreData.giftInfos, jsonGenerator, CoreGiftInfo.JSON_ADAPTER);
            }
            if (coreData.counterVerification != null) {
                jsonGenerator.writeFieldName("counterVerification");
                CounterVerification.JSON_ADAPTER.serialize(coreData.counterVerification, jsonGenerator, true);
            }
            if (coreData.liveSchemas != null) {
                jsonGenerator.writeFieldName("liveSchemas");
                JsonAdapter.serializeArray(coreData.liveSchemas, jsonGenerator, LiveSchema.JSON_ADAPTER);
            }
            if (coreData.friends != null) {
                jsonGenerator.writeFieldName("friends");
                JsonAdapter.serializeArray(coreData.friends, jsonGenerator, FriendInfo.JSON_ADAPTER);
            }
            jsonGenerator.writeFieldName("nextTime");
            Converter.API_TIME.serialize(Double.valueOf(coreData.nextTime), jsonGenerator, true);
            if (coreData.conversationDiff != null) {
                jsonGenerator.writeFieldName("conversationDiff");
                ConversationDiff.JSON_ADAPTER.serialize(coreData.conversationDiff, jsonGenerator, true);
            }
            if (coreData.comStatusAwards != null) {
                jsonGenerator.writeFieldName("comStatusAwards");
                JsonAdapter.serializeArray(coreData.comStatusAwards, jsonGenerator, ComStatusAward.JSON_ADAPTER);
            }
            if (coreData.cardStyles != null) {
                jsonGenerator.writeFieldName("cardStyles");
                JsonAdapter.serializeArray(coreData.cardStyles, jsonGenerator, CardStyle.JSON_ADAPTER);
            }
            if (coreData.audioTexts != null) {
                jsonGenerator.writeFieldName("audioTexts");
                JsonAdapter.serializeArray(coreData.audioTexts, jsonGenerator, AudioText.JSON_ADAPTER);
            }
            if (coreData.giftGuide != null) {
                jsonGenerator.writeFieldName("giftGuide");
                CoreGiftGuide.JSON_ADAPTER.serialize(coreData.giftGuide, jsonGenerator, true);
            }
            if (coreData.giftPanel != null) {
                jsonGenerator.writeFieldName("giftPanel");
                JsonAdapter.serializeArray(coreData.giftPanel, jsonGenerator, CoreGiftPanel.JSON_ADAPTER);
            }
            if (coreData.giftWallSocials != null) {
                jsonGenerator.writeFieldName("giftWallSocials");
                JsonAdapter.serializeArray(coreData.giftWallSocials, jsonGenerator, GiftWallSocial.JSON_ADAPTER);
            }
            if (coreData.giftWallRankInfos != null) {
                jsonGenerator.writeFieldName("giftWallRankInfos");
                JsonAdapter.serializeArray(coreData.giftWallRankInfos, jsonGenerator, GiftWallRankInfo.JSON_ADAPTER);
            }
            if (coreData.giftWallTitles != null) {
                jsonGenerator.writeFieldName("giftWallTitles");
                JsonAdapter.serializeArray(coreData.giftWallTitles, jsonGenerator, GiftWallTitle.JSON_ADAPTER);
            }
            if (coreData.newGiftWalls != null) {
                jsonGenerator.writeFieldName("newGiftWalls");
                JsonAdapter.serializeArray(coreData.newGiftWalls, jsonGenerator, NewGiftWall.JSON_ADAPTER);
            }
            if (coreData.purchaseDialogConfigs != null) {
                jsonGenerator.writeFieldName("purchaseDialogConf");
                PurchaseDialogConfigs.JSON_ADAPTER.serialize(coreData.purchaseDialogConfigs, jsonGenerator, true);
            }
            if (coreData.greetings != null) {
                jsonGenerator.writeFieldName("greetings");
                JsonAdapter.serializeArray(coreData.greetings, jsonGenerator, Greeting.JSON_ADAPTER);
            }
            if (coreData.greetingCounter != null) {
                jsonGenerator.writeFieldName("greetingCounter");
                GreetingCounter.JSON_ADAPTER.serialize(coreData.greetingCounter, jsonGenerator, true);
            }
            if (coreData.greetingPermissions != null) {
                jsonGenerator.writeFieldName("greetingPermissions");
                JsonAdapter.serializeArray(coreData.greetingPermissions, jsonGenerator, GreetingPermission.JSON_ADAPTER);
            }
            if (coreData.greetingSummary != null) {
                jsonGenerator.writeFieldName("greetingSummary");
                GreetingSummary.JSON_ADAPTER.serialize(coreData.greetingSummary, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(TrackReferenceTypeBox.TYPE1, coreData.hint);
            if (coreData.cardExtraInfos != null) {
                jsonGenerator.writeFieldName("cardExtraInfos");
                JsonAdapter.serializeArray(coreData.cardExtraInfos, jsonGenerator, CardExtraInfo.JSON_ADAPTER);
            }
            if (coreData.readMessages != null) {
                jsonGenerator.writeFieldName("readMessages");
                JsonAdapter.serializeArray(coreData.readMessages, jsonGenerator, ReadMessage.JSON_ADAPTER);
            }
            if (coreData.recentConversations != null) {
                jsonGenerator.writeFieldName("recentConversations");
                JsonAdapter.serializeArray(coreData.recentConversations, jsonGenerator, RecentConversation.JSON_ADAPTER);
            }
            if (coreData.orderInfos != null) {
                jsonGenerator.writeFieldName("orderInfos");
                JsonAdapter.serializeArray(coreData.orderInfos, jsonGenerator, OrderInfo.JSON_ADAPTER);
            }
            if (coreData.quickchatCard != null) {
                jsonGenerator.writeFieldName("card");
                QuickChatCardInfo.JSON_ADAPTER.serialize(coreData.quickchatCard, jsonGenerator, true);
            }
            if (coreData.picksUsers != null) {
                jsonGenerator.writeFieldName("picksUsers");
                JsonAdapter.serializeArray(coreData.picksUsers, jsonGenerator, PicksUser.JSON_ADAPTER);
            }
            if (coreData.picks != null) {
                jsonGenerator.writeFieldName("picks");
                Picks.JSON_ADAPTER.serialize(coreData.picks, jsonGenerator, true);
            }
            if (coreData.countdownLikes != null) {
                jsonGenerator.writeFieldName("countdownLikes");
                JsonAdapter.serializeArray(coreData.countdownLikes, jsonGenerator, CountdownItem.JSON_ADAPTER);
            }
            if (coreData.greetingSetting != null) {
                jsonGenerator.writeFieldName("greetingSetting");
                GreetingSetting.JSON_ADAPTER.serialize(coreData.greetingSetting, jsonGenerator, true);
            }
            if (coreData.onlineLiveChatPair != null) {
                jsonGenerator.writeFieldName("onlineLiveChatPair");
                OnlineLiveChatPair.JSON_ADAPTER.serialize(coreData.onlineLiveChatPair, jsonGenerator, true);
            }
            if (coreData.likedMes != null) {
                jsonGenerator.writeFieldName("likedMes");
                JsonAdapter.serializeArray(coreData.likedMes, jsonGenerator, CardStyle.JSON_ADAPTER);
            }
            if (coreData.myMeet != null) {
                jsonGenerator.writeFieldName(SchemeKey.myMeet);
                MyMeetExtra.JSON_ADAPTER.serialize(coreData.myMeet, jsonGenerator, true);
            }
            if (coreData.moments != null) {
                jsonGenerator.writeFieldName(Moments.TYPE);
                JsonAdapter.serializeArray(coreData.moments, jsonGenerator, CoreMomentInfo.JSON_ADAPTER);
            }
            if (coreData.voicechat != null) {
                jsonGenerator.writeFieldName("voicechat");
                VoiceChatInfo.JSON_ADAPTER.serialize(coreData.voicechat, jsonGenerator, true);
            }
            if (coreData.bell != null) {
                jsonGenerator.writeFieldName("bell");
                QuickChatBellData.JSON_ADAPTER.serialize(coreData.bell, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isHit", coreData.isHit);
            if (coreData.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(coreData.user, jsonGenerator, true);
            }
            if (coreData.literaturesComments != null) {
                jsonGenerator.writeFieldName("literaturesComments");
                JsonAdapter.serializeArray(coreData.literaturesComments, jsonGenerator, LiteraturesComments.JSON_ADAPTER);
            }
            if (coreData.literatures != null) {
                jsonGenerator.writeFieldName(Literatures.TYPE);
                JsonAdapter.serializeArray(coreData.literatures, jsonGenerator, Literatures.JSON_ADAPTER);
            }
            if (coreData.membershipRecommendUsers != null) {
                jsonGenerator.writeFieldName("membershipRecommendUsers");
                JsonAdapter.serializeArray(coreData.membershipRecommendUsers, jsonGenerator, MembershipRecommendUser.JSON_ADAPTER);
            }
            if (coreData.freeTrialInfo != null) {
                jsonGenerator.writeFieldName("freeTrialInfo");
                FreeTrialInfo.JSON_ADAPTER.serialize(coreData.freeTrialInfo, jsonGenerator, true);
            }
            if (coreData.freeTrialOperateResult != null) {
                jsonGenerator.writeFieldName("freeTrialOperateResult");
                FreeTrialOperateResult.JSON_ADAPTER.serialize(coreData.freeTrialOperateResult, jsonGenerator, true);
            }
            if (coreData.speedUpCard != null) {
                jsonGenerator.writeFieldName("speedUpCard");
                Note.JSON_ADAPTER.serialize(coreData.speedUpCard, jsonGenerator, true);
            }
            if (coreData.states != null) {
                jsonGenerator.writeFieldName("states");
                JsonAdapter.serializeArray(coreData.states, jsonGenerator, BubbleInfo.JSON_ADAPTER);
            }
            if (coreData.thirdPartyInfo != null) {
                jsonGenerator.writeFieldName("thirdPartyInfo");
                ThirdPartyInfo.JSON_ADAPTER.serialize(coreData.thirdPartyInfo, jsonGenerator, true);
            }
            if (coreData.evaluations != null) {
                jsonGenerator.writeFieldName("evaluations");
                JsonAdapter.serializeArray(coreData.evaluations, jsonGenerator, Evaluation.JSON_ADAPTER);
            }
            if (coreData.evaluationReports != null) {
                jsonGenerator.writeFieldName("evaluationReports");
                JsonAdapter.serializeArray(coreData.evaluationReports, jsonGenerator, EvaluationReport.JSON_ADAPTER);
            }
            if (coreData.msgData != null) {
                jsonGenerator.writeFieldName("msgData");
                MessageFeedbackStatus.JSON_ADAPTER.serialize(coreData.msgData, jsonGenerator, true);
            }
            if (coreData.evaluation != null) {
                jsonGenerator.writeFieldName(Evaluation.TYPE);
                Evaluation.JSON_ADAPTER.serialize(coreData.evaluation, jsonGenerator, true);
            }
            if (coreData.privilegeGifts != null) {
                jsonGenerator.writeFieldName("privilegeGifts");
                JsonAdapter.serializeArray(coreData.privilegeGifts, jsonGenerator, PrivilegeGift.JSON_ADAPTER);
            }
            if (coreData.recommendMessages != null) {
                jsonGenerator.writeFieldName("recommendMessages");
                JsonAdapter.serializeArray(coreData.recommendMessages, jsonGenerator, RecommendMessage.JSON_ADAPTER);
            }
            if (coreData.greets != null) {
                jsonGenerator.writeFieldName("greets");
                JsonAdapter.serializeArray(coreData.greets, jsonGenerator, UserGreetInfo.JSON_ADAPTER);
            }
            if (coreData.cardModels != null) {
                jsonGenerator.writeFieldName("cardModels");
                JsonAdapter.serializeArray(coreData.cardModels, jsonGenerator, CardModel.JSON_ADAPTER);
            }
            if (coreData.heartbeatMatch != null) {
                jsonGenerator.writeFieldName("heartbeatMatch");
                HeartBeatMatched.JSON_ADAPTER.serialize(coreData.heartbeatMatch, jsonGenerator, true);
            }
            if (coreData.oneside != null) {
                jsonGenerator.writeFieldName(ConversationAdditionalTagType.oneside);
                QuickChatOneside.JSON_ADAPTER.serialize(coreData.oneside, jsonGenerator, true);
            }
            if (coreData.myMeetListV3 != null) {
                jsonGenerator.writeFieldName("myMeetListV3");
                MyMeetListV3.JSON_ADAPTER.serialize(coreData.myMeetListV3, jsonGenerator, true);
            }
            if (coreData.myMeetEntryV3 != null) {
                jsonGenerator.writeFieldName("myMeetEntryV3");
                MyMeetEntryV3.JSON_ADAPTER.serialize(coreData.myMeetEntryV3, jsonGenerator, true);
            }
            if (coreData.intlInsertCardSets != null) {
                jsonGenerator.writeFieldName("intlInsertCardSets");
                JsonAdapter.serializeArray(coreData.intlInsertCardSets, jsonGenerator, InsertCard.JSON_ADAPTER);
            }
            if (coreData.actives != null) {
                jsonGenerator.writeFieldName("actives");
                JsonAdapter.serializeArray(coreData.actives, jsonGenerator, Active.JSON_ADAPTER);
            }
            if (coreData.cardsIcons != null) {
                jsonGenerator.writeFieldName("cardsIcons");
                JsonAdapter.serializeArray(coreData.cardsIcons, jsonGenerator, CardsIcons.JSON_ADAPTER);
            }
            if (coreData.tacitTest != null) {
                jsonGenerator.writeFieldName("tacitTest");
                TacitTestProfileCard.JSON_ADAPTER.serialize(coreData.tacitTest, jsonGenerator, true);
            }
            if (coreData.iceBreakings != null) {
                jsonGenerator.writeFieldName("iceBreakings");
                JsonAdapter.serializeArray(coreData.iceBreakings, jsonGenerator, BreakIce.JSON_ADAPTER);
            }
            if (coreData.greetingHotLevelInfo != null) {
                jsonGenerator.writeFieldName("greetingHotLevelInfo");
                GreetingHotLevelInfo.JSON_ADAPTER.serialize(coreData.greetingHotLevelInfo, jsonGenerator, true);
            }
            if (coreData.voices != null) {
                jsonGenerator.writeFieldName("voices");
                JsonAdapter.serializeArray(coreData.voices, jsonGenerator, Voice.JSON_ADAPTER);
            }
            String str = coreData.avatar;
            if (str != null) {
                jsonGenerator.writeStringField("avatar", str);
            }
            if (coreData.suggestUsers != null) {
                jsonGenerator.writeFieldName("suggestUsers");
                JsonAdapter.serializeArray(coreData.suggestUsers, jsonGenerator, SpecialSuggestUsers.JSON_ADAPTER);
            }
            if (coreData.action != null) {
                jsonGenerator.writeFieldName("action");
                ActionData.JSON_ADAPTER.serialize(coreData.action, jsonGenerator, true);
            }
            if (coreData.tagLoadStrategy != null) {
                jsonGenerator.writeFieldName("tagLoadStrategy");
                TagStrategy.JSON_ADAPTER.serialize(coreData.tagLoadStrategy, jsonGenerator, true);
            }
            if (coreData.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(coreData.tags, jsonGenerator, NewTags.JSON_ADAPTER);
            }
            if (coreData.tagCategoryStrategy != null) {
                jsonGenerator.writeFieldName("tagCategoryStrategy");
                TagStrategy.JSON_ADAPTER.serialize(coreData.tagCategoryStrategy, jsonGenerator, true);
            }
            if (coreData.tagCategories != null) {
                jsonGenerator.writeFieldName("tagCategories");
                JsonAdapter.serializeArray(coreData.tagCategories, jsonGenerator, TagCategories.JSON_ADAPTER);
            }
            if (coreData.tagUserCounts != null) {
                jsonGenerator.writeFieldName("tagUserCounts");
                JsonAdapter.serializeArray(coreData.tagUserCounts, jsonGenerator, TagUserCounts.JSON_ADAPTER);
            }
            if (coreData.sames != null) {
                jsonGenerator.writeFieldName("sames");
                JsonAdapter.serializeArray(coreData.sames, jsonGenerator, SamesCardData.JSON_ADAPTER);
            }
            if (coreData.literatureConfigInfo != null) {
                jsonGenerator.writeFieldName("literatureConfigInfo");
                LiteratureConfigInfo.JSON_ADAPTER.serialize(coreData.literatureConfigInfo, jsonGenerator, true);
            }
            if (coreData.anonymousSummary != null) {
                jsonGenerator.writeFieldName("anonymousSummary");
                GreetingSummary.JSON_ADAPTER.serialize(coreData.anonymousSummary, jsonGenerator, true);
            }
            if (coreData.cardInfos != null) {
                jsonGenerator.writeFieldName("cardInfos");
                JsonAdapter.serializeArray(coreData.cardInfos, jsonGenerator, CardInfos.JSON_ADAPTER);
            }
            if (coreData.seeInfos != null) {
                jsonGenerator.writeFieldName("seeInfos");
                JsonAdapter.serializeArray(coreData.seeInfos, jsonGenerator, SeeInfos.JSON_ADAPTER);
            }
            if (coreData.seePortraits != null) {
                jsonGenerator.writeFieldName("seePortraits");
                JsonAdapter.serializeArray(coreData.seePortraits, jsonGenerator, SeePortrait.JSON_ADAPTER);
            }
            if (coreData.profileLikesComments != null) {
                jsonGenerator.writeFieldName("profileLikesComments");
                JsonAdapter.serializeArray(coreData.profileLikesComments, jsonGenerator, ProfileLikeComment.JSON_ADAPTER);
            }
            if (coreData.profileLikeCounter != null) {
                jsonGenerator.writeFieldName("profileLikeCounter");
                ExpandedProfileLikeCounter.JSON_ADAPTER.serialize(coreData.profileLikeCounter, jsonGenerator, true);
            }
            if (coreData.extraPrivileges != null) {
                jsonGenerator.writeFieldName("extraPrivileges");
                ExtraPrivileges.JSON_ADAPTER.serialize(coreData.extraPrivileges, jsonGenerator, true);
            }
            if (coreData.selectedQuestion != null) {
                jsonGenerator.writeFieldName("selectedQuestion");
                ProfileSelectedQue.JSON_ADAPTER.serialize(coreData.selectedQuestion, jsonGenerator, true);
            }
            if (coreData.likeUsers != null) {
                jsonGenerator.writeFieldName("likeUsers");
                JsonAdapter.serializeArray(coreData.likeUsers, jsonGenerator, LikeUser.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("next", coreData.next);
            if (coreData.cipherId != null) {
                jsonGenerator.writeFieldName("cipherId");
                CipherId.JSON_ADAPTER.serialize(coreData.cipherId, jsonGenerator, true);
            }
            if (coreData.shareId != null) {
                jsonGenerator.writeFieldName("shareId");
                ShareId.JSON_ADAPTER.serialize(coreData.shareId, jsonGenerator, true);
            }
            if (coreData.stateEmotion != null) {
                jsonGenerator.writeFieldName("stateEmotion");
                JsonAdapter.serializeArray(coreData.stateEmotion, jsonGenerator, StateEmotion.JSON_ADAPTER);
            }
            if (coreData.seePortraitCounter != null) {
                jsonGenerator.writeFieldName("seePortraitCounter");
                SeePortraitCounter.JSON_ADAPTER.serialize(coreData.seePortraitCounter, jsonGenerator, true);
            }
            if (coreData.recommended != null) {
                jsonGenerator.writeFieldName(Recommended.TYPE);
                JsonAdapter.serializeArray(coreData.recommended, jsonGenerator, Recommended.JSON_ADAPTER);
            }
            if (coreData.chatHeats != null) {
                jsonGenerator.writeFieldName("chatHeats");
                JsonAdapter.serializeArray(coreData.chatHeats, jsonGenerator, ChatHeat.JSON_ADAPTER);
            }
            if (coreData.chatHeatPermissions != null) {
                jsonGenerator.writeFieldName("chatHeatPermissions");
                JsonAdapter.serializeArray(coreData.chatHeatPermissions, jsonGenerator, PermissionsItem.JSON_ADAPTER);
            }
            if (coreData.resources != null) {
                jsonGenerator.writeFieldName("resources");
                JsonAdapter.serializeArray(coreData.resources, jsonGenerator, ResourceTriggers.JSON_ADAPTER);
            }
            if (coreData.greetingResult != null) {
                jsonGenerator.writeFieldName("greetingResult");
                GreetingResult.JSON_ADAPTER.serialize(coreData.greetingResult, jsonGenerator, true);
            }
            if (coreData.latestMoments != null) {
                jsonGenerator.writeFieldName("latestMoments");
                JsonAdapter.serializeArray(coreData.latestMoments, jsonGenerator, ConversationLatestMoment.JSON_ADAPTER);
            }
            if (coreData.jmpTarget != null) {
                jsonGenerator.writeFieldName("jmpTarget");
                JmpTarget.JSON_ADAPTER.serialize(coreData.jmpTarget, jsonGenerator, true);
            }
            if (coreData.buzzUsers != null) {
                jsonGenerator.writeFieldName("buzzUsers");
                JsonAdapter.serializeArray(coreData.buzzUsers, jsonGenerator, BuzzUser.JSON_ADAPTER);
            }
            if (coreData.odiamondList != null) {
                jsonGenerator.writeFieldName("odiamondList");
                ODiamondListItem.JSON_ADAPTER.serialize(coreData.odiamondList, jsonGenerator, true);
            }
            if (coreData.popGuide != null) {
                jsonGenerator.writeFieldName("popGuide");
                PopGuide.JSON_ADAPTER.serialize(coreData.popGuide, jsonGenerator, true);
            }
            if (coreData.superLikeCount != null) {
                jsonGenerator.writeFieldName("superLikeCount");
                JsonAdapter.serializeArray(coreData.superLikeCount, jsonGenerator, SuperLikeCount.JSON_ADAPTER);
            }
            if (coreData.floats != null) {
                jsonGenerator.writeFieldName("floats");
                JsonAdapter.serializeArray(coreData.floats, jsonGenerator, FloatsCardData.JSON_ADAPTER);
            }
            if (coreData.monetizationMsg != null) {
                jsonGenerator.writeFieldName("monetizationMsg");
                MonetizationMsg.JSON_ADAPTER.serialize(coreData.monetizationMsg, jsonGenerator, true);
            }
            String str2 = coreData.link;
            if (str2 != null) {
                jsonGenerator.writeStringField(Link.TYPE, str2);
            }
            if (coreData.tab != null) {
                jsonGenerator.writeFieldName("tab");
                GrowthMomentThemeCardInfo.JSON_ADAPTER.serialize(coreData.tab, jsonGenerator, true);
            }
            if (coreData.seeExposedUser != null) {
                jsonGenerator.writeFieldName("seeExposedUser");
                SeeExposedUser.JSON_ADAPTER.serialize(coreData.seeExposedUser, jsonGenerator, true);
            }
            if (coreData.exposureInfo != null) {
                jsonGenerator.writeFieldName("exposureInfo");
                GrowthExposureInfo.JSON_ADAPTER.serialize(coreData.exposureInfo, jsonGenerator, true);
            }
            if (coreData.love520 != null) {
                jsonGenerator.writeFieldName("love520");
                JsonAdapter.serializeArray(coreData.love520, jsonGenerator, SamesCardData.JSON_ADAPTER);
            }
            String str3 = coreData.payWill;
            if (str3 != null) {
                jsonGenerator.writeStringField("payWill", str3);
            }
            if (coreData.extremePickByList != null) {
                jsonGenerator.writeFieldName("extremePickByList");
                JsonAdapter.serializeArray(coreData.extremePickByList, jsonGenerator, ExtremePickItem.JSON_ADAPTER);
            }
            if (coreData.chatGameInfo != null) {
                jsonGenerator.writeFieldName("chatGameInfo");
                ChatGameInfo.JSON_ADAPTER.serialize(coreData.chatGameInfo, jsonGenerator, true);
            }
            if (coreData.camping != null) {
                jsonGenerator.writeFieldName("camping");
                JsonAdapter.serializeArray(coreData.camping, jsonGenerator, SamesCardData.JSON_ADAPTER);
            }
            if (coreData.recallMatch != null) {
                jsonGenerator.writeFieldName("recallMatch");
                RecallMatch.JSON_ADAPTER.serialize(coreData.recallMatch, jsonGenerator, true);
            }
            if (coreData.liveActivities != null) {
                jsonGenerator.writeFieldName("liveActivities");
                JsonAdapter.serializeArray(coreData.liveActivities, jsonGenerator, BCoreLiveActivity.JSON_ADAPTER);
            }
            if (coreData.mkt_activity_regular != null) {
                jsonGenerator.writeFieldName("mkt_activity_regular");
                JsonAdapter.serializeArray(coreData.mkt_activity_regular, jsonGenerator, SamesCardData.JSON_ADAPTER);
            }
            if (coreData.monetizationChatSeeUser != null) {
                jsonGenerator.writeFieldName("monetizationChatSeeUser");
                MonetizationChatSeeUser.JSON_ADAPTER.serialize(coreData.monetizationChatSeeUser, jsonGenerator, true);
            }
            if (coreData.intlVisitorInfo != null) {
                jsonGenerator.writeFieldName("intlVisitorInfo");
                JsonAdapter.serializeArray(coreData.intlVisitorInfo, jsonGenerator, IntlVisitor.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("count", coreData.count);
            if (coreData.invalidCardList != null) {
                jsonGenerator.writeFieldName("ids");
                JsonAdapter.serializeArray(coreData.invalidCardList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (coreData.chatAssistantQuestions != null) {
                jsonGenerator.writeFieldName("chatAssistantQuestions");
                JsonAdapter.serializeArray(coreData.chatAssistantQuestions, jsonGenerator, ChatAssistantQuestion.JSON_ADAPTER);
            }
            if (coreData.mkt_activity_quiz != null) {
                jsonGenerator.writeFieldName("mkt_activity_quiz");
                JsonAdapter.serializeArray(coreData.mkt_activity_quiz, jsonGenerator, SamesCardData.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isRecallUser", coreData.isRecallUser);
            if (coreData.greetingNewPeople != null) {
                jsonGenerator.writeFieldName("greetingNewPeople");
                JsonAdapter.serializeArray(coreData.greetingNewPeople, jsonGenerator, UserIdType.JSON_ADAPTER);
            }
            if (coreData.greetingNewPeopleMessage != null) {
                jsonGenerator.writeFieldName("greetingNewPeopleMessage");
                JsonAdapter.serializeArray(coreData.greetingNewPeopleMessage, jsonGenerator, GreetingNewPeopleMessage.JSON_ADAPTER);
            }
            if (coreData.extremeQuestions != null) {
                jsonGenerator.writeFieldName("extremeQuestions");
                ExtremeQuestions.JSON_ADAPTER.serialize(coreData.extremeQuestions, jsonGenerator, true);
            }
            if (coreData.boostResultEntry != null) {
                jsonGenerator.writeFieldName("boostResultEntry");
                BoostResultEntry.JSON_ADAPTER.serialize(coreData.boostResultEntry, jsonGenerator, true);
            }
            if (coreData.todayMatchInfo != null) {
                jsonGenerator.writeFieldName("todayMatchInfo");
                MatchInfo.JSON_ADAPTER.serialize(coreData.todayMatchInfo, jsonGenerator, true);
            }
            if (coreData.growthMesInfo != null) {
                jsonGenerator.writeFieldName("growthMesInfo");
                GrowthMesInfo.JSON_ADAPTER.serialize(coreData.growthMesInfo, jsonGenerator, true);
            }
            if (coreData.aiPictureAuth != null) {
                jsonGenerator.writeFieldName("aiPictureAuth");
                AiPictureAuth.JSON_ADAPTER.serialize(coreData.aiPictureAuth, jsonGenerator, true);
            }
            if (coreData.acceleratePairing != null) {
                jsonGenerator.writeFieldName("acceleratePairing");
                AcceleratePairingStatus.JSON_ADAPTER.serialize(coreData.acceleratePairing, jsonGenerator, true);
            }
            if (coreData.invitation != null) {
                jsonGenerator.writeFieldName("invitation");
                QuickChatPartyInvitation.JSON_ADAPTER.serialize(coreData.invitation, jsonGenerator, true);
            }
            if (coreData.campaignPage != null) {
                jsonGenerator.writeFieldName("campaignPage");
                QuickChatPartyCampaignPage.JSON_ADAPTER.serialize(coreData.campaignPage, jsonGenerator, true);
            }
            if (coreData.partner != null) {
                jsonGenerator.writeFieldName("partner");
                GrowthPartner.JSON_ADAPTER.serialize(coreData.partner, jsonGenerator, true);
            }
            if (coreData.cityCData != null) {
                jsonGenerator.writeFieldName("cityCData");
                JsonAdapter.serializeArray(coreData.cityCData, jsonGenerator, CityCData.JSON_ADAPTER);
            }
            if (coreData.blindbox != null) {
                jsonGenerator.writeFieldName("blindbox");
                GrowthBlindBox.JSON_ADAPTER.serialize(coreData.blindbox, jsonGenerator, true);
            }
            if (coreData.unReadUserIds != null) {
                jsonGenerator.writeFieldName("unReadUserIds");
                JsonAdapter.serializeArray(coreData.unReadUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (coreData.cityCBanner != null) {
                jsonGenerator.writeFieldName("cityCBanner");
                CityCBanner.JSON_ADAPTER.serialize(coreData.cityCBanner, jsonGenerator, true);
            }
            if (coreData.chatPartners != null) {
                jsonGenerator.writeFieldName("chatPartners");
                ChatPartners.JSON_ADAPTER.serialize(coreData.chatPartners, jsonGenerator, true);
            }
            if (coreData.chatPartnersSignals != null) {
                jsonGenerator.writeFieldName("chatPartnersSignals");
                JsonAdapter.serializeArray(coreData.chatPartnersSignals, jsonGenerator, ChatPartnersHistoryItem.JSON_ADAPTER);
            }
            if (coreData.surpriseGift != null) {
                jsonGenerator.writeFieldName("surpriseGift");
                SurpriseGift.JSON_ADAPTER.serialize(coreData.surpriseGift, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("surpriseGiftExpirationTime", coreData.surpriseGiftExpirationTime);
            if (coreData.cardCornerMarks != null) {
                jsonGenerator.writeFieldName("cardCornerMarks");
                JsonAdapter.serializeArray(coreData.cardCornerMarks, jsonGenerator, CardCornerMark.JSON_ADAPTER);
            }
            if (coreData.lowPhotoResult != null) {
                jsonGenerator.writeFieldName("lowPhotoResult");
                PhotoLowModelData.JSON_ADAPTER.serialize(coreData.lowPhotoResult, jsonGenerator, true);
            }
            if (coreData.mkt_activity_flash != null) {
                jsonGenerator.writeFieldName("mkt_activity_flash");
                JsonAdapter.serializeArray(coreData.mkt_activity_flash, jsonGenerator, SamesCardData.JSON_ADAPTER);
            }
            if (coreData.cityCConfig != null) {
                jsonGenerator.writeFieldName("cityCConfig");
                CityCConfig.JSON_ADAPTER.serialize(coreData.cityCConfig, jsonGenerator, true);
            }
            if (coreData.privateCustomSetting != null) {
                jsonGenerator.writeFieldName("privateCustomSetting");
                PrivateCustomSetting.JSON_ADAPTER.serialize(coreData.privateCustomSetting, jsonGenerator, true);
            }
            if (coreData.privateCustomResults != null) {
                jsonGenerator.writeFieldName("privateCustomResults");
                PrivateCustomResult.JSON_ADAPTER.serialize(coreData.privateCustomResults, jsonGenerator, true);
            }
            if (coreData.visitorSetting != null) {
                jsonGenerator.writeFieldName("userMomentSetting");
                VisitorSetting.JSON_ADAPTER.serialize(coreData.visitorSetting, jsonGenerator, true);
            }
            if (coreData.visitorHiddens != null) {
                jsonGenerator.writeFieldName("visitorHiddens");
                JsonAdapter.serializeArray(coreData.visitorHiddens, jsonGenerator, VisitorHidden.JSON_ADAPTER);
            }
            if (coreData.marriageGuide != null) {
                jsonGenerator.writeFieldName(SchemeKey.marriageGuide);
                MarriageGuide.JSON_ADAPTER.serialize(coreData.marriageGuide, jsonGenerator, true);
            }
            if (coreData.selectionUsers != null) {
                jsonGenerator.writeFieldName("selectionUsers");
                JsonAdapter.serializeArray(coreData.selectionUsers, jsonGenerator, SelectionUser.JSON_ADAPTER);
            }
            if (coreData.selectionUserInfo != null) {
                jsonGenerator.writeFieldName("selectionUserInfo");
                SelectionUserInfo.JSON_ADAPTER.serialize(coreData.selectionUserInfo, jsonGenerator, true);
            }
            if (coreData.userAudits != null) {
                jsonGenerator.writeFieldName("userAudits");
                JsonAdapter.serializeArray(coreData.userAudits, jsonGenerator, UserAudits.JSON_ADAPTER);
            }
            if (coreData.dynamicLabels != null) {
                jsonGenerator.writeFieldName("dynamicLabels");
                JsonAdapter.serializeArray(coreData.dynamicLabels, jsonGenerator, DynamicLable.JSON_ADAPTER);
            }
            if (coreData.details != null) {
                jsonGenerator.writeFieldName(ErrorBundle.DETAIL_ENTRY);
                JsonAdapter.serializeArray(coreData.details, jsonGenerator, DetectText.JSON_ADAPTER);
            }
            if (coreData.layer != null) {
                jsonGenerator.writeFieldName("layer");
                ColdStartLayer.JSON_ADAPTER.serialize(coreData.layer, jsonGenerator, true);
            }
            if (coreData.auditPictureTags != null) {
                jsonGenerator.writeFieldName("auditPictureTags");
                JsonAdapter.serializeArray(coreData.auditPictureTags, jsonGenerator, AuditPictureTag.JSON_ADAPTER);
            }
            if (coreData.myTabGuide != null) {
                jsonGenerator.writeFieldName("myTabGuide");
                DatingGuideData.JSON_ADAPTER.serialize(coreData.myTabGuide, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("profileGuide", coreData.profileGuide);
            if (coreData.tagPictureStrategy != null) {
                jsonGenerator.writeFieldName("tagPictureStrategy");
                TagStrategy.JSON_ADAPTER.serialize(coreData.tagPictureStrategy, jsonGenerator, true);
            }
            if (coreData.pictureTags != null) {
                jsonGenerator.writeFieldName("pictureTags");
                JsonAdapter.serializeArray(coreData.pictureTags, jsonGenerator, NewTags.JSON_ADAPTER);
            }
            if (coreData.fakeSuggest != null) {
                jsonGenerator.writeFieldName("fakeSuggest");
                FakeQuickChatSuggestStatus.JSON_ADAPTER.serialize(coreData.fakeSuggest, jsonGenerator, true);
            }
            if (coreData.userRisk != null) {
                jsonGenerator.writeFieldName("userRisk");
                RiskOtherData.JSON_ADAPTER.serialize(coreData.userRisk, jsonGenerator, true);
            }
            if (coreData.descriptionRisk != null) {
                jsonGenerator.writeFieldName("descriptionRisk");
                RiskOtherData.JSON_ADAPTER.serialize(coreData.descriptionRisk, jsonGenerator, true);
            }
            if (coreData.risks != null) {
                jsonGenerator.writeFieldName("risks");
                JsonAdapter.serializeArray(coreData.risks, jsonGenerator, RiskSelfData.JSON_ADAPTER);
            }
            if (coreData.barLoverPlaces != null) {
                jsonGenerator.writeFieldName("barLoverPlaces");
                JsonAdapter.serializeArray(coreData.barLoverPlaces, jsonGenerator, BarLoverplaces.JSON_ADAPTER);
            }
            if (coreData.barLoverCities != null) {
                jsonGenerator.writeFieldName("barLoverCities");
                JsonAdapter.serializeArray(coreData.barLoverCities, jsonGenerator, BarLoverCitys.JSON_ADAPTER);
            }
            if (coreData.fateRadar != null) {
                jsonGenerator.writeFieldName("fateRadar");
                FateRadar.JSON_ADAPTER.serialize(coreData.fateRadar, jsonGenerator, true);
            }
            if (coreData.svipWeeklyReport != null) {
                jsonGenerator.writeFieldName("svipWeeklyReport");
                SvipWeeklyReport.JSON_ADAPTER.serialize(coreData.svipWeeklyReport, jsonGenerator, true);
            }
            if (coreData.explore != null) {
                jsonGenerator.writeFieldName(Explore.TYPE);
                Explore.JSON_ADAPTER.serialize(coreData.explore, jsonGenerator, true);
            }
            if (coreData.wechat != null) {
                jsonGenerator.writeFieldName("wechat");
                WechatNotifySetting.JSON_ADAPTER.serialize(coreData.wechat, jsonGenerator, true);
            }
            if (coreData.vipSettings != null) {
                jsonGenerator.writeFieldName("vipSettings");
                VipSetting.JSON_ADAPTER.serialize(coreData.vipSettings, jsonGenerator, true);
            }
            if (coreData.iceBreakQuestions != null) {
                jsonGenerator.writeFieldName("iceBreakQuestions");
                JsonAdapter.serializeArray(coreData.iceBreakQuestions, jsonGenerator, IceBreakQuestion.JSON_ADAPTER);
            }
            if (coreData.fakeGuideData != null) {
                jsonGenerator.writeFieldName("fakeGuideData");
                FakeGuideData.JSON_ADAPTER.serialize(coreData.fakeGuideData, jsonGenerator, true);
            }
            if (coreData.userActivityInfos != null) {
                jsonGenerator.writeFieldName("userActivityInfos");
                JsonAdapter.serializeArray(coreData.userActivityInfos, jsonGenerator, UserActivityInfo.JSON_ADAPTER);
            }
            if (coreData.questionnaire != null) {
                jsonGenerator.writeFieldName(Questionnaire.TYPE);
                Questionnaire.JSON_ADAPTER.serialize(coreData.questionnaire, jsonGenerator, true);
            }
            if (coreData.features != null) {
                jsonGenerator.writeFieldName("features");
                QuestionnaireFeature.JSON_ADAPTER.serialize(coreData.features, jsonGenerator, true);
            }
            if (coreData.userStrategyConfiguration != null) {
                jsonGenerator.writeFieldName("userStrategyConfiguration");
                UserStrategyConfiguration.JSON_ADAPTER.serialize(coreData.userStrategyConfiguration, jsonGenerator, true);
            }
            if (coreData.fakePhotoFeedback != null) {
                jsonGenerator.writeFieldName("fakePhotoFeedback");
                JsonAdapter.serializeArray(coreData.fakePhotoFeedback, jsonGenerator, FakePhotoFeedback.JSON_ADAPTER);
            }
            if (coreData.repeatPictureResult != null) {
                jsonGenerator.writeFieldName("repeatPictureResult");
                PhotoLowModelData.JSON_ADAPTER.serialize(coreData.repeatPictureResult, jsonGenerator, true);
            }
            if (coreData.netPictureResult != null) {
                jsonGenerator.writeFieldName("netPictureResult");
                PhotoLowModelData.JSON_ADAPTER.serialize(coreData.netPictureResult, jsonGenerator, true);
            }
            if (coreData.userFeedbackInfo != null) {
                jsonGenerator.writeFieldName("userFeedbackInfo");
                UserFeedbackInfo.JSON_ADAPTER.serialize(coreData.userFeedbackInfo, jsonGenerator, true);
            }
            if (coreData.idealDetails != null) {
                jsonGenerator.writeFieldName("idealDetails");
                JsonAdapter.serializeArray(coreData.idealDetails, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
            if (coreData.idealInfo != null) {
                jsonGenerator.writeFieldName("idealInfo");
                IdealInfo.JSON_ADAPTER.serialize(coreData.idealInfo, jsonGenerator, true);
            }
            if (coreData.idealInfos != null) {
                jsonGenerator.writeFieldName("idealInfos");
                JsonAdapter.serializeArray(coreData.idealInfos, jsonGenerator, IdealInfo.JSON_ADAPTER);
            }
            if (coreData.urlTags != null) {
                jsonGenerator.writeFieldName("urlTags");
                JsonAdapter.serializeArray(coreData.urlTags, jsonGenerator, UrlTag.JSON_ADAPTER);
            }
            if (coreData.profileCounts != null) {
                jsonGenerator.writeFieldName("profileCounts");
                JsonAdapter.serializeArray(coreData.profileCounts, jsonGenerator, ProfileCountInfo.JSON_ADAPTER);
            }
            if (coreData.privateCustomResult != null) {
                jsonGenerator.writeFieldName("privateCustomResult");
                PrivateCustomResult.JSON_ADAPTER.serialize(coreData.privateCustomResult, jsonGenerator, true);
            }
            if (coreData.videoChatSecondFloorSummary != null) {
                jsonGenerator.writeFieldName("videoChatSecondFloorSummary");
                VideoChatSecondFloorSummary.JSON_ADAPTER.serialize(coreData.videoChatSecondFloorSummary, jsonGenerator, true);
            }
            if (coreData.realPicturesBanner != null) {
                jsonGenerator.writeFieldName("realPicturesBanner");
                RealPicturesBanner.JSON_ADAPTER.serialize(coreData.realPicturesBanner, jsonGenerator, true);
            }
            if (coreData.realPicturesInfo != null) {
                jsonGenerator.writeFieldName("realPicturesInfo");
                RealPicturesInfo.JSON_ADAPTER.serialize(coreData.realPicturesInfo, jsonGenerator, true);
            }
            if (coreData.ipRegion != null) {
                jsonGenerator.writeFieldName("ipRegion");
                JsonAdapter.serializeArray(coreData.ipRegion, jsonGenerator, IPRegion.JSON_ADAPTER);
            }
            if (coreData.realFeelInfo != null) {
                jsonGenerator.writeFieldName("realFeelInfo");
                RealFeelInfo.JSON_ADAPTER.serialize(coreData.realFeelInfo, jsonGenerator, true);
            }
            if (coreData.loveLetter != null) {
                jsonGenerator.writeFieldName("loveLetter");
                LoveLetterEntryInfo.JSON_ADAPTER.serialize(coreData.loveLetter, jsonGenerator, true);
            }
            if (coreData.loveLetterGroup != null) {
                jsonGenerator.writeFieldName("loveLetterGroup");
                LoveLetterGroupInfo.JSON_ADAPTER.serialize(coreData.loveLetterGroup, jsonGenerator, true);
            }
            if (coreData.loveLetterContent != null) {
                jsonGenerator.writeFieldName("loveLetterContent");
                LoveLetterContent.JSON_ADAPTER.serialize(coreData.loveLetterContent, jsonGenerator, true);
            }
            if (coreData.chatPage != null) {
                jsonGenerator.writeFieldName("chatPage");
                ChatPage.JSON_ADAPTER.serialize(coreData.chatPage, jsonGenerator, true);
            }
            if (coreData.showOnlineForWhoIMeet != null) {
                jsonGenerator.writeFieldName("showOnlineForWhoIMeet");
                JsonAdapter.serializeArray(coreData.showOnlineForWhoIMeet, jsonGenerator, ShowOnlineForWhoIMeet.JSON_ADAPTER);
            }
            if (coreData.notVerificationResultData != null) {
                jsonGenerator.writeFieldName("notVerificationResultData");
                PhotoLowModelData.JSON_ADAPTER.serialize(coreData.notVerificationResultData, jsonGenerator, true);
            }
            if (coreData.verificationLowLabels != null) {
                jsonGenerator.writeFieldName("verificationLowLabels");
                JsonAdapter.serializeArray(coreData.verificationLowLabels, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (coreData.myTabTasks != null) {
                jsonGenerator.writeFieldName("myTabTasks");
                JsonAdapter.serializeArray(coreData.myTabTasks, jsonGenerator, MyTabTask.JSON_ADAPTER);
            }
            if (coreData.pendingPaymentGuidance != null) {
                jsonGenerator.writeFieldName("pendingPaymentGuidance");
                PendingPaymentGuidance.JSON_ADAPTER.serialize(coreData.pendingPaymentGuidance, jsonGenerator, true);
            }
            if (coreData.seeTrialEligible != null) {
                jsonGenerator.writeFieldName("seeTrialEligible");
                SeeTrialEligible.JSON_ADAPTER.serialize(coreData.seeTrialEligible, jsonGenerator, true);
            }
            if (coreData.seeTrialStatus != null) {
                jsonGenerator.writeFieldName("seeTrialStatus");
                SeeTrialStatus.JSON_ADAPTER.serialize(coreData.seeTrialStatus, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("likedByToday", coreData.likedByToday);
            if (coreData.feedbackQuestions != null) {
                jsonGenerator.writeFieldName("feedbackQuestions");
                JsonAdapter.serializeArray(coreData.feedbackQuestions, jsonGenerator, FeedbackQuestion.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("feedbackRemainedNum", coreData.feedbackRemainedNum);
            if (coreData.instantChat != null) {
                jsonGenerator.writeFieldName("instantChat");
                ConversationInstantChat.JSON_ADAPTER.serialize(coreData.instantChat, jsonGenerator, true);
            }
            if (coreData.aiChatAdvice != null) {
                jsonGenerator.writeFieldName(SummarizedPrivilegesId.aiChatAdvice);
                AIChatAdvice.JSON_ADAPTER.serialize(coreData.aiChatAdvice, jsonGenerator, true);
            }
            if (coreData.aiChatAnalysis != null) {
                jsonGenerator.writeFieldName(SummarizedPrivilegesId.aiChatAnalysis);
                AIChatAnalysis.JSON_ADAPTER.serialize(coreData.aiChatAnalysis, jsonGenerator, true);
            }
            if (coreData.invitationInfo != null) {
                jsonGenerator.writeFieldName("invitationInfo");
                InvitationInfo.JSON_ADAPTER.serialize(coreData.invitationInfo, jsonGenerator, true);
            }
            if (coreData.pictureVerifyRightedInfo != null) {
                jsonGenerator.writeFieldName("pictureVerifyRightedInfo");
                PictureVerifyRightedInfo.JSON_ADAPTER.serialize(coreData.pictureVerifyRightedInfo, jsonGenerator, true);
            }
            if (coreData.diamond != null) {
                jsonGenerator.writeFieldName("diamond");
                IntlCurrencyDiamond.JSON_ADAPTER.serialize(coreData.diamond, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("canChange", coreData.canChange);
            jsonGenerator.writeNumberField("ttcToDiamondRate", coreData.ttcToDiamondRate);
            if (coreData.prologues != null) {
                jsonGenerator.writeFieldName("prologues");
                JsonAdapter.serializeArray(coreData.prologues, jsonGenerator, Prologue.JSON_ADAPTER);
            }
            if (coreData.instantMatchGiveCountInfo != null) {
                jsonGenerator.writeFieldName("instantMatchGiveCountInfo");
                JsonAdapter.serializeArray(coreData.instantMatchGiveCountInfo, jsonGenerator, InstantMatchGiveCountInfo.JSON_ADAPTER);
            }
            if (coreData.creditScores != null) {
                jsonGenerator.writeFieldName("creditScores");
                JsonAdapter.serializeArray(coreData.creditScores, jsonGenerator, CreditScoreData.JSON_ADAPTER);
            }
            if (coreData.dislikedUsers != null) {
                jsonGenerator.writeFieldName("dislikedUsers");
                JsonAdapter.serializeArray(coreData.dislikedUsers, jsonGenerator, DislikedUsers.JSON_ADAPTER);
            }
            if (coreData.analysisGuide != null) {
                jsonGenerator.writeFieldName("analysisGuide");
                AnalysisGuide.JSON_ADAPTER.serialize(coreData.analysisGuide, jsonGenerator, true);
            }
            if (coreData.visitorDoorInfo != null) {
                jsonGenerator.writeFieldName("visitorDoorInfo");
                VisitorDoorInfo.JSON_ADAPTER.serialize(coreData.visitorDoorInfo, jsonGenerator, true);
            }
            if (coreData.visitorInfo != null) {
                jsonGenerator.writeFieldName("visitorInfo");
                JsonAdapter.serializeArray(coreData.visitorInfo, jsonGenerator, VisitorInfo.JSON_ADAPTER);
            }
            if (coreData.instantMatchUserInfo != null) {
                jsonGenerator.writeFieldName("instantMatchUserInfo");
                JsonAdapter.serializeArray(coreData.instantMatchUserInfo, jsonGenerator, InstantMatchUserInfo.JSON_ADAPTER);
            }
            if (coreData.recommendList != null) {
                jsonGenerator.writeFieldName("recommendList");
                JsonAdapter.serializeArray(coreData.recommendList, jsonGenerator, TribeSubset.JSON_ADAPTER);
            }
            if (coreData.intlBubble != null) {
                jsonGenerator.writeFieldName("intlBubble");
                IntlTribeBubble.JSON_ADAPTER.serialize(coreData.intlBubble, jsonGenerator, true);
            }
            if (coreData.membershipUpgradeInfo != null) {
                jsonGenerator.writeFieldName("membershipUpgradeInfo");
                MembershipUpgradeInfo.JSON_ADAPTER.serialize(coreData.membershipUpgradeInfo, jsonGenerator, true);
            }
            if (coreData.ultraRightsUpgradeInfo != null) {
                jsonGenerator.writeFieldName("ultraRightsUpgradeInfo");
                UltraRightsUpgradeInfo.JSON_ADAPTER.serialize(coreData.ultraRightsUpgradeInfo, jsonGenerator, true);
            }
            if (coreData.purchaseSavePop != null) {
                jsonGenerator.writeFieldName("purchaseSavePop");
                PurchaseSavePop.JSON_ADAPTER.serialize(coreData.purchaseSavePop, jsonGenerator, true);
            }
            if (coreData.swipeUpperLimit != null) {
                jsonGenerator.writeFieldName("swipeUpperLimit");
                JsonAdapter.serializeArray(coreData.swipeUpperLimit, jsonGenerator, SwipeUpperLimit.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, coreData.payWillInfo);
            jsonGenerator.writeNumberField("visitorAllCount", coreData.visitorAllCount);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, coreData.payWillScore);
            jsonGenerator.writeNumberField("scoreThreshold", coreData.payWillScoreThreshold);
            jsonGenerator.writeNumberField("scoreThresholdOther", coreData.scoreThresholdOther);
            if (coreData.picksInfo != null) {
                jsonGenerator.writeFieldName("picksInfo");
                JsonAdapter.serializeArray(coreData.picksInfo, jsonGenerator, InstantMatchUserInfo.JSON_ADAPTER);
            }
            if (coreData.superlikeByCounts != null) {
                jsonGenerator.writeFieldName("superlikeByCounts");
                JsonAdapter.serializeArray(coreData.superlikeByCounts, jsonGenerator, SuperlikeByCount.JSON_ADAPTER);
            }
            if (coreData.complimentTexts != null) {
                jsonGenerator.writeFieldName("complimentTexts");
                JsonAdapter.serializeArray(coreData.complimentTexts, jsonGenerator, ComplimentText.JSON_ADAPTER);
            }
            if (coreData.compliment != null) {
                jsonGenerator.writeFieldName("compliment");
                ComplimentFromOther.JSON_ADAPTER.serialize(coreData.compliment, jsonGenerator, true);
            }
            if (coreData.compliments != null) {
                jsonGenerator.writeFieldName("compliments");
                JsonAdapter.serializeArray(coreData.compliments, jsonGenerator, SuggestedComplimentItem.JSON_ADAPTER);
            }
            if (coreData.iapAffiliatePromotions != null) {
                jsonGenerator.writeFieldName(Promotions.TYPE);
                JsonAdapter.serializeArray(coreData.iapAffiliatePromotions, jsonGenerator, IapAffiliatePromotion.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ String m35352O0(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ String m35392b1(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ String m35425k2(String str) {
        return str;
    }

    public static CoreData new_() {
        CoreData coreData = new CoreData();
        coreData.nullCheck();
        return coreData;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m35459u(String str) {
        return str;
    }

    @Override // com.tantanapp.common.data.BaseData
    public void addAll(BaseData baseData) {
        super.addAll(baseData);
        if (baseData instanceof CoreData) {
            CoreData coreData = (CoreData) baseData;
            this.relationships.addAll(coreData.relationships);
            this.conversations.addAll(coreData.conversations);
            this.messages.addAll(coreData.messages);
            this.contacts.addAll(coreData.contacts);
            this.questions.addAll(coreData.questions);
            this.stickers.addAll(coreData.stickers);
            this.packages.addAll(coreData.packages);
            this.bundles.addAll(coreData.bundles);
            this.links.addAll(coreData.links);
            this.reminders.addAll(coreData.reminders);
            this.verificationCenter.addAll(coreData.verificationCenter);
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreData mo223809clone() {
        CoreData coreData = new CoreData();
        List<Relationship> list = this.relationships;
        if (list != null) {
            coreData.relationships = ValueObject.util_map(list, new w9j() { // from class: l.qc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Relationship) obj).mo223809clone();
                }
            });
        }
        List<Conversation> list2 = this.conversations;
        if (list2 != null) {
            coreData.conversations = ValueObject.util_map(list2, new w9j() { // from class: l.sh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Conversation) obj).mo223809clone();
                }
            });
        }
        List<Message> list3 = this.messages;
        if (list3 != null) {
            coreData.messages = ValueObject.util_map(list3, new w9j() { // from class: l.ei8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Message) obj).mo223809clone();
                }
            });
        }
        List<Contact> list4 = this.contacts;
        if (list4 != null) {
            coreData.contacts = ValueObject.util_map(list4, new w9j() { // from class: l.qi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Contact) obj).mo223809clone();
                }
            });
        }
        List<Question> list5 = this.questions;
        if (list5 != null) {
            coreData.questions = ValueObject.util_map(list5, new w9j() { // from class: l.xc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Question) obj).mo223809clone();
                }
            });
        }
        List<Sticker> list6 = this.stickers;
        if (list6 != null) {
            coreData.stickers = ValueObject.util_map(list6, new w9j() { // from class: l.jd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Sticker) obj).mo223809clone();
                }
            });
        }
        List<StickerPackage> list7 = this.packages;
        if (list7 != null) {
            coreData.packages = ValueObject.util_map(list7, new w9j() { // from class: l.vd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((StickerPackage) obj).mo223809clone();
                }
            });
        }
        List<StickerBundle> list8 = this.bundles;
        if (list8 != null) {
            coreData.bundles = ValueObject.util_map(list8, new w9j() { // from class: l.he8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((StickerBundle) obj).mo223809clone();
                }
            });
        }
        List<Link> list9 = this.links;
        if (list9 != null) {
            coreData.links = ValueObject.util_map(list9, new w9j() { // from class: l.ue8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Link) obj).mo223809clone();
                }
            });
        }
        List<School> list10 = this.schools;
        if (list10 != null) {
            coreData.schools = ValueObject.util_map(list10, new w9j() { // from class: l.gf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((School) obj).mo223809clone();
                }
            });
        }
        List<Reminder> list11 = this.reminders;
        if (list11 != null) {
            coreData.reminders = ValueObject.util_map(list11, new w9j() { // from class: l.md8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Reminder) obj).mo223809clone();
                }
            });
        }
        List<VerificationCenter> list12 = this.verificationCenter;
        if (list12 != null) {
            coreData.verificationCenter = ValueObject.util_map(list12, new w9j() { // from class: l.of8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).mo223809clone();
                }
            });
        }
        Wallet wallet = this.wallet;
        if (wallet != null) {
            coreData.wallet = wallet.mo223809clone();
        }
        List<PrivateQuestion> list13 = this.privateQuestions;
        if (list13 != null) {
            coreData.privateQuestions = ValueObject.util_map(list13, new w9j() { // from class: l.ag8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PrivateQuestion) obj).mo223809clone();
                }
            });
        }
        Coin coin = this.coins;
        if (coin != null) {
            coreData.coins = coin.mo223809clone();
        }
        List<UserPrivilege> list14 = this.summarizedPrivileges;
        if (list14 != null) {
            coreData.summarizedPrivileges = ValueObject.util_map(list14, new w9j() { // from class: l.mg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserPrivilege) obj).mo223809clone();
                }
            });
        }
        List<FaceidToken> list15 = this.faceidTokens;
        if (list15 != null) {
            coreData.faceidTokens = ValueObject.util_map(list15, new w9j() { // from class: l.yg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FaceidToken) obj).mo223809clone();
                }
            });
        }
        List<Merchandise> list16 = this.merchandises;
        if (list16 != null) {
            coreData.merchandises = ValueObject.util_map(list16, new w9j() { // from class: l.kh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Merchandise) obj).mo223809clone();
                }
            });
        }
        List<PrivacyMembershipSetting> list17 = this.privacySettings;
        if (list17 != null) {
            coreData.privacySettings = ValueObject.util_map(list17, new w9j() { // from class: l.nh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PrivacyMembershipSetting) obj).mo223809clone();
                }
            });
        }
        List<Figure> list18 = this.figures;
        if (list18 != null) {
            coreData.figures = ValueObject.util_map(list18, new w9j() { // from class: l.ph8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Figure) obj).mo223809clone();
                }
            });
        }
        List<PaymentOrder> list19 = this.orders;
        if (list19 != null) {
            coreData.orders = ValueObject.util_map(list19, new w9j() { // from class: l.qh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PaymentOrder) obj).mo223809clone();
                }
            });
        }
        List<BoostStatus> list20 = this.boostStatus;
        if (list20 != null) {
            coreData.boostStatus = ValueObject.util_map(list20, new w9j() { // from class: l.rh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BoostStatus) obj).mo223809clone();
                }
            });
        }
        List<SummarizedPrivilegePrice> list21 = this.summarizedPrivilegePrices;
        if (list21 != null) {
            coreData.summarizedPrivilegePrices = ValueObject.util_map(list21, new w9j() { // from class: l.th8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SummarizedPrivilegePrice) obj).mo223809clone();
                }
            });
        }
        List<AdvancedSettings> list22 = this.advancedSettings;
        if (list22 != null) {
            coreData.advancedSettings = ValueObject.util_map(list22, new w9j() { // from class: l.uh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AdvancedSettings) obj).mo223809clone();
                }
            });
        }
        List<Surveys> list23 = this.surveys;
        if (list23 != null) {
            coreData.surveys = ValueObject.util_map(list23, new w9j() { // from class: l.vh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Surveys) obj).mo223809clone();
                }
            });
        }
        List<AppealInfo> list24 = this.appealInfos;
        if (list24 != null) {
            coreData.appealInfos = ValueObject.util_map(list24, new w9j() { // from class: l.wh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AppealInfo) obj).mo223809clone();
                }
            });
        }
        List<AutoDeducts> list25 = this.autoDeducts;
        if (list25 != null) {
            coreData.autoDeducts = ValueObject.util_map(list25, new w9j() { // from class: l.xh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AutoDeducts) obj).mo223809clone();
                }
            });
        }
        List<VoiceCall> list26 = this.voiceCall;
        if (list26 != null) {
            coreData.voiceCall = ValueObject.util_map(list26, new w9j() { // from class: l.yh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VoiceCall) obj).mo223809clone();
                }
            });
        }
        List<Complain> list27 = this.complain;
        if (list27 != null) {
            coreData.complain = ValueObject.util_map(list27, new w9j() { // from class: l.ai8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Complain) obj).mo223809clone();
                }
            });
        }
        List<UserLiveLabel> list28 = this.liveLabels;
        if (list28 != null) {
            coreData.liveLabels = ValueObject.util_map(list28, new w9j() { // from class: l.bi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserLiveLabel) obj).mo223809clone();
                }
            });
        }
        List<LikedUser> list29 = this.likedUsers;
        if (list29 != null) {
            coreData.likedUsers = ValueObject.util_map(list29, new w9j() { // from class: l.ci8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LikedUser) obj).mo223809clone();
                }
            });
        }
        List<RefundDetail> list30 = this.refundDetails;
        if (list30 != null) {
            coreData.refundDetails = ValueObject.util_map(list30, new w9j() { // from class: l.di8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RefundDetail) obj).mo223809clone();
                }
            });
        }
        List<WalletAccount> list31 = this.walletAccounts;
        if (list31 != null) {
            coreData.walletAccounts = ValueObject.util_map(list31, new w9j() { // from class: l.fi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((WalletAccount) obj).mo223809clone();
                }
            });
        }
        List<AccountRecord> list32 = this.accountRecords;
        if (list32 != null) {
            coreData.accountRecords = ValueObject.util_map(list32, new w9j() { // from class: l.gi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AccountRecord) obj).mo223809clone();
                }
            });
        }
        MonetizationConfiguration monetizationConfiguration = this.monetizationConfiguration;
        if (monetizationConfiguration != null) {
            coreData.monetizationConfiguration = monetizationConfiguration.mo223809clone();
        }
        Contract contract = this.contract;
        if (contract != null) {
            coreData.contract = contract.mo223809clone();
        }
        List<VerificationToken> list33 = this.verificationTokens;
        if (list33 != null) {
            coreData.verificationTokens = ValueObject.util_map(list33, new w9j() { // from class: l.hi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VerificationToken) obj).mo223809clone();
                }
            });
        }
        List<HeartBeat> list34 = this.heartbeats;
        if (list34 != null) {
            coreData.heartbeats = ValueObject.util_map(list34, new w9j() { // from class: l.ii8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((HeartBeat) obj).mo223809clone();
                }
            });
        }
        List<ContractInfo> list35 = this.contractInfos;
        if (list35 != null) {
            coreData.contractInfos = ValueObject.util_map(list35, new w9j() { // from class: l.ji8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ContractInfo) obj).mo223809clone();
                }
            });
        }
        List<ChatGroup> list36 = this.chatGroups;
        if (list36 != null) {
            coreData.chatGroups = ValueObject.util_map(list36, new w9j() { // from class: l.li8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroup) obj).mo223809clone();
                }
            });
        }
        List<ChatGroupMember> list37 = this.chatGroupMembers;
        if (list37 != null) {
            coreData.chatGroupMembers = ValueObject.util_map(list37, new w9j() { // from class: l.mi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroupMember) obj).mo223809clone();
                }
            });
        }
        List<GroupApply> list38 = this.groupApplies;
        if (list38 != null) {
            coreData.groupApplies = ValueObject.util_map(list38, new w9j() { // from class: l.ni8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GroupApply) obj).mo223809clone();
                }
            });
        }
        List<NotificationCounter> list39 = this.notificationCounters;
        if (list39 != null) {
            coreData.notificationCounters = ValueObject.util_map(list39, new w9j() { // from class: l.oi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NotificationCounter) obj).mo223809clone();
                }
            });
        }
        List<GroupNotification> list40 = this.groupNotifications;
        if (list40 != null) {
            coreData.groupNotifications = ValueObject.util_map(list40, new w9j() { // from class: l.pi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GroupNotification) obj).mo223809clone();
                }
            });
        }
        List<GroupAttribute> list41 = this.groupAttributes;
        if (list41 != null) {
            coreData.groupAttributes = ValueObject.util_map(list41, new w9j() { // from class: l.ri8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GroupAttribute) obj).mo223809clone();
                }
            });
        }
        List<ChatGroup> list42 = this.interestedGroups;
        if (list42 != null) {
            coreData.interestedGroups = ValueObject.util_map(list42, new w9j() { // from class: l.si8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroup) obj).mo223809clone();
                }
            });
        }
        List<GroupTab> list43 = this.groupTabs;
        if (list43 != null) {
            coreData.groupTabs = ValueObject.util_map(list43, new w9j() { // from class: l.ti8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GroupTab) obj).mo223809clone();
                }
            });
        }
        List<String> list44 = this.keywords;
        if (list44 != null) {
            coreData.keywords = ValueObject.util_map(list44, new w9j() { // from class: l.ui8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreData.m35352O0((String) obj);
                }
            });
        }
        List<GroupSetting> list45 = this.groupSettings;
        if (list45 != null) {
            coreData.groupSettings = ValueObject.util_map(list45, new w9j() { // from class: l.rc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GroupSetting) obj).mo223809clone();
                }
            });
        }
        List<SettingGroups> list46 = this.settingGroups;
        if (list46 != null) {
            coreData.settingGroups = ValueObject.util_map(list46, new w9j() { // from class: l.sc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SettingGroups) obj).mo223809clone();
                }
            });
        }
        List<Live> list47 = this.lives;
        if (list47 != null) {
            coreData.lives = ValueObject.util_map(list47, new w9j() { // from class: l.tc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Live) obj).mo223809clone();
                }
            });
        }
        List<OfficialAccount> list48 = this.officialAccounts;
        if (list48 != null) {
            coreData.officialAccounts = ValueObject.util_map(list48, new w9j() { // from class: l.uc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OfficialAccount) obj).mo223809clone();
                }
            });
        }
        List<OfficialAccountsMenu> list49 = this.menus;
        if (list49 != null) {
            coreData.menus = ValueObject.util_map(list49, new w9j() { // from class: l.vc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OfficialAccountsMenu) obj).mo223809clone();
                }
            });
        }
        List<TickleSettingInfo> list50 = this.tickles;
        if (list50 != null) {
            coreData.tickles = ValueObject.util_map(list50, new w9j() { // from class: l.wc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((TickleSettingInfo) obj).mo223809clone();
                }
            });
        }
        List<MonetizationPromotion> list51 = this.monetizationPromotions;
        if (list51 != null) {
            coreData.monetizationPromotions = ValueObject.util_map(list51, new w9j() { // from class: l.yc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MonetizationPromotion) obj).mo223809clone();
                }
            });
        }
        List<Coupon> list52 = this.coupons;
        if (list52 != null) {
            coreData.coupons = ValueObject.util_map(list52, new w9j() { // from class: l.zc8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Coupon) obj).mo223809clone();
                }
            });
        }
        List<ChatProfile> list53 = this.chatProfiles;
        if (list53 != null) {
            coreData.chatProfiles = ValueObject.util_map(list53, new w9j() { // from class: l.ad8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatProfile) obj).mo223809clone();
                }
            });
        }
        List<IceBreakingQuestion> list54 = this.systemQuestions;
        if (list54 != null) {
            coreData.systemQuestions = ValueObject.util_map(list54, new w9j() { // from class: l.cd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IceBreakingQuestion) obj).mo223809clone();
                }
            });
        }
        PriorityLike priorityLike = this.priorityLike;
        if (priorityLike != null) {
            coreData.priorityLike = priorityLike.mo223809clone();
        }
        Couponbag couponbag = this.couponBag;
        if (couponbag != null) {
            coreData.couponBag = couponbag.mo223809clone();
        }
        List<UserSticker> list55 = this.userStickers;
        if (list55 != null) {
            coreData.userStickers = ValueObject.util_map(list55, new w9j() { // from class: l.dd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserSticker) obj).mo223809clone();
                }
            });
        }
        List<RedPacket> list56 = this.redPackets;
        if (list56 != null) {
            coreData.redPackets = ValueObject.util_map(list56, new w9j() { // from class: l.ed8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RedPacket) obj).mo223809clone();
                }
            });
        }
        List<CoreGiftInfo> list57 = this.giftInfos;
        if (list57 != null) {
            coreData.giftInfos = ValueObject.util_map(list57, new w9j() { // from class: l.fd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CoreGiftInfo) obj).mo223809clone();
                }
            });
        }
        CounterVerification counterVerification = this.counterVerification;
        if (counterVerification != null) {
            coreData.counterVerification = counterVerification.mo223809clone();
        }
        List<LiveSchema> list58 = this.liveSchemas;
        if (list58 != null) {
            coreData.liveSchemas = ValueObject.util_map(list58, new w9j() { // from class: l.gd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveSchema) obj).mo223809clone();
                }
            });
        }
        List<FriendInfo> list59 = this.friends;
        if (list59 != null) {
            coreData.friends = ValueObject.util_map(list59, new w9j() { // from class: l.hd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FriendInfo) obj).mo223809clone();
                }
            });
        }
        coreData.nextTime = this.nextTime;
        ConversationDiff conversationDiff = this.conversationDiff;
        if (conversationDiff != null) {
            coreData.conversationDiff = conversationDiff.mo223809clone();
        }
        List<ComStatusAward> list60 = this.comStatusAwards;
        if (list60 != null) {
            coreData.comStatusAwards = ValueObject.util_map(list60, new w9j() { // from class: l.id8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ComStatusAward) obj).mo223809clone();
                }
            });
        }
        List<CardStyle> list61 = this.cardStyles;
        if (list61 != null) {
            coreData.cardStyles = ValueObject.util_map(list61, new w9j() { // from class: l.kd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardStyle) obj).mo223809clone();
                }
            });
        }
        List<AudioText> list62 = this.audioTexts;
        if (list62 != null) {
            coreData.audioTexts = ValueObject.util_map(list62, new w9j() { // from class: l.ld8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AudioText) obj).mo223809clone();
                }
            });
        }
        CoreGiftGuide coreGiftGuide = this.giftGuide;
        if (coreGiftGuide != null) {
            coreData.giftGuide = coreGiftGuide.mo223809clone();
        }
        List<CoreGiftPanel> list63 = this.giftPanel;
        if (list63 != null) {
            coreData.giftPanel = ValueObject.util_map(list63, new w9j() { // from class: l.nd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CoreGiftPanel) obj).mo223809clone();
                }
            });
        }
        List<GiftWallSocial> list64 = this.giftWallSocials;
        if (list64 != null) {
            coreData.giftWallSocials = ValueObject.util_map(list64, new w9j() { // from class: l.od8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GiftWallSocial) obj).mo223809clone();
                }
            });
        }
        List<GiftWallRankInfo> list65 = this.giftWallRankInfos;
        if (list65 != null) {
            coreData.giftWallRankInfos = ValueObject.util_map(list65, new w9j() { // from class: l.pd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GiftWallRankInfo) obj).mo223809clone();
                }
            });
        }
        List<GiftWallTitle> list66 = this.giftWallTitles;
        if (list66 != null) {
            coreData.giftWallTitles = ValueObject.util_map(list66, new w9j() { // from class: l.qd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GiftWallTitle) obj).mo223809clone();
                }
            });
        }
        List<NewGiftWall> list67 = this.newGiftWalls;
        if (list67 != null) {
            coreData.newGiftWalls = ValueObject.util_map(list67, new w9j() { // from class: l.rd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NewGiftWall) obj).mo223809clone();
                }
            });
        }
        PurchaseDialogConfigs purchaseDialogConfigs = this.purchaseDialogConfigs;
        if (purchaseDialogConfigs != null) {
            coreData.purchaseDialogConfigs = purchaseDialogConfigs.mo223809clone();
        }
        List<Greeting> list68 = this.greetings;
        if (list68 != null) {
            coreData.greetings = ValueObject.util_map(list68, new w9j() { // from class: l.sd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Greeting) obj).mo223809clone();
                }
            });
        }
        GreetingCounter greetingCounter = this.greetingCounter;
        if (greetingCounter != null) {
            coreData.greetingCounter = greetingCounter.mo223809clone();
        }
        List<GreetingPermission> list69 = this.greetingPermissions;
        if (list69 != null) {
            coreData.greetingPermissions = ValueObject.util_map(list69, new w9j() { // from class: l.td8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GreetingPermission) obj).mo223809clone();
                }
            });
        }
        GreetingSummary greetingSummary = this.greetingSummary;
        if (greetingSummary != null) {
            coreData.greetingSummary = greetingSummary.mo223809clone();
        }
        coreData.hint = this.hint;
        List<CardExtraInfo> list70 = this.cardExtraInfos;
        if (list70 != null) {
            coreData.cardExtraInfos = ValueObject.util_map(list70, new w9j() { // from class: l.ud8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardExtraInfo) obj).mo223809clone();
                }
            });
        }
        List<ReadMessage> list71 = this.readMessages;
        if (list71 != null) {
            coreData.readMessages = ValueObject.util_map(list71, new w9j() { // from class: l.wd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ReadMessage) obj).mo223809clone();
                }
            });
        }
        List<RecentConversation> list72 = this.recentConversations;
        if (list72 != null) {
            coreData.recentConversations = ValueObject.util_map(list72, new w9j() { // from class: l.yd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RecentConversation) obj).mo223809clone();
                }
            });
        }
        List<OrderInfo> list73 = this.orderInfos;
        if (list73 != null) {
            coreData.orderInfos = ValueObject.util_map(list73, new w9j() { // from class: l.zd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OrderInfo) obj).mo223809clone();
                }
            });
        }
        QuickChatCardInfo quickChatCardInfo = this.quickchatCard;
        if (quickChatCardInfo != null) {
            coreData.quickchatCard = quickChatCardInfo.mo223809clone();
        }
        List<PicksUser> list74 = this.picksUsers;
        if (list74 != null) {
            coreData.picksUsers = ValueObject.util_map(list74, new w9j() { // from class: l.ae8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PicksUser) obj).mo223809clone();
                }
            });
        }
        Picks picks = this.picks;
        if (picks != null) {
            coreData.picks = picks.mo223809clone();
        }
        List<CountdownItem> list75 = this.countdownLikes;
        if (list75 != null) {
            coreData.countdownLikes = ValueObject.util_map(list75, new w9j() { // from class: l.be8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CountdownItem) obj).mo223809clone();
                }
            });
        }
        GreetingSetting greetingSetting = this.greetingSetting;
        if (greetingSetting != null) {
            coreData.greetingSetting = greetingSetting.mo223809clone();
        }
        OnlineLiveChatPair onlineLiveChatPair = this.onlineLiveChatPair;
        if (onlineLiveChatPair != null) {
            coreData.onlineLiveChatPair = onlineLiveChatPair.mo223809clone();
        }
        List<CardStyle> list76 = this.likedMes;
        if (list76 != null) {
            coreData.likedMes = ValueObject.util_map(list76, new w9j() { // from class: l.ce8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardStyle) obj).mo223809clone();
                }
            });
        }
        MyMeetExtra myMeetExtra = this.myMeet;
        if (myMeetExtra != null) {
            coreData.myMeet = myMeetExtra.mo223809clone();
        }
        List<CoreMomentInfo> list77 = this.moments;
        if (list77 != null) {
            coreData.moments = ValueObject.util_map(list77, new w9j() { // from class: l.de8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CoreMomentInfo) obj).mo223809clone();
                }
            });
        }
        VoiceChatInfo voiceChatInfo = this.voicechat;
        if (voiceChatInfo != null) {
            coreData.voicechat = voiceChatInfo.mo223809clone();
        }
        QuickChatBellData quickChatBellData = this.bell;
        if (quickChatBellData != null) {
            coreData.bell = quickChatBellData.mo223809clone();
        }
        coreData.isHit = this.isHit;
        User user = this.user;
        if (user != null) {
            coreData.user = user.mo223809clone();
        }
        List<LiteraturesComments> list78 = this.literaturesComments;
        if (list78 != null) {
            coreData.literaturesComments = ValueObject.util_map(list78, new w9j() { // from class: l.ee8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiteraturesComments) obj).mo223809clone();
                }
            });
        }
        List<Literatures> list79 = this.literatures;
        if (list79 != null) {
            coreData.literatures = ValueObject.util_map(list79, new w9j() { // from class: l.fe8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Literatures) obj).mo223809clone();
                }
            });
        }
        List<MembershipRecommendUser> list80 = this.membershipRecommendUsers;
        if (list80 != null) {
            coreData.membershipRecommendUsers = ValueObject.util_map(list80, new w9j() { // from class: l.ge8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MembershipRecommendUser) obj).mo223809clone();
                }
            });
        }
        FreeTrialInfo freeTrialInfo = this.freeTrialInfo;
        if (freeTrialInfo != null) {
            coreData.freeTrialInfo = freeTrialInfo.mo223809clone();
        }
        FreeTrialOperateResult freeTrialOperateResult = this.freeTrialOperateResult;
        if (freeTrialOperateResult != null) {
            coreData.freeTrialOperateResult = freeTrialOperateResult.mo223809clone();
        }
        Note note = this.speedUpCard;
        if (note != null) {
            coreData.speedUpCard = note.mo223809clone();
        }
        List<BubbleInfo> list81 = this.states;
        if (list81 != null) {
            coreData.states = ValueObject.util_map(list81, new w9j() { // from class: l.je8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BubbleInfo) obj).mo223809clone();
                }
            });
        }
        ThirdPartyInfo thirdPartyInfo = this.thirdPartyInfo;
        if (thirdPartyInfo != null) {
            coreData.thirdPartyInfo = thirdPartyInfo.mo223809clone();
        }
        List<Evaluation> list82 = this.evaluations;
        if (list82 != null) {
            coreData.evaluations = ValueObject.util_map(list82, new w9j() { // from class: l.ke8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Evaluation) obj).mo223809clone();
                }
            });
        }
        List<EvaluationReport> list83 = this.evaluationReports;
        if (list83 != null) {
            coreData.evaluationReports = ValueObject.util_map(list83, new w9j() { // from class: l.le8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((EvaluationReport) obj).mo223809clone();
                }
            });
        }
        MessageFeedbackStatus messageFeedbackStatus = this.msgData;
        if (messageFeedbackStatus != null) {
            coreData.msgData = messageFeedbackStatus.mo223809clone();
        }
        Evaluation evaluation = this.evaluation;
        if (evaluation != null) {
            coreData.evaluation = evaluation.mo223809clone();
        }
        List<PrivilegeGift> list84 = this.privilegeGifts;
        if (list84 != null) {
            coreData.privilegeGifts = ValueObject.util_map(list84, new w9j() { // from class: l.me8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PrivilegeGift) obj).mo223809clone();
                }
            });
        }
        List<RecommendMessage> list85 = this.recommendMessages;
        if (list85 != null) {
            coreData.recommendMessages = ValueObject.util_map(list85, new w9j() { // from class: l.ne8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RecommendMessage) obj).mo223809clone();
                }
            });
        }
        List<UserGreetInfo> list86 = this.greets;
        if (list86 != null) {
            coreData.greets = ValueObject.util_map(list86, new w9j() { // from class: l.oe8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserGreetInfo) obj).mo223809clone();
                }
            });
        }
        List<CardModel> list87 = this.cardModels;
        if (list87 != null) {
            coreData.cardModels = ValueObject.util_map(list87, new w9j() { // from class: l.pe8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardModel) obj).mo223809clone();
                }
            });
        }
        HeartBeatMatched heartBeatMatched = this.heartbeatMatch;
        if (heartBeatMatched != null) {
            coreData.heartbeatMatch = heartBeatMatched.mo223809clone();
        }
        QuickChatOneside quickChatOneside = this.oneside;
        if (quickChatOneside != null) {
            coreData.oneside = quickChatOneside.mo223809clone();
        }
        MyMeetListV3 myMeetListV3 = this.myMeetListV3;
        if (myMeetListV3 != null) {
            coreData.myMeetListV3 = myMeetListV3.mo223809clone();
        }
        MyMeetEntryV3 myMeetEntryV3 = this.myMeetEntryV3;
        if (myMeetEntryV3 != null) {
            coreData.myMeetEntryV3 = myMeetEntryV3.mo223809clone();
        }
        List<InsertCard> list88 = this.intlInsertCardSets;
        if (list88 != null) {
            coreData.intlInsertCardSets = ValueObject.util_map(list88, new w9j() { // from class: l.qe8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((InsertCard) obj).mo223809clone();
                }
            });
        }
        List<Active> list89 = this.actives;
        if (list89 != null) {
            coreData.actives = ValueObject.util_map(list89, new w9j() { // from class: l.re8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Active) obj).mo223809clone();
                }
            });
        }
        List<CardsIcons> list90 = this.cardsIcons;
        if (list90 != null) {
            coreData.cardsIcons = ValueObject.util_map(list90, new w9j() { // from class: l.se8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardsIcons) obj).mo223809clone();
                }
            });
        }
        TacitTestProfileCard tacitTestProfileCard = this.tacitTest;
        if (tacitTestProfileCard != null) {
            coreData.tacitTest = tacitTestProfileCard.mo223809clone();
        }
        List<BreakIce> list91 = this.iceBreakings;
        if (list91 != null) {
            coreData.iceBreakings = ValueObject.util_map(list91, new w9j() { // from class: l.ve8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BreakIce) obj).mo223809clone();
                }
            });
        }
        GreetingHotLevelInfo greetingHotLevelInfo = this.greetingHotLevelInfo;
        if (greetingHotLevelInfo != null) {
            coreData.greetingHotLevelInfo = greetingHotLevelInfo.mo223809clone();
        }
        List<Voice> list92 = this.voices;
        if (list92 != null) {
            coreData.voices = ValueObject.util_map(list92, new w9j() { // from class: l.we8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Voice) obj).mo223809clone();
                }
            });
        }
        coreData.avatar = this.avatar;
        List<SpecialSuggestUsers> list93 = this.suggestUsers;
        if (list93 != null) {
            coreData.suggestUsers = ValueObject.util_map(list93, new w9j() { // from class: l.xe8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SpecialSuggestUsers) obj).mo223809clone();
                }
            });
        }
        ActionData actionData = this.action;
        if (actionData != null) {
            coreData.action = actionData.mo223809clone();
        }
        TagStrategy tagStrategy = this.tagLoadStrategy;
        if (tagStrategy != null) {
            coreData.tagLoadStrategy = tagStrategy.mo223809clone();
        }
        List<NewTags> list94 = this.tags;
        if (list94 != null) {
            coreData.tags = ValueObject.util_map(list94, new w9j() { // from class: l.ye8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NewTags) obj).mo223809clone();
                }
            });
        }
        TagStrategy tagStrategy2 = this.tagCategoryStrategy;
        if (tagStrategy2 != null) {
            coreData.tagCategoryStrategy = tagStrategy2.mo223809clone();
        }
        List<TagCategories> list95 = this.tagCategories;
        if (list95 != null) {
            coreData.tagCategories = ValueObject.util_map(list95, new w9j() { // from class: l.ze8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((TagCategories) obj).mo223809clone();
                }
            });
        }
        List<TagUserCounts> list96 = this.tagUserCounts;
        if (list96 != null) {
            coreData.tagUserCounts = ValueObject.util_map(list96, new w9j() { // from class: l.af8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((TagUserCounts) obj).mo223809clone();
                }
            });
        }
        List<SamesCardData> list97 = this.sames;
        if (list97 != null) {
            coreData.sames = ValueObject.util_map(list97, new w9j() { // from class: l.bf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SamesCardData) obj).mo223809clone();
                }
            });
        }
        LiteratureConfigInfo literatureConfigInfo = this.literatureConfigInfo;
        if (literatureConfigInfo != null) {
            coreData.literatureConfigInfo = literatureConfigInfo.mo223809clone();
        }
        GreetingSummary greetingSummary2 = this.anonymousSummary;
        if (greetingSummary2 != null) {
            coreData.anonymousSummary = greetingSummary2.mo223809clone();
        }
        List<CardInfos> list98 = this.cardInfos;
        if (list98 != null) {
            coreData.cardInfos = ValueObject.util_map(list98, new w9j() { // from class: l.cf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardInfos) obj).mo223809clone();
                }
            });
        }
        List<SeeInfos> list99 = this.seeInfos;
        if (list99 != null) {
            coreData.seeInfos = ValueObject.util_map(list99, new w9j() { // from class: l.df8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SeeInfos) obj).mo223809clone();
                }
            });
        }
        List<SeePortrait> list100 = this.seePortraits;
        if (list100 != null) {
            coreData.seePortraits = ValueObject.util_map(list100, new w9j() { // from class: l.ff8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SeePortrait) obj).mo223809clone();
                }
            });
        }
        List<ProfileLikeComment> list101 = this.profileLikesComments;
        if (list101 != null) {
            coreData.profileLikesComments = ValueObject.util_map(list101, new w9j() { // from class: l.lf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ProfileLikeComment) obj).mo223809clone();
                }
            });
        }
        ExpandedProfileLikeCounter expandedProfileLikeCounter = this.profileLikeCounter;
        if (expandedProfileLikeCounter != null) {
            coreData.profileLikeCounter = expandedProfileLikeCounter.mo223809clone();
        }
        ExtraPrivileges extraPrivileges = this.extraPrivileges;
        if (extraPrivileges != null) {
            coreData.extraPrivileges = extraPrivileges.mo223809clone();
        }
        ProfileSelectedQue profileSelectedQue = this.selectedQuestion;
        if (profileSelectedQue != null) {
            coreData.selectedQuestion = profileSelectedQue.mo223809clone();
        }
        List<LikeUser> list102 = this.likeUsers;
        if (list102 != null) {
            coreData.likeUsers = ValueObject.util_map(list102, new w9j() { // from class: l.wf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LikeUser) obj).mo223809clone();
                }
            });
        }
        coreData.next = this.next;
        CipherId cipherId = this.cipherId;
        if (cipherId != null) {
            coreData.cipherId = cipherId.mo223809clone();
        }
        ShareId shareId = this.shareId;
        if (shareId != null) {
            coreData.shareId = shareId.mo223809clone();
        }
        List<StateEmotion> list103 = this.stateEmotion;
        if (list103 != null) {
            coreData.stateEmotion = ValueObject.util_map(list103, new w9j() { // from class: l.hg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((StateEmotion) obj).mo223809clone();
                }
            });
        }
        SeePortraitCounter seePortraitCounter = this.seePortraitCounter;
        if (seePortraitCounter != null) {
            coreData.seePortraitCounter = seePortraitCounter.mo223809clone();
        }
        List<Recommended> list104 = this.recommended;
        if (list104 != null) {
            coreData.recommended = ValueObject.util_map(list104, new w9j() { // from class: l.sg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Recommended) obj).mo223809clone();
                }
            });
        }
        List<ChatHeat> list105 = this.chatHeats;
        if (list105 != null) {
            coreData.chatHeats = ValueObject.util_map(list105, new w9j() { // from class: l.dh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatHeat) obj).mo223809clone();
                }
            });
        }
        List<PermissionsItem> list106 = this.chatHeatPermissions;
        if (list106 != null) {
            coreData.chatHeatPermissions = ValueObject.util_map(list106, new w9j() { // from class: l.oh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PermissionsItem) obj).mo223809clone();
                }
            });
        }
        List<ResourceTriggers> list107 = this.resources;
        if (list107 != null) {
            coreData.resources = ValueObject.util_map(list107, new w9j() { // from class: l.zh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ResourceTriggers) obj).mo223809clone();
                }
            });
        }
        GreetingResult greetingResult = this.greetingResult;
        if (greetingResult != null) {
            coreData.greetingResult = greetingResult.mo223809clone();
        }
        List<ConversationLatestMoment> list108 = this.latestMoments;
        if (list108 != null) {
            coreData.latestMoments = ValueObject.util_map(list108, new w9j() { // from class: l.ki8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ConversationLatestMoment) obj).mo223809clone();
                }
            });
        }
        JmpTarget jmpTarget = this.jmpTarget;
        if (jmpTarget != null) {
            coreData.jmpTarget = jmpTarget.mo223809clone();
        }
        List<BuzzUser> list109 = this.buzzUsers;
        if (list109 != null) {
            coreData.buzzUsers = ValueObject.util_map(list109, new w9j() { // from class: l.vi8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BuzzUser) obj).mo223809clone();
                }
            });
        }
        ODiamondListItem oDiamondListItem = this.odiamondList;
        if (oDiamondListItem != null) {
            coreData.odiamondList = oDiamondListItem.mo223809clone();
        }
        PopGuide popGuide = this.popGuide;
        if (popGuide != null) {
            coreData.popGuide = popGuide.mo223809clone();
        }
        List<SuperLikeCount> list110 = this.superLikeCount;
        if (list110 != null) {
            coreData.superLikeCount = ValueObject.util_map(list110, new w9j() { // from class: l.bd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SuperLikeCount) obj).mo223809clone();
                }
            });
        }
        List<FloatsCardData> list111 = this.floats;
        if (list111 != null) {
            coreData.floats = ValueObject.util_map(list111, new w9j() { // from class: l.xd8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FloatsCardData) obj).mo223809clone();
                }
            });
        }
        MonetizationMsg monetizationMsg = this.monetizationMsg;
        if (monetizationMsg != null) {
            coreData.monetizationMsg = monetizationMsg.mo223809clone();
        }
        coreData.link = this.link;
        GrowthMomentThemeCardInfo growthMomentThemeCardInfo = this.tab;
        if (growthMomentThemeCardInfo != null) {
            coreData.tab = growthMomentThemeCardInfo.mo223809clone();
        }
        SeeExposedUser seeExposedUser = this.seeExposedUser;
        if (seeExposedUser != null) {
            coreData.seeExposedUser = seeExposedUser.mo223809clone();
        }
        GrowthExposureInfo growthExposureInfo = this.exposureInfo;
        if (growthExposureInfo != null) {
            coreData.exposureInfo = growthExposureInfo.mo223809clone();
        }
        List<SamesCardData> list112 = this.love520;
        if (list112 != null) {
            coreData.love520 = ValueObject.util_map(list112, new w9j() { // from class: l.ie8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SamesCardData) obj).mo223809clone();
                }
            });
        }
        coreData.payWill = this.payWill;
        List<ExtremePickItem> list113 = this.extremePickByList;
        if (list113 != null) {
            coreData.extremePickByList = ValueObject.util_map(list113, new w9j() { // from class: l.te8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ExtremePickItem) obj).mo223809clone();
                }
            });
        }
        ChatGameInfo chatGameInfo = this.chatGameInfo;
        if (chatGameInfo != null) {
            coreData.chatGameInfo = chatGameInfo.mo223809clone();
        }
        List<SamesCardData> list114 = this.camping;
        if (list114 != null) {
            coreData.camping = ValueObject.util_map(list114, new w9j() { // from class: l.ef8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SamesCardData) obj).mo223809clone();
                }
            });
        }
        RecallMatch recallMatch = this.recallMatch;
        if (recallMatch != null) {
            coreData.recallMatch = recallMatch.mo223809clone();
        }
        List<BCoreLiveActivity> list115 = this.liveActivities;
        if (list115 != null) {
            coreData.liveActivities = ValueObject.util_map(list115, new w9j() { // from class: l.hf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BCoreLiveActivity) obj).mo223809clone();
                }
            });
        }
        List<SamesCardData> list116 = this.mkt_activity_regular;
        if (list116 != null) {
            coreData.mkt_activity_regular = ValueObject.util_map(list116, new w9j() { // from class: l.if8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SamesCardData) obj).mo223809clone();
                }
            });
        }
        MonetizationChatSeeUser monetizationChatSeeUser = this.monetizationChatSeeUser;
        if (monetizationChatSeeUser != null) {
            coreData.monetizationChatSeeUser = monetizationChatSeeUser.mo223809clone();
        }
        List<IntlVisitor> list117 = this.intlVisitorInfo;
        if (list117 != null) {
            coreData.intlVisitorInfo = ValueObject.util_map(list117, new w9j() { // from class: l.jf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IntlVisitor) obj).mo223809clone();
                }
            });
        }
        coreData.count = this.count;
        List<String> list118 = this.invalidCardList;
        if (list118 != null) {
            coreData.invalidCardList = ValueObject.util_map(list118, new w9j() { // from class: l.kf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreData.m35459u((String) obj);
                }
            });
        }
        List<ChatAssistantQuestion> list119 = this.chatAssistantQuestions;
        if (list119 != null) {
            coreData.chatAssistantQuestions = ValueObject.util_map(list119, new w9j() { // from class: l.mf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatAssistantQuestion) obj).mo223809clone();
                }
            });
        }
        List<SamesCardData> list120 = this.mkt_activity_quiz;
        if (list120 != null) {
            coreData.mkt_activity_quiz = ValueObject.util_map(list120, new w9j() { // from class: l.nf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SamesCardData) obj).mo223809clone();
                }
            });
        }
        coreData.isRecallUser = this.isRecallUser;
        List<UserIdType> list121 = this.greetingNewPeople;
        if (list121 != null) {
            coreData.greetingNewPeople = ValueObject.util_map(list121, new w9j() { // from class: l.pf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserIdType) obj).mo223809clone();
                }
            });
        }
        List<GreetingNewPeopleMessage> list122 = this.greetingNewPeopleMessage;
        if (list122 != null) {
            coreData.greetingNewPeopleMessage = ValueObject.util_map(list122, new w9j() { // from class: l.qf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GreetingNewPeopleMessage) obj).mo223809clone();
                }
            });
        }
        ExtremeQuestions extremeQuestions = this.extremeQuestions;
        if (extremeQuestions != null) {
            coreData.extremeQuestions = extremeQuestions.mo223809clone();
        }
        BoostResultEntry boostResultEntry = this.boostResultEntry;
        if (boostResultEntry != null) {
            coreData.boostResultEntry = boostResultEntry.mo223809clone();
        }
        MatchInfo matchInfo = this.todayMatchInfo;
        if (matchInfo != null) {
            coreData.todayMatchInfo = matchInfo.mo223809clone();
        }
        GrowthMesInfo growthMesInfo = this.growthMesInfo;
        if (growthMesInfo != null) {
            coreData.growthMesInfo = growthMesInfo.mo223809clone();
        }
        AiPictureAuth aiPictureAuth = this.aiPictureAuth;
        if (aiPictureAuth != null) {
            coreData.aiPictureAuth = aiPictureAuth.mo223809clone();
        }
        AcceleratePairingStatus acceleratePairingStatus = this.acceleratePairing;
        if (acceleratePairingStatus != null) {
            coreData.acceleratePairing = acceleratePairingStatus.mo223809clone();
        }
        QuickChatPartyInvitation quickChatPartyInvitation = this.invitation;
        if (quickChatPartyInvitation != null) {
            coreData.invitation = quickChatPartyInvitation.mo223809clone();
        }
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = this.campaignPage;
        if (quickChatPartyCampaignPage != null) {
            coreData.campaignPage = quickChatPartyCampaignPage.mo223809clone();
        }
        GrowthPartner growthPartner = this.partner;
        if (growthPartner != null) {
            coreData.partner = growthPartner.mo223809clone();
        }
        List<CityCData> list123 = this.cityCData;
        if (list123 != null) {
            coreData.cityCData = ValueObject.util_map(list123, new w9j() { // from class: l.rf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CityCData) obj).mo223809clone();
                }
            });
        }
        GrowthBlindBox growthBlindBox = this.blindbox;
        if (growthBlindBox != null) {
            coreData.blindbox = growthBlindBox.mo223809clone();
        }
        List<String> list124 = this.unReadUserIds;
        if (list124 != null) {
            coreData.unReadUserIds = ValueObject.util_map(list124, new w9j() { // from class: l.sf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreData.m35392b1((String) obj);
                }
            });
        }
        CityCBanner cityCBanner = this.cityCBanner;
        if (cityCBanner != null) {
            coreData.cityCBanner = cityCBanner.mo223809clone();
        }
        ChatPartners chatPartners = this.chatPartners;
        if (chatPartners != null) {
            coreData.chatPartners = chatPartners.mo223809clone();
        }
        List<ChatPartnersHistoryItem> list125 = this.chatPartnersSignals;
        if (list125 != null) {
            coreData.chatPartnersSignals = ValueObject.util_map(list125, new w9j() { // from class: l.tf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatPartnersHistoryItem) obj).mo223809clone();
                }
            });
        }
        SurpriseGift surpriseGift = this.surpriseGift;
        if (surpriseGift != null) {
            coreData.surpriseGift = surpriseGift.mo223809clone();
        }
        coreData.surpriseGiftExpirationTime = this.surpriseGiftExpirationTime;
        List<CardCornerMark> list126 = this.cardCornerMarks;
        if (list126 != null) {
            coreData.cardCornerMarks = ValueObject.util_map(list126, new w9j() { // from class: l.uf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardCornerMark) obj).mo223809clone();
                }
            });
        }
        PhotoLowModelData photoLowModelData = this.lowPhotoResult;
        if (photoLowModelData != null) {
            coreData.lowPhotoResult = photoLowModelData.mo223809clone();
        }
        List<SamesCardData> list127 = this.mkt_activity_flash;
        if (list127 != null) {
            coreData.mkt_activity_flash = ValueObject.util_map(list127, new w9j() { // from class: l.vf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SamesCardData) obj).mo223809clone();
                }
            });
        }
        CityCConfig cityCConfig = this.cityCConfig;
        if (cityCConfig != null) {
            coreData.cityCConfig = cityCConfig.mo223809clone();
        }
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        if (privateCustomSetting != null) {
            coreData.privateCustomSetting = privateCustomSetting.mo223809clone();
        }
        PrivateCustomResult privateCustomResult = this.privateCustomResults;
        if (privateCustomResult != null) {
            coreData.privateCustomResults = privateCustomResult.mo223809clone();
        }
        VisitorSetting visitorSetting = this.visitorSetting;
        if (visitorSetting != null) {
            coreData.visitorSetting = visitorSetting.mo223809clone();
        }
        List<VisitorHidden> list128 = this.visitorHiddens;
        if (list128 != null) {
            coreData.visitorHiddens = ValueObject.util_map(list128, new w9j() { // from class: l.xf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VisitorHidden) obj).mo223809clone();
                }
            });
        }
        MarriageGuide marriageGuide = this.marriageGuide;
        if (marriageGuide != null) {
            coreData.marriageGuide = marriageGuide.mo223809clone();
        }
        List<SelectionUser> list129 = this.selectionUsers;
        if (list129 != null) {
            coreData.selectionUsers = ValueObject.util_map(list129, new w9j() { // from class: l.yf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SelectionUser) obj).mo223809clone();
                }
            });
        }
        SelectionUserInfo selectionUserInfo = this.selectionUserInfo;
        if (selectionUserInfo != null) {
            coreData.selectionUserInfo = selectionUserInfo.mo223809clone();
        }
        List<UserAudits> list130 = this.userAudits;
        if (list130 != null) {
            coreData.userAudits = ValueObject.util_map(list130, new w9j() { // from class: l.zf8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserAudits) obj).mo223809clone();
                }
            });
        }
        List<DynamicLable> list131 = this.dynamicLabels;
        if (list131 != null) {
            coreData.dynamicLabels = ValueObject.util_map(list131, new w9j() { // from class: l.bg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((DynamicLable) obj).mo223809clone();
                }
            });
        }
        List<DetectText> list132 = this.details;
        if (list132 != null) {
            coreData.details = ValueObject.util_map(list132, new w9j() { // from class: l.cg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((DetectText) obj).mo223809clone();
                }
            });
        }
        ColdStartLayer coldStartLayer = this.layer;
        if (coldStartLayer != null) {
            coreData.layer = coldStartLayer.mo223809clone();
        }
        List<AuditPictureTag> list133 = this.auditPictureTags;
        if (list133 != null) {
            coreData.auditPictureTags = ValueObject.util_map(list133, new w9j() { // from class: l.dg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AuditPictureTag) obj).mo223809clone();
                }
            });
        }
        DatingGuideData datingGuideData = this.myTabGuide;
        if (datingGuideData != null) {
            coreData.myTabGuide = datingGuideData.mo223809clone();
        }
        coreData.profileGuide = this.profileGuide;
        TagStrategy tagStrategy3 = this.tagPictureStrategy;
        if (tagStrategy3 != null) {
            coreData.tagPictureStrategy = tagStrategy3.mo223809clone();
        }
        List<NewTags> list134 = this.pictureTags;
        if (list134 != null) {
            coreData.pictureTags = ValueObject.util_map(list134, new w9j() { // from class: l.eg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NewTags) obj).mo223809clone();
                }
            });
        }
        FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = this.fakeSuggest;
        if (fakeQuickChatSuggestStatus != null) {
            coreData.fakeSuggest = fakeQuickChatSuggestStatus.mo223809clone();
        }
        RiskOtherData riskOtherData = this.userRisk;
        if (riskOtherData != null) {
            coreData.userRisk = riskOtherData.mo223809clone();
        }
        RiskOtherData riskOtherData2 = this.descriptionRisk;
        if (riskOtherData2 != null) {
            coreData.descriptionRisk = riskOtherData2.mo223809clone();
        }
        List<RiskSelfData> list135 = this.risks;
        if (list135 != null) {
            coreData.risks = ValueObject.util_map(list135, new w9j() { // from class: l.fg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RiskSelfData) obj).mo223809clone();
                }
            });
        }
        List<BarLoverplaces> list136 = this.barLoverPlaces;
        if (list136 != null) {
            coreData.barLoverPlaces = ValueObject.util_map(list136, new w9j() { // from class: l.gg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BarLoverplaces) obj).mo223809clone();
                }
            });
        }
        List<BarLoverCitys> list137 = this.barLoverCities;
        if (list137 != null) {
            coreData.barLoverCities = ValueObject.util_map(list137, new w9j() { // from class: l.ig8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BarLoverCitys) obj).mo223809clone();
                }
            });
        }
        FateRadar fateRadar = this.fateRadar;
        if (fateRadar != null) {
            coreData.fateRadar = fateRadar.mo223809clone();
        }
        SvipWeeklyReport svipWeeklyReport = this.svipWeeklyReport;
        if (svipWeeklyReport != null) {
            coreData.svipWeeklyReport = svipWeeklyReport.mo223809clone();
        }
        Explore explore = this.explore;
        if (explore != null) {
            coreData.explore = explore.mo223809clone();
        }
        WechatNotifySetting wechatNotifySetting = this.wechat;
        if (wechatNotifySetting != null) {
            coreData.wechat = wechatNotifySetting.mo223809clone();
        }
        VipSetting vipSetting = this.vipSettings;
        if (vipSetting != null) {
            coreData.vipSettings = vipSetting.mo223809clone();
        }
        List<IceBreakQuestion> list138 = this.iceBreakQuestions;
        if (list138 != null) {
            coreData.iceBreakQuestions = ValueObject.util_map(list138, new w9j() { // from class: l.jg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IceBreakQuestion) obj).mo223809clone();
                }
            });
        }
        FakeGuideData fakeGuideData = this.fakeGuideData;
        if (fakeGuideData != null) {
            coreData.fakeGuideData = fakeGuideData.mo223809clone();
        }
        List<UserActivityInfo> list139 = this.userActivityInfos;
        if (list139 != null) {
            coreData.userActivityInfos = ValueObject.util_map(list139, new w9j() { // from class: l.kg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserActivityInfo) obj).mo223809clone();
                }
            });
        }
        Questionnaire questionnaire = this.questionnaire;
        if (questionnaire != null) {
            coreData.questionnaire = questionnaire.mo223809clone();
        }
        QuestionnaireFeature questionnaireFeature = this.features;
        if (questionnaireFeature != null) {
            coreData.features = questionnaireFeature.mo223809clone();
        }
        UserStrategyConfiguration userStrategyConfiguration = this.userStrategyConfiguration;
        if (userStrategyConfiguration != null) {
            coreData.userStrategyConfiguration = userStrategyConfiguration.mo223809clone();
        }
        List<FakePhotoFeedback> list140 = this.fakePhotoFeedback;
        if (list140 != null) {
            coreData.fakePhotoFeedback = ValueObject.util_map(list140, new w9j() { // from class: l.lg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FakePhotoFeedback) obj).mo223809clone();
                }
            });
        }
        PhotoLowModelData photoLowModelData2 = this.repeatPictureResult;
        if (photoLowModelData2 != null) {
            coreData.repeatPictureResult = photoLowModelData2.mo223809clone();
        }
        PhotoLowModelData photoLowModelData3 = this.netPictureResult;
        if (photoLowModelData3 != null) {
            coreData.netPictureResult = photoLowModelData3.mo223809clone();
        }
        UserFeedbackInfo userFeedbackInfo = this.userFeedbackInfo;
        if (userFeedbackInfo != null) {
            coreData.userFeedbackInfo = userFeedbackInfo.mo223809clone();
        }
        List<IdealTag> list141 = this.idealDetails;
        if (list141 != null) {
            coreData.idealDetails = ValueObject.util_map(list141, new w9j() { // from class: l.ng8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo223809clone();
                }
            });
        }
        IdealInfo idealInfo = this.idealInfo;
        if (idealInfo != null) {
            coreData.idealInfo = idealInfo.mo223809clone();
        }
        List<IdealInfo> list142 = this.idealInfos;
        if (list142 != null) {
            coreData.idealInfos = ValueObject.util_map(list142, new w9j() { // from class: l.og8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdealInfo) obj).mo223809clone();
                }
            });
        }
        List<UrlTag> list143 = this.urlTags;
        if (list143 != null) {
            coreData.urlTags = ValueObject.util_map(list143, new w9j() { // from class: l.pg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UrlTag) obj).mo223809clone();
                }
            });
        }
        List<ProfileCountInfo> list144 = this.profileCounts;
        if (list144 != null) {
            coreData.profileCounts = ValueObject.util_map(list144, new w9j() { // from class: l.qg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ProfileCountInfo) obj).mo223809clone();
                }
            });
        }
        PrivateCustomResult privateCustomResult2 = this.privateCustomResult;
        if (privateCustomResult2 != null) {
            coreData.privateCustomResult = privateCustomResult2.mo223809clone();
        }
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = this.videoChatSecondFloorSummary;
        if (videoChatSecondFloorSummary != null) {
            coreData.videoChatSecondFloorSummary = videoChatSecondFloorSummary.mo223809clone();
        }
        RealPicturesBanner realPicturesBanner = this.realPicturesBanner;
        if (realPicturesBanner != null) {
            coreData.realPicturesBanner = realPicturesBanner.mo223809clone();
        }
        RealPicturesInfo realPicturesInfo = this.realPicturesInfo;
        if (realPicturesInfo != null) {
            coreData.realPicturesInfo = realPicturesInfo.mo223809clone();
        }
        List<IPRegion> list145 = this.ipRegion;
        if (list145 != null) {
            coreData.ipRegion = ValueObject.util_map(list145, new w9j() { // from class: l.rg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IPRegion) obj).mo223809clone();
                }
            });
        }
        RealFeelInfo realFeelInfo = this.realFeelInfo;
        if (realFeelInfo != null) {
            coreData.realFeelInfo = realFeelInfo.mo223809clone();
        }
        LoveLetterEntryInfo loveLetterEntryInfo = this.loveLetter;
        if (loveLetterEntryInfo != null) {
            coreData.loveLetter = loveLetterEntryInfo.mo223809clone();
        }
        LoveLetterGroupInfo loveLetterGroupInfo = this.loveLetterGroup;
        if (loveLetterGroupInfo != null) {
            coreData.loveLetterGroup = loveLetterGroupInfo.mo223809clone();
        }
        LoveLetterContent loveLetterContent = this.loveLetterContent;
        if (loveLetterContent != null) {
            coreData.loveLetterContent = loveLetterContent.mo223809clone();
        }
        ChatPage chatPage = this.chatPage;
        if (chatPage != null) {
            coreData.chatPage = chatPage.mo223809clone();
        }
        List<ShowOnlineForWhoIMeet> list146 = this.showOnlineForWhoIMeet;
        if (list146 != null) {
            coreData.showOnlineForWhoIMeet = ValueObject.util_map(list146, new w9j() { // from class: l.tg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ShowOnlineForWhoIMeet) obj).mo223809clone();
                }
            });
        }
        PhotoLowModelData photoLowModelData4 = this.notVerificationResultData;
        if (photoLowModelData4 != null) {
            coreData.notVerificationResultData = photoLowModelData4.mo223809clone();
        }
        List<String> list147 = this.verificationLowLabels;
        if (list147 != null) {
            coreData.verificationLowLabels = ValueObject.util_map(list147, new w9j() { // from class: l.ug8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreData.m35425k2((String) obj);
                }
            });
        }
        List<MyTabTask> list148 = this.myTabTasks;
        if (list148 != null) {
            coreData.myTabTasks = ValueObject.util_map(list148, new w9j() { // from class: l.vg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MyTabTask) obj).mo223809clone();
                }
            });
        }
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance != null) {
            coreData.pendingPaymentGuidance = pendingPaymentGuidance.mo223809clone();
        }
        SeeTrialEligible seeTrialEligible = this.seeTrialEligible;
        if (seeTrialEligible != null) {
            coreData.seeTrialEligible = seeTrialEligible.mo223809clone();
        }
        SeeTrialStatus seeTrialStatus = this.seeTrialStatus;
        if (seeTrialStatus != null) {
            coreData.seeTrialStatus = seeTrialStatus.mo223809clone();
        }
        coreData.likedByToday = this.likedByToday;
        List<FeedbackQuestion> list149 = this.feedbackQuestions;
        if (list149 != null) {
            coreData.feedbackQuestions = ValueObject.util_map(list149, new w9j() { // from class: l.wg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FeedbackQuestion) obj).mo223809clone();
                }
            });
        }
        coreData.feedbackRemainedNum = this.feedbackRemainedNum;
        ConversationInstantChat conversationInstantChat = this.instantChat;
        if (conversationInstantChat != null) {
            coreData.instantChat = conversationInstantChat.mo223809clone();
        }
        AIChatAdvice aIChatAdvice = this.aiChatAdvice;
        if (aIChatAdvice != null) {
            coreData.aiChatAdvice = aIChatAdvice.mo223809clone();
        }
        AIChatAnalysis aIChatAnalysis = this.aiChatAnalysis;
        if (aIChatAnalysis != null) {
            coreData.aiChatAnalysis = aIChatAnalysis.mo223809clone();
        }
        InvitationInfo invitationInfo = this.invitationInfo;
        if (invitationInfo != null) {
            coreData.invitationInfo = invitationInfo.mo223809clone();
        }
        PictureVerifyRightedInfo pictureVerifyRightedInfo = this.pictureVerifyRightedInfo;
        if (pictureVerifyRightedInfo != null) {
            coreData.pictureVerifyRightedInfo = pictureVerifyRightedInfo.mo223809clone();
        }
        IntlCurrencyDiamond intlCurrencyDiamond = this.diamond;
        if (intlCurrencyDiamond != null) {
            coreData.diamond = intlCurrencyDiamond.mo223809clone();
        }
        coreData.canChange = this.canChange;
        coreData.ttcToDiamondRate = this.ttcToDiamondRate;
        List<Prologue> list150 = this.prologues;
        if (list150 != null) {
            coreData.prologues = ValueObject.util_map(list150, new w9j() { // from class: l.xg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Prologue) obj).mo223809clone();
                }
            });
        }
        List<InstantMatchGiveCountInfo> list151 = this.instantMatchGiveCountInfo;
        if (list151 != null) {
            coreData.instantMatchGiveCountInfo = ValueObject.util_map(list151, new w9j() { // from class: l.zg8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((InstantMatchGiveCountInfo) obj).mo223809clone();
                }
            });
        }
        List<CreditScoreData> list152 = this.creditScores;
        if (list152 != null) {
            coreData.creditScores = ValueObject.util_map(list152, new w9j() { // from class: l.ah8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CreditScoreData) obj).mo223809clone();
                }
            });
        }
        List<DislikedUsers> list153 = this.dislikedUsers;
        if (list153 != null) {
            coreData.dislikedUsers = ValueObject.util_map(list153, new w9j() { // from class: l.bh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((DislikedUsers) obj).mo223809clone();
                }
            });
        }
        AnalysisGuide analysisGuide = this.analysisGuide;
        if (analysisGuide != null) {
            coreData.analysisGuide = analysisGuide.mo223809clone();
        }
        VisitorDoorInfo visitorDoorInfo = this.visitorDoorInfo;
        if (visitorDoorInfo != null) {
            coreData.visitorDoorInfo = visitorDoorInfo.mo223809clone();
        }
        List<VisitorInfo> list154 = this.visitorInfo;
        if (list154 != null) {
            coreData.visitorInfo = ValueObject.util_map(list154, new w9j() { // from class: l.ch8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VisitorInfo) obj).mo223809clone();
                }
            });
        }
        List<InstantMatchUserInfo> list155 = this.instantMatchUserInfo;
        if (list155 != null) {
            coreData.instantMatchUserInfo = ValueObject.util_map(list155, new w9j() { // from class: l.eh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((InstantMatchUserInfo) obj).mo223809clone();
                }
            });
        }
        List<TribeSubset> list156 = this.recommendList;
        if (list156 != null) {
            coreData.recommendList = ValueObject.util_map(list156, new w9j() { // from class: l.fh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((TribeSubset) obj).mo223809clone();
                }
            });
        }
        IntlTribeBubble intlTribeBubble = this.intlBubble;
        if (intlTribeBubble != null) {
            coreData.intlBubble = intlTribeBubble.mo223809clone();
        }
        MembershipUpgradeInfo membershipUpgradeInfo = this.membershipUpgradeInfo;
        if (membershipUpgradeInfo != null) {
            coreData.membershipUpgradeInfo = membershipUpgradeInfo.mo223809clone();
        }
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo = this.ultraRightsUpgradeInfo;
        if (ultraRightsUpgradeInfo != null) {
            coreData.ultraRightsUpgradeInfo = ultraRightsUpgradeInfo.mo223809clone();
        }
        PurchaseSavePop purchaseSavePop = this.purchaseSavePop;
        if (purchaseSavePop != null) {
            coreData.purchaseSavePop = purchaseSavePop.mo223809clone();
        }
        List<SwipeUpperLimit> list157 = this.swipeUpperLimit;
        if (list157 != null) {
            coreData.swipeUpperLimit = ValueObject.util_map(list157, new w9j() { // from class: l.gh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SwipeUpperLimit) obj).mo223809clone();
                }
            });
        }
        coreData.payWillInfo = this.payWillInfo;
        coreData.visitorAllCount = this.visitorAllCount;
        coreData.payWillScore = this.payWillScore;
        coreData.payWillScoreThreshold = this.payWillScoreThreshold;
        coreData.scoreThresholdOther = this.scoreThresholdOther;
        List<InstantMatchUserInfo> list158 = this.picksInfo;
        if (list158 != null) {
            coreData.picksInfo = ValueObject.util_map(list158, new w9j() { // from class: l.hh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((InstantMatchUserInfo) obj).mo223809clone();
                }
            });
        }
        List<SuperlikeByCount> list159 = this.superlikeByCounts;
        if (list159 != null) {
            coreData.superlikeByCounts = ValueObject.util_map(list159, new w9j() { // from class: l.ih8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SuperlikeByCount) obj).mo223809clone();
                }
            });
        }
        List<ComplimentText> list160 = this.complimentTexts;
        if (list160 != null) {
            coreData.complimentTexts = ValueObject.util_map(list160, new w9j() { // from class: l.jh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ComplimentText) obj).mo223809clone();
                }
            });
        }
        ComplimentFromOther complimentFromOther = this.compliment;
        if (complimentFromOther != null) {
            coreData.compliment = complimentFromOther.mo223809clone();
        }
        List<SuggestedComplimentItem> list161 = this.compliments;
        if (list161 != null) {
            coreData.compliments = ValueObject.util_map(list161, new w9j() { // from class: l.lh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SuggestedComplimentItem) obj).mo223809clone();
                }
            });
        }
        List<IapAffiliatePromotion> list162 = this.iapAffiliatePromotions;
        if (list162 != null) {
            coreData.iapAffiliatePromotions = ValueObject.util_map(list162, new w9j() { // from class: l.mh8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IapAffiliatePromotion) obj).mo223809clone();
                }
            });
        }
        return coreData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreData)) {
            return false;
        }
        CoreData coreData = (CoreData) obj;
        return this == obj && ValueObject.util_equals(this.relationships, coreData.relationships) && ValueObject.util_equals(this.conversations, coreData.conversations) && ValueObject.util_equals(this.messages, coreData.messages) && ValueObject.util_equals(this.contacts, coreData.contacts) && ValueObject.util_equals(this.questions, coreData.questions) && ValueObject.util_equals(this.stickers, coreData.stickers) && ValueObject.util_equals(this.packages, coreData.packages) && ValueObject.util_equals(this.bundles, coreData.bundles) && ValueObject.util_equals(this.links, coreData.links) && ValueObject.util_equals(this.schools, coreData.schools) && ValueObject.util_equals(this.reminders, coreData.reminders) && ValueObject.util_equals(this.verificationCenter, coreData.verificationCenter) && ValueObject.util_equals(this.wallet, coreData.wallet) && ValueObject.util_equals(this.privateQuestions, coreData.privateQuestions) && ValueObject.util_equals(this.coins, coreData.coins) && ValueObject.util_equals(this.summarizedPrivileges, coreData.summarizedPrivileges) && ValueObject.util_equals(this.faceidTokens, coreData.faceidTokens) && ValueObject.util_equals(this.merchandises, coreData.merchandises) && ValueObject.util_equals(this.privacySettings, coreData.privacySettings) && ValueObject.util_equals(this.figures, coreData.figures) && ValueObject.util_equals(this.orders, coreData.orders) && ValueObject.util_equals(this.boostStatus, coreData.boostStatus) && ValueObject.util_equals(this.summarizedPrivilegePrices, coreData.summarizedPrivilegePrices) && ValueObject.util_equals(this.advancedSettings, coreData.advancedSettings) && ValueObject.util_equals(this.surveys, coreData.surveys) && ValueObject.util_equals(this.appealInfos, coreData.appealInfos) && ValueObject.util_equals(this.autoDeducts, coreData.autoDeducts) && ValueObject.util_equals(this.voiceCall, coreData.voiceCall) && ValueObject.util_equals(this.complain, coreData.complain) && ValueObject.util_equals(this.liveLabels, coreData.liveLabels) && ValueObject.util_equals(this.likedUsers, coreData.likedUsers) && ValueObject.util_equals(this.refundDetails, coreData.refundDetails) && ValueObject.util_equals(this.walletAccounts, coreData.walletAccounts) && ValueObject.util_equals(this.accountRecords, coreData.accountRecords) && ValueObject.util_equals(this.monetizationConfiguration, coreData.monetizationConfiguration) && ValueObject.util_equals(this.contract, coreData.contract) && ValueObject.util_equals(this.verificationTokens, coreData.verificationTokens) && ValueObject.util_equals(this.heartbeats, coreData.heartbeats) && ValueObject.util_equals(this.contractInfos, coreData.contractInfos) && ValueObject.util_equals(this.chatGroups, coreData.chatGroups) && ValueObject.util_equals(this.chatGroupMembers, coreData.chatGroupMembers) && ValueObject.util_equals(this.groupApplies, coreData.groupApplies) && ValueObject.util_equals(this.notificationCounters, coreData.notificationCounters) && ValueObject.util_equals(this.groupNotifications, coreData.groupNotifications) && ValueObject.util_equals(this.groupAttributes, coreData.groupAttributes) && ValueObject.util_equals(this.interestedGroups, coreData.interestedGroups) && ValueObject.util_equals(this.groupTabs, coreData.groupTabs) && ValueObject.util_equals(this.keywords, coreData.keywords) && ValueObject.util_equals(this.groupSettings, coreData.groupSettings) && ValueObject.util_equals(this.settingGroups, coreData.settingGroups) && ValueObject.util_equals(this.lives, coreData.lives) && ValueObject.util_equals(this.officialAccounts, coreData.officialAccounts) && ValueObject.util_equals(this.menus, coreData.menus) && ValueObject.util_equals(this.tickles, coreData.tickles) && ValueObject.util_equals(this.monetizationPromotions, coreData.monetizationPromotions) && ValueObject.util_equals(this.coupons, coreData.coupons) && ValueObject.util_equals(this.chatProfiles, coreData.chatProfiles) && ValueObject.util_equals(this.systemQuestions, coreData.systemQuestions) && ValueObject.util_equals(this.priorityLike, coreData.priorityLike) && ValueObject.util_equals(this.couponBag, coreData.couponBag) && ValueObject.util_equals(this.userStickers, coreData.userStickers) && ValueObject.util_equals(this.redPackets, coreData.redPackets) && ValueObject.util_equals(this.giftInfos, coreData.giftInfos) && ValueObject.util_equals(this.counterVerification, coreData.counterVerification) && ValueObject.util_equals(this.liveSchemas, coreData.liveSchemas) && ValueObject.util_equals(this.friends, coreData.friends) && this.nextTime == coreData.nextTime && ValueObject.util_equals(this.conversationDiff, coreData.conversationDiff) && ValueObject.util_equals(this.comStatusAwards, coreData.comStatusAwards) && ValueObject.util_equals(this.cardStyles, coreData.cardStyles) && ValueObject.util_equals(this.audioTexts, coreData.audioTexts) && ValueObject.util_equals(this.giftGuide, coreData.giftGuide) && ValueObject.util_equals(this.giftPanel, coreData.giftPanel) && ValueObject.util_equals(this.giftWallSocials, coreData.giftWallSocials) && ValueObject.util_equals(this.giftWallRankInfos, coreData.giftWallRankInfos) && ValueObject.util_equals(this.giftWallTitles, coreData.giftWallTitles) && ValueObject.util_equals(this.newGiftWalls, coreData.newGiftWalls) && ValueObject.util_equals(this.purchaseDialogConfigs, coreData.purchaseDialogConfigs) && ValueObject.util_equals(this.greetings, coreData.greetings) && ValueObject.util_equals(this.greetingCounter, coreData.greetingCounter) && ValueObject.util_equals(this.greetingPermissions, coreData.greetingPermissions) && ValueObject.util_equals(this.greetingSummary, coreData.greetingSummary) && this.hint == coreData.hint && ValueObject.util_equals(this.cardExtraInfos, coreData.cardExtraInfos) && ValueObject.util_equals(this.readMessages, coreData.readMessages) && ValueObject.util_equals(this.recentConversations, coreData.recentConversations) && ValueObject.util_equals(this.orderInfos, coreData.orderInfos) && ValueObject.util_equals(this.quickchatCard, coreData.quickchatCard) && ValueObject.util_equals(this.picksUsers, coreData.picksUsers) && ValueObject.util_equals(this.picks, coreData.picks) && ValueObject.util_equals(this.countdownLikes, coreData.countdownLikes) && ValueObject.util_equals(this.greetingSetting, coreData.greetingSetting) && ValueObject.util_equals(this.onlineLiveChatPair, coreData.onlineLiveChatPair) && ValueObject.util_equals(this.likedMes, coreData.likedMes) && ValueObject.util_equals(this.myMeet, coreData.myMeet) && ValueObject.util_equals(this.moments, coreData.moments) && ValueObject.util_equals(this.voicechat, coreData.voicechat) && ValueObject.util_equals(this.bell, coreData.bell) && this.isHit == coreData.isHit && ValueObject.util_equals(this.user, coreData.user) && ValueObject.util_equals(this.literaturesComments, coreData.literaturesComments) && ValueObject.util_equals(this.literatures, coreData.literatures) && ValueObject.util_equals(this.membershipRecommendUsers, coreData.membershipRecommendUsers) && ValueObject.util_equals(this.freeTrialInfo, coreData.freeTrialInfo) && ValueObject.util_equals(this.freeTrialOperateResult, coreData.freeTrialOperateResult) && ValueObject.util_equals(this.speedUpCard, coreData.speedUpCard) && ValueObject.util_equals(this.states, coreData.states) && ValueObject.util_equals(this.thirdPartyInfo, coreData.thirdPartyInfo) && ValueObject.util_equals(this.evaluations, coreData.evaluations) && ValueObject.util_equals(this.evaluationReports, coreData.evaluationReports) && ValueObject.util_equals(this.msgData, coreData.msgData) && ValueObject.util_equals(this.evaluation, coreData.evaluation) && ValueObject.util_equals(this.privilegeGifts, coreData.privilegeGifts) && ValueObject.util_equals(this.recommendMessages, coreData.recommendMessages) && ValueObject.util_equals(this.greets, coreData.greets) && ValueObject.util_equals(this.cardModels, coreData.cardModels) && ValueObject.util_equals(this.heartbeatMatch, coreData.heartbeatMatch) && ValueObject.util_equals(this.oneside, coreData.oneside) && ValueObject.util_equals(this.myMeetListV3, coreData.myMeetListV3) && ValueObject.util_equals(this.myMeetEntryV3, coreData.myMeetEntryV3) && ValueObject.util_equals(this.intlInsertCardSets, coreData.intlInsertCardSets) && ValueObject.util_equals(this.actives, coreData.actives) && ValueObject.util_equals(this.cardsIcons, coreData.cardsIcons) && ValueObject.util_equals(this.tacitTest, coreData.tacitTest) && ValueObject.util_equals(this.iceBreakings, coreData.iceBreakings) && ValueObject.util_equals(this.greetingHotLevelInfo, coreData.greetingHotLevelInfo) && ValueObject.util_equals(this.voices, coreData.voices) && ValueObject.util_equals(this.avatar, coreData.avatar) && ValueObject.util_equals(this.suggestUsers, coreData.suggestUsers) && ValueObject.util_equals(this.action, coreData.action) && ValueObject.util_equals(this.tagLoadStrategy, coreData.tagLoadStrategy) && ValueObject.util_equals(this.tags, coreData.tags) && ValueObject.util_equals(this.tagCategoryStrategy, coreData.tagCategoryStrategy) && ValueObject.util_equals(this.tagCategories, coreData.tagCategories) && ValueObject.util_equals(this.tagUserCounts, coreData.tagUserCounts) && ValueObject.util_equals(this.sames, coreData.sames) && ValueObject.util_equals(this.literatureConfigInfo, coreData.literatureConfigInfo) && ValueObject.util_equals(this.anonymousSummary, coreData.anonymousSummary) && ValueObject.util_equals(this.cardInfos, coreData.cardInfos) && ValueObject.util_equals(this.seeInfos, coreData.seeInfos) && ValueObject.util_equals(this.seePortraits, coreData.seePortraits) && ValueObject.util_equals(this.profileLikesComments, coreData.profileLikesComments) && ValueObject.util_equals(this.profileLikeCounter, coreData.profileLikeCounter) && ValueObject.util_equals(this.extraPrivileges, coreData.extraPrivileges) && ValueObject.util_equals(this.selectedQuestion, coreData.selectedQuestion) && ValueObject.util_equals(this.likeUsers, coreData.likeUsers) && this.next == coreData.next && ValueObject.util_equals(this.cipherId, coreData.cipherId) && ValueObject.util_equals(this.shareId, coreData.shareId) && ValueObject.util_equals(this.stateEmotion, coreData.stateEmotion) && ValueObject.util_equals(this.seePortraitCounter, coreData.seePortraitCounter) && ValueObject.util_equals(this.recommended, coreData.recommended) && ValueObject.util_equals(this.chatHeats, coreData.chatHeats) && ValueObject.util_equals(this.chatHeatPermissions, coreData.chatHeatPermissions) && ValueObject.util_equals(this.resources, coreData.resources) && ValueObject.util_equals(this.greetingResult, coreData.greetingResult) && ValueObject.util_equals(this.latestMoments, coreData.latestMoments) && ValueObject.util_equals(this.jmpTarget, coreData.jmpTarget) && ValueObject.util_equals(this.buzzUsers, coreData.buzzUsers) && ValueObject.util_equals(this.odiamondList, coreData.odiamondList) && ValueObject.util_equals(this.popGuide, coreData.popGuide) && ValueObject.util_equals(this.superLikeCount, coreData.superLikeCount) && ValueObject.util_equals(this.floats, coreData.floats) && ValueObject.util_equals(this.monetizationMsg, coreData.monetizationMsg) && ValueObject.util_equals(this.link, coreData.link) && ValueObject.util_equals(this.tab, coreData.tab) && ValueObject.util_equals(this.seeExposedUser, coreData.seeExposedUser) && ValueObject.util_equals(this.exposureInfo, coreData.exposureInfo) && ValueObject.util_equals(this.love520, coreData.love520) && ValueObject.util_equals(this.payWill, coreData.payWill) && ValueObject.util_equals(this.extremePickByList, coreData.extremePickByList) && ValueObject.util_equals(this.chatGameInfo, coreData.chatGameInfo) && ValueObject.util_equals(this.camping, coreData.camping) && ValueObject.util_equals(this.recallMatch, coreData.recallMatch) && ValueObject.util_equals(this.liveActivities, coreData.liveActivities) && ValueObject.util_equals(this.mkt_activity_regular, coreData.mkt_activity_regular) && ValueObject.util_equals(this.monetizationChatSeeUser, coreData.monetizationChatSeeUser) && ValueObject.util_equals(this.intlVisitorInfo, coreData.intlVisitorInfo) && this.count == coreData.count && ValueObject.util_equals(this.invalidCardList, coreData.invalidCardList) && ValueObject.util_equals(this.chatAssistantQuestions, coreData.chatAssistantQuestions) && ValueObject.util_equals(this.mkt_activity_quiz, coreData.mkt_activity_quiz) && this.isRecallUser == coreData.isRecallUser && ValueObject.util_equals(this.greetingNewPeople, coreData.greetingNewPeople) && ValueObject.util_equals(this.greetingNewPeopleMessage, coreData.greetingNewPeopleMessage) && ValueObject.util_equals(this.extremeQuestions, coreData.extremeQuestions) && ValueObject.util_equals(this.boostResultEntry, coreData.boostResultEntry) && ValueObject.util_equals(this.todayMatchInfo, coreData.todayMatchInfo) && ValueObject.util_equals(this.growthMesInfo, coreData.growthMesInfo) && ValueObject.util_equals(this.aiPictureAuth, coreData.aiPictureAuth) && ValueObject.util_equals(this.acceleratePairing, coreData.acceleratePairing) && ValueObject.util_equals(this.invitation, coreData.invitation) && ValueObject.util_equals(this.campaignPage, coreData.campaignPage) && ValueObject.util_equals(this.partner, coreData.partner) && ValueObject.util_equals(this.cityCData, coreData.cityCData) && ValueObject.util_equals(this.blindbox, coreData.blindbox) && ValueObject.util_equals(this.unReadUserIds, coreData.unReadUserIds) && ValueObject.util_equals(this.cityCBanner, coreData.cityCBanner) && ValueObject.util_equals(this.chatPartners, coreData.chatPartners) && ValueObject.util_equals(this.chatPartnersSignals, coreData.chatPartnersSignals) && ValueObject.util_equals(this.surpriseGift, coreData.surpriseGift) && this.surpriseGiftExpirationTime == coreData.surpriseGiftExpirationTime && ValueObject.util_equals(this.cardCornerMarks, coreData.cardCornerMarks) && ValueObject.util_equals(this.lowPhotoResult, coreData.lowPhotoResult) && ValueObject.util_equals(this.mkt_activity_flash, coreData.mkt_activity_flash) && ValueObject.util_equals(this.cityCConfig, coreData.cityCConfig) && ValueObject.util_equals(this.privateCustomSetting, coreData.privateCustomSetting) && ValueObject.util_equals(this.privateCustomResults, coreData.privateCustomResults) && ValueObject.util_equals(this.visitorSetting, coreData.visitorSetting) && ValueObject.util_equals(this.visitorHiddens, coreData.visitorHiddens) && ValueObject.util_equals(this.marriageGuide, coreData.marriageGuide) && ValueObject.util_equals(this.selectionUsers, coreData.selectionUsers) && ValueObject.util_equals(this.selectionUserInfo, coreData.selectionUserInfo) && ValueObject.util_equals(this.userAudits, coreData.userAudits) && ValueObject.util_equals(this.dynamicLabels, coreData.dynamicLabels) && ValueObject.util_equals(this.details, coreData.details) && ValueObject.util_equals(this.layer, coreData.layer) && ValueObject.util_equals(this.auditPictureTags, coreData.auditPictureTags) && ValueObject.util_equals(this.myTabGuide, coreData.myTabGuide) && this.profileGuide == coreData.profileGuide && ValueObject.util_equals(this.tagPictureStrategy, coreData.tagPictureStrategy) && ValueObject.util_equals(this.pictureTags, coreData.pictureTags) && ValueObject.util_equals(this.fakeSuggest, coreData.fakeSuggest) && ValueObject.util_equals(this.userRisk, coreData.userRisk) && ValueObject.util_equals(this.descriptionRisk, coreData.descriptionRisk) && ValueObject.util_equals(this.risks, coreData.risks) && ValueObject.util_equals(this.barLoverPlaces, coreData.barLoverPlaces) && ValueObject.util_equals(this.barLoverCities, coreData.barLoverCities) && ValueObject.util_equals(this.fateRadar, coreData.fateRadar) && ValueObject.util_equals(this.svipWeeklyReport, coreData.svipWeeklyReport) && ValueObject.util_equals(this.explore, coreData.explore) && ValueObject.util_equals(this.wechat, coreData.wechat) && ValueObject.util_equals(this.vipSettings, coreData.vipSettings) && ValueObject.util_equals(this.iceBreakQuestions, coreData.iceBreakQuestions) && ValueObject.util_equals(this.fakeGuideData, coreData.fakeGuideData) && ValueObject.util_equals(this.userActivityInfos, coreData.userActivityInfos) && ValueObject.util_equals(this.questionnaire, coreData.questionnaire) && ValueObject.util_equals(this.features, coreData.features) && ValueObject.util_equals(this.userStrategyConfiguration, coreData.userStrategyConfiguration) && ValueObject.util_equals(this.fakePhotoFeedback, coreData.fakePhotoFeedback) && ValueObject.util_equals(this.repeatPictureResult, coreData.repeatPictureResult) && ValueObject.util_equals(this.netPictureResult, coreData.netPictureResult) && ValueObject.util_equals(this.userFeedbackInfo, coreData.userFeedbackInfo) && ValueObject.util_equals(this.idealDetails, coreData.idealDetails) && ValueObject.util_equals(this.idealInfo, coreData.idealInfo) && ValueObject.util_equals(this.idealInfos, coreData.idealInfos) && ValueObject.util_equals(this.urlTags, coreData.urlTags) && ValueObject.util_equals(this.profileCounts, coreData.profileCounts) && ValueObject.util_equals(this.privateCustomResult, coreData.privateCustomResult) && ValueObject.util_equals(this.videoChatSecondFloorSummary, coreData.videoChatSecondFloorSummary) && ValueObject.util_equals(this.realPicturesBanner, coreData.realPicturesBanner) && ValueObject.util_equals(this.realPicturesInfo, coreData.realPicturesInfo) && ValueObject.util_equals(this.ipRegion, coreData.ipRegion) && ValueObject.util_equals(this.realFeelInfo, coreData.realFeelInfo) && ValueObject.util_equals(this.loveLetter, coreData.loveLetter) && ValueObject.util_equals(this.loveLetterGroup, coreData.loveLetterGroup) && ValueObject.util_equals(this.loveLetterContent, coreData.loveLetterContent) && ValueObject.util_equals(this.chatPage, coreData.chatPage) && ValueObject.util_equals(this.showOnlineForWhoIMeet, coreData.showOnlineForWhoIMeet) && ValueObject.util_equals(this.notVerificationResultData, coreData.notVerificationResultData) && ValueObject.util_equals(this.verificationLowLabels, coreData.verificationLowLabels) && ValueObject.util_equals(this.myTabTasks, coreData.myTabTasks) && ValueObject.util_equals(this.pendingPaymentGuidance, coreData.pendingPaymentGuidance) && ValueObject.util_equals(this.seeTrialEligible, coreData.seeTrialEligible) && ValueObject.util_equals(this.seeTrialStatus, coreData.seeTrialStatus) && this.likedByToday == coreData.likedByToday && ValueObject.util_equals(this.feedbackQuestions, coreData.feedbackQuestions) && this.feedbackRemainedNum == coreData.feedbackRemainedNum && ValueObject.util_equals(this.instantChat, coreData.instantChat) && ValueObject.util_equals(this.aiChatAdvice, coreData.aiChatAdvice) && ValueObject.util_equals(this.aiChatAnalysis, coreData.aiChatAnalysis) && ValueObject.util_equals(this.invitationInfo, coreData.invitationInfo) && ValueObject.util_equals(this.pictureVerifyRightedInfo, coreData.pictureVerifyRightedInfo) && ValueObject.util_equals(this.diamond, coreData.diamond) && this.canChange == coreData.canChange && this.ttcToDiamondRate == coreData.ttcToDiamondRate && ValueObject.util_equals(this.prologues, coreData.prologues) && ValueObject.util_equals(this.instantMatchGiveCountInfo, coreData.instantMatchGiveCountInfo) && ValueObject.util_equals(this.creditScores, coreData.creditScores) && ValueObject.util_equals(this.dislikedUsers, coreData.dislikedUsers) && ValueObject.util_equals(this.analysisGuide, coreData.analysisGuide) && ValueObject.util_equals(this.visitorDoorInfo, coreData.visitorDoorInfo) && ValueObject.util_equals(this.visitorInfo, coreData.visitorInfo) && ValueObject.util_equals(this.instantMatchUserInfo, coreData.instantMatchUserInfo) && ValueObject.util_equals(this.recommendList, coreData.recommendList) && ValueObject.util_equals(this.intlBubble, coreData.intlBubble) && ValueObject.util_equals(this.membershipUpgradeInfo, coreData.membershipUpgradeInfo) && ValueObject.util_equals(this.ultraRightsUpgradeInfo, coreData.ultraRightsUpgradeInfo) && ValueObject.util_equals(this.purchaseSavePop, coreData.purchaseSavePop) && ValueObject.util_equals(this.swipeUpperLimit, coreData.swipeUpperLimit) && this.payWillInfo == coreData.payWillInfo && this.visitorAllCount == coreData.visitorAllCount && this.payWillScore == coreData.payWillScore && this.payWillScoreThreshold == coreData.payWillScoreThreshold && this.scoreThresholdOther == coreData.scoreThresholdOther && ValueObject.util_equals(this.picksInfo, coreData.picksInfo) && ValueObject.util_equals(this.superlikeByCounts, coreData.superlikeByCounts) && ValueObject.util_equals(this.complimentTexts, coreData.complimentTexts) && ValueObject.util_equals(this.compliment, coreData.compliment) && ValueObject.util_equals(this.compliments, coreData.compliments) && ValueObject.util_equals(this.iapAffiliatePromotions, coreData.iapAffiliatePromotions);
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
        int iHashCode = super.hashCode() * 41;
        List<Relationship> list = this.relationships;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<Conversation> list2 = this.conversations;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Message> list3 = this.messages;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<Contact> list4 = this.contacts;
        int iHashCode5 = (iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<Question> list5 = this.questions;
        int iHashCode6 = (iHashCode5 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<Sticker> list6 = this.stickers;
        int iHashCode7 = (iHashCode6 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<StickerPackage> list7 = this.packages;
        int iHashCode8 = (iHashCode7 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<StickerBundle> list8 = this.bundles;
        int iHashCode9 = (iHashCode8 + (list8 != null ? list8.hashCode() : 0)) * 41;
        List<Link> list9 = this.links;
        int iHashCode10 = (iHashCode9 + (list9 != null ? list9.hashCode() : 0)) * 41;
        List<School> list10 = this.schools;
        int iHashCode11 = (iHashCode10 + (list10 != null ? list10.hashCode() : 0)) * 41;
        List<Reminder> list11 = this.reminders;
        int iHashCode12 = (iHashCode11 + (list11 != null ? list11.hashCode() : 0)) * 41;
        List<VerificationCenter> list12 = this.verificationCenter;
        int iHashCode13 = (iHashCode12 + (list12 != null ? list12.hashCode() : 0)) * 41;
        Wallet wallet = this.wallet;
        int iHashCode14 = (iHashCode13 + (wallet != null ? wallet.hashCode() : 0)) * 41;
        List<PrivateQuestion> list13 = this.privateQuestions;
        int iHashCode15 = (iHashCode14 + (list13 != null ? list13.hashCode() : 0)) * 41;
        Coin coin = this.coins;
        int iHashCode16 = (iHashCode15 + (coin != null ? coin.hashCode() : 0)) * 41;
        List<UserPrivilege> list14 = this.summarizedPrivileges;
        int iHashCode17 = (iHashCode16 + (list14 != null ? list14.hashCode() : 0)) * 41;
        List<FaceidToken> list15 = this.faceidTokens;
        int iHashCode18 = (iHashCode17 + (list15 != null ? list15.hashCode() : 0)) * 41;
        List<Merchandise> list16 = this.merchandises;
        int iHashCode19 = (iHashCode18 + (list16 != null ? list16.hashCode() : 0)) * 41;
        List<PrivacyMembershipSetting> list17 = this.privacySettings;
        int iHashCode20 = (iHashCode19 + (list17 != null ? list17.hashCode() : 0)) * 41;
        List<Figure> list18 = this.figures;
        int iHashCode21 = (iHashCode20 + (list18 != null ? list18.hashCode() : 0)) * 41;
        List<PaymentOrder> list19 = this.orders;
        int iHashCode22 = (iHashCode21 + (list19 != null ? list19.hashCode() : 0)) * 41;
        List<BoostStatus> list20 = this.boostStatus;
        int iHashCode23 = (iHashCode22 + (list20 != null ? list20.hashCode() : 0)) * 41;
        List<SummarizedPrivilegePrice> list21 = this.summarizedPrivilegePrices;
        int iHashCode24 = (iHashCode23 + (list21 != null ? list21.hashCode() : 0)) * 41;
        List<AdvancedSettings> list22 = this.advancedSettings;
        int iHashCode25 = (iHashCode24 + (list22 != null ? list22.hashCode() : 0)) * 41;
        List<Surveys> list23 = this.surveys;
        int iHashCode26 = (iHashCode25 + (list23 != null ? list23.hashCode() : 0)) * 41;
        List<AppealInfo> list24 = this.appealInfos;
        int iHashCode27 = (iHashCode26 + (list24 != null ? list24.hashCode() : 0)) * 41;
        List<AutoDeducts> list25 = this.autoDeducts;
        int iHashCode28 = (iHashCode27 + (list25 != null ? list25.hashCode() : 0)) * 41;
        List<VoiceCall> list26 = this.voiceCall;
        int iHashCode29 = (iHashCode28 + (list26 != null ? list26.hashCode() : 0)) * 41;
        List<Complain> list27 = this.complain;
        int iHashCode30 = (iHashCode29 + (list27 != null ? list27.hashCode() : 0)) * 41;
        List<UserLiveLabel> list28 = this.liveLabels;
        int iHashCode31 = (iHashCode30 + (list28 != null ? list28.hashCode() : 0)) * 41;
        List<LikedUser> list29 = this.likedUsers;
        int iHashCode32 = (iHashCode31 + (list29 != null ? list29.hashCode() : 0)) * 41;
        List<RefundDetail> list30 = this.refundDetails;
        int iHashCode33 = (iHashCode32 + (list30 != null ? list30.hashCode() : 0)) * 41;
        List<WalletAccount> list31 = this.walletAccounts;
        int iHashCode34 = (iHashCode33 + (list31 != null ? list31.hashCode() : 0)) * 41;
        List<AccountRecord> list32 = this.accountRecords;
        int iHashCode35 = (iHashCode34 + (list32 != null ? list32.hashCode() : 0)) * 41;
        MonetizationConfiguration monetizationConfiguration = this.monetizationConfiguration;
        int iHashCode36 = (iHashCode35 + (monetizationConfiguration != null ? monetizationConfiguration.hashCode() : 0)) * 41;
        Contract contract = this.contract;
        int iHashCode37 = (iHashCode36 + (contract != null ? contract.hashCode() : 0)) * 41;
        List<VerificationToken> list33 = this.verificationTokens;
        int iHashCode38 = (iHashCode37 + (list33 != null ? list33.hashCode() : 0)) * 41;
        List<HeartBeat> list34 = this.heartbeats;
        int iHashCode39 = (iHashCode38 + (list34 != null ? list34.hashCode() : 0)) * 41;
        List<ContractInfo> list35 = this.contractInfos;
        int iHashCode40 = (iHashCode39 + (list35 != null ? list35.hashCode() : 0)) * 41;
        List<ChatGroup> list36 = this.chatGroups;
        int iHashCode41 = (iHashCode40 + (list36 != null ? list36.hashCode() : 0)) * 41;
        List<ChatGroupMember> list37 = this.chatGroupMembers;
        int iHashCode42 = (iHashCode41 + (list37 != null ? list37.hashCode() : 0)) * 41;
        List<GroupApply> list38 = this.groupApplies;
        int iHashCode43 = (iHashCode42 + (list38 != null ? list38.hashCode() : 0)) * 41;
        List<NotificationCounter> list39 = this.notificationCounters;
        int iHashCode44 = (iHashCode43 + (list39 != null ? list39.hashCode() : 0)) * 41;
        List<GroupNotification> list40 = this.groupNotifications;
        int iHashCode45 = (iHashCode44 + (list40 != null ? list40.hashCode() : 0)) * 41;
        List<GroupAttribute> list41 = this.groupAttributes;
        int iHashCode46 = (iHashCode45 + (list41 != null ? list41.hashCode() : 0)) * 41;
        List<ChatGroup> list42 = this.interestedGroups;
        int iHashCode47 = (iHashCode46 + (list42 != null ? list42.hashCode() : 0)) * 41;
        List<GroupTab> list43 = this.groupTabs;
        int iHashCode48 = (iHashCode47 + (list43 != null ? list43.hashCode() : 0)) * 41;
        List<String> list44 = this.keywords;
        int iHashCode49 = (iHashCode48 + (list44 != null ? list44.hashCode() : 0)) * 41;
        List<GroupSetting> list45 = this.groupSettings;
        int iHashCode50 = (iHashCode49 + (list45 != null ? list45.hashCode() : 0)) * 41;
        List<SettingGroups> list46 = this.settingGroups;
        int iHashCode51 = (iHashCode50 + (list46 != null ? list46.hashCode() : 0)) * 41;
        List<Live> list47 = this.lives;
        int iHashCode52 = (iHashCode51 + (list47 != null ? list47.hashCode() : 0)) * 41;
        List<OfficialAccount> list48 = this.officialAccounts;
        int iHashCode53 = (iHashCode52 + (list48 != null ? list48.hashCode() : 0)) * 41;
        List<OfficialAccountsMenu> list49 = this.menus;
        int iHashCode54 = (iHashCode53 + (list49 != null ? list49.hashCode() : 0)) * 41;
        List<TickleSettingInfo> list50 = this.tickles;
        int iHashCode55 = (iHashCode54 + (list50 != null ? list50.hashCode() : 0)) * 41;
        List<MonetizationPromotion> list51 = this.monetizationPromotions;
        int iHashCode56 = (iHashCode55 + (list51 != null ? list51.hashCode() : 0)) * 41;
        List<Coupon> list52 = this.coupons;
        int iHashCode57 = (iHashCode56 + (list52 != null ? list52.hashCode() : 0)) * 41;
        List<ChatProfile> list53 = this.chatProfiles;
        int iHashCode58 = (iHashCode57 + (list53 != null ? list53.hashCode() : 0)) * 41;
        List<IceBreakingQuestion> list54 = this.systemQuestions;
        int iHashCode59 = (iHashCode58 + (list54 != null ? list54.hashCode() : 0)) * 41;
        PriorityLike priorityLike = this.priorityLike;
        int iHashCode60 = (iHashCode59 + (priorityLike != null ? priorityLike.hashCode() : 0)) * 41;
        Couponbag couponbag = this.couponBag;
        int iHashCode61 = (iHashCode60 + (couponbag != null ? couponbag.hashCode() : 0)) * 41;
        List<UserSticker> list55 = this.userStickers;
        int iHashCode62 = (iHashCode61 + (list55 != null ? list55.hashCode() : 0)) * 41;
        List<RedPacket> list56 = this.redPackets;
        int iHashCode63 = (iHashCode62 + (list56 != null ? list56.hashCode() : 0)) * 41;
        List<CoreGiftInfo> list57 = this.giftInfos;
        int iHashCode64 = (iHashCode63 + (list57 != null ? list57.hashCode() : 0)) * 41;
        CounterVerification counterVerification = this.counterVerification;
        int iHashCode65 = (iHashCode64 + (counterVerification != null ? counterVerification.hashCode() : 0)) * 41;
        List<LiveSchema> list58 = this.liveSchemas;
        int iHashCode66 = (iHashCode65 + (list58 != null ? list58.hashCode() : 0)) * 41;
        List<FriendInfo> list59 = this.friends;
        int iHashCode67 = list59 != null ? list59.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.nextTime);
        int i2 = (((iHashCode66 + iHashCode67) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        ConversationDiff conversationDiff = this.conversationDiff;
        int iHashCode68 = (i2 + (conversationDiff != null ? conversationDiff.hashCode() : 0)) * 41;
        List<ComStatusAward> list60 = this.comStatusAwards;
        int iHashCode69 = (iHashCode68 + (list60 != null ? list60.hashCode() : 0)) * 41;
        List<CardStyle> list61 = this.cardStyles;
        int iHashCode70 = (iHashCode69 + (list61 != null ? list61.hashCode() : 0)) * 41;
        List<AudioText> list62 = this.audioTexts;
        int iHashCode71 = (iHashCode70 + (list62 != null ? list62.hashCode() : 0)) * 41;
        CoreGiftGuide coreGiftGuide = this.giftGuide;
        int iHashCode72 = (iHashCode71 + (coreGiftGuide != null ? coreGiftGuide.hashCode() : 0)) * 41;
        List<CoreGiftPanel> list63 = this.giftPanel;
        int iHashCode73 = (iHashCode72 + (list63 != null ? list63.hashCode() : 0)) * 41;
        List<GiftWallSocial> list64 = this.giftWallSocials;
        int iHashCode74 = (iHashCode73 + (list64 != null ? list64.hashCode() : 0)) * 41;
        List<GiftWallRankInfo> list65 = this.giftWallRankInfos;
        int iHashCode75 = (iHashCode74 + (list65 != null ? list65.hashCode() : 0)) * 41;
        List<GiftWallTitle> list66 = this.giftWallTitles;
        int iHashCode76 = (iHashCode75 + (list66 != null ? list66.hashCode() : 0)) * 41;
        List<NewGiftWall> list67 = this.newGiftWalls;
        int iHashCode77 = (iHashCode76 + (list67 != null ? list67.hashCode() : 0)) * 41;
        PurchaseDialogConfigs purchaseDialogConfigs = this.purchaseDialogConfigs;
        int iHashCode78 = (iHashCode77 + (purchaseDialogConfigs != null ? purchaseDialogConfigs.hashCode() : 0)) * 41;
        List<Greeting> list68 = this.greetings;
        int iHashCode79 = (iHashCode78 + (list68 != null ? list68.hashCode() : 0)) * 41;
        GreetingCounter greetingCounter = this.greetingCounter;
        int iHashCode80 = (iHashCode79 + (greetingCounter != null ? greetingCounter.hashCode() : 0)) * 41;
        List<GreetingPermission> list69 = this.greetingPermissions;
        int iHashCode81 = (iHashCode80 + (list69 != null ? list69.hashCode() : 0)) * 41;
        GreetingSummary greetingSummary = this.greetingSummary;
        int iHashCode82 = (((iHashCode81 + (greetingSummary != null ? greetingSummary.hashCode() : 0)) * 41) + (this.hint ? 1231 : 1237)) * 41;
        List<CardExtraInfo> list70 = this.cardExtraInfos;
        int iHashCode83 = (iHashCode82 + (list70 != null ? list70.hashCode() : 0)) * 41;
        List<ReadMessage> list71 = this.readMessages;
        int iHashCode84 = (iHashCode83 + (list71 != null ? list71.hashCode() : 0)) * 41;
        List<RecentConversation> list72 = this.recentConversations;
        int iHashCode85 = (iHashCode84 + (list72 != null ? list72.hashCode() : 0)) * 41;
        List<OrderInfo> list73 = this.orderInfos;
        int iHashCode86 = (iHashCode85 + (list73 != null ? list73.hashCode() : 0)) * 41;
        QuickChatCardInfo quickChatCardInfo = this.quickchatCard;
        int iHashCode87 = (iHashCode86 + (quickChatCardInfo != null ? quickChatCardInfo.hashCode() : 0)) * 41;
        List<PicksUser> list74 = this.picksUsers;
        int iHashCode88 = (iHashCode87 + (list74 != null ? list74.hashCode() : 0)) * 41;
        Picks picks = this.picks;
        int iHashCode89 = (iHashCode88 + (picks != null ? picks.hashCode() : 0)) * 41;
        List<CountdownItem> list75 = this.countdownLikes;
        int iHashCode90 = (iHashCode89 + (list75 != null ? list75.hashCode() : 0)) * 41;
        GreetingSetting greetingSetting = this.greetingSetting;
        int iHashCode91 = (iHashCode90 + (greetingSetting != null ? greetingSetting.hashCode() : 0)) * 41;
        OnlineLiveChatPair onlineLiveChatPair = this.onlineLiveChatPair;
        int iHashCode92 = (iHashCode91 + (onlineLiveChatPair != null ? onlineLiveChatPair.hashCode() : 0)) * 41;
        List<CardStyle> list76 = this.likedMes;
        int iHashCode93 = (iHashCode92 + (list76 != null ? list76.hashCode() : 0)) * 41;
        MyMeetExtra myMeetExtra = this.myMeet;
        int iHashCode94 = (iHashCode93 + (myMeetExtra != null ? myMeetExtra.hashCode() : 0)) * 41;
        List<CoreMomentInfo> list77 = this.moments;
        int iHashCode95 = (iHashCode94 + (list77 != null ? list77.hashCode() : 0)) * 41;
        VoiceChatInfo voiceChatInfo = this.voicechat;
        int iHashCode96 = (iHashCode95 + (voiceChatInfo != null ? voiceChatInfo.hashCode() : 0)) * 41;
        QuickChatBellData quickChatBellData = this.bell;
        int iHashCode97 = (((iHashCode96 + (quickChatBellData != null ? quickChatBellData.hashCode() : 0)) * 41) + (this.isHit ? 1231 : 1237)) * 41;
        User user = this.user;
        int iHashCode98 = (iHashCode97 + (user != null ? user.hashCode() : 0)) * 41;
        List<LiteraturesComments> list78 = this.literaturesComments;
        int iHashCode99 = (iHashCode98 + (list78 != null ? list78.hashCode() : 0)) * 41;
        List<Literatures> list79 = this.literatures;
        int iHashCode100 = (iHashCode99 + (list79 != null ? list79.hashCode() : 0)) * 41;
        List<MembershipRecommendUser> list80 = this.membershipRecommendUsers;
        int iHashCode101 = (iHashCode100 + (list80 != null ? list80.hashCode() : 0)) * 41;
        FreeTrialInfo freeTrialInfo = this.freeTrialInfo;
        int iHashCode102 = (iHashCode101 + (freeTrialInfo != null ? freeTrialInfo.hashCode() : 0)) * 41;
        FreeTrialOperateResult freeTrialOperateResult = this.freeTrialOperateResult;
        int iHashCode103 = (iHashCode102 + (freeTrialOperateResult != null ? freeTrialOperateResult.hashCode() : 0)) * 41;
        Note note = this.speedUpCard;
        int iHashCode104 = (iHashCode103 + (note != null ? note.hashCode() : 0)) * 41;
        List<BubbleInfo> list81 = this.states;
        int iHashCode105 = (iHashCode104 + (list81 != null ? list81.hashCode() : 0)) * 41;
        ThirdPartyInfo thirdPartyInfo = this.thirdPartyInfo;
        int iHashCode106 = (iHashCode105 + (thirdPartyInfo != null ? thirdPartyInfo.hashCode() : 0)) * 41;
        List<Evaluation> list82 = this.evaluations;
        int iHashCode107 = (iHashCode106 + (list82 != null ? list82.hashCode() : 0)) * 41;
        List<EvaluationReport> list83 = this.evaluationReports;
        int iHashCode108 = (iHashCode107 + (list83 != null ? list83.hashCode() : 0)) * 41;
        MessageFeedbackStatus messageFeedbackStatus = this.msgData;
        int iHashCode109 = (iHashCode108 + (messageFeedbackStatus != null ? messageFeedbackStatus.hashCode() : 0)) * 41;
        Evaluation evaluation = this.evaluation;
        int iHashCode110 = (iHashCode109 + (evaluation != null ? evaluation.hashCode() : 0)) * 41;
        List<PrivilegeGift> list84 = this.privilegeGifts;
        int iHashCode111 = (iHashCode110 + (list84 != null ? list84.hashCode() : 0)) * 41;
        List<RecommendMessage> list85 = this.recommendMessages;
        int iHashCode112 = (iHashCode111 + (list85 != null ? list85.hashCode() : 0)) * 41;
        List<UserGreetInfo> list86 = this.greets;
        int iHashCode113 = (iHashCode112 + (list86 != null ? list86.hashCode() : 0)) * 41;
        List<CardModel> list87 = this.cardModels;
        int iHashCode114 = (iHashCode113 + (list87 != null ? list87.hashCode() : 0)) * 41;
        HeartBeatMatched heartBeatMatched = this.heartbeatMatch;
        int iHashCode115 = (iHashCode114 + (heartBeatMatched != null ? heartBeatMatched.hashCode() : 0)) * 41;
        QuickChatOneside quickChatOneside = this.oneside;
        int iHashCode116 = (iHashCode115 + (quickChatOneside != null ? quickChatOneside.hashCode() : 0)) * 41;
        MyMeetListV3 myMeetListV3 = this.myMeetListV3;
        int iHashCode117 = (iHashCode116 + (myMeetListV3 != null ? myMeetListV3.hashCode() : 0)) * 41;
        MyMeetEntryV3 myMeetEntryV3 = this.myMeetEntryV3;
        int iHashCode118 = (iHashCode117 + (myMeetEntryV3 != null ? myMeetEntryV3.hashCode() : 0)) * 41;
        List<InsertCard> list88 = this.intlInsertCardSets;
        int iHashCode119 = (iHashCode118 + (list88 != null ? list88.hashCode() : 0)) * 41;
        List<Active> list89 = this.actives;
        int iHashCode120 = (iHashCode119 + (list89 != null ? list89.hashCode() : 0)) * 41;
        List<CardsIcons> list90 = this.cardsIcons;
        int iHashCode121 = (iHashCode120 + (list90 != null ? list90.hashCode() : 0)) * 41;
        TacitTestProfileCard tacitTestProfileCard = this.tacitTest;
        int iHashCode122 = (iHashCode121 + (tacitTestProfileCard != null ? tacitTestProfileCard.hashCode() : 0)) * 41;
        List<BreakIce> list91 = this.iceBreakings;
        int iHashCode123 = (iHashCode122 + (list91 != null ? list91.hashCode() : 0)) * 41;
        GreetingHotLevelInfo greetingHotLevelInfo = this.greetingHotLevelInfo;
        int iHashCode124 = (iHashCode123 + (greetingHotLevelInfo != null ? greetingHotLevelInfo.hashCode() : 0)) * 41;
        List<Voice> list92 = this.voices;
        int iHashCode125 = (iHashCode124 + (list92 != null ? list92.hashCode() : 0)) * 41;
        String str = this.avatar;
        int iHashCode126 = (iHashCode125 + (str != null ? str.hashCode() : 0)) * 41;
        List<SpecialSuggestUsers> list93 = this.suggestUsers;
        int iHashCode127 = (iHashCode126 + (list93 != null ? list93.hashCode() : 0)) * 41;
        ActionData actionData = this.action;
        int iHashCode128 = (iHashCode127 + (actionData != null ? actionData.hashCode() : 0)) * 41;
        TagStrategy tagStrategy = this.tagLoadStrategy;
        int iHashCode129 = (iHashCode128 + (tagStrategy != null ? tagStrategy.hashCode() : 0)) * 41;
        List<NewTags> list94 = this.tags;
        int iHashCode130 = (iHashCode129 + (list94 != null ? list94.hashCode() : 0)) * 41;
        TagStrategy tagStrategy2 = this.tagCategoryStrategy;
        int iHashCode131 = (iHashCode130 + (tagStrategy2 != null ? tagStrategy2.hashCode() : 0)) * 41;
        List<TagCategories> list95 = this.tagCategories;
        int iHashCode132 = (iHashCode131 + (list95 != null ? list95.hashCode() : 0)) * 41;
        List<TagUserCounts> list96 = this.tagUserCounts;
        int iHashCode133 = (iHashCode132 + (list96 != null ? list96.hashCode() : 0)) * 41;
        List<SamesCardData> list97 = this.sames;
        int iHashCode134 = (iHashCode133 + (list97 != null ? list97.hashCode() : 0)) * 41;
        LiteratureConfigInfo literatureConfigInfo = this.literatureConfigInfo;
        int iHashCode135 = (iHashCode134 + (literatureConfigInfo != null ? literatureConfigInfo.hashCode() : 0)) * 41;
        GreetingSummary greetingSummary2 = this.anonymousSummary;
        int iHashCode136 = (iHashCode135 + (greetingSummary2 != null ? greetingSummary2.hashCode() : 0)) * 41;
        List<CardInfos> list98 = this.cardInfos;
        int iHashCode137 = (iHashCode136 + (list98 != null ? list98.hashCode() : 0)) * 41;
        List<SeeInfos> list99 = this.seeInfos;
        int iHashCode138 = (iHashCode137 + (list99 != null ? list99.hashCode() : 0)) * 41;
        List<SeePortrait> list100 = this.seePortraits;
        int iHashCode139 = (iHashCode138 + (list100 != null ? list100.hashCode() : 0)) * 41;
        List<ProfileLikeComment> list101 = this.profileLikesComments;
        int iHashCode140 = (iHashCode139 + (list101 != null ? list101.hashCode() : 0)) * 41;
        ExpandedProfileLikeCounter expandedProfileLikeCounter = this.profileLikeCounter;
        int iHashCode141 = (iHashCode140 + (expandedProfileLikeCounter != null ? expandedProfileLikeCounter.hashCode() : 0)) * 41;
        ExtraPrivileges extraPrivileges = this.extraPrivileges;
        int iHashCode142 = (iHashCode141 + (extraPrivileges != null ? extraPrivileges.hashCode() : 0)) * 41;
        ProfileSelectedQue profileSelectedQue = this.selectedQuestion;
        int iHashCode143 = (iHashCode142 + (profileSelectedQue != null ? profileSelectedQue.hashCode() : 0)) * 41;
        List<LikeUser> list102 = this.likeUsers;
        int iHashCode144 = (((iHashCode143 + (list102 != null ? list102.hashCode() : 0)) * 41) + (this.next ? 1231 : 1237)) * 41;
        CipherId cipherId = this.cipherId;
        int iHashCode145 = (iHashCode144 + (cipherId != null ? cipherId.hashCode() : 0)) * 41;
        ShareId shareId = this.shareId;
        int iHashCode146 = (iHashCode145 + (shareId != null ? shareId.hashCode() : 0)) * 41;
        List<StateEmotion> list103 = this.stateEmotion;
        int iHashCode147 = (iHashCode146 + (list103 != null ? list103.hashCode() : 0)) * 41;
        SeePortraitCounter seePortraitCounter = this.seePortraitCounter;
        int iHashCode148 = (iHashCode147 + (seePortraitCounter != null ? seePortraitCounter.hashCode() : 0)) * 41;
        List<Recommended> list104 = this.recommended;
        int iHashCode149 = (iHashCode148 + (list104 != null ? list104.hashCode() : 0)) * 41;
        List<ChatHeat> list105 = this.chatHeats;
        int iHashCode150 = (iHashCode149 + (list105 != null ? list105.hashCode() : 0)) * 41;
        List<PermissionsItem> list106 = this.chatHeatPermissions;
        int iHashCode151 = (iHashCode150 + (list106 != null ? list106.hashCode() : 0)) * 41;
        List<ResourceTriggers> list107 = this.resources;
        int iHashCode152 = (iHashCode151 + (list107 != null ? list107.hashCode() : 0)) * 41;
        GreetingResult greetingResult = this.greetingResult;
        int iHashCode153 = (iHashCode152 + (greetingResult != null ? greetingResult.hashCode() : 0)) * 41;
        List<ConversationLatestMoment> list108 = this.latestMoments;
        int iHashCode154 = (iHashCode153 + (list108 != null ? list108.hashCode() : 0)) * 41;
        JmpTarget jmpTarget = this.jmpTarget;
        int iHashCode155 = (iHashCode154 + (jmpTarget != null ? jmpTarget.hashCode() : 0)) * 41;
        List<BuzzUser> list109 = this.buzzUsers;
        int iHashCode156 = (iHashCode155 + (list109 != null ? list109.hashCode() : 0)) * 41;
        ODiamondListItem oDiamondListItem = this.odiamondList;
        int iHashCode157 = (iHashCode156 + (oDiamondListItem != null ? oDiamondListItem.hashCode() : 0)) * 41;
        PopGuide popGuide = this.popGuide;
        int iHashCode158 = (iHashCode157 + (popGuide != null ? popGuide.hashCode() : 0)) * 41;
        List<SuperLikeCount> list110 = this.superLikeCount;
        int iHashCode159 = (iHashCode158 + (list110 != null ? list110.hashCode() : 0)) * 41;
        List<FloatsCardData> list111 = this.floats;
        int iHashCode160 = (iHashCode159 + (list111 != null ? list111.hashCode() : 0)) * 41;
        MonetizationMsg monetizationMsg = this.monetizationMsg;
        int iHashCode161 = (iHashCode160 + (monetizationMsg != null ? monetizationMsg.hashCode() : 0)) * 41;
        String str2 = this.link;
        int iHashCode162 = (iHashCode161 + (str2 != null ? str2.hashCode() : 0)) * 41;
        GrowthMomentThemeCardInfo growthMomentThemeCardInfo = this.tab;
        int iHashCode163 = (iHashCode162 + (growthMomentThemeCardInfo != null ? growthMomentThemeCardInfo.hashCode() : 0)) * 41;
        SeeExposedUser seeExposedUser = this.seeExposedUser;
        int iHashCode164 = (iHashCode163 + (seeExposedUser != null ? seeExposedUser.hashCode() : 0)) * 41;
        GrowthExposureInfo growthExposureInfo = this.exposureInfo;
        int iHashCode165 = (iHashCode164 + (growthExposureInfo != null ? growthExposureInfo.hashCode() : 0)) * 41;
        List<SamesCardData> list112 = this.love520;
        int iHashCode166 = (iHashCode165 + (list112 != null ? list112.hashCode() : 0)) * 41;
        String str3 = this.payWill;
        int iHashCode167 = (iHashCode166 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<ExtremePickItem> list113 = this.extremePickByList;
        int iHashCode168 = (iHashCode167 + (list113 != null ? list113.hashCode() : 0)) * 41;
        ChatGameInfo chatGameInfo = this.chatGameInfo;
        int iHashCode169 = (iHashCode168 + (chatGameInfo != null ? chatGameInfo.hashCode() : 0)) * 41;
        List<SamesCardData> list114 = this.camping;
        int iHashCode170 = (iHashCode169 + (list114 != null ? list114.hashCode() : 0)) * 41;
        RecallMatch recallMatch = this.recallMatch;
        int iHashCode171 = (iHashCode170 + (recallMatch != null ? recallMatch.hashCode() : 0)) * 41;
        List<BCoreLiveActivity> list115 = this.liveActivities;
        int iHashCode172 = (iHashCode171 + (list115 != null ? list115.hashCode() : 0)) * 41;
        List<SamesCardData> list116 = this.mkt_activity_regular;
        int iHashCode173 = (iHashCode172 + (list116 != null ? list116.hashCode() : 0)) * 41;
        MonetizationChatSeeUser monetizationChatSeeUser = this.monetizationChatSeeUser;
        int iHashCode174 = (iHashCode173 + (monetizationChatSeeUser != null ? monetizationChatSeeUser.hashCode() : 0)) * 41;
        List<IntlVisitor> list117 = this.intlVisitorInfo;
        int iHashCode175 = (((iHashCode174 + (list117 != null ? list117.hashCode() : 0)) * 41) + this.count) * 41;
        List<String> list118 = this.invalidCardList;
        int iHashCode176 = (iHashCode175 + (list118 != null ? list118.hashCode() : 0)) * 41;
        List<ChatAssistantQuestion> list119 = this.chatAssistantQuestions;
        int iHashCode177 = (iHashCode176 + (list119 != null ? list119.hashCode() : 0)) * 41;
        List<SamesCardData> list120 = this.mkt_activity_quiz;
        int iHashCode178 = (((iHashCode177 + (list120 != null ? list120.hashCode() : 0)) * 41) + (this.isRecallUser ? 1231 : 1237)) * 41;
        List<UserIdType> list121 = this.greetingNewPeople;
        int iHashCode179 = (iHashCode178 + (list121 != null ? list121.hashCode() : 0)) * 41;
        List<GreetingNewPeopleMessage> list122 = this.greetingNewPeopleMessage;
        int iHashCode180 = (iHashCode179 + (list122 != null ? list122.hashCode() : 0)) * 41;
        ExtremeQuestions extremeQuestions = this.extremeQuestions;
        int iHashCode181 = (iHashCode180 + (extremeQuestions != null ? extremeQuestions.hashCode() : 0)) * 41;
        BoostResultEntry boostResultEntry = this.boostResultEntry;
        int iHashCode182 = (iHashCode181 + (boostResultEntry != null ? boostResultEntry.hashCode() : 0)) * 41;
        MatchInfo matchInfo = this.todayMatchInfo;
        int iHashCode183 = (iHashCode182 + (matchInfo != null ? matchInfo.hashCode() : 0)) * 41;
        GrowthMesInfo growthMesInfo = this.growthMesInfo;
        int iHashCode184 = (iHashCode183 + (growthMesInfo != null ? growthMesInfo.hashCode() : 0)) * 41;
        AiPictureAuth aiPictureAuth = this.aiPictureAuth;
        int iHashCode185 = (iHashCode184 + (aiPictureAuth != null ? aiPictureAuth.hashCode() : 0)) * 41;
        AcceleratePairingStatus acceleratePairingStatus = this.acceleratePairing;
        int iHashCode186 = (iHashCode185 + (acceleratePairingStatus != null ? acceleratePairingStatus.hashCode() : 0)) * 41;
        QuickChatPartyInvitation quickChatPartyInvitation = this.invitation;
        int iHashCode187 = (iHashCode186 + (quickChatPartyInvitation != null ? quickChatPartyInvitation.hashCode() : 0)) * 41;
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = this.campaignPage;
        int iHashCode188 = (iHashCode187 + (quickChatPartyCampaignPage != null ? quickChatPartyCampaignPage.hashCode() : 0)) * 41;
        GrowthPartner growthPartner = this.partner;
        int iHashCode189 = (iHashCode188 + (growthPartner != null ? growthPartner.hashCode() : 0)) * 41;
        List<CityCData> list123 = this.cityCData;
        int iHashCode190 = (iHashCode189 + (list123 != null ? list123.hashCode() : 0)) * 41;
        GrowthBlindBox growthBlindBox = this.blindbox;
        int iHashCode191 = (iHashCode190 + (growthBlindBox != null ? growthBlindBox.hashCode() : 0)) * 41;
        List<String> list124 = this.unReadUserIds;
        int iHashCode192 = (iHashCode191 + (list124 != null ? list124.hashCode() : 0)) * 41;
        CityCBanner cityCBanner = this.cityCBanner;
        int iHashCode193 = (iHashCode192 + (cityCBanner != null ? cityCBanner.hashCode() : 0)) * 41;
        ChatPartners chatPartners = this.chatPartners;
        int iHashCode194 = (iHashCode193 + (chatPartners != null ? chatPartners.hashCode() : 0)) * 41;
        List<ChatPartnersHistoryItem> list125 = this.chatPartnersSignals;
        int iHashCode195 = (iHashCode194 + (list125 != null ? list125.hashCode() : 0)) * 41;
        SurpriseGift surpriseGift = this.surpriseGift;
        int iHashCode196 = surpriseGift != null ? surpriseGift.hashCode() : 0;
        long j = this.surpriseGiftExpirationTime;
        int i3 = (((iHashCode195 + iHashCode196) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        List<CardCornerMark> list126 = this.cardCornerMarks;
        int iHashCode197 = (i3 + (list126 != null ? list126.hashCode() : 0)) * 41;
        PhotoLowModelData photoLowModelData = this.lowPhotoResult;
        int iHashCode198 = (iHashCode197 + (photoLowModelData != null ? photoLowModelData.hashCode() : 0)) * 41;
        List<SamesCardData> list127 = this.mkt_activity_flash;
        int iHashCode199 = (iHashCode198 + (list127 != null ? list127.hashCode() : 0)) * 41;
        CityCConfig cityCConfig = this.cityCConfig;
        int iHashCode200 = (iHashCode199 + (cityCConfig != null ? cityCConfig.hashCode() : 0)) * 41;
        PrivateCustomSetting privateCustomSetting = this.privateCustomSetting;
        int iHashCode201 = (iHashCode200 + (privateCustomSetting != null ? privateCustomSetting.hashCode() : 0)) * 41;
        PrivateCustomResult privateCustomResult = this.privateCustomResults;
        int iHashCode202 = (iHashCode201 + (privateCustomResult != null ? privateCustomResult.hashCode() : 0)) * 41;
        VisitorSetting visitorSetting = this.visitorSetting;
        int iHashCode203 = (iHashCode202 + (visitorSetting != null ? visitorSetting.hashCode() : 0)) * 41;
        List<VisitorHidden> list128 = this.visitorHiddens;
        int iHashCode204 = (iHashCode203 + (list128 != null ? list128.hashCode() : 0)) * 41;
        MarriageGuide marriageGuide = this.marriageGuide;
        int iHashCode205 = (iHashCode204 + (marriageGuide != null ? marriageGuide.hashCode() : 0)) * 41;
        List<SelectionUser> list129 = this.selectionUsers;
        int iHashCode206 = (iHashCode205 + (list129 != null ? list129.hashCode() : 0)) * 41;
        SelectionUserInfo selectionUserInfo = this.selectionUserInfo;
        int iHashCode207 = (iHashCode206 + (selectionUserInfo != null ? selectionUserInfo.hashCode() : 0)) * 41;
        List<UserAudits> list130 = this.userAudits;
        int iHashCode208 = (iHashCode207 + (list130 != null ? list130.hashCode() : 0)) * 41;
        List<DynamicLable> list131 = this.dynamicLabels;
        int iHashCode209 = (iHashCode208 + (list131 != null ? list131.hashCode() : 0)) * 41;
        List<DetectText> list132 = this.details;
        int iHashCode210 = (iHashCode209 + (list132 != null ? list132.hashCode() : 0)) * 41;
        ColdStartLayer coldStartLayer = this.layer;
        int iHashCode211 = (iHashCode210 + (coldStartLayer != null ? coldStartLayer.hashCode() : 0)) * 41;
        List<AuditPictureTag> list133 = this.auditPictureTags;
        int iHashCode212 = (iHashCode211 + (list133 != null ? list133.hashCode() : 0)) * 41;
        DatingGuideData datingGuideData = this.myTabGuide;
        int iHashCode213 = (((iHashCode212 + (datingGuideData != null ? datingGuideData.hashCode() : 0)) * 41) + (this.profileGuide ? 1231 : 1237)) * 41;
        TagStrategy tagStrategy3 = this.tagPictureStrategy;
        int iHashCode214 = (iHashCode213 + (tagStrategy3 != null ? tagStrategy3.hashCode() : 0)) * 41;
        List<NewTags> list134 = this.pictureTags;
        int iHashCode215 = (iHashCode214 + (list134 != null ? list134.hashCode() : 0)) * 41;
        FakeQuickChatSuggestStatus fakeQuickChatSuggestStatus = this.fakeSuggest;
        int iHashCode216 = (iHashCode215 + (fakeQuickChatSuggestStatus != null ? fakeQuickChatSuggestStatus.hashCode() : 0)) * 41;
        RiskOtherData riskOtherData = this.userRisk;
        int iHashCode217 = (iHashCode216 + (riskOtherData != null ? riskOtherData.hashCode() : 0)) * 41;
        RiskOtherData riskOtherData2 = this.descriptionRisk;
        int iHashCode218 = (iHashCode217 + (riskOtherData2 != null ? riskOtherData2.hashCode() : 0)) * 41;
        List<RiskSelfData> list135 = this.risks;
        int iHashCode219 = (iHashCode218 + (list135 != null ? list135.hashCode() : 0)) * 41;
        List<BarLoverplaces> list136 = this.barLoverPlaces;
        int iHashCode220 = (iHashCode219 + (list136 != null ? list136.hashCode() : 0)) * 41;
        List<BarLoverCitys> list137 = this.barLoverCities;
        int iHashCode221 = (iHashCode220 + (list137 != null ? list137.hashCode() : 0)) * 41;
        FateRadar fateRadar = this.fateRadar;
        int iHashCode222 = (iHashCode221 + (fateRadar != null ? fateRadar.hashCode() : 0)) * 41;
        SvipWeeklyReport svipWeeklyReport = this.svipWeeklyReport;
        int iHashCode223 = (iHashCode222 + (svipWeeklyReport != null ? svipWeeklyReport.hashCode() : 0)) * 41;
        Explore explore = this.explore;
        int iHashCode224 = (iHashCode223 + (explore != null ? explore.hashCode() : 0)) * 41;
        WechatNotifySetting wechatNotifySetting = this.wechat;
        int iHashCode225 = (iHashCode224 + (wechatNotifySetting != null ? wechatNotifySetting.hashCode() : 0)) * 41;
        VipSetting vipSetting = this.vipSettings;
        int iHashCode226 = (iHashCode225 + (vipSetting != null ? vipSetting.hashCode() : 0)) * 41;
        List<IceBreakQuestion> list138 = this.iceBreakQuestions;
        int iHashCode227 = (iHashCode226 + (list138 != null ? list138.hashCode() : 0)) * 41;
        FakeGuideData fakeGuideData = this.fakeGuideData;
        int iHashCode228 = (iHashCode227 + (fakeGuideData != null ? fakeGuideData.hashCode() : 0)) * 41;
        List<UserActivityInfo> list139 = this.userActivityInfos;
        int iHashCode229 = (iHashCode228 + (list139 != null ? list139.hashCode() : 0)) * 41;
        Questionnaire questionnaire = this.questionnaire;
        int iHashCode230 = (iHashCode229 + (questionnaire != null ? questionnaire.hashCode() : 0)) * 41;
        QuestionnaireFeature questionnaireFeature = this.features;
        int iHashCode231 = (iHashCode230 + (questionnaireFeature != null ? questionnaireFeature.hashCode() : 0)) * 41;
        UserStrategyConfiguration userStrategyConfiguration = this.userStrategyConfiguration;
        int iHashCode232 = (iHashCode231 + (userStrategyConfiguration != null ? userStrategyConfiguration.hashCode() : 0)) * 41;
        List<FakePhotoFeedback> list140 = this.fakePhotoFeedback;
        int iHashCode233 = (iHashCode232 + (list140 != null ? list140.hashCode() : 0)) * 41;
        PhotoLowModelData photoLowModelData2 = this.repeatPictureResult;
        int iHashCode234 = (iHashCode233 + (photoLowModelData2 != null ? photoLowModelData2.hashCode() : 0)) * 41;
        PhotoLowModelData photoLowModelData3 = this.netPictureResult;
        int iHashCode235 = (iHashCode234 + (photoLowModelData3 != null ? photoLowModelData3.hashCode() : 0)) * 41;
        UserFeedbackInfo userFeedbackInfo = this.userFeedbackInfo;
        int iHashCode236 = (iHashCode235 + (userFeedbackInfo != null ? userFeedbackInfo.hashCode() : 0)) * 41;
        List<IdealTag> list141 = this.idealDetails;
        int iHashCode237 = (iHashCode236 + (list141 != null ? list141.hashCode() : 0)) * 41;
        IdealInfo idealInfo = this.idealInfo;
        int iHashCode238 = (iHashCode237 + (idealInfo != null ? idealInfo.hashCode() : 0)) * 41;
        List<IdealInfo> list142 = this.idealInfos;
        int iHashCode239 = (iHashCode238 + (list142 != null ? list142.hashCode() : 0)) * 41;
        List<UrlTag> list143 = this.urlTags;
        int iHashCode240 = (iHashCode239 + (list143 != null ? list143.hashCode() : 0)) * 41;
        List<ProfileCountInfo> list144 = this.profileCounts;
        int iHashCode241 = (iHashCode240 + (list144 != null ? list144.hashCode() : 0)) * 41;
        PrivateCustomResult privateCustomResult2 = this.privateCustomResult;
        int iHashCode242 = (iHashCode241 + (privateCustomResult2 != null ? privateCustomResult2.hashCode() : 0)) * 41;
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = this.videoChatSecondFloorSummary;
        int iHashCode243 = (iHashCode242 + (videoChatSecondFloorSummary != null ? videoChatSecondFloorSummary.hashCode() : 0)) * 41;
        RealPicturesBanner realPicturesBanner = this.realPicturesBanner;
        int iHashCode244 = (iHashCode243 + (realPicturesBanner != null ? realPicturesBanner.hashCode() : 0)) * 41;
        RealPicturesInfo realPicturesInfo = this.realPicturesInfo;
        int iHashCode245 = (iHashCode244 + (realPicturesInfo != null ? realPicturesInfo.hashCode() : 0)) * 41;
        List<IPRegion> list145 = this.ipRegion;
        int iHashCode246 = (iHashCode245 + (list145 != null ? list145.hashCode() : 0)) * 41;
        RealFeelInfo realFeelInfo = this.realFeelInfo;
        int iHashCode247 = (iHashCode246 + (realFeelInfo != null ? realFeelInfo.hashCode() : 0)) * 41;
        LoveLetterEntryInfo loveLetterEntryInfo = this.loveLetter;
        int iHashCode248 = (iHashCode247 + (loveLetterEntryInfo != null ? loveLetterEntryInfo.hashCode() : 0)) * 41;
        LoveLetterGroupInfo loveLetterGroupInfo = this.loveLetterGroup;
        int iHashCode249 = (iHashCode248 + (loveLetterGroupInfo != null ? loveLetterGroupInfo.hashCode() : 0)) * 41;
        LoveLetterContent loveLetterContent = this.loveLetterContent;
        int iHashCode250 = (iHashCode249 + (loveLetterContent != null ? loveLetterContent.hashCode() : 0)) * 41;
        ChatPage chatPage = this.chatPage;
        int iHashCode251 = (iHashCode250 + (chatPage != null ? chatPage.hashCode() : 0)) * 41;
        List<ShowOnlineForWhoIMeet> list146 = this.showOnlineForWhoIMeet;
        int iHashCode252 = (iHashCode251 + (list146 != null ? list146.hashCode() : 0)) * 41;
        PhotoLowModelData photoLowModelData4 = this.notVerificationResultData;
        int iHashCode253 = (iHashCode252 + (photoLowModelData4 != null ? photoLowModelData4.hashCode() : 0)) * 41;
        List<String> list147 = this.verificationLowLabels;
        int iHashCode254 = (iHashCode253 + (list147 != null ? list147.hashCode() : 0)) * 41;
        List<MyTabTask> list148 = this.myTabTasks;
        int iHashCode255 = (iHashCode254 + (list148 != null ? list148.hashCode() : 0)) * 41;
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        int iHashCode256 = (iHashCode255 + (pendingPaymentGuidance != null ? pendingPaymentGuidance.hashCode() : 0)) * 41;
        SeeTrialEligible seeTrialEligible = this.seeTrialEligible;
        int iHashCode257 = (iHashCode256 + (seeTrialEligible != null ? seeTrialEligible.hashCode() : 0)) * 41;
        SeeTrialStatus seeTrialStatus = this.seeTrialStatus;
        int iHashCode258 = (((iHashCode257 + (seeTrialStatus != null ? seeTrialStatus.hashCode() : 0)) * 41) + this.likedByToday) * 41;
        List<FeedbackQuestion> list149 = this.feedbackQuestions;
        int iHashCode259 = (((iHashCode258 + (list149 != null ? list149.hashCode() : 0)) * 41) + this.feedbackRemainedNum) * 41;
        ConversationInstantChat conversationInstantChat = this.instantChat;
        int iHashCode260 = (iHashCode259 + (conversationInstantChat != null ? conversationInstantChat.hashCode() : 0)) * 41;
        AIChatAdvice aIChatAdvice = this.aiChatAdvice;
        int iHashCode261 = (iHashCode260 + (aIChatAdvice != null ? aIChatAdvice.hashCode() : 0)) * 41;
        AIChatAnalysis aIChatAnalysis = this.aiChatAnalysis;
        int iHashCode262 = (iHashCode261 + (aIChatAnalysis != null ? aIChatAnalysis.hashCode() : 0)) * 41;
        InvitationInfo invitationInfo = this.invitationInfo;
        int iHashCode263 = (iHashCode262 + (invitationInfo != null ? invitationInfo.hashCode() : 0)) * 41;
        PictureVerifyRightedInfo pictureVerifyRightedInfo = this.pictureVerifyRightedInfo;
        int iHashCode264 = (iHashCode263 + (pictureVerifyRightedInfo != null ? pictureVerifyRightedInfo.hashCode() : 0)) * 41;
        IntlCurrencyDiamond intlCurrencyDiamond = this.diamond;
        int iHashCode265 = (((((iHashCode264 + (intlCurrencyDiamond != null ? intlCurrencyDiamond.hashCode() : 0)) * 41) + (this.canChange ? 1231 : 1237)) * 41) + this.ttcToDiamondRate) * 41;
        List<Prologue> list150 = this.prologues;
        int iHashCode266 = (iHashCode265 + (list150 != null ? list150.hashCode() : 0)) * 41;
        List<InstantMatchGiveCountInfo> list151 = this.instantMatchGiveCountInfo;
        int iHashCode267 = (iHashCode266 + (list151 != null ? list151.hashCode() : 0)) * 41;
        List<CreditScoreData> list152 = this.creditScores;
        int iHashCode268 = (iHashCode267 + (list152 != null ? list152.hashCode() : 0)) * 41;
        List<DislikedUsers> list153 = this.dislikedUsers;
        int iHashCode269 = (iHashCode268 + (list153 != null ? list153.hashCode() : 0)) * 41;
        AnalysisGuide analysisGuide = this.analysisGuide;
        int iHashCode270 = (iHashCode269 + (analysisGuide != null ? analysisGuide.hashCode() : 0)) * 41;
        VisitorDoorInfo visitorDoorInfo = this.visitorDoorInfo;
        int iHashCode271 = (iHashCode270 + (visitorDoorInfo != null ? visitorDoorInfo.hashCode() : 0)) * 41;
        List<VisitorInfo> list154 = this.visitorInfo;
        int iHashCode272 = (iHashCode271 + (list154 != null ? list154.hashCode() : 0)) * 41;
        List<InstantMatchUserInfo> list155 = this.instantMatchUserInfo;
        int iHashCode273 = (iHashCode272 + (list155 != null ? list155.hashCode() : 0)) * 41;
        List<TribeSubset> list156 = this.recommendList;
        int iHashCode274 = (iHashCode273 + (list156 != null ? list156.hashCode() : 0)) * 41;
        IntlTribeBubble intlTribeBubble = this.intlBubble;
        int iHashCode275 = (iHashCode274 + (intlTribeBubble != null ? intlTribeBubble.hashCode() : 0)) * 41;
        MembershipUpgradeInfo membershipUpgradeInfo = this.membershipUpgradeInfo;
        int iHashCode276 = (iHashCode275 + (membershipUpgradeInfo != null ? membershipUpgradeInfo.hashCode() : 0)) * 41;
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo = this.ultraRightsUpgradeInfo;
        int iHashCode277 = (iHashCode276 + (ultraRightsUpgradeInfo != null ? ultraRightsUpgradeInfo.hashCode() : 0)) * 41;
        PurchaseSavePop purchaseSavePop = this.purchaseSavePop;
        int iHashCode278 = (iHashCode277 + (purchaseSavePop != null ? purchaseSavePop.hashCode() : 0)) * 41;
        List<SwipeUpperLimit> list157 = this.swipeUpperLimit;
        int iHashCode279 = ((((iHashCode278 + (list157 != null ? list157.hashCode() : 0)) * 41) + this.payWillInfo) * 41) + this.visitorAllCount;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.payWillScore);
        int i4 = (iHashCode279 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.payWillScoreThreshold);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.scoreThresholdOther);
        int i6 = ((i5 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        List<InstantMatchUserInfo> list158 = this.picksInfo;
        int iHashCode280 = (i6 + (list158 != null ? list158.hashCode() : 0)) * 41;
        List<SuperlikeByCount> list159 = this.superlikeByCounts;
        int iHashCode281 = (iHashCode280 + (list159 != null ? list159.hashCode() : 0)) * 41;
        List<ComplimentText> list160 = this.complimentTexts;
        int iHashCode282 = (iHashCode281 + (list160 != null ? list160.hashCode() : 0)) * 41;
        ComplimentFromOther complimentFromOther = this.compliment;
        int iHashCode283 = (iHashCode282 + (complimentFromOther != null ? complimentFromOther.hashCode() : 0)) * 41;
        List<SuggestedComplimentItem> list161 = this.compliments;
        int iHashCode284 = (iHashCode283 + (list161 != null ? list161.hashCode() : 0)) * 41;
        List<IapAffiliatePromotion> list162 = this.iapAffiliatePromotions;
        int iHashCode285 = iHashCode284 + (list162 != null ? list162.hashCode() : 0);
        this.hashCode = iHashCode285;
        return iHashCode285;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.relationships == null) {
            this.relationships = new ArrayList();
        }
        if (this.conversations == null) {
            this.conversations = new ArrayList();
        }
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        if (this.contacts == null) {
            this.contacts = new ArrayList();
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
        if (this.stickers == null) {
            this.stickers = new ArrayList();
        }
        if (this.packages == null) {
            this.packages = new ArrayList();
        }
        if (this.bundles == null) {
            this.bundles = new ArrayList();
        }
        if (this.links == null) {
            this.links = new ArrayList();
        }
        if (this.schools == null) {
            this.schools = new ArrayList();
        }
        if (this.reminders == null) {
            this.reminders = new ArrayList();
        }
        if (this.verificationCenter == null) {
            this.verificationCenter = new ArrayList();
        }
        if (this.wallet == null) {
            this.wallet = Wallet.new_();
        }
        if (this.privateQuestions == null) {
            this.privateQuestions = new ArrayList();
        }
        if (this.summarizedPrivileges == null) {
            this.summarizedPrivileges = new ArrayList();
        }
        if (this.voiceCall == null) {
            this.voiceCall = new ArrayList();
        }
        if (this.contract == null) {
            this.contract = Contract.new_();
        }
        if (this.chatGroups == null) {
            this.chatGroups = new ArrayList();
        }
        if (this.chatGroupMembers == null) {
            this.chatGroupMembers = new ArrayList();
        }
        if (this.groupApplies == null) {
            this.groupApplies = new ArrayList();
        }
        if (this.interestedGroups == null) {
            this.interestedGroups = new ArrayList();
        }
        if (this.groupTabs == null) {
            this.groupTabs = new ArrayList();
        }
        if (this.keywords == null) {
            this.keywords = new ArrayList();
        }
        if (this.settingGroups == null) {
            this.settingGroups = new ArrayList();
        }
        if (this.redPackets == null) {
            this.redPackets = new ArrayList();
        }
        if (this.counterVerification == null) {
            this.counterVerification = CounterVerification.new_();
        }
        if (this.friends == null) {
            this.friends = new ArrayList();
        }
        if (this.conversationDiff == null) {
            this.conversationDiff = ConversationDiff.new_();
        }
        if (this.cardStyles == null) {
            this.cardStyles = new ArrayList();
        }
        if (this.audioTexts == null) {
            this.audioTexts = new ArrayList();
        }
        if (this.greetings == null) {
            this.greetings = new ArrayList();
        }
        if (this.recentConversations == null) {
            this.recentConversations = new ArrayList();
        }
        if (this.picks == null) {
            this.picks = Picks.new_();
        }
        if (this.likedMes == null) {
            this.likedMes = new ArrayList();
        }
        if (this.literaturesComments == null) {
            this.literaturesComments = new ArrayList();
        }
        if (this.literatures == null) {
            this.literatures = new ArrayList();
        }
        if (this.freeTrialInfo == null) {
            this.freeTrialInfo = FreeTrialInfo.new_();
        }
        if (this.freeTrialOperateResult == null) {
            this.freeTrialOperateResult = FreeTrialOperateResult.new_();
        }
        if (this.states == null) {
            this.states = new ArrayList();
        }
        if (this.thirdPartyInfo == null) {
            this.thirdPartyInfo = ThirdPartyInfo.new_();
        }
        if (this.privilegeGifts == null) {
            this.privilegeGifts = new ArrayList();
        }
        if (this.recommendMessages == null) {
            this.recommendMessages = new ArrayList();
        }
        if (this.greets == null) {
            this.greets = new ArrayList();
        }
        if (this.heartbeatMatch == null) {
            this.heartbeatMatch = HeartBeatMatched.new_();
        }
        if (this.intlInsertCardSets == null) {
            this.intlInsertCardSets = new ArrayList();
        }
        if (this.actives == null) {
            this.actives = new ArrayList();
        }
        if (this.cardsIcons == null) {
            this.cardsIcons = new ArrayList();
        }
        if (this.tacitTest == null) {
            this.tacitTest = TacitTestProfileCard.new_();
        }
        if (this.iceBreakings == null) {
            this.iceBreakings = new ArrayList();
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.tagLoadStrategy == null) {
            this.tagLoadStrategy = TagStrategy.new_();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.tagCategoryStrategy == null) {
            this.tagCategoryStrategy = TagStrategy.new_();
        }
        if (this.tagCategories == null) {
            this.tagCategories = new ArrayList();
        }
        if (this.tagUserCounts == null) {
            this.tagUserCounts = new ArrayList();
        }
        if (this.sames == null) {
            this.sames = new ArrayList();
        }
        if (this.literatureConfigInfo == null) {
            this.literatureConfigInfo = LiteratureConfigInfo.new_();
        }
        if (this.cardInfos == null) {
            this.cardInfos = new ArrayList();
        }
        if (this.seeInfos == null) {
            this.seeInfos = new ArrayList();
        }
        if (this.seePortraits == null) {
            this.seePortraits = new ArrayList();
        }
        if (this.profileLikesComments == null) {
            this.profileLikesComments = new ArrayList();
        }
        if (this.profileLikeCounter == null) {
            this.profileLikeCounter = ExpandedProfileLikeCounter.new_();
        }
        if (this.extraPrivileges == null) {
            this.extraPrivileges = ExtraPrivileges.new_();
        }
        if (this.selectedQuestion == null) {
            this.selectedQuestion = ProfileSelectedQue.new_();
        }
        if (this.likeUsers == null) {
            this.likeUsers = new ArrayList();
        }
        if (this.cipherId == null) {
            this.cipherId = CipherId.new_();
        }
        if (this.shareId == null) {
            this.shareId = ShareId.new_();
        }
        if (this.stateEmotion == null) {
            this.stateEmotion = new ArrayList();
        }
        if (this.seePortraitCounter == null) {
            this.seePortraitCounter = SeePortraitCounter.new_();
        }
        if (this.recommended == null) {
            this.recommended = new ArrayList();
        }
        if (this.chatHeats == null) {
            this.chatHeats = new ArrayList();
        }
        if (this.chatHeatPermissions == null) {
            this.chatHeatPermissions = new ArrayList();
        }
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        if (this.greetingResult == null) {
            this.greetingResult = GreetingResult.new_();
        }
        if (this.latestMoments == null) {
            this.latestMoments = new ArrayList();
        }
        if (this.jmpTarget == null) {
            this.jmpTarget = JmpTarget.new_();
        }
        if (this.buzzUsers == null) {
            this.buzzUsers = new ArrayList();
        }
        if (this.odiamondList == null) {
            this.odiamondList = ODiamondListItem.new_();
        }
        if (this.popGuide == null) {
            this.popGuide = PopGuide.new_();
        }
        if (this.floats == null) {
            this.floats = new ArrayList();
        }
        if (this.monetizationMsg == null) {
            this.monetizationMsg = MonetizationMsg.new_();
        }
        if (this.tab == null) {
            this.tab = GrowthMomentThemeCardInfo.new_();
        }
        if (this.seeExposedUser == null) {
            this.seeExposedUser = SeeExposedUser.new_();
        }
        if (this.exposureInfo == null) {
            this.exposureInfo = GrowthExposureInfo.new_();
        }
        if (this.love520 == null) {
            this.love520 = new ArrayList();
        }
        if (this.payWill == null) {
            this.payWill = "";
        }
        if (this.extremePickByList == null) {
            this.extremePickByList = new ArrayList();
        }
        if (this.chatGameInfo == null) {
            this.chatGameInfo = ChatGameInfo.new_();
        }
        if (this.camping == null) {
            this.camping = new ArrayList();
        }
        if (this.recallMatch == null) {
            this.recallMatch = RecallMatch.new_();
        }
        if (this.mkt_activity_regular == null) {
            this.mkt_activity_regular = new ArrayList();
        }
        if (this.intlVisitorInfo == null) {
            this.intlVisitorInfo = new ArrayList();
        }
        if (this.invalidCardList == null) {
            this.invalidCardList = new ArrayList();
        }
        if (this.chatAssistantQuestions == null) {
            this.chatAssistantQuestions = new ArrayList();
        }
        if (this.mkt_activity_quiz == null) {
            this.mkt_activity_quiz = new ArrayList();
        }
        if (this.extremeQuestions == null) {
            this.extremeQuestions = ExtremeQuestions.new_();
        }
        if (this.boostResultEntry == null) {
            this.boostResultEntry = BoostResultEntry.new_();
        }
        if (this.todayMatchInfo == null) {
            this.todayMatchInfo = MatchInfo.new_();
        }
        if (this.growthMesInfo == null) {
            this.growthMesInfo = GrowthMesInfo.new_();
        }
        if (this.aiPictureAuth == null) {
            this.aiPictureAuth = AiPictureAuth.new_();
        }
        if (this.campaignPage == null) {
            this.campaignPage = QuickChatPartyCampaignPage.new_();
        }
        if (this.partner == null) {
            this.partner = GrowthPartner.new_();
        }
        if (this.cityCData == null) {
            this.cityCData = new ArrayList();
        }
        if (this.cityCBanner == null) {
            this.cityCBanner = CityCBanner.new_();
        }
        if (this.chatPartners == null) {
            this.chatPartners = ChatPartners.new_();
        }
        if (this.chatPartnersSignals == null) {
            this.chatPartnersSignals = new ArrayList();
        }
        if (this.lowPhotoResult == null) {
            this.lowPhotoResult = PhotoLowModelData.new_();
        }
        if (this.mkt_activity_flash == null) {
            this.mkt_activity_flash = new ArrayList();
        }
        if (this.auditPictureTags == null) {
            this.auditPictureTags = new ArrayList();
        }
        if (this.tagPictureStrategy == null) {
            this.tagPictureStrategy = TagStrategy.new_();
        }
        if (this.pictureTags == null) {
            this.pictureTags = new ArrayList();
        }
        if (this.barLoverPlaces == null) {
            this.barLoverPlaces = new ArrayList();
        }
        if (this.barLoverCities == null) {
            this.barLoverCities = new ArrayList();
        }
        if (this.fateRadar == null) {
            this.fateRadar = FateRadar.new_();
        }
        if (this.explore == null) {
            this.explore = Explore.new_();
        }
        if (this.repeatPictureResult == null) {
            this.repeatPictureResult = PhotoLowModelData.new_();
        }
        if (this.netPictureResult == null) {
            this.netPictureResult = PhotoLowModelData.new_();
        }
        if (this.userFeedbackInfo == null) {
            this.userFeedbackInfo = UserFeedbackInfo.new_();
        }
        if (this.urlTags == null) {
            this.urlTags = new ArrayList();
        }
        if (this.chatPage == null) {
            this.chatPage = ChatPage.new_();
        }
        if (this.showOnlineForWhoIMeet == null) {
            this.showOnlineForWhoIMeet = new ArrayList();
        }
        if (this.notVerificationResultData == null) {
            this.notVerificationResultData = PhotoLowModelData.new_();
        }
        if (this.verificationLowLabels == null) {
            this.verificationLowLabels = new ArrayList();
        }
        if (this.seeTrialEligible == null) {
            this.seeTrialEligible = SeeTrialEligible.new_();
        }
        if (this.seeTrialStatus == null) {
            this.seeTrialStatus = SeeTrialStatus.new_();
        }
        if (this.aiChatAdvice == null) {
            this.aiChatAdvice = AIChatAdvice.new_();
        }
        if (this.aiChatAnalysis == null) {
            this.aiChatAnalysis = AIChatAnalysis.new_();
        }
        if (this.diamond == null) {
            this.diamond = IntlCurrencyDiamond.new_();
        }
        if (this.dislikedUsers == null) {
            this.dislikedUsers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
