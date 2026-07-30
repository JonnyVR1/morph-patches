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
public class BLiveShootGameStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveShootGameStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveShootGameStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveShootGameStatus> _BLiveShootGameStatus;
    public static final String autoReceived = "autoReceived";
    public static final String completed = "completed";
    public static final String default_ = "default";
    private static final int int_autoReceived = 3;
    private static final int int_completed = 0;
    private static final int int_default_ = 4;
    private static final int int_ongoing = 2;
    private static final int int_received = 1;
    private static final int int_unknown_ = -1;
    public static final String ongoing = "ongoing";
    public static final String received = "received";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveShootGameStatus$a */
    public class C12065a extends TEnumJsonAdapter<BLiveShootGameStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveShootGameStatus newTEnum(String str, int i) {
            return BLiveShootGameStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveShootGameStatus$b */
    public class C12066b extends TEnumProtobufAdapter<BLiveShootGameStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveShootGameStatus newTEnum(String str, int i) {
            return BLiveShootGameStatus.getForData(str, i);
        }
    }

    static {
        C12065a c12065a = new C12065a();
        JSON_ADAPTER = c12065a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12066b();
        c12065a.addExtJsonValue("unknown_", -1);
        c12065a.addExtJsonValue("completed", 0);
        c12065a.addExtJsonValue("received", 1);
        c12065a.addExtJsonValue("ongoing", 2);
        c12065a.addExtJsonValue(autoReceived, 3);
        c12065a.addExtJsonValue("default", 4);
        supportEnum.add("completed");
        supportEnum.add("received");
        supportEnum.add("ongoing");
        supportEnum.add(autoReceived);
        supportEnum.add("default");
        _BLiveShootGameStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveShootGameStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveShootGameStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveShootGameStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveShootGameStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveShootGameStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveShootGameStatus get(String str) {
        Map<String, BLiveShootGameStatus> map = _BLiveShootGameStatus;
        BLiveShootGameStatus bLiveShootGameStatus = map.get(str);
        if (bLiveShootGameStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveShootGameStatus = integer == null ? new BLiveShootGameStatus(str, -1) : new BLiveShootGameStatus(str, integer.intValue());
            map.put(str, bLiveShootGameStatus);
        }
        return bLiveShootGameStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveShootGameStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveShootGameStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveShootGameStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveShootGameStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
