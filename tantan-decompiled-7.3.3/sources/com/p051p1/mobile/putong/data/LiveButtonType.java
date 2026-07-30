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
public class LiveButtonType extends TEnum {
    public static final TEnumJsonAdapter<LiveButtonType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LiveButtonType> PROTOBUF_ADAPTER;
    private static final Map<String, LiveButtonType> _LiveButtonType;
    public static final String fastGiftButton = "fastGiftButton";
    public static final String firstRechargeButton = "firstRechargeButton";
    public static final String giftButton = "giftButton";
    private static final int int_fastGiftButton = 3;
    private static final int int_firstRechargeButton = 2;
    private static final int int_giftButton = 4;
    private static final int int_settingButton = 5;
    private static final int int_shareButton = 1;
    private static final int int_unknown_ = -1;
    private static final int int_voiceCommunicationButton = 0;
    public static final String settingButton = "settingButton";
    public static final String shareButton = "shareButton";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String voiceCommunicationButton = "voiceCommunicationButton";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LiveButtonType> tEnumJsonAdapter = new TEnumJsonAdapter<LiveButtonType>() { // from class: com.p1.mobile.putong.data.LiveButtonType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LiveButtonType newTEnum(String str, int i) {
                return LiveButtonType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LiveButtonType>() { // from class: com.p1.mobile.putong.data.LiveButtonType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LiveButtonType newTEnum(String str, int i) {
                return LiveButtonType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("voiceCommunicationButton", 0);
        tEnumJsonAdapter.addExtJsonValue("shareButton", 1);
        tEnumJsonAdapter.addExtJsonValue("firstRechargeButton", 2);
        tEnumJsonAdapter.addExtJsonValue("fastGiftButton", 3);
        tEnumJsonAdapter.addExtJsonValue("giftButton", 4);
        tEnumJsonAdapter.addExtJsonValue("settingButton", 5);
        supportEnum.add("voiceCommunicationButton");
        supportEnum.add("shareButton");
        supportEnum.add("firstRechargeButton");
        supportEnum.add("fastGiftButton");
        supportEnum.add("giftButton");
        supportEnum.add("settingButton");
        _LiveButtonType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LiveButtonType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LiveButtonType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LiveButtonType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LiveButtonType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LiveButtonType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LiveButtonType get(String str) {
        Map<String, LiveButtonType> map = _LiveButtonType;
        LiveButtonType liveButtonType = map.get(str);
        if (liveButtonType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            liveButtonType = integer == null ? new LiveButtonType(str, -1) : new LiveButtonType(str, integer.intValue());
            map.put(str, liveButtonType);
        }
        return liveButtonType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LiveButtonType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LiveButtonType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LiveButtonType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LiveButtonType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
