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
public class OmsConstraintDimension extends TEnum {
    public static final TEnumJsonAdapter<OmsConstraintDimension> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OmsConstraintDimension> PROTOBUF_ADAPTER;
    private static final Map<String, OmsConstraintDimension> _OmsConstraintDimension;
    public static final String day = "day";
    private static final int int_day = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OmsConstraintDimension> tEnumJsonAdapter = new TEnumJsonAdapter<OmsConstraintDimension>() { // from class: com.p1.mobile.putong.data.OmsConstraintDimension.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OmsConstraintDimension newTEnum(String str, int i) {
                return OmsConstraintDimension.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OmsConstraintDimension>() { // from class: com.p1.mobile.putong.data.OmsConstraintDimension.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OmsConstraintDimension newTEnum(String str, int i) {
                return OmsConstraintDimension.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("day", 0);
        supportEnum.add("day");
        _OmsConstraintDimension = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OmsConstraintDimension(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OmsConstraintDimension> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OmsConstraintDimension> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OmsConstraintDimension> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OmsConstraintDimension> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OmsConstraintDimension get(String str) {
        Map<String, OmsConstraintDimension> map = _OmsConstraintDimension;
        OmsConstraintDimension omsConstraintDimension = map.get(str);
        if (omsConstraintDimension == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            omsConstraintDimension = integer == null ? new OmsConstraintDimension(str, -1) : new OmsConstraintDimension(str, integer.intValue());
            map.put(str, omsConstraintDimension);
        }
        return omsConstraintDimension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OmsConstraintDimension getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OmsConstraintDimension> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OmsConstraintDimension> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OmsConstraintDimension get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
