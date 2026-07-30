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
public class SubGender extends TEnum {
    public static final String Agender = "Agender";
    public static final String Bigender = "Bigender";
    public static final String Cis_Man = "Cis Man";
    public static final String Cis_Woman = "Cis Woman";
    public static final String Gender_Questioning = "Gender Questioning";
    public static final String Genderfluid = "Genderfluid";
    public static final String Genderqueer = "Genderqueer";
    public static final String Intersex = "Intersex";
    public static final String Intersex_Man = "Intersex Man";
    public static final String Intersex_Woman = "Intersex Woman";
    public static final TEnumJsonAdapter<SubGender> JSON_ADAPTER;
    public static final String Nonbinary = "Nonbinary";
    public static final TEnumProtobufAdapter<SubGender> PROTOBUF_ADAPTER;
    public static final String Pangender = "Pangender";
    public static final String Trans_Man = "Trans Man";
    public static final String Trans_Person = "Trans Person";
    public static final String Trans_Woman = "Trans Woman";
    public static final String Transfeminine = "Transfeminine";
    public static final String Transmasculine = "Transmasculine";
    public static final String Two_Spirit = "Two-Spirit";
    private static final Map<String, SubGender> _SubGender;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SubGender> tEnumJsonAdapter = new TEnumJsonAdapter<SubGender>() { // from class: com.p1.mobile.putong.data.SubGender.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SubGender newTEnum(String str, int i) {
                return SubGender.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SubGender>() { // from class: com.p1.mobile.putong.data.SubGender.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SubGender newTEnum(String str, int i) {
                return SubGender.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(Cis_Man);
        supportEnum.add(Intersex_Man);
        supportEnum.add(Trans_Man);
        supportEnum.add(Transmasculine);
        supportEnum.add(Cis_Woman);
        supportEnum.add(Intersex_Woman);
        supportEnum.add(Trans_Woman);
        supportEnum.add(Transfeminine);
        supportEnum.add(Agender);
        supportEnum.add(Bigender);
        supportEnum.add(Genderfluid);
        supportEnum.add(Gender_Questioning);
        supportEnum.add(Genderqueer);
        supportEnum.add(Intersex);
        supportEnum.add(Nonbinary);
        supportEnum.add(Pangender);
        supportEnum.add(Trans_Person);
        supportEnum.add(Two_Spirit);
        _SubGender = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SubGender(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SubGender> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SubGender> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SubGender> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SubGender> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SubGender get(String str) {
        Map<String, SubGender> map = _SubGender;
        SubGender subGender = map.get(str);
        if (subGender == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            subGender = integer == null ? new SubGender(str, -1) : new SubGender(str, integer.intValue());
            map.put(str, subGender);
        }
        return subGender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SubGender getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SubGender> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SubGender> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SubGender get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
