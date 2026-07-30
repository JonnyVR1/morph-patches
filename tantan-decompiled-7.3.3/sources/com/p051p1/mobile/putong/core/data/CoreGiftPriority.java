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
public class CoreGiftPriority extends TEnum {
    public static final String HIGH = "HIGH";
    public static final String IMMEDIATE = "IMMEDIATE";
    public static final TEnumJsonAdapter<CoreGiftPriority> JSON_ADAPTER;
    public static final String LOW = "LOW";
    public static final String MEDIUM = "MEDIUM";
    public static final TEnumProtobufAdapter<CoreGiftPriority> PROTOBUF_ADAPTER;
    private static final Map<String, CoreGiftPriority> _CoreGiftPriority;
    private static final int int_HIGH = 2;
    private static final int int_IMMEDIATE = 3;
    private static final int int_LOW = 0;
    private static final int int_MEDIUM = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CoreGiftPriority> tEnumJsonAdapter = new TEnumJsonAdapter<CoreGiftPriority>() { // from class: com.p1.mobile.putong.core.data.CoreGiftPriority.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public CoreGiftPriority newTEnum(String str, int i) {
                return CoreGiftPriority.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CoreGiftPriority>() { // from class: com.p1.mobile.putong.core.data.CoreGiftPriority.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public CoreGiftPriority newTEnum(String str, int i) {
                return CoreGiftPriority.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("LOW", 0);
        tEnumJsonAdapter.addExtJsonValue("MEDIUM", 1);
        tEnumJsonAdapter.addExtJsonValue("HIGH", 2);
        tEnumJsonAdapter.addExtJsonValue("IMMEDIATE", 3);
        supportEnum.add("LOW");
        supportEnum.add("MEDIUM");
        supportEnum.add("HIGH");
        supportEnum.add("IMMEDIATE");
        _CoreGiftPriority = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private CoreGiftPriority(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CoreGiftPriority> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoreGiftPriority> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CoreGiftPriority> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, CoreGiftPriority> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static CoreGiftPriority get(String str) {
        Map<String, CoreGiftPriority> map = _CoreGiftPriority;
        CoreGiftPriority coreGiftPriority = map.get(str);
        if (coreGiftPriority == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            coreGiftPriority = integer == null ? new CoreGiftPriority(str, -1) : new CoreGiftPriority(str, integer.intValue());
            map.put(str, coreGiftPriority);
        }
        return coreGiftPriority;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CoreGiftPriority getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CoreGiftPriority> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CoreGiftPriority> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CoreGiftPriority get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
