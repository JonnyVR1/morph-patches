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
public class SeeSwitchName extends TEnum {
    public static final TEnumJsonAdapter<SeeSwitchName> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SeeSwitchName> PROTOBUF_ADAPTER;
    private static final Map<String, SeeSwitchName> _SeeSwitchName;
    public static final String call_to_buy_see = "call_to_buy_see";
    public static final String daily_report_page = "daily_report_page";
    public static final String follow_tab = "follow_tab";
    private static final int int_call_to_buy_see = 9;
    private static final int int_daily_report_page = 2;
    private static final int int_follow_tab = 3;
    private static final int int_message_tab = 0;
    private static final int int_my_privilege = 11;
    private static final int int_my_profile_tab = 1;
    private static final int int_right_no_match = 8;
    private static final int int_see_boost_guide = 6;
    private static final int int_see_float = 7;
    private static final int int_see_sms = 10;
    private static final int int_see_special = 4;
    private static final int int_see_who_likes_me = 5;
    private static final int int_unknown_ = -1;
    public static final String message_tab = "message_tab";
    public static final String my_privilege = "my_privilege";
    public static final String my_profile_tab = "my_profile_tab";
    public static final String right_no_match = "right_no_match";
    public static final String see_boost_guide = "see_boost_guide";
    public static final String see_float = "see_float";
    public static final String see_sms = "see_sms";
    public static final String see_special = "see_special";
    public static final String see_who_likes_me = "see_who_likes_me";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SeeSwitchName> tEnumJsonAdapter = new TEnumJsonAdapter<SeeSwitchName>() { // from class: com.p1.mobile.putong.core.data.SeeSwitchName.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SeeSwitchName newTEnum(String str, int i) {
                return SeeSwitchName.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SeeSwitchName>() { // from class: com.p1.mobile.putong.core.data.SeeSwitchName.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SeeSwitchName newTEnum(String str, int i) {
                return SeeSwitchName.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(message_tab, 0);
        tEnumJsonAdapter.addExtJsonValue(my_profile_tab, 1);
        tEnumJsonAdapter.addExtJsonValue(daily_report_page, 2);
        tEnumJsonAdapter.addExtJsonValue(follow_tab, 3);
        tEnumJsonAdapter.addExtJsonValue(see_special, 4);
        tEnumJsonAdapter.addExtJsonValue(see_who_likes_me, 5);
        tEnumJsonAdapter.addExtJsonValue(see_boost_guide, 6);
        tEnumJsonAdapter.addExtJsonValue(see_float, 7);
        tEnumJsonAdapter.addExtJsonValue(right_no_match, 8);
        tEnumJsonAdapter.addExtJsonValue(call_to_buy_see, 9);
        tEnumJsonAdapter.addExtJsonValue(see_sms, 10);
        tEnumJsonAdapter.addExtJsonValue(my_privilege, 11);
        supportEnum.add(message_tab);
        supportEnum.add(my_profile_tab);
        supportEnum.add(daily_report_page);
        supportEnum.add(follow_tab);
        supportEnum.add(see_special);
        supportEnum.add(see_who_likes_me);
        supportEnum.add(see_boost_guide);
        supportEnum.add(see_float);
        supportEnum.add(right_no_match);
        supportEnum.add(call_to_buy_see);
        supportEnum.add(see_sms);
        supportEnum.add(my_privilege);
        _SeeSwitchName = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SeeSwitchName(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SeeSwitchName> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SeeSwitchName> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SeeSwitchName> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SeeSwitchName> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SeeSwitchName get(String str) {
        Map<String, SeeSwitchName> map = _SeeSwitchName;
        SeeSwitchName seeSwitchName = map.get(str);
        if (seeSwitchName == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            seeSwitchName = integer == null ? new SeeSwitchName(str, -1) : new SeeSwitchName(str, integer.intValue());
            map.put(str, seeSwitchName);
        }
        return seeSwitchName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SeeSwitchName getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SeeSwitchName> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SeeSwitchName> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SeeSwitchName get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
