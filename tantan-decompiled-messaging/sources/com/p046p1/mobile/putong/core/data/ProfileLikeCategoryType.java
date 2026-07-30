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
public class ProfileLikeCategoryType extends TEnum {
    public static final TEnumJsonAdapter<ProfileLikeCategoryType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ProfileLikeCategoryType> PROTOBUF_ADAPTER;
    private static final Map<String, ProfileLikeCategoryType> _ProfileLikeCategoryType;
    public static final String car = "car";
    public static final String career = "career";
    public static final String company = "company";
    public static final String food = "food";
    public static final String friendPurpose = "friendPurpose";
    public static final String hangouts = "hangouts";
    public static final String height = "height";
    public static final String hometown = "hometown";
    public static final String house = "house";
    public static final String income = "income";
    private static final int int_unknown_ = -1;
    public static final String interestLiterature = "interestLiterature";
    public static final String introduction = "introduction";
    public static final String literature = "literature";
    public static final String movies = "movies";
    public static final String music = "music";
    public static final String personality = "personality";
    public static final String picture = "picture";
    public static final String places = "places";
    public static final String qualification = "qualification";
    public static final String question = "question";
    public static final String school = "school";
    public static final String sports = "sports";
    protected static HashSet<String> supportEnum = null;
    public static final String tag = "tag";
    public static final String unknown_ = "unknown_";
    public static final String zodiac = "zodiac";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ProfileLikeCategoryType> tEnumJsonAdapter = new TEnumJsonAdapter<ProfileLikeCategoryType>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeCategoryType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ProfileLikeCategoryType newTEnum(String str, int i) {
                return ProfileLikeCategoryType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ProfileLikeCategoryType>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeCategoryType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ProfileLikeCategoryType newTEnum(String str, int i) {
                return ProfileLikeCategoryType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("picture");
        supportEnum.add("introduction");
        supportEnum.add(zodiac);
        supportEnum.add(career);
        supportEnum.add(company);
        supportEnum.add("school");
        supportEnum.add(qualification);
        supportEnum.add(hometown);
        supportEnum.add(friendPurpose);
        supportEnum.add(hangouts);
        supportEnum.add("height");
        supportEnum.add("income");
        supportEnum.add(car);
        supportEnum.add(house);
        supportEnum.add("literature");
        supportEnum.add("tag");
        supportEnum.add("personality");
        supportEnum.add("sports");
        supportEnum.add("music");
        supportEnum.add("food");
        supportEnum.add("movies");
        supportEnum.add(interestLiterature);
        supportEnum.add("places");
        supportEnum.add("question");
        _ProfileLikeCategoryType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ProfileLikeCategoryType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ProfileLikeCategoryType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProfileLikeCategoryType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ProfileLikeCategoryType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ProfileLikeCategoryType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ProfileLikeCategoryType get(String str) {
        Map<String, ProfileLikeCategoryType> map = _ProfileLikeCategoryType;
        ProfileLikeCategoryType profileLikeCategoryType = map.get(str);
        if (profileLikeCategoryType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            profileLikeCategoryType = integer == null ? new ProfileLikeCategoryType(str, -1) : new ProfileLikeCategoryType(str, integer.intValue());
            map.put(str, profileLikeCategoryType);
        }
        return profileLikeCategoryType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProfileLikeCategoryType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ProfileLikeCategoryType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ProfileLikeCategoryType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ProfileLikeCategoryType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
