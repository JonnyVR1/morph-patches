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
public class GameIdentity extends TEnum {
    public static final TEnumJsonAdapter<GameIdentity> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GameIdentity> PROTOBUF_ADAPTER;
    private static final Map<String, GameIdentity> _GameIdentity;
    public static final String guest = "guest";
    private static final int int_unknown_ = -1;
    public static final String player = "player";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GameIdentity> tEnumJsonAdapter = new TEnumJsonAdapter<GameIdentity>() { // from class: com.p1.mobile.putong.core.data.GameIdentity.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public GameIdentity newTEnum(String str, int i) {
                return GameIdentity.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GameIdentity>() { // from class: com.p1.mobile.putong.core.data.GameIdentity.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public GameIdentity newTEnum(String str, int i) {
                return GameIdentity.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(guest);
        supportEnum.add(player);
        _GameIdentity = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GameIdentity(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GameIdentity> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GameIdentity> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GameIdentity> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GameIdentity> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GameIdentity get(String str) {
        Map<String, GameIdentity> map = _GameIdentity;
        GameIdentity gameIdentity = map.get(str);
        if (gameIdentity == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            gameIdentity = integer == null ? new GameIdentity(str, -1) : new GameIdentity(str, integer.intValue());
            map.put(str, gameIdentity);
        }
        return gameIdentity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GameIdentity getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GameIdentity> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GameIdentity> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GameIdentity get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
