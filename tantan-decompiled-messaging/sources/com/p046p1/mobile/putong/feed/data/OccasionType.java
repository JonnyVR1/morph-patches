package com.p046p1.mobile.putong.feed.data;

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
public class OccasionType extends TEnum {
    public static final TEnumJsonAdapter<OccasionType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OccasionType> PROTOBUF_ADAPTER;
    private static final Map<String, OccasionType> _OccasionType;
    public static final String frequency = "frequency";
    public static final String immediatelyShowFrequency = "immediatelyShowFrequency";
    private static final int int_unknown_ = -1;
    public static final String readFrequency = "readFrequency";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OccasionType> tEnumJsonAdapter = new TEnumJsonAdapter<OccasionType>() { // from class: com.p1.mobile.putong.feed.data.OccasionType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OccasionType newTEnum(String str, int i) {
                return OccasionType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OccasionType>() { // from class: com.p1.mobile.putong.feed.data.OccasionType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OccasionType newTEnum(String str, int i) {
                return OccasionType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(readFrequency);
        supportEnum.add(immediatelyShowFrequency);
        supportEnum.add("frequency");
        _OccasionType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OccasionType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OccasionType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OccasionType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OccasionType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OccasionType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OccasionType get(String str) {
        Map<String, OccasionType> map = _OccasionType;
        OccasionType occasionType = map.get(str);
        if (occasionType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            occasionType = integer == null ? new OccasionType(str, -1) : new OccasionType(str, integer.intValue());
            map.put(str, occasionType);
        }
        return occasionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OccasionType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OccasionType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OccasionType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OccasionType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
