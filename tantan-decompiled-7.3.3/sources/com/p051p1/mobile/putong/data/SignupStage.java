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
public class SignupStage extends TEnum {
    public static final TEnumJsonAdapter<SignupStage> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SignupStage> PROTOBUF_ADAPTER;
    private static final Map<String, SignupStage> _SignupStage;
    public static final String base_info_saved = "base-info-saved";
    public static final String birth_saved = "birth-saved";
    public static final String finished = "finished";
    public static final String gender_saved = "gender-saved";
    private static final int int_base_info_saved = 1;
    private static final int int_birth_saved = 5;
    private static final int int_finished = 2;
    private static final int int_gender_saved = 4;
    private static final int int_name_saved = 3;
    private static final int int_unknown_ = -1;
    private static final int int_verified = 0;
    public static final String name_saved = "name-saved";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String verified = "verified";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SignupStage> tEnumJsonAdapter = new TEnumJsonAdapter<SignupStage>() { // from class: com.p1.mobile.putong.data.SignupStage.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SignupStage newTEnum(String str, int i) {
                return SignupStage.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SignupStage>() { // from class: com.p1.mobile.putong.data.SignupStage.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SignupStage newTEnum(String str, int i) {
                return SignupStage.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("verified", 0);
        tEnumJsonAdapter.addExtJsonValue(base_info_saved, 1);
        tEnumJsonAdapter.addExtJsonValue("finished", 2);
        tEnumJsonAdapter.addExtJsonValue("name-saved", 3);
        tEnumJsonAdapter.addExtJsonValue("gender-saved", 4);
        tEnumJsonAdapter.addExtJsonValue("birth-saved", 5);
        supportEnum.add("verified");
        supportEnum.add(base_info_saved);
        supportEnum.add("finished");
        supportEnum.add("name-saved");
        supportEnum.add("gender-saved");
        supportEnum.add("birth-saved");
        _SignupStage = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SignupStage(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SignupStage> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SignupStage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SignupStage> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, SignupStage> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SignupStage get(String str) {
        Map<String, SignupStage> map = _SignupStage;
        SignupStage signupStage = map.get(str);
        if (signupStage == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            signupStage = integer == null ? new SignupStage(str, -1) : new SignupStage(str, integer.intValue());
            map.put(str, signupStage);
        }
        return signupStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SignupStage getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SignupStage> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SignupStage> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SignupStage get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
