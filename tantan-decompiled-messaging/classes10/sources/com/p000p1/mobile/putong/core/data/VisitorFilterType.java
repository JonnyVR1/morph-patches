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
public class VisitorFilterType extends TEnum {
    public static final TEnumJsonAdapter<VisitorFilterType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VisitorFilterType> PROTOBUF_ADAPTER;
    private static final Map<String, VisitorFilterType> _VisitorFilterType;
    public static final String all = "all";
    private static final int int_unknown_ = -1;
    public static final String likeMe = "likeMe";
    public static final String match = "match";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<VisitorFilterType> tEnumJsonAdapter = new TEnumJsonAdapter<VisitorFilterType>() { // from class: com.p1.mobile.putong.core.data.VisitorFilterType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public VisitorFilterType m16242newTEnum(String str, int i) {
                return VisitorFilterType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<VisitorFilterType>() { // from class: com.p1.mobile.putong.core.data.VisitorFilterType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public VisitorFilterType m16243newTEnum(String str, int i) {
                return VisitorFilterType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("all");
        supportEnum.add("match");
        supportEnum.add(likeMe);
        _VisitorFilterType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private VisitorFilterType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VisitorFilterType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VisitorFilterType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VisitorFilterType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, VisitorFilterType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static VisitorFilterType get(String str) {
        Map<String, VisitorFilterType> map = _VisitorFilterType;
        VisitorFilterType visitorFilterType = map.get(str);
        if (visitorFilterType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            visitorFilterType = integer == null ? new VisitorFilterType(str, int_unknown_) : new VisitorFilterType(str, integer.intValue());
            map.put(str, visitorFilterType);
        }
        return visitorFilterType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VisitorFilterType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VisitorFilterType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VisitorFilterType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VisitorFilterType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
