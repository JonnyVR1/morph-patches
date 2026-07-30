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
public class Careers extends TEnum {
    public static final TEnumJsonAdapter<Careers> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Careers> PROTOBUF_ADAPTER;
    private static final Map<String, Careers> _Careers;
    public static final String actor = "actor";
    public static final String business = "business";
    public static final String doctor = "doctor";
    public static final String finance = "finance";
    private static final int int_actor = 1;
    private static final int int_business = 6;
    private static final int int_doctor = 3;
    private static final int int_finance = 5;
    private static final int int_it = 4;
    private static final int int_science = 7;
    private static final int int_student = 0;
    private static final int int_teacher = 2;
    private static final int int_unknown_ = -1;

    /* JADX INFO: renamed from: it */
    public static final String f38732it = "it";
    public static final String science = "science";
    public static final String student = "student";
    protected static HashSet<String> supportEnum = null;
    public static final String teacher = "teacher";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Careers> tEnumJsonAdapter = new TEnumJsonAdapter<Careers>() { // from class: com.p1.mobile.putong.data.Careers.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Careers newTEnum(String str, int i) {
                return Careers.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Careers>() { // from class: com.p1.mobile.putong.data.Careers.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Careers newTEnum(String str, int i) {
                return Careers.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("student", 0);
        tEnumJsonAdapter.addExtJsonValue(actor, 1);
        tEnumJsonAdapter.addExtJsonValue(teacher, 2);
        tEnumJsonAdapter.addExtJsonValue("doctor", 3);
        tEnumJsonAdapter.addExtJsonValue(f38732it, 4);
        tEnumJsonAdapter.addExtJsonValue("finance", 5);
        tEnumJsonAdapter.addExtJsonValue("business", 6);
        tEnumJsonAdapter.addExtJsonValue(science, 7);
        supportEnum.add("student");
        supportEnum.add(actor);
        supportEnum.add(teacher);
        supportEnum.add("doctor");
        supportEnum.add(f38732it);
        supportEnum.add("finance");
        supportEnum.add("business");
        supportEnum.add(science);
        _Careers = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private Careers(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Careers> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Careers> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Careers> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Careers> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static Careers get(String str) {
        Map<String, Careers> map = _Careers;
        Careers careers = map.get(str);
        if (careers == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            careers = integer == null ? new Careers(str, -1) : new Careers(str, integer.intValue());
            map.put(str, careers);
        }
        return careers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Careers getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Careers> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Careers> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Careers get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
