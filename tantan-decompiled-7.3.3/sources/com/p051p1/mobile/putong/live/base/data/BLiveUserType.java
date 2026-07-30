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
public class BLiveUserType extends TEnum {
    public static final TEnumJsonAdapter<BLiveUserType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveUserType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveUserType> _BLiveUserType;
    public static final String anchor = "anchor";
    public static final String audience = "audience";
    private static final int int_anchor = 0;
    private static final int int_audience = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUserType$a */
    public class C12372a extends TEnumJsonAdapter<BLiveUserType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveUserType newTEnum(String str, int i) {
            return BLiveUserType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUserType$b */
    public class C12373b extends TEnumProtobufAdapter<BLiveUserType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveUserType newTEnum(String str, int i) {
            return BLiveUserType.getForData(str, i);
        }
    }

    static {
        C12372a c12372a = new C12372a();
        JSON_ADAPTER = c12372a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12373b();
        c12372a.addExtJsonValue("unknown_", -1);
        c12372a.addExtJsonValue("anchor", 0);
        c12372a.addExtJsonValue("audience", 1);
        supportEnum.add("anchor");
        supportEnum.add("audience");
        _BLiveUserType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveUserType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveUserType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveUserType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveUserType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveUserType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveUserType get(String str) {
        Map<String, BLiveUserType> map = _BLiveUserType;
        BLiveUserType bLiveUserType = map.get(str);
        if (bLiveUserType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveUserType = integer == null ? new BLiveUserType(str, -1) : new BLiveUserType(str, integer.intValue());
            map.put(str, bLiveUserType);
        }
        return bLiveUserType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveUserType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveUserType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveUserType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveUserType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
