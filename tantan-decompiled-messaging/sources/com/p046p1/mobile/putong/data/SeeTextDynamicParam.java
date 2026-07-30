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
public class SeeTextDynamicParam extends TEnum {
    public static final TEnumJsonAdapter<SeeTextDynamicParam> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SeeTextDynamicParam> PROTOBUF_ADAPTER;

    /* JADX INFO: renamed from: TA */
    public static final String f38812TA = "TA";
    private static final Map<String, SeeTextDynamicParam> _SeeTextDynamicParam;
    public static final String age = "age";
    public static final String currentLikes = "currentLikes";
    public static final String cutie = "cutie";
    public static final String distance = "distance";
    public static final String filteredLikes = "filteredLikes";
    private static final int int_TA = 7;
    private static final int int_age = 4;
    private static final int int_currentLikes = 0;
    private static final int int_cutie = 6;
    private static final int int_distance = 5;
    private static final int int_filteredLikes = 2;
    private static final int int_lookingFor = 3;
    private static final int int_receivedLikes = 1;
    private static final int int_unknown_ = -1;
    public static final String lookingFor = "lookingFor";
    public static final String receivedLikes = "receivedLikes";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SeeTextDynamicParam> tEnumJsonAdapter = new TEnumJsonAdapter<SeeTextDynamicParam>() { // from class: com.p1.mobile.putong.data.SeeTextDynamicParam.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SeeTextDynamicParam newTEnum(String str, int i) {
                return SeeTextDynamicParam.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SeeTextDynamicParam>() { // from class: com.p1.mobile.putong.data.SeeTextDynamicParam.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SeeTextDynamicParam newTEnum(String str, int i) {
                return SeeTextDynamicParam.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(currentLikes, 0);
        tEnumJsonAdapter.addExtJsonValue("receivedLikes", 1);
        tEnumJsonAdapter.addExtJsonValue(filteredLikes, 2);
        tEnumJsonAdapter.addExtJsonValue(lookingFor, 3);
        tEnumJsonAdapter.addExtJsonValue(age, 4);
        tEnumJsonAdapter.addExtJsonValue("distance", 5);
        tEnumJsonAdapter.addExtJsonValue(cutie, 6);
        tEnumJsonAdapter.addExtJsonValue(f38812TA, 7);
        supportEnum.add(currentLikes);
        supportEnum.add("receivedLikes");
        supportEnum.add(filteredLikes);
        supportEnum.add(lookingFor);
        supportEnum.add(age);
        supportEnum.add("distance");
        supportEnum.add(cutie);
        supportEnum.add(f38812TA);
        _SeeTextDynamicParam = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SeeTextDynamicParam(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SeeTextDynamicParam> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SeeTextDynamicParam> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SeeTextDynamicParam> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SeeTextDynamicParam> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SeeTextDynamicParam get(String str) {
        Map<String, SeeTextDynamicParam> map = _SeeTextDynamicParam;
        SeeTextDynamicParam seeTextDynamicParam = map.get(str);
        if (seeTextDynamicParam == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            seeTextDynamicParam = integer == null ? new SeeTextDynamicParam(str, -1) : new SeeTextDynamicParam(str, integer.intValue());
            map.put(str, seeTextDynamicParam);
        }
        return seeTextDynamicParam;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SeeTextDynamicParam getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SeeTextDynamicParam> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SeeTextDynamicParam> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SeeTextDynamicParam get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
