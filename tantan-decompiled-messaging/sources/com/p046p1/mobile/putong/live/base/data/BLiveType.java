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
public class BLiveType extends TEnum {
    public static final TEnumJsonAdapter<BLiveType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveType> _BLiveType;
    public static final String app = "app";
    private static final int int_app = 2;
    private static final int int_live = 0;
    private static final int int_unknown_ = -1;
    private static final int int_voiceLive = 1;
    public static final String live = "live";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String voiceLive = "voiceLive";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveType$a */
    public class C12164a extends TEnumJsonAdapter<BLiveType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveType newTEnum(String str, int i) {
            return BLiveType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveType$b */
    public class C12165b extends TEnumProtobufAdapter<BLiveType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveType newTEnum(String str, int i) {
            return BLiveType.getForData(str, i);
        }
    }

    static {
        C12164a c12164a = new C12164a();
        JSON_ADAPTER = c12164a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12165b();
        c12164a.addExtJsonValue("unknown_", -1);
        c12164a.addExtJsonValue("live", 0);
        c12164a.addExtJsonValue(voiceLive, 1);
        c12164a.addExtJsonValue("app", 2);
        supportEnum.add("live");
        supportEnum.add(voiceLive);
        supportEnum.add("app");
        _BLiveType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveType get(String str) {
        Map<String, BLiveType> map = _BLiveType;
        BLiveType bLiveType = map.get(str);
        if (bLiveType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveType = integer == null ? new BLiveType(str, -1) : new BLiveType(str, integer.intValue());
            map.put(str, bLiveType);
        }
        return bLiveType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
