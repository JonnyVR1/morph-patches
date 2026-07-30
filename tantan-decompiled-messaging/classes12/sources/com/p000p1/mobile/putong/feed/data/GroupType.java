package com.p000p1.mobile.putong.feed.data;

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
public class GroupType extends TEnum {
    public static final TEnumJsonAdapter<GroupType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GroupType> PROTOBUF_ADAPTER;
    private static final Map<String, GroupType> _GroupType;
    public static final String anonymous_group = "anonymous_group";
    public static final String group = "group";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GroupType> tEnumJsonAdapter = new TEnumJsonAdapter<GroupType>() { // from class: com.p1.mobile.putong.feed.data.GroupType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public GroupType newTEnum(String str, int i) {
                return GroupType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GroupType>() { // from class: com.p1.mobile.putong.feed.data.GroupType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public GroupType newTEnum(String str, int i) {
                return GroupType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("group");
        supportEnum.add(anonymous_group);
        _GroupType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GroupType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GroupType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GroupType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GroupType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GroupType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GroupType get(String str) {
        Map<String, GroupType> map = _GroupType;
        GroupType groupType = map.get(str);
        if (groupType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            groupType = integer == null ? new GroupType(str, -1) : new GroupType(str, integer.intValue());
            map.put(str, groupType);
        }
        return groupType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GroupType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GroupType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GroupType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GroupType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
