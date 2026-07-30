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
public class RelationshipStatus extends TEnum {
    public static final String DEFAULT = "DEFAULT";
    public static final TEnumJsonAdapter<RelationshipStatus> JSON_ADAPTER;
    public static final String LIKED = "LIKED";
    public static final TEnumProtobufAdapter<RelationshipStatus> PROTOBUF_ADAPTER;
    public static final String SUPERLIKED = "SUPERLIKED";
    private static final Map<String, RelationshipStatus> _RelationshipStatus;
    public static final String blocked = "blocked";
    public static final String default_ = "default";
    public static final String disliked = "disliked";
    public static final String gift = "gift";
    private static final int int_blocked = 4;
    private static final int int_default_ = 5;
    private static final int int_disliked = 2;
    private static final int int_gift = 6;
    private static final int int_lettered = 11;
    private static final int int_liked = 1;
    private static final int int_livechatpeeking = 9;
    private static final int int_livechatpending = 7;
    private static final int int_matched = 3;
    private static final int int_sayhi = 8;
    private static final int int_suggested = 0;
    private static final int int_superliked = 10;
    private static final int int_unknown_ = -1;
    public static final String lettered = "lettered";
    public static final String liked = "liked";
    public static final String livechatpeeking = "livechatpeeking";
    public static final String livechatpending = "livechatpending";
    public static final String matched = "matched";
    public static final String pendingLiked = "pendingLiked";
    public static final String sayhi = "sayhi";
    public static final String suggested = "suggested";
    public static final String superliked = "superliked";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<RelationshipStatus> tEnumJsonAdapter = new TEnumJsonAdapter<RelationshipStatus>() { // from class: com.p1.mobile.putong.data.RelationshipStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public RelationshipStatus newTEnum(String str, int i) {
                return RelationshipStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<RelationshipStatus>() { // from class: com.p1.mobile.putong.data.RelationshipStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public RelationshipStatus newTEnum(String str, int i) {
                return RelationshipStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(suggested, 0);
        tEnumJsonAdapter.addExtJsonValue("liked", 1);
        tEnumJsonAdapter.addExtJsonValue(disliked, 2);
        tEnumJsonAdapter.addExtJsonValue("matched", 3);
        tEnumJsonAdapter.addExtJsonValue("blocked", 4);
        tEnumJsonAdapter.addExtJsonValue("default", 5);
        tEnumJsonAdapter.addExtJsonValue("gift", 6);
        tEnumJsonAdapter.addExtJsonValue(livechatpending, 7);
        tEnumJsonAdapter.addExtJsonValue("sayhi", 8);
        tEnumJsonAdapter.addExtJsonValue(livechatpeeking, 9);
        tEnumJsonAdapter.addExtJsonValue("superliked", 10);
        tEnumJsonAdapter.addExtJsonValue("lettered", 11);
        supportEnum.add(suggested);
        supportEnum.add("liked");
        supportEnum.add(disliked);
        supportEnum.add("matched");
        supportEnum.add("blocked");
        supportEnum.add("default");
        supportEnum.add("gift");
        supportEnum.add(livechatpending);
        supportEnum.add("sayhi");
        supportEnum.add(livechatpeeking);
        supportEnum.add("superliked");
        supportEnum.add("lettered");
        supportEnum.add(LIKED);
        supportEnum.add(SUPERLIKED);
        supportEnum.add(DEFAULT);
        supportEnum.add(pendingLiked);
        _RelationshipStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private RelationshipStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<RelationshipStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<RelationshipStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, RelationshipStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, RelationshipStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static RelationshipStatus get(String str) {
        Map<String, RelationshipStatus> map = _RelationshipStatus;
        RelationshipStatus relationshipStatus = map.get(str);
        if (relationshipStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            relationshipStatus = integer == null ? new RelationshipStatus(str, -1) : new RelationshipStatus(str, integer.intValue());
            map.put(str, relationshipStatus);
        }
        return relationshipStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RelationshipStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<RelationshipStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, RelationshipStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static RelationshipStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
