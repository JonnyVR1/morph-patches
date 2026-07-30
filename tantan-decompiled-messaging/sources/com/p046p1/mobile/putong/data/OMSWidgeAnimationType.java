package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class OMSWidgeAnimationType extends TEnum {
    public static final TEnumJsonAdapter<OMSWidgeAnimationType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSWidgeAnimationType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSWidgeAnimationType> _OMSWidgeAnimationType;
    public static final String fade = "fade";
    private static final int int_fade = 2;
    private static final int int_jump = 1;
    private static final int int_shake = 0;
    private static final int int_unknown_ = -1;
    public static final String jump = "jump";
    public static final String shake = "shake";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSWidgeAnimationType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSWidgeAnimationType>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSWidgeAnimationType newTEnum(String str, int i) {
                return OMSWidgeAnimationType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSWidgeAnimationType>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSWidgeAnimationType newTEnum(String str, int i) {
                return OMSWidgeAnimationType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(shake, 0);
        tEnumJsonAdapter.addExtJsonValue("jump", 1);
        tEnumJsonAdapter.addExtJsonValue(fade, 2);
        supportEnum.add(shake);
        supportEnum.add("jump");
        supportEnum.add(fade);
        _OMSWidgeAnimationType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSWidgeAnimationType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSWidgeAnimationType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSWidgeAnimationType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSWidgeAnimationType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSWidgeAnimationType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSWidgeAnimationType get(String str) {
        Map<String, OMSWidgeAnimationType> map = _OMSWidgeAnimationType;
        OMSWidgeAnimationType oMSWidgeAnimationType = map.get(str);
        if (oMSWidgeAnimationType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSWidgeAnimationType = integer == null ? new OMSWidgeAnimationType(str, -1) : new OMSWidgeAnimationType(str, integer.intValue());
            map.put(str, oMSWidgeAnimationType);
        }
        return oMSWidgeAnimationType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSWidgeAnimationType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSWidgeAnimationType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSWidgeAnimationType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSWidgeAnimationType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
