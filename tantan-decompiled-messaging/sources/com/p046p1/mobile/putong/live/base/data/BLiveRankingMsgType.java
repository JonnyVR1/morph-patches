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
public class BLiveRankingMsgType extends TEnum {
    public static final TEnumJsonAdapter<BLiveRankingMsgType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveRankingMsgType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveRankingMsgType> _BLiveRankingMsgType;
    private static final int int_normal = 0;
    private static final int int_progress = 2;
    private static final int int_sprint = 3;
    private static final int int_start = 1;
    private static final int int_unknown_ = -1;
    public static final String normal = "normal";
    public static final String progress = "progress";
    public static final String sprint = "sprint";
    public static final String start = "start";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRankingMsgType$a */
    public class C12005a extends TEnumJsonAdapter<BLiveRankingMsgType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRankingMsgType newTEnum(String str, int i) {
            return BLiveRankingMsgType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRankingMsgType$b */
    public class C12006b extends TEnumProtobufAdapter<BLiveRankingMsgType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRankingMsgType newTEnum(String str, int i) {
            return BLiveRankingMsgType.getForData(str, i);
        }
    }

    static {
        C12005a c12005a = new C12005a();
        JSON_ADAPTER = c12005a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12006b();
        c12005a.addExtJsonValue("unknown_", -1);
        c12005a.addExtJsonValue("normal", 0);
        c12005a.addExtJsonValue("start", 1);
        c12005a.addExtJsonValue("progress", 2);
        c12005a.addExtJsonValue("sprint", 3);
        supportEnum.add("normal");
        supportEnum.add("start");
        supportEnum.add("progress");
        supportEnum.add("sprint");
        _BLiveRankingMsgType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveRankingMsgType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveRankingMsgType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveRankingMsgType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveRankingMsgType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveRankingMsgType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveRankingMsgType get(String str) {
        Map<String, BLiveRankingMsgType> map = _BLiveRankingMsgType;
        BLiveRankingMsgType bLiveRankingMsgType = map.get(str);
        if (bLiveRankingMsgType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveRankingMsgType = integer == null ? new BLiveRankingMsgType(str, -1) : new BLiveRankingMsgType(str, integer.intValue());
            map.put(str, bLiveRankingMsgType);
        }
        return bLiveRankingMsgType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveRankingMsgType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveRankingMsgType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveRankingMsgType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveRankingMsgType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
