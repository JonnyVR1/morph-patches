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
public class LocationInvisibleField extends TEnum {
    public static final TEnumJsonAdapter<LocationInvisibleField> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LocationInvisibleField> PROTOBUF_ADAPTER;
    private static final Map<String, LocationInvisibleField> _LocationInvisibleField;
    public static final String distance = "distance";
    private static final int int_distance = 3;
    private static final int int_region_city = 1;
    private static final int int_region_country = 0;
    private static final int int_region_district = 2;
    private static final int int_unknown_ = -1;
    private static final int int_updatedTime = 4;
    public static final String region_city = "region.city";
    public static final String region_country = "region.country";
    public static final String region_district = "region.district";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String updatedTime = "updatedTime";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LocationInvisibleField> tEnumJsonAdapter = new TEnumJsonAdapter<LocationInvisibleField>() { // from class: com.p1.mobile.putong.data.LocationInvisibleField.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LocationInvisibleField newTEnum(String str, int i) {
                return LocationInvisibleField.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LocationInvisibleField>() { // from class: com.p1.mobile.putong.data.LocationInvisibleField.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LocationInvisibleField newTEnum(String str, int i) {
                return LocationInvisibleField.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(region_country, 0);
        tEnumJsonAdapter.addExtJsonValue(region_city, 1);
        tEnumJsonAdapter.addExtJsonValue(region_district, 2);
        tEnumJsonAdapter.addExtJsonValue("distance", 3);
        tEnumJsonAdapter.addExtJsonValue(updatedTime, 4);
        supportEnum.add(region_country);
        supportEnum.add(region_city);
        supportEnum.add(region_district);
        supportEnum.add("distance");
        supportEnum.add(updatedTime);
        _LocationInvisibleField = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LocationInvisibleField(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LocationInvisibleField> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LocationInvisibleField> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LocationInvisibleField> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LocationInvisibleField> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LocationInvisibleField get(String str) {
        Map<String, LocationInvisibleField> map = _LocationInvisibleField;
        LocationInvisibleField locationInvisibleField = map.get(str);
        if (locationInvisibleField == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            locationInvisibleField = integer == null ? new LocationInvisibleField(str, -1) : new LocationInvisibleField(str, integer.intValue());
            map.put(str, locationInvisibleField);
        }
        return locationInvisibleField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LocationInvisibleField getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LocationInvisibleField> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LocationInvisibleField> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LocationInvisibleField get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
