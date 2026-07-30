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
public class BLiveTraceServerType extends TEnum {

    /* JADX INFO: renamed from: H5 */
    public static final String f44462H5 = "H5";
    public static final TEnumJsonAdapter<BLiveTraceServerType> JSON_ADAPTER;
    public static final String Native = "Native";
    public static final TEnumProtobufAdapter<BLiveTraceServerType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveTraceServerType> _BLiveTraceServerType;
    public static final String flowerLeaderboard = "flowerLeaderboard";
    private static final int int_H5 = 1;
    private static final int int_Native = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTraceServerType$a */
    public class C12156a extends TEnumJsonAdapter<BLiveTraceServerType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTraceServerType newTEnum(String str, int i) {
            return BLiveTraceServerType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTraceServerType$b */
    public class C12157b extends TEnumProtobufAdapter<BLiveTraceServerType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTraceServerType newTEnum(String str, int i) {
            return BLiveTraceServerType.getForData(str, i);
        }
    }

    static {
        C12156a c12156a = new C12156a();
        JSON_ADAPTER = c12156a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12157b();
        c12156a.addExtJsonValue("unknown_", -1);
        c12156a.addExtJsonValue(Native, 0);
        c12156a.addExtJsonValue("H5", 1);
        supportEnum.add(Native);
        supportEnum.add("H5");
        supportEnum.add(flowerLeaderboard);
        _BLiveTraceServerType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveTraceServerType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveTraceServerType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveTraceServerType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveTraceServerType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveTraceServerType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveTraceServerType get(String str) {
        Map<String, BLiveTraceServerType> map = _BLiveTraceServerType;
        BLiveTraceServerType bLiveTraceServerType = map.get(str);
        if (bLiveTraceServerType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveTraceServerType = integer == null ? new BLiveTraceServerType(str, -1) : new BLiveTraceServerType(str, integer.intValue());
            map.put(str, bLiveTraceServerType);
        }
        return bLiveTraceServerType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveTraceServerType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveTraceServerType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveTraceServerType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveTraceServerType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
