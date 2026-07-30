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
public class BLiveVoiceLiveAuctionApplyState extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceLiveAuctionApplyState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceLiveAuctionApplyState> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceLiveAuctionApplyState> _BLiveVoiceLiveAuctionApplyState;
    public static final String accept = "accept";
    public static final String accepted = "accepted";
    public static final String applied = "applied";
    public static final String apply = "apply";
    private static final int int_unknown_ = -1;
    public static final String reject = "reject";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceLiveAuctionApplyState$a */
    public class C12486a extends TEnumJsonAdapter<BLiveVoiceLiveAuctionApplyState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceLiveAuctionApplyState newTEnum(String str, int i) {
            return BLiveVoiceLiveAuctionApplyState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceLiveAuctionApplyState$b */
    public class C12487b extends TEnumProtobufAdapter<BLiveVoiceLiveAuctionApplyState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceLiveAuctionApplyState newTEnum(String str, int i) {
            return BLiveVoiceLiveAuctionApplyState.getForData(str, i);
        }
    }

    static {
        C12486a c12486a = new C12486a();
        JSON_ADAPTER = c12486a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12487b();
        c12486a.addExtJsonValue("unknown_", -1);
        supportEnum.add("apply");
        supportEnum.add("reject");
        supportEnum.add("accept");
        supportEnum.add("applied");
        supportEnum.add("rejected");
        supportEnum.add("accepted");
        _BLiveVoiceLiveAuctionApplyState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVoiceLiveAuctionApplyState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceLiveAuctionApplyState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceLiveAuctionApplyState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceLiveAuctionApplyState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVoiceLiveAuctionApplyState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVoiceLiveAuctionApplyState get(String str) {
        Map<String, BLiveVoiceLiveAuctionApplyState> map = _BLiveVoiceLiveAuctionApplyState;
        BLiveVoiceLiveAuctionApplyState bLiveVoiceLiveAuctionApplyState = map.get(str);
        if (bLiveVoiceLiveAuctionApplyState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceLiveAuctionApplyState = integer == null ? new BLiveVoiceLiveAuctionApplyState(str, -1) : new BLiveVoiceLiveAuctionApplyState(str, integer.intValue());
            map.put(str, bLiveVoiceLiveAuctionApplyState);
        }
        return bLiveVoiceLiveAuctionApplyState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceLiveAuctionApplyState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceLiveAuctionApplyState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceLiveAuctionApplyState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceLiveAuctionApplyState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
