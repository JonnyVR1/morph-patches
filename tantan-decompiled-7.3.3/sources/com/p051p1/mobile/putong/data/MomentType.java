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
public class MomentType extends TEnum {
    public static final TEnumJsonAdapter<MomentType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MomentType> PROTOBUF_ADAPTER;
    private static final Map<String, MomentType> _MomentType;
    public static final String anonymous = "anonymous";
    public static final String default_ = "default";
    public static final String forwardMoment = "forwardMoment";
    private static final int int_anonymous = 6;
    private static final int int_default_ = 0;
    private static final int int_president = 5;
    private static final int int_seeAd = 4;
    private static final int int_unknown_ = -1;
    private static final int int_userDescription = 1;
    private static final int int_userImages = 2;
    private static final int int_userVideos = 3;
    public static final String president = "president";
    public static final String seeAd = "seeAd";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String userDescription = "userDescription";
    public static final String userImages = "userImages";
    public static final String userVideos = "userVideos";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MomentType> tEnumJsonAdapter = new TEnumJsonAdapter<MomentType>() { // from class: com.p1.mobile.putong.data.MomentType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MomentType newTEnum(String str, int i) {
                return MomentType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MomentType>() { // from class: com.p1.mobile.putong.data.MomentType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MomentType newTEnum(String str, int i) {
                return MomentType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue("userDescription", 1);
        tEnumJsonAdapter.addExtJsonValue("userImages", 2);
        tEnumJsonAdapter.addExtJsonValue("userVideos", 3);
        tEnumJsonAdapter.addExtJsonValue("seeAd", 4);
        tEnumJsonAdapter.addExtJsonValue("president", 5);
        tEnumJsonAdapter.addExtJsonValue("anonymous", 6);
        supportEnum.add("default");
        supportEnum.add("userDescription");
        supportEnum.add("userImages");
        supportEnum.add("userVideos");
        supportEnum.add("seeAd");
        supportEnum.add("president");
        supportEnum.add("anonymous");
        supportEnum.add(forwardMoment);
        _MomentType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MomentType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MomentType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MomentType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MomentType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MomentType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MomentType get(String str) {
        Map<String, MomentType> map = _MomentType;
        MomentType momentType = map.get(str);
        if (momentType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            momentType = integer == null ? new MomentType(str, -1) : new MomentType(str, integer.intValue());
            map.put(str, momentType);
        }
        return momentType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MomentType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MomentType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MomentType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MomentType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
