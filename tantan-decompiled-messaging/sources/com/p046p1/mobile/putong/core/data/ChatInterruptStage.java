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
public class ChatInterruptStage extends TEnum {
    public static final TEnumJsonAdapter<ChatInterruptStage> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ChatInterruptStage> PROTOBUF_ADAPTER;
    private static final Map<String, ChatInterruptStage> _ChatInterruptStage;
    private static final int int_locked = 0;
    private static final int int_prelocked = 1;
    private static final int int_unknown_ = -1;
    public static final String locked = "locked";
    public static final String prelocked = "prelocked";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ChatInterruptStage> tEnumJsonAdapter = new TEnumJsonAdapter<ChatInterruptStage>() { // from class: com.p1.mobile.putong.core.data.ChatInterruptStage.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ChatInterruptStage newTEnum(String str, int i) {
                return ChatInterruptStage.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ChatInterruptStage>() { // from class: com.p1.mobile.putong.core.data.ChatInterruptStage.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ChatInterruptStage newTEnum(String str, int i) {
                return ChatInterruptStage.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("locked", 0);
        tEnumJsonAdapter.addExtJsonValue(prelocked, 1);
        supportEnum.add("locked");
        supportEnum.add(prelocked);
        _ChatInterruptStage = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ChatInterruptStage(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ChatInterruptStage> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ChatInterruptStage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ChatInterruptStage> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ChatInterruptStage> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ChatInterruptStage get(String str) {
        Map<String, ChatInterruptStage> map = _ChatInterruptStage;
        ChatInterruptStage chatInterruptStage = map.get(str);
        if (chatInterruptStage == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            chatInterruptStage = integer == null ? new ChatInterruptStage(str, -1) : new ChatInterruptStage(str, integer.intValue());
            map.put(str, chatInterruptStage);
        }
        return chatInterruptStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ChatInterruptStage getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ChatInterruptStage> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ChatInterruptStage> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ChatInterruptStage get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
