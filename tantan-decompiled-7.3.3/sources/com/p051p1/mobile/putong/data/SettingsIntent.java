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
public class SettingsIntent extends TEnum {
    public static final TEnumJsonAdapter<SettingsIntent> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SettingsIntent> PROTOBUF_ADAPTER;
    private static final Map<String, SettingsIntent> _SettingsIntent;
    public static final String date = "date";
    public static final String fate = "fate";
    public static final String friend = "friend";
    private static final int int_date = 1;
    private static final int int_fate = 3;
    private static final int int_friend = 0;
    private static final int int_relationship = 2;
    private static final int int_unknown_ = -1;
    public static final String relationship = "relationship";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SettingsIntent> tEnumJsonAdapter = new TEnumJsonAdapter<SettingsIntent>() { // from class: com.p1.mobile.putong.data.SettingsIntent.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SettingsIntent newTEnum(String str, int i) {
                return SettingsIntent.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SettingsIntent>() { // from class: com.p1.mobile.putong.data.SettingsIntent.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SettingsIntent newTEnum(String str, int i) {
                return SettingsIntent.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("friend", 0);
        tEnumJsonAdapter.addExtJsonValue("date", 1);
        tEnumJsonAdapter.addExtJsonValue("relationship", 2);
        tEnumJsonAdapter.addExtJsonValue(fate, 3);
        supportEnum.add("friend");
        supportEnum.add("date");
        supportEnum.add("relationship");
        supportEnum.add(fate);
        _SettingsIntent = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SettingsIntent(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SettingsIntent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SettingsIntent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SettingsIntent> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, SettingsIntent> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SettingsIntent get(String str) {
        Map<String, SettingsIntent> map = _SettingsIntent;
        SettingsIntent settingsIntent = map.get(str);
        if (settingsIntent == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            settingsIntent = integer == null ? new SettingsIntent(str, -1) : new SettingsIntent(str, integer.intValue());
            map.put(str, settingsIntent);
        }
        return settingsIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SettingsIntent getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SettingsIntent> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SettingsIntent> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SettingsIntent get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
