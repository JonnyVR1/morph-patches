package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.InactivateReason;
import com.p051p1.mobile.putong.core.data.ProfileBasicTag;
import com.p051p1.mobile.putong.core.data.ProfileUpgradeInterest;
import com.p051p1.mobile.putong.core.data.RateAlertSetting;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class CoreAssetsSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreassetssettings";

    @NonNull
    @ProtobufIndex(index = 30)
    public AnonymityImg anonymityImg;

    @NonNull
    @ProtobufIndex(index = 19)
    public AppUpdateVersionData appUpdateVersionData;

    @ProtobufIndex(index = 25)
    public boolean autoPayEnable;

    @ProtobufIndex(index = 16)
    public boolean autoReadConversation;

    @Nullable
    @ProtobufIndex(index = 33)
    public AutoRenewalBenefit autoRenewalBenefit;

    @Nullable
    @ProtobufIndex(index = 7)
    public ChatEffect chatEffect;

    @ProtobufIndex(index = 31)
    public boolean chatGuideExp;

    @ProtobufIndex(index = 37)
    public int chatOnlineDuration;

    @ProtobufIndex(index = 2)
    public boolean closeAct2GoodAll;

    @ProtobufIndex(index = 4)
    public long counterPollingSeconds;

    @ProtobufIndex(index = 11)
    public int enableVoiceCall;

    @ProtobufIndex(index = 8)
    public boolean forcePhoneBind;

    @ProtobufIndex(index = 9)
    public double forcePhoneBindTime;

    @NonNull
    @ProtobufIndex(index = 15)
    public GraduateActivity graduateActivity;

    @NonNull
    @ProtobufIndex(index = 35)
    public ProfileUpgradeGuideText guideText;

    @Nullable
    @ProtobufIndex(index = 1)
    public List<InactivateReason> inactivateReason;

    @NonNull
    @ProtobufIndex(index = 14)
    public IntlChatRequest intlChatRequest;

    @NonNull
    @ProtobufIndex(index = 32)
    public LetterMultilingual intlLetterContent;

    @NonNull
    @ProtobufIndex(index = 21)
    public KeepConnection keepConnection;

    @NonNull
    @ProtobufIndex(index = 12)
    public LetterMultilingual letterContent;

    @Nullable
    @ProtobufIndex(index = 23)
    public LowPriceFirstMonth lowPriceFirstMonth;

    @NonNull
    @ProtobufIndex(index = 5)
    public MissMatch missMatch;

    @Nullable
    @ProtobufIndex(index = 27)
    public List<ProfileBasicTag> profileBasicHobbyTags;

    @Nullable
    @ProtobufIndex(index = 28)
    public List<ProfileBasicTag> profileBasicRecentTags;

    @Nullable
    @ProtobufIndex(index = 29)
    public List<ProfileBasicTag> profileBasicTogetherTags;

    @NonNull
    @ProtobufIndex(index = 34)
    public ProfileUpgradeInputOrder profileUpgradeInputOrder;

    @NonNull
    @ProtobufIndex(index = 36)
    public List<ProfileUpgradeInterest> profileUpgradeInterest;

    @NonNull
    @ProtobufIndex(index = 3)
    public PromptLimit prompt;

    @Nullable
    @ProtobufIndex(index = 17)
    public List<RateAlertSetting> rateAlertSetting;

    @NonNull
    @ProtobufIndex(index = 20)
    public SchoolVerificationAgeRange schoolVerificationAgeRange;

    @NonNull
    @ProtobufIndex(index = 24)
    public SeeMatchThenPay seeMatchThenPay;

    @ProtobufIndex(index = 26)
    public int seeSwipeCountInOneSession;

    @NonNull
    @ProtobufIndex(index = 13)
    public ShowLiveForIntlAdUser showLiveForIntlAdUser;

    @NonNull
    @ProtobufIndex(index = 6)
    public SpecialCard specialCard;

    @NonNull
    @ProtobufIndex(index = 10)
    public ThirdPartySticker thirdPartySticker;

    @NonNull
    @ProtobufIndex(index = 18)
    public UserBanAppealSwitch userBanAppealSwitch;

    @NonNull
    @ProtobufIndex(index = 22)
    public UserScrapeReporting userScrapeReporting;
    public static ProtobufAdapter<CoreAssetsSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreAssetsSettings>() { // from class: com.p1.mobile.putong.core.data.CoreAssetsSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreAssetsSettings coreAssetsSettings) {
            List<InactivateReason> list = coreAssetsSettings.inactivateReason;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, InactivateReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17275b(2, coreAssetsSettings.closeAct2GoodAll);
            PromptLimit promptLimit = coreAssetsSettings.prompt;
            if (promptLimit != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, promptLimit, PromptLimit.PROTOBUF_ADAPTER);
            }
            int iM17283j = iM17285l + CodedOutputByteBufferNano.m17283j(4, coreAssetsSettings.counterPollingSeconds);
            MissMatch missMatch = coreAssetsSettings.missMatch;
            if (missMatch != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(5, missMatch, MissMatch.PROTOBUF_ADAPTER);
            }
            SpecialCard specialCard = coreAssetsSettings.specialCard;
            if (specialCard != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(6, specialCard, SpecialCard.PROTOBUF_ADAPTER);
            }
            ChatEffect chatEffect = coreAssetsSettings.chatEffect;
            if (chatEffect != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(7, chatEffect, ChatEffect.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17283j + CodedOutputByteBufferNano.m17275b(8, coreAssetsSettings.forcePhoneBind) + CodedOutputByteBufferNano.m17277d(9, coreAssetsSettings.forcePhoneBindTime);
            ThirdPartySticker thirdPartySticker = coreAssetsSettings.thirdPartySticker;
            if (thirdPartySticker != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(10, thirdPartySticker, ThirdPartySticker.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(11, coreAssetsSettings.enableVoiceCall);
            LetterMultilingual letterMultilingual = coreAssetsSettings.letterContent;
            if (letterMultilingual != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(12, letterMultilingual, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            ShowLiveForIntlAdUser showLiveForIntlAdUser = coreAssetsSettings.showLiveForIntlAdUser;
            if (showLiveForIntlAdUser != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(13, showLiveForIntlAdUser, ShowLiveForIntlAdUser.PROTOBUF_ADAPTER);
            }
            IntlChatRequest intlChatRequest = coreAssetsSettings.intlChatRequest;
            if (intlChatRequest != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(14, intlChatRequest, IntlChatRequest.PROTOBUF_ADAPTER);
            }
            GraduateActivity graduateActivity = coreAssetsSettings.graduateActivity;
            if (graduateActivity != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(15, graduateActivity, GraduateActivity.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17281h + CodedOutputByteBufferNano.m17275b(16, coreAssetsSettings.autoReadConversation);
            List<RateAlertSetting> list2 = coreAssetsSettings.rateAlertSetting;
            if (list2 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(17, list2, RateAlertSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UserBanAppealSwitch userBanAppealSwitch = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17281h(18, userBanAppealSwitch.ordinal());
            }
            AppUpdateVersionData appUpdateVersionData = coreAssetsSettings.appUpdateVersionData;
            if (appUpdateVersionData != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(19, appUpdateVersionData, AppUpdateVersionData.PROTOBUF_ADAPTER);
            }
            SchoolVerificationAgeRange schoolVerificationAgeRange = coreAssetsSettings.schoolVerificationAgeRange;
            if (schoolVerificationAgeRange != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(20, schoolVerificationAgeRange, SchoolVerificationAgeRange.PROTOBUF_ADAPTER);
            }
            KeepConnection keepConnection = coreAssetsSettings.keepConnection;
            if (keepConnection != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(21, keepConnection, KeepConnection.PROTOBUF_ADAPTER);
            }
            UserScrapeReporting userScrapeReporting = coreAssetsSettings.userScrapeReporting;
            if (userScrapeReporting != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(22, userScrapeReporting, UserScrapeReporting.PROTOBUF_ADAPTER);
            }
            LowPriceFirstMonth lowPriceFirstMonth = coreAssetsSettings.lowPriceFirstMonth;
            if (lowPriceFirstMonth != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(23, lowPriceFirstMonth, LowPriceFirstMonth.PROTOBUF_ADAPTER);
            }
            SeeMatchThenPay seeMatchThenPay = coreAssetsSettings.seeMatchThenPay;
            if (seeMatchThenPay != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(24, seeMatchThenPay, SeeMatchThenPay.PROTOBUF_ADAPTER);
            }
            int iM17275b3 = iM17275b2 + CodedOutputByteBufferNano.m17275b(25, coreAssetsSettings.autoPayEnable) + CodedOutputByteBufferNano.m17281h(26, coreAssetsSettings.seeSwipeCountInOneSession);
            List<ProfileBasicTag> list3 = coreAssetsSettings.profileBasicHobbyTags;
            if (list3 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(27, list3, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list4 = coreAssetsSettings.profileBasicRecentTags;
            if (list4 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(28, list4, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list5 = coreAssetsSettings.profileBasicTogetherTags;
            if (list5 != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(29, list5, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AnonymityImg anonymityImg = coreAssetsSettings.anonymityImg;
            if (anonymityImg != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(30, anonymityImg, AnonymityImg.PROTOBUF_ADAPTER);
            }
            int iM17275b4 = iM17275b3 + CodedOutputByteBufferNano.m17275b(31, coreAssetsSettings.chatGuideExp);
            LetterMultilingual letterMultilingual2 = coreAssetsSettings.intlLetterContent;
            if (letterMultilingual2 != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(32, letterMultilingual2, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            AutoRenewalBenefit autoRenewalBenefit = coreAssetsSettings.autoRenewalBenefit;
            if (autoRenewalBenefit != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(33, autoRenewalBenefit, AutoRenewalBenefit.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeInputOrder profileUpgradeInputOrder = coreAssetsSettings.profileUpgradeInputOrder;
            if (profileUpgradeInputOrder != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(34, profileUpgradeInputOrder, ProfileUpgradeInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeGuideText profileUpgradeGuideText = coreAssetsSettings.guideText;
            if (profileUpgradeGuideText != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(35, profileUpgradeGuideText, ProfileUpgradeGuideText.PROTOBUF_ADAPTER);
            }
            List<ProfileUpgradeInterest> list6 = coreAssetsSettings.profileUpgradeInterest;
            if (list6 != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(36, list6, ProfileUpgradeInterest.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17275b4 + CodedOutputByteBufferNano.m17281h(37, coreAssetsSettings.chatOnlineDuration);
            UserBanAppealSwitch userBanAppealSwitch2 = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(38, userBanAppealSwitch2, UserBanAppealSwitch.PROTOBUF_ADAPTER);
            }
            coreAssetsSettings.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreAssetsSettings parse(nc5 nc5Var) throws IOException {
            CoreAssetsSettings coreAssetsSettings = new CoreAssetsSettings();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (coreAssetsSettings.userBanAppealSwitch == null && numValueOf != null) {
                            coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (coreAssetsSettings.prompt == null) {
                            coreAssetsSettings.prompt = PromptLimit.new_();
                        }
                        if (coreAssetsSettings.missMatch == null) {
                            coreAssetsSettings.missMatch = MissMatch.new_();
                        }
                        if (coreAssetsSettings.specialCard == null) {
                            coreAssetsSettings.specialCard = SpecialCard.new_();
                        }
                        if (coreAssetsSettings.thirdPartySticker == null) {
                            coreAssetsSettings.thirdPartySticker = ThirdPartySticker.new_();
                        }
                        if (coreAssetsSettings.letterContent == null) {
                            coreAssetsSettings.letterContent = LetterMultilingual.new_();
                        }
                        if (coreAssetsSettings.showLiveForIntlAdUser == null) {
                            coreAssetsSettings.showLiveForIntlAdUser = ShowLiveForIntlAdUser.new_();
                        }
                        if (coreAssetsSettings.intlChatRequest == null) {
                            coreAssetsSettings.intlChatRequest = IntlChatRequest.new_();
                        }
                        if (coreAssetsSettings.graduateActivity == null) {
                            coreAssetsSettings.graduateActivity = GraduateActivity.new_();
                        }
                        if (coreAssetsSettings.userBanAppealSwitch == null) {
                            coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.defaultEnum();
                        }
                        if (coreAssetsSettings.appUpdateVersionData == null) {
                            coreAssetsSettings.appUpdateVersionData = AppUpdateVersionData.new_();
                        }
                        if (coreAssetsSettings.schoolVerificationAgeRange == null) {
                            coreAssetsSettings.schoolVerificationAgeRange = SchoolVerificationAgeRange.new_();
                        }
                        if (coreAssetsSettings.keepConnection == null) {
                            coreAssetsSettings.keepConnection = KeepConnection.new_();
                        }
                        if (coreAssetsSettings.userScrapeReporting == null) {
                            coreAssetsSettings.userScrapeReporting = UserScrapeReporting.new_();
                        }
                        if (coreAssetsSettings.seeMatchThenPay == null) {
                            coreAssetsSettings.seeMatchThenPay = SeeMatchThenPay.new_();
                        }
                        if (coreAssetsSettings.anonymityImg == null) {
                            coreAssetsSettings.anonymityImg = AnonymityImg.new_();
                        }
                        if (coreAssetsSettings.intlLetterContent == null) {
                            coreAssetsSettings.intlLetterContent = LetterMultilingual.new_();
                        }
                        if (coreAssetsSettings.profileUpgradeInputOrder == null) {
                            coreAssetsSettings.profileUpgradeInputOrder = ProfileUpgradeInputOrder.new_();
                        }
                        if (coreAssetsSettings.guideText == null) {
                            coreAssetsSettings.guideText = ProfileUpgradeGuideText.new_();
                        }
                        if (coreAssetsSettings.profileUpgradeInterest == null) {
                            coreAssetsSettings.profileUpgradeInterest = new ArrayList();
                        }
                        break;
                    case 10:
                        coreAssetsSettings.inactivateReason = (List) nc5Var.m162488l(InactivateReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 16:
                        coreAssetsSettings.closeAct2GoodAll = nc5Var.m162483g();
                        continue;
                    case 26:
                        coreAssetsSettings.prompt = (PromptLimit) nc5Var.m162488l(PromptLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        coreAssetsSettings.counterPollingSeconds = nc5Var.m162487k();
                        continue;
                    case 42:
                        coreAssetsSettings.missMatch = (MissMatch) nc5Var.m162488l(MissMatch.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        coreAssetsSettings.specialCard = (SpecialCard) nc5Var.m162488l(SpecialCard.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        coreAssetsSettings.chatEffect = (ChatEffect) nc5Var.m162488l(ChatEffect.PROTOBUF_ADAPTER);
                        continue;
                    case 64:
                        coreAssetsSettings.forcePhoneBind = nc5Var.m162483g();
                        continue;
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        coreAssetsSettings.forcePhoneBindTime = nc5Var.m162484h();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        coreAssetsSettings.thirdPartySticker = (ThirdPartySticker) nc5Var.m162488l(ThirdPartySticker.PROTOBUF_ADAPTER);
                        continue;
                    case 88:
                        coreAssetsSettings.enableVoiceCall = nc5Var.m162486j();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        coreAssetsSettings.letterContent = (LetterMultilingual) nc5Var.m162488l(LetterMultilingual.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        coreAssetsSettings.showLiveForIntlAdUser = (ShowLiveForIntlAdUser) nc5Var.m162488l(ShowLiveForIntlAdUser.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        coreAssetsSettings.intlChatRequest = (IntlChatRequest) nc5Var.m162488l(IntlChatRequest.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        coreAssetsSettings.graduateActivity = (GraduateActivity) nc5Var.m162488l(GraduateActivity.PROTOBUF_ADAPTER);
                        continue;
                    case 128:
                        coreAssetsSettings.autoReadConversation = nc5Var.m162483g();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        coreAssetsSettings.rateAlertSetting = (List) nc5Var.m162488l(RateAlertSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 144:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 154:
                        coreAssetsSettings.appUpdateVersionData = (AppUpdateVersionData) nc5Var.m162488l(AppUpdateVersionData.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        coreAssetsSettings.schoolVerificationAgeRange = (SchoolVerificationAgeRange) nc5Var.m162488l(SchoolVerificationAgeRange.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        coreAssetsSettings.keepConnection = (KeepConnection) nc5Var.m162488l(KeepConnection.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        coreAssetsSettings.userScrapeReporting = (UserScrapeReporting) nc5Var.m162488l(UserScrapeReporting.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        coreAssetsSettings.lowPriceFirstMonth = (LowPriceFirstMonth) nc5Var.m162488l(LowPriceFirstMonth.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        coreAssetsSettings.seeMatchThenPay = (SeeMatchThenPay) nc5Var.m162488l(SeeMatchThenPay.PROTOBUF_ADAPTER);
                        continue;
                    case 200:
                        coreAssetsSettings.autoPayEnable = nc5Var.m162483g();
                        continue;
                    case 208:
                        coreAssetsSettings.seeSwipeCountInOneSession = nc5Var.m162486j();
                        continue;
                    case 218:
                        coreAssetsSettings.profileBasicHobbyTags = (List) nc5Var.m162488l(ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 226:
                        coreAssetsSettings.profileBasicRecentTags = (List) nc5Var.m162488l(ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 234:
                        coreAssetsSettings.profileBasicTogetherTags = (List) nc5Var.m162488l(ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 242:
                        coreAssetsSettings.anonymityImg = (AnonymityImg) nc5Var.m162488l(AnonymityImg.PROTOBUF_ADAPTER);
                        continue;
                    case 248:
                        coreAssetsSettings.chatGuideExp = nc5Var.m162483g();
                        continue;
                    case 258:
                        coreAssetsSettings.intlLetterContent = (LetterMultilingual) nc5Var.m162488l(LetterMultilingual.PROTOBUF_ADAPTER);
                        continue;
                    case 266:
                        coreAssetsSettings.autoRenewalBenefit = (AutoRenewalBenefit) nc5Var.m162488l(AutoRenewalBenefit.PROTOBUF_ADAPTER);
                        continue;
                    case 274:
                        coreAssetsSettings.profileUpgradeInputOrder = (ProfileUpgradeInputOrder) nc5Var.m162488l(ProfileUpgradeInputOrder.PROTOBUF_ADAPTER);
                        continue;
                    case 282:
                        coreAssetsSettings.guideText = (ProfileUpgradeGuideText) nc5Var.m162488l(ProfileUpgradeGuideText.PROTOBUF_ADAPTER);
                        continue;
                    case 290:
                        coreAssetsSettings.profileUpgradeInterest = (List) nc5Var.m162488l(ProfileUpgradeInterest.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 296:
                        coreAssetsSettings.chatOnlineDuration = nc5Var.m162486j();
                        continue;
                    case 306:
                        coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) nc5Var.m162488l(UserBanAppealSwitch.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (coreAssetsSettings.userBanAppealSwitch == null && numValueOf != null) {
                            coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (coreAssetsSettings.prompt == null) {
                            coreAssetsSettings.prompt = PromptLimit.new_();
                        }
                        if (coreAssetsSettings.missMatch == null) {
                            coreAssetsSettings.missMatch = MissMatch.new_();
                        }
                        if (coreAssetsSettings.specialCard == null) {
                            coreAssetsSettings.specialCard = SpecialCard.new_();
                        }
                        if (coreAssetsSettings.thirdPartySticker == null) {
                            coreAssetsSettings.thirdPartySticker = ThirdPartySticker.new_();
                        }
                        if (coreAssetsSettings.letterContent == null) {
                            coreAssetsSettings.letterContent = LetterMultilingual.new_();
                        }
                        if (coreAssetsSettings.showLiveForIntlAdUser == null) {
                            coreAssetsSettings.showLiveForIntlAdUser = ShowLiveForIntlAdUser.new_();
                        }
                        if (coreAssetsSettings.intlChatRequest == null) {
                            coreAssetsSettings.intlChatRequest = IntlChatRequest.new_();
                        }
                        if (coreAssetsSettings.graduateActivity == null) {
                            coreAssetsSettings.graduateActivity = GraduateActivity.new_();
                        }
                        if (coreAssetsSettings.userBanAppealSwitch == null) {
                            coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.defaultEnum();
                        }
                        if (coreAssetsSettings.appUpdateVersionData == null) {
                            coreAssetsSettings.appUpdateVersionData = AppUpdateVersionData.new_();
                        }
                        if (coreAssetsSettings.schoolVerificationAgeRange == null) {
                            coreAssetsSettings.schoolVerificationAgeRange = SchoolVerificationAgeRange.new_();
                        }
                        if (coreAssetsSettings.keepConnection == null) {
                            coreAssetsSettings.keepConnection = KeepConnection.new_();
                        }
                        if (coreAssetsSettings.userScrapeReporting == null) {
                            coreAssetsSettings.userScrapeReporting = UserScrapeReporting.new_();
                        }
                        if (coreAssetsSettings.seeMatchThenPay == null) {
                            coreAssetsSettings.seeMatchThenPay = SeeMatchThenPay.new_();
                        }
                        if (coreAssetsSettings.anonymityImg == null) {
                            coreAssetsSettings.anonymityImg = AnonymityImg.new_();
                        }
                        if (coreAssetsSettings.intlLetterContent == null) {
                            coreAssetsSettings.intlLetterContent = LetterMultilingual.new_();
                        }
                        if (coreAssetsSettings.profileUpgradeInputOrder == null) {
                            coreAssetsSettings.profileUpgradeInputOrder = ProfileUpgradeInputOrder.new_();
                        }
                        if (coreAssetsSettings.guideText == null) {
                            coreAssetsSettings.guideText = ProfileUpgradeGuideText.new_();
                        }
                        if (coreAssetsSettings.profileUpgradeInterest == null) {
                            coreAssetsSettings.profileUpgradeInterest = new ArrayList();
                            return coreAssetsSettings;
                        }
                        break;
                }
            }
            return coreAssetsSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreAssetsSettings coreAssetsSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<InactivateReason> list = coreAssetsSettings.inactivateReason;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, InactivateReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(2, coreAssetsSettings.closeAct2GoodAll);
            PromptLimit promptLimit = coreAssetsSettings.prompt;
            if (promptLimit != null) {
                codedOutputByteBufferNano.m17309K(3, promptLimit, PromptLimit.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17307I(4, coreAssetsSettings.counterPollingSeconds);
            MissMatch missMatch = coreAssetsSettings.missMatch;
            if (missMatch != null) {
                codedOutputByteBufferNano.m17309K(5, missMatch, MissMatch.PROTOBUF_ADAPTER);
            }
            SpecialCard specialCard = coreAssetsSettings.specialCard;
            if (specialCard != null) {
                codedOutputByteBufferNano.m17309K(6, specialCard, SpecialCard.PROTOBUF_ADAPTER);
            }
            ChatEffect chatEffect = coreAssetsSettings.chatEffect;
            if (chatEffect != null) {
                codedOutputByteBufferNano.m17309K(7, chatEffect, ChatEffect.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(8, coreAssetsSettings.forcePhoneBind);
            codedOutputByteBufferNano.m17301C(9, coreAssetsSettings.forcePhoneBindTime);
            ThirdPartySticker thirdPartySticker = coreAssetsSettings.thirdPartySticker;
            if (thirdPartySticker != null) {
                codedOutputByteBufferNano.m17309K(10, thirdPartySticker, ThirdPartySticker.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(11, coreAssetsSettings.enableVoiceCall);
            LetterMultilingual letterMultilingual = coreAssetsSettings.letterContent;
            if (letterMultilingual != null) {
                codedOutputByteBufferNano.m17309K(12, letterMultilingual, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            ShowLiveForIntlAdUser showLiveForIntlAdUser = coreAssetsSettings.showLiveForIntlAdUser;
            if (showLiveForIntlAdUser != null) {
                codedOutputByteBufferNano.m17309K(13, showLiveForIntlAdUser, ShowLiveForIntlAdUser.PROTOBUF_ADAPTER);
            }
            IntlChatRequest intlChatRequest = coreAssetsSettings.intlChatRequest;
            if (intlChatRequest != null) {
                codedOutputByteBufferNano.m17309K(14, intlChatRequest, IntlChatRequest.PROTOBUF_ADAPTER);
            }
            GraduateActivity graduateActivity = coreAssetsSettings.graduateActivity;
            if (graduateActivity != null) {
                codedOutputByteBufferNano.m17309K(15, graduateActivity, GraduateActivity.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(16, coreAssetsSettings.autoReadConversation);
            List<RateAlertSetting> list2 = coreAssetsSettings.rateAlertSetting;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(17, list2, RateAlertSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UserBanAppealSwitch userBanAppealSwitch = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch != null) {
                codedOutputByteBufferNano.m17305G(18, userBanAppealSwitch.ordinal());
            }
            AppUpdateVersionData appUpdateVersionData = coreAssetsSettings.appUpdateVersionData;
            if (appUpdateVersionData != null) {
                codedOutputByteBufferNano.m17309K(19, appUpdateVersionData, AppUpdateVersionData.PROTOBUF_ADAPTER);
            }
            SchoolVerificationAgeRange schoolVerificationAgeRange = coreAssetsSettings.schoolVerificationAgeRange;
            if (schoolVerificationAgeRange != null) {
                codedOutputByteBufferNano.m17309K(20, schoolVerificationAgeRange, SchoolVerificationAgeRange.PROTOBUF_ADAPTER);
            }
            KeepConnection keepConnection = coreAssetsSettings.keepConnection;
            if (keepConnection != null) {
                codedOutputByteBufferNano.m17309K(21, keepConnection, KeepConnection.PROTOBUF_ADAPTER);
            }
            UserScrapeReporting userScrapeReporting = coreAssetsSettings.userScrapeReporting;
            if (userScrapeReporting != null) {
                codedOutputByteBufferNano.m17309K(22, userScrapeReporting, UserScrapeReporting.PROTOBUF_ADAPTER);
            }
            LowPriceFirstMonth lowPriceFirstMonth = coreAssetsSettings.lowPriceFirstMonth;
            if (lowPriceFirstMonth != null) {
                codedOutputByteBufferNano.m17309K(23, lowPriceFirstMonth, LowPriceFirstMonth.PROTOBUF_ADAPTER);
            }
            SeeMatchThenPay seeMatchThenPay = coreAssetsSettings.seeMatchThenPay;
            if (seeMatchThenPay != null) {
                codedOutputByteBufferNano.m17309K(24, seeMatchThenPay, SeeMatchThenPay.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(25, coreAssetsSettings.autoPayEnable);
            codedOutputByteBufferNano.m17305G(26, coreAssetsSettings.seeSwipeCountInOneSession);
            List<ProfileBasicTag> list3 = coreAssetsSettings.profileBasicHobbyTags;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(27, list3, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list4 = coreAssetsSettings.profileBasicRecentTags;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(28, list4, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list5 = coreAssetsSettings.profileBasicTogetherTags;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(29, list5, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AnonymityImg anonymityImg = coreAssetsSettings.anonymityImg;
            if (anonymityImg != null) {
                codedOutputByteBufferNano.m17309K(30, anonymityImg, AnonymityImg.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(31, coreAssetsSettings.chatGuideExp);
            LetterMultilingual letterMultilingual2 = coreAssetsSettings.intlLetterContent;
            if (letterMultilingual2 != null) {
                codedOutputByteBufferNano.m17309K(32, letterMultilingual2, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            AutoRenewalBenefit autoRenewalBenefit = coreAssetsSettings.autoRenewalBenefit;
            if (autoRenewalBenefit != null) {
                codedOutputByteBufferNano.m17309K(33, autoRenewalBenefit, AutoRenewalBenefit.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeInputOrder profileUpgradeInputOrder = coreAssetsSettings.profileUpgradeInputOrder;
            if (profileUpgradeInputOrder != null) {
                codedOutputByteBufferNano.m17309K(34, profileUpgradeInputOrder, ProfileUpgradeInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeGuideText profileUpgradeGuideText = coreAssetsSettings.guideText;
            if (profileUpgradeGuideText != null) {
                codedOutputByteBufferNano.m17309K(35, profileUpgradeGuideText, ProfileUpgradeGuideText.PROTOBUF_ADAPTER);
            }
            List<ProfileUpgradeInterest> list6 = coreAssetsSettings.profileUpgradeInterest;
            if (list6 != null) {
                codedOutputByteBufferNano.m17309K(36, list6, ProfileUpgradeInterest.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(37, coreAssetsSettings.chatOnlineDuration);
            UserBanAppealSwitch userBanAppealSwitch2 = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch2 != null) {
                codedOutputByteBufferNano.m17309K(38, userBanAppealSwitch2, UserBanAppealSwitch.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CoreAssetsSettings> JSON_ADAPTER = new ObjectJsonAdapter<CoreAssetsSettings>() { // from class: com.p1.mobile.putong.core.data.CoreAssetsSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreAssetsSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreAssetsSettings newInstance() {
            return new CoreAssetsSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CoreAssetsSettings coreAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2076436919:
                    if (str.equals("guideText")) {
                        b = 0;
                    }
                    break;
                case -2073798903:
                    if (str.equals("chatEffect")) {
                        b = 1;
                    }
                    break;
                case -2050632947:
                    if (str.equals("forcePhoneBindTime")) {
                        b = 2;
                    }
                    break;
                case -2023335929:
                    if (str.equals("userBanAppealSwitch")) {
                        b = 3;
                    }
                    break;
                case -1903114248:
                    if (str.equals("appUpdateVersionData")) {
                        b = 4;
                    }
                    break;
                case -1726009832:
                    if (str.equals("profileBasicTogetherTags")) {
                        b = 5;
                    }
                    break;
                case -1663587399:
                    if (str.equals("seeMatchThenPay")) {
                        b = 6;
                    }
                    break;
                case -1593209218:
                    if (str.equals("thirdPartySticker")) {
                        b = 7;
                    }
                    break;
                case -1439850759:
                    if (str.equals("profileBasicRecentTags")) {
                        b = 8;
                    }
                    break;
                case -1273310131:
                    if (str.equals("schoolVerificationAgeRange")) {
                        b = 9;
                    }
                    break;
                case -979805852:
                    if (str.equals("prompt")) {
                        b = 10;
                    }
                    break;
                case -882034308:
                    if (str.equals("inactivateReason")) {
                        b = 11;
                    }
                    break;
                case -872928407:
                    if (str.equals("specialCard")) {
                        b = 12;
                    }
                    break;
                case -552515819:
                    if (str.equals("anonymityImg")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -378316402:
                    if (str.equals("autoRenewalBenefit")) {
                        b = 14;
                    }
                    break;
                case -352631559:
                    if (str.equals("chatGuideExp")) {
                        b = 15;
                    }
                    break;
                case -294832552:
                    if (str.equals("counterPollingSeconds")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -148921277:
                    if (str.equals("keepConnection")) {
                        b = 17;
                    }
                    break;
                case 77680765:
                    if (str.equals("profileUpgradeInterest")) {
                        b = 18;
                    }
                    break;
                case 97066016:
                    if (str.equals("forcePhoneBind")) {
                        b = 19;
                    }
                    break;
                case 150105684:
                    if (str.equals("rateAlertSetting")) {
                        b = 20;
                    }
                    break;
                case 312553015:
                    if (str.equals("profileUpgradeInputOrder")) {
                        b = 21;
                    }
                    break;
                case 358374031:
                    if (str.equals("userScrapeReporting")) {
                        b = 22;
                    }
                    break;
                case 547931782:
                    if (str.equals("profileBasicHobbyTags")) {
                        b = 23;
                    }
                    break;
                case 779800947:
                    if (str.equals("letterContent")) {
                        b = 24;
                    }
                    break;
                case 1051092077:
                    if (str.equals("enableVoiceCall")) {
                        b = 25;
                    }
                    break;
                case 1172519290:
                    if (str.equals("graduateActivity")) {
                        b = 26;
                    }
                    break;
                case 1217626665:
                    if (str.equals("missMatch")) {
                        b = 27;
                    }
                    break;
                case 1272366877:
                    if (str.equals("seeSwipeCountInOneSession")) {
                        b = 28;
                    }
                    break;
                case 1422563706:
                    if (str.equals("intlChatRequest")) {
                        b = 29;
                    }
                    break;
                case 1607743979:
                    if (str.equals("showLiveForIntlAdUser")) {
                        b = 30;
                    }
                    break;
                case 1634769430:
                    if (str.equals("intlLetterContent")) {
                        b = 31;
                    }
                    break;
                case 1664964069:
                    if (str.equals(MonetizationPromotionsId.lowPriceFirstMonth)) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1976556380:
                    if (str.equals("autoPayEnable")) {
                        b = 33;
                    }
                    break;
                case 2036186376:
                    if (str.equals("autoReadConversation")) {
                        b = 34;
                    }
                    break;
                case 2062433254:
                    if (str.equals("close_act2good_all")) {
                        b = 35;
                    }
                    break;
                case 2101873279:
                    if (str.equals("chatOnlineDuration")) {
                        b = 36;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    coreAssetsSettings.guideText = ProfileUpgradeGuideText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    coreAssetsSettings.chatEffect = ChatEffect.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    coreAssetsSettings.forcePhoneBindTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 3:
                    coreAssetsSettings.userBanAppealSwitch = UserBanAppealSwitch.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 4:
                    coreAssetsSettings.appUpdateVersionData = AppUpdateVersionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    coreAssetsSettings.profileBasicTogetherTags = JsonAdapter.parseArray(jsonParser, ProfileBasicTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    coreAssetsSettings.seeMatchThenPay = SeeMatchThenPay.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    coreAssetsSettings.thirdPartySticker = ThirdPartySticker.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    coreAssetsSettings.profileBasicRecentTags = JsonAdapter.parseArray(jsonParser, ProfileBasicTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    coreAssetsSettings.schoolVerificationAgeRange = SchoolVerificationAgeRange.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    coreAssetsSettings.prompt = PromptLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    coreAssetsSettings.inactivateReason = JsonAdapter.parseArray(jsonParser, InactivateReason.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    coreAssetsSettings.specialCard = SpecialCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    coreAssetsSettings.anonymityImg = AnonymityImg.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    coreAssetsSettings.autoRenewalBenefit = AutoRenewalBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    coreAssetsSettings.chatGuideExp = jsonParser.getValueAsBoolean();
                    return true;
                case 16:
                    coreAssetsSettings.counterPollingSeconds = jsonParser.getValueAsLong();
                    return true;
                case 17:
                    coreAssetsSettings.keepConnection = KeepConnection.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    coreAssetsSettings.profileUpgradeInterest = JsonAdapter.parseArray(jsonParser, ProfileUpgradeInterest.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    coreAssetsSettings.forcePhoneBind = jsonParser.getValueAsBoolean();
                    return true;
                case 20:
                    coreAssetsSettings.rateAlertSetting = JsonAdapter.parseArray(jsonParser, RateAlertSetting.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    coreAssetsSettings.profileUpgradeInputOrder = ProfileUpgradeInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    coreAssetsSettings.userScrapeReporting = UserScrapeReporting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    coreAssetsSettings.profileBasicHobbyTags = JsonAdapter.parseArray(jsonParser, ProfileBasicTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    coreAssetsSettings.letterContent = LetterMultilingual.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    coreAssetsSettings.enableVoiceCall = jsonParser.getValueAsInt();
                    return true;
                case 26:
                    coreAssetsSettings.graduateActivity = GraduateActivity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    coreAssetsSettings.missMatch = MissMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    coreAssetsSettings.seeSwipeCountInOneSession = jsonParser.getValueAsInt();
                    return true;
                case 29:
                    coreAssetsSettings.intlChatRequest = IntlChatRequest.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    coreAssetsSettings.showLiveForIntlAdUser = ShowLiveForIntlAdUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    coreAssetsSettings.intlLetterContent = LetterMultilingual.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 32:
                    coreAssetsSettings.lowPriceFirstMonth = LowPriceFirstMonth.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    coreAssetsSettings.autoPayEnable = jsonParser.getValueAsBoolean();
                    return true;
                case 34:
                    coreAssetsSettings.autoReadConversation = jsonParser.getValueAsBoolean();
                    return true;
                case 35:
                    coreAssetsSettings.closeAct2GoodAll = jsonParser.getValueAsBoolean();
                    return true;
                case 36:
                    coreAssetsSettings.chatOnlineDuration = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(CoreAssetsSettings coreAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2076436919:
                    if (str.equals("guideText")) {
                        b = 0;
                    }
                    break;
                case -2073798903:
                    if (str.equals("chatEffect")) {
                        b = 1;
                    }
                    break;
                case -2050632947:
                    if (str.equals("forcePhoneBindTime")) {
                        b = 2;
                    }
                    break;
                case -2023335929:
                    if (str.equals("userBanAppealSwitch")) {
                        b = 3;
                    }
                    break;
                case -1903114248:
                    if (str.equals("appUpdateVersionData")) {
                        b = 4;
                    }
                    break;
                case -1726009832:
                    if (str.equals("profileBasicTogetherTags")) {
                        b = 5;
                    }
                    break;
                case -1663587399:
                    if (str.equals("seeMatchThenPay")) {
                        b = 6;
                    }
                    break;
                case -1593209218:
                    if (str.equals("thirdPartySticker")) {
                        b = 7;
                    }
                    break;
                case -1439850759:
                    if (str.equals("profileBasicRecentTags")) {
                        b = 8;
                    }
                    break;
                case -1273310131:
                    if (str.equals("schoolVerificationAgeRange")) {
                        b = 9;
                    }
                    break;
                case -979805852:
                    if (str.equals("prompt")) {
                        b = 10;
                    }
                    break;
                case -882034308:
                    if (str.equals("inactivateReason")) {
                        b = 11;
                    }
                    break;
                case -872928407:
                    if (str.equals("specialCard")) {
                        b = 12;
                    }
                    break;
                case -552515819:
                    if (str.equals("anonymityImg")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -378316402:
                    if (str.equals("autoRenewalBenefit")) {
                        b = 14;
                    }
                    break;
                case -352631559:
                    if (str.equals("chatGuideExp")) {
                        b = 15;
                    }
                    break;
                case -294832552:
                    if (str.equals("counterPollingSeconds")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -148921277:
                    if (str.equals("keepConnection")) {
                        b = 17;
                    }
                    break;
                case 77680765:
                    if (str.equals("profileUpgradeInterest")) {
                        b = 18;
                    }
                    break;
                case 97066016:
                    if (str.equals("forcePhoneBind")) {
                        b = 19;
                    }
                    break;
                case 150105684:
                    if (str.equals("rateAlertSetting")) {
                        b = 20;
                    }
                    break;
                case 312553015:
                    if (str.equals("profileUpgradeInputOrder")) {
                        b = 21;
                    }
                    break;
                case 358374031:
                    if (str.equals("userScrapeReporting")) {
                        b = 22;
                    }
                    break;
                case 547931782:
                    if (str.equals("profileBasicHobbyTags")) {
                        b = 23;
                    }
                    break;
                case 779800947:
                    if (str.equals("letterContent")) {
                        b = 24;
                    }
                    break;
                case 1051092077:
                    if (str.equals("enableVoiceCall")) {
                        b = 25;
                    }
                    break;
                case 1172519290:
                    if (str.equals("graduateActivity")) {
                        b = 26;
                    }
                    break;
                case 1217626665:
                    if (str.equals("missMatch")) {
                        b = 27;
                    }
                    break;
                case 1272366877:
                    if (str.equals("seeSwipeCountInOneSession")) {
                        b = 28;
                    }
                    break;
                case 1422563706:
                    if (str.equals("intlChatRequest")) {
                        b = 29;
                    }
                    break;
                case 1607743979:
                    if (str.equals("showLiveForIntlAdUser")) {
                        b = 30;
                    }
                    break;
                case 1634769430:
                    if (str.equals("intlLetterContent")) {
                        b = 31;
                    }
                    break;
                case 1664964069:
                    if (str.equals(MonetizationPromotionsId.lowPriceFirstMonth)) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1976556380:
                    if (str.equals("autoPayEnable")) {
                        b = 33;
                    }
                    break;
                case 2036186376:
                    if (str.equals("autoReadConversation")) {
                        b = 34;
                    }
                    break;
                case 2062433254:
                    if (str.equals("close_act2good_all")) {
                        b = 35;
                    }
                    break;
                case 2101873279:
                    if (str.equals("chatOnlineDuration")) {
                        b = 36;
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
                    return true;
                default:
                    return super.parseFieldCheck(coreAssetsSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreAssetsSettings coreAssetsSettings, JsonGenerator jsonGenerator) throws IOException {
            if (coreAssetsSettings.inactivateReason != null) {
                jsonGenerator.writeFieldName("inactivateReason");
                JsonAdapter.serializeArray(coreAssetsSettings.inactivateReason, jsonGenerator, InactivateReason.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("close_act2good_all", coreAssetsSettings.closeAct2GoodAll);
            if (coreAssetsSettings.prompt != null) {
                jsonGenerator.writeFieldName("prompt");
                PromptLimit.JSON_ADAPTER.serialize(coreAssetsSettings.prompt, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("counterPollingSeconds", coreAssetsSettings.counterPollingSeconds);
            if (coreAssetsSettings.missMatch != null) {
                jsonGenerator.writeFieldName("missMatch");
                MissMatch.JSON_ADAPTER.serialize(coreAssetsSettings.missMatch, jsonGenerator, true);
            }
            if (coreAssetsSettings.specialCard != null) {
                jsonGenerator.writeFieldName("specialCard");
                SpecialCard.JSON_ADAPTER.serialize(coreAssetsSettings.specialCard, jsonGenerator, true);
            }
            if (coreAssetsSettings.chatEffect != null) {
                jsonGenerator.writeFieldName("chatEffect");
                ChatEffect.JSON_ADAPTER.serialize(coreAssetsSettings.chatEffect, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("forcePhoneBind", coreAssetsSettings.forcePhoneBind);
            jsonGenerator.writeFieldName("forcePhoneBindTime");
            Converter.API_TIME.serialize(Double.valueOf(coreAssetsSettings.forcePhoneBindTime), jsonGenerator, true);
            if (coreAssetsSettings.thirdPartySticker != null) {
                jsonGenerator.writeFieldName("thirdPartySticker");
                ThirdPartySticker.JSON_ADAPTER.serialize(coreAssetsSettings.thirdPartySticker, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("enableVoiceCall", coreAssetsSettings.enableVoiceCall);
            if (coreAssetsSettings.letterContent != null) {
                jsonGenerator.writeFieldName("letterContent");
                LetterMultilingual.JSON_ADAPTER.serialize(coreAssetsSettings.letterContent, jsonGenerator, true);
            }
            if (coreAssetsSettings.showLiveForIntlAdUser != null) {
                jsonGenerator.writeFieldName("showLiveForIntlAdUser");
                ShowLiveForIntlAdUser.JSON_ADAPTER.serialize(coreAssetsSettings.showLiveForIntlAdUser, jsonGenerator, true);
            }
            if (coreAssetsSettings.intlChatRequest != null) {
                jsonGenerator.writeFieldName("intlChatRequest");
                IntlChatRequest.JSON_ADAPTER.serialize(coreAssetsSettings.intlChatRequest, jsonGenerator, true);
            }
            if (coreAssetsSettings.graduateActivity != null) {
                jsonGenerator.writeFieldName("graduateActivity");
                GraduateActivity.JSON_ADAPTER.serialize(coreAssetsSettings.graduateActivity, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("autoReadConversation", coreAssetsSettings.autoReadConversation);
            if (coreAssetsSettings.rateAlertSetting != null) {
                jsonGenerator.writeFieldName("rateAlertSetting");
                JsonAdapter.serializeArray(coreAssetsSettings.rateAlertSetting, jsonGenerator, RateAlertSetting.JSON_ADAPTER);
            }
            if (coreAssetsSettings.userBanAppealSwitch != null) {
                jsonGenerator.writeFieldName("userBanAppealSwitch");
                UserBanAppealSwitch.JSON_ADAPTER.serialize(coreAssetsSettings.userBanAppealSwitch, jsonGenerator, true);
            }
            if (coreAssetsSettings.appUpdateVersionData != null) {
                jsonGenerator.writeFieldName("appUpdateVersionData");
                AppUpdateVersionData.JSON_ADAPTER.serialize(coreAssetsSettings.appUpdateVersionData, jsonGenerator, true);
            }
            if (coreAssetsSettings.schoolVerificationAgeRange != null) {
                jsonGenerator.writeFieldName("schoolVerificationAgeRange");
                SchoolVerificationAgeRange.JSON_ADAPTER.serialize(coreAssetsSettings.schoolVerificationAgeRange, jsonGenerator, true);
            }
            if (coreAssetsSettings.keepConnection != null) {
                jsonGenerator.writeFieldName("keepConnection");
                KeepConnection.JSON_ADAPTER.serialize(coreAssetsSettings.keepConnection, jsonGenerator, true);
            }
            if (coreAssetsSettings.userScrapeReporting != null) {
                jsonGenerator.writeFieldName("userScrapeReporting");
                UserScrapeReporting.JSON_ADAPTER.serialize(coreAssetsSettings.userScrapeReporting, jsonGenerator, true);
            }
            if (coreAssetsSettings.lowPriceFirstMonth != null) {
                jsonGenerator.writeFieldName(MonetizationPromotionsId.lowPriceFirstMonth);
                LowPriceFirstMonth.JSON_ADAPTER.serialize(coreAssetsSettings.lowPriceFirstMonth, jsonGenerator, true);
            }
            if (coreAssetsSettings.seeMatchThenPay != null) {
                jsonGenerator.writeFieldName("seeMatchThenPay");
                SeeMatchThenPay.JSON_ADAPTER.serialize(coreAssetsSettings.seeMatchThenPay, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("autoPayEnable", coreAssetsSettings.autoPayEnable);
            jsonGenerator.writeNumberField("seeSwipeCountInOneSession", coreAssetsSettings.seeSwipeCountInOneSession);
            if (coreAssetsSettings.profileBasicHobbyTags != null) {
                jsonGenerator.writeFieldName("profileBasicHobbyTags");
                JsonAdapter.serializeArray(coreAssetsSettings.profileBasicHobbyTags, jsonGenerator, ProfileBasicTag.JSON_ADAPTER);
            }
            if (coreAssetsSettings.profileBasicRecentTags != null) {
                jsonGenerator.writeFieldName("profileBasicRecentTags");
                JsonAdapter.serializeArray(coreAssetsSettings.profileBasicRecentTags, jsonGenerator, ProfileBasicTag.JSON_ADAPTER);
            }
            if (coreAssetsSettings.profileBasicTogetherTags != null) {
                jsonGenerator.writeFieldName("profileBasicTogetherTags");
                JsonAdapter.serializeArray(coreAssetsSettings.profileBasicTogetherTags, jsonGenerator, ProfileBasicTag.JSON_ADAPTER);
            }
            if (coreAssetsSettings.anonymityImg != null) {
                jsonGenerator.writeFieldName("anonymityImg");
                AnonymityImg.JSON_ADAPTER.serialize(coreAssetsSettings.anonymityImg, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("chatGuideExp", coreAssetsSettings.chatGuideExp);
            if (coreAssetsSettings.intlLetterContent != null) {
                jsonGenerator.writeFieldName("intlLetterContent");
                LetterMultilingual.JSON_ADAPTER.serialize(coreAssetsSettings.intlLetterContent, jsonGenerator, true);
            }
            if (coreAssetsSettings.autoRenewalBenefit != null) {
                jsonGenerator.writeFieldName("autoRenewalBenefit");
                AutoRenewalBenefit.JSON_ADAPTER.serialize(coreAssetsSettings.autoRenewalBenefit, jsonGenerator, true);
            }
            if (coreAssetsSettings.profileUpgradeInputOrder != null) {
                jsonGenerator.writeFieldName("profileUpgradeInputOrder");
                ProfileUpgradeInputOrder.JSON_ADAPTER.serialize(coreAssetsSettings.profileUpgradeInputOrder, jsonGenerator, true);
            }
            if (coreAssetsSettings.guideText != null) {
                jsonGenerator.writeFieldName("guideText");
                ProfileUpgradeGuideText.JSON_ADAPTER.serialize(coreAssetsSettings.guideText, jsonGenerator, true);
            }
            if (coreAssetsSettings.profileUpgradeInterest != null) {
                jsonGenerator.writeFieldName("profileUpgradeInterest");
                JsonAdapter.serializeArray(coreAssetsSettings.profileUpgradeInterest, jsonGenerator, ProfileUpgradeInterest.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("chatOnlineDuration", coreAssetsSettings.chatOnlineDuration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreAssetsSettings new_() {
        CoreAssetsSettings coreAssetsSettings = new CoreAssetsSettings();
        coreAssetsSettings.nullCheck();
        return coreAssetsSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreAssetsSettings mo225055clone() {
        CoreAssetsSettings coreAssetsSettings = new CoreAssetsSettings();
        List<InactivateReason> list = this.inactivateReason;
        if (list != null) {
            coreAssetsSettings.inactivateReason = ValueObject.util_map(list, new qcj() { // from class: l.hy6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((InactivateReason) obj).mo225055clone();
                }
            });
        }
        coreAssetsSettings.closeAct2GoodAll = this.closeAct2GoodAll;
        PromptLimit promptLimit = this.prompt;
        if (promptLimit != null) {
            coreAssetsSettings.prompt = promptLimit.mo225055clone();
        }
        coreAssetsSettings.counterPollingSeconds = this.counterPollingSeconds;
        MissMatch missMatch = this.missMatch;
        if (missMatch != null) {
            coreAssetsSettings.missMatch = missMatch.mo225055clone();
        }
        SpecialCard specialCard = this.specialCard;
        if (specialCard != null) {
            coreAssetsSettings.specialCard = specialCard.mo225055clone();
        }
        ChatEffect chatEffect = this.chatEffect;
        if (chatEffect != null) {
            coreAssetsSettings.chatEffect = chatEffect.mo225055clone();
        }
        coreAssetsSettings.forcePhoneBind = this.forcePhoneBind;
        coreAssetsSettings.forcePhoneBindTime = this.forcePhoneBindTime;
        ThirdPartySticker thirdPartySticker = this.thirdPartySticker;
        if (thirdPartySticker != null) {
            coreAssetsSettings.thirdPartySticker = thirdPartySticker.mo225055clone();
        }
        coreAssetsSettings.enableVoiceCall = this.enableVoiceCall;
        LetterMultilingual letterMultilingual = this.letterContent;
        if (letterMultilingual != null) {
            coreAssetsSettings.letterContent = letterMultilingual.mo225055clone();
        }
        ShowLiveForIntlAdUser showLiveForIntlAdUser = this.showLiveForIntlAdUser;
        if (showLiveForIntlAdUser != null) {
            coreAssetsSettings.showLiveForIntlAdUser = showLiveForIntlAdUser.mo225055clone();
        }
        IntlChatRequest intlChatRequest = this.intlChatRequest;
        if (intlChatRequest != null) {
            coreAssetsSettings.intlChatRequest = intlChatRequest.mo225055clone();
        }
        GraduateActivity graduateActivity = this.graduateActivity;
        if (graduateActivity != null) {
            coreAssetsSettings.graduateActivity = graduateActivity.mo225055clone();
        }
        coreAssetsSettings.autoReadConversation = this.autoReadConversation;
        List<RateAlertSetting> list2 = this.rateAlertSetting;
        if (list2 != null) {
            coreAssetsSettings.rateAlertSetting = ValueObject.util_map(list2, new qcj() { // from class: l.iy6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((RateAlertSetting) obj).mo225055clone();
                }
            });
        }
        coreAssetsSettings.userBanAppealSwitch = this.userBanAppealSwitch;
        AppUpdateVersionData appUpdateVersionData = this.appUpdateVersionData;
        if (appUpdateVersionData != null) {
            coreAssetsSettings.appUpdateVersionData = appUpdateVersionData.mo225055clone();
        }
        SchoolVerificationAgeRange schoolVerificationAgeRange = this.schoolVerificationAgeRange;
        if (schoolVerificationAgeRange != null) {
            coreAssetsSettings.schoolVerificationAgeRange = schoolVerificationAgeRange.mo225055clone();
        }
        KeepConnection keepConnection = this.keepConnection;
        if (keepConnection != null) {
            coreAssetsSettings.keepConnection = keepConnection.mo225055clone();
        }
        UserScrapeReporting userScrapeReporting = this.userScrapeReporting;
        if (userScrapeReporting != null) {
            coreAssetsSettings.userScrapeReporting = userScrapeReporting.mo225055clone();
        }
        LowPriceFirstMonth lowPriceFirstMonth = this.lowPriceFirstMonth;
        if (lowPriceFirstMonth != null) {
            coreAssetsSettings.lowPriceFirstMonth = lowPriceFirstMonth.mo225055clone();
        }
        SeeMatchThenPay seeMatchThenPay = this.seeMatchThenPay;
        if (seeMatchThenPay != null) {
            coreAssetsSettings.seeMatchThenPay = seeMatchThenPay.mo225055clone();
        }
        coreAssetsSettings.autoPayEnable = this.autoPayEnable;
        coreAssetsSettings.seeSwipeCountInOneSession = this.seeSwipeCountInOneSession;
        List<ProfileBasicTag> list3 = this.profileBasicHobbyTags;
        if (list3 != null) {
            coreAssetsSettings.profileBasicHobbyTags = ValueObject.util_map(list3, new qcj() { // from class: l.jy6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ProfileBasicTag) obj).mo225055clone();
                }
            });
        }
        List<ProfileBasicTag> list4 = this.profileBasicRecentTags;
        if (list4 != null) {
            coreAssetsSettings.profileBasicRecentTags = ValueObject.util_map(list4, new qcj() { // from class: l.ky6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ProfileBasicTag) obj).mo225055clone();
                }
            });
        }
        List<ProfileBasicTag> list5 = this.profileBasicTogetherTags;
        if (list5 != null) {
            coreAssetsSettings.profileBasicTogetherTags = ValueObject.util_map(list5, new qcj() { // from class: l.ly6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ProfileBasicTag) obj).mo225055clone();
                }
            });
        }
        AnonymityImg anonymityImg = this.anonymityImg;
        if (anonymityImg != null) {
            coreAssetsSettings.anonymityImg = anonymityImg.mo225055clone();
        }
        coreAssetsSettings.chatGuideExp = this.chatGuideExp;
        LetterMultilingual letterMultilingual2 = this.intlLetterContent;
        if (letterMultilingual2 != null) {
            coreAssetsSettings.intlLetterContent = letterMultilingual2.mo225055clone();
        }
        AutoRenewalBenefit autoRenewalBenefit = this.autoRenewalBenefit;
        if (autoRenewalBenefit != null) {
            coreAssetsSettings.autoRenewalBenefit = autoRenewalBenefit.mo225055clone();
        }
        ProfileUpgradeInputOrder profileUpgradeInputOrder = this.profileUpgradeInputOrder;
        if (profileUpgradeInputOrder != null) {
            coreAssetsSettings.profileUpgradeInputOrder = profileUpgradeInputOrder.mo225055clone();
        }
        ProfileUpgradeGuideText profileUpgradeGuideText = this.guideText;
        if (profileUpgradeGuideText != null) {
            coreAssetsSettings.guideText = profileUpgradeGuideText.mo225055clone();
        }
        List<ProfileUpgradeInterest> list6 = this.profileUpgradeInterest;
        if (list6 != null) {
            coreAssetsSettings.profileUpgradeInterest = ValueObject.util_map(list6, new qcj() { // from class: l.my6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ProfileUpgradeInterest) obj).mo225055clone();
                }
            });
        }
        coreAssetsSettings.chatOnlineDuration = this.chatOnlineDuration;
        return coreAssetsSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreAssetsSettings)) {
            return false;
        }
        CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) obj;
        return ValueObject.util_equals(this.inactivateReason, coreAssetsSettings.inactivateReason) && this.closeAct2GoodAll == coreAssetsSettings.closeAct2GoodAll && ValueObject.util_equals(this.prompt, coreAssetsSettings.prompt) && this.counterPollingSeconds == coreAssetsSettings.counterPollingSeconds && ValueObject.util_equals(this.missMatch, coreAssetsSettings.missMatch) && ValueObject.util_equals(this.specialCard, coreAssetsSettings.specialCard) && ValueObject.util_equals(this.chatEffect, coreAssetsSettings.chatEffect) && this.forcePhoneBind == coreAssetsSettings.forcePhoneBind && this.forcePhoneBindTime == coreAssetsSettings.forcePhoneBindTime && ValueObject.util_equals(this.thirdPartySticker, coreAssetsSettings.thirdPartySticker) && this.enableVoiceCall == coreAssetsSettings.enableVoiceCall && ValueObject.util_equals(this.letterContent, coreAssetsSettings.letterContent) && ValueObject.util_equals(this.showLiveForIntlAdUser, coreAssetsSettings.showLiveForIntlAdUser) && ValueObject.util_equals(this.intlChatRequest, coreAssetsSettings.intlChatRequest) && ValueObject.util_equals(this.graduateActivity, coreAssetsSettings.graduateActivity) && this.autoReadConversation == coreAssetsSettings.autoReadConversation && ValueObject.util_equals(this.rateAlertSetting, coreAssetsSettings.rateAlertSetting) && ValueObject.util_equals(this.userBanAppealSwitch, coreAssetsSettings.userBanAppealSwitch) && ValueObject.util_equals(this.appUpdateVersionData, coreAssetsSettings.appUpdateVersionData) && ValueObject.util_equals(this.schoolVerificationAgeRange, coreAssetsSettings.schoolVerificationAgeRange) && ValueObject.util_equals(this.keepConnection, coreAssetsSettings.keepConnection) && ValueObject.util_equals(this.userScrapeReporting, coreAssetsSettings.userScrapeReporting) && ValueObject.util_equals(this.lowPriceFirstMonth, coreAssetsSettings.lowPriceFirstMonth) && ValueObject.util_equals(this.seeMatchThenPay, coreAssetsSettings.seeMatchThenPay) && this.autoPayEnable == coreAssetsSettings.autoPayEnable && this.seeSwipeCountInOneSession == coreAssetsSettings.seeSwipeCountInOneSession && ValueObject.util_equals(this.profileBasicHobbyTags, coreAssetsSettings.profileBasicHobbyTags) && ValueObject.util_equals(this.profileBasicRecentTags, coreAssetsSettings.profileBasicRecentTags) && ValueObject.util_equals(this.profileBasicTogetherTags, coreAssetsSettings.profileBasicTogetherTags) && ValueObject.util_equals(this.anonymityImg, coreAssetsSettings.anonymityImg) && this.chatGuideExp == coreAssetsSettings.chatGuideExp && ValueObject.util_equals(this.intlLetterContent, coreAssetsSettings.intlLetterContent) && ValueObject.util_equals(this.autoRenewalBenefit, coreAssetsSettings.autoRenewalBenefit) && ValueObject.util_equals(this.profileUpgradeInputOrder, coreAssetsSettings.profileUpgradeInputOrder) && ValueObject.util_equals(this.guideText, coreAssetsSettings.guideText) && ValueObject.util_equals(this.profileUpgradeInterest, coreAssetsSettings.profileUpgradeInterest) && this.chatOnlineDuration == coreAssetsSettings.chatOnlineDuration;
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
        int i2 = i * 41;
        List<InactivateReason> list = this.inactivateReason;
        int iHashCode = (((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.closeAct2GoodAll ? 1231 : 1237)) * 41;
        PromptLimit promptLimit = this.prompt;
        int iHashCode2 = promptLimit != null ? promptLimit.hashCode() : 0;
        long j = this.counterPollingSeconds;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        MissMatch missMatch = this.missMatch;
        int iHashCode3 = (i3 + (missMatch != null ? missMatch.hashCode() : 0)) * 41;
        SpecialCard specialCard = this.specialCard;
        int iHashCode4 = (iHashCode3 + (specialCard != null ? specialCard.hashCode() : 0)) * 41;
        ChatEffect chatEffect = this.chatEffect;
        int iHashCode5 = ((iHashCode4 + (chatEffect != null ? chatEffect.hashCode() : 0)) * 41) + (this.forcePhoneBind ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.forcePhoneBindTime);
        int i4 = ((iHashCode5 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        ThirdPartySticker thirdPartySticker = this.thirdPartySticker;
        int iHashCode6 = (((i4 + (thirdPartySticker != null ? thirdPartySticker.hashCode() : 0)) * 41) + this.enableVoiceCall) * 41;
        LetterMultilingual letterMultilingual = this.letterContent;
        int iHashCode7 = (iHashCode6 + (letterMultilingual != null ? letterMultilingual.hashCode() : 0)) * 41;
        ShowLiveForIntlAdUser showLiveForIntlAdUser = this.showLiveForIntlAdUser;
        int iHashCode8 = (iHashCode7 + (showLiveForIntlAdUser != null ? showLiveForIntlAdUser.hashCode() : 0)) * 41;
        IntlChatRequest intlChatRequest = this.intlChatRequest;
        int iHashCode9 = (iHashCode8 + (intlChatRequest != null ? intlChatRequest.hashCode() : 0)) * 41;
        GraduateActivity graduateActivity = this.graduateActivity;
        int iHashCode10 = (((iHashCode9 + (graduateActivity != null ? graduateActivity.hashCode() : 0)) * 41) + (this.autoReadConversation ? 1231 : 1237)) * 41;
        List<RateAlertSetting> list2 = this.rateAlertSetting;
        int iHashCode11 = (iHashCode10 + (list2 != null ? list2.hashCode() : 0)) * 41;
        UserBanAppealSwitch userBanAppealSwitch = this.userBanAppealSwitch;
        int iHashCode12 = (iHashCode11 + (userBanAppealSwitch != null ? userBanAppealSwitch.hashCode() : 0)) * 41;
        AppUpdateVersionData appUpdateVersionData = this.appUpdateVersionData;
        int iHashCode13 = (iHashCode12 + (appUpdateVersionData != null ? appUpdateVersionData.hashCode() : 0)) * 41;
        SchoolVerificationAgeRange schoolVerificationAgeRange = this.schoolVerificationAgeRange;
        int iHashCode14 = (iHashCode13 + (schoolVerificationAgeRange != null ? schoolVerificationAgeRange.hashCode() : 0)) * 41;
        KeepConnection keepConnection = this.keepConnection;
        int iHashCode15 = (iHashCode14 + (keepConnection != null ? keepConnection.hashCode() : 0)) * 41;
        UserScrapeReporting userScrapeReporting = this.userScrapeReporting;
        int iHashCode16 = (iHashCode15 + (userScrapeReporting != null ? userScrapeReporting.hashCode() : 0)) * 41;
        LowPriceFirstMonth lowPriceFirstMonth = this.lowPriceFirstMonth;
        int iHashCode17 = (iHashCode16 + (lowPriceFirstMonth != null ? lowPriceFirstMonth.hashCode() : 0)) * 41;
        SeeMatchThenPay seeMatchThenPay = this.seeMatchThenPay;
        int iHashCode18 = (((((iHashCode17 + (seeMatchThenPay != null ? seeMatchThenPay.hashCode() : 0)) * 41) + (this.autoPayEnable ? 1231 : 1237)) * 41) + this.seeSwipeCountInOneSession) * 41;
        List<ProfileBasicTag> list3 = this.profileBasicHobbyTags;
        int iHashCode19 = (iHashCode18 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<ProfileBasicTag> list4 = this.profileBasicRecentTags;
        int iHashCode20 = (iHashCode19 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<ProfileBasicTag> list5 = this.profileBasicTogetherTags;
        int iHashCode21 = (iHashCode20 + (list5 != null ? list5.hashCode() : 0)) * 41;
        AnonymityImg anonymityImg = this.anonymityImg;
        int iHashCode22 = (((iHashCode21 + (anonymityImg != null ? anonymityImg.hashCode() : 0)) * 41) + (this.chatGuideExp ? 1231 : 1237)) * 41;
        LetterMultilingual letterMultilingual2 = this.intlLetterContent;
        int iHashCode23 = (iHashCode22 + (letterMultilingual2 != null ? letterMultilingual2.hashCode() : 0)) * 41;
        AutoRenewalBenefit autoRenewalBenefit = this.autoRenewalBenefit;
        int iHashCode24 = (iHashCode23 + (autoRenewalBenefit != null ? autoRenewalBenefit.hashCode() : 0)) * 41;
        ProfileUpgradeInputOrder profileUpgradeInputOrder = this.profileUpgradeInputOrder;
        int iHashCode25 = (iHashCode24 + (profileUpgradeInputOrder != null ? profileUpgradeInputOrder.hashCode() : 0)) * 41;
        ProfileUpgradeGuideText profileUpgradeGuideText = this.guideText;
        int iHashCode26 = (iHashCode25 + (profileUpgradeGuideText != null ? profileUpgradeGuideText.hashCode() : 0)) * 41;
        List<ProfileUpgradeInterest> list6 = this.profileUpgradeInterest;
        int iHashCode27 = ((iHashCode26 + (list6 != null ? list6.hashCode() : 0)) * 41) + this.chatOnlineDuration;
        this.hashCode = iHashCode27;
        return iHashCode27;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.prompt == null) {
            this.prompt = PromptLimit.new_();
        }
        if (this.missMatch == null) {
            this.missMatch = MissMatch.new_();
        }
        if (this.specialCard == null) {
            this.specialCard = SpecialCard.new_();
        }
        if (this.thirdPartySticker == null) {
            this.thirdPartySticker = ThirdPartySticker.new_();
        }
        if (this.letterContent == null) {
            this.letterContent = LetterMultilingual.new_();
        }
        if (this.showLiveForIntlAdUser == null) {
            this.showLiveForIntlAdUser = ShowLiveForIntlAdUser.new_();
        }
        if (this.intlChatRequest == null) {
            this.intlChatRequest = IntlChatRequest.new_();
        }
        if (this.graduateActivity == null) {
            this.graduateActivity = GraduateActivity.new_();
        }
        if (this.userBanAppealSwitch == null) {
            this.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.defaultEnum();
        }
        if (this.appUpdateVersionData == null) {
            this.appUpdateVersionData = AppUpdateVersionData.new_();
        }
        if (this.schoolVerificationAgeRange == null) {
            this.schoolVerificationAgeRange = SchoolVerificationAgeRange.new_();
        }
        if (this.keepConnection == null) {
            this.keepConnection = KeepConnection.new_();
        }
        if (this.userScrapeReporting == null) {
            this.userScrapeReporting = UserScrapeReporting.new_();
        }
        if (this.seeMatchThenPay == null) {
            this.seeMatchThenPay = SeeMatchThenPay.new_();
        }
        if (this.anonymityImg == null) {
            this.anonymityImg = AnonymityImg.new_();
        }
        if (this.intlLetterContent == null) {
            this.intlLetterContent = LetterMultilingual.new_();
        }
        if (this.profileUpgradeInputOrder == null) {
            this.profileUpgradeInputOrder = ProfileUpgradeInputOrder.new_();
        }
        if (this.guideText == null) {
            this.guideText = ProfileUpgradeGuideText.new_();
        }
        if (this.profileUpgradeInterest == null) {
            this.profileUpgradeInterest = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
