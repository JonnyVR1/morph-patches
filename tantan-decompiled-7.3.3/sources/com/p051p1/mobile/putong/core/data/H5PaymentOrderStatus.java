package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class H5PaymentOrderStatus extends TEnum {
    public static final String DELIVERED = "DELIVERED";
    public static final String FAILED = "FAILED";
    public static final TEnumJsonAdapter<H5PaymentOrderStatus> JSON_ADAPTER;
    public static final String PAID = "PAID";
    public static final String PENDING = "PENDING";
    public static final TEnumProtobufAdapter<H5PaymentOrderStatus> PROTOBUF_ADAPTER;
    public static final String REFUNDED = "REFUNDED";
    public static final String UNKNOWN = "UNKNOWN";
    private static final Map<String, H5PaymentOrderStatus> _H5PaymentOrderStatus;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<H5PaymentOrderStatus> tEnumJsonAdapter = new TEnumJsonAdapter<H5PaymentOrderStatus>() { // from class: com.p1.mobile.putong.core.data.H5PaymentOrderStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public H5PaymentOrderStatus newTEnum(String str, int i) {
                return H5PaymentOrderStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<H5PaymentOrderStatus>() { // from class: com.p1.mobile.putong.core.data.H5PaymentOrderStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public H5PaymentOrderStatus newTEnum(String str, int i) {
                return H5PaymentOrderStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("UNKNOWN");
        supportEnum.add(PENDING);
        supportEnum.add("FAILED");
        supportEnum.add(PAID);
        supportEnum.add(DELIVERED);
        supportEnum.add(REFUNDED);
        _H5PaymentOrderStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private H5PaymentOrderStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<H5PaymentOrderStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<H5PaymentOrderStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, H5PaymentOrderStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, H5PaymentOrderStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static H5PaymentOrderStatus get(String str) {
        Map<String, H5PaymentOrderStatus> map = _H5PaymentOrderStatus;
        H5PaymentOrderStatus h5PaymentOrderStatus = map.get(str);
        if (h5PaymentOrderStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            h5PaymentOrderStatus = integer == null ? new H5PaymentOrderStatus(str, -1) : new H5PaymentOrderStatus(str, integer.intValue());
            map.put(str, h5PaymentOrderStatus);
        }
        return h5PaymentOrderStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H5PaymentOrderStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<H5PaymentOrderStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, H5PaymentOrderStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static H5PaymentOrderStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
