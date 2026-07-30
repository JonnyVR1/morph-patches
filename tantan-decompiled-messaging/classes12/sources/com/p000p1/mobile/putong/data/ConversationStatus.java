package com.p000p1.mobile.putong.data;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ConversationStatus extends TEnum {
    public static final TEnumJsonAdapter<ConversationStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ConversationStatus> PROTOBUF_ADAPTER;
    private static final Map<String, ConversationStatus> _ConversationStatus;
    public static final String blocked = "blocked";
    public static final String default_ = "default";
    public static final String deleted = "deleted";
    public static final String dismissed = "dismissed";
    private static final int int_blocked = 2;
    private static final int int_default_ = 0;
    private static final int int_deleted = 1;
    private static final int int_dismissed = 7;
    private static final int int_local_fake = 8;
    private static final int int_peeking = 4;
    private static final int int_peeking_blocked = 6;
    private static final int int_pending = 3;
    private static final int int_pending_blocked = 5;
    private static final int int_unknown_ = -1;
    public static final String invisible = "invisible";
    public static final String local_fake = "local_fake";
    public static final String peeking = "peeking";
    public static final String peeking_blocked = "peeking_blocked";
    public static final String pending = "pending";
    public static final String pending_blocked = "pending_blocked";
    public static final String removed = "removed";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ConversationStatus> tEnumJsonAdapter = new TEnumJsonAdapter<ConversationStatus>() { // from class: com.p1.mobile.putong.data.ConversationStatus.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ConversationStatus newTEnum(String str, int i) {
                return ConversationStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ConversationStatus>() { // from class: com.p1.mobile.putong.data.ConversationStatus.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ConversationStatus newTEnum(String str, int i) {
                return ConversationStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue("deleted", 1);
        tEnumJsonAdapter.addExtJsonValue("blocked", 2);
        tEnumJsonAdapter.addExtJsonValue("pending", 3);
        tEnumJsonAdapter.addExtJsonValue(peeking, 4);
        tEnumJsonAdapter.addExtJsonValue(pending_blocked, 5);
        tEnumJsonAdapter.addExtJsonValue(peeking_blocked, 6);
        tEnumJsonAdapter.addExtJsonValue("dismissed", 7);
        tEnumJsonAdapter.addExtJsonValue(local_fake, 8);
        supportEnum.add("default");
        supportEnum.add("deleted");
        supportEnum.add("blocked");
        supportEnum.add("pending");
        supportEnum.add(peeking);
        supportEnum.add(pending_blocked);
        supportEnum.add(peeking_blocked);
        supportEnum.add("dismissed");
        supportEnum.add(local_fake);
        supportEnum.add(removed);
        supportEnum.add(invisible);
        _ConversationStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ConversationStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ConversationStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ConversationStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ConversationStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ConversationStatus get(String str) {
        Map<String, ConversationStatus> map = _ConversationStatus;
        ConversationStatus conversationStatus = map.get(str);
        if (conversationStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            conversationStatus = integer == null ? new ConversationStatus(str, -1) : new ConversationStatus(str, integer.intValue());
            map.put(str, conversationStatus);
        }
        return conversationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConversationStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ConversationStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ConversationStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ConversationStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
