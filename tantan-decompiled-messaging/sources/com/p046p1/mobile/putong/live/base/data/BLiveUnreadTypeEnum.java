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
public class BLiveUnreadTypeEnum extends TEnum {
    public static final TEnumJsonAdapter<BLiveUnreadTypeEnum> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveUnreadTypeEnum> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveUnreadTypeEnum> _BLiveUnreadTypeEnum;
    public static final String guild = "guild";
    private static final int int_liveIcon = 2;
    private static final int int_number = 0;
    private static final int int_redDot = 1;
    private static final int int_unknown_ = -1;
    public static final String liveIcon = "liveIcon";
    public static final String number = "number";
    public static final String redDot = "redDot";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum$a */
    public class C12173a extends TEnumJsonAdapter<BLiveUnreadTypeEnum> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveUnreadTypeEnum newTEnum(String str, int i) {
            return BLiveUnreadTypeEnum.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum$b */
    public class C12174b extends TEnumProtobufAdapter<BLiveUnreadTypeEnum> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveUnreadTypeEnum newTEnum(String str, int i) {
            return BLiveUnreadTypeEnum.getForData(str, i);
        }
    }

    static {
        C12173a c12173a = new C12173a();
        JSON_ADAPTER = c12173a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12174b();
        c12173a.addExtJsonValue("unknown_", -1);
        c12173a.addExtJsonValue("number", 0);
        c12173a.addExtJsonValue(redDot, 1);
        c12173a.addExtJsonValue(liveIcon, 2);
        supportEnum.add("number");
        supportEnum.add(redDot);
        supportEnum.add(liveIcon);
        supportEnum.add(guild);
        _BLiveUnreadTypeEnum = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveUnreadTypeEnum(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveUnreadTypeEnum> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveUnreadTypeEnum> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveUnreadTypeEnum> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveUnreadTypeEnum> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveUnreadTypeEnum get(String str) {
        Map<String, BLiveUnreadTypeEnum> map = _BLiveUnreadTypeEnum;
        BLiveUnreadTypeEnum bLiveUnreadTypeEnum = map.get(str);
        if (bLiveUnreadTypeEnum == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveUnreadTypeEnum = integer == null ? new BLiveUnreadTypeEnum(str, -1) : new BLiveUnreadTypeEnum(str, integer.intValue());
            map.put(str, bLiveUnreadTypeEnum);
        }
        return bLiveUnreadTypeEnum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveUnreadTypeEnum getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveUnreadTypeEnum> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveUnreadTypeEnum> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveUnreadTypeEnum get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
