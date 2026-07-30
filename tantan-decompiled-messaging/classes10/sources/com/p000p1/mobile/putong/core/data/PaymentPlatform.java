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
public class PaymentPlatform extends TEnum {
    public static final TEnumJsonAdapter<PaymentPlatform> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PaymentPlatform> PROTOBUF_ADAPTER;
    private static final Map<String, PaymentPlatform> _PaymentPlatform;
    public static final String alipay = "alipay";
    private static final int int_alipay = 1;
    private static final int int_unknown_ = -1;
    private static final int int_wechat = 0;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String wechat = "wechat";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PaymentPlatform> tEnumJsonAdapter = new TEnumJsonAdapter<PaymentPlatform>() { // from class: com.p1.mobile.putong.core.data.PaymentPlatform.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PaymentPlatform m14735newTEnum(String str, int i) {
                return PaymentPlatform.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PaymentPlatform>() { // from class: com.p1.mobile.putong.core.data.PaymentPlatform.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PaymentPlatform m14736newTEnum(String str, int i) {
                return PaymentPlatform.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(wechat, int_wechat);
        tEnumJsonAdapter.addExtJsonValue(alipay, 1);
        supportEnum.add(wechat);
        supportEnum.add(alipay);
        _PaymentPlatform = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private PaymentPlatform(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PaymentPlatform> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PaymentPlatform> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PaymentPlatform> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, PaymentPlatform> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static PaymentPlatform get(String str) {
        Map<String, PaymentPlatform> map = _PaymentPlatform;
        PaymentPlatform paymentPlatform = map.get(str);
        if (paymentPlatform == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            paymentPlatform = integer == null ? new PaymentPlatform(str, int_unknown_) : new PaymentPlatform(str, integer.intValue());
            map.put(str, paymentPlatform);
        }
        return paymentPlatform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PaymentPlatform getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PaymentPlatform> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PaymentPlatform> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PaymentPlatform get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
