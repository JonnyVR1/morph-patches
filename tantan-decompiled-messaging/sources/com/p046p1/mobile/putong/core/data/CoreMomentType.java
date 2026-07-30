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
public class CoreMomentType extends TEnum {
    public static final TEnumJsonAdapter<CoreMomentType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<CoreMomentType> PROTOBUF_ADAPTER;
    private static final Map<String, CoreMomentType> _CoreMomentType;
    public static final String default_ = "default";
    private static final int int_default_ = 0;
    private static final int int_president = 5;
    private static final int int_seeAd = 4;
    private static final int int_unknown_ = -1;
    private static final int int_userDescription = 1;
    private static final int int_userImages = 2;
    private static final int int_userVideos = 3;
    public static final String president = "president";
    public static final String seeAd = "seeAd";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String userDescription = "userDescription";
    public static final String userImages = "userImages";
    public static final String userVideos = "userVideos";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CoreMomentType> tEnumJsonAdapter = new TEnumJsonAdapter<CoreMomentType>() { // from class: com.p1.mobile.putong.core.data.CoreMomentType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public CoreMomentType newTEnum(String str, int i) {
                return CoreMomentType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CoreMomentType>() { // from class: com.p1.mobile.putong.core.data.CoreMomentType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public CoreMomentType newTEnum(String str, int i) {
                return CoreMomentType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue("userDescription", 1);
        tEnumJsonAdapter.addExtJsonValue("userImages", 2);
        tEnumJsonAdapter.addExtJsonValue("userVideos", 3);
        tEnumJsonAdapter.addExtJsonValue("seeAd", 4);
        tEnumJsonAdapter.addExtJsonValue("president", 5);
        supportEnum.add("default");
        supportEnum.add("userDescription");
        supportEnum.add("userImages");
        supportEnum.add("userVideos");
        supportEnum.add("seeAd");
        supportEnum.add("president");
        _CoreMomentType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private CoreMomentType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CoreMomentType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoreMomentType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CoreMomentType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, CoreMomentType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static CoreMomentType get(String str) {
        Map<String, CoreMomentType> map = _CoreMomentType;
        CoreMomentType coreMomentType = map.get(str);
        if (coreMomentType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            coreMomentType = integer == null ? new CoreMomentType(str, -1) : new CoreMomentType(str, integer.intValue());
            map.put(str, coreMomentType);
        }
        return coreMomentType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CoreMomentType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CoreMomentType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CoreMomentType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CoreMomentType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
