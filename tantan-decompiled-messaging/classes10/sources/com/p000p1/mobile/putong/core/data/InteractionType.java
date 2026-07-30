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
public class InteractionType extends TEnum {
    public static final TEnumJsonAdapter<InteractionType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<InteractionType> PROTOBUF_ADAPTER;
    private static final Map<String, InteractionType> _InteractionType;
    public static final String default_ = "default";
    private static final int int_unknown_ = -1;
    public static final String live = "live";
    public static final String lovescript = "lovescript";
    public static final String moment = "moment";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String voice = "voice";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<InteractionType> tEnumJsonAdapter = new TEnumJsonAdapter<InteractionType>() { // from class: com.p1.mobile.putong.core.data.InteractionType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public InteractionType m13482newTEnum(String str, int i) {
                return InteractionType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<InteractionType>() { // from class: com.p1.mobile.putong.core.data.InteractionType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public InteractionType m13483newTEnum(String str, int i) {
                return InteractionType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("live");
        supportEnum.add("voice");
        supportEnum.add("default");
        supportEnum.add("moment");
        supportEnum.add("lovescript");
        _InteractionType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private InteractionType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<InteractionType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<InteractionType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, InteractionType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, InteractionType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static InteractionType get(String str) {
        Map<String, InteractionType> map = _InteractionType;
        InteractionType interactionType = map.get(str);
        if (interactionType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            interactionType = integer == null ? new InteractionType(str, int_unknown_) : new InteractionType(str, integer.intValue());
            map.put(str, interactionType);
        }
        return interactionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InteractionType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<InteractionType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, InteractionType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static InteractionType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
