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
public class ConversationSubChannel extends TEnum {
    public static final TEnumJsonAdapter<ConversationSubChannel> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ConversationSubChannel> PROTOBUF_ADAPTER;
    private static final Map<String, ConversationSubChannel> _ConversationSubChannel;
    public static final String gift = "gift";
    private static final int int_gift = 0;
    private static final int int_intlSvipLetterC = 1;
    private static final int int_unknown_ = -1;
    public static final String intlSvipLetterC = "intlSvipLetterC";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ConversationSubChannel> tEnumJsonAdapter = new TEnumJsonAdapter<ConversationSubChannel>() { // from class: com.p1.mobile.putong.core.data.ConversationSubChannel.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ConversationSubChannel m12431newTEnum(String str, int i) {
                return ConversationSubChannel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ConversationSubChannel>() { // from class: com.p1.mobile.putong.core.data.ConversationSubChannel.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ConversationSubChannel m12432newTEnum(String str, int i) {
                return ConversationSubChannel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("gift", int_gift);
        tEnumJsonAdapter.addExtJsonValue(intlSvipLetterC, 1);
        supportEnum.add("gift");
        supportEnum.add(intlSvipLetterC);
        _ConversationSubChannel = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ConversationSubChannel(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ConversationSubChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationSubChannel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ConversationSubChannel> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ConversationSubChannel> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ConversationSubChannel get(String str) {
        Map<String, ConversationSubChannel> map = _ConversationSubChannel;
        ConversationSubChannel conversationSubChannel = map.get(str);
        if (conversationSubChannel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            conversationSubChannel = integer == null ? new ConversationSubChannel(str, int_unknown_) : new ConversationSubChannel(str, integer.intValue());
            map.put(str, conversationSubChannel);
        }
        return conversationSubChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConversationSubChannel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ConversationSubChannel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ConversationSubChannel> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ConversationSubChannel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
