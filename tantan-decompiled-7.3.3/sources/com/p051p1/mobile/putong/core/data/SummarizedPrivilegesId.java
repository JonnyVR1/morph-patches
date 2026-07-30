package com.p051p1.mobile.putong.core.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes10.dex */
public class SummarizedPrivilegesId extends TEnum {
    public static final TEnumJsonAdapter<SummarizedPrivilegesId> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SummarizedPrivilegesId> PROTOBUF_ADAPTER;
    private static final Map<String, SummarizedPrivilegesId> _SummarizedPrivilegesId;
    public static final String acceleratePairing = "acceleratePairing";
    public static final String advancedDiscoveryMembership = "advancedDiscoveryMembership";
    public static final String advancedSearch = "advancedSearch";
    public static final String aiChatAdvice = "aiChatAdvice";
    public static final String aiChatAnalysis = "aiChatAnalysis";
    public static final String aiChatCompanion = "aiChatCompanion";
    public static final String blindBoxNum = "blindBoxNum";
    public static final String boost = "boost";
    public static final String broadcast = "broadcast";
    public static final String buzzMatch = "buzzMatch";
    public static final String buzzMemojiMatch = "buzzMemojiMatch";
    public static final String buzzProlong = "buzzProlong";
    public static final String buzzSpeedUp = "buzzSpeedUp";
    public static final String buzzVideoMatch = "buzzVideoMatch";
    public static final String buzzVoiceMatch = "buzzVoiceMatch";
    public static final String coinSee = "coinSee";
    public static final String compliment = "compliment";
    public static final String diamondVIP = "diamondVIP";
    public static final String femaleVip = "femaleVip";
    public static final String freePicks = "freePicks";
    public static final String friendship = "friendship";
    public static final String greetGift = "greetGift";
    public static final String greetNumber = "greetNumber";
    public static final String instantChat = "instantChat";
    private static final int int_advancedDiscoveryMembership = 12;
    private static final int int_advancedSearch = 44;
    private static final int int_boost = 22;
    private static final int int_broadcast = 19;
    private static final int int_coinSee = 36;
    private static final int int_diamondVIP = 29;
    private static final int int_freePicks = 6;
    private static final int int_friendship = 32;
    private static final int int_intlReadMessage = 42;
    private static final int int_letter = 10;
    private static final int int_letterMembership = 9;
    private static final int int_livechatAccelerate = 2;
    private static final int int_livechatMembership = 8;
    private static final int int_livechatNumber = 3;
    private static final int int_peek = 11;
    private static final int int_picks = 37;
    private static final int int_picksMembership = 5;
    private static final int int_picksX10 = 38;
    private static final int int_picksX20 = 39;
    private static final int int_picksX30 = 40;
    private static final int int_popCard = 35;
    private static final int int_premiumMembership = 1;
    private static final int int_privacyMembership = 4;
    private static final int int_privateMatch = 30;
    private static final int int_privilegeTabSuperLike = 24;
    private static final int int_quickchatDelayer = 23;
    private static final int int_quickchatMembership = 15;
    private static final int int_quickchatNumber = 14;
    private static final int int_quickchatPeek = 16;
    private static final int int_readMessage = 26;
    private static final int int_readMessagesMembership = 13;
    private static final int int_readMessagesNumber = 20;
    private static final int int_revokeUnPair = 25;
    private static final int int_roaming = 43;
    private static final int int_roamingCard = 33;
    private static final int int_sameCityCard = 34;
    private static final int int_sayHello = 31;
    private static final int int_sayHi = 7;
    private static final int int_selectedCards = 17;
    private static final int int_superLike = 21;
    private static final int int_svip = 0;
    private static final int int_svipPicksMembership = 41;
    private static final int int_svipTest201904 = 18;
    private static final int int_trialDiamondVIP = 28;
    private static final int int_unknown_ = -1;
    private static final int int_unlimitedSwipes = 27;
    private static final int int_voiceQuickchatNum = 45;
    public static final String intlReadMessage = "intlReadMessage";
    public static final String letter = "letter";
    public static final String letterMembership = "letterMembership";
    public static final String limitedTrialSee = "limitedTrialSee";
    public static final String livechatAccelerate = "livechatAccelerate";
    public static final String livechatMembership = "livechatMembership";
    public static final String livechatNumber = "livechatNumber";
    public static final String minBoost = "minBoost";
    public static final String momentBoostCounter = "momentBoostCounter";
    public static final String oDiamond = "oDiamond";
    public static final String peek = "peek";
    public static final String picks = "picks";
    public static final String picksMembership = "picksMembership";
    public static final String picksX10 = "picksX10";
    public static final String picksX20 = "picksX20";
    public static final String picksX30 = "picksX30";
    public static final String pinChat = "pinChat";
    public static final String pinLike = "pinLike";
    public static final String platinum = "platinum";
    public static final String popCard = "popCard";
    public static final String preConfession = "preConfession";
    public static final String premiumMembership = "premiumMembership";
    public static final String privacyMembership = "privacyMembership";
    public static final String privateCustom = "privateCustom";
    public static final String privateMatch = "privateMatch";
    public static final String privilegeTabSuperLike = "privilegeTabSuperLike";
    public static final String profileLike = "profileLike";
    public static final String quickchatDelayer = "quickchatDelayer";
    public static final String quickchatMembership = "quickchatMembership";
    public static final String quickchatNumber = "quickchatNumber";
    public static final String quickchatNumberX1 = "quickchatNumberX1";
    public static final String quickchatNumberX10 = "quickchatNumberX10";
    public static final String quickchatNumberX5 = "quickchatNumberX5";
    public static final String quickchatPeek = "quickchatPeek";
    public static final String quickchatSpeedUpNum = "quickchatSpeedUpNum";
    public static final String quickchatSpeedUpNumX1 = "quickchatSpeedUpNumX1";
    public static final String quickchatSpeedUpNumX10 = "quickchatSpeedUpNumX10";
    public static final String quickchatSpeedUpNumX20 = "quickchatSpeedUpNumX20";
    public static final String readMessage = "readMessage";
    public static final String readMessagesMembership = "readMessagesMembership";
    public static final String readMessagesNumber = "readMessagesNumber";
    public static final String revokeUnPair = "revokeUnPair";
    public static final String roaming = "roaming";
    public static final String roamingCard = "roamingCard";
    public static final String sameCityCard = "sameCityCard";
    public static final String sayHello = "sayHello";
    public static final String sayHi = "sayHi";
    public static final String seeWhoLikedMe = "seeWhoLikedMe";
    public static final String seekPartnerNum = "seekPartnerNum";
    public static final String selectedCards = "selectedCards";
    public static final String spotLight = "spotLight";
    public static final String suggestTopShow = "suggestTopShow";
    public static final String superLike = "superLike";
    public static final String superLikeMembership = "superLikeMembership";
    public static final String superlikeX10 = "superlikeX10";
    public static final String superlikeX20 = "superlikeX20";
    public static final String superlikeX5 = "superlikeX5";
    public static final String superlikeX50 = "superlikeX50";
    protected static HashSet<String> supportEnum = null;
    public static final String supremePartner = "supremePartner";
    public static final String svip = "svip";
    public static final String svipPicksMembership = "svipPicksMembership";
    public static final String svipTest201904 = "svipTest201904";
    public static final String trialDiamondVIP = "trialDiamondVIP";
    public static final String ultraPremium = "ultraPremium";
    public static final String undoMembership = "undoMembership";
    public static final String unknown_ = "unknown_";
    public static final String unlimitedSwipes = "unlimitedSwipes";
    public static final String vip = "vip";
    public static final String visitorHidden = "visitorHidden";
    public static final String voiceQuickchatNum = "voiceQuickchatNum";
    public static final String voiceQuickchatNumX1 = "voiceQuickchatNumX1";
    public static final String voiceQuickchatNumX10 = "voiceQuickchatNumX10";
    public static final String voiceQuickchatNumX5 = "voiceQuickchatNumX5";
    public static final String youthVip = "youthVip";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SummarizedPrivilegesId> tEnumJsonAdapter = new TEnumJsonAdapter<SummarizedPrivilegesId>() { // from class: com.p1.mobile.putong.core.data.SummarizedPrivilegesId.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SummarizedPrivilegesId newTEnum(String str, int i) {
                return SummarizedPrivilegesId.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SummarizedPrivilegesId>() { // from class: com.p1.mobile.putong.core.data.SummarizedPrivilegesId.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SummarizedPrivilegesId newTEnum(String str, int i) {
                return SummarizedPrivilegesId.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("svip", 0);
        tEnumJsonAdapter.addExtJsonValue("premiumMembership", 1);
        tEnumJsonAdapter.addExtJsonValue(livechatAccelerate, 2);
        tEnumJsonAdapter.addExtJsonValue("livechatNumber", 3);
        tEnumJsonAdapter.addExtJsonValue(privacyMembership, 4);
        tEnumJsonAdapter.addExtJsonValue("picksMembership", 5);
        tEnumJsonAdapter.addExtJsonValue(freePicks, 6);
        tEnumJsonAdapter.addExtJsonValue("sayHi", 7);
        tEnumJsonAdapter.addExtJsonValue("livechatMembership", 8);
        tEnumJsonAdapter.addExtJsonValue(letterMembership, 9);
        tEnumJsonAdapter.addExtJsonValue("letter", 10);
        tEnumJsonAdapter.addExtJsonValue("peek", 11);
        tEnumJsonAdapter.addExtJsonValue(advancedDiscoveryMembership, 12);
        tEnumJsonAdapter.addExtJsonValue(readMessagesMembership, 13);
        tEnumJsonAdapter.addExtJsonValue("quickchatNumber", 14);
        tEnumJsonAdapter.addExtJsonValue("quickchatMembership", 15);
        tEnumJsonAdapter.addExtJsonValue("quickchatPeek", 16);
        tEnumJsonAdapter.addExtJsonValue("selectedCards", 17);
        tEnumJsonAdapter.addExtJsonValue("svipTest201904", 18);
        tEnumJsonAdapter.addExtJsonValue("broadcast", 19);
        tEnumJsonAdapter.addExtJsonValue("readMessagesNumber", 20);
        tEnumJsonAdapter.addExtJsonValue("superLike", 21);
        tEnumJsonAdapter.addExtJsonValue("boost", 22);
        tEnumJsonAdapter.addExtJsonValue(quickchatDelayer, 23);
        tEnumJsonAdapter.addExtJsonValue(privilegeTabSuperLike, 24);
        tEnumJsonAdapter.addExtJsonValue(revokeUnPair, 25);
        tEnumJsonAdapter.addExtJsonValue(readMessage, 26);
        tEnumJsonAdapter.addExtJsonValue("unlimitedSwipes", 27);
        tEnumJsonAdapter.addExtJsonValue(trialDiamondVIP, 28);
        tEnumJsonAdapter.addExtJsonValue("diamondVIP", 29);
        tEnumJsonAdapter.addExtJsonValue("privateMatch", 30);
        tEnumJsonAdapter.addExtJsonValue(sayHello, 31);
        tEnumJsonAdapter.addExtJsonValue(friendship, 32);
        tEnumJsonAdapter.addExtJsonValue(roamingCard, 33);
        tEnumJsonAdapter.addExtJsonValue(sameCityCard, 34);
        tEnumJsonAdapter.addExtJsonValue(popCard, 35);
        tEnumJsonAdapter.addExtJsonValue(coinSee, 36);
        tEnumJsonAdapter.addExtJsonValue("picks", 37);
        tEnumJsonAdapter.addExtJsonValue(picksX10, 38);
        tEnumJsonAdapter.addExtJsonValue(picksX20, 39);
        tEnumJsonAdapter.addExtJsonValue(picksX30, 40);
        tEnumJsonAdapter.addExtJsonValue("svipPicksMembership", 41);
        tEnumJsonAdapter.addExtJsonValue("intlReadMessage", 42);
        tEnumJsonAdapter.addExtJsonValue("roaming", 43);
        tEnumJsonAdapter.addExtJsonValue(advancedSearch, 44);
        tEnumJsonAdapter.addExtJsonValue("voiceQuickchatNum", 45);
        supportEnum.add("svip");
        supportEnum.add("premiumMembership");
        supportEnum.add(livechatAccelerate);
        supportEnum.add("livechatNumber");
        supportEnum.add(privacyMembership);
        supportEnum.add("picksMembership");
        supportEnum.add(freePicks);
        supportEnum.add("sayHi");
        supportEnum.add("livechatMembership");
        supportEnum.add(letterMembership);
        supportEnum.add("letter");
        supportEnum.add("peek");
        supportEnum.add(advancedDiscoveryMembership);
        supportEnum.add(readMessagesMembership);
        supportEnum.add("quickchatNumber");
        supportEnum.add("quickchatMembership");
        supportEnum.add("quickchatPeek");
        supportEnum.add("selectedCards");
        supportEnum.add("svipTest201904");
        supportEnum.add("broadcast");
        supportEnum.add("readMessagesNumber");
        supportEnum.add("superLike");
        supportEnum.add("boost");
        supportEnum.add(quickchatDelayer);
        supportEnum.add(privilegeTabSuperLike);
        supportEnum.add(revokeUnPair);
        supportEnum.add(readMessage);
        supportEnum.add("unlimitedSwipes");
        supportEnum.add(trialDiamondVIP);
        supportEnum.add("diamondVIP");
        supportEnum.add("privateMatch");
        supportEnum.add(sayHello);
        supportEnum.add(friendship);
        supportEnum.add(roamingCard);
        supportEnum.add(sameCityCard);
        supportEnum.add(popCard);
        supportEnum.add(coinSee);
        supportEnum.add("picks");
        supportEnum.add(picksX10);
        supportEnum.add(picksX20);
        supportEnum.add(picksX30);
        supportEnum.add("svipPicksMembership");
        supportEnum.add("intlReadMessage");
        supportEnum.add("roaming");
        supportEnum.add(advancedSearch);
        supportEnum.add("voiceQuickchatNum");
        supportEnum.add(quickchatSpeedUpNum);
        supportEnum.add(quickchatSpeedUpNumX1);
        supportEnum.add(quickchatSpeedUpNumX10);
        supportEnum.add(quickchatSpeedUpNumX20);
        supportEnum.add(quickchatNumberX1);
        supportEnum.add(quickchatNumberX5);
        supportEnum.add(quickchatNumberX10);
        supportEnum.add(voiceQuickchatNumX1);
        supportEnum.add(voiceQuickchatNumX5);
        supportEnum.add(voiceQuickchatNumX10);
        supportEnum.add("greetGift");
        supportEnum.add("oDiamond");
        supportEnum.add(spotLight);
        supportEnum.add(minBoost);
        supportEnum.add("seeWhoLikedMe");
        supportEnum.add(greetNumber);
        supportEnum.add(buzzMatch);
        supportEnum.add(buzzSpeedUp);
        supportEnum.add(buzzProlong);
        supportEnum.add(profileLike);
        supportEnum.add("vip");
        supportEnum.add("instantChat");
        supportEnum.add(superlikeX5);
        supportEnum.add(superlikeX10);
        supportEnum.add(superlikeX20);
        supportEnum.add(superlikeX50);
        supportEnum.add("superLikeMembership");
        supportEnum.add("undoMembership");
        supportEnum.add(buzzVoiceMatch);
        supportEnum.add(buzzVideoMatch);
        supportEnum.add(buzzMemojiMatch);
        supportEnum.add(momentBoostCounter);
        supportEnum.add("acceleratePairing");
        supportEnum.add("platinum");
        supportEnum.add("pinLike");
        supportEnum.add(pinChat);
        supportEnum.add(suggestTopShow);
        supportEnum.add(supremePartner);
        supportEnum.add(visitorHidden);
        supportEnum.add(preConfession);
        supportEnum.add("femaleVip");
        supportEnum.add("youthVip");
        supportEnum.add("seekPartnerNum");
        supportEnum.add(blindBoxNum);
        supportEnum.add("privateCustom");
        supportEnum.add("limitedTrialSee");
        supportEnum.add(aiChatAnalysis);
        supportEnum.add(aiChatAdvice);
        supportEnum.add(ultraPremium);
        supportEnum.add(aiChatCompanion);
        supportEnum.add("compliment");
        _SummarizedPrivilegesId = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SummarizedPrivilegesId(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SummarizedPrivilegesId> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SummarizedPrivilegesId> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SummarizedPrivilegesId> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, SummarizedPrivilegesId> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SummarizedPrivilegesId get(String str) {
        Map<String, SummarizedPrivilegesId> map = _SummarizedPrivilegesId;
        SummarizedPrivilegesId summarizedPrivilegesId = map.get(str);
        if (summarizedPrivilegesId == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            summarizedPrivilegesId = integer == null ? new SummarizedPrivilegesId(str, -1) : new SummarizedPrivilegesId(str, integer.intValue());
            map.put(str, summarizedPrivilegesId);
        }
        return summarizedPrivilegesId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SummarizedPrivilegesId getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SummarizedPrivilegesId> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SummarizedPrivilegesId> oldEnumCovertMap(Map<String, Integer> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            l01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return l01Var;
    }

    public boolean equals(String str) {
        return name().equals(str);
    }

    public boolean isUnknownType() {
        if (equals("unknown_")) {
            return true;
        }
        return !supportEnum.contains(this.name);
    }

    private static SummarizedPrivilegesId get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
