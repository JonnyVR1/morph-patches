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
public class LoveLetterGroupState extends TEnum {
    public static final TEnumJsonAdapter<LoveLetterGroupState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LoveLetterGroupState> PROTOBUF_ADAPTER;
    private static final Map<String, LoveLetterGroupState> _LoveLetterGroupState;
    public static final String entrance = "entrance";
    public static final String failed = "failed";
    private static final int int_unknown_ = -1;
    public static final String picVerified = "picVerified";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LoveLetterGroupState> tEnumJsonAdapter = new TEnumJsonAdapter<LoveLetterGroupState>() { // from class: com.p1.mobile.putong.core.data.LoveLetterGroupState.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LoveLetterGroupState newTEnum(String str, int i) {
                return LoveLetterGroupState.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LoveLetterGroupState>() { // from class: com.p1.mobile.putong.core.data.LoveLetterGroupState.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LoveLetterGroupState newTEnum(String str, int i) {
                return LoveLetterGroupState.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(entrance);
        supportEnum.add(picVerified);
        supportEnum.add("failed");
        _LoveLetterGroupState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private LoveLetterGroupState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LoveLetterGroupState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LoveLetterGroupState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LoveLetterGroupState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, LoveLetterGroupState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static LoveLetterGroupState get(String str) {
        Map<String, LoveLetterGroupState> map = _LoveLetterGroupState;
        LoveLetterGroupState loveLetterGroupState = map.get(str);
        if (loveLetterGroupState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            loveLetterGroupState = integer == null ? new LoveLetterGroupState(str, -1) : new LoveLetterGroupState(str, integer.intValue());
            map.put(str, loveLetterGroupState);
        }
        return loveLetterGroupState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoveLetterGroupState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LoveLetterGroupState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LoveLetterGroupState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LoveLetterGroupState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
