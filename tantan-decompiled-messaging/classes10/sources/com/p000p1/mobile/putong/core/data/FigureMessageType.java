package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FigureMessageType extends TEnum {
    public static final TEnumJsonAdapter<FigureMessageType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<FigureMessageType> PROTOBUF_ADAPTER;
    private static final Map<String, FigureMessageType> _FigureMessageType;
    public static final String distance = "distance";
    private static final int int_distance = 1;
    private static final int int_number = 0;
    private static final int int_region = 2;
    private static final int int_unknown_ = -1;
    public static final String number = "number";
    public static final String region = "region";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<FigureMessageType> tEnumJsonAdapter = new TEnumJsonAdapter<FigureMessageType>() { // from class: com.p1.mobile.putong.core.data.FigureMessageType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public FigureMessageType m12781newTEnum(String str, int i) {
                return FigureMessageType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<FigureMessageType>() { // from class: com.p1.mobile.putong.core.data.FigureMessageType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public FigureMessageType m12782newTEnum(String str, int i) {
                return FigureMessageType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(number, int_number);
        tEnumJsonAdapter.addExtJsonValue("distance", 1);
        tEnumJsonAdapter.addExtJsonValue(region, 2);
        supportEnum.add(number);
        supportEnum.add("distance");
        supportEnum.add(region);
        _FigureMessageType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private FigureMessageType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<FigureMessageType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FigureMessageType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, FigureMessageType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, FigureMessageType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static FigureMessageType get(String str) {
        Map<String, FigureMessageType> map = _FigureMessageType;
        FigureMessageType figureMessageType = map.get(str);
        if (figureMessageType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            figureMessageType = integer == null ? new FigureMessageType(str, int_unknown_) : new FigureMessageType(str, integer.intValue());
            map.put(str, figureMessageType);
        }
        return figureMessageType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FigureMessageType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<FigureMessageType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, FigureMessageType> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static FigureMessageType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
