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
public class BLivePkCategory extends TEnum {
    public static final TEnumJsonAdapter<BLivePkCategory> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLivePkCategory> PROTOBUF_ADAPTER;
    private static final Map<String, BLivePkCategory> _BLivePkCategory;
    public static final String bounty = "bounty";
    private static final int int_bounty = 2;
    private static final int int_random = 0;
    private static final int int_specified = 1;
    private static final int int_unknown_ = -1;
    public static final String random = "random";
    public static final String rank = "rank";
    public static final String specified = "specified";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkCategory$a */
    public class C12115a extends TEnumJsonAdapter<BLivePkCategory> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkCategory newTEnum(String str, int i) {
            return BLivePkCategory.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkCategory$b */
    public class C12116b extends TEnumProtobufAdapter<BLivePkCategory> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkCategory newTEnum(String str, int i) {
            return BLivePkCategory.getForData(str, i);
        }
    }

    static {
        C12115a c12115a = new C12115a();
        JSON_ADAPTER = c12115a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12116b();
        c12115a.addExtJsonValue("unknown_", -1);
        c12115a.addExtJsonValue(random, 0);
        c12115a.addExtJsonValue("specified", 1);
        c12115a.addExtJsonValue(bounty, 2);
        supportEnum.add(random);
        supportEnum.add("specified");
        supportEnum.add(bounty);
        supportEnum.add(rank);
        _BLivePkCategory = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLivePkCategory(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLivePkCategory> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLivePkCategory> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLivePkCategory> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLivePkCategory> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLivePkCategory get(String str) {
        Map<String, BLivePkCategory> map = _BLivePkCategory;
        BLivePkCategory bLivePkCategory = map.get(str);
        if (bLivePkCategory == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLivePkCategory = integer == null ? new BLivePkCategory(str, -1) : new BLivePkCategory(str, integer.intValue());
            map.put(str, bLivePkCategory);
        }
        return bLivePkCategory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLivePkCategory getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLivePkCategory> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLivePkCategory> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLivePkCategory get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
