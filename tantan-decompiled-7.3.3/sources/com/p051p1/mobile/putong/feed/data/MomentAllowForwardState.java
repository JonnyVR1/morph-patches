package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class MomentAllowForwardState extends TEnum {
    public static final TEnumJsonAdapter<MomentAllowForwardState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MomentAllowForwardState> PROTOBUF_ADAPTER;
    private static final Map<String, MomentAllowForwardState> _MomentAllowForwardState;
    public static final String allow = "allow";
    public static final String disallow = "disallow";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MomentAllowForwardState> tEnumJsonAdapter = new TEnumJsonAdapter<MomentAllowForwardState>() { // from class: com.p1.mobile.putong.feed.data.MomentAllowForwardState.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MomentAllowForwardState newTEnum(String str, int i) {
                return MomentAllowForwardState.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MomentAllowForwardState>() { // from class: com.p1.mobile.putong.feed.data.MomentAllowForwardState.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MomentAllowForwardState newTEnum(String str, int i) {
                return MomentAllowForwardState.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(allow);
        supportEnum.add(disallow);
        _MomentAllowForwardState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MomentAllowForwardState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MomentAllowForwardState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MomentAllowForwardState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MomentAllowForwardState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MomentAllowForwardState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MomentAllowForwardState get(String str) {
        Map<String, MomentAllowForwardState> map = _MomentAllowForwardState;
        MomentAllowForwardState momentAllowForwardState = map.get(str);
        if (momentAllowForwardState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            momentAllowForwardState = integer == null ? new MomentAllowForwardState(str, -1) : new MomentAllowForwardState(str, integer.intValue());
            map.put(str, momentAllowForwardState);
        }
        return momentAllowForwardState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MomentAllowForwardState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MomentAllowForwardState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MomentAllowForwardState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MomentAllowForwardState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
