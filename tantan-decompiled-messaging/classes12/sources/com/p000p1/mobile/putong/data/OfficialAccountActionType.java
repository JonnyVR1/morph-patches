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
public class OfficialAccountActionType extends TEnum {
    public static final TEnumJsonAdapter<OfficialAccountActionType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OfficialAccountActionType> PROTOBUF_ADAPTER;
    private static final Map<String, OfficialAccountActionType> _OfficialAccountActionType;
    public static final String click = "click";
    private static final int int_click = 2;
    private static final int int_schema = 1;
    private static final int int_text = 0;
    private static final int int_unknown_ = -1;
    public static final String schema = "schema";
    protected static HashSet<String> supportEnum = null;
    public static final String text = "text";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OfficialAccountActionType> tEnumJsonAdapter = new TEnumJsonAdapter<OfficialAccountActionType>() { // from class: com.p1.mobile.putong.data.OfficialAccountActionType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OfficialAccountActionType newTEnum(String str, int i) {
                return OfficialAccountActionType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OfficialAccountActionType>() { // from class: com.p1.mobile.putong.data.OfficialAccountActionType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OfficialAccountActionType newTEnum(String str, int i) {
                return OfficialAccountActionType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("text", 0);
        tEnumJsonAdapter.addExtJsonValue(schema, 1);
        tEnumJsonAdapter.addExtJsonValue("click", 2);
        supportEnum.add("text");
        supportEnum.add(schema);
        supportEnum.add("click");
        _OfficialAccountActionType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OfficialAccountActionType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OfficialAccountActionType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OfficialAccountActionType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OfficialAccountActionType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OfficialAccountActionType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OfficialAccountActionType get(String str) {
        Map<String, OfficialAccountActionType> map = _OfficialAccountActionType;
        OfficialAccountActionType officialAccountActionType = map.get(str);
        if (officialAccountActionType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            officialAccountActionType = integer == null ? new OfficialAccountActionType(str, -1) : new OfficialAccountActionType(str, integer.intValue());
            map.put(str, officialAccountActionType);
        }
        return officialAccountActionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OfficialAccountActionType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OfficialAccountActionType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OfficialAccountActionType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OfficialAccountActionType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
