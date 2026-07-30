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
public class BLiveCoiceChatGroupApplyStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveCoiceChatGroupApplyStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveCoiceChatGroupApplyStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveCoiceChatGroupApplyStatus> _BLiveCoiceChatGroupApplyStatus;
    public static final String applying = "applying";
    public static final String approved = "approved";
    private static final int int_applying = 0;
    private static final int int_approved = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCoiceChatGroupApplyStatus$a */
    public class C11576a extends TEnumJsonAdapter<BLiveCoiceChatGroupApplyStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCoiceChatGroupApplyStatus newTEnum(String str, int i) {
            return BLiveCoiceChatGroupApplyStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCoiceChatGroupApplyStatus$b */
    public class C11577b extends TEnumProtobufAdapter<BLiveCoiceChatGroupApplyStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCoiceChatGroupApplyStatus newTEnum(String str, int i) {
            return BLiveCoiceChatGroupApplyStatus.getForData(str, i);
        }
    }

    static {
        C11576a c11576a = new C11576a();
        JSON_ADAPTER = c11576a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11577b();
        c11576a.addExtJsonValue("unknown_", -1);
        c11576a.addExtJsonValue(applying, 0);
        c11576a.addExtJsonValue("approved", 1);
        supportEnum.add(applying);
        supportEnum.add("approved");
        _BLiveCoiceChatGroupApplyStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveCoiceChatGroupApplyStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveCoiceChatGroupApplyStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveCoiceChatGroupApplyStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveCoiceChatGroupApplyStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveCoiceChatGroupApplyStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveCoiceChatGroupApplyStatus get(String str) {
        Map<String, BLiveCoiceChatGroupApplyStatus> map = _BLiveCoiceChatGroupApplyStatus;
        BLiveCoiceChatGroupApplyStatus bLiveCoiceChatGroupApplyStatus = map.get(str);
        if (bLiveCoiceChatGroupApplyStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveCoiceChatGroupApplyStatus = integer == null ? new BLiveCoiceChatGroupApplyStatus(str, -1) : new BLiveCoiceChatGroupApplyStatus(str, integer.intValue());
            map.put(str, bLiveCoiceChatGroupApplyStatus);
        }
        return bLiveCoiceChatGroupApplyStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveCoiceChatGroupApplyStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveCoiceChatGroupApplyStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveCoiceChatGroupApplyStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveCoiceChatGroupApplyStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
