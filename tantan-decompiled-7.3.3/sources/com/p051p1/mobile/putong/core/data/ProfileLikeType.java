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
public class ProfileLikeType extends TEnum {
    public static final TEnumJsonAdapter<ProfileLikeType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ProfileLikeType> PROTOBUF_ADAPTER;
    private static final Map<String, ProfileLikeType> _ProfileLikeType;
    public static final String aboutMe = "aboutMe";
    public static final String game = "game";
    private static final int int_unknown_ = -1;
    public static final String life_pic = "life_pic";
    public static final String mbti = "mbti";
    public static final String pet = "pet";
    public static final String question = "question";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ProfileLikeType> tEnumJsonAdapter = new TEnumJsonAdapter<ProfileLikeType>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ProfileLikeType newTEnum(String str, int i) {
                return ProfileLikeType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ProfileLikeType>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ProfileLikeType newTEnum(String str, int i) {
                return ProfileLikeType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(life_pic);
        supportEnum.add("aboutMe");
        supportEnum.add("pet");
        supportEnum.add("game");
        supportEnum.add("question");
        supportEnum.add(mbti);
        _ProfileLikeType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ProfileLikeType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ProfileLikeType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProfileLikeType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ProfileLikeType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ProfileLikeType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ProfileLikeType get(String str) {
        Map<String, ProfileLikeType> map = _ProfileLikeType;
        ProfileLikeType profileLikeType = map.get(str);
        if (profileLikeType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            profileLikeType = integer == null ? new ProfileLikeType(str, -1) : new ProfileLikeType(str, integer.intValue());
            map.put(str, profileLikeType);
        }
        return profileLikeType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProfileLikeType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ProfileLikeType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ProfileLikeType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ProfileLikeType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
