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
public class StickerSourceInfo extends TEnum {
    public static final TEnumJsonAdapter<StickerSourceInfo> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<StickerSourceInfo> PROTOBUF_ADAPTER;
    private static final Map<String, StickerSourceInfo> _StickerSourceInfo;
    public static final String biaoqingyun = "biaoqingyun";
    public static final String favorite = "favorite";
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
        TEnumJsonAdapter<StickerSourceInfo> tEnumJsonAdapter = new TEnumJsonAdapter<StickerSourceInfo>() { // from class: com.p1.mobile.putong.data.StickerSourceInfo.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public StickerSourceInfo newTEnum(String str, int i) {
                return StickerSourceInfo.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<StickerSourceInfo>() { // from class: com.p1.mobile.putong.data.StickerSourceInfo.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public StickerSourceInfo newTEnum(String str, int i) {
                return StickerSourceInfo.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add(internal);
        supportEnum.add(biaoqingyun);
        supportEnum.add(soogif);
        supportEnum.add(shanmeng);
        supportEnum.add("favorite");
        supportEnum.add(sayhigif);
        supportEnum.add(sogou);
        supportEnum.add(selfCollect);
        supportEnum.add(intimate);
        supportEnum.add(poke);
        _StickerSourceInfo = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private StickerSourceInfo(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<StickerSourceInfo> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<StickerSourceInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, StickerSourceInfo> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, StickerSourceInfo> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static StickerSourceInfo get(String str) {
        Map<String, StickerSourceInfo> map = _StickerSourceInfo;
        StickerSourceInfo stickerSourceInfo = map.get(str);
        if (stickerSourceInfo == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            stickerSourceInfo = integer == null ? new StickerSourceInfo(str, -1) : new StickerSourceInfo(str, integer.intValue());
            map.put(str, stickerSourceInfo);
        }
        return stickerSourceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StickerSourceInfo getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<StickerSourceInfo> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, StickerSourceInfo> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static StickerSourceInfo get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
