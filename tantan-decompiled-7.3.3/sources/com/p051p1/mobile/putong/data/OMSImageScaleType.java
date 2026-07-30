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
public class OMSImageScaleType extends TEnum {
    public static final TEnumJsonAdapter<OMSImageScaleType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSImageScaleType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSImageScaleType> _OMSImageScaleType;
    public static final String center = "center";
    public static final String center_crop = "center_crop";
    public static final String center_inside = "center_inside";
    public static final String fit_bottom_start = "fit_bottom_start";
    public static final String fit_center = "fit_center";
    public static final String fit_end = "fit_end";
    public static final String fit_start = "fit_start";
    public static final String fit_xy = "fit_xy";
    public static final String focus_crop = "focus_crop";
    private static final int int_center = 4;
    private static final int int_center_crop = 6;
    private static final int int_center_inside = 5;
    private static final int int_fit_bottom_start = 8;
    private static final int int_fit_center = 2;
    private static final int int_fit_end = 3;
    private static final int int_fit_start = 1;
    private static final int int_fit_xy = 0;
    private static final int int_focus_crop = 7;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSImageScaleType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSImageScaleType>() { // from class: com.p1.mobile.putong.data.OMSImageScaleType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSImageScaleType newTEnum(String str, int i) {
                return OMSImageScaleType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSImageScaleType>() { // from class: com.p1.mobile.putong.data.OMSImageScaleType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSImageScaleType newTEnum(String str, int i) {
                return OMSImageScaleType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(fit_xy, 0);
        tEnumJsonAdapter.addExtJsonValue(fit_start, 1);
        tEnumJsonAdapter.addExtJsonValue(fit_center, 2);
        tEnumJsonAdapter.addExtJsonValue(fit_end, 3);
        tEnumJsonAdapter.addExtJsonValue("center", 4);
        tEnumJsonAdapter.addExtJsonValue(center_inside, 5);
        tEnumJsonAdapter.addExtJsonValue(center_crop, 6);
        tEnumJsonAdapter.addExtJsonValue(focus_crop, 7);
        tEnumJsonAdapter.addExtJsonValue(fit_bottom_start, 8);
        supportEnum.add(fit_xy);
        supportEnum.add(fit_start);
        supportEnum.add(fit_center);
        supportEnum.add(fit_end);
        supportEnum.add("center");
        supportEnum.add(center_inside);
        supportEnum.add(center_crop);
        supportEnum.add(focus_crop);
        supportEnum.add(fit_bottom_start);
        _OMSImageScaleType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private OMSImageScaleType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSImageScaleType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSImageScaleType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSImageScaleType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, OMSImageScaleType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static OMSImageScaleType get(String str) {
        Map<String, OMSImageScaleType> map = _OMSImageScaleType;
        OMSImageScaleType oMSImageScaleType = map.get(str);
        if (oMSImageScaleType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSImageScaleType = integer == null ? new OMSImageScaleType(str, -1) : new OMSImageScaleType(str, integer.intValue());
            map.put(str, oMSImageScaleType);
        }
        return oMSImageScaleType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSImageScaleType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSImageScaleType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSImageScaleType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSImageScaleType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
