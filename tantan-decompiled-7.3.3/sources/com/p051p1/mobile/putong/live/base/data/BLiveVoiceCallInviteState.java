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
public class BLiveVoiceCallInviteState extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceCallInviteState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceCallInviteState> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceCallInviteState> _BLiveVoiceCallInviteState;
    public static final String accepted = "accepted";
    public static final String ended = "ended";
    private static final int int_accepted = 2;
    private static final int int_ended = 3;
    private static final int int_invited = 1;
    private static final int int_not_invited = 0;
    private static final int int_unknown_ = -1;
    public static final String invited = "invited";
    public static final String not_invited = "not-invited";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String timeout = "timeout";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceCallInviteState$a */
    public class C12422a extends TEnumJsonAdapter<BLiveVoiceCallInviteState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceCallInviteState newTEnum(String str, int i) {
            return BLiveVoiceCallInviteState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceCallInviteState$b */
    public class C12423b extends TEnumProtobufAdapter<BLiveVoiceCallInviteState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceCallInviteState newTEnum(String str, int i) {
            return BLiveVoiceCallInviteState.getForData(str, i);
        }
    }

    static {
        C12422a c12422a = new C12422a();
        JSON_ADAPTER = c12422a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12423b();
        c12422a.addExtJsonValue("unknown_", -1);
        c12422a.addExtJsonValue("not-invited", 0);
        c12422a.addExtJsonValue("invited", 1);
        c12422a.addExtJsonValue("accepted", 2);
        c12422a.addExtJsonValue("ended", 3);
        supportEnum.add("not-invited");
        supportEnum.add("invited");
        supportEnum.add("accepted");
        supportEnum.add("ended");
        supportEnum.add("rejected");
        supportEnum.add("timeout");
        _BLiveVoiceCallInviteState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVoiceCallInviteState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceCallInviteState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceCallInviteState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceCallInviteState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVoiceCallInviteState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVoiceCallInviteState get(String str) {
        Map<String, BLiveVoiceCallInviteState> map = _BLiveVoiceCallInviteState;
        BLiveVoiceCallInviteState bLiveVoiceCallInviteState = map.get(str);
        if (bLiveVoiceCallInviteState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceCallInviteState = integer == null ? new BLiveVoiceCallInviteState(str, -1) : new BLiveVoiceCallInviteState(str, integer.intValue());
            map.put(str, bLiveVoiceCallInviteState);
        }
        return bLiveVoiceCallInviteState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceCallInviteState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceCallInviteState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceCallInviteState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceCallInviteState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
