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
public class LikeFilterSortType extends TEnum {
    public static final TEnumJsonAdapter<LikeFilterSortType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LikeFilterSortType> PROTOBUF_ADAPTER;
    private static final Map<String, LikeFilterSortType> _LikeFilterSortType;
    public static final String default_ = "default";
    public static final String distOnline = "distOnline";
    private static final int int_default_ = 0;
    private static final int int_distOnline = 2;
    private static final int int_latestLike = 1;
    private static final int int_nearbyOnline = 6;
    private static final int int_newUser = 4;
    private static final int int_newUserFirst = 8;
    private static final int int_realAvatar = 3;
    private static final int int_realFace = 7;
    private static final int int_recentLike = 5;
    private static final int int_unknown_ = -1;
    public static final String latestLike = "latestLike";
    public static final String nearbyOnline = "nearbyOnline";
    public static final String newUser = "newUser";
    public static final String newUserFirst = "newUserFirst";
    public static final String realAvatar = "realAvatar";
    public static final String realFace = "realFace";
    public static final String recentLike = "recentLike";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LikeFilterSortType> tEnumJsonAdapter = new TEnumJsonAdapter<LikeFilterSortType>() { // from class: com.p1.mobile.putong.core.data.LikeFilterSortType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LikeFilterSortType newTEnum(String str, int i) {
                return LikeFilterSortType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LikeFilterSortType>() { // from class: com.p1.mobile.putong.core.data.LikeFilterSortType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LikeFilterSortType newTEnum(String str, int i) {
                return LikeFilterSortType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue(latestLike, 1);
        tEnumJsonAdapter.addExtJsonValue(distOnline, 2);
        tEnumJsonAdapter.addExtJsonValue(realAvatar, 3);
        tEnumJsonAdapter.addExtJsonValue("newUser", 4);
        tEnumJsonAdapter.addExtJsonValue(recentLike, 5);
        tEnumJsonAdapter.addExtJsonValue(nearbyOnline, 6);
        tEnumJsonAdapter.addExtJsonValue(realFace, 7);
        tEnumJsonAdapter.addExtJsonValue(newUserFirst, 8);
        supportEnum.add("default");
        supportEnum.add(latestLike);
        supportEnum.add(distOnline);
        supportEnum.add(realAvatar);
        supportEnum.add("newUser");
        supportEnum.add(recentLike);
        supportEnum.add(nearbyOnline);
        supportEnum.add(realFace);
        supportEnum.add(newUserFirst);
        _LikeFilterSortType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LikeFilterSortType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LikeFilterSortType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LikeFilterSortType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LikeFilterSortType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LikeFilterSortType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LikeFilterSortType get(String str) {
        Map<String, LikeFilterSortType> map = _LikeFilterSortType;
        LikeFilterSortType likeFilterSortType = map.get(str);
        if (likeFilterSortType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            likeFilterSortType = integer == null ? new LikeFilterSortType(str, -1) : new LikeFilterSortType(str, integer.intValue());
            map.put(str, likeFilterSortType);
        }
        return likeFilterSortType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LikeFilterSortType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LikeFilterSortType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LikeFilterSortType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LikeFilterSortType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
