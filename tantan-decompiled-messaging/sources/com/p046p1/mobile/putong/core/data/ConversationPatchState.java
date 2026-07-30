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
public class ConversationPatchState extends TEnum {
    public static final TEnumJsonAdapter<ConversationPatchState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ConversationPatchState> PROTOBUF_ADAPTER;
    private static final Map<String, ConversationPatchState> _ConversationPatchState;
    public static final String default_ = "default";
    private static final int int_default_ = 0;
    private static final int int_patching = 1;
    private static final int int_unknown_ = -1;
    public static final String patching = "patching";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ConversationPatchState> tEnumJsonAdapter = new TEnumJsonAdapter<ConversationPatchState>() { // from class: com.p1.mobile.putong.core.data.ConversationPatchState.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ConversationPatchState newTEnum(String str, int i) {
                return ConversationPatchState.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ConversationPatchState>() { // from class: com.p1.mobile.putong.core.data.ConversationPatchState.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ConversationPatchState newTEnum(String str, int i) {
                return ConversationPatchState.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue(patching, 1);
        supportEnum.add("default");
        supportEnum.add(patching);
        _ConversationPatchState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ConversationPatchState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ConversationPatchState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationPatchState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ConversationPatchState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ConversationPatchState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ConversationPatchState get(String str) {
        Map<String, ConversationPatchState> map = _ConversationPatchState;
        ConversationPatchState conversationPatchState = map.get(str);
        if (conversationPatchState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            conversationPatchState = integer == null ? new ConversationPatchState(str, -1) : new ConversationPatchState(str, integer.intValue());
            map.put(str, conversationPatchState);
        }
        return conversationPatchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConversationPatchState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ConversationPatchState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ConversationPatchState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ConversationPatchState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
