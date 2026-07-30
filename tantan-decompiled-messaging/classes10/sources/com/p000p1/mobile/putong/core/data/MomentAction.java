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
public class MomentAction extends TEnum {
    public static final TEnumJsonAdapter<MomentAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MomentAction> PROTOBUF_ADAPTER;
    private static final Map<String, MomentAction> _MomentAction;
    public static final String comment = "comment";
    private static final int int_comment = 1;
    private static final int int_like = 0;
    private static final int int_unknown_ = -1;
    public static final String like = "like";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MomentAction> tEnumJsonAdapter = new TEnumJsonAdapter<MomentAction>() { // from class: com.p1.mobile.putong.core.data.MomentAction.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public MomentAction m14329newTEnum(String str, int i) {
                return MomentAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MomentAction>() { // from class: com.p1.mobile.putong.core.data.MomentAction.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public MomentAction m14330newTEnum(String str, int i) {
                return MomentAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("like", int_like);
        tEnumJsonAdapter.addExtJsonValue(comment, 1);
        supportEnum.add("like");
        supportEnum.add(comment);
        _MomentAction = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MomentAction(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MomentAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MomentAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MomentAction> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MomentAction> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MomentAction get(String str) {
        Map<String, MomentAction> map = _MomentAction;
        MomentAction momentAction = map.get(str);
        if (momentAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            momentAction = integer == null ? new MomentAction(str, int_unknown_) : new MomentAction(str, integer.intValue());
            map.put(str, momentAction);
        }
        return momentAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MomentAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MomentAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MomentAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MomentAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
