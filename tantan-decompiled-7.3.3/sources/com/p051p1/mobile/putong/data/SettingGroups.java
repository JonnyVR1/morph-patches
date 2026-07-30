package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Decoration;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class SettingGroups extends ValueObject<SettingGroups> implements Cloneable, Serializable {
    public static final String TYPE = "settinggroups";

    @NonNull
    @ProtobufIndex(index = 35)
    public AdsMaterialRouter adsMaterialRouter;

    @NonNull
    @ProtobufIndex(index = 2)
    public UserBoostSettings boost;

    @Nullable
    @ProtobufIndex(index = 20)
    public CharacterEvaluate characterEvaluate;

    @NonNull
    @ProtobufIndex(index = 28)
    public CityC cityC;

    @NonNull
    @ProtobufIndex(index = 19)
    public ComDiamond comDiamond;

    @NonNull
    @ProtobufIndex(index = 18)
    public DecorationSettings decoration;

    @NonNull
    @ProtobufIndex(index = 12)
    @Deprecated
    public DiamondVIPPrivilegeSettings diamondVIP;

    @NonNull
    @ProtobufIndex(index = 13)
    @Deprecated
    public DiamondVIPPrivateMatch diamondVIPPrivateMatch;

    @NonNull
    @ProtobufIndex(index = 8)
    public UserFakeSettings fake;

    @NonNull
    @ProtobufIndex(index = 31)
    public FemaleVip fvip;

    @NonNull
    @ProtobufIndex(index = 36)
    public IntlMoreGender gender;

    @NonNull
    @ProtobufIndex(index = 30)
    public GrowthSettings growth;

    @NonNull
    @ProtobufIndex(index = 3)
    public UserLiveSettings live;

    @NonNull
    @ProtobufIndex(index = 27)
    public MarrySettings marriage;

    @NonNull
    @ProtobufIndex(index = 24)
    public UserMomentSettings moment;

    @NonNull
    @ProtobufIndex(index = 22)
    public MomentLevel momentLevel;

    @Nullable
    @ProtobufIndex(index = 33)
    public NotificationSetting noPush;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 21)
    public Pet pet;

    @NonNull
    @ProtobufIndex(index = 4)
    public UserPrivacySettings privacy;

    @NonNull
    @ProtobufIndex(index = 25)
    public SettingGroupsProfile profile;

    @NonNull
    @ProtobufIndex(index = 5)
    public UserPushSettings push;

    @NonNull
    @ProtobufIndex(index = 26)
    public PlatinumSettings pvip;

    @NonNull
    @ProtobufIndex(index = 15)
    public ChatSetting quickchatchat;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public UserSearchSettings search;

    @Nullable
    @ProtobufIndex(index = 11)
    public SeeSettings see;

    @NonNull
    @ProtobufIndex(index = 17)
    public ShareSetting share;

    @NonNull
    @ProtobufIndex(index = 14)
    public ChatSetting soulchat;

    @NonNull
    @ProtobufIndex(index = 16)
    public SoulMatchGroup soulmate;

    @NonNull
    @ProtobufIndex(index = 29)
    public SpVip spvip;

    @NonNull
    @ProtobufIndex(index = 7)
    public UserSubscriptionSettings subscription;

    @NonNull
    @ProtobufIndex(index = 9)
    public UserSVIPSettings svip;

    @Nullable
    @ProtobufIndex(index = 10)
    public SvipPrivacySettings svipPrivacy;

    @NonNull
    @ProtobufIndex(index = 32)
    public SvipSearch svipSearch;

    @NonNull
    @ProtobufIndex(index = 37)
    public TribeSetting tttribe;

    @Nullable
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 34)
    public UserUpVipSettings upvip;

    @NonNull
    @ProtobufIndex(index = 23)
    public VipSearchSettings vipSearch;
    public static ProtobufAdapter<SettingGroups> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingGroups>() { // from class: com.p1.mobile.putong.data.SettingGroups.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingGroups settingGroups) {
            String str = settingGroups.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            UserBoostSettings userBoostSettings = settingGroups.boost;
            if (userBoostSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, userBoostSettings, UserBoostSettings.PROTOBUF_ADAPTER);
            }
            UserLiveSettings userLiveSettings = settingGroups.live;
            if (userLiveSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, userLiveSettings, UserLiveSettings.PROTOBUF_ADAPTER);
            }
            UserPrivacySettings userPrivacySettings = settingGroups.privacy;
            if (userPrivacySettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, userPrivacySettings, UserPrivacySettings.PROTOBUF_ADAPTER);
            }
            UserPushSettings userPushSettings = settingGroups.push;
            if (userPushSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, userPushSettings, UserPushSettings.PROTOBUF_ADAPTER);
            }
            UserSearchSettings userSearchSettings = settingGroups.search;
            if (userSearchSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, userSearchSettings, UserSearchSettings.PROTOBUF_ADAPTER);
            }
            UserSubscriptionSettings userSubscriptionSettings = settingGroups.subscription;
            if (userSubscriptionSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, userSubscriptionSettings, UserSubscriptionSettings.PROTOBUF_ADAPTER);
            }
            UserFakeSettings userFakeSettings = settingGroups.fake;
            if (userFakeSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(8, userFakeSettings, UserFakeSettings.PROTOBUF_ADAPTER);
            }
            UserSVIPSettings userSVIPSettings = settingGroups.svip;
            if (userSVIPSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(9, userSVIPSettings, UserSVIPSettings.PROTOBUF_ADAPTER);
            }
            SvipPrivacySettings svipPrivacySettings = settingGroups.svipPrivacy;
            if (svipPrivacySettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(10, svipPrivacySettings, SvipPrivacySettings.PROTOBUF_ADAPTER);
            }
            SeeSettings seeSettings = settingGroups.see;
            if (seeSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(11, seeSettings, SeeSettings.PROTOBUF_ADAPTER);
            }
            DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = settingGroups.diamondVIP;
            if (diamondVIPPrivilegeSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(12, diamondVIPPrivilegeSettings, DiamondVIPPrivilegeSettings.PROTOBUF_ADAPTER);
            }
            DiamondVIPPrivateMatch diamondVIPPrivateMatch = settingGroups.diamondVIPPrivateMatch;
            if (diamondVIPPrivateMatch != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(13, diamondVIPPrivateMatch, DiamondVIPPrivateMatch.PROTOBUF_ADAPTER);
            }
            ChatSetting chatSetting = settingGroups.soulchat;
            if (chatSetting != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(14, chatSetting, ChatSetting.PROTOBUF_ADAPTER);
            }
            ChatSetting chatSetting2 = settingGroups.quickchatchat;
            if (chatSetting2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(15, chatSetting2, ChatSetting.PROTOBUF_ADAPTER);
            }
            SoulMatchGroup soulMatchGroup = settingGroups.soulmate;
            if (soulMatchGroup != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(16, soulMatchGroup, SoulMatchGroup.PROTOBUF_ADAPTER);
            }
            ShareSetting shareSetting = settingGroups.share;
            if (shareSetting != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(17, shareSetting, ShareSetting.PROTOBUF_ADAPTER);
            }
            DecorationSettings decorationSettings = settingGroups.decoration;
            if (decorationSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(18, decorationSettings, DecorationSettings.PROTOBUF_ADAPTER);
            }
            ComDiamond comDiamond = settingGroups.comDiamond;
            if (comDiamond != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(19, comDiamond, ComDiamond.PROTOBUF_ADAPTER);
            }
            CharacterEvaluate characterEvaluate = settingGroups.characterEvaluate;
            if (characterEvaluate != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(20, characterEvaluate, CharacterEvaluate.PROTOBUF_ADAPTER);
            }
            Pet pet = settingGroups.pet;
            if (pet != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(21, pet, Pet.PROTOBUF_ADAPTER);
            }
            MomentLevel momentLevel = settingGroups.momentLevel;
            if (momentLevel != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(22, momentLevel, MomentLevel.PROTOBUF_ADAPTER);
            }
            VipSearchSettings vipSearchSettings = settingGroups.vipSearch;
            if (vipSearchSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(23, vipSearchSettings, VipSearchSettings.PROTOBUF_ADAPTER);
            }
            UserMomentSettings userMomentSettings = settingGroups.moment;
            if (userMomentSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(24, userMomentSettings, UserMomentSettings.PROTOBUF_ADAPTER);
            }
            SettingGroupsProfile settingGroupsProfile = settingGroups.profile;
            if (settingGroupsProfile != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(25, settingGroupsProfile, SettingGroupsProfile.PROTOBUF_ADAPTER);
            }
            PlatinumSettings platinumSettings = settingGroups.pvip;
            if (platinumSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(26, platinumSettings, PlatinumSettings.PROTOBUF_ADAPTER);
            }
            MarrySettings marrySettings = settingGroups.marriage;
            if (marrySettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(27, marrySettings, MarrySettings.PROTOBUF_ADAPTER);
            }
            CityC cityC = settingGroups.cityC;
            if (cityC != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(28, cityC, CityC.PROTOBUF_ADAPTER);
            }
            SpVip spVip = settingGroups.spvip;
            if (spVip != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(29, spVip, SpVip.PROTOBUF_ADAPTER);
            }
            GrowthSettings growthSettings = settingGroups.growth;
            if (growthSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(30, growthSettings, GrowthSettings.PROTOBUF_ADAPTER);
            }
            FemaleVip femaleVip = settingGroups.fvip;
            if (femaleVip != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(31, femaleVip, FemaleVip.PROTOBUF_ADAPTER);
            }
            SvipSearch svipSearch = settingGroups.svipSearch;
            if (svipSearch != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(32, svipSearch, SvipSearch.PROTOBUF_ADAPTER);
            }
            NotificationSetting notificationSetting = settingGroups.noPush;
            if (notificationSetting != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(33, notificationSetting, NotificationSetting.PROTOBUF_ADAPTER);
            }
            UserUpVipSettings userUpVipSettings = settingGroups.upvip;
            if (userUpVipSettings != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(34, userUpVipSettings, UserUpVipSettings.PROTOBUF_ADAPTER);
            }
            AdsMaterialRouter adsMaterialRouter = settingGroups.adsMaterialRouter;
            if (adsMaterialRouter != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(35, adsMaterialRouter, AdsMaterialRouter.PROTOBUF_ADAPTER);
            }
            IntlMoreGender intlMoreGender = settingGroups.gender;
            if (intlMoreGender != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(36, intlMoreGender, IntlMoreGender.PROTOBUF_ADAPTER);
            }
            TribeSetting tribeSetting = settingGroups.tttribe;
            if (tribeSetting != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(37, tribeSetting, TribeSetting.PROTOBUF_ADAPTER);
            }
            settingGroups.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingGroups parse(nc5 nc5Var) throws IOException {
            SettingGroups settingGroups = new SettingGroups();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (settingGroups.boost == null) {
                            settingGroups.boost = UserBoostSettings.new_();
                        }
                        if (settingGroups.live == null) {
                            settingGroups.live = UserLiveSettings.new_();
                        }
                        if (settingGroups.privacy == null) {
                            settingGroups.privacy = UserPrivacySettings.new_();
                        }
                        if (settingGroups.push == null) {
                            settingGroups.push = UserPushSettings.new_();
                        }
                        if (settingGroups.search == null) {
                            settingGroups.search = UserSearchSettings.new_();
                        }
                        if (settingGroups.subscription == null) {
                            settingGroups.subscription = UserSubscriptionSettings.new_();
                        }
                        if (settingGroups.fake == null) {
                            settingGroups.fake = UserFakeSettings.new_();
                        }
                        if (settingGroups.svip == null) {
                            settingGroups.svip = UserSVIPSettings.new_();
                        }
                        if (settingGroups.diamondVIP == null) {
                            settingGroups.diamondVIP = DiamondVIPPrivilegeSettings.new_();
                        }
                        if (settingGroups.diamondVIPPrivateMatch == null) {
                            settingGroups.diamondVIPPrivateMatch = DiamondVIPPrivateMatch.new_();
                        }
                        if (settingGroups.soulchat == null) {
                            settingGroups.soulchat = ChatSetting.new_();
                        }
                        if (settingGroups.quickchatchat == null) {
                            settingGroups.quickchatchat = ChatSetting.new_();
                        }
                        if (settingGroups.soulmate == null) {
                            settingGroups.soulmate = SoulMatchGroup.new_();
                        }
                        if (settingGroups.share == null) {
                            settingGroups.share = ShareSetting.new_();
                        }
                        if (settingGroups.decoration == null) {
                            settingGroups.decoration = DecorationSettings.new_();
                        }
                        if (settingGroups.comDiamond == null) {
                            settingGroups.comDiamond = ComDiamond.new_();
                        }
                        if (settingGroups.pet == null) {
                            settingGroups.pet = Pet.new_();
                        }
                        if (settingGroups.momentLevel == null) {
                            settingGroups.momentLevel = MomentLevel.new_();
                        }
                        if (settingGroups.vipSearch == null) {
                            settingGroups.vipSearch = VipSearchSettings.new_();
                        }
                        if (settingGroups.moment == null) {
                            settingGroups.moment = UserMomentSettings.new_();
                        }
                        if (settingGroups.profile == null) {
                            settingGroups.profile = SettingGroupsProfile.new_();
                        }
                        if (settingGroups.pvip == null) {
                            settingGroups.pvip = PlatinumSettings.new_();
                        }
                        if (settingGroups.marriage == null) {
                            settingGroups.marriage = MarrySettings.new_();
                        }
                        if (settingGroups.cityC == null) {
                            settingGroups.cityC = CityC.new_();
                        }
                        if (settingGroups.spvip == null) {
                            settingGroups.spvip = SpVip.new_();
                        }
                        if (settingGroups.growth == null) {
                            settingGroups.growth = GrowthSettings.new_();
                        }
                        if (settingGroups.fvip == null) {
                            settingGroups.fvip = FemaleVip.new_();
                        }
                        if (settingGroups.svipSearch == null) {
                            settingGroups.svipSearch = SvipSearch.new_();
                        }
                        if (settingGroups.adsMaterialRouter == null) {
                            settingGroups.adsMaterialRouter = AdsMaterialRouter.new_();
                        }
                        if (settingGroups.upvip == null) {
                            settingGroups.upvip = UserUpVipSettings.new_();
                        }
                        if (settingGroups.gender == null) {
                            settingGroups.gender = IntlMoreGender.new_();
                        }
                        if (settingGroups.tttribe == null) {
                            settingGroups.tttribe = TribeSetting.new_();
                        }
                        break;
                    case 10:
                        settingGroups.type = nc5Var.m162495s();
                        continue;
                    case 18:
                        settingGroups.boost = (UserBoostSettings) nc5Var.m162488l(UserBoostSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        settingGroups.live = (UserLiveSettings) nc5Var.m162488l(UserLiveSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        settingGroups.privacy = (UserPrivacySettings) nc5Var.m162488l(UserPrivacySettings.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        settingGroups.push = (UserPushSettings) nc5Var.m162488l(UserPushSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        settingGroups.search = (UserSearchSettings) nc5Var.m162488l(UserSearchSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        settingGroups.subscription = (UserSubscriptionSettings) nc5Var.m162488l(UserSubscriptionSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        settingGroups.fake = (UserFakeSettings) nc5Var.m162488l(UserFakeSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        settingGroups.svip = (UserSVIPSettings) nc5Var.m162488l(UserSVIPSettings.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        settingGroups.svipPrivacy = (SvipPrivacySettings) nc5Var.m162488l(SvipPrivacySettings.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        settingGroups.see = (SeeSettings) nc5Var.m162488l(SeeSettings.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        settingGroups.diamondVIP = (DiamondVIPPrivilegeSettings) nc5Var.m162488l(DiamondVIPPrivilegeSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        settingGroups.diamondVIPPrivateMatch = (DiamondVIPPrivateMatch) nc5Var.m162488l(DiamondVIPPrivateMatch.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        settingGroups.soulchat = (ChatSetting) nc5Var.m162488l(ChatSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        settingGroups.quickchatchat = (ChatSetting) nc5Var.m162488l(ChatSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        settingGroups.soulmate = (SoulMatchGroup) nc5Var.m162488l(SoulMatchGroup.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        settingGroups.share = (ShareSetting) nc5Var.m162488l(ShareSetting.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        settingGroups.decoration = (DecorationSettings) nc5Var.m162488l(DecorationSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        settingGroups.comDiamond = (ComDiamond) nc5Var.m162488l(ComDiamond.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        settingGroups.characterEvaluate = (CharacterEvaluate) nc5Var.m162488l(CharacterEvaluate.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        settingGroups.pet = (Pet) nc5Var.m162488l(Pet.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        settingGroups.momentLevel = (MomentLevel) nc5Var.m162488l(MomentLevel.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        settingGroups.vipSearch = (VipSearchSettings) nc5Var.m162488l(VipSearchSettings.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        settingGroups.moment = (UserMomentSettings) nc5Var.m162488l(UserMomentSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        settingGroups.profile = (SettingGroupsProfile) nc5Var.m162488l(SettingGroupsProfile.PROTOBUF_ADAPTER);
                        continue;
                    case 210:
                        settingGroups.pvip = (PlatinumSettings) nc5Var.m162488l(PlatinumSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 218:
                        settingGroups.marriage = (MarrySettings) nc5Var.m162488l(MarrySettings.PROTOBUF_ADAPTER);
                        continue;
                    case 226:
                        settingGroups.cityC = (CityC) nc5Var.m162488l(CityC.PROTOBUF_ADAPTER);
                        continue;
                    case 234:
                        settingGroups.spvip = (SpVip) nc5Var.m162488l(SpVip.PROTOBUF_ADAPTER);
                        continue;
                    case 242:
                        settingGroups.growth = (GrowthSettings) nc5Var.m162488l(GrowthSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 250:
                        settingGroups.fvip = (FemaleVip) nc5Var.m162488l(FemaleVip.PROTOBUF_ADAPTER);
                        continue;
                    case 258:
                        settingGroups.svipSearch = (SvipSearch) nc5Var.m162488l(SvipSearch.PROTOBUF_ADAPTER);
                        continue;
                    case 266:
                        settingGroups.noPush = (NotificationSetting) nc5Var.m162488l(NotificationSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 274:
                        settingGroups.upvip = (UserUpVipSettings) nc5Var.m162488l(UserUpVipSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 282:
                        settingGroups.adsMaterialRouter = (AdsMaterialRouter) nc5Var.m162488l(AdsMaterialRouter.PROTOBUF_ADAPTER);
                        continue;
                    case 290:
                        settingGroups.gender = (IntlMoreGender) nc5Var.m162488l(IntlMoreGender.PROTOBUF_ADAPTER);
                        continue;
                    case 298:
                        settingGroups.tttribe = (TribeSetting) nc5Var.m162488l(TribeSetting.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (settingGroups.boost == null) {
                            settingGroups.boost = UserBoostSettings.new_();
                        }
                        if (settingGroups.live == null) {
                            settingGroups.live = UserLiveSettings.new_();
                        }
                        if (settingGroups.privacy == null) {
                            settingGroups.privacy = UserPrivacySettings.new_();
                        }
                        if (settingGroups.push == null) {
                            settingGroups.push = UserPushSettings.new_();
                        }
                        if (settingGroups.search == null) {
                            settingGroups.search = UserSearchSettings.new_();
                        }
                        if (settingGroups.subscription == null) {
                            settingGroups.subscription = UserSubscriptionSettings.new_();
                        }
                        if (settingGroups.fake == null) {
                            settingGroups.fake = UserFakeSettings.new_();
                        }
                        if (settingGroups.svip == null) {
                            settingGroups.svip = UserSVIPSettings.new_();
                        }
                        if (settingGroups.diamondVIP == null) {
                            settingGroups.diamondVIP = DiamondVIPPrivilegeSettings.new_();
                        }
                        if (settingGroups.diamondVIPPrivateMatch == null) {
                            settingGroups.diamondVIPPrivateMatch = DiamondVIPPrivateMatch.new_();
                        }
                        if (settingGroups.soulchat == null) {
                            settingGroups.soulchat = ChatSetting.new_();
                        }
                        if (settingGroups.quickchatchat == null) {
                            settingGroups.quickchatchat = ChatSetting.new_();
                        }
                        if (settingGroups.soulmate == null) {
                            settingGroups.soulmate = SoulMatchGroup.new_();
                        }
                        if (settingGroups.share == null) {
                            settingGroups.share = ShareSetting.new_();
                        }
                        if (settingGroups.decoration == null) {
                            settingGroups.decoration = DecorationSettings.new_();
                        }
                        if (settingGroups.comDiamond == null) {
                            settingGroups.comDiamond = ComDiamond.new_();
                        }
                        if (settingGroups.pet == null) {
                            settingGroups.pet = Pet.new_();
                        }
                        if (settingGroups.momentLevel == null) {
                            settingGroups.momentLevel = MomentLevel.new_();
                        }
                        if (settingGroups.vipSearch == null) {
                            settingGroups.vipSearch = VipSearchSettings.new_();
                        }
                        if (settingGroups.moment == null) {
                            settingGroups.moment = UserMomentSettings.new_();
                        }
                        if (settingGroups.profile == null) {
                            settingGroups.profile = SettingGroupsProfile.new_();
                        }
                        if (settingGroups.pvip == null) {
                            settingGroups.pvip = PlatinumSettings.new_();
                        }
                        if (settingGroups.marriage == null) {
                            settingGroups.marriage = MarrySettings.new_();
                        }
                        if (settingGroups.cityC == null) {
                            settingGroups.cityC = CityC.new_();
                        }
                        if (settingGroups.spvip == null) {
                            settingGroups.spvip = SpVip.new_();
                        }
                        if (settingGroups.growth == null) {
                            settingGroups.growth = GrowthSettings.new_();
                        }
                        if (settingGroups.fvip == null) {
                            settingGroups.fvip = FemaleVip.new_();
                        }
                        if (settingGroups.svipSearch == null) {
                            settingGroups.svipSearch = SvipSearch.new_();
                        }
                        if (settingGroups.adsMaterialRouter == null) {
                            settingGroups.adsMaterialRouter = AdsMaterialRouter.new_();
                        }
                        if (settingGroups.upvip == null) {
                            settingGroups.upvip = UserUpVipSettings.new_();
                        }
                        if (settingGroups.gender == null) {
                            settingGroups.gender = IntlMoreGender.new_();
                        }
                        if (settingGroups.tttribe == null) {
                            settingGroups.tttribe = TribeSetting.new_();
                            return settingGroups;
                        }
                        break;
                }
            }
            return settingGroups;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingGroups settingGroups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = settingGroups.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            UserBoostSettings userBoostSettings = settingGroups.boost;
            if (userBoostSettings != null) {
                codedOutputByteBufferNano.m17309K(2, userBoostSettings, UserBoostSettings.PROTOBUF_ADAPTER);
            }
            UserLiveSettings userLiveSettings = settingGroups.live;
            if (userLiveSettings != null) {
                codedOutputByteBufferNano.m17309K(3, userLiveSettings, UserLiveSettings.PROTOBUF_ADAPTER);
            }
            UserPrivacySettings userPrivacySettings = settingGroups.privacy;
            if (userPrivacySettings != null) {
                codedOutputByteBufferNano.m17309K(4, userPrivacySettings, UserPrivacySettings.PROTOBUF_ADAPTER);
            }
            UserPushSettings userPushSettings = settingGroups.push;
            if (userPushSettings != null) {
                codedOutputByteBufferNano.m17309K(5, userPushSettings, UserPushSettings.PROTOBUF_ADAPTER);
            }
            UserSearchSettings userSearchSettings = settingGroups.search;
            if (userSearchSettings != null) {
                codedOutputByteBufferNano.m17309K(6, userSearchSettings, UserSearchSettings.PROTOBUF_ADAPTER);
            }
            UserSubscriptionSettings userSubscriptionSettings = settingGroups.subscription;
            if (userSubscriptionSettings != null) {
                codedOutputByteBufferNano.m17309K(7, userSubscriptionSettings, UserSubscriptionSettings.PROTOBUF_ADAPTER);
            }
            UserFakeSettings userFakeSettings = settingGroups.fake;
            if (userFakeSettings != null) {
                codedOutputByteBufferNano.m17309K(8, userFakeSettings, UserFakeSettings.PROTOBUF_ADAPTER);
            }
            UserSVIPSettings userSVIPSettings = settingGroups.svip;
            if (userSVIPSettings != null) {
                codedOutputByteBufferNano.m17309K(9, userSVIPSettings, UserSVIPSettings.PROTOBUF_ADAPTER);
            }
            SvipPrivacySettings svipPrivacySettings = settingGroups.svipPrivacy;
            if (svipPrivacySettings != null) {
                codedOutputByteBufferNano.m17309K(10, svipPrivacySettings, SvipPrivacySettings.PROTOBUF_ADAPTER);
            }
            SeeSettings seeSettings = settingGroups.see;
            if (seeSettings != null) {
                codedOutputByteBufferNano.m17309K(11, seeSettings, SeeSettings.PROTOBUF_ADAPTER);
            }
            DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = settingGroups.diamondVIP;
            if (diamondVIPPrivilegeSettings != null) {
                codedOutputByteBufferNano.m17309K(12, diamondVIPPrivilegeSettings, DiamondVIPPrivilegeSettings.PROTOBUF_ADAPTER);
            }
            DiamondVIPPrivateMatch diamondVIPPrivateMatch = settingGroups.diamondVIPPrivateMatch;
            if (diamondVIPPrivateMatch != null) {
                codedOutputByteBufferNano.m17309K(13, diamondVIPPrivateMatch, DiamondVIPPrivateMatch.PROTOBUF_ADAPTER);
            }
            ChatSetting chatSetting = settingGroups.soulchat;
            if (chatSetting != null) {
                codedOutputByteBufferNano.m17309K(14, chatSetting, ChatSetting.PROTOBUF_ADAPTER);
            }
            ChatSetting chatSetting2 = settingGroups.quickchatchat;
            if (chatSetting2 != null) {
                codedOutputByteBufferNano.m17309K(15, chatSetting2, ChatSetting.PROTOBUF_ADAPTER);
            }
            SoulMatchGroup soulMatchGroup = settingGroups.soulmate;
            if (soulMatchGroup != null) {
                codedOutputByteBufferNano.m17309K(16, soulMatchGroup, SoulMatchGroup.PROTOBUF_ADAPTER);
            }
            ShareSetting shareSetting = settingGroups.share;
            if (shareSetting != null) {
                codedOutputByteBufferNano.m17309K(17, shareSetting, ShareSetting.PROTOBUF_ADAPTER);
            }
            DecorationSettings decorationSettings = settingGroups.decoration;
            if (decorationSettings != null) {
                codedOutputByteBufferNano.m17309K(18, decorationSettings, DecorationSettings.PROTOBUF_ADAPTER);
            }
            ComDiamond comDiamond = settingGroups.comDiamond;
            if (comDiamond != null) {
                codedOutputByteBufferNano.m17309K(19, comDiamond, ComDiamond.PROTOBUF_ADAPTER);
            }
            CharacterEvaluate characterEvaluate = settingGroups.characterEvaluate;
            if (characterEvaluate != null) {
                codedOutputByteBufferNano.m17309K(20, characterEvaluate, CharacterEvaluate.PROTOBUF_ADAPTER);
            }
            Pet pet = settingGroups.pet;
            if (pet != null) {
                codedOutputByteBufferNano.m17309K(21, pet, Pet.PROTOBUF_ADAPTER);
            }
            MomentLevel momentLevel = settingGroups.momentLevel;
            if (momentLevel != null) {
                codedOutputByteBufferNano.m17309K(22, momentLevel, MomentLevel.PROTOBUF_ADAPTER);
            }
            VipSearchSettings vipSearchSettings = settingGroups.vipSearch;
            if (vipSearchSettings != null) {
                codedOutputByteBufferNano.m17309K(23, vipSearchSettings, VipSearchSettings.PROTOBUF_ADAPTER);
            }
            UserMomentSettings userMomentSettings = settingGroups.moment;
            if (userMomentSettings != null) {
                codedOutputByteBufferNano.m17309K(24, userMomentSettings, UserMomentSettings.PROTOBUF_ADAPTER);
            }
            SettingGroupsProfile settingGroupsProfile = settingGroups.profile;
            if (settingGroupsProfile != null) {
                codedOutputByteBufferNano.m17309K(25, settingGroupsProfile, SettingGroupsProfile.PROTOBUF_ADAPTER);
            }
            PlatinumSettings platinumSettings = settingGroups.pvip;
            if (platinumSettings != null) {
                codedOutputByteBufferNano.m17309K(26, platinumSettings, PlatinumSettings.PROTOBUF_ADAPTER);
            }
            MarrySettings marrySettings = settingGroups.marriage;
            if (marrySettings != null) {
                codedOutputByteBufferNano.m17309K(27, marrySettings, MarrySettings.PROTOBUF_ADAPTER);
            }
            CityC cityC = settingGroups.cityC;
            if (cityC != null) {
                codedOutputByteBufferNano.m17309K(28, cityC, CityC.PROTOBUF_ADAPTER);
            }
            SpVip spVip = settingGroups.spvip;
            if (spVip != null) {
                codedOutputByteBufferNano.m17309K(29, spVip, SpVip.PROTOBUF_ADAPTER);
            }
            GrowthSettings growthSettings = settingGroups.growth;
            if (growthSettings != null) {
                codedOutputByteBufferNano.m17309K(30, growthSettings, GrowthSettings.PROTOBUF_ADAPTER);
            }
            FemaleVip femaleVip = settingGroups.fvip;
            if (femaleVip != null) {
                codedOutputByteBufferNano.m17309K(31, femaleVip, FemaleVip.PROTOBUF_ADAPTER);
            }
            SvipSearch svipSearch = settingGroups.svipSearch;
            if (svipSearch != null) {
                codedOutputByteBufferNano.m17309K(32, svipSearch, SvipSearch.PROTOBUF_ADAPTER);
            }
            NotificationSetting notificationSetting = settingGroups.noPush;
            if (notificationSetting != null) {
                codedOutputByteBufferNano.m17309K(33, notificationSetting, NotificationSetting.PROTOBUF_ADAPTER);
            }
            UserUpVipSettings userUpVipSettings = settingGroups.upvip;
            if (userUpVipSettings != null) {
                codedOutputByteBufferNano.m17309K(34, userUpVipSettings, UserUpVipSettings.PROTOBUF_ADAPTER);
            }
            AdsMaterialRouter adsMaterialRouter = settingGroups.adsMaterialRouter;
            if (adsMaterialRouter != null) {
                codedOutputByteBufferNano.m17309K(35, adsMaterialRouter, AdsMaterialRouter.PROTOBUF_ADAPTER);
            }
            IntlMoreGender intlMoreGender = settingGroups.gender;
            if (intlMoreGender != null) {
                codedOutputByteBufferNano.m17309K(36, intlMoreGender, IntlMoreGender.PROTOBUF_ADAPTER);
            }
            TribeSetting tribeSetting = settingGroups.tttribe;
            if (tribeSetting != null) {
                codedOutputByteBufferNano.m17309K(37, tribeSetting, TribeSetting.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SettingGroups> JSON_ADAPTER = new ObjectJsonAdapter<SettingGroups>() { // from class: com.p1.mobile.putong.data.SettingGroups.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingGroups.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingGroups newInstance() {
            return new SettingGroups();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(SettingGroups settingGroups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1534549091:
                    if (str.equals("quickchatchat")) {
                        b = 0;
                    }
                    break;
                case -1426075611:
                    if (str.equals("vipSearch")) {
                        b = 1;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 2;
                    }
                    break;
                case -1237458489:
                    if (str.equals("growth")) {
                        b = 3;
                    }
                    break;
                case -1144679710:
                    if (str.equals("characterEvaluate")) {
                        b = 4;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 5;
                    }
                    break;
                case -1040750469:
                    if (str.equals("noPush")) {
                        b = 6;
                    }
                    break;
                case -1026444141:
                    if (str.equals("comDiamond")) {
                        b = 7;
                    }
                    break;
                case -992145234:
                    if (str.equals("tttribe")) {
                        b = 8;
                    }
                    break;
                case -906336856:
                    if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                        b = 9;
                    }
                    break;
                case -810698576:
                    if (str.equals(Decoration.TYPE)) {
                        b = 10;
                    }
                    break;
                case -490620375:
                    if (str.equals("diamondVIP")) {
                        b = 11;
                    }
                    break;
                case -314498168:
                    if (str.equals("privacy")) {
                        b = 12;
                    }
                    break;
                case -309425751:
                    if (str.equals("profile")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -210736796:
                    if (str.equals("momentLevel")) {
                        b = 14;
                    }
                    break;
                case 110879:
                    if (str.equals("pet")) {
                        b = 15;
                    }
                    break;
                case 113747:
                    if (str.equals("see")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 3135317:
                    if (str.equals(Channel.fake)) {
                        b = 17;
                    }
                    break;
                case 3155447:
                    if (str.equals("fvip")) {
                        b = 18;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        b = 19;
                    }
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        b = 20;
                    }
                    break;
                case 3453357:
                    if (str.equals("pvip")) {
                        b = 21;
                    }
                    break;
                case 3542730:
                    if (str.equals("svip")) {
                        b = 22;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 23;
                    }
                    break;
                case 93922211:
                    if (str.equals("boost")) {
                        b = 24;
                    }
                    break;
                case 94671928:
                    if (str.equals(MatchFrom.cityC)) {
                        b = 25;
                    }
                    break;
                case 109400031:
                    if (str.equals("share")) {
                        b = 26;
                    }
                    break;
                case 109658272:
                    if (str.equals(SpVip.TYPE)) {
                        b = 27;
                    }
                    break;
                case 111505314:
                    if (str.equals("upvip")) {
                        b = 28;
                    }
                    break;
                case 253538506:
                    if (str.equals("marriage")) {
                        b = 29;
                    }
                    break;
                case 262493534:
                    if (str.equals("svipPrivacy")) {
                        b = 30;
                    }
                    break;
                case 341203229:
                    if (str.equals("subscription")) {
                        b = 31;
                    }
                    break;
                case 1740789707:
                    if (str.equals("soulchat")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1741081464:
                    if (str.equals(ConversationType.soulmate)) {
                        b = 33;
                    }
                    break;
                case 1744675090:
                    if (str.equals("svipSearch")) {
                        b = 34;
                    }
                    break;
                case 1836482592:
                    if (str.equals("adsMaterialRouter")) {
                        b = 35;
                    }
                    break;
                case 1936053963:
                    if (str.equals("diamondVIPPrivateMatch")) {
                        b = 36;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    settingGroups.quickchatchat = ChatSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    settingGroups.vipSearch = VipSearchSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    settingGroups.gender = IntlMoreGender.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    settingGroups.growth = GrowthSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    settingGroups.characterEvaluate = CharacterEvaluate.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    settingGroups.moment = UserMomentSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    settingGroups.noPush = NotificationSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    settingGroups.comDiamond = ComDiamond.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    settingGroups.tttribe = TribeSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    settingGroups.search = UserSearchSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    settingGroups.decoration = DecorationSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    settingGroups.diamondVIP = DiamondVIPPrivilegeSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    settingGroups.privacy = UserPrivacySettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    settingGroups.profile = SettingGroupsProfile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    settingGroups.momentLevel = MomentLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    settingGroups.pet = Pet.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    settingGroups.see = SeeSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    settingGroups.fake = UserFakeSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    settingGroups.fvip = FemaleVip.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    settingGroups.live = UserLiveSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    settingGroups.push = UserPushSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    settingGroups.pvip = PlatinumSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    settingGroups.svip = UserSVIPSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    settingGroups.type = jsonParser.getValueAsString();
                    return true;
                case 24:
                    settingGroups.boost = UserBoostSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    settingGroups.cityC = CityC.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    settingGroups.share = ShareSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    settingGroups.spvip = SpVip.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    settingGroups.upvip = UserUpVipSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    settingGroups.marriage = MarrySettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    settingGroups.svipPrivacy = SvipPrivacySettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    settingGroups.subscription = UserSubscriptionSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 32:
                    settingGroups.soulchat = ChatSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    settingGroups.soulmate = SoulMatchGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    settingGroups.svipSearch = SvipSearch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 35:
                    settingGroups.adsMaterialRouter = AdsMaterialRouter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 36:
                    settingGroups.diamondVIPPrivateMatch = DiamondVIPPrivateMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(SettingGroups settingGroups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1534549091:
                    if (str.equals("quickchatchat")) {
                        b = 0;
                    }
                    break;
                case -1426075611:
                    if (str.equals("vipSearch")) {
                        b = 1;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 2;
                    }
                    break;
                case -1237458489:
                    if (str.equals("growth")) {
                        b = 3;
                    }
                    break;
                case -1144679710:
                    if (str.equals("characterEvaluate")) {
                        b = 4;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 5;
                    }
                    break;
                case -1040750469:
                    if (str.equals("noPush")) {
                        b = 6;
                    }
                    break;
                case -1026444141:
                    if (str.equals("comDiamond")) {
                        b = 7;
                    }
                    break;
                case -992145234:
                    if (str.equals("tttribe")) {
                        b = 8;
                    }
                    break;
                case -906336856:
                    if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                        b = 9;
                    }
                    break;
                case -810698576:
                    if (str.equals(Decoration.TYPE)) {
                        b = 10;
                    }
                    break;
                case -490620375:
                    if (str.equals("diamondVIP")) {
                        b = 11;
                    }
                    break;
                case -314498168:
                    if (str.equals("privacy")) {
                        b = 12;
                    }
                    break;
                case -309425751:
                    if (str.equals("profile")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -210736796:
                    if (str.equals("momentLevel")) {
                        b = 14;
                    }
                    break;
                case 110879:
                    if (str.equals("pet")) {
                        b = 15;
                    }
                    break;
                case 113747:
                    if (str.equals("see")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 3135317:
                    if (str.equals(Channel.fake)) {
                        b = 17;
                    }
                    break;
                case 3155447:
                    if (str.equals("fvip")) {
                        b = 18;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        b = 19;
                    }
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        b = 20;
                    }
                    break;
                case 3453357:
                    if (str.equals("pvip")) {
                        b = 21;
                    }
                    break;
                case 3542730:
                    if (str.equals("svip")) {
                        b = 22;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 23;
                    }
                    break;
                case 93922211:
                    if (str.equals("boost")) {
                        b = 24;
                    }
                    break;
                case 94671928:
                    if (str.equals(MatchFrom.cityC)) {
                        b = 25;
                    }
                    break;
                case 109400031:
                    if (str.equals("share")) {
                        b = 26;
                    }
                    break;
                case 109658272:
                    if (str.equals(SpVip.TYPE)) {
                        b = 27;
                    }
                    break;
                case 111505314:
                    if (str.equals("upvip")) {
                        b = 28;
                    }
                    break;
                case 253538506:
                    if (str.equals("marriage")) {
                        b = 29;
                    }
                    break;
                case 262493534:
                    if (str.equals("svipPrivacy")) {
                        b = 30;
                    }
                    break;
                case 341203229:
                    if (str.equals("subscription")) {
                        b = 31;
                    }
                    break;
                case 1740789707:
                    if (str.equals("soulchat")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1741081464:
                    if (str.equals(ConversationType.soulmate)) {
                        b = 33;
                    }
                    break;
                case 1744675090:
                    if (str.equals("svipSearch")) {
                        b = 34;
                    }
                    break;
                case 1836482592:
                    if (str.equals("adsMaterialRouter")) {
                        b = 35;
                    }
                    break;
                case 1936053963:
                    if (str.equals("diamondVIPPrivateMatch")) {
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
                    return super.parseFieldCheck(settingGroups, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingGroups settingGroups, JsonGenerator jsonGenerator) throws IOException {
            String str = settingGroups.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (settingGroups.boost != null) {
                jsonGenerator.writeFieldName("boost");
                UserBoostSettings.JSON_ADAPTER.serialize(settingGroups.boost, jsonGenerator, true);
            }
            if (settingGroups.live != null) {
                jsonGenerator.writeFieldName("live");
                UserLiveSettings.JSON_ADAPTER.serialize(settingGroups.live, jsonGenerator, true);
            }
            if (settingGroups.privacy != null) {
                jsonGenerator.writeFieldName("privacy");
                UserPrivacySettings.JSON_ADAPTER.serialize(settingGroups.privacy, jsonGenerator, true);
            }
            if (settingGroups.push != null) {
                jsonGenerator.writeFieldName("push");
                UserPushSettings.JSON_ADAPTER.serialize(settingGroups.push, jsonGenerator, true);
            }
            if (settingGroups.search != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Event.SEARCH);
                UserSearchSettings.JSON_ADAPTER.serialize(settingGroups.search, jsonGenerator, true);
            }
            if (settingGroups.subscription != null) {
                jsonGenerator.writeFieldName("subscription");
                UserSubscriptionSettings.JSON_ADAPTER.serialize(settingGroups.subscription, jsonGenerator, true);
            }
            if (settingGroups.fake != null) {
                jsonGenerator.writeFieldName(Channel.fake);
                UserFakeSettings.JSON_ADAPTER.serialize(settingGroups.fake, jsonGenerator, true);
            }
            if (settingGroups.svip != null) {
                jsonGenerator.writeFieldName("svip");
                UserSVIPSettings.JSON_ADAPTER.serialize(settingGroups.svip, jsonGenerator, true);
            }
            if (settingGroups.svipPrivacy != null) {
                jsonGenerator.writeFieldName("svipPrivacy");
                SvipPrivacySettings.JSON_ADAPTER.serialize(settingGroups.svipPrivacy, jsonGenerator, true);
            }
            if (settingGroups.see != null) {
                jsonGenerator.writeFieldName("see");
                SeeSettings.JSON_ADAPTER.serialize(settingGroups.see, jsonGenerator, true);
            }
            if (settingGroups.diamondVIP != null) {
                jsonGenerator.writeFieldName("diamondVIP");
                DiamondVIPPrivilegeSettings.JSON_ADAPTER.serialize(settingGroups.diamondVIP, jsonGenerator, true);
            }
            if (settingGroups.diamondVIPPrivateMatch != null) {
                jsonGenerator.writeFieldName("diamondVIPPrivateMatch");
                DiamondVIPPrivateMatch.JSON_ADAPTER.serialize(settingGroups.diamondVIPPrivateMatch, jsonGenerator, true);
            }
            if (settingGroups.soulchat != null) {
                jsonGenerator.writeFieldName("soulchat");
                ChatSetting.JSON_ADAPTER.serialize(settingGroups.soulchat, jsonGenerator, true);
            }
            if (settingGroups.quickchatchat != null) {
                jsonGenerator.writeFieldName("quickchatchat");
                ChatSetting.JSON_ADAPTER.serialize(settingGroups.quickchatchat, jsonGenerator, true);
            }
            if (settingGroups.soulmate != null) {
                jsonGenerator.writeFieldName(ConversationType.soulmate);
                SoulMatchGroup.JSON_ADAPTER.serialize(settingGroups.soulmate, jsonGenerator, true);
            }
            if (settingGroups.share != null) {
                jsonGenerator.writeFieldName("share");
                ShareSetting.JSON_ADAPTER.serialize(settingGroups.share, jsonGenerator, true);
            }
            if (settingGroups.decoration != null) {
                jsonGenerator.writeFieldName(Decoration.TYPE);
                DecorationSettings.JSON_ADAPTER.serialize(settingGroups.decoration, jsonGenerator, true);
            }
            if (settingGroups.comDiamond != null) {
                jsonGenerator.writeFieldName("comDiamond");
                ComDiamond.JSON_ADAPTER.serialize(settingGroups.comDiamond, jsonGenerator, true);
            }
            if (settingGroups.characterEvaluate != null) {
                jsonGenerator.writeFieldName("characterEvaluate");
                CharacterEvaluate.JSON_ADAPTER.serialize(settingGroups.characterEvaluate, jsonGenerator, true);
            }
            if (settingGroups.pet != null) {
                jsonGenerator.writeFieldName("pet");
                Pet.JSON_ADAPTER.serialize(settingGroups.pet, jsonGenerator, true);
            }
            if (settingGroups.momentLevel != null) {
                jsonGenerator.writeFieldName("momentLevel");
                MomentLevel.JSON_ADAPTER.serialize(settingGroups.momentLevel, jsonGenerator, true);
            }
            if (settingGroups.vipSearch != null) {
                jsonGenerator.writeFieldName("vipSearch");
                VipSearchSettings.JSON_ADAPTER.serialize(settingGroups.vipSearch, jsonGenerator, true);
            }
            if (settingGroups.moment != null) {
                jsonGenerator.writeFieldName("moment");
                UserMomentSettings.JSON_ADAPTER.serialize(settingGroups.moment, jsonGenerator, true);
            }
            if (settingGroups.profile != null) {
                jsonGenerator.writeFieldName("profile");
                SettingGroupsProfile.JSON_ADAPTER.serialize(settingGroups.profile, jsonGenerator, true);
            }
            if (settingGroups.pvip != null) {
                jsonGenerator.writeFieldName("pvip");
                PlatinumSettings.JSON_ADAPTER.serialize(settingGroups.pvip, jsonGenerator, true);
            }
            if (settingGroups.marriage != null) {
                jsonGenerator.writeFieldName("marriage");
                MarrySettings.JSON_ADAPTER.serialize(settingGroups.marriage, jsonGenerator, true);
            }
            if (settingGroups.cityC != null) {
                jsonGenerator.writeFieldName(MatchFrom.cityC);
                CityC.JSON_ADAPTER.serialize(settingGroups.cityC, jsonGenerator, true);
            }
            if (settingGroups.spvip != null) {
                jsonGenerator.writeFieldName(SpVip.TYPE);
                SpVip.JSON_ADAPTER.serialize(settingGroups.spvip, jsonGenerator, true);
            }
            if (settingGroups.growth != null) {
                jsonGenerator.writeFieldName("growth");
                GrowthSettings.JSON_ADAPTER.serialize(settingGroups.growth, jsonGenerator, true);
            }
            if (settingGroups.fvip != null) {
                jsonGenerator.writeFieldName("fvip");
                FemaleVip.JSON_ADAPTER.serialize(settingGroups.fvip, jsonGenerator, true);
            }
            if (settingGroups.svipSearch != null) {
                jsonGenerator.writeFieldName("svipSearch");
                SvipSearch.JSON_ADAPTER.serialize(settingGroups.svipSearch, jsonGenerator, true);
            }
            if (settingGroups.noPush != null) {
                jsonGenerator.writeFieldName("noPush");
                NotificationSetting.JSON_ADAPTER.serialize(settingGroups.noPush, jsonGenerator, true);
            }
            if (settingGroups.adsMaterialRouter != null) {
                jsonGenerator.writeFieldName("adsMaterialRouter");
                AdsMaterialRouter.JSON_ADAPTER.serialize(settingGroups.adsMaterialRouter, jsonGenerator, true);
            }
            if (settingGroups.upvip != null) {
                jsonGenerator.writeFieldName("upvip");
                UserUpVipSettings.JSON_ADAPTER.serialize(settingGroups.upvip, jsonGenerator, true);
            }
            if (settingGroups.gender != null) {
                jsonGenerator.writeFieldName("gender");
                IntlMoreGender.JSON_ADAPTER.serialize(settingGroups.gender, jsonGenerator, true);
            }
            if (settingGroups.tttribe != null) {
                jsonGenerator.writeFieldName("tttribe");
                TribeSetting.JSON_ADAPTER.serialize(settingGroups.tttribe, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingGroups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingGroups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingGroups new_() {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.nullCheck();
        return settingGroups;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingGroups mo225055clone() {
        SettingGroups settingGroups = new SettingGroups();
        settingGroups.type = this.type;
        UserBoostSettings userBoostSettings = this.boost;
        if (userBoostSettings != null) {
            settingGroups.boost = userBoostSettings.mo225055clone();
        }
        UserLiveSettings userLiveSettings = this.live;
        if (userLiveSettings != null) {
            settingGroups.live = userLiveSettings.mo225055clone();
        }
        UserPrivacySettings userPrivacySettings = this.privacy;
        if (userPrivacySettings != null) {
            settingGroups.privacy = userPrivacySettings.mo225055clone();
        }
        UserPushSettings userPushSettings = this.push;
        if (userPushSettings != null) {
            settingGroups.push = userPushSettings.mo225055clone();
        }
        UserSearchSettings userSearchSettings = this.search;
        if (userSearchSettings != null) {
            settingGroups.search = userSearchSettings.mo225055clone();
        }
        UserSubscriptionSettings userSubscriptionSettings = this.subscription;
        if (userSubscriptionSettings != null) {
            settingGroups.subscription = userSubscriptionSettings.mo225055clone();
        }
        UserFakeSettings userFakeSettings = this.fake;
        if (userFakeSettings != null) {
            settingGroups.fake = userFakeSettings.mo225055clone();
        }
        UserSVIPSettings userSVIPSettings = this.svip;
        if (userSVIPSettings != null) {
            settingGroups.svip = userSVIPSettings.mo225055clone();
        }
        SvipPrivacySettings svipPrivacySettings = this.svipPrivacy;
        if (svipPrivacySettings != null) {
            settingGroups.svipPrivacy = svipPrivacySettings.mo225055clone();
        }
        SeeSettings seeSettings = this.see;
        if (seeSettings != null) {
            settingGroups.see = seeSettings.mo225055clone();
        }
        DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = this.diamondVIP;
        if (diamondVIPPrivilegeSettings != null) {
            settingGroups.diamondVIP = diamondVIPPrivilegeSettings.mo225055clone();
        }
        DiamondVIPPrivateMatch diamondVIPPrivateMatch = this.diamondVIPPrivateMatch;
        if (diamondVIPPrivateMatch != null) {
            settingGroups.diamondVIPPrivateMatch = diamondVIPPrivateMatch.mo225055clone();
        }
        ChatSetting chatSetting = this.soulchat;
        if (chatSetting != null) {
            settingGroups.soulchat = chatSetting.mo225055clone();
        }
        ChatSetting chatSetting2 = this.quickchatchat;
        if (chatSetting2 != null) {
            settingGroups.quickchatchat = chatSetting2.mo225055clone();
        }
        SoulMatchGroup soulMatchGroup = this.soulmate;
        if (soulMatchGroup != null) {
            settingGroups.soulmate = soulMatchGroup.mo225055clone();
        }
        ShareSetting shareSetting = this.share;
        if (shareSetting != null) {
            settingGroups.share = shareSetting.mo225055clone();
        }
        DecorationSettings decorationSettings = this.decoration;
        if (decorationSettings != null) {
            settingGroups.decoration = decorationSettings.mo225055clone();
        }
        ComDiamond comDiamond = this.comDiamond;
        if (comDiamond != null) {
            settingGroups.comDiamond = comDiamond.mo225055clone();
        }
        CharacterEvaluate characterEvaluate = this.characterEvaluate;
        if (characterEvaluate != null) {
            settingGroups.characterEvaluate = characterEvaluate.mo225055clone();
        }
        Pet pet = this.pet;
        if (pet != null) {
            settingGroups.pet = pet.mo225055clone();
        }
        MomentLevel momentLevel = this.momentLevel;
        if (momentLevel != null) {
            settingGroups.momentLevel = momentLevel.mo225055clone();
        }
        VipSearchSettings vipSearchSettings = this.vipSearch;
        if (vipSearchSettings != null) {
            settingGroups.vipSearch = vipSearchSettings.mo225055clone();
        }
        UserMomentSettings userMomentSettings = this.moment;
        if (userMomentSettings != null) {
            settingGroups.moment = userMomentSettings.mo225055clone();
        }
        SettingGroupsProfile settingGroupsProfile = this.profile;
        if (settingGroupsProfile != null) {
            settingGroups.profile = settingGroupsProfile.mo225055clone();
        }
        PlatinumSettings platinumSettings = this.pvip;
        if (platinumSettings != null) {
            settingGroups.pvip = platinumSettings.mo225055clone();
        }
        MarrySettings marrySettings = this.marriage;
        if (marrySettings != null) {
            settingGroups.marriage = marrySettings.mo225055clone();
        }
        CityC cityC = this.cityC;
        if (cityC != null) {
            settingGroups.cityC = cityC.mo225055clone();
        }
        SpVip spVip = this.spvip;
        if (spVip != null) {
            settingGroups.spvip = spVip.mo225055clone();
        }
        GrowthSettings growthSettings = this.growth;
        if (growthSettings != null) {
            settingGroups.growth = growthSettings.mo225055clone();
        }
        FemaleVip femaleVip = this.fvip;
        if (femaleVip != null) {
            settingGroups.fvip = femaleVip.mo225055clone();
        }
        SvipSearch svipSearch = this.svipSearch;
        if (svipSearch != null) {
            settingGroups.svipSearch = svipSearch.mo225055clone();
        }
        NotificationSetting notificationSetting = this.noPush;
        if (notificationSetting != null) {
            settingGroups.noPush = notificationSetting.mo225055clone();
        }
        AdsMaterialRouter adsMaterialRouter = this.adsMaterialRouter;
        if (adsMaterialRouter != null) {
            settingGroups.adsMaterialRouter = adsMaterialRouter.mo225055clone();
        }
        UserUpVipSettings userUpVipSettings = this.upvip;
        if (userUpVipSettings != null) {
            settingGroups.upvip = userUpVipSettings.mo225055clone();
        }
        IntlMoreGender intlMoreGender = this.gender;
        if (intlMoreGender != null) {
            settingGroups.gender = intlMoreGender.mo225055clone();
        }
        TribeSetting tribeSetting = this.tttribe;
        if (tribeSetting != null) {
            settingGroups.tttribe = tribeSetting.mo225055clone();
        }
        return settingGroups;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingGroups)) {
            return false;
        }
        SettingGroups settingGroups = (SettingGroups) obj;
        return ValueObject.util_equals(this.type, settingGroups.type) && ValueObject.util_equals(this.boost, settingGroups.boost) && ValueObject.util_equals(this.live, settingGroups.live) && ValueObject.util_equals(this.privacy, settingGroups.privacy) && ValueObject.util_equals(this.push, settingGroups.push) && ValueObject.util_equals(this.search, settingGroups.search) && ValueObject.util_equals(this.subscription, settingGroups.subscription) && ValueObject.util_equals(this.fake, settingGroups.fake) && ValueObject.util_equals(this.svip, settingGroups.svip) && ValueObject.util_equals(this.svipPrivacy, settingGroups.svipPrivacy) && ValueObject.util_equals(this.see, settingGroups.see) && ValueObject.util_equals(this.diamondVIP, settingGroups.diamondVIP) && ValueObject.util_equals(this.diamondVIPPrivateMatch, settingGroups.diamondVIPPrivateMatch) && ValueObject.util_equals(this.soulchat, settingGroups.soulchat) && ValueObject.util_equals(this.quickchatchat, settingGroups.quickchatchat) && ValueObject.util_equals(this.soulmate, settingGroups.soulmate) && ValueObject.util_equals(this.share, settingGroups.share) && ValueObject.util_equals(this.decoration, settingGroups.decoration) && ValueObject.util_equals(this.comDiamond, settingGroups.comDiamond) && ValueObject.util_equals(this.characterEvaluate, settingGroups.characterEvaluate) && ValueObject.util_equals(this.pet, settingGroups.pet) && ValueObject.util_equals(this.momentLevel, settingGroups.momentLevel) && ValueObject.util_equals(this.vipSearch, settingGroups.vipSearch) && ValueObject.util_equals(this.moment, settingGroups.moment) && ValueObject.util_equals(this.profile, settingGroups.profile) && ValueObject.util_equals(this.pvip, settingGroups.pvip) && ValueObject.util_equals(this.marriage, settingGroups.marriage) && ValueObject.util_equals(this.cityC, settingGroups.cityC) && ValueObject.util_equals(this.spvip, settingGroups.spvip) && ValueObject.util_equals(this.growth, settingGroups.growth) && ValueObject.util_equals(this.fvip, settingGroups.fvip) && ValueObject.util_equals(this.svipSearch, settingGroups.svipSearch) && ValueObject.util_equals(this.noPush, settingGroups.noPush) && ValueObject.util_equals(this.adsMaterialRouter, settingGroups.adsMaterialRouter) && ValueObject.util_equals(this.upvip, settingGroups.upvip) && ValueObject.util_equals(this.gender, settingGroups.gender) && ValueObject.util_equals(this.tttribe, settingGroups.tttribe);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "settinggroups";
    }

    public boolean hasIntlMoreGenderSetting() {
        if (this.gender.lookingForGenders.size() <= 0) {
            return (NullChecker.m82486a(this.gender.newGender) && !this.gender.newGender.isUnknownType()) || !TextUtils.isEmpty(this.gender.subGender);
        }
        return true;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        UserBoostSettings userBoostSettings = this.boost;
        int iHashCode2 = (iHashCode + (userBoostSettings != null ? userBoostSettings.hashCode() : 0)) * 41;
        UserLiveSettings userLiveSettings = this.live;
        int iHashCode3 = (iHashCode2 + (userLiveSettings != null ? userLiveSettings.hashCode() : 0)) * 41;
        UserPrivacySettings userPrivacySettings = this.privacy;
        int iHashCode4 = (iHashCode3 + (userPrivacySettings != null ? userPrivacySettings.hashCode() : 0)) * 41;
        UserPushSettings userPushSettings = this.push;
        int iHashCode5 = (iHashCode4 + (userPushSettings != null ? userPushSettings.hashCode() : 0)) * 41;
        UserSearchSettings userSearchSettings = this.search;
        int iHashCode6 = (iHashCode5 + (userSearchSettings != null ? userSearchSettings.hashCode() : 0)) * 41;
        UserSubscriptionSettings userSubscriptionSettings = this.subscription;
        int iHashCode7 = (iHashCode6 + (userSubscriptionSettings != null ? userSubscriptionSettings.hashCode() : 0)) * 41;
        UserFakeSettings userFakeSettings = this.fake;
        int iHashCode8 = (iHashCode7 + (userFakeSettings != null ? userFakeSettings.hashCode() : 0)) * 41;
        UserSVIPSettings userSVIPSettings = this.svip;
        int iHashCode9 = (iHashCode8 + (userSVIPSettings != null ? userSVIPSettings.hashCode() : 0)) * 41;
        SvipPrivacySettings svipPrivacySettings = this.svipPrivacy;
        int iHashCode10 = (iHashCode9 + (svipPrivacySettings != null ? svipPrivacySettings.hashCode() : 0)) * 41;
        SeeSettings seeSettings = this.see;
        int iHashCode11 = (iHashCode10 + (seeSettings != null ? seeSettings.hashCode() : 0)) * 41;
        DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = this.diamondVIP;
        int iHashCode12 = (iHashCode11 + (diamondVIPPrivilegeSettings != null ? diamondVIPPrivilegeSettings.hashCode() : 0)) * 41;
        DiamondVIPPrivateMatch diamondVIPPrivateMatch = this.diamondVIPPrivateMatch;
        int iHashCode13 = (iHashCode12 + (diamondVIPPrivateMatch != null ? diamondVIPPrivateMatch.hashCode() : 0)) * 41;
        ChatSetting chatSetting = this.soulchat;
        int iHashCode14 = (iHashCode13 + (chatSetting != null ? chatSetting.hashCode() : 0)) * 41;
        ChatSetting chatSetting2 = this.quickchatchat;
        int iHashCode15 = (iHashCode14 + (chatSetting2 != null ? chatSetting2.hashCode() : 0)) * 41;
        SoulMatchGroup soulMatchGroup = this.soulmate;
        int iHashCode16 = (iHashCode15 + (soulMatchGroup != null ? soulMatchGroup.hashCode() : 0)) * 41;
        ShareSetting shareSetting = this.share;
        int iHashCode17 = (iHashCode16 + (shareSetting != null ? shareSetting.hashCode() : 0)) * 41;
        DecorationSettings decorationSettings = this.decoration;
        int iHashCode18 = (iHashCode17 + (decorationSettings != null ? decorationSettings.hashCode() : 0)) * 41;
        ComDiamond comDiamond = this.comDiamond;
        int iHashCode19 = (iHashCode18 + (comDiamond != null ? comDiamond.hashCode() : 0)) * 41;
        CharacterEvaluate characterEvaluate = this.characterEvaluate;
        int iHashCode20 = (iHashCode19 + (characterEvaluate != null ? characterEvaluate.hashCode() : 0)) * 41;
        Pet pet = this.pet;
        int iHashCode21 = (iHashCode20 + (pet != null ? pet.hashCode() : 0)) * 41;
        MomentLevel momentLevel = this.momentLevel;
        int iHashCode22 = (iHashCode21 + (momentLevel != null ? momentLevel.hashCode() : 0)) * 41;
        VipSearchSettings vipSearchSettings = this.vipSearch;
        int iHashCode23 = (iHashCode22 + (vipSearchSettings != null ? vipSearchSettings.hashCode() : 0)) * 41;
        UserMomentSettings userMomentSettings = this.moment;
        int iHashCode24 = (iHashCode23 + (userMomentSettings != null ? userMomentSettings.hashCode() : 0)) * 41;
        SettingGroupsProfile settingGroupsProfile = this.profile;
        int iHashCode25 = (iHashCode24 + (settingGroupsProfile != null ? settingGroupsProfile.hashCode() : 0)) * 41;
        PlatinumSettings platinumSettings = this.pvip;
        int iHashCode26 = (iHashCode25 + (platinumSettings != null ? platinumSettings.hashCode() : 0)) * 41;
        MarrySettings marrySettings = this.marriage;
        int iHashCode27 = (iHashCode26 + (marrySettings != null ? marrySettings.hashCode() : 0)) * 41;
        CityC cityC = this.cityC;
        int iHashCode28 = (iHashCode27 + (cityC != null ? cityC.hashCode() : 0)) * 41;
        SpVip spVip = this.spvip;
        int iHashCode29 = (iHashCode28 + (spVip != null ? spVip.hashCode() : 0)) * 41;
        GrowthSettings growthSettings = this.growth;
        int iHashCode30 = (iHashCode29 + (growthSettings != null ? growthSettings.hashCode() : 0)) * 41;
        FemaleVip femaleVip = this.fvip;
        int iHashCode31 = (iHashCode30 + (femaleVip != null ? femaleVip.hashCode() : 0)) * 41;
        SvipSearch svipSearch = this.svipSearch;
        int iHashCode32 = (iHashCode31 + (svipSearch != null ? svipSearch.hashCode() : 0)) * 41;
        NotificationSetting notificationSetting = this.noPush;
        int iHashCode33 = (iHashCode32 + (notificationSetting != null ? notificationSetting.hashCode() : 0)) * 41;
        AdsMaterialRouter adsMaterialRouter = this.adsMaterialRouter;
        int iHashCode34 = (iHashCode33 + (adsMaterialRouter != null ? adsMaterialRouter.hashCode() : 0)) * 41;
        UserUpVipSettings userUpVipSettings = this.upvip;
        int iHashCode35 = (iHashCode34 + (userUpVipSettings != null ? userUpVipSettings.hashCode() : 0)) * 41;
        IntlMoreGender intlMoreGender = this.gender;
        int iHashCode36 = (iHashCode35 + (intlMoreGender != null ? intlMoreGender.hashCode() : 0)) * 41;
        TribeSetting tribeSetting = this.tttribe;
        int iHashCode37 = iHashCode36 + (tribeSetting != null ? tribeSetting.hashCode() : 0);
        this.hashCode = iHashCode37;
        return iHashCode37;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(SettingGroups settingGroups) {
        if (!shouldMergeData() || equals(settingGroups)) {
            return;
        }
        if (!isFieldParsed("type")) {
            this.type = settingGroups.type;
        }
        if (!isFieldParsed("boost")) {
            this.boost = settingGroups.boost;
        }
        if (!isFieldParsed("live")) {
            this.live = settingGroups.live;
        }
        if (!isFieldParsed("privacy")) {
            this.privacy = settingGroups.privacy;
        }
        if (!isFieldParsed("push")) {
            this.push = settingGroups.push;
        }
        if (!isFieldParsed(FirebaseAnalytics.Event.SEARCH)) {
            this.search = settingGroups.search;
        }
        if (!isFieldParsed("subscription")) {
            this.subscription = settingGroups.subscription;
        }
        if (!isFieldParsed(Channel.fake)) {
            this.fake = settingGroups.fake;
        }
        if (!isFieldParsed("svip")) {
            this.svip = settingGroups.svip;
        }
        if (!isFieldParsed("svipPrivacy")) {
            this.svipPrivacy = settingGroups.svipPrivacy;
        }
        if (!isFieldParsed("see")) {
            this.see = settingGroups.see;
        }
        if (!isFieldParsed("diamondVIP")) {
            this.diamondVIP = settingGroups.diamondVIP;
        }
        if (!isFieldParsed("diamondVIPPrivateMatch")) {
            this.diamondVIPPrivateMatch = settingGroups.diamondVIPPrivateMatch;
        }
        if (!isFieldParsed("soulchat")) {
            this.soulchat = settingGroups.soulchat;
        }
        if (!isFieldParsed("quickchatchat")) {
            this.quickchatchat = settingGroups.quickchatchat;
        }
        if (!isFieldParsed(ConversationType.soulmate)) {
            this.soulmate = settingGroups.soulmate;
        }
        if (!isFieldParsed("share")) {
            this.share = settingGroups.share;
        }
        if (!isFieldParsed(Decoration.TYPE)) {
            this.decoration = settingGroups.decoration;
        }
        if (!isFieldParsed("comDiamond")) {
            this.comDiamond = settingGroups.comDiamond;
        }
        if (!isFieldParsed("characterEvaluate")) {
            this.characterEvaluate = settingGroups.characterEvaluate;
        }
        if (!isFieldParsed("pet")) {
            this.pet = settingGroups.pet;
        }
        if (!isFieldParsed("momentLevel")) {
            this.momentLevel = settingGroups.momentLevel;
        }
        if (!isFieldParsed("vipSearch")) {
            this.vipSearch = settingGroups.vipSearch;
        }
        if (!isFieldParsed("moment")) {
            this.moment = settingGroups.moment;
        }
        if (!isFieldParsed("profile")) {
            this.profile = settingGroups.profile;
        }
        if (!isFieldParsed("pvip")) {
            this.pvip = settingGroups.pvip;
        }
        if (!isFieldParsed("marriage")) {
            this.marriage = settingGroups.marriage;
        }
        if (!isFieldParsed(MatchFrom.cityC)) {
            this.cityC = settingGroups.cityC;
        }
        if (!isFieldParsed(SpVip.TYPE)) {
            this.spvip = settingGroups.spvip;
        }
        if (!isFieldParsed("growth")) {
            this.growth = settingGroups.growth;
        }
        if (!isFieldParsed("fvip")) {
            this.fvip = settingGroups.fvip;
        }
        if (!isFieldParsed("svipSearch")) {
            this.svipSearch = settingGroups.svipSearch;
        }
        if (!isFieldParsed("noPush")) {
            this.noPush = settingGroups.noPush;
        }
        if (!isFieldParsed("adsMaterialRouter")) {
            this.adsMaterialRouter = settingGroups.adsMaterialRouter;
        }
        if (!isFieldParsed("upvip")) {
            this.upvip = settingGroups.upvip;
        }
        if (!isFieldParsed("gender")) {
            this.gender = settingGroups.gender;
        }
        if (!isFieldParsed("tttribe")) {
            this.tttribe = settingGroups.tttribe;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.boost == null) {
            this.boost = UserBoostSettings.new_();
        }
        if (this.live == null) {
            this.live = UserLiveSettings.new_();
        }
        if (this.privacy == null) {
            this.privacy = UserPrivacySettings.new_();
        }
        if (this.push == null) {
            this.push = UserPushSettings.new_();
        }
        if (this.search == null) {
            this.search = UserSearchSettings.new_();
        }
        if (this.subscription == null) {
            this.subscription = UserSubscriptionSettings.new_();
        }
        if (this.fake == null) {
            this.fake = UserFakeSettings.new_();
        }
        if (this.svip == null) {
            this.svip = UserSVIPSettings.new_();
        }
        if (this.diamondVIP == null) {
            this.diamondVIP = DiamondVIPPrivilegeSettings.new_();
        }
        if (this.diamondVIPPrivateMatch == null) {
            this.diamondVIPPrivateMatch = DiamondVIPPrivateMatch.new_();
        }
        if (this.soulchat == null) {
            this.soulchat = ChatSetting.new_();
        }
        if (this.quickchatchat == null) {
            this.quickchatchat = ChatSetting.new_();
        }
        if (this.soulmate == null) {
            this.soulmate = SoulMatchGroup.new_();
        }
        if (this.share == null) {
            this.share = ShareSetting.new_();
        }
        if (this.decoration == null) {
            this.decoration = DecorationSettings.new_();
        }
        if (this.comDiamond == null) {
            this.comDiamond = ComDiamond.new_();
        }
        if (this.pet == null) {
            this.pet = Pet.new_();
        }
        if (this.momentLevel == null) {
            this.momentLevel = MomentLevel.new_();
        }
        if (this.vipSearch == null) {
            this.vipSearch = VipSearchSettings.new_();
        }
        if (this.moment == null) {
            this.moment = UserMomentSettings.new_();
        }
        if (this.profile == null) {
            this.profile = SettingGroupsProfile.new_();
        }
        if (this.pvip == null) {
            this.pvip = PlatinumSettings.new_();
        }
        if (this.marriage == null) {
            this.marriage = MarrySettings.new_();
        }
        if (this.cityC == null) {
            this.cityC = CityC.new_();
        }
        if (this.spvip == null) {
            this.spvip = SpVip.new_();
        }
        if (this.growth == null) {
            this.growth = GrowthSettings.new_();
        }
        if (this.fvip == null) {
            this.fvip = FemaleVip.new_();
        }
        if (this.svipSearch == null) {
            this.svipSearch = SvipSearch.new_();
        }
        if (this.adsMaterialRouter == null) {
            this.adsMaterialRouter = AdsMaterialRouter.new_();
        }
        if (this.upvip == null) {
            this.upvip = UserUpVipSettings.new_();
        }
        if (this.gender == null) {
            this.gender = IntlMoreGender.new_();
        }
        if (this.tttribe == null) {
            this.tttribe = TribeSetting.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public SettingGroups subtract(SettingGroups settingGroups) {
        SettingGroups settingGroups2 = new SettingGroups();
        if (!ValueObject.util_equals(this.type, settingGroups.type)) {
            settingGroups2.type = this.type;
        }
        if (!ValueObject.util_equals(this.boost, settingGroups.boost)) {
            settingGroups2.boost = this.boost;
        }
        if (!ValueObject.util_equals(this.live, settingGroups.live)) {
            settingGroups2.live = this.live;
        }
        UserPrivacySettings userPrivacySettings = this.privacy;
        if (userPrivacySettings != null) {
            settingGroups2.privacy = userPrivacySettings.subtract(settingGroups.privacy);
        }
        UserPushSettings userPushSettings = this.push;
        if (userPushSettings != null) {
            settingGroups2.push = userPushSettings.subtract(settingGroups.push);
        }
        UserSearchSettings userSearchSettings = this.search;
        if (userSearchSettings != null) {
            settingGroups2.search = userSearchSettings.subtract(settingGroups.search);
        }
        if (!ValueObject.util_equals(this.subscription, settingGroups.subscription)) {
            settingGroups2.subscription = this.subscription;
        }
        if (!ValueObject.util_equals(this.fake, settingGroups.fake)) {
            settingGroups2.fake = this.fake;
        }
        if (!ValueObject.util_equals(this.svip, settingGroups.svip)) {
            settingGroups2.svip = this.svip;
        }
        if (!ValueObject.util_equals(this.svipPrivacy, settingGroups.svipPrivacy)) {
            settingGroups2.svipPrivacy = this.svipPrivacy;
        }
        if (!ValueObject.util_equals(this.see, settingGroups.see)) {
            settingGroups2.see = this.see;
        }
        if (!ValueObject.util_equals(this.diamondVIP, settingGroups.diamondVIP)) {
            settingGroups2.diamondVIP = this.diamondVIP;
        }
        if (!ValueObject.util_equals(this.diamondVIPPrivateMatch, settingGroups.diamondVIPPrivateMatch)) {
            settingGroups2.diamondVIPPrivateMatch = this.diamondVIPPrivateMatch;
        }
        if (!ValueObject.util_equals(this.soulchat, settingGroups.soulchat)) {
            settingGroups2.soulchat = this.soulchat;
        }
        if (!ValueObject.util_equals(this.quickchatchat, settingGroups.quickchatchat)) {
            settingGroups2.quickchatchat = this.quickchatchat;
        }
        if (!ValueObject.util_equals(this.soulmate, settingGroups.soulmate)) {
            settingGroups2.soulmate = this.soulmate;
        }
        if (!ValueObject.util_equals(this.share, settingGroups.share)) {
            settingGroups2.share = this.share;
        }
        if (!ValueObject.util_equals(this.decoration, settingGroups.decoration)) {
            settingGroups2.decoration = this.decoration;
        }
        if (!ValueObject.util_equals(this.comDiamond, settingGroups.comDiamond)) {
            settingGroups2.comDiamond = this.comDiamond;
        }
        if (!ValueObject.util_equals(this.characterEvaluate, settingGroups.characterEvaluate)) {
            settingGroups2.characterEvaluate = this.characterEvaluate;
        }
        if (!ValueObject.util_equals(this.pet, settingGroups.pet)) {
            settingGroups2.pet = this.pet;
        }
        if (!ValueObject.util_equals(this.momentLevel, settingGroups.momentLevel)) {
            settingGroups2.momentLevel = this.momentLevel;
        }
        VipSearchSettings vipSearchSettings = this.vipSearch;
        if (vipSearchSettings != null) {
            settingGroups2.vipSearch = vipSearchSettings.subtract(settingGroups.vipSearch);
        }
        UserMomentSettings userMomentSettings = this.moment;
        if (userMomentSettings != null) {
            settingGroups2.moment = userMomentSettings.subtract(settingGroups.moment);
        }
        if (!ValueObject.util_equals(this.profile, settingGroups.profile)) {
            settingGroups2.profile = this.profile;
        }
        if (!ValueObject.util_equals(this.pvip, settingGroups.pvip)) {
            settingGroups2.pvip = this.pvip;
        }
        if (!ValueObject.util_equals(this.marriage, settingGroups.marriage)) {
            settingGroups2.marriage = this.marriage;
        }
        if (!ValueObject.util_equals(this.cityC, settingGroups.cityC)) {
            settingGroups2.cityC = this.cityC;
        }
        if (!ValueObject.util_equals(this.spvip, settingGroups.spvip)) {
            settingGroups2.spvip = this.spvip;
        }
        if (!ValueObject.util_equals(this.growth, settingGroups.growth)) {
            settingGroups2.growth = this.growth;
        }
        if (!ValueObject.util_equals(this.fvip, settingGroups.fvip)) {
            settingGroups2.fvip = this.fvip;
        }
        if (!ValueObject.util_equals(this.svipSearch, settingGroups.svipSearch)) {
            settingGroups2.svipSearch = this.svipSearch;
        }
        if (!ValueObject.util_equals(this.noPush, settingGroups.noPush)) {
            settingGroups2.noPush = this.noPush;
        }
        if (!ValueObject.util_equals(this.adsMaterialRouter, settingGroups.adsMaterialRouter)) {
            settingGroups2.adsMaterialRouter = this.adsMaterialRouter;
        }
        if (!ValueObject.util_equals(this.upvip, settingGroups.upvip)) {
            settingGroups2.upvip = this.upvip;
        }
        IntlMoreGender intlMoreGender = this.gender;
        if (intlMoreGender != null) {
            settingGroups2.gender = intlMoreGender.subtract(settingGroups.gender);
        }
        if (!ValueObject.util_equals(this.tttribe, settingGroups.tttribe)) {
            settingGroups2.tttribe = this.tttribe;
        }
        if (settingGroups2.equals(new SettingGroups())) {
            return null;
        }
        return settingGroups2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
