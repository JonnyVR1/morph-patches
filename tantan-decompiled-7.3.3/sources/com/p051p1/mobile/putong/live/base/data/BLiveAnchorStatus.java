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
public class BLiveAnchorStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveAnchorStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveAnchorStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveAnchorStatus> _BLiveAnchorStatus;
    public static final String default_ = "default";
    private static final int int_default_ = 0;
    private static final int int_jailed = 1;
    private static final int int_unknown_ = -1;
    public static final String jailed = "jailed";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveAnchorStatus$a */
    public class C11640a extends TEnumJsonAdapter<BLiveAnchorStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveAnchorStatus newTEnum(String str, int i) {
            return BLiveAnchorStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveAnchorStatus$b */
    public class C11641b extends TEnumProtobufAdapter<BLiveAnchorStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveAnchorStatus newTEnum(String str, int i) {
            return BLiveAnchorStatus.getForData(str, i);
        }
    }

    static {
        C11640a c11640a = new C11640a();
        JSON_ADAPTER = c11640a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11641b();
        c11640a.addExtJsonValue("unknown_", -1);
        c11640a.addExtJsonValue("default", 0);
        c11640a.addExtJsonValue("jailed", 1);
        supportEnum.add("default");
        supportEnum.add("jailed");
        _BLiveAnchorStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveAnchorStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveAnchorStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveAnchorStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveAnchorStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveAnchorStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveAnchorStatus get(String str) {
        Map<String, BLiveAnchorStatus> map = _BLiveAnchorStatus;
        BLiveAnchorStatus bLiveAnchorStatus = map.get(str);
        if (bLiveAnchorStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveAnchorStatus = integer == null ? new BLiveAnchorStatus(str, -1) : new BLiveAnchorStatus(str, integer.intValue());
            map.put(str, bLiveAnchorStatus);
        }
        return bLiveAnchorStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveAnchorStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveAnchorStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveAnchorStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveAnchorStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
