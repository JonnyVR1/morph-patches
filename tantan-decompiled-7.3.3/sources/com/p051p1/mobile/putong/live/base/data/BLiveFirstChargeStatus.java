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
public class BLiveFirstChargeStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveFirstChargeStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveFirstChargeStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveFirstChargeStatus> _BLiveFirstChargeStatus;
    public static final String completed = "completed";
    private static final int int_completed = 2;
    private static final int int_pending = 0;
    private static final int int_success = 1;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    public static final String success = "success";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveFirstChargeStatus$a */
    public class C11817a extends TEnumJsonAdapter<BLiveFirstChargeStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveFirstChargeStatus newTEnum(String str, int i) {
            return BLiveFirstChargeStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveFirstChargeStatus$b */
    public class C11818b extends TEnumProtobufAdapter<BLiveFirstChargeStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveFirstChargeStatus newTEnum(String str, int i) {
            return BLiveFirstChargeStatus.getForData(str, i);
        }
    }

    static {
        C11817a c11817a = new C11817a();
        JSON_ADAPTER = c11817a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11818b();
        c11817a.addExtJsonValue("unknown_", -1);
        c11817a.addExtJsonValue("pending", 0);
        c11817a.addExtJsonValue("success", 1);
        c11817a.addExtJsonValue("completed", 2);
        supportEnum.add("pending");
        supportEnum.add("success");
        supportEnum.add("completed");
        _BLiveFirstChargeStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveFirstChargeStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveFirstChargeStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveFirstChargeStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveFirstChargeStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveFirstChargeStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveFirstChargeStatus get(String str) {
        Map<String, BLiveFirstChargeStatus> map = _BLiveFirstChargeStatus;
        BLiveFirstChargeStatus bLiveFirstChargeStatus = map.get(str);
        if (bLiveFirstChargeStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveFirstChargeStatus = integer == null ? new BLiveFirstChargeStatus(str, -1) : new BLiveFirstChargeStatus(str, integer.intValue());
            map.put(str, bLiveFirstChargeStatus);
        }
        return bLiveFirstChargeStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveFirstChargeStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveFirstChargeStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveFirstChargeStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveFirstChargeStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
