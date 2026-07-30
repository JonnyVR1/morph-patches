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
public class RankLevel extends TEnum {
    public static final TEnumJsonAdapter<RankLevel> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<RankLevel> PROTOBUF_ADAPTER;
    private static final Map<String, RankLevel> _RankLevel;
    public static final String city = "city";
    public static final String country = "country";
    public static final String district = "district";
    public static final String hide = "hide";
    private static final int int_city = 2;
    private static final int int_country = 0;
    private static final int int_district = 3;
    private static final int int_hide = 5;
    private static final int int_outOfRank = 4;
    private static final int int_province = 1;
    private static final int int_unknown_ = -1;
    public static final String outOfRank = "outOfRank";
    public static final String province = "province";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<RankLevel> tEnumJsonAdapter = new TEnumJsonAdapter<RankLevel>() { // from class: com.p1.mobile.putong.core.data.RankLevel.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public RankLevel newTEnum(String str, int i) {
                return RankLevel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<RankLevel>() { // from class: com.p1.mobile.putong.core.data.RankLevel.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public RankLevel newTEnum(String str, int i) {
                return RankLevel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("country", 0);
        tEnumJsonAdapter.addExtJsonValue(province, 1);
        tEnumJsonAdapter.addExtJsonValue(city, 2);
        tEnumJsonAdapter.addExtJsonValue(district, 3);
        tEnumJsonAdapter.addExtJsonValue(outOfRank, 4);
        tEnumJsonAdapter.addExtJsonValue("hide", 5);
        supportEnum.add("country");
        supportEnum.add(province);
        supportEnum.add(city);
        supportEnum.add(district);
        supportEnum.add(outOfRank);
        supportEnum.add("hide");
        _RankLevel = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private RankLevel(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<RankLevel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<RankLevel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, RankLevel> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, RankLevel> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static RankLevel get(String str) {
        Map<String, RankLevel> map = _RankLevel;
        RankLevel rankLevel = map.get(str);
        if (rankLevel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            rankLevel = integer == null ? new RankLevel(str, -1) : new RankLevel(str, integer.intValue());
            map.put(str, rankLevel);
        }
        return rankLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RankLevel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<RankLevel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, RankLevel> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static RankLevel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
