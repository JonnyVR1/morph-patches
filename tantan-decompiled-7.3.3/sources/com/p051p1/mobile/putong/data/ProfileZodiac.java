package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ProfileZodiac extends TEnum {
    public static final TEnumJsonAdapter<ProfileZodiac> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ProfileZodiac> PROTOBUF_ADAPTER;
    private static final Map<String, ProfileZodiac> _ProfileZodiac;
    public static final String aquarius = "aquarius";
    public static final String aries = "aries";
    public static final String cancer = "cancer";
    public static final String capricorn = "capricorn";
    public static final String gemini = "gemini";
    private static final int int_aquarius = 10;
    private static final int int_aries = 0;
    private static final int int_cancer = 3;
    private static final int int_capricorn = 9;
    private static final int int_gemini = 2;
    private static final int int_leo = 4;
    private static final int int_libra = 6;
    private static final int int_pisces = 11;
    private static final int int_sagittarius = 8;
    private static final int int_scorpio = 7;
    private static final int int_taurus = 1;
    private static final int int_unknown_ = -1;
    private static final int int_virgo = 5;
    public static final String leo = "leo";
    public static final String libra = "libra";
    public static final String pisces = "pisces";
    public static final String sagittarius = "sagittarius";
    public static final String scorpio = "scorpio";
    protected static HashSet<String> supportEnum = null;
    public static final String taurus = "taurus";
    public static final String unknown_ = "unknown_";
    public static final String virgo = "virgo";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ProfileZodiac> tEnumJsonAdapter = new TEnumJsonAdapter<ProfileZodiac>() { // from class: com.p1.mobile.putong.data.ProfileZodiac.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ProfileZodiac newTEnum(String str, int i) {
                return ProfileZodiac.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ProfileZodiac>() { // from class: com.p1.mobile.putong.data.ProfileZodiac.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ProfileZodiac newTEnum(String str, int i) {
                return ProfileZodiac.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("aries", 0);
        tEnumJsonAdapter.addExtJsonValue("taurus", 1);
        tEnumJsonAdapter.addExtJsonValue("gemini", 2);
        tEnumJsonAdapter.addExtJsonValue("cancer", 3);
        tEnumJsonAdapter.addExtJsonValue("leo", 4);
        tEnumJsonAdapter.addExtJsonValue("virgo", 5);
        tEnumJsonAdapter.addExtJsonValue("libra", 6);
        tEnumJsonAdapter.addExtJsonValue("scorpio", 7);
        tEnumJsonAdapter.addExtJsonValue("sagittarius", 8);
        tEnumJsonAdapter.addExtJsonValue("capricorn", 9);
        tEnumJsonAdapter.addExtJsonValue("aquarius", 10);
        tEnumJsonAdapter.addExtJsonValue("pisces", 11);
        supportEnum.add("aries");
        supportEnum.add("taurus");
        supportEnum.add("gemini");
        supportEnum.add("cancer");
        supportEnum.add("leo");
        supportEnum.add("virgo");
        supportEnum.add("libra");
        supportEnum.add("scorpio");
        supportEnum.add("sagittarius");
        supportEnum.add("capricorn");
        supportEnum.add("aquarius");
        supportEnum.add("pisces");
        _ProfileZodiac = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ProfileZodiac(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ProfileZodiac> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProfileZodiac> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ProfileZodiac> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ProfileZodiac> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ProfileZodiac get(String str) {
        Map<String, ProfileZodiac> map = _ProfileZodiac;
        ProfileZodiac profileZodiac = map.get(str);
        if (profileZodiac == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            profileZodiac = integer == null ? new ProfileZodiac(str, -1) : new ProfileZodiac(str, integer.intValue());
            map.put(str, profileZodiac);
        }
        return profileZodiac;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProfileZodiac getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ProfileZodiac> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ProfileZodiac> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ProfileZodiac get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
