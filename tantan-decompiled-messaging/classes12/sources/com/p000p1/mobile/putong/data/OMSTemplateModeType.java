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
public class OMSTemplateModeType extends TEnum {
    public static final TEnumJsonAdapter<OMSTemplateModeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSTemplateModeType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSTemplateModeType> _OMSTemplateModeType;
    public static final String button = "button";
    public static final String checkbox = "checkbox";
    public static final String extra = "extra";
    public static final String hstack = "hstack";
    public static final String image = "image";
    private static final int int_button = 2;
    private static final int int_checkbox = 10;
    private static final int int_extra = 9;
    private static final int int_hstack = 4;
    private static final int int_image = 1;
    private static final int int_overlap = 5;
    private static final int int_page = 6;
    private static final int int_space = 7;
    private static final int int_switch_btn = 11;
    private static final int int_text = 0;
    private static final int int_toast = 12;
    private static final int int_unknown_ = -1;
    private static final int int_view = 8;
    private static final int int_vstack = 3;
    public static final String overlap = "overlap";
    public static final String page = "page";
    public static final String space = "space";
    protected static HashSet<String> supportEnum = null;
    public static final String switch_btn = "switch_btn";
    public static final String text = "text";
    public static final String toast = "toast";
    public static final String unknown_ = "unknown_";
    public static final String view = "view";
    public static final String vstack = "vstack";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSTemplateModeType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSTemplateModeType>() { // from class: com.p1.mobile.putong.data.OMSTemplateModeType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSTemplateModeType newTEnum(String str, int i) {
                return OMSTemplateModeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSTemplateModeType>() { // from class: com.p1.mobile.putong.data.OMSTemplateModeType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSTemplateModeType newTEnum(String str, int i) {
                return OMSTemplateModeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("text", 0);
        tEnumJsonAdapter.addExtJsonValue(image, 1);
        tEnumJsonAdapter.addExtJsonValue("button", 2);
        tEnumJsonAdapter.addExtJsonValue(vstack, 3);
        tEnumJsonAdapter.addExtJsonValue(hstack, 4);
        tEnumJsonAdapter.addExtJsonValue("overlap", 5);
        tEnumJsonAdapter.addExtJsonValue(page, 6);
        tEnumJsonAdapter.addExtJsonValue(space, 7);
        tEnumJsonAdapter.addExtJsonValue(view, 8);
        tEnumJsonAdapter.addExtJsonValue("extra", 9);
        tEnumJsonAdapter.addExtJsonValue(checkbox, int_checkbox);
        tEnumJsonAdapter.addExtJsonValue(switch_btn, int_switch_btn);
        tEnumJsonAdapter.addExtJsonValue(toast, int_toast);
        supportEnum.add("text");
        supportEnum.add(image);
        supportEnum.add("button");
        supportEnum.add(vstack);
        supportEnum.add(hstack);
        supportEnum.add("overlap");
        supportEnum.add(page);
        supportEnum.add(space);
        supportEnum.add(view);
        supportEnum.add("extra");
        supportEnum.add(checkbox);
        supportEnum.add(switch_btn);
        supportEnum.add(toast);
        _OMSTemplateModeType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSTemplateModeType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSTemplateModeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSTemplateModeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSTemplateModeType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSTemplateModeType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSTemplateModeType get(String str) {
        Map<String, OMSTemplateModeType> map = _OMSTemplateModeType;
        OMSTemplateModeType oMSTemplateModeType = map.get(str);
        if (oMSTemplateModeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSTemplateModeType = integer == null ? new OMSTemplateModeType(str, -1) : new OMSTemplateModeType(str, integer.intValue());
            map.put(str, oMSTemplateModeType);
        }
        return oMSTemplateModeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSTemplateModeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSTemplateModeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSTemplateModeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSTemplateModeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
