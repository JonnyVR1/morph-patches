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
public class BLiveStormDanmakuGiftResourceType extends TEnum {
    public static final TEnumJsonAdapter<BLiveStormDanmakuGiftResourceType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveStormDanmakuGiftResourceType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveStormDanmakuGiftResourceType> _BLiveStormDanmakuGiftResourceType;
    private static final int int_l = 2;
    private static final int int_m = 1;
    private static final int int_s = 0;
    private static final int int_unknown_ = -1;

    /* JADX INFO: renamed from: l */
    public static final String f45292l = "l";

    /* JADX INFO: renamed from: m */
    public static final String f45293m = "m";

    /* JADX INFO: renamed from: s */
    public static final String f45294s = "s";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType$a */
    public class C12269a extends TEnumJsonAdapter<BLiveStormDanmakuGiftResourceType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveStormDanmakuGiftResourceType newTEnum(String str, int i) {
            return BLiveStormDanmakuGiftResourceType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType$b */
    public class C12270b extends TEnumProtobufAdapter<BLiveStormDanmakuGiftResourceType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveStormDanmakuGiftResourceType newTEnum(String str, int i) {
            return BLiveStormDanmakuGiftResourceType.getForData(str, i);
        }
    }

    static {
        C12269a c12269a = new C12269a();
        JSON_ADAPTER = c12269a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12270b();
        c12269a.addExtJsonValue("unknown_", -1);
        c12269a.addExtJsonValue(f45294s, 0);
        c12269a.addExtJsonValue("m", 1);
        c12269a.addExtJsonValue(f45292l, 2);
        supportEnum.add(f45294s);
        supportEnum.add("m");
        supportEnum.add(f45292l);
        _BLiveStormDanmakuGiftResourceType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveStormDanmakuGiftResourceType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveStormDanmakuGiftResourceType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveStormDanmakuGiftResourceType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveStormDanmakuGiftResourceType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveStormDanmakuGiftResourceType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveStormDanmakuGiftResourceType get(String str) {
        Map<String, BLiveStormDanmakuGiftResourceType> map = _BLiveStormDanmakuGiftResourceType;
        BLiveStormDanmakuGiftResourceType bLiveStormDanmakuGiftResourceType = map.get(str);
        if (bLiveStormDanmakuGiftResourceType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveStormDanmakuGiftResourceType = integer == null ? new BLiveStormDanmakuGiftResourceType(str, -1) : new BLiveStormDanmakuGiftResourceType(str, integer.intValue());
            map.put(str, bLiveStormDanmakuGiftResourceType);
        }
        return bLiveStormDanmakuGiftResourceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveStormDanmakuGiftResourceType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveStormDanmakuGiftResourceType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveStormDanmakuGiftResourceType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveStormDanmakuGiftResourceType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
