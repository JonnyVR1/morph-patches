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
public class MonetizationPromotionsId extends TEnum {
    public static final TEnumJsonAdapter<MonetizationPromotionsId> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MonetizationPromotionsId> PROTOBUF_ADAPTER;
    private static final Map<String, MonetizationPromotionsId> _MonetizationPromotionsId;
    public static final String giftDurationSVIP = "giftDurationSVIP";
    private static final int int_lowPrice3Month = 3;
    private static final int int_lowPriceCallback3SVIP = 2;
    private static final int int_lowPriceCallback3VIP = 1;
    private static final int int_lowPriceCustomerSVIP = 4;
    private static final int int_lowPriceCustomerVIP = 5;
    private static final int int_lowPriceFirstMonth = 0;
    private static final int int_lowPriceSVIPPicks = 6;
    private static final int int_unknown_ = -1;
    public static final String lowPrice3Month = "lowPrice3Month";
    public static final String lowPriceCallback3SVIP = "lowPriceCallback3SVIP";
    public static final String lowPriceCallback3VIP = "lowPriceCallback3VIP";
    public static final String lowPriceCustomerFemaleVIP = "lowPriceCustomerFemaleVIP";
    public static final String lowPriceCustomerSVIP = "lowPriceCustomerSVIP";
    public static final String lowPriceCustomerUpliftSVIP = "lowPriceCustomerUpliftSVIP";
    public static final String lowPriceCustomerVIP = "lowPriceCustomerVIP";
    public static final String lowPriceFirstMonth = "lowPriceFirstMonth";
    public static final String lowPriceFirstTime12MSVIP = "lowPriceFirstTime12MSVIP";
    public static final String lowPriceODiamond = "lowPriceODiamond";
    public static final String lowPriceSVIPPicks = "lowPriceSVIPPicks";
    protected static HashSet<String> supportEnum = null;
    public static final String trial7DSVIP = "trial7DSVIP";
    public static final String trial7DVIP = "trial7DVIP";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MonetizationPromotionsId> tEnumJsonAdapter = new TEnumJsonAdapter<MonetizationPromotionsId>() { // from class: com.p1.mobile.putong.core.data.MonetizationPromotionsId.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public MonetizationPromotionsId m14381newTEnum(String str, int i) {
                return MonetizationPromotionsId.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MonetizationPromotionsId>() { // from class: com.p1.mobile.putong.core.data.MonetizationPromotionsId.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public MonetizationPromotionsId m14382newTEnum(String str, int i) {
                return MonetizationPromotionsId.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(lowPriceFirstMonth, int_lowPriceFirstMonth);
        tEnumJsonAdapter.addExtJsonValue(lowPriceCallback3VIP, 1);
        tEnumJsonAdapter.addExtJsonValue(lowPriceCallback3SVIP, 2);
        tEnumJsonAdapter.addExtJsonValue(lowPrice3Month, 3);
        tEnumJsonAdapter.addExtJsonValue(lowPriceCustomerSVIP, int_lowPriceCustomerSVIP);
        tEnumJsonAdapter.addExtJsonValue(lowPriceCustomerVIP, 5);
        tEnumJsonAdapter.addExtJsonValue(lowPriceSVIPPicks, int_lowPriceSVIPPicks);
        supportEnum.add(lowPriceFirstMonth);
        supportEnum.add(lowPriceCallback3VIP);
        supportEnum.add(lowPriceCallback3SVIP);
        supportEnum.add(lowPrice3Month);
        supportEnum.add(lowPriceCustomerSVIP);
        supportEnum.add(lowPriceCustomerVIP);
        supportEnum.add(lowPriceSVIPPicks);
        supportEnum.add(trial7DSVIP);
        supportEnum.add(lowPriceFirstTime12MSVIP);
        supportEnum.add(trial7DVIP);
        supportEnum.add(giftDurationSVIP);
        supportEnum.add(lowPriceCustomerFemaleVIP);
        supportEnum.add(lowPriceODiamond);
        supportEnum.add(lowPriceCustomerUpliftSVIP);
        _MonetizationPromotionsId = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MonetizationPromotionsId(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MonetizationPromotionsId> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MonetizationPromotionsId> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MonetizationPromotionsId> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MonetizationPromotionsId> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MonetizationPromotionsId get(String str) {
        Map<String, MonetizationPromotionsId> map = _MonetizationPromotionsId;
        MonetizationPromotionsId monetizationPromotionsId = map.get(str);
        if (monetizationPromotionsId == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            monetizationPromotionsId = integer == null ? new MonetizationPromotionsId(str, int_unknown_) : new MonetizationPromotionsId(str, integer.intValue());
            map.put(str, monetizationPromotionsId);
        }
        return monetizationPromotionsId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MonetizationPromotionsId getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MonetizationPromotionsId> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MonetizationPromotionsId> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MonetizationPromotionsId get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
