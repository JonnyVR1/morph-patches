package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ProductCategory extends TEnum {
    public static final TEnumJsonAdapter<ProductCategory> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ProductCategory> PROTOBUF_ADAPTER;
    public static final String Promo_premiumUpgradeToUltra = "Promo_premiumUpgradeToUltra";
    private static final Map<String, ProductCategory> _ProductCategory;
    public static final String acceleratePairing = "acceleratePairing";
    public static final String boost = "boost";
    public static final String broadcast = "broadcast";
    public static final String coin = "coin";
    public static final String customCoin = "customCoin";
    public static final String dePaySee = "dePaySee";
    public static final String dePayUnlimitedSwipeVip = "dePayUnlimitedSwipeVip";
    public static final String dePayVip = "dePayVip";
    public static final String diamondVIP = "diamondVIP";
    public static final String femaleVip = "femaleVip";
    public static final String gift = "gift";
    private static final int int_boost = 2;
    private static final int int_broadcast = 27;
    private static final int int_coin = 4;
    private static final int int_customCoin = 25;
    private static final int int_dePaySee = 35;
    private static final int int_dePayUnlimitedSwipeVip = 36;
    private static final int int_dePayVip = 34;
    private static final int int_diamondVIP = 29;
    private static final int int_gift = 5;
    private static final int int_intlReadMessage = 40;
    private static final int int_kouKuanShiBaiSVip = 37;
    private static final int int_kouKuanShiBaiVip = 38;
    private static final int int_letter = 21;
    private static final int int_letterMembership3 = 22;
    private static final int int_likeDailyQuota = 17;
    private static final int int_livechatMembership = 15;
    private static final int int_livechatNumber = 14;
    private static final int int_noneLiveCoin = 31;
    private static final int int_peek = 13;
    private static final int int_peekCoin = 33;
    private static final int int_peeperVip = 6;
    private static final int int_picks = 10;
    private static final int int_picksMembership = 9;
    private static final int int_poiChallenge = 23;
    private static final int int_premiumMembership = 7;
    private static final int int_quickchatMembership = 18;
    private static final int int_quickchatNumber = 19;
    private static final int int_quickchatPeek = 20;
    private static final int int_readMessagesNumber = 30;
    private static final int int_redPacket = 12;
    private static final int int_sayHi = 16;
    private static final int int_seeWhoLikedMe = 66;
    private static final int int_selectedCards = 24;
    private static final int int_specialPromotionSeeWhoLikedMe = 28;
    private static final int int_superLike = 3;
    private static final int int_svip = 8;
    private static final int int_svipPicksMembership = 39;
    private static final int int_svipTest201904 = 26;
    private static final int int_unknown_ = -1;
    private static final int int_unlockPreMatch = 11;
    private static final int int_vip = 65;
    private static final int int_vipAndSeeWhoLikedMe = 32;
    private static final int int_voiceQuickchatNum = 41;
    public static final String intlPayCoolsBill = "intlPayCoolsBill";
    public static final String intlPayCoolsGCash = "intlPayCoolsGCash";
    public static final String intlReadMessage = "intlReadMessage";
    public static final String kouKuanShiBaiSVip = "kouKuanShiBaiSVip";
    public static final String kouKuanShiBaiVip = "kouKuanShiBaiVip";
    public static final String letter = "letter";
    public static final String letterMembership3 = "letterMembership3";
    public static final String likeDailyQuota = "likeDailyQuota";
    public static final String limitedTrialSee = "limitedTrialSee";
    public static final String livechatMembership = "livechatMembership";
    public static final String livechatNumber = "livechatNumber";
    public static final String localVipPkg = "localVipPkg";
    public static final String momentCoin = "momentCoin";
    public static final String noneLiveCoin = "noneLiveCoin";
    public static final String oDiamond = "oDiamond";
    public static final String oDiamondPrivateCustom = "oDiamondPrivateCustom";
    public static final String peek = "peek";
    public static final String peekCoin = "peekCoin";
    public static final String peeperVip = "peeperVip";
    public static final String picks = "picks";
    public static final String picksMembership = "picksMembership";
    public static final String platinum = "platinum";
    public static final String poiChallenge = "poiChallenge";
    public static final String premiumMembership = "premiumMembership";
    public static final String privateCustom = "privateCustom";
    public static final String quickchatMembership = "quickchatMembership";
    public static final String quickchatNumber = "quickchatNumber";
    public static final String quickchatPeek = "quickchatPeek";
    public static final String readMessagesNumber = "readMessagesNumber";
    public static final String redPacket = "redPacket";
    public static final String roaming = "roaming";
    public static final String sayHi = "sayHi";
    public static final String sayHiPkg = "sayHiPkg";
    public static final String seeWhoLikedMe = "seeWhoLikedMe";
    public static final String selectedCards = "selectedCards";
    public static final String specialPromotionSeeWhoLikedMe = "specialPromotionSeeWhoLikedMe";
    public static final String superLike = "superLike";
    public static final String superLikeMembership = "superLikeMembership";
    public static final String superboost = "superboost";
    protected static HashSet<String> supportEnum = null;
    public static final String svip = "svip";
    public static final String svipPicksMembership = "svipPicksMembership";
    public static final String svipTest201904 = "svipTest201904";
    public static final String tttBoost = "tttBoost";
    public static final String tttCoin = "tttCoin";
    public static final String tttCompliment = "tttCompliment";
    public static final String tttDiamond = "tttDiamond";
    public static final String tttInstantChat = "tttInstantChat";
    public static final String tttLiveCoin = "tttLiveCoin";
    public static final String tttPremiumUpgradeToUltra = "tttPremiumUpgradeToUltra";
    public static final String tttSeeUpgradeToPremium = "tttSeeUpgradeToPremium";
    public static final String tttSeeWhoLikedMe = "tttSeeWhoLikedMe";
    public static final String tttSuperLike = "tttSuperLike";
    public static final String tttSvipGoogleplay = "tttSvipGoogleplay";
    public static final String tttSvipGoogleplayFreeTrial = "tttSvipGoogleplayFreeTrial";
    public static final String tttUltraPremium = "tttUltraPremium";
    public static final String tttVip = "tttVip";
    public static final String tttVipUpgradeToPremium = "tttVipUpgradeToPremium";
    public static final String undoMembership = "undoMembership";
    public static final String unknown_ = "unknown_";
    public static final String unlimitedSwipes = "unlimitedSwipes";
    public static final String unlockPreMatch = "unlockPreMatch";
    public static final String vip = "vip";
    public static final String vipAndSeeWhoLikedMe = "vipAndSeeWhoLikedMe";
    public static final String voiceQuickchatNum = "voiceQuickchatNum";
    public static final String youthVip = "youthVip";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ProductCategory> tEnumJsonAdapter = new TEnumJsonAdapter<ProductCategory>() { // from class: com.p1.mobile.putong.core.data.ProductCategory.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ProductCategory m14903newTEnum(String str, int i) {
                return ProductCategory.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ProductCategory>() { // from class: com.p1.mobile.putong.core.data.ProductCategory.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ProductCategory m14904newTEnum(String str, int i) {
                return ProductCategory.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("boost", 2);
        tEnumJsonAdapter.addExtJsonValue("superLike", 3);
        tEnumJsonAdapter.addExtJsonValue("coin", int_coin);
        tEnumJsonAdapter.addExtJsonValue("gift", 5);
        tEnumJsonAdapter.addExtJsonValue(peeperVip, int_peeperVip);
        tEnumJsonAdapter.addExtJsonValue("premiumMembership", int_premiumMembership);
        tEnumJsonAdapter.addExtJsonValue("svip", int_svip);
        tEnumJsonAdapter.addExtJsonValue("picksMembership", int_picksMembership);
        tEnumJsonAdapter.addExtJsonValue("picks", 10);
        tEnumJsonAdapter.addExtJsonValue(unlockPreMatch, int_unlockPreMatch);
        tEnumJsonAdapter.addExtJsonValue("redPacket", int_redPacket);
        tEnumJsonAdapter.addExtJsonValue("peek", int_peek);
        tEnumJsonAdapter.addExtJsonValue("livechatNumber", int_livechatNumber);
        tEnumJsonAdapter.addExtJsonValue("livechatMembership", int_livechatMembership);
        tEnumJsonAdapter.addExtJsonValue("sayHi", int_sayHi);
        tEnumJsonAdapter.addExtJsonValue(likeDailyQuota, int_likeDailyQuota);
        tEnumJsonAdapter.addExtJsonValue("quickchatMembership", int_quickchatMembership);
        tEnumJsonAdapter.addExtJsonValue("quickchatNumber", int_quickchatNumber);
        tEnumJsonAdapter.addExtJsonValue("quickchatPeek", int_quickchatPeek);
        tEnumJsonAdapter.addExtJsonValue("letter", int_letter);
        tEnumJsonAdapter.addExtJsonValue(letterMembership3, int_letterMembership3);
        tEnumJsonAdapter.addExtJsonValue(poiChallenge, int_poiChallenge);
        tEnumJsonAdapter.addExtJsonValue("selectedCards", int_selectedCards);
        tEnumJsonAdapter.addExtJsonValue(customCoin, int_customCoin);
        tEnumJsonAdapter.addExtJsonValue("svipTest201904", int_svipTest201904);
        tEnumJsonAdapter.addExtJsonValue("broadcast", int_broadcast);
        tEnumJsonAdapter.addExtJsonValue(specialPromotionSeeWhoLikedMe, int_specialPromotionSeeWhoLikedMe);
        tEnumJsonAdapter.addExtJsonValue("diamondVIP", int_diamondVIP);
        tEnumJsonAdapter.addExtJsonValue("readMessagesNumber", int_readMessagesNumber);
        tEnumJsonAdapter.addExtJsonValue(noneLiveCoin, int_noneLiveCoin);
        tEnumJsonAdapter.addExtJsonValue(vipAndSeeWhoLikedMe, int_vipAndSeeWhoLikedMe);
        tEnumJsonAdapter.addExtJsonValue(peekCoin, int_peekCoin);
        tEnumJsonAdapter.addExtJsonValue(dePayVip, int_dePayVip);
        tEnumJsonAdapter.addExtJsonValue(dePaySee, int_dePaySee);
        tEnumJsonAdapter.addExtJsonValue(dePayUnlimitedSwipeVip, int_dePayUnlimitedSwipeVip);
        tEnumJsonAdapter.addExtJsonValue(kouKuanShiBaiSVip, int_kouKuanShiBaiSVip);
        tEnumJsonAdapter.addExtJsonValue(kouKuanShiBaiVip, int_kouKuanShiBaiVip);
        tEnumJsonAdapter.addExtJsonValue("svipPicksMembership", int_svipPicksMembership);
        tEnumJsonAdapter.addExtJsonValue("intlReadMessage", int_intlReadMessage);
        tEnumJsonAdapter.addExtJsonValue("voiceQuickchatNum", int_voiceQuickchatNum);
        tEnumJsonAdapter.addExtJsonValue("vip", int_vip);
        tEnumJsonAdapter.addExtJsonValue("seeWhoLikedMe", int_seeWhoLikedMe);
        supportEnum.add(tttVip);
        supportEnum.add(tttSeeWhoLikedMe);
        supportEnum.add("boost");
        supportEnum.add("superLike");
        supportEnum.add("coin");
        supportEnum.add("gift");
        supportEnum.add(peeperVip);
        supportEnum.add("premiumMembership");
        supportEnum.add("svip");
        supportEnum.add("picksMembership");
        supportEnum.add("picks");
        supportEnum.add(unlockPreMatch);
        supportEnum.add("redPacket");
        supportEnum.add("peek");
        supportEnum.add("livechatNumber");
        supportEnum.add("livechatMembership");
        supportEnum.add("sayHi");
        supportEnum.add(likeDailyQuota);
        supportEnum.add("quickchatMembership");
        supportEnum.add("quickchatNumber");
        supportEnum.add("quickchatPeek");
        supportEnum.add("letter");
        supportEnum.add(letterMembership3);
        supportEnum.add(poiChallenge);
        supportEnum.add("selectedCards");
        supportEnum.add(customCoin);
        supportEnum.add("svipTest201904");
        supportEnum.add("broadcast");
        supportEnum.add(specialPromotionSeeWhoLikedMe);
        supportEnum.add("diamondVIP");
        supportEnum.add("readMessagesNumber");
        supportEnum.add(noneLiveCoin);
        supportEnum.add(vipAndSeeWhoLikedMe);
        supportEnum.add(peekCoin);
        supportEnum.add(dePayVip);
        supportEnum.add(dePaySee);
        supportEnum.add(dePayUnlimitedSwipeVip);
        supportEnum.add(kouKuanShiBaiSVip);
        supportEnum.add(kouKuanShiBaiVip);
        supportEnum.add("svipPicksMembership");
        supportEnum.add("intlReadMessage");
        supportEnum.add("voiceQuickchatNum");
        supportEnum.add("oDiamond");
        supportEnum.add(superboost);
        supportEnum.add(tttSvipGoogleplay);
        supportEnum.add(intlPayCoolsGCash);
        supportEnum.add(intlPayCoolsBill);
        supportEnum.add("roaming");
        supportEnum.add("superLikeMembership");
        supportEnum.add("undoMembership");
        supportEnum.add("unlimitedSwipes");
        supportEnum.add(localVipPkg);
        supportEnum.add(sayHiPkg);
        supportEnum.add(momentCoin);
        supportEnum.add("acceleratePairing");
        supportEnum.add("platinum");
        supportEnum.add(tttSvipGoogleplayFreeTrial);
        supportEnum.add("femaleVip");
        supportEnum.add("youthVip");
        supportEnum.add("privateCustom");
        supportEnum.add(oDiamondPrivateCustom);
        supportEnum.add("limitedTrialSee");
        supportEnum.add(tttUltraPremium);
        supportEnum.add(tttDiamond);
        supportEnum.add(tttInstantChat);
        supportEnum.add("vip");
        supportEnum.add("seeWhoLikedMe");
        supportEnum.add(tttSuperLike);
        supportEnum.add(tttVipUpgradeToPremium);
        supportEnum.add(tttSeeUpgradeToPremium);
        supportEnum.add(tttPremiumUpgradeToUltra);
        supportEnum.add(Promo_premiumUpgradeToUltra);
        supportEnum.add(tttBoost);
        supportEnum.add(tttCoin);
        supportEnum.add(tttLiveCoin);
        supportEnum.add(tttCompliment);
        _ProductCategory = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ProductCategory(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ProductCategory> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProductCategory> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ProductCategory> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ProductCategory> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ProductCategory get(String str) {
        Map<String, ProductCategory> map = _ProductCategory;
        ProductCategory productCategory = map.get(str);
        if (productCategory == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            productCategory = integer == null ? new ProductCategory(str, int_unknown_) : new ProductCategory(str, integer.intValue());
            map.put(str, productCategory);
        }
        return productCategory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProductCategory getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ProductCategory> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ProductCategory> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
            }
            e01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return e01Var;
    }

    public boolean equals(String str) {
        return name().equals(str);
    }

    public boolean isUnknownType() {
        if (equals("unknown_")) {
            return true;
        }
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static ProductCategory get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
