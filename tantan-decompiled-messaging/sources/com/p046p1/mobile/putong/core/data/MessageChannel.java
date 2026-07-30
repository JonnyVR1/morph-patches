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
public class MessageChannel extends TEnum {
    public static final TEnumJsonAdapter<MessageChannel> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MessageChannel> PROTOBUF_ADAPTER;
    private static final Map<String, MessageChannel> _MessageChannel;
    public static final String anonymous = "anonymous";
    public static final String birthdayGreeting = "birthdayGreeting";
    public static final String default_ = "default";
    public static final String group = "group";
    private static final int int_default_ = 1;
    private static final int int_group = 0;
    private static final int int_unknown_ = -1;
    public static final String state = "state";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MessageChannel> tEnumJsonAdapter = new TEnumJsonAdapter<MessageChannel>() { // from class: com.p1.mobile.putong.core.data.MessageChannel.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MessageChannel newTEnum(String str, int i) {
                return MessageChannel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MessageChannel>() { // from class: com.p1.mobile.putong.core.data.MessageChannel.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MessageChannel newTEnum(String str, int i) {
                return MessageChannel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("group", 0);
        tEnumJsonAdapter.addExtJsonValue("default", 1);
        supportEnum.add("group");
        supportEnum.add("default");
        supportEnum.add(birthdayGreeting);
        supportEnum.add("anonymous");
        supportEnum.add("state");
        _MessageChannel = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MessageChannel(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MessageChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MessageChannel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MessageChannel> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MessageChannel> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MessageChannel get(String str) {
        Map<String, MessageChannel> map = _MessageChannel;
        MessageChannel messageChannel = map.get(str);
        if (messageChannel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            messageChannel = integer == null ? new MessageChannel(str, -1) : new MessageChannel(str, integer.intValue());
            map.put(str, messageChannel);
        }
        return messageChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MessageChannel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MessageChannel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MessageChannel> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MessageChannel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
