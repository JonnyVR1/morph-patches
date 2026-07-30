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
public class BLivePkInviteSource extends TEnum {
    public static final TEnumJsonAdapter<BLivePkInviteSource> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLivePkInviteSource> PROTOBUF_ADAPTER;
    private static final Map<String, BLivePkInviteSource> _BLivePkInviteSource;
    public static final String fans = "fans";
    public static final String hour = "hour";
    private static final int int_fans = 0;
    private static final int int_match = 1;
    private static final int int_nearby = 2;
    private static final int int_onceMore = 4;
    private static final int int_similar = 3;
    private static final int int_unknown_ = -1;
    public static final String match = "match";
    public static final String nearby = "nearby";
    public static final String onceMore = "onceMore";
    public static final String query = "query";
    public static final String similar = "similar";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkInviteSource$a */
    public class C12123a extends TEnumJsonAdapter<BLivePkInviteSource> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkInviteSource newTEnum(String str, int i) {
            return BLivePkInviteSource.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkInviteSource$b */
    public class C12124b extends TEnumProtobufAdapter<BLivePkInviteSource> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkInviteSource newTEnum(String str, int i) {
            return BLivePkInviteSource.getForData(str, i);
        }
    }

    static {
        C12123a c12123a = new C12123a();
        JSON_ADAPTER = c12123a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12124b();
        c12123a.addExtJsonValue("unknown_", -1);
        c12123a.addExtJsonValue("fans", 0);
        c12123a.addExtJsonValue("match", 1);
        c12123a.addExtJsonValue("nearby", 2);
        c12123a.addExtJsonValue(similar, 3);
        c12123a.addExtJsonValue(onceMore, 4);
        supportEnum.add("fans");
        supportEnum.add("match");
        supportEnum.add("nearby");
        supportEnum.add(similar);
        supportEnum.add(onceMore);
        supportEnum.add("hour");
        supportEnum.add(query);
        _BLivePkInviteSource = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLivePkInviteSource(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLivePkInviteSource> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLivePkInviteSource> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLivePkInviteSource> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLivePkInviteSource> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLivePkInviteSource get(String str) {
        Map<String, BLivePkInviteSource> map = _BLivePkInviteSource;
        BLivePkInviteSource bLivePkInviteSource = map.get(str);
        if (bLivePkInviteSource == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLivePkInviteSource = integer == null ? new BLivePkInviteSource(str, -1) : new BLivePkInviteSource(str, integer.intValue());
            map.put(str, bLivePkInviteSource);
        }
        return bLivePkInviteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLivePkInviteSource getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLivePkInviteSource> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLivePkInviteSource> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLivePkInviteSource get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
