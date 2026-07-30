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
public class OMSWidgeType extends TEnum {
    public static final TEnumJsonAdapter<OMSWidgeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSWidgeType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSWidgeType> _OMSWidgeType;
    public static final String bubble = "bubble";
    private static final int int_bubble = 0;
    private static final int int_pendant = 1;
    private static final int int_unknown_ = -1;
    public static final String pendant = "pendant";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSWidgeType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSWidgeType>() { // from class: com.p1.mobile.putong.data.OMSWidgeType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSWidgeType newTEnum(String str, int i) {
                return OMSWidgeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSWidgeType>() { // from class: com.p1.mobile.putong.data.OMSWidgeType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSWidgeType newTEnum(String str, int i) {
                return OMSWidgeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("bubble", 0);
        tEnumJsonAdapter.addExtJsonValue(pendant, 1);
        supportEnum.add("bubble");
        supportEnum.add(pendant);
        _OMSWidgeType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSWidgeType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSWidgeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSWidgeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSWidgeType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSWidgeType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSWidgeType get(String str) {
        Map<String, OMSWidgeType> map = _OMSWidgeType;
        OMSWidgeType oMSWidgeType = map.get(str);
        if (oMSWidgeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSWidgeType = integer == null ? new OMSWidgeType(str, -1) : new OMSWidgeType(str, integer.intValue());
            map.put(str, oMSWidgeType);
        }
        return oMSWidgeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSWidgeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSWidgeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSWidgeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSWidgeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
