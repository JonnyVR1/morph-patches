package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class ProductType extends TEnum {
    public static final TEnumJsonAdapter<ProductType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ProductType> PROTOBUF_ADAPTER;
    private static final Map<String, ProductType> _ProductType;
    public static final String auto_renewable = "auto-renewable";
    public static final String consumable = "consumable";
    private static final int int_auto_renewable = 1;
    private static final int int_consumable = 0;
    private static final int int_none_renewing = 2;
    private static final int int_unknown_ = -1;
    public static final String none_renewing = "none-renewing";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ProductType> tEnumJsonAdapter = new TEnumJsonAdapter<ProductType>() { // from class: com.p1.mobile.putong.core.data.ProductType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ProductType newTEnum(String str, int i) {
                return ProductType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ProductType>() { // from class: com.p1.mobile.putong.core.data.ProductType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ProductType newTEnum(String str, int i) {
                return ProductType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("consumable", 0);
        tEnumJsonAdapter.addExtJsonValue("auto-renewable", 1);
        tEnumJsonAdapter.addExtJsonValue("none-renewing", 2);
        supportEnum.add("consumable");
        supportEnum.add("auto-renewable");
        supportEnum.add("none-renewing");
        _ProductType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ProductType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ProductType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProductType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ProductType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ProductType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ProductType get(String str) {
        Map<String, ProductType> map = _ProductType;
        ProductType productType = map.get(str);
        if (productType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            productType = integer == null ? new ProductType(str, -1) : new ProductType(str, integer.intValue());
            map.put(str, productType);
        }
        return productType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProductType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ProductType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ProductType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ProductType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
