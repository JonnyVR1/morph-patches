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
public class ChatGroupMemberStatus extends TEnum {
    public static final TEnumJsonAdapter<ChatGroupMemberStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ChatGroupMemberStatus> PROTOBUF_ADAPTER;
    private static final Map<String, ChatGroupMemberStatus> _ChatGroupMemberStatus;
    public static final String default_ = "default";
    public static final String exited = "exited";
    private static final int int_default_ = 0;
    private static final int int_exited = 1;
    private static final int int_silenced = 2;
    private static final int int_unknown_ = -1;
    public static final String silenced = "silenced";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ChatGroupMemberStatus> tEnumJsonAdapter = new TEnumJsonAdapter<ChatGroupMemberStatus>() { // from class: com.p1.mobile.putong.core.data.ChatGroupMemberStatus.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ChatGroupMemberStatus newTEnum(String str, int i) {
                return ChatGroupMemberStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ChatGroupMemberStatus>() { // from class: com.p1.mobile.putong.core.data.ChatGroupMemberStatus.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ChatGroupMemberStatus newTEnum(String str, int i) {
                return ChatGroupMemberStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue(exited, 1);
        tEnumJsonAdapter.addExtJsonValue(silenced, 2);
        supportEnum.add("default");
        supportEnum.add(exited);
        supportEnum.add(silenced);
        _ChatGroupMemberStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ChatGroupMemberStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ChatGroupMemberStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ChatGroupMemberStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ChatGroupMemberStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ChatGroupMemberStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ChatGroupMemberStatus get(String str) {
        Map<String, ChatGroupMemberStatus> map = _ChatGroupMemberStatus;
        ChatGroupMemberStatus chatGroupMemberStatus = map.get(str);
        if (chatGroupMemberStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            chatGroupMemberStatus = integer == null ? new ChatGroupMemberStatus(str, -1) : new ChatGroupMemberStatus(str, integer.intValue());
            map.put(str, chatGroupMemberStatus);
        }
        return chatGroupMemberStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ChatGroupMemberStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ChatGroupMemberStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ChatGroupMemberStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ChatGroupMemberStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
