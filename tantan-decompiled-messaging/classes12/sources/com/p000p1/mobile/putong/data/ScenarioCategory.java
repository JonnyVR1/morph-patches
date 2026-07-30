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
public class ScenarioCategory extends TEnum {
    public static final TEnumJsonAdapter<ScenarioCategory> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ScenarioCategory> PROTOBUF_ADAPTER;
    private static final Map<String, ScenarioCategory> _ScenarioCategory;
    public static final String default_ = "default";
    public static final String food = "food";
    private static final int int_default_ = 3;
    private static final int int_food = 0;
    private static final int int_misc = 4;
    private static final int int_movie = 1;
    private static final int int_sport = 2;
    private static final int int_unknown_ = -1;
    public static final String misc = "misc";
    public static final String movie = "movie";
    public static final String sport = "sport";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ScenarioCategory> tEnumJsonAdapter = new TEnumJsonAdapter<ScenarioCategory>() { // from class: com.p1.mobile.putong.data.ScenarioCategory.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ScenarioCategory newTEnum(String str, int i) {
                return ScenarioCategory.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ScenarioCategory>() { // from class: com.p1.mobile.putong.data.ScenarioCategory.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ScenarioCategory newTEnum(String str, int i) {
                return ScenarioCategory.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("food", 0);
        tEnumJsonAdapter.addExtJsonValue("movie", 1);
        tEnumJsonAdapter.addExtJsonValue(sport, 2);
        tEnumJsonAdapter.addExtJsonValue("default", 3);
        tEnumJsonAdapter.addExtJsonValue(misc, 4);
        supportEnum.add("food");
        supportEnum.add("movie");
        supportEnum.add(sport);
        supportEnum.add("default");
        supportEnum.add(misc);
        _ScenarioCategory = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ScenarioCategory(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ScenarioCategory> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ScenarioCategory> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ScenarioCategory> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ScenarioCategory> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ScenarioCategory get(String str) {
        Map<String, ScenarioCategory> map = _ScenarioCategory;
        ScenarioCategory scenarioCategory = map.get(str);
        if (scenarioCategory == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            scenarioCategory = integer == null ? new ScenarioCategory(str, -1) : new ScenarioCategory(str, integer.intValue());
            map.put(str, scenarioCategory);
        }
        return scenarioCategory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScenarioCategory getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ScenarioCategory> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ScenarioCategory> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ScenarioCategory get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
