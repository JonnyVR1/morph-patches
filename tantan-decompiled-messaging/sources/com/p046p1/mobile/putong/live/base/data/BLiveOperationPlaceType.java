package com.p046p1.mobile.putong.live.base.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOperationPlaceType extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationPlaceType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationPlaceType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationPlaceType> _BLiveOperationPlaceType;
    public static final String default_ = "default";
    private static final int int_default_ = 0;
    private static final int int_lotteryGiftRedPacket = 2;
    private static final int int_turboCard = 1;
    private static final int int_turboCoupon = 3;
    private static final int int_unknown_ = -1;
    public static final String lotteryGiftRedPacket = "lotteryGiftRedPacket";
    protected static HashSet<String> supportEnum = null;
    public static final String turboCard = "turboCard";
    public static final String turboCoupon = "turboCoupon";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationPlaceType$a */
    public class C11922a extends TEnumJsonAdapter<BLiveOperationPlaceType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationPlaceType newTEnum(String str, int i) {
            return BLiveOperationPlaceType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationPlaceType$b */
    public class C11923b extends TEnumProtobufAdapter<BLiveOperationPlaceType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationPlaceType newTEnum(String str, int i) {
            return BLiveOperationPlaceType.getForData(str, i);
        }
    }

    static {
        C11922a c11922a = new C11922a();
        JSON_ADAPTER = c11922a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11923b();
        c11922a.addExtJsonValue("unknown_", -1);
        c11922a.addExtJsonValue("default", 0);
        c11922a.addExtJsonValue(turboCard, 1);
        c11922a.addExtJsonValue(lotteryGiftRedPacket, 2);
        c11922a.addExtJsonValue(turboCoupon, 3);
        supportEnum.add("default");
        supportEnum.add(turboCard);
        supportEnum.add(lotteryGiftRedPacket);
        supportEnum.add(turboCoupon);
        _BLiveOperationPlaceType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveOperationPlaceType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationPlaceType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationPlaceType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationPlaceType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveOperationPlaceType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveOperationPlaceType get(String str) {
        Map<String, BLiveOperationPlaceType> map = _BLiveOperationPlaceType;
        BLiveOperationPlaceType bLiveOperationPlaceType = map.get(str);
        if (bLiveOperationPlaceType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationPlaceType = integer == null ? new BLiveOperationPlaceType(str, -1) : new BLiveOperationPlaceType(str, integer.intValue());
            map.put(str, bLiveOperationPlaceType);
        }
        return bLiveOperationPlaceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationPlaceType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationPlaceType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationPlaceType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationPlaceType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
