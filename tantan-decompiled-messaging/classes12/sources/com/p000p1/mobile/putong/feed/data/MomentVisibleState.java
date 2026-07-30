package com.p000p1.mobile.putong.feed.data;

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
public class MomentVisibleState extends TEnum {
    public static final TEnumJsonAdapter<MomentVisibleState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MomentVisibleState> PROTOBUF_ADAPTER;
    private static final Map<String, MomentVisibleState> _MomentVisibleState;
    public static final String everyone = "everyone";
    private static final int int_everyone = 0;
    private static final int int_matches = 2;
    private static final int int_stranger = 1;
    private static final int int_unknown_ = -1;
    public static final String matches = "matches";
    public static final String stranger = "stranger";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MomentVisibleState> tEnumJsonAdapter = new TEnumJsonAdapter<MomentVisibleState>() { // from class: com.p1.mobile.putong.feed.data.MomentVisibleState.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MomentVisibleState newTEnum(String str, int i) {
                return MomentVisibleState.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MomentVisibleState>() { // from class: com.p1.mobile.putong.feed.data.MomentVisibleState.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MomentVisibleState newTEnum(String str, int i) {
                return MomentVisibleState.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("everyone", 0);
        tEnumJsonAdapter.addExtJsonValue("stranger", 1);
        tEnumJsonAdapter.addExtJsonValue("matches", 2);
        supportEnum.add("everyone");
        supportEnum.add("stranger");
        supportEnum.add("matches");
        _MomentVisibleState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MomentVisibleState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MomentVisibleState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MomentVisibleState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MomentVisibleState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MomentVisibleState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MomentVisibleState get(String str) {
        Map<String, MomentVisibleState> map = _MomentVisibleState;
        MomentVisibleState momentVisibleState = map.get(str);
        if (momentVisibleState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            momentVisibleState = integer == null ? new MomentVisibleState(str, -1) : new MomentVisibleState(str, integer.intValue());
            map.put(str, momentVisibleState);
        }
        return momentVisibleState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MomentVisibleState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MomentVisibleState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MomentVisibleState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MomentVisibleState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
