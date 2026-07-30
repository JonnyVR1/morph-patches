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
public class BLiveRoomCoverStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveRoomCoverStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveRoomCoverStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveRoomCoverStatus> _BLiveRoomCoverStatus;
    public static final String default_ = "default";
    private static final int int_default_ = 1;
    private static final int int_pending = 0;
    private static final int int_rejected = 2;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRoomCoverStatus$a */
    public class C12030a extends TEnumJsonAdapter<BLiveRoomCoverStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRoomCoverStatus newTEnum(String str, int i) {
            return BLiveRoomCoverStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRoomCoverStatus$b */
    public class C12031b extends TEnumProtobufAdapter<BLiveRoomCoverStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRoomCoverStatus newTEnum(String str, int i) {
            return BLiveRoomCoverStatus.getForData(str, i);
        }
    }

    static {
        C12030a c12030a = new C12030a();
        JSON_ADAPTER = c12030a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12031b();
        c12030a.addExtJsonValue("unknown_", -1);
        c12030a.addExtJsonValue("pending", 0);
        c12030a.addExtJsonValue("default", 1);
        c12030a.addExtJsonValue("rejected", 2);
        supportEnum.add("pending");
        supportEnum.add("default");
        supportEnum.add("rejected");
        _BLiveRoomCoverStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveRoomCoverStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveRoomCoverStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveRoomCoverStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveRoomCoverStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveRoomCoverStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveRoomCoverStatus get(String str) {
        Map<String, BLiveRoomCoverStatus> map = _BLiveRoomCoverStatus;
        BLiveRoomCoverStatus bLiveRoomCoverStatus = map.get(str);
        if (bLiveRoomCoverStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveRoomCoverStatus = integer == null ? new BLiveRoomCoverStatus(str, -1) : new BLiveRoomCoverStatus(str, integer.intValue());
            map.put(str, bLiveRoomCoverStatus);
        }
        return bLiveRoomCoverStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveRoomCoverStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveRoomCoverStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveRoomCoverStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveRoomCoverStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
