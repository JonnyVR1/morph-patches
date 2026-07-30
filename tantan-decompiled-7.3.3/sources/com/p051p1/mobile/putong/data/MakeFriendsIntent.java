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
public class MakeFriendsIntent extends TEnum {
    public static final TEnumJsonAdapter<MakeFriendsIntent> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MakeFriendsIntent> PROTOBUF_ADAPTER;
    private static final Map<String, MakeFriendsIntent> _MakeFriendsIntent;
    public static final String chat = "chat";
    public static final String date = "date";
    private static final int int_chat = 2;
    private static final int int_date = 1;
    private static final int int_lover = 0;
    private static final int int_unknown_ = -1;
    public static final String lover = "lover";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MakeFriendsIntent> tEnumJsonAdapter = new TEnumJsonAdapter<MakeFriendsIntent>() { // from class: com.p1.mobile.putong.data.MakeFriendsIntent.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MakeFriendsIntent newTEnum(String str, int i) {
                return MakeFriendsIntent.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MakeFriendsIntent>() { // from class: com.p1.mobile.putong.data.MakeFriendsIntent.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MakeFriendsIntent newTEnum(String str, int i) {
                return MakeFriendsIntent.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(lover, 0);
        tEnumJsonAdapter.addExtJsonValue("date", 1);
        tEnumJsonAdapter.addExtJsonValue("chat", 2);
        supportEnum.add(lover);
        supportEnum.add("date");
        supportEnum.add("chat");
        _MakeFriendsIntent = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MakeFriendsIntent(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MakeFriendsIntent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MakeFriendsIntent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MakeFriendsIntent> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MakeFriendsIntent> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MakeFriendsIntent get(String str) {
        Map<String, MakeFriendsIntent> map = _MakeFriendsIntent;
        MakeFriendsIntent makeFriendsIntent = map.get(str);
        if (makeFriendsIntent == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            makeFriendsIntent = integer == null ? new MakeFriendsIntent(str, -1) : new MakeFriendsIntent(str, integer.intValue());
            map.put(str, makeFriendsIntent);
        }
        return makeFriendsIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MakeFriendsIntent getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MakeFriendsIntent> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MakeFriendsIntent> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MakeFriendsIntent get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
