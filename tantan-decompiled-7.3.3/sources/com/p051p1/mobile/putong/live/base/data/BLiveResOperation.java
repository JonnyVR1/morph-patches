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
public class BLiveResOperation extends TEnum {
    public static final TEnumJsonAdapter<BLiveResOperation> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveResOperation> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveResOperation> _BLiveResOperation;
    public static final String add = "add";
    public static final String clear = "clear";
    private static final int int_add = 1;
    private static final int int_clear = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveResOperation$a */
    public class C12174a extends TEnumJsonAdapter<BLiveResOperation> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveResOperation newTEnum(String str, int i) {
            return BLiveResOperation.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveResOperation$b */
    public class C12175b extends TEnumProtobufAdapter<BLiveResOperation> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveResOperation newTEnum(String str, int i) {
            return BLiveResOperation.getForData(str, i);
        }
    }

    static {
        C12174a c12174a = new C12174a();
        JSON_ADAPTER = c12174a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12175b();
        c12174a.addExtJsonValue("unknown_", -1);
        c12174a.addExtJsonValue(clear, 0);
        c12174a.addExtJsonValue("add", 1);
        supportEnum.add(clear);
        supportEnum.add("add");
        _BLiveResOperation = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveResOperation(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveResOperation> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveResOperation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveResOperation> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveResOperation> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveResOperation get(String str) {
        Map<String, BLiveResOperation> map = _BLiveResOperation;
        BLiveResOperation bLiveResOperation = map.get(str);
        if (bLiveResOperation == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveResOperation = integer == null ? new BLiveResOperation(str, -1) : new BLiveResOperation(str, integer.intValue());
            map.put(str, bLiveResOperation);
        }
        return bLiveResOperation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveResOperation getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveResOperation> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveResOperation> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveResOperation get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
