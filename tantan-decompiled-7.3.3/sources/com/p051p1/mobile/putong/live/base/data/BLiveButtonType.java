package com.p051p1.mobile.putong.live.base.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveButtonType extends TEnum {
    public static final TEnumJsonAdapter<BLiveButtonType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveButtonType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveButtonType> _BLiveButtonType;
    public static final String anchorDailyTask = "anchorDailyTask";
    public static final String beauty = "beauty";
    public static final String blackList = "blackList";
    public static final String callApply = "callApply";
    public static final String callButton = "callButton";
    public static final String callButtonInput = "callButtonInput";
    public static final String chatManager = "chatManager";
    public static final String diamond = "diamond";
    public static final String dice = "dice";
    public static final String ear = "ear";
    public static final String emojiPlayPanel = "emojiPlayPanel";
    public static final String fastGiftButton = "fastGiftButton";
    public static final String firstRechargeButton = "firstRechargeButton";
    public static final String firstRechargeStimulus = "firstRechargeStimulus";
    public static final String gameLib = "gameLib";
    public static final String giftButton = "giftButton";
    public static final String giftResourceStatus = "giftResourceStatus";
    public static final String guideGift = "guideGift";
    private static final int int_anchorDailyTask = 25;
    private static final int int_beauty = 11;
    private static final int int_callApply = 18;
    private static final int int_callButton = 9;
    private static final int int_callButtonInput = 10;
    private static final int int_chatManager = 20;
    private static final int int_diamond = 30;
    private static final int int_dice = 23;
    private static final int int_ear = 16;
    private static final int int_fastGiftButton = 3;
    private static final int int_firstRechargeButton = 2;
    private static final int int_firstRechargeStimulus = 26;
    private static final int int_gameLib = 21;
    private static final int int_giftButton = 4;
    private static final int int_lotteryGiftRedpacket = 19;
    private static final int int_magicGesture = 15;
    private static final int int_multiCallButton = 28;
    private static final int int_multiCallButtonInput = 29;
    private static final int int_mute = 17;
    private static final int int_newUserTreasureBoxButton = 7;
    private static final int int_pkButton = 8;
    private static final int int_settingButton = 5;
    private static final int int_shareButton = 1;
    private static final int int_shootGame = 27;
    private static final int int_signIn = 22;
    private static final int int_sticker = 14;
    private static final int int_summonFans = 13;
    private static final int int_switchCamera = 12;
    private static final int int_timingFastGiftButton = 6;
    private static final int int_unknown_ = -1;
    private static final int int_userDailyTask = 24;
    private static final int int_voiceCommunicationButton = 0;
    public static final String intlGamePanel = "intlGamePanel";
    public static final String littleFlame = "littleFlame";
    public static final String lotteryGiftRedpacket = "lotteryGiftRedpacket";
    public static final String lt_funFair = "lt_funFair";
    public static final String luckyParadiseV2 = "luckyParadiseV2";
    public static final String magicGesture = "magicGesture";
    public static final String multiCallButton = "multiCallButton";
    public static final String multiCallButtonInput = "multiCallButtonInput";
    public static final String multiCallPkButton = "multiCallPkButton";
    public static final String mute = "mute";
    public static final String newUserTreasureBoxButton = "newUserTreasureBoxButton";
    public static final String onCallPk = "onCallPk";
    public static final String pkButton = "pkButton";
    public static final String setRoomBg = "setRoomBg";
    public static final String settingButton = "settingButton";
    public static final String shareButton = "shareButton";
    public static final String shootGame = "shootGame";
    public static final String signIn = "signIn";
    public static final String sticker = "sticker";
    public static final String summonFans = "summonFans";
    protected static HashSet<String> supportEnum = null;
    public static final String switchCamera = "switchCamera";
    public static final String timingFastGiftButton = "timingFastGiftButton";
    public static final String unknown_ = "unknown_";
    public static final String userDailyTask = "userDailyTask";
    public static final String voiceCommunicationButton = "voiceCommunicationButton";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveButtonType$a */
    public class C11697a extends TEnumJsonAdapter<BLiveButtonType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveButtonType newTEnum(String str, int i) {
            return BLiveButtonType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveButtonType$b */
    public class C11698b extends TEnumProtobufAdapter<BLiveButtonType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveButtonType newTEnum(String str, int i) {
            return BLiveButtonType.getForData(str, i);
        }
    }

    static {
        C11697a c11697a = new C11697a();
        JSON_ADAPTER = c11697a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11698b();
        c11697a.addExtJsonValue("unknown_", -1);
        c11697a.addExtJsonValue("voiceCommunicationButton", 0);
        c11697a.addExtJsonValue("shareButton", 1);
        c11697a.addExtJsonValue("firstRechargeButton", 2);
        c11697a.addExtJsonValue("fastGiftButton", 3);
        c11697a.addExtJsonValue("giftButton", 4);
        c11697a.addExtJsonValue("settingButton", 5);
        c11697a.addExtJsonValue(timingFastGiftButton, 6);
        c11697a.addExtJsonValue(newUserTreasureBoxButton, 7);
        c11697a.addExtJsonValue(pkButton, 8);
        c11697a.addExtJsonValue(callButton, 9);
        c11697a.addExtJsonValue(callButtonInput, 10);
        c11697a.addExtJsonValue("beauty", 11);
        c11697a.addExtJsonValue(switchCamera, 12);
        c11697a.addExtJsonValue(summonFans, 13);
        c11697a.addExtJsonValue("sticker", 14);
        c11697a.addExtJsonValue(magicGesture, 15);
        c11697a.addExtJsonValue(ear, 16);
        c11697a.addExtJsonValue(mute, 17);
        c11697a.addExtJsonValue(callApply, 18);
        c11697a.addExtJsonValue(lotteryGiftRedpacket, 19);
        c11697a.addExtJsonValue(chatManager, 20);
        c11697a.addExtJsonValue(gameLib, 21);
        c11697a.addExtJsonValue(signIn, 22);
        c11697a.addExtJsonValue(dice, 23);
        c11697a.addExtJsonValue(userDailyTask, 24);
        c11697a.addExtJsonValue(anchorDailyTask, 25);
        c11697a.addExtJsonValue(firstRechargeStimulus, 26);
        c11697a.addExtJsonValue("shootGame", 27);
        c11697a.addExtJsonValue(multiCallButton, 28);
        c11697a.addExtJsonValue(multiCallButtonInput, 29);
        c11697a.addExtJsonValue("diamond", 30);
        supportEnum.add("voiceCommunicationButton");
        supportEnum.add("shareButton");
        supportEnum.add("firstRechargeButton");
        supportEnum.add("fastGiftButton");
        supportEnum.add("giftButton");
        supportEnum.add("settingButton");
        supportEnum.add(timingFastGiftButton);
        supportEnum.add(newUserTreasureBoxButton);
        supportEnum.add(pkButton);
        supportEnum.add(callButton);
        supportEnum.add(callButtonInput);
        supportEnum.add("beauty");
        supportEnum.add(switchCamera);
        supportEnum.add(summonFans);
        supportEnum.add("sticker");
        supportEnum.add(magicGesture);
        supportEnum.add(ear);
        supportEnum.add(mute);
        supportEnum.add(callApply);
        supportEnum.add(lotteryGiftRedpacket);
        supportEnum.add(chatManager);
        supportEnum.add(gameLib);
        supportEnum.add(signIn);
        supportEnum.add(dice);
        supportEnum.add(userDailyTask);
        supportEnum.add(anchorDailyTask);
        supportEnum.add(firstRechargeStimulus);
        supportEnum.add("shootGame");
        supportEnum.add(multiCallButton);
        supportEnum.add(multiCallButtonInput);
        supportEnum.add("diamond");
        supportEnum.add(guideGift);
        supportEnum.add(setRoomBg);
        supportEnum.add("littleFlame");
        supportEnum.add(blackList);
        supportEnum.add(giftResourceStatus);
        supportEnum.add(multiCallPkButton);
        supportEnum.add(luckyParadiseV2);
        supportEnum.add(emojiPlayPanel);
        supportEnum.add(intlGamePanel);
        supportEnum.add(lt_funFair);
        supportEnum.add(onCallPk);
        _BLiveButtonType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveButtonType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveButtonType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveButtonType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveButtonType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveButtonType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveButtonType get(String str) {
        Map<String, BLiveButtonType> map = _BLiveButtonType;
        BLiveButtonType bLiveButtonType = map.get(str);
        if (bLiveButtonType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveButtonType = integer == null ? new BLiveButtonType(str, -1) : new BLiveButtonType(str, integer.intValue());
            map.put(str, bLiveButtonType);
        }
        return bLiveButtonType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveButtonType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveButtonType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveButtonType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveButtonType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
