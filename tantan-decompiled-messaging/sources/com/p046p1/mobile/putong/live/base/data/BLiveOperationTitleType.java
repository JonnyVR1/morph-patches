package com.p046p1.mobile.putong.live.base.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOperationTitleType extends TEnum {
    public static final TEnumJsonAdapter<BLiveOperationTitleType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationTitleType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveOperationTitleType> _BLiveOperationTitleType;
    public static final String brightToDark = "brightToDark";
    public static final String countdown = "countdown";
    public static final String darkToBright = "darkToBright";
    private static final int int_brightToDark = 4;
    private static final int int_countdown = 2;
    private static final int int_darkToBright = 5;
    private static final int int_none = 0;
    private static final int int_text = 1;
    private static final int int_title = 3;
    private static final int int_unknown_ = -1;
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String text = "text";
    public static final String title = "title";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationTitleType$a */
    public class C11929a extends TEnumJsonAdapter<BLiveOperationTitleType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationTitleType newTEnum(String str, int i) {
            return BLiveOperationTitleType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationTitleType$b */
    public class C11930b extends TEnumProtobufAdapter<BLiveOperationTitleType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationTitleType newTEnum(String str, int i) {
            return BLiveOperationTitleType.getForData(str, i);
        }
    }

    static {
        C11929a c11929a = new C11929a();
        JSON_ADAPTER = c11929a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11930b();
        c11929a.addExtJsonValue("unknown_", -1);
        c11929a.addExtJsonValue("none", 0);
        c11929a.addExtJsonValue("text", 1);
        c11929a.addExtJsonValue("countdown", 2);
        c11929a.addExtJsonValue("title", 3);
        c11929a.addExtJsonValue("brightToDark", 4);
        c11929a.addExtJsonValue("darkToBright", 5);
        supportEnum.add("none");
        supportEnum.add("text");
        supportEnum.add("countdown");
        supportEnum.add("title");
        supportEnum.add("brightToDark");
        supportEnum.add("darkToBright");
        _BLiveOperationTitleType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveOperationTitleType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationTitleType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationTitleType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationTitleType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveOperationTitleType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveOperationTitleType get(String str) {
        Map<String, BLiveOperationTitleType> map = _BLiveOperationTitleType;
        BLiveOperationTitleType bLiveOperationTitleType = map.get(str);
        if (bLiveOperationTitleType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationTitleType = integer == null ? new BLiveOperationTitleType(str, -1) : new BLiveOperationTitleType(str, integer.intValue());
            map.put(str, bLiveOperationTitleType);
        }
        return bLiveOperationTitleType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationTitleType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationTitleType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationTitleType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationTitleType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
