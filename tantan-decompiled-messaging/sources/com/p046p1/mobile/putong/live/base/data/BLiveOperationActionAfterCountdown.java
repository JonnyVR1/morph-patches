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
public class BLiveOperationActionAfterCountdown extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationActionAfterCountdown> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationActionAfterCountdown> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationActionAfterCountdown> _BLiveOperationActionAfterCountdown;
    public static final String close = "close";
    public static final String h5Drawer = "h5Drawer";
    private static final int int_close = 2;
    private static final int int_h5Drawer = 4;
    private static final int int_jumpToScheme = 1;
    private static final int int_none = 5;
    private static final int int_refresh = 0;
    private static final int int_textDrawer = 3;
    private static final int int_unknown_ = -1;
    public static final String jumpToScheme = "jumpToScheme";
    public static final String none = "none";
    public static final String refresh = "refresh";
    protected static HashSet<String> supportEnum = null;
    public static final String textDrawer = "textDrawer";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown$a */
    public class C11894a extends TEnumJsonAdapter<BLiveOperationActionAfterCountdown> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationActionAfterCountdown newTEnum(String str, int i) {
            return BLiveOperationActionAfterCountdown.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown$b */
    public class C11895b extends TEnumProtobufAdapter<BLiveOperationActionAfterCountdown> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationActionAfterCountdown newTEnum(String str, int i) {
            return BLiveOperationActionAfterCountdown.getForData(str, i);
        }
    }

    static {
        C11894a c11894a = new C11894a();
        JSON_ADAPTER = c11894a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11895b();
        c11894a.addExtJsonValue("unknown_", -1);
        c11894a.addExtJsonValue(refresh, 0);
        c11894a.addExtJsonValue("jumpToScheme", 1);
        c11894a.addExtJsonValue("close", 2);
        c11894a.addExtJsonValue(textDrawer, 3);
        c11894a.addExtJsonValue("h5Drawer", 4);
        c11894a.addExtJsonValue("none", 5);
        supportEnum.add(refresh);
        supportEnum.add("jumpToScheme");
        supportEnum.add("close");
        supportEnum.add(textDrawer);
        supportEnum.add("h5Drawer");
        supportEnum.add("none");
        _BLiveOperationActionAfterCountdown = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveOperationActionAfterCountdown(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationActionAfterCountdown> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationActionAfterCountdown> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationActionAfterCountdown> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveOperationActionAfterCountdown> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveOperationActionAfterCountdown get(String str) {
        Map<String, BLiveOperationActionAfterCountdown> map = _BLiveOperationActionAfterCountdown;
        BLiveOperationActionAfterCountdown bLiveOperationActionAfterCountdown = map.get(str);
        if (bLiveOperationActionAfterCountdown == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationActionAfterCountdown = integer == null ? new BLiveOperationActionAfterCountdown(str, -1) : new BLiveOperationActionAfterCountdown(str, integer.intValue());
            map.put(str, bLiveOperationActionAfterCountdown);
        }
        return bLiveOperationActionAfterCountdown;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationActionAfterCountdown getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationActionAfterCountdown> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationActionAfterCountdown> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationActionAfterCountdown get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
