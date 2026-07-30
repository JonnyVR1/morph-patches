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
public class BLiveOperationClickAction extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationClickAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationClickAction> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationClickAction> _BLiveOperationClickAction;

    /* JADX INFO: renamed from: h5 */
    public static final String f44417h5 = "h5";
    private static final int int_h5 = 0;
    private static final int int_scheme = 1;
    private static final int int_unknown_ = -1;
    public static final String scheme = "scheme";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationClickAction$a */
    public class C11900a extends TEnumJsonAdapter<BLiveOperationClickAction> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationClickAction newTEnum(String str, int i) {
            return BLiveOperationClickAction.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationClickAction$b */
    public class C11901b extends TEnumProtobufAdapter<BLiveOperationClickAction> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationClickAction newTEnum(String str, int i) {
            return BLiveOperationClickAction.getForData(str, i);
        }
    }

    static {
        C11900a c11900a = new C11900a();
        JSON_ADAPTER = c11900a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11901b();
        c11900a.addExtJsonValue("unknown_", -1);
        c11900a.addExtJsonValue(f44417h5, 0);
        c11900a.addExtJsonValue(scheme, 1);
        supportEnum.add(f44417h5);
        supportEnum.add(scheme);
        _BLiveOperationClickAction = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveOperationClickAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationClickAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationClickAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationClickAction> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveOperationClickAction> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveOperationClickAction get(String str) {
        Map<String, BLiveOperationClickAction> map = _BLiveOperationClickAction;
        BLiveOperationClickAction bLiveOperationClickAction = map.get(str);
        if (bLiveOperationClickAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationClickAction = integer == null ? new BLiveOperationClickAction(str, -1) : new BLiveOperationClickAction(str, integer.intValue());
            map.put(str, bLiveOperationClickAction);
        }
        return bLiveOperationClickAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationClickAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationClickAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationClickAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationClickAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
