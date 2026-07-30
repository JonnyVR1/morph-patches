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
public class DyMomentSource extends TEnum {
    public static final TEnumJsonAdapter<DyMomentSource> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<DyMomentSource> PROTOBUF_ADAPTER;
    private static final Map<String, DyMomentSource> _DyMomentSource;
    private static final int int_liked = 0;
    private static final int int_superLike = 1;
    private static final int int_unknown_ = -1;
    public static final String liked = "liked";
    public static final String superLike = "superLike";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<DyMomentSource> tEnumJsonAdapter = new TEnumJsonAdapter<DyMomentSource>() { // from class: com.p1.mobile.putong.data.DyMomentSource.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public DyMomentSource newTEnum(String str, int i) {
                return DyMomentSource.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<DyMomentSource>() { // from class: com.p1.mobile.putong.data.DyMomentSource.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public DyMomentSource newTEnum(String str, int i) {
                return DyMomentSource.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("liked", 0);
        tEnumJsonAdapter.addExtJsonValue("superLike", 1);
        supportEnum.add("liked");
        supportEnum.add("superLike");
        _DyMomentSource = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private DyMomentSource(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<DyMomentSource> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<DyMomentSource> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, DyMomentSource> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, DyMomentSource> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static DyMomentSource get(String str) {
        Map<String, DyMomentSource> map = _DyMomentSource;
        DyMomentSource dyMomentSource = map.get(str);
        if (dyMomentSource == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            dyMomentSource = integer == null ? new DyMomentSource(str, -1) : new DyMomentSource(str, integer.intValue());
            map.put(str, dyMomentSource);
        }
        return dyMomentSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DyMomentSource getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<DyMomentSource> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, DyMomentSource> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static DyMomentSource get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
