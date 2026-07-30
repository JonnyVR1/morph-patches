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
public class BLiveProductType extends TEnum {
    public static final TEnumJsonAdapter<BLiveProductType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveProductType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveProductType> _BLiveProductType;
    public static final String auto_renewable = "auto-renewable";
    public static final String consumable = "consumable";
    private static final int int_auto_renewable = 1;
    private static final int int_consumable = 0;
    private static final int int_none_renewing = 2;
    private static final int int_unknown_ = -1;
    public static final String none_renewing = "none-renewing";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveProductType$a */
    public class C11991a extends TEnumJsonAdapter<BLiveProductType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveProductType newTEnum(String str, int i) {
            return BLiveProductType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveProductType$b */
    public class C11992b extends TEnumProtobufAdapter<BLiveProductType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveProductType newTEnum(String str, int i) {
            return BLiveProductType.getForData(str, i);
        }
    }

    static {
        C11991a c11991a = new C11991a();
        JSON_ADAPTER = c11991a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11992b();
        c11991a.addExtJsonValue("unknown_", -1);
        c11991a.addExtJsonValue("consumable", 0);
        c11991a.addExtJsonValue("auto-renewable", 1);
        c11991a.addExtJsonValue("none-renewing", 2);
        supportEnum.add("consumable");
        supportEnum.add("auto-renewable");
        supportEnum.add("none-renewing");
        _BLiveProductType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveProductType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveProductType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveProductType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveProductType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveProductType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveProductType get(String str) {
        Map<String, BLiveProductType> map = _BLiveProductType;
        BLiveProductType bLiveProductType = map.get(str);
        if (bLiveProductType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveProductType = integer == null ? new BLiveProductType(str, -1) : new BLiveProductType(str, integer.intValue());
            map.put(str, bLiveProductType);
        }
        return bLiveProductType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveProductType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveProductType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveProductType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveProductType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
