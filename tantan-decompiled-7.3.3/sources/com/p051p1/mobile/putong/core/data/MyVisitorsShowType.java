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
public class MyVisitorsShowType extends TEnum {
    public static final TEnumJsonAdapter<MyVisitorsShowType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MyVisitorsShowType> PROTOBUF_ADAPTER;
    private static final Map<String, MyVisitorsShowType> _MyVisitorsShowType;
    public static final String hidden = "hidden";
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String visitTime = "visitTime";
    public static final String visitTimes = "visitTimes";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MyVisitorsShowType> tEnumJsonAdapter = new TEnumJsonAdapter<MyVisitorsShowType>() { // from class: com.p1.mobile.putong.core.data.MyVisitorsShowType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MyVisitorsShowType newTEnum(String str, int i) {
                return MyVisitorsShowType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MyVisitorsShowType>() { // from class: com.p1.mobile.putong.core.data.MyVisitorsShowType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MyVisitorsShowType newTEnum(String str, int i) {
                return MyVisitorsShowType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("visitTimes");
        supportEnum.add("visitTime");
        supportEnum.add("hidden");
        _MyVisitorsShowType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MyVisitorsShowType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MyVisitorsShowType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MyVisitorsShowType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MyVisitorsShowType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MyVisitorsShowType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MyVisitorsShowType get(String str) {
        Map<String, MyVisitorsShowType> map = _MyVisitorsShowType;
        MyVisitorsShowType myVisitorsShowType = map.get(str);
        if (myVisitorsShowType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            myVisitorsShowType = integer == null ? new MyVisitorsShowType(str, -1) : new MyVisitorsShowType(str, integer.intValue());
            map.put(str, myVisitorsShowType);
        }
        return myVisitorsShowType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MyVisitorsShowType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MyVisitorsShowType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MyVisitorsShowType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MyVisitorsShowType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
