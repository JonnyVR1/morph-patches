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
public class FirstChargeStatus extends TEnum {
    public static final TEnumJsonAdapter<FirstChargeStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<FirstChargeStatus> PROTOBUF_ADAPTER;
    private static final Map<String, FirstChargeStatus> _FirstChargeStatus;
    public static final String completed = "completed";
    private static final int int_completed = 2;
    private static final int int_pending = 0;
    private static final int int_success = 1;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    public static final String success = "success";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<FirstChargeStatus> tEnumJsonAdapter = new TEnumJsonAdapter<FirstChargeStatus>() { // from class: com.p1.mobile.putong.data.FirstChargeStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public FirstChargeStatus newTEnum(String str, int i) {
                return FirstChargeStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<FirstChargeStatus>() { // from class: com.p1.mobile.putong.data.FirstChargeStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public FirstChargeStatus newTEnum(String str, int i) {
                return FirstChargeStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("pending", 0);
        tEnumJsonAdapter.addExtJsonValue("success", 1);
        tEnumJsonAdapter.addExtJsonValue("completed", 2);
        supportEnum.add("pending");
        supportEnum.add("success");
        supportEnum.add("completed");
        _FirstChargeStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private FirstChargeStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<FirstChargeStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FirstChargeStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, FirstChargeStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, FirstChargeStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static FirstChargeStatus get(String str) {
        Map<String, FirstChargeStatus> map = _FirstChargeStatus;
        FirstChargeStatus firstChargeStatus = map.get(str);
        if (firstChargeStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            firstChargeStatus = integer == null ? new FirstChargeStatus(str, -1) : new FirstChargeStatus(str, integer.intValue());
            map.put(str, firstChargeStatus);
        }
        return firstChargeStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FirstChargeStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<FirstChargeStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, FirstChargeStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static FirstChargeStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
