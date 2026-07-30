package com.p000p1.mobile.putong.data;

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
public class FriendCommentAction extends TEnum {
    public static final TEnumJsonAdapter<FriendCommentAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<FriendCommentAction> PROTOBUF_ADAPTER;
    private static final Map<String, FriendCommentAction> _FriendCommentAction;
    public static final String default_ = "default";
    public static final String deleted = "deleted";
    public static final String displayOnCard = "displayOnCard";
    public static final String hidden = "hidden";
    private static final int int_default_ = 2;
    private static final int int_deleted = 3;
    private static final int int_displayOnCard = 1;
    private static final int int_hidden = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<FriendCommentAction> tEnumJsonAdapter = new TEnumJsonAdapter<FriendCommentAction>() { // from class: com.p1.mobile.putong.data.FriendCommentAction.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public FriendCommentAction newTEnum(String str, int i) {
                return FriendCommentAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<FriendCommentAction>() { // from class: com.p1.mobile.putong.data.FriendCommentAction.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public FriendCommentAction newTEnum(String str, int i) {
                return FriendCommentAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("hidden", 0);
        tEnumJsonAdapter.addExtJsonValue(displayOnCard, 1);
        tEnumJsonAdapter.addExtJsonValue("default", 2);
        tEnumJsonAdapter.addExtJsonValue("deleted", 3);
        supportEnum.add("hidden");
        supportEnum.add(displayOnCard);
        supportEnum.add("default");
        supportEnum.add("deleted");
        _FriendCommentAction = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private FriendCommentAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<FriendCommentAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<FriendCommentAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, FriendCommentAction> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, FriendCommentAction> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static FriendCommentAction get(String str) {
        Map<String, FriendCommentAction> map = _FriendCommentAction;
        FriendCommentAction friendCommentAction = map.get(str);
        if (friendCommentAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            friendCommentAction = integer == null ? new FriendCommentAction(str, -1) : new FriendCommentAction(str, integer.intValue());
            map.put(str, friendCommentAction);
        }
        return friendCommentAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FriendCommentAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<FriendCommentAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, FriendCommentAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static FriendCommentAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
