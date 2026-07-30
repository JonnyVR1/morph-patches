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
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public PicksTagType newTEnum(String str, int i) {
                return PicksTagType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PicksTagType>() { // from class: com.p1.mobile.putong.core.data.PicksTagType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public PicksTagType newTEnum(String str, int i) {
                return PicksTagType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(resetable, 0);
        tEnumJsonAdapter.addExtJsonValue(bought, 1);
        tEnumJsonAdapter.addExtJsonValue(masking, 2);
        tEnumJsonAdapter.addExtJsonValue("free", 3);
        supportEnum.add(resetable);
        supportEnum.add(bought);
        supportEnum.add(masking);
        supportEnum.add("free");
        _PicksTagType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private PicksTagType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
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
        l01 l01Var = new l01();
        for (Map.Entry<String, PicksTagType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static PicksTagType get(String str) {
        Map<String, PicksTagType> map = _PicksTagType;
        PicksTagType picksTagType = map.get(str);
        if (picksTagType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            picksTagType = integer == null ? new PicksTagType(str, -1) : new PicksTagType(str, integer.intValue());
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
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PicksTagType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PicksTagType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
