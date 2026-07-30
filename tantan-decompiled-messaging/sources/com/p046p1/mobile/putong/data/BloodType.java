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
public class BloodType extends TEnum {

    /* JADX INFO: renamed from: A */
    public static final String f38725A = "A";

    /* JADX INFO: renamed from: AB */
    public static final String f38726AB = "AB";

    /* JADX INFO: renamed from: B */
    public static final String f38727B = "B";
    public static final TEnumJsonAdapter<BloodType> JSON_ADAPTER;

    /* JADX INFO: renamed from: O */
    public static final String f38728O = "O";
    public static final TEnumProtobufAdapter<BloodType> PROTOBUF_ADAPTER;
    public static final String UNKNOWN = "UNKNOWN";
    private static final Map<String, BloodType> _BloodType;
    private static final int int_A = 0;
    private static final int int_AB = 3;
    private static final int int_B = 1;
    private static final int int_O = 2;
    private static final int int_UNKNOWN = 4;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BloodType> tEnumJsonAdapter = new TEnumJsonAdapter<BloodType>() { // from class: com.p1.mobile.putong.data.BloodType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public BloodType newTEnum(String str, int i) {
                return BloodType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BloodType>() { // from class: com.p1.mobile.putong.data.BloodType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public BloodType newTEnum(String str, int i) {
                return BloodType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("A", 0);
        tEnumJsonAdapter.addExtJsonValue("B", 1);
        tEnumJsonAdapter.addExtJsonValue(f38728O, 2);
        tEnumJsonAdapter.addExtJsonValue(f38726AB, 3);
        tEnumJsonAdapter.addExtJsonValue("UNKNOWN", 4);
        supportEnum.add("A");
        supportEnum.add("B");
        supportEnum.add(f38728O);
        supportEnum.add(f38726AB);
        supportEnum.add("UNKNOWN");
        _BloodType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BloodType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BloodType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BloodType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BloodType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BloodType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BloodType get(String str) {
        Map<String, BloodType> map = _BloodType;
        BloodType bloodType = map.get(str);
        if (bloodType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bloodType = integer == null ? new BloodType(str, -1) : new BloodType(str, integer.intValue());
            map.put(str, bloodType);
        }
        return bloodType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BloodType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BloodType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BloodType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BloodType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
