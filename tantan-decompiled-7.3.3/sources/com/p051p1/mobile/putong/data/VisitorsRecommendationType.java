package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VisitorsRecommendationType extends TEnum {
    public static final TEnumJsonAdapter<VisitorsRecommendationType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VisitorsRecommendationType> PROTOBUF_ADAPTER;
    private static final Map<String, VisitorsRecommendationType> _VisitorsRecommendationType;
    private static final int int_unknown_ = -1;
    public static final String latestActive = "latestActive";
    public static final String matched = "matched";
    public static final String newVisitor = "newVisitor";
    public static final String online = "online";
    public static final String sameCity = "sameCity";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String visitCount = "visitCount";
    public static final String visitMost = "visitMost";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<VisitorsRecommendationType> tEnumJsonAdapter = new TEnumJsonAdapter<VisitorsRecommendationType>() { // from class: com.p1.mobile.putong.data.VisitorsRecommendationType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public VisitorsRecommendationType newTEnum(String str, int i) {
                return VisitorsRecommendationType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<VisitorsRecommendationType>() { // from class: com.p1.mobile.putong.data.VisitorsRecommendationType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public VisitorsRecommendationType newTEnum(String str, int i) {
                return VisitorsRecommendationType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(visitMost);
        supportEnum.add(sameCity);
        supportEnum.add(visitCount);
        supportEnum.add("online");
        supportEnum.add(latestActive);
        supportEnum.add("matched");
        supportEnum.add(newVisitor);
        _VisitorsRecommendationType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private VisitorsRecommendationType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VisitorsRecommendationType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VisitorsRecommendationType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VisitorsRecommendationType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, VisitorsRecommendationType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static VisitorsRecommendationType get(String str) {
        Map<String, VisitorsRecommendationType> map = _VisitorsRecommendationType;
        VisitorsRecommendationType visitorsRecommendationType = map.get(str);
        if (visitorsRecommendationType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            visitorsRecommendationType = integer == null ? new VisitorsRecommendationType(str, -1) : new VisitorsRecommendationType(str, integer.intValue());
            map.put(str, visitorsRecommendationType);
        }
        return visitorsRecommendationType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VisitorsRecommendationType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VisitorsRecommendationType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VisitorsRecommendationType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VisitorsRecommendationType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
