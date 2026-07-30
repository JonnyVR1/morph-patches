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
public class BLiveRecommendJumpType extends TEnum {
    public static final TEnumJsonAdapter<BLiveRecommendJumpType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveRecommendJumpType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveRecommendJumpType> _BLiveRecommendJumpType;
    private static final int int_nearby = 1;
    private static final int int_room = 0;
    private static final int int_unknown_ = -1;
    public static final String nearby = "nearby";
    public static final String room = "room";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRecommendJumpType$a */
    public class C12172a extends TEnumJsonAdapter<BLiveRecommendJumpType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRecommendJumpType newTEnum(String str, int i) {
            return BLiveRecommendJumpType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRecommendJumpType$b */
    public class C12173b extends TEnumProtobufAdapter<BLiveRecommendJumpType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRecommendJumpType newTEnum(String str, int i) {
            return BLiveRecommendJumpType.getForData(str, i);
        }
    }

    static {
        C12172a c12172a = new C12172a();
        JSON_ADAPTER = c12172a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12173b();
        c12172a.addExtJsonValue("unknown_", -1);
        c12172a.addExtJsonValue("room", 0);
        c12172a.addExtJsonValue("nearby", 1);
        supportEnum.add("room");
        supportEnum.add("nearby");
        _BLiveRecommendJumpType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveRecommendJumpType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveRecommendJumpType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveRecommendJumpType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveRecommendJumpType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveRecommendJumpType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveRecommendJumpType get(String str) {
        Map<String, BLiveRecommendJumpType> map = _BLiveRecommendJumpType;
        BLiveRecommendJumpType bLiveRecommendJumpType = map.get(str);
        if (bLiveRecommendJumpType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveRecommendJumpType = integer == null ? new BLiveRecommendJumpType(str, -1) : new BLiveRecommendJumpType(str, integer.intValue());
            map.put(str, bLiveRecommendJumpType);
        }
        return bLiveRecommendJumpType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveRecommendJumpType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveRecommendJumpType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveRecommendJumpType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveRecommendJumpType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
