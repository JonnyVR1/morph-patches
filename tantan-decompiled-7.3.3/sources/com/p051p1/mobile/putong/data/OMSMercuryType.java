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
public class OMSMercuryType extends TEnum {
    public static final TEnumJsonAdapter<OMSMercuryType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSMercuryType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSMercuryType> _OMSMercuryType;
    private static final int int_mc = 1;
    private static final int int_mv = 2;
    private static final int int_pv = 0;
    private static final int int_unknown_ = -1;

    /* JADX INFO: renamed from: mc */
    public static final String f39639mc = "mc";

    /* JADX INFO: renamed from: mv */
    public static final String f39640mv = "mv";

    /* JADX INFO: renamed from: pv */
    public static final String f39641pv = "pv";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSMercuryType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSMercuryType>() { // from class: com.p1.mobile.putong.data.OMSMercuryType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSMercuryType newTEnum(String str, int i) {
                return OMSMercuryType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSMercuryType>() { // from class: com.p1.mobile.putong.data.OMSMercuryType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSMercuryType newTEnum(String str, int i) {
                return OMSMercuryType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(f39641pv, 0);
        tEnumJsonAdapter.addExtJsonValue(f39639mc, 1);
        tEnumJsonAdapter.addExtJsonValue(f39640mv, 2);
        supportEnum.add(f39641pv);
        supportEnum.add(f39639mc);
        supportEnum.add(f39640mv);
        _OMSMercuryType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private OMSMercuryType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSMercuryType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSMercuryType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSMercuryType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, OMSMercuryType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static OMSMercuryType get(String str) {
        Map<String, OMSMercuryType> map = _OMSMercuryType;
        OMSMercuryType oMSMercuryType = map.get(str);
        if (oMSMercuryType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSMercuryType = integer == null ? new OMSMercuryType(str, -1) : new OMSMercuryType(str, integer.intValue());
            map.put(str, oMSMercuryType);
        }
        return oMSMercuryType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSMercuryType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSMercuryType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSMercuryType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSMercuryType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
