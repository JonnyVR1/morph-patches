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
public class UserBanAppealSwitch extends TEnum {
    public static final TEnumJsonAdapter<UserBanAppealSwitch> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<UserBanAppealSwitch> PROTOBUF_ADAPTER;
    private static final Map<String, UserBanAppealSwitch> _UserBanAppealSwitch;
    public static final String grey = "grey";
    private static final int int_grey = 0;
    private static final int int_offline = 2;
    private static final int int_online = 1;
    private static final int int_unknown_ = -1;
    public static final String offline = "offline";
    public static final String online = "online";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<UserBanAppealSwitch> tEnumJsonAdapter = new TEnumJsonAdapter<UserBanAppealSwitch>() { // from class: com.p1.mobile.putong.core.data.UserBanAppealSwitch.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public UserBanAppealSwitch newTEnum(String str, int i) {
                return UserBanAppealSwitch.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<UserBanAppealSwitch>() { // from class: com.p1.mobile.putong.core.data.UserBanAppealSwitch.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public UserBanAppealSwitch newTEnum(String str, int i) {
                return UserBanAppealSwitch.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("grey", 0);
        tEnumJsonAdapter.addExtJsonValue("online", 1);
        tEnumJsonAdapter.addExtJsonValue(offline, 2);
        supportEnum.add("grey");
        supportEnum.add("online");
        supportEnum.add(offline);
        _UserBanAppealSwitch = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private UserBanAppealSwitch(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<UserBanAppealSwitch> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UserBanAppealSwitch> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, UserBanAppealSwitch> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, UserBanAppealSwitch> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static UserBanAppealSwitch get(String str) {
        Map<String, UserBanAppealSwitch> map = _UserBanAppealSwitch;
        UserBanAppealSwitch userBanAppealSwitch = map.get(str);
        if (userBanAppealSwitch == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            userBanAppealSwitch = integer == null ? new UserBanAppealSwitch(str, -1) : new UserBanAppealSwitch(str, integer.intValue());
            map.put(str, userBanAppealSwitch);
        }
        return userBanAppealSwitch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UserBanAppealSwitch getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<UserBanAppealSwitch> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, UserBanAppealSwitch> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static UserBanAppealSwitch get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
