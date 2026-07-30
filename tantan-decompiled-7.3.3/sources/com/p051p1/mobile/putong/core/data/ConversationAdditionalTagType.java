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
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ConversationAdditionalTagType newTEnum(String str, int i) {
                return ConversationAdditionalTagType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ConversationAdditionalTagType>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalTagType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ConversationAdditionalTagType newTEnum(String str, int i) {
                return ConversationAdditionalTagType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(oneside);
        supportEnum.add("birthday");
        supportEnum.add(newuser);
        _ConversationAdditionalTagType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ConversationAdditionalTagType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
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
        l01 l01Var = new l01();
        for (Map.Entry<String, ConversationAdditionalTagType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ConversationAdditionalTagType get(String str) {
        Map<String, ConversationAdditionalTagType> map = _ConversationAdditionalTagType;
        ConversationAdditionalTagType conversationAdditionalTagType = map.get(str);
        if (conversationAdditionalTagType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            conversationAdditionalTagType = integer == null ? new ConversationAdditionalTagType(str, -1) : new ConversationAdditionalTagType(str, integer.intValue());
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
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ConversationAdditionalTagType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ConversationAdditionalTagType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
