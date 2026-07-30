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
public class BalanceOpsType extends TEnum {
    public static final TEnumJsonAdapter<BalanceOpsType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BalanceOpsType> PROTOBUF_ADAPTER;
    private static final Map<String, BalanceOpsType> _BalanceOpsType;
    public static final String deduction = "deduction";
    public static final String income = "income";
    private static final int int_deduction = 2;
    private static final int int_income = 1;
    private static final int int_redPacket = 3;
    private static final int int_unknown_ = -1;
    private static final int int_withdraw = 0;
    public static final String redPacket = "redPacket";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String withdraw = "withdraw";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BalanceOpsType> tEnumJsonAdapter = new TEnumJsonAdapter<BalanceOpsType>() { // from class: com.p1.mobile.putong.core.data.BalanceOpsType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public BalanceOpsType m11727newTEnum(String str, int i) {
                return BalanceOpsType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BalanceOpsType>() { // from class: com.p1.mobile.putong.core.data.BalanceOpsType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public BalanceOpsType m11728newTEnum(String str, int i) {
                return BalanceOpsType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(withdraw, int_withdraw);
        tEnumJsonAdapter.addExtJsonValue("income", 1);
        tEnumJsonAdapter.addExtJsonValue(deduction, 2);
        tEnumJsonAdapter.addExtJsonValue("redPacket", 3);
        supportEnum.add(withdraw);
        supportEnum.add("income");
        supportEnum.add(deduction);
        supportEnum.add("redPacket");
        _BalanceOpsType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BalanceOpsType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BalanceOpsType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BalanceOpsType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BalanceOpsType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BalanceOpsType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BalanceOpsType get(String str) {
        Map<String, BalanceOpsType> map = _BalanceOpsType;
        BalanceOpsType balanceOpsType = map.get(str);
        if (balanceOpsType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            balanceOpsType = integer == null ? new BalanceOpsType(str, int_unknown_) : new BalanceOpsType(str, integer.intValue());
            map.put(str, balanceOpsType);
        }
        return balanceOpsType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BalanceOpsType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BalanceOpsType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BalanceOpsType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BalanceOpsType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
