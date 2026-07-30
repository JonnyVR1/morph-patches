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
public class BannerFrequencyType extends TEnum {
    public static final TEnumJsonAdapter<BannerFrequencyType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BannerFrequencyType> PROTOBUF_ADAPTER;
    private static final Map<String, BannerFrequencyType> _BannerFrequencyType;
    private static final int int_interval = 1;
    private static final int int_sum = 0;
    private static final int int_unknown_ = -1;
    public static final String interval = "interval";
    public static final String sum = "sum";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BannerFrequencyType> tEnumJsonAdapter = new TEnumJsonAdapter<BannerFrequencyType>() { // from class: com.p1.mobile.putong.data.BannerFrequencyType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public BannerFrequencyType newTEnum(String str, int i) {
                return BannerFrequencyType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BannerFrequencyType>() { // from class: com.p1.mobile.putong.data.BannerFrequencyType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public BannerFrequencyType newTEnum(String str, int i) {
                return BannerFrequencyType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(sum, 0);
        tEnumJsonAdapter.addExtJsonValue(interval, 1);
        supportEnum.add(sum);
        supportEnum.add(interval);
        _BannerFrequencyType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BannerFrequencyType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BannerFrequencyType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BannerFrequencyType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BannerFrequencyType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BannerFrequencyType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BannerFrequencyType get(String str) {
        Map<String, BannerFrequencyType> map = _BannerFrequencyType;
        BannerFrequencyType bannerFrequencyType = map.get(str);
        if (bannerFrequencyType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bannerFrequencyType = integer == null ? new BannerFrequencyType(str, -1) : new BannerFrequencyType(str, integer.intValue());
            map.put(str, bannerFrequencyType);
        }
        return bannerFrequencyType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BannerFrequencyType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BannerFrequencyType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BannerFrequencyType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BannerFrequencyType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
