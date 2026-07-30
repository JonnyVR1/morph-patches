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
public class BLiveVoiceRankingType extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceRankingType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceRankingType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceRankingType> _BLiveVoiceRankingType;
    public static final String currentHour = "currentHour";
    private static final int int_unknown_ = -1;
    public static final String lastHour = "lastHour";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceRankingType$a */
    public class C12523a extends TEnumJsonAdapter<BLiveVoiceRankingType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceRankingType newTEnum(String str, int i) {
            return BLiveVoiceRankingType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceRankingType$b */
    public class C12524b extends TEnumProtobufAdapter<BLiveVoiceRankingType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceRankingType newTEnum(String str, int i) {
            return BLiveVoiceRankingType.getForData(str, i);
        }
    }

    static {
        C12523a c12523a = new C12523a();
        JSON_ADAPTER = c12523a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12524b();
        c12523a.addExtJsonValue("unknown_", -1);
        supportEnum.add(currentHour);
        supportEnum.add(lastHour);
        _BLiveVoiceRankingType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVoiceRankingType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceRankingType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceRankingType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceRankingType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVoiceRankingType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVoiceRankingType get(String str) {
        Map<String, BLiveVoiceRankingType> map = _BLiveVoiceRankingType;
        BLiveVoiceRankingType bLiveVoiceRankingType = map.get(str);
        if (bLiveVoiceRankingType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceRankingType = integer == null ? new BLiveVoiceRankingType(str, -1) : new BLiveVoiceRankingType(str, integer.intValue());
            map.put(str, bLiveVoiceRankingType);
        }
        return bLiveVoiceRankingType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceRankingType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceRankingType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceRankingType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceRankingType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
