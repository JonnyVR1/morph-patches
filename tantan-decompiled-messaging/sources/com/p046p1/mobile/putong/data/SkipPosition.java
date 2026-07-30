package com.p046p1.mobile.putong.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes12.dex */
public class SkipPosition extends TEnum {
    public static final TEnumJsonAdapter<SkipPosition> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SkipPosition> PROTOBUF_ADAPTER;
    private static final Map<String, SkipPosition> _SkipPosition;
    public static final String bottomRight = "bottomRight";
    private static final int int_bottomRight = 1;
    private static final int int_topRight = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String topRight = "topRight";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SkipPosition> tEnumJsonAdapter = new TEnumJsonAdapter<SkipPosition>() { // from class: com.p1.mobile.putong.data.SkipPosition.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SkipPosition newTEnum(String str, int i) {
                return SkipPosition.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SkipPosition>() { // from class: com.p1.mobile.putong.data.SkipPosition.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SkipPosition newTEnum(String str, int i) {
                return SkipPosition.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(topRight, 0);
        tEnumJsonAdapter.addExtJsonValue(bottomRight, 1);
        supportEnum.add(topRight);
        supportEnum.add(bottomRight);
        _SkipPosition = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SkipPosition(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SkipPosition> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SkipPosition> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SkipPosition> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SkipPosition> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SkipPosition get(String str) {
        Map<String, SkipPosition> map = _SkipPosition;
        SkipPosition skipPosition = map.get(str);
        if (skipPosition == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            skipPosition = integer == null ? new SkipPosition(str, -1) : new SkipPosition(str, integer.intValue());
            map.put(str, skipPosition);
        }
        return skipPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SkipPosition getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SkipPosition> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SkipPosition> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
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
        return !supportEnum.contains(this.name);
    }

    private static SkipPosition get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
