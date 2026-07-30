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
public class UserSource extends TEnum {
    public static final TEnumJsonAdapter<UserSource> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<UserSource> PROTOBUF_ADAPTER;
    private static final Map<String, UserSource> _UserSource;
    public static final String china_mobile = "china-mobile";
    public static final String default_ = "default";
    public static final String facebook = "facebook";
    public static final String google = "google";
    private static final int int_china_mobile = 4;
    private static final int int_default_ = 0;
    private static final int int_facebook = 1;
    private static final int int_no_password = 3;
    private static final int int_qq = 5;
    private static final int int_unknown_ = -1;
    private static final int int_wechat = 2;
    public static final String network_security = "network-security";
    public static final String no_password = "no-password";

    /* JADX INFO: renamed from: qq */
    public static final String f294qq = "qq";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String wechat = "wechat";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<UserSource> tEnumJsonAdapter = new TEnumJsonAdapter<UserSource>() { // from class: com.p1.mobile.putong.data.UserSource.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public UserSource newTEnum(String str, int i) {
                return UserSource.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<UserSource>() { // from class: com.p1.mobile.putong.data.UserSource.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public UserSource newTEnum(String str, int i) {
                return UserSource.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue("facebook", 1);
        tEnumJsonAdapter.addExtJsonValue("wechat", 2);
        tEnumJsonAdapter.addExtJsonValue(no_password, 3);
        tEnumJsonAdapter.addExtJsonValue("china-mobile", 4);
        tEnumJsonAdapter.addExtJsonValue("qq", 5);
        supportEnum.add("default");
        supportEnum.add("facebook");
        supportEnum.add("wechat");
        supportEnum.add(no_password);
        supportEnum.add("china-mobile");
        supportEnum.add("qq");
        supportEnum.add("google");
        supportEnum.add(network_security);
        _UserSource = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private UserSource(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<UserSource> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UserSource> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, UserSource> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, UserSource> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static UserSource get(String str) {
        Map<String, UserSource> map = _UserSource;
        UserSource userSource = map.get(str);
        if (userSource == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            userSource = integer == null ? new UserSource(str, -1) : new UserSource(str, integer.intValue());
            map.put(str, userSource);
        }
        return userSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UserSource getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<UserSource> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, UserSource> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static UserSource get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
