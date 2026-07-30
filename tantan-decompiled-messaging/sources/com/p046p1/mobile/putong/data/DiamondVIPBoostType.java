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
public class DiamondVIPBoostType extends TEnum {
    public static final TEnumJsonAdapter<DiamondVIPBoostType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<DiamondVIPBoostType> PROTOBUF_ADAPTER;
    private static final Map<String, DiamondVIPBoostType> _DiamondVIPBoostType;
    private static final int int_likedOnly = 2;
    private static final int int_maximum = 0;
    private static final int int_precision = 1;
    private static final int int_unknown_ = -1;
    public static final String likedOnly = "likedOnly";
    public static final String maximum = "maximum";
    public static final String precision = "precision";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<DiamondVIPBoostType> tEnumJsonAdapter = new TEnumJsonAdapter<DiamondVIPBoostType>() { // from class: com.p1.mobile.putong.data.DiamondVIPBoostType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public DiamondVIPBoostType newTEnum(String str, int i) {
                return DiamondVIPBoostType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<DiamondVIPBoostType>() { // from class: com.p1.mobile.putong.data.DiamondVIPBoostType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public DiamondVIPBoostType newTEnum(String str, int i) {
                return DiamondVIPBoostType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(maximum, 0);
        tEnumJsonAdapter.addExtJsonValue(precision, 1);
        tEnumJsonAdapter.addExtJsonValue(likedOnly, 2);
        supportEnum.add(maximum);
        supportEnum.add(precision);
        supportEnum.add(likedOnly);
        _DiamondVIPBoostType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private DiamondVIPBoostType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<DiamondVIPBoostType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<DiamondVIPBoostType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, DiamondVIPBoostType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, DiamondVIPBoostType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static DiamondVIPBoostType get(String str) {
        Map<String, DiamondVIPBoostType> map = _DiamondVIPBoostType;
        DiamondVIPBoostType diamondVIPBoostType = map.get(str);
        if (diamondVIPBoostType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            diamondVIPBoostType = integer == null ? new DiamondVIPBoostType(str, -1) : new DiamondVIPBoostType(str, integer.intValue());
            map.put(str, diamondVIPBoostType);
        }
        return diamondVIPBoostType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DiamondVIPBoostType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<DiamondVIPBoostType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, DiamondVIPBoostType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static DiamondVIPBoostType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
