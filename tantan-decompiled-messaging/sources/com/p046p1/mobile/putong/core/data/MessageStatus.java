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
public class MessageStatus extends TEnum {
    public static final TEnumJsonAdapter<MessageStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MessageStatus> PROTOBUF_ADAPTER;
    private static final Map<String, MessageStatus> _MessageStatus;
    public static final String default_ = "default";
    public static final String deleted = "deleted";
    private static final int int_default_ = 1;
    private static final int int_deleted = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MessageStatus> tEnumJsonAdapter = new TEnumJsonAdapter<MessageStatus>() { // from class: com.p1.mobile.putong.core.data.MessageStatus.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MessageStatus newTEnum(String str, int i) {
                return MessageStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MessageStatus>() { // from class: com.p1.mobile.putong.core.data.MessageStatus.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MessageStatus newTEnum(String str, int i) {
                return MessageStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("deleted", 0);
        tEnumJsonAdapter.addExtJsonValue("default", 1);
        supportEnum.add("deleted");
        supportEnum.add("default");
        _MessageStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MessageStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MessageStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MessageStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MessageStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MessageStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MessageStatus get(String str) {
        Map<String, MessageStatus> map = _MessageStatus;
        MessageStatus messageStatus = map.get(str);
        if (messageStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            messageStatus = integer == null ? new MessageStatus(str, -1) : new MessageStatus(str, integer.intValue());
            map.put(str, messageStatus);
        }
        return messageStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MessageStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MessageStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MessageStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MessageStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
