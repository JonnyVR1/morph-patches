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
public class CreditScoreTaskType extends TEnum {
    public static final TEnumJsonAdapter<CreditScoreTaskType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<CreditScoreTaskType> PROTOBUF_ADAPTER;
    private static final Map<String, CreditScoreTaskType> _CreditScoreTaskType;
    public static final String behavior = "behavior";
    public static final String boost = "boost";
    public static final String charisma = "charisma";
    public static final String check = "check";
    private static final int int_behavior = 7;
    private static final int int_boost = 6;
    private static final int int_charisma = 11;
    private static final int int_check = 9;
    private static final int int_message = 0;
    private static final int int_moment = 8;
    private static final int int_newMessage = 10;
    private static final int int_pic = 1;
    private static final int int_privilege = 14;
    private static final int int_profile = 3;
    private static final int int_realPerson = 13;
    private static final int int_report = 12;
    private static final int int_see = 5;
    private static final int int_swipe = 2;
    private static final int int_unknown_ = -1;
    private static final int int_vip = 4;
    public static final String message = "message";
    public static final String moment = "moment";
    public static final String newMessage = "newMessage";
    public static final String pic = "pic";
    public static final String privilege = "privilege";
    public static final String profile = "profile";
    public static final String realPerson = "realPerson";
    public static final String report = "report";
    public static final String see = "see";
    protected static HashSet<String> supportEnum = null;
    public static final String swipe = "swipe";
    public static final String unknown_ = "unknown_";
    public static final String vip = "vip";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CreditScoreTaskType> tEnumJsonAdapter = new TEnumJsonAdapter<CreditScoreTaskType>() { // from class: com.p1.mobile.putong.data.CreditScoreTaskType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public CreditScoreTaskType newTEnum(String str, int i) {
                return CreditScoreTaskType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CreditScoreTaskType>() { // from class: com.p1.mobile.putong.data.CreditScoreTaskType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public CreditScoreTaskType newTEnum(String str, int i) {
                return CreditScoreTaskType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("message", 0);
        tEnumJsonAdapter.addExtJsonValue(pic, 1);
        tEnumJsonAdapter.addExtJsonValue("swipe", 2);
        tEnumJsonAdapter.addExtJsonValue("profile", 3);
        tEnumJsonAdapter.addExtJsonValue("vip", 4);
        tEnumJsonAdapter.addExtJsonValue("see", 5);
        tEnumJsonAdapter.addExtJsonValue("boost", 6);
        tEnumJsonAdapter.addExtJsonValue(behavior, 7);
        tEnumJsonAdapter.addExtJsonValue("moment", 8);
        tEnumJsonAdapter.addExtJsonValue("check", 9);
        tEnumJsonAdapter.addExtJsonValue(newMessage, 10);
        tEnumJsonAdapter.addExtJsonValue(charisma, 11);
        tEnumJsonAdapter.addExtJsonValue("report", 12);
        tEnumJsonAdapter.addExtJsonValue(realPerson, 13);
        tEnumJsonAdapter.addExtJsonValue("privilege", 14);
        supportEnum.add("message");
        supportEnum.add(pic);
        supportEnum.add("swipe");
        supportEnum.add("profile");
        supportEnum.add("vip");
        supportEnum.add("see");
        supportEnum.add("boost");
        supportEnum.add(behavior);
        supportEnum.add("moment");
        supportEnum.add("check");
        supportEnum.add(newMessage);
        supportEnum.add(charisma);
        supportEnum.add("report");
        supportEnum.add(realPerson);
        supportEnum.add("privilege");
        _CreditScoreTaskType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private CreditScoreTaskType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CreditScoreTaskType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CreditScoreTaskType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CreditScoreTaskType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, CreditScoreTaskType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static CreditScoreTaskType get(String str) {
        Map<String, CreditScoreTaskType> map = _CreditScoreTaskType;
        CreditScoreTaskType creditScoreTaskType = map.get(str);
        if (creditScoreTaskType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            creditScoreTaskType = integer == null ? new CreditScoreTaskType(str, -1) : new CreditScoreTaskType(str, integer.intValue());
            map.put(str, creditScoreTaskType);
        }
        return creditScoreTaskType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CreditScoreTaskType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CreditScoreTaskType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CreditScoreTaskType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CreditScoreTaskType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
