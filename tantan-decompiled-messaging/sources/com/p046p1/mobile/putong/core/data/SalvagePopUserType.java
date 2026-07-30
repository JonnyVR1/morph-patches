package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class SalvagePopUserType extends TEnum {
    public static final TEnumJsonAdapter<SalvagePopUserType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SalvagePopUserType> PROTOBUF_ADAPTER;
    private static final Map<String, SalvagePopUserType> _SalvagePopUserType;
    private static final int int_unknown_ = -1;
    public static final String rightSwipe = "rightSwipe";
    public static final String see = "see";
    protected static HashSet<String> supportEnum = null;
    public static final String ultra = "ultra";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SalvagePopUserType> tEnumJsonAdapter = new TEnumJsonAdapter<SalvagePopUserType>() { // from class: com.p1.mobile.putong.core.data.SalvagePopUserType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SalvagePopUserType newTEnum(String str, int i) {
                return SalvagePopUserType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SalvagePopUserType>() { // from class: com.p1.mobile.putong.core.data.SalvagePopUserType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SalvagePopUserType newTEnum(String str, int i) {
                return SalvagePopUserType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("see");
        supportEnum.add(rightSwipe);
        supportEnum.add("ultra");
        _SalvagePopUserType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SalvagePopUserType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SalvagePopUserType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SalvagePopUserType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SalvagePopUserType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SalvagePopUserType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SalvagePopUserType get(String str) {
        Map<String, SalvagePopUserType> map = _SalvagePopUserType;
        SalvagePopUserType salvagePopUserType = map.get(str);
        if (salvagePopUserType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            salvagePopUserType = integer == null ? new SalvagePopUserType(str, -1) : new SalvagePopUserType(str, integer.intValue());
            map.put(str, salvagePopUserType);
        }
        return salvagePopUserType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SalvagePopUserType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SalvagePopUserType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SalvagePopUserType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SalvagePopUserType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
