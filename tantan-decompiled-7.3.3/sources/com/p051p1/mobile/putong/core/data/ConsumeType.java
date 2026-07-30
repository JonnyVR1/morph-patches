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
public class ConsumeType extends TEnum {
    public static final TEnumJsonAdapter<ConsumeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ConsumeType> PROTOBUF_ADAPTER;
    private static final Map<String, ConsumeType> _ConsumeType;
    public static final String all = "all";
    public static final String coin = "coin";
    public static final String diamond = "diamond";
    public static final String free = "free";
    public static final String handsel = "handsel";
    private static final int int_unknown_ = -1;
    public static final String privilege = "privilege";
    protected static HashSet<String> supportEnum = null;
    public static final String text = "text";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ConsumeType> tEnumJsonAdapter = new TEnumJsonAdapter<ConsumeType>() { // from class: com.p1.mobile.putong.core.data.ConsumeType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ConsumeType newTEnum(String str, int i) {
                return ConsumeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ConsumeType>() { // from class: com.p1.mobile.putong.core.data.ConsumeType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ConsumeType newTEnum(String str, int i) {
                return ConsumeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("privilege");
        supportEnum.add("coin");
        supportEnum.add("free");
        supportEnum.add(handsel);
        supportEnum.add("text");
        supportEnum.add("all");
        supportEnum.add("diamond");
        _ConsumeType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ConsumeType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ConsumeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConsumeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ConsumeType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ConsumeType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ConsumeType get(String str) {
        Map<String, ConsumeType> map = _ConsumeType;
        ConsumeType consumeType = map.get(str);
        if (consumeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            consumeType = integer == null ? new ConsumeType(str, -1) : new ConsumeType(str, integer.intValue());
            map.put(str, consumeType);
        }
        return consumeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConsumeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ConsumeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ConsumeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ConsumeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
