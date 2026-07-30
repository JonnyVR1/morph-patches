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
public class BannerRedDot extends TEnum {
    public static final TEnumJsonAdapter<BannerRedDot> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BannerRedDot> PROTOBUF_ADAPTER;
    private static final Map<String, BannerRedDot> _BannerRedDot;
    public static final String everyday = "everyday";
    private static final int int_everyday = 1;
    private static final int int_once = 0;
    private static final int int_unknown_ = -1;
    public static final String once = "once";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BannerRedDot> tEnumJsonAdapter = new TEnumJsonAdapter<BannerRedDot>() { // from class: com.p1.mobile.putong.data.BannerRedDot.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public BannerRedDot newTEnum(String str, int i) {
                return BannerRedDot.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BannerRedDot>() { // from class: com.p1.mobile.putong.data.BannerRedDot.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public BannerRedDot newTEnum(String str, int i) {
                return BannerRedDot.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(once, 0);
        tEnumJsonAdapter.addExtJsonValue(everyday, 1);
        supportEnum.add(once);
        supportEnum.add(everyday);
        _BannerRedDot = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BannerRedDot(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BannerRedDot> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BannerRedDot> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BannerRedDot> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BannerRedDot> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BannerRedDot get(String str) {
        Map<String, BannerRedDot> map = _BannerRedDot;
        BannerRedDot bannerRedDot = map.get(str);
        if (bannerRedDot == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bannerRedDot = integer == null ? new BannerRedDot(str, -1) : new BannerRedDot(str, integer.intValue());
            map.put(str, bannerRedDot);
        }
        return bannerRedDot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BannerRedDot getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BannerRedDot> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BannerRedDot> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BannerRedDot get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
