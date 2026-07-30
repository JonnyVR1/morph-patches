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
public class InterestLevel extends TEnum {
    public static final TEnumJsonAdapter<InterestLevel> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<InterestLevel> PROTOBUF_ADAPTER;
    private static final Map<String, InterestLevel> _InterestLevel;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String to_watch = "to_watch";
    public static final String unknown_ = "unknown_";
    public static final String watched = "watched";
    public static final String watching = "watching";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<InterestLevel> tEnumJsonAdapter = new TEnumJsonAdapter<InterestLevel>() { // from class: com.p1.mobile.putong.core.data.InterestLevel.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public InterestLevel m13484newTEnum(String str, int i) {
                return InterestLevel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<InterestLevel>() { // from class: com.p1.mobile.putong.core.data.InterestLevel.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public InterestLevel m13485newTEnum(String str, int i) {
                return InterestLevel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(to_watch);
        supportEnum.add(watching);
        supportEnum.add(watched);
        _InterestLevel = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private InterestLevel(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<InterestLevel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterestLevel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, InterestLevel> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, InterestLevel> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static InterestLevel get(String str) {
        Map<String, InterestLevel> map = _InterestLevel;
        InterestLevel interestLevel = map.get(str);
        if (interestLevel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            interestLevel = integer == null ? new InterestLevel(str, int_unknown_) : new InterestLevel(str, integer.intValue());
            map.put(str, interestLevel);
        }
        return interestLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterestLevel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<InterestLevel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, InterestLevel> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static InterestLevel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
