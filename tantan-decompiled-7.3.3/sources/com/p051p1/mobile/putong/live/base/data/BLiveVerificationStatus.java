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
public class BLiveVerificationStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveVerificationStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVerificationStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVerificationStatus> _BLiveVerificationStatus;
    private static final int int_pending = 1;
    private static final int int_rejected = 2;
    private static final int int_unknown_ = -1;
    private static final int int_verified = 0;
    public static final String pending = "pending";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String verified = "verified";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVerificationStatus$a */
    public class C12378a extends TEnumJsonAdapter<BLiveVerificationStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVerificationStatus newTEnum(String str, int i) {
            return BLiveVerificationStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVerificationStatus$b */
    public class C12379b extends TEnumProtobufAdapter<BLiveVerificationStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVerificationStatus newTEnum(String str, int i) {
            return BLiveVerificationStatus.getForData(str, i);
        }
    }

    static {
        C12378a c12378a = new C12378a();
        JSON_ADAPTER = c12378a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12379b();
        c12378a.addExtJsonValue("unknown_", -1);
        c12378a.addExtJsonValue("verified", 0);
        c12378a.addExtJsonValue("pending", 1);
        c12378a.addExtJsonValue("rejected", 2);
        supportEnum.add("verified");
        supportEnum.add("pending");
        supportEnum.add("rejected");
        _BLiveVerificationStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVerificationStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVerificationStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVerificationStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVerificationStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVerificationStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVerificationStatus get(String str) {
        Map<String, BLiveVerificationStatus> map = _BLiveVerificationStatus;
        BLiveVerificationStatus bLiveVerificationStatus = map.get(str);
        if (bLiveVerificationStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVerificationStatus = integer == null ? new BLiveVerificationStatus(str, -1) : new BLiveVerificationStatus(str, integer.intValue());
            map.put(str, bLiveVerificationStatus);
        }
        return bLiveVerificationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVerificationStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVerificationStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVerificationStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVerificationStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
