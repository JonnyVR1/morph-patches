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
public class OMSMorphBaseStyle extends TEnum {
    public static final TEnumJsonAdapter<OMSMorphBaseStyle> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSMorphBaseStyle> PROTOBUF_ADAPTER;
    private static final Map<String, OMSMorphBaseStyle> _OMSMorphBaseStyle;
    public static final String bigScreen = "bigScreen";
    public static final String fullScreen = "fullScreen";
    private static final int int_bigScreen = 1;
    private static final int int_fullScreen = 2;
    private static final int int_normal = 0;
    private static final int int_unknown_ = -1;
    public static final String normal = "normal";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSMorphBaseStyle> tEnumJsonAdapter = new TEnumJsonAdapter<OMSMorphBaseStyle>() { // from class: com.p1.mobile.putong.data.OMSMorphBaseStyle.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSMorphBaseStyle newTEnum(String str, int i) {
                return OMSMorphBaseStyle.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSMorphBaseStyle>() { // from class: com.p1.mobile.putong.data.OMSMorphBaseStyle.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSMorphBaseStyle newTEnum(String str, int i) {
                return OMSMorphBaseStyle.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("normal", 0);
        tEnumJsonAdapter.addExtJsonValue(bigScreen, 1);
        tEnumJsonAdapter.addExtJsonValue(fullScreen, 2);
        supportEnum.add("normal");
        supportEnum.add(bigScreen);
        supportEnum.add(fullScreen);
        _OMSMorphBaseStyle = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSMorphBaseStyle(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSMorphBaseStyle> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSMorphBaseStyle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSMorphBaseStyle> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSMorphBaseStyle> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSMorphBaseStyle get(String str) {
        Map<String, OMSMorphBaseStyle> map = _OMSMorphBaseStyle;
        OMSMorphBaseStyle oMSMorphBaseStyle = map.get(str);
        if (oMSMorphBaseStyle == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSMorphBaseStyle = integer == null ? new OMSMorphBaseStyle(str, -1) : new OMSMorphBaseStyle(str, integer.intValue());
            map.put(str, oMSMorphBaseStyle);
        }
        return oMSMorphBaseStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSMorphBaseStyle getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSMorphBaseStyle> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSMorphBaseStyle> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSMorphBaseStyle get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
