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
public class OMSSwipeMoment extends TEnum {
    public static final TEnumJsonAdapter<OMSSwipeMoment> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSSwipeMoment> PROTOBUF_ADAPTER;
    private static final Map<String, OMSSwipeMoment> _OMSSwipeMoment;
    public static final String after = "after";
    public static final String before = "before";
    private static final int int_after = 1;
    private static final int int_before = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSSwipeMoment> tEnumJsonAdapter = new TEnumJsonAdapter<OMSSwipeMoment>() { // from class: com.p1.mobile.putong.data.OMSSwipeMoment.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSSwipeMoment newTEnum(String str, int i) {
                return OMSSwipeMoment.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSSwipeMoment>() { // from class: com.p1.mobile.putong.data.OMSSwipeMoment.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSSwipeMoment newTEnum(String str, int i) {
                return OMSSwipeMoment.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(before, 0);
        tEnumJsonAdapter.addExtJsonValue(after, 1);
        supportEnum.add(before);
        supportEnum.add(after);
        _OMSSwipeMoment = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSSwipeMoment(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSSwipeMoment> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSSwipeMoment> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSSwipeMoment> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSSwipeMoment> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSSwipeMoment get(String str) {
        Map<String, OMSSwipeMoment> map = _OMSSwipeMoment;
        OMSSwipeMoment oMSSwipeMoment = map.get(str);
        if (oMSSwipeMoment == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSSwipeMoment = integer == null ? new OMSSwipeMoment(str, -1) : new OMSSwipeMoment(str, integer.intValue());
            map.put(str, oMSSwipeMoment);
        }
        return oMSSwipeMoment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSSwipeMoment getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSSwipeMoment> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSSwipeMoment> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSSwipeMoment get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
