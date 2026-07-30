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
public class BLiveOperationTitleShowType extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationTitleShowType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationTitleShowType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationTitleShowType> _BLiveOperationTitleShowType;
    public static final String constant = "constant";
    public static final String duration = "duration";
    private static final int int_constant = 0;
    private static final int int_duration = 1;
    private static final int int_off = 2;
    private static final int int_unknown_ = -1;
    public static final String off = "off";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType$a */
    public class C11927a extends TEnumJsonAdapter<BLiveOperationTitleShowType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationTitleShowType newTEnum(String str, int i) {
            return BLiveOperationTitleShowType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType$b */
    public class C11928b extends TEnumProtobufAdapter<BLiveOperationTitleShowType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationTitleShowType newTEnum(String str, int i) {
            return BLiveOperationTitleShowType.getForData(str, i);
        }
    }

    static {
        C11927a c11927a = new C11927a();
        JSON_ADAPTER = c11927a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11928b();
        c11927a.addExtJsonValue("unknown_", -1);
        c11927a.addExtJsonValue(constant, 0);
        c11927a.addExtJsonValue(duration, 1);
        c11927a.addExtJsonValue(off, 2);
        supportEnum.add(constant);
        supportEnum.add(duration);
        supportEnum.add(off);
        _BLiveOperationTitleShowType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveOperationTitleShowType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationTitleShowType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationTitleShowType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationTitleShowType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveOperationTitleShowType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveOperationTitleShowType get(String str) {
        Map<String, BLiveOperationTitleShowType> map = _BLiveOperationTitleShowType;
        BLiveOperationTitleShowType bLiveOperationTitleShowType = map.get(str);
        if (bLiveOperationTitleShowType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationTitleShowType = integer == null ? new BLiveOperationTitleShowType(str, -1) : new BLiveOperationTitleShowType(str, integer.intValue());
            map.put(str, bLiveOperationTitleShowType);
        }
        return bLiveOperationTitleShowType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationTitleShowType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationTitleShowType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationTitleShowType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationTitleShowType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
