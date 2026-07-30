package com.p000p1.mobile.putong.data;

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
public class OMSSwipeRule extends TEnum {
    public static final TEnumJsonAdapter<OMSSwipeRule> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSSwipeRule> PROTOBUF_ADAPTER;
    private static final Map<String, OMSSwipeRule> _OMSSwipeRule;
    private static final int int_swipeLeft_rule = 0;
    private static final int int_swipeRight_rule = 1;
    private static final int int_swipe_rule = 2;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String swipeLeft_rule = "swipeLeft_rule";
    public static final String swipeRight_rule = "swipeRight_rule";
    public static final String swipe_rule = "swipe_rule";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSSwipeRule> tEnumJsonAdapter = new TEnumJsonAdapter<OMSSwipeRule>() { // from class: com.p1.mobile.putong.data.OMSSwipeRule.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSSwipeRule newTEnum(String str, int i) {
                return OMSSwipeRule.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSSwipeRule>() { // from class: com.p1.mobile.putong.data.OMSSwipeRule.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSSwipeRule newTEnum(String str, int i) {
                return OMSSwipeRule.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(swipeLeft_rule, 0);
        tEnumJsonAdapter.addExtJsonValue(swipeRight_rule, 1);
        tEnumJsonAdapter.addExtJsonValue(swipe_rule, 2);
        supportEnum.add(swipeLeft_rule);
        supportEnum.add(swipeRight_rule);
        supportEnum.add(swipe_rule);
        _OMSSwipeRule = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSSwipeRule(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSSwipeRule> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSSwipeRule> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSSwipeRule> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSSwipeRule> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSSwipeRule get(String str) {
        Map<String, OMSSwipeRule> map = _OMSSwipeRule;
        OMSSwipeRule oMSSwipeRule = map.get(str);
        if (oMSSwipeRule == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSSwipeRule = integer == null ? new OMSSwipeRule(str, -1) : new OMSSwipeRule(str, integer.intValue());
            map.put(str, oMSSwipeRule);
        }
        return oMSSwipeRule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSSwipeRule getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSSwipeRule> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSSwipeRule> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSSwipeRule get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
