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
public class BLiveVoiceSingTogehterState extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceSingTogehterState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceSingTogehterState> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceSingTogehterState> _BLiveVoiceSingTogehterState;
    public static final String confirm = "confirm";
    public static final String end = "end";
    private static final int int_unknown_ = -1;
    public static final String pause = "pause";
    public static final String singing = "singing";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String waiting = "waiting";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState$a */
    public class C12544a extends TEnumJsonAdapter<BLiveVoiceSingTogehterState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceSingTogehterState newTEnum(String str, int i) {
            return BLiveVoiceSingTogehterState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState$b */
    public class C12545b extends TEnumProtobufAdapter<BLiveVoiceSingTogehterState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceSingTogehterState newTEnum(String str, int i) {
            return BLiveVoiceSingTogehterState.getForData(str, i);
        }
    }

    static {
        C12544a c12544a = new C12544a();
        JSON_ADAPTER = c12544a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12545b();
        c12544a.addExtJsonValue("unknown_", -1);
        supportEnum.add("waiting");
        supportEnum.add(singing);
        supportEnum.add("pause");
        supportEnum.add(confirm);
        supportEnum.add("end");
        _BLiveVoiceSingTogehterState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVoiceSingTogehterState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceSingTogehterState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceSingTogehterState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceSingTogehterState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVoiceSingTogehterState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVoiceSingTogehterState get(String str) {
        Map<String, BLiveVoiceSingTogehterState> map = _BLiveVoiceSingTogehterState;
        BLiveVoiceSingTogehterState bLiveVoiceSingTogehterState = map.get(str);
        if (bLiveVoiceSingTogehterState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceSingTogehterState = integer == null ? new BLiveVoiceSingTogehterState(str, -1) : new BLiveVoiceSingTogehterState(str, integer.intValue());
            map.put(str, bLiveVoiceSingTogehterState);
        }
        return bLiveVoiceSingTogehterState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceSingTogehterState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceSingTogehterState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceSingTogehterState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceSingTogehterState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
