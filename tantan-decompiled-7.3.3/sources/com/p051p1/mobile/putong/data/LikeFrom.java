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
public class LikeFrom extends TEnum {
    public static final TEnumJsonAdapter<LikeFrom> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LikeFrom> PROTOBUF_ADAPTER;
    private static final Map<String, LikeFrom> _LikeFrom;
    public static final String fakeMatch = "fakeMatch";
    public static final String greet = "greet";
    public static final String home = "home";
    public static final String homeTab = "homeTab";
    public static final String instantChat = "instantChat";
    private static final int int_fakeMatch = 4;
    private static final int int_home = 0;
    private static final int int_homeTab = 2;
    private static final int int_likers = 1;
    private static final int int_meet = 6;
    private static final int int_myLiked = 3;
    private static final int int_picks = 5;
    private static final int int_unknown_ = -1;
    public static final String intl_visitor = "intl_visitor";
    public static final String kankan = "kankan";
    public static final String likers = "likers";
    public static final String meet = "meet";
    public static final String moment = "moment";
    public static final String momentPick = "momentPick";
    public static final String myLiked = "myLiked";
    public static final String mymeet = "mymeet";
    public static final String partner = "partner";
    public static final String picks = "picks";
    public static final String pinLike = "pinLike";
    public static final String poi = "poi";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LikeFrom> tEnumJsonAdapter = new TEnumJsonAdapter<LikeFrom>() { // from class: com.p1.mobile.putong.data.LikeFrom.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LikeFrom newTEnum(String str, int i) {
                return LikeFrom.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LikeFrom>() { // from class: com.p1.mobile.putong.data.LikeFrom.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LikeFrom newTEnum(String str, int i) {
                return LikeFrom.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("home", 0);
        tEnumJsonAdapter.addExtJsonValue("likers", 1);
        tEnumJsonAdapter.addExtJsonValue(homeTab, 2);
        tEnumJsonAdapter.addExtJsonValue("myLiked", 3);
        tEnumJsonAdapter.addExtJsonValue(fakeMatch, 4);
        tEnumJsonAdapter.addExtJsonValue("picks", 5);
        tEnumJsonAdapter.addExtJsonValue("meet", 6);
        supportEnum.add("home");
        supportEnum.add("likers");
        supportEnum.add(homeTab);
        supportEnum.add("myLiked");
        supportEnum.add(fakeMatch);
        supportEnum.add("picks");
        supportEnum.add("meet");
        supportEnum.add("greet");
        supportEnum.add("mymeet");
        supportEnum.add("moment");
        supportEnum.add("kankan");
        supportEnum.add("momentPick");
        supportEnum.add("instantChat");
        supportEnum.add("poi");
        supportEnum.add(intl_visitor);
        supportEnum.add("partner");
        supportEnum.add("pinLike");
        _LikeFrom = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LikeFrom(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LikeFrom> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LikeFrom> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LikeFrom> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LikeFrom> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LikeFrom get(String str) {
        Map<String, LikeFrom> map = _LikeFrom;
        LikeFrom likeFrom = map.get(str);
        if (likeFrom == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            likeFrom = integer == null ? new LikeFrom(str, -1) : new LikeFrom(str, integer.intValue());
            map.put(str, likeFrom);
        }
        return likeFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LikeFrom getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LikeFrom> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LikeFrom> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LikeFrom get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
