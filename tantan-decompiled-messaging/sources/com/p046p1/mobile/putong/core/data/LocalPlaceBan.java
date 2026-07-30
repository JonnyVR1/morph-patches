package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class LocalPlaceBan extends TEnum {
    public static final TEnumJsonAdapter<LocalPlaceBan> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LocalPlaceBan> PROTOBUF_ADAPTER;
    private static final Map<String, LocalPlaceBan> _LocalPlaceBan;
    public static final String both = "both";
    public static final String chatList = "chatList";
    private static final int int_both = 3;
    private static final int int_chatList = 2;
    private static final int int_matchList = 1;
    private static final int int_none = 0;
    private static final int int_unknown_ = -1;
    public static final String matchList = "matchList";
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LocalPlaceBan> tEnumJsonAdapter = new TEnumJsonAdapter<LocalPlaceBan>() { // from class: com.p1.mobile.putong.core.data.LocalPlaceBan.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LocalPlaceBan newTEnum(String str, int i) {
                return LocalPlaceBan.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LocalPlaceBan>() { // from class: com.p1.mobile.putong.core.data.LocalPlaceBan.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LocalPlaceBan newTEnum(String str, int i) {
                return LocalPlaceBan.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("none", 0);
        tEnumJsonAdapter.addExtJsonValue(matchList, 1);
        tEnumJsonAdapter.addExtJsonValue(chatList, 2);
        tEnumJsonAdapter.addExtJsonValue("both", 3);
        supportEnum.add("none");
        supportEnum.add(matchList);
        supportEnum.add(chatList);
        supportEnum.add("both");
        _LocalPlaceBan = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LocalPlaceBan(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LocalPlaceBan> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LocalPlaceBan> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LocalPlaceBan> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LocalPlaceBan> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LocalPlaceBan get(String str) {
        Map<String, LocalPlaceBan> map = _LocalPlaceBan;
        LocalPlaceBan localPlaceBan = map.get(str);
        if (localPlaceBan == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            localPlaceBan = integer == null ? new LocalPlaceBan(str, -1) : new LocalPlaceBan(str, integer.intValue());
            map.put(str, localPlaceBan);
        }
        return localPlaceBan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LocalPlaceBan getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LocalPlaceBan> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LocalPlaceBan> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LocalPlaceBan get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
