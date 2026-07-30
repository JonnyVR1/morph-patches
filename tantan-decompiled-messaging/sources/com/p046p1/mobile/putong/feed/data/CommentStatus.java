package com.p046p1.mobile.putong.feed.data;

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
public class CommentStatus extends TEnum {
    public static final TEnumJsonAdapter<CommentStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<CommentStatus> PROTOBUF_ADAPTER;
    private static final Map<String, CommentStatus> _CommentStatus;
    public static final String everyone = "everyone";
    private static final int int_unknown_ = -1;
    public static final String matches = "matches";
    public static final String selfOnly = "selfOnly";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CommentStatus> tEnumJsonAdapter = new TEnumJsonAdapter<CommentStatus>() { // from class: com.p1.mobile.putong.feed.data.CommentStatus.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public CommentStatus newTEnum(String str, int i) {
                return CommentStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CommentStatus>() { // from class: com.p1.mobile.putong.feed.data.CommentStatus.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public CommentStatus newTEnum(String str, int i) {
                return CommentStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("everyone");
        supportEnum.add("matches");
        supportEnum.add("selfOnly");
        _CommentStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private CommentStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CommentStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CommentStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CommentStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, CommentStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static CommentStatus get(String str) {
        Map<String, CommentStatus> map = _CommentStatus;
        CommentStatus commentStatus = map.get(str);
        if (commentStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            commentStatus = integer == null ? new CommentStatus(str, -1) : new CommentStatus(str, integer.intValue());
            map.put(str, commentStatus);
        }
        return commentStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CommentStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CommentStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CommentStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CommentStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
