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
public class OMSSwipeAction extends TEnum {
    public static final TEnumJsonAdapter<OMSSwipeAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSSwipeAction> PROTOBUF_ADAPTER;
    private static final Map<String, OMSSwipeAction> _OMSSwipeAction;
    public static final String dislike = "dislike";
    private static final int int_dislike = 2;
    private static final int int_like = 0;
    private static final int int_superlike = 1;
    private static final int int_undo = 3;
    private static final int int_unknown_ = -1;
    public static final String like = "like";
    public static final String superlike = "superlike";
    protected static HashSet<String> supportEnum = null;
    public static final String undo = "undo";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSSwipeAction> tEnumJsonAdapter = new TEnumJsonAdapter<OMSSwipeAction>() { // from class: com.p1.mobile.putong.data.OMSSwipeAction.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSSwipeAction newTEnum(String str, int i) {
                return OMSSwipeAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSSwipeAction>() { // from class: com.p1.mobile.putong.data.OMSSwipeAction.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSSwipeAction newTEnum(String str, int i) {
                return OMSSwipeAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("like", 0);
        tEnumJsonAdapter.addExtJsonValue("superlike", 1);
        tEnumJsonAdapter.addExtJsonValue("dislike", 2);
        tEnumJsonAdapter.addExtJsonValue("undo", 3);
        supportEnum.add("like");
        supportEnum.add("superlike");
        supportEnum.add("dislike");
        supportEnum.add("undo");
        _OMSSwipeAction = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private OMSSwipeAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSSwipeAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSSwipeAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSSwipeAction> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, OMSSwipeAction> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static OMSSwipeAction get(String str) {
        Map<String, OMSSwipeAction> map = _OMSSwipeAction;
        OMSSwipeAction oMSSwipeAction = map.get(str);
        if (oMSSwipeAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSSwipeAction = integer == null ? new OMSSwipeAction(str, -1) : new OMSSwipeAction(str, integer.intValue());
            map.put(str, oMSSwipeAction);
        }
        return oMSSwipeAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSSwipeAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSSwipeAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSSwipeAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSSwipeAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
