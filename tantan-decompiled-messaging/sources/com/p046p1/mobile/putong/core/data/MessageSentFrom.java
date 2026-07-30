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
public class MessageSentFrom extends TEnum {
    public static final TEnumJsonAdapter<MessageSentFrom> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MessageSentFrom> PROTOBUF_ADAPTER;
    private static final Map<String, MessageSentFrom> _MessageSentFrom;
    public static final String apple_watch = "apple_watch";
    private static final int int_apple_watch = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MessageSentFrom> tEnumJsonAdapter = new TEnumJsonAdapter<MessageSentFrom>() { // from class: com.p1.mobile.putong.core.data.MessageSentFrom.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MessageSentFrom newTEnum(String str, int i) {
                return MessageSentFrom.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MessageSentFrom>() { // from class: com.p1.mobile.putong.core.data.MessageSentFrom.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MessageSentFrom newTEnum(String str, int i) {
                return MessageSentFrom.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(apple_watch, 0);
        supportEnum.add(apple_watch);
        _MessageSentFrom = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MessageSentFrom(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MessageSentFrom> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MessageSentFrom> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MessageSentFrom> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MessageSentFrom> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MessageSentFrom get(String str) {
        Map<String, MessageSentFrom> map = _MessageSentFrom;
        MessageSentFrom messageSentFrom = map.get(str);
        if (messageSentFrom == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            messageSentFrom = integer == null ? new MessageSentFrom(str, -1) : new MessageSentFrom(str, integer.intValue());
            map.put(str, messageSentFrom);
        }
        return messageSentFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MessageSentFrom getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MessageSentFrom> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MessageSentFrom> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MessageSentFrom get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
