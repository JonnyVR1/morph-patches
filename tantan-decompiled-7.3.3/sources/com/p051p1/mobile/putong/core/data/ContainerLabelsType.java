package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class ContainerLabelsType extends TEnum {
    public static final TEnumJsonAdapter<ContainerLabelsType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ContainerLabelsType> PROTOBUF_ADAPTER;
    private static final Map<String, ContainerLabelsType> _ContainerLabelsType;
    public static final String boost_like_you = "boost_like_you";
    public static final String card_new_user_label = "card_new_user_label";
    public static final String daily_picks = "daily_picks";
    public static final String dynamic_label = "dynamic_label";
    private static final int int_unknown_ = -1;
    public static final String like_you = "like_you";
    public static final String live = "live";
    public static final String membership_exclusive = "membership_exclusive";
    public static final String moment = "moment";
    public static final String mute_video = "mute_video";
    public static final String old_match = "old_match";
    public static final String pin_like = "pin_like";
    public static final String same_interests = "same_interests";
    public static final String selection = "selection";
    protected static HashSet<String> supportEnum = null;
    public static final String tacit_test = "tacit_test";
    public static final String unknown_ = "unknown_";
    public static final String user_state = "user_state";
    public static final String verified = "verified";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ContainerLabelsType> tEnumJsonAdapter = new TEnumJsonAdapter<ContainerLabelsType>() { // from class: com.p1.mobile.putong.core.data.ContainerLabelsType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ContainerLabelsType newTEnum(String str, int i) {
                return ContainerLabelsType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ContainerLabelsType>() { // from class: com.p1.mobile.putong.core.data.ContainerLabelsType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ContainerLabelsType newTEnum(String str, int i) {
                return ContainerLabelsType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(membership_exclusive);
        supportEnum.add(pin_like);
        supportEnum.add("live");
        supportEnum.add(old_match);
        supportEnum.add(daily_picks);
        supportEnum.add(boost_like_you);
        supportEnum.add(like_you);
        supportEnum.add("tacit_test");
        supportEnum.add("verified");
        supportEnum.add(card_new_user_label);
        supportEnum.add(dynamic_label);
        supportEnum.add(same_interests);
        supportEnum.add(user_state);
        supportEnum.add(mute_video);
        supportEnum.add("moment");
        supportEnum.add("selection");
        _ContainerLabelsType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ContainerLabelsType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ContainerLabelsType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ContainerLabelsType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ContainerLabelsType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ContainerLabelsType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ContainerLabelsType get(String str) {
        Map<String, ContainerLabelsType> map = _ContainerLabelsType;
        ContainerLabelsType containerLabelsType = map.get(str);
        if (containerLabelsType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            containerLabelsType = integer == null ? new ContainerLabelsType(str, -1) : new ContainerLabelsType(str, integer.intValue());
            map.put(str, containerLabelsType);
        }
        return containerLabelsType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ContainerLabelsType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ContainerLabelsType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ContainerLabelsType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ContainerLabelsType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
