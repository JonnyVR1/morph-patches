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
public class OMSDialogType extends TEnum {
    public static final TEnumJsonAdapter<OMSDialogType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSDialogType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSDialogType> _OMSDialogType;
    private static final int int_local = 3;
    private static final int int_morph = 0;
    private static final int int_unknown_ = -1;
    private static final int int_webDialog = 2;
    private static final int int_webPage = 1;
    public static final String local = "local";
    public static final String morph = "morph";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String webDialog = "webDialog";
    public static final String webPage = "webPage";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSDialogType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSDialogType>() { // from class: com.p1.mobile.putong.data.OMSDialogType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSDialogType newTEnum(String str, int i) {
                return OMSDialogType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSDialogType>() { // from class: com.p1.mobile.putong.data.OMSDialogType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSDialogType newTEnum(String str, int i) {
                return OMSDialogType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(morph, 0);
        tEnumJsonAdapter.addExtJsonValue(webPage, 1);
        tEnumJsonAdapter.addExtJsonValue(webDialog, 2);
        tEnumJsonAdapter.addExtJsonValue("local", 3);
        supportEnum.add(morph);
        supportEnum.add(webPage);
        supportEnum.add(webDialog);
        supportEnum.add("local");
        _OMSDialogType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private OMSDialogType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSDialogType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSDialogType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSDialogType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, OMSDialogType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static OMSDialogType get(String str) {
        Map<String, OMSDialogType> map = _OMSDialogType;
        OMSDialogType oMSDialogType = map.get(str);
        if (oMSDialogType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSDialogType = integer == null ? new OMSDialogType(str, -1) : new OMSDialogType(str, integer.intValue());
            map.put(str, oMSDialogType);
        }
        return oMSDialogType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSDialogType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSDialogType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSDialogType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSDialogType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
