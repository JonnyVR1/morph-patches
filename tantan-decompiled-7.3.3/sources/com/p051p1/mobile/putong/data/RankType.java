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
public class RankType extends TEnum {
    public static final TEnumJsonAdapter<RankType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<RankType> PROTOBUF_ADAPTER;
    private static final Map<String, RankType> _RankType;
    public static final String givenGift = "givenGift";
    private static final int int_givenGift = 0;
    private static final int int_receivedGift = 1;
    private static final int int_unknown_ = -1;
    public static final String receivedGift = "receivedGift";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<RankType> tEnumJsonAdapter = new TEnumJsonAdapter<RankType>() { // from class: com.p1.mobile.putong.data.RankType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public RankType newTEnum(String str, int i) {
                return RankType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<RankType>() { // from class: com.p1.mobile.putong.data.RankType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public RankType newTEnum(String str, int i) {
                return RankType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(givenGift, 0);
        tEnumJsonAdapter.addExtJsonValue(receivedGift, 1);
        supportEnum.add(givenGift);
        supportEnum.add(receivedGift);
        _RankType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private RankType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<RankType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<RankType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, RankType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, RankType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static RankType get(String str) {
        Map<String, RankType> map = _RankType;
        RankType rankType = map.get(str);
        if (rankType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            rankType = integer == null ? new RankType(str, -1) : new RankType(str, integer.intValue());
            map.put(str, rankType);
        }
        return rankType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RankType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<RankType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, RankType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static RankType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
