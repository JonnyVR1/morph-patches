package com.p000p1.mobile.putong.data;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SearchPriority extends TEnum {
    public static final TEnumJsonAdapter<SearchPriority> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SearchPriority> PROTOBUF_ADAPTER;
    private static final Map<String, SearchPriority> _SearchPriority;
    public static final String idCard = "idCard";
    private static final int int_idCard = 2;
    private static final int int_picture = 1;
    private static final int int_student = 0;
    private static final int int_unknown_ = -1;
    public static final String picture = "picture";
    public static final String student = "student";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SearchPriority> tEnumJsonAdapter = new TEnumJsonAdapter<SearchPriority>() { // from class: com.p1.mobile.putong.data.SearchPriority.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SearchPriority newTEnum(String str, int i) {
                return SearchPriority.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SearchPriority>() { // from class: com.p1.mobile.putong.data.SearchPriority.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SearchPriority newTEnum(String str, int i) {
                return SearchPriority.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("student", 0);
        tEnumJsonAdapter.addExtJsonValue("picture", 1);
        tEnumJsonAdapter.addExtJsonValue(idCard, 2);
        supportEnum.add("student");
        supportEnum.add("picture");
        supportEnum.add(idCard);
        _SearchPriority = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private SearchPriority(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SearchPriority> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SearchPriority> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SearchPriority> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, SearchPriority> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static SearchPriority get(String str) {
        Map<String, SearchPriority> map = _SearchPriority;
        SearchPriority searchPriority = map.get(str);
        if (searchPriority == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            searchPriority = integer == null ? new SearchPriority(str, -1) : new SearchPriority(str, integer.intValue());
            map.put(str, searchPriority);
        }
        return searchPriority;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SearchPriority getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SearchPriority> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SearchPriority> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SearchPriority get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
