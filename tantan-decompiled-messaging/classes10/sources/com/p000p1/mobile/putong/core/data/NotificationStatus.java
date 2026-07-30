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
public class NotificationStatus extends TEnum {
    public static final TEnumJsonAdapter<NotificationStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<NotificationStatus> PROTOBUF_ADAPTER;
    private static final Map<String, NotificationStatus> _NotificationStatus;
    private static final int int_muting = 4;
    private static final int int_ongoing = 2;
    private static final int int_pending = 1;
    private static final int int_removed = 3;
    private static final int int_undefined = 0;
    private static final int int_unknown_ = -1;
    public static final String muting = "muting";
    public static final String ongoing = "ongoing";
    public static final String pending = "pending";
    public static final String removed = "removed";
    protected static HashSet<String> supportEnum = null;
    public static final String undefined = "undefined";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<NotificationStatus> tEnumJsonAdapter = new TEnumJsonAdapter<NotificationStatus>() { // from class: com.p1.mobile.putong.core.data.NotificationStatus.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public NotificationStatus m14577newTEnum(String str, int i) {
                return NotificationStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<NotificationStatus>() { // from class: com.p1.mobile.putong.core.data.NotificationStatus.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public NotificationStatus m14578newTEnum(String str, int i) {
                return NotificationStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(undefined, int_undefined);
        tEnumJsonAdapter.addExtJsonValue("pending", 1);
        tEnumJsonAdapter.addExtJsonValue(ongoing, 2);
        tEnumJsonAdapter.addExtJsonValue(removed, 3);
        tEnumJsonAdapter.addExtJsonValue(muting, int_muting);
        supportEnum.add(undefined);
        supportEnum.add("pending");
        supportEnum.add(ongoing);
        supportEnum.add(removed);
        supportEnum.add(muting);
        _NotificationStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private NotificationStatus(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<NotificationStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, NotificationStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, NotificationStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static NotificationStatus get(String str) {
        Map<String, NotificationStatus> map = _NotificationStatus;
        NotificationStatus notificationStatus = map.get(str);
        if (notificationStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            notificationStatus = integer == null ? new NotificationStatus(str, int_unknown_) : new NotificationStatus(str, integer.intValue());
            map.put(str, notificationStatus);
        }
        return notificationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NotificationStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<NotificationStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, NotificationStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static NotificationStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
