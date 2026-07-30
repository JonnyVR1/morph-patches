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
public class Shows extends TEnum {
    public static final TEnumJsonAdapter<Shows> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Shows> PROTOBUF_ADAPTER;
    private static final Map<String, Shows> _Shows;
    private static final int int_unknown_ = -1;
    public static final String receiver = "receiver";
    public static final String sender = "sender";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Shows> tEnumJsonAdapter = new TEnumJsonAdapter<Shows>() { // from class: com.p1.mobile.putong.core.data.Shows.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Shows newTEnum(String str, int i) {
                return Shows.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Shows>() { // from class: com.p1.mobile.putong.core.data.Shows.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Shows newTEnum(String str, int i) {
                return Shows.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("receiver");
        supportEnum.add(sender);
        _Shows = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private Shows(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Shows> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Shows> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Shows> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Shows> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static Shows get(String str) {
        Map<String, Shows> map = _Shows;
        Shows shows = map.get(str);
        if (shows == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            shows = integer == null ? new Shows(str, -1) : new Shows(str, integer.intValue());
            map.put(str, shows);
        }
        return shows;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Shows getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Shows> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Shows> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Shows get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
