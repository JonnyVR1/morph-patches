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
public class LiveRegionTag extends TEnum {
    public static final TEnumJsonAdapter<LiveRegionTag> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LiveRegionTag> PROTOBUF_ADAPTER;
    private static final Map<String, LiveRegionTag> _LiveRegionTag;
    public static final String allRegion = "allRegion";
    public static final String indonesia = "indonesia";
    private static final int int_allRegion = 1;
    private static final int int_indonesia = 3;
    private static final int int_mainland = 0;
    private static final int int_others = 6;
    private static final int int_oversea = 7;
    private static final int int_oversea_chinese = 2;
    private static final int int_oversea_others = 5;
    private static final int int_taiwan = 4;
    private static final int int_unknown_ = -1;
    public static final String japan = "japan";
    public static final String korea = "korea";
    public static final String mainland = "mainland";
    public static final String others = "others";
    public static final String oversea = "oversea";
    public static final String oversea_chinese = "oversea_chinese";
    public static final String oversea_mix = "oversea_mix";
    public static final String oversea_others = "oversea_others";
    public static final String philippines = "philippines";
    protected static HashSet<String> supportEnum = null;
    public static final String taiwan = "taiwan";
    public static final String thailand = "thailand";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LiveRegionTag> tEnumJsonAdapter = new TEnumJsonAdapter<LiveRegionTag>() { // from class: com.p1.mobile.putong.data.LiveRegionTag.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LiveRegionTag newTEnum(String str, int i) {
                return LiveRegionTag.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LiveRegionTag>() { // from class: com.p1.mobile.putong.data.LiveRegionTag.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LiveRegionTag newTEnum(String str, int i) {
                return LiveRegionTag.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(mainland, 0);
        tEnumJsonAdapter.addExtJsonValue(allRegion, 1);
        tEnumJsonAdapter.addExtJsonValue(oversea_chinese, 2);
        tEnumJsonAdapter.addExtJsonValue(indonesia, 3);
        tEnumJsonAdapter.addExtJsonValue(taiwan, 4);
        tEnumJsonAdapter.addExtJsonValue(oversea_others, 5);
        tEnumJsonAdapter.addExtJsonValue(others, 6);
        tEnumJsonAdapter.addExtJsonValue(oversea, 7);
        supportEnum.add(mainland);
        supportEnum.add(allRegion);
        supportEnum.add(oversea_chinese);
        supportEnum.add(indonesia);
        supportEnum.add(taiwan);
        supportEnum.add(oversea_others);
        supportEnum.add(others);
        supportEnum.add(oversea);
        supportEnum.add(thailand);
        supportEnum.add(korea);
        supportEnum.add(japan);
        supportEnum.add(philippines);
        supportEnum.add(oversea_mix);
        _LiveRegionTag = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LiveRegionTag(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LiveRegionTag> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LiveRegionTag> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LiveRegionTag> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LiveRegionTag> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LiveRegionTag get(String str) {
        Map<String, LiveRegionTag> map = _LiveRegionTag;
        LiveRegionTag liveRegionTag = map.get(str);
        if (liveRegionTag == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            liveRegionTag = integer == null ? new LiveRegionTag(str, -1) : new LiveRegionTag(str, integer.intValue());
            map.put(str, liveRegionTag);
        }
        return liveRegionTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LiveRegionTag getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LiveRegionTag> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LiveRegionTag> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LiveRegionTag get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
