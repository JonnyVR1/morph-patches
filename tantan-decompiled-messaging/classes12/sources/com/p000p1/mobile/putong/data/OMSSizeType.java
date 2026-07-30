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
public class OMSSizeType extends TEnum {
    public static final TEnumJsonAdapter<OMSSizeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSSizeType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSSizeType> _OMSSizeType;
    public static final String exactly = "exactly";
    private static final int int_exactly = 2;
    private static final int int_match_parent = 0;
    private static final int int_ratio = 3;
    private static final int int_unknown_ = -1;
    private static final int int_wrap_content = 1;
    public static final String match_parent = "match_parent";
    public static final String ratio = "ratio";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String wrap_content = "wrap_content";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSSizeType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSSizeType>() { // from class: com.p1.mobile.putong.data.OMSSizeType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSSizeType newTEnum(String str, int i) {
                return OMSSizeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSSizeType>() { // from class: com.p1.mobile.putong.data.OMSSizeType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSSizeType newTEnum(String str, int i) {
                return OMSSizeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(match_parent, 0);
        tEnumJsonAdapter.addExtJsonValue(wrap_content, 1);
        tEnumJsonAdapter.addExtJsonValue(exactly, 2);
        tEnumJsonAdapter.addExtJsonValue(ratio, 3);
        supportEnum.add(match_parent);
        supportEnum.add(wrap_content);
        supportEnum.add(exactly);
        supportEnum.add(ratio);
        _OMSSizeType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSSizeType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSSizeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSSizeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSSizeType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSSizeType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSSizeType get(String str) {
        Map<String, OMSSizeType> map = _OMSSizeType;
        OMSSizeType oMSSizeType = map.get(str);
        if (oMSSizeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSSizeType = integer == null ? new OMSSizeType(str, -1) : new OMSSizeType(str, integer.intValue());
            map.put(str, oMSSizeType);
        }
        return oMSSizeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSSizeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSSizeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSSizeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSSizeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
