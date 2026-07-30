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
public class BLiveRole extends TEnum {
    public static final TEnumJsonAdapter<BLiveRole> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveRole> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveRole> _BLiveRole;
    public static final String admin = "admin";
    public static final String anchor = "anchor";
    public static final String audience = "audience";
    public static final String caller = "caller";
    private static final int int_admin = 1;
    private static final int int_anchor = 0;
    private static final int int_audience = 2;
    private static final int int_caller = 3;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRole$a */
    public class C12025a extends TEnumJsonAdapter<BLiveRole> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRole newTEnum(String str, int i) {
            return BLiveRole.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveRole$b */
    public class C12026b extends TEnumProtobufAdapter<BLiveRole> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveRole newTEnum(String str, int i) {
            return BLiveRole.getForData(str, i);
        }
    }

    static {
        C12025a c12025a = new C12025a();
        JSON_ADAPTER = c12025a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12026b();
        c12025a.addExtJsonValue("unknown_", -1);
        c12025a.addExtJsonValue("anchor", 0);
        c12025a.addExtJsonValue("admin", 1);
        c12025a.addExtJsonValue("audience", 2);
        c12025a.addExtJsonValue(caller, 3);
        supportEnum.add("anchor");
        supportEnum.add("admin");
        supportEnum.add("audience");
        supportEnum.add(caller);
        _BLiveRole = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveRole(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveRole> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveRole> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveRole> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveRole> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveRole get(String str) {
        Map<String, BLiveRole> map = _BLiveRole;
        BLiveRole bLiveRole = map.get(str);
        if (bLiveRole == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveRole = integer == null ? new BLiveRole(str, -1) : new BLiveRole(str, integer.intValue());
            map.put(str, bLiveRole);
        }
        return bLiveRole;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveRole getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveRole> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveRole> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveRole get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
