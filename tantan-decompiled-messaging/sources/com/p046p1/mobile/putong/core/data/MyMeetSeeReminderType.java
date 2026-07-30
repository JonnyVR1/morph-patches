package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetSeeReminderType extends TEnum {
    public static final TEnumJsonAdapter<MyMeetSeeReminderType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MyMeetSeeReminderType> PROTOBUF_ADAPTER;
    private static final Map<String, MyMeetSeeReminderType> _MyMeetSeeReminderType;
    private static final int int_unknown_ = -1;
    public static final String nearby = "nearby";
    public static final String online = "online";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String visit = "visit";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MyMeetSeeReminderType> tEnumJsonAdapter = new TEnumJsonAdapter<MyMeetSeeReminderType>() { // from class: com.p1.mobile.putong.core.data.MyMeetSeeReminderType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MyMeetSeeReminderType newTEnum(String str, int i) {
                return MyMeetSeeReminderType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MyMeetSeeReminderType>() { // from class: com.p1.mobile.putong.core.data.MyMeetSeeReminderType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MyMeetSeeReminderType newTEnum(String str, int i) {
                return MyMeetSeeReminderType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("online");
        supportEnum.add("nearby");
        supportEnum.add("visit");
        _MyMeetSeeReminderType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MyMeetSeeReminderType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MyMeetSeeReminderType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MyMeetSeeReminderType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MyMeetSeeReminderType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MyMeetSeeReminderType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MyMeetSeeReminderType get(String str) {
        Map<String, MyMeetSeeReminderType> map = _MyMeetSeeReminderType;
        MyMeetSeeReminderType myMeetSeeReminderType = map.get(str);
        if (myMeetSeeReminderType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            myMeetSeeReminderType = integer == null ? new MyMeetSeeReminderType(str, -1) : new MyMeetSeeReminderType(str, integer.intValue());
            map.put(str, myMeetSeeReminderType);
        }
        return myMeetSeeReminderType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MyMeetSeeReminderType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MyMeetSeeReminderType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MyMeetSeeReminderType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MyMeetSeeReminderType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
