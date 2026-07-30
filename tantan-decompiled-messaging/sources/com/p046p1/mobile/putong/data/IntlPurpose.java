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
public class IntlPurpose extends TEnum {
    public static final TEnumJsonAdapter<IntlPurpose> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<IntlPurpose> PROTOBUF_ADAPTER;
    private static final Map<String, IntlPurpose> _IntlPurpose;
    private static final int int_unknown_ = -1;
    public static final String long_but_short = "long-but-short";
    public static final String long_term_partner = "long-term-partner";
    public static final String new_friends = "new-friends";
    public static final String not_sure_yet = "not-sure-yet";
    public static final String short_but_long = "short-but-long";
    public static final String short_term_fun = "short-term-fun";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<IntlPurpose> tEnumJsonAdapter = new TEnumJsonAdapter<IntlPurpose>() { // from class: com.p1.mobile.putong.data.IntlPurpose.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public IntlPurpose newTEnum(String str, int i) {
                return IntlPurpose.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<IntlPurpose>() { // from class: com.p1.mobile.putong.data.IntlPurpose.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public IntlPurpose newTEnum(String str, int i) {
                return IntlPurpose.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(short_term_fun);
        supportEnum.add(long_term_partner);
        supportEnum.add(new_friends);
        supportEnum.add(not_sure_yet);
        supportEnum.add(long_but_short);
        supportEnum.add(short_but_long);
        _IntlPurpose = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private IntlPurpose(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<IntlPurpose> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<IntlPurpose> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, IntlPurpose> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, IntlPurpose> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static IntlPurpose get(String str) {
        Map<String, IntlPurpose> map = _IntlPurpose;
        IntlPurpose intlPurpose = map.get(str);
        if (intlPurpose == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            intlPurpose = integer == null ? new IntlPurpose(str, -1) : new IntlPurpose(str, integer.intValue());
            map.put(str, intlPurpose);
        }
        return intlPurpose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IntlPurpose getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<IntlPurpose> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, IntlPurpose> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static IntlPurpose get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
