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
public class BLiveOperationLoadingType extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationLoadingType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationLoadingType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationLoadingType> _BLiveOperationLoadingType;
    public static final String color = "color";
    public static final String gradient = "gradient";
    public static final String image = "image";
    private static final int int_color = 0;
    private static final int int_gradient = 1;
    private static final int int_image = 2;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationLoadingType$a */
    public class C12083a extends TEnumJsonAdapter<BLiveOperationLoadingType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationLoadingType newTEnum(String str, int i) {
            return BLiveOperationLoadingType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationLoadingType$b */
    public class C12084b extends TEnumProtobufAdapter<BLiveOperationLoadingType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationLoadingType newTEnum(String str, int i) {
            return BLiveOperationLoadingType.getForData(str, i);
        }
    }

    static {
        C12083a c12083a = new C12083a();
        JSON_ADAPTER = c12083a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12084b();
        c12083a.addExtJsonValue("unknown_", -1);
        c12083a.addExtJsonValue("color", 0);
        c12083a.addExtJsonValue(gradient, 1);
        c12083a.addExtJsonValue("image", 2);
        supportEnum.add("color");
        supportEnum.add(gradient);
        supportEnum.add("image");
        _BLiveOperationLoadingType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveOperationLoadingType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationLoadingType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationLoadingType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationLoadingType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveOperationLoadingType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveOperationLoadingType get(String str) {
        Map<String, BLiveOperationLoadingType> map = _BLiveOperationLoadingType;
        BLiveOperationLoadingType bLiveOperationLoadingType = map.get(str);
        if (bLiveOperationLoadingType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationLoadingType = integer == null ? new BLiveOperationLoadingType(str, -1) : new BLiveOperationLoadingType(str, integer.intValue());
            map.put(str, bLiveOperationLoadingType);
        }
        return bLiveOperationLoadingType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationLoadingType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationLoadingType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationLoadingType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationLoadingType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
