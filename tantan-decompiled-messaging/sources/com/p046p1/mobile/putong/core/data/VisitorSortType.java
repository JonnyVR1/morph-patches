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
public class VisitorSortType extends TEnum {
    public static final TEnumJsonAdapter<VisitorSortType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VisitorSortType> PROTOBUF_ADAPTER;
    private static final Map<String, VisitorSortType> _VisitorSortType;
    public static final String distance = "distance";
    private static final int int_unknown_ = -1;
    public static final String newUser = "newUser";
    public static final String realUser = "realUser";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String visitTime = "visitTime";
    public static final String visitTimes = "visitTimes";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<VisitorSortType> tEnumJsonAdapter = new TEnumJsonAdapter<VisitorSortType>() { // from class: com.p1.mobile.putong.core.data.VisitorSortType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public VisitorSortType newTEnum(String str, int i) {
                return VisitorSortType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<VisitorSortType>() { // from class: com.p1.mobile.putong.core.data.VisitorSortType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public VisitorSortType newTEnum(String str, int i) {
                return VisitorSortType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("visitTime");
        supportEnum.add("visitTimes");
        supportEnum.add("distance");
        supportEnum.add(realUser);
        supportEnum.add("newUser");
        _VisitorSortType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private VisitorSortType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VisitorSortType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VisitorSortType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VisitorSortType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, VisitorSortType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static VisitorSortType get(String str) {
        Map<String, VisitorSortType> map = _VisitorSortType;
        VisitorSortType visitorSortType = map.get(str);
        if (visitorSortType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            visitorSortType = integer == null ? new VisitorSortType(str, -1) : new VisitorSortType(str, integer.intValue());
            map.put(str, visitorSortType);
        }
        return visitorSortType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VisitorSortType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VisitorSortType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VisitorSortType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VisitorSortType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
