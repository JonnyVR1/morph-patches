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
public class OMSLocationType extends TEnum {
    public static final TEnumJsonAdapter<OMSLocationType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSLocationType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSLocationType> _OMSLocationType;
    public static final String g_bottom = "g_bottom";
    public static final String g_center = "g_center";
    public static final String g_center_horizontal = "g_center_horizontal";
    public static final String g_center_vertical = "g_center_vertical";
    public static final String g_end = "g_end";
    public static final String g_start = "g_start";
    public static final String g_top = "g_top";
    private static final int int_g_bottom = 1;
    private static final int int_g_center = 4;
    private static final int int_g_center_horizontal = 6;
    private static final int int_g_center_vertical = 5;
    private static final int int_g_end = 3;
    private static final int int_g_start = 2;
    private static final int int_g_top = 0;
    private static final int int_r_above = 9;
    private static final int int_r_align_baseline = 11;
    private static final int int_r_align_bottom = 15;
    private static final int int_r_align_end = 26;
    private static final int int_r_align_left = 12;
    private static final int int_r_align_parent_bottom = 19;
    private static final int int_r_align_parent_end = 28;
    private static final int int_r_align_parent_left = 16;
    private static final int int_r_align_parent_right = 18;
    private static final int int_r_align_parent_start = 27;
    private static final int int_r_align_parent_top = 17;
    private static final int int_r_align_right = 13;
    private static final int int_r_align_start = 25;
    private static final int int_r_align_top = 14;
    private static final int int_r_below = 10;
    private static final int int_r_center_horizontal = 22;
    private static final int int_r_center_in_parent = 20;
    private static final int int_r_center_vertical = 21;
    private static final int int_r_end_of = 24;
    private static final int int_r_left_of = 7;
    private static final int int_r_right_of = 8;
    private static final int int_r_start_of = 23;
    private static final int int_unknown_ = -1;
    public static final String r_above = "r_above";
    public static final String r_align_baseline = "r_align_baseline";
    public static final String r_align_bottom = "r_align_bottom";
    public static final String r_align_end = "r_align_end";
    public static final String r_align_left = "r_align_left";
    public static final String r_align_parent_bottom = "r_align_parent_bottom";
    public static final String r_align_parent_end = "r_align_parent_end";
    public static final String r_align_parent_left = "r_align_parent_left";
    public static final String r_align_parent_right = "r_align_parent_right";
    public static final String r_align_parent_start = "r_align_parent_start";
    public static final String r_align_parent_top = "r_align_parent_top";
    public static final String r_align_right = "r_align_right";
    public static final String r_align_start = "r_align_start";
    public static final String r_align_top = "r_align_top";
    public static final String r_below = "r_below";
    public static final String r_center_horizontal = "r_center_horizontal";
    public static final String r_center_in_parent = "r_center_in_parent";
    public static final String r_center_vertical = "r_center_vertical";
    public static final String r_end_of = "r_end_of";
    public static final String r_left_of = "r_left_of";
    public static final String r_right_of = "r_right_of";
    public static final String r_start_of = "r_start_of";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSLocationType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSLocationType>() { // from class: com.p1.mobile.putong.data.OMSLocationType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSLocationType newTEnum(String str, int i) {
                return OMSLocationType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSLocationType>() { // from class: com.p1.mobile.putong.data.OMSLocationType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSLocationType newTEnum(String str, int i) {
                return OMSLocationType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(g_top, 0);
        tEnumJsonAdapter.addExtJsonValue(g_bottom, 1);
        tEnumJsonAdapter.addExtJsonValue(g_start, 2);
        tEnumJsonAdapter.addExtJsonValue(g_end, 3);
        tEnumJsonAdapter.addExtJsonValue(g_center, 4);
        tEnumJsonAdapter.addExtJsonValue(g_center_vertical, 5);
        tEnumJsonAdapter.addExtJsonValue(g_center_horizontal, 6);
        tEnumJsonAdapter.addExtJsonValue(r_left_of, 7);
        tEnumJsonAdapter.addExtJsonValue(r_right_of, 8);
        tEnumJsonAdapter.addExtJsonValue(r_above, 9);
        tEnumJsonAdapter.addExtJsonValue(r_below, 10);
        tEnumJsonAdapter.addExtJsonValue(r_align_baseline, 11);
        tEnumJsonAdapter.addExtJsonValue(r_align_left, 12);
        tEnumJsonAdapter.addExtJsonValue(r_align_right, 13);
        tEnumJsonAdapter.addExtJsonValue(r_align_top, 14);
        tEnumJsonAdapter.addExtJsonValue(r_align_bottom, 15);
        tEnumJsonAdapter.addExtJsonValue(r_align_parent_left, 16);
        tEnumJsonAdapter.addExtJsonValue(r_align_parent_top, 17);
        tEnumJsonAdapter.addExtJsonValue(r_align_parent_right, 18);
        tEnumJsonAdapter.addExtJsonValue(r_align_parent_bottom, 19);
        tEnumJsonAdapter.addExtJsonValue(r_center_in_parent, 20);
        tEnumJsonAdapter.addExtJsonValue(r_center_vertical, 21);
        tEnumJsonAdapter.addExtJsonValue(r_center_horizontal, 22);
        tEnumJsonAdapter.addExtJsonValue(r_start_of, 23);
        tEnumJsonAdapter.addExtJsonValue(r_end_of, 24);
        tEnumJsonAdapter.addExtJsonValue(r_align_start, 25);
        tEnumJsonAdapter.addExtJsonValue(r_align_end, 26);
        tEnumJsonAdapter.addExtJsonValue(r_align_parent_start, 27);
        tEnumJsonAdapter.addExtJsonValue(r_align_parent_end, 28);
        supportEnum.add(g_top);
        supportEnum.add(g_bottom);
        supportEnum.add(g_start);
        supportEnum.add(g_end);
        supportEnum.add(g_center);
        supportEnum.add(g_center_vertical);
        supportEnum.add(g_center_horizontal);
        supportEnum.add(r_left_of);
        supportEnum.add(r_right_of);
        supportEnum.add(r_above);
        supportEnum.add(r_below);
        supportEnum.add(r_align_baseline);
        supportEnum.add(r_align_left);
        supportEnum.add(r_align_right);
        supportEnum.add(r_align_top);
        supportEnum.add(r_align_bottom);
        supportEnum.add(r_align_parent_left);
        supportEnum.add(r_align_parent_top);
        supportEnum.add(r_align_parent_right);
        supportEnum.add(r_align_parent_bottom);
        supportEnum.add(r_center_in_parent);
        supportEnum.add(r_center_vertical);
        supportEnum.add(r_center_horizontal);
        supportEnum.add(r_start_of);
        supportEnum.add(r_end_of);
        supportEnum.add(r_align_start);
        supportEnum.add(r_align_end);
        supportEnum.add(r_align_parent_start);
        supportEnum.add(r_align_parent_end);
        _OMSLocationType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSLocationType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSLocationType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSLocationType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSLocationType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSLocationType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSLocationType get(String str) {
        Map<String, OMSLocationType> map = _OMSLocationType;
        OMSLocationType oMSLocationType = map.get(str);
        if (oMSLocationType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSLocationType = integer == null ? new OMSLocationType(str, -1) : new OMSLocationType(str, integer.intValue());
            map.put(str, oMSLocationType);
        }
        return oMSLocationType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSLocationType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSLocationType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSLocationType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSLocationType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
