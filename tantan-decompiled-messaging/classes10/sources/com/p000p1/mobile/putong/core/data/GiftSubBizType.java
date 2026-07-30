package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftSubBizType extends TEnum {
    public static final TEnumJsonAdapter<GiftSubBizType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GiftSubBizType> PROTOBUF_ADAPTER;
    private static final Map<String, GiftSubBizType> _GiftSubBizType;
    public static final String greet = "greet";
    private static final int int_mymeet = 1;
    private static final int int_quickchat = 0;
    private static final int int_unknown_ = -1;
    public static final String mymeet = "mymeet";
    public static final String quickchat = "quickchat";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GiftSubBizType> tEnumJsonAdapter = new TEnumJsonAdapter<GiftSubBizType>() { // from class: com.p1.mobile.putong.core.data.GiftSubBizType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public GiftSubBizType m12961newTEnum(String str, int i) {
                return GiftSubBizType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GiftSubBizType>() { // from class: com.p1.mobile.putong.core.data.GiftSubBizType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public GiftSubBizType m12962newTEnum(String str, int i) {
                return GiftSubBizType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("quickchat", int_quickchat);
        tEnumJsonAdapter.addExtJsonValue(mymeet, 1);
        supportEnum.add("quickchat");
        supportEnum.add(mymeet);
        supportEnum.add(greet);
        _GiftSubBizType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GiftSubBizType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GiftSubBizType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GiftSubBizType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GiftSubBizType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GiftSubBizType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GiftSubBizType get(String str) {
        Map<String, GiftSubBizType> map = _GiftSubBizType;
        GiftSubBizType giftSubBizType = map.get(str);
        if (giftSubBizType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            giftSubBizType = integer == null ? new GiftSubBizType(str, int_unknown_) : new GiftSubBizType(str, integer.intValue());
            map.put(str, giftSubBizType);
        }
        return giftSubBizType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GiftSubBizType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GiftSubBizType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GiftSubBizType> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static GiftSubBizType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
