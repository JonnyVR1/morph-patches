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
public class BLiveVoiceAuctionInviteState extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceAuctionInviteState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceAuctionInviteState> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceAuctionInviteState> _BLiveVoiceAuctionInviteState;
    public static final String accept = "accept";
    public static final String accepted = "accepted";
    public static final String approved = "approved";
    public static final String ended = "ended";
    private static final int int_unknown_ = -1;
    public static final String invite = "invite";
    public static final String invited = "invited";
    public static final String not_invited = "not-invited";
    public static final String reject = "reject";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String timeout = "timeout";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionInviteState$a */
    public class C12243a extends TEnumJsonAdapter<BLiveVoiceAuctionInviteState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceAuctionInviteState newTEnum(String str, int i) {
            return BLiveVoiceAuctionInviteState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionInviteState$b */
    public class C12244b extends TEnumProtobufAdapter<BLiveVoiceAuctionInviteState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceAuctionInviteState newTEnum(String str, int i) {
            return BLiveVoiceAuctionInviteState.getForData(str, i);
        }
    }

    static {
        C12243a c12243a = new C12243a();
        JSON_ADAPTER = c12243a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12244b();
        c12243a.addExtJsonValue("unknown_", -1);
        supportEnum.add("invite");
        supportEnum.add("reject");
        supportEnum.add("accept");
        supportEnum.add("timeout");
        supportEnum.add("not-invited");
        supportEnum.add("invited");
        supportEnum.add("rejected");
        supportEnum.add("accepted");
        supportEnum.add("ended");
        supportEnum.add("approved");
        _BLiveVoiceAuctionInviteState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveVoiceAuctionInviteState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceAuctionInviteState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceAuctionInviteState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceAuctionInviteState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveVoiceAuctionInviteState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveVoiceAuctionInviteState get(String str) {
        Map<String, BLiveVoiceAuctionInviteState> map = _BLiveVoiceAuctionInviteState;
        BLiveVoiceAuctionInviteState bLiveVoiceAuctionInviteState = map.get(str);
        if (bLiveVoiceAuctionInviteState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceAuctionInviteState = integer == null ? new BLiveVoiceAuctionInviteState(str, -1) : new BLiveVoiceAuctionInviteState(str, integer.intValue());
            map.put(str, bLiveVoiceAuctionInviteState);
        }
        return bLiveVoiceAuctionInviteState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceAuctionInviteState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceAuctionInviteState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceAuctionInviteState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceAuctionInviteState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
