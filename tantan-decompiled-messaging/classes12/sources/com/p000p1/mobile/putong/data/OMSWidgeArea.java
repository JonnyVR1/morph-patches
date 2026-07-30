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
public class OMSWidgeArea extends TEnum {
    public static final TEnumJsonAdapter<OMSWidgeArea> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSWidgeArea> PROTOBUF_ADAPTER;
    private static final Map<String, OMSWidgeArea> _OMSWidgeArea;
    public static final String homePageNavigation_bubble = "homePageNavigation_bubble";
    public static final String homePageNavigation_pendant = "homePageNavigation_pendant";
    private static final int int_homePageNavigation_bubble = 1;
    private static final int int_homePageNavigation_pendant = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSWidgeArea> tEnumJsonAdapter = new TEnumJsonAdapter<OMSWidgeArea>() { // from class: com.p1.mobile.putong.data.OMSWidgeArea.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSWidgeArea newTEnum(String str, int i) {
                return OMSWidgeArea.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSWidgeArea>() { // from class: com.p1.mobile.putong.data.OMSWidgeArea.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSWidgeArea newTEnum(String str, int i) {
                return OMSWidgeArea.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(homePageNavigation_pendant, 0);
        tEnumJsonAdapter.addExtJsonValue(homePageNavigation_bubble, 1);
        supportEnum.add(homePageNavigation_pendant);
        supportEnum.add(homePageNavigation_bubble);
        _OMSWidgeArea = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSWidgeArea(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSWidgeArea> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSWidgeArea> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSWidgeArea> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSWidgeArea> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSWidgeArea get(String str) {
        Map<String, OMSWidgeArea> map = _OMSWidgeArea;
        OMSWidgeArea oMSWidgeArea = map.get(str);
        if (oMSWidgeArea == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSWidgeArea = integer == null ? new OMSWidgeArea(str, -1) : new OMSWidgeArea(str, integer.intValue());
            map.put(str, oMSWidgeArea);
        }
        return oMSWidgeArea;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSWidgeArea getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSWidgeArea> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSWidgeArea> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSWidgeArea get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
