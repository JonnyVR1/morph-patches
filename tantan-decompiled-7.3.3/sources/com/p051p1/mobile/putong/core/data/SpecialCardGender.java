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
public class SpecialCardGender extends TEnum {
    public static final TEnumJsonAdapter<SpecialCardGender> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SpecialCardGender> PROTOBUF_ADAPTER;
    private static final Map<String, SpecialCardGender> _SpecialCardGender;
    public static final String both = "both";
    public static final String female = "female";
    private static final int int_both = 2;
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
        TEnumJsonAdapter<SpecialCardGender> tEnumJsonAdapter = new TEnumJsonAdapter<SpecialCardGender>() { // from class: com.p1.mobile.putong.core.data.SpecialCardGender.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SpecialCardGender newTEnum(String str, int i) {
                return SpecialCardGender.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SpecialCardGender>() { // from class: com.p1.mobile.putong.core.data.SpecialCardGender.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SpecialCardGender newTEnum(String str, int i) {
                return SpecialCardGender.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("male", 0);
        tEnumJsonAdapter.addExtJsonValue("female", 1);
        tEnumJsonAdapter.addExtJsonValue("both", 2);
        supportEnum.add("male");
        supportEnum.add("female");
        supportEnum.add("both");
        _SpecialCardGender = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SpecialCardGender(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SpecialCardGender> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SpecialCardGender> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SpecialCardGender> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, SpecialCardGender> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SpecialCardGender get(String str) {
        Map<String, SpecialCardGender> map = _SpecialCardGender;
        SpecialCardGender specialCardGender = map.get(str);
        if (specialCardGender == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            specialCardGender = integer == null ? new SpecialCardGender(str, -1) : new SpecialCardGender(str, integer.intValue());
            map.put(str, specialCardGender);
        }
        return specialCardGender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SpecialCardGender getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SpecialCardGender> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SpecialCardGender> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SpecialCardGender get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
