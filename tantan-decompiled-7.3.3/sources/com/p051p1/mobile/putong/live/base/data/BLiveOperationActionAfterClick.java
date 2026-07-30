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
public class BLiveOperationActionAfterClick extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationActionAfterClick> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationActionAfterClick> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationActionAfterClick> _BLiveOperationActionAfterClick;
    public static final String h5Drawer = "h5Drawer";
    private static final int int_h5Drawer = 1;
    private static final int int_jumpToScheme = 0;
    private static final int int_unknown_ = -1;
    public static final String jumpToScheme = "jumpToScheme";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationActionAfterClick$a */
    public class C12055a extends TEnumJsonAdapter<BLiveOperationActionAfterClick> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationActionAfterClick newTEnum(String str, int i) {
            return BLiveOperationActionAfterClick.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationActionAfterClick$b */
    public class C12056b extends TEnumProtobufAdapter<BLiveOperationActionAfterClick> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationActionAfterClick newTEnum(String str, int i) {
            return BLiveOperationActionAfterClick.getForData(str, i);
        }
    }

    static {
        C12055a c12055a = new C12055a();
        JSON_ADAPTER = c12055a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12056b();
        c12055a.addExtJsonValue("unknown_", -1);
        c12055a.addExtJsonValue("jumpToScheme", 0);
        c12055a.addExtJsonValue("h5Drawer", 1);
        supportEnum.add("jumpToScheme");
        supportEnum.add("h5Drawer");
        _BLiveOperationActionAfterClick = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveOperationActionAfterClick(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationActionAfterClick> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationActionAfterClick> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationActionAfterClick> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveOperationActionAfterClick> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveOperationActionAfterClick get(String str) {
        Map<String, BLiveOperationActionAfterClick> map = _BLiveOperationActionAfterClick;
        BLiveOperationActionAfterClick bLiveOperationActionAfterClick = map.get(str);
        if (bLiveOperationActionAfterClick == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationActionAfterClick = integer == null ? new BLiveOperationActionAfterClick(str, -1) : new BLiveOperationActionAfterClick(str, integer.intValue());
            map.put(str, bLiveOperationActionAfterClick);
        }
        return bLiveOperationActionAfterClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationActionAfterClick getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationActionAfterClick> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationActionAfterClick> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationActionAfterClick get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
