package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.InactivateReason;
import com.p000p1.mobile.putong.core.data.ProfileBasicTag;
import com.p000p1.mobile.putong.core.data.ProfileUpgradeInterest;
import com.p000p1.mobile.putong.core.data.RateAlertSetting;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
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

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
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
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
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
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
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
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public ThirdPartySticker thirdPartySticker;

    @NonNull
    @ProtobufIndex(index = 18)
    public UserBanAppealSwitch userBanAppealSwitch;

    @NonNull
    @ProtobufIndex(index = 22)
    public UserScrapeReporting userScrapeReporting;
    public static ProtobufAdapter<CoreAssetsSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreAssetsSettings>() { // from class: com.p1.mobile.putong.core.data.CoreAssetsSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreAssetsSettings coreAssetsSettings) {
            List<InactivateReason> list = coreAssetsSettings.inactivateReason;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, InactivateReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.b(2, coreAssetsSettings.closeAct2GoodAll);
            PromptLimit promptLimit = coreAssetsSettings.prompt;
            if (promptLimit != null) {
                iL += CodedOutputByteBufferNano.l(3, promptLimit, PromptLimit.PROTOBUF_ADAPTER);
            }
            int iJ = iL + CodedOutputByteBufferNano.j(4, coreAssetsSettings.counterPollingSeconds);
            MissMatch missMatch = coreAssetsSettings.missMatch;
            if (missMatch != null) {
                iJ += CodedOutputByteBufferNano.l(5, missMatch, MissMatch.PROTOBUF_ADAPTER);
            }
            SpecialCard specialCard = coreAssetsSettings.specialCard;
            if (specialCard != null) {
                iJ += CodedOutputByteBufferNano.l(6, specialCard, SpecialCard.PROTOBUF_ADAPTER);
            }
            ChatEffect chatEffect = coreAssetsSettings.chatEffect;
            if (chatEffect != null) {
                iJ += CodedOutputByteBufferNano.l(7, chatEffect, ChatEffect.PROTOBUF_ADAPTER);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(8, coreAssetsSettings.forcePhoneBind) + CodedOutputByteBufferNano.d(9, coreAssetsSettings.forcePhoneBindTime);
            ThirdPartySticker thirdPartySticker = coreAssetsSettings.thirdPartySticker;
            if (thirdPartySticker != null) {
                iB += CodedOutputByteBufferNano.l(10, thirdPartySticker, ThirdPartySticker.PROTOBUF_ADAPTER);
            }
            int iH = iB + CodedOutputByteBufferNano.h(11, coreAssetsSettings.enableVoiceCall);
            LetterMultilingual letterMultilingual = coreAssetsSettings.letterContent;
            if (letterMultilingual != null) {
                iH += CodedOutputByteBufferNano.l(12, letterMultilingual, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            ShowLiveForIntlAdUser showLiveForIntlAdUser = coreAssetsSettings.showLiveForIntlAdUser;
            if (showLiveForIntlAdUser != null) {
                iH += CodedOutputByteBufferNano.l(13, showLiveForIntlAdUser, ShowLiveForIntlAdUser.PROTOBUF_ADAPTER);
            }
            IntlChatRequest intlChatRequest = coreAssetsSettings.intlChatRequest;
            if (intlChatRequest != null) {
                iH += CodedOutputByteBufferNano.l(14, intlChatRequest, IntlChatRequest.PROTOBUF_ADAPTER);
            }
            GraduateActivity graduateActivity = coreAssetsSettings.graduateActivity;
            if (graduateActivity != null) {
                iH += CodedOutputByteBufferNano.l(15, graduateActivity, GraduateActivity.PROTOBUF_ADAPTER);
            }
            int iB2 = iH + CodedOutputByteBufferNano.b(16, coreAssetsSettings.autoReadConversation);
            List<RateAlertSetting> list2 = coreAssetsSettings.rateAlertSetting;
            if (list2 != null) {
                iB2 += CodedOutputByteBufferNano.l(17, list2, RateAlertSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UserBanAppealSwitch userBanAppealSwitch = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch != null) {
                iB2 += CodedOutputByteBufferNano.h(18, userBanAppealSwitch.ordinal());
            }
            AppUpdateVersionData appUpdateVersionData = coreAssetsSettings.appUpdateVersionData;
            if (appUpdateVersionData != null) {
                iB2 += CodedOutputByteBufferNano.l(19, appUpdateVersionData, AppUpdateVersionData.PROTOBUF_ADAPTER);
            }
            SchoolVerificationAgeRange schoolVerificationAgeRange = coreAssetsSettings.schoolVerificationAgeRange;
            if (schoolVerificationAgeRange != null) {
                iB2 += CodedOutputByteBufferNano.l(20, schoolVerificationAgeRange, SchoolVerificationAgeRange.PROTOBUF_ADAPTER);
            }
            KeepConnection keepConnection = coreAssetsSettings.keepConnection;
            if (keepConnection != null) {
                iB2 += CodedOutputByteBufferNano.l(21, keepConnection, KeepConnection.PROTOBUF_ADAPTER);
            }
            UserScrapeReporting userScrapeReporting = coreAssetsSettings.userScrapeReporting;
            if (userScrapeReporting != null) {
                iB2 += CodedOutputByteBufferNano.l(22, userScrapeReporting, UserScrapeReporting.PROTOBUF_ADAPTER);
            }
            LowPriceFirstMonth lowPriceFirstMonth = coreAssetsSettings.lowPriceFirstMonth;
            if (lowPriceFirstMonth != null) {
                iB2 += CodedOutputByteBufferNano.l(23, lowPriceFirstMonth, LowPriceFirstMonth.PROTOBUF_ADAPTER);
            }
            SeeMatchThenPay seeMatchThenPay = coreAssetsSettings.seeMatchThenPay;
            if (seeMatchThenPay != null) {
                iB2 += CodedOutputByteBufferNano.l(24, seeMatchThenPay, SeeMatchThenPay.PROTOBUF_ADAPTER);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(25, coreAssetsSettings.autoPayEnable) + CodedOutputByteBufferNano.h(26, coreAssetsSettings.seeSwipeCountInOneSession);
            List<ProfileBasicTag> list3 = coreAssetsSettings.profileBasicHobbyTags;
            if (list3 != null) {
                iB3 += CodedOutputByteBufferNano.l(27, list3, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list4 = coreAssetsSettings.profileBasicRecentTags;
            if (list4 != null) {
                iB3 += CodedOutputByteBufferNano.l(28, list4, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list5 = coreAssetsSettings.profileBasicTogetherTags;
            if (list5 != null) {
                iB3 += CodedOutputByteBufferNano.l(29, list5, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AnonymityImg anonymityImg = coreAssetsSettings.anonymityImg;
            if (anonymityImg != null) {
                iB3 += CodedOutputByteBufferNano.l(30, anonymityImg, AnonymityImg.PROTOBUF_ADAPTER);
            }
            int iB4 = iB3 + CodedOutputByteBufferNano.b(31, coreAssetsSettings.chatGuideExp);
            LetterMultilingual letterMultilingual2 = coreAssetsSettings.intlLetterContent;
            if (letterMultilingual2 != null) {
                iB4 += CodedOutputByteBufferNano.l(32, letterMultilingual2, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            AutoRenewalBenefit autoRenewalBenefit = coreAssetsSettings.autoRenewalBenefit;
            if (autoRenewalBenefit != null) {
                iB4 += CodedOutputByteBufferNano.l(33, autoRenewalBenefit, AutoRenewalBenefit.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeInputOrder profileUpgradeInputOrder = coreAssetsSettings.profileUpgradeInputOrder;
            if (profileUpgradeInputOrder != null) {
                iB4 += CodedOutputByteBufferNano.l(34, profileUpgradeInputOrder, ProfileUpgradeInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeGuideText profileUpgradeGuideText = coreAssetsSettings.guideText;
            if (profileUpgradeGuideText != null) {
                iB4 += CodedOutputByteBufferNano.l(35, profileUpgradeGuideText, ProfileUpgradeGuideText.PROTOBUF_ADAPTER);
            }
            List<ProfileUpgradeInterest> list6 = coreAssetsSettings.profileUpgradeInterest;
            if (list6 != null) {
                iB4 += CodedOutputByteBufferNano.l(36, list6, ProfileUpgradeInterest.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iB4 + CodedOutputByteBufferNano.h(37, coreAssetsSettings.chatOnlineDuration);
            UserBanAppealSwitch userBanAppealSwitch2 = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch2 != null) {
                iH2 += CodedOutputByteBufferNano.l(38, userBanAppealSwitch2, UserBanAppealSwitch.PROTOBUF_ADAPTER);
            }
            ((MessageNano) coreAssetsSettings).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreAssetsSettings m12449parse(nb5 nb5Var) throws IOException {
            CoreAssetsSettings coreAssetsSettings = new CoreAssetsSettings();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (coreAssetsSettings.userBanAppealSwitch == null && numValueOf != null) {
                            coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        coreAssetsSettings.inactivateReason = (List) nb5Var.l(InactivateReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 16:
                        coreAssetsSettings.closeAct2GoodAll = nb5Var.g();
                        continue;
                    case 26:
                        coreAssetsSettings.prompt = (PromptLimit) nb5Var.l(PromptLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        coreAssetsSettings.counterPollingSeconds = nb5Var.k();
                        continue;
                    case 42:
                        coreAssetsSettings.missMatch = (MissMatch) nb5Var.l(MissMatch.PROTOBUF_ADAPTER);
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        coreAssetsSettings.specialCard = (SpecialCard) nb5Var.l(SpecialCard.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        coreAssetsSettings.chatEffect = (ChatEffect) nb5Var.l(ChatEffect.PROTOBUF_ADAPTER);
                        continue;
                    case 64:
                        coreAssetsSettings.forcePhoneBind = nb5Var.g();
                        continue;
                    case 73:
                        coreAssetsSettings.forcePhoneBindTime = nb5Var.h();
                        continue;
                    case 82:
                        coreAssetsSettings.thirdPartySticker = (ThirdPartySticker) nb5Var.l(ThirdPartySticker.PROTOBUF_ADAPTER);
                        continue;
                    case 88:
                        coreAssetsSettings.enableVoiceCall = nb5Var.j();
                        continue;
                    case 98:
                        coreAssetsSettings.letterContent = (LetterMultilingual) nb5Var.l(LetterMultilingual.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        coreAssetsSettings.showLiveForIntlAdUser = (ShowLiveForIntlAdUser) nb5Var.l(ShowLiveForIntlAdUser.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        coreAssetsSettings.intlChatRequest = (IntlChatRequest) nb5Var.l(IntlChatRequest.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        coreAssetsSettings.graduateActivity = (GraduateActivity) nb5Var.l(GraduateActivity.PROTOBUF_ADAPTER);
                        continue;
                    case 128:
                        coreAssetsSettings.autoReadConversation = nb5Var.g();
                        continue;
                    case 138:
                        coreAssetsSettings.rateAlertSetting = (List) nb5Var.l(RateAlertSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 144:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 154:
                        coreAssetsSettings.appUpdateVersionData = (AppUpdateVersionData) nb5Var.l(AppUpdateVersionData.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        coreAssetsSettings.schoolVerificationAgeRange = (SchoolVerificationAgeRange) nb5Var.l(SchoolVerificationAgeRange.PROTOBUF_ADAPTER);
                        continue;
                    case 170:
                        coreAssetsSettings.keepConnection = (KeepConnection) nb5Var.l(KeepConnection.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        coreAssetsSettings.userScrapeReporting = (UserScrapeReporting) nb5Var.l(UserScrapeReporting.PROTOBUF_ADAPTER);
                        continue;
                    case 186:
                        coreAssetsSettings.lowPriceFirstMonth = (LowPriceFirstMonth) nb5Var.l(LowPriceFirstMonth.PROTOBUF_ADAPTER);
                        continue;
                    case 194:
                        coreAssetsSettings.seeMatchThenPay = (SeeMatchThenPay) nb5Var.l(SeeMatchThenPay.PROTOBUF_ADAPTER);
                        continue;
                    case 200:
                        coreAssetsSettings.autoPayEnable = nb5Var.g();
                        continue;
                    case 208:
                        coreAssetsSettings.seeSwipeCountInOneSession = nb5Var.j();
                        continue;
                    case 218:
                        coreAssetsSettings.profileBasicHobbyTags = (List) nb5Var.l(ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 226:
                        coreAssetsSettings.profileBasicRecentTags = (List) nb5Var.l(ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 234:
                        coreAssetsSettings.profileBasicTogetherTags = (List) nb5Var.l(ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 242:
                        coreAssetsSettings.anonymityImg = (AnonymityImg) nb5Var.l(AnonymityImg.PROTOBUF_ADAPTER);
                        continue;
                    case 248:
                        coreAssetsSettings.chatGuideExp = nb5Var.g();
                        continue;
                    case 258:
                        coreAssetsSettings.intlLetterContent = (LetterMultilingual) nb5Var.l(LetterMultilingual.PROTOBUF_ADAPTER);
                        continue;
                    case 266:
                        coreAssetsSettings.autoRenewalBenefit = (AutoRenewalBenefit) nb5Var.l(AutoRenewalBenefit.PROTOBUF_ADAPTER);
                        continue;
                    case 274:
                        coreAssetsSettings.profileUpgradeInputOrder = (ProfileUpgradeInputOrder) nb5Var.l(ProfileUpgradeInputOrder.PROTOBUF_ADAPTER);
                        continue;
                    case 282:
                        coreAssetsSettings.guideText = (ProfileUpgradeGuideText) nb5Var.l(ProfileUpgradeGuideText.PROTOBUF_ADAPTER);
                        continue;
                    case 290:
                        coreAssetsSettings.profileUpgradeInterest = (List) nb5Var.l(ProfileUpgradeInterest.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 296:
                        coreAssetsSettings.chatOnlineDuration = nb5Var.j();
                        continue;
                    case 306:
                        coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) nb5Var.l(UserBanAppealSwitch.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (coreAssetsSettings.userBanAppealSwitch == null && numValueOf != null) {
                            coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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

        public void serialize(CoreAssetsSettings coreAssetsSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<InactivateReason> list = coreAssetsSettings.inactivateReason;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, InactivateReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(2, coreAssetsSettings.closeAct2GoodAll);
            PromptLimit promptLimit = coreAssetsSettings.prompt;
            if (promptLimit != null) {
                codedOutputByteBufferNano.K(3, promptLimit, PromptLimit.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(4, coreAssetsSettings.counterPollingSeconds);
            MissMatch missMatch = coreAssetsSettings.missMatch;
            if (missMatch != null) {
                codedOutputByteBufferNano.K(5, missMatch, MissMatch.PROTOBUF_ADAPTER);
            }
            SpecialCard specialCard = coreAssetsSettings.specialCard;
            if (specialCard != null) {
                codedOutputByteBufferNano.K(6, specialCard, SpecialCard.PROTOBUF_ADAPTER);
            }
            ChatEffect chatEffect = coreAssetsSettings.chatEffect;
            if (chatEffect != null) {
                codedOutputByteBufferNano.K(7, chatEffect, ChatEffect.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(8, coreAssetsSettings.forcePhoneBind);
            codedOutputByteBufferNano.C(9, coreAssetsSettings.forcePhoneBindTime);
            ThirdPartySticker thirdPartySticker = coreAssetsSettings.thirdPartySticker;
            if (thirdPartySticker != null) {
                codedOutputByteBufferNano.K(10, thirdPartySticker, ThirdPartySticker.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(11, coreAssetsSettings.enableVoiceCall);
            LetterMultilingual letterMultilingual = coreAssetsSettings.letterContent;
            if (letterMultilingual != null) {
                codedOutputByteBufferNano.K(12, letterMultilingual, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            ShowLiveForIntlAdUser showLiveForIntlAdUser = coreAssetsSettings.showLiveForIntlAdUser;
            if (showLiveForIntlAdUser != null) {
                codedOutputByteBufferNano.K(13, showLiveForIntlAdUser, ShowLiveForIntlAdUser.PROTOBUF_ADAPTER);
            }
            IntlChatRequest intlChatRequest = coreAssetsSettings.intlChatRequest;
            if (intlChatRequest != null) {
                codedOutputByteBufferNano.K(14, intlChatRequest, IntlChatRequest.PROTOBUF_ADAPTER);
            }
            GraduateActivity graduateActivity = coreAssetsSettings.graduateActivity;
            if (graduateActivity != null) {
                codedOutputByteBufferNano.K(15, graduateActivity, GraduateActivity.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(16, coreAssetsSettings.autoReadConversation);
            List<RateAlertSetting> list2 = coreAssetsSettings.rateAlertSetting;
            if (list2 != null) {
                codedOutputByteBufferNano.K(17, list2, RateAlertSetting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UserBanAppealSwitch userBanAppealSwitch = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch != null) {
                codedOutputByteBufferNano.G(18, userBanAppealSwitch.ordinal());
            }
            AppUpdateVersionData appUpdateVersionData = coreAssetsSettings.appUpdateVersionData;
            if (appUpdateVersionData != null) {
                codedOutputByteBufferNano.K(19, appUpdateVersionData, AppUpdateVersionData.PROTOBUF_ADAPTER);
            }
            SchoolVerificationAgeRange schoolVerificationAgeRange = coreAssetsSettings.schoolVerificationAgeRange;
            if (schoolVerificationAgeRange != null) {
                codedOutputByteBufferNano.K(20, schoolVerificationAgeRange, SchoolVerificationAgeRange.PROTOBUF_ADAPTER);
            }
            KeepConnection keepConnection = coreAssetsSettings.keepConnection;
            if (keepConnection != null) {
                codedOutputByteBufferNano.K(21, keepConnection, KeepConnection.PROTOBUF_ADAPTER);
            }
            UserScrapeReporting userScrapeReporting = coreAssetsSettings.userScrapeReporting;
            if (userScrapeReporting != null) {
                codedOutputByteBufferNano.K(22, userScrapeReporting, UserScrapeReporting.PROTOBUF_ADAPTER);
            }
            LowPriceFirstMonth lowPriceFirstMonth = coreAssetsSettings.lowPriceFirstMonth;
            if (lowPriceFirstMonth != null) {
                codedOutputByteBufferNano.K(23, lowPriceFirstMonth, LowPriceFirstMonth.PROTOBUF_ADAPTER);
            }
            SeeMatchThenPay seeMatchThenPay = coreAssetsSettings.seeMatchThenPay;
            if (seeMatchThenPay != null) {
                codedOutputByteBufferNano.K(24, seeMatchThenPay, SeeMatchThenPay.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(25, coreAssetsSettings.autoPayEnable);
            codedOutputByteBufferNano.G(26, coreAssetsSettings.seeSwipeCountInOneSession);
            List<ProfileBasicTag> list3 = coreAssetsSettings.profileBasicHobbyTags;
            if (list3 != null) {
                codedOutputByteBufferNano.K(27, list3, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list4 = coreAssetsSettings.profileBasicRecentTags;
            if (list4 != null) {
                codedOutputByteBufferNano.K(28, list4, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ProfileBasicTag> list5 = coreAssetsSettings.profileBasicTogetherTags;
            if (list5 != null) {
                codedOutputByteBufferNano.K(29, list5, ProfileBasicTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AnonymityImg anonymityImg = coreAssetsSettings.anonymityImg;
            if (anonymityImg != null) {
                codedOutputByteBufferNano.K(30, anonymityImg, AnonymityImg.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(31, coreAssetsSettings.chatGuideExp);
            LetterMultilingual letterMultilingual2 = coreAssetsSettings.intlLetterContent;
            if (letterMultilingual2 != null) {
                codedOutputByteBufferNano.K(32, letterMultilingual2, LetterMultilingual.PROTOBUF_ADAPTER);
            }
            AutoRenewalBenefit autoRenewalBenefit = coreAssetsSettings.autoRenewalBenefit;
            if (autoRenewalBenefit != null) {
                codedOutputByteBufferNano.K(33, autoRenewalBenefit, AutoRenewalBenefit.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeInputOrder profileUpgradeInputOrder = coreAssetsSettings.profileUpgradeInputOrder;
            if (profileUpgradeInputOrder != null) {
                codedOutputByteBufferNano.K(34, profileUpgradeInputOrder, ProfileUpgradeInputOrder.PROTOBUF_ADAPTER);
            }
            ProfileUpgradeGuideText profileUpgradeGuideText = coreAssetsSettings.guideText;
            if (profileUpgradeGuideText != null) {
                codedOutputByteBufferNano.K(35, profileUpgradeGuideText, ProfileUpgradeGuideText.PROTOBUF_ADAPTER);
            }
            List<ProfileUpgradeInterest> list6 = coreAssetsSettings.profileUpgradeInterest;
            if (list6 != null) {
                codedOutputByteBufferNano.K(36, list6, ProfileUpgradeInterest.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(37, coreAssetsSettings.chatOnlineDuration);
            UserBanAppealSwitch userBanAppealSwitch2 = coreAssetsSettings.userBanAppealSwitch;
            if (userBanAppealSwitch2 != null) {
                codedOutputByteBufferNano.K(38, userBanAppealSwitch2, UserBanAppealSwitch.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CoreAssetsSettings> JSON_ADAPTER = new ObjectJsonAdapter<CoreAssetsSettings>() { // from class: com.p1.mobile.putong.core.data.CoreAssetsSettings.2
        public Class getDataClass() {
            return CoreAssetsSettings.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreAssetsSettings m12450newInstance() {
            return new CoreAssetsSettings();
        }

        public boolean parseField(CoreAssetsSettings coreAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guideText":
                    coreAssetsSettings.guideText = (ProfileUpgradeGuideText) ProfileUpgradeGuideText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatEffect":
                    coreAssetsSettings.chatEffect = (ChatEffect) ChatEffect.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "forcePhoneBindTime":
                    coreAssetsSettings.forcePhoneBindTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "userBanAppealSwitch":
                    coreAssetsSettings.userBanAppealSwitch = (UserBanAppealSwitch) UserBanAppealSwitch.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "appUpdateVersionData":
                    coreAssetsSettings.appUpdateVersionData = (AppUpdateVersionData) AppUpdateVersionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileBasicTogetherTags":
                    coreAssetsSettings.profileBasicTogetherTags = JsonAdapter.parseArray(jsonParser, ProfileBasicTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "seeMatchThenPay":
                    coreAssetsSettings.seeMatchThenPay = (SeeMatchThenPay) SeeMatchThenPay.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "thirdPartySticker":
                    coreAssetsSettings.thirdPartySticker = (ThirdPartySticker) ThirdPartySticker.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileBasicRecentTags":
                    coreAssetsSettings.profileBasicRecentTags = JsonAdapter.parseArray(jsonParser, ProfileBasicTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "schoolVerificationAgeRange":
                    coreAssetsSettings.schoolVerificationAgeRange = (SchoolVerificationAgeRange) SchoolVerificationAgeRange.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "prompt":
                    coreAssetsSettings.prompt = (PromptLimit) PromptLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "inactivateReason":
                    coreAssetsSettings.inactivateReason = JsonAdapter.parseArray(jsonParser, InactivateReason.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "specialCard":
                    coreAssetsSettings.specialCard = (SpecialCard) SpecialCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "anonymityImg":
                    coreAssetsSettings.anonymityImg = (AnonymityImg) AnonymityImg.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "autoRenewalBenefit":
                    coreAssetsSettings.autoRenewalBenefit = (AutoRenewalBenefit) AutoRenewalBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatGuideExp":
                    coreAssetsSettings.chatGuideExp = jsonParser.getValueAsBoolean();
                    return true;
                case "counterPollingSeconds":
                    coreAssetsSettings.counterPollingSeconds = jsonParser.getValueAsLong();
                    return true;
                case "keepConnection":
                    coreAssetsSettings.keepConnection = (KeepConnection) KeepConnection.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileUpgradeInterest":
                    coreAssetsSettings.profileUpgradeInterest = JsonAdapter.parseArray(jsonParser, ProfileUpgradeInterest.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "forcePhoneBind":
                    coreAssetsSettings.forcePhoneBind = jsonParser.getValueAsBoolean();
                    return true;
                case "rateAlertSetting":
                    coreAssetsSettings.rateAlertSetting = JsonAdapter.parseArray(jsonParser, RateAlertSetting.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "profileUpgradeInputOrder":
                    coreAssetsSettings.profileUpgradeInputOrder = (ProfileUpgradeInputOrder) ProfileUpgradeInputOrder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userScrapeReporting":
                    coreAssetsSettings.userScrapeReporting = (UserScrapeReporting) UserScrapeReporting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileBasicHobbyTags":
                    coreAssetsSettings.profileBasicHobbyTags = JsonAdapter.parseArray(jsonParser, ProfileBasicTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "letterContent":
                    coreAssetsSettings.letterContent = (LetterMultilingual) LetterMultilingual.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "enableVoiceCall":
                    coreAssetsSettings.enableVoiceCall = jsonParser.getValueAsInt();
                    return true;
                case "graduateActivity":
                    coreAssetsSettings.graduateActivity = (GraduateActivity) GraduateActivity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "missMatch":
                    coreAssetsSettings.missMatch = (MissMatch) MissMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "seeSwipeCountInOneSession":
                    coreAssetsSettings.seeSwipeCountInOneSession = jsonParser.getValueAsInt();
                    return true;
                case "intlChatRequest":
                    coreAssetsSettings.intlChatRequest = (IntlChatRequest) IntlChatRequest.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showLiveForIntlAdUser":
                    coreAssetsSettings.showLiveForIntlAdUser = (ShowLiveForIntlAdUser) ShowLiveForIntlAdUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "intlLetterContent":
                    coreAssetsSettings.intlLetterContent = (LetterMultilingual) LetterMultilingual.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "lowPriceFirstMonth":
                    coreAssetsSettings.lowPriceFirstMonth = (LowPriceFirstMonth) LowPriceFirstMonth.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "autoPayEnable":
                    coreAssetsSettings.autoPayEnable = jsonParser.getValueAsBoolean();
                    return true;
                case "autoReadConversation":
                    coreAssetsSettings.autoReadConversation = jsonParser.getValueAsBoolean();
                    return true;
                case "close_act2good_all":
                    coreAssetsSettings.closeAct2GoodAll = jsonParser.getValueAsBoolean();
                    return true;
                case "chatOnlineDuration":
                    coreAssetsSettings.chatOnlineDuration = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreAssetsSettings coreAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "guideText":
                case "chatEffect":
                case "forcePhoneBindTime":
                case "userBanAppealSwitch":
                case "appUpdateVersionData":
                case "profileBasicTogetherTags":
                case "seeMatchThenPay":
                case "thirdPartySticker":
                case "profileBasicRecentTags":
                case "schoolVerificationAgeRange":
                case "prompt":
                case "inactivateReason":
                case "specialCard":
                case "anonymityImg":
                case "autoRenewalBenefit":
                case "chatGuideExp":
                case "counterPollingSeconds":
                case "keepConnection":
                case "profileUpgradeInterest":
                case "forcePhoneBind":
                case "rateAlertSetting":
                case "profileUpgradeInputOrder":
                case "userScrapeReporting":
                case "profileBasicHobbyTags":
                case "letterContent":
                case "enableVoiceCall":
                case "graduateActivity":
                case "missMatch":
                case "seeSwipeCountInOneSession":
                case "intlChatRequest":
                case "showLiveForIntlAdUser":
                case "intlLetterContent":
                case "lowPriceFirstMonth":
                case "autoPayEnable":
                case "autoReadConversation":
                case "close_act2good_all":
                case "chatOnlineDuration":
                    return true;
                default:
                    return super.parseFieldCheck(coreAssetsSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreAssetsSettings new_() {
        CoreAssetsSettings coreAssetsSettings = new CoreAssetsSettings();
        coreAssetsSettings.nullCheck();
        return coreAssetsSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreAssetsSettings m12448clone() {
        CoreAssetsSettings coreAssetsSettings = new CoreAssetsSettings();
        List<InactivateReason> list = this.inactivateReason;
        if (list != null) {
            coreAssetsSettings.inactivateReason = ValueObject.util_map(list, new w9j() { // from class: l.ex6
                public final Object call(Object obj) {
                    return ((InactivateReason) obj).m13448clone();
                }
            });
        }
        coreAssetsSettings.closeAct2GoodAll = this.closeAct2GoodAll;
        PromptLimit promptLimit = this.prompt;
        if (promptLimit != null) {
            coreAssetsSettings.prompt = promptLimit.m15062clone();
        }
        coreAssetsSettings.counterPollingSeconds = this.counterPollingSeconds;
        MissMatch missMatch = this.missMatch;
        if (missMatch != null) {
            coreAssetsSettings.missMatch = missMatch.m14326clone();
        }
        SpecialCard specialCard = this.specialCard;
        if (specialCard != null) {
            coreAssetsSettings.specialCard = specialCard.m15691clone();
        }
        ChatEffect chatEffect = this.chatEffect;
        if (chatEffect != null) {
            coreAssetsSettings.chatEffect = chatEffect.m11998clone();
        }
        coreAssetsSettings.forcePhoneBind = this.forcePhoneBind;
        coreAssetsSettings.forcePhoneBindTime = this.forcePhoneBindTime;
        ThirdPartySticker thirdPartySticker = this.thirdPartySticker;
        if (thirdPartySticker != null) {
            coreAssetsSettings.thirdPartySticker = thirdPartySticker.m15981clone();
        }
        coreAssetsSettings.enableVoiceCall = this.enableVoiceCall;
        LetterMultilingual letterMultilingual = this.letterContent;
        if (letterMultilingual != null) {
            coreAssetsSettings.letterContent = letterMultilingual.m13832clone();
        }
        ShowLiveForIntlAdUser showLiveForIntlAdUser = this.showLiveForIntlAdUser;
        if (showLiveForIntlAdUser != null) {
            coreAssetsSettings.showLiveForIntlAdUser = showLiveForIntlAdUser.m15604clone();
        }
        IntlChatRequest intlChatRequest = this.intlChatRequest;
        if (intlChatRequest != null) {
            coreAssetsSettings.intlChatRequest = intlChatRequest.m13526clone();
        }
        GraduateActivity graduateActivity = this.graduateActivity;
        if (graduateActivity != null) {
            coreAssetsSettings.graduateActivity = graduateActivity.m13000clone();
        }
        coreAssetsSettings.autoReadConversation = this.autoReadConversation;
        List<RateAlertSetting> list2 = this.rateAlertSetting;
        if (list2 != null) {
            coreAssetsSettings.rateAlertSetting = ValueObject.util_map(list2, new w9j() { // from class: l.fx6
                public final Object call(Object obj) {
                    return ((RateAlertSetting) obj).m15220clone();
                }
            });
        }
        coreAssetsSettings.userBanAppealSwitch = this.userBanAppealSwitch;
        AppUpdateVersionData appUpdateVersionData = this.appUpdateVersionData;
        if (appUpdateVersionData != null) {
            coreAssetsSettings.appUpdateVersionData = appUpdateVersionData.m11636clone();
        }
        SchoolVerificationAgeRange schoolVerificationAgeRange = this.schoolVerificationAgeRange;
        if (schoolVerificationAgeRange != null) {
            coreAssetsSettings.schoolVerificationAgeRange = schoolVerificationAgeRange.m15486clone();
        }
        KeepConnection keepConnection = this.keepConnection;
        if (keepConnection != null) {
            coreAssetsSettings.keepConnection = keepConnection.m13776clone();
        }
        UserScrapeReporting userScrapeReporting = this.userScrapeReporting;
        if (userScrapeReporting != null) {
            coreAssetsSettings.userScrapeReporting = userScrapeReporting.m16171clone();
        }
        LowPriceFirstMonth lowPriceFirstMonth = this.lowPriceFirstMonth;
        if (lowPriceFirstMonth != null) {
            coreAssetsSettings.lowPriceFirstMonth = lowPriceFirstMonth.m14028clone();
        }
        SeeMatchThenPay seeMatchThenPay = this.seeMatchThenPay;
        if (seeMatchThenPay != null) {
            coreAssetsSettings.seeMatchThenPay = seeMatchThenPay.m15522clone();
        }
        coreAssetsSettings.autoPayEnable = this.autoPayEnable;
        coreAssetsSettings.seeSwipeCountInOneSession = this.seeSwipeCountInOneSession;
        List<ProfileBasicTag> list3 = this.profileBasicHobbyTags;
        if (list3 != null) {
            coreAssetsSettings.profileBasicHobbyTags = ValueObject.util_map(list3, new w9j() { // from class: l.gx6
                public final Object call(Object obj) {
                    return ((ProfileBasicTag) obj).m14912clone();
                }
            });
        }
        List<ProfileBasicTag> list4 = this.profileBasicRecentTags;
        if (list4 != null) {
            coreAssetsSettings.profileBasicRecentTags = ValueObject.util_map(list4, new w9j() { // from class: l.hx6
                public final Object call(Object obj) {
                    return ((ProfileBasicTag) obj).m14912clone();
                }
            });
        }
        List<ProfileBasicTag> list5 = this.profileBasicTogetherTags;
        if (list5 != null) {
            coreAssetsSettings.profileBasicTogetherTags = ValueObject.util_map(list5, new w9j() { // from class: l.ix6
                public final Object call(Object obj) {
                    return ((ProfileBasicTag) obj).m14912clone();
                }
            });
        }
        AnonymityImg anonymityImg = this.anonymityImg;
        if (anonymityImg != null) {
            coreAssetsSettings.anonymityImg = anonymityImg.m11628clone();
        }
        coreAssetsSettings.chatGuideExp = this.chatGuideExp;
        LetterMultilingual letterMultilingual2 = this.intlLetterContent;
        if (letterMultilingual2 != null) {
            coreAssetsSettings.intlLetterContent = letterMultilingual2.m13832clone();
        }
        AutoRenewalBenefit autoRenewalBenefit = this.autoRenewalBenefit;
        if (autoRenewalBenefit != null) {
            coreAssetsSettings.autoRenewalBenefit = autoRenewalBenefit.m11674clone();
        }
        ProfileUpgradeInputOrder profileUpgradeInputOrder = this.profileUpgradeInputOrder;
        if (profileUpgradeInputOrder != null) {
            coreAssetsSettings.profileUpgradeInputOrder = profileUpgradeInputOrder.m15036clone();
        }
        ProfileUpgradeGuideText profileUpgradeGuideText = this.guideText;
        if (profileUpgradeGuideText != null) {
            coreAssetsSettings.guideText = profileUpgradeGuideText.m15032clone();
        }
        List<ProfileUpgradeInterest> list6 = this.profileUpgradeInterest;
        if (list6 != null) {
            coreAssetsSettings.profileUpgradeInterest = ValueObject.util_map(list6, new w9j() { // from class: l.jx6
                public final Object call(Object obj) {
                    return ((ProfileUpgradeInterest) obj).m15040clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode27;
        return iHashCode27;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
