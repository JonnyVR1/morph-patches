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
public class GiftGuideTipsType extends TEnum {
    public static final TEnumJsonAdapter<GiftGuideTipsType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GiftGuideTipsType> PROTOBUF_ADAPTER;
    private static final Map<String, GiftGuideTipsType> _GiftGuideTipsType;
    public static final String birthday = "birthday";
    private static final int int_birthday = 0;
    private static final int int_optimum = 1;
    private static final int int_unknown_ = -1;
    public static final String optimum = "optimum";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GiftGuideTipsType> tEnumJsonAdapter = new TEnumJsonAdapter<GiftGuideTipsType>() { // from class: com.p1.mobile.putong.core.data.GiftGuideTipsType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public GiftGuideTipsType newTEnum(String str, int i) {
                return GiftGuideTipsType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GiftGuideTipsType>() { // from class: com.p1.mobile.putong.core.data.GiftGuideTipsType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public GiftGuideTipsType newTEnum(String str, int i) {
                return GiftGuideTipsType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("birthday", 0);
        tEnumJsonAdapter.addExtJsonValue(optimum, 1);
        supportEnum.add("birthday");
        supportEnum.add(optimum);
        _GiftGuideTipsType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GiftGuideTipsType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GiftGuideTipsType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GiftGuideTipsType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GiftGuideTipsType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GiftGuideTipsType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GiftGuideTipsType get(String str) {
        Map<String, GiftGuideTipsType> map = _GiftGuideTipsType;
        GiftGuideTipsType giftGuideTipsType = map.get(str);
        if (giftGuideTipsType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            giftGuideTipsType = integer == null ? new GiftGuideTipsType(str, -1) : new GiftGuideTipsType(str, integer.intValue());
            map.put(str, giftGuideTipsType);
        }
        return giftGuideTipsType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GiftGuideTipsType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GiftGuideTipsType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GiftGuideTipsType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GiftGuideTipsType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
