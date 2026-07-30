package com.p046p1.mobile.putong.core.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes10.dex */
public class FriendSuggestReason extends TEnum {
    public static final TEnumJsonAdapter<FriendSuggestReason> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<FriendSuggestReason> PROTOBUF_ADAPTER;
    private static final Map<String, FriendSuggestReason> _FriendSuggestReason;
    public static final String activity = "activity";
    public static final String default_ = "default";
    public static final String distance = "distance";
    private static final int int_activity = 0;
    private static final int int_default_ = 4;
    private static final int int_distance = 2;
    private static final int int_newMatch = 3;
    private static final int int_recentMessage = 1;
    private static final int int_unknown_ = -1;
    public static final String interaction_live = "interaction_live";
    public static final String interaction_lovescript = "interaction_lovescript";
    public static final String interaction_moment = "interaction_moment";
    public static final String interaction_voice = "interaction_voice";
    public static final String newMatch = "newMatch";
    public static final String oof = "oof";
    public static final String recentMessage = "recentMessage";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<FriendSuggestReason> tEnumJsonAdapter = new TEnumJsonAdapter<FriendSuggestReason>() { // from class: com.p1.mobile.putong.core.data.FriendSuggestReason.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public FriendSuggestReason newTEnum(String str, int i) {
                return FriendSuggestReason.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<FriendSuggestReason>() { // from class: com.p1.mobile.putong.core.data.FriendSuggestReason.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public FriendSuggestReason newTEnum(String str, int i) {
                return FriendSuggestReason.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("activity", 0);
        tEnumJsonAdapter.addExtJsonValue(recentMessage, 1);
        tEnumJsonAdapter.addExtJsonValue("distance", 2);
        tEnumJsonAdapter.addExtJsonValue(newMatch, 3);
        tEnumJsonAdapter.addExtJsonValue("default", 4);
        supportEnum.add("activity");
        supportEnum.add(recentMessage);
        supportEnum.add("distance");
        supportEnum.add(newMatch);
        supportEnum.add("default");
        supportEnum.add(interaction_live);
        supportEnum.add(interaction_voice);
        supportEnum.add(interaction_moment);
        supportEnum.add(interaction_lovescript);
        supportEnum.add(oof);
        _FriendSuggestReason = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private FriendSuggestReason(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<FriendSuggestReason> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FriendSuggestReason> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, FriendSuggestReason> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, FriendSuggestReason> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static FriendSuggestReason get(String str) {
        Map<String, FriendSuggestReason> map = _FriendSuggestReason;
        FriendSuggestReason friendSuggestReason = map.get(str);
        if (friendSuggestReason == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            friendSuggestReason = integer == null ? new FriendSuggestReason(str, -1) : new FriendSuggestReason(str, integer.intValue());
            map.put(str, friendSuggestReason);
        }
        return friendSuggestReason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FriendSuggestReason getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<FriendSuggestReason> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, FriendSuggestReason> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static FriendSuggestReason get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
