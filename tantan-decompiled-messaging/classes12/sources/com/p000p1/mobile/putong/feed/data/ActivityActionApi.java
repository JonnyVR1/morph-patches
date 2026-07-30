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
public class ActivityActionApi extends TEnum {
    public static final TEnumJsonAdapter<ActivityActionApi> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ActivityActionApi> PROTOBUF_ADAPTER;
    private static final Map<String, ActivityActionApi> _ActivityActionApi;
    public static final String comment = "comment";
    public static final String comment_like = "comment_like";
    public static final String comment_reply = "comment_reply";
    public static final String follow = "follow";
    public static final String forward_moment = "forward_moment";
    public static final String gift_home = "gift_home";
    public static final String gift_moment = "gift_moment";
    private static final int int_comment = 1;
    private static final int int_comment_like = 4;
    private static final int int_comment_reply = 5;
    private static final int int_follow = 2;
    private static final int int_gift_home = 9;
    private static final int int_gift_moment = 8;
    private static final int int_like = 0;
    private static final int int_relationship_liked = 3;
    private static final int int_topic_comment_like = 6;
    private static final int int_topic_comment_reply = 7;
    private static final int int_unknown_ = -1;
    public static final String like = "like";
    public static final String merge_likes = "merge_likes";
    public static final String moment_swipe = "moment_swipe";
    public static final String relationship_liked = "relationship_liked";
    protected static HashSet<String> supportEnum = null;
    public static final String topic_comment_like = "topic_comment_like";
    public static final String topic_comment_reply = "topic_comment_reply";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ActivityActionApi> tEnumJsonAdapter = new TEnumJsonAdapter<ActivityActionApi>() { // from class: com.p1.mobile.putong.feed.data.ActivityActionApi.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ActivityActionApi newTEnum(String str, int i) {
                return ActivityActionApi.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ActivityActionApi>() { // from class: com.p1.mobile.putong.feed.data.ActivityActionApi.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ActivityActionApi newTEnum(String str, int i) {
                return ActivityActionApi.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("like", 0);
        tEnumJsonAdapter.addExtJsonValue("comment", 1);
        tEnumJsonAdapter.addExtJsonValue("follow", 2);
        tEnumJsonAdapter.addExtJsonValue(relationship_liked, 3);
        tEnumJsonAdapter.addExtJsonValue(comment_like, 4);
        tEnumJsonAdapter.addExtJsonValue(comment_reply, 5);
        tEnumJsonAdapter.addExtJsonValue(topic_comment_like, 6);
        tEnumJsonAdapter.addExtJsonValue(topic_comment_reply, 7);
        tEnumJsonAdapter.addExtJsonValue(gift_moment, 8);
        tEnumJsonAdapter.addExtJsonValue(gift_home, 9);
        supportEnum.add("like");
        supportEnum.add("comment");
        supportEnum.add("follow");
        supportEnum.add(relationship_liked);
        supportEnum.add(comment_like);
        supportEnum.add(comment_reply);
        supportEnum.add(topic_comment_like);
        supportEnum.add(topic_comment_reply);
        supportEnum.add(gift_moment);
        supportEnum.add(gift_home);
        supportEnum.add(moment_swipe);
        supportEnum.add(forward_moment);
        supportEnum.add(merge_likes);
        _ActivityActionApi = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ActivityActionApi(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ActivityActionApi> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ActivityActionApi> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ActivityActionApi> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ActivityActionApi> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ActivityActionApi get(String str) {
        Map<String, ActivityActionApi> map = _ActivityActionApi;
        ActivityActionApi activityActionApi = map.get(str);
        if (activityActionApi == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            activityActionApi = integer == null ? new ActivityActionApi(str, -1) : new ActivityActionApi(str, integer.intValue());
            map.put(str, activityActionApi);
        }
        return activityActionApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ActivityActionApi getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ActivityActionApi> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ActivityActionApi> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ActivityActionApi get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
