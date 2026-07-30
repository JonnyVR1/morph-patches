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
public class OMSWebPerimeterType extends TEnum {
    public static final TEnumJsonAdapter<OMSWebPerimeterType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSWebPerimeterType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSWebPerimeterType> _OMSWebPerimeterType;
    public static final String absolute = "absolute";
    private static final int int_absolute = 0;
    private static final int int_relative = 1;
    private static final int int_unknown_ = -1;
    public static final String relative = "relative";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSWebPerimeterType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSWebPerimeterType>() { // from class: com.p1.mobile.putong.data.OMSWebPerimeterType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSWebPerimeterType newTEnum(String str, int i) {
                return OMSWebPerimeterType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSWebPerimeterType>() { // from class: com.p1.mobile.putong.data.OMSWebPerimeterType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSWebPerimeterType newTEnum(String str, int i) {
                return OMSWebPerimeterType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(absolute, 0);
        tEnumJsonAdapter.addExtJsonValue(relative, 1);
        supportEnum.add(absolute);
        supportEnum.add(relative);
        _OMSWebPerimeterType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSWebPerimeterType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSWebPerimeterType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSWebPerimeterType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSWebPerimeterType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSWebPerimeterType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSWebPerimeterType get(String str) {
        Map<String, OMSWebPerimeterType> map = _OMSWebPerimeterType;
        OMSWebPerimeterType oMSWebPerimeterType = map.get(str);
        if (oMSWebPerimeterType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSWebPerimeterType = integer == null ? new OMSWebPerimeterType(str, -1) : new OMSWebPerimeterType(str, integer.intValue());
            map.put(str, oMSWebPerimeterType);
        }
        return oMSWebPerimeterType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSWebPerimeterType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSWebPerimeterType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSWebPerimeterType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSWebPerimeterType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
