package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class OperationType extends TEnum {
    public static final TEnumJsonAdapter<OperationType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OperationType> PROTOBUF_ADAPTER;
    private static final Map<String, OperationType> _OperationType;
    public static final String album_num_inc = "album_num_inc";
    public static final String bubble = "bubble";
    public static final String category_topic = "category_topic";
    public static final String change_city = "change_city";
    public static final String draft = "draft";
    public static final String group = "group";
    private static final int int_unknown_ = -1;
    public static final String man_made = "man_made";
    public static final String moment_viewer = "moment_viewer";
    public static final String myTabPostGuide = "myTabPostGuide";
    public static final String nearby_online = "nearby_online";
    public static final String newUserAIMoment = "newUserAIMoment";
    public static final String new_user = "new_user";
    public static final String poi = "poi";
    public static final String recommend_topic = "recommend_topic";
    public static final String recommend_user = "recommend_user";
    public static final String single_group = "single_group";
    public static final String single_topic = "single_topic";
    public static final String state_square_entrance = "state_square_entrance";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OperationType> tEnumJsonAdapter = new TEnumJsonAdapter<OperationType>() { // from class: com.p1.mobile.putong.feed.data.OperationType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OperationType newTEnum(String str, int i) {
                return OperationType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OperationType>() { // from class: com.p1.mobile.putong.feed.data.OperationType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OperationType newTEnum(String str, int i) {
                return OperationType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(change_city);
        supportEnum.add(new_user);
        supportEnum.add(man_made);
        supportEnum.add(album_num_inc);
        supportEnum.add(nearby_online);
        supportEnum.add(category_topic);
        supportEnum.add(single_topic);
        supportEnum.add(recommend_user);
        supportEnum.add(recommend_topic);
        supportEnum.add("bubble");
        supportEnum.add(draft);
        supportEnum.add("group");
        supportEnum.add(state_square_entrance);
        supportEnum.add(single_group);
        supportEnum.add(moment_viewer);
        supportEnum.add("poi");
        supportEnum.add(myTabPostGuide);
        supportEnum.add(newUserAIMoment);
        _OperationType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OperationType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OperationType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OperationType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OperationType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OperationType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OperationType get(String str) {
        Map<String, OperationType> map = _OperationType;
        OperationType operationType = map.get(str);
        if (operationType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            operationType = integer == null ? new OperationType(str, -1) : new OperationType(str, integer.intValue());
            map.put(str, operationType);
        }
        return operationType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OperationType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OperationType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OperationType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OperationType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
