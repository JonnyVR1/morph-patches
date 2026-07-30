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
public class BarLoverplacesType extends TEnum {
    public static final TEnumJsonAdapter<BarLoverplacesType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BarLoverplacesType> PROTOBUF_ADAPTER;
    private static final Map<String, BarLoverplacesType> _BarLoverplacesType;
    public static final String bar = "bar";
    public static final String hubZone = "hubZone";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BarLoverplacesType> tEnumJsonAdapter = new TEnumJsonAdapter<BarLoverplacesType>() { // from class: com.p1.mobile.putong.core.data.BarLoverplacesType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public BarLoverplacesType m11743newTEnum(String str, int i) {
                return BarLoverplacesType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BarLoverplacesType>() { // from class: com.p1.mobile.putong.core.data.BarLoverplacesType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public BarLoverplacesType m11744newTEnum(String str, int i) {
                return BarLoverplacesType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(bar);
        supportEnum.add(hubZone);
        _BarLoverplacesType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BarLoverplacesType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BarLoverplacesType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BarLoverplacesType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BarLoverplacesType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BarLoverplacesType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BarLoverplacesType get(String str) {
        Map<String, BarLoverplacesType> map = _BarLoverplacesType;
        BarLoverplacesType barLoverplacesType = map.get(str);
        if (barLoverplacesType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            barLoverplacesType = integer == null ? new BarLoverplacesType(str, int_unknown_) : new BarLoverplacesType(str, integer.intValue());
            map.put(str, barLoverplacesType);
        }
        return barLoverplacesType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BarLoverplacesType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BarLoverplacesType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BarLoverplacesType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BarLoverplacesType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
