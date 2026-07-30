package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class BroadcastType extends TEnum {
    public static final TEnumJsonAdapter<BroadcastType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BroadcastType> PROTOBUF_ADAPTER;
    private static final Map<String, BroadcastType> _BroadcastType;
    public static final String boost = "boost";
    public static final String broadcast = "broadcast";
    private static final int int_boost = 0;
    private static final int int_broadcast = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BroadcastType> tEnumJsonAdapter = new TEnumJsonAdapter<BroadcastType>() { // from class: com.p1.mobile.putong.data.BroadcastType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public BroadcastType newTEnum(String str, int i) {
                return BroadcastType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BroadcastType>() { // from class: com.p1.mobile.putong.data.BroadcastType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public BroadcastType newTEnum(String str, int i) {
                return BroadcastType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("boost", 0);
        tEnumJsonAdapter.addExtJsonValue("broadcast", 1);
        supportEnum.add("boost");
        supportEnum.add("broadcast");
        _BroadcastType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BroadcastType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BroadcastType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BroadcastType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BroadcastType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BroadcastType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BroadcastType get(String str) {
        Map<String, BroadcastType> map = _BroadcastType;
        BroadcastType broadcastType = map.get(str);
        if (broadcastType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            broadcastType = integer == null ? new BroadcastType(str, -1) : new BroadcastType(str, integer.intValue());
            map.put(str, broadcastType);
        }
        return broadcastType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BroadcastType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BroadcastType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BroadcastType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BroadcastType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
