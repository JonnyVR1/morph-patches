package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HomeTabModuleId extends TEnum {
    public static final TEnumJsonAdapter<HomeTabModuleId> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<HomeTabModuleId> PROTOBUF_ADAPTER;
    private static final Map<String, HomeTabModuleId> _HomeTabModuleId;
    public static final String board = "board";
    private static final int int_board = 0;
    private static final int int_quickchat = 2;
    private static final int int_see = 1;
    private static final int int_unknown_ = -1;
    public static final String quickchat = "quickchat";
    public static final String see = "see";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<HomeTabModuleId> tEnumJsonAdapter = new TEnumJsonAdapter<HomeTabModuleId>() { // from class: com.p1.mobile.putong.core.data.HomeTabModuleId.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public HomeTabModuleId m13321newTEnum(String str, int i) {
                return HomeTabModuleId.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<HomeTabModuleId>() { // from class: com.p1.mobile.putong.core.data.HomeTabModuleId.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public HomeTabModuleId m13322newTEnum(String str, int i) {
                return HomeTabModuleId.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(board, int_board);
        tEnumJsonAdapter.addExtJsonValue("see", 1);
        tEnumJsonAdapter.addExtJsonValue("quickchat", 2);
        supportEnum.add(board);
        supportEnum.add("see");
        supportEnum.add("quickchat");
        _HomeTabModuleId = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private HomeTabModuleId(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<HomeTabModuleId> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<HomeTabModuleId> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, HomeTabModuleId> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, HomeTabModuleId> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static HomeTabModuleId get(String str) {
        Map<String, HomeTabModuleId> map = _HomeTabModuleId;
        HomeTabModuleId homeTabModuleId = map.get(str);
        if (homeTabModuleId == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            homeTabModuleId = integer == null ? new HomeTabModuleId(str, int_unknown_) : new HomeTabModuleId(str, integer.intValue());
            map.put(str, homeTabModuleId);
        }
        return homeTabModuleId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HomeTabModuleId getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<HomeTabModuleId> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, HomeTabModuleId> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static HomeTabModuleId get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
