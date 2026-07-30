package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class UserSetVisibility extends TEnum {
    public static final TEnumJsonAdapter<UserSetVisibility> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<UserSetVisibility> PROTOBUF_ADAPTER;
    private static final Map<String, UserSetVisibility> _UserSetVisibility;
    public static final String everyone = "everyone";
    private static final int int_everyone = 0;
    private static final int int_matches = 1;
    private static final int int_selfOnly = 3;
    private static final int int_stranger = 2;
    private static final int int_unknown_ = -1;
    public static final String matches = "matches";
    public static final String selfOnly = "selfOnly";
    public static final String stranger = "stranger";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<UserSetVisibility> tEnumJsonAdapter = new TEnumJsonAdapter<UserSetVisibility>() { // from class: com.p1.mobile.putong.feed.data.UserSetVisibility.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public UserSetVisibility newTEnum(String str, int i) {
                return UserSetVisibility.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<UserSetVisibility>() { // from class: com.p1.mobile.putong.feed.data.UserSetVisibility.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public UserSetVisibility newTEnum(String str, int i) {
                return UserSetVisibility.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("everyone", 0);
        tEnumJsonAdapter.addExtJsonValue("matches", 1);
        tEnumJsonAdapter.addExtJsonValue("stranger", 2);
        tEnumJsonAdapter.addExtJsonValue("selfOnly", 3);
        supportEnum.add("everyone");
        supportEnum.add("matches");
        supportEnum.add("stranger");
        supportEnum.add("selfOnly");
        _UserSetVisibility = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private UserSetVisibility(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<UserSetVisibility> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UserSetVisibility> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, UserSetVisibility> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, UserSetVisibility> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static UserSetVisibility get(String str) {
        Map<String, UserSetVisibility> map = _UserSetVisibility;
        UserSetVisibility userSetVisibility = map.get(str);
        if (userSetVisibility == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            userSetVisibility = integer == null ? new UserSetVisibility(str, -1) : new UserSetVisibility(str, integer.intValue());
            map.put(str, userSetVisibility);
        }
        return userSetVisibility;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UserSetVisibility getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<UserSetVisibility> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, UserSetVisibility> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static UserSetVisibility get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
