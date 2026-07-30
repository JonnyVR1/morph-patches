package com.p000p1.mobile.putong.data;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LinkIntent extends TEnum {
    public static final TEnumJsonAdapter<LinkIntent> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LinkIntent> PROTOBUF_ADAPTER;
    private static final Map<String, LinkIntent> _LinkIntent;
    private static final int int_invite = 3;
    private static final int int_matched = 2;
    private static final int int_receivedLikes = 1;
    private static final int int_sticker = 4;
    private static final int int_superLike = 6;
    private static final int int_top5 = 0;
    private static final int int_unknown_ = -1;
    private static final int int_userCard = 5;
    private static final int int_userCardPreview = 8;
    private static final int int_userLikedStatistics = 7;
    private static final int int_vote = 9;
    public static final String invite = "invite";
    public static final String matched = "matched";
    public static final String receivedLikes = "receivedLikes";
    public static final String sticker = "sticker";
    public static final String superLike = "superLike";
    protected static HashSet<String> supportEnum = null;
    public static final String top5 = "top5";
    public static final String unknown_ = "unknown_";
    public static final String userCard = "userCard";
    public static final String userCardPreview = "userCardPreview";
    public static final String userLikedStatistics = "userLikedStatistics";
    public static final String vote = "vote";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LinkIntent> tEnumJsonAdapter = new TEnumJsonAdapter<LinkIntent>() { // from class: com.p1.mobile.putong.data.LinkIntent.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LinkIntent newTEnum(String str, int i) {
                return LinkIntent.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LinkIntent>() { // from class: com.p1.mobile.putong.data.LinkIntent.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LinkIntent newTEnum(String str, int i) {
                return LinkIntent.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(top5, 0);
        tEnumJsonAdapter.addExtJsonValue("receivedLikes", 1);
        tEnumJsonAdapter.addExtJsonValue("matched", 2);
        tEnumJsonAdapter.addExtJsonValue(invite, 3);
        tEnumJsonAdapter.addExtJsonValue("sticker", 4);
        tEnumJsonAdapter.addExtJsonValue("userCard", 5);
        tEnumJsonAdapter.addExtJsonValue("superLike", 6);
        tEnumJsonAdapter.addExtJsonValue(userLikedStatistics, 7);
        tEnumJsonAdapter.addExtJsonValue(userCardPreview, 8);
        tEnumJsonAdapter.addExtJsonValue(vote, 9);
        supportEnum.add(top5);
        supportEnum.add("receivedLikes");
        supportEnum.add("matched");
        supportEnum.add(invite);
        supportEnum.add("sticker");
        supportEnum.add("userCard");
        supportEnum.add("superLike");
        supportEnum.add(userLikedStatistics);
        supportEnum.add(userCardPreview);
        supportEnum.add(vote);
        _LinkIntent = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LinkIntent(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LinkIntent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LinkIntent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LinkIntent> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LinkIntent> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LinkIntent get(String str) {
        Map<String, LinkIntent> map = _LinkIntent;
        LinkIntent linkIntent = map.get(str);
        if (linkIntent == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            linkIntent = integer == null ? new LinkIntent(str, -1) : new LinkIntent(str, integer.intValue());
            map.put(str, linkIntent);
        }
        return linkIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkIntent getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LinkIntent> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LinkIntent> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
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
        return !supportEnum.contains(this.name);
    }

    private static LinkIntent get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
