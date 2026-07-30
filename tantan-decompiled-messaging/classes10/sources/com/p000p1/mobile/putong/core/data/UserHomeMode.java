package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserHomeMode extends TEnum {
    public static final TEnumJsonAdapter<UserHomeMode> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<UserHomeMode> PROTOBUF_ADAPTER;
    private static final Map<String, UserHomeMode> _UserHomeMode;
    private static final int int_unknown_ = -1;
    public static final String loveMode = "loveMode";
    public static final String marryMode = "marryMode";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<UserHomeMode> tEnumJsonAdapter = new TEnumJsonAdapter<UserHomeMode>() { // from class: com.p1.mobile.putong.core.data.UserHomeMode.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public UserHomeMode m16116newTEnum(String str, int i) {
                return UserHomeMode.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<UserHomeMode>() { // from class: com.p1.mobile.putong.core.data.UserHomeMode.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public UserHomeMode m16117newTEnum(String str, int i) {
                return UserHomeMode.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(loveMode);
        supportEnum.add(marryMode);
        _UserHomeMode = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private UserHomeMode(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<UserHomeMode> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UserHomeMode> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, UserHomeMode> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, UserHomeMode> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static UserHomeMode get(String str) {
        Map<String, UserHomeMode> map = _UserHomeMode;
        UserHomeMode userHomeMode = map.get(str);
        if (userHomeMode == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            userHomeMode = integer == null ? new UserHomeMode(str, int_unknown_) : new UserHomeMode(str, integer.intValue());
            map.put(str, userHomeMode);
        }
        return userHomeMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UserHomeMode getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<UserHomeMode> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, UserHomeMode> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static UserHomeMode get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
