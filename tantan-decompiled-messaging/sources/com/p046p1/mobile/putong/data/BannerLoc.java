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
public class BannerLoc extends TEnum {
    public static final TEnumJsonAdapter<BannerLoc> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BannerLoc> PROTOBUF_ADAPTER;
    private static final Map<String, BannerLoc> _BannerLoc;
    public static final String conversation = "conversation";
    public static final String conversation_old = "conversation_old";
    private static final int int_conversation = 1;
    private static final int int_conversation_old = 2;
    private static final int int_leftdrawer_old = 4;
    private static final int int_moment = 0;
    private static final int int_moment_feed = 5;
    private static final int int_popup = 3;
    private static final int int_unknown_ = -1;
    public static final String leftdrawer_old = "leftdrawer_old";
    public static final String moment = "moment";
    public static final String moment_feed = "moment_feed";
    public static final String popup = "popup";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<BannerLoc> tEnumJsonAdapter = new TEnumJsonAdapter<BannerLoc>() { // from class: com.p1.mobile.putong.data.BannerLoc.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public BannerLoc newTEnum(String str, int i) {
                return BannerLoc.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<BannerLoc>() { // from class: com.p1.mobile.putong.data.BannerLoc.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public BannerLoc newTEnum(String str, int i) {
                return BannerLoc.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("moment", 0);
        tEnumJsonAdapter.addExtJsonValue("conversation", 1);
        tEnumJsonAdapter.addExtJsonValue(conversation_old, 2);
        tEnumJsonAdapter.addExtJsonValue(popup, 3);
        tEnumJsonAdapter.addExtJsonValue(leftdrawer_old, 4);
        tEnumJsonAdapter.addExtJsonValue(moment_feed, 5);
        supportEnum.add("moment");
        supportEnum.add("conversation");
        supportEnum.add(conversation_old);
        supportEnum.add(popup);
        supportEnum.add(leftdrawer_old);
        supportEnum.add(moment_feed);
        _BannerLoc = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BannerLoc(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BannerLoc> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BannerLoc> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BannerLoc> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BannerLoc> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BannerLoc get(String str) {
        Map<String, BannerLoc> map = _BannerLoc;
        BannerLoc bannerLoc = map.get(str);
        if (bannerLoc == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bannerLoc = integer == null ? new BannerLoc(str, -1) : new BannerLoc(str, integer.intValue());
            map.put(str, bannerLoc);
        }
        return bannerLoc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BannerLoc getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BannerLoc> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BannerLoc> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BannerLoc get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
