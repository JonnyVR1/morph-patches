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
public class LikedUserFilter extends TEnum {
    public static final TEnumJsonAdapter<LikedUserFilter> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LikedUserFilter> PROTOBUF_ADAPTER;
    private static final Map<String, LikedUserFilter> _LikedUserFilter;
    public static final String all = "all";
    public static final String blocked = "blocked";
    private static final int int_all = 0;
    private static final int int_blocked = 2;
    private static final int int_lettered = 3;
    private static final int int_superliked = 1;
    private static final int int_unknown_ = -1;
    public static final String lettered = "lettered";
    public static final String superliked = "superliked";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LikedUserFilter> tEnumJsonAdapter = new TEnumJsonAdapter<LikedUserFilter>() { // from class: com.p1.mobile.putong.core.data.LikedUserFilter.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public LikedUserFilter m13893newTEnum(String str, int i) {
                return LikedUserFilter.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LikedUserFilter>() { // from class: com.p1.mobile.putong.core.data.LikedUserFilter.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public LikedUserFilter m13894newTEnum(String str, int i) {
                return LikedUserFilter.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("all", int_all);
        tEnumJsonAdapter.addExtJsonValue(superliked, 1);
        tEnumJsonAdapter.addExtJsonValue(blocked, 2);
        tEnumJsonAdapter.addExtJsonValue(lettered, 3);
        supportEnum.add("all");
        supportEnum.add(superliked);
        supportEnum.add(blocked);
        supportEnum.add(lettered);
        _LikedUserFilter = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LikedUserFilter(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LikedUserFilter> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LikedUserFilter> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LikedUserFilter> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LikedUserFilter> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LikedUserFilter get(String str) {
        Map<String, LikedUserFilter> map = _LikedUserFilter;
        LikedUserFilter likedUserFilter = map.get(str);
        if (likedUserFilter == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            likedUserFilter = integer == null ? new LikedUserFilter(str, int_unknown_) : new LikedUserFilter(str, integer.intValue());
            map.put(str, likedUserFilter);
        }
        return likedUserFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LikedUserFilter getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LikedUserFilter> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LikedUserFilter> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LikedUserFilter get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
