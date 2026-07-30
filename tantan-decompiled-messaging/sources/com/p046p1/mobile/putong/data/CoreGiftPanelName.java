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
public class CoreGiftPanelName extends TEnum {
    public static final TEnumJsonAdapter<CoreGiftPanelName> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<CoreGiftPanelName> PROTOBUF_ADAPTER;
    private static final Map<String, CoreGiftPanelName> _CoreGiftPanelName;
    public static final String chat = "chat";
    public static final String greet = "greet";
    public static final String home = "home";
    private static final int int_chat = 2;
    private static final int int_home = 1;
    private static final int int_moment = 0;
    private static final int int_note = 3;
    private static final int int_unknown_ = -1;
    public static final String moment = "moment";
    public static final String note = "note";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<CoreGiftPanelName> tEnumJsonAdapter = new TEnumJsonAdapter<CoreGiftPanelName>() { // from class: com.p1.mobile.putong.data.CoreGiftPanelName.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public CoreGiftPanelName newTEnum(String str, int i) {
                return CoreGiftPanelName.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<CoreGiftPanelName>() { // from class: com.p1.mobile.putong.data.CoreGiftPanelName.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public CoreGiftPanelName newTEnum(String str, int i) {
                return CoreGiftPanelName.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("moment", 0);
        tEnumJsonAdapter.addExtJsonValue("home", 1);
        tEnumJsonAdapter.addExtJsonValue("chat", 2);
        tEnumJsonAdapter.addExtJsonValue("note", 3);
        supportEnum.add("moment");
        supportEnum.add("home");
        supportEnum.add("chat");
        supportEnum.add("note");
        supportEnum.add("greet");
        _CoreGiftPanelName = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private CoreGiftPanelName(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<CoreGiftPanelName> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoreGiftPanelName> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, CoreGiftPanelName> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, CoreGiftPanelName> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static CoreGiftPanelName get(String str) {
        Map<String, CoreGiftPanelName> map = _CoreGiftPanelName;
        CoreGiftPanelName coreGiftPanelName = map.get(str);
        if (coreGiftPanelName == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            coreGiftPanelName = integer == null ? new CoreGiftPanelName(str, -1) : new CoreGiftPanelName(str, integer.intValue());
            map.put(str, coreGiftPanelName);
        }
        return coreGiftPanelName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CoreGiftPanelName getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<CoreGiftPanelName> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, CoreGiftPanelName> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static CoreGiftPanelName get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
