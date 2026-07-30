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
public class GiftStatus extends TEnum {
    public static final TEnumJsonAdapter<GiftStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GiftStatus> PROTOBUF_ADAPTER;
    private static final Map<String, GiftStatus> _GiftStatus;
    public static final String confirmed = "confirmed";
    public static final String expired = "expired";
    private static final int int_confirmed = 0;
    private static final int int_expired = 4;
    private static final int int_pending = 1;
    private static final int int_systemRefunded = 2;
    private static final int int_unknown_ = -1;
    private static final int int_userRefunded = 3;
    public static final String pending = "pending";
    protected static HashSet<String> supportEnum = null;
    public static final String systemRefunded = "systemRefunded";
    public static final String unknown_ = "unknown_";
    public static final String userRefunded = "userRefunded";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GiftStatus> tEnumJsonAdapter = new TEnumJsonAdapter<GiftStatus>() { // from class: com.p1.mobile.putong.core.data.GiftStatus.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public GiftStatus m12959newTEnum(String str, int i) {
                return GiftStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GiftStatus>() { // from class: com.p1.mobile.putong.core.data.GiftStatus.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public GiftStatus m12960newTEnum(String str, int i) {
                return GiftStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(confirmed, int_confirmed);
        tEnumJsonAdapter.addExtJsonValue("pending", 1);
        tEnumJsonAdapter.addExtJsonValue(systemRefunded, 2);
        tEnumJsonAdapter.addExtJsonValue(userRefunded, 3);
        tEnumJsonAdapter.addExtJsonValue("expired", int_expired);
        supportEnum.add(confirmed);
        supportEnum.add("pending");
        supportEnum.add(systemRefunded);
        supportEnum.add(userRefunded);
        supportEnum.add("expired");
        _GiftStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GiftStatus(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GiftStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GiftStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GiftStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GiftStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GiftStatus get(String str) {
        Map<String, GiftStatus> map = _GiftStatus;
        GiftStatus giftStatus = map.get(str);
        if (giftStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            giftStatus = integer == null ? new GiftStatus(str, int_unknown_) : new GiftStatus(str, integer.intValue());
            map.put(str, giftStatus);
        }
        return giftStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GiftStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GiftStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GiftStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GiftStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
