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
public class QuickChatType extends TEnum {
    public static final TEnumJsonAdapter<QuickChatType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<QuickChatType> PROTOBUF_ADAPTER;
    private static final Map<String, QuickChatType> _QuickChatType;
    public static final String card = "card";
    public static final String card_dau = "card-dau";
    public static final String grab_dau = "grab-dau";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<QuickChatType> tEnumJsonAdapter = new TEnumJsonAdapter<QuickChatType>() { // from class: com.p1.mobile.putong.core.data.QuickChatType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public QuickChatType newTEnum(String str, int i) {
                return QuickChatType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<QuickChatType>() { // from class: com.p1.mobile.putong.core.data.QuickChatType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public QuickChatType newTEnum(String str, int i) {
                return QuickChatType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("card");
        supportEnum.add(card_dau);
        supportEnum.add(grab_dau);
        _QuickChatType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private QuickChatType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<QuickChatType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<QuickChatType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, QuickChatType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, QuickChatType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static QuickChatType get(String str) {
        Map<String, QuickChatType> map = _QuickChatType;
        QuickChatType quickChatType = map.get(str);
        if (quickChatType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            quickChatType = integer == null ? new QuickChatType(str, -1) : new QuickChatType(str, integer.intValue());
            map.put(str, quickChatType);
        }
        return quickChatType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static QuickChatType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<QuickChatType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, QuickChatType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static QuickChatType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
