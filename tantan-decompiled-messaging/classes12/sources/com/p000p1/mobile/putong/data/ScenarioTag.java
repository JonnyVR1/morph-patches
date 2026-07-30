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
public class ScenarioTag extends TEnum {
    public static final TEnumJsonAdapter<ScenarioTag> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ScenarioTag> PROTOBUF_ADAPTER;
    private static final Map<String, ScenarioTag> _ScenarioTag;
    public static final String category_entertainment = "category/entertainment";
    public static final String category_food = "category/food";
    public static final String category_game = "category/game";
    public static final String category_lifestyle = "category/lifestyle";
    public static final String category_movie = "category/movie";
    public static final String category_romance = "category/romance";
    public static final String category_sport = "category/sport";
    public static final String default_ = "default";
    public static final String favorite = "favorite";
    private static final int int_category_entertainment = 6;
    private static final int int_category_food = 0;
    private static final int int_category_game = 5;
    private static final int int_category_lifestyle = 7;
    private static final int int_category_movie = 1;
    private static final int int_category_romance = 8;
    private static final int int_category_sport = 2;
    private static final int int_default_ = 4;
    private static final int int_favorite = 3;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ScenarioTag> tEnumJsonAdapter = new TEnumJsonAdapter<ScenarioTag>() { // from class: com.p1.mobile.putong.data.ScenarioTag.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ScenarioTag newTEnum(String str, int i) {
                return ScenarioTag.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ScenarioTag>() { // from class: com.p1.mobile.putong.data.ScenarioTag.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ScenarioTag newTEnum(String str, int i) {
                return ScenarioTag.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(category_food, 0);
        tEnumJsonAdapter.addExtJsonValue(category_movie, 1);
        tEnumJsonAdapter.addExtJsonValue(category_sport, 2);
        tEnumJsonAdapter.addExtJsonValue("favorite", 3);
        tEnumJsonAdapter.addExtJsonValue("default", 4);
        tEnumJsonAdapter.addExtJsonValue(category_game, 5);
        tEnumJsonAdapter.addExtJsonValue(category_entertainment, 6);
        tEnumJsonAdapter.addExtJsonValue(category_lifestyle, 7);
        tEnumJsonAdapter.addExtJsonValue(category_romance, 8);
        supportEnum.add(category_food);
        supportEnum.add(category_movie);
        supportEnum.add(category_sport);
        supportEnum.add("favorite");
        supportEnum.add("default");
        supportEnum.add(category_game);
        supportEnum.add(category_entertainment);
        supportEnum.add(category_lifestyle);
        supportEnum.add(category_romance);
        _ScenarioTag = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ScenarioTag(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ScenarioTag> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ScenarioTag> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ScenarioTag> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ScenarioTag> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ScenarioTag get(String str) {
        Map<String, ScenarioTag> map = _ScenarioTag;
        ScenarioTag scenarioTag = map.get(str);
        if (scenarioTag == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            scenarioTag = integer == null ? new ScenarioTag(str, -1) : new ScenarioTag(str, integer.intValue());
            map.put(str, scenarioTag);
        }
        return scenarioTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScenarioTag getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ScenarioTag> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ScenarioTag> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ScenarioTag get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
