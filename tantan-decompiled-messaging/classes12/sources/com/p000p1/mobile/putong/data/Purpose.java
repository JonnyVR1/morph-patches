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
public class Purpose extends TEnum {
    public static final TEnumJsonAdapter<Purpose> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Purpose> PROTOBUF_ADAPTER;
    private static final Map<String, Purpose> _Purpose;
    public static final String date = "date";
    public static final String fall_in_love = "fall-in-love";
    public static final String friend = "friend";
    private static final int int_date = 5;
    private static final int int_fall_in_love = 0;
    private static final int int_friend = 6;
    private static final int int_just_looking = 3;
    private static final int int_marriage = 2;
    private static final int int_meet_friend = 1;
    private static final int int_relationship = 4;
    private static final int int_thinking = 7;
    private static final int int_unknown_ = -1;
    public static final String just_looking = "just-looking";
    public static final String marriage = "marriage";
    public static final String meet_friend = "meet-friend";
    public static final String relationship = "relationship";
    protected static HashSet<String> supportEnum = null;
    public static final String thinking = "thinking";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Purpose> tEnumJsonAdapter = new TEnumJsonAdapter<Purpose>() { // from class: com.p1.mobile.putong.data.Purpose.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Purpose newTEnum(String str, int i) {
                return Purpose.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Purpose>() { // from class: com.p1.mobile.putong.data.Purpose.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Purpose newTEnum(String str, int i) {
                return Purpose.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(fall_in_love, 0);
        tEnumJsonAdapter.addExtJsonValue(meet_friend, 1);
        tEnumJsonAdapter.addExtJsonValue(marriage, 2);
        tEnumJsonAdapter.addExtJsonValue(just_looking, 3);
        tEnumJsonAdapter.addExtJsonValue("relationship", 4);
        tEnumJsonAdapter.addExtJsonValue("date", 5);
        tEnumJsonAdapter.addExtJsonValue("friend", 6);
        tEnumJsonAdapter.addExtJsonValue(thinking, 7);
        supportEnum.add(fall_in_love);
        supportEnum.add(meet_friend);
        supportEnum.add(marriage);
        supportEnum.add(just_looking);
        supportEnum.add("relationship");
        supportEnum.add("date");
        supportEnum.add("friend");
        supportEnum.add(thinking);
        _Purpose = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private Purpose(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Purpose> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Purpose> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Purpose> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Purpose> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static Purpose get(String str) {
        Map<String, Purpose> map = _Purpose;
        Purpose purpose = map.get(str);
        if (purpose == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            purpose = integer == null ? new Purpose(str, -1) : new Purpose(str, integer.intValue());
            map.put(str, purpose);
        }
        return purpose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Purpose getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Purpose> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Purpose> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Purpose get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
