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
public class BLiveTreasureBoxStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveTreasureBoxStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveTreasureBoxStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveTreasureBoxStatus> _BLiveTreasureBoxStatus;
    public static final String completed = "completed";
    public static final String created = "created";
    public static final String deleted = "deleted";
    private static final int int_completed = 3;
    private static final int int_created = 1;
    private static final int int_deleted = 0;
    private static final int int_pending = 2;
    private static final int int_taken = 4;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    protected static HashSet<String> supportEnum = null;
    public static final String taken = "taken";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTreasureBoxStatus$a */
    public class C12161a extends TEnumJsonAdapter<BLiveTreasureBoxStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTreasureBoxStatus newTEnum(String str, int i) {
            return BLiveTreasureBoxStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTreasureBoxStatus$b */
    public class C12162b extends TEnumProtobufAdapter<BLiveTreasureBoxStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTreasureBoxStatus newTEnum(String str, int i) {
            return BLiveTreasureBoxStatus.getForData(str, i);
        }
    }

    static {
        C12161a c12161a = new C12161a();
        JSON_ADAPTER = c12161a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12162b();
        c12161a.addExtJsonValue("unknown_", -1);
        c12161a.addExtJsonValue("deleted", 0);
        c12161a.addExtJsonValue("created", 1);
        c12161a.addExtJsonValue("pending", 2);
        c12161a.addExtJsonValue("completed", 3);
        c12161a.addExtJsonValue(taken, 4);
        supportEnum.add("deleted");
        supportEnum.add("created");
        supportEnum.add("pending");
        supportEnum.add("completed");
        supportEnum.add(taken);
        _BLiveTreasureBoxStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveTreasureBoxStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveTreasureBoxStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveTreasureBoxStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveTreasureBoxStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveTreasureBoxStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveTreasureBoxStatus get(String str) {
        Map<String, BLiveTreasureBoxStatus> map = _BLiveTreasureBoxStatus;
        BLiveTreasureBoxStatus bLiveTreasureBoxStatus = map.get(str);
        if (bLiveTreasureBoxStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveTreasureBoxStatus = integer == null ? new BLiveTreasureBoxStatus(str, -1) : new BLiveTreasureBoxStatus(str, integer.intValue());
            map.put(str, bLiveTreasureBoxStatus);
        }
        return bLiveTreasureBoxStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveTreasureBoxStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveTreasureBoxStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveTreasureBoxStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveTreasureBoxStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
