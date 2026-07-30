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
public class ODiamondStatisticsType extends TEnum {
    public static final TEnumJsonAdapter<ODiamondStatisticsType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ODiamondStatisticsType> PROTOBUF_ADAPTER;
    private static final Map<String, ODiamondStatisticsType> _ODiamondStatisticsType;
    public static final String beCared = "beCared";
    public static final String boost = "boost";
    public static final String care = "care";
    private static final int int_unknown_ = -1;
    public static final String like = "like";
    public static final String match = "match";
    public static final String pick = "pick";
    protected static HashSet<String> supportEnum = null;
    public static final String talk = "talk";
    public static final String unknown_ = "unknown_";
    public static final String visit = "visit";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ODiamondStatisticsType> tEnumJsonAdapter = new TEnumJsonAdapter<ODiamondStatisticsType>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatisticsType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ODiamondStatisticsType newTEnum(String str, int i) {
                return ODiamondStatisticsType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ODiamondStatisticsType>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatisticsType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ODiamondStatisticsType newTEnum(String str, int i) {
                return ODiamondStatisticsType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("visit");
        supportEnum.add("like");
        supportEnum.add("match");
        supportEnum.add(talk);
        supportEnum.add(care);
        supportEnum.add(beCared);
        supportEnum.add("boost");
        supportEnum.add(pick);
        _ODiamondStatisticsType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ODiamondStatisticsType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ODiamondStatisticsType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ODiamondStatisticsType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ODiamondStatisticsType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ODiamondStatisticsType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ODiamondStatisticsType get(String str) {
        Map<String, ODiamondStatisticsType> map = _ODiamondStatisticsType;
        ODiamondStatisticsType oDiamondStatisticsType = map.get(str);
        if (oDiamondStatisticsType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oDiamondStatisticsType = integer == null ? new ODiamondStatisticsType(str, -1) : new ODiamondStatisticsType(str, integer.intValue());
            map.put(str, oDiamondStatisticsType);
        }
        return oDiamondStatisticsType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ODiamondStatisticsType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ODiamondStatisticsType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ODiamondStatisticsType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ODiamondStatisticsType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
