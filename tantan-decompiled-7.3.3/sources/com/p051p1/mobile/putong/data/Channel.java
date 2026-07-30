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
public class Channel extends TEnum {
    public static final TEnumJsonAdapter<Channel> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<Channel> PROTOBUF_ADAPTER;
    private static final Map<String, Channel> _Channel;
    public static final String anonymous = "anonymous";
    public static final String city_c = "city_c";
    public static final String club = "club";
    public static final String comment_forward = "comment_forward";
    public static final String confession = "confession";
    public static final String fake = "fake";
    public static final String greeting = "greeting";
    public static final String greeting_guide = "greeting_guide";
    public static final String instant_chat = "instant_chat";
    private static final int int_unknown_ = -1;
    public static final String kankan = "kankan";
    public static final String message = "message";
    public static final String moment = "moment";
    public static final String mymeet = "mymeet";
    public static final String red_flower = "red_flower";
    public static final String reply_thanks = "reply_thanks";
    public static final String see_upgraded = "see_upgraded";
    public static final String seekPartnerNum = "seekPartnerNum";
    public static final String specialguest = "specialguest";
    public static final String state = "state";
    protected static HashSet<String> supportEnum = null;
    public static final String surprise_box = "surprise_box";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<Channel> tEnumJsonAdapter = new TEnumJsonAdapter<Channel>() { // from class: com.p1.mobile.putong.data.Channel.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public Channel newTEnum(String str, int i) {
                return Channel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<Channel>() { // from class: com.p1.mobile.putong.data.Channel.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public Channel newTEnum(String str, int i) {
                return Channel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("moment");
        supportEnum.add("kankan");
        supportEnum.add(specialguest);
        supportEnum.add("anonymous");
        supportEnum.add("see_upgraded");
        supportEnum.add("state");
        supportEnum.add("mymeet");
        supportEnum.add("message");
        supportEnum.add(club);
        supportEnum.add(comment_forward);
        supportEnum.add(greeting_guide);
        supportEnum.add(reply_thanks);
        supportEnum.add("instant_chat");
        supportEnum.add(fake);
        supportEnum.add("greeting");
        supportEnum.add(city_c);
        supportEnum.add(surprise_box);
        supportEnum.add(red_flower);
        supportEnum.add(confession);
        supportEnum.add("seekPartnerNum");
        _Channel = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private Channel(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<Channel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Channel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, Channel> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Channel> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static Channel get(String str) {
        Map<String, Channel> map = _Channel;
        Channel channel = map.get(str);
        if (channel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            channel = integer == null ? new Channel(str, -1) : new Channel(str, integer.intValue());
            map.put(str, channel);
        }
        return channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Channel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<Channel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, Channel> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static Channel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
