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
public class MiniWidgetDataType extends TEnum {
    public static final TEnumJsonAdapter<MiniWidgetDataType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MiniWidgetDataType> PROTOBUF_ADAPTER;
    private static final Map<String, MiniWidgetDataType> _MiniWidgetDataType;
    public static final String high_pop = "high_pop";
    private static final int int_unknown_ = -1;
    public static final String online_friends = "online_friends";
    public static final String people_of_see = "people_of_see";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MiniWidgetDataType> tEnumJsonAdapter = new TEnumJsonAdapter<MiniWidgetDataType>() { // from class: com.p1.mobile.putong.data.MiniWidgetDataType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MiniWidgetDataType newTEnum(String str, int i) {
                return MiniWidgetDataType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MiniWidgetDataType>() { // from class: com.p1.mobile.putong.data.MiniWidgetDataType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MiniWidgetDataType newTEnum(String str, int i) {
                return MiniWidgetDataType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(high_pop);
        supportEnum.add(online_friends);
        supportEnum.add(people_of_see);
        _MiniWidgetDataType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MiniWidgetDataType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MiniWidgetDataType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MiniWidgetDataType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MiniWidgetDataType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MiniWidgetDataType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MiniWidgetDataType get(String str) {
        Map<String, MiniWidgetDataType> map = _MiniWidgetDataType;
        MiniWidgetDataType miniWidgetDataType = map.get(str);
        if (miniWidgetDataType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            miniWidgetDataType = integer == null ? new MiniWidgetDataType(str, -1) : new MiniWidgetDataType(str, integer.intValue());
            map.put(str, miniWidgetDataType);
        }
        return miniWidgetDataType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MiniWidgetDataType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MiniWidgetDataType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MiniWidgetDataType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MiniWidgetDataType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
