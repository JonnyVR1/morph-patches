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
public class MatchFrom extends TEnum {
    public static final TEnumJsonAdapter<MatchFrom> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MatchFrom> PROTOBUF_ADAPTER;
    private static final Map<String, MatchFrom> _MatchFrom;
    public static final String boostBadge = "boostBadge";
    public static final String boostV2 = "boostV2";
    public static final String boosted = "boosted";
    public static final String cityC = "cityC";
    public static final String deprecated_default = "deprecated_default";
    public static final String diamondGiven = "diamondGiven";
    public static final String diamondMatched = "diamondMatched";
    public static final String diamondReceived = "diamondReceived";
    public static final String forceMatch = "forceMatch";
    public static final String gift = "gift";
    public static final String incomecomment = "incomecomment";
    public static final String incomefollow = "incomefollow";
    public static final String incomelike = "incomelike";
    private static final int int_boostBadge = 6;
    private static final int int_boosted = 4;
    private static final int int_deprecated_default = 1;
    private static final int int_diamondGiven = 31;
    private static final int int_diamondMatched = 33;
    private static final int int_diamondReceived = 32;
    private static final int int_gift = 14;
    private static final int int_incomecomment = 9;
    private static final int int_incomefollow = 10;
    private static final int int_incomelike = 8;
    private static final int int_letter = 20;
    private static final int int_liked = 25;
    private static final int int_livechat = 17;
    private static final int int_matched = 26;
    private static final int int_missed = 27;
    private static final int int_myLiked = 29;
    private static final int int_online = 16;
    private static final int int_outgoingcomment = 12;
    private static final int int_outgoingfollow = 13;
    private static final int int_outgoinglike = 11;
    private static final int int_picks = 15;
    private static final int int_places = 24;
    private static final int int_privateMatch = 30;
    private static final int int_privateMatchBy = 36;
    private static final int int_privateMatchGiven = 35;
    private static final int int_quickchat = 22;
    private static final int int_redPacket = 18;
    private static final int int_sayhi = 19;
    private static final int int_scenario = 2;
    private static final int int_secretcrush = 0;
    private static final int int_selected = 23;
    private static final int int_soulmatch = 34;
    private static final int int_specialsuperliked = 21;
    private static final int int_superLiked = 3;
    private static final int int_superLikedEach = 7;
    private static final int int_unknown_ = -1;
    private static final int int_vipseen = 28;
    private static final int int_xmasActivity = 5;
    public static final String kankan = "kankan";
    public static final String letter = "letter";
    public static final String liked = "liked";
    public static final String literature = "literature";
    public static final String livechat = "livechat";
    public static final String lovebuzz = "lovebuzz";
    public static final String matched = "matched";
    public static final String missed = "missed";
    public static final String moment = "moment";
    public static final String momentPick = "momentPick";
    public static final String myLiked = "myLiked";
    public static final String online = "online";
    public static final String outgoingcomment = "outgoingcomment";
    public static final String outgoingfollow = "outgoingfollow";
    public static final String outgoinglike = "outgoinglike";
    public static final String partner = "partner";
    public static final String picks = "picks";
    public static final String pinLike = "pinLike";
    public static final String places = "places";
    public static final String privateMatch = "privateMatch";
    public static final String privateMatchBy = "privateMatchBy";
    public static final String privateMatchGiven = "privateMatchGiven";
    public static final String profileLiked = "profileLiked";
    public static final String quickchat = "quickchat";
    public static final String redPacket = "redPacket";
    public static final String relationUnion = "relationUnion";
    public static final String sayhi = "sayhi";
    public static final String scenario = "scenario";
    public static final String secretcrush = "secretcrush";
    public static final String seeUpgraded = "seeUpgraded";
    public static final String selected = "selected";
    public static final String selection = "selection";
    public static final String selectionPending = "selectionPending";
    public static final String soulmatch = "soulmatch";
    public static final String specialsuperliked = "specialsuperliked";
    public static final String superLiked = "superLiked";
    public static final String superLikedEach = "superLikedEach";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String vipseen = "vipseen";
    public static final String xmasActivity = "xmasActivity";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MatchFrom> tEnumJsonAdapter = new TEnumJsonAdapter<MatchFrom>() { // from class: com.p1.mobile.putong.data.MatchFrom.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MatchFrom newTEnum(String str, int i) {
                return MatchFrom.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MatchFrom>() { // from class: com.p1.mobile.putong.data.MatchFrom.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MatchFrom newTEnum(String str, int i) {
                return MatchFrom.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("secretcrush", 0);
        tEnumJsonAdapter.addExtJsonValue(deprecated_default, 1);
        tEnumJsonAdapter.addExtJsonValue(scenario, 2);
        tEnumJsonAdapter.addExtJsonValue(superLiked, 3);
        tEnumJsonAdapter.addExtJsonValue("boosted", 4);
        tEnumJsonAdapter.addExtJsonValue(xmasActivity, 5);
        tEnumJsonAdapter.addExtJsonValue(boostBadge, 6);
        tEnumJsonAdapter.addExtJsonValue(superLikedEach, 7);
        tEnumJsonAdapter.addExtJsonValue(incomelike, 8);
        tEnumJsonAdapter.addExtJsonValue(incomecomment, 9);
        tEnumJsonAdapter.addExtJsonValue(incomefollow, 10);
        tEnumJsonAdapter.addExtJsonValue(outgoinglike, 11);
        tEnumJsonAdapter.addExtJsonValue(outgoingcomment, 12);
        tEnumJsonAdapter.addExtJsonValue(outgoingfollow, 13);
        tEnumJsonAdapter.addExtJsonValue("gift", 14);
        tEnumJsonAdapter.addExtJsonValue("picks", 15);
        tEnumJsonAdapter.addExtJsonValue("online", 16);
        tEnumJsonAdapter.addExtJsonValue(livechat, 17);
        tEnumJsonAdapter.addExtJsonValue("redPacket", 18);
        tEnumJsonAdapter.addExtJsonValue("sayhi", 19);
        tEnumJsonAdapter.addExtJsonValue("letter", 20);
        tEnumJsonAdapter.addExtJsonValue(specialsuperliked, 21);
        tEnumJsonAdapter.addExtJsonValue("quickchat", 22);
        tEnumJsonAdapter.addExtJsonValue(selected, 23);
        tEnumJsonAdapter.addExtJsonValue("places", 24);
        tEnumJsonAdapter.addExtJsonValue("liked", 25);
        tEnumJsonAdapter.addExtJsonValue("matched", 26);
        tEnumJsonAdapter.addExtJsonValue(missed, 27);
        tEnumJsonAdapter.addExtJsonValue(vipseen, 28);
        tEnumJsonAdapter.addExtJsonValue("myLiked", 29);
        tEnumJsonAdapter.addExtJsonValue("privateMatch", 30);
        tEnumJsonAdapter.addExtJsonValue(diamondGiven, 31);
        tEnumJsonAdapter.addExtJsonValue(diamondReceived, 32);
        tEnumJsonAdapter.addExtJsonValue(diamondMatched, 33);
        tEnumJsonAdapter.addExtJsonValue(soulmatch, 34);
        tEnumJsonAdapter.addExtJsonValue(privateMatchGiven, 35);
        tEnumJsonAdapter.addExtJsonValue(privateMatchBy, 36);
        supportEnum.add("secretcrush");
        supportEnum.add(deprecated_default);
        supportEnum.add(scenario);
        supportEnum.add(superLiked);
        supportEnum.add("boosted");
        supportEnum.add(xmasActivity);
        supportEnum.add(boostBadge);
        supportEnum.add(superLikedEach);
        supportEnum.add(incomelike);
        supportEnum.add(incomecomment);
        supportEnum.add(incomefollow);
        supportEnum.add(outgoinglike);
        supportEnum.add(outgoingcomment);
        supportEnum.add(outgoingfollow);
        supportEnum.add("gift");
        supportEnum.add("picks");
        supportEnum.add("online");
        supportEnum.add(livechat);
        supportEnum.add("redPacket");
        supportEnum.add("sayhi");
        supportEnum.add("letter");
        supportEnum.add(specialsuperliked);
        supportEnum.add("quickchat");
        supportEnum.add(selected);
        supportEnum.add("places");
        supportEnum.add("liked");
        supportEnum.add("matched");
        supportEnum.add(missed);
        supportEnum.add(vipseen);
        supportEnum.add("myLiked");
        supportEnum.add("privateMatch");
        supportEnum.add(diamondGiven);
        supportEnum.add(diamondReceived);
        supportEnum.add(diamondMatched);
        supportEnum.add(soulmatch);
        supportEnum.add(privateMatchGiven);
        supportEnum.add(privateMatchBy);
        supportEnum.add("literature");
        supportEnum.add("moment");
        supportEnum.add("kankan");
        supportEnum.add(forceMatch);
        supportEnum.add("momentPick");
        supportEnum.add("lovebuzz");
        supportEnum.add(profileLiked);
        supportEnum.add(seeUpgraded);
        supportEnum.add(relationUnion);
        supportEnum.add(boostV2);
        supportEnum.add("partner");
        supportEnum.add("pinLike");
        supportEnum.add(cityC);
        supportEnum.add("selection");
        supportEnum.add(selectionPending);
        _MatchFrom = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MatchFrom(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MatchFrom> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MatchFrom> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MatchFrom> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MatchFrom> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MatchFrom get(String str) {
        Map<String, MatchFrom> map = _MatchFrom;
        MatchFrom matchFrom = map.get(str);
        if (matchFrom == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            matchFrom = integer == null ? new MatchFrom(str, -1) : new MatchFrom(str, integer.intValue());
            map.put(str, matchFrom);
        }
        return matchFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MatchFrom getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MatchFrom> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MatchFrom> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MatchFrom get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
