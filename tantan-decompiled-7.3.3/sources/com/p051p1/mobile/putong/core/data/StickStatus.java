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
public class StickStatus extends TEnum {
    public static final TEnumJsonAdapter<StickStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<StickStatus> PROTOBUF_ADAPTER;
    private static final Map<String, StickStatus> _StickStatus;
    private static final int int_normal = 0;
    private static final int int_top = 1;
    private static final int int_unknown_ = -1;
    public static final String normal = "normal";
    protected static HashSet<String> supportEnum = null;
    public static final String top = "top";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<StickStatus> tEnumJsonAdapter = new TEnumJsonAdapter<StickStatus>() { // from class: com.p1.mobile.putong.core.data.StickStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public StickStatus newTEnum(String str, int i) {
                return StickStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<StickStatus>() { // from class: com.p1.mobile.putong.core.data.StickStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public StickStatus newTEnum(String str, int i) {
                return StickStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("normal", 0);
        tEnumJsonAdapter.addExtJsonValue(top, 1);
        supportEnum.add("normal");
        supportEnum.add(top);
        _StickStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private StickStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<StickStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<StickStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, StickStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, StickStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static StickStatus get(String str) {
        Map<String, StickStatus> map = _StickStatus;
        StickStatus stickStatus = map.get(str);
        if (stickStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            stickStatus = integer == null ? new StickStatus(str, -1) : new StickStatus(str, integer.intValue());
            map.put(str, stickStatus);
        }
        return stickStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StickStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<StickStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, StickStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static StickStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
