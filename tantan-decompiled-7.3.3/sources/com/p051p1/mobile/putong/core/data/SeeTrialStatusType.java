package com.p051p1.mobile.putong.core.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes10.dex */
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
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SeeTrialStatusType newTEnum(String str, int i) {
                return SeeTrialStatusType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SeeTrialStatusType>() { // from class: com.p1.mobile.putong.core.data.SeeTrialStatusType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SeeTrialStatusType newTEnum(String str, int i) {
                return SeeTrialStatusType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(waitToBuy);
        supportEnum.add(trialing);
        supportEnum.add(trialEnd);
        supportEnum.add("waiting");
        supportEnum.add(recovered);
        supportEnum.add("expired");
        _SeeTrialStatusType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SeeTrialStatusType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
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
        l01 l01Var = new l01();
        for (Map.Entry<String, SeeTrialStatusType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SeeTrialStatusType get(String str) {
        Map<String, SeeTrialStatusType> map = _SeeTrialStatusType;
        SeeTrialStatusType seeTrialStatusType = map.get(str);
        if (seeTrialStatusType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            seeTrialStatusType = integer == null ? new SeeTrialStatusType(str, -1) : new SeeTrialStatusType(str, integer.intValue());
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
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SeeTrialStatusType> oldEnumCovertMap(Map<String, Integer> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            l01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return l01Var;
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

    private static SeeTrialStatusType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
