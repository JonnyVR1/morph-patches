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
public class PicksTagType extends TEnum {
    public static final TEnumJsonAdapter<PicksTagType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PicksTagType> PROTOBUF_ADAPTER;
    private static final Map<String, PicksTagType> _PicksTagType;
    public static final String bought = "bought";
    public static final String free = "free";
    private static final int int_bought = 1;
    private static final int int_free = 3;
    private static final int int_masking = 2;
    private static final int int_resetable = 0;
    private static final int int_unknown_ = -1;
    public static final String masking = "masking";
    public static final String resetable = "resetable";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PicksTagType> tEnumJsonAdapter = new TEnumJsonAdapter<PicksTagType>() { // from class: com.p1.mobile.putong.core.data.PicksTagType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PicksTagType m14781newTEnum(String str, int i) {
                return PicksTagType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PicksTagType>() { // from class: com.p1.mobile.putong.core.data.PicksTagType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PicksTagType m14782newTEnum(String str, int i) {
                return PicksTagType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(resetable, int_resetable);
        tEnumJsonAdapter.addExtJsonValue(bought, 1);
        tEnumJsonAdapter.addExtJsonValue(masking, 2);
        tEnumJsonAdapter.addExtJsonValue("free", 3);
        supportEnum.add(resetable);
        supportEnum.add(bought);
        supportEnum.add(masking);
        supportEnum.add("free");
        _PicksTagType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private PicksTagType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PicksTagType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PicksTagType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PicksTagType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, PicksTagType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static PicksTagType get(String str) {
        Map<String, PicksTagType> map = _PicksTagType;
        PicksTagType picksTagType = map.get(str);
        if (picksTagType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            picksTagType = integer == null ? new PicksTagType(str, int_unknown_) : new PicksTagType(str, integer.intValue());
            map.put(str, picksTagType);
        }
        return picksTagType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PicksTagType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PicksTagType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PicksTagType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PicksTagType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
