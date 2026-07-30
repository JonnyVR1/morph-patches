package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class MomentVisibilityStatus extends TEnum {
    public static final TEnumJsonAdapter<MomentVisibilityStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MomentVisibilityStatus> PROTOBUF_ADAPTER;
    private static final Map<String, MomentVisibilityStatus> _MomentVisibilityStatus;
    public static final String everyone = "everyone";
    private static final int int_everyone = 1;
    private static final int int_matches = 0;
    private static final int int_selfOnly = 2;
    private static final int int_unknown_ = -1;
    public static final String matches = "matches";
    public static final String selfOnly = "selfOnly";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MomentVisibilityStatus> tEnumJsonAdapter = new TEnumJsonAdapter<MomentVisibilityStatus>() { // from class: com.p1.mobile.putong.feed.data.MomentVisibilityStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MomentVisibilityStatus newTEnum(String str, int i) {
                return MomentVisibilityStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MomentVisibilityStatus>() { // from class: com.p1.mobile.putong.feed.data.MomentVisibilityStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MomentVisibilityStatus newTEnum(String str, int i) {
                return MomentVisibilityStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("matches", 0);
        tEnumJsonAdapter.addExtJsonValue("everyone", 1);
        tEnumJsonAdapter.addExtJsonValue("selfOnly", 2);
        supportEnum.add("matches");
        supportEnum.add("everyone");
        supportEnum.add("selfOnly");
        _MomentVisibilityStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MomentVisibilityStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MomentVisibilityStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MomentVisibilityStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MomentVisibilityStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MomentVisibilityStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MomentVisibilityStatus get(String str) {
        Map<String, MomentVisibilityStatus> map = _MomentVisibilityStatus;
        MomentVisibilityStatus momentVisibilityStatus = map.get(str);
        if (momentVisibilityStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            momentVisibilityStatus = integer == null ? new MomentVisibilityStatus(str, -1) : new MomentVisibilityStatus(str, integer.intValue());
            map.put(str, momentVisibilityStatus);
        }
        return momentVisibilityStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MomentVisibilityStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MomentVisibilityStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MomentVisibilityStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MomentVisibilityStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
