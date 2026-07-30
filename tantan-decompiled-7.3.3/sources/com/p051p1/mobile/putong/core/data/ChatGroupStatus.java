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
public class ChatGroupStatus extends TEnum {
    public static final TEnumJsonAdapter<ChatGroupStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ChatGroupStatus> PROTOBUF_ADAPTER;
    private static final Map<String, ChatGroupStatus> _ChatGroupStatus;
    public static final String banned = "banned";
    public static final String default_ = "default";
    public static final String deleted = "deleted";
    public static final String disbanded = "disbanded";
    public static final String dismissed = "dismissed";
    private static final int int_banned = 1;
    private static final int int_default_ = 0;
    private static final int int_disbanded = 3;
    private static final int int_dismissed = 2;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ChatGroupStatus> tEnumJsonAdapter = new TEnumJsonAdapter<ChatGroupStatus>() { // from class: com.p1.mobile.putong.core.data.ChatGroupStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ChatGroupStatus newTEnum(String str, int i) {
                return ChatGroupStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ChatGroupStatus>() { // from class: com.p1.mobile.putong.core.data.ChatGroupStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ChatGroupStatus newTEnum(String str, int i) {
                return ChatGroupStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue(banned, 1);
        tEnumJsonAdapter.addExtJsonValue("dismissed", 2);
        tEnumJsonAdapter.addExtJsonValue(disbanded, 3);
        supportEnum.add("default");
        supportEnum.add(banned);
        supportEnum.add("dismissed");
        supportEnum.add(disbanded);
        supportEnum.add("pending");
        supportEnum.add("deleted");
        _ChatGroupStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ChatGroupStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ChatGroupStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ChatGroupStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ChatGroupStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ChatGroupStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ChatGroupStatus get(String str) {
        Map<String, ChatGroupStatus> map = _ChatGroupStatus;
        ChatGroupStatus chatGroupStatus = map.get(str);
        if (chatGroupStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            chatGroupStatus = integer == null ? new ChatGroupStatus(str, -1) : new ChatGroupStatus(str, integer.intValue());
            map.put(str, chatGroupStatus);
        }
        return chatGroupStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ChatGroupStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ChatGroupStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ChatGroupStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ChatGroupStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
