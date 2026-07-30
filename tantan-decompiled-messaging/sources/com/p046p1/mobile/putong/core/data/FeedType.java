package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class FeedType extends TEnum {
    public static final TEnumJsonAdapter<FeedType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<FeedType> PROTOBUF_ADAPTER;
    private static final Map<String, FeedType> _FeedType;
    public static final String highSeeUser = "highSeeUser";
    private static final int int_unknown_ = -1;
    public static final String likedUser = "likedUser";
    public static final String localLikersUser = "localLikersUser";
    public static final String lowSeeUser = "lowSeeUser";
    public static final String lowSeeUsers = "lowSeeUsers";
    public static final String momentBeLikeUser = "momentBeLikeUser";
    public static final String momentLikeUser = "momentLikeUser";
    public static final String pickMoment = "pickMoment";
    public static final String pickUser = "pickUser";
    public static final String relationMoment = "relationMoment";
    public static final String seePortraitUser = "seePortraitUser";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<FeedType> tEnumJsonAdapter = new TEnumJsonAdapter<FeedType>() { // from class: com.p1.mobile.putong.core.data.FeedType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public FeedType newTEnum(String str, int i) {
                return FeedType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<FeedType>() { // from class: com.p1.mobile.putong.core.data.FeedType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public FeedType newTEnum(String str, int i) {
                return FeedType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(relationMoment);
        supportEnum.add(pickMoment);
        supportEnum.add(highSeeUser);
        supportEnum.add(lowSeeUsers);
        supportEnum.add(pickUser);
        supportEnum.add("likedUser");
        supportEnum.add(seePortraitUser);
        supportEnum.add(lowSeeUser);
        supportEnum.add(localLikersUser);
        supportEnum.add(momentLikeUser);
        supportEnum.add(momentBeLikeUser);
        _FeedType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private FeedType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<FeedType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FeedType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, FeedType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, FeedType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static FeedType get(String str) {
        Map<String, FeedType> map = _FeedType;
        FeedType feedType = map.get(str);
        if (feedType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            feedType = integer == null ? new FeedType(str, -1) : new FeedType(str, integer.intValue());
            map.put(str, feedType);
        }
        return feedType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FeedType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<FeedType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, FeedType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static FeedType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
