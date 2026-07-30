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
public class ProfileLikeModuleType extends TEnum {
    public static final TEnumJsonAdapter<ProfileLikeModuleType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ProfileLikeModuleType> PROTOBUF_ADAPTER;
    private static final Map<String, ProfileLikeModuleType> _ProfileLikeModuleType;
    public static final String aboutMe = "aboutMe";
    public static final String album = "album";
    private static final int int_unknown_ = -1;
    public static final String interest = "interest";
    public static final String literatureComment = "literatureComment";
    public static final String newTag = "newTag";
    public static final String question = "question";
    protected static HashSet<String> supportEnum = null;
    public static final String tag = "tag";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ProfileLikeModuleType> tEnumJsonAdapter = new TEnumJsonAdapter<ProfileLikeModuleType>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeModuleType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ProfileLikeModuleType newTEnum(String str, int i) {
                return ProfileLikeModuleType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ProfileLikeModuleType>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeModuleType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ProfileLikeModuleType newTEnum(String str, int i) {
                return ProfileLikeModuleType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(album);
        supportEnum.add("aboutMe");
        supportEnum.add(literatureComment);
        supportEnum.add(newTag);
        supportEnum.add("tag");
        supportEnum.add("interest");
        supportEnum.add("question");
        _ProfileLikeModuleType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ProfileLikeModuleType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ProfileLikeModuleType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProfileLikeModuleType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ProfileLikeModuleType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ProfileLikeModuleType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ProfileLikeModuleType get(String str) {
        Map<String, ProfileLikeModuleType> map = _ProfileLikeModuleType;
        ProfileLikeModuleType profileLikeModuleType = map.get(str);
        if (profileLikeModuleType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            profileLikeModuleType = integer == null ? new ProfileLikeModuleType(str, -1) : new ProfileLikeModuleType(str, integer.intValue());
            map.put(str, profileLikeModuleType);
        }
        return profileLikeModuleType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProfileLikeModuleType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ProfileLikeModuleType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ProfileLikeModuleType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ProfileLikeModuleType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
