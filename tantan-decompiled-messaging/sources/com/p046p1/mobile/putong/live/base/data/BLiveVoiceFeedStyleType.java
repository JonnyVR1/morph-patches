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
public class BLiveVoiceFeedStyleType extends TEnum {
    public static final String BigCard = "BigCard";
    public static final TEnumJsonAdapter<BLiveVoiceFeedStyleType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceFeedStyleType> PROTOBUF_ADAPTER;
    public static final String SmallCard = "SmallCard";
    private static final Map<String, BLiveVoiceFeedStyleType> _BLiveVoiceFeedStyleType;
    private static final int int_BigCard = 0;
    private static final int int_SmallCard = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceFeedStyleType$a */
    public class C12288a extends TEnumJsonAdapter<BLiveVoiceFeedStyleType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceFeedStyleType newTEnum(String str, int i) {
            return BLiveVoiceFeedStyleType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceFeedStyleType$b */
    public class C12289b extends TEnumProtobufAdapter<BLiveVoiceFeedStyleType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceFeedStyleType newTEnum(String str, int i) {
            return BLiveVoiceFeedStyleType.getForData(str, i);
        }
    }

    static {
        C12288a c12288a = new C12288a();
        JSON_ADAPTER = c12288a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12289b();
        c12288a.addExtJsonValue("unknown_", -1);
        c12288a.addExtJsonValue(BigCard, 0);
        c12288a.addExtJsonValue(SmallCard, 1);
        supportEnum.add(BigCard);
        supportEnum.add(SmallCard);
        _BLiveVoiceFeedStyleType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveVoiceFeedStyleType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceFeedStyleType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceFeedStyleType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceFeedStyleType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveVoiceFeedStyleType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveVoiceFeedStyleType get(String str) {
        Map<String, BLiveVoiceFeedStyleType> map = _BLiveVoiceFeedStyleType;
        BLiveVoiceFeedStyleType bLiveVoiceFeedStyleType = map.get(str);
        if (bLiveVoiceFeedStyleType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceFeedStyleType = integer == null ? new BLiveVoiceFeedStyleType(str, -1) : new BLiveVoiceFeedStyleType(str, integer.intValue());
            map.put(str, bLiveVoiceFeedStyleType);
        }
        return bLiveVoiceFeedStyleType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceFeedStyleType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceFeedStyleType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceFeedStyleType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceFeedStyleType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
