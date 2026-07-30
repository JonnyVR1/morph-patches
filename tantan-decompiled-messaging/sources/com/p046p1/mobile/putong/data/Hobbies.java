package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class Hobbies extends TEnum {
    public static final TEnumJsonAdapter<Hobbies> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Hobbies> PROTOBUF_ADAPTER;
    private static final Map<String, Hobbies> _Hobbies;
    public static final String dance = "dance";
    public static final String disco = "disco";
    public static final String food = "food";
    private static final int int_dance = 1;
    private static final int int_disco = 0;
    private static final int int_food = 3;
    private static final int int_movie = 4;
    private static final int int_music = 2;
    private static final int int_travel = 5;
    private static final int int_unknown_ = -1;
    public static final String movie = "movie";
    public static final String music = "music";
    protected static HashSet<String> supportEnum = null;
    public static final String travel = "travel";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Hobbies> tEnumJsonAdapter = new TEnumJsonAdapter<Hobbies>() { // from class: com.p1.mobile.putong.data.Hobbies.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Hobbies newTEnum(String str, int i) {
                return Hobbies.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Hobbies>() { // from class: com.p1.mobile.putong.data.Hobbies.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Hobbies newTEnum(String str, int i) {
                return Hobbies.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(disco, 0);
        tEnumJsonAdapter.addExtJsonValue(dance, 1);
        tEnumJsonAdapter.addExtJsonValue("music", 2);
        tEnumJsonAdapter.addExtJsonValue("food", 3);
        tEnumJsonAdapter.addExtJsonValue("movie", 4);
        tEnumJsonAdapter.addExtJsonValue(travel, 5);
        supportEnum.add(disco);
        supportEnum.add(dance);
        supportEnum.add("music");
        supportEnum.add("food");
        supportEnum.add("movie");
        supportEnum.add(travel);
        _Hobbies = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private Hobbies(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Hobbies> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Hobbies> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Hobbies> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Hobbies> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static Hobbies get(String str) {
        Map<String, Hobbies> map = _Hobbies;
        Hobbies hobbies = map.get(str);
        if (hobbies == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            hobbies = integer == null ? new Hobbies(str, -1) : new Hobbies(str, integer.intValue());
            map.put(str, hobbies);
        }
        return hobbies;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Hobbies getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Hobbies> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Hobbies> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Hobbies get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
