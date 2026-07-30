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
public class FollowshipStatus extends TEnum {
    public static final TEnumJsonAdapter<FollowshipStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<FollowshipStatus> PROTOBUF_ADAPTER;
    private static final Map<String, FollowshipStatus> _FollowshipStatus;
    public static final String default_ = "default";
    public static final String followed = "followed";
    public static final String following = "following";
    private static final int int_default_ = 0;
    private static final int int_followed = 2;
    private static final int int_following = 1;
    private static final int int_matched = 3;
    private static final int int_unfollow = 4;
    private static final int int_unknown_ = -1;
    public static final String matched = "matched";
    protected static HashSet<String> supportEnum = null;
    public static final String unfollow = "unfollow";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<FollowshipStatus> tEnumJsonAdapter = new TEnumJsonAdapter<FollowshipStatus>() { // from class: com.p1.mobile.putong.data.FollowshipStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public FollowshipStatus newTEnum(String str, int i) {
                return FollowshipStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<FollowshipStatus>() { // from class: com.p1.mobile.putong.data.FollowshipStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public FollowshipStatus newTEnum(String str, int i) {
                return FollowshipStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue(following, 1);
        tEnumJsonAdapter.addExtJsonValue(followed, 2);
        tEnumJsonAdapter.addExtJsonValue("matched", 3);
        tEnumJsonAdapter.addExtJsonValue(unfollow, 4);
        supportEnum.add("default");
        supportEnum.add(following);
        supportEnum.add(followed);
        supportEnum.add("matched");
        supportEnum.add(unfollow);
        _FollowshipStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private FollowshipStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<FollowshipStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FollowshipStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, FollowshipStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, FollowshipStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static FollowshipStatus get(String str) {
        Map<String, FollowshipStatus> map = _FollowshipStatus;
        FollowshipStatus followshipStatus = map.get(str);
        if (followshipStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            followshipStatus = integer == null ? new FollowshipStatus(str, -1) : new FollowshipStatus(str, integer.intValue());
            map.put(str, followshipStatus);
        }
        return followshipStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FollowshipStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<FollowshipStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, FollowshipStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static FollowshipStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
