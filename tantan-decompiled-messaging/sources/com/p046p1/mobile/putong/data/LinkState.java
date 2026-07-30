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
public class LinkState extends TEnum {
    public static final TEnumJsonAdapter<LinkState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LinkState> PROTOBUF_ADAPTER;
    private static final Map<String, LinkState> _LinkState;
    public static final String default_ = "default";
    private static final int int_default_ = 2;
    private static final int int_published = 0;
    private static final int int_retracted = 1;
    private static final int int_unknown_ = -1;
    public static final String published = "published";
    public static final String retracted = "retracted";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LinkState> tEnumJsonAdapter = new TEnumJsonAdapter<LinkState>() { // from class: com.p1.mobile.putong.data.LinkState.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LinkState newTEnum(String str, int i) {
                return LinkState.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LinkState>() { // from class: com.p1.mobile.putong.data.LinkState.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LinkState newTEnum(String str, int i) {
                return LinkState.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(published, 0);
        tEnumJsonAdapter.addExtJsonValue(retracted, 1);
        tEnumJsonAdapter.addExtJsonValue("default", 2);
        supportEnum.add(published);
        supportEnum.add(retracted);
        supportEnum.add("default");
        _LinkState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LinkState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LinkState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LinkState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LinkState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LinkState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LinkState get(String str) {
        Map<String, LinkState> map = _LinkState;
        LinkState linkState = map.get(str);
        if (linkState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            linkState = integer == null ? new LinkState(str, -1) : new LinkState(str, integer.intValue());
            map.put(str, linkState);
        }
        return linkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LinkState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LinkState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LinkState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
