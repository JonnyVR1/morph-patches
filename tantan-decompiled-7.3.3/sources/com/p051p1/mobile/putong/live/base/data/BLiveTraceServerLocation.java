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
public class BLiveTraceServerLocation extends TEnum {
    public static final TEnumJsonAdapter<BLiveTraceServerLocation> JSON_ADAPTER;

    /* JADX INFO: renamed from: PK */
    public static final String f45309PK = "PK";
    public static final TEnumProtobufAdapter<BLiveTraceServerLocation> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveTraceServerLocation> _BLiveTraceServerLocation;
    public static final String card = "card";
    public static final String common = "common";
    public static final String drawer = "drawer";
    public static final String giftWall = "giftWall";
    public static final String giftbar = "giftbar";
    public static final String giftguide = "giftguide";
    private static final int int_PK = 7;
    private static final int int_card = 4;
    private static final int int_common = 0;
    private static final int int_drawer = 6;
    private static final int int_giftbar = 1;
    private static final int int_giftguide = 3;
    private static final int int_main = 5;
    private static final int int_quickgift = 2;
    private static final int int_sweetCp = 8;
    private static final int int_unknown_ = -1;
    public static final String ktvQuickGift = "ktvQuickGift";
    public static final String main = "main";
    public static final String quickgift = "quickgift";
    protected static HashSet<String> supportEnum = null;
    public static final String sweetCp = "sweetCp";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation$a */
    public class C12317a extends TEnumJsonAdapter<BLiveTraceServerLocation> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTraceServerLocation newTEnum(String str, int i) {
            return BLiveTraceServerLocation.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation$b */
    public class C12318b extends TEnumProtobufAdapter<BLiveTraceServerLocation> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTraceServerLocation newTEnum(String str, int i) {
            return BLiveTraceServerLocation.getForData(str, i);
        }
    }

    static {
        C12317a c12317a = new C12317a();
        JSON_ADAPTER = c12317a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12318b();
        c12317a.addExtJsonValue("unknown_", -1);
        c12317a.addExtJsonValue("common", 0);
        c12317a.addExtJsonValue(giftbar, 1);
        c12317a.addExtJsonValue(quickgift, 2);
        c12317a.addExtJsonValue(giftguide, 3);
        c12317a.addExtJsonValue("card", 4);
        c12317a.addExtJsonValue(main, 5);
        c12317a.addExtJsonValue(drawer, 6);
        c12317a.addExtJsonValue(f45309PK, 7);
        c12317a.addExtJsonValue("sweetCp", 8);
        supportEnum.add("common");
        supportEnum.add(giftbar);
        supportEnum.add(quickgift);
        supportEnum.add(giftguide);
        supportEnum.add("card");
        supportEnum.add(main);
        supportEnum.add(drawer);
        supportEnum.add(f45309PK);
        supportEnum.add("sweetCp");
        supportEnum.add("giftWall");
        supportEnum.add(ktvQuickGift);
        _BLiveTraceServerLocation = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveTraceServerLocation(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveTraceServerLocation> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveTraceServerLocation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveTraceServerLocation> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveTraceServerLocation> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveTraceServerLocation get(String str) {
        Map<String, BLiveTraceServerLocation> map = _BLiveTraceServerLocation;
        BLiveTraceServerLocation bLiveTraceServerLocation = map.get(str);
        if (bLiveTraceServerLocation == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveTraceServerLocation = integer == null ? new BLiveTraceServerLocation(str, -1) : new BLiveTraceServerLocation(str, integer.intValue());
            map.put(str, bLiveTraceServerLocation);
        }
        return bLiveTraceServerLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveTraceServerLocation getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveTraceServerLocation> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveTraceServerLocation> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveTraceServerLocation get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
