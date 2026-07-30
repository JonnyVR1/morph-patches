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
public class LocalStatus extends TEnum {
    public static final TEnumJsonAdapter<LocalStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LocalStatus> PROTOBUF_ADAPTER;
    private static final Map<String, LocalStatus> _LocalStatus;
    public static final String failed = "failed";
    private static final int int_failed = 2;
    private static final int int_normal = 0;
    private static final int int_sending = 1;
    private static final int int_unknown_ = -1;
    public static final String normal = "normal";
    public static final String sending = "sending";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LocalStatus> tEnumJsonAdapter = new TEnumJsonAdapter<LocalStatus>() { // from class: com.p1.mobile.putong.data.LocalStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LocalStatus newTEnum(String str, int i) {
                return LocalStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LocalStatus>() { // from class: com.p1.mobile.putong.data.LocalStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LocalStatus newTEnum(String str, int i) {
                return LocalStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("normal", 0);
        tEnumJsonAdapter.addExtJsonValue(sending, 1);
        tEnumJsonAdapter.addExtJsonValue("failed", 2);
        supportEnum.add("normal");
        supportEnum.add(sending);
        supportEnum.add("failed");
        _LocalStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LocalStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LocalStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LocalStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LocalStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LocalStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LocalStatus get(String str) {
        Map<String, LocalStatus> map = _LocalStatus;
        LocalStatus localStatus = map.get(str);
        if (localStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            localStatus = integer == null ? new LocalStatus(str, -1) : new LocalStatus(str, integer.intValue());
            map.put(str, localStatus);
        }
        return localStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LocalStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LocalStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LocalStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LocalStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
