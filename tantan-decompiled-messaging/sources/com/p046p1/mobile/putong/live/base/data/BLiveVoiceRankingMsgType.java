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
public class BLiveVoiceRankingMsgType extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceRankingMsgType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceRankingMsgType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceRankingMsgType> _BLiveVoiceRankingMsgType;
    private static final int int_unknown_ = -1;
    public static final String normal = "normal";
    public static final String progress = "progress";
    public static final String sprint = "sprint";
    public static final String start = "start";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceRankingMsgType$a */
    public class C12358a extends TEnumJsonAdapter<BLiveVoiceRankingMsgType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceRankingMsgType newTEnum(String str, int i) {
            return BLiveVoiceRankingMsgType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceRankingMsgType$b */
    public class C12359b extends TEnumProtobufAdapter<BLiveVoiceRankingMsgType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceRankingMsgType newTEnum(String str, int i) {
            return BLiveVoiceRankingMsgType.getForData(str, i);
        }
    }

    static {
        C12358a c12358a = new C12358a();
        JSON_ADAPTER = c12358a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12359b();
        c12358a.addExtJsonValue("unknown_", -1);
        supportEnum.add("normal");
        supportEnum.add("start");
        supportEnum.add("progress");
        supportEnum.add("sprint");
        _BLiveVoiceRankingMsgType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveVoiceRankingMsgType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceRankingMsgType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceRankingMsgType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceRankingMsgType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveVoiceRankingMsgType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveVoiceRankingMsgType get(String str) {
        Map<String, BLiveVoiceRankingMsgType> map = _BLiveVoiceRankingMsgType;
        BLiveVoiceRankingMsgType bLiveVoiceRankingMsgType = map.get(str);
        if (bLiveVoiceRankingMsgType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceRankingMsgType = integer == null ? new BLiveVoiceRankingMsgType(str, -1) : new BLiveVoiceRankingMsgType(str, integer.intValue());
            map.put(str, bLiveVoiceRankingMsgType);
        }
        return bLiveVoiceRankingMsgType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceRankingMsgType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceRankingMsgType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceRankingMsgType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceRankingMsgType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
