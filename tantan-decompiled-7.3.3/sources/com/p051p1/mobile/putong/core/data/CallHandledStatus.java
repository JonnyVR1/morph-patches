package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class CallHandledStatus extends TEnum {
    public static final TEnumJsonAdapter<CallHandledStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<CallHandledStatus> PROTOBUF_ADAPTER;
    private static final Map<String, CallHandledStatus> _CallHandledStatus;
    public static final String alreadyHandled = "alreadyHandled";
    public static final String handling = "handling";
    private static final int int_alreadyHandled = 3;
    private static final int int_handling = 2;
    private static final int int_none = 0;
    private static final int int_unhandled = 1;
    private static final int int_unknown_ = -1;
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String unhandled = "unhandled";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CallHandledStatus> tEnumJsonAdapter = new TEnumJsonAdapter<CallHandledStatus>() { // from class: com.p1.mobile.putong.core.data.CallHandledStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public CallHandledStatus newTEnum(String str, int i) {
                return CallHandledStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CallHandledStatus>() { // from class: com.p1.mobile.putong.core.data.CallHandledStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public CallHandledStatus newTEnum(String str, int i) {
                return CallHandledStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("none", 0);
        tEnumJsonAdapter.addExtJsonValue(unhandled, 1);
        tEnumJsonAdapter.addExtJsonValue(handling, 2);
        tEnumJsonAdapter.addExtJsonValue(alreadyHandled, 3);
        supportEnum.add("none");
        supportEnum.add(unhandled);
        supportEnum.add(handling);
        supportEnum.add(alreadyHandled);
        _CallHandledStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private CallHandledStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CallHandledStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CallHandledStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CallHandledStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, CallHandledStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static CallHandledStatus get(String str) {
        Map<String, CallHandledStatus> map = _CallHandledStatus;
        CallHandledStatus callHandledStatus = map.get(str);
        if (callHandledStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            callHandledStatus = integer == null ? new CallHandledStatus(str, -1) : new CallHandledStatus(str, integer.intValue());
            map.put(str, callHandledStatus);
        }
        return callHandledStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CallHandledStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CallHandledStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CallHandledStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CallHandledStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
