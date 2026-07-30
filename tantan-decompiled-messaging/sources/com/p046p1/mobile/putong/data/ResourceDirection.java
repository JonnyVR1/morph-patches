package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ResourceDirection extends TEnum {
    public static final TEnumJsonAdapter<ResourceDirection> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ResourceDirection> PROTOBUF_ADAPTER;
    private static final Map<String, ResourceDirection> _ResourceDirection;

    /* JADX INFO: renamed from: h */
    public static final String f38807h = "h";
    private static final int int_h = 0;
    private static final int int_unknown_ = -1;
    private static final int int_v = 1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: v */
    public static final String f38808v = "v";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ResourceDirection> tEnumJsonAdapter = new TEnumJsonAdapter<ResourceDirection>() { // from class: com.p1.mobile.putong.data.ResourceDirection.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ResourceDirection newTEnum(String str, int i) {
                return ResourceDirection.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ResourceDirection>() { // from class: com.p1.mobile.putong.data.ResourceDirection.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ResourceDirection newTEnum(String str, int i) {
                return ResourceDirection.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("h", 0);
        tEnumJsonAdapter.addExtJsonValue(f38808v, 1);
        supportEnum.add("h");
        supportEnum.add(f38808v);
        _ResourceDirection = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ResourceDirection(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ResourceDirection> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ResourceDirection> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ResourceDirection> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ResourceDirection> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ResourceDirection get(String str) {
        Map<String, ResourceDirection> map = _ResourceDirection;
        ResourceDirection resourceDirection = map.get(str);
        if (resourceDirection == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            resourceDirection = integer == null ? new ResourceDirection(str, -1) : new ResourceDirection(str, integer.intValue());
            map.put(str, resourceDirection);
        }
        return resourceDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ResourceDirection getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ResourceDirection> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ResourceDirection> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ResourceDirection get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
