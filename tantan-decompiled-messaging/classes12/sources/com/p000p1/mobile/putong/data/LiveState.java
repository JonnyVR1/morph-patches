package com.p000p1.mobile.putong.data;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveState extends TEnum {
    public static final TEnumJsonAdapter<LiveState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LiveState> PROTOBUF_ADAPTER;
    private static final Map<String, LiveState> _LiveState;
    private static final int int_onlive = 0;
    private static final int int_stopped = 2;
    private static final int int_suspended = 1;
    private static final int int_unknown_ = -1;
    public static final String onlive = "onlive";
    public static final String stopped = "stopped";
    protected static HashSet<String> supportEnum = null;
    public static final String suspended = "suspended";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LiveState> tEnumJsonAdapter = new TEnumJsonAdapter<LiveState>() { // from class: com.p1.mobile.putong.data.LiveState.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LiveState newTEnum(String str, int i) {
                return LiveState.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LiveState>() { // from class: com.p1.mobile.putong.data.LiveState.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LiveState newTEnum(String str, int i) {
                return LiveState.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("onlive", 0);
        tEnumJsonAdapter.addExtJsonValue(suspended, 1);
        tEnumJsonAdapter.addExtJsonValue("stopped", 2);
        supportEnum.add("onlive");
        supportEnum.add(suspended);
        supportEnum.add("stopped");
        _LiveState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LiveState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LiveState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LiveState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LiveState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LiveState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LiveState get(String str) {
        Map<String, LiveState> map = _LiveState;
        LiveState liveState = map.get(str);
        if (liveState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            liveState = integer == null ? new LiveState(str, -1) : new LiveState(str, integer.intValue());
            map.put(str, liveState);
        }
        return liveState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LiveState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LiveState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LiveState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LiveState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
