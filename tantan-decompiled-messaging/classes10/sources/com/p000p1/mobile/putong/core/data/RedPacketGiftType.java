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
public class RedPacketGiftType extends TEnum {
    public static final TEnumJsonAdapter<RedPacketGiftType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<RedPacketGiftType> PROTOBUF_ADAPTER;
    private static final Map<String, RedPacketGiftType> _RedPacketGiftType;
    public static final String clover = "clover";
    private static final int int_clover = 0;
    private static final int int_lemon = 2;
    private static final int int_peach = 5;
    private static final int int_rose = 3;
    private static final int int_sunflower = 4;
    private static final int int_unknown_ = -1;
    private static final int int_watermelon = 1;
    public static final String lemon = "lemon";
    public static final String peach = "peach";
    public static final String rose = "rose";
    public static final String sunflower = "sunflower";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String watermelon = "watermelon";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<RedPacketGiftType> tEnumJsonAdapter = new TEnumJsonAdapter<RedPacketGiftType>() { // from class: com.p1.mobile.putong.core.data.RedPacketGiftType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public RedPacketGiftType m15335newTEnum(String str, int i) {
                return RedPacketGiftType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<RedPacketGiftType>() { // from class: com.p1.mobile.putong.core.data.RedPacketGiftType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public RedPacketGiftType m15336newTEnum(String str, int i) {
                return RedPacketGiftType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(clover, int_clover);
        tEnumJsonAdapter.addExtJsonValue(watermelon, 1);
        tEnumJsonAdapter.addExtJsonValue(lemon, 2);
        tEnumJsonAdapter.addExtJsonValue(rose, 3);
        tEnumJsonAdapter.addExtJsonValue(sunflower, int_sunflower);
        tEnumJsonAdapter.addExtJsonValue(peach, 5);
        supportEnum.add(clover);
        supportEnum.add(watermelon);
        supportEnum.add(lemon);
        supportEnum.add(rose);
        supportEnum.add(sunflower);
        supportEnum.add(peach);
        _RedPacketGiftType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private RedPacketGiftType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<RedPacketGiftType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<RedPacketGiftType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, RedPacketGiftType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, RedPacketGiftType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static RedPacketGiftType get(String str) {
        Map<String, RedPacketGiftType> map = _RedPacketGiftType;
        RedPacketGiftType redPacketGiftType = map.get(str);
        if (redPacketGiftType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            redPacketGiftType = integer == null ? new RedPacketGiftType(str, int_unknown_) : new RedPacketGiftType(str, integer.intValue());
            map.put(str, redPacketGiftType);
        }
        return redPacketGiftType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RedPacketGiftType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<RedPacketGiftType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, RedPacketGiftType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static RedPacketGiftType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
