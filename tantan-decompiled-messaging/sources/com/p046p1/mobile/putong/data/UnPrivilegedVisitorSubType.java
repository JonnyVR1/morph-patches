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
public class UnPrivilegedVisitorSubType extends TEnum {
    public static final TEnumJsonAdapter<UnPrivilegedVisitorSubType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<UnPrivilegedVisitorSubType> PROTOBUF_ADAPTER;
    private static final Map<String, UnPrivilegedVisitorSubType> _UnPrivilegedVisitorSubType;
    public static final String firstAnd10YearsOlder = "firstAnd10YearsOlder";
    public static final String firstAndNot10YearsOlder = "firstAndNot10YearsOlder";
    private static final int int_unknown_ = -1;
    public static final String repeatAndBeyond24 = "repeatAndBeyond24";
    public static final String repeatAndWithin24 = "repeatAndWithin24";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<UnPrivilegedVisitorSubType> tEnumJsonAdapter = new TEnumJsonAdapter<UnPrivilegedVisitorSubType>() { // from class: com.p1.mobile.putong.data.UnPrivilegedVisitorSubType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public UnPrivilegedVisitorSubType newTEnum(String str, int i) {
                return UnPrivilegedVisitorSubType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<UnPrivilegedVisitorSubType>() { // from class: com.p1.mobile.putong.data.UnPrivilegedVisitorSubType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public UnPrivilegedVisitorSubType newTEnum(String str, int i) {
                return UnPrivilegedVisitorSubType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(repeatAndWithin24);
        supportEnum.add(repeatAndBeyond24);
        supportEnum.add(firstAndNot10YearsOlder);
        supportEnum.add(firstAnd10YearsOlder);
        _UnPrivilegedVisitorSubType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private UnPrivilegedVisitorSubType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<UnPrivilegedVisitorSubType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UnPrivilegedVisitorSubType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, UnPrivilegedVisitorSubType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, UnPrivilegedVisitorSubType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static UnPrivilegedVisitorSubType get(String str) {
        Map<String, UnPrivilegedVisitorSubType> map = _UnPrivilegedVisitorSubType;
        UnPrivilegedVisitorSubType unPrivilegedVisitorSubType = map.get(str);
        if (unPrivilegedVisitorSubType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            unPrivilegedVisitorSubType = integer == null ? new UnPrivilegedVisitorSubType(str, -1) : new UnPrivilegedVisitorSubType(str, integer.intValue());
            map.put(str, unPrivilegedVisitorSubType);
        }
        return unPrivilegedVisitorSubType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UnPrivilegedVisitorSubType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<UnPrivilegedVisitorSubType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, UnPrivilegedVisitorSubType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static UnPrivilegedVisitorSubType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
