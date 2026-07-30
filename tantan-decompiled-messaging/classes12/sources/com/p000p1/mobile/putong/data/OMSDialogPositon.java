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
public class OMSDialogPositon extends TEnum {
    public static final TEnumJsonAdapter<OMSDialogPositon> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSDialogPositon> PROTOBUF_ADAPTER;
    private static final Map<String, OMSDialogPositon> _OMSDialogPositon;
    private static final int int_p_chat_view = 0;
    private static final int int_p_live_explore = 4;
    private static final int int_p_messages_view = 3;
    private static final int int_p_navigation_view = 2;
    private static final int int_p_nearby = 5;
    private static final int int_p_privileges_view = 7;
    private static final int int_p_suggest_user_profile_info_view = 8;
    private static final int int_p_suggest_users_home_view = 1;
    private static final int int_p_wallet = 6;
    private static final int int_unknown_ = -1;
    public static final String p_chat_view = "p_chat_view";
    public static final String p_live_explore = "p_live_explore";
    public static final String p_messages_view = "p_messages_view";
    public static final String p_navigation_view = "p_navigation_view";
    public static final String p_nearby = "p_nearby";
    public static final String p_privileges_view = "p_privileges_view";
    public static final String p_suggest_user_profile_info_view = "p_suggest_user_profile_info_view";
    public static final String p_suggest_users_home_view = "p_suggest_users_home_view";
    public static final String p_wallet = "p_wallet";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSDialogPositon> tEnumJsonAdapter = new TEnumJsonAdapter<OMSDialogPositon>() { // from class: com.p1.mobile.putong.data.OMSDialogPositon.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSDialogPositon newTEnum(String str, int i) {
                return OMSDialogPositon.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSDialogPositon>() { // from class: com.p1.mobile.putong.data.OMSDialogPositon.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSDialogPositon newTEnum(String str, int i) {
                return OMSDialogPositon.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(p_chat_view, 0);
        tEnumJsonAdapter.addExtJsonValue("p_suggest_users_home_view", 1);
        tEnumJsonAdapter.addExtJsonValue(p_navigation_view, 2);
        tEnumJsonAdapter.addExtJsonValue(p_messages_view, 3);
        tEnumJsonAdapter.addExtJsonValue(p_live_explore, 4);
        tEnumJsonAdapter.addExtJsonValue(p_nearby, 5);
        tEnumJsonAdapter.addExtJsonValue(p_wallet, 6);
        tEnumJsonAdapter.addExtJsonValue(p_privileges_view, 7);
        tEnumJsonAdapter.addExtJsonValue(p_suggest_user_profile_info_view, 8);
        supportEnum.add(p_chat_view);
        supportEnum.add("p_suggest_users_home_view");
        supportEnum.add(p_navigation_view);
        supportEnum.add(p_messages_view);
        supportEnum.add(p_live_explore);
        supportEnum.add(p_nearby);
        supportEnum.add(p_wallet);
        supportEnum.add(p_privileges_view);
        supportEnum.add(p_suggest_user_profile_info_view);
        _OMSDialogPositon = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSDialogPositon(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSDialogPositon> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSDialogPositon> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSDialogPositon> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSDialogPositon> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSDialogPositon get(String str) {
        Map<String, OMSDialogPositon> map = _OMSDialogPositon;
        OMSDialogPositon oMSDialogPositon = map.get(str);
        if (oMSDialogPositon == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSDialogPositon = integer == null ? new OMSDialogPositon(str, -1) : new OMSDialogPositon(str, integer.intValue());
            map.put(str, oMSDialogPositon);
        }
        return oMSDialogPositon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSDialogPositon getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSDialogPositon> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSDialogPositon> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSDialogPositon get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
