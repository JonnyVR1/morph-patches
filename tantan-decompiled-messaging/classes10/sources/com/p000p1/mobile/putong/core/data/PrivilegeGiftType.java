package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PrivilegeGiftType extends TEnum {
    public static final TEnumJsonAdapter<PrivilegeGiftType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<PrivilegeGiftType> PROTOBUF_ADAPTER;
    private static final Map<String, PrivilegeGiftType> _PrivilegeGiftType;
    public static final String greetGift = "greetGift";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String svipGift_1 = "svipGift_1";
    public static final String unknown_ = "unknown_";
    public static final String vipGift_1 = "vipGift_1";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<PrivilegeGiftType> tEnumJsonAdapter = new TEnumJsonAdapter<PrivilegeGiftType>() { // from class: com.p1.mobile.putong.core.data.PrivilegeGiftType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PrivilegeGiftType m14885newTEnum(String str, int i) {
                return PrivilegeGiftType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<PrivilegeGiftType>() { // from class: com.p1.mobile.putong.core.data.PrivilegeGiftType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public PrivilegeGiftType m14886newTEnum(String str, int i) {
                return PrivilegeGiftType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("greetGift");
        supportEnum.add(vipGift_1);
        supportEnum.add(svipGift_1);
        _PrivilegeGiftType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private PrivilegeGiftType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<PrivilegeGiftType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PrivilegeGiftType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, PrivilegeGiftType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, PrivilegeGiftType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static PrivilegeGiftType get(String str) {
        Map<String, PrivilegeGiftType> map = _PrivilegeGiftType;
        PrivilegeGiftType privilegeGiftType = map.get(str);
        if (privilegeGiftType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            privilegeGiftType = integer == null ? new PrivilegeGiftType(str, int_unknown_) : new PrivilegeGiftType(str, integer.intValue());
            map.put(str, privilegeGiftType);
        }
        return privilegeGiftType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PrivilegeGiftType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static boolean isGreetGift(PrivilegeGiftType privilegeGiftType) {
        return privilegeGiftType == get("greetGift");
    }

    public static boolean isSVipGift(PrivilegeGiftType privilegeGiftType) {
        return TEnum.equals(privilegeGiftType, svipGift_1);
    }

    public static boolean isVipGift(PrivilegeGiftType privilegeGiftType) {
        return TEnum.equals(privilegeGiftType, vipGift_1);
    }

    public static List<PrivilegeGiftType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, PrivilegeGiftType> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static PrivilegeGiftType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
