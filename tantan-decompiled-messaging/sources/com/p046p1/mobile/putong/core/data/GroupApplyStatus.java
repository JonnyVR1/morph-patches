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
public class GroupApplyStatus extends TEnum {
    public static final TEnumJsonAdapter<GroupApplyStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GroupApplyStatus> PROTOBUF_ADAPTER;
    private static final Map<String, GroupApplyStatus> _GroupApplyStatus;
    public static final String approved = "approved";
    public static final String default_ = "default";
    private static final int int_approved = 1;
    private static final int int_default_ = 0;
    private static final int int_rejected = 2;
    private static final int int_unknown_ = -1;
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GroupApplyStatus> tEnumJsonAdapter = new TEnumJsonAdapter<GroupApplyStatus>() { // from class: com.p1.mobile.putong.core.data.GroupApplyStatus.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public GroupApplyStatus newTEnum(String str, int i) {
                return GroupApplyStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GroupApplyStatus>() { // from class: com.p1.mobile.putong.core.data.GroupApplyStatus.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public GroupApplyStatus newTEnum(String str, int i) {
                return GroupApplyStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue("approved", 1);
        tEnumJsonAdapter.addExtJsonValue("rejected", 2);
        supportEnum.add("default");
        supportEnum.add("approved");
        supportEnum.add("rejected");
        _GroupApplyStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GroupApplyStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GroupApplyStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GroupApplyStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GroupApplyStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GroupApplyStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GroupApplyStatus get(String str) {
        Map<String, GroupApplyStatus> map = _GroupApplyStatus;
        GroupApplyStatus groupApplyStatus = map.get(str);
        if (groupApplyStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            groupApplyStatus = integer == null ? new GroupApplyStatus(str, -1) : new GroupApplyStatus(str, integer.intValue());
            map.put(str, groupApplyStatus);
        }
        return groupApplyStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GroupApplyStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GroupApplyStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GroupApplyStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GroupApplyStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
