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
public class AwardStatus extends TEnum {
    public static final TEnumJsonAdapter<AwardStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<AwardStatus> PROTOBUF_ADAPTER;
    private static final Map<String, AwardStatus> _AwardStatus;
    public static final String boost = "boost";
    private static final int int_boost = 2;
    private static final int int_superlike = 1;
    private static final int int_undo = 0;
    private static final int int_unknown_ = -1;
    public static final String superlike = "superlike";
    protected static HashSet<String> supportEnum = null;
    public static final String undo = "undo";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<AwardStatus> tEnumJsonAdapter = new TEnumJsonAdapter<AwardStatus>() { // from class: com.p1.mobile.putong.core.data.AwardStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public AwardStatus newTEnum(String str, int i) {
                return AwardStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<AwardStatus>() { // from class: com.p1.mobile.putong.core.data.AwardStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public AwardStatus newTEnum(String str, int i) {
                return AwardStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("undo", 0);
        tEnumJsonAdapter.addExtJsonValue("superlike", 1);
        tEnumJsonAdapter.addExtJsonValue("boost", 2);
        supportEnum.add("undo");
        supportEnum.add("superlike");
        supportEnum.add("boost");
        _AwardStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private AwardStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<AwardStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AwardStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, AwardStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, AwardStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static AwardStatus get(String str) {
        Map<String, AwardStatus> map = _AwardStatus;
        AwardStatus awardStatus = map.get(str);
        if (awardStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            awardStatus = integer == null ? new AwardStatus(str, -1) : new AwardStatus(str, integer.intValue());
            map.put(str, awardStatus);
        }
        return awardStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AwardStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<AwardStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, AwardStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static AwardStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
