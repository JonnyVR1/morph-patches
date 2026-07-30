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
public class AIMessageStatus extends TEnum {
    public static final TEnumJsonAdapter<AIMessageStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<AIMessageStatus> PROTOBUF_ADAPTER;
    private static final Map<String, AIMessageStatus> _AIMessageStatus;
    public static final String failed = "failed";
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    public static final String success = "success";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<AIMessageStatus> tEnumJsonAdapter = new TEnumJsonAdapter<AIMessageStatus>() { // from class: com.p1.mobile.putong.core.data.AIMessageStatus.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public AIMessageStatus m11479newTEnum(String str, int i) {
                return AIMessageStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<AIMessageStatus>() { // from class: com.p1.mobile.putong.core.data.AIMessageStatus.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public AIMessageStatus m11480newTEnum(String str, int i) {
                return AIMessageStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("pending");
        supportEnum.add("success");
        supportEnum.add("failed");
        _AIMessageStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private AIMessageStatus(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<AIMessageStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AIMessageStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, AIMessageStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, AIMessageStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static AIMessageStatus get(String str) {
        Map<String, AIMessageStatus> map = _AIMessageStatus;
        AIMessageStatus aIMessageStatus = map.get(str);
        if (aIMessageStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            aIMessageStatus = integer == null ? new AIMessageStatus(str, int_unknown_) : new AIMessageStatus(str, integer.intValue());
            map.put(str, aIMessageStatus);
        }
        return aIMessageStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AIMessageStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<AIMessageStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, AIMessageStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static AIMessageStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
