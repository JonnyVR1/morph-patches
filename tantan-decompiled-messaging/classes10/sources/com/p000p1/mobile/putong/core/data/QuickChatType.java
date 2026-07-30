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
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public QuickChatType m15187newTEnum(String str, int i) {
                return QuickChatType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<QuickChatType>() { // from class: com.p1.mobile.putong.core.data.QuickChatType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public QuickChatType m15188newTEnum(String str, int i) {
                return QuickChatType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("card");
        supportEnum.add(card_dau);
        supportEnum.add(grab_dau);
        _QuickChatType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private QuickChatType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
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
            quickChatType = integer == null ? new QuickChatType(str, int_unknown_) : new QuickChatType(str, integer.intValue());
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
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, QuickChatType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static QuickChatType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
