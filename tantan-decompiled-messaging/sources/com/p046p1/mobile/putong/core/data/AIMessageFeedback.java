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
public class AIMessageFeedback extends TEnum {
    public static final TEnumJsonAdapter<AIMessageFeedback> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<AIMessageFeedback> PROTOBUF_ADAPTER;
    private static final Map<String, AIMessageFeedback> _AIMessageFeedback;
    public static final String bad = "bad";
    public static final String good = "good";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<AIMessageFeedback> tEnumJsonAdapter = new TEnumJsonAdapter<AIMessageFeedback>() { // from class: com.p1.mobile.putong.core.data.AIMessageFeedback.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public AIMessageFeedback newTEnum(String str, int i) {
                return AIMessageFeedback.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<AIMessageFeedback>() { // from class: com.p1.mobile.putong.core.data.AIMessageFeedback.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public AIMessageFeedback newTEnum(String str, int i) {
                return AIMessageFeedback.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(good);
        supportEnum.add(bad);
        _AIMessageFeedback = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private AIMessageFeedback(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<AIMessageFeedback> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AIMessageFeedback> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, AIMessageFeedback> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, AIMessageFeedback> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static AIMessageFeedback get(String str) {
        Map<String, AIMessageFeedback> map = _AIMessageFeedback;
        AIMessageFeedback aIMessageFeedback = map.get(str);
        if (aIMessageFeedback == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            aIMessageFeedback = integer == null ? new AIMessageFeedback(str, -1) : new AIMessageFeedback(str, integer.intValue());
            map.put(str, aIMessageFeedback);
        }
        return aIMessageFeedback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AIMessageFeedback getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<AIMessageFeedback> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, AIMessageFeedback> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static AIMessageFeedback get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
