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
public class BLivePkInviteState extends TEnum {
    public static final TEnumJsonAdapter<BLivePkInviteState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLivePkInviteState> PROTOBUF_ADAPTER;
    private static final Map<String, BLivePkInviteState> _BLivePkInviteState;
    public static final String accepted = "accepted";
    public static final String canceled = "canceled";
    private static final int int_accepted = 2;
    private static final int int_canceled = 1;
    private static final int int_rejected = 3;
    private static final int int_sent = 0;
    private static final int int_unknown_ = -1;
    public static final String rejected = "rejected";
    public static final String sent = "sent";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkInviteState$a */
    public class C12125a extends TEnumJsonAdapter<BLivePkInviteState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkInviteState newTEnum(String str, int i) {
            return BLivePkInviteState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkInviteState$b */
    public class C12126b extends TEnumProtobufAdapter<BLivePkInviteState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkInviteState newTEnum(String str, int i) {
            return BLivePkInviteState.getForData(str, i);
        }
    }

    static {
        C12125a c12125a = new C12125a();
        JSON_ADAPTER = c12125a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12126b();
        c12125a.addExtJsonValue("unknown_", -1);
        c12125a.addExtJsonValue("sent", 0);
        c12125a.addExtJsonValue("canceled", 1);
        c12125a.addExtJsonValue("accepted", 2);
        c12125a.addExtJsonValue("rejected", 3);
        supportEnum.add("sent");
        supportEnum.add("canceled");
        supportEnum.add("accepted");
        supportEnum.add("rejected");
        _BLivePkInviteState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLivePkInviteState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLivePkInviteState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLivePkInviteState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLivePkInviteState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLivePkInviteState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLivePkInviteState get(String str) {
        Map<String, BLivePkInviteState> map = _BLivePkInviteState;
        BLivePkInviteState bLivePkInviteState = map.get(str);
        if (bLivePkInviteState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLivePkInviteState = integer == null ? new BLivePkInviteState(str, -1) : new BLivePkInviteState(str, integer.intValue());
            map.put(str, bLivePkInviteState);
        }
        return bLivePkInviteState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLivePkInviteState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLivePkInviteState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLivePkInviteState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLivePkInviteState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
