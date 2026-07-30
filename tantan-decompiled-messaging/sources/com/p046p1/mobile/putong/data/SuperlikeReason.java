package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class SuperlikeReason extends TEnum {
    public static final TEnumJsonAdapter<SuperlikeReason> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SuperlikeReason> PROTOBUF_ADAPTER;
    private static final Map<String, SuperlikeReason> _SuperlikeReason;
    private static final int int_lastRemaining = 2;
    private static final int int_longAttention = 3;
    private static final int int_normal = 0;
    private static final int int_picky = 4;
    private static final int int_popular = 1;
    private static final int int_unknown_ = -1;
    public static final String lastRemaining = "lastRemaining";
    public static final String longAttention = "longAttention";
    public static final String normal = "normal";
    public static final String picky = "picky";
    public static final String popular = "popular";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SuperlikeReason> tEnumJsonAdapter = new TEnumJsonAdapter<SuperlikeReason>() { // from class: com.p1.mobile.putong.data.SuperlikeReason.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SuperlikeReason newTEnum(String str, int i) {
                return SuperlikeReason.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SuperlikeReason>() { // from class: com.p1.mobile.putong.data.SuperlikeReason.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SuperlikeReason newTEnum(String str, int i) {
                return SuperlikeReason.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("normal", 0);
        tEnumJsonAdapter.addExtJsonValue(popular, 1);
        tEnumJsonAdapter.addExtJsonValue(lastRemaining, 2);
        tEnumJsonAdapter.addExtJsonValue(longAttention, 3);
        tEnumJsonAdapter.addExtJsonValue(picky, 4);
        supportEnum.add("normal");
        supportEnum.add(popular);
        supportEnum.add(lastRemaining);
        supportEnum.add(longAttention);
        supportEnum.add(picky);
        _SuperlikeReason = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SuperlikeReason(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SuperlikeReason> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SuperlikeReason> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SuperlikeReason> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SuperlikeReason> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SuperlikeReason get(String str) {
        Map<String, SuperlikeReason> map = _SuperlikeReason;
        SuperlikeReason superlikeReason = map.get(str);
        if (superlikeReason == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            superlikeReason = integer == null ? new SuperlikeReason(str, -1) : new SuperlikeReason(str, integer.intValue());
            map.put(str, superlikeReason);
        }
        return superlikeReason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SuperlikeReason getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SuperlikeReason> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SuperlikeReason> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SuperlikeReason get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
