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
public class OMSTemplateType extends TEnum {
    public static final TEnumJsonAdapter<OMSTemplateType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSTemplateType> PROTOBUF_ADAPTER;
    private static final Map<String, OMSTemplateType> _OMSTemplateType;
    public static final String dialog = "dialog";
    public static final String document = "document";
    private static final int int_dialog = 0;
    private static final int int_document = 1;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSTemplateType> tEnumJsonAdapter = new TEnumJsonAdapter<OMSTemplateType>() { // from class: com.p1.mobile.putong.data.OMSTemplateType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSTemplateType newTEnum(String str, int i) {
                return OMSTemplateType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSTemplateType>() { // from class: com.p1.mobile.putong.data.OMSTemplateType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSTemplateType newTEnum(String str, int i) {
                return OMSTemplateType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(dialog, 0);
        tEnumJsonAdapter.addExtJsonValue(document, 1);
        supportEnum.add(dialog);
        supportEnum.add(document);
        _OMSTemplateType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private OMSTemplateType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSTemplateType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSTemplateType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSTemplateType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, OMSTemplateType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static OMSTemplateType get(String str) {
        Map<String, OMSTemplateType> map = _OMSTemplateType;
        OMSTemplateType oMSTemplateType = map.get(str);
        if (oMSTemplateType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSTemplateType = integer == null ? new OMSTemplateType(str, -1) : new OMSTemplateType(str, integer.intValue());
            map.put(str, oMSTemplateType);
        }
        return oMSTemplateType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSTemplateType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSTemplateType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSTemplateType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSTemplateType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
