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
public class GiftAction extends TEnum {
    public static final TEnumJsonAdapter<GiftAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GiftAction> PROTOBUF_ADAPTER;
    private static final Map<String, GiftAction> _GiftAction;
    public static final String given = "given";
    public static final String given_match = "given-match";
    public static final String given_pending = "given-pending";
    private static final int int_given = 0;
    private static final int int_given_match = 4;
    private static final int int_given_pending = 2;
    private static final int int_received = 1;
    private static final int int_received_pending = 3;
    private static final int int_unknown_ = -1;
    public static final String received = "received";
    public static final String received_pending = "received-pending";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GiftAction> tEnumJsonAdapter = new TEnumJsonAdapter<GiftAction>() { // from class: com.p1.mobile.putong.core.data.GiftAction.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public GiftAction newTEnum(String str, int i) {
                return GiftAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GiftAction>() { // from class: com.p1.mobile.putong.core.data.GiftAction.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public GiftAction newTEnum(String str, int i) {
                return GiftAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(given, 0);
        tEnumJsonAdapter.addExtJsonValue("received", 1);
        tEnumJsonAdapter.addExtJsonValue(given_pending, 2);
        tEnumJsonAdapter.addExtJsonValue(received_pending, 3);
        tEnumJsonAdapter.addExtJsonValue(given_match, 4);
        supportEnum.add(given);
        supportEnum.add("received");
        supportEnum.add(given_pending);
        supportEnum.add(received_pending);
        supportEnum.add(given_match);
        _GiftAction = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GiftAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GiftAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GiftAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GiftAction> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GiftAction> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GiftAction get(String str) {
        Map<String, GiftAction> map = _GiftAction;
        GiftAction giftAction = map.get(str);
        if (giftAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            giftAction = integer == null ? new GiftAction(str, -1) : new GiftAction(str, integer.intValue());
            map.put(str, giftAction);
        }
        return giftAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GiftAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GiftAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GiftAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GiftAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
