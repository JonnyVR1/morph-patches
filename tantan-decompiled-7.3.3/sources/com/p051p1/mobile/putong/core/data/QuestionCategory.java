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
public class QuestionCategory extends TEnum {
    public static final TEnumJsonAdapter<QuestionCategory> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<QuestionCategory> PROTOBUF_ADAPTER;
    private static final Map<String, QuestionCategory> _QuestionCategory;
    public static final String classic = "classic";
    private static final int int_classic = 1;
    private static final int int_intimate = 0;
    private static final int int_newMaleQuestion = 4;
    private static final int int_profile = 2;
    private static final int int_teamaccount = 3;
    private static final int int_unknown_ = -1;
    public static final String intimate = "intimate";
    public static final String newMaleQuestion = "newMaleQuestion";
    public static final String profile = "profile";
    protected static HashSet<String> supportEnum = null;
    public static final String teamaccount = "teamaccount";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<QuestionCategory> tEnumJsonAdapter = new TEnumJsonAdapter<QuestionCategory>() { // from class: com.p1.mobile.putong.core.data.QuestionCategory.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public QuestionCategory newTEnum(String str, int i) {
                return QuestionCategory.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<QuestionCategory>() { // from class: com.p1.mobile.putong.core.data.QuestionCategory.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public QuestionCategory newTEnum(String str, int i) {
                return QuestionCategory.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("intimate", 0);
        tEnumJsonAdapter.addExtJsonValue(classic, 1);
        tEnumJsonAdapter.addExtJsonValue("profile", 2);
        tEnumJsonAdapter.addExtJsonValue("teamaccount", 3);
        tEnumJsonAdapter.addExtJsonValue(newMaleQuestion, 4);
        supportEnum.add("intimate");
        supportEnum.add(classic);
        supportEnum.add("profile");
        supportEnum.add("teamaccount");
        supportEnum.add(newMaleQuestion);
        _QuestionCategory = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private QuestionCategory(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<QuestionCategory> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionCategory> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, QuestionCategory> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, QuestionCategory> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static QuestionCategory get(String str) {
        Map<String, QuestionCategory> map = _QuestionCategory;
        QuestionCategory questionCategory = map.get(str);
        if (questionCategory == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            questionCategory = integer == null ? new QuestionCategory(str, -1) : new QuestionCategory(str, integer.intValue());
            map.put(str, questionCategory);
        }
        return questionCategory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static QuestionCategory getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<QuestionCategory> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, QuestionCategory> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static QuestionCategory get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
