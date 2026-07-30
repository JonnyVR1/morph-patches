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
public class BLiveChatJailedType extends TEnum {
    public static final String All = "All";
    public static final String FollowerAndManager = "FollowerAndManager";
    public static final TEnumJsonAdapter<BLiveChatJailedType> JSON_ADAPTER;
    public static final String Manager = "Manager";
    public static final String None = "None";
    public static final TEnumProtobufAdapter<BLiveChatJailedType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveChatJailedType> _BLiveChatJailedType;
    private static final int int_All = 0;
    private static final int int_FollowerAndManager = 1;
    private static final int int_Manager = 2;
    private static final int int_None = 3;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveChatJailedType$a */
    public class C11721a extends TEnumJsonAdapter<BLiveChatJailedType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveChatJailedType newTEnum(String str, int i) {
            return BLiveChatJailedType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveChatJailedType$b */
    public class C11722b extends TEnumProtobufAdapter<BLiveChatJailedType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveChatJailedType newTEnum(String str, int i) {
            return BLiveChatJailedType.getForData(str, i);
        }
    }

    static {
        C11721a c11721a = new C11721a();
        JSON_ADAPTER = c11721a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11722b();
        c11721a.addExtJsonValue("unknown_", -1);
        c11721a.addExtJsonValue(All, 0);
        c11721a.addExtJsonValue(FollowerAndManager, 1);
        c11721a.addExtJsonValue(Manager, 2);
        c11721a.addExtJsonValue(None, 3);
        supportEnum.add(All);
        supportEnum.add(FollowerAndManager);
        supportEnum.add(Manager);
        supportEnum.add(None);
        _BLiveChatJailedType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveChatJailedType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveChatJailedType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveChatJailedType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveChatJailedType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveChatJailedType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveChatJailedType get(String str) {
        Map<String, BLiveChatJailedType> map = _BLiveChatJailedType;
        BLiveChatJailedType bLiveChatJailedType = map.get(str);
        if (bLiveChatJailedType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveChatJailedType = integer == null ? new BLiveChatJailedType(str, -1) : new BLiveChatJailedType(str, integer.intValue());
            map.put(str, bLiveChatJailedType);
        }
        return bLiveChatJailedType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveChatJailedType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveChatJailedType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveChatJailedType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveChatJailedType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
