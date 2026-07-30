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
public class BLiveBottomCountdownOverActionEnum extends TEnum {
    public static final TEnumJsonAdapter<BLiveBottomCountdownOverActionEnum> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveBottomCountdownOverActionEnum> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveBottomCountdownOverActionEnum> _BLiveBottomCountdownOverActionEnum;
    public static final String buttonLightDown = "buttonLightDown";
    public static final String buttonLightUp = "buttonLightUp";
    private static final int int_unknown_ = -1;
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBottomCountdownOverActionEnum$a */
    public class C11521a extends TEnumJsonAdapter<BLiveBottomCountdownOverActionEnum> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveBottomCountdownOverActionEnum newTEnum(String str, int i) {
            return BLiveBottomCountdownOverActionEnum.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBottomCountdownOverActionEnum$b */
    public class C11522b extends TEnumProtobufAdapter<BLiveBottomCountdownOverActionEnum> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveBottomCountdownOverActionEnum newTEnum(String str, int i) {
            return BLiveBottomCountdownOverActionEnum.getForData(str, i);
        }
    }

    static {
        C11521a c11521a = new C11521a();
        JSON_ADAPTER = c11521a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11522b();
        c11521a.addExtJsonValue("unknown_", -1);
        supportEnum.add("none");
        supportEnum.add(buttonLightUp);
        supportEnum.add(buttonLightDown);
        _BLiveBottomCountdownOverActionEnum = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveBottomCountdownOverActionEnum(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveBottomCountdownOverActionEnum> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveBottomCountdownOverActionEnum> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveBottomCountdownOverActionEnum> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveBottomCountdownOverActionEnum> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveBottomCountdownOverActionEnum get(String str) {
        Map<String, BLiveBottomCountdownOverActionEnum> map = _BLiveBottomCountdownOverActionEnum;
        BLiveBottomCountdownOverActionEnum bLiveBottomCountdownOverActionEnum = map.get(str);
        if (bLiveBottomCountdownOverActionEnum == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveBottomCountdownOverActionEnum = integer == null ? new BLiveBottomCountdownOverActionEnum(str, -1) : new BLiveBottomCountdownOverActionEnum(str, integer.intValue());
            map.put(str, bLiveBottomCountdownOverActionEnum);
        }
        return bLiveBottomCountdownOverActionEnum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveBottomCountdownOverActionEnum getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveBottomCountdownOverActionEnum> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveBottomCountdownOverActionEnum> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveBottomCountdownOverActionEnum get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
