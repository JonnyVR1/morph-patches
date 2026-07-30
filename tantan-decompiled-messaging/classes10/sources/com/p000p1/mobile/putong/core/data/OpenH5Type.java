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
public class OpenH5Type extends TEnum {
    public static final TEnumJsonAdapter<OpenH5Type> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OpenH5Type> PROTOBUF_ADAPTER;
    private static final Map<String, OpenH5Type> _OpenH5Type;
    public static final String browser = "browser";
    public static final String inApp = "inApp";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OpenH5Type> tEnumJsonAdapter = new TEnumJsonAdapter<OpenH5Type>() { // from class: com.p1.mobile.putong.core.data.OpenH5Type.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public OpenH5Type m14667newTEnum(String str, int i) {
                return OpenH5Type.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OpenH5Type>() { // from class: com.p1.mobile.putong.core.data.OpenH5Type.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public OpenH5Type m14668newTEnum(String str, int i) {
                return OpenH5Type.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        supportEnum.add(inApp);
        supportEnum.add("browser");
        _OpenH5Type = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OpenH5Type(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OpenH5Type> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OpenH5Type> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OpenH5Type> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OpenH5Type> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OpenH5Type get(String str) {
        Map<String, OpenH5Type> map = _OpenH5Type;
        OpenH5Type openH5Type = map.get(str);
        if (openH5Type == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            openH5Type = integer == null ? new OpenH5Type(str, int_unknown_) : new OpenH5Type(str, integer.intValue());
            map.put(str, openH5Type);
        }
        return openH5Type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OpenH5Type getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OpenH5Type> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OpenH5Type> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OpenH5Type get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
