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
public class TreasurePrizeType extends TEnum {
    public static final TEnumJsonAdapter<TreasurePrizeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<TreasurePrizeType> PROTOBUF_ADAPTER;
    private static final Map<String, TreasurePrizeType> _TreasurePrizeType;
    public static final String advanceTag = "advanceTag";
    public static final String basicTag = "basicTag";
    public static final String boost = "boost";
    public static final String border = "border";
    public static final String gem = "gem";
    private static final int int_unknown_ = -1;
    public static final String quickchatNumber = "quickchatNumber";
    public static final String sticker = "sticker";
    public static final String superLike = "superLike";
    protected static HashSet<String> supportEnum = null;
    public static final String tag = "tag";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<TreasurePrizeType> tEnumJsonAdapter = new TEnumJsonAdapter<TreasurePrizeType>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public TreasurePrizeType m16024newTEnum(String str, int i) {
                return TreasurePrizeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<TreasurePrizeType>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public TreasurePrizeType m16025newTEnum(String str, int i) {
                return TreasurePrizeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(gem);
        supportEnum.add("boost");
        supportEnum.add("superLike");
        supportEnum.add("quickchatNumber");
        supportEnum.add("tag");
        supportEnum.add(basicTag);
        supportEnum.add(advanceTag);
        supportEnum.add("sticker");
        supportEnum.add(border);
        _TreasurePrizeType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private TreasurePrizeType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<TreasurePrizeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<TreasurePrizeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, TreasurePrizeType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, TreasurePrizeType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static TreasurePrizeType get(String str) {
        Map<String, TreasurePrizeType> map = _TreasurePrizeType;
        TreasurePrizeType treasurePrizeType = map.get(str);
        if (treasurePrizeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            treasurePrizeType = integer == null ? new TreasurePrizeType(str, int_unknown_) : new TreasurePrizeType(str, integer.intValue());
            map.put(str, treasurePrizeType);
        }
        return treasurePrizeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TreasurePrizeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<TreasurePrizeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, TreasurePrizeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static TreasurePrizeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
