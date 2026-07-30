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
public class ODiamondFeedType extends TEnum {
    public static final TEnumJsonAdapter<ODiamondFeedType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ODiamondFeedType> PROTOBUF_ADAPTER;
    private static final Map<String, ODiamondFeedType> _ODiamondFeedType;
    public static final String dailyReport = "dailyReport";
    public static final String instantChat = "instantChat";
    private static final int int_unknown_ = -1;
    public static final String latestVisitor = "latestVisitor";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String weeklyReport = "weeklyReport";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ODiamondFeedType> tEnumJsonAdapter = new TEnumJsonAdapter<ODiamondFeedType>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ODiamondFeedType m14591newTEnum(String str, int i) {
                return ODiamondFeedType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ODiamondFeedType>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ODiamondFeedType m14592newTEnum(String str, int i) {
                return ODiamondFeedType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(latestVisitor);
        supportEnum.add(dailyReport);
        supportEnum.add(weeklyReport);
        supportEnum.add("instantChat");
        _ODiamondFeedType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ODiamondFeedType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ODiamondFeedType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ODiamondFeedType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ODiamondFeedType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ODiamondFeedType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ODiamondFeedType get(String str) {
        Map<String, ODiamondFeedType> map = _ODiamondFeedType;
        ODiamondFeedType oDiamondFeedType = map.get(str);
        if (oDiamondFeedType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oDiamondFeedType = integer == null ? new ODiamondFeedType(str, int_unknown_) : new ODiamondFeedType(str, integer.intValue());
            map.put(str, oDiamondFeedType);
        }
        return oDiamondFeedType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ODiamondFeedType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ODiamondFeedType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ODiamondFeedType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ODiamondFeedType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
