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
public class PurchaseDialogConfigTriggerShowType extends TEnum {
    public static final TEnumJsonAdapter<PurchaseDialogConfigTriggerShowType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PurchaseDialogConfigTriggerShowType> PROTOBUF_ADAPTER;
    private static final Map<String, PurchaseDialogConfigTriggerShowType> _PurchaseDialogConfigTriggerShowType;
    private static final int int_svip = 1;
    private static final int int_unknown_ = -1;
    private static final int int_vip_svip = 0;
    protected static HashSet<String> supportEnum = null;
    public static final String svip = "svip";
    public static final String unknown_ = "unknown_";
    public static final String vip = "vip";
    public static final String vip_svip = "vip-svip";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PurchaseDialogConfigTriggerShowType> tEnumJsonAdapter = new TEnumJsonAdapter<PurchaseDialogConfigTriggerShowType>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public PurchaseDialogConfigTriggerShowType newTEnum(String str, int i) {
                return PurchaseDialogConfigTriggerShowType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PurchaseDialogConfigTriggerShowType>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public PurchaseDialogConfigTriggerShowType newTEnum(String str, int i) {
                return PurchaseDialogConfigTriggerShowType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(vip_svip, 0);
        tEnumJsonAdapter.addExtJsonValue("svip", 1);
        supportEnum.add(vip_svip);
        supportEnum.add("svip");
        supportEnum.add("vip");
        _PurchaseDialogConfigTriggerShowType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private PurchaseDialogConfigTriggerShowType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PurchaseDialogConfigTriggerShowType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PurchaseDialogConfigTriggerShowType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PurchaseDialogConfigTriggerShowType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, PurchaseDialogConfigTriggerShowType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static PurchaseDialogConfigTriggerShowType get(String str) {
        Map<String, PurchaseDialogConfigTriggerShowType> map = _PurchaseDialogConfigTriggerShowType;
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = map.get(str);
        if (purchaseDialogConfigTriggerShowType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            purchaseDialogConfigTriggerShowType = integer == null ? new PurchaseDialogConfigTriggerShowType(str, -1) : new PurchaseDialogConfigTriggerShowType(str, integer.intValue());
            map.put(str, purchaseDialogConfigTriggerShowType);
        }
        return purchaseDialogConfigTriggerShowType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PurchaseDialogConfigTriggerShowType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PurchaseDialogConfigTriggerShowType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PurchaseDialogConfigTriggerShowType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PurchaseDialogConfigTriggerShowType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
