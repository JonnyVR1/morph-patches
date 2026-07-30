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
public class DeviceType extends TEnum {
    public static final TEnumJsonAdapter<DeviceType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<DeviceType> PROTOBUF_ADAPTER;
    private static final Map<String, DeviceType> _DeviceType;

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    public static final String f210114android = "android";
    public static final String both = "both";
    private static final int int_android = 2;
    private static final int int_both = 1;
    private static final int int_ios = 3;
    private static final int int_none = 0;
    private static final int int_unknown_ = -1;
    public static final String ios = "ios";
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<DeviceType> tEnumJsonAdapter = new TEnumJsonAdapter<DeviceType>() { // from class: com.p1.mobile.putong.core.data.DeviceType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public DeviceType newTEnum(String str, int i) {
                return DeviceType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<DeviceType>() { // from class: com.p1.mobile.putong.core.data.DeviceType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public DeviceType newTEnum(String str, int i) {
                return DeviceType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("none", 0);
        tEnumJsonAdapter.addExtJsonValue("both", 1);
        tEnumJsonAdapter.addExtJsonValue("android", 2);
        tEnumJsonAdapter.addExtJsonValue(ios, 3);
        supportEnum.add("none");
        supportEnum.add("both");
        supportEnum.add("android");
        supportEnum.add(ios);
        _DeviceType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private DeviceType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<DeviceType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeviceType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, DeviceType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, DeviceType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static DeviceType get(String str) {
        Map<String, DeviceType> map = _DeviceType;
        DeviceType deviceType = map.get(str);
        if (deviceType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            deviceType = integer == null ? new DeviceType(str, -1) : new DeviceType(str, integer.intValue());
            map.put(str, deviceType);
        }
        return deviceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeviceType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<DeviceType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, DeviceType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static DeviceType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
