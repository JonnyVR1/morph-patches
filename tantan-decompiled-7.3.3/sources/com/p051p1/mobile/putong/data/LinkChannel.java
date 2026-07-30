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
public class LinkChannel extends TEnum {
    public static final TEnumJsonAdapter<LinkChannel> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LinkChannel> PROTOBUF_ADAPTER;
    private static final Map<String, LinkChannel> _LinkChannel;
    public static final String default_ = "default";
    private static final int int_default_ = 5;
    private static final int int_qq_friend = 6;
    private static final int int_qq_space = 2;
    private static final int int_sina_weibo = 3;
    private static final int int_tantan_moments = 7;
    private static final int int_unknown = 4;
    private static final int int_unknown_ = -1;
    private static final int int_wechat_moments = 0;
    private static final int int_wechat_session = 1;
    public static final String qq_friend = "qq_friend";
    public static final String qq_space = "qq-space";
    public static final String sina_weibo = "sina-weibo";
    protected static HashSet<String> supportEnum = null;
    public static final String tantan_moments = "tantan_moments";
    public static final String unknown = "unknown";
    public static final String unknown_ = "unknown_";
    public static final String wechat_moments = "wechat-moments";
    public static final String wechat_session = "wechat-session";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LinkChannel> tEnumJsonAdapter = new TEnumJsonAdapter<LinkChannel>() { // from class: com.p1.mobile.putong.data.LinkChannel.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LinkChannel newTEnum(String str, int i) {
                return LinkChannel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LinkChannel>() { // from class: com.p1.mobile.putong.data.LinkChannel.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LinkChannel newTEnum(String str, int i) {
                return LinkChannel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("wechat-moments", 0);
        tEnumJsonAdapter.addExtJsonValue("wechat-session", 1);
        tEnumJsonAdapter.addExtJsonValue("qq-space", 2);
        tEnumJsonAdapter.addExtJsonValue("sina-weibo", 3);
        tEnumJsonAdapter.addExtJsonValue("unknown", 4);
        tEnumJsonAdapter.addExtJsonValue("default", 5);
        tEnumJsonAdapter.addExtJsonValue("qq_friend", 6);
        tEnumJsonAdapter.addExtJsonValue("tantan_moments", 7);
        supportEnum.add("wechat-moments");
        supportEnum.add("wechat-session");
        supportEnum.add("qq-space");
        supportEnum.add("sina-weibo");
        supportEnum.add("unknown");
        supportEnum.add("default");
        supportEnum.add("qq_friend");
        supportEnum.add("tantan_moments");
        _LinkChannel = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LinkChannel(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LinkChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LinkChannel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LinkChannel> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LinkChannel> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LinkChannel get(String str) {
        Map<String, LinkChannel> map = _LinkChannel;
        LinkChannel linkChannel = map.get(str);
        if (linkChannel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            linkChannel = integer == null ? new LinkChannel(str, -1) : new LinkChannel(str, integer.intValue());
            map.put(str, linkChannel);
        }
        return linkChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkChannel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LinkChannel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LinkChannel> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LinkChannel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
