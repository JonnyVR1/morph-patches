package com.p051p1.mobile.putong.live.base.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes13.dex */
public class Priority extends TEnum {
    public static final String HIGH = "HIGH";
    public static final String IMMEDIATE = "IMMEDIATE";
    public static final TEnumJsonAdapter<Priority> JSON_ADAPTER;
    public static final String LOW = "LOW";
    public static final String MEDIUM = "MEDIUM";
    public static final TEnumProtobufAdapter<Priority> PROTOBUF_ADAPTER;
    private static final Map<String, Priority> _Priority;
    private static final int int_HIGH = 2;
    private static final int int_IMMEDIATE = 3;
    private static final int int_LOW = 0;
    private static final int int_MEDIUM = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.Priority$a */
    public class C12605a extends TEnumJsonAdapter<Priority> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Priority newTEnum(String str, int i) {
            return Priority.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.Priority$b */
    public class C12606b extends TEnumProtobufAdapter<Priority> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Priority newTEnum(String str, int i) {
            return Priority.getForData(str, i);
        }
    }

    static {
        C12605a c12605a = new C12605a();
        JSON_ADAPTER = c12605a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12606b();
        c12605a.addExtJsonValue("unknown_", -1);
        c12605a.addExtJsonValue("LOW", 0);
        c12605a.addExtJsonValue("MEDIUM", 1);
        c12605a.addExtJsonValue("HIGH", 2);
        c12605a.addExtJsonValue("IMMEDIATE", 3);
        supportEnum.add("LOW");
        supportEnum.add("MEDIUM");
        supportEnum.add("HIGH");
        supportEnum.add("IMMEDIATE");
        _Priority = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private Priority(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Priority> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Priority> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Priority> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Priority> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static Priority get(String str) {
        Map<String, Priority> map = _Priority;
        Priority priority = map.get(str);
        if (priority == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            priority = integer == null ? new Priority(str, -1) : new Priority(str, integer.intValue());
            map.put(str, priority);
        }
        return priority;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Priority getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Priority> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Priority> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Priority get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
