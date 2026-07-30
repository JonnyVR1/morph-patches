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
public class BLiveBottomPopupStyleTypeEnum extends TEnum {
    public static final TEnumJsonAdapter<BLiveBottomPopupStyleTypeEnum> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveBottomPopupStyleTypeEnum> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveBottomPopupStyleTypeEnum> _BLiveBottomPopupStyleTypeEnum;
    public static final String common = "common";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String window = "window";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum$a */
    public class C11524a extends TEnumJsonAdapter<BLiveBottomPopupStyleTypeEnum> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveBottomPopupStyleTypeEnum newTEnum(String str, int i) {
            return BLiveBottomPopupStyleTypeEnum.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum$b */
    public class C11525b extends TEnumProtobufAdapter<BLiveBottomPopupStyleTypeEnum> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveBottomPopupStyleTypeEnum newTEnum(String str, int i) {
            return BLiveBottomPopupStyleTypeEnum.getForData(str, i);
        }
    }

    static {
        C11524a c11524a = new C11524a();
        JSON_ADAPTER = c11524a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11525b();
        c11524a.addExtJsonValue("unknown_", -1);
        supportEnum.add("common");
        supportEnum.add(window);
        _BLiveBottomPopupStyleTypeEnum = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveBottomPopupStyleTypeEnum(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveBottomPopupStyleTypeEnum> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveBottomPopupStyleTypeEnum> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveBottomPopupStyleTypeEnum> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveBottomPopupStyleTypeEnum> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveBottomPopupStyleTypeEnum get(String str) {
        Map<String, BLiveBottomPopupStyleTypeEnum> map = _BLiveBottomPopupStyleTypeEnum;
        BLiveBottomPopupStyleTypeEnum bLiveBottomPopupStyleTypeEnum = map.get(str);
        if (bLiveBottomPopupStyleTypeEnum == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveBottomPopupStyleTypeEnum = integer == null ? new BLiveBottomPopupStyleTypeEnum(str, -1) : new BLiveBottomPopupStyleTypeEnum(str, integer.intValue());
            map.put(str, bLiveBottomPopupStyleTypeEnum);
        }
        return bLiveBottomPopupStyleTypeEnum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveBottomPopupStyleTypeEnum getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveBottomPopupStyleTypeEnum> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveBottomPopupStyleTypeEnum> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveBottomPopupStyleTypeEnum get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
