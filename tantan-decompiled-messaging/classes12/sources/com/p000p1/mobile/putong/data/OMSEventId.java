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
public class OMSEventId extends TEnum {
    public static final TEnumJsonAdapter<OMSEventId> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSEventId> PROTOBUF_ADAPTER;
    private static final Map<String, OMSEventId> _OMSEventId;
    public static final String e_page_switch = "e_page_switch";
    public static final String e_swipe_after = "e_swipe_after";
    public static final String e_swipe_before = "e_swipe_before";
    private static final int int_e_page_switch = 2;
    private static final int int_e_swipe_after = 1;
    private static final int int_e_swipe_before = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSEventId> tEnumJsonAdapter = new TEnumJsonAdapter<OMSEventId>() { // from class: com.p1.mobile.putong.data.OMSEventId.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSEventId newTEnum(String str, int i) {
                return OMSEventId.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSEventId>() { // from class: com.p1.mobile.putong.data.OMSEventId.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSEventId newTEnum(String str, int i) {
                return OMSEventId.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(e_swipe_before, 0);
        tEnumJsonAdapter.addExtJsonValue(e_swipe_after, 1);
        tEnumJsonAdapter.addExtJsonValue(e_page_switch, 2);
        supportEnum.add(e_swipe_before);
        supportEnum.add(e_swipe_after);
        supportEnum.add(e_page_switch);
        _OMSEventId = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSEventId(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSEventId> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSEventId> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSEventId> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSEventId> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSEventId get(String str) {
        Map<String, OMSEventId> map = _OMSEventId;
        OMSEventId oMSEventId = map.get(str);
        if (oMSEventId == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSEventId = integer == null ? new OMSEventId(str, -1) : new OMSEventId(str, integer.intValue());
            map.put(str, oMSEventId);
        }
        return oMSEventId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSEventId getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSEventId> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSEventId> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSEventId get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
