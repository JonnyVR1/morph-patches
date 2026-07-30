package com.p046p1.mobile.putong.data;

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
public class OMSRuleCount extends TEnum {
    public static final TEnumJsonAdapter<OMSRuleCount> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSRuleCount> PROTOBUF_ADAPTER;
    private static final Map<String, OMSRuleCount> _OMSRuleCount;
    public static final String continuous_dislike_count_session = "continuous_dislike_count_session";
    public static final String continuous_like_superlike_count_session = "continuous_like_superlike_count_session";
    private static final int int_continuous_dislike_count_session = 2;
    private static final int int_continuous_like_superlike_count_session = 1;
    private static final int int_swipe_count_session = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String swipe_count_session = "swipe_count_session";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSRuleCount> tEnumJsonAdapter = new TEnumJsonAdapter<OMSRuleCount>() { // from class: com.p1.mobile.putong.data.OMSRuleCount.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSRuleCount newTEnum(String str, int i) {
                return OMSRuleCount.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSRuleCount>() { // from class: com.p1.mobile.putong.data.OMSRuleCount.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSRuleCount newTEnum(String str, int i) {
                return OMSRuleCount.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(swipe_count_session, 0);
        tEnumJsonAdapter.addExtJsonValue(continuous_like_superlike_count_session, 1);
        tEnumJsonAdapter.addExtJsonValue(continuous_dislike_count_session, 2);
        supportEnum.add(swipe_count_session);
        supportEnum.add(continuous_like_superlike_count_session);
        supportEnum.add(continuous_dislike_count_session);
        _OMSRuleCount = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSRuleCount(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSRuleCount> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSRuleCount> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSRuleCount> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSRuleCount> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSRuleCount get(String str) {
        Map<String, OMSRuleCount> map = _OMSRuleCount;
        OMSRuleCount oMSRuleCount = map.get(str);
        if (oMSRuleCount == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSRuleCount = integer == null ? new OMSRuleCount(str, -1) : new OMSRuleCount(str, integer.intValue());
            map.put(str, oMSRuleCount);
        }
        return oMSRuleCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSRuleCount getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSRuleCount> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSRuleCount> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSRuleCount get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
