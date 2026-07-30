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
public class SchoolLevel extends TEnum {
    public static final TEnumJsonAdapter<SchoolLevel> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SchoolLevel> PROTOBUF_ADAPTER;
    private static final Map<String, SchoolLevel> _SchoolLevel;
    private static final int int_junior_middle_school = 0;
    private static final int int_senior_middle_school = 1;
    private static final int int_technical_school = 2;
    private static final int int_university = 3;
    private static final int int_unknown_ = -1;
    public static final String junior_middle_school = "junior-middle-school";
    public static final String senior_middle_school = "senior-middle-school";
    protected static HashSet<String> supportEnum = null;
    public static final String technical_school = "technical-school";
    public static final String university = "university";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SchoolLevel> tEnumJsonAdapter = new TEnumJsonAdapter<SchoolLevel>() { // from class: com.p1.mobile.putong.core.data.SchoolLevel.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SchoolLevel newTEnum(String str, int i) {
                return SchoolLevel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SchoolLevel>() { // from class: com.p1.mobile.putong.core.data.SchoolLevel.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SchoolLevel newTEnum(String str, int i) {
                return SchoolLevel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(junior_middle_school, 0);
        tEnumJsonAdapter.addExtJsonValue(senior_middle_school, 1);
        tEnumJsonAdapter.addExtJsonValue(technical_school, 2);
        tEnumJsonAdapter.addExtJsonValue("university", 3);
        supportEnum.add(junior_middle_school);
        supportEnum.add(senior_middle_school);
        supportEnum.add(technical_school);
        supportEnum.add("university");
        _SchoolLevel = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SchoolLevel(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SchoolLevel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SchoolLevel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SchoolLevel> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, SchoolLevel> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SchoolLevel get(String str) {
        Map<String, SchoolLevel> map = _SchoolLevel;
        SchoolLevel schoolLevel = map.get(str);
        if (schoolLevel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            schoolLevel = integer == null ? new SchoolLevel(str, -1) : new SchoolLevel(str, integer.intValue());
            map.put(str, schoolLevel);
        }
        return schoolLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SchoolLevel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SchoolLevel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SchoolLevel> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SchoolLevel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
