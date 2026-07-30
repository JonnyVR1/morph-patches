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
public class AuctionState extends TEnum {
    public static final TEnumJsonAdapter<AuctionState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<AuctionState> PROTOBUF_ADAPTER;
    private static final Map<String, AuctionState> _AuctionState;
    public static final String abort = "abort";
    public static final String accept = "accept";
    public static final String accepted = "accepted";
    public static final String applied = "applied";
    public static final String apply = "apply";
    public static final String blessing = "blessing";
    public static final String ended = "ended";
    private static final int int_unknown_ = -1;
    public static final String invite = "invite";
    public static final String ongoing = "ongoing";
    public static final String pending = "pending";
    public static final String queuing = "queuing";
    public static final String reject = "reject";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.AuctionState$a */
    public class C11606a extends TEnumJsonAdapter<AuctionState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuctionState newTEnum(String str, int i) {
            return AuctionState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.AuctionState$b */
    public class C11607b extends TEnumProtobufAdapter<AuctionState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuctionState newTEnum(String str, int i) {
            return AuctionState.getForData(str, i);
        }
    }

    static {
        C11606a c11606a = new C11606a();
        JSON_ADAPTER = c11606a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11607b();
        c11606a.addExtJsonValue("unknown_", -1);
        supportEnum.add("apply");
        supportEnum.add("reject");
        supportEnum.add("accept");
        supportEnum.add("applied");
        supportEnum.add("rejected");
        supportEnum.add("accepted");
        supportEnum.add(abort);
        supportEnum.add("pending");
        supportEnum.add(blessing);
        supportEnum.add("ended");
        supportEnum.add("ongoing");
        supportEnum.add("queuing");
        supportEnum.add("invite");
        _AuctionState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private AuctionState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<AuctionState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AuctionState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, AuctionState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, AuctionState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static AuctionState get(String str) {
        Map<String, AuctionState> map = _AuctionState;
        AuctionState auctionState = map.get(str);
        if (auctionState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            auctionState = integer == null ? new AuctionState(str, -1) : new AuctionState(str, integer.intValue());
            map.put(str, auctionState);
        }
        return auctionState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AuctionState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<AuctionState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, AuctionState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static AuctionState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
