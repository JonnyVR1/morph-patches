package com.p051p1.mobile.putong.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes12.dex */
public class PaymentContractStatus extends TEnum {
    public static final TEnumJsonAdapter<PaymentContractStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PaymentContractStatus> PROTOBUF_ADAPTER;
    private static final Map<String, PaymentContractStatus> _PaymentContractStatus;
    public static final String canceled = "canceled";
    public static final String failed = "failed";
    private static final int int_canceled = 0;
    private static final int int_failed = 2;
    private static final int int_signing = 1;
    private static final int int_unknown_ = -1;
    public static final String signing = "signing";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PaymentContractStatus> tEnumJsonAdapter = new TEnumJsonAdapter<PaymentContractStatus>() { // from class: com.p1.mobile.putong.data.PaymentContractStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public PaymentContractStatus newTEnum(String str, int i) {
                return PaymentContractStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PaymentContractStatus>() { // from class: com.p1.mobile.putong.data.PaymentContractStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public PaymentContractStatus newTEnum(String str, int i) {
                return PaymentContractStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("canceled", 0);
        tEnumJsonAdapter.addExtJsonValue("signing", 1);
        tEnumJsonAdapter.addExtJsonValue("failed", 2);
        supportEnum.add("canceled");
        supportEnum.add("signing");
        supportEnum.add("failed");
        _PaymentContractStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private PaymentContractStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PaymentContractStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PaymentContractStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PaymentContractStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, PaymentContractStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static PaymentContractStatus get(String str) {
        Map<String, PaymentContractStatus> map = _PaymentContractStatus;
        PaymentContractStatus paymentContractStatus = map.get(str);
        if (paymentContractStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            paymentContractStatus = integer == null ? new PaymentContractStatus(str, -1) : new PaymentContractStatus(str, integer.intValue());
            map.put(str, paymentContractStatus);
        }
        return paymentContractStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PaymentContractStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PaymentContractStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PaymentContractStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PaymentContractStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
