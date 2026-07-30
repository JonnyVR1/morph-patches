package com.p000p1.mobile.putong.data;

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
public class LookingFor extends TEnum {
    public static final TEnumJsonAdapter<LookingFor> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LookingFor> PROTOBUF_ADAPTER;
    private static final Map<String, LookingFor> _LookingFor;
    public static final String both = "both";
    public static final String female = "female";
    private static final int int_both = 2;
    private static final int int_female = 1;
    private static final int int_male = 0;
    private static final int int_unknown_ = -1;
    public static final String male = "male";
    public static final String nonbinary = "nonbinary";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LookingFor> tEnumJsonAdapter = new TEnumJsonAdapter<LookingFor>() { // from class: com.p1.mobile.putong.data.LookingFor.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LookingFor newTEnum(String str, int i) {
                return LookingFor.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LookingFor>() { // from class: com.p1.mobile.putong.data.LookingFor.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LookingFor newTEnum(String str, int i) {
                return LookingFor.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("male", 0);
        tEnumJsonAdapter.addExtJsonValue("female", 1);
        tEnumJsonAdapter.addExtJsonValue(both, 2);
        supportEnum.add("male");
        supportEnum.add("female");
        supportEnum.add(both);
        supportEnum.add("nonbinary");
        _LookingFor = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LookingFor(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LookingFor> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LookingFor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LookingFor> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LookingFor> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LookingFor get(String str) {
        Map<String, LookingFor> map = _LookingFor;
        LookingFor lookingFor = map.get(str);
        if (lookingFor == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            lookingFor = integer == null ? new LookingFor(str, -1) : new LookingFor(str, integer.intValue());
            map.put(str, lookingFor);
        }
        return lookingFor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LookingFor getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LookingFor> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LookingFor> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LookingFor get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
