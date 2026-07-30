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
public class BLiveState extends TEnum {
    public static final TEnumJsonAdapter<BLiveState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveState> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveState> _BLiveState;
    public static final String born = "born";
    private static final int int_born = 3;
    private static final int int_onlive = 0;
    private static final int int_stopped = 2;
    private static final int int_suspended = 1;
    private static final int int_unknown_ = -1;
    public static final String onlive = "onlive";
    public static final String preparing = "preparing";
    public static final String stopped = "stopped";
    protected static HashSet<String> supportEnum = null;
    public static final String suspended = "suspended";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveState$a */
    public class C12096a extends TEnumJsonAdapter<BLiveState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveState newTEnum(String str, int i) {
            return BLiveState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveState$b */
    public class C12097b extends TEnumProtobufAdapter<BLiveState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveState newTEnum(String str, int i) {
            return BLiveState.getForData(str, i);
        }
    }

    static {
        C12096a c12096a = new C12096a();
        JSON_ADAPTER = c12096a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12097b();
        c12096a.addExtJsonValue("unknown_", -1);
        c12096a.addExtJsonValue("onlive", 0);
        c12096a.addExtJsonValue("suspended", 1);
        c12096a.addExtJsonValue("stopped", 2);
        c12096a.addExtJsonValue("born", 3);
        supportEnum.add("onlive");
        supportEnum.add("suspended");
        supportEnum.add("stopped");
        supportEnum.add("born");
        supportEnum.add("preparing");
        _BLiveState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveState get(String str) {
        Map<String, BLiveState> map = _BLiveState;
        BLiveState bLiveState = map.get(str);
        if (bLiveState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveState = integer == null ? new BLiveState(str, -1) : new BLiveState(str, integer.intValue());
            map.put(str, bLiveState);
        }
        return bLiveState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
