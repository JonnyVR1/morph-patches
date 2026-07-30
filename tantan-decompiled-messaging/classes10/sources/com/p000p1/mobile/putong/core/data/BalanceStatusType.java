package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BalanceStatusType extends TEnum {
    public static final TEnumJsonAdapter<BalanceStatusType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BalanceStatusType> PROTOBUF_ADAPTER;
    private static final Map<String, BalanceStatusType> _BalanceStatusType;
    public static final String approved = "approved";
    public static final String failed = "failed";
    private static final int int_approved = 1;
    private static final int int_failed = 3;
    private static final int int_pending = 0;
    private static final int int_rollback = 4;
    private static final int int_success = 2;
    private static final int int_unknown_ = -1;
    private static final int int_unlocked = 5;
    public static final String pending = "pending";
    public static final String rollback = "rollback";
    public static final String success = "success";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String unlocked = "unlocked";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BalanceStatusType> tEnumJsonAdapter = new TEnumJsonAdapter<BalanceStatusType>() { // from class: com.p1.mobile.putong.core.data.BalanceStatusType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public BalanceStatusType m11729newTEnum(String str, int i) {
                return BalanceStatusType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BalanceStatusType>() { // from class: com.p1.mobile.putong.core.data.BalanceStatusType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public BalanceStatusType m11730newTEnum(String str, int i) {
                return BalanceStatusType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("pending", int_pending);
        tEnumJsonAdapter.addExtJsonValue("approved", 1);
        tEnumJsonAdapter.addExtJsonValue("success", 2);
        tEnumJsonAdapter.addExtJsonValue("failed", 3);
        tEnumJsonAdapter.addExtJsonValue(rollback, int_rollback);
        tEnumJsonAdapter.addExtJsonValue(unlocked, 5);
        supportEnum.add("pending");
        supportEnum.add("approved");
        supportEnum.add("success");
        supportEnum.add("failed");
        supportEnum.add(rollback);
        supportEnum.add(unlocked);
        _BalanceStatusType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BalanceStatusType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BalanceStatusType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BalanceStatusType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BalanceStatusType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BalanceStatusType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BalanceStatusType get(String str) {
        Map<String, BalanceStatusType> map = _BalanceStatusType;
        BalanceStatusType balanceStatusType = map.get(str);
        if (balanceStatusType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            balanceStatusType = integer == null ? new BalanceStatusType(str, int_unknown_) : new BalanceStatusType(str, integer.intValue());
            map.put(str, balanceStatusType);
        }
        return balanceStatusType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BalanceStatusType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BalanceStatusType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BalanceStatusType> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static BalanceStatusType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
