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
public class LoveLetterMessageState extends TEnum {
    public static final TEnumJsonAdapter<LoveLetterMessageState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LoveLetterMessageState> PROTOBUF_ADAPTER;
    private static final Map<String, LoveLetterMessageState> _LoveLetterMessageState;
    public static final String default_ = "default";
    private static final int int_unknown_ = -1;
    public static final String opened = "opened";
    public static final String replied = "replied";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LoveLetterMessageState> tEnumJsonAdapter = new TEnumJsonAdapter<LoveLetterMessageState>() { // from class: com.p1.mobile.putong.core.data.LoveLetterMessageState.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public LoveLetterMessageState m14013newTEnum(String str, int i) {
                return LoveLetterMessageState.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LoveLetterMessageState>() { // from class: com.p1.mobile.putong.core.data.LoveLetterMessageState.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public LoveLetterMessageState m14014newTEnum(String str, int i) {
                return LoveLetterMessageState.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("default");
        supportEnum.add(replied);
        supportEnum.add(opened);
        _LoveLetterMessageState = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LoveLetterMessageState(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LoveLetterMessageState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LoveLetterMessageState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LoveLetterMessageState> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LoveLetterMessageState> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LoveLetterMessageState get(String str) {
        Map<String, LoveLetterMessageState> map = _LoveLetterMessageState;
        LoveLetterMessageState loveLetterMessageState = map.get(str);
        if (loveLetterMessageState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            loveLetterMessageState = integer == null ? new LoveLetterMessageState(str, int_unknown_) : new LoveLetterMessageState(str, integer.intValue());
            map.put(str, loveLetterMessageState);
        }
        return loveLetterMessageState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoveLetterMessageState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LoveLetterMessageState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LoveLetterMessageState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LoveLetterMessageState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
