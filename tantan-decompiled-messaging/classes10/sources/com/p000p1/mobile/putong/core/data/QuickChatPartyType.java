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
public class QuickChatPartyType extends TEnum {
    public static final TEnumJsonAdapter<QuickChatPartyType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<QuickChatPartyType> PROTOBUF_ADAPTER;
    private static final Map<String, QuickChatPartyType> _QuickChatPartyType;
    private static final int int_unknown_ = -1;
    public static final String quickchat = "quickchat";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String voiceQuickchat = "voiceQuickchat";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<QuickChatPartyType> tEnumJsonAdapter = new TEnumJsonAdapter<QuickChatPartyType>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public QuickChatPartyType m15185newTEnum(String str, int i) {
                return QuickChatPartyType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<QuickChatPartyType>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public QuickChatPartyType m15186newTEnum(String str, int i) {
                return QuickChatPartyType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("quickchat");
        supportEnum.add(voiceQuickchat);
        _QuickChatPartyType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private QuickChatPartyType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<QuickChatPartyType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<QuickChatPartyType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, QuickChatPartyType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, QuickChatPartyType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static QuickChatPartyType get(String str) {
        Map<String, QuickChatPartyType> map = _QuickChatPartyType;
        QuickChatPartyType quickChatPartyType = map.get(str);
        if (quickChatPartyType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            quickChatPartyType = integer == null ? new QuickChatPartyType(str, int_unknown_) : new QuickChatPartyType(str, integer.intValue());
            map.put(str, quickChatPartyType);
        }
        return quickChatPartyType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static QuickChatPartyType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<QuickChatPartyType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, QuickChatPartyType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static QuickChatPartyType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
