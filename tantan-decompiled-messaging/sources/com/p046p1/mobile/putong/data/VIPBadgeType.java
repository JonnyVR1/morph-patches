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
public class VIPBadgeType extends TEnum {
    public static final TEnumJsonAdapter<VIPBadgeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VIPBadgeType> PROTOBUF_ADAPTER;
    private static final Map<String, VIPBadgeType> _VIPBadgeType;
    private static final int int_unknown_ = -1;
    private static final int int_vip1 = 0;
    private static final int int_vip12 = 2;
    private static final int int_vip3 = 1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String vip1 = "vip1";
    public static final String vip12 = "vip12";
    public static final String vip3 = "vip3";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<VIPBadgeType> tEnumJsonAdapter = new TEnumJsonAdapter<VIPBadgeType>() { // from class: com.p1.mobile.putong.data.VIPBadgeType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public VIPBadgeType newTEnum(String str, int i) {
                return VIPBadgeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<VIPBadgeType>() { // from class: com.p1.mobile.putong.data.VIPBadgeType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public VIPBadgeType newTEnum(String str, int i) {
                return VIPBadgeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(vip1, 0);
        tEnumJsonAdapter.addExtJsonValue(vip3, 1);
        tEnumJsonAdapter.addExtJsonValue(vip12, 2);
        supportEnum.add(vip1);
        supportEnum.add(vip3);
        supportEnum.add(vip12);
        _VIPBadgeType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private VIPBadgeType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VIPBadgeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VIPBadgeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VIPBadgeType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, VIPBadgeType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static VIPBadgeType get(String str) {
        Map<String, VIPBadgeType> map = _VIPBadgeType;
        VIPBadgeType vIPBadgeType = map.get(str);
        if (vIPBadgeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            vIPBadgeType = integer == null ? new VIPBadgeType(str, -1) : new VIPBadgeType(str, integer.intValue());
            map.put(str, vIPBadgeType);
        }
        return vIPBadgeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VIPBadgeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VIPBadgeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VIPBadgeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VIPBadgeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
