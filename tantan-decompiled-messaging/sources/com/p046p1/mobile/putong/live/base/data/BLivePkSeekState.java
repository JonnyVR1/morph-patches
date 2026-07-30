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
public class BLivePkSeekState extends TEnum {
    public static final TEnumJsonAdapter<BLivePkSeekState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLivePkSeekState> PROTOBUF_ADAPTER;
    private static final Map<String, BLivePkSeekState> _BLivePkSeekState;
    public static final String canceled = "canceled";
    private static final int int_canceled = 3;
    private static final int int_matched = 1;
    private static final int int_sent = 0;
    private static final int int_timeout = 2;
    private static final int int_unknown_ = -1;
    public static final String matched = "matched";
    public static final String sent = "sent";
    protected static HashSet<String> supportEnum = null;
    public static final String timeout = "timeout";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkSeekState$a */
    public class C11970a extends TEnumJsonAdapter<BLivePkSeekState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkSeekState newTEnum(String str, int i) {
            return BLivePkSeekState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkSeekState$b */
    public class C11971b extends TEnumProtobufAdapter<BLivePkSeekState> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkSeekState newTEnum(String str, int i) {
            return BLivePkSeekState.getForData(str, i);
        }
    }

    static {
        C11970a c11970a = new C11970a();
        JSON_ADAPTER = c11970a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11971b();
        c11970a.addExtJsonValue("unknown_", -1);
        c11970a.addExtJsonValue("sent", 0);
        c11970a.addExtJsonValue("matched", 1);
        c11970a.addExtJsonValue("timeout", 2);
        c11970a.addExtJsonValue("canceled", 3);
        supportEnum.add("sent");
        supportEnum.add("matched");
        supportEnum.add("timeout");
        supportEnum.add("canceled");
        _BLivePkSeekState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLivePkSeekState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLivePkSeekState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLivePkSeekState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLivePkSeekState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLivePkSeekState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLivePkSeekState get(String str) {
        Map<String, BLivePkSeekState> map = _BLivePkSeekState;
        BLivePkSeekState bLivePkSeekState = map.get(str);
        if (bLivePkSeekState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLivePkSeekState = integer == null ? new BLivePkSeekState(str, -1) : new BLivePkSeekState(str, integer.intValue());
            map.put(str, bLivePkSeekState);
        }
        return bLivePkSeekState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLivePkSeekState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLivePkSeekState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLivePkSeekState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLivePkSeekState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
