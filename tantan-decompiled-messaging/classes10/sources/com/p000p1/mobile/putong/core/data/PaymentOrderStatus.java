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
public class PaymentOrderStatus extends TEnum {
    public static final TEnumJsonAdapter<PaymentOrderStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PaymentOrderStatus> PROTOBUF_ADAPTER;
    private static final Map<String, PaymentOrderStatus> _PaymentOrderStatus;
    public static final String failed = "failed";
    private static final int int_failed = 2;
    private static final int int_pending = 3;
    private static final int int_processing = 0;
    private static final int int_success = 1;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    public static final String processing = "processing";
    public static final String success = "success";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PaymentOrderStatus> tEnumJsonAdapter = new TEnumJsonAdapter<PaymentOrderStatus>() { // from class: com.p1.mobile.putong.core.data.PaymentOrderStatus.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PaymentOrderStatus m14733newTEnum(String str, int i) {
                return PaymentOrderStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PaymentOrderStatus>() { // from class: com.p1.mobile.putong.core.data.PaymentOrderStatus.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PaymentOrderStatus m14734newTEnum(String str, int i) {
                return PaymentOrderStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(processing, int_processing);
        tEnumJsonAdapter.addExtJsonValue("success", 1);
        tEnumJsonAdapter.addExtJsonValue("failed", 2);
        tEnumJsonAdapter.addExtJsonValue("pending", 3);
        supportEnum.add(processing);
        supportEnum.add("success");
        supportEnum.add("failed");
        supportEnum.add("pending");
        _PaymentOrderStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private PaymentOrderStatus(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PaymentOrderStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PaymentOrderStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PaymentOrderStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, PaymentOrderStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static PaymentOrderStatus get(String str) {
        Map<String, PaymentOrderStatus> map = _PaymentOrderStatus;
        PaymentOrderStatus paymentOrderStatus = map.get(str);
        if (paymentOrderStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            paymentOrderStatus = integer == null ? new PaymentOrderStatus(str, int_unknown_) : new PaymentOrderStatus(str, integer.intValue());
            map.put(str, paymentOrderStatus);
        }
        return paymentOrderStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PaymentOrderStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PaymentOrderStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PaymentOrderStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PaymentOrderStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
