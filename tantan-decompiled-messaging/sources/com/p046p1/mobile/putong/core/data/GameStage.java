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
public class GameStage extends TEnum {
    public static final TEnumJsonAdapter<GameStage> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GameStage> PROTOBUF_ADAPTER;
    private static final Map<String, GameStage> _GameStage;
    public static final String end = "end";
    private static final int int_unknown_ = -1;
    public static final String show = "show";
    public static final String start = "start";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GameStage> tEnumJsonAdapter = new TEnumJsonAdapter<GameStage>() { // from class: com.p1.mobile.putong.core.data.GameStage.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public GameStage newTEnum(String str, int i) {
                return GameStage.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GameStage>() { // from class: com.p1.mobile.putong.core.data.GameStage.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public GameStage newTEnum(String str, int i) {
                return GameStage.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("show");
        supportEnum.add("start");
        supportEnum.add("end");
        _GameStage = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GameStage(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GameStage> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GameStage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GameStage> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GameStage> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GameStage get(String str) {
        Map<String, GameStage> map = _GameStage;
        GameStage gameStage = map.get(str);
        if (gameStage == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            gameStage = integer == null ? new GameStage(str, -1) : new GameStage(str, integer.intValue());
            map.put(str, gameStage);
        }
        return gameStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GameStage getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GameStage> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GameStage> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GameStage get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
