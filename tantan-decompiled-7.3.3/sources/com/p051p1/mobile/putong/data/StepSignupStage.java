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
public class StepSignupStage extends TEnum {
    public static final TEnumJsonAdapter<StepSignupStage> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<StepSignupStage> PROTOBUF_ADAPTER;
    private static final Map<String, StepSignupStage> _StepSignupStage;
    public static final String birth_saved = "birth-saved";
    public static final String ethnicity_saved = "ethnicity-saved";
    public static final String extensions_saved = "extensions-saved";
    public static final String gender_saved = "gender-saved";
    public static final String google_email_saved = "google-email-saved";
    private static final int int_birth_saved = 2;
    private static final int int_gender_saved = 1;
    private static final int int_name_saved = 0;
    private static final int int_picture_saved = 3;
    private static final int int_unknown_ = -1;
    public static final String intlFriendPurpose_saved = "intlFriendPurpose-saved";
    public static final String language_saved = "language-saved";
    public static final String name_saved = "name-saved";
    public static final String new_gender_saved = "new-gender-saved";
    public static final String picture_saved = "picture-saved";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<StepSignupStage> tEnumJsonAdapter = new TEnumJsonAdapter<StepSignupStage>() { // from class: com.p1.mobile.putong.data.StepSignupStage.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public StepSignupStage newTEnum(String str, int i) {
                return StepSignupStage.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<StepSignupStage>() { // from class: com.p1.mobile.putong.data.StepSignupStage.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public StepSignupStage newTEnum(String str, int i) {
                return StepSignupStage.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("name-saved", 0);
        tEnumJsonAdapter.addExtJsonValue("gender-saved", 1);
        tEnumJsonAdapter.addExtJsonValue("birth-saved", 2);
        tEnumJsonAdapter.addExtJsonValue(picture_saved, 3);
        supportEnum.add("name-saved");
        supportEnum.add("gender-saved");
        supportEnum.add("birth-saved");
        supportEnum.add(picture_saved);
        supportEnum.add(ethnicity_saved);
        supportEnum.add(language_saved);
        supportEnum.add(extensions_saved);
        supportEnum.add(intlFriendPurpose_saved);
        supportEnum.add(new_gender_saved);
        supportEnum.add(google_email_saved);
        _StepSignupStage = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private StepSignupStage(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<StepSignupStage> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<StepSignupStage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, StepSignupStage> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, StepSignupStage> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static StepSignupStage get(String str) {
        Map<String, StepSignupStage> map = _StepSignupStage;
        StepSignupStage stepSignupStage = map.get(str);
        if (stepSignupStage == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            stepSignupStage = integer == null ? new StepSignupStage(str, -1) : new StepSignupStage(str, integer.intValue());
            map.put(str, stepSignupStage);
        }
        return stepSignupStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StepSignupStage getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<StepSignupStage> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, StepSignupStage> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static StepSignupStage get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
