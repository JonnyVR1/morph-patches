package com.p000p1.mobile.putong.data;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CreativeType extends TEnum {
    public static final TEnumJsonAdapter<CreativeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<CreativeType> PROTOBUF_ADAPTER;
    private static final Map<String, CreativeType> _CreativeType;
    public static final String fullImgNoLogo = "fullImgNoLogo";
    public static final String halfImg = "halfImg";
    private static final int int_fullImgNoLogo = 1;
    private static final int int_halfImg = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CreativeType> tEnumJsonAdapter = new TEnumJsonAdapter<CreativeType>() { // from class: com.p1.mobile.putong.data.CreativeType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public CreativeType newTEnum(String str, int i) {
                return CreativeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CreativeType>() { // from class: com.p1.mobile.putong.data.CreativeType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public CreativeType newTEnum(String str, int i) {
                return CreativeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(halfImg, 0);
        tEnumJsonAdapter.addExtJsonValue(fullImgNoLogo, 1);
        supportEnum.add(halfImg);
        supportEnum.add(fullImgNoLogo);
        _CreativeType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private CreativeType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CreativeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CreativeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CreativeType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, CreativeType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static CreativeType get(String str) {
        Map<String, CreativeType> map = _CreativeType;
        CreativeType creativeType = map.get(str);
        if (creativeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            creativeType = integer == null ? new CreativeType(str, -1) : new CreativeType(str, integer.intValue());
            map.put(str, creativeType);
        }
        return creativeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CreativeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CreativeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CreativeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CreativeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
