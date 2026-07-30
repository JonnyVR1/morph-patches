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
public class StudentVerRejectedReason extends TEnum {
    public static final TEnumJsonAdapter<StudentVerRejectedReason> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<StudentVerRejectedReason> PROTOBUF_ADAPTER;
    private static final Map<String, StudentVerRejectedReason> _StudentVerRejectedReason;
    private static final int int_pictures_1 = 1;
    private static final int int_pictures_2 = 2;
    private static final int int_school = 0;
    private static final int int_startTime = 3;
    private static final int int_unknown_ = -1;
    public static final String pictures_1 = "pictures.1";
    public static final String pictures_2 = "pictures.2";
    public static final String school = "school";
    public static final String startTime = "startTime";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<StudentVerRejectedReason> tEnumJsonAdapter = new TEnumJsonAdapter<StudentVerRejectedReason>() { // from class: com.p1.mobile.putong.data.StudentVerRejectedReason.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public StudentVerRejectedReason newTEnum(String str, int i) {
                return StudentVerRejectedReason.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<StudentVerRejectedReason>() { // from class: com.p1.mobile.putong.data.StudentVerRejectedReason.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public StudentVerRejectedReason newTEnum(String str, int i) {
                return StudentVerRejectedReason.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("school", 0);
        tEnumJsonAdapter.addExtJsonValue(pictures_1, 1);
        tEnumJsonAdapter.addExtJsonValue(pictures_2, 2);
        tEnumJsonAdapter.addExtJsonValue(startTime, 3);
        supportEnum.add("school");
        supportEnum.add(pictures_1);
        supportEnum.add(pictures_2);
        supportEnum.add(startTime);
        _StudentVerRejectedReason = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private StudentVerRejectedReason(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<StudentVerRejectedReason> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<StudentVerRejectedReason> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, StudentVerRejectedReason> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, StudentVerRejectedReason> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static StudentVerRejectedReason get(String str) {
        Map<String, StudentVerRejectedReason> map = _StudentVerRejectedReason;
        StudentVerRejectedReason studentVerRejectedReason = map.get(str);
        if (studentVerRejectedReason == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            studentVerRejectedReason = integer == null ? new StudentVerRejectedReason(str, -1) : new StudentVerRejectedReason(str, integer.intValue());
            map.put(str, studentVerRejectedReason);
        }
        return studentVerRejectedReason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StudentVerRejectedReason getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<StudentVerRejectedReason> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, StudentVerRejectedReason> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static StudentVerRejectedReason get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
