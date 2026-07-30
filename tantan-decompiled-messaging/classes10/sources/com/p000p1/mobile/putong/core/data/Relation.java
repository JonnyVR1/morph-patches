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
public class Relation extends TEnum {
    public static final TEnumJsonAdapter<Relation> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Relation> PROTOBUF_ADAPTER;
    private static final Map<String, Relation> _Relation;
    public static final String bothFollow = "bothFollow";
    public static final String follow = "follow";
    private static final int int_unknown_ = -1;
    public static final String like = "like";
    public static final String match = "match";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Relation> tEnumJsonAdapter = new TEnumJsonAdapter<Relation>() { // from class: com.p1.mobile.putong.core.data.Relation.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public Relation m15375newTEnum(String str, int i) {
                return Relation.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Relation>() { // from class: com.p1.mobile.putong.core.data.Relation.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public Relation m15376newTEnum(String str, int i) {
                return Relation.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("like");
        supportEnum.add("match");
        supportEnum.add(bothFollow);
        supportEnum.add(follow);
        _Relation = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private Relation(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Relation> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Relation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Relation> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Relation> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static Relation get(String str) {
        Map<String, Relation> map = _Relation;
        Relation relation = map.get(str);
        if (relation == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            relation = integer == null ? new Relation(str, int_unknown_) : new Relation(str, integer.intValue());
            map.put(str, relation);
        }
        return relation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Relation getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Relation> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Relation> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Relation get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
