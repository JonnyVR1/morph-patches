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
public class OMSUIType extends TEnum {
    public static final TEnumJsonAdapter<OMSUIType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSUIType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSUIType> _OMSUIType;
    public static final String default_ = "default";
    private static final int int_default_ = 0;
    private static final int int_new_type = 1;
    private static final int int_unknown_ = -1;
    public static final String new_type = "new_type";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSUIType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSUIType>() { // from class: com.p1.mobile.putong.data.OMSUIType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSUIType newTEnum(String str, int i) {
                return OMSUIType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSUIType>() { // from class: com.p1.mobile.putong.data.OMSUIType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSUIType newTEnum(String str, int i) {
                return OMSUIType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue(new_type, 1);
        supportEnum.add("default");
        supportEnum.add(new_type);
        _OMSUIType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSUIType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSUIType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSUIType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSUIType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSUIType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSUIType get(String str) {
        Map<String, OMSUIType> map = _OMSUIType;
        OMSUIType oMSUIType = map.get(str);
        if (oMSUIType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSUIType = integer == null ? new OMSUIType(str, -1) : new OMSUIType(str, integer.intValue());
            map.put(str, oMSUIType);
        }
        return oMSUIType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSUIType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSUIType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSUIType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSUIType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
