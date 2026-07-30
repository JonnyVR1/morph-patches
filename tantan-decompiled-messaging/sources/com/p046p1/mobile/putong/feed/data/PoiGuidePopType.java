package com.p046p1.mobile.putong.feed.data;

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
public class PoiGuidePopType extends TEnum {
    public static final TEnumJsonAdapter<PoiGuidePopType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PoiGuidePopType> PROTOBUF_ADAPTER;
    private static final Map<String, PoiGuidePopType> _PoiGuidePopType;
    private static final int int_unknown_ = -1;
    public static final String poi = "poi";
    public static final String share = "share";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PoiGuidePopType> tEnumJsonAdapter = new TEnumJsonAdapter<PoiGuidePopType>() { // from class: com.p1.mobile.putong.feed.data.PoiGuidePopType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public PoiGuidePopType newTEnum(String str, int i) {
                return PoiGuidePopType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PoiGuidePopType>() { // from class: com.p1.mobile.putong.feed.data.PoiGuidePopType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public PoiGuidePopType newTEnum(String str, int i) {
                return PoiGuidePopType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("poi");
        supportEnum.add("share");
        _PoiGuidePopType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private PoiGuidePopType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PoiGuidePopType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PoiGuidePopType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PoiGuidePopType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, PoiGuidePopType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static PoiGuidePopType get(String str) {
        Map<String, PoiGuidePopType> map = _PoiGuidePopType;
        PoiGuidePopType poiGuidePopType = map.get(str);
        if (poiGuidePopType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            poiGuidePopType = integer == null ? new PoiGuidePopType(str, -1) : new PoiGuidePopType(str, integer.intValue());
            map.put(str, poiGuidePopType);
        }
        return poiGuidePopType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PoiGuidePopType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PoiGuidePopType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PoiGuidePopType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PoiGuidePopType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
