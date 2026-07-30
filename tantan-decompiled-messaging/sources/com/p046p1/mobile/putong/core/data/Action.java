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
public class Action extends TEnum {
    public static final TEnumJsonAdapter<Action> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Action> PROTOBUF_ADAPTER;
    private static final Map<String, Action> _Action;
    public static final String add = "add";
    private static final int int_unknown_ = -1;
    public static final String remove = "remove";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Action> tEnumJsonAdapter = new TEnumJsonAdapter<Action>() { // from class: com.p1.mobile.putong.core.data.Action.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Action newTEnum(String str, int i) {
                return Action.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Action>() { // from class: com.p1.mobile.putong.core.data.Action.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Action newTEnum(String str, int i) {
                return Action.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("add");
        supportEnum.add(remove);
        _Action = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private Action(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Action> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Action> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Action> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Action> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static Action get(String str) {
        Map<String, Action> map = _Action;
        Action action = map.get(str);
        if (action == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            action = integer == null ? new Action(str, -1) : new Action(str, integer.intValue());
            map.put(str, action);
        }
        return action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Action getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Action> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Action> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Action get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
