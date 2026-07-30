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
public class BLiveGuardType extends TEnum {
    public static final TEnumJsonAdapter<BLiveGuardType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveGuardType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveGuardType> _BLiveGuardType;
    public static final String anchorGuard = "anchorGuard";
    public static final String cherish = "cherish";
    public static final String heartbeat = "heartbeat";
    private static final int int_anchorGuard = 5;
    private static final int int_cherish = 4;
    private static final int int_heartbeat = 3;
    private static final int int_onlineGuard = 2;
    private static final int int_potentialGuard = 1;
    private static final int int_unknown_ = -1;
    private static final int int_userGuard = 0;
    public static final String onlineGuard = "onlineGuard";
    public static final String potentialGuard = "potentialGuard";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String userGuard = "userGuard";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveGuardType$a */
    public class C11900a extends TEnumJsonAdapter<BLiveGuardType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveGuardType newTEnum(String str, int i) {
            return BLiveGuardType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveGuardType$b */
    public class C11901b extends TEnumProtobufAdapter<BLiveGuardType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveGuardType newTEnum(String str, int i) {
            return BLiveGuardType.getForData(str, i);
        }
    }

    static {
        C11900a c11900a = new C11900a();
        JSON_ADAPTER = c11900a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11901b();
        c11900a.addExtJsonValue("unknown_", -1);
        c11900a.addExtJsonValue(userGuard, 0);
        c11900a.addExtJsonValue(potentialGuard, 1);
        c11900a.addExtJsonValue(onlineGuard, 2);
        c11900a.addExtJsonValue("heartbeat", 3);
        c11900a.addExtJsonValue(cherish, 4);
        c11900a.addExtJsonValue(anchorGuard, 5);
        supportEnum.add(userGuard);
        supportEnum.add(potentialGuard);
        supportEnum.add(onlineGuard);
        supportEnum.add("heartbeat");
        supportEnum.add(cherish);
        supportEnum.add(anchorGuard);
        _BLiveGuardType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveGuardType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveGuardType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveGuardType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveGuardType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveGuardType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveGuardType get(String str) {
        Map<String, BLiveGuardType> map = _BLiveGuardType;
        BLiveGuardType bLiveGuardType = map.get(str);
        if (bLiveGuardType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveGuardType = integer == null ? new BLiveGuardType(str, -1) : new BLiveGuardType(str, integer.intValue());
            map.put(str, bLiveGuardType);
        }
        return bLiveGuardType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveGuardType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveGuardType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveGuardType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveGuardType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
