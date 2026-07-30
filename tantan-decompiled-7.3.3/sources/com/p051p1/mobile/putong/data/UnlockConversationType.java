package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class UnlockConversationType extends TEnum {
    public static final TEnumJsonAdapter<UnlockConversationType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<UnlockConversationType> PROTOBUF_ADAPTER;
    private static final Map<String, UnlockConversationType> _UnlockConversationType;
    private static final int int_quick_chat = 0;
    private static final int int_shuo_shuo = 1;
    private static final int int_unknown_ = -1;
    public static final String quick_chat = "quick_chat";
    public static final String shuo_shuo = "shuo_shuo";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<UnlockConversationType> tEnumJsonAdapter = new TEnumJsonAdapter<UnlockConversationType>() { // from class: com.p1.mobile.putong.data.UnlockConversationType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public UnlockConversationType newTEnum(String str, int i) {
                return UnlockConversationType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<UnlockConversationType>() { // from class: com.p1.mobile.putong.data.UnlockConversationType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public UnlockConversationType newTEnum(String str, int i) {
                return UnlockConversationType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(quick_chat, 0);
        tEnumJsonAdapter.addExtJsonValue(shuo_shuo, 1);
        supportEnum.add(quick_chat);
        supportEnum.add(shuo_shuo);
        _UnlockConversationType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private UnlockConversationType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<UnlockConversationType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UnlockConversationType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, UnlockConversationType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, UnlockConversationType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static UnlockConversationType get(String str) {
        Map<String, UnlockConversationType> map = _UnlockConversationType;
        UnlockConversationType unlockConversationType = map.get(str);
        if (unlockConversationType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            unlockConversationType = integer == null ? new UnlockConversationType(str, -1) : new UnlockConversationType(str, integer.intValue());
            map.put(str, unlockConversationType);
        }
        return unlockConversationType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UnlockConversationType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<UnlockConversationType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, UnlockConversationType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static UnlockConversationType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
