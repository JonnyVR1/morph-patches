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
public class NavigationCardIntent extends TEnum {
    public static final TEnumJsonAdapter<NavigationCardIntent> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<NavigationCardIntent> PROTOBUF_ADAPTER;
    private static final Map<String, NavigationCardIntent> _NavigationCardIntent;
    public static final String boosting = "boosting";
    public static final String cards = "cards";
    public static final String group_chat = "group_chat";
    public static final String immersion_video = "immersion_video";
    private static final int int_cards = 0;
    private static final int int_group_chat = 1;
    private static final int int_kankan = 3;
    private static final int int_unknown_ = -1;
    private static final int int_voice_live = 2;
    public static final String kankan = "kankan";
    public static final String meTab = "meTab";
    public static final String moment_theme_card = "moment_theme_card";
    public static final String odiamond_private_custom = "odiamond_private_custom";
    public static final String play_together = "play_together";
    protected static HashSet<String> supportEnum = null;
    public static final String supreme_sartner = "supreme_sartner";
    public static final String unknown_ = "unknown_";
    public static final String voice_live = "voice_live";
    public static final String wanwan = "wanwan";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<NavigationCardIntent> tEnumJsonAdapter = new TEnumJsonAdapter<NavigationCardIntent>() { // from class: com.p1.mobile.putong.data.NavigationCardIntent.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public NavigationCardIntent newTEnum(String str, int i) {
                return NavigationCardIntent.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<NavigationCardIntent>() { // from class: com.p1.mobile.putong.data.NavigationCardIntent.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public NavigationCardIntent newTEnum(String str, int i) {
                return NavigationCardIntent.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("cards", 0);
        tEnumJsonAdapter.addExtJsonValue("group_chat", 1);
        tEnumJsonAdapter.addExtJsonValue(voice_live, 2);
        tEnumJsonAdapter.addExtJsonValue("kankan", 3);
        supportEnum.add("cards");
        supportEnum.add("group_chat");
        supportEnum.add(voice_live);
        supportEnum.add("kankan");
        supportEnum.add("immersion_video");
        supportEnum.add(wanwan);
        supportEnum.add(play_together);
        supportEnum.add(moment_theme_card);
        supportEnum.add(boosting);
        supportEnum.add(meTab);
        supportEnum.add(supreme_sartner);
        supportEnum.add(odiamond_private_custom);
        _NavigationCardIntent = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private NavigationCardIntent(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<NavigationCardIntent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NavigationCardIntent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, NavigationCardIntent> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, NavigationCardIntent> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static NavigationCardIntent get(String str) {
        Map<String, NavigationCardIntent> map = _NavigationCardIntent;
        NavigationCardIntent navigationCardIntent = map.get(str);
        if (navigationCardIntent == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            navigationCardIntent = integer == null ? new NavigationCardIntent(str, -1) : new NavigationCardIntent(str, integer.intValue());
            map.put(str, navigationCardIntent);
        }
        return navigationCardIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NavigationCardIntent getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<NavigationCardIntent> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, NavigationCardIntent> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static NavigationCardIntent get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
