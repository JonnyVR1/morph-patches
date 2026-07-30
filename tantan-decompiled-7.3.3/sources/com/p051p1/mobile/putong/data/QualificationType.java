package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class QualificationType extends TEnum {
    public static final String BACHELOR = "BACHELOR";
    public static final String DOCTOR = "DOCTOR";
    public static final String HIGH_SCHOOL = "HIGH_SCHOOL";
    public static final TEnumJsonAdapter<QualificationType> JSON_ADAPTER;
    public static final String LOWER_PRIMARY = "LOWER_PRIMARY";
    public static final String MASTER = "MASTER";
    public static final String NO_QUALIFICATION = "NO_QUALIFICATION";
    public static final TEnumProtobufAdapter<QualificationType> PROTOBUF_ADAPTER;
    public static final String UPPER_PRIMARY = "UPPER_PRIMARY";
    public static final String VOCATIONAL_SCHOOL = "VOCATIONAL_SCHOOL";
    private static final Map<String, QualificationType> _QualificationType;
    private static final int int_BACHELOR = 4;
    private static final int int_DOCTOR = 6;
    private static final int int_HIGH_SCHOOL = 2;
    private static final int int_LOWER_PRIMARY = 0;
    private static final int int_MASTER = 5;
    private static final int int_UPPER_PRIMARY = 1;
    private static final int int_VOCATIONAL_SCHOOL = 3;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<QualificationType> tEnumJsonAdapter = new TEnumJsonAdapter<QualificationType>() { // from class: com.p1.mobile.putong.data.QualificationType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public QualificationType newTEnum(String str, int i) {
                return QualificationType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<QualificationType>() { // from class: com.p1.mobile.putong.data.QualificationType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public QualificationType newTEnum(String str, int i) {
                return QualificationType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(LOWER_PRIMARY, 0);
        tEnumJsonAdapter.addExtJsonValue(UPPER_PRIMARY, 1);
        tEnumJsonAdapter.addExtJsonValue(HIGH_SCHOOL, 2);
        tEnumJsonAdapter.addExtJsonValue(VOCATIONAL_SCHOOL, 3);
        tEnumJsonAdapter.addExtJsonValue(BACHELOR, 4);
        tEnumJsonAdapter.addExtJsonValue(MASTER, 5);
        tEnumJsonAdapter.addExtJsonValue(DOCTOR, 6);
        supportEnum.add(LOWER_PRIMARY);
        supportEnum.add(UPPER_PRIMARY);
        supportEnum.add(HIGH_SCHOOL);
        supportEnum.add(VOCATIONAL_SCHOOL);
        supportEnum.add(BACHELOR);
        supportEnum.add(MASTER);
        supportEnum.add(DOCTOR);
        supportEnum.add(NO_QUALIFICATION);
        _QualificationType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private QualificationType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<QualificationType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<QualificationType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, QualificationType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, QualificationType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static QualificationType get(String str) {
        Map<String, QualificationType> map = _QualificationType;
        QualificationType qualificationType = map.get(str);
        if (qualificationType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            qualificationType = integer == null ? new QualificationType(str, -1) : new QualificationType(str, integer.intValue());
            map.put(str, qualificationType);
        }
        return qualificationType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static QualificationType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<QualificationType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, QualificationType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static QualificationType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
