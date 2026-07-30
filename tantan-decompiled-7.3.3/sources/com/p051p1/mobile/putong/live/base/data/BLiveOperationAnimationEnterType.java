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
public class BLiveOperationAnimationEnterType extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationAnimationEnterType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationAnimationEnterType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationAnimationEnterType> _BLiveOperationAnimationEnterType;
    public static final String image = "image";
    private static final int int_image = 1;
    private static final int int_none = 0;
    private static final int int_unknown_ = -1;
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationAnimationEnterType$a */
    public class C12061a extends TEnumJsonAdapter<BLiveOperationAnimationEnterType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationAnimationEnterType newTEnum(String str, int i) {
            return BLiveOperationAnimationEnterType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationAnimationEnterType$b */
    public class C12062b extends TEnumProtobufAdapter<BLiveOperationAnimationEnterType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationAnimationEnterType newTEnum(String str, int i) {
            return BLiveOperationAnimationEnterType.getForData(str, i);
        }
    }

    static {
        C12061a c12061a = new C12061a();
        JSON_ADAPTER = c12061a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12062b();
        c12061a.addExtJsonValue("unknown_", -1);
        c12061a.addExtJsonValue("none", 0);
        c12061a.addExtJsonValue("image", 1);
        supportEnum.add("none");
        supportEnum.add("image");
        _BLiveOperationAnimationEnterType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveOperationAnimationEnterType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationAnimationEnterType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationAnimationEnterType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationAnimationEnterType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveOperationAnimationEnterType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveOperationAnimationEnterType get(String str) {
        Map<String, BLiveOperationAnimationEnterType> map = _BLiveOperationAnimationEnterType;
        BLiveOperationAnimationEnterType bLiveOperationAnimationEnterType = map.get(str);
        if (bLiveOperationAnimationEnterType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationAnimationEnterType = integer == null ? new BLiveOperationAnimationEnterType(str, -1) : new BLiveOperationAnimationEnterType(str, integer.intValue());
            map.put(str, bLiveOperationAnimationEnterType);
        }
        return bLiveOperationAnimationEnterType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationAnimationEnterType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationAnimationEnterType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationAnimationEnterType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationAnimationEnterType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
