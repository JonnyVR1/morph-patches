package com.p051p1.mobile.putong.core.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes10.dex */
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
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Relation newTEnum(String str, int i) {
                return Relation.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Relation>() { // from class: com.p1.mobile.putong.core.data.Relation.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Relation newTEnum(String str, int i) {
                return Relation.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("like");
        supportEnum.add("match");
        supportEnum.add(bothFollow);
        supportEnum.add("follow");
        _Relation = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private Relation(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
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
        l01 l01Var = new l01();
        for (Map.Entry<String, Relation> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static Relation get(String str) {
        Map<String, Relation> map = _Relation;
        Relation relation = map.get(str);
        if (relation == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            relation = integer == null ? new Relation(str, -1) : new Relation(str, integer.intValue());
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
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Relation> oldEnumCovertMap(Map<String, Integer> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            l01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return l01Var;
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

    private static Relation get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
