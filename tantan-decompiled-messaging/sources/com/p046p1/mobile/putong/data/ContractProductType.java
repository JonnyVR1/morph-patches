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
public class ContractProductType extends TEnum {
    public static final TEnumJsonAdapter<ContractProductType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ContractProductType> PROTOBUF_ADAPTER;
    private static final Map<String, ContractProductType> _ContractProductType;
    private static final int int_picksMembership = 4;
    private static final int int_quickchatMembership = 1;
    private static final int int_seeWhoLikedMe = 2;
    private static final int int_svip = 3;
    private static final int int_svipPicksMembership = 5;
    private static final int int_unknown_ = -1;
    private static final int int_vip = 0;
    public static final String picksMembership = "picksMembership";
    public static final String quickchatMembership = "quickchatMembership";
    public static final String roaming = "roaming";
    public static final String seeWhoLikedMe = "seeWhoLikedMe";
    public static final String superLikeMembership = "superLikeMembership";
    protected static HashSet<String> supportEnum = null;
    public static final String svip = "svip";
    public static final String svipPicksMembership = "svipPicksMembership";
    public static final String undoMembership = "undoMembership";
    public static final String unknown_ = "unknown_";
    public static final String unlimitedSwipes = "unlimitedSwipes";
    public static final String vip = "vip";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ContractProductType> tEnumJsonAdapter = new TEnumJsonAdapter<ContractProductType>() { // from class: com.p1.mobile.putong.data.ContractProductType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ContractProductType newTEnum(String str, int i) {
                return ContractProductType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ContractProductType>() { // from class: com.p1.mobile.putong.data.ContractProductType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ContractProductType newTEnum(String str, int i) {
                return ContractProductType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("vip", 0);
        tEnumJsonAdapter.addExtJsonValue("quickchatMembership", 1);
        tEnumJsonAdapter.addExtJsonValue("seeWhoLikedMe", 2);
        tEnumJsonAdapter.addExtJsonValue("svip", 3);
        tEnumJsonAdapter.addExtJsonValue("picksMembership", 4);
        tEnumJsonAdapter.addExtJsonValue("svipPicksMembership", 5);
        supportEnum.add("vip");
        supportEnum.add("quickchatMembership");
        supportEnum.add("seeWhoLikedMe");
        supportEnum.add("svip");
        supportEnum.add("picksMembership");
        supportEnum.add("svipPicksMembership");
        supportEnum.add("superLikeMembership");
        supportEnum.add("undoMembership");
        supportEnum.add("unlimitedSwipes");
        supportEnum.add("roaming");
        _ContractProductType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ContractProductType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ContractProductType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ContractProductType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ContractProductType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ContractProductType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ContractProductType get(String str) {
        Map<String, ContractProductType> map = _ContractProductType;
        ContractProductType contractProductType = map.get(str);
        if (contractProductType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            contractProductType = integer == null ? new ContractProductType(str, -1) : new ContractProductType(str, integer.intValue());
            map.put(str, contractProductType);
        }
        return contractProductType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ContractProductType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ContractProductType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ContractProductType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ContractProductType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
