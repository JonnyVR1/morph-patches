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
public class LoadStrategy extends TEnum {
    public static final TEnumJsonAdapter<LoadStrategy> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LoadStrategy> PROTOBUF_ADAPTER;
    private static final Map<String, LoadStrategy> _LoadStrategy;
    private static final int int_overlap = 0;
    private static final int int_unknown_ = -1;
    private static final int int_update = 1;
    public static final String nochange = "nochange";
    public static final String overlap = "overlap";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String update = "update";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LoadStrategy> tEnumJsonAdapter = new TEnumJsonAdapter<LoadStrategy>() { // from class: com.p1.mobile.putong.data.LoadStrategy.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LoadStrategy newTEnum(String str, int i) {
                return LoadStrategy.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LoadStrategy>() { // from class: com.p1.mobile.putong.data.LoadStrategy.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LoadStrategy newTEnum(String str, int i) {
                return LoadStrategy.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("overlap", 0);
        tEnumJsonAdapter.addExtJsonValue("update", 1);
        supportEnum.add("overlap");
        supportEnum.add("update");
        supportEnum.add(nochange);
        _LoadStrategy = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LoadStrategy(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LoadStrategy> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LoadStrategy> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LoadStrategy> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LoadStrategy> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LoadStrategy get(String str) {
        Map<String, LoadStrategy> map = _LoadStrategy;
        LoadStrategy loadStrategy = map.get(str);
        if (loadStrategy == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            loadStrategy = integer == null ? new LoadStrategy(str, -1) : new LoadStrategy(str, integer.intValue());
            map.put(str, loadStrategy);
        }
        return loadStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoadStrategy getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LoadStrategy> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LoadStrategy> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LoadStrategy get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
