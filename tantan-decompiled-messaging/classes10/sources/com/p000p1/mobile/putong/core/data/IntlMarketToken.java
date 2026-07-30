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
public class IntlMarketToken extends TEnum {
    public static final TEnumJsonAdapter<IntlMarketToken> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<IntlMarketToken> PROTOBUF_ADAPTER;
    private static final Map<String, IntlMarketToken> _IntlMarketToken;
    public static final String flash = "flash";
    private static final int int_unknown_ = -1;
    public static final String quiz = "quiz";
    public static final String regular = "regular";
    protected static HashSet<String> supportEnum = null;
    public static final String theme = "theme";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<IntlMarketToken> tEnumJsonAdapter = new TEnumJsonAdapter<IntlMarketToken>() { // from class: com.p1.mobile.putong.core.data.IntlMarketToken.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public IntlMarketToken m13637newTEnum(String str, int i) {
                return IntlMarketToken.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<IntlMarketToken>() { // from class: com.p1.mobile.putong.core.data.IntlMarketToken.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public IntlMarketToken m13638newTEnum(String str, int i) {
                return IntlMarketToken.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(flash);
        supportEnum.add(theme);
        supportEnum.add(regular);
        supportEnum.add(quiz);
        _IntlMarketToken = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private IntlMarketToken(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<IntlMarketToken> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<IntlMarketToken> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, IntlMarketToken> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, IntlMarketToken> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static IntlMarketToken get(String str) {
        Map<String, IntlMarketToken> map = _IntlMarketToken;
        IntlMarketToken intlMarketToken = map.get(str);
        if (intlMarketToken == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            intlMarketToken = integer == null ? new IntlMarketToken(str, int_unknown_) : new IntlMarketToken(str, integer.intValue());
            map.put(str, intlMarketToken);
        }
        return intlMarketToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IntlMarketToken getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<IntlMarketToken> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, IntlMarketToken> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static IntlMarketToken get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
