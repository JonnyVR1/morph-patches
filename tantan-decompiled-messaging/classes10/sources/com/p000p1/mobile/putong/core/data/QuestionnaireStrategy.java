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
public class QuestionnaireStrategy extends TEnum {
    public static final TEnumJsonAdapter<QuestionnaireStrategy> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<QuestionnaireStrategy> PROTOBUF_ADAPTER;
    private static final Map<String, QuestionnaireStrategy> _QuestionnaireStrategy;
    public static final String default_ = "default";
    private static final int int_unknown_ = -1;
    public static final String lowLikeRatio = "lowLikeRatio";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<QuestionnaireStrategy> tEnumJsonAdapter = new TEnumJsonAdapter<QuestionnaireStrategy>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireStrategy.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public QuestionnaireStrategy m15141newTEnum(String str, int i) {
                return QuestionnaireStrategy.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<QuestionnaireStrategy>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireStrategy.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public QuestionnaireStrategy m15142newTEnum(String str, int i) {
                return QuestionnaireStrategy.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add("default");
        supportEnum.add(lowLikeRatio);
        _QuestionnaireStrategy = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private QuestionnaireStrategy(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<QuestionnaireStrategy> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireStrategy> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, QuestionnaireStrategy> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, QuestionnaireStrategy> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static QuestionnaireStrategy get(String str) {
        Map<String, QuestionnaireStrategy> map = _QuestionnaireStrategy;
        QuestionnaireStrategy questionnaireStrategy = map.get(str);
        if (questionnaireStrategy == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            questionnaireStrategy = integer == null ? new QuestionnaireStrategy(str, int_unknown_) : new QuestionnaireStrategy(str, integer.intValue());
            map.put(str, questionnaireStrategy);
        }
        return questionnaireStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static QuestionnaireStrategy getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<QuestionnaireStrategy> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, QuestionnaireStrategy> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static QuestionnaireStrategy get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
