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
public class BLiveOperationIconType extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationIconType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationIconType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationIconType> _BLiveOperationIconType;
    public static final String countdown = "countdown";
    private static final int int_countdown = 1;
    private static final int int_none = 0;
    private static final int int_unknown_ = -1;
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationIconType$a */
    public class C12069a extends TEnumJsonAdapter<BLiveOperationIconType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationIconType newTEnum(String str, int i) {
            return BLiveOperationIconType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationIconType$b */
    public class C12070b extends TEnumProtobufAdapter<BLiveOperationIconType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationIconType newTEnum(String str, int i) {
            return BLiveOperationIconType.getForData(str, i);
        }
    }

    static {
        C12069a c12069a = new C12069a();
        JSON_ADAPTER = c12069a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12070b();
        c12069a.addExtJsonValue("unknown_", -1);
        c12069a.addExtJsonValue("none", 0);
        c12069a.addExtJsonValue("countdown", 1);
        supportEnum.add("none");
        supportEnum.add("countdown");
        _BLiveOperationIconType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveOperationIconType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationIconType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationIconType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationIconType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveOperationIconType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveOperationIconType get(String str) {
        Map<String, BLiveOperationIconType> map = _BLiveOperationIconType;
        BLiveOperationIconType bLiveOperationIconType = map.get(str);
        if (bLiveOperationIconType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationIconType = integer == null ? new BLiveOperationIconType(str, -1) : new BLiveOperationIconType(str, integer.intValue());
            map.put(str, bLiveOperationIconType);
        }
        return bLiveOperationIconType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationIconType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationIconType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationIconType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationIconType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
