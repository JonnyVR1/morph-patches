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
public class CoinRechageType extends TEnum {
    public static final TEnumJsonAdapter<CoinRechageType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<CoinRechageType> PROTOBUF_ADAPTER;
    private static final Map<String, CoinRechageType> _CoinRechageType;
    public static final String appPurchase = "appPurchase";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String url = "url";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CoinRechageType> tEnumJsonAdapter = new TEnumJsonAdapter<CoinRechageType>() { // from class: com.p1.mobile.putong.core.data.CoinRechageType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public CoinRechageType m12199newTEnum(String str, int i) {
                return CoinRechageType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CoinRechageType>() { // from class: com.p1.mobile.putong.core.data.CoinRechageType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public CoinRechageType m12200newTEnum(String str, int i) {
                return CoinRechageType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("url");
        supportEnum.add("appPurchase");
        _CoinRechageType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private CoinRechageType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CoinRechageType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoinRechageType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CoinRechageType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, CoinRechageType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static CoinRechageType get(String str) {
        Map<String, CoinRechageType> map = _CoinRechageType;
        CoinRechageType coinRechageType = map.get(str);
        if (coinRechageType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            coinRechageType = integer == null ? new CoinRechageType(str, int_unknown_) : new CoinRechageType(str, integer.intValue());
            map.put(str, coinRechageType);
        }
        return coinRechageType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CoinRechageType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CoinRechageType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CoinRechageType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CoinRechageType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
