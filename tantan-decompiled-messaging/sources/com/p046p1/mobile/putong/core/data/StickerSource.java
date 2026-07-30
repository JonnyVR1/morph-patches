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
public class StickerSource extends TEnum {
    public static final TEnumJsonAdapter<StickerSource> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<StickerSource> PROTOBUF_ADAPTER;
    private static final Map<String, StickerSource> _StickerSource;
    public static final String biaoqingyun = "biaoqingyun";
    public static final String favorite = "favorite";
    private static final int int_biaoqingyun = 1;
    private static final int int_favorite = 4;
    private static final int int_internal = 0;
    private static final int int_sayhigif = 5;
    private static final int int_selfCollect = 7;
    private static final int int_shanmeng = 3;
    private static final int int_sogou = 6;
    private static final int int_soogif = 2;
    private static final int int_unknown_ = -1;
    public static final String internal = "internal";
    public static final String intimate = "intimate";
    public static final String poke = "poke";
    public static final String sayhigif = "sayhigif";
    public static final String selfCollect = "selfCollect";
    public static final String shanmeng = "shanmeng";
    public static final String sogou = "sogou";
    public static final String soogif = "soogif";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<StickerSource> tEnumJsonAdapter = new TEnumJsonAdapter<StickerSource>() { // from class: com.p1.mobile.putong.core.data.StickerSource.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public StickerSource newTEnum(String str, int i) {
                return StickerSource.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<StickerSource>() { // from class: com.p1.mobile.putong.core.data.StickerSource.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public StickerSource newTEnum(String str, int i) {
                return StickerSource.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("internal", 0);
        tEnumJsonAdapter.addExtJsonValue("biaoqingyun", 1);
        tEnumJsonAdapter.addExtJsonValue("soogif", 2);
        tEnumJsonAdapter.addExtJsonValue("shanmeng", 3);
        tEnumJsonAdapter.addExtJsonValue("favorite", 4);
        tEnumJsonAdapter.addExtJsonValue("sayhigif", 5);
        tEnumJsonAdapter.addExtJsonValue("sogou", 6);
        tEnumJsonAdapter.addExtJsonValue("selfCollect", 7);
        supportEnum.add("internal");
        supportEnum.add("biaoqingyun");
        supportEnum.add("soogif");
        supportEnum.add("shanmeng");
        supportEnum.add("favorite");
        supportEnum.add("sayhigif");
        supportEnum.add("sogou");
        supportEnum.add("selfCollect");
        supportEnum.add("intimate");
        supportEnum.add("poke");
        _StickerSource = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private StickerSource(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<StickerSource> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<StickerSource> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, StickerSource> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, StickerSource> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static StickerSource get(String str) {
        Map<String, StickerSource> map = _StickerSource;
        StickerSource stickerSource = map.get(str);
        if (stickerSource == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            stickerSource = integer == null ? new StickerSource(str, -1) : new StickerSource(str, integer.intValue());
            map.put(str, stickerSource);
        }
        return stickerSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StickerSource getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<StickerSource> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, StickerSource> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static StickerSource get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
