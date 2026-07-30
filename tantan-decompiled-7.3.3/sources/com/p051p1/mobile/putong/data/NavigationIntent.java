package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class NavigationIntent extends TEnum {
    public static final TEnumJsonAdapter<NavigationIntent> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<NavigationIntent> PROTOBUF_ADAPTER;
    private static final Map<String, NavigationIntent> _NavigationIntent;
    public static final String cards = "cards";
    public static final String enterVoiceChat = "enterVoiceChat";
    public static final String fakealert = "fakealert";
    public static final String freeTrialPromotion = "freeTrialPromotion";
    public static final String gift = "gift";
    public static final String greetChat = "greetChat";
    public static final String heartbeatMatch = "heartbeatMatch";
    private static final int int_cards = 0;
    private static final int int_fakealert = 26;
    private static final int int_freeTrialPromotion = 19;
    private static final int int_gift = 6;
    private static final int int_greetChat = 32;
    private static final int int_introPromotion = 20;
    private static final int int_live = 24;
    private static final int int_liveAnchor = 17;
    private static final int int_menu = 1;
    private static final int int_messageItem = 21;
    private static final int int_moment = 8;
    private static final int int_partyDetail = 28;
    private static final int int_partyHall = 29;
    private static final int int_profile = 7;
    private static final int int_profile_edit = 11;
    private static final int int_profile_edit_continuous = 34;
    private static final int int_quickChatMatch = 31;
    private static final int int_quickchat = 18;
    private static final int int_secret_crush = 2;
    private static final int int_seeLikes = 12;
    private static final int int_seePicks = 35;
    private static final int int_seeSideMsg = 14;
    private static final int int_seeSideNewMsg = 16;
    private static final int int_seeSideNewPush = 15;
    private static final int int_seeSidePush = 13;
    private static final int int_setting = 5;
    private static final int int_setting_chooselocation = 23;
    private static final int int_startVoiceLive = 25;
    private static final int int_tbh_friends = 4;
    private static final int int_tbh_messages = 3;
    private static final int int_unknown_ = -1;
    private static final int int_vip = 9;
    private static final int int_voiceCall = 22;
    private static final int int_voiceChat = 33;
    private static final int int_webview = 10;
    private static final int int_weekly_cp_2 = 27;
    private static final int int_welcomeBack = 30;
    public static final String internal_voice_square = "internal_voice_square";
    public static final String intlTribe = "intlTribe";
    public static final String intl_camping = "intl_camping";
    public static final String intl_operating_pet = "intl_operating_pet";
    public static final String intl_similar_interests = "intl_similar_interests";
    public static final String intl_third_pay_quick_login = "intl_third_pay_quick_login";
    public static final String introPromotion = "introPromotion";
    public static final String live = "live";
    public static final String liveAnchor = "liveAnchor";
    public static final String loveBuzz = "loveBuzz";
    public static final String menu = "menu";
    public static final String messageItem = "messageItem";
    public static final String moment = "moment";
    public static final String partyDetail = "partyDetail";
    public static final String partyHall = "partyHall";
    public static final String profile = "profile";
    public static final String profile_edit = "profile_edit";
    public static final String profile_edit_continuous = "profile_edit_continuous";
    public static final String profile_purchase_see = "profile_purchase_see";
    public static final String profile_purchase_svip = "profile_purchase_svip";
    public static final String profile_purchase_vip = "profile_purchase_vip";
    public static final String quickChat2Floor = "quickChat2Floor";
    public static final String quickChatMatch = "quickChatMatch";
    public static final String quickchat = "quickchat";
    public static final String regular_main_popup = "regular_main_popup";
    public static final String secret_crush = "secret crush";
    public static final String seeLikes = "seeLikes";
    public static final String seePicks = "seePicks";
    public static final String seeSideMsg = "seeSideMsg";
    public static final String seeSideNewMsg = "seeSideNewMsg";
    public static final String seeSideNewPush = "seeSideNewPush";
    public static final String seeSidePush = "seeSidePush";
    public static final String setting = "setting";
    public static final String setting_chooselocation = "setting_chooselocation";
    public static final String startVoiceLive = "startVoiceLive";
    protected static HashSet<String> supportEnum = null;
    public static final String tbh_friends = "tbh.friends";
    public static final String tbh_messages = "tbh.messages";
    public static final String unknown_ = "unknown_";
    public static final String verify_avatar = "verify_avatar";
    public static final String vip = "vip";
    public static final String voiceCall = "voiceCall";
    public static final String voiceChat = "voiceChat";
    public static final String webview = "webview";
    public static final String weekly_cp_2 = "weekly_cp_2";
    public static final String welcomeBack = "welcomeBack";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<NavigationIntent> tEnumJsonAdapter = new TEnumJsonAdapter<NavigationIntent>() { // from class: com.p1.mobile.putong.data.NavigationIntent.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public NavigationIntent newTEnum(String str, int i) {
                return NavigationIntent.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<NavigationIntent>() { // from class: com.p1.mobile.putong.data.NavigationIntent.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public NavigationIntent newTEnum(String str, int i) {
                return NavigationIntent.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("cards", 0);
        tEnumJsonAdapter.addExtJsonValue(menu, 1);
        tEnumJsonAdapter.addExtJsonValue(secret_crush, 2);
        tEnumJsonAdapter.addExtJsonValue(tbh_messages, 3);
        tEnumJsonAdapter.addExtJsonValue(tbh_friends, 4);
        tEnumJsonAdapter.addExtJsonValue("setting", 5);
        tEnumJsonAdapter.addExtJsonValue("gift", 6);
        tEnumJsonAdapter.addExtJsonValue("profile", 7);
        tEnumJsonAdapter.addExtJsonValue("moment", 8);
        tEnumJsonAdapter.addExtJsonValue("vip", 9);
        tEnumJsonAdapter.addExtJsonValue("webview", 10);
        tEnumJsonAdapter.addExtJsonValue(profile_edit, 11);
        tEnumJsonAdapter.addExtJsonValue("seeLikes", 12);
        tEnumJsonAdapter.addExtJsonValue(seeSidePush, 13);
        tEnumJsonAdapter.addExtJsonValue(seeSideMsg, 14);
        tEnumJsonAdapter.addExtJsonValue(seeSideNewPush, 15);
        tEnumJsonAdapter.addExtJsonValue(seeSideNewMsg, 16);
        tEnumJsonAdapter.addExtJsonValue("liveAnchor", 17);
        tEnumJsonAdapter.addExtJsonValue("quickchat", 18);
        tEnumJsonAdapter.addExtJsonValue("freeTrialPromotion", 19);
        tEnumJsonAdapter.addExtJsonValue("introPromotion", 20);
        tEnumJsonAdapter.addExtJsonValue(messageItem, 21);
        tEnumJsonAdapter.addExtJsonValue(voiceCall, 22);
        tEnumJsonAdapter.addExtJsonValue("setting_chooselocation", 23);
        tEnumJsonAdapter.addExtJsonValue("live", 24);
        tEnumJsonAdapter.addExtJsonValue("startVoiceLive", 25);
        tEnumJsonAdapter.addExtJsonValue(fakealert, 26);
        tEnumJsonAdapter.addExtJsonValue(weekly_cp_2, 27);
        tEnumJsonAdapter.addExtJsonValue(partyDetail, 28);
        tEnumJsonAdapter.addExtJsonValue(partyHall, 29);
        tEnumJsonAdapter.addExtJsonValue(welcomeBack, 30);
        tEnumJsonAdapter.addExtJsonValue(quickChatMatch, 31);
        tEnumJsonAdapter.addExtJsonValue(greetChat, 32);
        tEnumJsonAdapter.addExtJsonValue(voiceChat, 33);
        tEnumJsonAdapter.addExtJsonValue(profile_edit_continuous, 34);
        tEnumJsonAdapter.addExtJsonValue("seePicks", 35);
        supportEnum.add("cards");
        supportEnum.add(menu);
        supportEnum.add(secret_crush);
        supportEnum.add(tbh_messages);
        supportEnum.add(tbh_friends);
        supportEnum.add("setting");
        supportEnum.add("gift");
        supportEnum.add("profile");
        supportEnum.add("moment");
        supportEnum.add("vip");
        supportEnum.add("webview");
        supportEnum.add(profile_edit);
        supportEnum.add("seeLikes");
        supportEnum.add(seeSidePush);
        supportEnum.add(seeSideMsg);
        supportEnum.add(seeSideNewPush);
        supportEnum.add(seeSideNewMsg);
        supportEnum.add("liveAnchor");
        supportEnum.add("quickchat");
        supportEnum.add("freeTrialPromotion");
        supportEnum.add("introPromotion");
        supportEnum.add(messageItem);
        supportEnum.add(voiceCall);
        supportEnum.add("setting_chooselocation");
        supportEnum.add("live");
        supportEnum.add("startVoiceLive");
        supportEnum.add(fakealert);
        supportEnum.add(weekly_cp_2);
        supportEnum.add(partyDetail);
        supportEnum.add(partyHall);
        supportEnum.add(welcomeBack);
        supportEnum.add(quickChatMatch);
        supportEnum.add(greetChat);
        supportEnum.add(voiceChat);
        supportEnum.add(profile_edit_continuous);
        supportEnum.add("seePicks");
        supportEnum.add("enterVoiceChat");
        supportEnum.add("quickChat2Floor");
        supportEnum.add(profile_purchase_vip);
        supportEnum.add(profile_purchase_see);
        supportEnum.add(profile_purchase_svip);
        supportEnum.add(intl_operating_pet);
        supportEnum.add(intl_third_pay_quick_login);
        supportEnum.add("loveBuzz");
        supportEnum.add("heartbeatMatch");
        supportEnum.add(intl_similar_interests);
        supportEnum.add(intl_camping);
        supportEnum.add("regular_main_popup");
        supportEnum.add(verify_avatar);
        supportEnum.add(internal_voice_square);
        supportEnum.add("intlTribe");
        _NavigationIntent = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private NavigationIntent(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<NavigationIntent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NavigationIntent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, NavigationIntent> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, NavigationIntent> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static NavigationIntent get(String str) {
        Map<String, NavigationIntent> map = _NavigationIntent;
        NavigationIntent navigationIntent = map.get(str);
        if (navigationIntent == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            navigationIntent = integer == null ? new NavigationIntent(str, -1) : new NavigationIntent(str, integer.intValue());
            map.put(str, navigationIntent);
        }
        return navigationIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NavigationIntent getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<NavigationIntent> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, NavigationIntent> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static NavigationIntent get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
