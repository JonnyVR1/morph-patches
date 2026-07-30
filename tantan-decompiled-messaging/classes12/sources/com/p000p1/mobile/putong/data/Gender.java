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
public class Gender extends TEnum {
    public static final TEnumJsonAdapter<Gender> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Gender> PROTOBUF_ADAPTER;
    private static final Map<String, Gender> _Gender;
    public static final String female = "female";
    private static final int int_female = 1;
    private static final int int_male = 0;
    private static final int int_unknown_ = -1;
    public static final String male = "male";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Gender> tEnumJsonAdapter = new TEnumJsonAdapter<Gender>() { // from class: com.p1.mobile.putong.data.Gender.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Gender newTEnum(String str, int i) {
                return Gender.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Gender>() { // from class: com.p1.mobile.putong.data.Gender.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Gender newTEnum(String str, int i) {
                return Gender.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("male", 0);
        tEnumJsonAdapter.addExtJsonValue("female", 1);
        supportEnum.add("male");
        supportEnum.add("female");
        _Gender = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private Gender(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Gender> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Gender> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Gender> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Gender> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static Gender get(String str) {
        Map<String, Gender> map = _Gender;
        Gender gender = map.get(str);
        if (gender == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            gender = integer == null ? new Gender(str, -1) : new Gender(str, integer.intValue());
            map.put(str, gender);
        }
        return gender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Gender getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Gender> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Gender> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Gender get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
