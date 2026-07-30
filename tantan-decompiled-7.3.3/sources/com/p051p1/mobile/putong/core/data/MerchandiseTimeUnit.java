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
public class MerchandiseTimeUnit extends TEnum {
    public static final TEnumJsonAdapter<MerchandiseTimeUnit> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MerchandiseTimeUnit> PROTOBUF_ADAPTER;
    private static final Map<String, MerchandiseTimeUnit> _MerchandiseTimeUnit;
    public static final String day = "day";
    public static final String hour = "hour";
    private static final int int_unknown_ = -1;
    public static final String month = "month";
    public static final String second = "second";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String week = "week";
    public static final String year = "year";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MerchandiseTimeUnit> tEnumJsonAdapter = new TEnumJsonAdapter<MerchandiseTimeUnit>() { // from class: com.p1.mobile.putong.core.data.MerchandiseTimeUnit.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MerchandiseTimeUnit newTEnum(String str, int i) {
                return MerchandiseTimeUnit.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MerchandiseTimeUnit>() { // from class: com.p1.mobile.putong.core.data.MerchandiseTimeUnit.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MerchandiseTimeUnit newTEnum(String str, int i) {
                return MerchandiseTimeUnit.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(second);
        supportEnum.add("hour");
        supportEnum.add("day");
        supportEnum.add(week);
        supportEnum.add(month);
        supportEnum.add(year);
        _MerchandiseTimeUnit = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MerchandiseTimeUnit(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MerchandiseTimeUnit> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MerchandiseTimeUnit> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MerchandiseTimeUnit> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MerchandiseTimeUnit> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MerchandiseTimeUnit get(String str) {
        Map<String, MerchandiseTimeUnit> map = _MerchandiseTimeUnit;
        MerchandiseTimeUnit merchandiseTimeUnit = map.get(str);
        if (merchandiseTimeUnit == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            merchandiseTimeUnit = integer == null ? new MerchandiseTimeUnit(str, -1) : new MerchandiseTimeUnit(str, integer.intValue());
            map.put(str, merchandiseTimeUnit);
        }
        return merchandiseTimeUnit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MerchandiseTimeUnit getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MerchandiseTimeUnit> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MerchandiseTimeUnit> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MerchandiseTimeUnit get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
