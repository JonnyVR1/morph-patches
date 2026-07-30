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
public class OMSFontStyle extends TEnum {
    public static final TEnumJsonAdapter<OMSFontStyle> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSFontStyle> PROTOBUF_ADAPTER;
    private static final Map<String, OMSFontStyle> _OMSFontStyle;
    public static final String bold = "bold";
    public static final String bold_italic = "bold_italic";
    private static final int int_bold = 1;
    private static final int int_bold_italic = 6;
    private static final int int_italic = 5;
    private static final int int_light = 2;
    private static final int int_medium = 3;
    private static final int int_normal = 0;
    private static final int int_semibold = 4;
    private static final int int_unknown_ = -1;
    public static final String italic = "italic";
    public static final String light = "light";
    public static final String medium = "medium";
    public static final String normal = "normal";
    public static final String semibold = "semibold";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSFontStyle> tEnumJsonAdapter = new TEnumJsonAdapter<OMSFontStyle>() { // from class: com.p1.mobile.putong.data.OMSFontStyle.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSFontStyle newTEnum(String str, int i) {
                return OMSFontStyle.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSFontStyle>() { // from class: com.p1.mobile.putong.data.OMSFontStyle.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSFontStyle newTEnum(String str, int i) {
                return OMSFontStyle.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("normal", 0);
        tEnumJsonAdapter.addExtJsonValue(bold, 1);
        tEnumJsonAdapter.addExtJsonValue(light, 2);
        tEnumJsonAdapter.addExtJsonValue("medium", 3);
        tEnumJsonAdapter.addExtJsonValue(semibold, 4);
        tEnumJsonAdapter.addExtJsonValue(italic, 5);
        tEnumJsonAdapter.addExtJsonValue(bold_italic, 6);
        supportEnum.add("normal");
        supportEnum.add(bold);
        supportEnum.add(light);
        supportEnum.add("medium");
        supportEnum.add(semibold);
        supportEnum.add(italic);
        supportEnum.add(bold_italic);
        _OMSFontStyle = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSFontStyle(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSFontStyle> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSFontStyle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSFontStyle> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSFontStyle> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSFontStyle get(String str) {
        Map<String, OMSFontStyle> map = _OMSFontStyle;
        OMSFontStyle oMSFontStyle = map.get(str);
        if (oMSFontStyle == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSFontStyle = integer == null ? new OMSFontStyle(str, -1) : new OMSFontStyle(str, integer.intValue());
            map.put(str, oMSFontStyle);
        }
        return oMSFontStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSFontStyle getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSFontStyle> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSFontStyle> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSFontStyle get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
