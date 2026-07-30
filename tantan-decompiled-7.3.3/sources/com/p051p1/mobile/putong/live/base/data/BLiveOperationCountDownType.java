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
public class BLiveOperationCountDownType extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationCountDownType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationCountDownType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationCountDownType> _BLiveOperationCountDownType;
    public static final String brightToDark = "brightToDark";
    public static final String darkToBright = "darkToBright";
    private static final int int_brightToDark = 0;
    private static final int int_darkToBright = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationCountDownType$a */
    public class C12065a extends TEnumJsonAdapter<BLiveOperationCountDownType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationCountDownType newTEnum(String str, int i) {
            return BLiveOperationCountDownType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationCountDownType$b */
    public class C12066b extends TEnumProtobufAdapter<BLiveOperationCountDownType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationCountDownType newTEnum(String str, int i) {
            return BLiveOperationCountDownType.getForData(str, i);
        }
    }

    static {
        C12065a c12065a = new C12065a();
        JSON_ADAPTER = c12065a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12066b();
        c12065a.addExtJsonValue("unknown_", -1);
        c12065a.addExtJsonValue("brightToDark", 0);
        c12065a.addExtJsonValue("darkToBright", 1);
        supportEnum.add("brightToDark");
        supportEnum.add("darkToBright");
        _BLiveOperationCountDownType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveOperationCountDownType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationCountDownType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationCountDownType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationCountDownType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveOperationCountDownType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveOperationCountDownType get(String str) {
        Map<String, BLiveOperationCountDownType> map = _BLiveOperationCountDownType;
        BLiveOperationCountDownType bLiveOperationCountDownType = map.get(str);
        if (bLiveOperationCountDownType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationCountDownType = integer == null ? new BLiveOperationCountDownType(str, -1) : new BLiveOperationCountDownType(str, integer.intValue());
            map.put(str, bLiveOperationCountDownType);
        }
        return bLiveOperationCountDownType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationCountDownType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationCountDownType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationCountDownType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationCountDownType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
