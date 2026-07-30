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
public class OMSResourceType extends TEnum {
    public static final TEnumJsonAdapter<OMSResourceType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSResourceType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSResourceType> _OMSResourceType;
    public static final String background = "background";
    public static final String button = "button";
    private static final int int_background = 3;
    private static final int int_button = 2;
    private static final int int_picture = 0;
    private static final int int_text = 1;
    private static final int int_unknown_ = -1;
    public static final String picture = "picture";
    protected static HashSet<String> supportEnum = null;
    public static final String text = "text";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSResourceType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSResourceType>() { // from class: com.p1.mobile.putong.data.OMSResourceType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSResourceType newTEnum(String str, int i) {
                return OMSResourceType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSResourceType>() { // from class: com.p1.mobile.putong.data.OMSResourceType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSResourceType newTEnum(String str, int i) {
                return OMSResourceType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("picture", 0);
        tEnumJsonAdapter.addExtJsonValue("text", 1);
        tEnumJsonAdapter.addExtJsonValue("button", 2);
        tEnumJsonAdapter.addExtJsonValue(background, 3);
        supportEnum.add("picture");
        supportEnum.add("text");
        supportEnum.add("button");
        supportEnum.add(background);
        _OMSResourceType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSResourceType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSResourceType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSResourceType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSResourceType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSResourceType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSResourceType get(String str) {
        Map<String, OMSResourceType> map = _OMSResourceType;
        OMSResourceType oMSResourceType = map.get(str);
        if (oMSResourceType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSResourceType = integer == null ? new OMSResourceType(str, -1) : new OMSResourceType(str, integer.intValue());
            map.put(str, oMSResourceType);
        }
        return oMSResourceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSResourceType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSResourceType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSResourceType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSResourceType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
