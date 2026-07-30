package com.p000p1.mobile.putong.feed.data;

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
public class FeedMomentAction extends TEnum {
    public static final TEnumJsonAdapter<FeedMomentAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<FeedMomentAction> PROTOBUF_ADAPTER;
    private static final Map<String, FeedMomentAction> _FeedMomentAction;
    public static final String comment = "comment";
    private static final int int_comment = 1;
    private static final int int_like = 0;
    private static final int int_unknown_ = -1;
    public static final String like = "like";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<FeedMomentAction> tEnumJsonAdapter = new TEnumJsonAdapter<FeedMomentAction>() { // from class: com.p1.mobile.putong.feed.data.FeedMomentAction.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public FeedMomentAction newTEnum(String str, int i) {
                return FeedMomentAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<FeedMomentAction>() { // from class: com.p1.mobile.putong.feed.data.FeedMomentAction.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public FeedMomentAction newTEnum(String str, int i) {
                return FeedMomentAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("like", 0);
        tEnumJsonAdapter.addExtJsonValue("comment", 1);
        supportEnum.add("like");
        supportEnum.add("comment");
        _FeedMomentAction = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private FeedMomentAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<FeedMomentAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FeedMomentAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, FeedMomentAction> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, FeedMomentAction> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static FeedMomentAction get(String str) {
        Map<String, FeedMomentAction> map = _FeedMomentAction;
        FeedMomentAction feedMomentAction = map.get(str);
        if (feedMomentAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            feedMomentAction = integer == null ? new FeedMomentAction(str, -1) : new FeedMomentAction(str, integer.intValue());
            map.put(str, feedMomentAction);
        }
        return feedMomentAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FeedMomentAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<FeedMomentAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, FeedMomentAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static FeedMomentAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
