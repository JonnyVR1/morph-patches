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
public class ChatBlockStatus extends TEnum {
    public static final String BOTH_USED_UP_LOCKED = "BOTH_USED_UP_LOCKED";
    public static final TEnumJsonAdapter<ChatBlockStatus> JSON_ADAPTER;
    public static final String OTHER_USER_USED_UP_LOCKED = "OTHER_USER_USED_UP_LOCKED";
    public static final TEnumProtobufAdapter<ChatBlockStatus> PROTOBUF_ADAPTER;
    public static final String UNLOCKED = "UNLOCKED";
    public static final String USER_USED_UP_LOCKED = "USER_USED_UP_LOCKED";
    private static final Map<String, ChatBlockStatus> _ChatBlockStatus;
    private static final int int_BOTH_USED_UP_LOCKED = 3;
    private static final int int_OTHER_USER_USED_UP_LOCKED = 2;
    private static final int int_UNLOCKED = 0;
    private static final int int_USER_USED_UP_LOCKED = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ChatBlockStatus> tEnumJsonAdapter = new TEnumJsonAdapter<ChatBlockStatus>() { // from class: com.p1.mobile.putong.core.data.ChatBlockStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ChatBlockStatus newTEnum(String str, int i) {
                return ChatBlockStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ChatBlockStatus>() { // from class: com.p1.mobile.putong.core.data.ChatBlockStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ChatBlockStatus newTEnum(String str, int i) {
                return ChatBlockStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(UNLOCKED, 0);
        tEnumJsonAdapter.addExtJsonValue(USER_USED_UP_LOCKED, 1);
        tEnumJsonAdapter.addExtJsonValue(OTHER_USER_USED_UP_LOCKED, 2);
        tEnumJsonAdapter.addExtJsonValue(BOTH_USED_UP_LOCKED, 3);
        supportEnum.add(UNLOCKED);
        supportEnum.add(USER_USED_UP_LOCKED);
        supportEnum.add(OTHER_USER_USED_UP_LOCKED);
        supportEnum.add(BOTH_USED_UP_LOCKED);
        _ChatBlockStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ChatBlockStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ChatBlockStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ChatBlockStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ChatBlockStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ChatBlockStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ChatBlockStatus get(String str) {
        Map<String, ChatBlockStatus> map = _ChatBlockStatus;
        ChatBlockStatus chatBlockStatus = map.get(str);
        if (chatBlockStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            chatBlockStatus = integer == null ? new ChatBlockStatus(str, -1) : new ChatBlockStatus(str, integer.intValue());
            map.put(str, chatBlockStatus);
        }
        return chatBlockStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ChatBlockStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ChatBlockStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ChatBlockStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ChatBlockStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
