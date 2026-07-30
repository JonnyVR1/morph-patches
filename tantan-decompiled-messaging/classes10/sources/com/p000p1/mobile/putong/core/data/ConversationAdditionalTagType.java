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
public class ConversationAdditionalTagType extends TEnum {
    public static final TEnumJsonAdapter<ConversationAdditionalTagType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ConversationAdditionalTagType> PROTOBUF_ADAPTER;
    private static final Map<String, ConversationAdditionalTagType> _ConversationAdditionalTagType;
    public static final String birthday = "birthday";
    private static final int int_unknown_ = -1;
    public static final String newuser = "newuser";
    public static final String oneside = "oneside";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ConversationAdditionalTagType> tEnumJsonAdapter = new TEnumJsonAdapter<ConversationAdditionalTagType>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalTagType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ConversationAdditionalTagType m12349newTEnum(String str, int i) {
                return ConversationAdditionalTagType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ConversationAdditionalTagType>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalTagType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ConversationAdditionalTagType m12350newTEnum(String str, int i) {
                return ConversationAdditionalTagType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(oneside);
        supportEnum.add("birthday");
        supportEnum.add(newuser);
        _ConversationAdditionalTagType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ConversationAdditionalTagType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ConversationAdditionalTagType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationAdditionalTagType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ConversationAdditionalTagType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ConversationAdditionalTagType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ConversationAdditionalTagType get(String str) {
        Map<String, ConversationAdditionalTagType> map = _ConversationAdditionalTagType;
        ConversationAdditionalTagType conversationAdditionalTagType = map.get(str);
        if (conversationAdditionalTagType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            conversationAdditionalTagType = integer == null ? new ConversationAdditionalTagType(str, int_unknown_) : new ConversationAdditionalTagType(str, integer.intValue());
            map.put(str, conversationAdditionalTagType);
        }
        return conversationAdditionalTagType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConversationAdditionalTagType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ConversationAdditionalTagType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ConversationAdditionalTagType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ConversationAdditionalTagType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
