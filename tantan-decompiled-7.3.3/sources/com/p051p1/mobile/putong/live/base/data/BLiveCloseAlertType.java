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
public class BLiveCloseAlertType extends TEnum {
    public static final TEnumJsonAdapter<BLiveCloseAlertType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveCloseAlertType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveCloseAlertType> _BLiveCloseAlertType;
    private static final int int_tipOnly = 1;
    private static final int int_unknown_ = -1;
    private static final int int_withJump = 0;
    protected static HashSet<String> supportEnum = null;
    public static final String tipOnly = "tipOnly";
    public static final String unknown_ = "unknown_";
    public static final String withJump = "withJump";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCloseAlertType$a */
    public class C11737a extends TEnumJsonAdapter<BLiveCloseAlertType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCloseAlertType newTEnum(String str, int i) {
            return BLiveCloseAlertType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCloseAlertType$b */
    public class C11738b extends TEnumProtobufAdapter<BLiveCloseAlertType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCloseAlertType newTEnum(String str, int i) {
            return BLiveCloseAlertType.getForData(str, i);
        }
    }

    static {
        C11737a c11737a = new C11737a();
        JSON_ADAPTER = c11737a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11738b();
        c11737a.addExtJsonValue("unknown_", -1);
        c11737a.addExtJsonValue(withJump, 0);
        c11737a.addExtJsonValue(tipOnly, 1);
        supportEnum.add(withJump);
        supportEnum.add(tipOnly);
        _BLiveCloseAlertType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveCloseAlertType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveCloseAlertType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveCloseAlertType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveCloseAlertType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveCloseAlertType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveCloseAlertType get(String str) {
        Map<String, BLiveCloseAlertType> map = _BLiveCloseAlertType;
        BLiveCloseAlertType bLiveCloseAlertType = map.get(str);
        if (bLiveCloseAlertType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveCloseAlertType = integer == null ? new BLiveCloseAlertType(str, -1) : new BLiveCloseAlertType(str, integer.intValue());
            map.put(str, bLiveCloseAlertType);
        }
        return bLiveCloseAlertType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveCloseAlertType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveCloseAlertType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveCloseAlertType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveCloseAlertType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
