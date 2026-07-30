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
public class BLiveOpenStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveOpenStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOpenStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOpenStatus> _BLiveOpenStatus;
    public static final String doki = "doki";
    public static final String draw = "draw";
    public static final String fanbase = "fanbase";
    private static final int int_unknown_ = -1;
    public static final String opened = "opened";
    protected static HashSet<String> supportEnum = null;
    public static final String ticket = "ticket";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOpenStatus$a */
    public class C11889a extends TEnumJsonAdapter<BLiveOpenStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOpenStatus newTEnum(String str, int i) {
            return BLiveOpenStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOpenStatus$b */
    public class C11890b extends TEnumProtobufAdapter<BLiveOpenStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOpenStatus newTEnum(String str, int i) {
            return BLiveOpenStatus.getForData(str, i);
        }
    }

    static {
        C11889a c11889a = new C11889a();
        JSON_ADAPTER = c11889a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11890b();
        c11889a.addExtJsonValue("unknown_", -1);
        supportEnum.add(fanbase);
        supportEnum.add(ticket);
        supportEnum.add(doki);
        supportEnum.add(draw);
        supportEnum.add("opened");
        _BLiveOpenStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveOpenStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOpenStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOpenStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOpenStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveOpenStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveOpenStatus get(String str) {
        Map<String, BLiveOpenStatus> map = _BLiveOpenStatus;
        BLiveOpenStatus bLiveOpenStatus = map.get(str);
        if (bLiveOpenStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOpenStatus = integer == null ? new BLiveOpenStatus(str, -1) : new BLiveOpenStatus(str, integer.intValue());
            map.put(str, bLiveOpenStatus);
        }
        return bLiveOpenStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOpenStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOpenStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOpenStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOpenStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
