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
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public IntlMarketToken newTEnum(String str, int i) {
                return IntlMarketToken.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<IntlMarketToken>() { // from class: com.p1.mobile.putong.core.data.IntlMarketToken.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public IntlMarketToken newTEnum(String str, int i) {
                return IntlMarketToken.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(flash);
        supportEnum.add(theme);
        supportEnum.add(regular);
        supportEnum.add(quiz);
        _IntlMarketToken = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private IntlMarketToken(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
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
            intlMarketToken = integer == null ? new IntlMarketToken(str, -1) : new IntlMarketToken(str, integer.intValue());
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
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, IntlMarketToken> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static IntlMarketToken get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
