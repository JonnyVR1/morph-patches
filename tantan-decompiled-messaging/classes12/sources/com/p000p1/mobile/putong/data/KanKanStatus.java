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
public class KanKanStatus extends TEnum {
    public static final TEnumJsonAdapter<KanKanStatus> JSON_ADAPTER;
    public static final String KanKanStatus = "KanKanStatus";
    public static final TEnumProtobufAdapter<KanKanStatus> PROTOBUF_ADAPTER;
    private static final Map<String, KanKanStatus> _KanKanStatus;
    public static final String dismissed = "dismissed";
    private static final int int_KanKanStatus = 0;
    private static final int int_dismissed = 5;
    private static final int int_postError = 4;
    private static final int int_retryError = 3;
    private static final int int_start = 1;
    private static final int int_success = 2;
    private static final int int_unknown_ = -1;
    public static final String postError = "postError";
    public static final String retryError = "retryError";
    public static final String start = "start";
    public static final String success = "success";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<KanKanStatus> tEnumJsonAdapter = new TEnumJsonAdapter<KanKanStatus>() { // from class: com.p1.mobile.putong.data.KanKanStatus.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public KanKanStatus newTEnum(String str, int i) {
                return KanKanStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<KanKanStatus>() { // from class: com.p1.mobile.putong.data.KanKanStatus.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public KanKanStatus newTEnum(String str, int i) {
                return KanKanStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(KanKanStatus, 0);
        tEnumJsonAdapter.addExtJsonValue(start, 1);
        tEnumJsonAdapter.addExtJsonValue("success", 2);
        tEnumJsonAdapter.addExtJsonValue(retryError, 3);
        tEnumJsonAdapter.addExtJsonValue(postError, 4);
        tEnumJsonAdapter.addExtJsonValue("dismissed", 5);
        supportEnum.add(KanKanStatus);
        supportEnum.add(start);
        supportEnum.add("success");
        supportEnum.add(retryError);
        supportEnum.add(postError);
        supportEnum.add("dismissed");
        _KanKanStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private KanKanStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<KanKanStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<KanKanStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, KanKanStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, KanKanStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static KanKanStatus get(String str) {
        Map<String, KanKanStatus> map = _KanKanStatus;
        KanKanStatus kanKanStatus = map.get(str);
        if (kanKanStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            kanKanStatus = integer == null ? new KanKanStatus(str, -1) : new KanKanStatus(str, integer.intValue());
            map.put(str, kanKanStatus);
        }
        return kanKanStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KanKanStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<KanKanStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, KanKanStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static KanKanStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
