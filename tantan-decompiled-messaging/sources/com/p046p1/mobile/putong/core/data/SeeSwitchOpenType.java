package com.p046p1.mobile.putong.core.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes10.dex */
public class SeeSwitchOpenType extends TEnum {
    public static final TEnumJsonAdapter<SeeSwitchOpenType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SeeSwitchOpenType> PROTOBUF_ADAPTER;
    private static final Map<String, SeeSwitchOpenType> _SeeSwitchOpenType;
    private static final int int_second_day = 0;
    private static final int int_second_session = 1;
    private static final int int_unknown_ = -1;
    public static final String second_day = "second_day";
    public static final String second_session = "second_session";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SeeSwitchOpenType> tEnumJsonAdapter = new TEnumJsonAdapter<SeeSwitchOpenType>() { // from class: com.p1.mobile.putong.core.data.SeeSwitchOpenType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SeeSwitchOpenType newTEnum(String str, int i) {
                return SeeSwitchOpenType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SeeSwitchOpenType>() { // from class: com.p1.mobile.putong.core.data.SeeSwitchOpenType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SeeSwitchOpenType newTEnum(String str, int i) {
                return SeeSwitchOpenType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(second_day, 0);
        tEnumJsonAdapter.addExtJsonValue(second_session, 1);
        supportEnum.add(second_day);
        supportEnum.add(second_session);
        _SeeSwitchOpenType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SeeSwitchOpenType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SeeSwitchOpenType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SeeSwitchOpenType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SeeSwitchOpenType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SeeSwitchOpenType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SeeSwitchOpenType get(String str) {
        Map<String, SeeSwitchOpenType> map = _SeeSwitchOpenType;
        SeeSwitchOpenType seeSwitchOpenType = map.get(str);
        if (seeSwitchOpenType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            seeSwitchOpenType = integer == null ? new SeeSwitchOpenType(str, -1) : new SeeSwitchOpenType(str, integer.intValue());
            map.put(str, seeSwitchOpenType);
        }
        return seeSwitchOpenType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SeeSwitchOpenType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SeeSwitchOpenType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SeeSwitchOpenType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SeeSwitchOpenType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
