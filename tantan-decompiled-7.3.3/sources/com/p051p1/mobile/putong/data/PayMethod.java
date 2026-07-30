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
public class PayMethod extends TEnum {
    public static final TEnumJsonAdapter<PayMethod> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PayMethod> PROTOBUF_ADAPTER;
    private static final Map<String, PayMethod> _PayMethod;
    public static final String alipay = "alipay";
    public static final String default_ = "default";
    public static final String huabei = "huabei";
    private static final int int_alipay = 1;
    private static final int int_default_ = 3;
    private static final int int_huabei = 2;
    private static final int int_unknown_ = -1;
    private static final int int_wechat = 0;
    public static final String jingdong = "jingdong";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String wechat = "wechat";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PayMethod> tEnumJsonAdapter = new TEnumJsonAdapter<PayMethod>() { // from class: com.p1.mobile.putong.data.PayMethod.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public PayMethod newTEnum(String str, int i) {
                return PayMethod.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PayMethod>() { // from class: com.p1.mobile.putong.data.PayMethod.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public PayMethod newTEnum(String str, int i) {
                return PayMethod.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("wechat", 0);
        tEnumJsonAdapter.addExtJsonValue("alipay", 1);
        tEnumJsonAdapter.addExtJsonValue(huabei, 2);
        tEnumJsonAdapter.addExtJsonValue("default", 3);
        supportEnum.add("wechat");
        supportEnum.add("alipay");
        supportEnum.add(huabei);
        supportEnum.add("default");
        supportEnum.add(jingdong);
        _PayMethod = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private PayMethod(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PayMethod> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PayMethod> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PayMethod> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, PayMethod> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static PayMethod get(String str) {
        Map<String, PayMethod> map = _PayMethod;
        PayMethod payMethod = map.get(str);
        if (payMethod == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            payMethod = integer == null ? new PayMethod(str, -1) : new PayMethod(str, integer.intValue());
            map.put(str, payMethod);
        }
        return payMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PayMethod getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<PayMethod> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PayMethod> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static PayMethod get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
