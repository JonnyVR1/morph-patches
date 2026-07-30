package com.p051p1.mobile.putong.core.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes10.dex */
public class MembershipType extends TEnum {
    public static final TEnumJsonAdapter<MembershipType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MembershipType> PROTOBUF_ADAPTER;
    private static final Map<String, MembershipType> _MembershipType;
    public static final String boostVip = "boostVip";
    public static final String default_ = "default";
    private static final int int_boostVip = 3;
    private static final int int_default_ = 0;
    private static final int int_peeper = 4;
    private static final int int_svip = 2;
    private static final int int_unknown_ = -1;
    private static final int int_vip = 1;
    public static final String peeper = "peeper";
    protected static HashSet<String> supportEnum = null;
    public static final String svip = "svip";
    public static final String unknown_ = "unknown_";
    public static final String vip = "vip";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MembershipType> tEnumJsonAdapter = new TEnumJsonAdapter<MembershipType>() { // from class: com.p1.mobile.putong.core.data.MembershipType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MembershipType newTEnum(String str, int i) {
                return MembershipType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MembershipType>() { // from class: com.p1.mobile.putong.core.data.MembershipType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MembershipType newTEnum(String str, int i) {
                return MembershipType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("default", 0);
        tEnumJsonAdapter.addExtJsonValue("vip", 1);
        tEnumJsonAdapter.addExtJsonValue("svip", 2);
        tEnumJsonAdapter.addExtJsonValue("boostVip", 3);
        tEnumJsonAdapter.addExtJsonValue("peeper", 4);
        supportEnum.add("default");
        supportEnum.add("vip");
        supportEnum.add("svip");
        supportEnum.add("boostVip");
        supportEnum.add("peeper");
        _MembershipType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MembershipType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MembershipType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MembershipType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MembershipType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MembershipType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MembershipType get(String str) {
        Map<String, MembershipType> map = _MembershipType;
        MembershipType membershipType = map.get(str);
        if (membershipType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            membershipType = integer == null ? new MembershipType(str, -1) : new MembershipType(str, integer.intValue());
            map.put(str, membershipType);
        }
        return membershipType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MembershipType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MembershipType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MembershipType> oldEnumCovertMap(Map<String, Integer> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            l01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return l01Var;
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

    private static MembershipType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
