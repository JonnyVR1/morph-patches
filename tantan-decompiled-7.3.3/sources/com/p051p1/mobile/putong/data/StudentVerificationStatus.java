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
public class StudentVerificationStatus extends TEnum {
    public static final TEnumJsonAdapter<StudentVerificationStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<StudentVerificationStatus> PROTOBUF_ADAPTER;
    private static final Map<String, StudentVerificationStatus> _StudentVerificationStatus;
    public static final String default_ = "default";
    private static final int int_default_ = 6;
    private static final int int_invalid = 7;
    private static final int int_normal = 0;
    private static final int int_pending = 1;
    private static final int int_prePending = 5;
    private static final int int_preVerified = 4;
    private static final int int_rejected = 3;
    private static final int int_unknown_ = -1;
    private static final int int_verified = 2;
    public static final String invalid = "invalid";
    public static final String normal = "normal";
    public static final String pending = "pending";
    public static final String prePending = "prePending";
    public static final String preVerified = "preVerified";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String verified = "verified";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<StudentVerificationStatus> tEnumJsonAdapter = new TEnumJsonAdapter<StudentVerificationStatus>() { // from class: com.p1.mobile.putong.data.StudentVerificationStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public StudentVerificationStatus newTEnum(String str, int i) {
                return StudentVerificationStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<StudentVerificationStatus>() { // from class: com.p1.mobile.putong.data.StudentVerificationStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public StudentVerificationStatus newTEnum(String str, int i) {
                return StudentVerificationStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("normal", 0);
        tEnumJsonAdapter.addExtJsonValue("pending", 1);
        tEnumJsonAdapter.addExtJsonValue("verified", 2);
        tEnumJsonAdapter.addExtJsonValue("rejected", 3);
        tEnumJsonAdapter.addExtJsonValue(preVerified, 4);
        tEnumJsonAdapter.addExtJsonValue(prePending, 5);
        tEnumJsonAdapter.addExtJsonValue("default", 6);
        tEnumJsonAdapter.addExtJsonValue("invalid", 7);
        supportEnum.add("normal");
        supportEnum.add("pending");
        supportEnum.add("verified");
        supportEnum.add("rejected");
        supportEnum.add(preVerified);
        supportEnum.add(prePending);
        supportEnum.add("default");
        supportEnum.add("invalid");
        _StudentVerificationStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private StudentVerificationStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<StudentVerificationStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<StudentVerificationStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, StudentVerificationStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, StudentVerificationStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static StudentVerificationStatus get(String str) {
        Map<String, StudentVerificationStatus> map = _StudentVerificationStatus;
        StudentVerificationStatus studentVerificationStatus = map.get(str);
        if (studentVerificationStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            studentVerificationStatus = integer == null ? new StudentVerificationStatus(str, -1) : new StudentVerificationStatus(str, integer.intValue());
            map.put(str, studentVerificationStatus);
        }
        return studentVerificationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StudentVerificationStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<StudentVerificationStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, StudentVerificationStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static StudentVerificationStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
