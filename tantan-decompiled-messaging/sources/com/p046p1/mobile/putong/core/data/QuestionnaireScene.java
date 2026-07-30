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
public class QuestionnaireScene extends TEnum {
    public static final TEnumJsonAdapter<QuestionnaireScene> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<QuestionnaireScene> PROTOBUF_ADAPTER;
    private static final Map<String, QuestionnaireScene> _QuestionnaireScene;
    private static final int int_unknown_ = -1;
    public static final String message = "message";
    public static final String messageDetail = "messageDetail";
    protected static HashSet<String> supportEnum = null;
    public static final String swipe = "swipe";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<QuestionnaireScene> tEnumJsonAdapter = new TEnumJsonAdapter<QuestionnaireScene>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireScene.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public QuestionnaireScene newTEnum(String str, int i) {
                return QuestionnaireScene.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<QuestionnaireScene>() { // from class: com.p1.mobile.putong.core.data.QuestionnaireScene.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public QuestionnaireScene newTEnum(String str, int i) {
                return QuestionnaireScene.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("swipe");
        supportEnum.add("message");
        supportEnum.add(messageDetail);
        _QuestionnaireScene = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private QuestionnaireScene(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<QuestionnaireScene> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireScene> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, QuestionnaireScene> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, QuestionnaireScene> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static QuestionnaireScene get(String str) {
        Map<String, QuestionnaireScene> map = _QuestionnaireScene;
        QuestionnaireScene questionnaireScene = map.get(str);
        if (questionnaireScene == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            questionnaireScene = integer == null ? new QuestionnaireScene(str, -1) : new QuestionnaireScene(str, integer.intValue());
            map.put(str, questionnaireScene);
        }
        return questionnaireScene;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static QuestionnaireScene getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<QuestionnaireScene> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, QuestionnaireScene> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static QuestionnaireScene get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
