package com.p046p1.mobile.putong.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes12.dex */
public class BundleStatus extends TEnum {
    public static final TEnumJsonAdapter<BundleStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BundleStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BundleStatus> _BundleStatus;
    public static final String assumedPurchased = "assumedPurchased";
    public static final String closed = "closed";
    public static final String failed = "failed";
    private static final int int_assumedPurchased = 10;
    private static final int int_closed = 8;
    private static final int int_failed = 5;
    private static final int int_locked = 1;
    private static final int int_pending = 4;
    private static final int int_purchased = 0;
    private static final int int_refunded = 7;
    private static final int int_refunding = 6;
    private static final int int_signing = 9;
    private static final int int_stock = 2;
    private static final int int_success = 3;
    private static final int int_unknown_ = -1;
    public static final String locked = "locked";
    public static final String pending = "pending";
    public static final String purchased = "purchased";
    public static final String refunded = "refunded";
    public static final String refunding = "refunding";
    public static final String signing = "signing";
    public static final String stock = "stock";
    public static final String success = "success";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String userCancel = "userCancel";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BundleStatus> tEnumJsonAdapter = new TEnumJsonAdapter<BundleStatus>() { // from class: com.p1.mobile.putong.data.BundleStatus.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public BundleStatus newTEnum(String str, int i) {
                return BundleStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BundleStatus>() { // from class: com.p1.mobile.putong.data.BundleStatus.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public BundleStatus newTEnum(String str, int i) {
                return BundleStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(purchased, 0);
        tEnumJsonAdapter.addExtJsonValue("locked", 1);
        tEnumJsonAdapter.addExtJsonValue(stock, 2);
        tEnumJsonAdapter.addExtJsonValue("success", 3);
        tEnumJsonAdapter.addExtJsonValue("pending", 4);
        tEnumJsonAdapter.addExtJsonValue("failed", 5);
        tEnumJsonAdapter.addExtJsonValue(refunding, 6);
        tEnumJsonAdapter.addExtJsonValue(refunded, 7);
        tEnumJsonAdapter.addExtJsonValue("closed", 8);
        tEnumJsonAdapter.addExtJsonValue("signing", 9);
        tEnumJsonAdapter.addExtJsonValue(assumedPurchased, 10);
        supportEnum.add(purchased);
        supportEnum.add("locked");
        supportEnum.add(stock);
        supportEnum.add("success");
        supportEnum.add("pending");
        supportEnum.add("failed");
        supportEnum.add(refunding);
        supportEnum.add(refunded);
        supportEnum.add("closed");
        supportEnum.add("signing");
        supportEnum.add(assumedPurchased);
        supportEnum.add(userCancel);
        _BundleStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BundleStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BundleStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BundleStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BundleStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BundleStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BundleStatus get(String str) {
        Map<String, BundleStatus> map = _BundleStatus;
        BundleStatus bundleStatus = map.get(str);
        if (bundleStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bundleStatus = integer == null ? new BundleStatus(str, -1) : new BundleStatus(str, integer.intValue());
            map.put(str, bundleStatus);
        }
        return bundleStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BundleStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BundleStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BundleStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BundleStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
