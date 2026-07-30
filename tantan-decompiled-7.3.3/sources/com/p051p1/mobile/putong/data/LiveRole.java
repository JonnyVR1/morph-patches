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
public class LiveRole extends TEnum {
    public static final TEnumJsonAdapter<LiveRole> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LiveRole> PROTOBUF_ADAPTER;
    private static final Map<String, LiveRole> _LiveRole;
    public static final String admin = "admin";
    public static final String anchor = "anchor";
    public static final String audience = "audience";
    private static final int int_admin = 1;
    private static final int int_anchor = 0;
    private static final int int_audience = 2;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LiveRole> tEnumJsonAdapter = new TEnumJsonAdapter<LiveRole>() { // from class: com.p1.mobile.putong.data.LiveRole.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LiveRole newTEnum(String str, int i) {
                return LiveRole.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LiveRole>() { // from class: com.p1.mobile.putong.data.LiveRole.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LiveRole newTEnum(String str, int i) {
                return LiveRole.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("anchor", 0);
        tEnumJsonAdapter.addExtJsonValue("admin", 1);
        tEnumJsonAdapter.addExtJsonValue("audience", 2);
        supportEnum.add("anchor");
        supportEnum.add("admin");
        supportEnum.add("audience");
        _LiveRole = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LiveRole(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LiveRole> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LiveRole> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LiveRole> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LiveRole> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LiveRole get(String str) {
        Map<String, LiveRole> map = _LiveRole;
        LiveRole liveRole = map.get(str);
        if (liveRole == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            liveRole = integer == null ? new LiveRole(str, -1) : new LiveRole(str, integer.intValue());
            map.put(str, liveRole);
        }
        return liveRole;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LiveRole getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LiveRole> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LiveRole> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LiveRole get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
