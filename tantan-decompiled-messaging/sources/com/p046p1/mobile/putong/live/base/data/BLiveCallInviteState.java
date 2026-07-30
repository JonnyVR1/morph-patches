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
public class BLiveCallInviteState extends TEnum {
    public static final TEnumJsonAdapter<BLiveCallInviteState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveCallInviteState> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveCallInviteState> _BLiveCallInviteState;
    public static final String accepted = "accepted";
    private static final int int_accepted = 2;
    private static final int int_invited = 1;
    private static final int int_not_invited = 0;
    private static final int int_unknown_ = -1;
    public static final String invited = "invited";
    public static final String not_invited = "not-invited";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCallInviteState$a */
    public class C11542a extends TEnumJsonAdapter<BLiveCallInviteState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCallInviteState newTEnum(String str, int i) {
            return BLiveCallInviteState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCallInviteState$b */
    public class C11543b extends TEnumProtobufAdapter<BLiveCallInviteState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCallInviteState newTEnum(String str, int i) {
            return BLiveCallInviteState.getForData(str, i);
        }
    }

    static {
        C11542a c11542a = new C11542a();
        JSON_ADAPTER = c11542a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11543b();
        c11542a.addExtJsonValue("unknown_", -1);
        c11542a.addExtJsonValue("not-invited", 0);
        c11542a.addExtJsonValue("invited", 1);
        c11542a.addExtJsonValue("accepted", 2);
        supportEnum.add("not-invited");
        supportEnum.add("invited");
        supportEnum.add("accepted");
        _BLiveCallInviteState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveCallInviteState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveCallInviteState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveCallInviteState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveCallInviteState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveCallInviteState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveCallInviteState get(String str) {
        Map<String, BLiveCallInviteState> map = _BLiveCallInviteState;
        BLiveCallInviteState bLiveCallInviteState = map.get(str);
        if (bLiveCallInviteState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveCallInviteState = integer == null ? new BLiveCallInviteState(str, -1) : new BLiveCallInviteState(str, integer.intValue());
            map.put(str, bLiveCallInviteState);
        }
        return bLiveCallInviteState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveCallInviteState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveCallInviteState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveCallInviteState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveCallInviteState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
