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
public class LiveType extends TEnum {
    public static final TEnumJsonAdapter<LiveType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LiveType> PROTOBUF_ADAPTER;
    private static final Map<String, LiveType> _LiveType;
    private static final int int_unknown_ = -1;
    public static final String live = "live";
    public static final String liveVoice = "liveVoice";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LiveType> tEnumJsonAdapter = new TEnumJsonAdapter<LiveType>() { // from class: com.p1.mobile.putong.core.data.LiveType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LiveType newTEnum(String str, int i) {
                return LiveType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LiveType>() { // from class: com.p1.mobile.putong.core.data.LiveType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LiveType newTEnum(String str, int i) {
                return LiveType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("live");
        supportEnum.add(liveVoice);
        _LiveType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LiveType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LiveType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LiveType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LiveType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LiveType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LiveType get(String str) {
        Map<String, LiveType> map = _LiveType;
        LiveType liveType = map.get(str);
        if (liveType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            liveType = integer == null ? new LiveType(str, -1) : new LiveType(str, integer.intValue());
            map.put(str, liveType);
        }
        return liveType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LiveType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LiveType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LiveType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LiveType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
