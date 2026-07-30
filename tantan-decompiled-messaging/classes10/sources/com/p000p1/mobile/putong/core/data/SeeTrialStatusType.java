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
public class SeeTrialStatusType extends TEnum {
    public static final TEnumJsonAdapter<SeeTrialStatusType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SeeTrialStatusType> PROTOBUF_ADAPTER;
    private static final Map<String, SeeTrialStatusType> _SeeTrialStatusType;
    public static final String expired = "expired";
    private static final int int_unknown_ = -1;
    public static final String recovered = "recovered";
    protected static HashSet<String> supportEnum = null;
    public static final String trialEnd = "trialEnd";
    public static final String trialing = "trialing";
    public static final String unknown_ = "unknown_";
    public static final String waitToBuy = "waitToBuy";
    public static final String waiting = "waiting";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SeeTrialStatusType> tEnumJsonAdapter = new TEnumJsonAdapter<SeeTrialStatusType>() { // from class: com.p1.mobile.putong.core.data.SeeTrialStatusType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public SeeTrialStatusType m15557newTEnum(String str, int i) {
                return SeeTrialStatusType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SeeTrialStatusType>() { // from class: com.p1.mobile.putong.core.data.SeeTrialStatusType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public SeeTrialStatusType m15558newTEnum(String str, int i) {
                return SeeTrialStatusType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(waitToBuy);
        supportEnum.add(trialing);
        supportEnum.add(trialEnd);
        supportEnum.add(waiting);
        supportEnum.add(recovered);
        supportEnum.add("expired");
        _SeeTrialStatusType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SeeTrialStatusType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SeeTrialStatusType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SeeTrialStatusType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SeeTrialStatusType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SeeTrialStatusType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SeeTrialStatusType get(String str) {
        Map<String, SeeTrialStatusType> map = _SeeTrialStatusType;
        SeeTrialStatusType seeTrialStatusType = map.get(str);
        if (seeTrialStatusType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            seeTrialStatusType = integer == null ? new SeeTrialStatusType(str, int_unknown_) : new SeeTrialStatusType(str, integer.intValue());
            map.put(str, seeTrialStatusType);
        }
        return seeTrialStatusType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SeeTrialStatusType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SeeTrialStatusType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SeeTrialStatusType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SeeTrialStatusType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
