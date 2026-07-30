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
public class BroadcastStatus extends TEnum {
    public static final String CHECKING = "CHECKING";
    public static final String INIT = "INIT";
    public static final TEnumJsonAdapter<BroadcastStatus> JSON_ADAPTER;
    public static final String PASS = "PASS";
    public static final TEnumProtobufAdapter<BroadcastStatus> PROTOBUF_ADAPTER;
    public static final String REFUSED = "REFUSED";
    private static final Map<String, BroadcastStatus> _BroadcastStatus;
    private static final int int_CHECKING = 1;
    private static final int int_INIT = 0;
    private static final int int_PASS = 3;
    private static final int int_REFUSED = 2;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BroadcastStatus> tEnumJsonAdapter = new TEnumJsonAdapter<BroadcastStatus>() { // from class: com.p1.mobile.putong.data.BroadcastStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public BroadcastStatus newTEnum(String str, int i) {
                return BroadcastStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BroadcastStatus>() { // from class: com.p1.mobile.putong.data.BroadcastStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public BroadcastStatus newTEnum(String str, int i) {
                return BroadcastStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(INIT, 0);
        tEnumJsonAdapter.addExtJsonValue(CHECKING, 1);
        tEnumJsonAdapter.addExtJsonValue(REFUSED, 2);
        tEnumJsonAdapter.addExtJsonValue(PASS, 3);
        supportEnum.add(INIT);
        supportEnum.add(CHECKING);
        supportEnum.add(REFUSED);
        supportEnum.add(PASS);
        _BroadcastStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BroadcastStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BroadcastStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BroadcastStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BroadcastStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BroadcastStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BroadcastStatus get(String str) {
        Map<String, BroadcastStatus> map = _BroadcastStatus;
        BroadcastStatus broadcastStatus = map.get(str);
        if (broadcastStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            broadcastStatus = integer == null ? new BroadcastStatus(str, -1) : new BroadcastStatus(str, integer.intValue());
            map.put(str, broadcastStatus);
        }
        return broadcastStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BroadcastStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BroadcastStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BroadcastStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BroadcastStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
