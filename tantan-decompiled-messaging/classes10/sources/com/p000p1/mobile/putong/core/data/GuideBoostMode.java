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
public class GuideBoostMode extends TEnum {
    public static final TEnumJsonAdapter<GuideBoostMode> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<GuideBoostMode> PROTOBUF_ADAPTER;
    private static final Map<String, GuideBoostMode> _GuideBoostMode;
    private static final int int_unknown_ = -1;
    public static final String noop = "noop";
    public static final String pop = "pop";
    protected static HashSet<String> supportEnum = null;
    public static final String swipe = "swipe";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<GuideBoostMode> tEnumJsonAdapter = new TEnumJsonAdapter<GuideBoostMode>() { // from class: com.p1.mobile.putong.core.data.GuideBoostMode.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public GuideBoostMode m13173newTEnum(String str, int i) {
                return GuideBoostMode.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<GuideBoostMode>() { // from class: com.p1.mobile.putong.core.data.GuideBoostMode.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public GuideBoostMode m13174newTEnum(String str, int i) {
                return GuideBoostMode.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("swipe");
        supportEnum.add(pop);
        supportEnum.add(noop);
        _GuideBoostMode = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private GuideBoostMode(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<GuideBoostMode> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GuideBoostMode> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, GuideBoostMode> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, GuideBoostMode> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static GuideBoostMode get(String str) {
        Map<String, GuideBoostMode> map = _GuideBoostMode;
        GuideBoostMode guideBoostMode = map.get(str);
        if (guideBoostMode == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            guideBoostMode = integer == null ? new GuideBoostMode(str, int_unknown_) : new GuideBoostMode(str, integer.intValue());
            map.put(str, guideBoostMode);
        }
        return guideBoostMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GuideBoostMode getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<GuideBoostMode> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, GuideBoostMode> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static GuideBoostMode get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
